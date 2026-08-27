import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmm {
   private static final Codec<dme<djp>> h = dme.a(cwy.q, djp.b, dme.d.d, cxa.a.o());
   private static final Logger i = LogUtils.getLogger();
   private static final String j = "UpgradeData";
   private static final String k = "block_ticks";
   private static final String l = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   public static dmg a(ane $$0, bxq $$1, cte $$2, so $$3) {
      cte $$4 = new cte($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dmj $$5 = $$3.b("UpgradeData", 10) ? new dmj($$3.p("UpgradeData"), $$0) : dmj.a;
      boolean $$6 = $$3.q("isLightOn");
      su $$7 = $$3.c("sections", 10);
      int $$8 = $$0.am();
      dlx[] $$9 = new dlx[$$8];
      boolean $$10 = $$0.E_().g();
      dlp $$11 = $$0.l();
      eeo $$12 = $$11.p();
      it<cuw> $$13 = $$0.I_().d(ke.at);
      Codec<dmf<ih<cuw>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         so $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dme<djp> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dme<djp>)h.parse(tc.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dme<>(cwy.q, cxa.a.o(), dme.d.d);
            }

            dmf<ih<cuw>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dmf<ih<cuw>>)$$14.parse(tc.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dme<>($$13.t(), $$13.f(cvd.b), dme.d.e);
            }

            dlx $$24 = new dlx($$20, $$22);
            $$9[$$19] = $$24;
            iz $$25 = iz.a($$2, $$18);
            $$1.a($$25, $$24);
         }

         boolean $$26 = $$17.b("BlockLight", 7);
         boolean $$27 = $$10 && $$17.b("SkyLight", 7);
         if ($$26 || $$27) {
            if (!$$15) {
               $$12.b($$2, true);
               $$15 = true;
            }

            if ($$26) {
               $$12.a(cug.b, iz.a($$2, $$18), new dlr($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cug.a, iz.a($$2, $$18), new dlr($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dlq.a $$29 = a($$3);
      dqb $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dqb)dqb.e.parse(new Dynamic(tc.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dll $$34;
      if ($$29 == dlq.a.b) {
         eno<cwy> $$32 = eno.a($$3.c("block_ticks", 10), $$0x -> kd.e.b(ahh.a($$0x)), $$2);
         eno<eey> $$33 = eno.a($$3.c("fluid_ticks", 10), $$0x -> kd.c.b(ahh.a($$0x)), $$2);
         $$34 = new dlw($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         enr<cwy> $$35 = enr.a($$3.c("block_ticks", 10), $$0x -> kd.e.b(ahh.a($$0x)), $$2);
         enr<eey> $$36 = enr.a($$3.c("fluid_ticks", 10), $$0x -> kd.c.b(ahh.a($$0x)), $$2);
         dmg $$37 = new dmg($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dom.a.parse(new Dynamic(tc.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dlq $$39 = dlq.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dlq.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      so $$40 = $$3.p("Heightmaps");
      EnumSet<doy.a> $$41 = EnumSet.noneOf(doy.a.class);

      for (doy.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      doy.a($$34, $$41);
      so $$44 = $$3.p("structures");
      $$34.a(a(eae.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.I_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      su $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         su $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dlq.a.b) {
         return new dlv((dlw)$$34, false);
      } else {
         dmg $$49 = (dmg)$$34;
         su $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         su $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            so $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         so $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dou.a $$57 = dou.a.valueOf($$56);
            $$49.a($$57, new dlk($$55.o($$56), $$34.J_()));
         }

         return $$49;
      }
   }

   private static void a(cte $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dmf<ih<cuw>>> a(it<cuw> $$0) {
      return dme.b($$0.t(), $$0.r(), dme.d.e, $$0.f(cvd.b));
   }

   public static so a(ane $$0, dll $$1) {
      cte $$2 = $$1.f();
      so $$3 = td.g(new so());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.an());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.X());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", kd.n.b($$1.j()).toString());
      dqb $$4 = $$1.t();
      if ($$4 != null) {
         dqb.e.encodeStart(tc.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dom $$5 = $$1.x();
      if ($$5 != null) {
         dom.a.encodeStart(tc.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dmj $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dlx[] $$7 = $$1.d();
      su $$8 = new su();
      eeo $$9 = $$0.l().a();
      it<cuw> $$10 = $$0.I_().d(ke.at);
      Codec<dmf<ih<cuw>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dlr $$16 = $$9.a(cug.b).a(iz.a($$2, $$13));
         dlr $$17 = $$9.a(cug.a).a(iz.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            so $$18 = new so();
            if ($$15) {
               dlx $$19 = $$7[$$14];
               $$18.a("block_states", (tl)h.encodeStart(tc.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (tl)$$11.encodeStart(tc.a, $$19.i()).getOrThrow(false, i::error));
            }

            if ($$16 != null && !$$16.d()) {
               $$18.a("BlockLight", $$16.a());
            }

            if ($$17 != null && !$$17.d()) {
               $$18.a("SkyLight", $$17.a());
            }

            if (!$$18.g()) {
               $$18.a("Y", (byte)$$13);
               $$8.add($$18);
            }
         }
      }

      $$3.a("sections", $$8);
      if ($$12) {
         $$3.a("isLightOn", true);
      }

      su $$20 = new su();

      for (hx $$21 : $$1.c()) {
         so $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dlq.a.a) {
         dmg $$23 = (dmg)$$1;
         su $$24 = new su();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         so $$25 = new so();

         for (dou.a $$26 : dou.a.values()) {
            dlk $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      so $$28 = new so();

      for (Entry<doy.a, doy> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new sv($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(eae.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(ane $$0, so $$1, dll.a $$2) {
      long $$3 = $$0.B_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> kd.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> kd.c.b($$0x).toString()));
   }

   public static dlq.a a(@Nullable so $$0) {
      return $$0 != null ? dlq.a($$0.l("Status")).g() : dlq.a.a;
   }

   @Nullable
   private static dlw.c a(ane $$0, so $$1) {
      su $$2 = a($$1, "entities");
      su $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bmc.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               so $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  hx $$7 = dhd.c($$5);
                  dhd $$8 = dhd.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static su a(so $$0, String $$1) {
      su $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static so a(eae $$0, cte $$1, Map<dzo, dzw> $$2, Map<dzo, LongSet> $$3) {
      so $$4 = new so();
      so $$5 = new so();
      it<dzo> $$6 = $$0.b().d(ke.aD);

      for (Entry<dzo, dzw> $$7 : $$2.entrySet()) {
         ahh $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      so $$9 = new so();

      for (Entry<dzo, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ahh $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new sv($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dzo, dzw> a(eae $$0, so $$1, long $$2) {
      Map<dzo, dzw> $$3 = Maps.newHashMap();
      it<dzo> $$4 = $$0.b().d(ke.aD);
      so $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ahh $$7 = ahh.a($$6);
         dzo $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dzw $$9 = dzw.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dzo, LongSet> a(iu $$0, cte $$1, so $$2) {
      Map<dzo, LongSet> $$3 = Maps.newHashMap();
      it<dzo> $$4 = $$0.d(ke.aD);
      so $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ahh $$7 = ahh.a($$6);
         dzo $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cte $$3x = new cte($$2x);
                  if ($$3x.a($$1) > 8) {
                     i.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }

      return $$3;
   }

   public static su a(ShortList[] $$0) {
      su $$1 = new su();

      for (ShortList $$2 : $$0) {
         su $$3 = new su();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(tg.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
