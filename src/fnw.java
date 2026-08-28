import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class fnw {
   final Consumer<fob> b;
   final fnz c;
   final BiConsumer<aku, fon> d;
   final List<dke> e = ImmutableList.of(dkg.eL, dkg.eR, dkg.iw);
   final Map<dke, fnw.b> f = ImmutableMap.builder().put(dkg.b, fnw::a).put(dkg.tn, fnw::c).put(dkg.fa, fnw::b).build();
   final Map<dke, fou> g = ImmutableMap.builder()
      .put(dkg.bc, fou.C.get(dkg.bc))
      .put(dkg.jN, fou.C.get(dkg.jN))
      .put(dkg.kr, fou.a(fos.a(dkg.bc, "_top")))
      .put(dkg.kt, fou.a(fos.a(dkg.jN, "_top")))
      .put(dkg.be, fou.d.get(dkg.bc).a($$0x -> $$0x.a(fot.i, fos.J(dkg.be))))
      .put(dkg.jP, fou.d.get(dkg.jN).a($$0x -> $$0x.a(fot.i, fos.J(dkg.jP))))
      .put(dkg.hA, fou.d.get(dkg.hA))
      .put(dkg.ks, fou.a(fos.a(dkg.hA, "_bottom")))
      .put(dkg.pT, fou.D.get(dkg.pT))
      .put(dkg.tn, fou.D.get(dkg.tn))
      .put(dkg.hB, fou.d.get(dkg.hB).a($$0x -> $$0x.a(fot.i, fos.J(dkg.hB))))
      .put(dkg.bd, fou.d.get(dkg.bd).a($$0x -> {
         $$0x.a(fot.d, fos.a(dkg.bc, "_top"));
         $$0x.a(fot.i, fos.J(dkg.bd));
      }))
      .put(dkg.jO, fou.d.get(dkg.jO).a($$0x -> {
         $$0x.a(fot.d, fos.a(dkg.jN, "_top"));
         $$0x.a(fot.i, fos.J(dkg.jO));
      }))
      .put(dkg.ro, fou.D.get(dkg.ro))
      .put(dkg.rj, fou.D.get(dkg.rj))
      .build();
   static final Map<mf.b, BiConsumer<fnw.a, dke>> h = ImmutableMap.builder()
      .put(mf.b.a, fnw.a::a)
      .put(mf.b.e, fnw.a::l)
      .put(mf.b.b, fnw.a::k)
      .put(mf.b.c, fnw.a::k)
      .put(mf.b.f, fnw.a::c)
      .put(mf.b.g, fnw.a::d)
      .put(mf.b.h, fnw.a::e)
      .put(mf.b.i, fnw.a::f)
      .put(mf.b.k, fnw.a::h)
      .put(mf.b.l, fnw.a::i)
      .put(mf.b.m, fnw.a::j)
      .put(mf.b.n, fnw.a::g)
      .put(mf.b.p, fnw.a::m)
      .put(mf.b.q, fnw.a::b)
      .build();
   public static final List<Pair<jn, Function<aku, foh>>> a = List.of(
      Pair.of(jn.c, (Function<aku, foh>)$$0 -> foh.a().a(foi.c, $$0)),
      Pair.of(jn.f, (Function<aku, foh>)$$0 -> foh.a().a(foi.c, $$0).a(foi.b, foi.a.b).a(foi.d, true)),
      Pair.of(jn.d, (Function<aku, foh>)$$0 -> foh.a().a(foi.c, $$0).a(foi.b, foi.a.c).a(foi.d, true)),
      Pair.of(jn.e, (Function<aku, foh>)$$0 -> foh.a().a(foi.c, $$0).a(foi.b, foi.a.d).a(foi.d, true)),
      Pair.of(jn.b, (Function<aku, foh>)$$0 -> foh.a().a(foi.c, $$0).a(foi.a, foi.a.d).a(foi.d, true)),
      Pair.of(jn.a, (Function<aku, foh>)$$0 -> foh.a().a(foi.c, $$0).a(foi.a, foi.a.b).a(foi.d, true))
   );
   private static final Map<fnw.c, aku> i = new HashMap<>();

   private static fob a(dke $$0, aku $$1, fos $$2, BiConsumer<aku, fon> $$3) {
      aku $$4 = foq.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fob b(dke $$0, aku $$1, fos $$2, BiConsumer<aku, fon> $$3) {
      aku $$4 = foq.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fob c(dke $$0, aku $$1, fos $$2, BiConsumer<aku, fon> $$3) {
      aku $$4 = foq.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fnw(Consumer<fob> $$0, fnz $$1, BiConsumer<aku, fon> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cxd $$0, aku $$1) {
      this.c.a($$0, fom.a($$1));
   }

   void a(dke $$0, aku $$1) {
      this.c.a($$0.i(), fom.a($$1));
   }

   private void a(dke $$0, aku $$1, fnq $$2) {
      this.c.a($$0.i(), fom.a($$1, $$2));
   }

   private aku a(cxd $$0) {
      return foq.bI.a(foo.a($$0), fos.b($$0), this.d);
   }

   aku a(cxd $$0, dke $$1) {
      return foq.bI.a(foo.a($$0), fos.I($$1), this.d);
   }

   private aku a(cxd $$0, dke $$1, String $$2) {
      return foq.bI.a(foo.a($$0), fos.k(fos.a($$1, $$2)), this.d);
   }

   aku b(cxd $$0, dke $$1, String $$2) {
      aku $$3 = fos.J($$1);
      aku $$4 = fos.a($$1, $$2);
      return foq.bM.a(foo.a($$0), fos.c($$3, $$4), this.d);
   }

   void b(cxd $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dke $$0) {
      cxd $$1 = $$0.i();
      if ($$1 != cxl.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dke $$0, String $$1) {
      cxd $$2 = $$0.i();
      if ($$2 != cxl.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dke $$0, String $$1) {
      cxd $$2 = $$0.i();
      if ($$2 != cxl.a) {
         aku $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fof b() {
      return fof.a(dyg.T).a(jn.f, foh.a().a(foi.b, foi.a.b)).a(jn.d, foh.a().a(foi.b, foi.a.c)).a(jn.e, foh.a().a(foi.b, foi.a.d)).a(jn.c, foh.a());
   }

   private static fof c() {
      return fof.a(dyg.T).a(jn.d, foh.a()).a(jn.e, foh.a().a(foi.b, foi.a.b)).a(jn.c, foh.a().a(foi.b, foi.a.c)).a(jn.f, foh.a().a(foi.b, foi.a.d));
   }

   private static fof d() {
      return fof.a(dyg.T).a(jn.f, foh.a()).a(jn.d, foh.a().a(foi.b, foi.a.b)).a(jn.e, foh.a().a(foi.b, foi.a.c)).a(jn.c, foh.a().a(foi.b, foi.a.d));
   }

   private static fof e() {
      return fof.a(dyg.R)
         .a(jn.a, foh.a().a(foi.a, foi.a.b))
         .a(jn.b, foh.a().a(foi.a, foi.a.d))
         .a(jn.c, foh.a())
         .a(jn.d, foh.a().a(foi.b, foi.a.c))
         .a(jn.e, foh.a().a(foi.b, foi.a.d))
         .a(jn.f, foh.a().a(foi.b, foi.a.b));
   }

   private static foe b(dke $$0, aku $$1) {
      return foe.a($$0, a($$1));
   }

   private static foh[] a(aku $$0) {
      return new foh[]{
         foh.a().a(foi.c, $$0), foh.a().a(foi.c, $$0).a(foi.b, foi.a.b), foh.a().a(foi.c, $$0).a(foi.b, foi.a.c), foh.a().a(foi.c, $$0).a(foi.b, foi.a.d)
      };
   }

   private static foe a(dke $$0, aku $$1, aku $$2) {
      return foe.a($$0, foh.a().a(foi.c, $$1), foh.a().a(foi.c, $$2), foh.a().a(foi.c, $$1).a(foi.b, foi.a.c), foh.a().a(foi.c, $$2).a(foi.b, foi.a.c));
   }

   private static fof a(dyh $$0, aku $$1, aku $$2) {
      return fof.a($$0).a(true, foh.a().a(foi.c, $$1)).a(false, foh.a().a(foi.c, $$2));
   }

   private void d(dke $$0) {
      aku $$1 = fou.a.create($$0, this.d);
      aku $$2 = fou.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(dke $$0) {
      aku $$1 = fou.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(dke $$0) {
      this.b.accept(foe.a($$0).a(fof.a(dyg.by).a($$1 -> {
         String $$2 = "_" + $$1;
         aku $$3 = fos.a($$0, $$2);
         return foh.a().a(foi.c, foq.c.a($$0, $$2, new fos().a(fot.a, $$3), this.d));
      })));
      this.a($$0, foo.a($$0, "_0"));
   }

   static fob b(dke $$0, aku $$1, aku $$2) {
      return foe.a($$0)
         .a(fof.a(dyg.A).a(false, foh.a().a(foi.c, $$1)).a(true, foh.a().a(foi.c, $$2)))
         .a(
            fof.a(dyg.X, dyg.T)
               .a(dyb.a, jn.f, foh.a().a(foi.b, foi.a.b))
               .a(dyb.a, jn.e, foh.a().a(foi.b, foi.a.d))
               .a(dyb.a, jn.d, foh.a().a(foi.b, foi.a.c))
               .a(dyb.a, jn.c, foh.a())
               .a(dyb.b, jn.f, foh.a().a(foi.b, foi.a.b).a(foi.a, foi.a.b).a(foi.d, true))
               .a(dyb.b, jn.e, foh.a().a(foi.b, foi.a.d).a(foi.a, foi.a.b).a(foi.d, true))
               .a(dyb.b, jn.d, foh.a().a(foi.b, foi.a.c).a(foi.a, foi.a.b).a(foi.d, true))
               .a(dyb.b, jn.c, foh.a().a(foi.a, foi.a.b).a(foi.d, true))
               .a(dyb.c, jn.f, foh.a().a(foi.b, foi.a.d).a(foi.a, foi.a.c))
               .a(dyb.c, jn.e, foh.a().a(foi.b, foi.a.b).a(foi.a, foi.a.c))
               .a(dyb.c, jn.d, foh.a().a(foi.a, foi.a.c))
               .a(dyb.c, jn.c, foh.a().a(foi.b, foi.a.c).a(foi.a, foi.a.c))
         );
   }

   private static fof.d<jn, dym, dyl, Boolean> a(fof.d<jn, dym, dyl, Boolean> $$0, dym $$1, aku $$2, aku $$3, aku $$4, aku $$5) {
      return $$0.a(jn.f, $$1, dyl.a, false, foh.a().a(foi.c, $$2))
         .a(jn.d, $$1, dyl.a, false, foh.a().a(foi.c, $$2).a(foi.b, foi.a.b))
         .a(jn.e, $$1, dyl.a, false, foh.a().a(foi.c, $$2).a(foi.b, foi.a.c))
         .a(jn.c, $$1, dyl.a, false, foh.a().a(foi.c, $$2).a(foi.b, foi.a.d))
         .a(jn.f, $$1, dyl.b, false, foh.a().a(foi.c, $$4))
         .a(jn.d, $$1, dyl.b, false, foh.a().a(foi.c, $$4).a(foi.b, foi.a.b))
         .a(jn.e, $$1, dyl.b, false, foh.a().a(foi.c, $$4).a(foi.b, foi.a.c))
         .a(jn.c, $$1, dyl.b, false, foh.a().a(foi.c, $$4).a(foi.b, foi.a.d))
         .a(jn.f, $$1, dyl.a, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
         .a(jn.d, $$1, dyl.a, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c))
         .a(jn.e, $$1, dyl.a, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d))
         .a(jn.c, $$1, dyl.a, true, foh.a().a(foi.c, $$3))
         .a(jn.f, $$1, dyl.b, true, foh.a().a(foi.c, $$5).a(foi.b, foi.a.d))
         .a(jn.d, $$1, dyl.b, true, foh.a().a(foi.c, $$5))
         .a(jn.e, $$1, dyl.b, true, foh.a().a(foi.c, $$5).a(foi.b, foi.a.b))
         .a(jn.c, $$1, dyl.b, true, foh.a().a(foi.c, $$5).a(foi.b, foi.a.c));
   }

   private static fob a(dke $$0, aku $$1, aku $$2, aku $$3, aku $$4, aku $$5, aku $$6, aku $$7, aku $$8) {
      return foe.a($$0).a(a(a(fof.a(dyg.T, dyg.ah, dyg.bh, dyg.y), dym.b, $$1, $$2, $$3, $$4), dym.a, $$5, $$6, $$7, $$8));
   }

   static fob a(dke $$0, aku $$1, aku $$2, aku $$3, aku $$4, aku $$5) {
      return fod.a($$0)
         .a(foh.a().a(foi.c, $$1))
         .a(foc.a().a(dyg.N, true), foh.a().a(foi.c, $$2).a(foi.d, false))
         .a(foc.a().a(dyg.O, true), foh.a().a(foi.c, $$3).a(foi.d, false))
         .a(foc.a().a(dyg.P, true), foh.a().a(foi.c, $$4).a(foi.d, false))
         .a(foc.a().a(dyg.Q, true), foh.a().a(foi.c, $$5).a(foi.d, false));
   }

   static fob c(dke $$0, aku $$1, aku $$2) {
      return fod.a($$0)
         .a(foh.a().a(foi.c, $$1))
         .a(foc.a().a(dyg.N, true), foh.a().a(foi.c, $$2).a(foi.d, true))
         .a(foc.a().a(dyg.O, true), foh.a().a(foi.c, $$2).a(foi.b, foi.a.b).a(foi.d, true))
         .a(foc.a().a(dyg.P, true), foh.a().a(foi.c, $$2).a(foi.b, foi.a.c).a(foi.d, true))
         .a(foc.a().a(dyg.Q, true), foh.a().a(foi.c, $$2).a(foi.b, foi.a.d).a(foi.d, true));
   }

   static fob a(dke $$0, aku $$1, aku $$2, aku $$3) {
      return fod.a($$0)
         .a(foc.a().a(dyg.L, true), foh.a().a(foi.c, $$1))
         .a(foc.a().a(dyg.aa, dzc.b), foh.a().a(foi.c, $$2).a(foi.d, true))
         .a(foc.a().a(dyg.Z, dzc.b), foh.a().a(foi.c, $$2).a(foi.b, foi.a.b).a(foi.d, true))
         .a(foc.a().a(dyg.ab, dzc.b), foh.a().a(foi.c, $$2).a(foi.b, foi.a.c).a(foi.d, true))
         .a(foc.a().a(dyg.ac, dzc.b), foh.a().a(foi.c, $$2).a(foi.b, foi.a.d).a(foi.d, true))
         .a(foc.a().a(dyg.aa, dzc.c), foh.a().a(foi.c, $$3).a(foi.d, true))
         .a(foc.a().a(dyg.Z, dzc.c), foh.a().a(foi.c, $$3).a(foi.b, foi.a.b).a(foi.d, true))
         .a(foc.a().a(dyg.ab, dzc.c), foh.a().a(foi.c, $$3).a(foi.b, foi.a.c).a(foi.d, true))
         .a(foc.a().a(dyg.ac, dzc.c), foh.a().a(foi.c, $$3).a(foi.b, foi.a.d).a(foi.d, true));
   }

   static fob a(dke $$0, aku $$1, aku $$2, aku $$3, aku $$4, boolean $$5) {
      return foe.a($$0, foh.a().a(foi.d, $$5))
         .a(c())
         .a(
            fof.a(dyg.t, dyg.y)
               .a(false, false, foh.a().a(foi.c, $$2))
               .a(true, false, foh.a().a(foi.c, $$4))
               .a(false, true, foh.a().a(foi.c, $$1))
               .a(true, true, foh.a().a(foi.c, $$3))
         );
   }

   static fob b(dke $$0, aku $$1, aku $$2, aku $$3) {
      return foe.a($$0)
         .a(
            fof.a(dyg.T, dyg.ai, dyg.bl)
               .a(jn.f, dyp.b, dyz.a, foh.a().a(foi.c, $$2))
               .a(jn.e, dyp.b, dyz.a, foh.a().a(foi.c, $$2).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.d, dyp.b, dyz.a, foh.a().a(foi.c, $$2).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.c, dyp.b, dyz.a, foh.a().a(foi.c, $$2).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.f, dyp.b, dyz.e, foh.a().a(foi.c, $$3))
               .a(jn.e, dyp.b, dyz.e, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.d, dyp.b, dyz.e, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.c, dyp.b, dyz.e, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.f, dyp.b, dyz.d, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.e, dyp.b, dyz.d, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.d, dyp.b, dyz.d, foh.a().a(foi.c, $$3))
               .a(jn.c, dyp.b, dyz.d, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.f, dyp.b, dyz.c, foh.a().a(foi.c, $$1))
               .a(jn.e, dyp.b, dyz.c, foh.a().a(foi.c, $$1).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.d, dyp.b, dyz.c, foh.a().a(foi.c, $$1).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.c, dyp.b, dyz.c, foh.a().a(foi.c, $$1).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.f, dyp.b, dyz.b, foh.a().a(foi.c, $$1).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.e, dyp.b, dyz.b, foh.a().a(foi.c, $$1).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.d, dyp.b, dyz.b, foh.a().a(foi.c, $$1))
               .a(jn.c, dyp.b, dyz.b, foh.a().a(foi.c, $$1).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.f, dyp.a, dyz.a, foh.a().a(foi.c, $$2).a(foi.a, foi.a.c).a(foi.d, true))
               .a(jn.e, dyp.a, dyz.a, foh.a().a(foi.c, $$2).a(foi.a, foi.a.c).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.d, dyp.a, dyz.a, foh.a().a(foi.c, $$2).a(foi.a, foi.a.c).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.c, dyp.a, dyz.a, foh.a().a(foi.c, $$2).a(foi.a, foi.a.c).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.f, dyp.a, dyz.e, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.e, dyp.a, dyz.e, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.d, dyp.a, dyz.e, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.c, dyp.a, dyz.e, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.d, true))
               .a(jn.f, dyp.a, dyz.d, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.d, true))
               .a(jn.e, dyp.a, dyz.d, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.d, dyp.a, dyz.d, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.c, dyp.a, dyz.d, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.f, dyp.a, dyz.c, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.e, dyp.a, dyz.c, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.b, foi.a.d).a(foi.d, true))
               .a(jn.d, dyp.a, dyz.c, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.c, dyp.a, dyz.c, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.d, true))
               .a(jn.f, dyp.a, dyz.b, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.d, true))
               .a(jn.e, dyp.a, dyz.b, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.b, foi.a.c).a(foi.d, true))
               .a(jn.d, dyp.a, dyz.b, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.b, foi.a.b).a(foi.d, true))
               .a(jn.c, dyp.a, dyz.b, foh.a().a(foi.c, $$1).a(foi.a, foi.a.c).a(foi.b, foi.a.d).a(foi.d, true))
         );
   }

   private static fob c(dke $$0, aku $$1, aku $$2, aku $$3) {
      return foe.a($$0)
         .a(
            fof.a(dyg.T, dyg.ai, dyg.y)
               .a(jn.c, dyp.b, false, foh.a().a(foi.c, $$2))
               .a(jn.d, dyp.b, false, foh.a().a(foi.c, $$2).a(foi.b, foi.a.c))
               .a(jn.f, dyp.b, false, foh.a().a(foi.c, $$2).a(foi.b, foi.a.b))
               .a(jn.e, dyp.b, false, foh.a().a(foi.c, $$2).a(foi.b, foi.a.d))
               .a(jn.c, dyp.a, false, foh.a().a(foi.c, $$1))
               .a(jn.d, dyp.a, false, foh.a().a(foi.c, $$1).a(foi.b, foi.a.c))
               .a(jn.f, dyp.a, false, foh.a().a(foi.c, $$1).a(foi.b, foi.a.b))
               .a(jn.e, dyp.a, false, foh.a().a(foi.c, $$1).a(foi.b, foi.a.d))
               .a(jn.c, dyp.b, true, foh.a().a(foi.c, $$3))
               .a(jn.d, dyp.b, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c))
               .a(jn.f, dyp.b, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
               .a(jn.e, dyp.b, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d))
               .a(jn.c, dyp.a, true, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.c))
               .a(jn.d, dyp.a, true, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.a))
               .a(jn.f, dyp.a, true, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.d))
               .a(jn.e, dyp.a, true, foh.a().a(foi.c, $$3).a(foi.a, foi.a.c).a(foi.b, foi.a.b))
         );
   }

   private static fob d(dke $$0, aku $$1, aku $$2, aku $$3) {
      return foe.a($$0)
         .a(
            fof.a(dyg.T, dyg.ai, dyg.y)
               .a(jn.c, dyp.b, false, foh.a().a(foi.c, $$2))
               .a(jn.d, dyp.b, false, foh.a().a(foi.c, $$2))
               .a(jn.f, dyp.b, false, foh.a().a(foi.c, $$2))
               .a(jn.e, dyp.b, false, foh.a().a(foi.c, $$2))
               .a(jn.c, dyp.a, false, foh.a().a(foi.c, $$1))
               .a(jn.d, dyp.a, false, foh.a().a(foi.c, $$1))
               .a(jn.f, dyp.a, false, foh.a().a(foi.c, $$1))
               .a(jn.e, dyp.a, false, foh.a().a(foi.c, $$1))
               .a(jn.c, dyp.b, true, foh.a().a(foi.c, $$3))
               .a(jn.d, dyp.b, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c))
               .a(jn.f, dyp.b, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
               .a(jn.e, dyp.b, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d))
               .a(jn.c, dyp.a, true, foh.a().a(foi.c, $$3))
               .a(jn.d, dyp.a, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c))
               .a(jn.f, dyp.a, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
               .a(jn.e, dyp.a, true, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d))
         );
   }

   static foe c(dke $$0, aku $$1) {
      return foe.a($$0, foh.a().a(foi.c, $$1));
   }

   private static fof f() {
      return fof.a(dyg.K).a(jn.a.b, foh.a()).a(jn.a.c, foh.a().a(foi.a, foi.a.b)).a(jn.a.a, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.b));
   }

   static fob a(dke $$0, fos $$1, BiConsumer<aku, fon> $$2) {
      aku $$3 = foq.g.a($$0, $$1, $$2);
      aku $$4 = foq.h.a($$0, $$1, $$2);
      aku $$5 = foq.i.a($$0, $$1, $$2);
      aku $$6 = foq.j.a($$0, $$1, $$2);
      return foe.a($$0, foh.a().a(foi.c, $$6))
         .a(fof.a(dyg.K).a(jn.a.a, foh.a().a(foi.c, $$3)).a(jn.a.b, foh.a().a(foi.c, $$4)).a(jn.a.c, foh.a().a(foi.c, $$5)));
   }

   static fob d(dke $$0, aku $$1) {
      return foe.a($$0, foh.a().a(foi.c, $$1)).a(f());
   }

   private void e(dke $$0, aku $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dke $$0, fou.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(dke $$0, fou.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      this.b.accept(foe.a($$0, foh.a().a(foi.c, $$2)).a(b()));
   }

   static fob d(dke $$0, aku $$1, aku $$2) {
      return foe.a($$0)
         .a(
            fof.a(dyg.K)
               .a(jn.a.b, foh.a().a(foi.c, $$1))
               .a(jn.a.c, foh.a().a(foi.c, $$2).a(foi.a, foi.a.b))
               .a(jn.a.a, foh.a().a(foi.c, $$2).a(foi.a, foi.a.b).a(foi.b, foi.a.b))
         );
   }

   private void a(dke $$0, fou.a $$1, fou.a $$2) {
      aku $$3 = $$1.create($$0, this.d);
      aku $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(dke $$0) {
      aku $$1 = fou.A.create($$0, this.d);
      aku $$2 = fou.B.create($$0, this.d);
      aku $$3 = this.a(fou.A, $$0, "_awake");
      aku $$4 = this.a(fou.B, $$0, "_awake");
      aku $$5 = this.a(fou.A, $$0, "_dormant");
      aku $$6 = this.a(fou.B, $$0, "_dormant");
      this.b
         .accept(
            foe.a($$0)
               .a(
                  fof.a(dyg.K, dlz.c)
                     .a(jn.a.b, dyk.a, foh.a().a(foi.c, $$1))
                     .a(jn.a.c, dyk.a, foh.a().a(foi.c, $$2).a(foi.a, foi.a.b))
                     .a(jn.a.a, dyk.a, foh.a().a(foi.c, $$2).a(foi.a, foi.a.b).a(foi.b, foi.a.b))
                     .a(jn.a.b, dyk.b, foh.a().a(foi.c, $$5))
                     .a(jn.a.c, dyk.b, foh.a().a(foi.c, $$6).a(foi.a, foi.a.b))
                     .a(jn.a.a, dyk.b, foh.a().a(foi.c, $$6).a(foi.a, foi.a.b).a(foi.b, foi.a.b))
                     .a(jn.a.b, dyk.c, foh.a().a(foi.c, $$3))
                     .a(jn.a.c, dyk.c, foh.a().a(foi.c, $$4).a(foi.a, foi.a.b))
                     .a(jn.a.a, dyk.c, foh.a().a(foi.c, $$4).a(foi.a, foi.a.b).a(foi.b, foi.a.b))
               )
         );
   }

   private aku a(fou.a $$0, dke $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(fot.i, fos.a($$1, $$2)).a(fot.d, fos.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.d);
   }

   private aku a(dke $$0, String $$1, fop $$2, Function<aku, fos> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fos.a($$0, $$1)), this.d);
   }

   static fob e(dke $$0, aku $$1, aku $$2) {
      return foe.a($$0).a(a(dyg.A, $$2, $$1));
   }

   static fob e(dke $$0, aku $$1, aku $$2, aku $$3) {
      return foe.a($$0).a(fof.a(dyg.bk).a(dyy.b, foh.a().a(foi.c, $$1)).a(dyy.a, foh.a().a(foi.c, $$2)).a(dyy.c, foh.a().a(foi.c, $$3)));
   }

   public void a(dke $$0) {
      this.b($$0, fou.a);
   }

   public void b(dke $$0, fou.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(dke $$0, fou.a $$1, int $$2) {
      aku $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fom.a($$2));
   }

   private void g() {
      this.K(dkg.ft);
      aku $$0 = this.a(cxl.gm, dkg.ft);
      this.a(dkg.ft, $$0, fom.a(-12012264));
   }

   private void h(dke $$0) {
      aku $$1 = this.a($$0.i(), $$0);
      this.a($$0, $$1, new fnp());
   }

   private fnw.a i(dke $$0) {
      fou $$1 = this.g.getOrDefault($$0, fou.a.get($$0));
      return new fnw.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dke $$0, dke $$1, dke $$2) {
      aku $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.i());
   }

   void j(dke $$0) {
      fos $$1 = fos.w($$0);
      aku $$2 = foq.v.a($$0, $$1, this.d);
      aku $$3 = foq.w.a($$0, $$1, this.d);
      aku $$4 = foq.x.a($$0, $$1, this.d);
      aku $$5 = foq.y.a($$0, $$1, this.d);
      aku $$6 = foq.z.a($$0, $$1, this.d);
      aku $$7 = foq.A.a($$0, $$1, this.d);
      aku $$8 = foq.B.a($$0, $$1, this.d);
      aku $$9 = foq.C.a($$0, $$1, this.d);
      this.b($$0.i());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dke $$0, dke $$1) {
      aku $$2 = foq.v.a($$0);
      aku $$3 = foq.w.a($$0);
      aku $$4 = foq.x.a($$0);
      aku $$5 = foq.y.a($$0);
      aku $$6 = foq.z.a($$0);
      aku $$7 = foq.A.a($$0);
      aku $$8 = foq.B.a($$0);
      aku $$9 = foq.C.a($$0);
      this.c.a($$0.i(), $$1.i());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dke $$0) {
      fos $$1 = fos.b($$0);
      aku $$2 = foq.ak.a($$0, $$1, this.d);
      aku $$3 = foq.al.a($$0, $$1, this.d);
      aku $$4 = foq.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dke $$0) {
      fos $$1 = fos.b($$0);
      aku $$2 = foq.ah.a($$0, $$1, this.d);
      aku $$3 = foq.ai.a($$0, $$1, this.d);
      aku $$4 = foq.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(dke $$0, dke $$1) {
      aku $$2 = foq.ah.a($$0);
      aku $$3 = foq.ai.a($$0);
      aku $$4 = foq.aj.a($$0);
      this.c.a($$0.i(), $$1.i());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      aku $$0 = foo.a(dkg.th);
      aku $$1 = foo.a(dkg.th, "_partial_tilt");
      aku $$2 = foo.a(dkg.th, "_full_tilt");
      this.b
         .accept(
            foe.a(dkg.th)
               .a(b())
               .a(fof.a(dyg.bo).a(dzb.a, foh.a().a(foi.c, $$0)).a(dzb.b, foh.a().a(foi.c, $$0)).a(dzb.c, foh.a().a(foi.c, $$1)).a(dzb.d, foh.a().a(foi.c, $$2)))
         );
   }

   private fnw.e m(dke $$0) {
      return new fnw.e(fos.q($$0));
   }

   private void n(dke $$0) {
      this.d($$0, $$0);
   }

   private void d(dke $$0, dke $$1) {
      this.b.accept(c($$0, foo.a($$1)));
   }

   private void a(dke $$0, fnw.d $$1) {
      this.a($$0.i(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dke $$0, fnw.d $$1, fos $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dke $$0, fnw.d $$1) {
      fos $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dke $$0, fnw.d $$1, fos $$2) {
      aku $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(dke $$0, fnw.d $$1, dyt<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fof $$4 = fof.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fos $$5 = fos.c(fos.a($$0, $$4x));
            aku $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return foh.a().a(foi.c, $$6);
         });
         this.b($$0.i());
         this.b.accept(foe.a($$0).a($$4));
      }
   }

   private void a(dke $$0, dke $$1, fnw.d $$2) {
      this.a($$0.i(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dke $$0, dke $$1, fnw.d $$2) {
      this.b($$0, $$2);
      fos $$3 = $$2.b($$0);
      aku $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(dke $$0, dke $$1) {
      fou $$2 = fou.u.get($$0);
      aku $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      aku $$4 = foq.aJ.a($$1, $$2.b(), this.d);
      this.b.accept(foe.a($$1, foh.a().a(foi.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(dke $$0, dke $$1) {
      this.b($$0.i());
      fos $$2 = fos.k($$0);
      fos $$3 = fos.a($$0, $$1);
      aku $$4 = foq.bb.a($$1, $$3, this.d);
      this.b
         .accept(
            foe.a($$1, foh.a().a(foi.c, $$4))
               .a(fof.a(dyg.T).a(jn.e, foh.a()).a(jn.d, foh.a().a(foi.b, foi.a.d)).a(jn.c, foh.a().a(foi.b, foi.a.b)).a(jn.f, foh.a().a(foi.b, foi.a.c)))
         );
      this.b.accept(foe.a($$0).a(fof.a(dyg.ay).a($$2x -> foh.a().a(foi.c, foq.ba[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      dke $$0 = dkg.le;
      this.b($$0.i());
      aku $$1 = foo.a($$0, "_top");
      aku $$2 = foo.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      dke $$0 = dkg.ld;
      this.b($$0.i());
      fof $$1 = fof.a(dpx.e, dyg.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> foh.a().a(foi.c, foo.a($$0, "_top_stage_" + $$1x));
            case b -> foh.a().a(foi.c, foo.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(foe.a($$0).a($$1));
   }

   private void a(dke $$0, dke $$1, dke $$2, dke $$3, dke $$4, dke $$5, dke $$6, dke $$7) {
      this.a($$0, fnw.d.b);
      this.a($$1, fnw.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dke $$0, fnw.d $$1) {
      aku $$2 = this.a($$0, "_top", $$1.a(), fos::c);
      aku $$3 = this.a($$0, "_bottom", $$1.a(), fos::c);
      this.f($$0, $$2, $$3);
   }

   private void d(dke $$0, fnw.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dke $$0) {
      aku $$1 = this.a($$0.i(), $$0, "_top");
      this.a($$0, $$1, new fnp());
      this.c($$0, fnw.d.a);
   }

   private void k() {
      this.a(dkg.jb, "_front");
      aku $$0 = foo.a(dkg.jb, "_top");
      aku $$1 = this.a(dkg.jb, "_bottom", fnw.d.b.a(), fos::c);
      this.f(dkg.jb, $$0, $$1);
   }

   private void l() {
      aku $$0 = this.a(dkg.bE, "_top", foq.bv, fos::a);
      aku $$1 = this.a(dkg.bE, "_bottom", foq.bv, fos::a);
      this.f(dkg.bE, $$0, $$1);
   }

   private void m() {
      aku $$0 = foo.a(dkg.tj, "_top");
      aku $$1 = foo.a(dkg.tj, "_bottom");
      this.b.accept(foe.a(dkg.tj).a(b()).a(fof.a(dyg.ah).a(dym.b, foh.a().a(foi.c, $$1)).a(dym.a, foh.a().a(foi.c, $$0))));
   }

   private void f(dke $$0, aku $$1, aku $$2) {
      this.b.accept(foe.a($$0).a(fof.a(dyg.ah).a(dym.b, foh.a().a(foi.c, $$2)).a(dym.a, foh.a().a(foi.c, $$1))));
   }

   private void p(dke $$0) {
      fos $$1 = fos.h($$0);
      fos $$2 = fos.e(fos.a($$0, "_corner"));
      aku $$3 = foq.au.a($$0, $$1, this.d);
      aku $$4 = foq.av.a($$0, $$2, this.d);
      aku $$5 = foq.aw.a($$0, $$1, this.d);
      aku $$6 = foq.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            foe.a($$0)
               .a(
                  fof.a(dyg.aj)
                     .a(dyu.a, foh.a().a(foi.c, $$3))
                     .a(dyu.b, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
                     .a(dyu.c, foh.a().a(foi.c, $$5).a(foi.b, foi.a.b))
                     .a(dyu.d, foh.a().a(foi.c, $$6).a(foi.b, foi.a.b))
                     .a(dyu.e, foh.a().a(foi.c, $$5))
                     .a(dyu.f, foh.a().a(foi.c, $$6))
                     .a(dyu.g, foh.a().a(foi.c, $$4))
                     .a(dyu.h, foh.a().a(foi.c, $$4).a(foi.b, foi.a.b))
                     .a(dyu.i, foh.a().a(foi.c, $$4).a(foi.b, foi.a.c))
                     .a(dyu.j, foh.a().a(foi.c, $$4).a(foi.b, foi.a.d))
               )
         );
   }

   private void q(dke $$0) {
      aku $$1 = this.a($$0, "", foq.au, fos::e);
      aku $$2 = this.a($$0, "", foq.aw, fos::e);
      aku $$3 = this.a($$0, "", foq.ax, fos::e);
      aku $$4 = this.a($$0, "_on", foq.au, fos::e);
      aku $$5 = this.a($$0, "_on", foq.aw, fos::e);
      aku $$6 = this.a($$0, "_on", foq.ax, fos::e);
      fof $$7 = fof.a(dyg.A, dyg.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return foh.a().a(foi.c, $$6x ? $$4 : $$1);
            case b:
               return foh.a().a(foi.c, $$6x ? $$4 : $$1).a(foi.b, foi.a.b);
            case c:
               return foh.a().a(foi.c, $$6x ? $$5 : $$2).a(foi.b, foi.a.b);
            case d:
               return foh.a().a(foi.c, $$6x ? $$6 : $$3).a(foi.b, foi.a.b);
            case e:
               return foh.a().a(foi.c, $$6x ? $$5 : $$2);
            case f:
               return foh.a().a(foi.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(foe.a($$0).a($$7));
   }

   private void a(dke $$0, cxd $$1) {
      aku $$2 = foq.aa.a($$0, fos.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(dke $$0, aku $$1) {
      aku $$2 = foq.aa.a($$0, fos.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private aku g(dke $$0, dke $$1) {
      return foq.aa.a($$0, fos.x($$1), this.d);
   }

   public void a(dke $$0, dke $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(dke $$0) {
      this.a($$0, $$0);
   }

   private void h(dke $$0, dke $$1) {
      this.a($$0);
      aku $$2 = fou.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(dke $$0) {
      aku $$1 = fou.p.create($$0, this.d);
      aku $$2 = fou.q.create($$0, this.d);
      aku $$3 = fou.r.create($$0, this.d);
      aku $$4 = fou.s.create($$0, this.d);
      this.c($$0);
      this.a($$0, dyg.V, $$1, $$2, $$3, $$4);
   }

   private void t(dke $$0) {
      aku $$1 = fou.l.create($$0, this.d);
      aku $$2 = fou.m.create($$0, this.d);
      aku $$3 = fou.n.create($$0, this.d);
      aku $$4 = fou.o.create($$0, this.d);
      this.b($$0.i());
      this.a($$0, dyg.U, $$1, $$2, $$3, $$4);
   }

   private void a(dke $$0, dyq $$1, aku $$2, aku $$3, aku $$4, aku $$5) {
      this.b
         .accept(
            fod.a($$0)
               .a(foc.a().a($$1, 1, 2, 3, 4).a(dyg.T, jn.c), foh.a().a(foi.c, $$2))
               .a(foc.a().a($$1, 1, 2, 3, 4).a(dyg.T, jn.f), foh.a().a(foi.c, $$2).a(foi.b, foi.a.b))
               .a(foc.a().a($$1, 1, 2, 3, 4).a(dyg.T, jn.d), foh.a().a(foi.c, $$2).a(foi.b, foi.a.c))
               .a(foc.a().a($$1, 1, 2, 3, 4).a(dyg.T, jn.e), foh.a().a(foi.c, $$2).a(foi.b, foi.a.d))
               .a(foc.a().a($$1, 2, 3, 4).a(dyg.T, jn.c), foh.a().a(foi.c, $$3))
               .a(foc.a().a($$1, 2, 3, 4).a(dyg.T, jn.f), foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
               .a(foc.a().a($$1, 2, 3, 4).a(dyg.T, jn.d), foh.a().a(foi.c, $$3).a(foi.b, foi.a.c))
               .a(foc.a().a($$1, 2, 3, 4).a(dyg.T, jn.e), foh.a().a(foi.c, $$3).a(foi.b, foi.a.d))
               .a(foc.a().a($$1, 3, 4).a(dyg.T, jn.c), foh.a().a(foi.c, $$4))
               .a(foc.a().a($$1, 3, 4).a(dyg.T, jn.f), foh.a().a(foi.c, $$4).a(foi.b, foi.a.b))
               .a(foc.a().a($$1, 3, 4).a(dyg.T, jn.d), foh.a().a(foi.c, $$4).a(foi.b, foi.a.c))
               .a(foc.a().a($$1, 3, 4).a(dyg.T, jn.e), foh.a().a(foi.c, $$4).a(foi.b, foi.a.d))
               .a(foc.a().a($$1, 4).a(dyg.T, jn.c), foh.a().a(foi.c, $$5))
               .a(foc.a().a($$1, 4).a(dyg.T, jn.f), foh.a().a(foi.c, $$5).a(foi.b, foi.a.b))
               .a(foc.a().a($$1, 4).a(dyg.T, jn.d), foh.a().a(foi.c, $$5).a(foi.b, foi.a.c))
               .a(foc.a().a($$1, 4).a(dyg.T, jn.e), foh.a().a(foi.c, $$5).a(foi.b, foi.a.d))
         );
   }

   private void a(fou.a $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         aku $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fou.a $$0, dke... $$1) {
      for (dke $$2 : $$1) {
         aku $$3 = $$0.create($$2, this.d);
         this.b.accept(foe.a($$2, foh.a().a(foi.c, $$3)).a(c()));
      }
   }

   private void i(dke $$0, dke $$1) {
      this.a($$0);
      fos $$2 = fos.b($$0, $$1);
      aku $$3 = foq.aP.a($$1, $$2, this.d);
      aku $$4 = foq.aQ.a($$1, $$2, this.d);
      aku $$5 = foq.aR.a($$1, $$2, this.d);
      aku $$6 = foq.aN.a($$1, $$2, this.d);
      aku $$7 = foq.aO.a($$1, $$2, this.d);
      cxd $$8 = $$1.i();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fod.a($$1)
               .a(foh.a().a(foi.c, $$3))
               .a(foc.a().a(dyg.N, true), foh.a().a(foi.c, $$4))
               .a(foc.a().a(dyg.O, true), foh.a().a(foi.c, $$4).a(foi.b, foi.a.b))
               .a(foc.a().a(dyg.P, true), foh.a().a(foi.c, $$5))
               .a(foc.a().a(dyg.Q, true), foh.a().a(foi.c, $$5).a(foi.b, foi.a.b))
               .a(foc.a().a(dyg.N, false), foh.a().a(foi.c, $$6))
               .a(foc.a().a(dyg.O, false), foh.a().a(foi.c, $$7))
               .a(foc.a().a(dyg.P, false), foh.a().a(foi.c, $$7).a(foi.b, foi.a.b))
               .a(foc.a().a(dyg.Q, false), foh.a().a(foi.c, $$6).a(foi.b, foi.a.d))
         );
   }

   private void u(dke $$0) {
      fos $$1 = fos.C($$0);
      aku $$2 = foq.aS.a($$0, $$1, this.d);
      aku $$3 = this.a($$0, "_conditional", foq.aS, $$1x -> $$1.c(fot.i, $$1x));
      this.b.accept(foe.a($$0).a(a(dyg.f, $$3, $$2)).a(e()));
   }

   private void v(dke $$0) {
      aku $$1 = fou.v.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<foh> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> foh.a().a(foi.c, foo.a(dkg.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fod.a(dkg.nB)
               .a(foc.a().a(dyg.at, 0), this.a(0))
               .a(foc.a().a(dyg.at, 1), this.a(1))
               .a(foc.a().a(dyg.bn, dyc.b), foh.a().a(foi.c, foo.a(dkg.nB, "_small_leaves")))
               .a(foc.a().a(dyg.bn, dyc.c), foh.a().a(foi.c, foo.a(dkg.nB, "_large_leaves")))
         );
   }

   private fof o() {
      return fof.a(dyg.R)
         .a(jn.a, foh.a().a(foi.a, foi.a.c))
         .a(jn.b, foh.a())
         .a(jn.c, foh.a().a(foi.a, foi.a.b))
         .a(jn.d, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.c))
         .a(jn.e, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.d))
         .a(jn.f, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.b));
   }

   private void p() {
      aku $$0 = fos.a(dkg.ow, "_top_open");
      this.b
         .accept(
            foe.a(dkg.ow)
               .a(this.o())
               .a(
                  fof.a(dyg.y)
                     .a(false, foh.a().a(foi.c, fou.f.create(dkg.ow, this.d)))
                     .a(true, foh.a().a(foi.c, fou.f.get(dkg.ow).a($$1 -> $$1.a(fot.f, $$0)).a(dkg.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fof a(dyt<T> $$0, T $$1, aku $$2, aku $$3) {
      foh $$4 = foh.a().a(foi.c, $$2);
      foh $$5 = foh.a().a(foi.c, $$3);
      return fof.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dke $$0, Function<dke, fos> $$1) {
      fos $$2 = $$1.apply($$0).b(fot.i, fot.c);
      fos $$3 = $$2.c(fot.g, fos.a($$0, "_front_honey"));
      aku $$4 = foq.q.a($$0, "_empty", $$2, this.d);
      aku $$5 = foq.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.i(), fom.a(djy.c, fom.a($$4), Map.of(5, fom.a($$5))));
      this.b.accept(foe.a($$0).a(b()).a(a(djy.c, 5, $$5, $$4)));
   }

   private void a(dke $$0, dyt<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aku> $$3 = new Int2ObjectOpenHashMap();
         fof $$4 = fof.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aku $$5 = (aku)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, foq.bc, fos::g));
            return foh.a().a(foi.c, $$5);
         });
         this.b($$0.i());
         this.b.accept(foe.a($$0).a($$4));
      }
   }

   private void q() {
      aku $$0 = foo.a(dkg.oF, "_floor");
      aku $$1 = foo.a(dkg.oF, "_ceiling");
      aku $$2 = foo.a(dkg.oF, "_wall");
      aku $$3 = foo.a(dkg.oF, "_between_walls");
      this.b(cxl.xu);
      this.b
         .accept(
            foe.a(dkg.oF)
               .a(
                  fof.a(dyg.T, dyg.Y)
                     .a(jn.c, dye.a, foh.a().a(foi.c, $$0))
                     .a(jn.d, dye.a, foh.a().a(foi.c, $$0).a(foi.b, foi.a.c))
                     .a(jn.f, dye.a, foh.a().a(foi.c, $$0).a(foi.b, foi.a.b))
                     .a(jn.e, dye.a, foh.a().a(foi.c, $$0).a(foi.b, foi.a.d))
                     .a(jn.c, dye.b, foh.a().a(foi.c, $$1))
                     .a(jn.d, dye.b, foh.a().a(foi.c, $$1).a(foi.b, foi.a.c))
                     .a(jn.f, dye.b, foh.a().a(foi.c, $$1).a(foi.b, foi.a.b))
                     .a(jn.e, dye.b, foh.a().a(foi.c, $$1).a(foi.b, foi.a.d))
                     .a(jn.c, dye.c, foh.a().a(foi.c, $$2).a(foi.b, foi.a.d))
                     .a(jn.d, dye.c, foh.a().a(foi.c, $$2).a(foi.b, foi.a.b))
                     .a(jn.f, dye.c, foh.a().a(foi.c, $$2))
                     .a(jn.e, dye.c, foh.a().a(foi.c, $$2).a(foi.b, foi.a.c))
                     .a(jn.d, dye.d, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
                     .a(jn.c, dye.d, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d))
                     .a(jn.f, dye.d, foh.a().a(foi.c, $$3))
                     .a(jn.e, dye.d, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            foe.a(dkg.oB, foh.a().a(foi.c, foo.a(dkg.oB)))
               .a(
                  fof.a(dyg.X, dyg.T)
                     .a(dyb.a, jn.c, foh.a())
                     .a(dyb.a, jn.f, foh.a().a(foi.b, foi.a.b))
                     .a(dyb.a, jn.d, foh.a().a(foi.b, foi.a.c))
                     .a(dyb.a, jn.e, foh.a().a(foi.b, foi.a.d))
                     .a(dyb.b, jn.c, foh.a().a(foi.a, foi.a.b))
                     .a(dyb.b, jn.f, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.b))
                     .a(dyb.b, jn.d, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.c))
                     .a(dyb.b, jn.e, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.d))
                     .a(dyb.c, jn.d, foh.a().a(foi.a, foi.a.c))
                     .a(dyb.c, jn.e, foh.a().a(foi.a, foi.a.c).a(foi.b, foi.a.b))
                     .a(dyb.c, jn.c, foh.a().a(foi.a, foi.a.c).a(foi.b, foi.a.c))
                     .a(dyb.c, jn.f, foh.a().a(foi.a, foi.a.c).a(foi.b, foi.a.d))
               )
         );
   }

   private void d(dke $$0, fou.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      aku $$3 = fos.a($$0, "_front_on");
      aku $$4 = $$1.get($$0).a($$1x -> $$1x.a(fot.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(foe.a($$0).a(a(dyg.u, $$4, $$2)).a(b()));
   }

   private void a(dke... $$0) {
      aku $$1 = foo.a("campfire_off");

      for (dke $$2 : $$0) {
         aku $$3 = foq.bj.a($$2, fos.H($$2), this.d);
         this.b($$2.i());
         this.b.accept(foe.a($$2).a(a(dyg.u, $$3, $$1)).a(c()));
      }
   }

   private void w(dke $$0) {
      aku $$1 = foq.bE.a($$0, fos.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void x(dke $$0) {
      aku $$1;
      if ($$0 == dkg.tN) {
         $$1 = foq.bG.a($$0, fos.p($$0), this.d);
      } else {
         $$1 = foq.bF.a($$0, fos.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fos $$0 = fos.a(fos.J(dkg.cs), fos.J(dkg.n));
      aku $$1 = foq.j.a(dkg.cs, $$0, this.d);
      this.b.accept(c(dkg.cs, $$1));
   }

   private void t() {
      this.b(cxl.mg);
      this.b
         .accept(
            fod.a(dkg.cE)
               .a(
                  foc.b(
                     foc.a().a(dyg.ae, dyv.c).a(dyg.ad, dyv.c).a(dyg.af, dyv.c).a(dyg.ag, dyv.c),
                     foc.a().a(dyg.ae, dyv.b, dyv.a).a(dyg.ad, dyv.b, dyv.a),
                     foc.a().a(dyg.ad, dyv.b, dyv.a).a(dyg.af, dyv.b, dyv.a),
                     foc.a().a(dyg.af, dyv.b, dyv.a).a(dyg.ag, dyv.b, dyv.a),
                     foc.a().a(dyg.ag, dyv.b, dyv.a).a(dyg.ae, dyv.b, dyv.a)
                  ),
                  foh.a().a(foi.c, foo.a("redstone_dust_dot"))
               )
               .a(foc.a().a(dyg.ae, dyv.b, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_side0")))
               .a(foc.a().a(dyg.af, dyv.b, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_side_alt0")))
               .a(foc.a().a(dyg.ad, dyv.b, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_side_alt1")).a(foi.b, foi.a.d))
               .a(foc.a().a(dyg.ag, dyv.b, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_side1")).a(foi.b, foi.a.d))
               .a(foc.a().a(dyg.ae, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_up")))
               .a(foc.a().a(dyg.ad, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_up")).a(foi.b, foi.a.b))
               .a(foc.a().a(dyg.af, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_up")).a(foi.b, foi.a.c))
               .a(foc.a().a(dyg.ag, dyv.a), foh.a().a(foi.c, foo.a("redstone_dust_up")).a(foi.b, foi.a.d))
         );
   }

   private void u() {
      this.b(cxl.mk);
      this.b
         .accept(
            foe.a(dkg.hv)
               .a(c())
               .a(
                  fof.a(dyg.bg, dyg.A)
                     .a(dyj.a, false, foh.a().a(foi.c, foo.a(dkg.hv)))
                     .a(dyj.a, true, foh.a().a(foi.c, foo.a(dkg.hv, "_on")))
                     .a(dyj.b, false, foh.a().a(foi.c, foo.a(dkg.hv, "_subtract")))
                     .a(dyj.b, true, foh.a().a(foi.c, foo.a(dkg.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fos $$0 = fos.a(dkg.kq);
      fos $$1 = fos.a(fos.a(dkg.kd, "_side"), $$0.a(fot.f));
      aku $$2 = foq.ab.a(dkg.kd, $$1, this.d);
      aku $$3 = foq.ac.a(dkg.kd, $$1, this.d);
      aku $$4 = foq.j.b(dkg.kd, "_double", $$1, this.d);
      this.b.accept(e(dkg.kd, $$2, $$3, $$4));
      this.b.accept(c(dkg.kq, foq.c.a(dkg.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cxl.tp);
      this.b
         .accept(
            fod.a(dkg.fN)
               .a(foh.a().a(foi.c, fos.J(dkg.fN)))
               .a(foc.a().a(dyg.n, true), foh.a().a(foi.c, fos.a(dkg.fN, "_bottle0")))
               .a(foc.a().a(dyg.o, true), foh.a().a(foi.c, fos.a(dkg.fN, "_bottle1")))
               .a(foc.a().a(dyg.p, true), foh.a().a(foi.c, fos.a(dkg.fN, "_bottle2")))
               .a(foc.a().a(dyg.n, false), foh.a().a(foi.c, fos.a(dkg.fN, "_empty0")))
               .a(foc.a().a(dyg.o, false), foh.a().a(foi.c, fos.a(dkg.fN, "_empty1")))
               .a(foc.a().a(dyg.p, false), foh.a().a(foi.c, fos.a(dkg.fN, "_empty2")))
         );
   }

   private void y(dke $$0) {
      aku $$1 = foq.bA.a($$0, fos.b($$0), this.d);
      aku $$2 = foo.a("mushroom_block_inside");
      this.b
         .accept(
            fod.a($$0)
               .a(foc.a().a(dyg.N, true), foh.a().a(foi.c, $$1))
               .a(foc.a().a(dyg.O, true), foh.a().a(foi.c, $$1).a(foi.b, foi.a.b).a(foi.d, true))
               .a(foc.a().a(dyg.P, true), foh.a().a(foi.c, $$1).a(foi.b, foi.a.c).a(foi.d, true))
               .a(foc.a().a(dyg.Q, true), foh.a().a(foi.c, $$1).a(foi.b, foi.a.d).a(foi.d, true))
               .a(foc.a().a(dyg.L, true), foh.a().a(foi.c, $$1).a(foi.a, foi.a.d).a(foi.d, true))
               .a(foc.a().a(dyg.M, true), foh.a().a(foi.c, $$1).a(foi.a, foi.a.b).a(foi.d, true))
               .a(foc.a().a(dyg.N, false), foh.a().a(foi.c, $$2))
               .a(foc.a().a(dyg.O, false), foh.a().a(foi.c, $$2).a(foi.b, foi.a.b).a(foi.d, false))
               .a(foc.a().a(dyg.P, false), foh.a().a(foi.c, $$2).a(foi.b, foi.a.c).a(foi.d, false))
               .a(foc.a().a(dyg.Q, false), foh.a().a(foi.c, $$2).a(foi.b, foi.a.d).a(foi.d, false))
               .a(foc.a().a(dyg.L, false), foh.a().a(foi.c, $$2).a(foi.a, foi.a.d).a(foi.d, false))
               .a(foc.a().a(dyg.M, false), foh.a().a(foi.c, $$2).a(foi.a, foi.a.b).a(foi.d, false))
         );
      this.a($$0, fou.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cxl.sA);
      this.b
         .accept(
            foe.a(dkg.et)
               .a(
                  fof.a(dyg.aB)
                     .a(0, foh.a().a(foi.c, foo.a(dkg.et)))
                     .a(1, foh.a().a(foi.c, foo.a(dkg.et, "_slice1")))
                     .a(2, foh.a().a(foi.c, foo.a(dkg.et, "_slice2")))
                     .a(3, foh.a().a(foi.c, foo.a(dkg.et, "_slice3")))
                     .a(4, foh.a().a(foi.c, foo.a(dkg.et, "_slice4")))
                     .a(5, foh.a().a(foi.c, foo.a(dkg.et, "_slice5")))
                     .a(6, foh.a().a(foi.c, foo.a(dkg.et, "_slice6")))
               )
         );
   }

   private void y() {
      fos $$0 = new fos()
         .a(fot.c, fos.a(dkg.oz, "_side3"))
         .a(fot.o, fos.J(dkg.t))
         .a(fot.n, fos.a(dkg.oz, "_top"))
         .a(fot.j, fos.a(dkg.oz, "_side3"))
         .a(fot.l, fos.a(dkg.oz, "_side3"))
         .a(fot.k, fos.a(dkg.oz, "_side1"))
         .a(fot.m, fos.a(dkg.oz, "_side2"));
      this.b.accept(c(dkg.oz, foq.a.a(dkg.oz, $$0, this.d)));
   }

   private void z() {
      fos $$0 = new fos()
         .a(fot.c, fos.a(dkg.oD, "_front"))
         .a(fot.o, fos.a(dkg.oD, "_bottom"))
         .a(fot.n, fos.a(dkg.oD, "_top"))
         .a(fot.j, fos.a(dkg.oD, "_front"))
         .a(fot.k, fos.a(dkg.oD, "_front"))
         .a(fot.l, fos.a(dkg.oD, "_side"))
         .a(fot.m, fos.a(dkg.oD, "_side"));
      this.b.accept(c(dkg.oD, foq.a.a(dkg.oD, $$0, this.d)));
   }

   private void a(dke $$0, dke $$1, BiFunction<dke, dke, fos> $$2) {
      fos $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, foq.a.a($$0, $$3, this.d)));
   }

   public void b(dke $$0) {
      fos $$1 = new fos()
         .a(fot.c, fos.a($$0, "_particle"))
         .a(fot.o, fos.a($$0, "_down"))
         .a(fot.n, fos.a($$0, "_up"))
         .a(fot.j, fos.a($$0, "_north"))
         .a(fot.k, fos.a($$0, "_south"))
         .a(fot.l, fos.a($$0, "_east"))
         .a(fot.m, fos.a($$0, "_west"));
      this.b.accept(c($$0, foq.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fos $$0 = fos.n(dkg.fn);
      this.b.accept(c(dkg.fn, foo.a(dkg.fn)));
      this.a(dkg.er, $$0);
      this.a(dkg.es, $$0);
   }

   private void a(dke $$0, fos $$1) {
      aku $$2 = foq.p.a($$0, $$1.c(fot.g, fos.J($$0)), this.d);
      this.b.accept(foe.a($$0, foh.a().a(foi.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cxl.tq);
      this.n(dkg.fO);
      this.b.accept(c(dkg.fQ, foq.bD.a(dkg.fQ, fos.j(fos.a(dkg.K, "_still")), this.d)));
      this.b
         .accept(
            foe.a(dkg.fP)
               .a(
                  fof.a(doq.f)
                     .a(1, foh.a().a(foi.c, foq.bB.a(dkg.fP, "_level1", fos.j(fos.a(dkg.J, "_still")), this.d)))
                     .a(2, foh.a().a(foi.c, foq.bC.a(dkg.fP, "_level2", fos.j(fos.a(dkg.J, "_still")), this.d)))
                     .a(3, foh.a().a(foi.c, foq.bD.a(dkg.fP, "_full", fos.j(fos.a(dkg.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            foe.a(dkg.fR)
               .a(
                  fof.a(doq.f)
                     .a(1, foh.a().a(foi.c, foq.bB.a(dkg.fR, "_level1", fos.j(fos.J(dkg.rr)), this.d)))
                     .a(2, foh.a().a(foi.c, foq.bC.a(dkg.fR, "_level2", fos.j(fos.J(dkg.rr)), this.d)))
                     .a(3, foh.a().a(foi.c, foq.bD.a(dkg.fR, "_full", fos.j(fos.J(dkg.rr)), this.d)))
               )
         );
   }

   private void C() {
      fos $$0 = fos.b(dkg.kX);
      aku $$1 = foq.aL.a(dkg.kX, $$0, this.d);
      aku $$2 = this.a(dkg.kX, "_dead", foq.aL, $$1x -> $$0.c(fot.b, $$1x));
      this.b.accept(foe.a(dkg.kX).a(a(dyg.ax, 5, $$2, $$1)));
   }

   private void D() {
      aku $$0 = foo.a(dkg.tU);
      aku $$1 = foo.a(dkg.tU, "_triggered");
      aku $$2 = foo.a(dkg.tU, "_crafting");
      aku $$3 = foo.a(dkg.tU, "_crafting_triggered");
      this.b
         .accept(
            foe.a(dkg.tU)
               .a(fof.a(dyg.W).a($$0x -> this.a($$0x, foh.a())))
               .a(
                  fof.a(dyg.G, dlx.b)
                     .a(false, false, foh.a().a(foi.c, $$0))
                     .a(true, true, foh.a().a(foi.c, $$3))
                     .a(true, false, foh.a().a(foi.c, $$1))
                     .a(false, true, foh.a().a(foi.c, $$2))
               )
         );
   }

   private void z(dke $$0) {
      fos $$1 = new fos().a(fot.f, fos.a(dkg.cL, "_top")).a(fot.i, fos.a(dkg.cL, "_side")).a(fot.g, fos.a($$0, "_front"));
      fos $$2 = new fos().a(fot.i, fos.a(dkg.cL, "_top")).a(fot.g, fos.a($$0, "_front_vertical"));
      aku $$3 = foq.p.a($$0, $$1, this.d);
      aku $$4 = foq.r.a($$0, $$2, this.d);
      this.b
         .accept(
            foe.a($$0)
               .a(
                  fof.a(dyg.R)
                     .a(jn.a, foh.a().a(foi.c, $$4).a(foi.a, foi.a.c))
                     .a(jn.b, foh.a().a(foi.c, $$4))
                     .a(jn.c, foh.a().a(foi.c, $$3))
                     .a(jn.f, foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
                     .a(jn.d, foh.a().a(foi.c, $$3).a(foi.b, foi.a.c))
                     .a(jn.e, foh.a().a(foi.c, $$3).a(foi.b, foi.a.d))
               )
         );
   }

   private void E() {
      aku $$0 = foo.a(dkg.fT);
      aku $$1 = foo.a(dkg.fT, "_filled");
      this.b.accept(foe.a(dkg.fT).a(fof.a(dyg.k).a(false, foh.a().a(foi.c, $$0)).a(true, foh.a().a(foi.c, $$1))).a(c()));
   }

   private void F() {
      aku $$0 = foo.a(dkg.kW, "_side");
      aku $$1 = foo.a(dkg.kW, "_noside");
      aku $$2 = foo.a(dkg.kW, "_noside1");
      aku $$3 = foo.a(dkg.kW, "_noside2");
      aku $$4 = foo.a(dkg.kW, "_noside3");
      this.b
         .accept(
            fod.a(dkg.kW)
               .a(foc.a().a(dyg.N, true), foh.a().a(foi.c, $$0))
               .a(foc.a().a(dyg.O, true), foh.a().a(foi.c, $$0).a(foi.b, foi.a.b).a(foi.d, true))
               .a(foc.a().a(dyg.P, true), foh.a().a(foi.c, $$0).a(foi.b, foi.a.c).a(foi.d, true))
               .a(foc.a().a(dyg.Q, true), foh.a().a(foi.c, $$0).a(foi.b, foi.a.d).a(foi.d, true))
               .a(foc.a().a(dyg.L, true), foh.a().a(foi.c, $$0).a(foi.a, foi.a.d).a(foi.d, true))
               .a(foc.a().a(dyg.M, true), foh.a().a(foi.c, $$0).a(foi.a, foi.a.b).a(foi.d, true))
               .a(foc.a().a(dyg.N, false), foh.a().a(foi.c, $$1).a(foi.e, 2), foh.a().a(foi.c, $$2), foh.a().a(foi.c, $$3), foh.a().a(foi.c, $$4))
               .a(
                  foc.a().a(dyg.O, false),
                  foh.a().a(foi.c, $$2).a(foi.b, foi.a.b).a(foi.d, true),
                  foh.a().a(foi.c, $$3).a(foi.b, foi.a.b).a(foi.d, true),
                  foh.a().a(foi.c, $$4).a(foi.b, foi.a.b).a(foi.d, true),
                  foh.a().a(foi.c, $$1).a(foi.e, 2).a(foi.b, foi.a.b).a(foi.d, true)
               )
               .a(
                  foc.a().a(dyg.P, false),
                  foh.a().a(foi.c, $$3).a(foi.b, foi.a.c).a(foi.d, true),
                  foh.a().a(foi.c, $$4).a(foi.b, foi.a.c).a(foi.d, true),
                  foh.a().a(foi.c, $$1).a(foi.e, 2).a(foi.b, foi.a.c).a(foi.d, true),
                  foh.a().a(foi.c, $$2).a(foi.b, foi.a.c).a(foi.d, true)
               )
               .a(
                  foc.a().a(dyg.Q, false),
                  foh.a().a(foi.c, $$4).a(foi.b, foi.a.d).a(foi.d, true),
                  foh.a().a(foi.c, $$1).a(foi.e, 2).a(foi.b, foi.a.d).a(foi.d, true),
                  foh.a().a(foi.c, $$2).a(foi.b, foi.a.d).a(foi.d, true),
                  foh.a().a(foi.c, $$3).a(foi.b, foi.a.d).a(foi.d, true)
               )
               .a(
                  foc.a().a(dyg.L, false),
                  foh.a().a(foi.c, $$1).a(foi.e, 2).a(foi.a, foi.a.d).a(foi.d, true),
                  foh.a().a(foi.c, $$4).a(foi.a, foi.a.d).a(foi.d, true),
                  foh.a().a(foi.c, $$2).a(foi.a, foi.a.d).a(foi.d, true),
                  foh.a().a(foi.c, $$3).a(foi.a, foi.a.d).a(foi.d, true)
               )
               .a(
                  foc.a().a(dyg.M, false),
                  foh.a().a(foi.c, $$4).a(foi.a, foi.a.b).a(foi.d, true),
                  foh.a().a(foi.c, $$3).a(foi.a, foi.a.b).a(foi.d, true),
                  foh.a().a(foi.c, $$2).a(foi.a, foi.a.b).a(foi.d, true),
                  foh.a().a(foi.c, $$1).a(foi.e, 2).a(foi.a, foi.a.b).a(foi.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fod.a(dkg.pE)
               .a(foh.a().a(foi.c, fos.J(dkg.pE)))
               .a(foc.a().a(dyg.aO, 1), foh.a().a(foi.c, fos.a(dkg.pE, "_contents1")))
               .a(foc.a().a(dyg.aO, 2), foh.a().a(foi.c, fos.a(dkg.pE, "_contents2")))
               .a(foc.a().a(dyg.aO, 3), foh.a().a(foi.c, fos.a(dkg.pE, "_contents3")))
               .a(foc.a().a(dyg.aO, 4), foh.a().a(foi.c, fos.a(dkg.pE, "_contents4")))
               .a(foc.a().a(dyg.aO, 5), foh.a().a(foi.c, fos.a(dkg.pE, "_contents5")))
               .a(foc.a().a(dyg.aO, 6), foh.a().a(foi.c, fos.a(dkg.pE, "_contents6")))
               .a(foc.a().a(dyg.aO, 7), foh.a().a(foi.c, fos.a(dkg.pE, "_contents7")))
               .a(foc.a().a(dyg.aO, 8), foh.a().a(foi.c, fos.a(dkg.pE, "_contents_ready")))
         );
   }

   private void A(dke $$0) {
      aku $$1 = foq.c.a($$0, fos.a($$0), this.d);
      aku $$2 = this.a($$0, "_powered", foq.c, fos::b);
      aku $$3 = this.a($$0, "_lit", foq.c, fos::b);
      aku $$4 = this.a($$0, "_lit_powered", foq.c, fos::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fob a(dke $$0, aku $$1, aku $$2, aku $$3, aku $$4) {
      return foe.a($$0).a(fof.a(dyg.u, dyg.A).a(($$4x, $$5) -> $$4x ? foh.a().a(foi.c, $$5 ? $$4 : $$2) : foh.a().a(foi.c, $$5 ? $$3 : $$1)));
   }

   private void j(dke $$0, dke $$1) {
      aku $$2 = foo.a($$0);
      aku $$3 = foo.a($$0, "_powered");
      aku $$4 = foo.a($$0, "_lit");
      aku $$5 = foo.a($$0, "_lit_powered");
      this.c.a($$0.i(), $$1.i());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dke $$0) {
      this.b.accept(foe.a($$0, foh.a().a(foi.c, foq.ao.a($$0, fos.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.B(dkg.ra);
      this.B(dkg.qZ);
      this.B(dkg.qY);
      this.B(dkg.qX);
   }

   private void I() {
      fof.b<jn, dyn> $$0 = fof.a(dyg.bp, dyg.bq);

      for (dyn $$1 : dyn.values()) {
         $$0.a(jn.b, $$1, this.a(jn.b, $$1));
      }

      for (dyn $$2 : dyn.values()) {
         $$0.a(jn.a, $$2, this.a(jn.a, $$2));
      }

      this.b.accept(foe.a(dkg.sV).a($$0));
   }

   private foh a(jn $$0, dyn $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fos $$3 = fos.c(fos.a(dkg.sV, $$2));
      return foh.a().a(foi.c, foq.an.a(dkg.sV, $$2, $$3, this.d));
   }

   private void C(dke $$0) {
      fos $$1 = new fos().a(fot.e, fos.J(dkg.ei)).a(fot.f, fos.J($$0)).a(fot.i, fos.a($$0, "_side"));
      this.b.accept(c($$0, foq.n.a($$0, $$1, this.d)));
   }

   private void J() {
      aku $$0 = fos.a(dkg.hw, "_side");
      fos $$1 = new fos().a(fot.f, fos.a(dkg.hw, "_top")).a(fot.i, $$0);
      fos $$2 = new fos().a(fot.f, fos.a(dkg.hw, "_inverted_top")).a(fot.i, $$0);
      this.b
         .accept(
            foe.a(dkg.hw)
               .a(
                  fof.a(dyg.s)
                     .a(false, foh.a().a(foi.c, foq.aM.a(dkg.hw, $$1, this.d)))
                     .a(true, foh.a().a(foi.c, foq.aM.a(foo.a(dkg.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void D(dke $$0) {
      this.b.accept(foe.a($$0, foh.a().a(foi.c, foo.a($$0))).a(this.o()));
   }

   private void K() {
      dke $$0 = dkg.sU;
      aku $$1 = foo.a($$0, "_on");
      aku $$2 = foo.a($$0);
      this.b.accept(foe.a($$0, foh.a().a(foi.c, foo.a($$0))).a(this.o()).a(a(dyg.A, $$1, $$2)));
   }

   private void L() {
      fos $$0 = new fos().a(fot.C, fos.J(dkg.j)).a(fot.f, fos.J(dkg.cK));
      fos $$1 = new fos().a(fot.C, fos.J(dkg.j)).a(fot.f, fos.a(dkg.cK, "_moist"));
      aku $$2 = foq.bd.a(dkg.cK, $$0, this.d);
      aku $$3 = foq.bd.a(fos.a(dkg.cK, "_moist"), $$1, this.d);
      this.b.accept(foe.a(dkg.cK).a(a(dyg.aT, 7, $$3, $$2)));
   }

   private List<aku> E(dke $$0) {
      aku $$1 = foq.be.a(foo.a($$0, "_floor0"), fos.y($$0), this.d);
      aku $$2 = foq.be.a(foo.a($$0, "_floor1"), fos.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<aku> F(dke $$0) {
      aku $$1 = foq.bf.a(foo.a($$0, "_side0"), fos.y($$0), this.d);
      aku $$2 = foq.bf.a(foo.a($$0, "_side1"), fos.z($$0), this.d);
      aku $$3 = foq.bg.a(foo.a($$0, "_side_alt0"), fos.y($$0), this.d);
      aku $$4 = foq.bg.a(foo.a($$0, "_side_alt1"), fos.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aku> G(dke $$0) {
      aku $$1 = foq.bh.a(foo.a($$0, "_up0"), fos.y($$0), this.d);
      aku $$2 = foq.bh.a(foo.a($$0, "_up1"), fos.z($$0), this.d);
      aku $$3 = foq.bi.a(foo.a($$0, "_up_alt0"), fos.y($$0), this.d);
      aku $$4 = foq.bi.a(foo.a($$0, "_up_alt1"), fos.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<foh> a(List<aku> $$0, UnaryOperator<foh> $$1) {
      return $$0.stream().map($$0x -> foh.a().a(foi.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      foc $$0 = foc.a().a(dyg.N, false).a(dyg.O, false).a(dyg.P, false).a(dyg.Q, false).a(dyg.L, false);
      List<aku> $$1 = this.E(dkg.cy);
      List<aku> $$2 = this.F(dkg.cy);
      List<aku> $$3 = this.G(dkg.cy);
      this.b
         .accept(
            fod.a(dkg.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(foc.b(foc.a().a(dyg.N, true), $$0), a($$2, $$0x -> $$0x))
               .a(foc.b(foc.a().a(dyg.O, true), $$0), a($$2, $$0x -> $$0x.a(foi.b, foi.a.b)))
               .a(foc.b(foc.a().a(dyg.P, true), $$0), a($$2, $$0x -> $$0x.a(foi.b, foi.a.c)))
               .a(foc.b(foc.a().a(dyg.Q, true), $$0), a($$2, $$0x -> $$0x.a(foi.b, foi.a.d)))
               .a(foc.a().a(dyg.L, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<aku> $$0 = this.E(dkg.cz);
      List<aku> $$1 = this.F(dkg.cz);
      this.b
         .accept(
            fod.a(dkg.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(foi.b, foi.a.b)))
               .a(a($$1, $$0x -> $$0x.a(foi.b, foi.a.c)))
               .a(a($$1, $$0x -> $$0x.a(foi.b, foi.a.d)))
         );
   }

   private void H(dke $$0) {
      aku $$1 = fou.x.create($$0, this.d);
      aku $$2 = fou.y.create($$0, this.d);
      this.b($$0.i());
      this.b.accept(foe.a($$0).a(a(dyg.m, $$2, $$1)));
   }

   private void O() {
      fos $$0 = fos.a(fos.a(dkg.ah, "_side"), fos.a(dkg.ah, "_top"));
      aku $$1 = foq.j.a(dkg.ah, $$0, this.d);
      this.b.accept(d(dkg.ah, $$1));
   }

   private void P() {
      this.b(cxl.af);
      dke $$0 = dkg.H;
      fof.b<Boolean, Integer> $$1 = fof.a(dpd.d, dpd.b);
      aku $$2 = foo.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aku $$4 = foo.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, foh.a().a(foi.c, $$4));
         $$1.a(false, $$3, foh.a().a(foi.c, $$2));
      }

      this.b.accept(foe.a(dkg.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            foe.a(dkg.lk)
               .a(
                  fof.a(dyg.av)
                     .a(0, foh.a().a(foi.c, this.a(dkg.lk, "_0", foq.c, fos::b)))
                     .a(1, foh.a().a(foi.c, this.a(dkg.lk, "_1", foq.c, fos::b)))
                     .a(2, foh.a().a(foi.c, this.a(dkg.lk, "_2", foq.c, fos::b)))
                     .a(3, foh.a().a(foi.c, this.a(dkg.lk, "_3", foq.c, fos::b)))
               )
         );
   }

   private void R() {
      aku $$0 = fos.J(dkg.j);
      fos $$1 = new fos().a(fot.e, $$0).b(fot.e, fot.c).a(fot.f, fos.a(dkg.i, "_top")).a(fot.i, fos.a(dkg.i, "_snow"));
      foh $$2 = foh.a().a(foi.c, foq.n.a(dkg.i, "_snow", $$1, this.d));
      this.a(dkg.i, foo.a(dkg.i), $$2);
      this.a(dkg.i, foo.a(dkg.i), new fnp());
      aku $$3 = fou.f.get(dkg.fA).a($$1x -> $$1x.a(fot.e, $$0)).a(dkg.fA, this.d);
      this.a(dkg.fA, $$3, $$2);
      aku $$4 = fou.f.get(dkg.l).a($$1x -> $$1x.a(fot.e, $$0)).a(dkg.l, this.d);
      this.a(dkg.l, $$4, $$2);
   }

   private void a(dke $$0, aku $$1, foh $$2) {
      List<foh> $$3 = Arrays.asList(a($$1));
      this.b.accept(foe.a($$0).a(fof.a(dyg.E).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cxl.sg);
      this.b
         .accept(
            foe.a(dkg.fX)
               .a(
                  fof.a(dyg.au)
                     .a(0, foh.a().a(foi.c, foo.a(dkg.fX, "_stage0")))
                     .a(1, foh.a().a(foi.c, foo.a(dkg.fX, "_stage1")))
                     .a(2, foh.a().a(foi.c, foo.a(dkg.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(dkg.lg, foo.a(dkg.lg)));
   }

   private void k(dke $$0, dke $$1) {
      fos $$2 = fos.b($$1);
      aku $$3 = foq.Y.a($$0, $$2, this.d);
      aku $$4 = foq.Z.a($$0, $$2, this.d);
      this.b.accept(foe.a($$0).a(a(dyg.aW, 1, $$4, $$3)));
   }

   private void U() {
      aku $$0 = foo.a(dkg.hz);
      aku $$1 = foo.a(dkg.hz, "_side");
      this.b(cxl.mq);
      this.b
         .accept(
            foe.a(dkg.hz)
               .a(
                  fof.a(dyg.S)
                     .a(jn.a, foh.a().a(foi.c, $$0))
                     .a(jn.c, foh.a().a(foi.c, $$1))
                     .a(jn.f, foh.a().a(foi.c, $$1).a(foi.b, foi.a.b))
                     .a(jn.d, foh.a().a(foi.c, $$1).a(foi.b, foi.a.c))
                     .a(jn.e, foh.a().a(foi.c, $$1).a(foi.b, foi.a.d))
               )
         );
   }

   private void l(dke $$0, dke $$1) {
      aku $$2 = foo.a($$0);
      this.b.accept(foe.a($$1, foh.a().a(foi.c, $$2)));
      this.c.a($$0.i(), $$1.i());
   }

   private void V() {
      aku $$0 = foo.a(dkg.fk, "_post_ends");
      aku $$1 = foo.a(dkg.fk, "_post");
      aku $$2 = foo.a(dkg.fk, "_cap");
      aku $$3 = foo.a(dkg.fk, "_cap_alt");
      aku $$4 = foo.a(dkg.fk, "_side");
      aku $$5 = foo.a(dkg.fk, "_side_alt");
      this.b
         .accept(
            fod.a(dkg.fk)
               .a(foh.a().a(foi.c, $$0))
               .a(foc.a().a(dyg.N, false).a(dyg.O, false).a(dyg.P, false).a(dyg.Q, false), foh.a().a(foi.c, $$1))
               .a(foc.a().a(dyg.N, true).a(dyg.O, false).a(dyg.P, false).a(dyg.Q, false), foh.a().a(foi.c, $$2))
               .a(foc.a().a(dyg.N, false).a(dyg.O, true).a(dyg.P, false).a(dyg.Q, false), foh.a().a(foi.c, $$2).a(foi.b, foi.a.b))
               .a(foc.a().a(dyg.N, false).a(dyg.O, false).a(dyg.P, true).a(dyg.Q, false), foh.a().a(foi.c, $$3))
               .a(foc.a().a(dyg.N, false).a(dyg.O, false).a(dyg.P, false).a(dyg.Q, true), foh.a().a(foi.c, $$3).a(foi.b, foi.a.b))
               .a(foc.a().a(dyg.N, true), foh.a().a(foi.c, $$4))
               .a(foc.a().a(dyg.O, true), foh.a().a(foi.c, $$4).a(foi.b, foi.a.b))
               .a(foc.a().a(dyg.P, true), foh.a().a(foi.c, $$5))
               .a(foc.a().a(dyg.Q, true), foh.a().a(foi.c, $$5).a(foi.b, foi.a.b))
         );
      this.c(dkg.fk);
   }

   private void I(dke $$0) {
      this.b.accept(foe.a($$0, foh.a().a(foi.c, foo.a($$0))).a(b()));
   }

   private void W() {
      aku $$0 = foo.a(dkg.dI);
      aku $$1 = foo.a(dkg.dI, "_on");
      this.c(dkg.dI);
      this.b
         .accept(
            foe.a(dkg.dI)
               .a(a(dyg.A, $$0, $$1))
               .a(
                  fof.a(dyg.X, dyg.T)
                     .a(dyb.c, jn.c, foh.a().a(foi.a, foi.a.c).a(foi.b, foi.a.c))
                     .a(dyb.c, jn.f, foh.a().a(foi.a, foi.a.c).a(foi.b, foi.a.d))
                     .a(dyb.c, jn.d, foh.a().a(foi.a, foi.a.c))
                     .a(dyb.c, jn.e, foh.a().a(foi.a, foi.a.c).a(foi.b, foi.a.b))
                     .a(dyb.a, jn.c, foh.a())
                     .a(dyb.a, jn.f, foh.a().a(foi.b, foi.a.b))
                     .a(dyb.a, jn.d, foh.a().a(foi.b, foi.a.c))
                     .a(dyb.a, jn.e, foh.a().a(foi.b, foi.a.d))
                     .a(dyb.b, jn.c, foh.a().a(foi.a, foi.a.b))
                     .a(dyb.b, jn.f, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.b))
                     .a(dyb.b, jn.d, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.c))
                     .a(dyb.b, jn.e, foh.a().a(foi.a, foi.a.b).a(foi.b, foi.a.d))
               )
         );
   }

   private void X() {
      aku $$0 = this.a(cxl.gz, dkg.fB);
      this.a(dkg.fB, $$0, fom.a(-9321636));
      this.b.accept(b(dkg.fB, foo.a(dkg.fB)));
   }

   private void Y() {
      this.c(dkg.tR);
      this.b.accept(c(dkg.tR, foo.a(dkg.tR)));
   }

   private void Z() {
      this.b.accept(foe.a(dkg.eq).a(fof.a(dyg.J).a(jn.a.a, foh.a().a(foi.c, foo.a(dkg.eq, "_ns"))).a(jn.a.c, foh.a().a(foi.c, foo.a(dkg.eq, "_ew")))));
   }

   private void aa() {
      aku $$0 = fou.a.create(dkg.ei, this.d);
      this.b
         .accept(
            foe.a(
               dkg.ei,
               foh.a().a(foi.c, $$0),
               foh.a().a(foi.c, $$0).a(foi.a, foi.a.b),
               foh.a().a(foi.c, $$0).a(foi.a, foi.a.c),
               foh.a().a(foi.c, $$0).a(foi.a, foi.a.d),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.b),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.b).a(foi.a, foi.a.b),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.b).a(foi.a, foi.a.c),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.b).a(foi.a, foi.a.d),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.c),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.c).a(foi.a, foi.a.b),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.c).a(foi.a, foi.a.c),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.c).a(foi.a, foi.a.d),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.d),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.d).a(foi.a, foi.a.b),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.d).a(foi.a, foi.a.c),
               foh.a().a(foi.c, $$0).a(foi.b, foi.a.d).a(foi.a, foi.a.d)
            )
         );
   }

   private void ab() {
      aku $$0 = foo.a(dkg.lq);
      aku $$1 = foo.a(dkg.lq, "_on");
      this.b.accept(foe.a(dkg.lq).a(a(dyg.A, $$1, $$0)).a(e()));
   }

   private void ac() {
      fos $$0 = new fos().a(fot.e, fos.a(dkg.bF, "_bottom")).a(fot.i, fos.a(dkg.bF, "_side"));
      aku $$1 = fos.a(dkg.bF, "_top_sticky");
      aku $$2 = fos.a(dkg.bF, "_top");
      fos $$3 = $$0.c(fot.F, $$1);
      fos $$4 = $$0.c(fot.F, $$2);
      aku $$5 = foo.a(dkg.bF, "_base");
      this.a(dkg.bF, $$5, $$4);
      this.a(dkg.by, $$5, $$3);
      aku $$6 = foq.n.a(dkg.bF, "_inventory", $$0.c(fot.f, $$2), this.d);
      aku $$7 = foq.n.a(dkg.by, "_inventory", $$0.c(fot.f, $$1), this.d);
      this.a(dkg.bF, $$6);
      this.a(dkg.by, $$7);
   }

   private void a(dke $$0, aku $$1, fos $$2) {
      aku $$3 = foq.bs.a($$0, $$2, this.d);
      this.b.accept(foe.a($$0).a(a(dyg.j, $$1, $$3)).a(e()));
   }

   private void ad() {
      fos $$0 = new fos().a(fot.G, fos.a(dkg.bF, "_top")).a(fot.i, fos.a(dkg.bF, "_side"));
      fos $$1 = $$0.c(fot.F, fos.a(dkg.bF, "_top_sticky"));
      fos $$2 = $$0.c(fot.F, fos.a(dkg.bF, "_top"));
      this.b
         .accept(
            foe.a(dkg.bG)
               .a(
                  fof.a(dyg.B, dyg.bj)
                     .a(false, dys.a, foh.a().a(foi.c, foq.bt.a(dkg.bF, "_head", $$2, this.d)))
                     .a(false, dys.b, foh.a().a(foi.c, foq.bt.a(dkg.bF, "_head_sticky", $$1, this.d)))
                     .a(true, dys.a, foh.a().a(foi.c, foq.bu.a(dkg.bF, "_head_short", $$2, this.d)))
                     .a(true, dys.b, foh.a().a(foi.c, foq.bu.a(dkg.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      dke $$0 = dkg.tV;
      fos $$1 = fos.a($$0, "_side_inactive", "_top_inactive");
      fos $$2 = fos.a($$0, "_side_active", "_top_active");
      fos $$3 = fos.a($$0, "_side_active", "_top_ejecting_reward");
      fos $$4 = fos.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fos $$5 = fos.a($$0, "_side_active_ominous", "_top_active_ominous");
      fos $$6 = fos.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      aku $$7 = foq.o.a($$0, $$1, this.d);
      aku $$8 = foq.o.a($$0, "_active", $$2, this.d);
      aku $$9 = foq.o.a($$0, "_ejecting_reward", $$3, this.d);
      aku $$10 = foq.o.a($$0, "_inactive_ominous", $$4, this.d);
      aku $$11 = foq.o.a($$0, "_active_ominous", $$5, this.d);
      aku $$12 = foq.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(foe.a($$0).a(fof.a(dyg.bB, dyg.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> foh.a().a(foi.c, $$7x ? $$10 : $$7);
            case b, c, d -> foh.a().a(foi.c, $$7x ? $$11 : $$8);
            case e -> foh.a().a(foi.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      dke $$0 = dkg.tW;
      fos $$1 = fos.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fos $$2 = fos.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fos $$3 = fos.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fos $$4 = fos.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      aku $$5 = foq.cb.a($$0, $$1, this.d);
      aku $$6 = foq.cb.a($$0, "_active", $$2, this.d);
      aku $$7 = foq.cb.a($$0, "_unlocking", $$3, this.d);
      aku $$8 = foq.cb.a($$0, "_ejecting_reward", $$4, this.d);
      fos $$9 = fos.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fos $$10 = fos.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fos $$11 = fos.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fos $$12 = fos.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      aku $$13 = foq.cb.a($$0, "_ominous", $$9, this.d);
      aku $$14 = foq.cb.a($$0, "_active_ominous", $$10, this.d);
      aku $$15 = foq.cb.a($$0, "_unlocking_ominous", $$11, this.d);
      aku $$16 = foq.cb.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(foe.a($$0).a(b()).a(fof.a(dtf.b, dtf.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> foh.a().a(foi.c, $$9x ? $$13 : $$5);
            case b -> foh.a().a(foi.c, $$9x ? $$14 : $$6);
            case c -> foh.a().a(foi.c, $$9x ? $$15 : $$7);
            case d -> foh.a().a(foi.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      aku $$0 = foo.a(dkg.rs, "_inactive");
      aku $$1 = foo.a(dkg.rs, "_active");
      this.a(dkg.rs, $$0);
      this.b.accept(foe.a(dkg.rs).a(fof.a(dyg.br).a($$2 -> foh.a().a(foi.c, $$2 != dyx.b && $$2 != dyx.c ? $$0 : $$1))));
   }

   private void ah() {
      aku $$0 = foo.a(dkg.rt, "_inactive");
      aku $$1 = foo.a(dkg.rt, "_active");
      this.a(dkg.rt, $$0);
      this.b.accept(foe.a(dkg.rt).a(fof.a(dyg.br).a($$2 -> foh.a().a(foi.c, $$2 != dyx.b && $$2 != dyx.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      aku $$0 = foq.ca.a(dkg.rx, fos.a(false), this.d);
      aku $$1 = foq.ca.a(dkg.rx, "_can_summon", fos.a(true), this.d);
      this.a(dkg.rx, $$0);
      this.b.accept(foe.a(dkg.rx).a(a(dyg.e, $$1, $$0)));
   }

   private void aj() {
      aku $$0 = foo.a(dkg.ou, "_stable");
      aku $$1 = foo.a(dkg.ou, "_unstable");
      this.a(dkg.ou, $$0);
      this.b.accept(foe.a(dkg.ou).a(a(dyg.d, $$1, $$0)));
   }

   private void ak() {
      aku $$0 = this.a(dkg.sX, "", foq.ao, fos::c);
      aku $$1 = this.a(dkg.sX, "_lit", foq.ao, fos::c);
      this.b.accept(foe.a(dkg.sX).a(a(dyg.b, $$1, $$0)));
      aku $$2 = this.a(dkg.sY, "", foq.ao, fos::c);
      aku $$3 = this.a(dkg.sY, "_lit", foq.ao, fos::c);
      this.b.accept(foe.a(dkg.sY).a(a(dyg.b, $$3, $$2)));
   }

   private void al() {
      aku $$0 = fou.a.create(dkg.fW, this.d);
      aku $$1 = this.a(dkg.fW, "_on", foq.c, fos::b);
      this.b.accept(foe.a(dkg.fW).a(a(dyg.u, $$1, $$0)));
   }

   private void m(dke $$0, dke $$1) {
      fos $$2 = fos.B($$0);
      this.b.accept(c($$0, foq.bm.a($$0, $$2, this.d)));
      this.b.accept(foe.a($$1, foh.a().a(foi.c, foq.bo.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fos $$0 = fos.B(dkg.dX);
      fos $$1 = fos.i(fos.a(dkg.dX, "_off"));
      aku $$2 = foq.bq.a(dkg.dX, $$0, this.d);
      aku $$3 = foq.bn.a(dkg.dX, "_off", $$1, this.d);
      this.b.accept(foe.a(dkg.dX).a(a(dyg.u, $$2, $$3)));
      aku $$4 = foq.br.a(dkg.dY, $$0, this.d);
      aku $$5 = foq.bp.a(dkg.dY, "_off", $$1, this.d);
      this.b.accept(foe.a(dkg.dY).a(a(dyg.u, $$4, $$5)).a(d()));
      this.c(dkg.dX);
   }

   private void an() {
      this.b(cxl.mj);
      this.b.accept(foe.a(dkg.eu).a(fof.a(dyg.aD, dyg.v, dyg.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return foh.a().a(foi.c, fos.a(dkg.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cxl.da);
      this.b
         .accept(
            foe.a(dkg.nx)
               .a(
                  fof.a(dyg.aV, dyg.I)
                     .a(1, false, Arrays.asList(a(foo.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(foo.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(foo.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(foo.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(foo.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(foo.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(foo.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(foo.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fos $$0 = fos.a(dkg.ea);
      aku $$1 = foq.c.a(dkg.ec, $$0, this.d);
      this.b.accept(foe.a(dkg.ea).a(fof.a(dyg.aI).a($$1x -> foh.a().a(foi.c, $$1x < 8 ? foo.a(dkg.ea, "_height" + $$1x * 2) : $$1))));
      this.a(dkg.ea, foo.a(dkg.ea, "_height2"));
      this.b.accept(c(dkg.ec, $$1));
   }

   private void aq() {
      this.b.accept(foe.a(dkg.oE, foh.a().a(foi.c, foo.a(dkg.oE))).a(b()));
   }

   private void ar() {
      aku $$0 = fou.a.create(dkg.pC, this.d);
      this.a(dkg.pC, $$0);
      this.b.accept(foe.a(dkg.pC).a(fof.a(dyg.bm).a($$0x -> foh.a().a(foi.c, this.a(dkg.pC, "_" + $$0x.c(), foq.c, fos::b)))));
   }

   private void as() {
      this.b(cxl.xx);
      this.b.accept(foe.a(dkg.oK).a(fof.a(dyg.av).a($$0 -> foh.a().a(foi.c, this.a(dkg.oK, "_stage" + $$0, foq.ao, fos::c)))));
   }

   private void at() {
      this.b(cxl.pZ);
      this.b
         .accept(
            foe.a(dkg.gd)
               .a(
                  fof.a(dyg.a, dyg.O, dyg.N, dyg.P, dyg.Q)
                     .a(false, false, false, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_ns")))
                     .a(false, true, false, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_n")).a(foi.b, foi.a.b))
                     .a(false, false, true, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_n")))
                     .a(false, false, false, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_n")).a(foi.b, foi.a.c))
                     .a(false, false, false, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_n")).a(foi.b, foi.a.d))
                     .a(false, true, true, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_ne")))
                     .a(false, true, false, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_ne")).a(foi.b, foi.a.b))
                     .a(false, false, false, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_ne")).a(foi.b, foi.a.c))
                     .a(false, false, true, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_ne")).a(foi.b, foi.a.d))
                     .a(false, false, true, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_ns")))
                     .a(false, true, false, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_ns")).a(foi.b, foi.a.b))
                     .a(false, true, true, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_nse")))
                     .a(false, true, false, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_nse")).a(foi.b, foi.a.b))
                     .a(false, false, true, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_nse")).a(foi.b, foi.a.c))
                     .a(false, true, true, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_nse")).a(foi.b, foi.a.d))
                     .a(false, true, true, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_nsew")))
                     .a(true, false, false, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_ns")))
                     .a(true, false, true, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_n")))
                     .a(true, false, false, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_n")).a(foi.b, foi.a.c))
                     .a(true, true, false, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_n")).a(foi.b, foi.a.b))
                     .a(true, false, false, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_n")).a(foi.b, foi.a.d))
                     .a(true, true, true, false, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_ne")))
                     .a(true, true, false, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_ne")).a(foi.b, foi.a.b))
                     .a(true, false, false, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_ne")).a(foi.b, foi.a.c))
                     .a(true, false, true, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_ne")).a(foi.b, foi.a.d))
                     .a(true, false, true, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_ns")))
                     .a(true, true, false, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_ns")).a(foi.b, foi.a.b))
                     .a(true, true, true, true, false, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_nse")))
                     .a(true, true, false, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_nse")).a(foi.b, foi.a.b))
                     .a(true, false, true, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_nse")).a(foi.b, foi.a.c))
                     .a(true, true, true, false, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_nse")).a(foi.b, foi.a.d))
                     .a(true, true, true, true, true, foh.a().a(foi.c, foo.a(dkg.gd, "_attached_nsew")))
               )
         );
   }

   private void au() {
      this.c(dkg.gc);
      this.b
         .accept(foe.a(dkg.gc).a(fof.a(dyg.a, dyg.A).a(($$0, $$1) -> foh.a().a(foi.c, fos.a(dkg.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aku a(int $$0, String $$1, fos $$2) {
      switch ($$0) {
         case 1:
            return foq.bw.a(foo.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return foq.bx.a(foo.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return foq.by.a(foo.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return foq.bz.a(foo.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aku a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fos.b(fos.J(dkg.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fos.b(fos.a(dkg.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fos.b(fos.a(dkg.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void av() {
      this.b(cxl.kO);
      this.b.accept(foe.a(dkg.mH).a(fof.a(dyg.aG, dyg.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void aw() {
      this.b(cxl.kP);
      Function<Integer, aku> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fos $$2 = fos.a($$1);
         return foq.bH.a(dkg.mI, $$1, $$2, this.d);
      };
      this.b.accept(foe.a(dkg.mI).a(fof.a(drs.c).a($$1 -> foh.a().a(foi.c, $$0.apply($$1)))));
   }

   private void J(dke $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dke $$0, cxd $$1) {
      this.b($$1);
      this.K($$0);
   }

   private void K(dke $$0) {
      aku $$1 = foo.a($$0);
      fod $$2 = fod.a($$0);
      foc.c $$3 = af.a(foc.a(), $$1x -> a.stream().<jn>map(Pair::getFirst).map(dpi::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jn, Function<aku, foh>> $$4 : a) {
         dyh $$5 = dpi.b((jn)$$4.getFirst());
         Function<aku, foh> $$6 = (Function<aku, foh>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(foc.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void L(dke $$0) {
      aku $$1 = fou.j.create($$0, this.d);
      aku $$2 = fou.k.get($$0).a($$1x -> $$1x.a(fot.i, fos.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      aku $$3 = fou.k.get($$0).a($$1x -> $$1x.a(fot.i, fos.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fod $$4 = fod.a($$0);
      foc.c $$5 = foc.a().a(dpg.b, false);
      $$4.a(foc.a().a(dpg.b, true), foh.a().a(foi.c, $$1));
      $$4.a($$5, foh.a().a(foi.c, $$1));
      a.stream().<jn>map(Pair::getFirst).forEach($$2x -> {
         dyo<dzc> $$3x = dpg.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dzc.a);
         }
      });

      for (Pair<jn, Function<aku, foh>> $$6 : a) {
         jn $$7 = (jn)$$6.getFirst();
         dyo<dzc> $$8 = dpg.a($$7);
         if ($$8 != null) {
            Function<aku, foh> $$9 = (Function<aku, foh>)$$6.getSecond();
            $$4.a(foc.a().a($$8, dzc.c), $$9.apply($$2));
            $$4.a(foc.a().a($$8, dzc.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void M(dke $$0) {
      fof $$1 = fof.a(dnx.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fos $$3 = fos.c(fos.a($$0, $$2));
         aku $$4 = fnw.d.b.a().a($$0, $$2, $$3, this.d);
         return foh.a().a(foi.c, $$4);
      });
      this.c($$0);
      this.b.accept(foe.a($$0).a($$1));
   }

   private void ax() {
      aku $$0 = fos.a(dkg.rw, "_bottom");
      fos $$1 = new fos().a(fot.e, $$0).a(fot.f, fos.a(dkg.rw, "_top")).a(fot.i, fos.a(dkg.rw, "_side"));
      fos $$2 = new fos().a(fot.e, $$0).a(fot.f, fos.a(dkg.rw, "_top_bloom")).a(fot.i, fos.a(dkg.rw, "_side_bloom"));
      aku $$3 = foq.n.a(dkg.rw, "", $$1, this.d);
      aku $$4 = foq.n.a(dkg.rw, "_bloom", $$2, this.d);
      this.b.accept(foe.a(dkg.rw).a(fof.a(dyg.c).a($$2x -> foh.a().a(foi.c, $$2x ? $$4 : $$3))));
      this.a(dkg.rw, $$3);
   }

   private void ay() {
      dke $$0 = dkg.ct;
      aku $$1 = foo.a($$0);
      fod $$2 = fod.a($$0);
      List.of(Pair.of(jn.c, foi.a.a), Pair.of(jn.f, foi.a.b), Pair.of(jn.d, foi.a.c), Pair.of(jn.e, foi.a.d)).forEach($$2x -> {
         jn $$3 = (jn)$$2x.getFirst();
         foi.a $$4 = (foi.a)$$2x.getSecond();
         foc.c $$5 = foc.a().a(dyg.T, $$3);
         $$2.a($$5, foh.a().a(foi.c, $$1).a(foi.b, $$4).a(foi.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, foo.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fod $$0, foc.c $$1, foi.a $$2) {
      List.of(
            Pair.of(dyg.bs, foq.aT),
            Pair.of(dyg.bt, foq.aU),
            Pair.of(dyg.bu, foq.aV),
            Pair.of(dyg.bv, foq.aW),
            Pair.of(dyg.bw, foq.aX),
            Pair.of(dyg.bx, foq.aY)
         )
         .forEach($$3 -> {
            dyh $$4 = (dyh)$$3.getFirst();
            fop $$5 = (fop)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fod $$0, foc.c $$1, foi.a $$2, dyh $$3, fop $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fos $$7 = new fos().a(fot.b, fos.a(dkg.ct, $$6));
      fnw.c $$8 = new fnw.c($$4, $$6);
      aku $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dkg.ct, $$6, $$7, this.d));
      $$0.a(foc.a($$1, foc.a().a($$3, $$5)), foh.a().a(foi.c, $$9).a(foi.b, $$2));
   }

   private void az() {
      this.b.accept(c(dkg.ll, foq.c.a(dkg.ll, fos.b(foo.a("magma")), this.d)));
   }

   private void a(dke $$0, @Nullable cwe $$1) {
      this.r($$0);
      cxd $$2 = $$0.i();
      aku $$3 = foq.bO.a($$2, fos.x($$0), this.d);
      hck.b $$4 = $$1 != null ? fom.a($$3, new het.a($$1)) : fom.a($$3, new het.a());
      this.c.a($$2, $$4);
   }

   private void c(dke $$0, dke $$1, fnw.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aA() {
      aku $$0 = foo.a(dkg.b);
      aku $$1 = foo.a(dkg.b, "_mirrored");
      this.b.accept(a(dkg.fb, $$0, $$1));
      this.a(dkg.fb, $$0);
   }

   private void aB() {
      aku $$0 = foo.a(dkg.tn);
      aku $$1 = foo.a(dkg.tn, "_mirrored");
      this.b.accept(a(dkg.tH, $$0, $$1).a(f()));
      this.a(dkg.tH, $$0);
   }

   private void n(dke $$0, dke $$1) {
      this.a($$0, fnw.d.b);
      fos $$2 = fos.d(fos.a($$0, "_pot"));
      aku $$3 = fnw.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aC() {
      aku $$0 = fos.a(dkg.pN, "_bottom");
      aku $$1 = fos.a(dkg.pN, "_top_off");
      aku $$2 = fos.a(dkg.pN, "_top");
      aku[] $$3 = new aku[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fos $$5 = new fos().a(fot.e, $$0).a(fot.f, $$4 == 0 ? $$1 : $$2).a(fot.i, fos.a(dkg.pN, "_side" + $$4));
         $$3[$$4] = foq.n.a(dkg.pN, "_" + $$4, $$5, this.d);
      }

      this.b.accept(foe.a(dkg.pN).a(fof.a(dyg.bc).a($$1x -> foh.a().a(foi.c, $$3[$$1x]))));
      this.a(dkg.pN, $$3[0]);
   }

   private foh a(jp $$0, foh $$1) {
      switch ($$0) {
         case b:
            return $$1.a(foi.a, foi.a.b);
         case c:
            return $$1.a(foi.a, foi.a.b).a(foi.b, foi.a.c);
         case d:
            return $$1.a(foi.a, foi.a.b).a(foi.b, foi.a.d);
         case a:
            return $$1.a(foi.a, foi.a.b).a(foi.b, foi.a.b);
         case f:
            return $$1.a(foi.a, foi.a.d).a(foi.b, foi.a.c);
         case g:
            return $$1.a(foi.a, foi.a.d);
         case h:
            return $$1.a(foi.a, foi.a.d).a(foi.b, foi.a.b);
         case e:
            return $$1.a(foi.a, foi.a.d).a(foi.b, foi.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(foi.b, foi.a.c);
         case i:
            return $$1.a(foi.b, foi.a.d);
         case j:
            return $$1.a(foi.b, foi.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aD() {
      aku $$0 = fos.a(dkg.pD, "_top");
      aku $$1 = fos.a(dkg.pD, "_bottom");
      aku $$2 = fos.a(dkg.pD, "_side");
      aku $$3 = fos.a(dkg.pD, "_lock");
      fos $$4 = new fos().a(fot.o, $$2).a(fot.m, $$2).a(fot.l, $$2).a(fot.c, $$0).a(fot.j, $$0).a(fot.k, $$1).a(fot.n, $$3);
      aku $$5 = foq.b.a(dkg.pD, $$4, this.d);
      this.b.accept(foe.a(dkg.pD, foh.a().a(foi.c, $$5)).a(fof.a(dyg.W).a($$0x -> this.a($$0x, foh.a()))));
   }

   private void aE() {
      dke $$0 = dkg.n;
      aku $$1 = foo.a($$0);
      fou $$2 = fou.a.get($$0);
      dke $$3 = dkg.kg;
      aku $$4 = foq.ab.a($$3, $$2.b(), this.d);
      aku $$5 = foq.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dke $$0, dke $$1, drm.a $$2, aku $$3) {
      aku $$4 = foo.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.i(), fom.a($$3, new heu.a($$2)));
   }

   private void aF() {
      aku $$0 = foo.b("template_skull");
      this.a(dkg.hj, dkg.hk, drm.b.g, $$0);
      this.a(dkg.hh, dkg.hi, drm.b.e, $$0);
      this.a(dkg.hf, dkg.hg, drm.b.f, $$0);
      this.a(dkg.hb, dkg.hc, drm.b.c, $$0);
      this.a(dkg.hd, dkg.he, drm.b.d, $$0);
      this.a(dkg.hn, dkg.ho, drm.b.h, $$0);
      this.a(dkg.hl, dkg.hm, drm.b.i, foo.a(cxl.vr));
   }

   private void a(dke $$0, dke $$1, cwe $$2) {
      aku $$3 = foo.a("banner");
      aku $$4 = foo.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cxd $$5 = $$0.i();
      this.c.a($$5, fom.a($$4, new hel.a($$2)));
   }

   private void aG() {
      this.a(dkg.jh, dkg.jx, cwe.a);
      this.a(dkg.ji, dkg.jy, cwe.b);
      this.a(dkg.jj, dkg.jz, cwe.c);
      this.a(dkg.jk, dkg.jA, cwe.d);
      this.a(dkg.jl, dkg.jB, cwe.e);
      this.a(dkg.jm, dkg.jC, cwe.f);
      this.a(dkg.jn, dkg.jD, cwe.g);
      this.a(dkg.jo, dkg.jE, cwe.h);
      this.a(dkg.jp, dkg.jF, cwe.i);
      this.a(dkg.jq, dkg.jG, cwe.j);
      this.a(dkg.jr, dkg.jH, cwe.k);
      this.a(dkg.js, dkg.jI, cwe.l);
      this.a(dkg.jt, dkg.jJ, cwe.m);
      this.a(dkg.ju, dkg.jK, cwe.n);
      this.a(dkg.jv, dkg.jL, cwe.o);
      this.a(dkg.jw, dkg.jM, cwe.p);
   }

   private void a(dke $$0, dke $$1, aku $$2, boolean $$3) {
      this.a($$0, $$1);
      cxd $$4 = $$0.i();
      aku $$5 = foq.bQ.a($$4, fos.x($$1), this.d);
      hck.b $$6 = fom.a($$5, new hen.a($$2));
      if ($$3) {
         hck.b $$7 = fom.a($$5, new hen.a(hen.a));
         this.c.a($$4, fom.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aH() {
      this.a(dkg.cD, dkg.n, hen.b, true);
      this.a(dkg.hs, dkg.n, hen.c, true);
      this.a(dkg.gb, dkg.cv, hen.d, false);
   }

   private void b(dke $$0, dke $$1, cwe $$2) {
      aku $$3 = foo.a("bed");
      this.b.accept(c($$0, $$3));
      cxd $$4 = $$0.i();
      aku $$5 = foq.bP.a(foo.a($$4), fos.x($$1), this.d);
      this.c.a($$4, fom.a($$5, new hem.a($$2)));
   }

   private void aI() {
      this.b(dkg.bg, dkg.bH, cwe.a);
      this.b(dkg.bh, dkg.bI, cwe.b);
      this.b(dkg.bi, dkg.bJ, cwe.c);
      this.b(dkg.bj, dkg.bK, cwe.d);
      this.b(dkg.bk, dkg.bL, cwe.e);
      this.b(dkg.bl, dkg.bM, cwe.f);
      this.b(dkg.bm, dkg.bN, cwe.g);
      this.b(dkg.bn, dkg.bO, cwe.h);
      this.b(dkg.bo, dkg.bP, cwe.i);
      this.b(dkg.bp, dkg.bQ, cwe.j);
      this.b(dkg.bq, dkg.bR, cwe.k);
      this.b(dkg.br, dkg.bS, cwe.l);
      this.b(dkg.bs, dkg.bT, cwe.m);
      this.b(dkg.bt, dkg.bU, cwe.n);
      this.b(dkg.bu, dkg.bV, cwe.o);
      this.b(dkg.bv, dkg.bW, cwe.p);
   }

   private void a(dke $$0, hev.a $$1) {
      cxd $$2 = $$0.i();
      aku $$3 = foo.a($$2);
      this.c.a($$2, fom.a($$3, $$1));
   }

   public void a() {
      me.a().filter(mf::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dkg.rH).a(me.x).a(dkg.rH, dkg.sf).a(dkg.rL, dkg.rP).a(me.z);
      this.i(dkg.rG).a(me.B).a(dkg.rG, dkg.se).a(dkg.rK, dkg.rO).a(me.D);
      this.i(dkg.rF).a(me.F).a(dkg.rF, dkg.sd).a(dkg.rJ, dkg.rN).a(me.H);
      this.i(dkg.rE).a(me.J).a(dkg.rE, dkg.sc).a(dkg.rI, dkg.rM).a(me.L);
      this.A(dkg.sM);
      this.A(dkg.sN);
      this.A(dkg.sO);
      this.A(dkg.sP);
      this.j(dkg.sM, dkg.sQ);
      this.j(dkg.sN, dkg.sR);
      this.j(dkg.sO, dkg.sS);
      this.j(dkg.sP, dkg.sT);
      this.n(dkg.a);
      this.d(dkg.nE, dkg.a);
      this.d(dkg.nD, dkg.a);
      this.n(dkg.gj);
      this.n(dkg.ed);
      this.d(dkg.nF, dkg.J);
      this.n(dkg.fV);
      this.n(dkg.mG);
      this.n(dkg.fM);
      this.n(dkg.gm);
      this.b(cxl.vf);
      this.n(dkg.pI);
      this.n(dkg.J);
      this.n(dkg.K);
      this.n(dkg.it);
      this.b(cxl.gj);
      this.o(dkg.qo, dkg.qF);
      this.o(dkg.qp, dkg.qG);
      this.o(dkg.qq, dkg.qH);
      this.o(dkg.qr, dkg.qI);
      this.o(dkg.qs, dkg.qJ);
      this.o(dkg.qt, dkg.qK);
      this.o(dkg.qu, dkg.qL);
      this.o(dkg.qv, dkg.qM);
      this.o(dkg.qw, dkg.qN);
      this.o(dkg.qx, dkg.qO);
      this.o(dkg.qy, dkg.qP);
      this.o(dkg.qz, dkg.qQ);
      this.o(dkg.qA, dkg.qR);
      this.o(dkg.qB, dkg.qS);
      this.o(dkg.qC, dkg.qT);
      this.o(dkg.qD, dkg.qU);
      this.o(dkg.qn, dkg.qE);
      this.n(dkg.nC);
      this.n(dkg.gO);
      this.n(dkg.rr);
      this.n(dkg.sZ);
      this.w(dkg.ta);
      this.w(dkg.tb);
      this.x(dkg.tM);
      this.x(dkg.tN);
      this.ak();
      this.h(dkg.tg, dkg.tc);
      this.L(dkg.tZ);
      this.M(dkg.ua);
      this.a(dkg.tY);
      this.t(dkg.td);
      this.t(dkg.te);
      this.s(dkg.tf);
      this.a(dkg.iu, cxl.ia);
      this.b(cxl.ia);
      this.aJ();
      this.a(dkg.lp, cxl.jA);
      this.b(cxl.jA);
      this.f(dkg.bX, fos.a(dkg.bF, "_side"));
      this.a(dkg.U);
      this.a(dkg.V);
      this.a(dkg.iZ);
      this.a(dkg.cF);
      this.a(dkg.cG);
      this.a(dkg.cH);
      this.a(dkg.fZ);
      this.a(dkg.ga);
      this.a(dkg.ge);
      this.a(dkg.Q);
      this.a(dkg.W);
      this.a(dkg.R);
      this.a(dkg.co);
      this.a(dkg.S);
      this.a(dkg.T);
      this.a(dkg.cp);
      this.b(dkg.pL, fou.d);
      this.a(dkg.pK);
      this.a(dkg.aY);
      this.a(dkg.aZ);
      this.a(dkg.ba);
      this.a(dkg.fC);
      this.a(dkg.hy);
      this.a(dkg.dV);
      this.a(dkg.dW);
      this.a(dkg.hx);
      this.a(dkg.qe);
      this.a(dkg.ny);
      this.a(dkg.ee);
      this.a(dkg.k);
      this.a(dkg.pM);
      this.a(dkg.fU);
      this.a(dkg.ep);
      this.a(dkg.O);
      this.a(dkg.pJ);
      this.a(dkg.eb);
      this.b(dkg.eg, fou.g);
      this.b(dkg.pS, fou.d);
      this.b(dkg.fo, fou.d);
      this.n(dkg.ag);
      this.n(dkg.gw);
      this.a(dkg.lm);
      this.a(dkg.bf);
      this.a(dkg.ja);
      this.a(dkg.cv);
      this.a(dkg.qm);
      this.a(dkg.iG);
      this.a(dkg.pa);
      this.a(dkg.ej);
      this.a(dkg.ek);
      this.b(dkg.cA, fou.b);
      this.g(dkg.cB);
      this.a(dkg.aV);
      this.b(dkg.bD, fou.z);
      this.b(cxl.cZ);
      this.b(dkg.cr, fou.f);
      this.b(dkg.pF, fou.d);
      this.a(dkg.oR);
      this.a(dkg.aW);
      this.a(dkg.qV);
      this.a(dkg.qW);
      this.a(dkg.rp);
      this.a(dkg.sW);
      this.a(dkg.tJ);
      this.a(dkg.tK);
      this.a(dkg.tL);
      this.d(dkg.ru);
      this.n(dkg.tX);
      this.aE();
      this.a(dkg.rC);
      this.a(dkg.rD);
      this.a(dkg.ry);
      this.a(dkg.rz);
      this.a(dkg.rA);
      this.a(dkg.rB);
      this.l(dkg.ry, dkg.rY);
      this.l(dkg.rz, dkg.sa);
      this.l(dkg.rA, dkg.rZ);
      this.l(dkg.rB, dkg.sb);
      this.j(dkg.so);
      this.j(dkg.sp);
      this.j(dkg.sr);
      this.j(dkg.sq);
      this.b(dkg.so, dkg.ss);
      this.b(dkg.sp, dkg.st);
      this.b(dkg.sr, dkg.sv);
      this.b(dkg.sq, dkg.su);
      this.l(dkg.sw);
      this.l(dkg.sx);
      this.l(dkg.sz);
      this.l(dkg.sy);
      this.c(dkg.sw, dkg.sA);
      this.c(dkg.sx, dkg.sB);
      this.c(dkg.sz, dkg.sD);
      this.c(dkg.sy, dkg.sC);
      this.a(dkg.sE);
      this.a(dkg.sF);
      this.a(dkg.sG);
      this.a(dkg.sH);
      this.l(dkg.sE, dkg.sI);
      this.l(dkg.sF, dkg.sJ);
      this.l(dkg.sG, dkg.sK);
      this.l(dkg.sH, dkg.sL);
      this.k(dkg.ht, dkg.co);
      this.k(dkg.hu, dkg.cp);
      this.H();
      this.s();
      this.ay();
      this.w();
      this.x();
      this.a(dkg.oI, dkg.oJ);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.D(dkg.kV);
      this.K();
      this.L();
      this.M();
      this.N();
      this.Q();
      this.R();
      this.S();
      this.T();
      this.r();
      this.U();
      this.V();
      this.W();
      this.X();
      this.Z();
      this.aa();
      this.ab();
      this.ac();
      this.ad();
      this.aj();
      this.am();
      this.al();
      this.an();
      this.ao();
      this.z();
      this.ap();
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.au();
      this.av();
      this.aw();
      this.g();
      this.J(dkg.fu);
      this.J(dkg.rv);
      this.b(dkg.fv, cxl.go);
      this.az();
      this.aD();
      this.ag();
      this.ah();
      this.ai();
      this.Y();
      this.P();
      this.O();
      this.ae();
      this.af();
      this.I(dkg.cX);
      this.c(dkg.cX);
      this.I(dkg.oC);
      this.h();
      this.I(dkg.ti);
      this.m(dkg.cw, dkg.cx);
      this.m(dkg.en, dkg.eo);
      this.a(dkg.cI, dkg.n, fos::c);
      this.a(dkg.oA, dkg.p, fos::d);
      this.C(dkg.oY);
      this.C(dkg.oP);
      this.z(dkg.bb);
      this.z(dkg.hF);
      this.D();
      this.H(dkg.oG);
      this.H(dkg.oH);
      this.e(dkg.fl, foo.a(dkg.fl));
      this.a(dkg.el, fou.d);
      this.a(dkg.em, fou.d);
      this.a(dkg.tI);
      this.a(dkg.lo, fou.d);
      this.e(dkg.j);
      this.e(dkg.tl);
      this.e(dkg.L);
      this.f(dkg.M);
      this.f(dkg.P);
      this.e(dkg.N);
      this.d(dkg.I);
      this.b(dkg.tS, fou.f);
      this.a(dkg.iH, fou.d, fou.e);
      this.a(dkg.kZ, fou.A, fou.B);
      this.a(dkg.hC, fou.A, fou.B);
      this.a(dkg.tO, fou.d, fou.e);
      this.a(dkg.tP, fou.d, fou.e);
      this.a(dkg.tQ, fou.d, fou.e);
      this.c(dkg.ov, fou.i);
      this.A();
      this.a(dkg.pG, fos::D);
      this.a(dkg.pH, fos::F);
      this.a(dkg.lf, dyg.av, 0, 1, 2, 3);
      this.a(dkg.gP, dyg.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkg.fL, dyg.av, 0, 1, 1, 2);
      this.a(dkg.gQ, dyg.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkg.cJ, dyg.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dkg.lc, fnw.d.b, dyg.at, 0, 1);
      this.j();
      this.i();
      this.aG();
      this.aI();
      this.aF();
      this.aH();
      this.a(dkg.lr, null);
      this.a(dkg.ls, cwe.a);
      this.a(dkg.lt, cwe.b);
      this.a(dkg.lu, cwe.c);
      this.a(dkg.lv, cwe.d);
      this.a(dkg.lw, cwe.e);
      this.a(dkg.lx, cwe.f);
      this.a(dkg.ly, cwe.g);
      this.a(dkg.lz, cwe.h);
      this.a(dkg.lA, cwe.i);
      this.a(dkg.lB, cwe.j);
      this.a(dkg.lC, cwe.k);
      this.a(dkg.lD, cwe.l);
      this.a(dkg.lE, cwe.m);
      this.a(dkg.lF, cwe.n);
      this.a(dkg.lG, cwe.o);
      this.a(dkg.lH, cwe.p);
      this.r(dkg.nz);
      this.a(dkg.nz, new heo.a());
      this.a(dkg.tT, dkg.iY);
      this.a(dkg.tT, new hep.a());
      this.a(dkg.fS, dkg.cv);
      this.a(dkg.lh, dkg.cv);
      this.a(dkg.aT);
      this.a(dkg.aU);
      this.a(dkg.lY);
      this.a(dkg.lZ);
      this.a(dkg.ma);
      this.a(dkg.mb);
      this.a(dkg.mc);
      this.a(dkg.md);
      this.a(dkg.me);
      this.a(dkg.mf);
      this.a(dkg.mg);
      this.a(dkg.mh);
      this.a(dkg.mi);
      this.a(dkg.mj);
      this.a(dkg.mk);
      this.a(dkg.ml);
      this.a(dkg.mm);
      this.a(dkg.mn);
      this.a(fou.a, dkg.mo, dkg.mp, dkg.mq, dkg.mr, dkg.ms, dkg.mt, dkg.mu, dkg.mv, dkg.mw, dkg.mx, dkg.my, dkg.mz, dkg.mA, dkg.mB, dkg.mC, dkg.mD);
      this.a(dkg.iY);
      this.a(dkg.hG);
      this.a(dkg.hH);
      this.a(dkg.hI);
      this.a(dkg.hJ);
      this.a(dkg.hK);
      this.a(dkg.hL);
      this.a(dkg.hM);
      this.a(dkg.hN);
      this.a(dkg.hO);
      this.a(dkg.hP);
      this.a(dkg.hQ);
      this.a(dkg.hR);
      this.a(dkg.hS);
      this.a(dkg.hT);
      this.a(dkg.hU);
      this.a(dkg.hV);
      this.a(dkg.rq);
      this.i(dkg.aX, dkg.fm);
      this.i(dkg.ev, dkg.hW);
      this.i(dkg.ew, dkg.hX);
      this.i(dkg.ex, dkg.hY);
      this.i(dkg.ey, dkg.hZ);
      this.i(dkg.ez, dkg.ia);
      this.i(dkg.eA, dkg.ib);
      this.i(dkg.eB, dkg.ic);
      this.i(dkg.eC, dkg.id);
      this.i(dkg.eD, dkg.ie);
      this.i(dkg.eE, dkg.if);
      this.i(dkg.eF, dkg.ig);
      this.i(dkg.eG, dkg.ih);
      this.i(dkg.eH, dkg.ii);
      this.i(dkg.eI, dkg.ij);
      this.i(dkg.eJ, dkg.ik);
      this.i(dkg.eK, dkg.il);
      this.b(fou.t, dkg.lI, dkg.lJ, dkg.lK, dkg.lL, dkg.lM, dkg.lN, dkg.lO, dkg.lP, dkg.lQ, dkg.lR, dkg.lS, dkg.lT, dkg.lU, dkg.lV, dkg.lW, dkg.lX);
      this.h(dkg.bH, dkg.iI);
      this.h(dkg.bI, dkg.iJ);
      this.h(dkg.bJ, dkg.iK);
      this.h(dkg.bK, dkg.iL);
      this.h(dkg.bL, dkg.iM);
      this.h(dkg.bM, dkg.iN);
      this.h(dkg.bN, dkg.iO);
      this.h(dkg.bO, dkg.iP);
      this.h(dkg.bP, dkg.iQ);
      this.h(dkg.bQ, dkg.iR);
      this.h(dkg.bR, dkg.iS);
      this.h(dkg.bS, dkg.iT);
      this.h(dkg.bT, dkg.iU);
      this.h(dkg.bU, dkg.iV);
      this.h(dkg.bV, dkg.iW);
      this.h(dkg.bW, dkg.iX);
      this.a(dkg.tm);
      this.a(dkg.eZ);
      this.b(dkg.bB, dkg.gx, fnw.d.a);
      this.h(dkg.bB);
      this.a(dkg.bY, dkg.gy, fnw.d.b);
      this.a(dkg.ca, dkg.gz, fnw.d.b);
      this.a(dkg.ub, dkg.ud, fnw.d.c);
      this.a(dkg.uc, dkg.ue, fnw.d.b);
      this.a(dkg.cb, dkg.gA, fnw.d.b);
      this.a(dkg.cc, dkg.gB, fnw.d.b);
      this.a(dkg.cd, dkg.gC, fnw.d.b);
      this.a(dkg.ce, dkg.gD, fnw.d.b);
      this.a(dkg.cf, dkg.gE, fnw.d.b);
      this.a(dkg.cg, dkg.gF, fnw.d.b);
      this.a(dkg.ch, dkg.gG, fnw.d.b);
      this.a(dkg.ci, dkg.gH, fnw.d.b);
      this.a(dkg.cj, dkg.gI, fnw.d.b);
      this.a(dkg.cl, dkg.gJ, fnw.d.b);
      this.a(dkg.ck, dkg.gK, fnw.d.b);
      this.a(dkg.cn, dkg.gL, fnw.d.b);
      this.a(dkg.cm, dkg.gM, fnw.d.b);
      this.a(dkg.bC, dkg.gN, fnw.d.b);
      this.a(dkg.bZ, dkg.gn, fnw.d.b);
      this.I();
      this.y(dkg.fh);
      this.y(dkg.fi);
      this.y(dkg.fj);
      this.b(dkg.bA, fnw.d.a);
      this.h(dkg.bA);
      this.b(dkg.ef, fnw.d.a);
      this.b(cxl.dS);
      this.c(dkg.mE, dkg.mF, fnw.d.b);
      this.b(cxl.dT);
      this.b(dkg.tk, fnw.d.b);
      this.c(dkg.pb, dkg.pc, fnw.d.b);
      this.c(dkg.pd, dkg.pe, fnw.d.b);
      this.a(dkg.pb, "_plant");
      this.a(dkg.pd, "_plant");
      this.a(dkg.nA, fnw.d.a, fos.c(fos.a(dkg.nB, "_stage0")));
      this.n();
      this.a(dkg.bz, fnw.d.b);
      this.d(dkg.jc, fnw.d.b);
      this.d(dkg.jd, fnw.d.b);
      this.d(dkg.je, fnw.d.b);
      this.o(dkg.jf);
      this.o(dkg.jg);
      this.k();
      this.l();
      this.m();
      this.a(dkg.mY, dkg.mT, dkg.mO, dkg.mJ, dkg.ni, dkg.nd, dkg.ns, dkg.nn);
      this.a(dkg.mZ, dkg.mU, dkg.mP, dkg.mK, dkg.nj, dkg.ne, dkg.nt, dkg.no);
      this.a(dkg.na, dkg.mV, dkg.mQ, dkg.mL, dkg.nk, dkg.nf, dkg.nu, dkg.np);
      this.a(dkg.nb, dkg.mW, dkg.mR, dkg.mM, dkg.nl, dkg.ng, dkg.nv, dkg.nq);
      this.a(dkg.nc, dkg.mX, dkg.mS, dkg.mN, dkg.nm, dkg.nh, dkg.nw, dkg.nr);
      this.f(dkg.fs, dkg.fq);
      this.f(dkg.fr, dkg.fp);
      this.m(dkg.af).c(dkg.af).a(dkg.aA);
      this.m(dkg.ar).c(dkg.ar).a(dkg.aJ);
      this.a(dkg.ar, dkg.du, dkg.dE);
      this.a(dkg.aS, fou.w, -7158200);
      this.m(dkg.ab).c(dkg.ab).a(dkg.ax);
      this.m(dkg.am).c(dkg.am).a(dkg.aF);
      this.a(dkg.am, dkg.dn, dkg.dz);
      this.a(dkg.D, dkg.gs, fnw.d.b);
      this.a(dkg.aO, fou.w, -12012264);
      this.m(dkg.ac).d(dkg.ac).a(dkg.ay);
      this.m(dkg.an).d(dkg.an).a(dkg.aG);
      this.a(dkg.an, dkg.do, dkg.dA);
      this.a(dkg.E, dkg.gt, fnw.d.b);
      this.b(dkg.aP, fou.w);
      this.m(dkg.Z).c(dkg.Z).a(dkg.av);
      this.m(dkg.ak).c(dkg.ak).a(dkg.aD);
      this.a(dkg.ak, dkg.dm, dkg.dy);
      this.a(dkg.B, dkg.gq, fnw.d.b);
      this.a(dkg.aM, fou.w, -8345771);
      this.m(dkg.X).c(dkg.X).a(dkg.at);
      this.m(dkg.aq).c(dkg.aq).a(dkg.aB);
      this.a(dkg.aq, dkg.dk, dkg.dw);
      this.a(dkg.z, dkg.go, fnw.d.b);
      this.a(dkg.aK, fou.w, -12012264);
      this.m(dkg.Y).c(dkg.Y).a(dkg.au);
      this.m(dkg.aj).c(dkg.aj).a(dkg.aC);
      this.a(dkg.aj, dkg.dl, dkg.dx);
      this.a(dkg.A, dkg.gp, fnw.d.b);
      this.a(dkg.aL, fou.w, -10380959);
      this.m(dkg.ad).c(dkg.ad).a(dkg.az);
      this.m(dkg.ao).c(dkg.ao).a(dkg.aH);
      this.a(dkg.ao, dkg.dq, dkg.dC);
      this.a(dkg.F, dkg.gu, fnw.d.b);
      this.a(dkg.aQ, fou.w, -12012264);
      this.m(dkg.ae).c(dkg.ae).a(dkg.u);
      this.m(dkg.ap).c(dkg.ap).a(dkg.aI);
      this.a(dkg.ap, dkg.dr, dkg.dD);
      this.a(dkg.G, dkg.gv, fnw.d.b);
      this.b(dkg.aR, fou.w);
      this.m(dkg.aa).c(dkg.aa).a(dkg.aw);
      this.m(dkg.al).c(dkg.al).a(dkg.aE);
      this.a(dkg.al, dkg.dp, dkg.dB);
      this.a(dkg.C, dkg.gr, fnw.d.b);
      this.a(dkg.aN, fou.w, -12012264);
      this.m(dkg.oU).b(dkg.oU).a(dkg.oW);
      this.m(dkg.oV).b(dkg.oV).a(dkg.oX);
      this.a(dkg.oV, dkg.ds, dkg.dF);
      this.a(dkg.oZ, dkg.pO, fnw.d.b);
      this.n(dkg.pf, dkg.pQ);
      this.m(dkg.oL).b(dkg.oL).a(dkg.oN);
      this.m(dkg.oM).b(dkg.oM).a(dkg.oO);
      this.a(dkg.oM, dkg.dt, dkg.dG);
      this.a(dkg.oQ, dkg.pP, fnw.d.b);
      this.n(dkg.oS, dkg.pR);
      this.m(dkg.ai).d(dkg.ai);
      this.m(dkg.as).d(dkg.as);
      this.a(dkg.x, dkg.dv, dkg.dH);
      this.b(dkg.oT, fnw.d.b);
      this.b(cxl.dP);
      this.j(dkg.dK);
      this.l(dkg.iw);
      this.v();
      this.p(dkg.cY);
      this.q(dkg.bw);
      this.q(dkg.bx);
      this.q(dkg.hE);
      this.u();
      this.u(dkg.gi);
      this.u(dkg.li);
      this.u(dkg.lj);
      this.v(dkg.hp);
      this.v(dkg.hq);
      this.v(dkg.hr);
      this.p();
      this.q();
      this.d(dkg.cL, fou.h);
      this.d(dkg.oy, fou.h);
      this.d(dkg.ox, fou.i);
      this.t();
      this.aC();
      this.ax();
      this.l(dkg.eY, dkg.fg);
      this.l(dkg.m, dkg.fc);
      this.l(dkg.eX, dkg.ff);
      this.l(dkg.eW, dkg.fe);
      this.aA();
      this.l(dkg.eV, dkg.fd);
      this.aB();
   }

   private void aJ() {
      hck.b $$0 = fom.a(this.a(cxl.ib));
      Map<Integer, hck.b> $$1 = new HashMap<>(16);
      fof.a<Integer> $$2 = fof.a(dyg.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         aku $$5 = fos.a(cxl.ib, $$4);
         $$2.a($$3, foh.a().a(foi.c, foq.aa.a(dkg.iv, $$4, fos.h($$5), this.d)));
         hck.b $$6 = fom.a(foq.bI.a(foo.a(cxl.ib, $$4), fos.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cxl.ib, fom.a(dow.c, $$0, $$1));
      this.b.accept(foe.a(dkg.iv).a($$2));
   }

   private void o(dke $$0, dke $$1) {
      this.b($$0.i());
      fos $$2 = fos.b(fos.J($$0));
      fos $$3 = fos.b(fos.a($$0, "_lit"));
      aku $$4 = foq.bV.a($$0, "_one_candle", $$2, this.d);
      aku $$5 = foq.bW.a($$0, "_two_candles", $$2, this.d);
      aku $$6 = foq.bX.a($$0, "_three_candles", $$2, this.d);
      aku $$7 = foq.bY.a($$0, "_four_candles", $$2, this.d);
      aku $$8 = foq.bV.a($$0, "_one_candle_lit", $$3, this.d);
      aku $$9 = foq.bW.a($$0, "_two_candles_lit", $$3, this.d);
      aku $$10 = foq.bX.a($$0, "_three_candles_lit", $$3, this.d);
      aku $$11 = foq.bY.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            foe.a($$0)
               .a(
                  fof.a(dyg.aC, dyg.u)
                     .a(1, false, foh.a().a(foi.c, $$4))
                     .a(2, false, foh.a().a(foi.c, $$5))
                     .a(3, false, foh.a().a(foi.c, $$6))
                     .a(4, false, foh.a().a(foi.c, $$7))
                     .a(1, true, foh.a().a(foi.c, $$8))
                     .a(2, true, foh.a().a(foi.c, $$9))
                     .a(3, true, foh.a().a(foi.c, $$10))
                     .a(4, true, foh.a().a(foi.c, $$11))
               )
         );
      aku $$12 = foq.bZ.a($$1, fos.a($$0, false), this.d);
      aku $$13 = foq.bZ.a($$1, "_lit", fos.a($$0, true), this.d);
      this.b.accept(foe.a($$1).a(a(dyg.u, $$13, $$12)));
   }

   class a {
      private final fos b;
      private final Map<fop, aku> c = Maps.newHashMap();
      @Nullable
      private mf d;
      @Nullable
      private aku e;
      private final Set<dke> f = new HashSet<>();

      public a(final fos $$0) {
         this.b = $$0;
      }

      public fnw.a a(dke $$0, fop $$1) {
         this.e = $$1.a($$0, this.b, fnw.this.d);
         if (fnw.this.f.containsKey($$0)) {
            fnw.this.b.accept(fnw.this.f.get($$0).create($$0, this.e, this.b, fnw.this.d));
         } else {
            fnw.this.b.accept(fnw.c($$0, this.e));
         }

         return this;
      }

      public fnw.a a(dke $$0, dke $$1) {
         aku $$2 = foo.a($$0);
         fnw.this.b.accept(fnw.c($$1, $$2));
         fnw.this.c.a($$0.i(), $$1.i());
         this.f.add($$1);
         return this;
      }

      public fnw.a a(dke $$0) {
         aku $$1 = foq.s.a($$0, this.b, fnw.this.d);
         aku $$2 = foq.t.a($$0, this.b, fnw.this.d);
         fnw.this.b.accept(fnw.b($$0, $$1, $$2));
         aku $$3 = foq.u.a($$0, this.b, fnw.this.d);
         fnw.this.a($$0, $$3);
         return this;
      }

      public fnw.a b(dke $$0) {
         aku $$1 = foq.M.a($$0, this.b, fnw.this.d);
         aku $$2 = foq.N.a($$0, this.b, fnw.this.d);
         aku $$3 = foq.O.a($$0, this.b, fnw.this.d);
         fnw.this.b.accept(fnw.a($$0, $$1, $$2, $$3));
         aku $$4 = foq.P.a($$0, this.b, fnw.this.d);
         fnw.this.a($$0, $$4);
         return this;
      }

      public fnw.a c(dke $$0) {
         fos $$1 = fos.s($$0);
         aku $$2 = foq.D.a($$0, $$1, fnw.this.d);
         aku $$3 = foq.E.a($$0, $$1, fnw.this.d);
         aku $$4 = foq.F.a($$0, $$1, fnw.this.d);
         aku $$5 = foq.G.a($$0, $$1, fnw.this.d);
         aku $$6 = foq.H.a($$0, $$1, fnw.this.d);
         fnw.this.b.accept(fnw.a($$0, $$2, $$3, $$4, $$5, $$6));
         aku $$7 = foq.I.a($$0, $$1, fnw.this.d);
         fnw.this.a($$0, $$7);
         return this;
      }

      public fnw.a d(dke $$0) {
         aku $$1 = foq.J.a($$0, this.b, fnw.this.d);
         aku $$2 = foq.K.a($$0, this.b, fnw.this.d);
         fnw.this.b.accept(fnw.c($$0, $$1, $$2));
         aku $$3 = foq.L.a($$0, this.b, fnw.this.d);
         fnw.this.a($$0, $$3);
         return this;
      }

      public fnw.a e(dke $$0) {
         fos $$1 = fos.s($$0);
         aku $$2 = foq.R.a($$0, $$1, fnw.this.d);
         aku $$3 = foq.Q.a($$0, $$1, fnw.this.d);
         aku $$4 = foq.T.a($$0, $$1, fnw.this.d);
         aku $$5 = foq.S.a($$0, $$1, fnw.this.d);
         fnw.this.b.accept(fnw.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fnw.a f(dke $$0) {
         aku $$1 = foq.V.a($$0, this.b, fnw.this.d);
         aku $$2 = foq.U.a($$0, this.b, fnw.this.d);
         aku $$3 = foq.X.a($$0, this.b, fnw.this.d);
         aku $$4 = foq.W.a($$0, this.b, fnw.this.d);
         fnw.this.b.accept(fnw.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fnw.a g(dke $$0) {
         aku $$1 = foq.Y.a($$0, this.b, fnw.this.d);
         aku $$2 = foq.Z.a($$0, this.b, fnw.this.d);
         fnw.this.b.accept(fnw.e($$0, $$1, $$2));
         return this;
      }

      public fnw.a h(dke $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dke $$1 = this.d.b().get(mf.b.r);
            aku $$2 = foq.aa.a($$0, this.b, fnw.this.d);
            fnw.this.b.accept(fnw.c($$0, $$2));
            fnw.this.b.accept(fnw.c($$1, $$2));
            fnw.this.b($$0.i());
            return this;
         }
      }

      public fnw.a i(dke $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aku $$1 = this.a(foq.ab, $$0);
            aku $$2 = this.a(foq.ac, $$0);
            fnw.this.b.accept(fnw.e($$0, $$1, $$2, this.e));
            fnw.this.a($$0, $$1);
            return this;
         }
      }

      public fnw.a j(dke $$0) {
         aku $$1 = this.a(foq.af, $$0);
         aku $$2 = this.a(foq.ae, $$0);
         aku $$3 = this.a(foq.ag, $$0);
         fnw.this.b.accept(fnw.b($$0, $$1, $$2, $$3));
         fnw.this.a($$0, $$2);
         return this;
      }

      private fnw.a k(dke $$0) {
         fou $$1 = fnw.this.g.getOrDefault($$0, fou.a.get($$0));
         aku $$2 = $$1.a($$0, fnw.this.d);
         fnw.this.b.accept(fnw.c($$0, $$2));
         return this;
      }

      private fnw.a l(dke $$0) {
         fnw.this.j($$0);
         return this;
      }

      private void m(dke $$0) {
         if (fnw.this.e.contains($$0)) {
            fnw.this.l($$0);
         } else {
            fnw.this.k($$0);
         }
      }

      private aku a(fop $$0, dke $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fnw.this.d));
      }

      public fnw.a a(mf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fnw.a, dke> $$2 = fnw.h.get($$0x);
               if ($$2 != null) {
                  $$2.accept(this, $$1);
               }
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface b {
      fob create(dke var1, aku var2, fos var3, BiConsumer<aku, fon> var4);
   }

   static record c(fop a, String b) {
   }

   static enum d {
      a(foq.ap, foq.as, false),
      b(foq.ao, foq.ar, false),
      c(foq.aq, foq.at, true);

      private final fop d;
      private final fop e;
      private final boolean f;

      private d(final fop $$0, final fop $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fop a() {
         return this.d;
      }

      public fop b() {
         return this.e;
      }

      public aku a(fnw $$0, dke $$1) {
         cxd $$2 = $$1.i();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fos a(dke $$0) {
         return this.f ? fos.e($$0) : fos.c($$0);
      }

      public fos b(dke $$0) {
         return this.f ? fos.g($$0) : fos.f($$0);
      }
   }

   class e {
      private final fos b;

      public e(final fos $$0) {
         this.b = $$0;
      }

      public fnw.e a(dke $$0) {
         fos $$1 = this.b.c(fot.d, this.b.a(fot.i));
         aku $$2 = foq.j.a($$0, $$1, fnw.this.d);
         fnw.this.b.accept(fnw.d($$0, $$2));
         return this;
      }

      public fnw.e b(dke $$0) {
         aku $$1 = foq.j.a($$0, this.b, fnw.this.d);
         fnw.this.b.accept(fnw.d($$0, $$1));
         return this;
      }

      public fnw.e c(dke $$0) {
         aku $$1 = foq.j.a($$0, this.b, fnw.this.d);
         aku $$2 = foq.k.a($$0, this.b, fnw.this.d);
         fnw.this.b.accept(fnw.d($$0, $$1, $$2));
         return this;
      }

      public fnw.e d(dke $$0) {
         fnw.this.b.accept(fnw.a($$0, this.b, fnw.this.d));
         return this;
      }
   }
}
