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
   final BiConsumer<aku, fnp> d;
   final List<djm> e = ImmutableList.of(djo.eL, djo.eR, djo.iw);
   final Map<djm, fmy.b> f = ImmutableMap.builder().put(djo.b, fmy::a).put(djo.tl, fmy::c).put(djo.fa, fmy::b).build();
   final Map<djm, fnv> g = ImmutableMap.builder()
      .put(djo.bc, fnv.y.get(djo.bc))
      .put(djo.jN, fnv.y.get(djo.jN))
      .put(djo.kr, fnv.a(fnt.a(djo.bc, "_top")))
      .put(djo.kt, fnv.a(fnt.a(djo.jN, "_top")))
      .put(djo.be, fnv.d.get(djo.bc).a($$0x -> $$0x.a(fnu.i, fnt.J(djo.be))))
      .put(djo.jP, fnv.d.get(djo.jN).a($$0x -> $$0x.a(fnu.i, fnt.J(djo.jP))))
      .put(djo.hA, fnv.d.get(djo.hA))
      .put(djo.ks, fnv.a(fnt.a(djo.hA, "_bottom")))
      .put(djo.pT, fnv.z.get(djo.pT))
      .put(djo.tl, fnv.z.get(djo.tl))
      .put(djo.hB, fnv.d.get(djo.hB).a($$0x -> $$0x.a(fnu.i, fnt.J(djo.hB))))
      .put(djo.bd, fnv.d.get(djo.bd).a($$0x -> {
         $$0x.a(fnu.d, fnt.a(djo.bc, "_top"));
         $$0x.a(fnu.i, fnt.J(djo.bd));
      }))
      .put(djo.jO, fnv.d.get(djo.jO).a($$0x -> {
         $$0x.a(fnu.d, fnt.a(djo.jN, "_top"));
         $$0x.a(fnu.i, fnt.J(djo.jO));
      }))
      .put(djo.ro, fnv.z.get(djo.ro))
      .put(djo.rj, fnv.z.get(djo.rj))
      .build();
   static final Map<mf.b, BiConsumer<fmy.a, djm>> h = ImmutableMap.builder()
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
   public static final List<Pair<jn, Function<aku, fnj>>> a = List.of(
      Pair.of(jn.c, (Function<aku, fnj>)$$0 -> fnj.a().a(fnk.c, $$0)),
      Pair.of(jn.f, (Function<aku, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b).a(fnk.d, true)),
      Pair.of(jn.d, (Function<aku, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c).a(fnk.d, true)),
      Pair.of(jn.e, (Function<aku, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d).a(fnk.d, true)),
      Pair.of(jn.b, (Function<aku, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.d).a(fnk.d, true)),
      Pair.of(jn.a, (Function<aku, fnj>)$$0 -> fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.b).a(fnk.d, true))
   );
   private static final Map<fmy.c, aku> i = new HashMap<>();

   private static fnd a(djm $$0, aku $$1, fnt $$2, BiConsumer<aku, fnp> $$3) {
      aku $$4 = fns.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fnd b(djm $$0, aku $$1, fnt $$2, BiConsumer<aku, fnp> $$3) {
      aku $$4 = fns.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fnd c(djm $$0, aku $$1, fnt $$2, BiConsumer<aku, fnp> $$3) {
      aku $$4 = fns.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fmy(Consumer<fnd> $$0, fnb $$1, BiConsumer<aku, fnp> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cwl $$0, aku $$1) {
      this.c.a($$0, fno.a($$1));
   }

   void a(djm $$0, aku $$1) {
      this.c.a($$0.j(), fno.a($$1));
   }

   private void a(djm $$0, aku $$1, fmt $$2) {
      this.c.a($$0.j(), fno.a($$1, $$2));
   }

   private aku a(cwl $$0) {
      return fns.bE.a(fnq.a($$0), fnt.b($$0), this.d);
   }

   aku a(cwl $$0, djm $$1) {
      return fns.bE.a(fnq.a($$0), fnt.I($$1), this.d);
   }

   private aku a(cwl $$0, djm $$1, String $$2) {
      return fns.bE.a(fnq.a($$0), fnt.k(fnt.a($$1, $$2)), this.d);
   }

   aku b(cwl $$0, djm $$1, String $$2) {
      aku $$3 = fnt.J($$1);
      aku $$4 = fnt.a($$1, $$2);
      return fns.bI.a(fnq.a($$0), fnt.c($$3, $$4), this.d);
   }

   void b(cwl $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(djm $$0) {
      cwl $$1 = $$0.j();
      if ($$1 != cwt.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(djm $$0, String $$1) {
      cwl $$2 = $$0.j();
      if ($$2 != cwt.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(djm $$0, String $$1) {
      cwl $$2 = $$0.j();
      if ($$2 != cwt.a) {
         aku $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fnh b() {
      return fnh.a(dxn.U).a(jn.f, fnj.a().a(fnk.b, fnk.a.b)).a(jn.d, fnj.a().a(fnk.b, fnk.a.c)).a(jn.e, fnj.a().a(fnk.b, fnk.a.d)).a(jn.c, fnj.a());
   }

   private static fnh c() {
      return fnh.a(dxn.U).a(jn.d, fnj.a()).a(jn.e, fnj.a().a(fnk.b, fnk.a.b)).a(jn.c, fnj.a().a(fnk.b, fnk.a.c)).a(jn.f, fnj.a().a(fnk.b, fnk.a.d));
   }

   private static fnh d() {
      return fnh.a(dxn.U).a(jn.f, fnj.a()).a(jn.d, fnj.a().a(fnk.b, fnk.a.b)).a(jn.e, fnj.a().a(fnk.b, fnk.a.c)).a(jn.c, fnj.a().a(fnk.b, fnk.a.d));
   }

   private static fnh e() {
      return fnh.a(dxn.S)
         .a(jn.a, fnj.a().a(fnk.a, fnk.a.b))
         .a(jn.b, fnj.a().a(fnk.a, fnk.a.d))
         .a(jn.c, fnj.a())
         .a(jn.d, fnj.a().a(fnk.b, fnk.a.c))
         .a(jn.e, fnj.a().a(fnk.b, fnk.a.d))
         .a(jn.f, fnj.a().a(fnk.b, fnk.a.b));
   }

   private static fng b(djm $$0, aku $$1) {
      return fng.a($$0, a($$1));
   }

   private static fnj[] a(aku $$0) {
      return new fnj[]{
         fnj.a().a(fnk.c, $$0), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d)
      };
   }

   private static fng a(djm $$0, aku $$1, aku $$2) {
      return fng.a($$0, fnj.a().a(fnk.c, $$1), fnj.a().a(fnk.c, $$2), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c));
   }

   private static fnh a(dxo $$0, aku $$1, aku $$2) {
      return fnh.a($$0).a(true, fnj.a().a(fnk.c, $$1)).a(false, fnj.a().a(fnk.c, $$2));
   }

   private void d(djm $$0) {
      aku $$1 = fnv.a.create($$0, this.d);
      aku $$2 = fnv.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(djm $$0) {
      aku $$1 = fnv.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(djm $$0) {
      this.b.accept(fng.a($$0).a(fnh.a(dxn.by).a($$1 -> {
         String $$2 = "_" + $$1;
         aku $$3 = fnt.a($$0, $$2);
         return fnj.a().a(fnk.c, fns.c.a($$0, $$2, new fnt().a(fnu.a, $$3), this.d));
      })));
      this.a($$0, fnq.a($$0, "_0"));
   }

   static fnd b(djm $$0, aku $$1, aku $$2) {
      return fng.a($$0)
         .a(fnh.a(dxn.B).a(false, fnj.a().a(fnk.c, $$1)).a(true, fnj.a().a(fnk.c, $$2)))
         .a(
            fnh.a(dxn.X, dxn.U)
               .a(dxi.a, jn.f, fnj.a().a(fnk.b, fnk.a.b))
               .a(dxi.a, jn.e, fnj.a().a(fnk.b, fnk.a.d))
               .a(dxi.a, jn.d, fnj.a().a(fnk.b, fnk.a.c))
               .a(dxi.a, jn.c, fnj.a())
               .a(dxi.b, jn.f, fnj.a().a(fnk.b, fnk.a.b).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxi.b, jn.e, fnj.a().a(fnk.b, fnk.a.d).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxi.b, jn.d, fnj.a().a(fnk.b, fnk.a.c).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxi.b, jn.c, fnj.a().a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(dxi.c, jn.f, fnj.a().a(fnk.b, fnk.a.d).a(fnk.a, fnk.a.c))
               .a(dxi.c, jn.e, fnj.a().a(fnk.b, fnk.a.b).a(fnk.a, fnk.a.c))
               .a(dxi.c, jn.d, fnj.a().a(fnk.a, fnk.a.c))
               .a(dxi.c, jn.c, fnj.a().a(fnk.b, fnk.a.c).a(fnk.a, fnk.a.c))
         );
   }

   private static fnh.d<jn, dxs, dxr, Boolean> a(fnh.d<jn, dxs, dxr, Boolean> $$0, dxs $$1, aku $$2, aku $$3, aku $$4, aku $$5) {
      return $$0.a(jn.f, $$1, dxr.a, false, fnj.a().a(fnk.c, $$2))
         .a(jn.d, $$1, dxr.a, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
         .a(jn.e, $$1, dxr.a, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
         .a(jn.c, $$1, dxr.a, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
         .a(jn.f, $$1, dxr.b, false, fnj.a().a(fnk.c, $$4))
         .a(jn.d, $$1, dxr.b, false, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
         .a(jn.e, $$1, dxr.b, false, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c))
         .a(jn.c, $$1, dxr.b, false, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d))
         .a(jn.f, $$1, dxr.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
         .a(jn.d, $$1, dxr.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
         .a(jn.e, $$1, dxr.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
         .a(jn.c, $$1, dxr.a, true, fnj.a().a(fnk.c, $$3))
         .a(jn.f, $$1, dxr.b, true, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.d))
         .a(jn.d, $$1, dxr.b, true, fnj.a().a(fnk.c, $$5))
         .a(jn.e, $$1, dxr.b, true, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
         .a(jn.c, $$1, dxr.b, true, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.c));
   }

   private static fnd a(djm $$0, aku $$1, aku $$2, aku $$3, aku $$4, aku $$5, aku $$6, aku $$7, aku $$8) {
      return fng.a($$0).a(a(a(fnh.a(dxn.U, dxn.ah, dxn.bh, dxn.z), dxs.b, $$1, $$2, $$3, $$4), dxs.a, $$5, $$6, $$7, $$8));
   }

   static fnd a(djm $$0, aku $$1, aku $$2, aku $$3, aku $$4, aku $$5) {
      return fnf.a($$0)
         .a(fnj.a().a(fnk.c, $$1))
         .a(fne.a().a(dxn.O, true), fnj.a().a(fnk.c, $$2).a(fnk.d, false))
         .a(fne.a().a(dxn.P, true), fnj.a().a(fnk.c, $$3).a(fnk.d, false))
         .a(fne.a().a(dxn.Q, true), fnj.a().a(fnk.c, $$4).a(fnk.d, false))
         .a(fne.a().a(dxn.R, true), fnj.a().a(fnk.c, $$5).a(fnk.d, false));
   }

   static fnd c(djm $$0, aku $$1, aku $$2) {
      return fnf.a($$0)
         .a(fnj.a().a(fnk.c, $$1))
         .a(fne.a().a(dxn.O, true), fnj.a().a(fnk.c, $$2).a(fnk.d, true))
         .a(fne.a().a(dxn.P, true), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true))
         .a(fne.a().a(dxn.Q, true), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true))
         .a(fne.a().a(dxn.R, true), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true));
   }

   static fnd a(djm $$0, aku $$1, aku $$2, aku $$3) {
      return fnf.a($$0)
         .a(fne.a().a(dxn.M, true), fnj.a().a(fnk.c, $$1))
         .a(fne.a().a(dxn.aa, dyi.b), fnj.a().a(fnk.c, $$2).a(fnk.d, true))
         .a(fne.a().a(dxn.Z, dyi.b), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true))
         .a(fne.a().a(dxn.ab, dyi.b), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true))
         .a(fne.a().a(dxn.ac, dyi.b), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true))
         .a(fne.a().a(dxn.aa, dyi.c), fnj.a().a(fnk.c, $$3).a(fnk.d, true))
         .a(fne.a().a(dxn.Z, dyi.c), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true))
         .a(fne.a().a(dxn.ab, dyi.c), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true))
         .a(fne.a().a(dxn.ac, dyi.c), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true));
   }

   static fnd a(djm $$0, aku $$1, aku $$2, aku $$3, aku $$4, boolean $$5) {
      return fng.a($$0, fnj.a().a(fnk.d, $$5))
         .a(c())
         .a(
            fnh.a(dxn.u, dxn.z)
               .a(false, false, fnj.a().a(fnk.c, $$2))
               .a(true, false, fnj.a().a(fnk.c, $$4))
               .a(false, true, fnj.a().a(fnk.c, $$1))
               .a(true, true, fnj.a().a(fnk.c, $$3))
         );
   }

   static fnd b(djm $$0, aku $$1, aku $$2, aku $$3) {
      return fng.a($$0)
         .a(
            fnh.a(dxn.U, dxn.ai, dxn.bl)
               .a(jn.f, dxv.b, dyf.a, fnj.a().a(fnk.c, $$2))
               .a(jn.e, dxv.b, dyf.a, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxv.b, dyf.a, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxv.b, dyf.a, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxv.b, dyf.e, fnj.a().a(fnk.c, $$3))
               .a(jn.e, dxv.b, dyf.e, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxv.b, dyf.e, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxv.b, dyf.e, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxv.b, dyf.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.e, dxv.b, dyf.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.d, dxv.b, dyf.d, fnj.a().a(fnk.c, $$3))
               .a(jn.c, dxv.b, dyf.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxv.b, dyf.c, fnj.a().a(fnk.c, $$1))
               .a(jn.e, dxv.b, dyf.c, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxv.b, dyf.c, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxv.b, dyf.c, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxv.b, dyf.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.e, dxv.b, dyf.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.d, dxv.b, dyf.b, fnj.a().a(fnk.c, $$1))
               .a(jn.c, dxv.b, dyf.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxv.a, dyf.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.e, dxv.a, dyf.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxv.a, dyf.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxv.a, dyf.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxv.a, dyf.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.e, dxv.a, dyf.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.d, dxv.a, dyf.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.c, dxv.a, dyf.e, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxv.a, dyf.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.e, dxv.a, dyf.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxv.a, dyf.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxv.a, dyf.d, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.f, dxv.a, dyf.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.e, dxv.a, dyf.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(jn.d, dxv.a, dyf.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.c, dxv.a, dyf.c, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.f, dxv.a, dyf.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.d, true))
               .a(jn.e, dxv.a, dyf.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(jn.d, dxv.a, dyf.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(jn.c, dxv.a, dyf.b, fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d).a(fnk.d, true))
         );
   }

   private static fnd c(djm $$0, aku $$1, aku $$2, aku $$3) {
      return fng.a($$0)
         .a(
            fnh.a(dxn.U, dxn.ai, dxn.z)
               .a(jn.c, dxv.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.d, dxv.b, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
               .a(jn.f, dxv.b, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
               .a(jn.e, dxv.b, false, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
               .a(jn.c, dxv.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.d, dxv.a, false, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
               .a(jn.f, dxv.a, false, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
               .a(jn.e, dxv.a, false, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
               .a(jn.c, dxv.b, true, fnj.a().a(fnk.c, $$3))
               .a(jn.d, dxv.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(jn.f, dxv.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(jn.e, dxv.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
               .a(jn.c, dxv.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c))
               .a(jn.d, dxv.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.a))
               .a(jn.f, dxv.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d))
               .a(jn.e, dxv.a, true, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b))
         );
   }

   private static fnd d(djm $$0, aku $$1, aku $$2, aku $$3) {
      return fng.a($$0)
         .a(
            fnh.a(dxn.U, dxn.ai, dxn.z)
               .a(jn.c, dxv.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.d, dxv.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.f, dxv.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.e, dxv.b, false, fnj.a().a(fnk.c, $$2))
               .a(jn.c, dxv.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.d, dxv.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.f, dxv.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.e, dxv.a, false, fnj.a().a(fnk.c, $$1))
               .a(jn.c, dxv.b, true, fnj.a().a(fnk.c, $$3))
               .a(jn.d, dxv.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(jn.f, dxv.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(jn.e, dxv.b, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
               .a(jn.c, dxv.a, true, fnj.a().a(fnk.c, $$3))
               .a(jn.d, dxv.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(jn.f, dxv.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(jn.e, dxv.a, true, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
         );
   }

   static fng c(djm $$0, aku $$1) {
      return fng.a($$0, fnj.a().a(fnk.c, $$1));
   }

   private static fnh f() {
      return fnh.a(dxn.L).a(jn.a.b, fnj.a()).a(jn.a.c, fnj.a().a(fnk.a, fnk.a.b)).a(jn.a.a, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b));
   }

   static fnd a(djm $$0, fnt $$1, BiConsumer<aku, fnp> $$2) {
      aku $$3 = fns.g.a($$0, $$1, $$2);
      aku $$4 = fns.h.a($$0, $$1, $$2);
      aku $$5 = fns.i.a($$0, $$1, $$2);
      aku $$6 = fns.j.a($$0, $$1, $$2);
      return fng.a($$0, fnj.a().a(fnk.c, $$6))
         .a(fnh.a(dxn.L).a(jn.a.a, fnj.a().a(fnk.c, $$3)).a(jn.a.b, fnj.a().a(fnk.c, $$4)).a(jn.a.c, fnj.a().a(fnk.c, $$5)));
   }

   static fnd d(djm $$0, aku $$1) {
      return fng.a($$0, fnj.a().a(fnk.c, $$1)).a(f());
   }

   private void e(djm $$0, aku $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(djm $$0, fnv.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(djm $$0, fnv.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, $$2)).a(b()));
   }

   static fnd d(djm $$0, aku $$1, aku $$2) {
      return fng.a($$0)
         .a(
            fnh.a(dxn.L)
               .a(jn.a.b, fnj.a().a(fnk.c, $$1))
               .a(jn.a.c, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.b))
               .a(jn.a.a, fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
         );
   }

   private void a(djm $$0, fnv.a $$1, fnv.a $$2) {
      aku $$3 = $$1.create($$0, this.d);
      aku $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(djm $$0) {
      Function<fnv.a, aku> $$1 = $$1x -> $$1x.updateTexture($$1xx -> $$1xx.a(fnu.i, fnt.a($$0, "_active")))
            .updateTexture($$1xx -> $$1xx.a(fnu.d, fnt.a($$0, "_top_active")))
            .createWithSuffix($$0, "_active", this.d);
      aku $$2 = fnv.w.create($$0, this.d);
      aku $$3 = fnv.x.create($$0, this.d);
      aku $$4 = $$1.apply(fnv.w);
      aku $$5 = $$1.apply(fnv.x);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxn.L, dlh.c)
                     .a(jn.a.b, false, fnj.a().a(fnk.c, $$2))
                     .a(jn.a.c, false, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.b))
                     .a(jn.a.a, false, fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
                     .a(jn.a.b, true, fnj.a().a(fnk.c, $$4))
                     .a(jn.a.c, true, fnj.a().a(fnk.c, $$5).a(fnk.a, fnk.a.b))
                     .a(jn.a.a, true, fnj.a().a(fnk.c, $$5).a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
               )
         );
   }

   private aku a(djm $$0, String $$1, fnr $$2, Function<aku, fnt> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fnt.a($$0, $$1)), this.d);
   }

   static fnd e(djm $$0, aku $$1, aku $$2) {
      return fng.a($$0).a(a(dxn.B, $$2, $$1));
   }

   static fnd e(djm $$0, aku $$1, aku $$2, aku $$3) {
      return fng.a($$0).a(fnh.a(dxn.bk).a(dye.b, fnj.a().a(fnk.c, $$1)).a(dye.a, fnj.a().a(fnk.c, $$2)).a(dye.c, fnj.a().a(fnk.c, $$3)));
   }

   public void a(djm $$0) {
      this.b($$0, fnv.a);
   }

   public void b(djm $$0, fnv.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(djm $$0, fnv.a $$1, int $$2) {
      aku $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fno.a($$2));
   }

   private void g() {
      this.J(djo.ft);
      aku $$0 = this.a(cwt.gk, djo.ft);
      this.a(djo.ft, $$0, fno.a(-12012264));
   }

   private void h(djm $$0) {
      aku $$1 = this.a($$0.j(), $$0);
      this.a($$0, $$1, new fms());
   }

   private fmy.a i(djm $$0) {
      fnv $$1 = this.g.getOrDefault($$0, fnv.a.get($$0));
      return new fmy.a($$1.b()).a($$0, $$1.a());
   }

   public void a(djm $$0, djm $$1, djm $$2) {
      aku $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.j());
   }

   void j(djm $$0) {
      fnt $$1 = fnt.w($$0);
      aku $$2 = fns.v.a($$0, $$1, this.d);
      aku $$3 = fns.w.a($$0, $$1, this.d);
      aku $$4 = fns.x.a($$0, $$1, this.d);
      aku $$5 = fns.y.a($$0, $$1, this.d);
      aku $$6 = fns.z.a($$0, $$1, this.d);
      aku $$7 = fns.A.a($$0, $$1, this.d);
      aku $$8 = fns.B.a($$0, $$1, this.d);
      aku $$9 = fns.C.a($$0, $$1, this.d);
      this.b($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(djm $$0, djm $$1) {
      aku $$2 = fns.v.a($$0);
      aku $$3 = fns.w.a($$0);
      aku $$4 = fns.x.a($$0);
      aku $$5 = fns.y.a($$0);
      aku $$6 = fns.z.a($$0);
      aku $$7 = fns.A.a($$0);
      aku $$8 = fns.B.a($$0);
      aku $$9 = fns.C.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(djm $$0) {
      fnt $$1 = fnt.b($$0);
      aku $$2 = fns.ak.a($$0, $$1, this.d);
      aku $$3 = fns.al.a($$0, $$1, this.d);
      aku $$4 = fns.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(djm $$0) {
      fnt $$1 = fnt.b($$0);
      aku $$2 = fns.ah.a($$0, $$1, this.d);
      aku $$3 = fns.ai.a($$0, $$1, this.d);
      aku $$4 = fns.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(djm $$0, djm $$1) {
      aku $$2 = fns.ah.a($$0);
      aku $$3 = fns.ai.a($$0);
      aku $$4 = fns.aj.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      aku $$0 = fnq.a(djo.tf);
      aku $$1 = fnq.a(djo.tf, "_partial_tilt");
      aku $$2 = fnq.a(djo.tf, "_full_tilt");
      this.b
         .accept(
            fng.a(djo.tf)
               .a(b())
               .a(fnh.a(dxn.bo).a(dyh.a, fnj.a().a(fnk.c, $$0)).a(dyh.b, fnj.a().a(fnk.c, $$0)).a(dyh.c, fnj.a().a(fnk.c, $$1)).a(dyh.d, fnj.a().a(fnk.c, $$2)))
         );
   }

   private fmy.e m(djm $$0) {
      return new fmy.e(fnt.q($$0));
   }

   private void n(djm $$0) {
      this.d($$0, $$0);
   }

   private void d(djm $$0, djm $$1) {
      this.b.accept(c($$0, fnq.a($$1)));
   }

   private void a(djm $$0, fmy.d $$1) {
      this.a($$0.j(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(djm $$0, fmy.d $$1, fnt $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djm $$0, fmy.d $$1) {
      fnt $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djm $$0, fmy.d $$1, fnt $$2) {
      aku $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(djm $$0, fmy.d $$1, dxz<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fnh $$4 = fnh.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fnt $$5 = fnt.c(fnt.a($$0, $$4x));
            aku $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fnj.a().a(fnk.c, $$6);
         });
         this.b($$0.j());
         this.b.accept(fng.a($$0).a($$4));
      }
   }

   private void a(djm $$0, djm $$1, fmy.d $$2) {
      this.a($$0.j(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(djm $$0, djm $$1, fmy.d $$2) {
      this.b($$0, $$2);
      fnt $$3 = $$2.b($$0);
      aku $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(djm $$0, djm $$1) {
      fnv $$2 = fnv.q.get($$0);
      aku $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      aku $$4 = fns.aF.a($$1, $$2.b(), this.d);
      this.b.accept(fng.a($$1, fnj.a().a(fnk.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(djm $$0, djm $$1) {
      this.b($$0.j());
      fnt $$2 = fnt.k($$0);
      fnt $$3 = fnt.a($$0, $$1);
      aku $$4 = fns.aX.a($$1, $$3, this.d);
      this.b
         .accept(
            fng.a($$1, fnj.a().a(fnk.c, $$4))
               .a(fnh.a(dxn.U).a(jn.e, fnj.a()).a(jn.d, fnj.a().a(fnk.b, fnk.a.d)).a(jn.c, fnj.a().a(fnk.b, fnk.a.b)).a(jn.f, fnj.a().a(fnk.b, fnk.a.c)))
         );
      this.b.accept(fng.a($$0).a(fnh.a(dxn.ay).a($$2x -> fnj.a().a(fnk.c, fns.aW[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      djm $$0 = djo.le;
      this.b($$0.j());
      aku $$1 = fnq.a($$0, "_top");
      aku $$2 = fnq.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      djm $$0 = djo.ld;
      this.b($$0.j());
      fnh $$1 = fnh.a(dpf.d, dxn.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fnj.a().a(fnk.c, fnq.a($$0, "_top_stage_" + $$1x));
            case b -> fnj.a().a(fnk.c, fnq.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fng.a($$0).a($$1));
   }

   private void a(djm $$0, djm $$1, djm $$2, djm $$3, djm $$4, djm $$5, djm $$6, djm $$7) {
      this.a($$0, fmy.d.b);
      this.a($$1, fmy.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(djm $$0, fmy.d $$1) {
      aku $$2 = this.a($$0, "_top", $$1.a(), fnt::c);
      aku $$3 = this.a($$0, "_bottom", $$1.a(), fnt::c);
      this.f($$0, $$2, $$3);
   }

   private void d(djm $$0, fmy.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(djm $$0) {
      aku $$1 = this.a($$0.j(), $$0, "_top");
      this.a($$0, $$1, new fms());
      this.c($$0, fmy.d.a);
   }

   private void k() {
      this.a(djo.jb, "_front");
      aku $$0 = fnq.a(djo.jb, "_top");
      aku $$1 = this.a(djo.jb, "_bottom", fmy.d.b.a(), fnt::c);
      this.f(djo.jb, $$0, $$1);
   }

   private void l() {
      aku $$0 = this.a(djo.bE, "_top", fns.br, fnt::a);
      aku $$1 = this.a(djo.bE, "_bottom", fns.br, fnt::a);
      this.f(djo.bE, $$0, $$1);
   }

   private void m() {
      aku $$0 = fnq.a(djo.th, "_top");
      aku $$1 = fnq.a(djo.th, "_bottom");
      this.b.accept(fng.a(djo.th).a(b()).a(fnh.a(dxn.ah).a(dxs.b, fnj.a().a(fnk.c, $$1)).a(dxs.a, fnj.a().a(fnk.c, $$0))));
   }

   private void f(djm $$0, aku $$1, aku $$2) {
      this.b.accept(fng.a($$0).a(fnh.a(dxn.ah).a(dxs.b, fnj.a().a(fnk.c, $$2)).a(dxs.a, fnj.a().a(fnk.c, $$1))));
   }

   private void p(djm $$0) {
      fnt $$1 = fnt.h($$0);
      fnt $$2 = fnt.e(fnt.a($$0, "_corner"));
      aku $$3 = fns.au.a($$0, $$1, this.d);
      aku $$4 = fns.av.a($$0, $$2, this.d);
      aku $$5 = fns.aw.a($$0, $$1, this.d);
      aku $$6 = fns.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxn.aj)
                     .a(dya.a, fnj.a().a(fnk.c, $$3))
                     .a(dya.b, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
                     .a(dya.c, fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
                     .a(dya.d, fnj.a().a(fnk.c, $$6).a(fnk.b, fnk.a.b))
                     .a(dya.e, fnj.a().a(fnk.c, $$5))
                     .a(dya.f, fnj.a().a(fnk.c, $$6))
                     .a(dya.g, fnj.a().a(fnk.c, $$4))
                     .a(dya.h, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
                     .a(dya.i, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c))
                     .a(dya.j, fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void q(djm $$0) {
      aku $$1 = this.a($$0, "", fns.au, fnt::e);
      aku $$2 = this.a($$0, "", fns.aw, fnt::e);
      aku $$3 = this.a($$0, "", fns.ax, fnt::e);
      aku $$4 = this.a($$0, "_on", fns.au, fnt::e);
      aku $$5 = this.a($$0, "_on", fns.aw, fnt::e);
      aku $$6 = this.a($$0, "_on", fns.ax, fnt::e);
      fnh $$7 = fnh.a(dxn.B, dxn.ak).a(($$6x, $$7x) -> {
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

   private void a(djm $$0, cwl $$1) {
      aku $$2 = fns.aa.a($$0, fnt.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(djm $$0, aku $$1) {
      aku $$2 = fns.aa.a($$0, fnt.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private aku g(djm $$0, djm $$1) {
      return fns.aa.a($$0, fnt.x($$1), this.d);
   }

   public void a(djm $$0, djm $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(djm $$0) {
      this.a($$0, $$0);
   }

   private void h(djm $$0, djm $$1) {
      this.a($$0);
      aku $$2 = fnv.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(djm $$0) {
      this.b($$0.j());
      aku $$1 = fnv.l.create($$0, this.d);
      aku $$2 = fnv.m.create($$0, this.d);
      aku $$3 = fnv.n.create($$0, this.d);
      aku $$4 = fnv.o.create($$0, this.d);
      this.b
         .accept(
            fnf.a($$0)
               .a(fne.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.c), fnj.a().a(fnk.c, $$1))
               .a(fne.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.f), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.d), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.e), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.c), fnj.a().a(fnk.c, $$2))
               .a(fne.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.f), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.d), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.e), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxn.V, 3, 4).a(dxn.U, jn.c), fnj.a().a(fnk.c, $$3))
               .a(fne.a().a(dxn.V, 3, 4).a(dxn.U, jn.f), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.V, 3, 4).a(dxn.U, jn.d), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxn.V, 3, 4).a(dxn.U, jn.e), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxn.V, 4).a(dxn.U, jn.c), fnj.a().a(fnk.c, $$4))
               .a(fne.a().a(dxn.V, 4).a(dxn.U, jn.f), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.V, 4).a(dxn.U, jn.d), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxn.V, 4).a(dxn.U, jn.e), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d))
         );
   }

   private void a(fnv.a $$0, djm... $$1) {
      for (djm $$2 : $$1) {
         aku $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fnv.a $$0, djm... $$1) {
      for (djm $$2 : $$1) {
         aku $$3 = $$0.create($$2, this.d);
         this.b.accept(fng.a($$2, fnj.a().a(fnk.c, $$3)).a(c()));
      }
   }

   private void i(djm $$0, djm $$1) {
      this.a($$0);
      fnt $$2 = fnt.b($$0, $$1);
      aku $$3 = fns.aL.a($$1, $$2, this.d);
      aku $$4 = fns.aM.a($$1, $$2, this.d);
      aku $$5 = fns.aN.a($$1, $$2, this.d);
      aku $$6 = fns.aJ.a($$1, $$2, this.d);
      aku $$7 = fns.aK.a($$1, $$2, this.d);
      cwl $$8 = $$1.j();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fnf.a($$1)
               .a(fnj.a().a(fnk.c, $$3))
               .a(fne.a().a(dxn.O, true), fnj.a().a(fnk.c, $$4))
               .a(fne.a().a(dxn.P, true), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.Q, true), fnj.a().a(fnk.c, $$5))
               .a(fne.a().a(dxn.R, true), fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.O, false), fnj.a().a(fnk.c, $$6))
               .a(fne.a().a(dxn.P, false), fnj.a().a(fnk.c, $$7))
               .a(fne.a().a(dxn.Q, false), fnj.a().a(fnk.c, $$7).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.R, false), fnj.a().a(fnk.c, $$6).a(fnk.b, fnk.a.d))
         );
   }

   private void t(djm $$0) {
      fnt $$1 = fnt.C($$0);
      aku $$2 = fns.aO.a($$0, $$1, this.d);
      aku $$3 = this.a($$0, "_conditional", fns.aO, $$1x -> $$1.c(fnu.i, $$1x));
      this.b.accept(fng.a($$0).a(a(dxn.g, $$3, $$2)).a(e()));
   }

   private void u(djm $$0) {
      aku $$1 = fnv.r.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fnj> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fnj.a().a(fnk.c, fnq.a(djo.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fnf.a(djo.nB)
               .a(fne.a().a(dxn.at, 0), this.a(0))
               .a(fne.a().a(dxn.at, 1), this.a(1))
               .a(fne.a().a(dxn.bn, dxj.b), fnj.a().a(fnk.c, fnq.a(djo.nB, "_small_leaves")))
               .a(fne.a().a(dxn.bn, dxj.c), fnj.a().a(fnk.c, fnq.a(djo.nB, "_large_leaves")))
         );
   }

   private fnh o() {
      return fnh.a(dxn.S)
         .a(jn.a, fnj.a().a(fnk.a, fnk.a.c))
         .a(jn.b, fnj.a())
         .a(jn.c, fnj.a().a(fnk.a, fnk.a.b))
         .a(jn.d, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.c))
         .a(jn.e, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.d))
         .a(jn.f, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b));
   }

   private void p() {
      aku $$0 = fnt.a(djo.ow, "_top_open");
      this.b
         .accept(
            fng.a(djo.ow)
               .a(this.o())
               .a(
                  fnh.a(dxn.z)
                     .a(false, fnj.a().a(fnk.c, fnv.f.create(djo.ow, this.d)))
                     .a(true, fnj.a().a(fnk.c, fnv.f.get(djo.ow).a($$1 -> $$1.a(fnu.f, $$0)).a(djo.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fnh a(dxz<T> $$0, T $$1, aku $$2, aku $$3) {
      fnj $$4 = fnj.a().a(fnk.c, $$2);
      fnj $$5 = fnj.a().a(fnk.c, $$3);
      return fnh.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(djm $$0, Function<djm, fnt> $$1) {
      fnt $$2 = $$1.apply($$0).b(fnu.i, fnu.c);
      fnt $$3 = $$2.c(fnu.g, fnt.a($$0, "_front_honey"));
      aku $$4 = fns.q.a($$0, "_empty", $$2, this.d);
      aku $$5 = fns.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.j(), fno.a(djg.c, fno.a($$4), Map.of(5, fno.a($$5))));
      this.b.accept(fng.a($$0).a(b()).a(a(djg.c, 5, $$5, $$4)));
   }

   private void a(djm $$0, dxz<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aku> $$3 = new Int2ObjectOpenHashMap();
         fnh $$4 = fnh.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aku $$5 = (aku)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, fns.aY, fnt::g));
            return fnj.a().a(fnk.c, $$5);
         });
         this.b($$0.j());
         this.b.accept(fng.a($$0).a($$4));
      }
   }

   private void q() {
      aku $$0 = fnq.a(djo.oF, "_floor");
      aku $$1 = fnq.a(djo.oF, "_ceiling");
      aku $$2 = fnq.a(djo.oF, "_wall");
      aku $$3 = fnq.a(djo.oF, "_between_walls");
      this.b(cwt.xs);
      this.b
         .accept(
            fng.a(djo.oF)
               .a(
                  fnh.a(dxn.U, dxn.Y)
                     .a(jn.c, dxl.a, fnj.a().a(fnk.c, $$0))
                     .a(jn.d, dxl.a, fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c))
                     .a(jn.f, dxl.a, fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b))
                     .a(jn.e, dxl.a, fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d))
                     .a(jn.c, dxl.b, fnj.a().a(fnk.c, $$1))
                     .a(jn.d, dxl.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
                     .a(jn.f, dxl.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
                     .a(jn.e, dxl.b, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
                     .a(jn.c, dxl.c, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d))
                     .a(jn.d, dxl.c, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
                     .a(jn.f, dxl.c, fnj.a().a(fnk.c, $$2))
                     .a(jn.e, dxl.c, fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c))
                     .a(jn.d, dxl.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
                     .a(jn.c, dxl.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d))
                     .a(jn.f, dxl.d, fnj.a().a(fnk.c, $$3))
                     .a(jn.e, dxl.d, fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fng.a(djo.oB, fnj.a().a(fnk.c, fnq.a(djo.oB)))
               .a(
                  fnh.a(dxn.X, dxn.U)
                     .a(dxi.a, jn.c, fnj.a())
                     .a(dxi.a, jn.f, fnj.a().a(fnk.b, fnk.a.b))
                     .a(dxi.a, jn.d, fnj.a().a(fnk.b, fnk.a.c))
                     .a(dxi.a, jn.e, fnj.a().a(fnk.b, fnk.a.d))
                     .a(dxi.b, jn.c, fnj.a().a(fnk.a, fnk.a.b))
                     .a(dxi.b, jn.f, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
                     .a(dxi.b, jn.d, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.c))
                     .a(dxi.b, jn.e, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.d))
                     .a(dxi.c, jn.d, fnj.a().a(fnk.a, fnk.a.c))
                     .a(dxi.c, jn.e, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b))
                     .a(dxi.c, jn.c, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c))
                     .a(dxi.c, jn.f, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void d(djm $$0, fnv.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      aku $$3 = fnt.a($$0, "_front_on");
      aku $$4 = $$1.get($$0).a($$1x -> $$1x.a(fnu.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fng.a($$0).a(a(dxn.v, $$4, $$2)).a(b()));
   }

   private void a(djm... $$0) {
      aku $$1 = fnq.a("campfire_off");

      for (djm $$2 : $$0) {
         aku $$3 = fns.bf.a($$2, fnt.H($$2), this.d);
         this.b($$2.j());
         this.b.accept(fng.a($$2).a(a(dxn.v, $$3, $$1)).a(c()));
      }
   }

   private void v(djm $$0) {
      aku $$1 = fns.bA.a($$0, fnt.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void w(djm $$0) {
      aku $$1;
      if ($$0 == djo.tL) {
         $$1 = fns.bC.a($$0, fnt.p($$0), this.d);
      } else {
         $$1 = fns.bB.a($$0, fnt.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fnt $$0 = fnt.a(fnt.J(djo.cs), fnt.J(djo.n));
      aku $$1 = fns.j.a(djo.cs, $$0, this.d);
      this.b.accept(c(djo.cs, $$1));
   }

   private void t() {
      this.b(cwt.me);
      this.b
         .accept(
            fnf.a(djo.cE)
               .a(
                  fne.b(
                     fne.a().a(dxn.ae, dyb.c).a(dxn.ad, dyb.c).a(dxn.af, dyb.c).a(dxn.ag, dyb.c),
                     fne.a().a(dxn.ae, dyb.b, dyb.a).a(dxn.ad, dyb.b, dyb.a),
                     fne.a().a(dxn.ad, dyb.b, dyb.a).a(dxn.af, dyb.b, dyb.a),
                     fne.a().a(dxn.af, dyb.b, dyb.a).a(dxn.ag, dyb.b, dyb.a),
                     fne.a().a(dxn.ag, dyb.b, dyb.a).a(dxn.ae, dyb.b, dyb.a)
                  ),
                  fnj.a().a(fnk.c, fnq.a("redstone_dust_dot"))
               )
               .a(fne.a().a(dxn.ae, dyb.b, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side0")))
               .a(fne.a().a(dxn.af, dyb.b, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side_alt0")))
               .a(fne.a().a(dxn.ad, dyb.b, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side_alt1")).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxn.ag, dyb.b, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_side1")).a(fnk.b, fnk.a.d))
               .a(fne.a().a(dxn.ae, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")))
               .a(fne.a().a(dxn.ad, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.af, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")).a(fnk.b, fnk.a.c))
               .a(fne.a().a(dxn.ag, dyb.a), fnj.a().a(fnk.c, fnq.a("redstone_dust_up")).a(fnk.b, fnk.a.d))
         );
   }

   private void u() {
      this.b(cwt.mi);
      this.b
         .accept(
            fng.a(djo.hv)
               .a(c())
               .a(
                  fnh.a(dxn.bg, dxn.B)
                     .a(dxq.a, false, fnj.a().a(fnk.c, fnq.a(djo.hv)))
                     .a(dxq.a, true, fnj.a().a(fnk.c, fnq.a(djo.hv, "_on")))
                     .a(dxq.b, false, fnj.a().a(fnk.c, fnq.a(djo.hv, "_subtract")))
                     .a(dxq.b, true, fnj.a().a(fnk.c, fnq.a(djo.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fnt $$0 = fnt.a(djo.kq);
      fnt $$1 = fnt.a(fnt.a(djo.kd, "_side"), $$0.a(fnu.f));
      aku $$2 = fns.ab.a(djo.kd, $$1, this.d);
      aku $$3 = fns.ac.a(djo.kd, $$1, this.d);
      aku $$4 = fns.j.b(djo.kd, "_double", $$1, this.d);
      this.b.accept(e(djo.kd, $$2, $$3, $$4));
      this.b.accept(c(djo.kq, fns.c.a(djo.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cwt.tn);
      this.b
         .accept(
            fnf.a(djo.fN)
               .a(fnj.a().a(fnk.c, fnt.J(djo.fN)))
               .a(fne.a().a(dxn.o, true), fnj.a().a(fnk.c, fnt.a(djo.fN, "_bottle0")))
               .a(fne.a().a(dxn.p, true), fnj.a().a(fnk.c, fnt.a(djo.fN, "_bottle1")))
               .a(fne.a().a(dxn.q, true), fnj.a().a(fnk.c, fnt.a(djo.fN, "_bottle2")))
               .a(fne.a().a(dxn.o, false), fnj.a().a(fnk.c, fnt.a(djo.fN, "_empty0")))
               .a(fne.a().a(dxn.p, false), fnj.a().a(fnk.c, fnt.a(djo.fN, "_empty1")))
               .a(fne.a().a(dxn.q, false), fnj.a().a(fnk.c, fnt.a(djo.fN, "_empty2")))
         );
   }

   private void x(djm $$0) {
      aku $$1 = fns.bw.a($$0, fnt.b($$0), this.d);
      aku $$2 = fnq.a("mushroom_block_inside");
      this.b
         .accept(
            fnf.a($$0)
               .a(fne.a().a(dxn.O, true), fnj.a().a(fnk.c, $$1))
               .a(fne.a().a(dxn.P, true), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxn.Q, true), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(fne.a().a(dxn.R, true), fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxn.M, true), fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxn.N, true), fnj.a().a(fnk.c, $$1).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxn.O, false), fnj.a().a(fnk.c, $$2))
               .a(fne.a().a(dxn.P, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, false))
               .a(fne.a().a(dxn.Q, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, false))
               .a(fne.a().a(dxn.R, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, false))
               .a(fne.a().a(dxn.M, false), fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.d).a(fnk.d, false))
               .a(fne.a().a(dxn.N, false), fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.b).a(fnk.d, false))
         );
      this.a($$0, fnv.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cwt.sy);
      this.b
         .accept(
            fng.a(djo.et)
               .a(
                  fnh.a(dxn.aB)
                     .a(0, fnj.a().a(fnk.c, fnq.a(djo.et)))
                     .a(1, fnj.a().a(fnk.c, fnq.a(djo.et, "_slice1")))
                     .a(2, fnj.a().a(fnk.c, fnq.a(djo.et, "_slice2")))
                     .a(3, fnj.a().a(fnk.c, fnq.a(djo.et, "_slice3")))
                     .a(4, fnj.a().a(fnk.c, fnq.a(djo.et, "_slice4")))
                     .a(5, fnj.a().a(fnk.c, fnq.a(djo.et, "_slice5")))
                     .a(6, fnj.a().a(fnk.c, fnq.a(djo.et, "_slice6")))
               )
         );
   }

   private void y() {
      fnt $$0 = new fnt()
         .a(fnu.c, fnt.a(djo.oz, "_side3"))
         .a(fnu.o, fnt.J(djo.t))
         .a(fnu.n, fnt.a(djo.oz, "_top"))
         .a(fnu.j, fnt.a(djo.oz, "_side3"))
         .a(fnu.l, fnt.a(djo.oz, "_side3"))
         .a(fnu.k, fnt.a(djo.oz, "_side1"))
         .a(fnu.m, fnt.a(djo.oz, "_side2"));
      this.b.accept(c(djo.oz, fns.a.a(djo.oz, $$0, this.d)));
   }

   private void z() {
      fnt $$0 = new fnt()
         .a(fnu.c, fnt.a(djo.oD, "_front"))
         .a(fnu.o, fnt.a(djo.oD, "_bottom"))
         .a(fnu.n, fnt.a(djo.oD, "_top"))
         .a(fnu.j, fnt.a(djo.oD, "_front"))
         .a(fnu.k, fnt.a(djo.oD, "_front"))
         .a(fnu.l, fnt.a(djo.oD, "_side"))
         .a(fnu.m, fnt.a(djo.oD, "_side"));
      this.b.accept(c(djo.oD, fns.a.a(djo.oD, $$0, this.d)));
   }

   private void a(djm $$0, djm $$1, BiFunction<djm, djm, fnt> $$2) {
      fnt $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, fns.a.a($$0, $$3, this.d)));
   }

   public void b(djm $$0) {
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
      fnt $$0 = fnt.n(djo.fn);
      this.b.accept(c(djo.fn, fnq.a(djo.fn)));
      this.a(djo.er, $$0);
      this.a(djo.es, $$0);
   }

   private void a(djm $$0, fnt $$1) {
      aku $$2 = fns.p.a($$0, $$1.c(fnu.g, fnt.J($$0)), this.d);
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cwt.to);
      this.n(djo.fO);
      this.b.accept(c(djo.fQ, fns.bz.a(djo.fQ, fnt.j(fnt.a(djo.K, "_still")), this.d)));
      this.b
         .accept(
            fng.a(djo.fP)
               .a(
                  fnh.a(dnx.g)
                     .a(1, fnj.a().a(fnk.c, fns.bx.a(djo.fP, "_level1", fnt.j(fnt.a(djo.J, "_still")), this.d)))
                     .a(2, fnj.a().a(fnk.c, fns.by.a(djo.fP, "_level2", fnt.j(fnt.a(djo.J, "_still")), this.d)))
                     .a(3, fnj.a().a(fnk.c, fns.bz.a(djo.fP, "_full", fnt.j(fnt.a(djo.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fng.a(djo.fR)
               .a(
                  fnh.a(dnx.g)
                     .a(1, fnj.a().a(fnk.c, fns.bx.a(djo.fR, "_level1", fnt.j(fnt.J(djo.rr)), this.d)))
                     .a(2, fnj.a().a(fnk.c, fns.by.a(djo.fR, "_level2", fnt.j(fnt.J(djo.rr)), this.d)))
                     .a(3, fnj.a().a(fnk.c, fns.bz.a(djo.fR, "_full", fnt.j(fnt.J(djo.rr)), this.d)))
               )
         );
   }

   private void C() {
      fnt $$0 = fnt.b(djo.kX);
      aku $$1 = fns.aH.a(djo.kX, $$0, this.d);
      aku $$2 = this.a(djo.kX, "_dead", fns.aH, $$1x -> $$0.c(fnu.b, $$1x));
      this.b.accept(fng.a(djo.kX).a(a(dxn.ax, 5, $$2, $$1)));
   }

   private void D() {
      aku $$0 = fnq.a(djo.tS);
      aku $$1 = fnq.a(djo.tS, "_triggered");
      aku $$2 = fnq.a(djo.tS, "_crafting");
      aku $$3 = fnq.a(djo.tS, "_crafting_triggered");
      this.b
         .accept(
            fng.a(djo.tS)
               .a(fnh.a(dxn.W).a($$0x -> this.a($$0x, fnj.a())))
               .a(
                  fnh.a(dxn.H, dlf.b)
                     .a(false, false, fnj.a().a(fnk.c, $$0))
                     .a(true, true, fnj.a().a(fnk.c, $$3))
                     .a(true, false, fnj.a().a(fnk.c, $$1))
                     .a(false, true, fnj.a().a(fnk.c, $$2))
               )
         );
   }

   private void y(djm $$0) {
      fnt $$1 = new fnt().a(fnu.f, fnt.a(djo.cL, "_top")).a(fnu.i, fnt.a(djo.cL, "_side")).a(fnu.g, fnt.a($$0, "_front"));
      fnt $$2 = new fnt().a(fnu.i, fnt.a(djo.cL, "_top")).a(fnu.g, fnt.a($$0, "_front_vertical"));
      aku $$3 = fns.p.a($$0, $$1, this.d);
      aku $$4 = fns.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxn.S)
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
      aku $$0 = fnq.a(djo.fT);
      aku $$1 = fnq.a(djo.fT, "_filled");
      this.b.accept(fng.a(djo.fT).a(fnh.a(dxn.l).a(false, fnj.a().a(fnk.c, $$0)).a(true, fnj.a().a(fnk.c, $$1))).a(c()));
   }

   private void F() {
      aku $$0 = fnq.a(djo.kW, "_side");
      aku $$1 = fnq.a(djo.kW, "_noside");
      aku $$2 = fnq.a(djo.kW, "_noside1");
      aku $$3 = fnq.a(djo.kW, "_noside2");
      aku $$4 = fnq.a(djo.kW, "_noside3");
      this.b
         .accept(
            fnf.a(djo.kW)
               .a(fne.a().a(dxn.O, true), fnj.a().a(fnk.c, $$0))
               .a(fne.a().a(dxn.P, true), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxn.Q, true), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.c).a(fnk.d, true))
               .a(fne.a().a(dxn.R, true), fnj.a().a(fnk.c, $$0).a(fnk.b, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxn.M, true), fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.d).a(fnk.d, true))
               .a(fne.a().a(dxn.N, true), fnj.a().a(fnk.c, $$0).a(fnk.a, fnk.a.b).a(fnk.d, true))
               .a(fne.a().a(dxn.O, false), fnj.a().a(fnk.c, $$1).a(fnk.e, 2), fnj.a().a(fnk.c, $$2), fnj.a().a(fnk.c, $$3), fnj.a().a(fnk.c, $$4))
               .a(
                  fne.a().a(dxn.P, false),
                  fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.b, fnk.a.b).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxn.Q, false),
                  fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.c).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.c).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.b, fnk.a.c).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.c).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxn.R, false),
                  fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.b, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.d).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxn.M, false),
                  fnj.a().a(fnk.c, $$1).a(fnk.e, 2).a(fnk.a, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$4).a(fnk.a, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$2).a(fnk.a, fnk.a.d).a(fnk.d, true),
                  fnj.a().a(fnk.c, $$3).a(fnk.a, fnk.a.d).a(fnk.d, true)
               )
               .a(
                  fne.a().a(dxn.N, false),
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
            fnf.a(djo.pE)
               .a(fnj.a().a(fnk.c, fnt.J(djo.pE)))
               .a(fne.a().a(dxn.aO, 1), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents1")))
               .a(fne.a().a(dxn.aO, 2), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents2")))
               .a(fne.a().a(dxn.aO, 3), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents3")))
               .a(fne.a().a(dxn.aO, 4), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents4")))
               .a(fne.a().a(dxn.aO, 5), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents5")))
               .a(fne.a().a(dxn.aO, 6), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents6")))
               .a(fne.a().a(dxn.aO, 7), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents7")))
               .a(fne.a().a(dxn.aO, 8), fnj.a().a(fnk.c, fnt.a(djo.pE, "_contents_ready")))
         );
   }

   private void z(djm $$0) {
      aku $$1 = fns.c.a($$0, fnt.a($$0), this.d);
      aku $$2 = this.a($$0, "_powered", fns.c, fnt::b);
      aku $$3 = this.a($$0, "_lit", fns.c, fnt::b);
      aku $$4 = this.a($$0, "_lit_powered", fns.c, fnt::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fnd a(djm $$0, aku $$1, aku $$2, aku $$3, aku $$4) {
      return fng.a($$0).a(fnh.a(dxn.v, dxn.B).a(($$4x, $$5) -> $$4x ? fnj.a().a(fnk.c, $$5 ? $$4 : $$2) : fnj.a().a(fnk.c, $$5 ? $$3 : $$1)));
   }

   private void j(djm $$0, djm $$1) {
      aku $$2 = fnq.a($$0);
      aku $$3 = fnq.a($$0, "_powered");
      aku $$4 = fnq.a($$0, "_lit");
      aku $$5 = fnq.a($$0, "_lit_powered");
      this.c.a($$0.j(), $$1.j());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void A(djm $$0) {
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fns.ao.a($$0, fnt.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.A(djo.ra);
      this.A(djo.qZ);
      this.A(djo.qY);
      this.A(djo.qX);
   }

   private void I() {
      fnh.b<jn, dxt> $$0 = fnh.a(dxn.bp, dxn.bq);

      for (dxt $$1 : dxt.values()) {
         $$0.a(jn.b, $$1, this.a(jn.b, $$1));
      }

      for (dxt $$2 : dxt.values()) {
         $$0.a(jn.a, $$2, this.a(jn.a, $$2));
      }

      this.b.accept(fng.a(djo.sV).a($$0));
   }

   private fnj a(jn $$0, dxt $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fnt $$3 = fnt.c(fnt.a(djo.sV, $$2));
      return fnj.a().a(fnk.c, fns.an.a(djo.sV, $$2, $$3, this.d));
   }

   private void B(djm $$0) {
      fnt $$1 = new fnt().a(fnu.e, fnt.J(djo.ei)).a(fnu.f, fnt.J($$0)).a(fnu.i, fnt.a($$0, "_side"));
      this.b.accept(c($$0, fns.n.a($$0, $$1, this.d)));
   }

   private void J() {
      aku $$0 = fnt.a(djo.hw, "_side");
      fnt $$1 = new fnt().a(fnu.f, fnt.a(djo.hw, "_top")).a(fnu.i, $$0);
      fnt $$2 = new fnt().a(fnu.f, fnt.a(djo.hw, "_inverted_top")).a(fnu.i, $$0);
      this.b
         .accept(
            fng.a(djo.hw)
               .a(
                  fnh.a(dxn.t)
                     .a(false, fnj.a().a(fnk.c, fns.aI.a(djo.hw, $$1, this.d)))
                     .a(true, fnj.a().a(fnk.c, fns.aI.a(fnq.a(djo.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void C(djm $$0) {
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fnq.a($$0))).a(this.o()));
   }

   private void K() {
      djm $$0 = djo.sU;
      aku $$1 = fnq.a($$0, "_on");
      aku $$2 = fnq.a($$0);
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fnq.a($$0))).a(this.o()).a(a(dxn.B, $$1, $$2)));
   }

   private void L() {
      fnt $$0 = new fnt().a(fnu.C, fnt.J(djo.j)).a(fnu.f, fnt.J(djo.cK));
      fnt $$1 = new fnt().a(fnu.C, fnt.J(djo.j)).a(fnu.f, fnt.a(djo.cK, "_moist"));
      aku $$2 = fns.aZ.a(djo.cK, $$0, this.d);
      aku $$3 = fns.aZ.a(fnt.a(djo.cK, "_moist"), $$1, this.d);
      this.b.accept(fng.a(djo.cK).a(a(dxn.aT, 7, $$3, $$2)));
   }

   private List<aku> D(djm $$0) {
      aku $$1 = fns.ba.a(fnq.a($$0, "_floor0"), fnt.y($$0), this.d);
      aku $$2 = fns.ba.a(fnq.a($$0, "_floor1"), fnt.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<aku> E(djm $$0) {
      aku $$1 = fns.bb.a(fnq.a($$0, "_side0"), fnt.y($$0), this.d);
      aku $$2 = fns.bb.a(fnq.a($$0, "_side1"), fnt.z($$0), this.d);
      aku $$3 = fns.bc.a(fnq.a($$0, "_side_alt0"), fnt.y($$0), this.d);
      aku $$4 = fns.bc.a(fnq.a($$0, "_side_alt1"), fnt.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aku> F(djm $$0) {
      aku $$1 = fns.bd.a(fnq.a($$0, "_up0"), fnt.y($$0), this.d);
      aku $$2 = fns.bd.a(fnq.a($$0, "_up1"), fnt.z($$0), this.d);
      aku $$3 = fns.be.a(fnq.a($$0, "_up_alt0"), fnt.y($$0), this.d);
      aku $$4 = fns.be.a(fnq.a($$0, "_up_alt1"), fnt.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fnj> a(List<aku> $$0, UnaryOperator<fnj> $$1) {
      return $$0.stream().map($$0x -> fnj.a().a(fnk.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fne $$0 = fne.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, false).a(dxn.M, false);
      List<aku> $$1 = this.D(djo.cy);
      List<aku> $$2 = this.E(djo.cy);
      List<aku> $$3 = this.F(djo.cy);
      this.b
         .accept(
            fnf.a(djo.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fne.b(fne.a().a(dxn.O, true), $$0), a($$2, $$0x -> $$0x))
               .a(fne.b(fne.a().a(dxn.P, true), $$0), a($$2, $$0x -> $$0x.a(fnk.b, fnk.a.b)))
               .a(fne.b(fne.a().a(dxn.Q, true), $$0), a($$2, $$0x -> $$0x.a(fnk.b, fnk.a.c)))
               .a(fne.b(fne.a().a(dxn.R, true), $$0), a($$2, $$0x -> $$0x.a(fnk.b, fnk.a.d)))
               .a(fne.a().a(dxn.M, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<aku> $$0 = this.D(djo.cz);
      List<aku> $$1 = this.E(djo.cz);
      this.b
         .accept(
            fnf.a(djo.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fnk.b, fnk.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fnk.b, fnk.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fnk.b, fnk.a.d)))
         );
   }

   private void G(djm $$0) {
      aku $$1 = fnv.t.create($$0, this.d);
      aku $$2 = fnv.u.create($$0, this.d);
      this.b($$0.j());
      this.b.accept(fng.a($$0).a(a(dxn.n, $$2, $$1)));
   }

   private void O() {
      fnt $$0 = fnt.a(fnt.a(djo.ah, "_side"), fnt.a(djo.ah, "_top"));
      aku $$1 = fns.j.a(djo.ah, $$0, this.d);
      this.b.accept(d(djo.ah, $$1));
   }

   private void P() {
      this.b(cwt.af);
      djm $$0 = djo.H;
      fnh.b<Boolean, Integer> $$1 = fnh.a(doj.d, doj.b);
      aku $$2 = fnq.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aku $$4 = fnq.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fnj.a().a(fnk.c, $$4));
         $$1.a(false, $$3, fnj.a().a(fnk.c, $$2));
      }

      this.b.accept(fng.a(djo.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fng.a(djo.lk)
               .a(
                  fnh.a(dxn.av)
                     .a(0, fnj.a().a(fnk.c, this.a(djo.lk, "_0", fns.c, fnt::b)))
                     .a(1, fnj.a().a(fnk.c, this.a(djo.lk, "_1", fns.c, fnt::b)))
                     .a(2, fnj.a().a(fnk.c, this.a(djo.lk, "_2", fns.c, fnt::b)))
                     .a(3, fnj.a().a(fnk.c, this.a(djo.lk, "_3", fns.c, fnt::b)))
               )
         );
   }

   private void R() {
      aku $$0 = fnt.J(djo.j);
      fnt $$1 = new fnt().a(fnu.e, $$0).b(fnu.e, fnu.c).a(fnu.f, fnt.a(djo.i, "_top")).a(fnu.i, fnt.a(djo.i, "_snow"));
      fnj $$2 = fnj.a().a(fnk.c, fns.n.a(djo.i, "_snow", $$1, this.d));
      this.a(djo.i, fnq.a(djo.i), $$2);
      this.a(djo.i, fnq.a(djo.i), new fms());
      aku $$3 = fnv.f.get(djo.fA).a($$1x -> $$1x.a(fnu.e, $$0)).a(djo.fA, this.d);
      this.a(djo.fA, $$3, $$2);
      aku $$4 = fnv.f.get(djo.l).a($$1x -> $$1x.a(fnu.e, $$0)).a(djo.l, this.d);
      this.a(djo.l, $$4, $$2);
   }

   private void a(djm $$0, aku $$1, fnj $$2) {
      List<fnj> $$3 = Arrays.asList(a($$1));
      this.b.accept(fng.a($$0).a(fnh.a(dxn.F).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cwt.se);
      this.b
         .accept(
            fng.a(djo.fX)
               .a(
                  fnh.a(dxn.au)
                     .a(0, fnj.a().a(fnk.c, fnq.a(djo.fX, "_stage0")))
                     .a(1, fnj.a().a(fnk.c, fnq.a(djo.fX, "_stage1")))
                     .a(2, fnj.a().a(fnk.c, fnq.a(djo.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(djo.lg, fnq.a(djo.lg)));
   }

   private void k(djm $$0, djm $$1) {
      fnt $$2 = fnt.b($$1);
      aku $$3 = fns.Y.a($$0, $$2, this.d);
      aku $$4 = fns.Z.a($$0, $$2, this.d);
      this.b.accept(fng.a($$0).a(a(dxn.aW, 1, $$4, $$3)));
   }

   private void U() {
      aku $$0 = fnq.a(djo.hz);
      aku $$1 = fnq.a(djo.hz, "_side");
      this.b(cwt.mo);
      this.b
         .accept(
            fng.a(djo.hz)
               .a(
                  fnh.a(dxn.T)
                     .a(jn.a, fnj.a().a(fnk.c, $$0))
                     .a(jn.c, fnj.a().a(fnk.c, $$1))
                     .a(jn.f, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.b))
                     .a(jn.d, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.c))
                     .a(jn.e, fnj.a().a(fnk.c, $$1).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void l(djm $$0, djm $$1) {
      aku $$2 = fnq.a($$0);
      this.b.accept(fng.a($$1, fnj.a().a(fnk.c, $$2)));
      this.c.a($$0.j(), $$1.j());
   }

   private void V() {
      aku $$0 = fnq.a(djo.fk, "_post_ends");
      aku $$1 = fnq.a(djo.fk, "_post");
      aku $$2 = fnq.a(djo.fk, "_cap");
      aku $$3 = fnq.a(djo.fk, "_cap_alt");
      aku $$4 = fnq.a(djo.fk, "_side");
      aku $$5 = fnq.a(djo.fk, "_side_alt");
      this.b
         .accept(
            fnf.a(djo.fk)
               .a(fnj.a().a(fnk.c, $$0))
               .a(fne.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, false), fnj.a().a(fnk.c, $$1))
               .a(fne.a().a(dxn.O, true).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, false), fnj.a().a(fnk.c, $$2))
               .a(fne.a().a(dxn.O, false).a(dxn.P, true).a(dxn.Q, false).a(dxn.R, false), fnj.a().a(fnk.c, $$2).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, true).a(dxn.R, false), fnj.a().a(fnk.c, $$3))
               .a(fne.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, true), fnj.a().a(fnk.c, $$3).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.O, true), fnj.a().a(fnk.c, $$4))
               .a(fne.a().a(dxn.P, true), fnj.a().a(fnk.c, $$4).a(fnk.b, fnk.a.b))
               .a(fne.a().a(dxn.Q, true), fnj.a().a(fnk.c, $$5))
               .a(fne.a().a(dxn.R, true), fnj.a().a(fnk.c, $$5).a(fnk.b, fnk.a.b))
         );
      this.c(djo.fk);
   }

   private void H(djm $$0) {
      this.b.accept(fng.a($$0, fnj.a().a(fnk.c, fnq.a($$0))).a(b()));
   }

   private void W() {
      aku $$0 = fnq.a(djo.dI);
      aku $$1 = fnq.a(djo.dI, "_on");
      this.c(djo.dI);
      this.b
         .accept(
            fng.a(djo.dI)
               .a(a(dxn.B, $$0, $$1))
               .a(
                  fnh.a(dxn.X, dxn.U)
                     .a(dxi.c, jn.c, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.c))
                     .a(dxi.c, jn.f, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.d))
                     .a(dxi.c, jn.d, fnj.a().a(fnk.a, fnk.a.c))
                     .a(dxi.c, jn.e, fnj.a().a(fnk.a, fnk.a.c).a(fnk.b, fnk.a.b))
                     .a(dxi.a, jn.c, fnj.a())
                     .a(dxi.a, jn.f, fnj.a().a(fnk.b, fnk.a.b))
                     .a(dxi.a, jn.d, fnj.a().a(fnk.b, fnk.a.c))
                     .a(dxi.a, jn.e, fnj.a().a(fnk.b, fnk.a.d))
                     .a(dxi.b, jn.c, fnj.a().a(fnk.a, fnk.a.b))
                     .a(dxi.b, jn.f, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.b))
                     .a(dxi.b, jn.d, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.c))
                     .a(dxi.b, jn.e, fnj.a().a(fnk.a, fnk.a.b).a(fnk.b, fnk.a.d))
               )
         );
   }

   private void X() {
      aku $$0 = this.a(cwt.gx, djo.fB);
      this.a(djo.fB, $$0, fno.a(-9321636));
      this.b.accept(b(djo.fB, fnq.a(djo.fB)));
   }

   private void Y() {
      this.c(djo.tP);
      this.b.accept(c(djo.tP, fnq.a(djo.tP)));
   }

   private void Z() {
      this.b.accept(fng.a(djo.eq).a(fnh.a(dxn.K).a(jn.a.a, fnj.a().a(fnk.c, fnq.a(djo.eq, "_ns"))).a(jn.a.c, fnj.a().a(fnk.c, fnq.a(djo.eq, "_ew")))));
   }

   private void aa() {
      aku $$0 = fnv.a.create(djo.ei, this.d);
      this.b
         .accept(
            fng.a(
               djo.ei,
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
      aku $$0 = fnq.a(djo.lq);
      aku $$1 = fnq.a(djo.lq, "_on");
      this.b.accept(fng.a(djo.lq).a(a(dxn.B, $$1, $$0)).a(e()));
   }

   private void ac() {
      fnt $$0 = new fnt().a(fnu.e, fnt.a(djo.bF, "_bottom")).a(fnu.i, fnt.a(djo.bF, "_side"));
      aku $$1 = fnt.a(djo.bF, "_top_sticky");
      aku $$2 = fnt.a(djo.bF, "_top");
      fnt $$3 = $$0.c(fnu.F, $$1);
      fnt $$4 = $$0.c(fnu.F, $$2);
      aku $$5 = fnq.a(djo.bF, "_base");
      this.a(djo.bF, $$5, $$4);
      this.a(djo.by, $$5, $$3);
      aku $$6 = fns.n.a(djo.bF, "_inventory", $$0.c(fnu.f, $$2), this.d);
      aku $$7 = fns.n.a(djo.by, "_inventory", $$0.c(fnu.f, $$1), this.d);
      this.a(djo.bF, $$6);
      this.a(djo.by, $$7);
   }

   private void a(djm $$0, aku $$1, fnt $$2) {
      aku $$3 = fns.bo.a($$0, $$2, this.d);
      this.b.accept(fng.a($$0).a(a(dxn.k, $$1, $$3)).a(e()));
   }

   private void ad() {
      fnt $$0 = new fnt().a(fnu.G, fnt.a(djo.bF, "_top")).a(fnu.i, fnt.a(djo.bF, "_side"));
      fnt $$1 = $$0.c(fnu.F, fnt.a(djo.bF, "_top_sticky"));
      fnt $$2 = $$0.c(fnu.F, fnt.a(djo.bF, "_top"));
      this.b
         .accept(
            fng.a(djo.bG)
               .a(
                  fnh.a(dxn.C, dxn.bj)
                     .a(false, dxy.a, fnj.a().a(fnk.c, fns.bp.a(djo.bF, "_head", $$2, this.d)))
                     .a(false, dxy.b, fnj.a().a(fnk.c, fns.bp.a(djo.bF, "_head_sticky", $$1, this.d)))
                     .a(true, dxy.a, fnj.a().a(fnk.c, fns.bq.a(djo.bF, "_head_short", $$2, this.d)))
                     .a(true, dxy.b, fnj.a().a(fnk.c, fns.bq.a(djo.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      djm $$0 = djo.tT;
      fnt $$1 = fnt.a($$0, "_side_inactive", "_top_inactive");
      fnt $$2 = fnt.a($$0, "_side_active", "_top_active");
      fnt $$3 = fnt.a($$0, "_side_active", "_top_ejecting_reward");
      fnt $$4 = fnt.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fnt $$5 = fnt.a($$0, "_side_active_ominous", "_top_active_ominous");
      fnt $$6 = fnt.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      aku $$7 = fns.o.a($$0, $$1, this.d);
      aku $$8 = fns.o.a($$0, "_active", $$2, this.d);
      aku $$9 = fns.o.a($$0, "_ejecting_reward", $$3, this.d);
      aku $$10 = fns.o.a($$0, "_inactive_ominous", $$4, this.d);
      aku $$11 = fns.o.a($$0, "_active_ominous", $$5, this.d);
      aku $$12 = fns.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fng.a($$0).a(fnh.a(dxn.bB, dxn.bD).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fnj.a().a(fnk.c, $$7x ? $$10 : $$7);
            case b, c, d -> fnj.a().a(fnk.c, $$7x ? $$11 : $$8);
            case e -> fnj.a().a(fnk.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      djm $$0 = djo.tU;
      fnt $$1 = fnt.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fnt $$2 = fnt.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fnt $$3 = fnt.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fnt $$4 = fnt.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      aku $$5 = fns.bX.a($$0, $$1, this.d);
      aku $$6 = fns.bX.a($$0, "_active", $$2, this.d);
      aku $$7 = fns.bX.a($$0, "_unlocking", $$3, this.d);
      aku $$8 = fns.bX.a($$0, "_ejecting_reward", $$4, this.d);
      fnt $$9 = fnt.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fnt $$10 = fnt.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnt $$11 = fnt.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnt $$12 = fnt.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      aku $$13 = fns.bX.a($$0, "_ominous", $$9, this.d);
      aku $$14 = fns.bX.a($$0, "_active_ominous", $$10, this.d);
      aku $$15 = fns.bX.a($$0, "_unlocking_ominous", $$11, this.d);
      aku $$16 = fns.bX.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fng.a($$0).a(b()).a(fnh.a(dsm.b, dsm.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fnj.a().a(fnk.c, $$9x ? $$13 : $$5);
            case b -> fnj.a().a(fnk.c, $$9x ? $$14 : $$6);
            case c -> fnj.a().a(fnk.c, $$9x ? $$15 : $$7);
            case d -> fnj.a().a(fnk.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      aku $$0 = fnq.a(djo.rs, "_inactive");
      aku $$1 = fnq.a(djo.rs, "_active");
      this.a(djo.rs, $$0);
      this.b.accept(fng.a(djo.rs).a(fnh.a(dxn.br).a($$2 -> fnj.a().a(fnk.c, $$2 != dyd.b && $$2 != dyd.c ? $$0 : $$1))));
   }

   private void ah() {
      aku $$0 = fnq.a(djo.rt, "_inactive");
      aku $$1 = fnq.a(djo.rt, "_active");
      this.a(djo.rt, $$0);
      this.b.accept(fng.a(djo.rt).a(fnh.a(dxn.br).a($$2 -> fnj.a().a(fnk.c, $$2 != dyd.b && $$2 != dyd.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      aku $$0 = fns.bW.a(djo.rx, fnt.a(false), this.d);
      aku $$1 = fns.bW.a(djo.rx, "_can_summon", fnt.a(true), this.d);
      this.a(djo.rx, $$0);
      this.b.accept(fng.a(djo.rx).a(a(dxn.f, $$1, $$0)));
   }

   private void aj() {
      aku $$0 = fnq.a(djo.ou, "_stable");
      aku $$1 = fnq.a(djo.ou, "_unstable");
      this.a(djo.ou, $$0);
      this.b.accept(fng.a(djo.ou).a(a(dxn.e, $$1, $$0)));
   }

   private void ak() {
      aku $$0 = this.a(djo.sX, "", fns.ao, fnt::c);
      aku $$1 = this.a(djo.sX, "_lit", fns.ao, fnt::c);
      this.b.accept(fng.a(djo.sX).a(a(dxn.c, $$1, $$0)));
      aku $$2 = this.a(djo.sY, "", fns.ao, fnt::c);
      aku $$3 = this.a(djo.sY, "_lit", fns.ao, fnt::c);
      this.b.accept(fng.a(djo.sY).a(a(dxn.c, $$3, $$2)));
   }

   private void al() {
      aku $$0 = fnv.a.create(djo.fW, this.d);
      aku $$1 = this.a(djo.fW, "_on", fns.c, fnt::b);
      this.b.accept(fng.a(djo.fW).a(a(dxn.v, $$1, $$0)));
   }

   private void m(djm $$0, djm $$1) {
      fnt $$2 = fnt.B($$0);
      this.b.accept(c($$0, fns.bi.a($$0, $$2, this.d)));
      this.b.accept(fng.a($$1, fnj.a().a(fnk.c, fns.bk.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fnt $$0 = fnt.B(djo.dX);
      fnt $$1 = fnt.i(fnt.a(djo.dX, "_off"));
      aku $$2 = fns.bm.a(djo.dX, $$0, this.d);
      aku $$3 = fns.bj.a(djo.dX, "_off", $$1, this.d);
      this.b.accept(fng.a(djo.dX).a(a(dxn.v, $$2, $$3)));
      aku $$4 = fns.bn.a(djo.dY, $$0, this.d);
      aku $$5 = fns.bl.a(djo.dY, "_off", $$1, this.d);
      this.b.accept(fng.a(djo.dY).a(a(dxn.v, $$4, $$5)).a(d()));
      this.c(djo.dX);
   }

   private void an() {
      this.b(cwt.mh);
      this.b.accept(fng.a(djo.eu).a(fnh.a(dxn.aD, dxn.w, dxn.B).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fnj.a().a(fnk.c, fnt.a(djo.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cwt.da);
      this.b
         .accept(
            fng.a(djo.nx)
               .a(
                  fnh.a(dxn.aV, dxn.J)
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
      fnt $$0 = fnt.a(djo.ea);
      aku $$1 = fns.c.a(djo.ec, $$0, this.d);
      this.b.accept(fng.a(djo.ea).a(fnh.a(dxn.aI).a($$1x -> fnj.a().a(fnk.c, $$1x < 8 ? fnq.a(djo.ea, "_height" + $$1x * 2) : $$1))));
      this.a(djo.ea, fnq.a(djo.ea, "_height2"));
      this.b.accept(c(djo.ec, $$1));
   }

   private void aq() {
      this.b.accept(fng.a(djo.oE, fnj.a().a(fnk.c, fnq.a(djo.oE))).a(b()));
   }

   private void ar() {
      aku $$0 = fnv.a.create(djo.pC, this.d);
      this.a(djo.pC, $$0);
      this.b.accept(fng.a(djo.pC).a(fnh.a(dxn.bm).a($$0x -> fnj.a().a(fnk.c, this.a(djo.pC, "_" + $$0x.c(), fns.c, fnt::b)))));
   }

   private void as() {
      this.b(cwt.xv);
      this.b.accept(fng.a(djo.oK).a(fnh.a(dxn.av).a($$0 -> fnj.a().a(fnk.c, this.a(djo.oK, "_stage" + $$0, fns.ao, fnt::c)))));
   }

   private void at() {
      this.b(cwt.pX);
      this.b
         .accept(
            fng.a(djo.gd)
               .a(
                  fnh.a(dxn.b, dxn.P, dxn.O, dxn.Q, dxn.R)
                     .a(false, false, false, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_ns")))
                     .a(false, true, false, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_n")).a(fnk.b, fnk.a.b))
                     .a(false, false, true, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_n")))
                     .a(false, false, false, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_n")).a(fnk.b, fnk.a.c))
                     .a(false, false, false, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_n")).a(fnk.b, fnk.a.d))
                     .a(false, true, true, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_ne")))
                     .a(false, true, false, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_ne")).a(fnk.b, fnk.a.b))
                     .a(false, false, false, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_ne")).a(fnk.b, fnk.a.c))
                     .a(false, false, true, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_ne")).a(fnk.b, fnk.a.d))
                     .a(false, false, true, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_ns")))
                     .a(false, true, false, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_ns")).a(fnk.b, fnk.a.b))
                     .a(false, true, true, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_nse")))
                     .a(false, true, false, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_nse")).a(fnk.b, fnk.a.b))
                     .a(false, false, true, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_nse")).a(fnk.b, fnk.a.c))
                     .a(false, true, true, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_nse")).a(fnk.b, fnk.a.d))
                     .a(false, true, true, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_nsew")))
                     .a(true, false, false, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_ns")))
                     .a(true, false, true, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_n")))
                     .a(true, false, false, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_n")).a(fnk.b, fnk.a.c))
                     .a(true, true, false, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_n")).a(fnk.b, fnk.a.b))
                     .a(true, false, false, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_n")).a(fnk.b, fnk.a.d))
                     .a(true, true, true, false, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_ne")))
                     .a(true, true, false, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_ne")).a(fnk.b, fnk.a.b))
                     .a(true, false, false, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_ne")).a(fnk.b, fnk.a.c))
                     .a(true, false, true, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_ne")).a(fnk.b, fnk.a.d))
                     .a(true, false, true, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_ns")))
                     .a(true, true, false, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_ns")).a(fnk.b, fnk.a.b))
                     .a(true, true, true, true, false, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_nse")))
                     .a(true, true, false, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_nse")).a(fnk.b, fnk.a.b))
                     .a(true, false, true, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_nse")).a(fnk.b, fnk.a.c))
                     .a(true, true, true, false, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_nse")).a(fnk.b, fnk.a.d))
                     .a(true, true, true, true, true, fnj.a().a(fnk.c, fnq.a(djo.gd, "_attached_nsew")))
               )
         );
   }

   private void au() {
      this.c(djo.gc);
      this.b
         .accept(fng.a(djo.gc).a(fnh.a(dxn.b, dxn.B).a(($$0, $$1) -> fnj.a().a(fnk.c, fnt.a(djo.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aku a(int $$0, String $$1, fnt $$2) {
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

   private aku a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fnt.b(fnt.J(djo.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fnt.b(fnt.a(djo.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fnt.b(fnt.a(djo.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void av() {
      this.b(cwt.kM);
      this.b.accept(fng.a(djo.mH).a(fnh.a(dxn.aG, dxn.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void aw() {
      this.b(cwt.kN);
      Function<Integer, aku> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fnt $$2 = fnt.a($$1);
         return fns.bD.a(djo.mI, $$1, $$2, this.d);
      };
      this.b.accept(fng.a(djo.mI).a(fnh.a(dqz.c).a($$1 -> fnj.a().a(fnk.c, $$0.apply($$1)))));
   }

   private void I(djm $$0) {
      this.c($$0);
      this.J($$0);
   }

   private void b(djm $$0, cwl $$1) {
      this.b($$1);
      this.J($$0);
   }

   private void J(djm $$0) {
      aku $$1 = fnq.a($$0);
      fnf $$2 = fnf.a($$0);
      fne.c $$3 = af.a(fne.a(), $$1x -> a.stream().<jn>map(Pair::getFirst).map(doo::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jn, Function<aku, fnj>> $$4 : a) {
         dxo $$5 = doo.b((jn)$$4.getFirst());
         Function<aku, fnj> $$6 = (Function<aku, fnj>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fne.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void K(djm $$0) {
      aku $$1 = fnv.j.create($$0, this.d);
      aku $$2 = fnv.k.get($$0).a($$1x -> $$1x.a(fnu.i, fnt.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      aku $$3 = fnv.k.get($$0).a($$1x -> $$1x.a(fnu.i, fnt.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fnf $$4 = fnf.a($$0);
      fne.c $$5 = fne.a().a(dom.b, false);
      $$4.a(fne.a().a(dom.b, true), fnj.a().a(fnk.c, $$1));
      $$4.a($$5, fnj.a().a(fnk.c, $$1));
      a.stream().<jn>map(Pair::getFirst).forEach($$2x -> {
         dxu<dyi> $$3x = dom.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dyi.a);
         }
      });

      for (Pair<jn, Function<aku, fnj>> $$6 : a) {
         jn $$7 = (jn)$$6.getFirst();
         dxu<dyi> $$8 = dom.a($$7);
         if ($$8 != null) {
            Function<aku, fnj> $$9 = (Function<aku, fnj>)$$6.getSecond();
            $$4.a(fne.a().a($$8, dyi.c), $$9.apply($$2));
            $$4.a(fne.a().a($$8, dyi.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void L(djm $$0) {
      fnh $$1 = fnh.a(dne.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fnt $$3 = fnt.c(fnt.a($$0, $$2));
         aku $$4 = fmy.d.b.a().a($$0, $$2, $$3, this.d);
         return fnj.a().a(fnk.c, $$4);
      });
      this.c($$0);
      this.b.accept(fng.a($$0).a($$1));
   }

   private void ax() {
      aku $$0 = fnt.a(djo.rw, "_bottom");
      fnt $$1 = new fnt().a(fnu.e, $$0).a(fnu.f, fnt.a(djo.rw, "_top")).a(fnu.i, fnt.a(djo.rw, "_side"));
      fnt $$2 = new fnt().a(fnu.e, $$0).a(fnu.f, fnt.a(djo.rw, "_top_bloom")).a(fnu.i, fnt.a(djo.rw, "_side_bloom"));
      aku $$3 = fns.n.a(djo.rw, "", $$1, this.d);
      aku $$4 = fns.n.a(djo.rw, "_bloom", $$2, this.d);
      this.b.accept(fng.a(djo.rw).a(fnh.a(dxn.d).a($$2x -> fnj.a().a(fnk.c, $$2x ? $$4 : $$3))));
      this.a(djo.rw, $$3);
   }

   private void ay() {
      djm $$0 = djo.ct;
      aku $$1 = fnq.a($$0);
      fnf $$2 = fnf.a($$0);
      List.of(Pair.of(jn.c, fnk.a.a), Pair.of(jn.f, fnk.a.b), Pair.of(jn.d, fnk.a.c), Pair.of(jn.e, fnk.a.d)).forEach($$2x -> {
         jn $$3 = (jn)$$2x.getFirst();
         fnk.a $$4 = (fnk.a)$$2x.getSecond();
         fne.c $$5 = fne.a().a(dxn.U, $$3);
         $$2.a($$5, fnj.a().a(fnk.c, $$1).a(fnk.b, $$4).a(fnk.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fnq.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fnf $$0, fne.c $$1, fnk.a $$2) {
      List.of(
            Pair.of(dxn.bs, fns.aP),
            Pair.of(dxn.bt, fns.aQ),
            Pair.of(dxn.bu, fns.aR),
            Pair.of(dxn.bv, fns.aS),
            Pair.of(dxn.bw, fns.aT),
            Pair.of(dxn.bx, fns.aU)
         )
         .forEach($$3 -> {
            dxo $$4 = (dxo)$$3.getFirst();
            fnr $$5 = (fnr)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fnf $$0, fne.c $$1, fnk.a $$2, dxo $$3, fnr $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fnt $$7 = new fnt().a(fnu.b, fnt.a(djo.ct, $$6));
      fmy.c $$8 = new fmy.c($$4, $$6);
      aku $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(djo.ct, $$6, $$7, this.d));
      $$0.a(fne.a($$1, fne.a().a($$3, $$5)), fnj.a().a(fnk.c, $$9).a(fnk.b, $$2));
   }

   private void az() {
      this.b.accept(c(djo.ll, fns.c.a(djo.ll, fnt.b(fnq.a("magma")), this.d)));
   }

   private void a(djm $$0, @Nullable cvm $$1) {
      this.r($$0);
      cwl $$2 = $$0.j();
      aku $$3 = fns.bK.a($$2, fnt.x($$0), this.d);
      hbi.b $$4 = $$1 != null ? fno.a($$3, new hdm.a($$1)) : fno.a($$3, new hdm.a());
      this.c.a($$2, $$4);
   }

   private void c(djm $$0, djm $$1, fmy.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aA() {
      aku $$0 = fnq.a(djo.b);
      aku $$1 = fnq.a(djo.b, "_mirrored");
      this.b.accept(a(djo.fb, $$0, $$1));
      this.a(djo.fb, $$0);
   }

   private void aB() {
      aku $$0 = fnq.a(djo.tl);
      aku $$1 = fnq.a(djo.tl, "_mirrored");
      this.b.accept(a(djo.tF, $$0, $$1).a(f()));
      this.a(djo.tF, $$0);
   }

   private void n(djm $$0, djm $$1) {
      this.a($$0, fmy.d.b);
      fnt $$2 = fnt.d(fnt.a($$0, "_pot"));
      aku $$3 = fmy.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aC() {
      aku $$0 = fnt.a(djo.pN, "_bottom");
      aku $$1 = fnt.a(djo.pN, "_top_off");
      aku $$2 = fnt.a(djo.pN, "_top");
      aku[] $$3 = new aku[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fnt $$5 = new fnt().a(fnu.e, $$0).a(fnu.f, $$4 == 0 ? $$1 : $$2).a(fnu.i, fnt.a(djo.pN, "_side" + $$4));
         $$3[$$4] = fns.n.a(djo.pN, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fng.a(djo.pN).a(fnh.a(dxn.bc).a($$1x -> fnj.a().a(fnk.c, $$3[$$1x]))));
      this.a(djo.pN, $$3[0]);
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
      aku $$0 = fnt.a(djo.pD, "_top");
      aku $$1 = fnt.a(djo.pD, "_bottom");
      aku $$2 = fnt.a(djo.pD, "_side");
      aku $$3 = fnt.a(djo.pD, "_lock");
      fnt $$4 = new fnt().a(fnu.o, $$2).a(fnu.m, $$2).a(fnu.l, $$2).a(fnu.c, $$0).a(fnu.j, $$0).a(fnu.k, $$1).a(fnu.n, $$3);
      aku $$5 = fns.b.a(djo.pD, $$4, this.d);
      this.b.accept(fng.a(djo.pD, fnj.a().a(fnk.c, $$5)).a(fnh.a(dxn.W).a($$0x -> this.a($$0x, fnj.a()))));
   }

   private void aE() {
      djm $$0 = djo.n;
      aku $$1 = fnq.a($$0);
      fnv $$2 = fnv.a.get($$0);
      djm $$3 = djo.kg;
      aku $$4 = fns.ab.a($$3, $$2.b(), this.d);
      aku $$5 = fns.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(djm $$0, djm $$1, dqt.a $$2, aku $$3) {
      aku $$4 = fnq.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.j(), fno.a($$3, new hdn.a($$2)));
   }

   private void aF() {
      aku $$0 = fnq.b("template_skull");
      this.a(djo.hj, djo.hk, dqt.b.g, $$0);
      this.a(djo.hh, djo.hi, dqt.b.e, $$0);
      this.a(djo.hf, djo.hg, dqt.b.f, $$0);
      this.a(djo.hb, djo.hc, dqt.b.c, $$0);
      this.a(djo.hd, djo.he, dqt.b.d, $$0);
      this.a(djo.hn, djo.ho, dqt.b.h, $$0);
      this.a(djo.hl, djo.hm, dqt.b.i, fnq.a(cwt.vp));
   }

   private void a(djm $$0, djm $$1, cvm $$2) {
      aku $$3 = fnq.a("banner");
      aku $$4 = fnq.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cwl $$5 = $$0.j();
      this.c.a($$5, fno.a($$4, new hdf.a($$2)));
   }

   private void aG() {
      this.a(djo.jh, djo.jx, cvm.a);
      this.a(djo.ji, djo.jy, cvm.b);
      this.a(djo.jj, djo.jz, cvm.c);
      this.a(djo.jk, djo.jA, cvm.d);
      this.a(djo.jl, djo.jB, cvm.e);
      this.a(djo.jm, djo.jC, cvm.f);
      this.a(djo.jn, djo.jD, cvm.g);
      this.a(djo.jo, djo.jE, cvm.h);
      this.a(djo.jp, djo.jF, cvm.i);
      this.a(djo.jq, djo.jG, cvm.j);
      this.a(djo.jr, djo.jH, cvm.k);
      this.a(djo.js, djo.jI, cvm.l);
      this.a(djo.jt, djo.jJ, cvm.m);
      this.a(djo.ju, djo.jK, cvm.n);
      this.a(djo.jv, djo.jL, cvm.o);
      this.a(djo.jw, djo.jM, cvm.p);
   }

   private void a(djm $$0, djm $$1, aku $$2, boolean $$3) {
      this.a($$0, $$1);
      cwl $$4 = $$0.j();
      aku $$5 = fns.bM.a($$4, fnt.x($$1), this.d);
      hbi.b $$6 = fno.a($$5, new hdh.a($$2));
      if ($$3) {
         hbi.b $$7 = fno.a($$5, new hdh.a(hdh.a));
         this.c.a($$4, fno.a(new hcd(), $$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aH() {
      this.a(djo.cD, djo.n, hdh.b, true);
      this.a(djo.hs, djo.n, hdh.c, true);
      this.a(djo.gb, djo.cv, hdh.d, false);
   }

   private void b(djm $$0, djm $$1, cvm $$2) {
      aku $$3 = fnq.a("bed");
      this.b.accept(c($$0, $$3));
      cwl $$4 = $$0.j();
      aku $$5 = fns.bL.a(fnq.a($$4), fnt.x($$1), this.d);
      this.c.a($$4, fno.a($$5, new hdg.a($$2)));
   }

   private void aI() {
      this.b(djo.bg, djo.bH, cvm.a);
      this.b(djo.bh, djo.bI, cvm.b);
      this.b(djo.bi, djo.bJ, cvm.c);
      this.b(djo.bj, djo.bK, cvm.d);
      this.b(djo.bk, djo.bL, cvm.e);
      this.b(djo.bl, djo.bM, cvm.f);
      this.b(djo.bm, djo.bN, cvm.g);
      this.b(djo.bn, djo.bO, cvm.h);
      this.b(djo.bo, djo.bP, cvm.i);
      this.b(djo.bp, djo.bQ, cvm.j);
      this.b(djo.bq, djo.bR, cvm.k);
      this.b(djo.br, djo.bS, cvm.l);
      this.b(djo.bs, djo.bT, cvm.m);
      this.b(djo.bt, djo.bU, cvm.n);
      this.b(djo.bu, djo.bV, cvm.o);
      this.b(djo.bv, djo.bW, cvm.p);
   }

   private void a(djm $$0, hdo.a $$1) {
      cwl $$2 = $$0.j();
      aku $$3 = fnq.a($$2);
      this.c.a($$2, fno.a($$3, $$1));
   }

   public void a() {
      me.a().filter(mf::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(djo.rH).a(me.x).a(djo.rH, djo.sf).a(djo.rL, djo.rP).a(me.z);
      this.i(djo.rG).a(me.B).a(djo.rG, djo.se).a(djo.rK, djo.rO).a(me.D);
      this.i(djo.rF).a(me.F).a(djo.rF, djo.sd).a(djo.rJ, djo.rN).a(me.H);
      this.i(djo.rE).a(me.J).a(djo.rE, djo.sc).a(djo.rI, djo.rM).a(me.L);
      this.z(djo.sM);
      this.z(djo.sN);
      this.z(djo.sO);
      this.z(djo.sP);
      this.j(djo.sM, djo.sQ);
      this.j(djo.sN, djo.sR);
      this.j(djo.sO, djo.sS);
      this.j(djo.sP, djo.sT);
      this.n(djo.a);
      this.d(djo.nE, djo.a);
      this.d(djo.nD, djo.a);
      this.n(djo.gj);
      this.n(djo.ed);
      this.d(djo.nF, djo.J);
      this.n(djo.fV);
      this.n(djo.mG);
      this.n(djo.fM);
      this.n(djo.gm);
      this.b(cwt.vd);
      this.n(djo.pI);
      this.n(djo.J);
      this.n(djo.K);
      this.n(djo.it);
      this.b(cwt.gh);
      this.o(djo.qo, djo.qF);
      this.o(djo.qp, djo.qG);
      this.o(djo.qq, djo.qH);
      this.o(djo.qr, djo.qI);
      this.o(djo.qs, djo.qJ);
      this.o(djo.qt, djo.qK);
      this.o(djo.qu, djo.qL);
      this.o(djo.qv, djo.qM);
      this.o(djo.qw, djo.qN);
      this.o(djo.qx, djo.qO);
      this.o(djo.qy, djo.qP);
      this.o(djo.qz, djo.qQ);
      this.o(djo.qA, djo.qR);
      this.o(djo.qB, djo.qS);
      this.o(djo.qC, djo.qT);
      this.o(djo.qD, djo.qU);
      this.o(djo.qn, djo.qE);
      this.n(djo.nC);
      this.n(djo.gO);
      this.n(djo.rr);
      this.n(djo.sZ);
      this.v(djo.ta);
      this.v(djo.tb);
      this.w(djo.tK);
      this.w(djo.tL);
      this.ak();
      this.h(djo.te, djo.tc);
      this.K(djo.tX);
      this.L(djo.tY);
      this.a(djo.tW);
      this.s(djo.td);
      this.a(djo.iu, cwt.hY);
      this.b(cwt.hY);
      this.aJ();
      this.a(djo.lp, cwt.jy);
      this.b(cwt.jy);
      this.f(djo.bX, fnt.a(djo.bF, "_side"));
      this.a(djo.U);
      this.a(djo.V);
      this.a(djo.iZ);
      this.a(djo.cF);
      this.a(djo.cG);
      this.a(djo.cH);
      this.a(djo.fZ);
      this.a(djo.ga);
      this.a(djo.ge);
      this.a(djo.Q);
      this.a(djo.W);
      this.a(djo.R);
      this.a(djo.co);
      this.a(djo.S);
      this.a(djo.T);
      this.a(djo.cp);
      this.b(djo.pL, fnv.d);
      this.a(djo.pK);
      this.a(djo.aY);
      this.a(djo.aZ);
      this.a(djo.ba);
      this.a(djo.fC);
      this.a(djo.hy);
      this.a(djo.dV);
      this.a(djo.dW);
      this.a(djo.hx);
      this.a(djo.qe);
      this.a(djo.ny);
      this.a(djo.ee);
      this.a(djo.k);
      this.a(djo.pM);
      this.a(djo.fU);
      this.a(djo.ep);
      this.a(djo.O);
      this.a(djo.pJ);
      this.a(djo.eb);
      this.b(djo.eg, fnv.g);
      this.b(djo.pS, fnv.d);
      this.b(djo.fo, fnv.d);
      this.n(djo.ag);
      this.n(djo.gw);
      this.a(djo.lm);
      this.a(djo.bf);
      this.a(djo.ja);
      this.a(djo.cv);
      this.a(djo.qm);
      this.a(djo.iG);
      this.a(djo.pa);
      this.a(djo.ej);
      this.a(djo.ek);
      this.b(djo.cA, fnv.b);
      this.g(djo.cB);
      this.a(djo.aV);
      this.b(djo.bD, fnv.v);
      this.b(cwt.cZ);
      this.b(djo.cr, fnv.f);
      this.b(djo.pF, fnv.d);
      this.a(djo.oR);
      this.a(djo.aW);
      this.a(djo.qV);
      this.a(djo.qW);
      this.a(djo.rp);
      this.a(djo.sW);
      this.a(djo.tH);
      this.a(djo.tI);
      this.a(djo.tJ);
      this.d(djo.ru);
      this.n(djo.tV);
      this.aE();
      this.a(djo.rC);
      this.a(djo.rD);
      this.a(djo.ry);
      this.a(djo.rz);
      this.a(djo.rA);
      this.a(djo.rB);
      this.l(djo.ry, djo.rY);
      this.l(djo.rz, djo.sa);
      this.l(djo.rA, djo.rZ);
      this.l(djo.rB, djo.sb);
      this.j(djo.so);
      this.j(djo.sp);
      this.j(djo.sr);
      this.j(djo.sq);
      this.b(djo.so, djo.ss);
      this.b(djo.sp, djo.st);
      this.b(djo.sr, djo.sv);
      this.b(djo.sq, djo.su);
      this.l(djo.sw);
      this.l(djo.sx);
      this.l(djo.sz);
      this.l(djo.sy);
      this.c(djo.sw, djo.sA);
      this.c(djo.sx, djo.sB);
      this.c(djo.sz, djo.sD);
      this.c(djo.sy, djo.sC);
      this.a(djo.sE);
      this.a(djo.sF);
      this.a(djo.sG);
      this.a(djo.sH);
      this.l(djo.sE, djo.sI);
      this.l(djo.sF, djo.sJ);
      this.l(djo.sG, djo.sK);
      this.l(djo.sH, djo.sL);
      this.k(djo.ht, djo.co);
      this.k(djo.hu, djo.cp);
      this.H();
      this.s();
      this.ay();
      this.w();
      this.x();
      this.a(djo.oI, djo.oJ);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.C(djo.kV);
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
      this.I(djo.fu);
      this.I(djo.rv);
      this.b(djo.fv, cwt.gm);
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
      this.H(djo.cX);
      this.c(djo.cX);
      this.H(djo.oC);
      this.h();
      this.H(djo.tg);
      this.m(djo.cw, djo.cx);
      this.m(djo.en, djo.eo);
      this.a(djo.cI, djo.n, fnt::c);
      this.a(djo.oA, djo.p, fnt::d);
      this.B(djo.oY);
      this.B(djo.oP);
      this.y(djo.bb);
      this.y(djo.hF);
      this.D();
      this.G(djo.oG);
      this.G(djo.oH);
      this.e(djo.fl, fnq.a(djo.fl));
      this.a(djo.el, fnv.d);
      this.a(djo.em, fnv.d);
      this.a(djo.tG);
      this.a(djo.lo, fnv.d);
      this.e(djo.j);
      this.e(djo.tj);
      this.e(djo.L);
      this.f(djo.M);
      this.f(djo.P);
      this.e(djo.N);
      this.d(djo.I);
      this.b(djo.tQ, fnv.f);
      this.a(djo.iH, fnv.d, fnv.e);
      this.a(djo.kZ, fnv.w, fnv.x);
      this.a(djo.hC, fnv.w, fnv.x);
      this.a(djo.tM, fnv.d, fnv.e);
      this.a(djo.tN, fnv.d, fnv.e);
      this.a(djo.tO, fnv.d, fnv.e);
      this.c(djo.ov, fnv.i);
      this.A();
      this.a(djo.pG, fnt::D);
      this.a(djo.pH, fnt::F);
      this.a(djo.lf, dxn.av, 0, 1, 2, 3);
      this.a(djo.gP, dxn.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djo.fL, dxn.av, 0, 1, 1, 2);
      this.a(djo.gQ, dxn.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djo.cJ, dxn.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(djo.lc, fmy.d.b, dxn.at, 0, 1);
      this.j();
      this.i();
      this.aG();
      this.aI();
      this.aF();
      this.aH();
      this.a(djo.lr, null);
      this.a(djo.ls, cvm.a);
      this.a(djo.lt, cvm.b);
      this.a(djo.lu, cvm.c);
      this.a(djo.lv, cvm.d);
      this.a(djo.lw, cvm.e);
      this.a(djo.lx, cvm.f);
      this.a(djo.ly, cvm.g);
      this.a(djo.lz, cvm.h);
      this.a(djo.lA, cvm.i);
      this.a(djo.lB, cvm.j);
      this.a(djo.lC, cvm.k);
      this.a(djo.lD, cvm.l);
      this.a(djo.lE, cvm.m);
      this.a(djo.lF, cvm.n);
      this.a(djo.lG, cvm.o);
      this.a(djo.lH, cvm.p);
      this.r(djo.nz);
      this.a(djo.nz, new hdi.a());
      this.a(djo.tR, djo.iY);
      this.a(djo.tR, new hdj.a());
      this.a(djo.fS, djo.cv);
      this.a(djo.lh, djo.cv);
      this.a(djo.aT);
      this.a(djo.aU);
      this.a(djo.lY);
      this.a(djo.lZ);
      this.a(djo.ma);
      this.a(djo.mb);
      this.a(djo.mc);
      this.a(djo.md);
      this.a(djo.me);
      this.a(djo.mf);
      this.a(djo.mg);
      this.a(djo.mh);
      this.a(djo.mi);
      this.a(djo.mj);
      this.a(djo.mk);
      this.a(djo.ml);
      this.a(djo.mm);
      this.a(djo.mn);
      this.a(fnv.a, djo.mo, djo.mp, djo.mq, djo.mr, djo.ms, djo.mt, djo.mu, djo.mv, djo.mw, djo.mx, djo.my, djo.mz, djo.mA, djo.mB, djo.mC, djo.mD);
      this.a(djo.iY);
      this.a(djo.hG);
      this.a(djo.hH);
      this.a(djo.hI);
      this.a(djo.hJ);
      this.a(djo.hK);
      this.a(djo.hL);
      this.a(djo.hM);
      this.a(djo.hN);
      this.a(djo.hO);
      this.a(djo.hP);
      this.a(djo.hQ);
      this.a(djo.hR);
      this.a(djo.hS);
      this.a(djo.hT);
      this.a(djo.hU);
      this.a(djo.hV);
      this.a(djo.rq);
      this.i(djo.aX, djo.fm);
      this.i(djo.ev, djo.hW);
      this.i(djo.ew, djo.hX);
      this.i(djo.ex, djo.hY);
      this.i(djo.ey, djo.hZ);
      this.i(djo.ez, djo.ia);
      this.i(djo.eA, djo.ib);
      this.i(djo.eB, djo.ic);
      this.i(djo.eC, djo.id);
      this.i(djo.eD, djo.ie);
      this.i(djo.eE, djo.if);
      this.i(djo.eF, djo.ig);
      this.i(djo.eG, djo.ih);
      this.i(djo.eH, djo.ii);
      this.i(djo.eI, djo.ij);
      this.i(djo.eJ, djo.ik);
      this.i(djo.eK, djo.il);
      this.b(fnv.p, djo.lI, djo.lJ, djo.lK, djo.lL, djo.lM, djo.lN, djo.lO, djo.lP, djo.lQ, djo.lR, djo.lS, djo.lT, djo.lU, djo.lV, djo.lW, djo.lX);
      this.h(djo.bH, djo.iI);
      this.h(djo.bI, djo.iJ);
      this.h(djo.bJ, djo.iK);
      this.h(djo.bK, djo.iL);
      this.h(djo.bL, djo.iM);
      this.h(djo.bM, djo.iN);
      this.h(djo.bN, djo.iO);
      this.h(djo.bO, djo.iP);
      this.h(djo.bP, djo.iQ);
      this.h(djo.bQ, djo.iR);
      this.h(djo.bR, djo.iS);
      this.h(djo.bS, djo.iT);
      this.h(djo.bT, djo.iU);
      this.h(djo.bU, djo.iV);
      this.h(djo.bV, djo.iW);
      this.h(djo.bW, djo.iX);
      this.a(djo.tk);
      this.a(djo.eZ);
      this.b(djo.bB, djo.gx, fmy.d.a);
      this.h(djo.bB);
      this.a(djo.bY, djo.gy, fmy.d.b);
      this.a(djo.ca, djo.gz, fmy.d.b);
      this.a(djo.tZ, djo.ub, fmy.d.c);
      this.a(djo.ua, djo.uc, fmy.d.b);
      this.a(djo.cb, djo.gA, fmy.d.b);
      this.a(djo.cc, djo.gB, fmy.d.b);
      this.a(djo.cd, djo.gC, fmy.d.b);
      this.a(djo.ce, djo.gD, fmy.d.b);
      this.a(djo.cf, djo.gE, fmy.d.b);
      this.a(djo.cg, djo.gF, fmy.d.b);
      this.a(djo.ch, djo.gG, fmy.d.b);
      this.a(djo.ci, djo.gH, fmy.d.b);
      this.a(djo.cj, djo.gI, fmy.d.b);
      this.a(djo.cl, djo.gJ, fmy.d.b);
      this.a(djo.ck, djo.gK, fmy.d.b);
      this.a(djo.cn, djo.gL, fmy.d.b);
      this.a(djo.cm, djo.gM, fmy.d.b);
      this.a(djo.bC, djo.gN, fmy.d.b);
      this.a(djo.bZ, djo.gn, fmy.d.b);
      this.I();
      this.x(djo.fh);
      this.x(djo.fi);
      this.x(djo.fj);
      this.b(djo.bA, fmy.d.a);
      this.h(djo.bA);
      this.b(djo.ef, fmy.d.a);
      this.b(cwt.dS);
      this.c(djo.mE, djo.mF, fmy.d.b);
      this.b(cwt.dT);
      this.b(djo.ti, fmy.d.b);
      this.c(djo.pb, djo.pc, fmy.d.b);
      this.c(djo.pd, djo.pe, fmy.d.b);
      this.a(djo.pb, "_plant");
      this.a(djo.pd, "_plant");
      this.a(djo.nA, fmy.d.a, fnt.c(fnt.a(djo.nB, "_stage0")));
      this.n();
      this.a(djo.bz, fmy.d.b);
      this.d(djo.jc, fmy.d.b);
      this.d(djo.jd, fmy.d.b);
      this.d(djo.je, fmy.d.b);
      this.o(djo.jf);
      this.o(djo.jg);
      this.k();
      this.l();
      this.m();
      this.a(djo.mY, djo.mT, djo.mO, djo.mJ, djo.ni, djo.nd, djo.ns, djo.nn);
      this.a(djo.mZ, djo.mU, djo.mP, djo.mK, djo.nj, djo.ne, djo.nt, djo.no);
      this.a(djo.na, djo.mV, djo.mQ, djo.mL, djo.nk, djo.nf, djo.nu, djo.np);
      this.a(djo.nb, djo.mW, djo.mR, djo.mM, djo.nl, djo.ng, djo.nv, djo.nq);
      this.a(djo.nc, djo.mX, djo.mS, djo.mN, djo.nm, djo.nh, djo.nw, djo.nr);
      this.f(djo.fs, djo.fq);
      this.f(djo.fr, djo.fp);
      this.m(djo.af).c(djo.af).a(djo.aA);
      this.m(djo.ar).c(djo.ar).a(djo.aJ);
      this.a(djo.ar, djo.du, djo.dE);
      this.a(djo.aS, fnv.s, -7158200);
      this.m(djo.ab).c(djo.ab).a(djo.ax);
      this.m(djo.am).c(djo.am).a(djo.aF);
      this.a(djo.am, djo.dn, djo.dz);
      this.a(djo.D, djo.gs, fmy.d.b);
      this.a(djo.aO, fnv.s, -12012264);
      this.m(djo.ac).d(djo.ac).a(djo.ay);
      this.m(djo.an).d(djo.an).a(djo.aG);
      this.a(djo.an, djo.do, djo.dA);
      this.a(djo.E, djo.gt, fmy.d.b);
      this.b(djo.aP, fnv.s);
      this.m(djo.Z).c(djo.Z).a(djo.av);
      this.m(djo.ak).c(djo.ak).a(djo.aD);
      this.a(djo.ak, djo.dm, djo.dy);
      this.a(djo.B, djo.gq, fmy.d.b);
      this.a(djo.aM, fnv.s, -8345771);
      this.m(djo.X).c(djo.X).a(djo.at);
      this.m(djo.aq).c(djo.aq).a(djo.aB);
      this.a(djo.aq, djo.dk, djo.dw);
      this.a(djo.z, djo.go, fmy.d.b);
      this.a(djo.aK, fnv.s, -12012264);
      this.m(djo.Y).c(djo.Y).a(djo.au);
      this.m(djo.aj).c(djo.aj).a(djo.aC);
      this.a(djo.aj, djo.dl, djo.dx);
      this.a(djo.A, djo.gp, fmy.d.b);
      this.a(djo.aL, fnv.s, -10380959);
      this.m(djo.ad).c(djo.ad).a(djo.az);
      this.m(djo.ao).c(djo.ao).a(djo.aH);
      this.a(djo.ao, djo.dq, djo.dC);
      this.a(djo.F, djo.gu, fmy.d.b);
      this.a(djo.aQ, fnv.s, -12012264);
      this.m(djo.ae).c(djo.ae).a(djo.u);
      this.m(djo.ap).c(djo.ap).a(djo.aI);
      this.a(djo.ap, djo.dr, djo.dD);
      this.a(djo.G, djo.gv, fmy.d.b);
      this.b(djo.aR, fnv.s);
      this.m(djo.aa).c(djo.aa).a(djo.aw);
      this.m(djo.al).c(djo.al).a(djo.aE);
      this.a(djo.al, djo.dp, djo.dB);
      this.a(djo.C, djo.gr, fmy.d.b);
      this.a(djo.aN, fnv.s, -12012264);
      this.m(djo.oU).b(djo.oU).a(djo.oW);
      this.m(djo.oV).b(djo.oV).a(djo.oX);
      this.a(djo.oV, djo.ds, djo.dF);
      this.a(djo.oZ, djo.pO, fmy.d.b);
      this.n(djo.pf, djo.pQ);
      this.m(djo.oL).b(djo.oL).a(djo.oN);
      this.m(djo.oM).b(djo.oM).a(djo.oO);
      this.a(djo.oM, djo.dt, djo.dG);
      this.a(djo.oQ, djo.pP, fmy.d.b);
      this.n(djo.oS, djo.pR);
      this.m(djo.ai).d(djo.ai);
      this.m(djo.as).d(djo.as);
      this.a(djo.x, djo.dv, djo.dH);
      this.b(djo.oT, fmy.d.b);
      this.b(cwt.dP);
      this.j(djo.dK);
      this.l(djo.iw);
      this.v();
      this.p(djo.cY);
      this.q(djo.bw);
      this.q(djo.bx);
      this.q(djo.hE);
      this.u();
      this.t(djo.gi);
      this.t(djo.li);
      this.t(djo.lj);
      this.u(djo.hp);
      this.u(djo.hq);
      this.u(djo.hr);
      this.p();
      this.q();
      this.d(djo.cL, fnv.h);
      this.d(djo.oy, fnv.h);
      this.d(djo.ox, fnv.i);
      this.t();
      this.aC();
      this.ax();
      this.l(djo.eY, djo.fg);
      this.l(djo.m, djo.fc);
      this.l(djo.eX, djo.ff);
      this.l(djo.eW, djo.fe);
      this.aA();
      this.l(djo.eV, djo.fd);
      this.aB();
   }

   private void aJ() {
      hbi.b $$0 = fno.a(this.a(cwt.hZ));
      Map<Integer, hbi.b> $$1 = new HashMap<>(16);
      fnh.a<Integer> $$2 = fnh.a(dxn.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         aku $$5 = fnt.a(cwt.hZ, $$4);
         $$2.a($$3, fnj.a().a(fnk.c, fns.aa.a(djo.iv, $$4, fnt.h($$5), this.d)));
         hbi.b $$6 = fno.a(fns.bE.a(fnq.a(cwt.hZ, $$4), fnt.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cwt.hZ, fno.a(doc.c, $$0, $$1));
      this.b.accept(fng.a(djo.iv).a($$2));
   }

   private void o(djm $$0, djm $$1) {
      this.b($$0.j());
      fnt $$2 = fnt.b(fnt.J($$0));
      fnt $$3 = fnt.b(fnt.a($$0, "_lit"));
      aku $$4 = fns.bR.a($$0, "_one_candle", $$2, this.d);
      aku $$5 = fns.bS.a($$0, "_two_candles", $$2, this.d);
      aku $$6 = fns.bT.a($$0, "_three_candles", $$2, this.d);
      aku $$7 = fns.bU.a($$0, "_four_candles", $$2, this.d);
      aku $$8 = fns.bR.a($$0, "_one_candle_lit", $$3, this.d);
      aku $$9 = fns.bS.a($$0, "_two_candles_lit", $$3, this.d);
      aku $$10 = fns.bT.a($$0, "_three_candles_lit", $$3, this.d);
      aku $$11 = fns.bU.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fng.a($$0)
               .a(
                  fnh.a(dxn.aC, dxn.v)
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
      aku $$12 = fns.bV.a($$1, fnt.a($$0, false), this.d);
      aku $$13 = fns.bV.a($$1, "_lit", fnt.a($$0, true), this.d);
      this.b.accept(fng.a($$1).a(a(dxn.v, $$13, $$12)));
   }

   class a {
      private final fnt b;
      private final Map<fnr, aku> c = Maps.newHashMap();
      @Nullable
      private mf d;
      @Nullable
      private aku e;
      private final Set<djm> f = new HashSet<>();

      public a(final fnt $$0) {
         this.b = $$0;
      }

      public fmy.a a(djm $$0, fnr $$1) {
         this.e = $$1.a($$0, this.b, fmy.this.d);
         if (fmy.this.f.containsKey($$0)) {
            fmy.this.b.accept(fmy.this.f.get($$0).create($$0, this.e, this.b, fmy.this.d));
         } else {
            fmy.this.b.accept(fmy.c($$0, this.e));
         }

         return this;
      }

      public fmy.a a(djm $$0, djm $$1) {
         aku $$2 = fnq.a($$0);
         fmy.this.b.accept(fmy.c($$1, $$2));
         fmy.this.c.a($$0.j(), $$1.j());
         this.f.add($$1);
         return this;
      }

      public fmy.a a(djm $$0) {
         aku $$1 = fns.s.a($$0, this.b, fmy.this.d);
         aku $$2 = fns.t.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.b($$0, $$1, $$2));
         aku $$3 = fns.u.a($$0, this.b, fmy.this.d);
         fmy.this.a($$0, $$3);
         return this;
      }

      public fmy.a b(djm $$0) {
         aku $$1 = fns.M.a($$0, this.b, fmy.this.d);
         aku $$2 = fns.N.a($$0, this.b, fmy.this.d);
         aku $$3 = fns.O.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$1, $$2, $$3));
         aku $$4 = fns.P.a($$0, this.b, fmy.this.d);
         fmy.this.a($$0, $$4);
         return this;
      }

      public fmy.a c(djm $$0) {
         fnt $$1 = fnt.s($$0);
         aku $$2 = fns.D.a($$0, $$1, fmy.this.d);
         aku $$3 = fns.E.a($$0, $$1, fmy.this.d);
         aku $$4 = fns.F.a($$0, $$1, fmy.this.d);
         aku $$5 = fns.G.a($$0, $$1, fmy.this.d);
         aku $$6 = fns.H.a($$0, $$1, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$2, $$3, $$4, $$5, $$6));
         aku $$7 = fns.I.a($$0, $$1, fmy.this.d);
         fmy.this.a($$0, $$7);
         return this;
      }

      public fmy.a d(djm $$0) {
         aku $$1 = fns.J.a($$0, this.b, fmy.this.d);
         aku $$2 = fns.K.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.c($$0, $$1, $$2));
         aku $$3 = fns.L.a($$0, this.b, fmy.this.d);
         fmy.this.a($$0, $$3);
         return this;
      }

      public fmy.a e(djm $$0) {
         fnt $$1 = fnt.s($$0);
         aku $$2 = fns.R.a($$0, $$1, fmy.this.d);
         aku $$3 = fns.Q.a($$0, $$1, fmy.this.d);
         aku $$4 = fns.T.a($$0, $$1, fmy.this.d);
         aku $$5 = fns.S.a($$0, $$1, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fmy.a f(djm $$0) {
         aku $$1 = fns.V.a($$0, this.b, fmy.this.d);
         aku $$2 = fns.U.a($$0, this.b, fmy.this.d);
         aku $$3 = fns.X.a($$0, this.b, fmy.this.d);
         aku $$4 = fns.W.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fmy.a g(djm $$0) {
         aku $$1 = fns.Y.a($$0, this.b, fmy.this.d);
         aku $$2 = fns.Z.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.e($$0, $$1, $$2));
         return this;
      }

      public fmy.a h(djm $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            djm $$1 = this.d.b().get(mf.b.r);
            aku $$2 = fns.aa.a($$0, this.b, fmy.this.d);
            fmy.this.b.accept(fmy.c($$0, $$2));
            fmy.this.b.accept(fmy.c($$1, $$2));
            fmy.this.b($$0.j());
            return this;
         }
      }

      public fmy.a i(djm $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aku $$1 = this.a(fns.ab, $$0);
            aku $$2 = this.a(fns.ac, $$0);
            fmy.this.b.accept(fmy.e($$0, $$1, $$2, this.e));
            fmy.this.a($$0, $$1);
            return this;
         }
      }

      public fmy.a j(djm $$0) {
         aku $$1 = this.a(fns.af, $$0);
         aku $$2 = this.a(fns.ae, $$0);
         aku $$3 = this.a(fns.ag, $$0);
         fmy.this.b.accept(fmy.b($$0, $$1, $$2, $$3));
         fmy.this.a($$0, $$2);
         return this;
      }

      private fmy.a k(djm $$0) {
         fnv $$1 = fmy.this.g.getOrDefault($$0, fnv.a.get($$0));
         aku $$2 = $$1.a($$0, fmy.this.d);
         fmy.this.b.accept(fmy.c($$0, $$2));
         return this;
      }

      private fmy.a l(djm $$0) {
         fmy.this.j($$0);
         return this;
      }

      private void m(djm $$0) {
         if (fmy.this.e.contains($$0)) {
            fmy.this.l($$0);
         } else {
            fmy.this.k($$0);
         }
      }

      private aku a(fnr $$0, djm $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fmy.this.d));
      }

      public fmy.a a(mf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fmy.a, djm> $$2 = fmy.h.get($$0x);
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
      fnd create(djm var1, aku var2, fnt var3, BiConsumer<aku, fnp> var4);
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

      public aku a(fmy $$0, djm $$1) {
         cwl $$2 = $$1.j();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fnt a(djm $$0) {
         return this.f ? fnt.e($$0) : fnt.c($$0);
      }

      public fnt b(djm $$0) {
         return this.f ? fnt.g($$0) : fnt.f($$0);
      }
   }

   class e {
      private final fnt b;

      public e(final fnt $$0) {
         this.b = $$0;
      }

      public fmy.e a(djm $$0) {
         fnt $$1 = this.b.c(fnu.d, this.b.a(fnu.i));
         aku $$2 = fns.j.a($$0, $$1, fmy.this.d);
         fmy.this.b.accept(fmy.d($$0, $$2));
         return this;
      }

      public fmy.e b(djm $$0) {
         aku $$1 = fns.j.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.d($$0, $$1));
         return this;
      }

      public fmy.e c(djm $$0) {
         aku $$1 = fns.j.a($$0, this.b, fmy.this.d);
         aku $$2 = fns.k.a($$0, this.b, fmy.this.d);
         fmy.this.b.accept(fmy.d($$0, $$1, $$2));
         return this;
      }

      public fmy.e d(djm $$0) {
         fmy.this.b.accept(fmy.a($$0, this.b, fmy.this.d));
         return this;
      }
   }
}
