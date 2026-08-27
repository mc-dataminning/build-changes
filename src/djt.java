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

public class djt {
   private static final Codec<djl<dgw>> h = djl.a(cut.q, dgw.b, djl.d.d, cuv.a.o());
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

   public static djn a(ama $$0, bvx $$1, cqz $$2, rz $$3) {
      cqz $$4 = new cqz($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      djq $$5 = $$3.b("UpgradeData", 10) ? new djq($$3.p("UpgradeData"), $$0) : djq.a;
      boolean $$6 = $$3.q("isLightOn");
      sf $$7 = $$3.c("sections", 10);
      int $$8 = $$0.ak();
      dje[] $$9 = new dje[$$8];
      boolean $$10 = $$0.D_().g();
      diw $$11 = $$0.k();
      ebv $$12 = $$11.p();
      io<csq> $$13 = $$0.H_().d(jz.ar);
      Codec<djm<ib<csq>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         rz $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            djl<dgw> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (djl<dgw>)h.parse(sn.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new djl<>(cut.q, cuv.a.o(), djl.d.d);
            }

            djm<ib<csq>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (djm<ib<csq>>)$$14.parse(sn.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new djl<>($$13.t(), $$13.f(csx.b), djl.d.e);
            }

            dje $$24 = new dje($$20, $$22);
            $$9[$$19] = $$24;
            iu $$25 = iu.a($$2, $$18);
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
               $$12.a(csb.b, iu.a($$2, $$18), new diy($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(csb.a, iu.a($$2, $$18), new diy($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dix.a $$29 = a($$3);
      dni $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dni)dni.e.parse(new Dynamic(sn.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dis $$34;
      if ($$29 == dix.a.b) {
         ekp<cut> $$32 = ekp.a($$3.c("block_ticks", 10), $$0x -> jy.f.b(agg.a($$0x)), $$2);
         ekp<ecf> $$33 = ekp.a($$3.c("fluid_ticks", 10), $$0x -> jy.d.b(agg.a($$0x)), $$2);
         $$34 = new djd($$0.C(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eks<cut> $$35 = eks.a($$3.c("block_ticks", 10), $$0x -> jy.f.b(agg.a($$0x)), $$2);
         eks<ecf> $$36 = eks.a($$3.c("fluid_ticks", 10), $$0x -> jy.d.b(agg.a($$0x)), $$2);
         djn $$37 = new djn($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dlt.a.parse(new Dynamic(sn.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dix $$39 = dix.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dix.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      rz $$40 = $$3.p("Heightmaps");
      EnumSet<dmf.a> $$41 = EnumSet.noneOf(dmf.a.class);

      for (dmf.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dmf.a($$34, $$41);
      rz $$44 = $$3.p("structures");
      $$34.a(a(dxl.a($$0), $$44, $$0.A()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      sf $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         sf $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dix.a.b) {
         return new djc((djd)$$34, false);
      } else {
         djn $$49 = (djn)$$34;
         sf $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         sf $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            rz $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         rz $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dmb.a $$57 = dmb.a.valueOf($$56);
            $$49.a($$57, new dir($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(cqz $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<djm<ib<csq>>> a(io<csq> $$0) {
      return djl.b($$0.t(), $$0.r(), djl.d.e, $$0.f(csx.b));
   }

   public static rz a(ama $$0, dis $$1) {
      cqz $$2 = $$1.f();
      rz $$3 = so.g(new rz());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.al());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.V());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", jy.o.b($$1.j()).toString());
      dni $$4 = $$1.t();
      if ($$4 != null) {
         dni.e.encodeStart(sn.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dlt $$5 = $$1.x();
      if ($$5 != null) {
         dlt.a.encodeStart(sn.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      djq $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dje[] $$7 = $$1.d();
      sf $$8 = new sf();
      ebv $$9 = $$0.k().a();
      io<csq> $$10 = $$0.H_().d(jz.ar);
      Codec<djm<ib<csq>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         diy $$16 = $$9.a(csb.b).a(iu.a($$2, $$13));
         diy $$17 = $$9.a(csb.a).a(iu.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            rz $$18 = new rz();
            if ($$15) {
               dje $$19 = $$7[$$14];
               $$18.a("block_states", (sw)h.encodeStart(sn.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (sw)$$11.encodeStart(sn.a, $$19.i()).getOrThrow(false, i::error));
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

      sf $$20 = new sf();

      for (ht $$21 : $$1.c()) {
         rz $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dix.a.a) {
         djn $$23 = (djn)$$1;
         sf $$24 = new sf();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         rz $$25 = new rz();

         for (dmb.a $$26 : dmb.a.values()) {
            dir $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      rz $$28 = new rz();

      for (Entry<dmf.a, dmf> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new sg($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dxl.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(ama $$0, rz $$1, dis.a $$2) {
      long $$3 = $$0.A_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> jy.f.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> jy.d.b($$0x).toString()));
   }

   public static dix.a a(@Nullable rz $$0) {
      return $$0 != null ? dix.a($$0.l("Status")).g() : dix.a.a;
   }

   @Nullable
   private static djd.c a(ama $$0, rz $$1) {
      sf $$2 = a($$1, "entities");
      sf $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bkm.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               rz $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  ht $$7 = der.c($$5);
                  der $$8 = der.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static sf a(rz $$0, String $$1) {
      sf $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static rz a(dxl $$0, cqz $$1, Map<dwv, dxd> $$2, Map<dwv, LongSet> $$3) {
      rz $$4 = new rz();
      rz $$5 = new rz();
      io<dwv> $$6 = $$0.b().d(jz.aB);

      for (Entry<dwv, dxd> $$7 : $$2.entrySet()) {
         agg $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      rz $$9 = new rz();

      for (Entry<dwv, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            agg $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new sg($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dwv, dxd> a(dxl $$0, rz $$1, long $$2) {
      Map<dwv, dxd> $$3 = Maps.newHashMap();
      io<dwv> $$4 = $$0.b().d(jz.aB);
      rz $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         agg $$7 = agg.a($$6);
         dwv $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dxd $$9 = dxd.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dwv, LongSet> a(ip $$0, cqz $$1, rz $$2) {
      Map<dwv, LongSet> $$3 = Maps.newHashMap();
      io<dwv> $$4 = $$0.d(jz.aB);
      rz $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         agg $$7 = agg.a($$6);
         dwv $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cqz $$3x = new cqz($$2x);
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

   public static sf a(ShortList[] $$0) {
      sf $$1 = new sf();

      for (ShortList $$2 : $$0) {
         sf $$3 = new sf();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(sr.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
