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

public class dsb {
   private static final Codec<drn<doz>> h = drn.a(dby.q, doz.b, drn.d.d, dca.a.n());
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

   public static drp a(aps $$0, cbr $$1, cye $$2, tm $$3) {
      cye $$4 = new cye($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      drs $$5 = $$3.b("UpgradeData", 10) ? new drs($$3.p("UpgradeData"), $$0) : drs.a;
      boolean $$6 = $$3.q("isLightOn");
      ts $$7 = $$3.c("sections", 10);
      int $$8 = $$0.am();
      drg[] $$9 = new drg[$$8];
      boolean $$10 = $$0.D_().g();
      dqz $$11 = $$0.l();
      ekh $$12 = $$11.p();
      iy<czw> $$13 = $$0.H_().d(ks.av);
      Codec<dro<il<czw>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         tm $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            drn<doz> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = ac.a(h.parse(ua.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)), dsb.a::new);
            } else {
               $$20 = new drn<>(dby.q, dca.a.n(), drn.d.d);
            }

            dro<il<czw>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = ac.a($$14.parse(ua.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)), dsb.a::new);
            } else {
               $$22 = new drn<>($$13.t(), $$13.g(dad.b), drn.d.e);
            }

            drg $$24 = new drg($$20, $$22);
            $$9[$$19] = $$24;
            je $$25 = je.a($$2, $$18);
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
               $$12.a(czg.b, je.a($$2, $$18), new dra($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(czg.a, je.a($$2, $$18), new dra($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      drw $$29 = a($$3);
      dvu $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dvu)dvu.e.parse(new Dynamic(ua.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dqv $$34;
      if ($$29 == drw.b) {
         etm<dby> $$32 = etm.a($$3.c("block_ticks", 10), $$0x -> kr.e.b(ajt.a($$0x)), $$2);
         etm<ekr> $$33 = etm.a($$3.c("fluid_ticks", 10), $$0x -> kr.c.b(ajt.a($$0x)), $$2);
         $$34 = new drf($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         etp<dby> $$35 = etp.a($$3.c("block_ticks", 10), $$0x -> kr.e.b(ajt.a($$0x)), $$2);
         etp<ekr> $$36 = etp.a($$3.c("fluid_ticks", 10), $$0x -> kr.c.b(ajt.a($$0x)), $$2);
         drp $$37 = new drp($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            duf.a.parse(new Dynamic(ua.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dru $$39 = dru.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dru.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      tm $$40 = $$3.p("Heightmaps");
      EnumSet<dur.a> $$41 = EnumSet.noneOf(dur.a.class);

      for (dur.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dur.a($$34, $$41);
      tm $$44 = $$3.p("structures");
      $$34.a(a(efx.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      ts $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         ts $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == drw.b) {
         return new dre((drf)$$34, false);
      } else {
         drp $$49 = (drp)$$34;
         ts $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         ts $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            tm $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         tm $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dun.a $$57 = dun.a.valueOf($$56);
            $$49.a($$57, new dqu($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(cye $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dro<il<czw>>> a(iy<czw> $$0) {
      return drn.b($$0.t(), $$0.r(), drn.d.e, $$0.g(dad.b));
   }

   public static tm a(aps $$0, dqv $$1) {
      cye $$2 = $$1.f();
      tm $$3 = ub.f(new tm());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.an());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Y());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", kr.n.b($$1.j()).toString());
      dvu $$4 = $$1.t();
      if ($$4 != null) {
         dvu.e.encodeStart(ua.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      duf $$5 = $$1.x();
      if ($$5 != null) {
         duf.a.encodeStart(ua.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      drs $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      drg[] $$7 = $$1.d();
      ts $$8 = new ts();
      ekh $$9 = $$0.l().a();
      iy<czw> $$10 = $$0.H_().d(ks.av);
      Codec<dro<il<czw>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dra $$16 = $$9.a(czg.b).a(je.a($$2, $$13));
         dra $$17 = $$9.a(czg.a).a(je.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            tm $$18 = new tm();
            if ($$15) {
               drg $$19 = $$7[$$14];
               $$18.a("block_states", (uj)h.encodeStart(ua.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (uj)$$11.encodeStart(ua.a, $$19.i()).getOrThrow(false, i::error));
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

      ts $$20 = new ts();

      for (ib $$21 : $$1.c()) {
         tm $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == drw.a) {
         drp $$23 = (drp)$$1;
         ts $$24 = new ts();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         tm $$25 = new tm();

         for (dun.a $$26 : dun.a.values()) {
            dqu $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      tm $$28 = new tm();

      for (Entry<dur.a, dur> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new tt($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(efx.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(aps $$0, tm $$1, dqv.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> kr.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> kr.c.b($$0x).toString()));
   }

   public static drw a(@Nullable tm $$0) {
      return $$0 != null ? dru.a($$0.l("Status")).g() : drw.a;
   }

   @Nullable
   private static drf.c a(aps $$0, tm $$1) {
      ts $$2 = a($$1, "entities");
      ts $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bqb.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               tm $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  ib $$7 = dmf.b($$5);
                  dmf $$8 = dmf.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static ts a(tm $$0, String $$1) {
      ts $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static tm a(efx $$0, cye $$1, Map<efh, efp> $$2, Map<efh, LongSet> $$3) {
      tm $$4 = new tm();
      tm $$5 = new tm();
      iy<efh> $$6 = $$0.b().d(ks.aF);

      for (Entry<efh, efp> $$7 : $$2.entrySet()) {
         ajt $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tm $$9 = new tm();

      for (Entry<efh, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ajt $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new tt($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<efh, efp> a(efx $$0, tm $$1, long $$2) {
      Map<efh, efp> $$3 = Maps.newHashMap();
      iy<efh> $$4 = $$0.b().d(ks.aF);
      tm $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ajt $$7 = ajt.a($$6);
         efh $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            efp $$9 = efp.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<efh, LongSet> a(iz $$0, cye $$1, tm $$2) {
      Map<efh, LongSet> $$3 = Maps.newHashMap();
      iy<efh> $$4 = $$0.d(ks.aF);
      tm $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ajt $$7 = ajt.a($$6);
         efh $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cye $$3x = new cye($$2x);
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

   public static ts a(ShortList[] $$0) {
      ts $$1 = new ts();

      for (ShortList $$2 : $$0) {
         ts $$3 = new ts();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(ue.a($$4));
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
