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

public class dsk {
   private static final Codec<drw<dpi>> h = drw.a(dch.q, dpi.b, drw.d.d, dcj.a.n());
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

   public static dry a(apu $$0, cbw $$1, cyn $$2, to $$3) {
      cyn $$4 = new cyn($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dsb $$5 = $$3.b("UpgradeData", 10) ? new dsb($$3.p("UpgradeData"), $$0) : dsb.a;
      boolean $$6 = $$3.q("isLightOn");
      tu $$7 = $$3.c("sections", 10);
      int $$8 = $$0.am();
      drp[] $$9 = new drp[$$8];
      boolean $$10 = $$0.D_().g();
      dri $$11 = $$0.l();
      ekq $$12 = $$11.p();
      ja<daf> $$13 = $$0.H_().d(ku.aw);
      Codec<drx<in<daf>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         to $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            drw<dpi> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = ac.a(h.parse(uc.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)), dsk.a::new);
            } else {
               $$20 = new drw<>(dch.q, dcj.a.n(), drw.d.d);
            }

            drx<in<daf>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = ac.a($$14.parse(uc.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)), dsk.a::new);
            } else {
               $$22 = new drw<>($$13.t(), $$13.g(dam.b), drw.d.e);
            }

            drp $$24 = new drp($$20, $$22);
            $$9[$$19] = $$24;
            jg $$25 = jg.a($$2, $$18);
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
               $$12.a(czp.b, jg.a($$2, $$18), new drj($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(czp.a, jg.a($$2, $$18), new drj($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dsf $$29 = a($$3);
      dwd $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dwd)dwd.e.parse(new Dynamic(uc.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dre $$34;
      if ($$29 == dsf.b) {
         etv<dch> $$32 = etv.a($$3.c("block_ticks", 10), $$0x -> kt.e.b(ajv.a($$0x)), $$2);
         etv<ela> $$33 = etv.a($$3.c("fluid_ticks", 10), $$0x -> kt.c.b(ajv.a($$0x)), $$2);
         $$34 = new dro($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         ety<dch> $$35 = ety.a($$3.c("block_ticks", 10), $$0x -> kt.e.b(ajv.a($$0x)), $$2);
         ety<ela> $$36 = ety.a($$3.c("fluid_ticks", 10), $$0x -> kt.c.b(ajv.a($$0x)), $$2);
         dry $$37 = new dry($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            duo.a.parse(new Dynamic(uc.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dsd $$39 = dsd.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dsd.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      to $$40 = $$3.p("Heightmaps");
      EnumSet<dva.a> $$41 = EnumSet.noneOf(dva.a.class);

      for (dva.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dva.a($$34, $$41);
      to $$44 = $$3.p("structures");
      $$34.a(a(egg.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      tu $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         tu $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dsf.b) {
         return new drn((dro)$$34, false);
      } else {
         dry $$49 = (dry)$$34;
         tu $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         tu $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            to $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         to $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            duw.a $$57 = duw.a.valueOf($$56);
            $$49.a($$57, new drd($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(cyn $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<drx<in<daf>>> a(ja<daf> $$0) {
      return drw.b($$0.t(), $$0.r(), drw.d.e, $$0.g(dam.b));
   }

   public static to a(apu $$0, dre $$1) {
      cyn $$2 = $$1.f();
      to $$3 = ud.e(new to());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.an());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Y());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", kt.n.b($$1.j()).toString());
      dwd $$4 = $$1.t();
      if ($$4 != null) {
         dwd.e.encodeStart(uc.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      duo $$5 = $$1.x();
      if ($$5 != null) {
         duo.a.encodeStart(uc.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dsb $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      drp[] $$7 = $$1.d();
      tu $$8 = new tu();
      ekq $$9 = $$0.l().a();
      ja<daf> $$10 = $$0.H_().d(ku.aw);
      Codec<drx<in<daf>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         drj $$16 = $$9.a(czp.b).a(jg.a($$2, $$13));
         drj $$17 = $$9.a(czp.a).a(jg.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            to $$18 = new to();
            if ($$15) {
               drp $$19 = $$7[$$14];
               $$18.a("block_states", (ul)h.encodeStart(uc.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (ul)$$11.encodeStart(uc.a, $$19.i()).getOrThrow(false, i::error));
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

      tu $$20 = new tu();

      for (id $$21 : $$1.c()) {
         to $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dsf.a) {
         dry $$23 = (dry)$$1;
         tu $$24 = new tu();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         to $$25 = new to();

         for (duw.a $$26 : duw.a.values()) {
            drd $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      to $$28 = new to();

      for (Entry<dva.a, dva> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new tv($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(egg.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(apu $$0, to $$1, dre.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> kt.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> kt.c.b($$0x).toString()));
   }

   public static dsf a(@Nullable to $$0) {
      return $$0 != null ? dsd.a($$0.l("Status")).g() : dsf.a;
   }

   @Nullable
   private static dro.c a(apu $$0, to $$1) {
      tu $$2 = a($$1, "entities");
      tu $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bqg.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               to $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  id $$7 = dmo.b($$5);
                  dmo $$8 = dmo.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static tu a(to $$0, String $$1) {
      tu $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static to a(egg $$0, cyn $$1, Map<efq, efy> $$2, Map<efq, LongSet> $$3) {
      to $$4 = new to();
      to $$5 = new to();
      ja<efq> $$6 = $$0.b().d(ku.aG);

      for (Entry<efq, efy> $$7 : $$2.entrySet()) {
         ajv $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      to $$9 = new to();

      for (Entry<efq, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ajv $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new tv($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<efq, efy> a(egg $$0, to $$1, long $$2) {
      Map<efq, efy> $$3 = Maps.newHashMap();
      ja<efq> $$4 = $$0.b().d(ku.aG);
      to $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ajv $$7 = ajv.a($$6);
         efq $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            efy $$9 = efy.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<efq, LongSet> a(jb $$0, cyn $$1, to $$2) {
      Map<efq, LongSet> $$3 = Maps.newHashMap();
      ja<efq> $$4 = $$0.d(ku.aG);
      to $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ajv $$7 = ajv.a($$6);
         efq $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cyn $$3x = new cyn($$2x);
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

   public static tu a(ShortList[] $$0) {
      tu $$1 = new tu();

      for (ShortList $$2 : $$0) {
         tu $$3 = new tu();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(ug.a($$4));
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
