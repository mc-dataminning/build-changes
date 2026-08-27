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

public class dig {
   private static final Codec<dhy<dfj>> h = dhy.a(csv.o, dfj.b, dhy.d.d, csw.a.n());
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

   public static dia a(akr $$0, buf $$1, cpc $$2, qx $$3) {
      cpc $$4 = new cpc($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      did $$5 = $$3.b("UpgradeData", 10) ? new did($$3.p("UpgradeData"), $$0) : did.a;
      boolean $$6 = $$3.q("isLightOn");
      rd $$7 = $$3.c("sections", 10);
      int $$8 = $$0.ak();
      dhr[] $$9 = new dhr[$$8];
      boolean $$10 = $$0.C_().g();
      dhj $$11 = $$0.k();
      eab $$12 = $$11.p();
      ht<cqt> $$13 = $$0.G_().d(je.ap);
      Codec<dhz<hg<cqt>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         qx $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dhy<dfj> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dhy<dfj>)h.parse(ri.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dhy<>(csv.o, csw.a.n(), dhy.d.d);
            }

            dhz<hg<cqt>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dhz<hg<cqt>>)$$14.parse(ri.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dhy<>($$13.t(), $$13.f(cra.b), dhy.d.e);
            }

            dhr $$24 = new dhr($$20, $$22);
            $$9[$$19] = $$24;
            hz $$25 = hz.a($$2, $$18);
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
               $$12.a(cqe.b, hz.a($$2, $$18), new dhl($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cqe.a, hz.a($$2, $$18), new dhl($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dhk.a $$29 = a($$3);
      dlv $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dlv)dlv.e.parse(new Dynamic(ri.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dhf $$34;
      if ($$29 == dhk.a.b) {
         eiu<csv> $$32 = eiu.a($$3.c("block_ticks", 10), $$0x -> jd.f.b(aex.a($$0x)), $$2);
         eiu<eal> $$33 = eiu.a($$3.c("fluid_ticks", 10), $$0x -> jd.d.b(aex.a($$0x)), $$2);
         $$34 = new dhq($$0.C(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eix<csv> $$35 = eix.a($$3.c("block_ticks", 10), $$0x -> jd.f.b(aex.a($$0x)), $$2);
         eix<eal> $$36 = eix.a($$3.c("fluid_ticks", 10), $$0x -> jd.d.b(aex.a($$0x)), $$2);
         dia $$37 = new dia($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dkg.a.parse(new Dynamic(ri.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dhk $$39 = dhk.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dhk.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      qx $$40 = $$3.p("Heightmaps");
      EnumSet<dks.a> $$41 = EnumSet.noneOf(dks.a.class);

      for (dks.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dks.a($$34, $$41);
      qx $$44 = $$3.p("structures");
      $$34.a(a(dvy.a($$0), $$44, $$0.A()));
      $$34.b(a($$0.G_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      rd $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         rd $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dhk.a.b) {
         return new dhp((dhq)$$34, false);
      } else {
         dia $$49 = (dia)$$34;
         rd $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         rd $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            qx $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         qx $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dko.a $$57 = dko.a.valueOf($$56);
            $$49.a($$57, new dhe($$55.o($$56), $$34.H_()));
         }

         return $$49;
      }
   }

   private static void a(cpc $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dhz<hg<cqt>>> a(ht<cqt> $$0) {
      return dhy.b($$0.t(), $$0.r(), dhy.d.e, $$0.f(cra.b));
   }

   public static qx a(akr $$0, dhf $$1) {
      cpc $$2 = $$1.f();
      qx $$3 = rj.g(new qx());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.al());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.V());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", jd.o.b($$1.j()).toString());
      dlv $$4 = $$1.t();
      if ($$4 != null) {
         dlv.e.encodeStart(ri.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dkg $$5 = $$1.x();
      if ($$5 != null) {
         dkg.a.encodeStart(ri.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      did $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dhr[] $$7 = $$1.d();
      rd $$8 = new rd();
      eab $$9 = $$0.k().a();
      ht<cqt> $$10 = $$0.G_().d(je.ap);
      Codec<dhz<hg<cqt>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dhl $$16 = $$9.a(cqe.b).a(hz.a($$2, $$13));
         dhl $$17 = $$9.a(cqe.a).a(hz.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            qx $$18 = new qx();
            if ($$15) {
               dhr $$19 = $$7[$$14];
               $$18.a("block_states", (rq)h.encodeStart(ri.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (rq)$$11.encodeStart(ri.a, $$19.i()).getOrThrow(false, i::error));
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

      rd $$20 = new rd();

      for (gw $$21 : $$1.c()) {
         qx $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dhk.a.a) {
         dia $$23 = (dia)$$1;
         rd $$24 = new rd();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         qx $$25 = new qx();

         for (dko.a $$26 : dko.a.values()) {
            dhe $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      qx $$28 = new qx();

      for (Entry<dks.a, dks> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new re($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dvy.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(akr $$0, qx $$1, dhf.a $$2) {
      long $$3 = $$0.z_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> jd.f.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> jd.d.b($$0x).toString()));
   }

   public static dhk.a a(@Nullable qx $$0) {
      return $$0 != null ? dhk.a($$0.l("Status")).g() : dhk.a.a;
   }

   @Nullable
   private static dhq.c a(akr $$0, qx $$1) {
      rd $$2 = a($$1, "entities");
      rd $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(biu.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qx $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  gw $$7 = dcv.c($$5);
                  dcv $$8 = dcv.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static rd a(qx $$0, String $$1) {
      rd $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static qx a(dvy $$0, cpc $$1, Map<dvi, dvq> $$2, Map<dvi, LongSet> $$3) {
      qx $$4 = new qx();
      qx $$5 = new qx();
      ht<dvi> $$6 = $$0.b().d(je.az);

      for (Entry<dvi, dvq> $$7 : $$2.entrySet()) {
         aex $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      qx $$9 = new qx();

      for (Entry<dvi, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            aex $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new re($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dvi, dvq> a(dvy $$0, qx $$1, long $$2) {
      Map<dvi, dvq> $$3 = Maps.newHashMap();
      ht<dvi> $$4 = $$0.b().d(je.az);
      qx $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         aex $$7 = aex.a($$6);
         dvi $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dvq $$9 = dvq.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dvi, LongSet> a(hu $$0, cpc $$1, qx $$2) {
      Map<dvi, LongSet> $$3 = Maps.newHashMap();
      ht<dvi> $$4 = $$0.d(je.az);
      qx $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         aex $$7 = aex.a($$6);
         dvi $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cpc $$3x = new cpc($$2x);
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

   public static rd a(ShortList[] $$0) {
      rd $$1 = new rd();

      for (ShortList $$2 : $$0) {
         rd $$3 = new rd();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(rl.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
