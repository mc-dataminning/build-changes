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

public class dkk {
   private static final Codec<dkc<dhn>> h = dkc.a(cvf.q, dhn.b, dkc.d.d, cvh.a.o());
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

   public static dke a(ami $$0, bwk $$1, crm $$2, sd $$3) {
      crm $$4 = new crm($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dkh $$5 = $$3.b("UpgradeData", 10) ? new dkh($$3.p("UpgradeData"), $$0) : dkh.a;
      boolean $$6 = $$3.q("isLightOn");
      sj $$7 = $$3.c("sections", 10);
      int $$8 = $$0.al();
      djv[] $$9 = new djv[$$8];
      boolean $$10 = $$0.E_().g();
      djn $$11 = $$0.k();
      ecm $$12 = $$11.p();
      is<ctd> $$13 = $$0.I_().d(kd.ar);
      Codec<dkd<ig<ctd>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         sd $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dkc<dhn> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dkc<dhn>)h.parse(sr.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dkc<>(cvf.q, cvh.a.o(), dkc.d.d);
            }

            dkd<ig<ctd>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dkd<ig<ctd>>)$$14.parse(sr.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dkc<>($$13.t(), $$13.f(ctk.b), dkc.d.e);
            }

            djv $$24 = new djv($$20, $$22);
            $$9[$$19] = $$24;
            iy $$25 = iy.a($$2, $$18);
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
               $$12.a(cso.b, iy.a($$2, $$18), new djp($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cso.a, iy.a($$2, $$18), new djp($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      djo.a $$29 = a($$3);
      dnz $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dnz)dnz.e.parse(new Dynamic(sr.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      djj $$34;
      if ($$29 == djo.a.b) {
         elg<cvf> $$32 = elg.a($$3.c("block_ticks", 10), $$0x -> kc.f.b(agm.a($$0x)), $$2);
         elg<ecw> $$33 = elg.a($$3.c("fluid_ticks", 10), $$0x -> kc.d.b(agm.a($$0x)), $$2);
         $$34 = new dju($$0.D(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         elj<cvf> $$35 = elj.a($$3.c("block_ticks", 10), $$0x -> kc.f.b(agm.a($$0x)), $$2);
         elj<ecw> $$36 = elj.a($$3.c("fluid_ticks", 10), $$0x -> kc.d.b(agm.a($$0x)), $$2);
         dke $$37 = new dke($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dmk.a.parse(new Dynamic(sr.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         djo $$39 = djo.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(djo.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      sd $$40 = $$3.p("Heightmaps");
      EnumSet<dmw.a> $$41 = EnumSet.noneOf(dmw.a.class);

      for (dmw.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dmw.a($$34, $$41);
      sd $$44 = $$3.p("structures");
      $$34.a(a(dyc.a($$0), $$44, $$0.B()));
      $$34.b(a($$0.I_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      sj $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         sj $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == djo.a.b) {
         return new djt((dju)$$34, false);
      } else {
         dke $$49 = (dke)$$34;
         sj $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         sj $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            sd $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         sd $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dms.a $$57 = dms.a.valueOf($$56);
            $$49.a($$57, new dji($$55.o($$56), $$34.J_()));
         }

         return $$49;
      }
   }

   private static void a(crm $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dkd<ig<ctd>>> a(is<ctd> $$0) {
      return dkc.b($$0.t(), $$0.r(), dkc.d.e, $$0.f(ctk.b));
   }

   public static sd a(ami $$0, djj $$1) {
      crm $$2 = $$1.f();
      sd $$3 = ss.g(new sd());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.am());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.W());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", kc.o.b($$1.j()).toString());
      dnz $$4 = $$1.t();
      if ($$4 != null) {
         dnz.e.encodeStart(sr.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dmk $$5 = $$1.x();
      if ($$5 != null) {
         dmk.a.encodeStart(sr.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dkh $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      djv[] $$7 = $$1.d();
      sj $$8 = new sj();
      ecm $$9 = $$0.k().a();
      is<ctd> $$10 = $$0.I_().d(kd.ar);
      Codec<dkd<ig<ctd>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         djp $$16 = $$9.a(cso.b).a(iy.a($$2, $$13));
         djp $$17 = $$9.a(cso.a).a(iy.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            sd $$18 = new sd();
            if ($$15) {
               djv $$19 = $$7[$$14];
               $$18.a("block_states", (ta)h.encodeStart(sr.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (ta)$$11.encodeStart(sr.a, $$19.i()).getOrThrow(false, i::error));
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

      sj $$20 = new sj();

      for (hx $$21 : $$1.c()) {
         sd $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == djo.a.a) {
         dke $$23 = (dke)$$1;
         sj $$24 = new sj();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         sd $$25 = new sd();

         for (dms.a $$26 : dms.a.values()) {
            dji $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      sd $$28 = new sd();

      for (Entry<dmw.a, dmw> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new sk($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dyc.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(ami $$0, sd $$1, djj.a $$2) {
      long $$3 = $$0.B_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> kc.f.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> kc.d.b($$0x).toString()));
   }

   public static djo.a a(@Nullable sd $$0) {
      return $$0 != null ? djo.a($$0.l("Status")).g() : djo.a.a;
   }

   @Nullable
   private static dju.c a(ami $$0, sd $$1) {
      sj $$2 = a($$1, "entities");
      sj $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bkz.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sd $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  hx $$7 = dfi.c($$5);
                  dfi $$8 = dfi.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static sj a(sd $$0, String $$1) {
      sj $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static sd a(dyc $$0, crm $$1, Map<dxm, dxu> $$2, Map<dxm, LongSet> $$3) {
      sd $$4 = new sd();
      sd $$5 = new sd();
      is<dxm> $$6 = $$0.b().d(kd.aB);

      for (Entry<dxm, dxu> $$7 : $$2.entrySet()) {
         agm $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      sd $$9 = new sd();

      for (Entry<dxm, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            agm $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new sk($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dxm, dxu> a(dyc $$0, sd $$1, long $$2) {
      Map<dxm, dxu> $$3 = Maps.newHashMap();
      is<dxm> $$4 = $$0.b().d(kd.aB);
      sd $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         agm $$7 = agm.a($$6);
         dxm $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dxu $$9 = dxu.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dxm, LongSet> a(it $$0, crm $$1, sd $$2) {
      Map<dxm, LongSet> $$3 = Maps.newHashMap();
      is<dxm> $$4 = $$0.d(kd.aB);
      sd $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         agm $$7 = agm.a($$6);
         dxm $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  crm $$3x = new crm($$2x);
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

   public static sj a(ShortList[] $$0) {
      sj $$1 = new sj();

      for (ShortList $$2 : $$0) {
         sj $$3 = new sj();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(sv.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
