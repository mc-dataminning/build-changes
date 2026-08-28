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

public class dwf {
   private static final Codec<dvo<dta>> h = dvo.a(dfw.q, dta.b, dvo.d.d, dfy.a.o());
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

   public static dvq a(aqt $$0, ceq $$1, dcb $$2, ua $$3) {
      dcb $$4 = new dcb($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dvt $$5 = $$3.b("UpgradeData", 10) ? new dvt($$3.p("UpgradeData"), $$0) : dvt.a;
      boolean $$6 = $$3.q("isLightOn");
      ug $$7 = $$3.c("sections", 10);
      int $$8 = $$0.an();
      dvh[] $$9 = new dvh[$$8];
      boolean $$10 = $$0.D_().g();
      dva $$11 = $$0.l();
      eon $$12 = $$11.p();
      jz<ddu> $$13 = $$0.H_().d(lu.aF);
      Codec<dvp<jm<ddu>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         ua $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dvo<dta> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dvo<dta>)h.parse(uo.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dwf.a::new);
            } else {
               $$20 = new dvo<>(dfw.q, dfy.a.o(), dvo.d.d);
            }

            dvp<jm<ddu>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dvp<jm<ddu>>)$$14.parse(uo.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dwf.a::new);
            } else {
               $$22 = new dvo<>($$13.u(), $$13.g(deb.b), dvo.d.e);
            }

            dvh $$24 = new dvh($$20, $$22);
            $$9[$$19] = $$24;
            kf $$25 = kf.a($$2, $$18);
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
               $$12.a(ddd.b, kf.a($$2, $$18), new dvb($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(ddd.a, kf.a($$2, $$18), new dvb($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dwb $$29 = a($$3);
      dzy $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dzy)dzy.e.parse(new Dynamic(uo.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      duw $$34;
      if ($$29 == dwb.b) {
         eyi<dfw> $$32 = eyi.a($$3.c("block_ticks", 10), $$0x -> lt.e.b(akq.c($$0x)), $$2);
         eyi<eox> $$33 = eyi.a($$3.c("fluid_ticks", 10), $$0x -> lt.c.b(akq.c($$0x)), $$2);
         $$34 = new dvg($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eyl<dfw> $$35 = eyl.a($$3.c("block_ticks", 10), $$0x -> lt.e.b(akq.c($$0x)), $$2);
         eyl<eox> $$36 = eyl.a($$3.c("fluid_ticks", 10), $$0x -> lt.c.b(akq.c($$0x)), $$2);
         dvq $$37 = new dvq($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dyj.a.parse(new Dynamic(uo.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dvx $$39 = dvx.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.a(dvx.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      ua $$40 = $$3.p("Heightmaps");
      EnumSet<dyv.a> $$41 = EnumSet.noneOf(dyv.a.class);

      for (dyv.a $$42 : $$34.j().e()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dyv.a($$34, $$41);
      ua $$44 = $$3.p("structures");
      $$34.a(a(ekc.a($$0), $$44, $$0.C()));
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

      if ($$29 == dwb.b) {
         return new dvf((dvg)$$34, false);
      } else {
         dvq $$49 = (dvq)$$34;
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
            dyr.a $$57 = dyr.a.valueOf($$56);
            $$49.a($$57, new duv($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(dcb $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dvp<jm<ddu>>> a(jz<ddu> $$0) {
      return dvo.b($$0.u(), $$0.s(), dvo.d.e, $$0.g(deb.b));
   }

   public static ua a(aqt $$0, duw $$1) {
      dcb $$2 = $$1.f();
      ua $$3 = up.e(new ua());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", lt.l.b($$1.j()).toString());
      dzy $$4 = $$1.t();
      if ($$4 != null) {
         dzy.e.encodeStart(uo.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dyj $$5 = $$1.x();
      if ($$5 != null) {
         dyj.a.encodeStart(uo.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dvt $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dvh[] $$7 = $$1.d();
      ug $$8 = new ug();
      eon $$9 = $$0.l().a();
      jz<ddu> $$10 = $$0.H_().d(lu.aF);
      Codec<dvp<jm<ddu>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dvb $$16 = $$9.a(ddd.b).a(kf.a($$2, $$13));
         dvb $$17 = $$9.a(ddd.a).a(kf.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ua $$18 = new ua();
            if ($$15) {
               dvh $$19 = $$7[$$14];
               $$18.a("block_states", (ux)h.encodeStart(uo.a, $$19.h()).getOrThrow());
               $$18.a("biomes", (ux)$$11.encodeStart(uo.a, $$19.i()).getOrThrow());
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

      for (jd $$21 : $$1.c()) {
         ua $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().d() == dwb.a) {
         dvq $$23 = (dvq)$$1;
         ug $$24 = new ug();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ua $$25 = new ua();

         for (dyr.a $$26 : dyr.a.values()) {
            duv $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ua $$28 = new ua();

      for (Entry<dyv.a, dyv> $$29 : $$1.e()) {
         if ($$1.j().e().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new uh($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(ekc.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(aqt $$0, ua $$1, duw.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lt.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lt.c.b($$0x).toString()));
   }

   public static dwb a(@Nullable ua $$0) {
      return $$0 != null ? dvx.a($$0.l("Status")).d() : dwb.a;
   }

   @Nullable
   private static dvg.c a(aqt $$0, ua $$1) {
      ug $$2 = a($$1, "entities");
      ug $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsw.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ua $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  jd $$7 = dqf.b($$5);
                  dqf $$8 = dqf.a($$7, $$3x.a_($$7), $$5, $$0.H_());
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

   private static ua a(ekc $$0, dcb $$1, Map<ejm, eju> $$2, Map<ejm, LongSet> $$3) {
      ua $$4 = new ua();
      ua $$5 = new ua();
      jz<ejm> $$6 = $$0.b().d(lu.aR);

      for (Entry<ejm, eju> $$7 : $$2.entrySet()) {
         akq $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ua $$9 = new ua();

      for (Entry<ejm, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            akq $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uh($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<ejm, eju> a(ekc $$0, ua $$1, long $$2) {
      Map<ejm, eju> $$3 = Maps.newHashMap();
      jz<ejm> $$4 = $$0.b().d(lu.aR);
      ua $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         akq $$7 = akq.c($$6);
         ejm $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            eju $$9 = eju.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<ejm, LongSet> a(ka $$0, dcb $$1, ua $$2) {
      Map<ejm, LongSet> $$3 = Maps.newHashMap();
      jz<ejm> $$4 = $$0.d(lu.aR);
      ua $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         akq $$7 = akq.c($$6);
         ejm $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dcb $$3x = new dcb($$2x);
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

   public static class a extends ul {
      public a(String $$0) {
         super($$0);
      }
   }
}
