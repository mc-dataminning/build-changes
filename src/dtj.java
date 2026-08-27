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

public class dtj {
   private static final Codec<dsv<dqh>> h = dsv.a(dde.q, dqh.b, dsv.d.d, ddg.a.n());
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

   public static dsx a(aqh $$0, cdd $$1, czk $$2, ua $$3) {
      czk $$4 = new czk($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dta $$5 = $$3.b("UpgradeData", 10) ? new dta($$3.p("UpgradeData"), $$0) : dta.a;
      boolean $$6 = $$3.q("isLightOn");
      ug $$7 = $$3.c("sections", 10);
      int $$8 = $$0.am();
      dso[] $$9 = new dso[$$8];
      boolean $$10 = $$0.D_().g();
      dsh $$11 = $$0.l();
      elp $$12 = $$11.p();
      jj<dbc> $$13 = $$0.H_().d(le.az);
      Codec<dsw<iw<dbc>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         ua $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dsv<dqh> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = ac.a(h.parse(uo.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)), dtj.a::new);
            } else {
               $$20 = new dsv<>(dde.q, ddg.a.n(), dsv.d.d);
            }

            dsw<iw<dbc>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = ac.a($$14.parse(uo.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)), dtj.a::new);
            } else {
               $$22 = new dsv<>($$13.t(), $$13.g(dbj.b), dsv.d.e);
            }

            dso $$24 = new dso($$20, $$22);
            $$9[$$19] = $$24;
            jp $$25 = jp.a($$2, $$18);
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
               $$12.a(dam.b, jp.a($$2, $$18), new dsi($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dam.a, jp.a($$2, $$18), new dsi($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dte $$29 = a($$3);
      dxc $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dxc)dxc.e.parse(new Dynamic(uo.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dsd $$34;
      if ($$29 == dte.b) {
         evb<dde> $$32 = evb.a($$3.c("block_ticks", 10), $$0x -> ld.e.b(akh.a($$0x)), $$2);
         evb<elz> $$33 = evb.a($$3.c("fluid_ticks", 10), $$0x -> ld.c.b(akh.a($$0x)), $$2);
         $$34 = new dsn($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eve<dde> $$35 = eve.a($$3.c("block_ticks", 10), $$0x -> ld.e.b(akh.a($$0x)), $$2);
         eve<elz> $$36 = eve.a($$3.c("fluid_ticks", 10), $$0x -> ld.c.b(akh.a($$0x)), $$2);
         dsx $$37 = new dsx($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dvn.a.parse(new Dynamic(uo.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dtc $$39 = dtc.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dtc.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      ua $$40 = $$3.p("Heightmaps");
      EnumSet<dvz.a> $$41 = EnumSet.noneOf(dvz.a.class);

      for (dvz.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dvz.a($$34, $$41);
      ua $$44 = $$3.p("structures");
      $$34.a(a(ehf.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      ug $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         ug $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dte.b) {
         return new dsm((dsn)$$34, false);
      } else {
         dsx $$49 = (dsx)$$34;
         ug $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         ug $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            ua $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         ua $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dvv.a $$57 = dvv.a.valueOf($$56);
            $$49.a($$57, new dsc($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(czk $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dsw<iw<dbc>>> a(jj<dbc> $$0) {
      return dsv.b($$0.t(), $$0.r(), dsv.d.e, $$0.g(dbj.b));
   }

   public static ua a(aqh $$0, dsd $$1) {
      czk $$2 = $$1.f();
      ua $$3 = up.e(new ua());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.an());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Y());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", ld.n.b($$1.j()).toString());
      dxc $$4 = $$1.t();
      if ($$4 != null) {
         dxc.e.encodeStart(uo.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dvn $$5 = $$1.x();
      if ($$5 != null) {
         dvn.a.encodeStart(uo.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dta $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dso[] $$7 = $$1.d();
      ug $$8 = new ug();
      elp $$9 = $$0.l().a();
      jj<dbc> $$10 = $$0.H_().d(le.az);
      Codec<dsw<iw<dbc>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dsi $$16 = $$9.a(dam.b).a(jp.a($$2, $$13));
         dsi $$17 = $$9.a(dam.a).a(jp.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ua $$18 = new ua();
            if ($$15) {
               dso $$19 = $$7[$$14];
               $$18.a("block_states", (ux)h.encodeStart(uo.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (ux)$$11.encodeStart(uo.a, $$19.i()).getOrThrow(false, i::error));
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

      ug $$20 = new ug();

      for (in $$21 : $$1.c()) {
         ua $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dte.a) {
         dsx $$23 = (dsx)$$1;
         ug $$24 = new ug();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ua $$25 = new ua();

         for (dvv.a $$26 : dvv.a.values()) {
            dsc $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ua $$28 = new ua();

      for (Entry<dvz.a, dvz> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new uh($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(ehf.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(aqh $$0, ua $$1, dsd.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> ld.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> ld.c.b($$0x).toString()));
   }

   public static dte a(@Nullable ua $$0) {
      return $$0 != null ? dtc.a($$0.l("Status")).g() : dte.a;
   }

   @Nullable
   private static dsn.c a(aqh $$0, ua $$1) {
      ug $$2 = a($$1, "entities");
      ug $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(brn.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ua $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  in $$7 = dnm.b($$5);
                  dnm $$8 = dnm.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static ug a(ua $$0, String $$1) {
      ug $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static ua a(ehf $$0, czk $$1, Map<egp, egx> $$2, Map<egp, LongSet> $$3) {
      ua $$4 = new ua();
      ua $$5 = new ua();
      jj<egp> $$6 = $$0.b().d(le.aJ);

      for (Entry<egp, egx> $$7 : $$2.entrySet()) {
         akh $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ua $$9 = new ua();

      for (Entry<egp, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            akh $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uh($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<egp, egx> a(ehf $$0, ua $$1, long $$2) {
      Map<egp, egx> $$3 = Maps.newHashMap();
      jj<egp> $$4 = $$0.b().d(le.aJ);
      ua $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         akh $$7 = akh.a($$6);
         egp $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            egx $$9 = egx.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<egp, LongSet> a(jk $$0, czk $$1, ua $$2) {
      Map<egp, LongSet> $$3 = Maps.newHashMap();
      jj<egp> $$4 = $$0.d(le.aJ);
      ua $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         akh $$7 = akh.a($$6);
         egp $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  czk $$3x = new czk($$2x);
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

   public static ug a(ShortList[] $$0) {
      ug $$1 = new ug();

      for (ShortList $$2 : $$0) {
         ug $$3 = new ug();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(us.a($$4));
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
