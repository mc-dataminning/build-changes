import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record eal(
   ke<dhi> h,
   dfm i,
   int j,
   long k,
   long l,
   dzr m,
   @Nullable edt.d n,
   @Nullable ece o,
   dzn p,
   @Nullable long[] q,
   Map<ecq.a, long[]> r,
   dyq.a s,
   ShortList[] t,
   boolean u,
   List<eal.b> v,
   List<tq> w,
   List<tq> x,
   tq y
) {
   private static final Codec<dzi<dwv>> z = dzi.a(djk.q, dwv.a, dzi.d.d, djm.a.m());
   private static final Logger A = LogUtils.getLogger();
   private static final String B = "UpgradeData";
   private static final String C = "block_ticks";
   private static final String D = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   @Nullable
   public static eal a(dgi $$0, kf $$1, tq $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dfm $$3 = new dfm($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         dzr $$6 = dzr.a($$2.l("Status"));
         dzn $$7 = $$2.b("UpgradeData", 10) ? new dzn($$2.p("UpgradeData"), $$0) : dzn.a;
         boolean $$8 = $$2.q("isLightOn");
         edt.d $$9;
         if ($$2.b("blending_data", 10)) {
            $$9 = (edt.d)edt.d.a.parse(ue.a, $$2.p("blending_data")).resultOrPartial(A::error).orElse(null);
         } else {
            $$9 = null;
         }

         ece $$11;
         if ($$2.b("below_zero_retrogen", 10)) {
            $$11 = (ece)ece.a.parse(ue.a, $$2.p("below_zero_retrogen")).resultOrPartial(A::error).orElse(null);
         } else {
            $$11 = null;
         }

         long[] $$13;
         if ($$2.b("carving_mask", 12)) {
            $$13 = $$2.o("carving_mask");
         } else {
            $$13 = null;
         }

         tq $$15 = $$2.p("Heightmaps");
         Map<ecq.a, long[]> $$16 = new EnumMap<>(ecq.a.class);

         for (ecq.a $$17 : $$6.e()) {
            String $$18 = $$17.a();
            if ($$15.b($$18, 12)) {
               $$16.put($$17, $$15.o($$18));
            }
         }

         List<fcp<djk>> $$19 = fcp.a($$2.c("block_ticks", 10), $$0x -> mb.e.b(aku.c($$0x)), $$3);
         List<fcp<esw>> $$20 = fcp.a($$2.c("fluid_ticks", 10), $$0x -> mb.c.b(aku.c($$0x)), $$3);
         dyq.a $$21 = new dyq.a($$19, $$20);
         tw $$22 = $$2.c("PostProcessing", 9);
         ShortList[] $$23 = new ShortList[$$22.size()];

         for (int $$24 = 0; $$24 < $$22.size(); $$24++) {
            tw $$25 = $$22.b($$24);
            ShortList $$26 = new ShortArrayList($$25.size());

            for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
               $$26.add($$25.d($$27));
            }

            $$23[$$24] = $$26;
         }

         List<tq> $$28 = Lists.transform($$2.c("entities", 10), $$0x -> (tq)$$0x);
         List<tq> $$29 = Lists.transform($$2.c("block_entities", 10), $$0x -> (tq)$$0x);
         tq $$30 = $$2.p("structures");
         tw $$31 = $$2.c("sections", 10);
         List<eal.b> $$32 = new ArrayList<>($$31.size());
         ke<dhi> $$33 = $$1.e(mc.aI);
         Codec<dzj<jr<dhi>>> $$34 = a($$33);

         for (int $$35 = 0; $$35 < $$31.size(); $$35++) {
            tq $$36 = $$31.a($$35);
            int $$37 = $$36.f("Y");
            dzb $$42;
            if ($$37 >= $$0.ap() && $$37 <= $$0.aq()) {
               dzi<dwv> $$38;
               if ($$36.b("block_states", 10)) {
                  $$38 = (dzi<dwv>)z.parse(ue.a, $$36.p("block_states")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(eal.a::new);
               } else {
                  $$38 = new dzi<>(djk.q, djm.a.m(), dzi.d.d);
               }

               dzj<jr<dhi>> $$40;
               if ($$36.b("biomes", 10)) {
                  $$40 = (dzj<jr<dhi>>)$$34.parse(ue.a, $$36.p("biomes")).promotePartial($$2x -> a($$3, $$37, $$2x)).getOrThrow(eal.a::new);
               } else {
                  $$40 = new dzi<>($$33.t(), $$33.b(dhp.b), dzi.d.e);
               }

               $$42 = new dzb($$38, $$40);
            } else {
               $$42 = null;
            }

            dyv $$44 = $$36.b("BlockLight", 7) ? new dyv($$36.m("BlockLight")) : null;
            dyv $$45 = $$36.b("SkyLight", 7) ? new dyv($$36.m("SkyLight")) : null;
            $$32.add(new eal.b($$37, $$42, $$44, $$45));
         }

         return new eal($$33, $$3, $$0.ap(), $$4, $$5, $$6, $$9, $$11, $$7, $$13, $$16, $$21, $$23, $$8, $$32, $$28, $$29, $$30);
      }
   }

   public dzk a(arc $$0, cgj $$1, eaj $$2, dfm $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ao();
      dzb[] $$5 = new dzb[$$4];
      boolean $$6 = $$0.G_().g();
      dyu $$7 = $$0.m();
      esm $$8 = $$7.p();
      ke<dhi> $$9 = $$0.K_().e(mc.aI);
      boolean $$10 = false;

      for (eal.b $$11 : this.v) {
         kk $$12 = kk.a($$3, $$11.a);
         if ($$11.b != null) {
            $$5[$$0.g($$11.a)] = $$11.b;
            $$1.a($$12, $$11.b);
         }

         boolean $$13 = $$11.c != null;
         boolean $$14 = $$6 && $$11.d != null;
         if ($$13 || $$14) {
            if (!$$10) {
               $$8.b($$3, true);
               $$10 = true;
            }

            if ($$13) {
               $$8.a(dgp.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dgp.a, $$12, $$11.d);
            }
         }
      }

      dzv $$15 = this.m.d();
      dyq $$18;
      if ($$15 == dzv.b) {
         fcl<djk> $$16 = new fcl<>(this.s.a());
         fcl<esw> $$17 = new fcl<>(this.s.b());
         $$18 = new dza($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), edt.a(this.n));
      } else {
         fco<djk> $$19 = fco.a(this.s.a());
         fco<esw> $$20 = fco.a(this.s.b());
         dzk $$21 = new dzk($$3, this.p, $$5, $$19, $$20, $$0, $$9, edt.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(dzr.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<ecq.a> $$23 = EnumSet.noneOf(ecq.a.class);

      for (ecq.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      ecq.a($$18, $$23);
      $$18.a(a(eoa.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.K_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == dzv.b) {
         return new dyz((dza)$$18, false);
      } else {
         dzk $$27 = (dzk)$$18;

         for (tq $$28 : this.w) {
            $$27.b($$28);
         }

         for (tq $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new dyp(this.q, $$18.L_()));
         }

         return $$27;
      }
   }

   private static void a(dfm $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<dzj<jr<dhi>>> a(ke<dhi> $$0) {
      return dzi.b($$0.t(), $$0.r(), dzi.d.e, $$0.b(dhp.b));
   }

   public static eal a(arc $$0, dyq $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dfm $$2 = $$1.f();
         List<eal.b> $$3 = new ArrayList<>();
         dzb[] $$4 = $$1.d();
         esm $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            dyv $$9 = $$5.a(dgp.b).a(kk.a($$2, $$6));
            dyv $$10 = $$5.a(dgp.a).a(kk.a($$2, $$6));
            dyv $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            dyv $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               dzb $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new eal.b($$6, $$13, $$11, $$12));
            }
         }

         List<tq> $$14 = new ArrayList<>($$1.c().size());

         for (ji $$15 : $$1.c()) {
            tq $$16 = $$1.a($$15, $$0.K_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tq> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == dzv.a) {
            dzk $$19 = (dzk)$$1;
            $$17.addAll($$19.I());
            dyp $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<ecq.a, long[]> $$21 = new EnumMap<>(ecq.a.class);

         for (Entry<ecq.a, ecq> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         dyq.a $$24 = $$1.a($$0.ad());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tq $$26 = a(eoa.a($$0), $$2, $$1.g(), $$1.h());
         return new eal(
            $$0.K_().e(mc.aI),
            $$2,
            $$1.ap(),
            $$0.ad(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), edt::a),
            $$1.z(),
            $$1.t().c(),
            $$18,
            $$21,
            $$24,
            $$25,
            $$1.x(),
            $$3,
            $$17,
            $$14,
            $$26
         );
      }
   }

   public tq a() {
      tq $$0 = uf.e(new tq());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mb.l.b(this.m).toString());
      if (this.n != null) {
         edt.d.a.encodeStart(ue.a, this.n).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("blending_data", $$1x));
      }

      if (this.o != null) {
         ece.a.encodeStart(ue.a, this.o).resultOrPartial(A::error).ifPresent($$1x -> $$0.a("below_zero_retrogen", $$1x));
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      tw $$1 = new tw();
      Codec<dzj<jr<dhi>>> $$2 = a(this.h);

      for (eal.b $$3 : this.v) {
         tq $$4 = new tq();
         dzb $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", (un)z.encodeStart(ue.a, $$5.h()).getOrThrow());
            $$4.a("biomes", (un)$$2.encodeStart(ue.a, $$5.i()).getOrThrow());
         }

         if ($$3.c != null) {
            $$4.a("BlockLight", $$3.c.a());
         }

         if ($$3.d != null) {
            $$4.a("SkyLight", $$3.d.a());
         }

         if (!$$4.g()) {
            $$4.a("Y", (byte)$$3.a);
            $$1.add($$4);
         }
      }

      $$0.a("sections", $$1);
      if (this.u) {
         $$0.a("isLightOn", true);
      }

      tw $$6 = new tw();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == dzv.a) {
         tw $$7 = new tw();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      tq $$8 = new tq();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new tx($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(tq $$0, dyq.a $$1) {
      tw $$2 = new tw();

      for (fcp<djk> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> mb.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      tw $$4 = new tw();

      for (fcp<esw> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> mb.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static dzv a(@Nullable tq $$0) {
      return $$0 != null ? dzr.a($$0.l("Status")).d() : dzv.a;
   }

   @Nullable
   private static dza.c a(arc $$0, List<tq> $$1, List<tq> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(buq.a($$1, $$0, bup.r));
         }

         for (tq $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               ji $$6 = dtx.b($$4);
               dtx $$7 = dtx.a($$6, $$3.a_($$6), $$4, $$0.K_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tq a(eoa $$0, dfm $$1, Map<enk, ens> $$2, Map<enk, LongSet> $$3) {
      tq $$4 = new tq();
      tq $$5 = new tq();
      ke<enk> $$6 = $$0.b().e(mc.aU);

      for (Entry<enk, ens> $$7 : $$2.entrySet()) {
         aku $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tq $$9 = new tq();

      for (Entry<enk, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            aku $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new tx($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<enk, ens> a(eoa $$0, tq $$1, long $$2) {
      Map<enk, ens> $$3 = Maps.newHashMap();
      ke<enk> $$4 = $$0.b().e(mc.aU);
      tq $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         aku $$7 = aku.c($$6);
         enk $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            ens $$9 = ens.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<enk, LongSet> a(kf $$0, dfm $$1, tq $$2) {
      Map<enk, LongSet> $$3 = Maps.newHashMap();
      ke<enk> $$4 = $$0.e(mc.aU);
      tq $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         aku $$7 = aku.c($$6);
         enk $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dfm $$3x = new dfm($$2x);
                  if ($$3x.a($$1) > 8) {
                     A.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
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

   private static tw a(ShortList[] $$0) {
      tw $$1 = new tw();

      for (ShortList $$2 : $$0) {
         tw $$3 = new tw();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ui.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public ke<dhi> b() {
      return this.h;
   }

   public dfm c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public long e() {
      return this.k;
   }

   public long f() {
      return this.l;
   }

   public dzr g() {
      return this.m;
   }

   @Nullable
   public edt.d h() {
      return this.n;
   }

   @Nullable
   public ece i() {
      return this.o;
   }

   public dzn j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<ecq.a, long[]> l() {
      return this.r;
   }

   public dyq.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<eal.b> p() {
      return this.v;
   }

   public List<tq> q() {
      return this.w;
   }

   public List<tq> r() {
      return this.x;
   }

   public tq s() {
      return this.y;
   }

   public static class a extends ub {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable dzb b, @Nullable dyv c, @Nullable dyv d) {
   }
}
