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

public class dvf {
   private static final Codec<dur<dsd>> h = dur.a(dfa.q, dsd.b, dur.d.d, dfc.a.o());
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

   public static dut a(arf $$0, ceu $$1, dbg $$2, us $$3) {
      dbg $$4 = new dbg($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      duw $$5 = $$3.b("UpgradeData", 10) ? new duw($$3.p("UpgradeData"), $$0) : duw.a;
      boolean $$6 = $$3.q("isLightOn");
      uy $$7 = $$3.c("sections", 10);
      int $$8 = $$0.an();
      duk[] $$9 = new duk[$$8];
      boolean $$10 = $$0.D_().g();
      dud $$11 = $$0.l();
      enl $$12 = $$11.p();
      jv<dcy> $$13 = $$0.H_().d(lq.az);
      Codec<dus<ji<dcy>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         us $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dur<dsd> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dur<dsd>)h.parse(vg.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvf.a::new);
            } else {
               $$20 = new dur<>(dfa.q, dfc.a.o(), dur.d.d);
            }

            dus<ji<dcy>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dus<ji<dcy>>)$$14.parse(vg.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvf.a::new);
            } else {
               $$22 = new dur<>($$13.t(), $$13.g(ddf.b), dur.d.e);
            }

            duk $$24 = new duk($$20, $$22);
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
               $$12.a(dci.b, kb.a($$2, $$18), new due($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dci.a, kb.a($$2, $$18), new due($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dva $$29 = a($$3);
      dyy $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dyy)dyy.e.parse(new Dynamic(vg.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dtz $$34;
      if ($$29 == dva.b) {
         exe<dfa> $$32 = exe.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(alf.a($$0x)), $$2);
         exe<env> $$33 = exe.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(alf.a($$0x)), $$2);
         $$34 = new duj($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         exh<dfa> $$35 = exh.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(alf.a($$0x)), $$2);
         exh<env> $$36 = exh.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(alf.a($$0x)), $$2);
         dut $$37 = new dut($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dxj.a.parse(new Dynamic(vg.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         duy $$39 = duy.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(duy.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      us $$40 = $$3.p("Heightmaps");
      EnumSet<dxv.a> $$41 = EnumSet.noneOf(dxv.a.class);

      for (dxv.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dxv.a($$34, $$41);
      us $$44 = $$3.p("structures");
      $$34.a(a(ejb.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      uy $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         uy $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dva.b) {
         return new dui((duj)$$34, false);
      } else {
         dut $$49 = (dut)$$34;
         uy $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         uy $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            us $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         us $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dxr.a $$57 = dxr.a.valueOf($$56);
            $$49.a($$57, new dty($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(dbg $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dus<ji<dcy>>> a(jv<dcy> $$0) {
      return dur.b($$0.t(), $$0.r(), dur.d.e, $$0.g(ddf.b));
   }

   public static us a(arf $$0, dtz $$1) {
      dbg $$2 = $$1.f();
      us $$3 = vh.e(new us());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", lp.n.b($$1.j()).toString());
      dyy $$4 = $$1.t();
      if ($$4 != null) {
         dyy.e.encodeStart(vg.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dxj $$5 = $$1.x();
      if ($$5 != null) {
         dxj.a.encodeStart(vg.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      duw $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      duk[] $$7 = $$1.d();
      uy $$8 = new uy();
      enl $$9 = $$0.l().a();
      jv<dcy> $$10 = $$0.H_().d(lq.az);
      Codec<dus<ji<dcy>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         due $$16 = $$9.a(dci.b).a(kb.a($$2, $$13));
         due $$17 = $$9.a(dci.a).a(kb.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            us $$18 = new us();
            if ($$15) {
               duk $$19 = $$7[$$14];
               $$18.a("block_states", (vp)h.encodeStart(vg.a, $$19.h()).getOrThrow());
               $$18.a("biomes", (vp)$$11.encodeStart(vg.a, $$19.i()).getOrThrow());
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

      uy $$20 = new uy();

      for (iz $$21 : $$1.c()) {
         us $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dva.a) {
         dut $$23 = (dut)$$1;
         uy $$24 = new uy();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         us $$25 = new us();

         for (dxr.a $$26 : dxr.a.values()) {
            dty $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      us $$28 = new us();

      for (Entry<dxv.a, dxv> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new uz($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(ejb.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(arf $$0, us $$1, dtz.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lp.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lp.c.b($$0x).toString()));
   }

   public static dva a(@Nullable us $$0) {
      return $$0 != null ? duy.a($$0.l("Status")).g() : dva.a;
   }

   @Nullable
   private static duj.c a(arf $$0, us $$1) {
      uy $$2 = a($$1, "entities");
      uy $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(btb.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               us $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  iz $$7 = dpi.b($$5);
                  dpi $$8 = dpi.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static uy a(us $$0, String $$1) {
      uy $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static us a(ejb $$0, dbg $$1, Map<eil, eit> $$2, Map<eil, LongSet> $$3) {
      us $$4 = new us();
      us $$5 = new us();
      jv<eil> $$6 = $$0.b().d(lq.aJ);

      for (Entry<eil, eit> $$7 : $$2.entrySet()) {
         alf $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      us $$9 = new us();

      for (Entry<eil, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alf $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uz($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eil, eit> a(ejb $$0, us $$1, long $$2) {
      Map<eil, eit> $$3 = Maps.newHashMap();
      jv<eil> $$4 = $$0.b().d(lq.aJ);
      us $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alf $$7 = alf.a($$6);
         eil $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            eit $$9 = eit.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eil, LongSet> a(jw $$0, dbg $$1, us $$2) {
      Map<eil, LongSet> $$3 = Maps.newHashMap();
      jv<eil> $$4 = $$0.d(lq.aJ);
      us $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alf $$7 = alf.a($$6);
         eil $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dbg $$3x = new dbg($$2x);
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

   public static uy a(ShortList[] $$0) {
      uy $$1 = new uy();

      for (ShortList $$2 : $$0) {
         uy $$3 = new uy();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(vk.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public static class a extends vd {
      public a(String $$0) {
         super($$0);
      }
   }
}
