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

public class fmy {
   final Consumer<fnd> b;
   final fnb c;
   final BiConsumer<akv, fnp> d;
   final List<djl> e = ImmutableList.of(djn.eL, djn.eR, djn.iw);
   final Map<djl, fmy.b> f = ImmutableMap.builder().put(djn.b, fmy::a).put(djn.tl, fmy::c).put(djn.fa, fmy::b).build();
   final Map<djl, fnv> g = ImmutableMap.builder()
      .put(djn.bc, fnv.y.get(djn.bc))
      .put(djn.jN, fnv.y.get(djn.jN))
      .put(djn.kr, fnv.a(fnt.a(djn.bc, "_top")))
      .put(djn.kt, fnv.a(fnt.a(djn.jN, "_top")))
      .put(djn.be, fnv.d.get(djn.bc).a($$0x -> $$0x.a(fnu.i, fnt.J(djn.be))))
      .put(djn.jP, fnv.d.get(djn.jN).a($$0x -> $$0x.a(fnu.i, fnt.J(djn.jP))))
      .put(djn.hA, fnv.d.get(djn.hA))
      .put(djn.ks, fnv.a(fnt.a(djn.hA, "_bottom")))
      .put(djn.pT, fnv.z.get(djn.pT))
      .put(djn.tl, fnv.z.get(djn.tl))
      .put(djn.hB, fnv.d.get(djn.hB).a($$0x -> $$0x.a(fnu.i, fnt.J(djn.hB))))
      .put(djn.bd, fnv.d.get(djn.bd).a($$0x -> {
         $$0x.a(fnu.d, fnt.a(djn.bc, "_top"));
         $$0x.a(fnu.i, fnt.J(djn.bd));
      }))
      .put(djn.jO, fnv.d.get(djn.jO).a($$0x -> {
         $$0x.a(fnu.d, fnt.a(djn.jN, "_top"));
         $$0x.a(fnu.i, fnt.J(djn.jO));
      }))
      .put(djn.ro, fnv.z.get(djn.ro))
      .put(djn.rj, fnv.z.get(djn.rj))
      .build();
   static final Map<mf.b, BiConsumer<fmy.a, djl>> h = ImmutableMap.builder()
      .put(mf.b.a, fmy.a::a)
      .put(mf.b.e, fmy.a::l)
      .put(mf.b.b, fmy.a::k)
      .put(mf.b.c, fmy.a::k)
      .put(mf.b.f, fmy.a::c)
      .put(mf.b.g, fmy.a::d)
      .put(mf.b.h, fmy.a::e)
      .put(mf.b.i, fmy.a::f)
      .put(mf.b.k, fmy.a::h)
      .put(mf.b.l, fmy.a::i)
      .put(mf.b.m, fmy.a::j)
      .put(mf.b.n, fmy.a::g)
      .put(mf.b.p, fmy.a::m)
      .put(mf.b.q, fmy.a::b)
      .build();
   public static final List<Pair<jn, Function<akv, fnj>>> a = List.of(
      Pair.of(jn.c, (Function<akv, fnj>)$$0 -> fnj.a().a(fnk.c, $$0)),
      Pair.of(jn.f, (Function<akv, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b).a(fnk.d, true)),
      Pair.of(jn.d, (Function<akv, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c).a(fnk.d, true)),
      Pair.of(jn.e, (Function<akv, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d).a(fnk.d, true)),
      Pair.of(jn.b, (Function<akv, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.d).a(fnk.d, true)),
      Pair.of(jn.a, (Function<akv, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.b).a(fnk.d, true))
   );
   private static final Map<fmy.c, akv> i = new HashMap<>();

   private static fnd a(djl $$0, akv $$1, fnt $$2, BiConsumer<akv, fnp> $$3) {
      akv $$4 = fns.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fnd b(djl $$0, akv $$1, fnt $$2, BiConsumer<akv, fnp> $$3) {
      akv $$4 = fns.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fnd c(djl $$0, akv $$1, fnt $$2, BiConsumer<akv, fnp> $$3) {
      akv $$4 = fns.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fmy(Consumer<fnd> $$0, fnb $$1, BiConsumer<akv, fnp> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cwk $$0, akv $$1) {
      this.c.a($$0, fno.a($$1));
   }

   void a(djl $$0, akv $$1) {
      this.c.a($$0.j(), fno.a($$1));
   }

   private void a(djl $$0, akv $$1, fms $$2) {
      this.c.a($$0.j(), fno.a($$1, $$2));
   }

   private akv a(cwk $$0) {
      return fns.bE.a(fnq.a($$0), fnt.b($$0), this.d);
   }

   akv a(cwk $$0, djl $$1) {
      return fns.bE.a(fnq.a($$0), fnt.I($$1), this.d);
   }

   private akv a(cwk $$0, djl $$1, String $$2) {
      return fns.bE.a(fnq.a($$0), fnt.k(fnt.a($$1, $$2)), this.d);
   }

   akv b(cwk $$0, djl $$1, String $$2) {
      akv $$3 = fnt.J($$1);
      akv $$4 = fnt.a($$1, $$2);
      return fns.bI.a(fnq.a($$0), fnt.c($$3, $$4), this.d);
   }

   void b(cwk $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(djl $$0) {
      cwk $$1 = $$0.j();
      if ($$1 != cws.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(djl $$0, String $$1) {
      cwk $$2 = $$0.j();
      if ($$2 != cws.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(djl $$0, String $$1) {
      cwk $$2 = $$0.j();
      if ($$2 != cws.a) {
         akv $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fnh b() {
      return fnh.a(dxm.U).a(jn.f, fnj.a().a(fnk.b, fnk.a.b)).a(jn.d, fnj.a().a(fnk.b, fnk.a.c)).a(jn.e, fnj.a().a(fnk.b, fnk.a.d)).a(jn.c, fnj.a());
   }

   private static fnh c() {
      return fnh.a(dxm.U).a(jn.d, fnj.a()).a(jn.e, fnj.a().a(fnk.b, fnk.a.b)).a(jn.c, fnj.a().a(fnk.b, fnk.a.c)).a(jn.f, fnj.a().a(fnk.b, fnk.a.d));
   }

   private static fnh d() {
      return fnh.a(dxm.U).a(jn.f, fnj.a()).a(jn.d, fnj.a().a(fnk.b, fnk.a.b)).a(jn.e, fnj.a().a(fnk.b, fnk.a.c)).a(jn.c, fnj.a().a(fnk.b, fnk.a.d));
   }

   private static fnh e() {
      return fnh.a(dxm.S)
         .a(jn.a, fnj.a().a(fnk.a, fnk.a.b))
         .a(jn.b, fnj.a().a(fnk.a, fnk.a.d))
         .a(jn.c, fnj.a())
         .a(jn.d, fnj.a().a(fnk.b, fnk.a.c))
         .a(jn.e, fnj.a().a(fnk.b, fnk.a.d))
         .a(jn.f, fnj.a().a(fnk.b, fnk.a.b));
   }

   private static fng b(djl $$0, akv $$1) {
      return fng.a($$0, a($$1));
   }

   private static fnj[] a(akv $$0) {
      return new fnj[]{
         fnj.a().a(fnk.c, $$0), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d)
      };
   }

   private static fng a(djl $$0, akv $$1, akv $$2) {
      return fng.a($$0, fnj.a().a(fnk.c, $$1), fnj.a().a(fnk.c, $$2), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c));
   }

   private static fnh a(dxn $$0, akv $$1, akv $$2) {
      return fnh.a($$0).a(true, fnj.a().a(fnk.c, $$1)).a(false, fnj.a().a(fnk.c, $$2));
   }

   private void d(djl $$0) {
      akv $$1 = fnv.a.create($$0, this.d);
      akv $$2 = fnv.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(djl $$0) {
      akv $$1 = fnv.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(djl $$0) {
      this.b.accept(fng.a($$0).a(fnh.a(dxm.by).a($$1 -> {
         String $$2 = "_" + $$1;
         akv $$3 = fnt.a($$0, $$2);
         return fnj.a().a(fnk.c, fns.c.a($$0, $$2, new fnt().a(fnu.a, $$3), this.d));
      })));
      this.a($$0, fnq.a($$0, "_0"));
   }

   static fnd b(djl $$0, akv $$1, akv $$2) {
      return fng.a($$0)
         .a(fnh.a(dxm.B).a(false, fnj.a().a(fnk.c, $$1)).a(true, fnj.a().a(fnk.c, $$2)))
         .a(
            fnh.a(dxm.X, dxm.U)
               .a(dxh.a, jn.f, fnj.a().a(fnk.b, fnk.a.b))
               .a(dxh.a, jn.e, fnj.a().a(fnk.b, fnk.a.d))
               .a(dxh.a, jn.d, fnj.a().a(fnk.b, fnk.a.c))
               .a(dxh.a, jn.c, fnj.a())
               .a(dxh.b, jn.f, fnj.a().a(fnk.b, fnk.a.b).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxh.b, jn.e, fnj.a().a(fnk.b, fnk.a.d).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxh.b, jn.d, fnj.a().a(fnk.b, fnk.a.c).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxh.b, jn.c, fnj.a().a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxh.c, jn.f, fnj.a().a(fnk.b, fnk.a.d).a(fnk.a, fnk.a.c))
               .a(dxh.c, jn.e, fnj.a().a(fnk.b, fnk.a.b).a(fnk.a, fnk.a.c))
               .a(dxh.c, jn.d, fnj.a().a(fnk.a, fnk.a.c))
               .a(dxh.c, jn.c, fnj.a().a(fnk.b, fnk.a.c).a(fnk.a, fnk.a.c))
         );
   }

   private static fnh.d<jn, dxr, dxq, Boolean> a(fnh.d<jn, dxr, dxq, Boolean> $$0, dxr $$1, akv $$2, akv $$3, akv $$4, akv $$5) {
      return $$0.a(jn.f, $$1, dxq.a, false, fnj.a().a(fnk.c, $$2))
         .a(jn.d, $$1, dxq.a, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
         .a(jn.e, $$1, dxq.a, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
         .a(jn.c, $$1, dxq.a, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
         .a(jn.f, $$1, dxq.b, false, fnj.a().a(fnk.c, $$4))
         .a(jn.d, $$1, dxq.b, false, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
         .a(jn.e, $$1, dxq.b, false, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c))
         .a(jn.c, $$1, dxq.b, false, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d))
         .a(jn.f, $$1, dxq.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
         .a(jn.d, $$1, dxq.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
         .a(jn.e, $$1, dxq.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
         .a(jn.c, $$1, dxq.a, true, fnj.a().a(fnk.c, $$3))
         .a(jn.f, $$1, dxq.b, true, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.d))
         .a(jn.d, $$1, dxq.b, true, fnj.a().a(fnk.c, $$5))
         .a(jn.e, $$1, dxq.b, true, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
         .a(jn.c, $$1, dxq.b, true, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.c));
   }

   private static fnd a(djl $$0, akv $$1, akv $$2, akv $$3, akv $$4, akv $$5, akv $$6, akv $$7, akv $$8) {
      return fng.a($$0).a(a(a(fnh.a(dxm.U, dxm.ah, dxm.bh, dxm.z), dxr.b, $$1, $$2, $$3, $$4), dxr.a, $$5, $$6, $$7, $$8));
   }

   static fnd a(djl $$0, akv $$1, akv $$2, akv $$3, akv $$4, akv $$5) {
      return fnf.a($$0)
         .a(fnj.a().a(fnk.c, $$1))
         .a(fne.a().a(dxm.O, true), fnj.a().a(fnk.c, $$2).a(fnk.d, false))
         .a(fne.a().a(dxm.P, true), fnj.a().a(fnk.c, $$3).a(fnk.d, false))
         .a(fne.a().a(dxm.Q, true), fnj.a().a(fnk.c, $$4).a(fnk.d, false))
         .a(fne.a().a(dxm.R, true), fnj.a().a(fnk.c, $$5).a(fnk.d, false));
   }

   static fnd c(djl $$0, akv $$1, akv $$2) {
      return fnf.a($$0)
         .a(fnj.a().a(fnk.c, $$1))
         .a(fne.a().a(dxm.O, true), fnj.a().a(fnk.c, $$2).a(fnk.d, true))
         .a(fne.a().a(dxm.P, true), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true))
         .a(fne.a().a(dxm.Q, true), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true))
         .a(fne.a().a(dxm.R, true), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true));
   }

   static fnd a(djl $$0, akv $$1, akv $$2, akv $$3) {
      return fnf.a($$0)
         .a(fne.a().a(dxm.M, true), fnj.a().a(fnk.c, $$1))
         .a(fne.a().a(dxm.aa, dyh.b), fnj.a().a(fnk.c, $$2).a(fnk.d, true))
         .a(fne.a().a(dxm.Z, dyh.b), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true))
         .a(fne.a().a(dxm.ab, dyh.b), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true))
         .a(fne.a().a(dxm.ac, dyh.b), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true))
         .a(fne.a().a(dxm.aa, dyh.c), fnj.a().a(fnk.c, $$3).a(fnk.d, true))
         .a(fne.a().a(dxm.Z, dyh.c), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true))
         .a(fne.a().a(dxm.ab, dyh.c), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true))
         .a(fne.a().a(dxm.ac, dyh.c), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true));
   }

   static fnd a(djl $$0, akv $$1, akv $$2, akv $$3, akv $$4, boolean $$5) {
      return fng.a($$0, fnj.a().a(fnk.d, $$5))
         .a(c())
         .a(
            fnh.a(dxm.u, dxm.z)
               .a(false, false, fnj.a().a(fnk.c, $$2))
               .a(true, false, fnj.a().a(fnk.c, $$4))
               .a(false, true, fnj.a().a(fnk.c, $$1))
               .a(true, true, fnj.a().a(fnk.c, $$3))
         );
   }

   static fnd b(djl $$0, akv $$1, akv $$2, akv $$3) {
      return fng.a($$0)
         .a(
            fnh.a(dxm.U, dxm.ai, dxm.bl)
               .a(jn.f, dxu.b, dye.a, fnj.a().a(fnk.c, $$2))
               .a(jn.e, dxu.b, dye.a, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxu.b, dye.a, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxu.b, dye.a, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxu.b, dye.e, fnj.a().a(fnk.c, $$3))
               .a(jn.e, dxu.b, dye.e, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxu.b, dye.e, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxu.b, dye.e, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxu.b, dye.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.e, dxu.b, dye.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.d, dxu.b, dye.d, fnj.a().a(fnk.c, $$3))
               .a(jn.c, dxu.b, dye.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxu.b, dye.c, fnj.a().a(fnk.c, $$1))
               .a(jn.e, dxu.b, dye.c, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxu.b, dye.c, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxu.b, dye.c, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxu.b, dye.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.e, dxu.b, dye.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.d, dxu.b, dye.b, fnj.a().a(fnk.c, $$1))
               .a(jn.c, dxu.b, dye.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxu.a, dye.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.e, dxu.a, dye.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxu.a, dye.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxu.a, dye.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxu.a, dye.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.e, dxu.a, dye.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.d, dxu.a, dye.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.c, dxu.a, dye.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxu.a, dye.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.e, dxu.a, dye.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxu.a, dye.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxu.a, dye.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxu.a, dye.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.e, dxu.a, dye.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.d, dxu.a, dye.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.c, dxu.a, dye.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxu.a, dye.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.e, dxu.a, dye.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxu.a, dye.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxu.a, dye.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
         );
   }

   private static fnd c(djl $$0, akv $$1, akv $$2, akv $$3) {
      return fng.a($$0)
         .a(
            fnh.a(dxm.U, dxm.ai, dxm.z)
               .a(jn.c, dxu.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.d, dxu.b, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
               .a(jn.f, dxu.b, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
               .a(jn.e, dxu.b, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
               .a(jn.c, dxu.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.d, dxu.a, false, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
               .a(jn.f, dxu.a, false, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
               .a(jn.e, dxu.a, false, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
               .a(jn.c, dxu.b, true, fnj.a().a(fnk.c, $$3))
               .a(jn.d, dxu.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(jn.f, dxu.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(jn.e, dxu.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
               .a(jn.c, dxu.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c))
               .a(jn.d, dxu.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.a))
               .a(jn.f, dxu.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d))
               .a(jn.e, dxu.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b))
         );
   }

   private static fnd d(djl $$0, akv $$1, akv $$2, akv $$3) {
      return fng.a($$0)
         .a(
            fnh.a(dxm.U, dxm.ai, dxm.z)
               .a(jn.c, dxu.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.d, dxu.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.f, dxu.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.e, dxu.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.c, dxu.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.d, dxu.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.f, dxu.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.e, dxu.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.c, dxu.b, true, fnj.a().a(fnk.c, $$3))
               .a(jn.d, dxu.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(jn.f, dxu.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(jn.e, dxu.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
               .a(jn.c, dxu.a, true, fnj.a().a(fnk.c, $$3))
               .a(jn.d, dxu.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(jn.f, dxu.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(jn.e, dxu.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
         );
   }

   static fng c(djl $$0, akv $$1) {
      return fng.a($$0, fnj.a().a(fnk.c, $$1));
   }

   private static fnh f() {
      return fnh.a(dxm.L).a(jn.a.b, fnj.a()).a(jn.a.c, fnj.a().a(fnk.a, fnk.a.b)).a(jn.a.a, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b));
   }

   static fnd a(djl $$0, fnt $$1, BiConsumer<akv, fnp> $$2) {
      akv $$3 = fns.g.a($$0, $$1, $$2);
      akv $$4 = fns.h.a($$0, $$1, $$2);
      akv $$5 = fns.i.a($$0, $$1, $$2);
      akv $$6 = fns.j.a($$0, $$1, $$2);
      return fng.a($$0, fnj.a().a(fnk.c, $$6))
         .a(fnh.a(dxm.L).a(jn.a.a, fnj.a().a(fnk.c, $$3)).a(jn.a.b, fnj.a().a(fnk.c, $$4)).a(jn.a.c, fnj.a().a(fnk.c, $$5)));
   }

   static fnd d(djl $$0, akv $$1) {
      return fng.a($$0, fnj.a().a(fnk.c, $$1)).a(f());
   }

   private void e(djl $$0, akv $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(djl $$0, fnv.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(djl $$0, fnv.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, $$2)).a(b()));
   }

   static fnd d(djl $$0, akv $$1, akv $$2) {
      return fng.a($$0)
         .a(
            fnh.a(dxm.L)
               .a(jn.a.b, fnj.a().a(fnk.c, $$1))
               .a(jn.a.c, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.b))
               .a(jn.a.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
         );
   }

   private void a(djl $$0, fnv.a $$1, fnv.a $$2) {
      akv $$3 = $$1.create($$0, this.d);
      akv $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(djl $$0) {
      Function<fnv.a, akv> $$1 = $$1x -> $$1x.updateTexture($$1xx -> $$1xx.a(fnu.i, fnt.a($$0, "_active")))
            .updateTexture($$1xx -> $$1xx.a(fnu.d, fnt.a($$0, "_top_active")))
            .createWithSuffix($$0, "_active", this.d);
      akv $$2 = fnv.w.create($$0, this.d);
      akv $$3 = fnv.x.create($$0, this.d);
      akv $$4 = $$1.apply(fnv.w);
      akv $$5 = $$1.apply(fnv.x);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxm.L, dlg.c)
                     .a(jn.a.b, false, fnj.a().a(fnk.c, $$2))
                     .a(jn.a.c, false, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.b))
                     .a(jn.a.a, false, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
                     .a(jn.a.b, true, fnj.a().a(fnk.c, $$4))
                     .a(jn.a.c, true, fnj.a().a(fnk.c, $$5).a(fnk.a, fnk.a.b))
                     .a(jn.a.a, true, fnj.a().a(fnk.c, $$5).a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
               )
         );
   }

   private akv a(djl $$0, String $$1, fnr $$2, Function<akv, fnt> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fnt.a($$0, $$1)), this.d);
   }

   static fnd e(djl $$0, akv $$1, akv $$2) {
      return fng.a($$0).a(a(dxm.B, $$2, $$1));
   }

   static fnd e(djl $$0, akv $$1, akv $$2, akv $$3) {
      return fng.a($$0).a(fnh.a(dxm.bk).a(dyd.b, fnj.a().a(fnk.c, $$1)).a(dyd.a, fnj.a().a(fnk.c, $$2)).a(dyd.c, fnj.a().a(fnk.c, $$3)));
   }

   public void a(djl $$0) {
      this.b($$0, fnv.a);
   }

   public void b(djl $$0, fnv.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(djl $$0, fnv.a $$1, int $$2) {
      akv $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fno.a($$2));
   }

   private void g() {
      this.J(djn.ft);
      akv $$0 = this.a(cws.gk, djn.ft);
      this.a(djn.ft, $$0, fno.a(-12012264));
   }

   private void h(djl $$0) {
      akv $$1 = this.a($$0.j(), $$0);
      this.a($$0, $$1, new fmr());
   }

   private fmy.a i(djl $$0) {
      fnv $$1 = this.g.getOrDefault($$0, fnv.a.get($$0));
      return new fmy.a($$1.b()).a($$0, $$1.a());
   }

   public void a(djl $$0, djl $$1, djl $$2) {
      akv $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.j());
   }

   void j(djl $$0) {
      fnt $$1 = fnt.w($$0);
      akv $$2 = fns.v.a($$0, $$1, this.d);
      akv $$3 = fns.w.a($$0, $$1, this.d);
      akv $$4 = fns.x.a($$0, $$1, this.d);
      akv $$5 = fns.y.a($$0, $$1, this.d);
      akv $$6 = fns.z.a($$0, $$1, this.d);
      akv $$7 = fns.A.a($$0, $$1, this.d);
      akv $$8 = fns.B.a($$0, $$1, this.d);
      akv $$9 = fns.C.a($$0, $$1, this.d);
      this.b($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(djl $$0, djl $$1) {
      akv $$2 = fns.v.a($$0);
      akv $$3 = fns.w.a($$0);
      akv $$4 = fns.x.a($$0);
      akv $$5 = fns.y.a($$0);
      akv $$6 = fns.z.a($$0);
      akv $$7 = fns.A.a($$0);
      akv $$8 = fns.B.a($$0);
      akv $$9 = fns.C.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(djl $$0) {
      fnt $$1 = fnt.b($$0);
      akv $$2 = fns.ak.a($$0, $$1, this.d);
      akv $$3 = fns.al.a($$0, $$1, this.d);
      akv $$4 = fns.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(djl $$0) {
      fnt $$1 = fnt.b($$0);
      akv $$2 = fns.ah.a($$0, $$1, this.d);
      akv $$3 = fns.ai.a($$0, $$1, this.d);
      akv $$4 = fns.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(djl $$0, djl $$1) {
      akv $$2 = fns.ah.a($$0);
      akv $$3 = fns.ai.a($$0);
      akv $$4 = fns.aj.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      akv $$0 = fnq.a(djn.tf);
      akv $$1 = fnq.a(djn.tf, "_partial_tilt");
      akv $$2 = fnq.a(djn.tf, "_full_tilt");
      this.b
         .accept(
            fng.a(djn.tf)
               .a(b())
               .a(fnh.a(dxm.bo).a(dyg.a, fnj.a().a(fnk.c, $$0)).a(dyg.b, fnj.a().a(fnk.c, $$0)).a(dyg.c, fnj.a().a(fnk.c, $$1)).a(dyg.d, fnj.a().a(fnk.c, $$2)))
         );
   }

   private fmy.e m(djl $$0) {
      return new fmy.e(fnt.q($$0));
   }

   private void n(djl $$0) {
      this.d($$0, $$0);
   }

   private void d(djl $$0, djl $$1) {
      this.b.accept(c($$0, fnq.a($$1)));
   }

   private void a(djl $$0, fmy.d $$1) {
      this.a($$0.j(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(djl $$0, fmy.d $$1, fnt $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djl $$0, fmy.d $$1) {
      fnt $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djl $$0, fmy.d $$1, fnt $$2) {
      akv $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(djl $$0, fmy.d $$1, dxy<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fnh $$4 = fnh.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fnt $$5 = fnt.c(fnt.a($$0, $$4x));
            akv $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fnj.a().a(fnk.c, $$6);
         });
         this.b($$0.j());
         this.b.accept(fng.a($$0).a($$4));
      }
   }

   private void a(djl $$0, djl $$1, fmy.d $$2) {
      this.a($$0.j(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(djl $$0, djl $$1, fmy.d $$2) {
      this.b($$0, $$2);
      fnt $$3 = $$2.b($$0);
      akv $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(djl $$0, djl $$1) {
      fnv $$2 = fnv.q.get($$0);
      akv $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      akv $$4 = fns.aF.a($$1, $$2.b(), this.d);
      this.b.accept(fng.a($$1, fnj.a().a(fnk.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(djl $$0, djl $$1) {
      this.b($$0.j());
      fnt $$2 = fnt.k($$0);
      fnt $$3 = fnt.a($$0, $$1);
      akv $$4 = fns.aX.a($$1, $$3, this.d);
      this.b
         .accept(
            fng.a($$1, fnj.a().a(fnk.c, $$4))
               .a(fnh.a(dxm.U).a(jn.e, fnj.a()).a(jn.d, fnj.a().a(fnk.b, fnk.a.d)).a(jn.c, fnj.a().a(fnk.b, fnk.a.b)).a(jn.f, fnj.a().a(fnk.b, fnk.a.c)))
         );
      this.b.accept(fng.a($$0).a(fnh.a(dxm.ay).a($$2x -> fnj.a().a(fnk.c, fns.aW[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      djl $$0 = djn.le;
      this.b($$0.j());
      akv $$1 = fnq.a($$0, "_top");
      akv $$2 = fnq.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      djl $$0 = djn.ld;
      this.b($$0.j());
      fnh $$1 = fnh.a(dpe.d, dxm.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fnj.a().a(fnk.c, fnq.a($$0, "_top_stage_" + $$1x));
            case b -> fnj.a().a(fnk.c, fnq.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fng.a($$0).a($$1));
   }

   private void a(djl $$0, djl $$1, djl $$2, djl $$3, djl $$4, djl $$5, djl $$6, djl $$7) {
      this.a($$0, fmy.d.b);
      this.a($$1, fmy.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(djl $$0, fmy.d $$1) {
      akv $$2 = this.a($$0, "_top", $$1.a(), fnt::c);
      akv $$3 = this.a($$0, "_bottom", $$1.a(), fnt::c);
      this.f($$0, $$2, $$3);
   }

   private void d(djl $$0, fmy.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(djl $$0) {
      akv $$1 = this.a($$0.j(), $$0, "_top");
      this.a($$0, $$1, new fmr());
      this.c($$0, fmy.d.a);
   }

   private void k() {
      this.a(djn.jb, "_front");
      akv $$0 = fnq.a(djn.jb, "_top");
      akv $$1 = this.a(djn.jb, "_bottom", fmy.d.b.a(), fnt::c);
      this.f(djn.jb, $$0, $$1);
   }

   private void l() {
      akv $$0 = this.a(djn.bE, "_top", fns.br, fnt::a);
      akv $$1 = this.a(djn.bE, "_bottom", fns.br, fnt::a);
      this.f(djn.bE, $$0, $$1);
   }

   private void m() {
      akv $$0 = fnq.a(djn.th, "_top");
      akv $$1 = fnq.a(djn.th, "_bottom");
      this.b.accept(fng.a(djn.th).a(b()).a(fnh.a(dxm.ah).a(dxr.b, fnj.a().a(fnk.c, $$1)).a(dxr.a, fnj.a().a(fnk.c, $$0))));
   }

   private void f(djl $$0, akv $$1, akv $$2) {
      this.b.accept(fng.a($$0).a(fnh.a(dxm.ah).a(dxr.b, fnj.a().a(fnk.c, $$2)).a(dxr.a, fnj.a().a(fnk.c, $$1))));
   }

   private void p(djl $$0) {
      fnt $$1 = fnt.h($$0);
      fnt $$2 = fnt.e(fnt.a($$0, "_corner"));
      akv $$3 = fns.au.a($$0, $$1, this.d);
      akv $$4 = fns.av.a($$0, $$2, this.d);
      akv $$5 = fns.aw.a($$0, $$1, this.d);
      akv $$6 = fns.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxm.aj)
                     .a(dxz.a, fnj.a().a(fnk.c, $$3))
                     .a(dxz.b, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
                     .a(dxz.c, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
                     .a(dxz.d, fnj.a().a(fnk.c, $$6).a(fnk.b, fnk.a.b))
                     .a(dxz.e, fnj.a().a(fnk.c, $$5))
                     .a(dxz.f, fnj.a().a(fnk.c, $$6))
                     .a(dxz.g, fnj.a().a(fnk.c, $$4))
                     .a(dxz.h, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
                     .a(dxz.i, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c))
                     .a(dxz.j, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void q(djl $$0) {
      akv $$1 = this.a($$0, "", fns.au, fnt::e);
      akv $$2 = this.a($$0, "", fns.aw, fnt::e);
      akv $$3 = this.a($$0, "", fns.ax, fnt::e);
      akv $$4 = this.a($$0, "_on", fns.au, fnt::e);
      akv $$5 = this.a($$0, "_on", fns.aw, fnt::e);
      akv $$6 = this.a($$0, "_on", fns.ax, fnt::e);
      fnh $$7 = fnh.a(dxm.B, dxm.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return fnj.a().a(fnk.c, $$6x ? $$4 : $$1);
            case b:
               return fnj.a().a(fnk.c, $$6x ? $$4 : $$1).a(fnk.b, fnk.a.b);
            case c:
               return fnj.a().a(fnk.c, $$6x ? $$5 : $$2).a(fnk.b, fnk.a.b);
            case d:
               return fnj.a().a(fnk.c, $$6x ? $$6 : $$3).a(fnk.b, fnk.a.b);
            case e:
               return fnj.a().a(fnk.c, $$6x ? $$5 : $$2);
            case f:
               return fnj.a().a(fnk.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fng.a($$0).a($$7));
   }

   private void a(djl $$0, cwk $$1) {
      akv $$2 = fns.aa.a($$0, fnt.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(djl $$0, akv $$1) {
      akv $$2 = fns.aa.a($$0, fnt.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private akv g(djl $$0, djl $$1) {
      return fns.aa.a($$0, fnt.x($$1), this.d);
   }

   public void a(djl $$0, djl $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(djl $$0) {
      this.a($$0, $$0);
   }

   private void h(djl $$0, djl $$1) {
      this.a($$0);
      akv $$2 = fnv.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(djl $$0) {
      this.b($$0.j());
      akv $$1 = fnv.l.create($$0, this.d);
      akv $$2 = fnv.m.create($$0, this.d);
      akv $$3 = fnv.n.create($$0, this.d);
      akv $$4 = fnv.o.create($$0, this.d);
      this.b
         .accept(
            fnf.a($$0)
               .a(fne.a().a(dxm.V, 1, 2, 3, 4).a(dxm.U, jn.c), fnj.a().a(fnk.c, $$1))
               .a(fne.a().a(dxm.V, 1, 2, 3, 4).a(dxm.U, jn.f), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.V, 1, 2, 3, 4).a(dxm.U, jn.d), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxm.V, 1, 2, 3, 4).a(dxm.U, jn.e), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxm.V, 2, 3, 4).a(dxm.U, jn.c), fnj.a().a(fnk.c, $$2))
               .a(fne.a().a(dxm.V, 2, 3, 4).a(dxm.U, jn.f), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.V, 2, 3, 4).a(dxm.U, jn.d), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxm.V, 2, 3, 4).a(dxm.U, jn.e), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxm.V, 3, 4).a(dxm.U, jn.c), fnj.a().a(fnk.c, $$3))
               .a(fne.a().a(dxm.V, 3, 4).a(dxm.U, jn.f), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.V, 3, 4).a(dxm.U, jn.d), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxm.V, 3, 4).a(dxm.U, jn.e), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxm.V, 4).a(dxm.U, jn.c), fnj.a().a(fnk.c, $$4))
               .a(fne.a().a(dxm.V, 4).a(dxm.U, jn.f), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.V, 4).a(dxm.U, jn.d), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxm.V, 4).a(dxm.U, jn.e), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d))
         );
   }

   private void a(fnv.a $$0, djl... $$1) {
      for (djl $$2 : $$1) {
         akv $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fnv.a $$0, djl... $$1) {
      for (djl $$2 : $$1) {
         akv $$3 = $$0.create($$2, this.d);
         this.b.accept(fng.a($$2, fnj.a().a(fnk.c, $$3)).a(c()));
      }
   }

   private void i(djl $$0, djl $$1) {
      this.a($$0);
      fnt $$2 = fnt.b($$0, $$1);
      akv $$3 = fns.aL.a($$1, $$2, this.d);
      akv $$4 = fns.aM.a($$1, $$2, this.d);
      akv $$5 = fns.aN.a($$1, $$2, this.d);
      akv $$6 = fns.aJ.a($$1, $$2, this.d);
      akv $$7 = fns.aK.a($$1, $$2, this.d);
      cwk $$8 = $$1.j();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fnf.a($$1)
               .a(fnj.a().a(fnk.c, $$3))
               .a(fne.a().a(dxm.O, true), fnj.a().a(fnk.c, $$4))
               .a(fne.a().a(dxm.P, true), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.Q, true), fnj.a().a(fnk.c, $$5))
               .a(fne.a().a(dxm.R, true), fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.O, false), fnj.a().a(fnk.c, $$6))
               .a(fne.a().a(dxm.P, false), fnj.a().a(fnk.c, $$7))
               .a(fne.a().a(dxm.Q, false), fnj.a().a(fnk.c, $$7).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.R, false), fnj.a().a(fnk.c, $$6).a(fnk.b, fnk.a.d))
         );
   }

   private void t(djl $$0) {
      fnt $$1 = fnt.C($$0);
      akv $$2 = fns.aO.a($$0, $$1, this.d);
      akv $$3 = this.a($$0, "_conditional", fns.aO, $$1x -> $$1.c(fnu.i, $$1x));
      this.b.accept(fng.a($$0).a(a(dxm.g, $$3, $$2)).a(e()));
   }

   private void u(djl $$0) {
      akv $$1 = fnv.r.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fnj> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fnj.a().a(fnk.c, fnq.a(djn.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fnf.a(djn.nB)
               .a(fne.a().a(dxm.at, 0), this.a(0))
               .a(fne.a().a(dxm.at, 1), this.a(1))
               .a(fne.a().a(dxm.bn, dxi.b), fnj.a().a(fnk.c, fnq.a(djn.nB, "_small_leaves")))
               .a(fne.a().a(dxm.bn, dxi.c), fnj.a().a(fnk.c, fnq.a(djn.nB, "_large_leaves")))
         );
   }

   private fnh o() {
      return fnh.a(dxm.S)
         .a(jn.a, fnj.a().a(fnk.a, fnk.a.c))
         .a(jn.b, fnj.a())
         .a(jn.c, fnj.a().a(fnk.a, fnk.a.b))
         .a(jn.d, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.c))
         .a(jn.e, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.d))
         .a(jn.f, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b));
   }

   private void p() {
      akv $$0 = fnt.a(djn.ow, "_top_open");
      this.b
         .accept(
            fng.a(djn.ow)
               .a(this.o())
               .a(
                  fnh.a(dxm.z)
                     .a(false, fnj.a().a(fnk.c, fnv.f.create(djn.ow, this.d)))
                     .a(true, fnj.a().a(fnk.c, fnv.f.get(djn.ow).a($$1 -> $$1.a(fnu.f, $$0)).a(djn.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fnh a(dxy<T> $$0, T $$1, akv $$2, akv $$3) {
      fnj $$4 = fnj.a().a(fnk.c, $$2);
      fnj $$5 = fnj.a().a(fnk.c, $$3);
      return fnh.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(djl $$0, Function<djl, fnt> $$1) {
      fnt $$2 = $$1.apply($$0).b(fnu.i, fnu.c);
      fnt $$3 = $$2.c(fnu.g, fnt.a($$0, "_front_honey"));
      akv $$4 = fns.q.a($$0, "_empty", $$2, this.d);
      akv $$5 = fns.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.j(), fno.a(djf.c, fno.a($$4), Map.of(5, fno.a($$5))));
      this.b.accept(fng.a($$0).a(b()).a(a(djf.c, 5, $$5, $$4)));
   }

   private void a(djl $$0, dxy<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akv> $$3 = new Int2ObjectOpenHashMap();
         fnh $$4 = fnh.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akv $$5 = (akv)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, fns.aY, fnt::g));
            return fnj.a().a(fnk.c, $$5);
         });
         this.b($$0.j());
         this.b.accept(fng.a($$0).a($$4));
      }
   }

   private void q() {
      akv $$0 = fnq.a(djn.oF, "_floor");
      akv $$1 = fnq.a(djn.oF, "_ceiling");
      akv $$2 = fnq.a(djn.oF, "_wall");
      akv $$3 = fnq.a(djn.oF, "_between_walls");
      this.b(cws.xs);
      this.b
         .accept(
            fng.a(djn.oF)
               .a(
                  fnh.a(dxm.U, dxm.Y)
                     .a(jn.c, dxk.a, fnj.a().a(fnk.c, $$0))
                     .a(jn.d, dxk.a, fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c))
                     .a(jn.f, dxk.a, fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b))
                     .a(jn.e, dxk.a, fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d))
                     .a(jn.c, dxk.b, fnj.a().a(fnk.c, $$1))
                     .a(jn.d, dxk.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
                     .a(jn.f, dxk.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
                     .a(jn.e, dxk.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
                     .a(jn.c, dxk.c, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
                     .a(jn.d, dxk.c, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
                     .a(jn.f, dxk.c, fnj.a().a(fnk.c, $$2))
                     .a(jn.e, dxk.c, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
                     .a(jn.d, dxk.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
                     .a(jn.c, dxk.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
                     .a(jn.f, dxk.d, fnj.a().a(fnk.c, $$3))
                     .a(jn.e, dxk.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fng.a(djn.oB, fnj.a().a(fnk.c, fnq.a(djn.oB)))
               .a(
                  fnh.a(dxm.X, dxm.U)
                     .a(dxh.a, jn.c, fnj.a())
                     .a(dxh.a, jn.f, fnj.a().a(fnk.b, fnk.a.b))
                     .a(dxh.a, jn.d, fnj.a().a(fnk.b, fnk.a.c))
                     .a(dxh.a, jn.e, fnj.a().a(fnk.b, fnk.a.d))
                     .a(dxh.b, jn.c, fnj.a().a(fnk.a, fnk.a.b))
                     .a(dxh.b, jn.f, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
                     .a(dxh.b, jn.d, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.c))
                     .a(dxh.b, jn.e, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.d))
                     .a(dxh.c, jn.d, fnj.a().a(fnk.a, fnk.a.c))
                     .a(dxh.c, jn.e, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b))
                     .a(dxh.c, jn.c, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c))
                     .a(dxh.c, jn.f, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void d(djl $$0, fnv.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      akv $$3 = fnt.a($$0, "_front_on");
      akv $$4 = $$1.get($$0).a($$1x -> $$1x.a(fnu.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fng.a($$0).a(a(dxm.v, $$4, $$2)).a(b()));
   }

   private void a(djl... $$0) {
      akv $$1 = fnq.a("campfire_off");

      for (djl $$2 : $$0) {
         akv $$3 = fns.bf.a($$2, fnt.H($$2), this.d);
         this.b($$2.j());
         this.b.accept(fng.a($$2).a(a(dxm.v, $$3, $$1)).a(c()));
      }
   }

   private void v(djl $$0) {
      akv $$1 = fns.bA.a($$0, fnt.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void w(djl $$0) {
      akv $$1;
      if ($$0 == djn.tL) {
         $$1 = fns.bC.a($$0, fnt.p($$0), this.d);
      } else {
         $$1 = fns.bB.a($$0, fnt.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fnt $$0 = fnt.a(fnt.J(djn.cs), fnt.J(djn.n));
      akv $$1 = fns.j.a(djn.cs, $$0, this.d);
      this.b.accept(c(djn.cs, $$1));
   }

   private void t() {
      this.b(cws.me);
      this.b
         .accept(
            fnf.a(djn.cE)
               .a(
                  fne.b(
                     fne.a().a(dxm.ae, dya.c).a(dxm.ad, dya.c).a(dxm.af, dya.c).a(dxm.ag, dya.c),
                     fne.a().a(dxm.ae, dya.b, dya.a).a(dxm.ad, dya.b, dya.a),
                     fne.a().a(dxm.ad, dya.b, dya.a).a(dxm.af, dya.b, dya.a),
                     fne.a().a(dxm.af, dya.b, dya.a).a(dxm.ag, dya.b, dya.a),
                     fne.a().a(dxm.ag, dya.b, dya.a).a(dxm.ae, dya.b, dya.a)
                  ),
                  fnj.a().a(fnk.c, fnq.a("redstone_dust_dot"))
               )
               .a(fne.a().a(dxm.ae, dya.b, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side0")))
               .a(fne.a().a(dxm.af, dya.b, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side_alt0")))
               .a(fne.a().a(dxm.ad, dya.b, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side_alt1")).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxm.ag, dya.b, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side1")).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxm.ae, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")))
               .a(fne.a().a(dxm.ad, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.af, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxm.ag, dya.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")).a(fnk.b, fnk.a.d))
         );
   }

   private void u() {
      this.b(cws.mi);
      this.b
         .accept(
            fng.a(djn.hv)
               .a(c())
               .a(
                  fnh.a(dxm.bg, dxm.B)
                     .a(dxp.a, false, fnj.a().a(fnk.c, fnq.a(djn.hv)))
                     .a(dxp.a, true, fnj.a().a(fnk.c, fnq.a(djn.hv, "_on")))
                     .a(dxp.b, false, fnj.a().a(fnk.c, fnq.a(djn.hv, "_subtract")))
                     .a(dxp.b, true, fnj.a().a(fnk.c, fnq.a(djn.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fnt $$0 = fnt.a(djn.kq);
      fnt $$1 = fnt.a(fnt.a(djn.kd, "_side"), $$0.a(fnu.f));
      akv $$2 = fns.ab.a(djn.kd, $$1, this.d);
      akv $$3 = fns.ac.a(djn.kd, $$1, this.d);
      akv $$4 = fns.j.b(djn.kd, "_double", $$1, this.d);
      this.b.accept(e(djn.kd, $$2, $$3, $$4));
      this.b.accept(c(djn.kq, fns.c.a(djn.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cws.tn);
      this.b
         .accept(
            fnf.a(djn.fN)
               .a(fnj.a().a(fnk.c, fnt.J(djn.fN)))
               .a(fne.a().a(dxm.o, true), fnj.a().a(fnk.c, fnt.a(djn.fN, "_bottle0")))
               .a(fne.a().a(dxm.p, true), fnj.a().a(fnk.c, fnt.a(djn.fN, "_bottle1")))
               .a(fne.a().a(dxm.q, true), fnj.a().a(fnk.c, fnt.a(djn.fN, "_bottle2")))
               .a(fne.a().a(dxm.o, false), fnj.a().a(fnk.c, fnt.a(djn.fN, "_empty0")))
               .a(fne.a().a(dxm.p, false), fnj.a().a(fnk.c, fnt.a(djn.fN, "_empty1")))
               .a(fne.a().a(dxm.q, false), fnj.a().a(fnk.c, fnt.a(djn.fN, "_empty2")))
         );
   }

   private void x(djl $$0) {
      akv $$1 = fns.bw.a($$0, fnt.b($$0), this.d);
      akv $$2 = fnq.a("mushroom_block_inside");
      this.b
         .accept(
            fnf.a($$0)
               .a(fne.a().a(dxm.O, true), fnj.a().a(fnk.c, $$1))
               .a(fne.a().a(dxm.P, true), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxm.Q, true), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(fne.a().a(dxm.R, true), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxm.M, true), fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxm.N, true), fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxm.O, false), fnj.a().a(fnk.c, $$2))
               .a(fne.a().a(dxm.P, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, false))
               .a(fne.a().a(dxm.Q, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, false))
               .a(fne.a().a(dxm.R, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, false))
               .a(fne.a().a(dxm.M, false), fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.d).a(fnk.d, false))
               .a(fne.a().a(dxm.N, false), fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.b).a(fnk.d, false))
         );
      this.a($$0, fnv.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cws.sy);
      this.b
         .accept(
            fng.a(djn.et)
               .a(
                  fnh.a(dxm.aB)
                     .a(0, fnj.a().a(fnk.c, fnq.a(djn.et)))
                     .a(1, fnj.a().a(fnk.c, fnq.a(djn.et, "_slice1")))
                     .a(2, fnj.a().a(fnk.c, fnq.a(djn.et, "_slice2")))
                     .a(3, fnj.a().a(fnk.c, fnq.a(djn.et, "_slice3")))
                     .a(4, fnj.a().a(fnk.c, fnq.a(djn.et, "_slice4")))
                     .a(5, fnj.a().a(fnk.c, fnq.a(djn.et, "_slice5")))
                     .a(6, fnj.a().a(fnk.c, fnq.a(djn.et, "_slice6")))
               )
         );
   }

   private void y() {
      fnt $$0 = new fnt()
         .a(fnu.c, fnt.a(djn.oz, "_side3"))
         .a(fnu.o, fnt.J(djn.t))
         .a(fnu.n, fnt.a(djn.oz, "_top"))
         .a(fnu.j, fnt.a(djn.oz, "_side3"))
         .a(fnu.l, fnt.a(djn.oz, "_side3"))
         .a(fnu.k, fnt.a(djn.oz, "_side1"))
         .a(fnu.m, fnt.a(djn.oz, "_side2"));
      this.b.accept(c(djn.oz, fns.a.a(djn.oz, $$0, this.d)));
   }

   private void z() {
      fnt $$0 = new fnt()
         .a(fnu.c, fnt.a(djn.oD, "_front"))
         .a(fnu.o, fnt.a(djn.oD, "_bottom"))
         .a(fnu.n, fnt.a(djn.oD, "_top"))
         .a(fnu.j, fnt.a(djn.oD, "_front"))
         .a(fnu.k, fnt.a(djn.oD, "_front"))
         .a(fnu.l, fnt.a(djn.oD, "_side"))
         .a(fnu.m, fnt.a(djn.oD, "_side"));
      this.b.accept(c(djn.oD, fns.a.a(djn.oD, $$0, this.d)));
   }

   private void a(djl $$0, djl $$1, BiFunction<djl, djl, fnt> $$2) {
      fnt $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, fns.a.a($$0, $$3, this.d)));
   }

   public void b(djl $$0) {
      fnt $$1 = new fnt()
         .a(fnu.c, fnt.a($$0, "_particle"))
         .a(fnu.o, fnt.a($$0, "_down"))
         .a(fnu.n, fnt.a($$0, "_up"))
         .a(fnu.j, fnt.a($$0, "_north"))
         .a(fnu.k, fnt.a($$0, "_south"))
         .a(fnu.l, fnt.a($$0, "_east"))
         .a(fnu.m, fnt.a($$0, "_west"));
      this.b.accept(c($$0, fns.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fnt $$0 = fnt.n(djn.fn);
      this.b.accept(c(djn.fn, fnq.a(djn.fn)));
      this.a(djn.er, $$0);
      this.a(djn.es, $$0);
   }

   private void a(djl $$0, fnt $$1) {
      akv $$2 = fns.p.a($$0, $$1.c(fnu.g, fnt.J($$0)), this.d);
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cws.to);
      this.n(djn.fO);
      this.b.accept(c(djn.fQ, fns.bz.a(djn.fQ, fnt.j(fnt.a(djn.K, "_still")), this.d)));
      this.b
         .accept(
            fng.a(djn.fP)
               .a(
                  fnh.a(dnw.g)
                     .a(1, fnj.a().a(fnk.c, fns.bx.a(djn.fP, "_level1", fnt.j(fnt.a(djn.J, "_still")), this.d)))
                     .a(2, fnj.a().a(fnk.c, fns.by.a(djn.fP, "_level2", fnt.j(fnt.a(djn.J, "_still")), this.d)))
                     .a(3, fnj.a().a(fnk.c, fns.bz.a(djn.fP, "_full", fnt.j(fnt.a(djn.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fng.a(djn.fR)
               .a(
                  fnh.a(dnw.g)
                     .a(1, fnj.a().a(fnk.c, fns.bx.a(djn.fR, "_level1", fnt.j(fnt.J(djn.rr)), this.d)))
                     .a(2, fnj.a().a(fnk.c, fns.by.a(djn.fR, "_level2", fnt.j(fnt.J(djn.rr)), this.d)))
                     .a(3, fnj.a().a(fnk.c, fns.bz.a(djn.fR, "_full", fnt.j(fnt.J(djn.rr)), this.d)))
               )
         );
   }

   private void C() {
      fnt $$0 = fnt.b(djn.kX);
      akv $$1 = fns.aH.a(djn.kX, $$0, this.d);
      akv $$2 = this.a(djn.kX, "_dead", fns.aH, $$1x -> $$0.c(fnu.b, $$1x));
      this.b.accept(fng.a(djn.kX).a(a(dxm.ax, 5, $$2, $$1)));
   }

   private void D() {
      akv $$0 = fnq.a(djn.tS);
      akv $$1 = fnq.a(djn.tS, "_triggered");
      akv $$2 = fnq.a(djn.tS, "_crafting");
      akv $$3 = fnq.a(djn.tS, "_crafting_triggered");
      this.b
         .accept(
            fng.a(djn.tS)
               .a(fnh.a(dxm.W).a($$0x -> this.a($$0x, fnj.a())))
               .a(
                  fnh.a(dxm.H, dle.b)
                     .a(false, false, fnj.a().a(fnk.c, $$0))
                     .a(true, true, fnj.a().a(fnk.c, $$3))
                     .a(true, false, fnj.a().a(fnk.c, $$1))
                     .a(false, true, fnj.a().a(fnk.c, $$2))
               )
         );
   }

   private void y(djl $$0) {
      fnt $$1 = new fnt().a(fnu.f, fnt.a(djn.cL, "_top")).a(fnu.i, fnt.a(djn.cL, "_side")).a(fnu.g, fnt.a($$0, "_front"));
      fnt $$2 = new fnt().a(fnu.i, fnt.a(djn.cL, "_top")).a(fnu.g, fnt.a($$0, "_front_vertical"));
      akv $$3 = fns.p.a($$0, $$1, this.d);
      akv $$4 = fns.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxm.S)
                     .a(jn.a, fnj.a().a(fnk.c, $$4).a(fnk.a, fnk.a.c))
                     .a(jn.b, fnj.a().a(fnk.c, $$4))
                     .a(jn.c, fnj.a().a(fnk.c, $$3))
                     .a(jn.f, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
                     .a(jn.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
                     .a(jn.e, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void E() {
      akv $$0 = fnq.a(djn.fT);
      akv $$1 = fnq.a(djn.fT, "_filled");
      this.b.accept(fng.a(djn.fT).a(fnh.a(dxm.l).a(false, fnj.a().a(fnk.c, $$0)).a(true, fnj.a().a(fnk.c, $$1))).a(c()));
   }

   private void F() {
      akv $$0 = fnq.a(djn.kW, "_side");
      akv $$1 = fnq.a(djn.kW, "_noside");
      akv $$2 = fnq.a(djn.kW, "_noside1");
      akv $$3 = fnq.a(djn.kW, "_noside2");
      akv $$4 = fnq.a(djn.kW, "_noside3");
      this.b
         .accept(
            fnf.a(djn.kW)
               .a(fne.a().a(dxm.O, true), fnj.a().a(fnk.c, $$0))
               .a(fne.a().a(dxm.P, true), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxm.Q, true), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(fne.a().a(dxm.R, true), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxm.M, true), fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxm.N, true), fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxm.O, false), fnj.a().a(fnk.c, $$1).a(fnk.e, 2), fnj.a().a(fnk.c, $$2), fnj.a().a(fnk.c, $$3), fnj.a().a(fnk.c, $$4))
               .a(
                  fne.a().a(dxm.P, false),
                  fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.b, fnk.a.b).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxm.Q, false),
                  fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.b, fnk.a.c).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxm.R, false),
                  fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.b, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxm.M, false),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.a, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$4).a(fnk.a, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.d).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxm.N, false),
                  fnj.a().a(fnk.c, $$4).a(fnk.a, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.a, fnk.a.b).a(fnk.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fnf.a(djn.pE)
               .a(fnj.a().a(fnk.c, fnt.J(djn.pE)))
               .a(fne.a().a(dxm.aO, 1), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents1")))
               .a(fne.a().a(dxm.aO, 2), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents2")))
               .a(fne.a().a(dxm.aO, 3), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents3")))
               .a(fne.a().a(dxm.aO, 4), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents4")))
               .a(fne.a().a(dxm.aO, 5), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents5")))
               .a(fne.a().a(dxm.aO, 6), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents6")))
               .a(fne.a().a(dxm.aO, 7), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents7")))
               .a(fne.a().a(dxm.aO, 8), fnj.a().a(fnk.c, fnt.a(djn.pE, "_contents_ready")))
         );
   }

   private void z(djl $$0) {
      akv $$1 = fns.c.a($$0, fnt.a($$0), this.d);
      akv $$2 = this.a($$0, "_powered", fns.c, fnt::b);
      akv $$3 = this.a($$0, "_lit", fns.c, fnt::b);
      akv $$4 = this.a($$0, "_lit_powered", fns.c, fnt::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fnd a(djl $$0, akv $$1, akv $$2, akv $$3, akv $$4) {
      return fng.a($$0).a(fnh.a(dxm.v, dxm.B).a(($$4x, $$5) -> $$4x ? fnj.a().a(fnk.c, $$5 ? $$4 : $$2) : fnj.a().a(fnk.c, $$5 ? $$3 : $$1)));
   }

   private void j(djl $$0, djl $$1) {
      akv $$2 = fnq.a($$0);
      akv $$3 = fnq.a($$0, "_powered");
      akv $$4 = fnq.a($$0, "_lit");
      akv $$5 = fnq.a($$0, "_lit_powered");
      this.c.a($$0.j(), $$1.j());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void A(djl $$0) {
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fns.ao.a($$0, fnt.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.A(djn.ra);
      this.A(djn.qZ);
      this.A(djn.qY);
      this.A(djn.qX);
   }

   private void I() {
      fnh.b<jn, dxs> $$0 = fnh.a(dxm.bp, dxm.bq);

      for (dxs $$1 : dxs.values()) {
         $$0.a(jn.b, $$1, this.a(jn.b, $$1));
      }

      for (dxs $$2 : dxs.values()) {
         $$0.a(jn.a, $$2, this.a(jn.a, $$2));
      }

      this.b.accept(fng.a(djn.sV).a($$0));
   }

   private fnj a(jn $$0, dxs $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fnt $$3 = fnt.c(fnt.a(djn.sV, $$2));
      return fnj.a().a(fnk.c, fns.an.a(djn.sV, $$2, $$3, this.d));
   }

   private void B(djl $$0) {
      fnt $$1 = new fnt().a(fnu.e, fnt.J(djn.ei)).a(fnu.f, fnt.J($$0)).a(fnu.i, fnt.a($$0, "_side"));
      this.b.accept(c($$0, fns.n.a($$0, $$1, this.d)));
   }

   private void J() {
      akv $$0 = fnt.a(djn.hw, "_side");
      fnt $$1 = new fnt().a(fnu.f, fnt.a(djn.hw, "_top")).a(fnu.i, $$0);
      fnt $$2 = new fnt().a(fnu.f, fnt.a(djn.hw, "_inverted_top")).a(fnu.i, $$0);
      this.b
         .accept(
            fng.a(djn.hw)
               .a(
                  fnh.a(dxm.t)
                     .a(false, fnj.a().a(fnk.c, fns.aI.a(djn.hw, $$1, this.d)))
                     .a(true, fnj.a().a(fnk.c, fns.aI.a(fnq.a(djn.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void C(djl $$0) {
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fnq.a($$0))).a(this.o()));
   }

   private void K() {
      djl $$0 = djn.sU;
      akv $$1 = fnq.a($$0, "_on");
      akv $$2 = fnq.a($$0);
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fnq.a($$0))).a(this.o()).a(a(dxm.B, $$1, $$2)));
   }

   private void L() {
      fnt $$0 = new fnt().a(fnu.C, fnt.J(djn.j)).a(fnu.f, fnt.J(djn.cK));
      fnt $$1 = new fnt().a(fnu.C, fnt.J(djn.j)).a(fnu.f, fnt.a(djn.cK, "_moist"));
      akv $$2 = fns.aZ.a(djn.cK, $$0, this.d);
      akv $$3 = fns.aZ.a(fnt.a(djn.cK, "_moist"), $$1, this.d);
      this.b.accept(fng.a(djn.cK).a(a(dxm.aT, 7, $$3, $$2)));
   }

   private List<akv> D(djl $$0) {
      akv $$1 = fns.ba.a(fnq.a($$0, "_floor0"), fnt.y($$0), this.d);
      akv $$2 = fns.ba.a(fnq.a($$0, "_floor1"), fnt.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<akv> E(djl $$0) {
      akv $$1 = fns.bb.a(fnq.a($$0, "_side0"), fnt.y($$0), this.d);
      akv $$2 = fns.bb.a(fnq.a($$0, "_side1"), fnt.z($$0), this.d);
      akv $$3 = fns.bc.a(fnq.a($$0, "_side_alt0"), fnt.y($$0), this.d);
      akv $$4 = fns.bc.a(fnq.a($$0, "_side_alt1"), fnt.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akv> F(djl $$0) {
      akv $$1 = fns.bd.a(fnq.a($$0, "_up0"), fnt.y($$0), this.d);
      akv $$2 = fns.bd.a(fnq.a($$0, "_up1"), fnt.z($$0), this.d);
      akv $$3 = fns.be.a(fnq.a($$0, "_up_alt0"), fnt.y($$0), this.d);
      akv $$4 = fns.be.a(fnq.a($$0, "_up_alt1"), fnt.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fnj> a(List<akv> $$0, UnaryOperator<fnj> $$1) {
      return $$0.stream().map($$0x -> fnj.a().a(fnk.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fne $$0 = fne.a().a(dxm.O, false).a(dxm.P, false).a(dxm.Q, false).a(dxm.R, false).a(dxm.M, false);
      List<akv> $$1 = this.D(djn.cy);
      List<akv> $$2 = this.E(djn.cy);
      List<akv> $$3 = this.F(djn.cy);
      this.b
         .accept(
            fnf.a(djn.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fne.b(fne.a().a(dxm.O, true), $$0), a($$2, $$0x -> $$0x))
               .a(fne.b(fne.a().a(dxm.P, true), $$0), a($$2, $$0x -> $$0x.a(fnk.b, fnk.a.b)))
               .a(fne.b(fne.a().a(dxm.Q, true), $$0), a($$2, $$0x -> $$0x.a(fnk.b, fnk.a.c)))
               .a(fne.b(fne.a().a(dxm.R, true), $$0), a($$2, $$0x -> $$0x.a(fnk.b, fnk.a.d)))
               .a(fne.a().a(dxm.M, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<akv> $$0 = this.D(djn.cz);
      List<akv> $$1 = this.E(djn.cz);
      this.b
         .accept(
            fnf.a(djn.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fnk.b, fnk.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fnk.b, fnk.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fnk.b, fnk.a.d)))
         );
   }

   private void G(djl $$0) {
      akv $$1 = fnv.t.create($$0, this.d);
      akv $$2 = fnv.u.create($$0, this.d);
      this.b($$0.j());
      this.b.accept(fng.a($$0).a(a(dxm.n, $$2, $$1)));
   }

   private void O() {
      fnt $$0 = fnt.a(fnt.a(djn.ah, "_side"), fnt.a(djn.ah, "_top"));
      akv $$1 = fns.j.a(djn.ah, $$0, this.d);
      this.b.accept(d(djn.ah, $$1));
   }

   private void P() {
      this.b(cws.af);
      djl $$0 = djn.H;
      fnh.b<Boolean, Integer> $$1 = fnh.a(doi.d, doi.b);
      akv $$2 = fnq.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akv $$4 = fnq.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fnj.a().a(fnk.c, $$4));
         $$1.a(false, $$3, fnj.a().a(fnk.c, $$2));
      }

      this.b.accept(fng.a(djn.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fng.a(djn.lk)
               .a(
                  fnh.a(dxm.av)
                     .a(0, fnj.a().a(fnk.c, this.a(djn.lk, "_0", fns.c, fnt::b)))
                     .a(1, fnj.a().a(fnk.c, this.a(djn.lk, "_1", fns.c, fnt::b)))
                     .a(2, fnj.a().a(fnk.c, this.a(djn.lk, "_2", fns.c, fnt::b)))
                     .a(3, fnj.a().a(fnk.c, this.a(djn.lk, "_3", fns.c, fnt::b)))
               )
         );
   }

   private void R() {
      akv $$0 = fnt.J(djn.j);
      fnt $$1 = new fnt().a(fnu.e, $$0).b(fnu.e, fnu.c).a(fnu.f, fnt.a(djn.i, "_top")).a(fnu.i, fnt.a(djn.i, "_snow"));
      fnj $$2 = fnj.a().a(fnk.c, fns.n.a(djn.i, "_snow", $$1, this.d));
      this.a(djn.i, fnq.a(djn.i), $$2);
      this.a(djn.i, fnq.a(djn.i), new fmr());
      akv $$3 = fnv.f.get(djn.fA).a($$1x -> $$1x.a(fnu.e, $$0)).a(djn.fA, this.d);
      this.a(djn.fA, $$3, $$2);
      akv $$4 = fnv.f.get(djn.l).a($$1x -> $$1x.a(fnu.e, $$0)).a(djn.l, this.d);
      this.a(djn.l, $$4, $$2);
   }

   private void a(djl $$0, akv $$1, fnj $$2) {
      List<fnj> $$3 = Arrays.asList(a($$1));
      this.b.accept(fng.a($$0).a(fnh.a(dxm.F).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cws.se);
      this.b
         .accept(
            fng.a(djn.fX)
               .a(
                  fnh.a(dxm.au)
                     .a(0, fnj.a().a(fnk.c, fnq.a(djn.fX, "_stage0")))
                     .a(1, fnj.a().a(fnk.c, fnq.a(djn.fX, "_stage1")))
                     .a(2, fnj.a().a(fnk.c, fnq.a(djn.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(djn.lg, fnq.a(djn.lg)));
   }

   private void k(djl $$0, djl $$1) {
      fnt $$2 = fnt.b($$1);
      akv $$3 = fns.Y.a($$0, $$2, this.d);
      akv $$4 = fns.Z.a($$0, $$2, this.d);
      this.b.accept(fng.a($$0).a(a(dxm.aW, 1, $$4, $$3)));
   }

   private void U() {
      akv $$0 = fnq.a(djn.hz);
      akv $$1 = fnq.a(djn.hz, "_side");
      this.b(cws.mo);
      this.b
         .accept(
            fng.a(djn.hz)
               .a(
                  fnh.a(dxm.T)
                     .a(jn.a, fnj.a().a(fnk.c, $$0))
                     .a(jn.c, fnj.a().a(fnk.c, $$1))
                     .a(jn.f, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
                     .a(jn.d, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
                     .a(jn.e, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void l(djl $$0, djl $$1) {
      akv $$2 = fnq.a($$0);
      this.b.accept(fng.a($$1, fnj.a().a(fnk.c, $$2)));
      this.c.a($$0.j(), $$1.j());
   }

   private void V() {
      akv $$0 = fnq.a(djn.fk, "_post_ends");
      akv $$1 = fnq.a(djn.fk, "_post");
      akv $$2 = fnq.a(djn.fk, "_cap");
      akv $$3 = fnq.a(djn.fk, "_cap_alt");
      akv $$4 = fnq.a(djn.fk, "_side");
      akv $$5 = fnq.a(djn.fk, "_side_alt");
      this.b
         .accept(
            fnf.a(djn.fk)
               .a(fnj.a().a(fnk.c, $$0))
               .a(fne.a().a(dxm.O, false).a(dxm.P, false).a(dxm.Q, false).a(dxm.R, false), fnj.a().a(fnk.c, $$1))
               .a(fne.a().a(dxm.O, true).a(dxm.P, false).a(dxm.Q, false).a(dxm.R, false), fnj.a().a(fnk.c, $$2))
               .a(fne.a().a(dxm.O, false).a(dxm.P, true).a(dxm.Q, false).a(dxm.R, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.O, false).a(dxm.P, false).a(dxm.Q, true).a(dxm.R, false), fnj.a().a(fnk.c, $$3))
               .a(fne.a().a(dxm.O, false).a(dxm.P, false).a(dxm.Q, false).a(dxm.R, true), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.O, true), fnj.a().a(fnk.c, $$4))
               .a(fne.a().a(dxm.P, true), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxm.Q, true), fnj.a().a(fnk.c, $$5))
               .a(fne.a().a(dxm.R, true), fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
         );
      this.c(djn.fk);
   }

   private void H(djl $$0) {
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fnq.a($$0))).a(b()));
   }

   private void W() {
      akv $$0 = fnq.a(djn.dI);
      akv $$1 = fnq.a(djn.dI, "_on");
      this.c(djn.dI);
      this.b
         .accept(
            fng.a(djn.dI)
               .a(a(dxm.B, $$0, $$1))
               .a(
                  fnh.a(dxm.X, dxm.U)
                     .a(dxh.c, jn.c, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c))
                     .a(dxh.c, jn.f, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d))
                     .a(dxh.c, jn.d, fnj.a().a(fnk.a, fnk.a.c))
                     .a(dxh.c, jn.e, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b))
                     .a(dxh.a, jn.c, fnj.a())
                     .a(dxh.a, jn.f, fnj.a().a(fnk.b, fnk.a.b))
                     .a(dxh.a, jn.d, fnj.a().a(fnk.b, fnk.a.c))
                     .a(dxh.a, jn.e, fnj.a().a(fnk.b, fnk.a.d))
                     .a(dxh.b, jn.c, fnj.a().a(fnk.a, fnk.a.b))
                     .a(dxh.b, jn.f, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
                     .a(dxh.b, jn.d, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.c))
                     .a(dxh.b, jn.e, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void X() {
      akv $$0 = this.a(cws.gx, djn.fB);
      this.a(djn.fB, $$0, fno.a(-9321636));
      this.b.accept(b(djn.fB, fnq.a(djn.fB)));
   }

   private void Y() {
      this.c(djn.tP);
      this.b.accept(c(djn.tP, fnq.a(djn.tP)));
   }

   private void Z() {
      this.b.accept(fng.a(djn.eq).a(fnh.a(dxm.K).a(jn.a.a, fnj.a().a(fnk.c, fnq.a(djn.eq, "_ns"))).a(jn.a.c, fnj.a().a(fnk.c, fnq.a(djn.eq, "_ew")))));
   }

   private void aa() {
      akv $$0 = fnv.a.create(djn.ei, this.d);
      this.b
         .accept(
            fng.a(
               djn.ei,
               fnj.a().a(fnk.c, $$0),
               fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.b),
               fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.c),
               fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.d),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b).a(fnk.a, fnk.a.b),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b).a(fnk.a, fnk.a.c),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b).a(fnk.a, fnk.a.d),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c).a(fnk.a, fnk.a.b),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c).a(fnk.a, fnk.a.c),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c).a(fnk.a, fnk.a.d),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d).a(fnk.a, fnk.a.b),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d).a(fnk.a, fnk.a.c),
               fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d).a(fnk.a, fnk.a.d)
            )
         );
   }

   private void ab() {
      akv $$0 = fnq.a(djn.lq);
      akv $$1 = fnq.a(djn.lq, "_on");
      this.b.accept(fng.a(djn.lq).a(a(dxm.B, $$1, $$0)).a(e()));
   }

   private void ac() {
      fnt $$0 = new fnt().a(fnu.e, fnt.a(djn.bF, "_bottom")).a(fnu.i, fnt.a(djn.bF, "_side"));
      akv $$1 = fnt.a(djn.bF, "_top_sticky");
      akv $$2 = fnt.a(djn.bF, "_top");
      fnt $$3 = $$0.c(fnu.F, $$1);
      fnt $$4 = $$0.c(fnu.F, $$2);
      akv $$5 = fnq.a(djn.bF, "_base");
      this.a(djn.bF, $$5, $$4);
      this.a(djn.by, $$5, $$3);
      akv $$6 = fns.n.a(djn.bF, "_inventory", $$0.c(fnu.f, $$2), this.d);
      akv $$7 = fns.n.a(djn.by, "_inventory", $$0.c(fnu.f, $$1), this.d);
      this.a(djn.bF, $$6);
      this.a(djn.by, $$7);
   }

   private void a(djl $$0, akv $$1, fnt $$2) {
      akv $$3 = fns.bo.a($$0, $$2, this.d);
      this.b.accept(fng.a($$0).a(a(dxm.k, $$1, $$3)).a(e()));
   }

   private void ad() {
      fnt $$0 = new fnt().a(fnu.G, fnt.a(djn.bF, "_top")).a(fnu.i, fnt.a(djn.bF, "_side"));
      fnt $$1 = $$0.c(fnu.F, fnt.a(djn.bF, "_top_sticky"));
      fnt $$2 = $$0.c(fnu.F, fnt.a(djn.bF, "_top"));
      this.b
         .accept(
            fng.a(djn.bG)
               .a(
                  fnh.a(dxm.C, dxm.bj)
                     .a(false, dxx.a, fnj.a().a(fnk.c, fns.bp.a(djn.bF, "_head", $$2, this.d)))
                     .a(false, dxx.b, fnj.a().a(fnk.c, fns.bp.a(djn.bF, "_head_sticky", $$1, this.d)))
                     .a(true, dxx.a, fnj.a().a(fnk.c, fns.bq.a(djn.bF, "_head_short", $$2, this.d)))
                     .a(true, dxx.b, fnj.a().a(fnk.c, fns.bq.a(djn.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      djl $$0 = djn.tT;
      fnt $$1 = fnt.a($$0, "_side_inactive", "_top_inactive");
      fnt $$2 = fnt.a($$0, "_side_active", "_top_active");
      fnt $$3 = fnt.a($$0, "_side_active", "_top_ejecting_reward");
      fnt $$4 = fnt.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fnt $$5 = fnt.a($$0, "_side_active_ominous", "_top_active_ominous");
      fnt $$6 = fnt.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akv $$7 = fns.o.a($$0, $$1, this.d);
      akv $$8 = fns.o.a($$0, "_active", $$2, this.d);
      akv $$9 = fns.o.a($$0, "_ejecting_reward", $$3, this.d);
      akv $$10 = fns.o.a($$0, "_inactive_ominous", $$4, this.d);
      akv $$11 = fns.o.a($$0, "_active_ominous", $$5, this.d);
      akv $$12 = fns.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fng.a($$0).a(fnh.a(dxm.bB, dxm.bD).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fnj.a().a(fnk.c, $$7x ? $$10 : $$7);
            case b, c, d -> fnj.a().a(fnk.c, $$7x ? $$11 : $$8);
            case e -> fnj.a().a(fnk.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      djl $$0 = djn.tU;
      fnt $$1 = fnt.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fnt $$2 = fnt.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fnt $$3 = fnt.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fnt $$4 = fnt.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akv $$5 = fns.bX.a($$0, $$1, this.d);
      akv $$6 = fns.bX.a($$0, "_active", $$2, this.d);
      akv $$7 = fns.bX.a($$0, "_unlocking", $$3, this.d);
      akv $$8 = fns.bX.a($$0, "_ejecting_reward", $$4, this.d);
      fnt $$9 = fnt.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fnt $$10 = fnt.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnt $$11 = fnt.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnt $$12 = fnt.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akv $$13 = fns.bX.a($$0, "_ominous", $$9, this.d);
      akv $$14 = fns.bX.a($$0, "_active_ominous", $$10, this.d);
      akv $$15 = fns.bX.a($$0, "_unlocking_ominous", $$11, this.d);
      akv $$16 = fns.bX.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fng.a($$0).a(b()).a(fnh.a(dsl.b, dsl.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fnj.a().a(fnk.c, $$9x ? $$13 : $$5);
            case b -> fnj.a().a(fnk.c, $$9x ? $$14 : $$6);
            case c -> fnj.a().a(fnk.c, $$9x ? $$15 : $$7);
            case d -> fnj.a().a(fnk.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      akv $$0 = fnq.a(djn.rs, "_inactive");
      akv $$1 = fnq.a(djn.rs, "_active");
      this.a(djn.rs, $$0);
      this.b.accept(fng.a(djn.rs).a(fnh.a(dxm.br).a($$2 -> fnj.a().a(fnk.c, $$2 != dyc.b && $$2 != dyc.c ? $$0 : $$1))));
   }

   private void ah() {
      akv $$0 = fnq.a(djn.rt, "_inactive");
      akv $$1 = fnq.a(djn.rt, "_active");
      this.a(djn.rt, $$0);
      this.b.accept(fng.a(djn.rt).a(fnh.a(dxm.br).a($$2 -> fnj.a().a(fnk.c, $$2 != dyc.b && $$2 != dyc.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      akv $$0 = fns.bW.a(djn.rx, fnt.a(false), this.d);
      akv $$1 = fns.bW.a(djn.rx, "_can_summon", fnt.a(true), this.d);
      this.a(djn.rx, $$0);
      this.b.accept(fng.a(djn.rx).a(a(dxm.f, $$1, $$0)));
   }

   private void aj() {
      akv $$0 = fnq.a(djn.ou, "_stable");
      akv $$1 = fnq.a(djn.ou, "_unstable");
      this.a(djn.ou, $$0);
      this.b.accept(fng.a(djn.ou).a(a(dxm.e, $$1, $$0)));
   }

   private void ak() {
      akv $$0 = this.a(djn.sX, "", fns.ao, fnt::c);
      akv $$1 = this.a(djn.sX, "_lit", fns.ao, fnt::c);
      this.b.accept(fng.a(djn.sX).a(a(dxm.c, $$1, $$0)));
      akv $$2 = this.a(djn.sY, "", fns.ao, fnt::c);
      akv $$3 = this.a(djn.sY, "_lit", fns.ao, fnt::c);
      this.b.accept(fng.a(djn.sY).a(a(dxm.c, $$3, $$2)));
   }

   private void al() {
      akv $$0 = fnv.a.create(djn.fW, this.d);
      akv $$1 = this.a(djn.fW, "_on", fns.c, fnt::b);
      this.b.accept(fng.a(djn.fW).a(a(dxm.v, $$1, $$0)));
   }

   private void m(djl $$0, djl $$1) {
      fnt $$2 = fnt.B($$0);
      this.b.accept(c($$0, fns.bi.a($$0, $$2, this.d)));
      this.b.accept(fng.a($$1, fnj.a().a(fnk.c, fns.bk.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fnt $$0 = fnt.B(djn.dX);
      fnt $$1 = fnt.i(fnt.a(djn.dX, "_off"));
      akv $$2 = fns.bm.a(djn.dX, $$0, this.d);
      akv $$3 = fns.bj.a(djn.dX, "_off", $$1, this.d);
      this.b.accept(fng.a(djn.dX).a(a(dxm.v, $$2, $$3)));
      akv $$4 = fns.bn.a(djn.dY, $$0, this.d);
      akv $$5 = fns.bl.a(djn.dY, "_off", $$1, this.d);
      this.b.accept(fng.a(djn.dY).a(a(dxm.v, $$4, $$5)).a(d()));
      this.c(djn.dX);
   }

   private void an() {
      this.b(cws.mh);
      this.b.accept(fng.a(djn.eu).a(fnh.a(dxm.aD, dxm.w, dxm.B).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fnj.a().a(fnk.c, fnt.a(djn.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cws.da);
      this.b
         .accept(
            fng.a(djn.nx)
               .a(
                  fnh.a(dxm.aV, dxm.J)
                     .a(1, false, Arrays.asList(a(fnq.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(fnq.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(fnq.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(fnq.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(fnq.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(fnq.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(fnq.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(fnq.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fnt $$0 = fnt.a(djn.ea);
      akv $$1 = fns.c.a(djn.ec, $$0, this.d);
      this.b.accept(fng.a(djn.ea).a(fnh.a(dxm.aI).a($$1x -> fnj.a().a(fnk.c, $$1x < 8 ? fnq.a(djn.ea, "_height" + $$1x * 2) : $$1))));
      this.a(djn.ea, fnq.a(djn.ea, "_height2"));
      this.b.accept(c(djn.ec, $$1));
   }

   private void aq() {
      this.b.accept(fng.a(djn.oE, fnj.a().a(fnk.c, fnq.a(djn.oE))).a(b()));
   }

   private void ar() {
      akv $$0 = fnv.a.create(djn.pC, this.d);
      this.a(djn.pC, $$0);
      this.b.accept(fng.a(djn.pC).a(fnh.a(dxm.bm).a($$0x -> fnj.a().a(fnk.c, this.a(djn.pC, "_" + $$0x.c(), fns.c, fnt::b)))));
   }

   private void as() {
      this.b(cws.xv);
      this.b.accept(fng.a(djn.oK).a(fnh.a(dxm.av).a($$0 -> fnj.a().a(fnk.c, this.a(djn.oK, "_stage" + $$0, fns.ao, fnt::c)))));
   }

   private void at() {
      this.b(cws.pX);
      this.b
         .accept(
            fng.a(djn.gd)
               .a(
                  fnh.a(dxm.b, dxm.P, dxm.O, dxm.Q, dxm.R)
                     .a(false, false, false, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_ns")))
                     .a(false, true, false, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_n")).a(fnk.b, fnk.a.b))
                     .a(false, false, true, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_n")))
                     .a(false, false, false, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_n")).a(fnk.b, fnk.a.c))
                     .a(false, false, false, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_n")).a(fnk.b, fnk.a.d))
                     .a(false, true, true, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_ne")))
                     .a(false, true, false, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_ne")).a(fnk.b, fnk.a.b))
                     .a(false, false, false, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_ne")).a(fnk.b, fnk.a.c))
                     .a(false, false, true, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_ne")).a(fnk.b, fnk.a.d))
                     .a(false, false, true, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_ns")))
                     .a(false, true, false, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_ns")).a(fnk.b, fnk.a.b))
                     .a(false, true, true, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_nse")))
                     .a(false, true, false, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_nse")).a(fnk.b, fnk.a.b))
                     .a(false, false, true, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_nse")).a(fnk.b, fnk.a.c))
                     .a(false, true, true, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_nse")).a(fnk.b, fnk.a.d))
                     .a(false, true, true, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_nsew")))
                     .a(true, false, false, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_ns")))
                     .a(true, false, true, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_n")))
                     .a(true, false, false, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_n")).a(fnk.b, fnk.a.c))
                     .a(true, true, false, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_n")).a(fnk.b, fnk.a.b))
                     .a(true, false, false, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_n")).a(fnk.b, fnk.a.d))
                     .a(true, true, true, false, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_ne")))
                     .a(true, true, false, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_ne")).a(fnk.b, fnk.a.b))
                     .a(true, false, false, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_ne")).a(fnk.b, fnk.a.c))
                     .a(true, false, true, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_ne")).a(fnk.b, fnk.a.d))
                     .a(true, false, true, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_ns")))
                     .a(true, true, false, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_ns")).a(fnk.b, fnk.a.b))
                     .a(true, true, true, true, false, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_nse")))
                     .a(true, true, false, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_nse")).a(fnk.b, fnk.a.b))
                     .a(true, false, true, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_nse")).a(fnk.b, fnk.a.c))
                     .a(true, true, true, false, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_nse")).a(fnk.b, fnk.a.d))
                     .a(true, true, true, true, true, fnj.a().a(fnk.c, fnq.a(djn.gd, "_attached_nsew")))
               )
         );
   }

   private void au() {
      this.c(djn.gc);
      this.b
         .accept(fng.a(djn.gc).a(fnh.a(dxm.b, dxm.B).a(($$0, $$1) -> fnj.a().a(fnk.c, fnt.a(djn.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akv a(int $$0, String $$1, fnt $$2) {
      switch ($$0) {
         case 1:
            return fns.bs.a(fnq.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return fns.bt.a(fnq.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return fns.bu.a(fnq.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return fns.bv.a(fnq.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akv a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fnt.b(fnt.J(djn.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fnt.b(fnt.a(djn.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fnt.b(fnt.a(djn.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void av() {
      this.b(cws.kM);
      this.b.accept(fng.a(djn.mH).a(fnh.a(dxm.aG, dxm.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void aw() {
      this.b(cws.kN);
      Function<Integer, akv> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fnt $$2 = fnt.a($$1);
         return fns.bD.a(djn.mI, $$1, $$2, this.d);
      };
      this.b.accept(fng.a(djn.mI).a(fnh.a(dqy.c).a($$1 -> fnj.a().a(fnk.c, $$0.apply($$1)))));
   }

   private void I(djl $$0) {
      this.c($$0);
      this.J($$0);
   }

   private void b(djl $$0, cwk $$1) {
      this.b($$1);
      this.J($$0);
   }

   private void J(djl $$0) {
      akv $$1 = fnq.a($$0);
      fnf $$2 = fnf.a($$0);
      fne.c $$3 = af.a(fne.a(), $$1x -> a.stream().<jn>map(Pair::getFirst).map(don::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jn, Function<akv, fnj>> $$4 : a) {
         dxn $$5 = don.b((jn)$$4.getFirst());
         Function<akv, fnj> $$6 = (Function<akv, fnj>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fne.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void K(djl $$0) {
      akv $$1 = fnv.j.create($$0, this.d);
      akv $$2 = fnv.k.get($$0).a($$1x -> $$1x.a(fnu.i, fnt.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      akv $$3 = fnv.k.get($$0).a($$1x -> $$1x.a(fnu.i, fnt.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fnf $$4 = fnf.a($$0);
      fne.c $$5 = fne.a().a(dol.b, false);
      $$4.a(fne.a().a(dol.b, true), fnj.a().a(fnk.c, $$1));
      $$4.a($$5, fnj.a().a(fnk.c, $$1));
      a.stream().<jn>map(Pair::getFirst).forEach($$2x -> {
         dxt<dyh> $$3x = dol.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dyh.a);
         }
      });

      for (Pair<jn, Function<akv, fnj>> $$6 : a) {
         jn $$7 = (jn)$$6.getFirst();
         dxt<dyh> $$8 = dol.a($$7);
         if ($$8 != null) {
            Function<akv, fnj> $$9 = (Function<akv, fnj>)$$6.getSecond();
            $$4.a(fne.a().a($$8, dyh.c), $$9.apply($$2));
            $$4.a(fne.a().a($$8, dyh.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void L(djl $$0) {
      fnh $$1 = fnh.a(dnd.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fnt $$3 = fnt.c(fnt.a($$0, $$2));
         akv $$4 = fmy.d.b.a().a($$0, $$2, $$3, this.d);
         return fnj.a().a(fnk.c, $$4);
      });
      this.c($$0);
      this.b.accept(fng.a($$0).a($$1));
   }

   private void ax() {
      akv $$0 = fnt.a(djn.rw, "_bottom");
      fnt $$1 = new fnt().a(fnu.e, $$0).a(fnu.f, fnt.a(djn.rw, "_top")).a(fnu.i, fnt.a(djn.rw, "_side"));
      fnt $$2 = new fnt().a(fnu.e, $$0).a(fnu.f, fnt.a(djn.rw, "_top_bloom")).a(fnu.i, fnt.a(djn.rw, "_side_bloom"));
      akv $$3 = fns.n.a(djn.rw, "", $$1, this.d);
      akv $$4 = fns.n.a(djn.rw, "_bloom", $$2, this.d);
      this.b.accept(fng.a(djn.rw).a(fnh.a(dxm.d).a($$2x -> fnj.a().a(fnk.c, $$2x ? $$4 : $$3))));
      this.a(djn.rw, $$3);
   }

   private void ay() {
      djl $$0 = djn.ct;
      akv $$1 = fnq.a($$0);
      fnf $$2 = fnf.a($$0);
      List.of(Pair.of(jn.c, fnk.a.a), Pair.of(jn.f, fnk.a.b), Pair.of(jn.d, fnk.a.c), Pair.of(jn.e, fnk.a.d)).forEach($$2x -> {
         jn $$3 = (jn)$$2x.getFirst();
         fnk.a $$4 = (fnk.a)$$2x.getSecond();
         fne.c $$5 = fne.a().a(dxm.U, $$3);
         $$2.a($$5, fnj.a().a(fnk.c, $$1).a(fnk.b, $$4).a(fnk.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fnq.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fnf $$0, fne.c $$1, fnk.a $$2) {
      List.of(
            Pair.of(dxm.bs, fns.aP),
            Pair.of(dxm.bt, fns.aQ),
            Pair.of(dxm.bu, fns.aR),
            Pair.of(dxm.bv, fns.aS),
            Pair.of(dxm.bw, fns.aT),
            Pair.of(dxm.bx, fns.aU)
         )
         .forEach($$3 -> {
            dxn $$4 = (dxn)$$3.getFirst();
            fnr $$5 = (fnr)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fnf $$0, fne.c $$1, fnk.a $$2, dxn $$3, fnr $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fnt $$7 = new fnt().a(fnu.b, fnt.a(djn.ct, $$6));
      fmy.c $$8 = new fmy.c($$4, $$6);
      akv $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(djn.ct, $$6, $$7, this.d));
      $$0.a(fne.a($$1, fne.a().a($$3, $$5)), fnj.a().a(fnk.c, $$9).a(fnk.b, $$2));
   }

   private void az() {
      this.b.accept(c(djn.ll, fns.c.a(djn.ll, fnt.b(fnq.a("magma")), this.d)));
   }

   private void a(djl $$0, @Nullable cvl $$1) {
      this.r($$0);
      cwk $$2 = $$0.j();
      akv $$3 = fns.bK.a($$2, fnt.x($$0), this.d);
      hbk.b $$4 = $$1 != null ? fno.a($$3, new hdt.a($$1)) : fno.a($$3, new hdt.a());
      this.c.a($$2, $$4);
   }

   private void c(djl $$0, djl $$1, fmy.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aA() {
      akv $$0 = fnq.a(djn.b);
      akv $$1 = fnq.a(djn.b, "_mirrored");
      this.b.accept(a(djn.fb, $$0, $$1));
      this.a(djn.fb, $$0);
   }

   private void aB() {
      akv $$0 = fnq.a(djn.tl);
      akv $$1 = fnq.a(djn.tl, "_mirrored");
      this.b.accept(a(djn.tF, $$0, $$1).a(f()));
      this.a(djn.tF, $$0);
   }

   private void n(djl $$0, djl $$1) {
      this.a($$0, fmy.d.b);
      fnt $$2 = fnt.d(fnt.a($$0, "_pot"));
      akv $$3 = fmy.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aC() {
      akv $$0 = fnt.a(djn.pN, "_bottom");
      akv $$1 = fnt.a(djn.pN, "_top_off");
      akv $$2 = fnt.a(djn.pN, "_top");
      akv[] $$3 = new akv[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fnt $$5 = new fnt().a(fnu.e, $$0).a(fnu.f, $$4 == 0 ? $$1 : $$2).a(fnu.i, fnt.a(djn.pN, "_side" + $$4));
         $$3[$$4] = fns.n.a(djn.pN, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fng.a(djn.pN).a(fnh.a(dxm.bc).a($$1x -> fnj.a().a(fnk.c, $$3[$$1x]))));
      this.a(djn.pN, $$3[0]);
   }

   private fnj a(jp $$0, fnj $$1) {
      switch ($$0) {
         case b:
            return $$1.a(fnk.a, fnk.a.b);
         case c:
            return $$1.a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.c);
         case d:
            return $$1.a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.d);
         case a:
            return $$1.a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b);
         case f:
            return $$1.a(fnk.a, fnk.a.d).a(fnk.b, fnk.a.c);
         case g:
            return $$1.a(fnk.a, fnk.a.d);
         case h:
            return $$1.a(fnk.a, fnk.a.d).a(fnk.b, fnk.a.b);
         case e:
            return $$1.a(fnk.a, fnk.a.d).a(fnk.b, fnk.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(fnk.b, fnk.a.c);
         case i:
            return $$1.a(fnk.b, fnk.a.d);
         case j:
            return $$1.a(fnk.b, fnk.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aD() {
      akv $$0 = fnt.a(djn.pD, "_top");
      akv $$1 = fnt.a(djn.pD, "_bottom");
      akv $$2 = fnt.a(djn.pD, "_side");
      akv $$3 = fnt.a(djn.pD, "_lock");
      fnt $$4 = new fnt().a(fnu.o, $$2).a(fnu.m, $$2).a(fnu.l, $$2).a(fnu.c, $$0).a(fnu.j, $$0).a(fnu.k, $$1).a(fnu.n, $$3);
      akv $$5 = fns.b.a(djn.pD, $$4, this.d);
      this.b.accept(fng.a(djn.pD, fnj.a().a(fnk.c, $$5)).a(fnh.a(dxm.W).a($$0x -> this.a($$0x, fnj.a()))));
   }

   private void aE() {
      djl $$0 = djn.n;
      akv $$1 = fnq.a($$0);
      fnv $$2 = fnv.a.get($$0);
      djl $$3 = djn.kg;
      akv $$4 = fns.ab.a($$3, $$2.b(), this.d);
      akv $$5 = fns.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(djl $$0, djl $$1, dqs.a $$2, akv $$3) {
      akv $$4 = fnq.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.j(), fno.a($$3, new hdu.a($$2)));
   }

   private void aF() {
      akv $$0 = fnq.b("template_skull");
      this.a(djn.hj, djn.hk, dqs.b.g, $$0);
      this.a(djn.hh, djn.hi, dqs.b.e, $$0);
      this.a(djn.hf, djn.hg, dqs.b.f, $$0);
      this.a(djn.hb, djn.hc, dqs.b.c, $$0);
      this.a(djn.hd, djn.he, dqs.b.d, $$0);
      this.a(djn.hn, djn.ho, dqs.b.h, $$0);
      this.a(djn.hl, djn.hm, dqs.b.i, fnq.a(cws.vp));
   }

   private void a(djl $$0, djl $$1, cvl $$2) {
      akv $$3 = fnq.a("banner");
      akv $$4 = fnq.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cwk $$5 = $$0.j();
      this.c.a($$5, fno.a($$4, new hdl.a($$2)));
   }

   private void aG() {
      this.a(djn.jh, djn.jx, cvl.a);
      this.a(djn.ji, djn.jy, cvl.b);
      this.a(djn.jj, djn.jz, cvl.c);
      this.a(djn.jk, djn.jA, cvl.d);
      this.a(djn.jl, djn.jB, cvl.e);
      this.a(djn.jm, djn.jC, cvl.f);
      this.a(djn.jn, djn.jD, cvl.g);
      this.a(djn.jo, djn.jE, cvl.h);
      this.a(djn.jp, djn.jF, cvl.i);
      this.a(djn.jq, djn.jG, cvl.j);
      this.a(djn.jr, djn.jH, cvl.k);
      this.a(djn.js, djn.jI, cvl.l);
      this.a(djn.jt, djn.jJ, cvl.m);
      this.a(djn.ju, djn.jK, cvl.n);
      this.a(djn.jv, djn.jL, cvl.o);
      this.a(djn.jw, djn.jM, cvl.p);
   }

   private void a(djl $$0, djl $$1, akv $$2, boolean $$3) {
      this.a($$0, $$1);
      cwk $$4 = $$0.j();
      akv $$5 = fns.bM.a($$4, fnt.x($$1), this.d);
      hbk.b $$6 = fno.a($$5, new hdn.a($$2));
      if ($$3) {
         hbk.b $$7 = fno.a($$5, new hdn.a(hdn.a));
         this.c.a($$4, fno.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aH() {
      this.a(djn.cD, djn.n, hdn.b, true);
      this.a(djn.hs, djn.n, hdn.c, true);
      this.a(djn.gb, djn.cv, hdn.d, false);
   }

   private void b(djl $$0, djl $$1, cvl $$2) {
      akv $$3 = fnq.a("bed");
      this.b.accept(c($$0, $$3));
      cwk $$4 = $$0.j();
      akv $$5 = fns.bL.a(fnq.a($$4), fnt.x($$1), this.d);
      this.c.a($$4, fno.a($$5, new hdm.a($$2)));
   }

   private void aI() {
      this.b(djn.bg, djn.bH, cvl.a);
      this.b(djn.bh, djn.bI, cvl.b);
      this.b(djn.bi, djn.bJ, cvl.c);
      this.b(djn.bj, djn.bK, cvl.d);
      this.b(djn.bk, djn.bL, cvl.e);
      this.b(djn.bl, djn.bM, cvl.f);
      this.b(djn.bm, djn.bN, cvl.g);
      this.b(djn.bn, djn.bO, cvl.h);
      this.b(djn.bo, djn.bP, cvl.i);
      this.b(djn.bp, djn.bQ, cvl.j);
      this.b(djn.bq, djn.bR, cvl.k);
      this.b(djn.br, djn.bS, cvl.l);
      this.b(djn.bs, djn.bT, cvl.m);
      this.b(djn.bt, djn.bU, cvl.n);
      this.b(djn.bu, djn.bV, cvl.o);
      this.b(djn.bv, djn.bW, cvl.p);
   }

   private void a(djl $$0, hdv.a $$1) {
      cwk $$2 = $$0.j();
      akv $$3 = fnq.a($$2);
      this.c.a($$2, fno.a($$3, $$1));
   }

   public void a() {
      me.a().filter(mf::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(djn.rH).a(me.x).a(djn.rH, djn.sf).a(djn.rL, djn.rP).a(me.z);
      this.i(djn.rG).a(me.B).a(djn.rG, djn.se).a(djn.rK, djn.rO).a(me.D);
      this.i(djn.rF).a(me.F).a(djn.rF, djn.sd).a(djn.rJ, djn.rN).a(me.H);
      this.i(djn.rE).a(me.J).a(djn.rE, djn.sc).a(djn.rI, djn.rM).a(me.L);
      this.z(djn.sM);
      this.z(djn.sN);
      this.z(djn.sO);
      this.z(djn.sP);
      this.j(djn.sM, djn.sQ);
      this.j(djn.sN, djn.sR);
      this.j(djn.sO, djn.sS);
      this.j(djn.sP, djn.sT);
      this.n(djn.a);
      this.d(djn.nE, djn.a);
      this.d(djn.nD, djn.a);
      this.n(djn.gj);
      this.n(djn.ed);
      this.d(djn.nF, djn.J);
      this.n(djn.fV);
      this.n(djn.mG);
      this.n(djn.fM);
      this.n(djn.gm);
      this.b(cws.vd);
      this.n(djn.pI);
      this.n(djn.J);
      this.n(djn.K);
      this.n(djn.it);
      this.b(cws.gh);
      this.o(djn.qo, djn.qF);
      this.o(djn.qp, djn.qG);
      this.o(djn.qq, djn.qH);
      this.o(djn.qr, djn.qI);
      this.o(djn.qs, djn.qJ);
      this.o(djn.qt, djn.qK);
      this.o(djn.qu, djn.qL);
      this.o(djn.qv, djn.qM);
      this.o(djn.qw, djn.qN);
      this.o(djn.qx, djn.qO);
      this.o(djn.qy, djn.qP);
      this.o(djn.qz, djn.qQ);
      this.o(djn.qA, djn.qR);
      this.o(djn.qB, djn.qS);
      this.o(djn.qC, djn.qT);
      this.o(djn.qD, djn.qU);
      this.o(djn.qn, djn.qE);
      this.n(djn.nC);
      this.n(djn.gO);
      this.n(djn.rr);
      this.n(djn.sZ);
      this.v(djn.ta);
      this.v(djn.tb);
      this.w(djn.tK);
      this.w(djn.tL);
      this.ak();
      this.h(djn.te, djn.tc);
      this.K(djn.tX);
      this.L(djn.tY);
      this.a(djn.tW);
      this.s(djn.td);
      this.a(djn.iu, cws.hY);
      this.b(cws.hY);
      this.aJ();
      this.a(djn.lp, cws.jy);
      this.b(cws.jy);
      this.f(djn.bX, fnt.a(djn.bF, "_side"));
      this.a(djn.U);
      this.a(djn.V);
      this.a(djn.iZ);
      this.a(djn.cF);
      this.a(djn.cG);
      this.a(djn.cH);
      this.a(djn.fZ);
      this.a(djn.ga);
      this.a(djn.ge);
      this.a(djn.Q);
      this.a(djn.W);
      this.a(djn.R);
      this.a(djn.co);
      this.a(djn.S);
      this.a(djn.T);
      this.a(djn.cp);
      this.b(djn.pL, fnv.d);
      this.a(djn.pK);
      this.a(djn.aY);
      this.a(djn.aZ);
      this.a(djn.ba);
      this.a(djn.fC);
      this.a(djn.hy);
      this.a(djn.dV);
      this.a(djn.dW);
      this.a(djn.hx);
      this.a(djn.qe);
      this.a(djn.ny);
      this.a(djn.ee);
      this.a(djn.k);
      this.a(djn.pM);
      this.a(djn.fU);
      this.a(djn.ep);
      this.a(djn.O);
      this.a(djn.pJ);
      this.a(djn.eb);
      this.b(djn.eg, fnv.g);
      this.b(djn.pS, fnv.d);
      this.b(djn.fo, fnv.d);
      this.n(djn.ag);
      this.n(djn.gw);
      this.a(djn.lm);
      this.a(djn.bf);
      this.a(djn.ja);
      this.a(djn.cv);
      this.a(djn.qm);
      this.a(djn.iG);
      this.a(djn.pa);
      this.a(djn.ej);
      this.a(djn.ek);
      this.b(djn.cA, fnv.b);
      this.g(djn.cB);
      this.a(djn.aV);
      this.b(djn.bD, fnv.v);
      this.b(cws.cZ);
      this.b(djn.cr, fnv.f);
      this.b(djn.pF, fnv.d);
      this.a(djn.oR);
      this.a(djn.aW);
      this.a(djn.qV);
      this.a(djn.qW);
      this.a(djn.rp);
      this.a(djn.sW);
      this.a(djn.tH);
      this.a(djn.tI);
      this.a(djn.tJ);
      this.d(djn.ru);
      this.n(djn.tV);
      this.aE();
      this.a(djn.rC);
      this.a(djn.rD);
      this.a(djn.ry);
      this.a(djn.rz);
      this.a(djn.rA);
      this.a(djn.rB);
      this.l(djn.ry, djn.rY);
      this.l(djn.rz, djn.sa);
      this.l(djn.rA, djn.rZ);
      this.l(djn.rB, djn.sb);
      this.j(djn.so);
      this.j(djn.sp);
      this.j(djn.sr);
      this.j(djn.sq);
      this.b(djn.so, djn.ss);
      this.b(djn.sp, djn.st);
      this.b(djn.sr, djn.sv);
      this.b(djn.sq, djn.su);
      this.l(djn.sw);
      this.l(djn.sx);
      this.l(djn.sz);
      this.l(djn.sy);
      this.c(djn.sw, djn.sA);
      this.c(djn.sx, djn.sB);
      this.c(djn.sz, djn.sD);
      this.c(djn.sy, djn.sC);
      this.a(djn.sE);
      this.a(djn.sF);
      this.a(djn.sG);
      this.a(djn.sH);
      this.l(djn.sE, djn.sI);
      this.l(djn.sF, djn.sJ);
      this.l(djn.sG, djn.sK);
      this.l(djn.sH, djn.sL);
      this.k(djn.ht, djn.co);
      this.k(djn.hu, djn.cp);
      this.H();
      this.s();
      this.ay();
      this.w();
      this.x();
      this.a(djn.oI, djn.oJ);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.C(djn.kV);
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
      this.I(djn.fu);
      this.I(djn.rv);
      this.b(djn.fv, cws.gm);
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
      this.H(djn.cX);
      this.c(djn.cX);
      this.H(djn.oC);
      this.h();
      this.H(djn.tg);
      this.m(djn.cw, djn.cx);
      this.m(djn.en, djn.eo);
      this.a(djn.cI, djn.n, fnt::c);
      this.a(djn.oA, djn.p, fnt::d);
      this.B(djn.oY);
      this.B(djn.oP);
      this.y(djn.bb);
      this.y(djn.hF);
      this.D();
      this.G(djn.oG);
      this.G(djn.oH);
      this.e(djn.fl, fnq.a(djn.fl));
      this.a(djn.el, fnv.d);
      this.a(djn.em, fnv.d);
      this.a(djn.tG);
      this.a(djn.lo, fnv.d);
      this.e(djn.j);
      this.e(djn.tj);
      this.e(djn.L);
      this.f(djn.M);
      this.f(djn.P);
      this.e(djn.N);
      this.d(djn.I);
      this.b(djn.tQ, fnv.f);
      this.a(djn.iH, fnv.d, fnv.e);
      this.a(djn.kZ, fnv.w, fnv.x);
      this.a(djn.hC, fnv.w, fnv.x);
      this.a(djn.tM, fnv.d, fnv.e);
      this.a(djn.tN, fnv.d, fnv.e);
      this.a(djn.tO, fnv.d, fnv.e);
      this.c(djn.ov, fnv.i);
      this.A();
      this.a(djn.pG, fnt::D);
      this.a(djn.pH, fnt::F);
      this.a(djn.lf, dxm.av, 0, 1, 2, 3);
      this.a(djn.gP, dxm.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djn.fL, dxm.av, 0, 1, 1, 2);
      this.a(djn.gQ, dxm.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djn.cJ, dxm.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(djn.lc, fmy.d.b, dxm.at, 0, 1);
      this.j();
      this.i();
      this.aG();
      this.aI();
      this.aF();
      this.aH();
      this.a(djn.lr, null);
      this.a(djn.ls, cvl.a);
      this.a(djn.lt, cvl.b);
      this.a(djn.lu, cvl.c);
      this.a(djn.lv, cvl.d);
      this.a(djn.lw, cvl.e);
      this.a(djn.lx, cvl.f);
      this.a(djn.ly, cvl.g);
      this.a(djn.lz, cvl.h);
      this.a(djn.lA, cvl.i);
      this.a(djn.lB, cvl.j);
      this.a(djn.lC, cvl.k);
      this.a(djn.lD, cvl.l);
      this.a(djn.lE, cvl.m);
      this.a(djn.lF, cvl.n);
      this.a(djn.lG, cvl.o);
      this.a(djn.lH, cvl.p);
      this.r(djn.nz);
      this.a(djn.nz, new hdo.a());
      this.a(djn.tR, djn.iY);
      this.a(djn.tR, new hdp.a());
      this.a(djn.fS, djn.cv);
      this.a(djn.lh, djn.cv);
      this.a(djn.aT);
      this.a(djn.aU);
      this.a(djn.lY);
      this.a(djn.lZ);
      this.a(djn.ma);
      this.a(djn.mb);
      this.a(djn.mc);
      this.a(djn.md);
      this.a(djn.me);
      this.a(djn.mf);
      this.a(djn.mg);
      this.a(djn.mh);
      this.a(djn.mi);
      this.a(djn.mj);
      this.a(djn.mk);
      this.a(djn.ml);
      this.a(djn.mm);
      this.a(djn.mn);
      this.a(fnv.a, djn.mo, djn.mp, djn.mq, djn.mr, djn.ms, djn.mt, djn.mu, djn.mv, djn.mw, djn.mx, djn.my, djn.mz, djn.mA, djn.mB, djn.mC, djn.mD);
      this.a(djn.iY);
      this.a(djn.hG);
      this.a(djn.hH);
      this.a(djn.hI);
      this.a(djn.hJ);
      this.a(djn.hK);
      this.a(djn.hL);
      this.a(djn.hM);
      this.a(djn.hN);
      this.a(djn.hO);
      this.a(djn.hP);
      this.a(djn.hQ);
      this.a(djn.hR);
      this.a(djn.hS);
      this.a(djn.hT);
      this.a(djn.hU);
      this.a(djn.hV);
      this.a(djn.rq);
      this.i(djn.aX, djn.fm);
      this.i(djn.ev, djn.hW);
      this.i(djn.ew, djn.hX);
      this.i(djn.ex, djn.hY);
      this.i(djn.ey, djn.hZ);
      this.i(djn.ez, djn.ia);
      this.i(djn.eA, djn.ib);
      this.i(djn.eB, djn.ic);
      this.i(djn.eC, djn.id);
      this.i(djn.eD, djn.ie);
      this.i(djn.eE, djn.if);
      this.i(djn.eF, djn.ig);
      this.i(djn.eG, djn.ih);
      this.i(djn.eH, djn.ii);
      this.i(djn.eI, djn.ij);
      this.i(djn.eJ, djn.ik);
      this.i(djn.eK, djn.il);
      this.b(fnv.p, djn.lI, djn.lJ, djn.lK, djn.lL, djn.lM, djn.lN, djn.lO, djn.lP, djn.lQ, djn.lR, djn.lS, djn.lT, djn.lU, djn.lV, djn.lW, djn.lX);
      this.h(djn.bH, djn.iI);
      this.h(djn.bI, djn.iJ);
      this.h(djn.bJ, djn.iK);
      this.h(djn.bK, djn.iL);
      this.h(djn.bL, djn.iM);
      this.h(djn.bM, djn.iN);
      this.h(djn.bN, djn.iO);
      this.h(djn.bO, djn.iP);
      this.h(djn.bP, djn.iQ);
      this.h(djn.bQ, djn.iR);
      this.h(djn.bR, djn.iS);
      this.h(djn.bS, djn.iT);
      this.h(djn.bT, djn.iU);
      this.h(djn.bU, djn.iV);
      this.h(djn.bV, djn.iW);
      this.h(djn.bW, djn.iX);
      this.a(djn.tk);
      this.a(djn.eZ);
      this.b(djn.bB, djn.gx, fmy.d.a);
      this.h(djn.bB);
      this.a(djn.bY, djn.gy, fmy.d.b);
      this.a(djn.ca, djn.gz, fmy.d.b);
      this.a(djn.tZ, djn.ub, fmy.d.c);
      this.a(djn.ua, djn.uc, fmy.d.b);
      this.a(djn.cb, djn.gA, fmy.d.b);
      this.a(djn.cc, djn.gB, fmy.d.b);
      this.a(djn.cd, djn.gC, fmy.d.b);
      this.a(djn.ce, djn.gD, fmy.d.b);
      this.a(djn.cf, djn.gE, fmy.d.b);
      this.a(djn.cg, djn.gF, fmy.d.b);
      this.a(djn.ch, djn.gG, fmy.d.b);
      this.a(djn.ci, djn.gH, fmy.d.b);
      this.a(djn.cj, djn.gI, fmy.d.b);
      this.a(djn.cl, djn.gJ, fmy.d.b);
      this.a(djn.ck, djn.gK, fmy.d.b);
      this.a(djn.cn, djn.gL, fmy.d.b);
      this.a(djn.cm, djn.gM, fmy.d.b);
      this.a(djn.bC, djn.gN, fmy.d.b);
      this.a(djn.bZ, djn.gn, fmy.d.b);
      this.I();
      this.x(djn.fh);
      this.x(djn.fi);
      this.x(djn.fj);
      this.b(djn.bA, fmy.d.a);
      this.h(djn.bA);
      this.b(djn.ef, fmy.d.a);
      this.b(cws.dS);
      this.c(djn.mE, djn.mF, fmy.d.b);
      this.b(cws.dT);
      this.b(djn.ti, fmy.d.b);
      this.c(djn.pb, djn.pc, fmy.d.b);
      this.c(djn.pd, djn.pe, fmy.d.b);
      this.a(djn.pb, "_plant");
      this.a(djn.pd, "_plant");
      this.a(djn.nA, fmy.d.a, fnt.c(fnt.a(djn.nB, "_stage0")));
      this.n();
      this.a(djn.bz, fmy.d.b);
      this.d(djn.jc, fmy.d.b);
      this.d(djn.jd, fmy.d.b);
      this.d(djn.je, fmy.d.b);
      this.o(djn.jf);
      this.o(djn.jg);
      this.k();
      this.l();
      this.m();
      this.a(djn.mY, djn.mT, djn.mO, djn.mJ, djn.ni, djn.nd, djn.ns, djn.nn);
      this.a(djn.mZ, djn.mU, djn.mP, djn.mK, djn.nj, djn.ne, djn.nt, djn.no);
      this.a(djn.na, djn.mV, djn.mQ, djn.mL, djn.nk, djn.nf, djn.nu, djn.np);
      this.a(djn.nb, djn.mW, djn.mR, djn.mM, djn.nl, djn.ng, djn.nv, djn.nq);
      this.a(djn.nc, djn.mX, djn.mS, djn.mN, djn.nm, djn.nh, djn.nw, djn.nr);
      this.f(djn.fs, djn.fq);
      this.f(djn.fr, djn.fp);
      this.m(djn.af).c(djn.af).a(djn.aA);
      this.m(djn.ar).c(djn.ar).a(djn.aJ);
      this.a(djn.ar, djn.du, djn.dE);
      this.a(djn.aS, fnv.s, -7158200);
      this.m(djn.ab).c(djn.ab).a(djn.ax);
      this.m(djn.am).c(djn.am).a(djn.aF);
      this.a(djn.am, djn.dn, djn.dz);
      this.a(djn.D, djn.gs, fmy.d.b);
      this.a(djn.aO, fnv.s, -12012264);
      this.m(djn.ac).d(djn.ac).a(djn.ay);
      this.m(djn.an).d(djn.an).a(djn.aG);
      this.a(djn.an, djn.do, djn.dA);
      this.a(djn.E, djn.gt, fmy.d.b);
      this.b(djn.aP, fnv.s);
      this.m(djn.Z).c(djn.Z).a(djn.av);
      this.m(djn.ak).c(djn.ak).a(djn.aD);
      this.a(djn.ak, djn.dm, djn.dy);
      this.a(djn.B, djn.gq, fmy.d.b);
      this.a(djn.aM, fnv.s, -8345771);
      this.m(djn.X).c(djn.X).a(djn.at);
      this.m(djn.aq).c(djn.aq).a(djn.aB);
      this.a(djn.aq, djn.dk, djn.dw);
      this.a(djn.z, djn.go, fmy.d.b);
      this.a(djn.aK, fnv.s, -12012264);
      this.m(djn.Y).c(djn.Y).a(djn.au);
      this.m(djn.aj).c(djn.aj).a(djn.aC);
      this.a(djn.aj, djn.dl, djn.dx);
      this.a(djn.A, djn.gp, fmy.d.b);
      this.a(djn.aL, fnv.s, -10380959);
      this.m(djn.ad).c(djn.ad).a(djn.az);
      this.m(djn.ao).c(djn.ao).a(djn.aH);
      this.a(djn.ao, djn.dq, djn.dC);
      this.a(djn.F, djn.gu, fmy.d.b);
      this.a(djn.aQ, fnv.s, -12012264);
      this.m(djn.ae).c(djn.ae).a(djn.u);
      this.m(djn.ap).c(djn.ap).a(djn.aI);
      this.a(djn.ap, djn.dr, djn.dD);
      this.a(djn.G, djn.gv, fmy.d.b);
      this.b(djn.aR, fnv.s);
      this.m(djn.aa).c(djn.aa).a(djn.aw);
      this.m(djn.al).c(djn.al).a(djn.aE);
      this.a(djn.al, djn.dp, djn.dB);
      this.a(djn.C, djn.gr, fmy.d.b);
      this.a(djn.aN, fnv.s, -12012264);
      this.m(djn.oU).b(djn.oU).a(djn.oW);
      this.m(djn.oV).b(djn.oV).a(djn.oX);
      this.a(djn.oV, djn.ds, djn.dF);
      this.a(djn.oZ, djn.pO, fmy.d.b);
      this.n(djn.pf, djn.pQ);
      this.m(djn.oL).b(djn.oL).a(djn.oN);
      this.m(djn.oM).b(djn.oM).a(djn.oO);
      this.a(djn.oM, djn.dt, djn.dG);
      this.a(djn.oQ, djn.pP, fmy.d.b);
      this.n(djn.oS, djn.pR);
      this.m(djn.ai).d(djn.ai);
      this.m(djn.as).d(djn.as);
      this.a(djn.x, djn.dv, djn.dH);
      this.b(djn.oT, fmy.d.b);
      this.b(cws.dP);
      this.j(djn.dK);
      this.l(djn.iw);
      this.v();
      this.p(djn.cY);
      this.q(djn.bw);
      this.q(djn.bx);
      this.q(djn.hE);
      this.u();
      this.t(djn.gi);
      this.t(djn.li);
      this.t(djn.lj);
      this.u(djn.hp);
      this.u(djn.hq);
      this.u(djn.hr);
      this.p();
      this.q();
      this.d(djn.cL, fnv.h);
      this.d(djn.oy, fnv.h);
      this.d(djn.ox, fnv.i);
      this.t();
      this.aC();
      this.ax();
      this.l(djn.eY, djn.fg);
      this.l(djn.m, djn.fc);
      this.l(djn.eX, djn.ff);
      this.l(djn.eW, djn.fe);
      this.aA();
      this.l(djn.eV, djn.fd);
      this.aB();
   }

   private void aJ() {
      hbk.b $$0 = fno.a(this.a(cws.hZ));
      Map<Integer, hbk.b> $$1 = new HashMap<>(16);
      fnh.a<Integer> $$2 = fnh.a(dxm.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         akv $$5 = fnt.a(cws.hZ, $$4);
         $$2.a($$3, fnj.a().a(fnk.c, fns.aa.a(djn.iv, $$4, fnt.h($$5), this.d)));
         hbk.b $$6 = fno.a(fns.bE.a(fnq.a(cws.hZ, $$4), fnt.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cws.hZ, fno.a(dob.c, $$0, $$1));
      this.b.accept(fng.a(djn.iv).a($$2));
   }

   private void o(djl $$0, djl $$1) {
      this.b($$0.j());
      fnt $$2 = fnt.b(fnt.J($$0));
      fnt $$3 = fnt.b(fnt.a($$0, "_lit"));
      akv $$4 = fns.bR.a($$0, "_one_candle", $$2, this.d);
      akv $$5 = fns.bS.a($$0, "_two_candles", $$2, this.d);
      akv $$6 = fns.bT.a($$0, "_three_candles", $$2, this.d);
      akv $$7 = fns.bU.a($$0, "_four_candles", $$2, this.d);
      akv $$8 = fns.bR.a($$0, "_one_candle_lit", $$3, this.d);
      akv $$9 = fns.bS.a($$0, "_two_candles_lit", $$3, this.d);
      akv $$10 = fns.bT.a($$0, "_three_candles_lit", $$3, this.d);
      akv $$11 = fns.bU.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxm.aC, dxm.v)
                     .a(1, false, fnj.a().a(fnk.c, $$4))
                     .a(2, false, fnj.a().a(fnk.c, $$5))
                     .a(3, false, fnj.a().a(fnk.c, $$6))
                     .a(4, false, fnj.a().a(fnk.c, $$7))
                     .a(1, true, fnj.a().a(fnk.c, $$8))
                     .a(2, true, fnj.a().a(fnk.c, $$9))
                     .a(3, true, fnj.a().a(fnk.c, $$10))
                     .a(4, true, fnj.a().a(fnk.c, $$11))
               )
         );
      akv $$12 = fns.bV.a($$1, fnt.a($$0, false), this.d);
      akv $$13 = fns.bV.a($$1, "_lit", fnt.a($$0, true), this.d);
      this.b.accept(fng.a($$1).a(a(dxm.v, $$13, $$12)));
   }

   class a {
      private final fnt b;
      private final Map<fnr, akv> c = Maps.newHashMap();
      @Nullable
      private mf d;
      @Nullable
      private akv e;
      private final Set<djl> f = new HashSet<>();

      public a(final fnt $$0) {
         this.b = $$0;
      }

      public fmy.a a(djl $$0, fnr $$1) {
         this.e = $$1.a($$0, this.b, fmy.this.d);
         if (fmy.this.f.containsKey($$0)) {
            fmy.this.b.accept(fmy.this.f.get($$0).create($$0, this.e, this.b, fmy.this.d));
         } else {
            fmy.this.b.accept(fmy.c($$0, this.e));
         }

         return this;
      }

      public fmy.a a(djl $$0, djl $$1) {
         akv $$2 = fnq.a($$0);
         fmy.this.b.accept(fmy.c($$1, $$2));
         fmy.this.c.a($$0.j(), $$1.j());
         this.f.add($$1);
         return this;
      }

      public fmy.a a(djl $$0) {
         akv $$1 = fns.s.a($$0, this.b, fmy.this.d);
         akv $$2 = fns.t.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.b($$0, $$1, $$2));
         akv $$3 = fns.u.a($$0, this.b, fmy.this.d);
         fmy.this.a($$0, $$3);
         return this;
      }

      public fmy.a b(djl $$0) {
         akv $$1 = fns.M.a($$0, this.b, fmy.this.d);
         akv $$2 = fns.N.a($$0, this.b, fmy.this.d);
         akv $$3 = fns.O.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$1, $$2, $$3));
         akv $$4 = fns.P.a($$0, this.b, fmy.this.d);
         fmy.this.a($$0, $$4);
         return this;
      }

      public fmy.a c(djl $$0) {
         fnt $$1 = fnt.s($$0);
         akv $$2 = fns.D.a($$0, $$1, fmy.this.d);
         akv $$3 = fns.E.a($$0, $$1, fmy.this.d);
         akv $$4 = fns.F.a($$0, $$1, fmy.this.d);
         akv $$5 = fns.G.a($$0, $$1, fmy.this.d);
         akv $$6 = fns.H.a($$0, $$1, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$2, $$3, $$4, $$5, $$6));
         akv $$7 = fns.I.a($$0, $$1, fmy.this.d);
         fmy.this.a($$0, $$7);
         return this;
      }

      public fmy.a d(djl $$0) {
         akv $$1 = fns.J.a($$0, this.b, fmy.this.d);
         akv $$2 = fns.K.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.c($$0, $$1, $$2));
         akv $$3 = fns.L.a($$0, this.b, fmy.this.d);
         fmy.this.a($$0, $$3);
         return this;
      }

      public fmy.a e(djl $$0) {
         fnt $$1 = fnt.s($$0);
         akv $$2 = fns.R.a($$0, $$1, fmy.this.d);
         akv $$3 = fns.Q.a($$0, $$1, fmy.this.d);
         akv $$4 = fns.T.a($$0, $$1, fmy.this.d);
         akv $$5 = fns.S.a($$0, $$1, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fmy.a f(djl $$0) {
         akv $$1 = fns.V.a($$0, this.b, fmy.this.d);
         akv $$2 = fns.U.a($$0, this.b, fmy.this.d);
         akv $$3 = fns.X.a($$0, this.b, fmy.this.d);
         akv $$4 = fns.W.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fmy.a g(djl $$0) {
         akv $$1 = fns.Y.a($$0, this.b, fmy.this.d);
         akv $$2 = fns.Z.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.e($$0, $$1, $$2));
         return this;
      }

      public fmy.a h(djl $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            djl $$1 = this.d.b().get(mf.b.r);
            akv $$2 = fns.aa.a($$0, this.b, fmy.this.d);
            fmy.this.b.accept(fmy.c($$0, $$2));
            fmy.this.b.accept(fmy.c($$1, $$2));
            fmy.this.b($$0.j());
            return this;
         }
      }

      public fmy.a i(djl $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akv $$1 = this.a(fns.ab, $$0);
            akv $$2 = this.a(fns.ac, $$0);
            fmy.this.b.accept(fmy.e($$0, $$1, $$2, this.e));
            fmy.this.a($$0, $$1);
            return this;
         }
      }

      public fmy.a j(djl $$0) {
         akv $$1 = this.a(fns.af, $$0);
         akv $$2 = this.a(fns.ae, $$0);
         akv $$3 = this.a(fns.ag, $$0);
         fmy.this.b.accept(fmy.b($$0, $$1, $$2, $$3));
         fmy.this.a($$0, $$2);
         return this;
      }

      private fmy.a k(djl $$0) {
         fnv $$1 = fmy.this.g.getOrDefault($$0, fnv.a.get($$0));
         akv $$2 = $$1.a($$0, fmy.this.d);
         fmy.this.b.accept(fmy.c($$0, $$2));
         return this;
      }

      private fmy.a l(djl $$0) {
         fmy.this.j($$0);
         return this;
      }

      private void m(djl $$0) {
         if (fmy.this.e.contains($$0)) {
            fmy.this.l($$0);
         } else {
            fmy.this.k($$0);
         }
      }

      private akv a(fnr $$0, djl $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fmy.this.d));
      }

      public fmy.a a(mf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fmy.a, djl> $$2 = fmy.h.get($$0x);
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
      fnd create(djl var1, akv var2, fnt var3, BiConsumer<akv, fnp> var4);
   }

   static record c(fnr a, String b) {
   }

   static enum d {
      a(fns.ap, fns.as, false),
      b(fns.ao, fns.ar, false),
      c(fns.aq, fns.at, true);

      private final fnr d;
      private final fnr e;
      private final boolean f;

      private d(final fnr $$0, final fnr $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fnr a() {
         return this.d;
      }

      public fnr b() {
         return this.e;
      }

      public akv a(fmy $$0, djl $$1) {
         cwk $$2 = $$1.j();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fnt a(djl $$0) {
         return this.f ? fnt.e($$0) : fnt.c($$0);
      }

      public fnt b(djl $$0) {
         return this.f ? fnt.g($$0) : fnt.f($$0);
      }
   }

   class e {
      private final fnt b;

      public e(final fnt $$0) {
         this.b = $$0;
      }

      public fmy.e a(djl $$0) {
         fnt $$1 = this.b.c(fnu.d, this.b.a(fnu.i));
         akv $$2 = fns.j.a($$0, $$1, fmy.this.d);
         fmy.this.b.accept(fmy.d($$0, $$2));
         return this;
      }

      public fmy.e b(djl $$0) {
         akv $$1 = fns.j.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.d($$0, $$1));
         return this;
      }

      public fmy.e c(djl $$0) {
         akv $$1 = fns.j.a($$0, this.b, fmy.this.d);
         akv $$2 = fns.k.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.d($$0, $$1, $$2));
         return this;
      }

      public fmy.e d(djl $$0) {
         fmy.this.b.accept(fmy.a($$0, this.b, fmy.this.d));
         return this;
      }
   }
}
