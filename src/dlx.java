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

public class dlx {
   private static final Codec<dlp<dja>> h = dlp.a(cwj.q, dja.b, dlp.d.d, cwl.a.o());
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

   public static dlr a(amz $$0, bxg $$1, csp $$2, sl $$3) {
      csp $$4 = new csp($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dlu $$5 = $$3.b("UpgradeData", 10) ? new dlu($$3.p("UpgradeData"), $$0) : dlu.a;
      boolean $$6 = $$3.q("isLightOn");
      sr $$7 = $$3.c("sections", 10);
      int $$8 = $$0.am();
      dli[] $$9 = new dli[$$8];
      boolean $$10 = $$0.E_().g();
      dla $$11 = $$0.l();
      edz $$12 = $$11.p();
      it<cuh> $$13 = $$0.I_().d(ke.at);
      Codec<dlq<ih<cuh>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         sl $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dlp<dja> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dlp<dja>)h.parse(sz.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dlp<>(cwj.q, cwl.a.o(), dlp.d.d);
            }

            dlq<ih<cuh>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dlq<ih<cuh>>)$$14.parse(sz.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dlp<>($$13.t(), $$13.f(cuo.b), dlp.d.e);
            }

            dli $$24 = new dli($$20, $$22);
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
               $$12.a(ctr.b, iz.a($$2, $$18), new dlc($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(ctr.a, iz.a($$2, $$18), new dlc($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dlb.a $$29 = a($$3);
      dpm $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dpm)dpm.e.parse(new Dynamic(sz.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dkw $$34;
      if ($$29 == dlb.a.b) {
         emy<cwj> $$32 = emy.a($$3.c("block_ticks", 10), $$0x -> kd.e.b(ahd.a($$0x)), $$2);
         emy<eej> $$33 = emy.a($$3.c("fluid_ticks", 10), $$0x -> kd.c.b(ahd.a($$0x)), $$2);
         $$34 = new dlh($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         enb<cwj> $$35 = enb.a($$3.c("block_ticks", 10), $$0x -> kd.e.b(ahd.a($$0x)), $$2);
         enb<eej> $$36 = enb.a($$3.c("fluid_ticks", 10), $$0x -> kd.c.b(ahd.a($$0x)), $$2);
         dlr $$37 = new dlr($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dnx.a.parse(new Dynamic(sz.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dlb $$39 = dlb.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dlb.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      sl $$40 = $$3.p("Heightmaps");
      EnumSet<doj.a> $$41 = EnumSet.noneOf(doj.a.class);

      for (doj.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      doj.a($$34, $$41);
      sl $$44 = $$3.p("structures");
      $$34.a(a(dzp.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.I_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      sr $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         sr $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dlb.a.b) {
         return new dlg((dlh)$$34, false);
      } else {
         dlr $$49 = (dlr)$$34;
         sr $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         sr $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            sl $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         sl $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dof.a $$57 = dof.a.valueOf($$56);
            $$49.a($$57, new dkv($$55.o($$56), $$34.J_()));
         }

         return $$49;
      }
   }

   private static void a(csp $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dlq<ih<cuh>>> a(it<cuh> $$0) {
      return dlp.b($$0.t(), $$0.r(), dlp.d.e, $$0.f(cuo.b));
   }

   public static sl a(amz $$0, dkw $$1) {
      csp $$2 = $$1.f();
      sl $$3 = ta.g(new sl());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.an());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.X());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", kd.n.b($$1.j()).toString());
      dpm $$4 = $$1.t();
      if ($$4 != null) {
         dpm.e.encodeStart(sz.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dnx $$5 = $$1.x();
      if ($$5 != null) {
         dnx.a.encodeStart(sz.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dlu $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dli[] $$7 = $$1.d();
      sr $$8 = new sr();
      edz $$9 = $$0.l().a();
      it<cuh> $$10 = $$0.I_().d(ke.at);
      Codec<dlq<ih<cuh>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dlc $$16 = $$9.a(ctr.b).a(iz.a($$2, $$13));
         dlc $$17 = $$9.a(ctr.a).a(iz.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            sl $$18 = new sl();
            if ($$15) {
               dli $$19 = $$7[$$14];
               $$18.a("block_states", (ti)h.encodeStart(sz.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (ti)$$11.encodeStart(sz.a, $$19.i()).getOrThrow(false, i::error));
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

      sr $$20 = new sr();

      for (hx $$21 : $$1.c()) {
         sl $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dlb.a.a) {
         dlr $$23 = (dlr)$$1;
         sr $$24 = new sr();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         sl $$25 = new sl();

         for (dof.a $$26 : dof.a.values()) {
            dkv $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      sl $$28 = new sl();

      for (Entry<doj.a, doj> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new ss($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dzp.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(amz $$0, sl $$1, dkw.a $$2) {
      long $$3 = $$0.B_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> kd.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> kd.c.b($$0x).toString()));
   }

   public static dlb.a a(@Nullable sl $$0) {
      return $$0 != null ? dlb.a($$0.l("Status")).g() : dlb.a.a;
   }

   @Nullable
   private static dlh.c a(amz $$0, sl $$1) {
      sr $$2 = a($$1, "entities");
      sr $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(blt.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sl $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  hx $$7 = dgo.c($$5);
                  dgo $$8 = dgo.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static sr a(sl $$0, String $$1) {
      sr $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static sl a(dzp $$0, csp $$1, Map<dyz, dzh> $$2, Map<dyz, LongSet> $$3) {
      sl $$4 = new sl();
      sl $$5 = new sl();
      it<dyz> $$6 = $$0.b().d(ke.aD);

      for (Entry<dyz, dzh> $$7 : $$2.entrySet()) {
         ahd $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      sl $$9 = new sl();

      for (Entry<dyz, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ahd $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ss($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dyz, dzh> a(dzp $$0, sl $$1, long $$2) {
      Map<dyz, dzh> $$3 = Maps.newHashMap();
      it<dyz> $$4 = $$0.b().d(ke.aD);
      sl $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ahd $$7 = ahd.a($$6);
         dyz $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dzh $$9 = dzh.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dyz, LongSet> a(iu $$0, csp $$1, sl $$2) {
      Map<dyz, LongSet> $$3 = Maps.newHashMap();
      it<dyz> $$4 = $$0.d(ke.aD);
      sl $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ahd $$7 = ahd.a($$6);
         dyz $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  csp $$3x = new csp($$2x);
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

   public static sr a(ShortList[] $$0) {
      sr $$1 = new sr();

      for (ShortList $$2 : $$0) {
         sr $$3 = new sr();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(td.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
