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

public class dhx {
   private static final Codec<dhp<dfa>> h = dhp.a(csm.o, dfa.b, dhp.d.d, csn.a.n());
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

   public static dhr a(akk $$0, bty $$1, cot $$2, qr $$3) {
      cot $$4 = new cot($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dhu $$5 = $$3.b("UpgradeData", 10) ? new dhu($$3.p("UpgradeData"), $$0) : dhu.a;
      boolean $$6 = $$3.q("isLightOn");
      qx $$7 = $$3.c("sections", 10);
      int $$8 = $$0.ak();
      dhi[] $$9 = new dhi[$$8];
      boolean $$10 = $$0.x_().g();
      dha $$11 = $$0.k();
      dzs $$12 = $$11.p();
      hr<cqk> $$13 = $$0.B_().d(jc.ap);
      Codec<dhq<he<cqk>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         qr $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dhp<dfa> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dhp<dfa>)h.parse(rc.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dhp<>(csm.o, csn.a.n(), dhp.d.d);
            }

            dhq<he<cqk>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dhq<he<cqk>>)$$14.parse(rc.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dhp<>($$13.t(), $$13.f(cqr.b), dhp.d.e);
            }

            dhi $$24 = new dhi($$20, $$22);
            $$9[$$19] = $$24;
            hx $$25 = hx.a($$2, $$18);
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
               $$12.a(cpv.b, hx.a($$2, $$18), new dhc($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cpv.a, hx.a($$2, $$18), new dhc($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dhb.a $$29 = a($$3);
      dlm $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dlm)dlm.e.parse(new Dynamic(rc.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dgw $$34;
      if ($$29 == dhb.a.b) {
         eil<csm> $$32 = eil.a($$3.c("block_ticks", 10), $$0x -> jb.f.b(aer.a($$0x)), $$2);
         eil<eac> $$33 = eil.a($$3.c("fluid_ticks", 10), $$0x -> jb.d.b(aer.a($$0x)), $$2);
         $$34 = new dhh($$0.C(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eio<csm> $$35 = eio.a($$3.c("block_ticks", 10), $$0x -> jb.f.b(aer.a($$0x)), $$2);
         eio<eac> $$36 = eio.a($$3.c("fluid_ticks", 10), $$0x -> jb.d.b(aer.a($$0x)), $$2);
         dhr $$37 = new dhr($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            djx.a.parse(new Dynamic(rc.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dhb $$39 = dhb.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dhb.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      qr $$40 = $$3.p("Heightmaps");
      EnumSet<dkj.a> $$41 = EnumSet.noneOf(dkj.a.class);

      for (dkj.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dkj.a($$34, $$41);
      qr $$44 = $$3.p("structures");
      $$34.a(a(dvp.a($$0), $$44, $$0.A()));
      $$34.b(a($$0.B_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      qx $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         qx $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dhb.a.b) {
         return new dhg((dhh)$$34, false);
      } else {
         dhr $$49 = (dhr)$$34;
         qx $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         qx $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            qr $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         qr $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dkf.a $$57 = dkf.a.valueOf($$56);
            $$49.a($$57, new dgv($$55.o($$56), $$34.C_()));
         }

         return $$49;
      }
   }

   private static void a(cot $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dhq<he<cqk>>> a(hr<cqk> $$0) {
      return dhp.b($$0.t(), $$0.r(), dhp.d.e, $$0.f(cqr.b));
   }

   public static qr a(akk $$0, dgw $$1) {
      cot $$2 = $$1.f();
      qr $$3 = rd.g(new qr());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.al());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.V());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", jb.o.b($$1.j()).toString());
      dlm $$4 = $$1.t();
      if ($$4 != null) {
         dlm.e.encodeStart(rc.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      djx $$5 = $$1.x();
      if ($$5 != null) {
         djx.a.encodeStart(rc.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dhu $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dhi[] $$7 = $$1.d();
      qx $$8 = new qx();
      dzs $$9 = $$0.k().a();
      hr<cqk> $$10 = $$0.B_().d(jc.ap);
      Codec<dhq<he<cqk>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dhc $$16 = $$9.a(cpv.b).a(hx.a($$2, $$13));
         dhc $$17 = $$9.a(cpv.a).a(hx.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            qr $$18 = new qr();
            if ($$15) {
               dhi $$19 = $$7[$$14];
               $$18.a("block_states", (rk)h.encodeStart(rc.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (rk)$$11.encodeStart(rc.a, $$19.i()).getOrThrow(false, i::error));
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

      qx $$20 = new qx();

      for (gu $$21 : $$1.c()) {
         qr $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dhb.a.a) {
         dhr $$23 = (dhr)$$1;
         qx $$24 = new qx();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         qr $$25 = new qr();

         for (dkf.a $$26 : dkf.a.values()) {
            dgv $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      qr $$28 = new qr();

      for (Entry<dkj.a, dkj> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new qy($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dvp.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(akk $$0, qr $$1, dgw.a $$2) {
      long $$3 = $$0.u_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> jb.f.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> jb.d.b($$0x).toString()));
   }

   public static dhb.a a(@Nullable qr $$0) {
      return $$0 != null ? dhb.a($$0.l("Status")).g() : dhb.a.a;
   }

   @Nullable
   private static dhh.c a(akk $$0, qr $$1) {
      qx $$2 = a($$1, "entities");
      qx $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bim.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qr $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  gu $$7 = dcm.c($$5);
                  dcm $$8 = dcm.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static qx a(qr $$0, String $$1) {
      qx $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static qr a(dvp $$0, cot $$1, Map<duz, dvh> $$2, Map<duz, LongSet> $$3) {
      qr $$4 = new qr();
      qr $$5 = new qr();
      hr<duz> $$6 = $$0.b().d(jc.az);

      for (Entry<duz, dvh> $$7 : $$2.entrySet()) {
         aer $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      qr $$9 = new qr();

      for (Entry<duz, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            aer $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new qy($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<duz, dvh> a(dvp $$0, qr $$1, long $$2) {
      Map<duz, dvh> $$3 = Maps.newHashMap();
      hr<duz> $$4 = $$0.b().d(jc.az);
      qr $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         aer $$7 = aer.a($$6);
         duz $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dvh $$9 = dvh.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<duz, LongSet> a(hs $$0, cot $$1, qr $$2) {
      Map<duz, LongSet> $$3 = Maps.newHashMap();
      hr<duz> $$4 = $$0.d(jc.az);
      qr $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         aer $$7 = aer.a($$6);
         duz $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cot $$3x = new cot($$2x);
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

   public static qx a(ShortList[] $$0) {
      qx $$1 = new qx();

      for (ShortList $$2 : $$0) {
         qx $$3 = new qx();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(rf.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
