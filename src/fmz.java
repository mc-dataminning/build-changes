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

public class fmz {
   final Consumer<fne> b;
   final fnc c;
   final BiConsumer<akv, fnq> d;
   final List<djm> e = ImmutableList.of(djo.eL, djo.eR, djo.iw);
   final Map<djm, fmz.b> f = ImmutableMap.builder().put(djo.b, fmz::a).put(djo.tl, fmz::c).put(djo.fa, fmz::b).build();
   final Map<djm, fnw> g = ImmutableMap.builder()
      .put(djo.bc, fnw.y.get(djo.bc))
      .put(djo.jN, fnw.y.get(djo.jN))
      .put(djo.kr, fnw.a(fnu.a(djo.bc, "_top")))
      .put(djo.kt, fnw.a(fnu.a(djo.jN, "_top")))
      .put(djo.be, fnw.d.get(djo.bc).a($$0x -> $$0x.a(fnv.i, fnu.J(djo.be))))
      .put(djo.jP, fnw.d.get(djo.jN).a($$0x -> $$0x.a(fnv.i, fnu.J(djo.jP))))
      .put(djo.hA, fnw.d.get(djo.hA))
      .put(djo.ks, fnw.a(fnu.a(djo.hA, "_bottom")))
      .put(djo.pT, fnw.z.get(djo.pT))
      .put(djo.tl, fnw.z.get(djo.tl))
      .put(djo.hB, fnw.d.get(djo.hB).a($$0x -> $$0x.a(fnv.i, fnu.J(djo.hB))))
      .put(djo.bd, fnw.d.get(djo.bd).a($$0x -> {
         $$0x.a(fnv.d, fnu.a(djo.bc, "_top"));
         $$0x.a(fnv.i, fnu.J(djo.bd));
      }))
      .put(djo.jO, fnw.d.get(djo.jO).a($$0x -> {
         $$0x.a(fnv.d, fnu.a(djo.jN, "_top"));
         $$0x.a(fnv.i, fnu.J(djo.jO));
      }))
      .put(djo.ro, fnw.z.get(djo.ro))
      .put(djo.rj, fnw.z.get(djo.rj))
      .build();
   static final Map<mf.b, BiConsumer<fmz.a, djm>> h = ImmutableMap.builder()
      .put(mf.b.a, fmz.a::a)
      .put(mf.b.e, fmz.a::l)
      .put(mf.b.b, fmz.a::k)
      .put(mf.b.c, fmz.a::k)
      .put(mf.b.f, fmz.a::c)
      .put(mf.b.g, fmz.a::d)
      .put(mf.b.h, fmz.a::e)
      .put(mf.b.i, fmz.a::f)
      .put(mf.b.k, fmz.a::h)
      .put(mf.b.l, fmz.a::i)
      .put(mf.b.m, fmz.a::j)
      .put(mf.b.n, fmz.a::g)
      .put(mf.b.p, fmz.a::m)
      .put(mf.b.q, fmz.a::b)
      .build();
   public static final List<Pair<jn, Function<akv, fnk>>> a = List.of(
      Pair.of(jn.c, (Function<akv, fnk>)$$0 -> fnk.a().a(fnl.c, $$0)),
      Pair.of(jn.f, (Function<akv, fnk>)$$0 -> fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b).a(fnl.d, true)),
      Pair.of(jn.d, (Function<akv, fnk>)$$0 -> fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c).a(fnl.d, true)),
      Pair.of(jn.e, (Function<akv, fnk>)$$0 -> fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d).a(fnl.d, true)),
      Pair.of(jn.b, (Function<akv, fnk>)$$0 -> fnk.a().a(fnl.c, $$0).a(fnl.a, fnl.a.d).a(fnl.d, true)),
      Pair.of(jn.a, (Function<akv, fnk>)$$0 -> fnk.a().a(fnl.c, $$0).a(fnl.a, fnl.a.b).a(fnl.d, true))
   );
   private static final Map<fmz.c, akv> i = new HashMap<>();

   private static fne a(djm $$0, akv $$1, fnu $$2, BiConsumer<akv, fnq> $$3) {
      akv $$4 = fnt.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fne b(djm $$0, akv $$1, fnu $$2, BiConsumer<akv, fnq> $$3) {
      akv $$4 = fnt.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fne c(djm $$0, akv $$1, fnu $$2, BiConsumer<akv, fnq> $$3) {
      akv $$4 = fnt.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fmz(Consumer<fne> $$0, fnc $$1, BiConsumer<akv, fnq> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cwl $$0, akv $$1) {
      this.c.a($$0, fnp.a($$1));
   }

   void a(djm $$0, akv $$1) {
      this.c.a($$0.j(), fnp.a($$1));
   }

   private void a(djm $$0, akv $$1, fmt $$2) {
      this.c.a($$0.j(), fnp.a($$1, $$2));
   }

   private akv a(cwl $$0) {
      return fnt.bE.a(fnr.a($$0), fnu.b($$0), this.d);
   }

   akv a(cwl $$0, djm $$1) {
      return fnt.bE.a(fnr.a($$0), fnu.I($$1), this.d);
   }

   private akv a(cwl $$0, djm $$1, String $$2) {
      return fnt.bE.a(fnr.a($$0), fnu.k(fnu.a($$1, $$2)), this.d);
   }

   akv b(cwl $$0, djm $$1, String $$2) {
      akv $$3 = fnu.J($$1);
      akv $$4 = fnu.a($$1, $$2);
      return fnt.bI.a(fnr.a($$0), fnu.c($$3, $$4), this.d);
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
         akv $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fni b() {
      return fni.a(dxn.U).a(jn.f, fnk.a().a(fnl.b, fnl.a.b)).a(jn.d, fnk.a().a(fnl.b, fnl.a.c)).a(jn.e, fnk.a().a(fnl.b, fnl.a.d)).a(jn.c, fnk.a());
   }

   private static fni c() {
      return fni.a(dxn.U).a(jn.d, fnk.a()).a(jn.e, fnk.a().a(fnl.b, fnl.a.b)).a(jn.c, fnk.a().a(fnl.b, fnl.a.c)).a(jn.f, fnk.a().a(fnl.b, fnl.a.d));
   }

   private static fni d() {
      return fni.a(dxn.U).a(jn.f, fnk.a()).a(jn.d, fnk.a().a(fnl.b, fnl.a.b)).a(jn.e, fnk.a().a(fnl.b, fnl.a.c)).a(jn.c, fnk.a().a(fnl.b, fnl.a.d));
   }

   private static fni e() {
      return fni.a(dxn.S)
         .a(jn.a, fnk.a().a(fnl.a, fnl.a.b))
         .a(jn.b, fnk.a().a(fnl.a, fnl.a.d))
         .a(jn.c, fnk.a())
         .a(jn.d, fnk.a().a(fnl.b, fnl.a.c))
         .a(jn.e, fnk.a().a(fnl.b, fnl.a.d))
         .a(jn.f, fnk.a().a(fnl.b, fnl.a.b));
   }

   private static fnh b(djm $$0, akv $$1) {
      return fnh.a($$0, a($$1));
   }

   private static fnk[] a(akv $$0) {
      return new fnk[]{
         fnk.a().a(fnl.c, $$0), fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b), fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c), fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d)
      };
   }

   private static fnh a(djm $$0, akv $$1, akv $$2) {
      return fnh.a($$0, fnk.a().a(fnl.c, $$1), fnk.a().a(fnl.c, $$2), fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c));
   }

   private static fni a(dxo $$0, akv $$1, akv $$2) {
      return fni.a($$0).a(true, fnk.a().a(fnl.c, $$1)).a(false, fnk.a().a(fnl.c, $$2));
   }

   private void d(djm $$0) {
      akv $$1 = fnw.a.create($$0, this.d);
      akv $$2 = fnw.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(djm $$0) {
      akv $$1 = fnw.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(djm $$0) {
      this.b.accept(fnh.a($$0).a(fni.a(dxn.by).a($$1 -> {
         String $$2 = "_" + $$1;
         akv $$3 = fnu.a($$0, $$2);
         return fnk.a().a(fnl.c, fnt.c.a($$0, $$2, new fnu().a(fnv.a, $$3), this.d));
      })));
      this.a($$0, fnr.a($$0, "_0"));
   }

   static fne b(djm $$0, akv $$1, akv $$2) {
      return fnh.a($$0)
         .a(fni.a(dxn.B).a(false, fnk.a().a(fnl.c, $$1)).a(true, fnk.a().a(fnl.c, $$2)))
         .a(
            fni.a(dxn.X, dxn.U)
               .a(dxi.a, jn.f, fnk.a().a(fnl.b, fnl.a.b))
               .a(dxi.a, jn.e, fnk.a().a(fnl.b, fnl.a.d))
               .a(dxi.a, jn.d, fnk.a().a(fnl.b, fnl.a.c))
               .a(dxi.a, jn.c, fnk.a())
               .a(dxi.b, jn.f, fnk.a().a(fnl.b, fnl.a.b).a(fnl.a, fnl.a.b).a(fnl.d, true))
               .a(dxi.b, jn.e, fnk.a().a(fnl.b, fnl.a.d).a(fnl.a, fnl.a.b).a(fnl.d, true))
               .a(dxi.b, jn.d, fnk.a().a(fnl.b, fnl.a.c).a(fnl.a, fnl.a.b).a(fnl.d, true))
               .a(dxi.b, jn.c, fnk.a().a(fnl.a, fnl.a.b).a(fnl.d, true))
               .a(dxi.c, jn.f, fnk.a().a(fnl.b, fnl.a.d).a(fnl.a, fnl.a.c))
               .a(dxi.c, jn.e, fnk.a().a(fnl.b, fnl.a.b).a(fnl.a, fnl.a.c))
               .a(dxi.c, jn.d, fnk.a().a(fnl.a, fnl.a.c))
               .a(dxi.c, jn.c, fnk.a().a(fnl.b, fnl.a.c).a(fnl.a, fnl.a.c))
         );
   }

   private static fni.d<jn, dxs, dxr, Boolean> a(fni.d<jn, dxs, dxr, Boolean> $$0, dxs $$1, akv $$2, akv $$3, akv $$4, akv $$5) {
      return $$0.a(jn.f, $$1, dxr.a, false, fnk.a().a(fnl.c, $$2))
         .a(jn.d, $$1, dxr.a, false, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b))
         .a(jn.e, $$1, dxr.a, false, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c))
         .a(jn.c, $$1, dxr.a, false, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d))
         .a(jn.f, $$1, dxr.b, false, fnk.a().a(fnl.c, $$4))
         .a(jn.d, $$1, dxr.b, false, fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.b))
         .a(jn.e, $$1, dxr.b, false, fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.c))
         .a(jn.c, $$1, dxr.b, false, fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.d))
         .a(jn.f, $$1, dxr.a, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
         .a(jn.d, $$1, dxr.a, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c))
         .a(jn.e, $$1, dxr.a, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d))
         .a(jn.c, $$1, dxr.a, true, fnk.a().a(fnl.c, $$3))
         .a(jn.f, $$1, dxr.b, true, fnk.a().a(fnl.c, $$5).a(fnl.b, fnl.a.d))
         .a(jn.d, $$1, dxr.b, true, fnk.a().a(fnl.c, $$5))
         .a(jn.e, $$1, dxr.b, true, fnk.a().a(fnl.c, $$5).a(fnl.b, fnl.a.b))
         .a(jn.c, $$1, dxr.b, true, fnk.a().a(fnl.c, $$5).a(fnl.b, fnl.a.c));
   }

   private static fne a(djm $$0, akv $$1, akv $$2, akv $$3, akv $$4, akv $$5, akv $$6, akv $$7, akv $$8) {
      return fnh.a($$0).a(a(a(fni.a(dxn.U, dxn.ah, dxn.bh, dxn.z), dxs.b, $$1, $$2, $$3, $$4), dxs.a, $$5, $$6, $$7, $$8));
   }

   static fne a(djm $$0, akv $$1, akv $$2, akv $$3, akv $$4, akv $$5) {
      return fng.a($$0)
         .a(fnk.a().a(fnl.c, $$1))
         .a(fnf.a().a(dxn.O, true), fnk.a().a(fnl.c, $$2).a(fnl.d, false))
         .a(fnf.a().a(dxn.P, true), fnk.a().a(fnl.c, $$3).a(fnl.d, false))
         .a(fnf.a().a(dxn.Q, true), fnk.a().a(fnl.c, $$4).a(fnl.d, false))
         .a(fnf.a().a(dxn.R, true), fnk.a().a(fnl.c, $$5).a(fnl.d, false));
   }

   static fne c(djm $$0, akv $$1, akv $$2) {
      return fng.a($$0)
         .a(fnk.a().a(fnl.c, $$1))
         .a(fnf.a().a(dxn.O, true), fnk.a().a(fnl.c, $$2).a(fnl.d, true))
         .a(fnf.a().a(dxn.P, true), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b).a(fnl.d, true))
         .a(fnf.a().a(dxn.Q, true), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c).a(fnl.d, true))
         .a(fnf.a().a(dxn.R, true), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d).a(fnl.d, true));
   }

   static fne a(djm $$0, akv $$1, akv $$2, akv $$3) {
      return fng.a($$0)
         .a(fnf.a().a(dxn.M, true), fnk.a().a(fnl.c, $$1))
         .a(fnf.a().a(dxn.aa, dyi.b), fnk.a().a(fnl.c, $$2).a(fnl.d, true))
         .a(fnf.a().a(dxn.Z, dyi.b), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b).a(fnl.d, true))
         .a(fnf.a().a(dxn.ab, dyi.b), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c).a(fnl.d, true))
         .a(fnf.a().a(dxn.ac, dyi.b), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d).a(fnl.d, true))
         .a(fnf.a().a(dxn.aa, dyi.c), fnk.a().a(fnl.c, $$3).a(fnl.d, true))
         .a(fnf.a().a(dxn.Z, dyi.c), fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b).a(fnl.d, true))
         .a(fnf.a().a(dxn.ab, dyi.c), fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c).a(fnl.d, true))
         .a(fnf.a().a(dxn.ac, dyi.c), fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d).a(fnl.d, true));
   }

   static fne a(djm $$0, akv $$1, akv $$2, akv $$3, akv $$4, boolean $$5) {
      return fnh.a($$0, fnk.a().a(fnl.d, $$5))
         .a(c())
         .a(
            fni.a(dxn.u, dxn.z)
               .a(false, false, fnk.a().a(fnl.c, $$2))
               .a(true, false, fnk.a().a(fnl.c, $$4))
               .a(false, true, fnk.a().a(fnl.c, $$1))
               .a(true, true, fnk.a().a(fnl.c, $$3))
         );
   }

   static fne b(djm $$0, akv $$1, akv $$2, akv $$3) {
      return fnh.a($$0)
         .a(
            fni.a(dxn.U, dxn.ai, dxn.bl)
               .a(jn.f, dxv.b, dyf.a, fnk.a().a(fnl.c, $$2))
               .a(jn.e, dxv.b, dyf.a, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.d, dxv.b, dyf.a, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.c, dxv.b, dyf.a, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.f, dxv.b, dyf.e, fnk.a().a(fnl.c, $$3))
               .a(jn.e, dxv.b, dyf.e, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.d, dxv.b, dyf.e, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.c, dxv.b, dyf.e, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.f, dxv.b, dyf.d, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.e, dxv.b, dyf.d, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.d, dxv.b, dyf.d, fnk.a().a(fnl.c, $$3))
               .a(jn.c, dxv.b, dyf.d, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.f, dxv.b, dyf.c, fnk.a().a(fnl.c, $$1))
               .a(jn.e, dxv.b, dyf.c, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.d, dxv.b, dyf.c, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.c, dxv.b, dyf.c, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.f, dxv.b, dyf.b, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.e, dxv.b, dyf.b, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.d, dxv.b, dyf.b, fnk.a().a(fnl.c, $$1))
               .a(jn.c, dxv.b, dyf.b, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.f, dxv.a, dyf.a, fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.c).a(fnl.d, true))
               .a(jn.e, dxv.a, dyf.a, fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.d, dxv.a, dyf.a, fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.c, dxv.a, dyf.a, fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.f, dxv.a, dyf.e, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.e, dxv.a, dyf.e, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.d, dxv.a, dyf.e, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.c, dxv.a, dyf.e, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.d, true))
               .a(jn.f, dxv.a, dyf.d, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.d, true))
               .a(jn.e, dxv.a, dyf.d, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.d, dxv.a, dyf.d, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.c, dxv.a, dyf.d, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.f, dxv.a, dyf.c, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.e, dxv.a, dyf.c, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(jn.d, dxv.a, dyf.c, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.c, dxv.a, dyf.c, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.d, true))
               .a(jn.f, dxv.a, dyf.b, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.d, true))
               .a(jn.e, dxv.a, dyf.b, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(jn.d, dxv.a, dyf.b, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(jn.c, dxv.a, dyf.b, fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d).a(fnl.d, true))
         );
   }

   private static fne c(djm $$0, akv $$1, akv $$2, akv $$3) {
      return fnh.a($$0)
         .a(
            fni.a(dxn.U, dxn.ai, dxn.z)
               .a(jn.c, dxv.b, false, fnk.a().a(fnl.c, $$2))
               .a(jn.d, dxv.b, false, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c))
               .a(jn.f, dxv.b, false, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b))
               .a(jn.e, dxv.b, false, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d))
               .a(jn.c, dxv.a, false, fnk.a().a(fnl.c, $$1))
               .a(jn.d, dxv.a, false, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c))
               .a(jn.f, dxv.a, false, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.b))
               .a(jn.e, dxv.a, false, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.d))
               .a(jn.c, dxv.b, true, fnk.a().a(fnl.c, $$3))
               .a(jn.d, dxv.b, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c))
               .a(jn.f, dxv.b, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
               .a(jn.e, dxv.b, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d))
               .a(jn.c, dxv.a, true, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c))
               .a(jn.d, dxv.a, true, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.a))
               .a(jn.f, dxv.a, true, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d))
               .a(jn.e, dxv.a, true, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b))
         );
   }

   private static fne d(djm $$0, akv $$1, akv $$2, akv $$3) {
      return fnh.a($$0)
         .a(
            fni.a(dxn.U, dxn.ai, dxn.z)
               .a(jn.c, dxv.b, false, fnk.a().a(fnl.c, $$2))
               .a(jn.d, dxv.b, false, fnk.a().a(fnl.c, $$2))
               .a(jn.f, dxv.b, false, fnk.a().a(fnl.c, $$2))
               .a(jn.e, dxv.b, false, fnk.a().a(fnl.c, $$2))
               .a(jn.c, dxv.a, false, fnk.a().a(fnl.c, $$1))
               .a(jn.d, dxv.a, false, fnk.a().a(fnl.c, $$1))
               .a(jn.f, dxv.a, false, fnk.a().a(fnl.c, $$1))
               .a(jn.e, dxv.a, false, fnk.a().a(fnl.c, $$1))
               .a(jn.c, dxv.b, true, fnk.a().a(fnl.c, $$3))
               .a(jn.d, dxv.b, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c))
               .a(jn.f, dxv.b, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
               .a(jn.e, dxv.b, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d))
               .a(jn.c, dxv.a, true, fnk.a().a(fnl.c, $$3))
               .a(jn.d, dxv.a, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c))
               .a(jn.f, dxv.a, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
               .a(jn.e, dxv.a, true, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d))
         );
   }

   static fnh c(djm $$0, akv $$1) {
      return fnh.a($$0, fnk.a().a(fnl.c, $$1));
   }

   private static fni f() {
      return fni.a(dxn.L).a(jn.a.b, fnk.a()).a(jn.a.c, fnk.a().a(fnl.a, fnl.a.b)).a(jn.a.a, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b));
   }

   static fne a(djm $$0, fnu $$1, BiConsumer<akv, fnq> $$2) {
      akv $$3 = fnt.g.a($$0, $$1, $$2);
      akv $$4 = fnt.h.a($$0, $$1, $$2);
      akv $$5 = fnt.i.a($$0, $$1, $$2);
      akv $$6 = fnt.j.a($$0, $$1, $$2);
      return fnh.a($$0, fnk.a().a(fnl.c, $$6))
         .a(fni.a(dxn.L).a(jn.a.a, fnk.a().a(fnl.c, $$3)).a(jn.a.b, fnk.a().a(fnl.c, $$4)).a(jn.a.c, fnk.a().a(fnl.c, $$5)));
   }

   static fne d(djm $$0, akv $$1) {
      return fnh.a($$0, fnk.a().a(fnl.c, $$1)).a(f());
   }

   private void e(djm $$0, akv $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(djm $$0, fnw.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(djm $$0, fnw.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      this.b.accept(fnh.a($$0, fnk.a().a(fnl.c, $$2)).a(b()));
   }

   static fne d(djm $$0, akv $$1, akv $$2) {
      return fnh.a($$0)
         .a(
            fni.a(dxn.L)
               .a(jn.a.b, fnk.a().a(fnl.c, $$1))
               .a(jn.a.c, fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.b))
               .a(jn.a.a, fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b))
         );
   }

   private void a(djm $$0, fnw.a $$1, fnw.a $$2) {
      akv $$3 = $$1.create($$0, this.d);
      akv $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(djm $$0) {
      Function<fnw.a, akv> $$1 = $$1x -> $$1x.updateTexture($$1xx -> $$1xx.a(fnv.i, fnu.a($$0, "_active")))
            .updateTexture($$1xx -> $$1xx.a(fnv.d, fnu.a($$0, "_top_active")))
            .createWithSuffix($$0, "_active", this.d);
      akv $$2 = fnw.w.create($$0, this.d);
      akv $$3 = fnw.x.create($$0, this.d);
      akv $$4 = $$1.apply(fnw.w);
      akv $$5 = $$1.apply(fnw.x);
      this.b
         .accept(
            fnh.a($$0)
               .a(
                  fni.a(dxn.L, dlh.c)
                     .a(jn.a.b, false, fnk.a().a(fnl.c, $$2))
                     .a(jn.a.c, false, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.b))
                     .a(jn.a.a, false, fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b))
                     .a(jn.a.b, true, fnk.a().a(fnl.c, $$4))
                     .a(jn.a.c, true, fnk.a().a(fnl.c, $$5).a(fnl.a, fnl.a.b))
                     .a(jn.a.a, true, fnk.a().a(fnl.c, $$5).a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b))
               )
         );
   }

   private akv a(djm $$0, String $$1, fns $$2, Function<akv, fnu> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fnu.a($$0, $$1)), this.d);
   }

   static fne e(djm $$0, akv $$1, akv $$2) {
      return fnh.a($$0).a(a(dxn.B, $$2, $$1));
   }

   static fne e(djm $$0, akv $$1, akv $$2, akv $$3) {
      return fnh.a($$0).a(fni.a(dxn.bk).a(dye.b, fnk.a().a(fnl.c, $$1)).a(dye.a, fnk.a().a(fnl.c, $$2)).a(dye.c, fnk.a().a(fnl.c, $$3)));
   }

   public void a(djm $$0) {
      this.b($$0, fnw.a);
   }

   public void b(djm $$0, fnw.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(djm $$0, fnw.a $$1, int $$2) {
      akv $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fnp.a($$2));
   }

   private void g() {
      this.J(djo.ft);
      akv $$0 = this.a(cwt.gk, djo.ft);
      this.a(djo.ft, $$0, fnp.a(-12012264));
   }

   private void h(djm $$0) {
      akv $$1 = this.a($$0.j(), $$0);
      this.a($$0, $$1, new fms());
   }

   private fmz.a i(djm $$0) {
      fnw $$1 = this.g.getOrDefault($$0, fnw.a.get($$0));
      return new fmz.a($$1.b()).a($$0, $$1.a());
   }

   public void a(djm $$0, djm $$1, djm $$2) {
      akv $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.j());
   }

   void j(djm $$0) {
      fnu $$1 = fnu.w($$0);
      akv $$2 = fnt.v.a($$0, $$1, this.d);
      akv $$3 = fnt.w.a($$0, $$1, this.d);
      akv $$4 = fnt.x.a($$0, $$1, this.d);
      akv $$5 = fnt.y.a($$0, $$1, this.d);
      akv $$6 = fnt.z.a($$0, $$1, this.d);
      akv $$7 = fnt.A.a($$0, $$1, this.d);
      akv $$8 = fnt.B.a($$0, $$1, this.d);
      akv $$9 = fnt.C.a($$0, $$1, this.d);
      this.b($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(djm $$0, djm $$1) {
      akv $$2 = fnt.v.a($$0);
      akv $$3 = fnt.w.a($$0);
      akv $$4 = fnt.x.a($$0);
      akv $$5 = fnt.y.a($$0);
      akv $$6 = fnt.z.a($$0);
      akv $$7 = fnt.A.a($$0);
      akv $$8 = fnt.B.a($$0);
      akv $$9 = fnt.C.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(djm $$0) {
      fnu $$1 = fnu.b($$0);
      akv $$2 = fnt.ak.a($$0, $$1, this.d);
      akv $$3 = fnt.al.a($$0, $$1, this.d);
      akv $$4 = fnt.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(djm $$0) {
      fnu $$1 = fnu.b($$0);
      akv $$2 = fnt.ah.a($$0, $$1, this.d);
      akv $$3 = fnt.ai.a($$0, $$1, this.d);
      akv $$4 = fnt.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(djm $$0, djm $$1) {
      akv $$2 = fnt.ah.a($$0);
      akv $$3 = fnt.ai.a($$0);
      akv $$4 = fnt.aj.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      akv $$0 = fnr.a(djo.tf);
      akv $$1 = fnr.a(djo.tf, "_partial_tilt");
      akv $$2 = fnr.a(djo.tf, "_full_tilt");
      this.b
         .accept(
            fnh.a(djo.tf)
               .a(b())
               .a(fni.a(dxn.bo).a(dyh.a, fnk.a().a(fnl.c, $$0)).a(dyh.b, fnk.a().a(fnl.c, $$0)).a(dyh.c, fnk.a().a(fnl.c, $$1)).a(dyh.d, fnk.a().a(fnl.c, $$2)))
         );
   }

   private fmz.e m(djm $$0) {
      return new fmz.e(fnu.q($$0));
   }

   private void n(djm $$0) {
      this.d($$0, $$0);
   }

   private void d(djm $$0, djm $$1) {
      this.b.accept(c($$0, fnr.a($$1)));
   }

   private void a(djm $$0, fmz.d $$1) {
      this.a($$0.j(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(djm $$0, fmz.d $$1, fnu $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djm $$0, fmz.d $$1) {
      fnu $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djm $$0, fmz.d $$1, fnu $$2) {
      akv $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(djm $$0, fmz.d $$1, dxz<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fni $$4 = fni.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fnu $$5 = fnu.c(fnu.a($$0, $$4x));
            akv $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fnk.a().a(fnl.c, $$6);
         });
         this.b($$0.j());
         this.b.accept(fnh.a($$0).a($$4));
      }
   }

   private void a(djm $$0, djm $$1, fmz.d $$2) {
      this.a($$0.j(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(djm $$0, djm $$1, fmz.d $$2) {
      this.b($$0, $$2);
      fnu $$3 = $$2.b($$0);
      akv $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(djm $$0, djm $$1) {
      fnw $$2 = fnw.q.get($$0);
      akv $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      akv $$4 = fnt.aF.a($$1, $$2.b(), this.d);
      this.b.accept(fnh.a($$1, fnk.a().a(fnl.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(djm $$0, djm $$1) {
      this.b($$0.j());
      fnu $$2 = fnu.k($$0);
      fnu $$3 = fnu.a($$0, $$1);
      akv $$4 = fnt.aX.a($$1, $$3, this.d);
      this.b
         .accept(
            fnh.a($$1, fnk.a().a(fnl.c, $$4))
               .a(fni.a(dxn.U).a(jn.e, fnk.a()).a(jn.d, fnk.a().a(fnl.b, fnl.a.d)).a(jn.c, fnk.a().a(fnl.b, fnl.a.b)).a(jn.f, fnk.a().a(fnl.b, fnl.a.c)))
         );
      this.b.accept(fnh.a($$0).a(fni.a(dxn.ay).a($$2x -> fnk.a().a(fnl.c, fnt.aW[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      djm $$0 = djo.le;
      this.b($$0.j());
      akv $$1 = fnr.a($$0, "_top");
      akv $$2 = fnr.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      djm $$0 = djo.ld;
      this.b($$0.j());
      fni $$1 = fni.a(dpf.d, dxn.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fnk.a().a(fnl.c, fnr.a($$0, "_top_stage_" + $$1x));
            case b -> fnk.a().a(fnl.c, fnr.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fnh.a($$0).a($$1));
   }

   private void a(djm $$0, djm $$1, djm $$2, djm $$3, djm $$4, djm $$5, djm $$6, djm $$7) {
      this.a($$0, fmz.d.b);
      this.a($$1, fmz.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(djm $$0, fmz.d $$1) {
      akv $$2 = this.a($$0, "_top", $$1.a(), fnu::c);
      akv $$3 = this.a($$0, "_bottom", $$1.a(), fnu::c);
      this.f($$0, $$2, $$3);
   }

   private void d(djm $$0, fmz.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(djm $$0) {
      akv $$1 = this.a($$0.j(), $$0, "_top");
      this.a($$0, $$1, new fms());
      this.c($$0, fmz.d.a);
   }

   private void k() {
      this.a(djo.jb, "_front");
      akv $$0 = fnr.a(djo.jb, "_top");
      akv $$1 = this.a(djo.jb, "_bottom", fmz.d.b.a(), fnu::c);
      this.f(djo.jb, $$0, $$1);
   }

   private void l() {
      akv $$0 = this.a(djo.bE, "_top", fnt.br, fnu::a);
      akv $$1 = this.a(djo.bE, "_bottom", fnt.br, fnu::a);
      this.f(djo.bE, $$0, $$1);
   }

   private void m() {
      akv $$0 = fnr.a(djo.th, "_top");
      akv $$1 = fnr.a(djo.th, "_bottom");
      this.b.accept(fnh.a(djo.th).a(b()).a(fni.a(dxn.ah).a(dxs.b, fnk.a().a(fnl.c, $$1)).a(dxs.a, fnk.a().a(fnl.c, $$0))));
   }

   private void f(djm $$0, akv $$1, akv $$2) {
      this.b.accept(fnh.a($$0).a(fni.a(dxn.ah).a(dxs.b, fnk.a().a(fnl.c, $$2)).a(dxs.a, fnk.a().a(fnl.c, $$1))));
   }

   private void p(djm $$0) {
      fnu $$1 = fnu.h($$0);
      fnu $$2 = fnu.e(fnu.a($$0, "_corner"));
      akv $$3 = fnt.au.a($$0, $$1, this.d);
      akv $$4 = fnt.av.a($$0, $$2, this.d);
      akv $$5 = fnt.aw.a($$0, $$1, this.d);
      akv $$6 = fnt.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fnh.a($$0)
               .a(
                  fni.a(dxn.aj)
                     .a(dya.a, fnk.a().a(fnl.c, $$3))
                     .a(dya.b, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
                     .a(dya.c, fnk.a().a(fnl.c, $$5).a(fnl.b, fnl.a.b))
                     .a(dya.d, fnk.a().a(fnl.c, $$6).a(fnl.b, fnl.a.b))
                     .a(dya.e, fnk.a().a(fnl.c, $$5))
                     .a(dya.f, fnk.a().a(fnl.c, $$6))
                     .a(dya.g, fnk.a().a(fnl.c, $$4))
                     .a(dya.h, fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.b))
                     .a(dya.i, fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.c))
                     .a(dya.j, fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.d))
               )
         );
   }

   private void q(djm $$0) {
      akv $$1 = this.a($$0, "", fnt.au, fnu::e);
      akv $$2 = this.a($$0, "", fnt.aw, fnu::e);
      akv $$3 = this.a($$0, "", fnt.ax, fnu::e);
      akv $$4 = this.a($$0, "_on", fnt.au, fnu::e);
      akv $$5 = this.a($$0, "_on", fnt.aw, fnu::e);
      akv $$6 = this.a($$0, "_on", fnt.ax, fnu::e);
      fni $$7 = fni.a(dxn.B, dxn.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return fnk.a().a(fnl.c, $$6x ? $$4 : $$1);
            case b:
               return fnk.a().a(fnl.c, $$6x ? $$4 : $$1).a(fnl.b, fnl.a.b);
            case c:
               return fnk.a().a(fnl.c, $$6x ? $$5 : $$2).a(fnl.b, fnl.a.b);
            case d:
               return fnk.a().a(fnl.c, $$6x ? $$6 : $$3).a(fnl.b, fnl.a.b);
            case e:
               return fnk.a().a(fnl.c, $$6x ? $$5 : $$2);
            case f:
               return fnk.a().a(fnl.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fnh.a($$0).a($$7));
   }

   private void a(djm $$0, cwl $$1) {
      akv $$2 = fnt.aa.a($$0, fnu.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(djm $$0, akv $$1) {
      akv $$2 = fnt.aa.a($$0, fnu.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private akv g(djm $$0, djm $$1) {
      return fnt.aa.a($$0, fnu.x($$1), this.d);
   }

   public void a(djm $$0, djm $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(djm $$0) {
      this.a($$0, $$0);
   }

   private void h(djm $$0, djm $$1) {
      this.a($$0);
      akv $$2 = fnw.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(djm $$0) {
      this.b($$0.j());
      akv $$1 = fnw.l.create($$0, this.d);
      akv $$2 = fnw.m.create($$0, this.d);
      akv $$3 = fnw.n.create($$0, this.d);
      akv $$4 = fnw.o.create($$0, this.d);
      this.b
         .accept(
            fng.a($$0)
               .a(fnf.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.c), fnk.a().a(fnl.c, $$1))
               .a(fnf.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.f), fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.d), fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c))
               .a(fnf.a().a(dxn.V, 1, 2, 3, 4).a(dxn.U, jn.e), fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.d))
               .a(fnf.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.c), fnk.a().a(fnl.c, $$2))
               .a(fnf.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.f), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.d), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c))
               .a(fnf.a().a(dxn.V, 2, 3, 4).a(dxn.U, jn.e), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d))
               .a(fnf.a().a(dxn.V, 3, 4).a(dxn.U, jn.c), fnk.a().a(fnl.c, $$3))
               .a(fnf.a().a(dxn.V, 3, 4).a(dxn.U, jn.f), fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.V, 3, 4).a(dxn.U, jn.d), fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c))
               .a(fnf.a().a(dxn.V, 3, 4).a(dxn.U, jn.e), fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d))
               .a(fnf.a().a(dxn.V, 4).a(dxn.U, jn.c), fnk.a().a(fnl.c, $$4))
               .a(fnf.a().a(dxn.V, 4).a(dxn.U, jn.f), fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.V, 4).a(dxn.U, jn.d), fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.c))
               .a(fnf.a().a(dxn.V, 4).a(dxn.U, jn.e), fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.d))
         );
   }

   private void a(fnw.a $$0, djm... $$1) {
      for (djm $$2 : $$1) {
         akv $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fnw.a $$0, djm... $$1) {
      for (djm $$2 : $$1) {
         akv $$3 = $$0.create($$2, this.d);
         this.b.accept(fnh.a($$2, fnk.a().a(fnl.c, $$3)).a(c()));
      }
   }

   private void i(djm $$0, djm $$1) {
      this.a($$0);
      fnu $$2 = fnu.b($$0, $$1);
      akv $$3 = fnt.aL.a($$1, $$2, this.d);
      akv $$4 = fnt.aM.a($$1, $$2, this.d);
      akv $$5 = fnt.aN.a($$1, $$2, this.d);
      akv $$6 = fnt.aJ.a($$1, $$2, this.d);
      akv $$7 = fnt.aK.a($$1, $$2, this.d);
      cwl $$8 = $$1.j();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fng.a($$1)
               .a(fnk.a().a(fnl.c, $$3))
               .a(fnf.a().a(dxn.O, true), fnk.a().a(fnl.c, $$4))
               .a(fnf.a().a(dxn.P, true), fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.Q, true), fnk.a().a(fnl.c, $$5))
               .a(fnf.a().a(dxn.R, true), fnk.a().a(fnl.c, $$5).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.O, false), fnk.a().a(fnl.c, $$6))
               .a(fnf.a().a(dxn.P, false), fnk.a().a(fnl.c, $$7))
               .a(fnf.a().a(dxn.Q, false), fnk.a().a(fnl.c, $$7).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.R, false), fnk.a().a(fnl.c, $$6).a(fnl.b, fnl.a.d))
         );
   }

   private void t(djm $$0) {
      fnu $$1 = fnu.C($$0);
      akv $$2 = fnt.aO.a($$0, $$1, this.d);
      akv $$3 = this.a($$0, "_conditional", fnt.aO, $$1x -> $$1.c(fnv.i, $$1x));
      this.b.accept(fnh.a($$0).a(a(dxn.g, $$3, $$2)).a(e()));
   }

   private void u(djm $$0) {
      akv $$1 = fnw.r.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fnk> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fnk.a().a(fnl.c, fnr.a(djo.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fng.a(djo.nB)
               .a(fnf.a().a(dxn.at, 0), this.a(0))
               .a(fnf.a().a(dxn.at, 1), this.a(1))
               .a(fnf.a().a(dxn.bn, dxj.b), fnk.a().a(fnl.c, fnr.a(djo.nB, "_small_leaves")))
               .a(fnf.a().a(dxn.bn, dxj.c), fnk.a().a(fnl.c, fnr.a(djo.nB, "_large_leaves")))
         );
   }

   private fni o() {
      return fni.a(dxn.S)
         .a(jn.a, fnk.a().a(fnl.a, fnl.a.c))
         .a(jn.b, fnk.a())
         .a(jn.c, fnk.a().a(fnl.a, fnl.a.b))
         .a(jn.d, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.c))
         .a(jn.e, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.d))
         .a(jn.f, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b));
   }

   private void p() {
      akv $$0 = fnu.a(djo.ow, "_top_open");
      this.b
         .accept(
            fnh.a(djo.ow)
               .a(this.o())
               .a(
                  fni.a(dxn.z)
                     .a(false, fnk.a().a(fnl.c, fnw.f.create(djo.ow, this.d)))
                     .a(true, fnk.a().a(fnl.c, fnw.f.get(djo.ow).a($$1 -> $$1.a(fnv.f, $$0)).a(djo.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fni a(dxz<T> $$0, T $$1, akv $$2, akv $$3) {
      fnk $$4 = fnk.a().a(fnl.c, $$2);
      fnk $$5 = fnk.a().a(fnl.c, $$3);
      return fni.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(djm $$0, Function<djm, fnu> $$1) {
      fnu $$2 = $$1.apply($$0).b(fnv.i, fnv.c);
      fnu $$3 = $$2.c(fnv.g, fnu.a($$0, "_front_honey"));
      akv $$4 = fnt.q.a($$0, "_empty", $$2, this.d);
      akv $$5 = fnt.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.j(), fnp.a(djg.c, fnp.a($$4), Map.of(5, fnp.a($$5))));
      this.b.accept(fnh.a($$0).a(b()).a(a(djg.c, 5, $$5, $$4)));
   }

   private void a(djm $$0, dxz<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akv> $$3 = new Int2ObjectOpenHashMap();
         fni $$4 = fni.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akv $$5 = (akv)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, fnt.aY, fnu::g));
            return fnk.a().a(fnl.c, $$5);
         });
         this.b($$0.j());
         this.b.accept(fnh.a($$0).a($$4));
      }
   }

   private void q() {
      akv $$0 = fnr.a(djo.oF, "_floor");
      akv $$1 = fnr.a(djo.oF, "_ceiling");
      akv $$2 = fnr.a(djo.oF, "_wall");
      akv $$3 = fnr.a(djo.oF, "_between_walls");
      this.b(cwt.xs);
      this.b
         .accept(
            fnh.a(djo.oF)
               .a(
                  fni.a(dxn.U, dxn.Y)
                     .a(jn.c, dxl.a, fnk.a().a(fnl.c, $$0))
                     .a(jn.d, dxl.a, fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c))
                     .a(jn.f, dxl.a, fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b))
                     .a(jn.e, dxl.a, fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d))
                     .a(jn.c, dxl.b, fnk.a().a(fnl.c, $$1))
                     .a(jn.d, dxl.b, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c))
                     .a(jn.f, dxl.b, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.b))
                     .a(jn.e, dxl.b, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.d))
                     .a(jn.c, dxl.c, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d))
                     .a(jn.d, dxl.c, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b))
                     .a(jn.f, dxl.c, fnk.a().a(fnl.c, $$2))
                     .a(jn.e, dxl.c, fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c))
                     .a(jn.d, dxl.d, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
                     .a(jn.c, dxl.d, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d))
                     .a(jn.f, dxl.d, fnk.a().a(fnl.c, $$3))
                     .a(jn.e, dxl.d, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fnh.a(djo.oB, fnk.a().a(fnl.c, fnr.a(djo.oB)))
               .a(
                  fni.a(dxn.X, dxn.U)
                     .a(dxi.a, jn.c, fnk.a())
                     .a(dxi.a, jn.f, fnk.a().a(fnl.b, fnl.a.b))
                     .a(dxi.a, jn.d, fnk.a().a(fnl.b, fnl.a.c))
                     .a(dxi.a, jn.e, fnk.a().a(fnl.b, fnl.a.d))
                     .a(dxi.b, jn.c, fnk.a().a(fnl.a, fnl.a.b))
                     .a(dxi.b, jn.f, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b))
                     .a(dxi.b, jn.d, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.c))
                     .a(dxi.b, jn.e, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.d))
                     .a(dxi.c, jn.d, fnk.a().a(fnl.a, fnl.a.c))
                     .a(dxi.c, jn.e, fnk.a().a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b))
                     .a(dxi.c, jn.c, fnk.a().a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c))
                     .a(dxi.c, jn.f, fnk.a().a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d))
               )
         );
   }

   private void d(djm $$0, fnw.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      akv $$3 = fnu.a($$0, "_front_on");
      akv $$4 = $$1.get($$0).a($$1x -> $$1x.a(fnv.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fnh.a($$0).a(a(dxn.v, $$4, $$2)).a(b()));
   }

   private void a(djm... $$0) {
      akv $$1 = fnr.a("campfire_off");

      for (djm $$2 : $$0) {
         akv $$3 = fnt.bf.a($$2, fnu.H($$2), this.d);
         this.b($$2.j());
         this.b.accept(fnh.a($$2).a(a(dxn.v, $$3, $$1)).a(c()));
      }
   }

   private void v(djm $$0) {
      akv $$1 = fnt.bA.a($$0, fnu.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void w(djm $$0) {
      akv $$1;
      if ($$0 == djo.tL) {
         $$1 = fnt.bC.a($$0, fnu.p($$0), this.d);
      } else {
         $$1 = fnt.bB.a($$0, fnu.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fnu $$0 = fnu.a(fnu.J(djo.cs), fnu.J(djo.n));
      akv $$1 = fnt.j.a(djo.cs, $$0, this.d);
      this.b.accept(c(djo.cs, $$1));
   }

   private void t() {
      this.b(cwt.me);
      this.b
         .accept(
            fng.a(djo.cE)
               .a(
                  fnf.b(
                     fnf.a().a(dxn.ae, dyb.c).a(dxn.ad, dyb.c).a(dxn.af, dyb.c).a(dxn.ag, dyb.c),
                     fnf.a().a(dxn.ae, dyb.b, dyb.a).a(dxn.ad, dyb.b, dyb.a),
                     fnf.a().a(dxn.ad, dyb.b, dyb.a).a(dxn.af, dyb.b, dyb.a),
                     fnf.a().a(dxn.af, dyb.b, dyb.a).a(dxn.ag, dyb.b, dyb.a),
                     fnf.a().a(dxn.ag, dyb.b, dyb.a).a(dxn.ae, dyb.b, dyb.a)
                  ),
                  fnk.a().a(fnl.c, fnr.a("redstone_dust_dot"))
               )
               .a(fnf.a().a(dxn.ae, dyb.b, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_side0")))
               .a(fnf.a().a(dxn.af, dyb.b, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_side_alt0")))
               .a(fnf.a().a(dxn.ad, dyb.b, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_side_alt1")).a(fnl.b, fnl.a.d))
               .a(fnf.a().a(dxn.ag, dyb.b, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_side1")).a(fnl.b, fnl.a.d))
               .a(fnf.a().a(dxn.ae, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_up")))
               .a(fnf.a().a(dxn.ad, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_up")).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.af, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_up")).a(fnl.b, fnl.a.c))
               .a(fnf.a().a(dxn.ag, dyb.a), fnk.a().a(fnl.c, fnr.a("redstone_dust_up")).a(fnl.b, fnl.a.d))
         );
   }

   private void u() {
      this.b(cwt.mi);
      this.b
         .accept(
            fnh.a(djo.hv)
               .a(c())
               .a(
                  fni.a(dxn.bg, dxn.B)
                     .a(dxq.a, false, fnk.a().a(fnl.c, fnr.a(djo.hv)))
                     .a(dxq.a, true, fnk.a().a(fnl.c, fnr.a(djo.hv, "_on")))
                     .a(dxq.b, false, fnk.a().a(fnl.c, fnr.a(djo.hv, "_subtract")))
                     .a(dxq.b, true, fnk.a().a(fnl.c, fnr.a(djo.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fnu $$0 = fnu.a(djo.kq);
      fnu $$1 = fnu.a(fnu.a(djo.kd, "_side"), $$0.a(fnv.f));
      akv $$2 = fnt.ab.a(djo.kd, $$1, this.d);
      akv $$3 = fnt.ac.a(djo.kd, $$1, this.d);
      akv $$4 = fnt.j.b(djo.kd, "_double", $$1, this.d);
      this.b.accept(e(djo.kd, $$2, $$3, $$4));
      this.b.accept(c(djo.kq, fnt.c.a(djo.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cwt.tn);
      this.b
         .accept(
            fng.a(djo.fN)
               .a(fnk.a().a(fnl.c, fnu.J(djo.fN)))
               .a(fnf.a().a(dxn.o, true), fnk.a().a(fnl.c, fnu.a(djo.fN, "_bottle0")))
               .a(fnf.a().a(dxn.p, true), fnk.a().a(fnl.c, fnu.a(djo.fN, "_bottle1")))
               .a(fnf.a().a(dxn.q, true), fnk.a().a(fnl.c, fnu.a(djo.fN, "_bottle2")))
               .a(fnf.a().a(dxn.o, false), fnk.a().a(fnl.c, fnu.a(djo.fN, "_empty0")))
               .a(fnf.a().a(dxn.p, false), fnk.a().a(fnl.c, fnu.a(djo.fN, "_empty1")))
               .a(fnf.a().a(dxn.q, false), fnk.a().a(fnl.c, fnu.a(djo.fN, "_empty2")))
         );
   }

   private void x(djm $$0) {
      akv $$1 = fnt.bw.a($$0, fnu.b($$0), this.d);
      akv $$2 = fnr.a("mushroom_block_inside");
      this.b
         .accept(
            fng.a($$0)
               .a(fnf.a().a(dxn.O, true), fnk.a().a(fnl.c, $$1))
               .a(fnf.a().a(dxn.P, true), fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(fnf.a().a(dxn.Q, true), fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(fnf.a().a(dxn.R, true), fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(fnf.a().a(dxn.M, true), fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.d).a(fnl.d, true))
               .a(fnf.a().a(dxn.N, true), fnk.a().a(fnl.c, $$1).a(fnl.a, fnl.a.b).a(fnl.d, true))
               .a(fnf.a().a(dxn.O, false), fnk.a().a(fnl.c, $$2))
               .a(fnf.a().a(dxn.P, false), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b).a(fnl.d, false))
               .a(fnf.a().a(dxn.Q, false), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c).a(fnl.d, false))
               .a(fnf.a().a(dxn.R, false), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d).a(fnl.d, false))
               .a(fnf.a().a(dxn.M, false), fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.d).a(fnl.d, false))
               .a(fnf.a().a(dxn.N, false), fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.b).a(fnl.d, false))
         );
      this.a($$0, fnw.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cwt.sy);
      this.b
         .accept(
            fnh.a(djo.et)
               .a(
                  fni.a(dxn.aB)
                     .a(0, fnk.a().a(fnl.c, fnr.a(djo.et)))
                     .a(1, fnk.a().a(fnl.c, fnr.a(djo.et, "_slice1")))
                     .a(2, fnk.a().a(fnl.c, fnr.a(djo.et, "_slice2")))
                     .a(3, fnk.a().a(fnl.c, fnr.a(djo.et, "_slice3")))
                     .a(4, fnk.a().a(fnl.c, fnr.a(djo.et, "_slice4")))
                     .a(5, fnk.a().a(fnl.c, fnr.a(djo.et, "_slice5")))
                     .a(6, fnk.a().a(fnl.c, fnr.a(djo.et, "_slice6")))
               )
         );
   }

   private void y() {
      fnu $$0 = new fnu()
         .a(fnv.c, fnu.a(djo.oz, "_side3"))
         .a(fnv.o, fnu.J(djo.t))
         .a(fnv.n, fnu.a(djo.oz, "_top"))
         .a(fnv.j, fnu.a(djo.oz, "_side3"))
         .a(fnv.l, fnu.a(djo.oz, "_side3"))
         .a(fnv.k, fnu.a(djo.oz, "_side1"))
         .a(fnv.m, fnu.a(djo.oz, "_side2"));
      this.b.accept(c(djo.oz, fnt.a.a(djo.oz, $$0, this.d)));
   }

   private void z() {
      fnu $$0 = new fnu()
         .a(fnv.c, fnu.a(djo.oD, "_front"))
         .a(fnv.o, fnu.a(djo.oD, "_bottom"))
         .a(fnv.n, fnu.a(djo.oD, "_top"))
         .a(fnv.j, fnu.a(djo.oD, "_front"))
         .a(fnv.k, fnu.a(djo.oD, "_front"))
         .a(fnv.l, fnu.a(djo.oD, "_side"))
         .a(fnv.m, fnu.a(djo.oD, "_side"));
      this.b.accept(c(djo.oD, fnt.a.a(djo.oD, $$0, this.d)));
   }

   private void a(djm $$0, djm $$1, BiFunction<djm, djm, fnu> $$2) {
      fnu $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, fnt.a.a($$0, $$3, this.d)));
   }

   public void b(djm $$0) {
      fnu $$1 = new fnu()
         .a(fnv.c, fnu.a($$0, "_particle"))
         .a(fnv.o, fnu.a($$0, "_down"))
         .a(fnv.n, fnu.a($$0, "_up"))
         .a(fnv.j, fnu.a($$0, "_north"))
         .a(fnv.k, fnu.a($$0, "_south"))
         .a(fnv.l, fnu.a($$0, "_east"))
         .a(fnv.m, fnu.a($$0, "_west"));
      this.b.accept(c($$0, fnt.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fnu $$0 = fnu.n(djo.fn);
      this.b.accept(c(djo.fn, fnr.a(djo.fn)));
      this.a(djo.er, $$0);
      this.a(djo.es, $$0);
   }

   private void a(djm $$0, fnu $$1) {
      akv $$2 = fnt.p.a($$0, $$1.c(fnv.g, fnu.J($$0)), this.d);
      this.b.accept(fnh.a($$0, fnk.a().a(fnl.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cwt.to);
      this.n(djo.fO);
      this.b.accept(c(djo.fQ, fnt.bz.a(djo.fQ, fnu.j(fnu.a(djo.K, "_still")), this.d)));
      this.b
         .accept(
            fnh.a(djo.fP)
               .a(
                  fni.a(dnx.g)
                     .a(1, fnk.a().a(fnl.c, fnt.bx.a(djo.fP, "_level1", fnu.j(fnu.a(djo.J, "_still")), this.d)))
                     .a(2, fnk.a().a(fnl.c, fnt.by.a(djo.fP, "_level2", fnu.j(fnu.a(djo.J, "_still")), this.d)))
                     .a(3, fnk.a().a(fnl.c, fnt.bz.a(djo.fP, "_full", fnu.j(fnu.a(djo.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fnh.a(djo.fR)
               .a(
                  fni.a(dnx.g)
                     .a(1, fnk.a().a(fnl.c, fnt.bx.a(djo.fR, "_level1", fnu.j(fnu.J(djo.rr)), this.d)))
                     .a(2, fnk.a().a(fnl.c, fnt.by.a(djo.fR, "_level2", fnu.j(fnu.J(djo.rr)), this.d)))
                     .a(3, fnk.a().a(fnl.c, fnt.bz.a(djo.fR, "_full", fnu.j(fnu.J(djo.rr)), this.d)))
               )
         );
   }

   private void C() {
      fnu $$0 = fnu.b(djo.kX);
      akv $$1 = fnt.aH.a(djo.kX, $$0, this.d);
      akv $$2 = this.a(djo.kX, "_dead", fnt.aH, $$1x -> $$0.c(fnv.b, $$1x));
      this.b.accept(fnh.a(djo.kX).a(a(dxn.ax, 5, $$2, $$1)));
   }

   private void D() {
      akv $$0 = fnr.a(djo.tS);
      akv $$1 = fnr.a(djo.tS, "_triggered");
      akv $$2 = fnr.a(djo.tS, "_crafting");
      akv $$3 = fnr.a(djo.tS, "_crafting_triggered");
      this.b
         .accept(
            fnh.a(djo.tS)
               .a(fni.a(dxn.W).a($$0x -> this.a($$0x, fnk.a())))
               .a(
                  fni.a(dxn.H, dlf.b)
                     .a(false, false, fnk.a().a(fnl.c, $$0))
                     .a(true, true, fnk.a().a(fnl.c, $$3))
                     .a(true, false, fnk.a().a(fnl.c, $$1))
                     .a(false, true, fnk.a().a(fnl.c, $$2))
               )
         );
   }

   private void y(djm $$0) {
      fnu $$1 = new fnu().a(fnv.f, fnu.a(djo.cL, "_top")).a(fnv.i, fnu.a(djo.cL, "_side")).a(fnv.g, fnu.a($$0, "_front"));
      fnu $$2 = new fnu().a(fnv.i, fnu.a(djo.cL, "_top")).a(fnv.g, fnu.a($$0, "_front_vertical"));
      akv $$3 = fnt.p.a($$0, $$1, this.d);
      akv $$4 = fnt.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fnh.a($$0)
               .a(
                  fni.a(dxn.S)
                     .a(jn.a, fnk.a().a(fnl.c, $$4).a(fnl.a, fnl.a.c))
                     .a(jn.b, fnk.a().a(fnl.c, $$4))
                     .a(jn.c, fnk.a().a(fnl.c, $$3))
                     .a(jn.f, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
                     .a(jn.d, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c))
                     .a(jn.e, fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d))
               )
         );
   }

   private void E() {
      akv $$0 = fnr.a(djo.fT);
      akv $$1 = fnr.a(djo.fT, "_filled");
      this.b.accept(fnh.a(djo.fT).a(fni.a(dxn.l).a(false, fnk.a().a(fnl.c, $$0)).a(true, fnk.a().a(fnl.c, $$1))).a(c()));
   }

   private void F() {
      akv $$0 = fnr.a(djo.kW, "_side");
      akv $$1 = fnr.a(djo.kW, "_noside");
      akv $$2 = fnr.a(djo.kW, "_noside1");
      akv $$3 = fnr.a(djo.kW, "_noside2");
      akv $$4 = fnr.a(djo.kW, "_noside3");
      this.b
         .accept(
            fng.a(djo.kW)
               .a(fnf.a().a(dxn.O, true), fnk.a().a(fnl.c, $$0))
               .a(fnf.a().a(dxn.P, true), fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b).a(fnl.d, true))
               .a(fnf.a().a(dxn.Q, true), fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c).a(fnl.d, true))
               .a(fnf.a().a(dxn.R, true), fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d).a(fnl.d, true))
               .a(fnf.a().a(dxn.M, true), fnk.a().a(fnl.c, $$0).a(fnl.a, fnl.a.d).a(fnl.d, true))
               .a(fnf.a().a(dxn.N, true), fnk.a().a(fnl.c, $$0).a(fnl.a, fnl.a.b).a(fnl.d, true))
               .a(fnf.a().a(dxn.O, false), fnk.a().a(fnl.c, $$1).a(fnl.e, 2), fnk.a().a(fnl.c, $$2), fnk.a().a(fnl.c, $$3), fnk.a().a(fnl.c, $$4))
               .a(
                  fnf.a().a(dxn.P, false),
                  fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.b).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$1).a(fnl.e, 2).a(fnl.b, fnl.a.b).a(fnl.d, true)
               )
               .a(
                  fnf.a().a(dxn.Q, false),
                  fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.c).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.c).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$1).a(fnl.e, 2).a(fnl.b, fnl.a.c).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.c).a(fnl.d, true)
               )
               .a(
                  fnf.a().a(dxn.R, false),
                  fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.d).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$1).a(fnl.e, 2).a(fnl.b, fnl.a.d).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.d).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.d).a(fnl.d, true)
               )
               .a(
                  fnf.a().a(dxn.M, false),
                  fnk.a().a(fnl.c, $$1).a(fnl.e, 2).a(fnl.a, fnl.a.d).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$4).a(fnl.a, fnl.a.d).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.d).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.d).a(fnl.d, true)
               )
               .a(
                  fnf.a().a(dxn.N, false),
                  fnk.a().a(fnl.c, $$4).a(fnl.a, fnl.a.b).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$3).a(fnl.a, fnl.a.b).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$2).a(fnl.a, fnl.a.b).a(fnl.d, true),
                  fnk.a().a(fnl.c, $$1).a(fnl.e, 2).a(fnl.a, fnl.a.b).a(fnl.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fng.a(djo.pE)
               .a(fnk.a().a(fnl.c, fnu.J(djo.pE)))
               .a(fnf.a().a(dxn.aO, 1), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents1")))
               .a(fnf.a().a(dxn.aO, 2), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents2")))
               .a(fnf.a().a(dxn.aO, 3), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents3")))
               .a(fnf.a().a(dxn.aO, 4), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents4")))
               .a(fnf.a().a(dxn.aO, 5), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents5")))
               .a(fnf.a().a(dxn.aO, 6), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents6")))
               .a(fnf.a().a(dxn.aO, 7), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents7")))
               .a(fnf.a().a(dxn.aO, 8), fnk.a().a(fnl.c, fnu.a(djo.pE, "_contents_ready")))
         );
   }

   private void z(djm $$0) {
      akv $$1 = fnt.c.a($$0, fnu.a($$0), this.d);
      akv $$2 = this.a($$0, "_powered", fnt.c, fnu::b);
      akv $$3 = this.a($$0, "_lit", fnt.c, fnu::b);
      akv $$4 = this.a($$0, "_lit_powered", fnt.c, fnu::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fne a(djm $$0, akv $$1, akv $$2, akv $$3, akv $$4) {
      return fnh.a($$0).a(fni.a(dxn.v, dxn.B).a(($$4x, $$5) -> $$4x ? fnk.a().a(fnl.c, $$5 ? $$4 : $$2) : fnk.a().a(fnl.c, $$5 ? $$3 : $$1)));
   }

   private void j(djm $$0, djm $$1) {
      akv $$2 = fnr.a($$0);
      akv $$3 = fnr.a($$0, "_powered");
      akv $$4 = fnr.a($$0, "_lit");
      akv $$5 = fnr.a($$0, "_lit_powered");
      this.c.a($$0.j(), $$1.j());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void A(djm $$0) {
      this.b.accept(fnh.a($$0, fnk.a().a(fnl.c, fnt.ao.a($$0, fnu.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.A(djo.ra);
      this.A(djo.qZ);
      this.A(djo.qY);
      this.A(djo.qX);
   }

   private void I() {
      fni.b<jn, dxt> $$0 = fni.a(dxn.bp, dxn.bq);

      for (dxt $$1 : dxt.values()) {
         $$0.a(jn.b, $$1, this.a(jn.b, $$1));
      }

      for (dxt $$2 : dxt.values()) {
         $$0.a(jn.a, $$2, this.a(jn.a, $$2));
      }

      this.b.accept(fnh.a(djo.sV).a($$0));
   }

   private fnk a(jn $$0, dxt $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fnu $$3 = fnu.c(fnu.a(djo.sV, $$2));
      return fnk.a().a(fnl.c, fnt.an.a(djo.sV, $$2, $$3, this.d));
   }

   private void B(djm $$0) {
      fnu $$1 = new fnu().a(fnv.e, fnu.J(djo.ei)).a(fnv.f, fnu.J($$0)).a(fnv.i, fnu.a($$0, "_side"));
      this.b.accept(c($$0, fnt.n.a($$0, $$1, this.d)));
   }

   private void J() {
      akv $$0 = fnu.a(djo.hw, "_side");
      fnu $$1 = new fnu().a(fnv.f, fnu.a(djo.hw, "_top")).a(fnv.i, $$0);
      fnu $$2 = new fnu().a(fnv.f, fnu.a(djo.hw, "_inverted_top")).a(fnv.i, $$0);
      this.b
         .accept(
            fnh.a(djo.hw)
               .a(
                  fni.a(dxn.t)
                     .a(false, fnk.a().a(fnl.c, fnt.aI.a(djo.hw, $$1, this.d)))
                     .a(true, fnk.a().a(fnl.c, fnt.aI.a(fnr.a(djo.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void C(djm $$0) {
      this.b.accept(fnh.a($$0, fnk.a().a(fnl.c, fnr.a($$0))).a(this.o()));
   }

   private void K() {
      djm $$0 = djo.sU;
      akv $$1 = fnr.a($$0, "_on");
      akv $$2 = fnr.a($$0);
      this.b.accept(fnh.a($$0, fnk.a().a(fnl.c, fnr.a($$0))).a(this.o()).a(a(dxn.B, $$1, $$2)));
   }

   private void L() {
      fnu $$0 = new fnu().a(fnv.C, fnu.J(djo.j)).a(fnv.f, fnu.J(djo.cK));
      fnu $$1 = new fnu().a(fnv.C, fnu.J(djo.j)).a(fnv.f, fnu.a(djo.cK, "_moist"));
      akv $$2 = fnt.aZ.a(djo.cK, $$0, this.d);
      akv $$3 = fnt.aZ.a(fnu.a(djo.cK, "_moist"), $$1, this.d);
      this.b.accept(fnh.a(djo.cK).a(a(dxn.aT, 7, $$3, $$2)));
   }

   private List<akv> D(djm $$0) {
      akv $$1 = fnt.ba.a(fnr.a($$0, "_floor0"), fnu.y($$0), this.d);
      akv $$2 = fnt.ba.a(fnr.a($$0, "_floor1"), fnu.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<akv> E(djm $$0) {
      akv $$1 = fnt.bb.a(fnr.a($$0, "_side0"), fnu.y($$0), this.d);
      akv $$2 = fnt.bb.a(fnr.a($$0, "_side1"), fnu.z($$0), this.d);
      akv $$3 = fnt.bc.a(fnr.a($$0, "_side_alt0"), fnu.y($$0), this.d);
      akv $$4 = fnt.bc.a(fnr.a($$0, "_side_alt1"), fnu.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akv> F(djm $$0) {
      akv $$1 = fnt.bd.a(fnr.a($$0, "_up0"), fnu.y($$0), this.d);
      akv $$2 = fnt.bd.a(fnr.a($$0, "_up1"), fnu.z($$0), this.d);
      akv $$3 = fnt.be.a(fnr.a($$0, "_up_alt0"), fnu.y($$0), this.d);
      akv $$4 = fnt.be.a(fnr.a($$0, "_up_alt1"), fnu.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fnk> a(List<akv> $$0, UnaryOperator<fnk> $$1) {
      return $$0.stream().map($$0x -> fnk.a().a(fnl.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fnf $$0 = fnf.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, false).a(dxn.M, false);
      List<akv> $$1 = this.D(djo.cy);
      List<akv> $$2 = this.E(djo.cy);
      List<akv> $$3 = this.F(djo.cy);
      this.b
         .accept(
            fng.a(djo.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fnf.b(fnf.a().a(dxn.O, true), $$0), a($$2, $$0x -> $$0x))
               .a(fnf.b(fnf.a().a(dxn.P, true), $$0), a($$2, $$0x -> $$0x.a(fnl.b, fnl.a.b)))
               .a(fnf.b(fnf.a().a(dxn.Q, true), $$0), a($$2, $$0x -> $$0x.a(fnl.b, fnl.a.c)))
               .a(fnf.b(fnf.a().a(dxn.R, true), $$0), a($$2, $$0x -> $$0x.a(fnl.b, fnl.a.d)))
               .a(fnf.a().a(dxn.M, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<akv> $$0 = this.D(djo.cz);
      List<akv> $$1 = this.E(djo.cz);
      this.b
         .accept(
            fng.a(djo.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fnl.b, fnl.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fnl.b, fnl.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fnl.b, fnl.a.d)))
         );
   }

   private void G(djm $$0) {
      akv $$1 = fnw.t.create($$0, this.d);
      akv $$2 = fnw.u.create($$0, this.d);
      this.b($$0.j());
      this.b.accept(fnh.a($$0).a(a(dxn.n, $$2, $$1)));
   }

   private void O() {
      fnu $$0 = fnu.a(fnu.a(djo.ah, "_side"), fnu.a(djo.ah, "_top"));
      akv $$1 = fnt.j.a(djo.ah, $$0, this.d);
      this.b.accept(d(djo.ah, $$1));
   }

   private void P() {
      this.b(cwt.af);
      djm $$0 = djo.H;
      fni.b<Boolean, Integer> $$1 = fni.a(doj.d, doj.b);
      akv $$2 = fnr.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akv $$4 = fnr.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fnk.a().a(fnl.c, $$4));
         $$1.a(false, $$3, fnk.a().a(fnl.c, $$2));
      }

      this.b.accept(fnh.a(djo.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fnh.a(djo.lk)
               .a(
                  fni.a(dxn.av)
                     .a(0, fnk.a().a(fnl.c, this.a(djo.lk, "_0", fnt.c, fnu::b)))
                     .a(1, fnk.a().a(fnl.c, this.a(djo.lk, "_1", fnt.c, fnu::b)))
                     .a(2, fnk.a().a(fnl.c, this.a(djo.lk, "_2", fnt.c, fnu::b)))
                     .a(3, fnk.a().a(fnl.c, this.a(djo.lk, "_3", fnt.c, fnu::b)))
               )
         );
   }

   private void R() {
      akv $$0 = fnu.J(djo.j);
      fnu $$1 = new fnu().a(fnv.e, $$0).b(fnv.e, fnv.c).a(fnv.f, fnu.a(djo.i, "_top")).a(fnv.i, fnu.a(djo.i, "_snow"));
      fnk $$2 = fnk.a().a(fnl.c, fnt.n.a(djo.i, "_snow", $$1, this.d));
      this.a(djo.i, fnr.a(djo.i), $$2);
      this.a(djo.i, fnr.a(djo.i), new fms());
      akv $$3 = fnw.f.get(djo.fA).a($$1x -> $$1x.a(fnv.e, $$0)).a(djo.fA, this.d);
      this.a(djo.fA, $$3, $$2);
      akv $$4 = fnw.f.get(djo.l).a($$1x -> $$1x.a(fnv.e, $$0)).a(djo.l, this.d);
      this.a(djo.l, $$4, $$2);
   }

   private void a(djm $$0, akv $$1, fnk $$2) {
      List<fnk> $$3 = Arrays.asList(a($$1));
      this.b.accept(fnh.a($$0).a(fni.a(dxn.F).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cwt.se);
      this.b
         .accept(
            fnh.a(djo.fX)
               .a(
                  fni.a(dxn.au)
                     .a(0, fnk.a().a(fnl.c, fnr.a(djo.fX, "_stage0")))
                     .a(1, fnk.a().a(fnl.c, fnr.a(djo.fX, "_stage1")))
                     .a(2, fnk.a().a(fnl.c, fnr.a(djo.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(djo.lg, fnr.a(djo.lg)));
   }

   private void k(djm $$0, djm $$1) {
      fnu $$2 = fnu.b($$1);
      akv $$3 = fnt.Y.a($$0, $$2, this.d);
      akv $$4 = fnt.Z.a($$0, $$2, this.d);
      this.b.accept(fnh.a($$0).a(a(dxn.aW, 1, $$4, $$3)));
   }

   private void U() {
      akv $$0 = fnr.a(djo.hz);
      akv $$1 = fnr.a(djo.hz, "_side");
      this.b(cwt.mo);
      this.b
         .accept(
            fnh.a(djo.hz)
               .a(
                  fni.a(dxn.T)
                     .a(jn.a, fnk.a().a(fnl.c, $$0))
                     .a(jn.c, fnk.a().a(fnl.c, $$1))
                     .a(jn.f, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.b))
                     .a(jn.d, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.c))
                     .a(jn.e, fnk.a().a(fnl.c, $$1).a(fnl.b, fnl.a.d))
               )
         );
   }

   private void l(djm $$0, djm $$1) {
      akv $$2 = fnr.a($$0);
      this.b.accept(fnh.a($$1, fnk.a().a(fnl.c, $$2)));
      this.c.a($$0.j(), $$1.j());
   }

   private void V() {
      akv $$0 = fnr.a(djo.fk, "_post_ends");
      akv $$1 = fnr.a(djo.fk, "_post");
      akv $$2 = fnr.a(djo.fk, "_cap");
      akv $$3 = fnr.a(djo.fk, "_cap_alt");
      akv $$4 = fnr.a(djo.fk, "_side");
      akv $$5 = fnr.a(djo.fk, "_side_alt");
      this.b
         .accept(
            fng.a(djo.fk)
               .a(fnk.a().a(fnl.c, $$0))
               .a(fnf.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, false), fnk.a().a(fnl.c, $$1))
               .a(fnf.a().a(dxn.O, true).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, false), fnk.a().a(fnl.c, $$2))
               .a(fnf.a().a(dxn.O, false).a(dxn.P, true).a(dxn.Q, false).a(dxn.R, false), fnk.a().a(fnl.c, $$2).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, true).a(dxn.R, false), fnk.a().a(fnl.c, $$3))
               .a(fnf.a().a(dxn.O, false).a(dxn.P, false).a(dxn.Q, false).a(dxn.R, true), fnk.a().a(fnl.c, $$3).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.O, true), fnk.a().a(fnl.c, $$4))
               .a(fnf.a().a(dxn.P, true), fnk.a().a(fnl.c, $$4).a(fnl.b, fnl.a.b))
               .a(fnf.a().a(dxn.Q, true), fnk.a().a(fnl.c, $$5))
               .a(fnf.a().a(dxn.R, true), fnk.a().a(fnl.c, $$5).a(fnl.b, fnl.a.b))
         );
      this.c(djo.fk);
   }

   private void H(djm $$0) {
      this.b.accept(fnh.a($$0, fnk.a().a(fnl.c, fnr.a($$0))).a(b()));
   }

   private void W() {
      akv $$0 = fnr.a(djo.dI);
      akv $$1 = fnr.a(djo.dI, "_on");
      this.c(djo.dI);
      this.b
         .accept(
            fnh.a(djo.dI)
               .a(a(dxn.B, $$0, $$1))
               .a(
                  fni.a(dxn.X, dxn.U)
                     .a(dxi.c, jn.c, fnk.a().a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.c))
                     .a(dxi.c, jn.f, fnk.a().a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.d))
                     .a(dxi.c, jn.d, fnk.a().a(fnl.a, fnl.a.c))
                     .a(dxi.c, jn.e, fnk.a().a(fnl.a, fnl.a.c).a(fnl.b, fnl.a.b))
                     .a(dxi.a, jn.c, fnk.a())
                     .a(dxi.a, jn.f, fnk.a().a(fnl.b, fnl.a.b))
                     .a(dxi.a, jn.d, fnk.a().a(fnl.b, fnl.a.c))
                     .a(dxi.a, jn.e, fnk.a().a(fnl.b, fnl.a.d))
                     .a(dxi.b, jn.c, fnk.a().a(fnl.a, fnl.a.b))
                     .a(dxi.b, jn.f, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b))
                     .a(dxi.b, jn.d, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.c))
                     .a(dxi.b, jn.e, fnk.a().a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.d))
               )
         );
   }

   private void X() {
      akv $$0 = this.a(cwt.gx, djo.fB);
      this.a(djo.fB, $$0, fnp.a(-9321636));
      this.b.accept(b(djo.fB, fnr.a(djo.fB)));
   }

   private void Y() {
      this.c(djo.tP);
      this.b.accept(c(djo.tP, fnr.a(djo.tP)));
   }

   private void Z() {
      this.b.accept(fnh.a(djo.eq).a(fni.a(dxn.K).a(jn.a.a, fnk.a().a(fnl.c, fnr.a(djo.eq, "_ns"))).a(jn.a.c, fnk.a().a(fnl.c, fnr.a(djo.eq, "_ew")))));
   }

   private void aa() {
      akv $$0 = fnw.a.create(djo.ei, this.d);
      this.b
         .accept(
            fnh.a(
               djo.ei,
               fnk.a().a(fnl.c, $$0),
               fnk.a().a(fnl.c, $$0).a(fnl.a, fnl.a.b),
               fnk.a().a(fnl.c, $$0).a(fnl.a, fnl.a.c),
               fnk.a().a(fnl.c, $$0).a(fnl.a, fnl.a.d),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b).a(fnl.a, fnl.a.b),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b).a(fnl.a, fnl.a.c),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.b).a(fnl.a, fnl.a.d),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c).a(fnl.a, fnl.a.b),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c).a(fnl.a, fnl.a.c),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.c).a(fnl.a, fnl.a.d),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d).a(fnl.a, fnl.a.b),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d).a(fnl.a, fnl.a.c),
               fnk.a().a(fnl.c, $$0).a(fnl.b, fnl.a.d).a(fnl.a, fnl.a.d)
            )
         );
   }

   private void ab() {
      akv $$0 = fnr.a(djo.lq);
      akv $$1 = fnr.a(djo.lq, "_on");
      this.b.accept(fnh.a(djo.lq).a(a(dxn.B, $$1, $$0)).a(e()));
   }

   private void ac() {
      fnu $$0 = new fnu().a(fnv.e, fnu.a(djo.bF, "_bottom")).a(fnv.i, fnu.a(djo.bF, "_side"));
      akv $$1 = fnu.a(djo.bF, "_top_sticky");
      akv $$2 = fnu.a(djo.bF, "_top");
      fnu $$3 = $$0.c(fnv.F, $$1);
      fnu $$4 = $$0.c(fnv.F, $$2);
      akv $$5 = fnr.a(djo.bF, "_base");
      this.a(djo.bF, $$5, $$4);
      this.a(djo.by, $$5, $$3);
      akv $$6 = fnt.n.a(djo.bF, "_inventory", $$0.c(fnv.f, $$2), this.d);
      akv $$7 = fnt.n.a(djo.by, "_inventory", $$0.c(fnv.f, $$1), this.d);
      this.a(djo.bF, $$6);
      this.a(djo.by, $$7);
   }

   private void a(djm $$0, akv $$1, fnu $$2) {
      akv $$3 = fnt.bo.a($$0, $$2, this.d);
      this.b.accept(fnh.a($$0).a(a(dxn.k, $$1, $$3)).a(e()));
   }

   private void ad() {
      fnu $$0 = new fnu().a(fnv.G, fnu.a(djo.bF, "_top")).a(fnv.i, fnu.a(djo.bF, "_side"));
      fnu $$1 = $$0.c(fnv.F, fnu.a(djo.bF, "_top_sticky"));
      fnu $$2 = $$0.c(fnv.F, fnu.a(djo.bF, "_top"));
      this.b
         .accept(
            fnh.a(djo.bG)
               .a(
                  fni.a(dxn.C, dxn.bj)
                     .a(false, dxy.a, fnk.a().a(fnl.c, fnt.bp.a(djo.bF, "_head", $$2, this.d)))
                     .a(false, dxy.b, fnk.a().a(fnl.c, fnt.bp.a(djo.bF, "_head_sticky", $$1, this.d)))
                     .a(true, dxy.a, fnk.a().a(fnl.c, fnt.bq.a(djo.bF, "_head_short", $$2, this.d)))
                     .a(true, dxy.b, fnk.a().a(fnl.c, fnt.bq.a(djo.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      djm $$0 = djo.tT;
      fnu $$1 = fnu.a($$0, "_side_inactive", "_top_inactive");
      fnu $$2 = fnu.a($$0, "_side_active", "_top_active");
      fnu $$3 = fnu.a($$0, "_side_active", "_top_ejecting_reward");
      fnu $$4 = fnu.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fnu $$5 = fnu.a($$0, "_side_active_ominous", "_top_active_ominous");
      fnu $$6 = fnu.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akv $$7 = fnt.o.a($$0, $$1, this.d);
      akv $$8 = fnt.o.a($$0, "_active", $$2, this.d);
      akv $$9 = fnt.o.a($$0, "_ejecting_reward", $$3, this.d);
      akv $$10 = fnt.o.a($$0, "_inactive_ominous", $$4, this.d);
      akv $$11 = fnt.o.a($$0, "_active_ominous", $$5, this.d);
      akv $$12 = fnt.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fnh.a($$0).a(fni.a(dxn.bB, dxn.bD).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fnk.a().a(fnl.c, $$7x ? $$10 : $$7);
            case b, c, d -> fnk.a().a(fnl.c, $$7x ? $$11 : $$8);
            case e -> fnk.a().a(fnl.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      djm $$0 = djo.tU;
      fnu $$1 = fnu.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fnu $$2 = fnu.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fnu $$3 = fnu.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fnu $$4 = fnu.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akv $$5 = fnt.bX.a($$0, $$1, this.d);
      akv $$6 = fnt.bX.a($$0, "_active", $$2, this.d);
      akv $$7 = fnt.bX.a($$0, "_unlocking", $$3, this.d);
      akv $$8 = fnt.bX.a($$0, "_ejecting_reward", $$4, this.d);
      fnu $$9 = fnu.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fnu $$10 = fnu.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnu $$11 = fnu.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnu $$12 = fnu.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akv $$13 = fnt.bX.a($$0, "_ominous", $$9, this.d);
      akv $$14 = fnt.bX.a($$0, "_active_ominous", $$10, this.d);
      akv $$15 = fnt.bX.a($$0, "_unlocking_ominous", $$11, this.d);
      akv $$16 = fnt.bX.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fnh.a($$0).a(b()).a(fni.a(dsm.b, dsm.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fnk.a().a(fnl.c, $$9x ? $$13 : $$5);
            case b -> fnk.a().a(fnl.c, $$9x ? $$14 : $$6);
            case c -> fnk.a().a(fnl.c, $$9x ? $$15 : $$7);
            case d -> fnk.a().a(fnl.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      akv $$0 = fnr.a(djo.rs, "_inactive");
      akv $$1 = fnr.a(djo.rs, "_active");
      this.a(djo.rs, $$0);
      this.b.accept(fnh.a(djo.rs).a(fni.a(dxn.br).a($$2 -> fnk.a().a(fnl.c, $$2 != dyd.b && $$2 != dyd.c ? $$0 : $$1))));
   }

   private void ah() {
      akv $$0 = fnr.a(djo.rt, "_inactive");
      akv $$1 = fnr.a(djo.rt, "_active");
      this.a(djo.rt, $$0);
      this.b.accept(fnh.a(djo.rt).a(fni.a(dxn.br).a($$2 -> fnk.a().a(fnl.c, $$2 != dyd.b && $$2 != dyd.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      akv $$0 = fnt.bW.a(djo.rx, fnu.a(false), this.d);
      akv $$1 = fnt.bW.a(djo.rx, "_can_summon", fnu.a(true), this.d);
      this.a(djo.rx, $$0);
      this.b.accept(fnh.a(djo.rx).a(a(dxn.f, $$1, $$0)));
   }

   private void aj() {
      akv $$0 = fnr.a(djo.ou, "_stable");
      akv $$1 = fnr.a(djo.ou, "_unstable");
      this.a(djo.ou, $$0);
      this.b.accept(fnh.a(djo.ou).a(a(dxn.e, $$1, $$0)));
   }

   private void ak() {
      akv $$0 = this.a(djo.sX, "", fnt.ao, fnu::c);
      akv $$1 = this.a(djo.sX, "_lit", fnt.ao, fnu::c);
      this.b.accept(fnh.a(djo.sX).a(a(dxn.c, $$1, $$0)));
      akv $$2 = this.a(djo.sY, "", fnt.ao, fnu::c);
      akv $$3 = this.a(djo.sY, "_lit", fnt.ao, fnu::c);
      this.b.accept(fnh.a(djo.sY).a(a(dxn.c, $$3, $$2)));
   }

   private void al() {
      akv $$0 = fnw.a.create(djo.fW, this.d);
      akv $$1 = this.a(djo.fW, "_on", fnt.c, fnu::b);
      this.b.accept(fnh.a(djo.fW).a(a(dxn.v, $$1, $$0)));
   }

   private void m(djm $$0, djm $$1) {
      fnu $$2 = fnu.B($$0);
      this.b.accept(c($$0, fnt.bi.a($$0, $$2, this.d)));
      this.b.accept(fnh.a($$1, fnk.a().a(fnl.c, fnt.bk.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fnu $$0 = fnu.B(djo.dX);
      fnu $$1 = fnu.i(fnu.a(djo.dX, "_off"));
      akv $$2 = fnt.bm.a(djo.dX, $$0, this.d);
      akv $$3 = fnt.bj.a(djo.dX, "_off", $$1, this.d);
      this.b.accept(fnh.a(djo.dX).a(a(dxn.v, $$2, $$3)));
      akv $$4 = fnt.bn.a(djo.dY, $$0, this.d);
      akv $$5 = fnt.bl.a(djo.dY, "_off", $$1, this.d);
      this.b.accept(fnh.a(djo.dY).a(a(dxn.v, $$4, $$5)).a(d()));
      this.c(djo.dX);
   }

   private void an() {
      this.b(cwt.mh);
      this.b.accept(fnh.a(djo.eu).a(fni.a(dxn.aD, dxn.w, dxn.B).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fnk.a().a(fnl.c, fnu.a(djo.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cwt.da);
      this.b
         .accept(
            fnh.a(djo.nx)
               .a(
                  fni.a(dxn.aV, dxn.J)
                     .a(1, false, Arrays.asList(a(fnr.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(fnr.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(fnr.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(fnr.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(fnr.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(fnr.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(fnr.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(fnr.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fnu $$0 = fnu.a(djo.ea);
      akv $$1 = fnt.c.a(djo.ec, $$0, this.d);
      this.b.accept(fnh.a(djo.ea).a(fni.a(dxn.aI).a($$1x -> fnk.a().a(fnl.c, $$1x < 8 ? fnr.a(djo.ea, "_height" + $$1x * 2) : $$1))));
      this.a(djo.ea, fnr.a(djo.ea, "_height2"));
      this.b.accept(c(djo.ec, $$1));
   }

   private void aq() {
      this.b.accept(fnh.a(djo.oE, fnk.a().a(fnl.c, fnr.a(djo.oE))).a(b()));
   }

   private void ar() {
      akv $$0 = fnw.a.create(djo.pC, this.d);
      this.a(djo.pC, $$0);
      this.b.accept(fnh.a(djo.pC).a(fni.a(dxn.bm).a($$0x -> fnk.a().a(fnl.c, this.a(djo.pC, "_" + $$0x.c(), fnt.c, fnu::b)))));
   }

   private void as() {
      this.b(cwt.xv);
      this.b.accept(fnh.a(djo.oK).a(fni.a(dxn.av).a($$0 -> fnk.a().a(fnl.c, this.a(djo.oK, "_stage" + $$0, fnt.ao, fnu::c)))));
   }

   private void at() {
      this.b(cwt.pX);
      this.b
         .accept(
            fnh.a(djo.gd)
               .a(
                  fni.a(dxn.b, dxn.P, dxn.O, dxn.Q, dxn.R)
                     .a(false, false, false, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_ns")))
                     .a(false, true, false, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_n")).a(fnl.b, fnl.a.b))
                     .a(false, false, true, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_n")))
                     .a(false, false, false, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_n")).a(fnl.b, fnl.a.c))
                     .a(false, false, false, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_n")).a(fnl.b, fnl.a.d))
                     .a(false, true, true, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_ne")))
                     .a(false, true, false, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_ne")).a(fnl.b, fnl.a.b))
                     .a(false, false, false, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_ne")).a(fnl.b, fnl.a.c))
                     .a(false, false, true, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_ne")).a(fnl.b, fnl.a.d))
                     .a(false, false, true, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_ns")))
                     .a(false, true, false, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_ns")).a(fnl.b, fnl.a.b))
                     .a(false, true, true, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_nse")))
                     .a(false, true, false, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_nse")).a(fnl.b, fnl.a.b))
                     .a(false, false, true, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_nse")).a(fnl.b, fnl.a.c))
                     .a(false, true, true, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_nse")).a(fnl.b, fnl.a.d))
                     .a(false, true, true, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_nsew")))
                     .a(true, false, false, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_ns")))
                     .a(true, false, true, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_n")))
                     .a(true, false, false, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_n")).a(fnl.b, fnl.a.c))
                     .a(true, true, false, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_n")).a(fnl.b, fnl.a.b))
                     .a(true, false, false, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_n")).a(fnl.b, fnl.a.d))
                     .a(true, true, true, false, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_ne")))
                     .a(true, true, false, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_ne")).a(fnl.b, fnl.a.b))
                     .a(true, false, false, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_ne")).a(fnl.b, fnl.a.c))
                     .a(true, false, true, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_ne")).a(fnl.b, fnl.a.d))
                     .a(true, false, true, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_ns")))
                     .a(true, true, false, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_ns")).a(fnl.b, fnl.a.b))
                     .a(true, true, true, true, false, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_nse")))
                     .a(true, true, false, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_nse")).a(fnl.b, fnl.a.b))
                     .a(true, false, true, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_nse")).a(fnl.b, fnl.a.c))
                     .a(true, true, true, false, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_nse")).a(fnl.b, fnl.a.d))
                     .a(true, true, true, true, true, fnk.a().a(fnl.c, fnr.a(djo.gd, "_attached_nsew")))
               )
         );
   }

   private void au() {
      this.c(djo.gc);
      this.b
         .accept(fnh.a(djo.gc).a(fni.a(dxn.b, dxn.B).a(($$0, $$1) -> fnk.a().a(fnl.c, fnu.a(djo.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akv a(int $$0, String $$1, fnu $$2) {
      switch ($$0) {
         case 1:
            return fnt.bs.a(fnr.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return fnt.bt.a(fnr.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return fnt.bu.a(fnr.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return fnt.bv.a(fnr.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akv a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fnu.b(fnu.J(djo.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fnu.b(fnu.a(djo.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fnu.b(fnu.a(djo.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void av() {
      this.b(cwt.kM);
      this.b.accept(fnh.a(djo.mH).a(fni.a(dxn.aG, dxn.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void aw() {
      this.b(cwt.kN);
      Function<Integer, akv> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fnu $$2 = fnu.a($$1);
         return fnt.bD.a(djo.mI, $$1, $$2, this.d);
      };
      this.b.accept(fnh.a(djo.mI).a(fni.a(dqz.c).a($$1 -> fnk.a().a(fnl.c, $$0.apply($$1)))));
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
      akv $$1 = fnr.a($$0);
      fng $$2 = fng.a($$0);
      fnf.c $$3 = af.a(fnf.a(), $$1x -> a.stream().<jn>map(Pair::getFirst).map(doo::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jn, Function<akv, fnk>> $$4 : a) {
         dxo $$5 = doo.b((jn)$$4.getFirst());
         Function<akv, fnk> $$6 = (Function<akv, fnk>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fnf.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void K(djm $$0) {
      akv $$1 = fnw.j.create($$0, this.d);
      akv $$2 = fnw.k.get($$0).a($$1x -> $$1x.a(fnv.i, fnu.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      akv $$3 = fnw.k.get($$0).a($$1x -> $$1x.a(fnv.i, fnu.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fng $$4 = fng.a($$0);
      fnf.c $$5 = fnf.a().a(dom.b, false);
      $$4.a(fnf.a().a(dom.b, true), fnk.a().a(fnl.c, $$1));
      $$4.a($$5, fnk.a().a(fnl.c, $$1));
      a.stream().<jn>map(Pair::getFirst).forEach($$2x -> {
         dxu<dyi> $$3x = dom.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dyi.a);
         }
      });

      for (Pair<jn, Function<akv, fnk>> $$6 : a) {
         jn $$7 = (jn)$$6.getFirst();
         dxu<dyi> $$8 = dom.a($$7);
         if ($$8 != null) {
            Function<akv, fnk> $$9 = (Function<akv, fnk>)$$6.getSecond();
            $$4.a(fnf.a().a($$8, dyi.c), $$9.apply($$2));
            $$4.a(fnf.a().a($$8, dyi.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void L(djm $$0) {
      fni $$1 = fni.a(dne.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fnu $$3 = fnu.c(fnu.a($$0, $$2));
         akv $$4 = fmz.d.b.a().a($$0, $$2, $$3, this.d);
         return fnk.a().a(fnl.c, $$4);
      });
      this.c($$0);
      this.b.accept(fnh.a($$0).a($$1));
   }

   private void ax() {
      akv $$0 = fnu.a(djo.rw, "_bottom");
      fnu $$1 = new fnu().a(fnv.e, $$0).a(fnv.f, fnu.a(djo.rw, "_top")).a(fnv.i, fnu.a(djo.rw, "_side"));
      fnu $$2 = new fnu().a(fnv.e, $$0).a(fnv.f, fnu.a(djo.rw, "_top_bloom")).a(fnv.i, fnu.a(djo.rw, "_side_bloom"));
      akv $$3 = fnt.n.a(djo.rw, "", $$1, this.d);
      akv $$4 = fnt.n.a(djo.rw, "_bloom", $$2, this.d);
      this.b.accept(fnh.a(djo.rw).a(fni.a(dxn.d).a($$2x -> fnk.a().a(fnl.c, $$2x ? $$4 : $$3))));
      this.a(djo.rw, $$3);
   }

   private void ay() {
      djm $$0 = djo.ct;
      akv $$1 = fnr.a($$0);
      fng $$2 = fng.a($$0);
      List.of(Pair.of(jn.c, fnl.a.a), Pair.of(jn.f, fnl.a.b), Pair.of(jn.d, fnl.a.c), Pair.of(jn.e, fnl.a.d)).forEach($$2x -> {
         jn $$3 = (jn)$$2x.getFirst();
         fnl.a $$4 = (fnl.a)$$2x.getSecond();
         fnf.c $$5 = fnf.a().a(dxn.U, $$3);
         $$2.a($$5, fnk.a().a(fnl.c, $$1).a(fnl.b, $$4).a(fnl.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fnr.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fng $$0, fnf.c $$1, fnl.a $$2) {
      List.of(
            Pair.of(dxn.bs, fnt.aP),
            Pair.of(dxn.bt, fnt.aQ),
            Pair.of(dxn.bu, fnt.aR),
            Pair.of(dxn.bv, fnt.aS),
            Pair.of(dxn.bw, fnt.aT),
            Pair.of(dxn.bx, fnt.aU)
         )
         .forEach($$3 -> {
            dxo $$4 = (dxo)$$3.getFirst();
            fns $$5 = (fns)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fng $$0, fnf.c $$1, fnl.a $$2, dxo $$3, fns $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fnu $$7 = new fnu().a(fnv.b, fnu.a(djo.ct, $$6));
      fmz.c $$8 = new fmz.c($$4, $$6);
      akv $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(djo.ct, $$6, $$7, this.d));
      $$0.a(fnf.a($$1, fnf.a().a($$3, $$5)), fnk.a().a(fnl.c, $$9).a(fnl.b, $$2));
   }

   private void az() {
      this.b.accept(c(djo.ll, fnt.c.a(djo.ll, fnu.b(fnr.a("magma")), this.d)));
   }

   private void a(djm $$0, @Nullable cvm $$1) {
      this.r($$0);
      cwl $$2 = $$0.j();
      akv $$3 = fnt.bK.a($$2, fnu.x($$0), this.d);
      hbl.b $$4 = $$1 != null ? fnp.a($$3, new hdu.a($$1)) : fnp.a($$3, new hdu.a());
      this.c.a($$2, $$4);
   }

   private void c(djm $$0, djm $$1, fmz.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aA() {
      akv $$0 = fnr.a(djo.b);
      akv $$1 = fnr.a(djo.b, "_mirrored");
      this.b.accept(a(djo.fb, $$0, $$1));
      this.a(djo.fb, $$0);
   }

   private void aB() {
      akv $$0 = fnr.a(djo.tl);
      akv $$1 = fnr.a(djo.tl, "_mirrored");
      this.b.accept(a(djo.tF, $$0, $$1).a(f()));
      this.a(djo.tF, $$0);
   }

   private void n(djm $$0, djm $$1) {
      this.a($$0, fmz.d.b);
      fnu $$2 = fnu.d(fnu.a($$0, "_pot"));
      akv $$3 = fmz.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aC() {
      akv $$0 = fnu.a(djo.pN, "_bottom");
      akv $$1 = fnu.a(djo.pN, "_top_off");
      akv $$2 = fnu.a(djo.pN, "_top");
      akv[] $$3 = new akv[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fnu $$5 = new fnu().a(fnv.e, $$0).a(fnv.f, $$4 == 0 ? $$1 : $$2).a(fnv.i, fnu.a(djo.pN, "_side" + $$4));
         $$3[$$4] = fnt.n.a(djo.pN, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fnh.a(djo.pN).a(fni.a(dxn.bc).a($$1x -> fnk.a().a(fnl.c, $$3[$$1x]))));
      this.a(djo.pN, $$3[0]);
   }

   private fnk a(jp $$0, fnk $$1) {
      switch ($$0) {
         case b:
            return $$1.a(fnl.a, fnl.a.b);
         case c:
            return $$1.a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.c);
         case d:
            return $$1.a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.d);
         case a:
            return $$1.a(fnl.a, fnl.a.b).a(fnl.b, fnl.a.b);
         case f:
            return $$1.a(fnl.a, fnl.a.d).a(fnl.b, fnl.a.c);
         case g:
            return $$1.a(fnl.a, fnl.a.d);
         case h:
            return $$1.a(fnl.a, fnl.a.d).a(fnl.b, fnl.a.b);
         case e:
            return $$1.a(fnl.a, fnl.a.d).a(fnl.b, fnl.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(fnl.b, fnl.a.c);
         case i:
            return $$1.a(fnl.b, fnl.a.d);
         case j:
            return $$1.a(fnl.b, fnl.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aD() {
      akv $$0 = fnu.a(djo.pD, "_top");
      akv $$1 = fnu.a(djo.pD, "_bottom");
      akv $$2 = fnu.a(djo.pD, "_side");
      akv $$3 = fnu.a(djo.pD, "_lock");
      fnu $$4 = new fnu().a(fnv.o, $$2).a(fnv.m, $$2).a(fnv.l, $$2).a(fnv.c, $$0).a(fnv.j, $$0).a(fnv.k, $$1).a(fnv.n, $$3);
      akv $$5 = fnt.b.a(djo.pD, $$4, this.d);
      this.b.accept(fnh.a(djo.pD, fnk.a().a(fnl.c, $$5)).a(fni.a(dxn.W).a($$0x -> this.a($$0x, fnk.a()))));
   }

   private void aE() {
      djm $$0 = djo.n;
      akv $$1 = fnr.a($$0);
      fnw $$2 = fnw.a.get($$0);
      djm $$3 = djo.kg;
      akv $$4 = fnt.ab.a($$3, $$2.b(), this.d);
      akv $$5 = fnt.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(djm $$0, djm $$1, dqt.a $$2, akv $$3) {
      akv $$4 = fnr.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.j(), fnp.a($$3, new hdv.a($$2)));
   }

   private void aF() {
      akv $$0 = fnr.b("template_skull");
      this.a(djo.hj, djo.hk, dqt.b.g, $$0);
      this.a(djo.hh, djo.hi, dqt.b.e, $$0);
      this.a(djo.hf, djo.hg, dqt.b.f, $$0);
      this.a(djo.hb, djo.hc, dqt.b.c, $$0);
      this.a(djo.hd, djo.he, dqt.b.d, $$0);
      this.a(djo.hn, djo.ho, dqt.b.h, $$0);
      this.a(djo.hl, djo.hm, dqt.b.i, fnr.a(cwt.vp));
   }

   private void a(djm $$0, djm $$1, cvm $$2) {
      akv $$3 = fnr.a("banner");
      akv $$4 = fnr.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cwl $$5 = $$0.j();
      this.c.a($$5, fnp.a($$4, new hdm.a($$2)));
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

   private void a(djm $$0, djm $$1, akv $$2, boolean $$3) {
      this.a($$0, $$1);
      cwl $$4 = $$0.j();
      akv $$5 = fnt.bM.a($$4, fnu.x($$1), this.d);
      hbl.b $$6 = fnp.a($$5, new hdo.a($$2));
      if ($$3) {
         hbl.b $$7 = fnp.a($$5, new hdo.a(hdo.a));
         this.c.a($$4, fnp.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aH() {
      this.a(djo.cD, djo.n, hdo.b, true);
      this.a(djo.hs, djo.n, hdo.c, true);
      this.a(djo.gb, djo.cv, hdo.d, false);
   }

   private void b(djm $$0, djm $$1, cvm $$2) {
      akv $$3 = fnr.a("bed");
      this.b.accept(c($$0, $$3));
      cwl $$4 = $$0.j();
      akv $$5 = fnt.bL.a(fnr.a($$4), fnu.x($$1), this.d);
      this.c.a($$4, fnp.a($$5, new hdn.a($$2)));
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

   private void a(djm $$0, hdw.a $$1) {
      cwl $$2 = $$0.j();
      akv $$3 = fnr.a($$2);
      this.c.a($$2, fnp.a($$3, $$1));
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
      this.f(djo.bX, fnu.a(djo.bF, "_side"));
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
      this.b(djo.pL, fnw.d);
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
      this.b(djo.eg, fnw.g);
      this.b(djo.pS, fnw.d);
      this.b(djo.fo, fnw.d);
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
      this.b(djo.cA, fnw.b);
      this.g(djo.cB);
      this.a(djo.aV);
      this.b(djo.bD, fnw.v);
      this.b(cwt.cZ);
      this.b(djo.cr, fnw.f);
      this.b(djo.pF, fnw.d);
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
      this.a(djo.cI, djo.n, fnu::c);
      this.a(djo.oA, djo.p, fnu::d);
      this.B(djo.oY);
      this.B(djo.oP);
      this.y(djo.bb);
      this.y(djo.hF);
      this.D();
      this.G(djo.oG);
      this.G(djo.oH);
      this.e(djo.fl, fnr.a(djo.fl));
      this.a(djo.el, fnw.d);
      this.a(djo.em, fnw.d);
      this.a(djo.tG);
      this.a(djo.lo, fnw.d);
      this.e(djo.j);
      this.e(djo.tj);
      this.e(djo.L);
      this.f(djo.M);
      this.f(djo.P);
      this.e(djo.N);
      this.d(djo.I);
      this.b(djo.tQ, fnw.f);
      this.a(djo.iH, fnw.d, fnw.e);
      this.a(djo.kZ, fnw.w, fnw.x);
      this.a(djo.hC, fnw.w, fnw.x);
      this.a(djo.tM, fnw.d, fnw.e);
      this.a(djo.tN, fnw.d, fnw.e);
      this.a(djo.tO, fnw.d, fnw.e);
      this.c(djo.ov, fnw.i);
      this.A();
      this.a(djo.pG, fnu::D);
      this.a(djo.pH, fnu::F);
      this.a(djo.lf, dxn.av, 0, 1, 2, 3);
      this.a(djo.gP, dxn.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djo.fL, dxn.av, 0, 1, 1, 2);
      this.a(djo.gQ, dxn.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djo.cJ, dxn.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(djo.lc, fmz.d.b, dxn.at, 0, 1);
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
      this.a(djo.nz, new hdp.a());
      this.a(djo.tR, djo.iY);
      this.a(djo.tR, new hdq.a());
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
      this.a(fnw.a, djo.mo, djo.mp, djo.mq, djo.mr, djo.ms, djo.mt, djo.mu, djo.mv, djo.mw, djo.mx, djo.my, djo.mz, djo.mA, djo.mB, djo.mC, djo.mD);
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
      this.b(fnw.p, djo.lI, djo.lJ, djo.lK, djo.lL, djo.lM, djo.lN, djo.lO, djo.lP, djo.lQ, djo.lR, djo.lS, djo.lT, djo.lU, djo.lV, djo.lW, djo.lX);
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
      this.b(djo.bB, djo.gx, fmz.d.a);
      this.h(djo.bB);
      this.a(djo.bY, djo.gy, fmz.d.b);
      this.a(djo.ca, djo.gz, fmz.d.b);
      this.a(djo.tZ, djo.ub, fmz.d.c);
      this.a(djo.ua, djo.uc, fmz.d.b);
      this.a(djo.cb, djo.gA, fmz.d.b);
      this.a(djo.cc, djo.gB, fmz.d.b);
      this.a(djo.cd, djo.gC, fmz.d.b);
      this.a(djo.ce, djo.gD, fmz.d.b);
      this.a(djo.cf, djo.gE, fmz.d.b);
      this.a(djo.cg, djo.gF, fmz.d.b);
      this.a(djo.ch, djo.gG, fmz.d.b);
      this.a(djo.ci, djo.gH, fmz.d.b);
      this.a(djo.cj, djo.gI, fmz.d.b);
      this.a(djo.cl, djo.gJ, fmz.d.b);
      this.a(djo.ck, djo.gK, fmz.d.b);
      this.a(djo.cn, djo.gL, fmz.d.b);
      this.a(djo.cm, djo.gM, fmz.d.b);
      this.a(djo.bC, djo.gN, fmz.d.b);
      this.a(djo.bZ, djo.gn, fmz.d.b);
      this.I();
      this.x(djo.fh);
      this.x(djo.fi);
      this.x(djo.fj);
      this.b(djo.bA, fmz.d.a);
      this.h(djo.bA);
      this.b(djo.ef, fmz.d.a);
      this.b(cwt.dS);
      this.c(djo.mE, djo.mF, fmz.d.b);
      this.b(cwt.dT);
      this.b(djo.ti, fmz.d.b);
      this.c(djo.pb, djo.pc, fmz.d.b);
      this.c(djo.pd, djo.pe, fmz.d.b);
      this.a(djo.pb, "_plant");
      this.a(djo.pd, "_plant");
      this.a(djo.nA, fmz.d.a, fnu.c(fnu.a(djo.nB, "_stage0")));
      this.n();
      this.a(djo.bz, fmz.d.b);
      this.d(djo.jc, fmz.d.b);
      this.d(djo.jd, fmz.d.b);
      this.d(djo.je, fmz.d.b);
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
      this.a(djo.aS, fnw.s, -7158200);
      this.m(djo.ab).c(djo.ab).a(djo.ax);
      this.m(djo.am).c(djo.am).a(djo.aF);
      this.a(djo.am, djo.dn, djo.dz);
      this.a(djo.D, djo.gs, fmz.d.b);
      this.a(djo.aO, fnw.s, -12012264);
      this.m(djo.ac).d(djo.ac).a(djo.ay);
      this.m(djo.an).d(djo.an).a(djo.aG);
      this.a(djo.an, djo.do, djo.dA);
      this.a(djo.E, djo.gt, fmz.d.b);
      this.b(djo.aP, fnw.s);
      this.m(djo.Z).c(djo.Z).a(djo.av);
      this.m(djo.ak).c(djo.ak).a(djo.aD);
      this.a(djo.ak, djo.dm, djo.dy);
      this.a(djo.B, djo.gq, fmz.d.b);
      this.a(djo.aM, fnw.s, -8345771);
      this.m(djo.X).c(djo.X).a(djo.at);
      this.m(djo.aq).c(djo.aq).a(djo.aB);
      this.a(djo.aq, djo.dk, djo.dw);
      this.a(djo.z, djo.go, fmz.d.b);
      this.a(djo.aK, fnw.s, -12012264);
      this.m(djo.Y).c(djo.Y).a(djo.au);
      this.m(djo.aj).c(djo.aj).a(djo.aC);
      this.a(djo.aj, djo.dl, djo.dx);
      this.a(djo.A, djo.gp, fmz.d.b);
      this.a(djo.aL, fnw.s, -10380959);
      this.m(djo.ad).c(djo.ad).a(djo.az);
      this.m(djo.ao).c(djo.ao).a(djo.aH);
      this.a(djo.ao, djo.dq, djo.dC);
      this.a(djo.F, djo.gu, fmz.d.b);
      this.a(djo.aQ, fnw.s, -12012264);
      this.m(djo.ae).c(djo.ae).a(djo.u);
      this.m(djo.ap).c(djo.ap).a(djo.aI);
      this.a(djo.ap, djo.dr, djo.dD);
      this.a(djo.G, djo.gv, fmz.d.b);
      this.b(djo.aR, fnw.s);
      this.m(djo.aa).c(djo.aa).a(djo.aw);
      this.m(djo.al).c(djo.al).a(djo.aE);
      this.a(djo.al, djo.dp, djo.dB);
      this.a(djo.C, djo.gr, fmz.d.b);
      this.a(djo.aN, fnw.s, -12012264);
      this.m(djo.oU).b(djo.oU).a(djo.oW);
      this.m(djo.oV).b(djo.oV).a(djo.oX);
      this.a(djo.oV, djo.ds, djo.dF);
      this.a(djo.oZ, djo.pO, fmz.d.b);
      this.n(djo.pf, djo.pQ);
      this.m(djo.oL).b(djo.oL).a(djo.oN);
      this.m(djo.oM).b(djo.oM).a(djo.oO);
      this.a(djo.oM, djo.dt, djo.dG);
      this.a(djo.oQ, djo.pP, fmz.d.b);
      this.n(djo.oS, djo.pR);
      this.m(djo.ai).d(djo.ai);
      this.m(djo.as).d(djo.as);
      this.a(djo.x, djo.dv, djo.dH);
      this.b(djo.oT, fmz.d.b);
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
      this.d(djo.cL, fnw.h);
      this.d(djo.oy, fnw.h);
      this.d(djo.ox, fnw.i);
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
      hbl.b $$0 = fnp.a(this.a(cwt.hZ));
      Map<Integer, hbl.b> $$1 = new HashMap<>(16);
      fni.a<Integer> $$2 = fni.a(dxn.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         akv $$5 = fnu.a(cwt.hZ, $$4);
         $$2.a($$3, fnk.a().a(fnl.c, fnt.aa.a(djo.iv, $$4, fnu.h($$5), this.d)));
         hbl.b $$6 = fnp.a(fnt.bE.a(fnr.a(cwt.hZ, $$4), fnu.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cwt.hZ, fnp.a(doc.c, $$0, $$1));
      this.b.accept(fnh.a(djo.iv).a($$2));
   }

   private void o(djm $$0, djm $$1) {
      this.b($$0.j());
      fnu $$2 = fnu.b(fnu.J($$0));
      fnu $$3 = fnu.b(fnu.a($$0, "_lit"));
      akv $$4 = fnt.bR.a($$0, "_one_candle", $$2, this.d);
      akv $$5 = fnt.bS.a($$0, "_two_candles", $$2, this.d);
      akv $$6 = fnt.bT.a($$0, "_three_candles", $$2, this.d);
      akv $$7 = fnt.bU.a($$0, "_four_candles", $$2, this.d);
      akv $$8 = fnt.bR.a($$0, "_one_candle_lit", $$3, this.d);
      akv $$9 = fnt.bS.a($$0, "_two_candles_lit", $$3, this.d);
      akv $$10 = fnt.bT.a($$0, "_three_candles_lit", $$3, this.d);
      akv $$11 = fnt.bU.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fnh.a($$0)
               .a(
                  fni.a(dxn.aC, dxn.v)
                     .a(1, false, fnk.a().a(fnl.c, $$4))
                     .a(2, false, fnk.a().a(fnl.c, $$5))
                     .a(3, false, fnk.a().a(fnl.c, $$6))
                     .a(4, false, fnk.a().a(fnl.c, $$7))
                     .a(1, true, fnk.a().a(fnl.c, $$8))
                     .a(2, true, fnk.a().a(fnl.c, $$9))
                     .a(3, true, fnk.a().a(fnl.c, $$10))
                     .a(4, true, fnk.a().a(fnl.c, $$11))
               )
         );
      akv $$12 = fnt.bV.a($$1, fnu.a($$0, false), this.d);
      akv $$13 = fnt.bV.a($$1, "_lit", fnu.a($$0, true), this.d);
      this.b.accept(fnh.a($$1).a(a(dxn.v, $$13, $$12)));
   }

   class a {
      private final fnu b;
      private final Map<fns, akv> c = Maps.newHashMap();
      @Nullable
      private mf d;
      @Nullable
      private akv e;
      private final Set<djm> f = new HashSet<>();

      public a(final fnu $$0) {
         this.b = $$0;
      }

      public fmz.a a(djm $$0, fns $$1) {
         this.e = $$1.a($$0, this.b, fmz.this.d);
         if (fmz.this.f.containsKey($$0)) {
            fmz.this.b.accept(fmz.this.f.get($$0).create($$0, this.e, this.b, fmz.this.d));
         } else {
            fmz.this.b.accept(fmz.c($$0, this.e));
         }

         return this;
      }

      public fmz.a a(djm $$0, djm $$1) {
         akv $$2 = fnr.a($$0);
         fmz.this.b.accept(fmz.c($$1, $$2));
         fmz.this.c.a($$0.j(), $$1.j());
         this.f.add($$1);
         return this;
      }

      public fmz.a a(djm $$0) {
         akv $$1 = fnt.s.a($$0, this.b, fmz.this.d);
         akv $$2 = fnt.t.a($$0, this.b, fmz.this.d);
         fmz.this.b.accept(fmz.b($$0, $$1, $$2));
         akv $$3 = fnt.u.a($$0, this.b, fmz.this.d);
         fmz.this.a($$0, $$3);
         return this;
      }

      public fmz.a b(djm $$0) {
         akv $$1 = fnt.M.a($$0, this.b, fmz.this.d);
         akv $$2 = fnt.N.a($$0, this.b, fmz.this.d);
         akv $$3 = fnt.O.a($$0, this.b, fmz.this.d);
         fmz.this.b.accept(fmz.a($$0, $$1, $$2, $$3));
         akv $$4 = fnt.P.a($$0, this.b, fmz.this.d);
         fmz.this.a($$0, $$4);
         return this;
      }

      public fmz.a c(djm $$0) {
         fnu $$1 = fnu.s($$0);
         akv $$2 = fnt.D.a($$0, $$1, fmz.this.d);
         akv $$3 = fnt.E.a($$0, $$1, fmz.this.d);
         akv $$4 = fnt.F.a($$0, $$1, fmz.this.d);
         akv $$5 = fnt.G.a($$0, $$1, fmz.this.d);
         akv $$6 = fnt.H.a($$0, $$1, fmz.this.d);
         fmz.this.b.accept(fmz.a($$0, $$2, $$3, $$4, $$5, $$6));
         akv $$7 = fnt.I.a($$0, $$1, fmz.this.d);
         fmz.this.a($$0, $$7);
         return this;
      }

      public fmz.a d(djm $$0) {
         akv $$1 = fnt.J.a($$0, this.b, fmz.this.d);
         akv $$2 = fnt.K.a($$0, this.b, fmz.this.d);
         fmz.this.b.accept(fmz.c($$0, $$1, $$2));
         akv $$3 = fnt.L.a($$0, this.b, fmz.this.d);
         fmz.this.a($$0, $$3);
         return this;
      }

      public fmz.a e(djm $$0) {
         fnu $$1 = fnu.s($$0);
         akv $$2 = fnt.R.a($$0, $$1, fmz.this.d);
         akv $$3 = fnt.Q.a($$0, $$1, fmz.this.d);
         akv $$4 = fnt.T.a($$0, $$1, fmz.this.d);
         akv $$5 = fnt.S.a($$0, $$1, fmz.this.d);
         fmz.this.b.accept(fmz.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fmz.a f(djm $$0) {
         akv $$1 = fnt.V.a($$0, this.b, fmz.this.d);
         akv $$2 = fnt.U.a($$0, this.b, fmz.this.d);
         akv $$3 = fnt.X.a($$0, this.b, fmz.this.d);
         akv $$4 = fnt.W.a($$0, this.b, fmz.this.d);
         fmz.this.b.accept(fmz.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fmz.a g(djm $$0) {
         akv $$1 = fnt.Y.a($$0, this.b, fmz.this.d);
         akv $$2 = fnt.Z.a($$0, this.b, fmz.this.d);
         fmz.this.b.accept(fmz.e($$0, $$1, $$2));
         return this;
      }

      public fmz.a h(djm $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            djm $$1 = this.d.b().get(mf.b.r);
            akv $$2 = fnt.aa.a($$0, this.b, fmz.this.d);
            fmz.this.b.accept(fmz.c($$0, $$2));
            fmz.this.b.accept(fmz.c($$1, $$2));
            fmz.this.b($$0.j());
            return this;
         }
      }

      public fmz.a i(djm $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akv $$1 = this.a(fnt.ab, $$0);
            akv $$2 = this.a(fnt.ac, $$0);
            fmz.this.b.accept(fmz.e($$0, $$1, $$2, this.e));
            fmz.this.a($$0, $$1);
            return this;
         }
      }

      public fmz.a j(djm $$0) {
         akv $$1 = this.a(fnt.af, $$0);
         akv $$2 = this.a(fnt.ae, $$0);
         akv $$3 = this.a(fnt.ag, $$0);
         fmz.this.b.accept(fmz.b($$0, $$1, $$2, $$3));
         fmz.this.a($$0, $$2);
         return this;
      }

      private fmz.a k(djm $$0) {
         fnw $$1 = fmz.this.g.getOrDefault($$0, fnw.a.get($$0));
         akv $$2 = $$1.a($$0, fmz.this.d);
         fmz.this.b.accept(fmz.c($$0, $$2));
         return this;
      }

      private fmz.a l(djm $$0) {
         fmz.this.j($$0);
         return this;
      }

      private void m(djm $$0) {
         if (fmz.this.e.contains($$0)) {
            fmz.this.l($$0);
         } else {
            fmz.this.k($$0);
         }
      }

      private akv a(fns $$0, djm $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fmz.this.d));
      }

      public fmz.a a(mf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fmz.a, djm> $$2 = fmz.h.get($$0x);
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
      fne create(djm var1, akv var2, fnu var3, BiConsumer<akv, fnq> var4);
   }

   static record c(fns a, String b) {
   }

   static enum d {
      a(fnt.ap, fnt.as, false),
      b(fnt.ao, fnt.ar, false),
      c(fnt.aq, fnt.at, true);

      private final fns d;
      private final fns e;
      private final boolean f;

      private d(final fns $$0, final fns $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fns a() {
         return this.d;
      }

      public fns b() {
         return this.e;
      }

      public akv a(fmz $$0, djm $$1) {
         cwl $$2 = $$1.j();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fnu a(djm $$0) {
         return this.f ? fnu.e($$0) : fnu.c($$0);
      }

      public fnu b(djm $$0) {
         return this.f ? fnu.g($$0) : fnu.f($$0);
      }
   }

   class e {
      private final fnu b;

      public e(final fnu $$0) {
         this.b = $$0;
      }

      public fmz.e a(djm $$0) {
         fnu $$1 = this.b.c(fnv.d, this.b.a(fnv.i));
         akv $$2 = fnt.j.a($$0, $$1, fmz.this.d);
         fmz.this.b.accept(fmz.d($$0, $$2));
         return this;
      }

      public fmz.e b(djm $$0) {
         akv $$1 = fnt.j.a($$0, this.b, fmz.this.d);
         fmz.this.b.accept(fmz.d($$0, $$1));
         return this;
      }

      public fmz.e c(djm $$0) {
         akv $$1 = fnt.j.a($$0, this.b, fmz.this.d);
         akv $$2 = fnt.k.a($$0, this.b, fmz.this.d);
         fmz.this.b.accept(fmz.d($$0, $$1, $$2));
         return this;
      }

      public fmz.e d(djm $$0) {
         fmz.this.b.accept(fmz.a($$0, this.b, fmz.this.d));
         return this;
      }
   }
}
