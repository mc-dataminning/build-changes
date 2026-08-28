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

public class duz {
   private static final Codec<dul<drx>> h = dul.a(deu.q, drx.b, dul.d.d, dew.a.n());
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

   public static dun a(arb $$0, ceo $$1, dba $$2, ur $$3) {
      dba $$4 = new dba($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      duq $$5 = $$3.b("UpgradeData", 10) ? new duq($$3.p("UpgradeData"), $$0) : duq.a;
      boolean $$6 = $$3.q("isLightOn");
      ux $$7 = $$3.c("sections", 10);
      int $$8 = $$0.an();
      due[] $$9 = new due[$$8];
      boolean $$10 = $$0.D_().g();
      dtx $$11 = $$0.l();
      enf $$12 = $$11.p();
      jv<dcs> $$13 = $$0.H_().d(lq.az);
      Codec<dum<ji<dcs>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         ur $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dul<drx> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dul<drx>)h.parse(vf.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(duz.a::new);
            } else {
               $$20 = new dul<>(deu.q, dew.a.n(), dul.d.d);
            }

            dum<ji<dcs>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dum<ji<dcs>>)$$14.parse(vf.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(duz.a::new);
            } else {
               $$22 = new dul<>($$13.t(), $$13.g(dcz.b), dul.d.e);
            }

            due $$24 = new due($$20, $$22);
            $$9[$$19] = $$24;
            kb $$25 = kb.a($$2, $$18);
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
               $$12.a(dcc.b, kb.a($$2, $$18), new dty($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dcc.a, kb.a($$2, $$18), new dty($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      duu $$29 = a($$3);
      dys $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dys)dys.e.parse(new Dynamic(vf.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dtt $$34;
      if ($$29 == duu.b) {
         ewy<deu> $$32 = ewy.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(alb.a($$0x)), $$2);
         ewy<enp> $$33 = ewy.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(alb.a($$0x)), $$2);
         $$34 = new dud($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         exb<deu> $$35 = exb.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(alb.a($$0x)), $$2);
         exb<enp> $$36 = exb.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(alb.a($$0x)), $$2);
         dun $$37 = new dun($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dxd.a.parse(new Dynamic(vf.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dus $$39 = dus.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dus.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      ur $$40 = $$3.p("Heightmaps");
      EnumSet<dxp.a> $$41 = EnumSet.noneOf(dxp.a.class);

      for (dxp.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dxp.a($$34, $$41);
      ur $$44 = $$3.p("structures");
      $$34.a(a(eiv.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      ux $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         ux $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == duu.b) {
         return new duc((dud)$$34, false);
      } else {
         dun $$49 = (dun)$$34;
         ux $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         ux $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            ur $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         ur $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dxl.a $$57 = dxl.a.valueOf($$56);
            $$49.a($$57, new dts($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(dba $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dum<ji<dcs>>> a(jv<dcs> $$0) {
      return dul.b($$0.t(), $$0.r(), dul.d.e, $$0.g(dcz.b));
   }

   public static ur a(arb $$0, dtt $$1) {
      dba $$2 = $$1.f();
      ur $$3 = vg.e(new ur());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", lp.n.b($$1.j()).toString());
      dys $$4 = $$1.t();
      if ($$4 != null) {
         dys.e.encodeStart(vf.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dxd $$5 = $$1.x();
      if ($$5 != null) {
         dxd.a.encodeStart(vf.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      duq $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      due[] $$7 = $$1.d();
      ux $$8 = new ux();
      enf $$9 = $$0.l().a();
      jv<dcs> $$10 = $$0.H_().d(lq.az);
      Codec<dum<ji<dcs>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dty $$16 = $$9.a(dcc.b).a(kb.a($$2, $$13));
         dty $$17 = $$9.a(dcc.a).a(kb.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ur $$18 = new ur();
            if ($$15) {
               due $$19 = $$7[$$14];
               $$18.a("block_states", (vo)h.encodeStart(vf.a, $$19.h()).getOrThrow());
               $$18.a("biomes", (vo)$$11.encodeStart(vf.a, $$19.i()).getOrThrow());
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

      ux $$20 = new ux();

      for (iz $$21 : $$1.c()) {
         ur $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == duu.a) {
         dun $$23 = (dun)$$1;
         ux $$24 = new ux();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ur $$25 = new ur();

         for (dxl.a $$26 : dxl.a.values()) {
            dts $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ur $$28 = new ur();

      for (Entry<dxp.a, dxp> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new uy($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(eiv.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(arb $$0, ur $$1, dtt.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lp.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lp.c.b($$0x).toString()));
   }

   public static duu a(@Nullable ur $$0) {
      return $$0 != null ? dus.a($$0.l("Status")).g() : duu.a;
   }

   @Nullable
   private static dud.c a(arb $$0, ur $$1) {
      ux $$2 = a($$1, "entities");
      ux $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsv.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ur $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  iz $$7 = dpc.b($$5);
                  dpc $$8 = dpc.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static ux a(ur $$0, String $$1) {
      ux $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static ur a(eiv $$0, dba $$1, Map<eif, ein> $$2, Map<eif, LongSet> $$3) {
      ur $$4 = new ur();
      ur $$5 = new ur();
      jv<eif> $$6 = $$0.b().d(lq.aJ);

      for (Entry<eif, ein> $$7 : $$2.entrySet()) {
         alb $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ur $$9 = new ur();

      for (Entry<eif, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alb $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uy($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eif, ein> a(eiv $$0, ur $$1, long $$2) {
      Map<eif, ein> $$3 = Maps.newHashMap();
      jv<eif> $$4 = $$0.b().d(lq.aJ);
      ur $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alb $$7 = alb.a($$6);
         eif $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            ein $$9 = ein.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eif, LongSet> a(jw $$0, dba $$1, ur $$2) {
      Map<eif, LongSet> $$3 = Maps.newHashMap();
      jv<eif> $$4 = $$0.d(lq.aJ);
      ur $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alb $$7 = alb.a($$6);
         eif $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dba $$3x = new dba($$2x);
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

   public static ux a(ShortList[] $$0) {
      ux $$1 = new ux();

      for (ShortList $$2 : $$0) {
         ux $$3 = new ux();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(vj.a($$4));
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
