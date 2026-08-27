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

public class dwe {
   private static final Codec<dvq<dtc>> h = dvq.a(dfc.q, dtc.b, dvq.d.d, dfe.a.n());
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

   public static dvs a(aqt $$0, cdr $$1, dbh $$2, uk $$3) {
      dbh $$4 = new dbh($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dvv $$5 = $$3.b("UpgradeData", 10) ? new dvv($$3.p("UpgradeData"), $$0) : dvv.a;
      boolean $$6 = $$3.q("isLightOn");
      uq $$7 = $$3.c("sections", 10);
      int $$8 = $$0.an();
      dvj[] $$9 = new dvj[$$8];
      boolean $$10 = $$0.E_().g();
      dvc $$11 = $$0.l();
      eot $$12 = $$11.p();
      jn<dcz> $$13 = $$0.I_().d(li.az);
      Codec<dvr<ja<dcz>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         uk $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dvq<dtc> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = ad.a(h.parse(uy.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)), dwe.a::new);
            } else {
               $$20 = new dvq<>(dfc.q, dfe.a.n(), dvq.d.d);
            }

            dvr<ja<dcz>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = ad.a($$14.parse(uy.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)), dwe.a::new);
            } else {
               $$22 = new dvq<>($$13.t(), $$13.g(ddg.b), dvq.d.e);
            }

            dvj $$24 = new dvj($$20, $$22);
            $$9[$$19] = $$24;
            jt $$25 = jt.a($$2, $$18);
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
               $$12.a(dcj.b, jt.a($$2, $$18), new dvd($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dcj.a, jt.a($$2, $$18), new dvd($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dvz $$29 = a($$3);
      dzx $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dzx)dzx.e.parse(new Dynamic(uy.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      duy $$34;
      if ($$29 == dvz.b) {
         eyg<dfc> $$32 = eyg.a($$3.c("block_ticks", 10), $$0x -> lh.e.b(akt.a($$0x)), $$2);
         eyg<epd> $$33 = eyg.a($$3.c("fluid_ticks", 10), $$0x -> lh.c.b(akt.a($$0x)), $$2);
         $$34 = new dvi($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eyj<dfc> $$35 = eyj.a($$3.c("block_ticks", 10), $$0x -> lh.e.b(akt.a($$0x)), $$2);
         eyj<epd> $$36 = eyj.a($$3.c("fluid_ticks", 10), $$0x -> lh.c.b(akt.a($$0x)), $$2);
         dvs $$37 = new dvs($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dyi.a.parse(new Dynamic(uy.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dvx $$39 = dvx.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dvx.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      uk $$40 = $$3.p("Heightmaps");
      EnumSet<dyu.a> $$41 = EnumSet.noneOf(dyu.a.class);

      for (dyu.a $$42 : $$34.k().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dyu.a($$34, $$41);
      uk $$44 = $$3.p("structures");
      $$34.a(a(ekj.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.I_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      uq $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         uq $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dvz.b) {
         return new dvh((dvi)$$34, false);
      } else {
         dvs $$49 = (dvs)$$34;
         uq $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         uq $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            uk $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         uk $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dyq.a $$57 = dyq.a.valueOf($$56);
            $$49.a($$57, new dux($$55.o($$56), $$34.J_()));
         }

         return $$49;
      }
   }

   private static void a(dbh $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dvr<ja<dcz>>> a(jn<dcz> $$0) {
      return dvq.b($$0.t(), $$0.r(), dvq.d.e, $$0.g(ddg.b));
   }

   public static uk a(aqt $$0, duy $$1) {
      dbh $$2 = $$1.g();
      uk $$3 = uz.e(new uk());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.v());
      $$3.a("Status", lh.n.b($$1.k()).toString());
      dzx $$4 = $$1.u();
      if ($$4 != null) {
         dzx.e.encodeStart(uy.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dyi $$5 = $$1.y();
      if ($$5 != null) {
         dyi.a.encodeStart(uy.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dvv $$6 = $$1.s();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dvj[] $$7 = $$1.e();
      uq $$8 = new uq();
      eot $$9 = $$0.l().a();
      jn<dcz> $$10 = $$0.I_().d(li.az);
      Codec<dvr<ja<dcz>>> $$11 = a($$10);
      boolean $$12 = $$1.w();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dvd $$16 = $$9.a(dcj.b).a(jt.a($$2, $$13));
         dvd $$17 = $$9.a(dcj.a).a(jt.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            uk $$18 = new uk();
            if ($$15) {
               dvj $$19 = $$7[$$14];
               $$18.a("block_states", (vh)h.encodeStart(uy.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (vh)$$11.encodeStart(uy.a, $$19.i()).getOrThrow(false, i::error));
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

      uq $$20 = new uq();

      for (ir $$21 : $$1.d()) {
         uk $$22 = $$1.a($$21, $$0.I_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.k().g() == dvz.a) {
         dvs $$23 = (dvs)$$1;
         uq $$24 = new uq();
         $$24.addAll($$23.F());
         $$3.a("entities", $$24);
         uk $$25 = new uk();

         for (dyq.a $$26 : dyq.a.values()) {
            dux $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.r());
      $$3.a("PostProcessing", a($$1.o()));
      uk $$28 = new uk();

      for (Entry<dyu.a, dyu> $$29 : $$1.f()) {
         if ($$1.k().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new ur($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(ekj.a($$0), $$2, $$1.h(), $$1.i()));
      return $$3;
   }

   private static void a(aqt $$0, uk $$1, duy.a $$2) {
      long $$3 = $$0.B_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lh.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lh.c.b($$0x).toString()));
   }

   public static dvz a(@Nullable uk $$0) {
      return $$0 != null ? dvx.a($$0.l("Status")).g() : dvz.a;
   }

   @Nullable
   private static dvi.c a(aqt $$0, uk $$1) {
      uq $$2 = a($$1, "entities");
      uq $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsb.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               uk $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  ir $$7 = dqc.b($$5);
                  dqc $$8 = dqc.a($$7, $$3x.a_($$7), $$5, $$0.I_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static uq a(uk $$0, String $$1) {
      uq $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static uk a(ekj $$0, dbh $$1, Map<ejt, ekb> $$2, Map<ejt, LongSet> $$3) {
      uk $$4 = new uk();
      uk $$5 = new uk();
      jn<ejt> $$6 = $$0.b().d(li.aJ);

      for (Entry<ejt, ekb> $$7 : $$2.entrySet()) {
         akt $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      uk $$9 = new uk();

      for (Entry<ejt, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            akt $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ur($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<ejt, ekb> a(ekj $$0, uk $$1, long $$2) {
      Map<ejt, ekb> $$3 = Maps.newHashMap();
      jn<ejt> $$4 = $$0.b().d(li.aJ);
      uk $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         akt $$7 = akt.a($$6);
         ejt $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            ekb $$9 = ekb.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<ejt, LongSet> a(jo $$0, dbh $$1, uk $$2) {
      Map<ejt, LongSet> $$3 = Maps.newHashMap();
      jn<ejt> $$4 = $$0.d(li.aJ);
      uk $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         akt $$7 = akt.a($$6);
         ejt $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dbh $$3x = new dbh($$2x);
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

   public static uq a(ShortList[] $$0) {
      uq $$1 = new uq();

      for (ShortList $$2 : $$0) {
         uq $$3 = new uq();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(vc.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public static class a extends RuntimeException {
      public a(String $$0) {
         super($$0);
      }
   }
}
