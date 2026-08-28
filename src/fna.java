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

public class fna {
   final Consumer<fnf> b;
   final fnd c;
   final BiConsumer<akv, fnr> d;
   final List<djn> e = ImmutableList.of(djp.eL, djp.eR, djp.iw);
   final Map<djn, fna.b> f = ImmutableMap.builder().put(djp.b, fna::a).put(djp.tl, fna::c).put(djp.fa, fna::b).build();
   final Map<djn, fnx> g = ImmutableMap.builder()
      .put(djp.bc, fnx.y.get(djp.bc))
      .put(djp.jN, fnx.y.get(djp.jN))
      .put(djp.kr, fnx.a(fnv.a(djp.bc, "_top")))
      .put(djp.kt, fnx.a(fnv.a(djp.jN, "_top")))
      .put(djp.be, fnx.d.get(djp.bc).a($$0x -> $$0x.a(fnw.i, fnv.J(djp.be))))
      .put(djp.jP, fnx.d.get(djp.jN).a($$0x -> $$0x.a(fnw.i, fnv.J(djp.jP))))
      .put(djp.hA, fnx.d.get(djp.hA))
      .put(djp.ks, fnx.a(fnv.a(djp.hA, "_bottom")))
      .put(djp.pT, fnx.z.get(djp.pT))
      .put(djp.tl, fnx.z.get(djp.tl))
      .put(djp.hB, fnx.d.get(djp.hB).a($$0x -> $$0x.a(fnw.i, fnv.J(djp.hB))))
      .put(djp.bd, fnx.d.get(djp.bd).a($$0x -> {
         $$0x.a(fnw.d, fnv.a(djp.bc, "_top"));
         $$0x.a(fnw.i, fnv.J(djp.bd));
      }))
      .put(djp.jO, fnx.d.get(djp.jO).a($$0x -> {
         $$0x.a(fnw.d, fnv.a(djp.jN, "_top"));
         $$0x.a(fnw.i, fnv.J(djp.jO));
      }))
      .put(djp.ro, fnx.z.get(djp.ro))
      .put(djp.rj, fnx.z.get(djp.rj))
      .build();
   static final Map<mf.b, BiConsumer<fna.a, djn>> h = ImmutableMap.builder()
      .put(mf.b.a, fna.a::a)
      .put(mf.b.e, fna.a::l)
      .put(mf.b.b, fna.a::k)
      .put(mf.b.c, fna.a::k)
      .put(mf.b.f, fna.a::c)
      .put(mf.b.g, fna.a::d)
      .put(mf.b.h, fna.a::e)
      .put(mf.b.i, fna.a::f)
      .put(mf.b.k, fna.a::h)
      .put(mf.b.l, fna.a::i)
      .put(mf.b.m, fna.a::j)
      .put(mf.b.n, fna.a::g)
      .put(mf.b.p, fna.a::m)
      .put(mf.b.q, fna.a::b)
      .build();
   public static final List<Pair<jn, Function<akv, fnl>>> a = List.of(
      Pair.of(jn.c, (Function<akv, fnl>)$$0 -> fnl.a().a(fnm.c, $$0)),
      Pair.of(jn.f, (Function<akv, fnl>)$$0 -> fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b).a(fnm.d, true)),
      Pair.of(jn.d, (Function<akv, fnl>)$$0 -> fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c).a(fnm.d, true)),
      Pair.of(jn.e, (Function<akv, fnl>)$$0 -> fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d).a(fnm.d, true)),
      Pair.of(jn.b, (Function<akv, fnl>)$$0 -> fnl.a().a(fnm.c, $$0).a(fnm.a, fnm.a.d).a(fnm.d, true)),
      Pair.of(jn.a, (Function<akv, fnl>)$$0 -> fnl.a().a(fnm.c, $$0).a(fnm.a, fnm.a.b).a(fnm.d, true))
   );
   private static final Map<fna.c, akv> i = new HashMap<>();

   private static fnf a(djn $$0, akv $$1, fnv $$2, BiConsumer<akv, fnr> $$3) {
      akv $$4 = fnu.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fnf b(djn $$0, akv $$1, fnv $$2, BiConsumer<akv, fnr> $$3) {
      akv $$4 = fnu.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fnf c(djn $$0, akv $$1, fnv $$2, BiConsumer<akv, fnr> $$3) {
      akv $$4 = fnu.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fna(Consumer<fnf> $$0, fnd $$1, BiConsumer<akv, fnr> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cwm $$0, akv $$1) {
      this.c.a($$0, fnq.a($$1));
   }

   void a(djn $$0, akv $$1) {
      this.c.a($$0.j(), fnq.a($$1));
   }

   private void a(djn $$0, akv $$1, fmu $$2) {
      this.c.a($$0.j(), fnq.a($$1, $$2));
   }

   private akv a(cwm $$0) {
      return fnu.bE.a(fns.a($$0), fnv.b($$0), this.d);
   }

   akv a(cwm $$0, djn $$1) {
      return fnu.bE.a(fns.a($$0), fnv.I($$1), this.d);
   }

   private akv a(cwm $$0, djn $$1, String $$2) {
      return fnu.bE.a(fns.a($$0), fnv.k(fnv.a($$1, $$2)), this.d);
   }

   akv b(cwm $$0, djn $$1, String $$2) {
      akv $$3 = fnv.J($$1);
      akv $$4 = fnv.a($$1, $$2);
      return fnu.bI.a(fns.a($$0), fnv.c($$3, $$4), this.d);
   }

   void b(cwm $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(djn $$0) {
      cwm $$1 = $$0.j();
      if ($$1 != cwu.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(djn $$0, String $$1) {
      cwm $$2 = $$0.j();
      if ($$2 != cwu.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(djn $$0, String $$1) {
      cwm $$2 = $$0.j();
      if ($$2 != cwu.a) {
         akv $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fnj b() {
      return fnj.a(dxo.U).a(jn.f, fnl.a().a(fnm.b, fnm.a.b)).a(jn.d, fnl.a().a(fnm.b, fnm.a.c)).a(jn.e, fnl.a().a(fnm.b, fnm.a.d)).a(jn.c, fnl.a());
   }

   private static fnj c() {
      return fnj.a(dxo.U).a(jn.d, fnl.a()).a(jn.e, fnl.a().a(fnm.b, fnm.a.b)).a(jn.c, fnl.a().a(fnm.b, fnm.a.c)).a(jn.f, fnl.a().a(fnm.b, fnm.a.d));
   }

   private static fnj d() {
      return fnj.a(dxo.U).a(jn.f, fnl.a()).a(jn.d, fnl.a().a(fnm.b, fnm.a.b)).a(jn.e, fnl.a().a(fnm.b, fnm.a.c)).a(jn.c, fnl.a().a(fnm.b, fnm.a.d));
   }

   private static fnj e() {
      return fnj.a(dxo.S)
         .a(jn.a, fnl.a().a(fnm.a, fnm.a.b))
         .a(jn.b, fnl.a().a(fnm.a, fnm.a.d))
         .a(jn.c, fnl.a())
         .a(jn.d, fnl.a().a(fnm.b, fnm.a.c))
         .a(jn.e, fnl.a().a(fnm.b, fnm.a.d))
         .a(jn.f, fnl.a().a(fnm.b, fnm.a.b));
   }

   private static fni b(djn $$0, akv $$1) {
      return fni.a($$0, a($$1));
   }

   private static fnl[] a(akv $$0) {
      return new fnl[]{
         fnl.a().a(fnm.c, $$0), fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b), fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c), fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d)
      };
   }

   private static fni a(djn $$0, akv $$1, akv $$2) {
      return fni.a($$0, fnl.a().a(fnm.c, $$1), fnl.a().a(fnm.c, $$2), fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c));
   }

   private static fnj a(dxp $$0, akv $$1, akv $$2) {
      return fnj.a($$0).a(true, fnl.a().a(fnm.c, $$1)).a(false, fnl.a().a(fnm.c, $$2));
   }

   private void d(djn $$0) {
      akv $$1 = fnx.a.create($$0, this.d);
      akv $$2 = fnx.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(djn $$0) {
      akv $$1 = fnx.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(djn $$0) {
      this.b.accept(fni.a($$0).a(fnj.a(dxo.by).a($$1 -> {
         String $$2 = "_" + $$1;
         akv $$3 = fnv.a($$0, $$2);
         return fnl.a().a(fnm.c, fnu.c.a($$0, $$2, new fnv().a(fnw.a, $$3), this.d));
      })));
      this.a($$0, fns.a($$0, "_0"));
   }

   static fnf b(djn $$0, akv $$1, akv $$2) {
      return fni.a($$0)
         .a(fnj.a(dxo.B).a(false, fnl.a().a(fnm.c, $$1)).a(true, fnl.a().a(fnm.c, $$2)))
         .a(
            fnj.a(dxo.X, dxo.U)
               .a(dxj.a, jn.f, fnl.a().a(fnm.b, fnm.a.b))
               .a(dxj.a, jn.e, fnl.a().a(fnm.b, fnm.a.d))
               .a(dxj.a, jn.d, fnl.a().a(fnm.b, fnm.a.c))
               .a(dxj.a, jn.c, fnl.a())
               .a(dxj.b, jn.f, fnl.a().a(fnm.b, fnm.a.b).a(fnm.a, fnm.a.b).a(fnm.d, true))
               .a(dxj.b, jn.e, fnl.a().a(fnm.b, fnm.a.d).a(fnm.a, fnm.a.b).a(fnm.d, true))
               .a(dxj.b, jn.d, fnl.a().a(fnm.b, fnm.a.c).a(fnm.a, fnm.a.b).a(fnm.d, true))
               .a(dxj.b, jn.c, fnl.a().a(fnm.a, fnm.a.b).a(fnm.d, true))
               .a(dxj.c, jn.f, fnl.a().a(fnm.b, fnm.a.d).a(fnm.a, fnm.a.c))
               .a(dxj.c, jn.e, fnl.a().a(fnm.b, fnm.a.b).a(fnm.a, fnm.a.c))
               .a(dxj.c, jn.d, fnl.a().a(fnm.a, fnm.a.c))
               .a(dxj.c, jn.c, fnl.a().a(fnm.b, fnm.a.c).a(fnm.a, fnm.a.c))
         );
   }

   private static fnj.d<jn, dxt, dxs, Boolean> a(fnj.d<jn, dxt, dxs, Boolean> $$0, dxt $$1, akv $$2, akv $$3, akv $$4, akv $$5) {
      return $$0.a(jn.f, $$1, dxs.a, false, fnl.a().a(fnm.c, $$2))
         .a(jn.d, $$1, dxs.a, false, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b))
         .a(jn.e, $$1, dxs.a, false, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c))
         .a(jn.c, $$1, dxs.a, false, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d))
         .a(jn.f, $$1, dxs.b, false, fnl.a().a(fnm.c, $$4))
         .a(jn.d, $$1, dxs.b, false, fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.b))
         .a(jn.e, $$1, dxs.b, false, fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.c))
         .a(jn.c, $$1, dxs.b, false, fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.d))
         .a(jn.f, $$1, dxs.a, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
         .a(jn.d, $$1, dxs.a, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c))
         .a(jn.e, $$1, dxs.a, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d))
         .a(jn.c, $$1, dxs.a, true, fnl.a().a(fnm.c, $$3))
         .a(jn.f, $$1, dxs.b, true, fnl.a().a(fnm.c, $$5).a(fnm.b, fnm.a.d))
         .a(jn.d, $$1, dxs.b, true, fnl.a().a(fnm.c, $$5))
         .a(jn.e, $$1, dxs.b, true, fnl.a().a(fnm.c, $$5).a(fnm.b, fnm.a.b))
         .a(jn.c, $$1, dxs.b, true, fnl.a().a(fnm.c, $$5).a(fnm.b, fnm.a.c));
   }

   private static fnf a(djn $$0, akv $$1, akv $$2, akv $$3, akv $$4, akv $$5, akv $$6, akv $$7, akv $$8) {
      return fni.a($$0).a(a(a(fnj.a(dxo.U, dxo.ah, dxo.bh, dxo.z), dxt.b, $$1, $$2, $$3, $$4), dxt.a, $$5, $$6, $$7, $$8));
   }

   static fnf a(djn $$0, akv $$1, akv $$2, akv $$3, akv $$4, akv $$5) {
      return fnh.a($$0)
         .a(fnl.a().a(fnm.c, $$1))
         .a(fng.a().a(dxo.O, true), fnl.a().a(fnm.c, $$2).a(fnm.d, false))
         .a(fng.a().a(dxo.P, true), fnl.a().a(fnm.c, $$3).a(fnm.d, false))
         .a(fng.a().a(dxo.Q, true), fnl.a().a(fnm.c, $$4).a(fnm.d, false))
         .a(fng.a().a(dxo.R, true), fnl.a().a(fnm.c, $$5).a(fnm.d, false));
   }

   static fnf c(djn $$0, akv $$1, akv $$2) {
      return fnh.a($$0)
         .a(fnl.a().a(fnm.c, $$1))
         .a(fng.a().a(dxo.O, true), fnl.a().a(fnm.c, $$2).a(fnm.d, true))
         .a(fng.a().a(dxo.P, true), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b).a(fnm.d, true))
         .a(fng.a().a(dxo.Q, true), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c).a(fnm.d, true))
         .a(fng.a().a(dxo.R, true), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d).a(fnm.d, true));
   }

   static fnf a(djn $$0, akv $$1, akv $$2, akv $$3) {
      return fnh.a($$0)
         .a(fng.a().a(dxo.M, true), fnl.a().a(fnm.c, $$1))
         .a(fng.a().a(dxo.aa, dyj.b), fnl.a().a(fnm.c, $$2).a(fnm.d, true))
         .a(fng.a().a(dxo.Z, dyj.b), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b).a(fnm.d, true))
         .a(fng.a().a(dxo.ab, dyj.b), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c).a(fnm.d, true))
         .a(fng.a().a(dxo.ac, dyj.b), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d).a(fnm.d, true))
         .a(fng.a().a(dxo.aa, dyj.c), fnl.a().a(fnm.c, $$3).a(fnm.d, true))
         .a(fng.a().a(dxo.Z, dyj.c), fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b).a(fnm.d, true))
         .a(fng.a().a(dxo.ab, dyj.c), fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c).a(fnm.d, true))
         .a(fng.a().a(dxo.ac, dyj.c), fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d).a(fnm.d, true));
   }

   static fnf a(djn $$0, akv $$1, akv $$2, akv $$3, akv $$4, boolean $$5) {
      return fni.a($$0, fnl.a().a(fnm.d, $$5))
         .a(c())
         .a(
            fnj.a(dxo.u, dxo.z)
               .a(false, false, fnl.a().a(fnm.c, $$2))
               .a(true, false, fnl.a().a(fnm.c, $$4))
               .a(false, true, fnl.a().a(fnm.c, $$1))
               .a(true, true, fnl.a().a(fnm.c, $$3))
         );
   }

   static fnf b(djn $$0, akv $$1, akv $$2, akv $$3) {
      return fni.a($$0)
         .a(
            fnj.a(dxo.U, dxo.ai, dxo.bl)
               .a(jn.f, dxw.b, dyg.a, fnl.a().a(fnm.c, $$2))
               .a(jn.e, dxw.b, dyg.a, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.d, dxw.b, dyg.a, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.c, dxw.b, dyg.a, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.f, dxw.b, dyg.e, fnl.a().a(fnm.c, $$3))
               .a(jn.e, dxw.b, dyg.e, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.d, dxw.b, dyg.e, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.c, dxw.b, dyg.e, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.f, dxw.b, dyg.d, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.e, dxw.b, dyg.d, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.d, dxw.b, dyg.d, fnl.a().a(fnm.c, $$3))
               .a(jn.c, dxw.b, dyg.d, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.f, dxw.b, dyg.c, fnl.a().a(fnm.c, $$1))
               .a(jn.e, dxw.b, dyg.c, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.d, dxw.b, dyg.c, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.c, dxw.b, dyg.c, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.f, dxw.b, dyg.b, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.e, dxw.b, dyg.b, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.d, dxw.b, dyg.b, fnl.a().a(fnm.c, $$1))
               .a(jn.c, dxw.b, dyg.b, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.f, dxw.a, dyg.a, fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.c).a(fnm.d, true))
               .a(jn.e, dxw.a, dyg.a, fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.d, dxw.a, dyg.a, fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.c, dxw.a, dyg.a, fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.f, dxw.a, dyg.e, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.e, dxw.a, dyg.e, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.d, dxw.a, dyg.e, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.c, dxw.a, dyg.e, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.d, true))
               .a(jn.f, dxw.a, dyg.d, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.d, true))
               .a(jn.e, dxw.a, dyg.d, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.d, dxw.a, dyg.d, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.c, dxw.a, dyg.d, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.f, dxw.a, dyg.c, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.e, dxw.a, dyg.c, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(jn.d, dxw.a, dyg.c, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.c, dxw.a, dyg.c, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.d, true))
               .a(jn.f, dxw.a, dyg.b, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.d, true))
               .a(jn.e, dxw.a, dyg.b, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(jn.d, dxw.a, dyg.b, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(jn.c, dxw.a, dyg.b, fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d).a(fnm.d, true))
         );
   }

   private static fnf c(djn $$0, akv $$1, akv $$2, akv $$3) {
      return fni.a($$0)
         .a(
            fnj.a(dxo.U, dxo.ai, dxo.z)
               .a(jn.c, dxw.b, false, fnl.a().a(fnm.c, $$2))
               .a(jn.d, dxw.b, false, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c))
               .a(jn.f, dxw.b, false, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b))
               .a(jn.e, dxw.b, false, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d))
               .a(jn.c, dxw.a, false, fnl.a().a(fnm.c, $$1))
               .a(jn.d, dxw.a, false, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c))
               .a(jn.f, dxw.a, false, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.b))
               .a(jn.e, dxw.a, false, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.d))
               .a(jn.c, dxw.b, true, fnl.a().a(fnm.c, $$3))
               .a(jn.d, dxw.b, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c))
               .a(jn.f, dxw.b, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
               .a(jn.e, dxw.b, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d))
               .a(jn.c, dxw.a, true, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c))
               .a(jn.d, dxw.a, true, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.a))
               .a(jn.f, dxw.a, true, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d))
               .a(jn.e, dxw.a, true, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b))
         );
   }

   private static fnf d(djn $$0, akv $$1, akv $$2, akv $$3) {
      return fni.a($$0)
         .a(
            fnj.a(dxo.U, dxo.ai, dxo.z)
               .a(jn.c, dxw.b, false, fnl.a().a(fnm.c, $$2))
               .a(jn.d, dxw.b, false, fnl.a().a(fnm.c, $$2))
               .a(jn.f, dxw.b, false, fnl.a().a(fnm.c, $$2))
               .a(jn.e, dxw.b, false, fnl.a().a(fnm.c, $$2))
               .a(jn.c, dxw.a, false, fnl.a().a(fnm.c, $$1))
               .a(jn.d, dxw.a, false, fnl.a().a(fnm.c, $$1))
               .a(jn.f, dxw.a, false, fnl.a().a(fnm.c, $$1))
               .a(jn.e, dxw.a, false, fnl.a().a(fnm.c, $$1))
               .a(jn.c, dxw.b, true, fnl.a().a(fnm.c, $$3))
               .a(jn.d, dxw.b, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c))
               .a(jn.f, dxw.b, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
               .a(jn.e, dxw.b, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d))
               .a(jn.c, dxw.a, true, fnl.a().a(fnm.c, $$3))
               .a(jn.d, dxw.a, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c))
               .a(jn.f, dxw.a, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
               .a(jn.e, dxw.a, true, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d))
         );
   }

   static fni c(djn $$0, akv $$1) {
      return fni.a($$0, fnl.a().a(fnm.c, $$1));
   }

   private static fnj f() {
      return fnj.a(dxo.L).a(jn.a.b, fnl.a()).a(jn.a.c, fnl.a().a(fnm.a, fnm.a.b)).a(jn.a.a, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b));
   }

   static fnf a(djn $$0, fnv $$1, BiConsumer<akv, fnr> $$2) {
      akv $$3 = fnu.g.a($$0, $$1, $$2);
      akv $$4 = fnu.h.a($$0, $$1, $$2);
      akv $$5 = fnu.i.a($$0, $$1, $$2);
      akv $$6 = fnu.j.a($$0, $$1, $$2);
      return fni.a($$0, fnl.a().a(fnm.c, $$6))
         .a(fnj.a(dxo.L).a(jn.a.a, fnl.a().a(fnm.c, $$3)).a(jn.a.b, fnl.a().a(fnm.c, $$4)).a(jn.a.c, fnl.a().a(fnm.c, $$5)));
   }

   static fnf d(djn $$0, akv $$1) {
      return fni.a($$0, fnl.a().a(fnm.c, $$1)).a(f());
   }

   private void e(djn $$0, akv $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(djn $$0, fnx.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(djn $$0, fnx.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      this.b.accept(fni.a($$0, fnl.a().a(fnm.c, $$2)).a(b()));
   }

   static fnf d(djn $$0, akv $$1, akv $$2) {
      return fni.a($$0)
         .a(
            fnj.a(dxo.L)
               .a(jn.a.b, fnl.a().a(fnm.c, $$1))
               .a(jn.a.c, fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.b))
               .a(jn.a.a, fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b))
         );
   }

   private void a(djn $$0, fnx.a $$1, fnx.a $$2) {
      akv $$3 = $$1.create($$0, this.d);
      akv $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(djn $$0) {
      Function<fnx.a, akv> $$1 = $$1x -> $$1x.updateTexture($$1xx -> $$1xx.a(fnw.i, fnv.a($$0, "_active")))
            .updateTexture($$1xx -> $$1xx.a(fnw.d, fnv.a($$0, "_top_active")))
            .createWithSuffix($$0, "_active", this.d);
      akv $$2 = fnx.w.create($$0, this.d);
      akv $$3 = fnx.x.create($$0, this.d);
      akv $$4 = $$1.apply(fnx.w);
      akv $$5 = $$1.apply(fnx.x);
      this.b
         .accept(
            fni.a($$0)
               .a(
                  fnj.a(dxo.L, dli.c)
                     .a(jn.a.b, false, fnl.a().a(fnm.c, $$2))
                     .a(jn.a.c, false, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.b))
                     .a(jn.a.a, false, fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b))
                     .a(jn.a.b, true, fnl.a().a(fnm.c, $$4))
                     .a(jn.a.c, true, fnl.a().a(fnm.c, $$5).a(fnm.a, fnm.a.b))
                     .a(jn.a.a, true, fnl.a().a(fnm.c, $$5).a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b))
               )
         );
   }

   private akv a(djn $$0, String $$1, fnt $$2, Function<akv, fnv> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fnv.a($$0, $$1)), this.d);
   }

   static fnf e(djn $$0, akv $$1, akv $$2) {
      return fni.a($$0).a(a(dxo.B, $$2, $$1));
   }

   static fnf e(djn $$0, akv $$1, akv $$2, akv $$3) {
      return fni.a($$0).a(fnj.a(dxo.bk).a(dyf.b, fnl.a().a(fnm.c, $$1)).a(dyf.a, fnl.a().a(fnm.c, $$2)).a(dyf.c, fnl.a().a(fnm.c, $$3)));
   }

   public void a(djn $$0) {
      this.b($$0, fnx.a);
   }

   public void b(djn $$0, fnx.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(djn $$0, fnx.a $$1, int $$2) {
      akv $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fnq.a($$2));
   }

   private void g() {
      this.J(djp.ft);
      akv $$0 = this.a(cwu.gk, djp.ft);
      this.a(djp.ft, $$0, fnq.a(-12012264));
   }

   private void h(djn $$0) {
      akv $$1 = this.a($$0.j(), $$0);
      this.a($$0, $$1, new fmt());
   }

   private fna.a i(djn $$0) {
      fnx $$1 = this.g.getOrDefault($$0, fnx.a.get($$0));
      return new fna.a($$1.b()).a($$0, $$1.a());
   }

   public void a(djn $$0, djn $$1, djn $$2) {
      akv $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.j());
   }

   void j(djn $$0) {
      fnv $$1 = fnv.w($$0);
      akv $$2 = fnu.v.a($$0, $$1, this.d);
      akv $$3 = fnu.w.a($$0, $$1, this.d);
      akv $$4 = fnu.x.a($$0, $$1, this.d);
      akv $$5 = fnu.y.a($$0, $$1, this.d);
      akv $$6 = fnu.z.a($$0, $$1, this.d);
      akv $$7 = fnu.A.a($$0, $$1, this.d);
      akv $$8 = fnu.B.a($$0, $$1, this.d);
      akv $$9 = fnu.C.a($$0, $$1, this.d);
      this.b($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(djn $$0, djn $$1) {
      akv $$2 = fnu.v.a($$0);
      akv $$3 = fnu.w.a($$0);
      akv $$4 = fnu.x.a($$0);
      akv $$5 = fnu.y.a($$0);
      akv $$6 = fnu.z.a($$0);
      akv $$7 = fnu.A.a($$0);
      akv $$8 = fnu.B.a($$0);
      akv $$9 = fnu.C.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(djn $$0) {
      fnv $$1 = fnv.b($$0);
      akv $$2 = fnu.ak.a($$0, $$1, this.d);
      akv $$3 = fnu.al.a($$0, $$1, this.d);
      akv $$4 = fnu.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(djn $$0) {
      fnv $$1 = fnv.b($$0);
      akv $$2 = fnu.ah.a($$0, $$1, this.d);
      akv $$3 = fnu.ai.a($$0, $$1, this.d);
      akv $$4 = fnu.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(djn $$0, djn $$1) {
      akv $$2 = fnu.ah.a($$0);
      akv $$3 = fnu.ai.a($$0);
      akv $$4 = fnu.aj.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      akv $$0 = fns.a(djp.tf);
      akv $$1 = fns.a(djp.tf, "_partial_tilt");
      akv $$2 = fns.a(djp.tf, "_full_tilt");
      this.b
         .accept(
            fni.a(djp.tf)
               .a(b())
               .a(fnj.a(dxo.bo).a(dyi.a, fnl.a().a(fnm.c, $$0)).a(dyi.b, fnl.a().a(fnm.c, $$0)).a(dyi.c, fnl.a().a(fnm.c, $$1)).a(dyi.d, fnl.a().a(fnm.c, $$2)))
         );
   }

   private fna.e m(djn $$0) {
      return new fna.e(fnv.q($$0));
   }

   private void n(djn $$0) {
      this.d($$0, $$0);
   }

   private void d(djn $$0, djn $$1) {
      this.b.accept(c($$0, fns.a($$1)));
   }

   private void a(djn $$0, fna.d $$1) {
      this.a($$0.j(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(djn $$0, fna.d $$1, fnv $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djn $$0, fna.d $$1) {
      fnv $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djn $$0, fna.d $$1, fnv $$2) {
      akv $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(djn $$0, fna.d $$1, dya<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fnj $$4 = fnj.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fnv $$5 = fnv.c(fnv.a($$0, $$4x));
            akv $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fnl.a().a(fnm.c, $$6);
         });
         this.b($$0.j());
         this.b.accept(fni.a($$0).a($$4));
      }
   }

   private void a(djn $$0, djn $$1, fna.d $$2) {
      this.a($$0.j(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(djn $$0, djn $$1, fna.d $$2) {
      this.b($$0, $$2);
      fnv $$3 = $$2.b($$0);
      akv $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(djn $$0, djn $$1) {
      fnx $$2 = fnx.q.get($$0);
      akv $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      akv $$4 = fnu.aF.a($$1, $$2.b(), this.d);
      this.b.accept(fni.a($$1, fnl.a().a(fnm.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(djn $$0, djn $$1) {
      this.b($$0.j());
      fnv $$2 = fnv.k($$0);
      fnv $$3 = fnv.a($$0, $$1);
      akv $$4 = fnu.aX.a($$1, $$3, this.d);
      this.b
         .accept(
            fni.a($$1, fnl.a().a(fnm.c, $$4))
               .a(fnj.a(dxo.U).a(jn.e, fnl.a()).a(jn.d, fnl.a().a(fnm.b, fnm.a.d)).a(jn.c, fnl.a().a(fnm.b, fnm.a.b)).a(jn.f, fnl.a().a(fnm.b, fnm.a.c)))
         );
      this.b.accept(fni.a($$0).a(fnj.a(dxo.ay).a($$2x -> fnl.a().a(fnm.c, fnu.aW[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      djn $$0 = djp.le;
      this.b($$0.j());
      akv $$1 = fns.a($$0, "_top");
      akv $$2 = fns.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      djn $$0 = djp.ld;
      this.b($$0.j());
      fnj $$1 = fnj.a(dpg.d, dxo.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fnl.a().a(fnm.c, fns.a($$0, "_top_stage_" + $$1x));
            case b -> fnl.a().a(fnm.c, fns.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fni.a($$0).a($$1));
   }

   private void a(djn $$0, djn $$1, djn $$2, djn $$3, djn $$4, djn $$5, djn $$6, djn $$7) {
      this.a($$0, fna.d.b);
      this.a($$1, fna.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(djn $$0, fna.d $$1) {
      akv $$2 = this.a($$0, "_top", $$1.a(), fnv::c);
      akv $$3 = this.a($$0, "_bottom", $$1.a(), fnv::c);
      this.f($$0, $$2, $$3);
   }

   private void d(djn $$0, fna.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(djn $$0) {
      akv $$1 = this.a($$0.j(), $$0, "_top");
      this.a($$0, $$1, new fmt());
      this.c($$0, fna.d.a);
   }

   private void k() {
      this.a(djp.jb, "_front");
      akv $$0 = fns.a(djp.jb, "_top");
      akv $$1 = this.a(djp.jb, "_bottom", fna.d.b.a(), fnv::c);
      this.f(djp.jb, $$0, $$1);
   }

   private void l() {
      akv $$0 = this.a(djp.bE, "_top", fnu.br, fnv::a);
      akv $$1 = this.a(djp.bE, "_bottom", fnu.br, fnv::a);
      this.f(djp.bE, $$0, $$1);
   }

   private void m() {
      akv $$0 = fns.a(djp.th, "_top");
      akv $$1 = fns.a(djp.th, "_bottom");
      this.b.accept(fni.a(djp.th).a(b()).a(fnj.a(dxo.ah).a(dxt.b, fnl.a().a(fnm.c, $$1)).a(dxt.a, fnl.a().a(fnm.c, $$0))));
   }

   private void f(djn $$0, akv $$1, akv $$2) {
      this.b.accept(fni.a($$0).a(fnj.a(dxo.ah).a(dxt.b, fnl.a().a(fnm.c, $$2)).a(dxt.a, fnl.a().a(fnm.c, $$1))));
   }

   private void p(djn $$0) {
      fnv $$1 = fnv.h($$0);
      fnv $$2 = fnv.e(fnv.a($$0, "_corner"));
      akv $$3 = fnu.au.a($$0, $$1, this.d);
      akv $$4 = fnu.av.a($$0, $$2, this.d);
      akv $$5 = fnu.aw.a($$0, $$1, this.d);
      akv $$6 = fnu.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fni.a($$0)
               .a(
                  fnj.a(dxo.aj)
                     .a(dyb.a, fnl.a().a(fnm.c, $$3))
                     .a(dyb.b, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
                     .a(dyb.c, fnl.a().a(fnm.c, $$5).a(fnm.b, fnm.a.b))
                     .a(dyb.d, fnl.a().a(fnm.c, $$6).a(fnm.b, fnm.a.b))
                     .a(dyb.e, fnl.a().a(fnm.c, $$5))
                     .a(dyb.f, fnl.a().a(fnm.c, $$6))
                     .a(dyb.g, fnl.a().a(fnm.c, $$4))
                     .a(dyb.h, fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.b))
                     .a(dyb.i, fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.c))
                     .a(dyb.j, fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.d))
               )
         );
   }

   private void q(djn $$0) {
      akv $$1 = this.a($$0, "", fnu.au, fnv::e);
      akv $$2 = this.a($$0, "", fnu.aw, fnv::e);
      akv $$3 = this.a($$0, "", fnu.ax, fnv::e);
      akv $$4 = this.a($$0, "_on", fnu.au, fnv::e);
      akv $$5 = this.a($$0, "_on", fnu.aw, fnv::e);
      akv $$6 = this.a($$0, "_on", fnu.ax, fnv::e);
      fnj $$7 = fnj.a(dxo.B, dxo.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return fnl.a().a(fnm.c, $$6x ? $$4 : $$1);
            case b:
               return fnl.a().a(fnm.c, $$6x ? $$4 : $$1).a(fnm.b, fnm.a.b);
            case c:
               return fnl.a().a(fnm.c, $$6x ? $$5 : $$2).a(fnm.b, fnm.a.b);
            case d:
               return fnl.a().a(fnm.c, $$6x ? $$6 : $$3).a(fnm.b, fnm.a.b);
            case e:
               return fnl.a().a(fnm.c, $$6x ? $$5 : $$2);
            case f:
               return fnl.a().a(fnm.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fni.a($$0).a($$7));
   }

   private void a(djn $$0, cwm $$1) {
      akv $$2 = fnu.aa.a($$0, fnv.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(djn $$0, akv $$1) {
      akv $$2 = fnu.aa.a($$0, fnv.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private akv g(djn $$0, djn $$1) {
      return fnu.aa.a($$0, fnv.x($$1), this.d);
   }

   public void a(djn $$0, djn $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(djn $$0) {
      this.a($$0, $$0);
   }

   private void h(djn $$0, djn $$1) {
      this.a($$0);
      akv $$2 = fnx.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(djn $$0) {
      this.b($$0.j());
      akv $$1 = fnx.l.create($$0, this.d);
      akv $$2 = fnx.m.create($$0, this.d);
      akv $$3 = fnx.n.create($$0, this.d);
      akv $$4 = fnx.o.create($$0, this.d);
      this.b
         .accept(
            fnh.a($$0)
               .a(fng.a().a(dxo.V, 1, 2, 3, 4).a(dxo.U, jn.c), fnl.a().a(fnm.c, $$1))
               .a(fng.a().a(dxo.V, 1, 2, 3, 4).a(dxo.U, jn.f), fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.V, 1, 2, 3, 4).a(dxo.U, jn.d), fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c))
               .a(fng.a().a(dxo.V, 1, 2, 3, 4).a(dxo.U, jn.e), fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.d))
               .a(fng.a().a(dxo.V, 2, 3, 4).a(dxo.U, jn.c), fnl.a().a(fnm.c, $$2))
               .a(fng.a().a(dxo.V, 2, 3, 4).a(dxo.U, jn.f), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.V, 2, 3, 4).a(dxo.U, jn.d), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c))
               .a(fng.a().a(dxo.V, 2, 3, 4).a(dxo.U, jn.e), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d))
               .a(fng.a().a(dxo.V, 3, 4).a(dxo.U, jn.c), fnl.a().a(fnm.c, $$3))
               .a(fng.a().a(dxo.V, 3, 4).a(dxo.U, jn.f), fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.V, 3, 4).a(dxo.U, jn.d), fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c))
               .a(fng.a().a(dxo.V, 3, 4).a(dxo.U, jn.e), fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d))
               .a(fng.a().a(dxo.V, 4).a(dxo.U, jn.c), fnl.a().a(fnm.c, $$4))
               .a(fng.a().a(dxo.V, 4).a(dxo.U, jn.f), fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.V, 4).a(dxo.U, jn.d), fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.c))
               .a(fng.a().a(dxo.V, 4).a(dxo.U, jn.e), fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.d))
         );
   }

   private void a(fnx.a $$0, djn... $$1) {
      for (djn $$2 : $$1) {
         akv $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fnx.a $$0, djn... $$1) {
      for (djn $$2 : $$1) {
         akv $$3 = $$0.create($$2, this.d);
         this.b.accept(fni.a($$2, fnl.a().a(fnm.c, $$3)).a(c()));
      }
   }

   private void i(djn $$0, djn $$1) {
      this.a($$0);
      fnv $$2 = fnv.b($$0, $$1);
      akv $$3 = fnu.aL.a($$1, $$2, this.d);
      akv $$4 = fnu.aM.a($$1, $$2, this.d);
      akv $$5 = fnu.aN.a($$1, $$2, this.d);
      akv $$6 = fnu.aJ.a($$1, $$2, this.d);
      akv $$7 = fnu.aK.a($$1, $$2, this.d);
      cwm $$8 = $$1.j();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fnh.a($$1)
               .a(fnl.a().a(fnm.c, $$3))
               .a(fng.a().a(dxo.O, true), fnl.a().a(fnm.c, $$4))
               .a(fng.a().a(dxo.P, true), fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.Q, true), fnl.a().a(fnm.c, $$5))
               .a(fng.a().a(dxo.R, true), fnl.a().a(fnm.c, $$5).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.O, false), fnl.a().a(fnm.c, $$6))
               .a(fng.a().a(dxo.P, false), fnl.a().a(fnm.c, $$7))
               .a(fng.a().a(dxo.Q, false), fnl.a().a(fnm.c, $$7).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.R, false), fnl.a().a(fnm.c, $$6).a(fnm.b, fnm.a.d))
         );
   }

   private void t(djn $$0) {
      fnv $$1 = fnv.C($$0);
      akv $$2 = fnu.aO.a($$0, $$1, this.d);
      akv $$3 = this.a($$0, "_conditional", fnu.aO, $$1x -> $$1.c(fnw.i, $$1x));
      this.b.accept(fni.a($$0).a(a(dxo.g, $$3, $$2)).a(e()));
   }

   private void u(djn $$0) {
      akv $$1 = fnx.r.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fnl> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fnl.a().a(fnm.c, fns.a(djp.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fnh.a(djp.nB)
               .a(fng.a().a(dxo.at, 0), this.a(0))
               .a(fng.a().a(dxo.at, 1), this.a(1))
               .a(fng.a().a(dxo.bn, dxk.b), fnl.a().a(fnm.c, fns.a(djp.nB, "_small_leaves")))
               .a(fng.a().a(dxo.bn, dxk.c), fnl.a().a(fnm.c, fns.a(djp.nB, "_large_leaves")))
         );
   }

   private fnj o() {
      return fnj.a(dxo.S)
         .a(jn.a, fnl.a().a(fnm.a, fnm.a.c))
         .a(jn.b, fnl.a())
         .a(jn.c, fnl.a().a(fnm.a, fnm.a.b))
         .a(jn.d, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.c))
         .a(jn.e, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.d))
         .a(jn.f, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b));
   }

   private void p() {
      akv $$0 = fnv.a(djp.ow, "_top_open");
      this.b
         .accept(
            fni.a(djp.ow)
               .a(this.o())
               .a(
                  fnj.a(dxo.z)
                     .a(false, fnl.a().a(fnm.c, fnx.f.create(djp.ow, this.d)))
                     .a(true, fnl.a().a(fnm.c, fnx.f.get(djp.ow).a($$1 -> $$1.a(fnw.f, $$0)).a(djp.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fnj a(dya<T> $$0, T $$1, akv $$2, akv $$3) {
      fnl $$4 = fnl.a().a(fnm.c, $$2);
      fnl $$5 = fnl.a().a(fnm.c, $$3);
      return fnj.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(djn $$0, Function<djn, fnv> $$1) {
      fnv $$2 = $$1.apply($$0).b(fnw.i, fnw.c);
      fnv $$3 = $$2.c(fnw.g, fnv.a($$0, "_front_honey"));
      akv $$4 = fnu.q.a($$0, "_empty", $$2, this.d);
      akv $$5 = fnu.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.j(), fnq.a(djh.c, fnq.a($$4), Map.of(5, fnq.a($$5))));
      this.b.accept(fni.a($$0).a(b()).a(a(djh.c, 5, $$5, $$4)));
   }

   private void a(djn $$0, dya<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<akv> $$3 = new Int2ObjectOpenHashMap();
         fnj $$4 = fnj.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            akv $$5 = (akv)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, fnu.aY, fnv::g));
            return fnl.a().a(fnm.c, $$5);
         });
         this.b($$0.j());
         this.b.accept(fni.a($$0).a($$4));
      }
   }

   private void q() {
      akv $$0 = fns.a(djp.oF, "_floor");
      akv $$1 = fns.a(djp.oF, "_ceiling");
      akv $$2 = fns.a(djp.oF, "_wall");
      akv $$3 = fns.a(djp.oF, "_between_walls");
      this.b(cwu.xs);
      this.b
         .accept(
            fni.a(djp.oF)
               .a(
                  fnj.a(dxo.U, dxo.Y)
                     .a(jn.c, dxm.a, fnl.a().a(fnm.c, $$0))
                     .a(jn.d, dxm.a, fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c))
                     .a(jn.f, dxm.a, fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b))
                     .a(jn.e, dxm.a, fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d))
                     .a(jn.c, dxm.b, fnl.a().a(fnm.c, $$1))
                     .a(jn.d, dxm.b, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c))
                     .a(jn.f, dxm.b, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.b))
                     .a(jn.e, dxm.b, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.d))
                     .a(jn.c, dxm.c, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d))
                     .a(jn.d, dxm.c, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b))
                     .a(jn.f, dxm.c, fnl.a().a(fnm.c, $$2))
                     .a(jn.e, dxm.c, fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c))
                     .a(jn.d, dxm.d, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
                     .a(jn.c, dxm.d, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d))
                     .a(jn.f, dxm.d, fnl.a().a(fnm.c, $$3))
                     .a(jn.e, dxm.d, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fni.a(djp.oB, fnl.a().a(fnm.c, fns.a(djp.oB)))
               .a(
                  fnj.a(dxo.X, dxo.U)
                     .a(dxj.a, jn.c, fnl.a())
                     .a(dxj.a, jn.f, fnl.a().a(fnm.b, fnm.a.b))
                     .a(dxj.a, jn.d, fnl.a().a(fnm.b, fnm.a.c))
                     .a(dxj.a, jn.e, fnl.a().a(fnm.b, fnm.a.d))
                     .a(dxj.b, jn.c, fnl.a().a(fnm.a, fnm.a.b))
                     .a(dxj.b, jn.f, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b))
                     .a(dxj.b, jn.d, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.c))
                     .a(dxj.b, jn.e, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.d))
                     .a(dxj.c, jn.d, fnl.a().a(fnm.a, fnm.a.c))
                     .a(dxj.c, jn.e, fnl.a().a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b))
                     .a(dxj.c, jn.c, fnl.a().a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c))
                     .a(dxj.c, jn.f, fnl.a().a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d))
               )
         );
   }

   private void d(djn $$0, fnx.a $$1) {
      akv $$2 = $$1.create($$0, this.d);
      akv $$3 = fnv.a($$0, "_front_on");
      akv $$4 = $$1.get($$0).a($$1x -> $$1x.a(fnw.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fni.a($$0).a(a(dxo.v, $$4, $$2)).a(b()));
   }

   private void a(djn... $$0) {
      akv $$1 = fns.a("campfire_off");

      for (djn $$2 : $$0) {
         akv $$3 = fnu.bf.a($$2, fnv.H($$2), this.d);
         this.b($$2.j());
         this.b.accept(fni.a($$2).a(a(dxo.v, $$3, $$1)).a(c()));
      }
   }

   private void v(djn $$0) {
      akv $$1 = fnu.bA.a($$0, fnv.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void w(djn $$0) {
      akv $$1;
      if ($$0 == djp.tL) {
         $$1 = fnu.bC.a($$0, fnv.p($$0), this.d);
      } else {
         $$1 = fnu.bB.a($$0, fnv.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fnv $$0 = fnv.a(fnv.J(djp.cs), fnv.J(djp.n));
      akv $$1 = fnu.j.a(djp.cs, $$0, this.d);
      this.b.accept(c(djp.cs, $$1));
   }

   private void t() {
      this.b(cwu.me);
      this.b
         .accept(
            fnh.a(djp.cE)
               .a(
                  fng.b(
                     fng.a().a(dxo.ae, dyc.c).a(dxo.ad, dyc.c).a(dxo.af, dyc.c).a(dxo.ag, dyc.c),
                     fng.a().a(dxo.ae, dyc.b, dyc.a).a(dxo.ad, dyc.b, dyc.a),
                     fng.a().a(dxo.ad, dyc.b, dyc.a).a(dxo.af, dyc.b, dyc.a),
                     fng.a().a(dxo.af, dyc.b, dyc.a).a(dxo.ag, dyc.b, dyc.a),
                     fng.a().a(dxo.ag, dyc.b, dyc.a).a(dxo.ae, dyc.b, dyc.a)
                  ),
                  fnl.a().a(fnm.c, fns.a("redstone_dust_dot"))
               )
               .a(fng.a().a(dxo.ae, dyc.b, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_side0")))
               .a(fng.a().a(dxo.af, dyc.b, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_side_alt0")))
               .a(fng.a().a(dxo.ad, dyc.b, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_side_alt1")).a(fnm.b, fnm.a.d))
               .a(fng.a().a(dxo.ag, dyc.b, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_side1")).a(fnm.b, fnm.a.d))
               .a(fng.a().a(dxo.ae, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_up")))
               .a(fng.a().a(dxo.ad, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_up")).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.af, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_up")).a(fnm.b, fnm.a.c))
               .a(fng.a().a(dxo.ag, dyc.a), fnl.a().a(fnm.c, fns.a("redstone_dust_up")).a(fnm.b, fnm.a.d))
         );
   }

   private void u() {
      this.b(cwu.mi);
      this.b
         .accept(
            fni.a(djp.hv)
               .a(c())
               .a(
                  fnj.a(dxo.bg, dxo.B)
                     .a(dxr.a, false, fnl.a().a(fnm.c, fns.a(djp.hv)))
                     .a(dxr.a, true, fnl.a().a(fnm.c, fns.a(djp.hv, "_on")))
                     .a(dxr.b, false, fnl.a().a(fnm.c, fns.a(djp.hv, "_subtract")))
                     .a(dxr.b, true, fnl.a().a(fnm.c, fns.a(djp.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fnv $$0 = fnv.a(djp.kq);
      fnv $$1 = fnv.a(fnv.a(djp.kd, "_side"), $$0.a(fnw.f));
      akv $$2 = fnu.ab.a(djp.kd, $$1, this.d);
      akv $$3 = fnu.ac.a(djp.kd, $$1, this.d);
      akv $$4 = fnu.j.b(djp.kd, "_double", $$1, this.d);
      this.b.accept(e(djp.kd, $$2, $$3, $$4));
      this.b.accept(c(djp.kq, fnu.c.a(djp.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cwu.tn);
      this.b
         .accept(
            fnh.a(djp.fN)
               .a(fnl.a().a(fnm.c, fnv.J(djp.fN)))
               .a(fng.a().a(dxo.o, true), fnl.a().a(fnm.c, fnv.a(djp.fN, "_bottle0")))
               .a(fng.a().a(dxo.p, true), fnl.a().a(fnm.c, fnv.a(djp.fN, "_bottle1")))
               .a(fng.a().a(dxo.q, true), fnl.a().a(fnm.c, fnv.a(djp.fN, "_bottle2")))
               .a(fng.a().a(dxo.o, false), fnl.a().a(fnm.c, fnv.a(djp.fN, "_empty0")))
               .a(fng.a().a(dxo.p, false), fnl.a().a(fnm.c, fnv.a(djp.fN, "_empty1")))
               .a(fng.a().a(dxo.q, false), fnl.a().a(fnm.c, fnv.a(djp.fN, "_empty2")))
         );
   }

   private void x(djn $$0) {
      akv $$1 = fnu.bw.a($$0, fnv.b($$0), this.d);
      akv $$2 = fns.a("mushroom_block_inside");
      this.b
         .accept(
            fnh.a($$0)
               .a(fng.a().a(dxo.O, true), fnl.a().a(fnm.c, $$1))
               .a(fng.a().a(dxo.P, true), fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(fng.a().a(dxo.Q, true), fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(fng.a().a(dxo.R, true), fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(fng.a().a(dxo.M, true), fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.d).a(fnm.d, true))
               .a(fng.a().a(dxo.N, true), fnl.a().a(fnm.c, $$1).a(fnm.a, fnm.a.b).a(fnm.d, true))
               .a(fng.a().a(dxo.O, false), fnl.a().a(fnm.c, $$2))
               .a(fng.a().a(dxo.P, false), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b).a(fnm.d, false))
               .a(fng.a().a(dxo.Q, false), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c).a(fnm.d, false))
               .a(fng.a().a(dxo.R, false), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d).a(fnm.d, false))
               .a(fng.a().a(dxo.M, false), fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.d).a(fnm.d, false))
               .a(fng.a().a(dxo.N, false), fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.b).a(fnm.d, false))
         );
      this.a($$0, fnx.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cwu.sy);
      this.b
         .accept(
            fni.a(djp.et)
               .a(
                  fnj.a(dxo.aB)
                     .a(0, fnl.a().a(fnm.c, fns.a(djp.et)))
                     .a(1, fnl.a().a(fnm.c, fns.a(djp.et, "_slice1")))
                     .a(2, fnl.a().a(fnm.c, fns.a(djp.et, "_slice2")))
                     .a(3, fnl.a().a(fnm.c, fns.a(djp.et, "_slice3")))
                     .a(4, fnl.a().a(fnm.c, fns.a(djp.et, "_slice4")))
                     .a(5, fnl.a().a(fnm.c, fns.a(djp.et, "_slice5")))
                     .a(6, fnl.a().a(fnm.c, fns.a(djp.et, "_slice6")))
               )
         );
   }

   private void y() {
      fnv $$0 = new fnv()
         .a(fnw.c, fnv.a(djp.oz, "_side3"))
         .a(fnw.o, fnv.J(djp.t))
         .a(fnw.n, fnv.a(djp.oz, "_top"))
         .a(fnw.j, fnv.a(djp.oz, "_side3"))
         .a(fnw.l, fnv.a(djp.oz, "_side3"))
         .a(fnw.k, fnv.a(djp.oz, "_side1"))
         .a(fnw.m, fnv.a(djp.oz, "_side2"));
      this.b.accept(c(djp.oz, fnu.a.a(djp.oz, $$0, this.d)));
   }

   private void z() {
      fnv $$0 = new fnv()
         .a(fnw.c, fnv.a(djp.oD, "_front"))
         .a(fnw.o, fnv.a(djp.oD, "_bottom"))
         .a(fnw.n, fnv.a(djp.oD, "_top"))
         .a(fnw.j, fnv.a(djp.oD, "_front"))
         .a(fnw.k, fnv.a(djp.oD, "_front"))
         .a(fnw.l, fnv.a(djp.oD, "_side"))
         .a(fnw.m, fnv.a(djp.oD, "_side"));
      this.b.accept(c(djp.oD, fnu.a.a(djp.oD, $$0, this.d)));
   }

   private void a(djn $$0, djn $$1, BiFunction<djn, djn, fnv> $$2) {
      fnv $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, fnu.a.a($$0, $$3, this.d)));
   }

   public void b(djn $$0) {
      fnv $$1 = new fnv()
         .a(fnw.c, fnv.a($$0, "_particle"))
         .a(fnw.o, fnv.a($$0, "_down"))
         .a(fnw.n, fnv.a($$0, "_up"))
         .a(fnw.j, fnv.a($$0, "_north"))
         .a(fnw.k, fnv.a($$0, "_south"))
         .a(fnw.l, fnv.a($$0, "_east"))
         .a(fnw.m, fnv.a($$0, "_west"));
      this.b.accept(c($$0, fnu.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fnv $$0 = fnv.n(djp.fn);
      this.b.accept(c(djp.fn, fns.a(djp.fn)));
      this.a(djp.er, $$0);
      this.a(djp.es, $$0);
   }

   private void a(djn $$0, fnv $$1) {
      akv $$2 = fnu.p.a($$0, $$1.c(fnw.g, fnv.J($$0)), this.d);
      this.b.accept(fni.a($$0, fnl.a().a(fnm.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cwu.to);
      this.n(djp.fO);
      this.b.accept(c(djp.fQ, fnu.bz.a(djp.fQ, fnv.j(fnv.a(djp.K, "_still")), this.d)));
      this.b
         .accept(
            fni.a(djp.fP)
               .a(
                  fnj.a(dny.g)
                     .a(1, fnl.a().a(fnm.c, fnu.bx.a(djp.fP, "_level1", fnv.j(fnv.a(djp.J, "_still")), this.d)))
                     .a(2, fnl.a().a(fnm.c, fnu.by.a(djp.fP, "_level2", fnv.j(fnv.a(djp.J, "_still")), this.d)))
                     .a(3, fnl.a().a(fnm.c, fnu.bz.a(djp.fP, "_full", fnv.j(fnv.a(djp.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fni.a(djp.fR)
               .a(
                  fnj.a(dny.g)
                     .a(1, fnl.a().a(fnm.c, fnu.bx.a(djp.fR, "_level1", fnv.j(fnv.J(djp.rr)), this.d)))
                     .a(2, fnl.a().a(fnm.c, fnu.by.a(djp.fR, "_level2", fnv.j(fnv.J(djp.rr)), this.d)))
                     .a(3, fnl.a().a(fnm.c, fnu.bz.a(djp.fR, "_full", fnv.j(fnv.J(djp.rr)), this.d)))
               )
         );
   }

   private void C() {
      fnv $$0 = fnv.b(djp.kX);
      akv $$1 = fnu.aH.a(djp.kX, $$0, this.d);
      akv $$2 = this.a(djp.kX, "_dead", fnu.aH, $$1x -> $$0.c(fnw.b, $$1x));
      this.b.accept(fni.a(djp.kX).a(a(dxo.ax, 5, $$2, $$1)));
   }

   private void D() {
      akv $$0 = fns.a(djp.tS);
      akv $$1 = fns.a(djp.tS, "_triggered");
      akv $$2 = fns.a(djp.tS, "_crafting");
      akv $$3 = fns.a(djp.tS, "_crafting_triggered");
      this.b
         .accept(
            fni.a(djp.tS)
               .a(fnj.a(dxo.W).a($$0x -> this.a($$0x, fnl.a())))
               .a(
                  fnj.a(dxo.H, dlg.b)
                     .a(false, false, fnl.a().a(fnm.c, $$0))
                     .a(true, true, fnl.a().a(fnm.c, $$3))
                     .a(true, false, fnl.a().a(fnm.c, $$1))
                     .a(false, true, fnl.a().a(fnm.c, $$2))
               )
         );
   }

   private void y(djn $$0) {
      fnv $$1 = new fnv().a(fnw.f, fnv.a(djp.cL, "_top")).a(fnw.i, fnv.a(djp.cL, "_side")).a(fnw.g, fnv.a($$0, "_front"));
      fnv $$2 = new fnv().a(fnw.i, fnv.a(djp.cL, "_top")).a(fnw.g, fnv.a($$0, "_front_vertical"));
      akv $$3 = fnu.p.a($$0, $$1, this.d);
      akv $$4 = fnu.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fni.a($$0)
               .a(
                  fnj.a(dxo.S)
                     .a(jn.a, fnl.a().a(fnm.c, $$4).a(fnm.a, fnm.a.c))
                     .a(jn.b, fnl.a().a(fnm.c, $$4))
                     .a(jn.c, fnl.a().a(fnm.c, $$3))
                     .a(jn.f, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
                     .a(jn.d, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c))
                     .a(jn.e, fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d))
               )
         );
   }

   private void E() {
      akv $$0 = fns.a(djp.fT);
      akv $$1 = fns.a(djp.fT, "_filled");
      this.b.accept(fni.a(djp.fT).a(fnj.a(dxo.l).a(false, fnl.a().a(fnm.c, $$0)).a(true, fnl.a().a(fnm.c, $$1))).a(c()));
   }

   private void F() {
      akv $$0 = fns.a(djp.kW, "_side");
      akv $$1 = fns.a(djp.kW, "_noside");
      akv $$2 = fns.a(djp.kW, "_noside1");
      akv $$3 = fns.a(djp.kW, "_noside2");
      akv $$4 = fns.a(djp.kW, "_noside3");
      this.b
         .accept(
            fnh.a(djp.kW)
               .a(fng.a().a(dxo.O, true), fnl.a().a(fnm.c, $$0))
               .a(fng.a().a(dxo.P, true), fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b).a(fnm.d, true))
               .a(fng.a().a(dxo.Q, true), fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c).a(fnm.d, true))
               .a(fng.a().a(dxo.R, true), fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d).a(fnm.d, true))
               .a(fng.a().a(dxo.M, true), fnl.a().a(fnm.c, $$0).a(fnm.a, fnm.a.d).a(fnm.d, true))
               .a(fng.a().a(dxo.N, true), fnl.a().a(fnm.c, $$0).a(fnm.a, fnm.a.b).a(fnm.d, true))
               .a(fng.a().a(dxo.O, false), fnl.a().a(fnm.c, $$1).a(fnm.e, 2), fnl.a().a(fnm.c, $$2), fnl.a().a(fnm.c, $$3), fnl.a().a(fnm.c, $$4))
               .a(
                  fng.a().a(dxo.P, false),
                  fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.b).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$1).a(fnm.e, 2).a(fnm.b, fnm.a.b).a(fnm.d, true)
               )
               .a(
                  fng.a().a(dxo.Q, false),
                  fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.c).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.c).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$1).a(fnm.e, 2).a(fnm.b, fnm.a.c).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.c).a(fnm.d, true)
               )
               .a(
                  fng.a().a(dxo.R, false),
                  fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.d).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$1).a(fnm.e, 2).a(fnm.b, fnm.a.d).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.d).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.d).a(fnm.d, true)
               )
               .a(
                  fng.a().a(dxo.M, false),
                  fnl.a().a(fnm.c, $$1).a(fnm.e, 2).a(fnm.a, fnm.a.d).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$4).a(fnm.a, fnm.a.d).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.d).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.d).a(fnm.d, true)
               )
               .a(
                  fng.a().a(dxo.N, false),
                  fnl.a().a(fnm.c, $$4).a(fnm.a, fnm.a.b).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$3).a(fnm.a, fnm.a.b).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$2).a(fnm.a, fnm.a.b).a(fnm.d, true),
                  fnl.a().a(fnm.c, $$1).a(fnm.e, 2).a(fnm.a, fnm.a.b).a(fnm.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fnh.a(djp.pE)
               .a(fnl.a().a(fnm.c, fnv.J(djp.pE)))
               .a(fng.a().a(dxo.aO, 1), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents1")))
               .a(fng.a().a(dxo.aO, 2), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents2")))
               .a(fng.a().a(dxo.aO, 3), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents3")))
               .a(fng.a().a(dxo.aO, 4), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents4")))
               .a(fng.a().a(dxo.aO, 5), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents5")))
               .a(fng.a().a(dxo.aO, 6), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents6")))
               .a(fng.a().a(dxo.aO, 7), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents7")))
               .a(fng.a().a(dxo.aO, 8), fnl.a().a(fnm.c, fnv.a(djp.pE, "_contents_ready")))
         );
   }

   private void z(djn $$0) {
      akv $$1 = fnu.c.a($$0, fnv.a($$0), this.d);
      akv $$2 = this.a($$0, "_powered", fnu.c, fnv::b);
      akv $$3 = this.a($$0, "_lit", fnu.c, fnv::b);
      akv $$4 = this.a($$0, "_lit_powered", fnu.c, fnv::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fnf a(djn $$0, akv $$1, akv $$2, akv $$3, akv $$4) {
      return fni.a($$0).a(fnj.a(dxo.v, dxo.B).a(($$4x, $$5) -> $$4x ? fnl.a().a(fnm.c, $$5 ? $$4 : $$2) : fnl.a().a(fnm.c, $$5 ? $$3 : $$1)));
   }

   private void j(djn $$0, djn $$1) {
      akv $$2 = fns.a($$0);
      akv $$3 = fns.a($$0, "_powered");
      akv $$4 = fns.a($$0, "_lit");
      akv $$5 = fns.a($$0, "_lit_powered");
      this.c.a($$0.j(), $$1.j());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void A(djn $$0) {
      this.b.accept(fni.a($$0, fnl.a().a(fnm.c, fnu.ao.a($$0, fnv.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.A(djp.ra);
      this.A(djp.qZ);
      this.A(djp.qY);
      this.A(djp.qX);
   }

   private void I() {
      fnj.b<jn, dxu> $$0 = fnj.a(dxo.bp, dxo.bq);

      for (dxu $$1 : dxu.values()) {
         $$0.a(jn.b, $$1, this.a(jn.b, $$1));
      }

      for (dxu $$2 : dxu.values()) {
         $$0.a(jn.a, $$2, this.a(jn.a, $$2));
      }

      this.b.accept(fni.a(djp.sV).a($$0));
   }

   private fnl a(jn $$0, dxu $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fnv $$3 = fnv.c(fnv.a(djp.sV, $$2));
      return fnl.a().a(fnm.c, fnu.an.a(djp.sV, $$2, $$3, this.d));
   }

   private void B(djn $$0) {
      fnv $$1 = new fnv().a(fnw.e, fnv.J(djp.ei)).a(fnw.f, fnv.J($$0)).a(fnw.i, fnv.a($$0, "_side"));
      this.b.accept(c($$0, fnu.n.a($$0, $$1, this.d)));
   }

   private void J() {
      akv $$0 = fnv.a(djp.hw, "_side");
      fnv $$1 = new fnv().a(fnw.f, fnv.a(djp.hw, "_top")).a(fnw.i, $$0);
      fnv $$2 = new fnv().a(fnw.f, fnv.a(djp.hw, "_inverted_top")).a(fnw.i, $$0);
      this.b
         .accept(
            fni.a(djp.hw)
               .a(
                  fnj.a(dxo.t)
                     .a(false, fnl.a().a(fnm.c, fnu.aI.a(djp.hw, $$1, this.d)))
                     .a(true, fnl.a().a(fnm.c, fnu.aI.a(fns.a(djp.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void C(djn $$0) {
      this.b.accept(fni.a($$0, fnl.a().a(fnm.c, fns.a($$0))).a(this.o()));
   }

   private void K() {
      djn $$0 = djp.sU;
      akv $$1 = fns.a($$0, "_on");
      akv $$2 = fns.a($$0);
      this.b.accept(fni.a($$0, fnl.a().a(fnm.c, fns.a($$0))).a(this.o()).a(a(dxo.B, $$1, $$2)));
   }

   private void L() {
      fnv $$0 = new fnv().a(fnw.C, fnv.J(djp.j)).a(fnw.f, fnv.J(djp.cK));
      fnv $$1 = new fnv().a(fnw.C, fnv.J(djp.j)).a(fnw.f, fnv.a(djp.cK, "_moist"));
      akv $$2 = fnu.aZ.a(djp.cK, $$0, this.d);
      akv $$3 = fnu.aZ.a(fnv.a(djp.cK, "_moist"), $$1, this.d);
      this.b.accept(fni.a(djp.cK).a(a(dxo.aT, 7, $$3, $$2)));
   }

   private List<akv> D(djn $$0) {
      akv $$1 = fnu.ba.a(fns.a($$0, "_floor0"), fnv.y($$0), this.d);
      akv $$2 = fnu.ba.a(fns.a($$0, "_floor1"), fnv.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<akv> E(djn $$0) {
      akv $$1 = fnu.bb.a(fns.a($$0, "_side0"), fnv.y($$0), this.d);
      akv $$2 = fnu.bb.a(fns.a($$0, "_side1"), fnv.z($$0), this.d);
      akv $$3 = fnu.bc.a(fns.a($$0, "_side_alt0"), fnv.y($$0), this.d);
      akv $$4 = fnu.bc.a(fns.a($$0, "_side_alt1"), fnv.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<akv> F(djn $$0) {
      akv $$1 = fnu.bd.a(fns.a($$0, "_up0"), fnv.y($$0), this.d);
      akv $$2 = fnu.bd.a(fns.a($$0, "_up1"), fnv.z($$0), this.d);
      akv $$3 = fnu.be.a(fns.a($$0, "_up_alt0"), fnv.y($$0), this.d);
      akv $$4 = fnu.be.a(fns.a($$0, "_up_alt1"), fnv.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fnl> a(List<akv> $$0, UnaryOperator<fnl> $$1) {
      return $$0.stream().map($$0x -> fnl.a().a(fnm.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fng $$0 = fng.a().a(dxo.O, false).a(dxo.P, false).a(dxo.Q, false).a(dxo.R, false).a(dxo.M, false);
      List<akv> $$1 = this.D(djp.cy);
      List<akv> $$2 = this.E(djp.cy);
      List<akv> $$3 = this.F(djp.cy);
      this.b
         .accept(
            fnh.a(djp.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fng.b(fng.a().a(dxo.O, true), $$0), a($$2, $$0x -> $$0x))
               .a(fng.b(fng.a().a(dxo.P, true), $$0), a($$2, $$0x -> $$0x.a(fnm.b, fnm.a.b)))
               .a(fng.b(fng.a().a(dxo.Q, true), $$0), a($$2, $$0x -> $$0x.a(fnm.b, fnm.a.c)))
               .a(fng.b(fng.a().a(dxo.R, true), $$0), a($$2, $$0x -> $$0x.a(fnm.b, fnm.a.d)))
               .a(fng.a().a(dxo.M, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<akv> $$0 = this.D(djp.cz);
      List<akv> $$1 = this.E(djp.cz);
      this.b
         .accept(
            fnh.a(djp.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fnm.b, fnm.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fnm.b, fnm.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fnm.b, fnm.a.d)))
         );
   }

   private void G(djn $$0) {
      akv $$1 = fnx.t.create($$0, this.d);
      akv $$2 = fnx.u.create($$0, this.d);
      this.b($$0.j());
      this.b.accept(fni.a($$0).a(a(dxo.n, $$2, $$1)));
   }

   private void O() {
      fnv $$0 = fnv.a(fnv.a(djp.ah, "_side"), fnv.a(djp.ah, "_top"));
      akv $$1 = fnu.j.a(djp.ah, $$0, this.d);
      this.b.accept(d(djp.ah, $$1));
   }

   private void P() {
      this.b(cwu.af);
      djn $$0 = djp.H;
      fnj.b<Boolean, Integer> $$1 = fnj.a(dok.d, dok.b);
      akv $$2 = fns.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         akv $$4 = fns.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fnl.a().a(fnm.c, $$4));
         $$1.a(false, $$3, fnl.a().a(fnm.c, $$2));
      }

      this.b.accept(fni.a(djp.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fni.a(djp.lk)
               .a(
                  fnj.a(dxo.av)
                     .a(0, fnl.a().a(fnm.c, this.a(djp.lk, "_0", fnu.c, fnv::b)))
                     .a(1, fnl.a().a(fnm.c, this.a(djp.lk, "_1", fnu.c, fnv::b)))
                     .a(2, fnl.a().a(fnm.c, this.a(djp.lk, "_2", fnu.c, fnv::b)))
                     .a(3, fnl.a().a(fnm.c, this.a(djp.lk, "_3", fnu.c, fnv::b)))
               )
         );
   }

   private void R() {
      akv $$0 = fnv.J(djp.j);
      fnv $$1 = new fnv().a(fnw.e, $$0).b(fnw.e, fnw.c).a(fnw.f, fnv.a(djp.i, "_top")).a(fnw.i, fnv.a(djp.i, "_snow"));
      fnl $$2 = fnl.a().a(fnm.c, fnu.n.a(djp.i, "_snow", $$1, this.d));
      this.a(djp.i, fns.a(djp.i), $$2);
      this.a(djp.i, fns.a(djp.i), new fmt());
      akv $$3 = fnx.f.get(djp.fA).a($$1x -> $$1x.a(fnw.e, $$0)).a(djp.fA, this.d);
      this.a(djp.fA, $$3, $$2);
      akv $$4 = fnx.f.get(djp.l).a($$1x -> $$1x.a(fnw.e, $$0)).a(djp.l, this.d);
      this.a(djp.l, $$4, $$2);
   }

   private void a(djn $$0, akv $$1, fnl $$2) {
      List<fnl> $$3 = Arrays.asList(a($$1));
      this.b.accept(fni.a($$0).a(fnj.a(dxo.F).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cwu.se);
      this.b
         .accept(
            fni.a(djp.fX)
               .a(
                  fnj.a(dxo.au)
                     .a(0, fnl.a().a(fnm.c, fns.a(djp.fX, "_stage0")))
                     .a(1, fnl.a().a(fnm.c, fns.a(djp.fX, "_stage1")))
                     .a(2, fnl.a().a(fnm.c, fns.a(djp.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(djp.lg, fns.a(djp.lg)));
   }

   private void k(djn $$0, djn $$1) {
      fnv $$2 = fnv.b($$1);
      akv $$3 = fnu.Y.a($$0, $$2, this.d);
      akv $$4 = fnu.Z.a($$0, $$2, this.d);
      this.b.accept(fni.a($$0).a(a(dxo.aW, 1, $$4, $$3)));
   }

   private void U() {
      akv $$0 = fns.a(djp.hz);
      akv $$1 = fns.a(djp.hz, "_side");
      this.b(cwu.mo);
      this.b
         .accept(
            fni.a(djp.hz)
               .a(
                  fnj.a(dxo.T)
                     .a(jn.a, fnl.a().a(fnm.c, $$0))
                     .a(jn.c, fnl.a().a(fnm.c, $$1))
                     .a(jn.f, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.b))
                     .a(jn.d, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.c))
                     .a(jn.e, fnl.a().a(fnm.c, $$1).a(fnm.b, fnm.a.d))
               )
         );
   }

   private void l(djn $$0, djn $$1) {
      akv $$2 = fns.a($$0);
      this.b.accept(fni.a($$1, fnl.a().a(fnm.c, $$2)));
      this.c.a($$0.j(), $$1.j());
   }

   private void V() {
      akv $$0 = fns.a(djp.fk, "_post_ends");
      akv $$1 = fns.a(djp.fk, "_post");
      akv $$2 = fns.a(djp.fk, "_cap");
      akv $$3 = fns.a(djp.fk, "_cap_alt");
      akv $$4 = fns.a(djp.fk, "_side");
      akv $$5 = fns.a(djp.fk, "_side_alt");
      this.b
         .accept(
            fnh.a(djp.fk)
               .a(fnl.a().a(fnm.c, $$0))
               .a(fng.a().a(dxo.O, false).a(dxo.P, false).a(dxo.Q, false).a(dxo.R, false), fnl.a().a(fnm.c, $$1))
               .a(fng.a().a(dxo.O, true).a(dxo.P, false).a(dxo.Q, false).a(dxo.R, false), fnl.a().a(fnm.c, $$2))
               .a(fng.a().a(dxo.O, false).a(dxo.P, true).a(dxo.Q, false).a(dxo.R, false), fnl.a().a(fnm.c, $$2).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.O, false).a(dxo.P, false).a(dxo.Q, true).a(dxo.R, false), fnl.a().a(fnm.c, $$3))
               .a(fng.a().a(dxo.O, false).a(dxo.P, false).a(dxo.Q, false).a(dxo.R, true), fnl.a().a(fnm.c, $$3).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.O, true), fnl.a().a(fnm.c, $$4))
               .a(fng.a().a(dxo.P, true), fnl.a().a(fnm.c, $$4).a(fnm.b, fnm.a.b))
               .a(fng.a().a(dxo.Q, true), fnl.a().a(fnm.c, $$5))
               .a(fng.a().a(dxo.R, true), fnl.a().a(fnm.c, $$5).a(fnm.b, fnm.a.b))
         );
      this.c(djp.fk);
   }

   private void H(djn $$0) {
      this.b.accept(fni.a($$0, fnl.a().a(fnm.c, fns.a($$0))).a(b()));
   }

   private void W() {
      akv $$0 = fns.a(djp.dI);
      akv $$1 = fns.a(djp.dI, "_on");
      this.c(djp.dI);
      this.b
         .accept(
            fni.a(djp.dI)
               .a(a(dxo.B, $$0, $$1))
               .a(
                  fnj.a(dxo.X, dxo.U)
                     .a(dxj.c, jn.c, fnl.a().a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.c))
                     .a(dxj.c, jn.f, fnl.a().a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.d))
                     .a(dxj.c, jn.d, fnl.a().a(fnm.a, fnm.a.c))
                     .a(dxj.c, jn.e, fnl.a().a(fnm.a, fnm.a.c).a(fnm.b, fnm.a.b))
                     .a(dxj.a, jn.c, fnl.a())
                     .a(dxj.a, jn.f, fnl.a().a(fnm.b, fnm.a.b))
                     .a(dxj.a, jn.d, fnl.a().a(fnm.b, fnm.a.c))
                     .a(dxj.a, jn.e, fnl.a().a(fnm.b, fnm.a.d))
                     .a(dxj.b, jn.c, fnl.a().a(fnm.a, fnm.a.b))
                     .a(dxj.b, jn.f, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b))
                     .a(dxj.b, jn.d, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.c))
                     .a(dxj.b, jn.e, fnl.a().a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.d))
               )
         );
   }

   private void X() {
      akv $$0 = this.a(cwu.gx, djp.fB);
      this.a(djp.fB, $$0, fnq.a(-9321636));
      this.b.accept(b(djp.fB, fns.a(djp.fB)));
   }

   private void Y() {
      this.c(djp.tP);
      this.b.accept(c(djp.tP, fns.a(djp.tP)));
   }

   private void Z() {
      this.b.accept(fni.a(djp.eq).a(fnj.a(dxo.K).a(jn.a.a, fnl.a().a(fnm.c, fns.a(djp.eq, "_ns"))).a(jn.a.c, fnl.a().a(fnm.c, fns.a(djp.eq, "_ew")))));
   }

   private void aa() {
      akv $$0 = fnx.a.create(djp.ei, this.d);
      this.b
         .accept(
            fni.a(
               djp.ei,
               fnl.a().a(fnm.c, $$0),
               fnl.a().a(fnm.c, $$0).a(fnm.a, fnm.a.b),
               fnl.a().a(fnm.c, $$0).a(fnm.a, fnm.a.c),
               fnl.a().a(fnm.c, $$0).a(fnm.a, fnm.a.d),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b).a(fnm.a, fnm.a.b),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b).a(fnm.a, fnm.a.c),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.b).a(fnm.a, fnm.a.d),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c).a(fnm.a, fnm.a.b),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c).a(fnm.a, fnm.a.c),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.c).a(fnm.a, fnm.a.d),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d).a(fnm.a, fnm.a.b),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d).a(fnm.a, fnm.a.c),
               fnl.a().a(fnm.c, $$0).a(fnm.b, fnm.a.d).a(fnm.a, fnm.a.d)
            )
         );
   }

   private void ab() {
      akv $$0 = fns.a(djp.lq);
      akv $$1 = fns.a(djp.lq, "_on");
      this.b.accept(fni.a(djp.lq).a(a(dxo.B, $$1, $$0)).a(e()));
   }

   private void ac() {
      fnv $$0 = new fnv().a(fnw.e, fnv.a(djp.bF, "_bottom")).a(fnw.i, fnv.a(djp.bF, "_side"));
      akv $$1 = fnv.a(djp.bF, "_top_sticky");
      akv $$2 = fnv.a(djp.bF, "_top");
      fnv $$3 = $$0.c(fnw.F, $$1);
      fnv $$4 = $$0.c(fnw.F, $$2);
      akv $$5 = fns.a(djp.bF, "_base");
      this.a(djp.bF, $$5, $$4);
      this.a(djp.by, $$5, $$3);
      akv $$6 = fnu.n.a(djp.bF, "_inventory", $$0.c(fnw.f, $$2), this.d);
      akv $$7 = fnu.n.a(djp.by, "_inventory", $$0.c(fnw.f, $$1), this.d);
      this.a(djp.bF, $$6);
      this.a(djp.by, $$7);
   }

   private void a(djn $$0, akv $$1, fnv $$2) {
      akv $$3 = fnu.bo.a($$0, $$2, this.d);
      this.b.accept(fni.a($$0).a(a(dxo.k, $$1, $$3)).a(e()));
   }

   private void ad() {
      fnv $$0 = new fnv().a(fnw.G, fnv.a(djp.bF, "_top")).a(fnw.i, fnv.a(djp.bF, "_side"));
      fnv $$1 = $$0.c(fnw.F, fnv.a(djp.bF, "_top_sticky"));
      fnv $$2 = $$0.c(fnw.F, fnv.a(djp.bF, "_top"));
      this.b
         .accept(
            fni.a(djp.bG)
               .a(
                  fnj.a(dxo.C, dxo.bj)
                     .a(false, dxz.a, fnl.a().a(fnm.c, fnu.bp.a(djp.bF, "_head", $$2, this.d)))
                     .a(false, dxz.b, fnl.a().a(fnm.c, fnu.bp.a(djp.bF, "_head_sticky", $$1, this.d)))
                     .a(true, dxz.a, fnl.a().a(fnm.c, fnu.bq.a(djp.bF, "_head_short", $$2, this.d)))
                     .a(true, dxz.b, fnl.a().a(fnm.c, fnu.bq.a(djp.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      djn $$0 = djp.tT;
      fnv $$1 = fnv.a($$0, "_side_inactive", "_top_inactive");
      fnv $$2 = fnv.a($$0, "_side_active", "_top_active");
      fnv $$3 = fnv.a($$0, "_side_active", "_top_ejecting_reward");
      fnv $$4 = fnv.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fnv $$5 = fnv.a($$0, "_side_active_ominous", "_top_active_ominous");
      fnv $$6 = fnv.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      akv $$7 = fnu.o.a($$0, $$1, this.d);
      akv $$8 = fnu.o.a($$0, "_active", $$2, this.d);
      akv $$9 = fnu.o.a($$0, "_ejecting_reward", $$3, this.d);
      akv $$10 = fnu.o.a($$0, "_inactive_ominous", $$4, this.d);
      akv $$11 = fnu.o.a($$0, "_active_ominous", $$5, this.d);
      akv $$12 = fnu.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fni.a($$0).a(fnj.a(dxo.bB, dxo.bD).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fnl.a().a(fnm.c, $$7x ? $$10 : $$7);
            case b, c, d -> fnl.a().a(fnm.c, $$7x ? $$11 : $$8);
            case e -> fnl.a().a(fnm.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      djn $$0 = djp.tU;
      fnv $$1 = fnv.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fnv $$2 = fnv.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fnv $$3 = fnv.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fnv $$4 = fnv.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      akv $$5 = fnu.bX.a($$0, $$1, this.d);
      akv $$6 = fnu.bX.a($$0, "_active", $$2, this.d);
      akv $$7 = fnu.bX.a($$0, "_unlocking", $$3, this.d);
      akv $$8 = fnu.bX.a($$0, "_ejecting_reward", $$4, this.d);
      fnv $$9 = fnv.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fnv $$10 = fnv.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnv $$11 = fnv.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnv $$12 = fnv.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      akv $$13 = fnu.bX.a($$0, "_ominous", $$9, this.d);
      akv $$14 = fnu.bX.a($$0, "_active_ominous", $$10, this.d);
      akv $$15 = fnu.bX.a($$0, "_unlocking_ominous", $$11, this.d);
      akv $$16 = fnu.bX.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fni.a($$0).a(b()).a(fnj.a(dsn.b, dsn.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fnl.a().a(fnm.c, $$9x ? $$13 : $$5);
            case b -> fnl.a().a(fnm.c, $$9x ? $$14 : $$6);
            case c -> fnl.a().a(fnm.c, $$9x ? $$15 : $$7);
            case d -> fnl.a().a(fnm.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      akv $$0 = fns.a(djp.rs, "_inactive");
      akv $$1 = fns.a(djp.rs, "_active");
      this.a(djp.rs, $$0);
      this.b.accept(fni.a(djp.rs).a(fnj.a(dxo.br).a($$2 -> fnl.a().a(fnm.c, $$2 != dye.b && $$2 != dye.c ? $$0 : $$1))));
   }

   private void ah() {
      akv $$0 = fns.a(djp.rt, "_inactive");
      akv $$1 = fns.a(djp.rt, "_active");
      this.a(djp.rt, $$0);
      this.b.accept(fni.a(djp.rt).a(fnj.a(dxo.br).a($$2 -> fnl.a().a(fnm.c, $$2 != dye.b && $$2 != dye.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      akv $$0 = fnu.bW.a(djp.rx, fnv.a(false), this.d);
      akv $$1 = fnu.bW.a(djp.rx, "_can_summon", fnv.a(true), this.d);
      this.a(djp.rx, $$0);
      this.b.accept(fni.a(djp.rx).a(a(dxo.f, $$1, $$0)));
   }

   private void aj() {
      akv $$0 = fns.a(djp.ou, "_stable");
      akv $$1 = fns.a(djp.ou, "_unstable");
      this.a(djp.ou, $$0);
      this.b.accept(fni.a(djp.ou).a(a(dxo.e, $$1, $$0)));
   }

   private void ak() {
      akv $$0 = this.a(djp.sX, "", fnu.ao, fnv::c);
      akv $$1 = this.a(djp.sX, "_lit", fnu.ao, fnv::c);
      this.b.accept(fni.a(djp.sX).a(a(dxo.c, $$1, $$0)));
      akv $$2 = this.a(djp.sY, "", fnu.ao, fnv::c);
      akv $$3 = this.a(djp.sY, "_lit", fnu.ao, fnv::c);
      this.b.accept(fni.a(djp.sY).a(a(dxo.c, $$3, $$2)));
   }

   private void al() {
      akv $$0 = fnx.a.create(djp.fW, this.d);
      akv $$1 = this.a(djp.fW, "_on", fnu.c, fnv::b);
      this.b.accept(fni.a(djp.fW).a(a(dxo.v, $$1, $$0)));
   }

   private void m(djn $$0, djn $$1) {
      fnv $$2 = fnv.B($$0);
      this.b.accept(c($$0, fnu.bi.a($$0, $$2, this.d)));
      this.b.accept(fni.a($$1, fnl.a().a(fnm.c, fnu.bk.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fnv $$0 = fnv.B(djp.dX);
      fnv $$1 = fnv.i(fnv.a(djp.dX, "_off"));
      akv $$2 = fnu.bm.a(djp.dX, $$0, this.d);
      akv $$3 = fnu.bj.a(djp.dX, "_off", $$1, this.d);
      this.b.accept(fni.a(djp.dX).a(a(dxo.v, $$2, $$3)));
      akv $$4 = fnu.bn.a(djp.dY, $$0, this.d);
      akv $$5 = fnu.bl.a(djp.dY, "_off", $$1, this.d);
      this.b.accept(fni.a(djp.dY).a(a(dxo.v, $$4, $$5)).a(d()));
      this.c(djp.dX);
   }

   private void an() {
      this.b(cwu.mh);
      this.b.accept(fni.a(djp.eu).a(fnj.a(dxo.aD, dxo.w, dxo.B).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fnl.a().a(fnm.c, fnv.a(djp.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cwu.da);
      this.b
         .accept(
            fni.a(djp.nx)
               .a(
                  fnj.a(dxo.aV, dxo.J)
                     .a(1, false, Arrays.asList(a(fns.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(fns.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(fns.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(fns.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(fns.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(fns.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(fns.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(fns.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fnv $$0 = fnv.a(djp.ea);
      akv $$1 = fnu.c.a(djp.ec, $$0, this.d);
      this.b.accept(fni.a(djp.ea).a(fnj.a(dxo.aI).a($$1x -> fnl.a().a(fnm.c, $$1x < 8 ? fns.a(djp.ea, "_height" + $$1x * 2) : $$1))));
      this.a(djp.ea, fns.a(djp.ea, "_height2"));
      this.b.accept(c(djp.ec, $$1));
   }

   private void aq() {
      this.b.accept(fni.a(djp.oE, fnl.a().a(fnm.c, fns.a(djp.oE))).a(b()));
   }

   private void ar() {
      akv $$0 = fnx.a.create(djp.pC, this.d);
      this.a(djp.pC, $$0);
      this.b.accept(fni.a(djp.pC).a(fnj.a(dxo.bm).a($$0x -> fnl.a().a(fnm.c, this.a(djp.pC, "_" + $$0x.c(), fnu.c, fnv::b)))));
   }

   private void as() {
      this.b(cwu.xv);
      this.b.accept(fni.a(djp.oK).a(fnj.a(dxo.av).a($$0 -> fnl.a().a(fnm.c, this.a(djp.oK, "_stage" + $$0, fnu.ao, fnv::c)))));
   }

   private void at() {
      this.b(cwu.pX);
      this.b
         .accept(
            fni.a(djp.gd)
               .a(
                  fnj.a(dxo.b, dxo.P, dxo.O, dxo.Q, dxo.R)
                     .a(false, false, false, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_ns")))
                     .a(false, true, false, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_n")).a(fnm.b, fnm.a.b))
                     .a(false, false, true, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_n")))
                     .a(false, false, false, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_n")).a(fnm.b, fnm.a.c))
                     .a(false, false, false, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_n")).a(fnm.b, fnm.a.d))
                     .a(false, true, true, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_ne")))
                     .a(false, true, false, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_ne")).a(fnm.b, fnm.a.b))
                     .a(false, false, false, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_ne")).a(fnm.b, fnm.a.c))
                     .a(false, false, true, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_ne")).a(fnm.b, fnm.a.d))
                     .a(false, false, true, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_ns")))
                     .a(false, true, false, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_ns")).a(fnm.b, fnm.a.b))
                     .a(false, true, true, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_nse")))
                     .a(false, true, false, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_nse")).a(fnm.b, fnm.a.b))
                     .a(false, false, true, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_nse")).a(fnm.b, fnm.a.c))
                     .a(false, true, true, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_nse")).a(fnm.b, fnm.a.d))
                     .a(false, true, true, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_nsew")))
                     .a(true, false, false, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_ns")))
                     .a(true, false, true, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_n")))
                     .a(true, false, false, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_n")).a(fnm.b, fnm.a.c))
                     .a(true, true, false, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_n")).a(fnm.b, fnm.a.b))
                     .a(true, false, false, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_n")).a(fnm.b, fnm.a.d))
                     .a(true, true, true, false, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_ne")))
                     .a(true, true, false, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_ne")).a(fnm.b, fnm.a.b))
                     .a(true, false, false, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_ne")).a(fnm.b, fnm.a.c))
                     .a(true, false, true, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_ne")).a(fnm.b, fnm.a.d))
                     .a(true, false, true, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_ns")))
                     .a(true, true, false, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_ns")).a(fnm.b, fnm.a.b))
                     .a(true, true, true, true, false, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_nse")))
                     .a(true, true, false, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_nse")).a(fnm.b, fnm.a.b))
                     .a(true, false, true, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_nse")).a(fnm.b, fnm.a.c))
                     .a(true, true, true, false, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_nse")).a(fnm.b, fnm.a.d))
                     .a(true, true, true, true, true, fnl.a().a(fnm.c, fns.a(djp.gd, "_attached_nsew")))
               )
         );
   }

   private void au() {
      this.c(djp.gc);
      this.b
         .accept(fni.a(djp.gc).a(fnj.a(dxo.b, dxo.B).a(($$0, $$1) -> fnl.a().a(fnm.c, fnv.a(djp.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private akv a(int $$0, String $$1, fnv $$2) {
      switch ($$0) {
         case 1:
            return fnu.bs.a(fns.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return fnu.bt.a(fns.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return fnu.bu.a(fns.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return fnu.bv.a(fns.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private akv a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fnv.b(fnv.J(djp.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fnv.b(fnv.a(djp.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fnv.b(fnv.a(djp.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void av() {
      this.b(cwu.kM);
      this.b.accept(fni.a(djp.mH).a(fnj.a(dxo.aG, dxo.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void aw() {
      this.b(cwu.kN);
      Function<Integer, akv> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fnv $$2 = fnv.a($$1);
         return fnu.bD.a(djp.mI, $$1, $$2, this.d);
      };
      this.b.accept(fni.a(djp.mI).a(fnj.a(dra.c).a($$1 -> fnl.a().a(fnm.c, $$0.apply($$1)))));
   }

   private void I(djn $$0) {
      this.c($$0);
      this.J($$0);
   }

   private void b(djn $$0, cwm $$1) {
      this.b($$1);
      this.J($$0);
   }

   private void J(djn $$0) {
      akv $$1 = fns.a($$0);
      fnh $$2 = fnh.a($$0);
      fng.c $$3 = af.a(fng.a(), $$1x -> a.stream().<jn>map(Pair::getFirst).map(dop::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jn, Function<akv, fnl>> $$4 : a) {
         dxp $$5 = dop.b((jn)$$4.getFirst());
         Function<akv, fnl> $$6 = (Function<akv, fnl>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fng.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void K(djn $$0) {
      akv $$1 = fnx.j.create($$0, this.d);
      akv $$2 = fnx.k.get($$0).a($$1x -> $$1x.a(fnw.i, fnv.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      akv $$3 = fnx.k.get($$0).a($$1x -> $$1x.a(fnw.i, fnv.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fnh $$4 = fnh.a($$0);
      fng.c $$5 = fng.a().a(don.b, false);
      $$4.a(fng.a().a(don.b, true), fnl.a().a(fnm.c, $$1));
      $$4.a($$5, fnl.a().a(fnm.c, $$1));
      a.stream().<jn>map(Pair::getFirst).forEach($$2x -> {
         dxv<dyj> $$3x = don.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dyj.a);
         }
      });

      for (Pair<jn, Function<akv, fnl>> $$6 : a) {
         jn $$7 = (jn)$$6.getFirst();
         dxv<dyj> $$8 = don.a($$7);
         if ($$8 != null) {
            Function<akv, fnl> $$9 = (Function<akv, fnl>)$$6.getSecond();
            $$4.a(fng.a().a($$8, dyj.c), $$9.apply($$2));
            $$4.a(fng.a().a($$8, dyj.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void L(djn $$0) {
      fnj $$1 = fnj.a(dnf.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fnv $$3 = fnv.c(fnv.a($$0, $$2));
         akv $$4 = fna.d.b.a().a($$0, $$2, $$3, this.d);
         return fnl.a().a(fnm.c, $$4);
      });
      this.c($$0);
      this.b.accept(fni.a($$0).a($$1));
   }

   private void ax() {
      akv $$0 = fnv.a(djp.rw, "_bottom");
      fnv $$1 = new fnv().a(fnw.e, $$0).a(fnw.f, fnv.a(djp.rw, "_top")).a(fnw.i, fnv.a(djp.rw, "_side"));
      fnv $$2 = new fnv().a(fnw.e, $$0).a(fnw.f, fnv.a(djp.rw, "_top_bloom")).a(fnw.i, fnv.a(djp.rw, "_side_bloom"));
      akv $$3 = fnu.n.a(djp.rw, "", $$1, this.d);
      akv $$4 = fnu.n.a(djp.rw, "_bloom", $$2, this.d);
      this.b.accept(fni.a(djp.rw).a(fnj.a(dxo.d).a($$2x -> fnl.a().a(fnm.c, $$2x ? $$4 : $$3))));
      this.a(djp.rw, $$3);
   }

   private void ay() {
      djn $$0 = djp.ct;
      akv $$1 = fns.a($$0);
      fnh $$2 = fnh.a($$0);
      List.of(Pair.of(jn.c, fnm.a.a), Pair.of(jn.f, fnm.a.b), Pair.of(jn.d, fnm.a.c), Pair.of(jn.e, fnm.a.d)).forEach($$2x -> {
         jn $$3 = (jn)$$2x.getFirst();
         fnm.a $$4 = (fnm.a)$$2x.getSecond();
         fng.c $$5 = fng.a().a(dxo.U, $$3);
         $$2.a($$5, fnl.a().a(fnm.c, $$1).a(fnm.b, $$4).a(fnm.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fns.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fnh $$0, fng.c $$1, fnm.a $$2) {
      List.of(
            Pair.of(dxo.bs, fnu.aP),
            Pair.of(dxo.bt, fnu.aQ),
            Pair.of(dxo.bu, fnu.aR),
            Pair.of(dxo.bv, fnu.aS),
            Pair.of(dxo.bw, fnu.aT),
            Pair.of(dxo.bx, fnu.aU)
         )
         .forEach($$3 -> {
            dxp $$4 = (dxp)$$3.getFirst();
            fnt $$5 = (fnt)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fnh $$0, fng.c $$1, fnm.a $$2, dxp $$3, fnt $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fnv $$7 = new fnv().a(fnw.b, fnv.a(djp.ct, $$6));
      fna.c $$8 = new fna.c($$4, $$6);
      akv $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(djp.ct, $$6, $$7, this.d));
      $$0.a(fng.a($$1, fng.a().a($$3, $$5)), fnl.a().a(fnm.c, $$9).a(fnm.b, $$2));
   }

   private void az() {
      this.b.accept(c(djp.ll, fnu.c.a(djp.ll, fnv.b(fns.a("magma")), this.d)));
   }

   private void a(djn $$0, @Nullable cvn $$1) {
      this.r($$0);
      cwm $$2 = $$0.j();
      akv $$3 = fnu.bK.a($$2, fnv.x($$0), this.d);
      hbm.b $$4 = $$1 != null ? fnq.a($$3, new hdv.a($$1)) : fnq.a($$3, new hdv.a());
      this.c.a($$2, $$4);
   }

   private void c(djn $$0, djn $$1, fna.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aA() {
      akv $$0 = fns.a(djp.b);
      akv $$1 = fns.a(djp.b, "_mirrored");
      this.b.accept(a(djp.fb, $$0, $$1));
      this.a(djp.fb, $$0);
   }

   private void aB() {
      akv $$0 = fns.a(djp.tl);
      akv $$1 = fns.a(djp.tl, "_mirrored");
      this.b.accept(a(djp.tF, $$0, $$1).a(f()));
      this.a(djp.tF, $$0);
   }

   private void n(djn $$0, djn $$1) {
      this.a($$0, fna.d.b);
      fnv $$2 = fnv.d(fnv.a($$0, "_pot"));
      akv $$3 = fna.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aC() {
      akv $$0 = fnv.a(djp.pN, "_bottom");
      akv $$1 = fnv.a(djp.pN, "_top_off");
      akv $$2 = fnv.a(djp.pN, "_top");
      akv[] $$3 = new akv[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fnv $$5 = new fnv().a(fnw.e, $$0).a(fnw.f, $$4 == 0 ? $$1 : $$2).a(fnw.i, fnv.a(djp.pN, "_side" + $$4));
         $$3[$$4] = fnu.n.a(djp.pN, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fni.a(djp.pN).a(fnj.a(dxo.bc).a($$1x -> fnl.a().a(fnm.c, $$3[$$1x]))));
      this.a(djp.pN, $$3[0]);
   }

   private fnl a(jp $$0, fnl $$1) {
      switch ($$0) {
         case b:
            return $$1.a(fnm.a, fnm.a.b);
         case c:
            return $$1.a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.c);
         case d:
            return $$1.a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.d);
         case a:
            return $$1.a(fnm.a, fnm.a.b).a(fnm.b, fnm.a.b);
         case f:
            return $$1.a(fnm.a, fnm.a.d).a(fnm.b, fnm.a.c);
         case g:
            return $$1.a(fnm.a, fnm.a.d);
         case h:
            return $$1.a(fnm.a, fnm.a.d).a(fnm.b, fnm.a.b);
         case e:
            return $$1.a(fnm.a, fnm.a.d).a(fnm.b, fnm.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(fnm.b, fnm.a.c);
         case i:
            return $$1.a(fnm.b, fnm.a.d);
         case j:
            return $$1.a(fnm.b, fnm.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aD() {
      akv $$0 = fnv.a(djp.pD, "_top");
      akv $$1 = fnv.a(djp.pD, "_bottom");
      akv $$2 = fnv.a(djp.pD, "_side");
      akv $$3 = fnv.a(djp.pD, "_lock");
      fnv $$4 = new fnv().a(fnw.o, $$2).a(fnw.m, $$2).a(fnw.l, $$2).a(fnw.c, $$0).a(fnw.j, $$0).a(fnw.k, $$1).a(fnw.n, $$3);
      akv $$5 = fnu.b.a(djp.pD, $$4, this.d);
      this.b.accept(fni.a(djp.pD, fnl.a().a(fnm.c, $$5)).a(fnj.a(dxo.W).a($$0x -> this.a($$0x, fnl.a()))));
   }

   private void aE() {
      djn $$0 = djp.n;
      akv $$1 = fns.a($$0);
      fnx $$2 = fnx.a.get($$0);
      djn $$3 = djp.kg;
      akv $$4 = fnu.ab.a($$3, $$2.b(), this.d);
      akv $$5 = fnu.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(djn $$0, djn $$1, dqu.a $$2, akv $$3) {
      akv $$4 = fns.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.j(), fnq.a($$3, new hdw.a($$2)));
   }

   private void aF() {
      akv $$0 = fns.b("template_skull");
      this.a(djp.hj, djp.hk, dqu.b.g, $$0);
      this.a(djp.hh, djp.hi, dqu.b.e, $$0);
      this.a(djp.hf, djp.hg, dqu.b.f, $$0);
      this.a(djp.hb, djp.hc, dqu.b.c, $$0);
      this.a(djp.hd, djp.he, dqu.b.d, $$0);
      this.a(djp.hn, djp.ho, dqu.b.h, $$0);
      this.a(djp.hl, djp.hm, dqu.b.i, fns.a(cwu.vp));
   }

   private void a(djn $$0, djn $$1, cvn $$2) {
      akv $$3 = fns.a("banner");
      akv $$4 = fns.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cwm $$5 = $$0.j();
      this.c.a($$5, fnq.a($$4, new hdn.a($$2)));
   }

   private void aG() {
      this.a(djp.jh, djp.jx, cvn.a);
      this.a(djp.ji, djp.jy, cvn.b);
      this.a(djp.jj, djp.jz, cvn.c);
      this.a(djp.jk, djp.jA, cvn.d);
      this.a(djp.jl, djp.jB, cvn.e);
      this.a(djp.jm, djp.jC, cvn.f);
      this.a(djp.jn, djp.jD, cvn.g);
      this.a(djp.jo, djp.jE, cvn.h);
      this.a(djp.jp, djp.jF, cvn.i);
      this.a(djp.jq, djp.jG, cvn.j);
      this.a(djp.jr, djp.jH, cvn.k);
      this.a(djp.js, djp.jI, cvn.l);
      this.a(djp.jt, djp.jJ, cvn.m);
      this.a(djp.ju, djp.jK, cvn.n);
      this.a(djp.jv, djp.jL, cvn.o);
      this.a(djp.jw, djp.jM, cvn.p);
   }

   private void a(djn $$0, djn $$1, akv $$2, boolean $$3) {
      this.a($$0, $$1);
      cwm $$4 = $$0.j();
      akv $$5 = fnu.bM.a($$4, fnv.x($$1), this.d);
      hbm.b $$6 = fnq.a($$5, new hdp.a($$2));
      if ($$3) {
         hbm.b $$7 = fnq.a($$5, new hdp.a(hdp.a));
         this.c.a($$4, fnq.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aH() {
      this.a(djp.cD, djp.n, hdp.b, true);
      this.a(djp.hs, djp.n, hdp.c, true);
      this.a(djp.gb, djp.cv, hdp.d, false);
   }

   private void b(djn $$0, djn $$1, cvn $$2) {
      akv $$3 = fns.a("bed");
      this.b.accept(c($$0, $$3));
      cwm $$4 = $$0.j();
      akv $$5 = fnu.bL.a(fns.a($$4), fnv.x($$1), this.d);
      this.c.a($$4, fnq.a($$5, new hdo.a($$2)));
   }

   private void aI() {
      this.b(djp.bg, djp.bH, cvn.a);
      this.b(djp.bh, djp.bI, cvn.b);
      this.b(djp.bi, djp.bJ, cvn.c);
      this.b(djp.bj, djp.bK, cvn.d);
      this.b(djp.bk, djp.bL, cvn.e);
      this.b(djp.bl, djp.bM, cvn.f);
      this.b(djp.bm, djp.bN, cvn.g);
      this.b(djp.bn, djp.bO, cvn.h);
      this.b(djp.bo, djp.bP, cvn.i);
      this.b(djp.bp, djp.bQ, cvn.j);
      this.b(djp.bq, djp.bR, cvn.k);
      this.b(djp.br, djp.bS, cvn.l);
      this.b(djp.bs, djp.bT, cvn.m);
      this.b(djp.bt, djp.bU, cvn.n);
      this.b(djp.bu, djp.bV, cvn.o);
      this.b(djp.bv, djp.bW, cvn.p);
   }

   private void a(djn $$0, hdx.a $$1) {
      cwm $$2 = $$0.j();
      akv $$3 = fns.a($$2);
      this.c.a($$2, fnq.a($$3, $$1));
   }

   public void a() {
      me.a().filter(mf::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(djp.rH).a(me.x).a(djp.rH, djp.sf).a(djp.rL, djp.rP).a(me.z);
      this.i(djp.rG).a(me.B).a(djp.rG, djp.se).a(djp.rK, djp.rO).a(me.D);
      this.i(djp.rF).a(me.F).a(djp.rF, djp.sd).a(djp.rJ, djp.rN).a(me.H);
      this.i(djp.rE).a(me.J).a(djp.rE, djp.sc).a(djp.rI, djp.rM).a(me.L);
      this.z(djp.sM);
      this.z(djp.sN);
      this.z(djp.sO);
      this.z(djp.sP);
      this.j(djp.sM, djp.sQ);
      this.j(djp.sN, djp.sR);
      this.j(djp.sO, djp.sS);
      this.j(djp.sP, djp.sT);
      this.n(djp.a);
      this.d(djp.nE, djp.a);
      this.d(djp.nD, djp.a);
      this.n(djp.gj);
      this.n(djp.ed);
      this.d(djp.nF, djp.J);
      this.n(djp.fV);
      this.n(djp.mG);
      this.n(djp.fM);
      this.n(djp.gm);
      this.b(cwu.vd);
      this.n(djp.pI);
      this.n(djp.J);
      this.n(djp.K);
      this.n(djp.it);
      this.b(cwu.gh);
      this.o(djp.qo, djp.qF);
      this.o(djp.qp, djp.qG);
      this.o(djp.qq, djp.qH);
      this.o(djp.qr, djp.qI);
      this.o(djp.qs, djp.qJ);
      this.o(djp.qt, djp.qK);
      this.o(djp.qu, djp.qL);
      this.o(djp.qv, djp.qM);
      this.o(djp.qw, djp.qN);
      this.o(djp.qx, djp.qO);
      this.o(djp.qy, djp.qP);
      this.o(djp.qz, djp.qQ);
      this.o(djp.qA, djp.qR);
      this.o(djp.qB, djp.qS);
      this.o(djp.qC, djp.qT);
      this.o(djp.qD, djp.qU);
      this.o(djp.qn, djp.qE);
      this.n(djp.nC);
      this.n(djp.gO);
      this.n(djp.rr);
      this.n(djp.sZ);
      this.v(djp.ta);
      this.v(djp.tb);
      this.w(djp.tK);
      this.w(djp.tL);
      this.ak();
      this.h(djp.te, djp.tc);
      this.K(djp.tX);
      this.L(djp.tY);
      this.a(djp.tW);
      this.s(djp.td);
      this.a(djp.iu, cwu.hY);
      this.b(cwu.hY);
      this.aJ();
      this.a(djp.lp, cwu.jy);
      this.b(cwu.jy);
      this.f(djp.bX, fnv.a(djp.bF, "_side"));
      this.a(djp.U);
      this.a(djp.V);
      this.a(djp.iZ);
      this.a(djp.cF);
      this.a(djp.cG);
      this.a(djp.cH);
      this.a(djp.fZ);
      this.a(djp.ga);
      this.a(djp.ge);
      this.a(djp.Q);
      this.a(djp.W);
      this.a(djp.R);
      this.a(djp.co);
      this.a(djp.S);
      this.a(djp.T);
      this.a(djp.cp);
      this.b(djp.pL, fnx.d);
      this.a(djp.pK);
      this.a(djp.aY);
      this.a(djp.aZ);
      this.a(djp.ba);
      this.a(djp.fC);
      this.a(djp.hy);
      this.a(djp.dV);
      this.a(djp.dW);
      this.a(djp.hx);
      this.a(djp.qe);
      this.a(djp.ny);
      this.a(djp.ee);
      this.a(djp.k);
      this.a(djp.pM);
      this.a(djp.fU);
      this.a(djp.ep);
      this.a(djp.O);
      this.a(djp.pJ);
      this.a(djp.eb);
      this.b(djp.eg, fnx.g);
      this.b(djp.pS, fnx.d);
      this.b(djp.fo, fnx.d);
      this.n(djp.ag);
      this.n(djp.gw);
      this.a(djp.lm);
      this.a(djp.bf);
      this.a(djp.ja);
      this.a(djp.cv);
      this.a(djp.qm);
      this.a(djp.iG);
      this.a(djp.pa);
      this.a(djp.ej);
      this.a(djp.ek);
      this.b(djp.cA, fnx.b);
      this.g(djp.cB);
      this.a(djp.aV);
      this.b(djp.bD, fnx.v);
      this.b(cwu.cZ);
      this.b(djp.cr, fnx.f);
      this.b(djp.pF, fnx.d);
      this.a(djp.oR);
      this.a(djp.aW);
      this.a(djp.qV);
      this.a(djp.qW);
      this.a(djp.rp);
      this.a(djp.sW);
      this.a(djp.tH);
      this.a(djp.tI);
      this.a(djp.tJ);
      this.d(djp.ru);
      this.n(djp.tV);
      this.aE();
      this.a(djp.rC);
      this.a(djp.rD);
      this.a(djp.ry);
      this.a(djp.rz);
      this.a(djp.rA);
      this.a(djp.rB);
      this.l(djp.ry, djp.rY);
      this.l(djp.rz, djp.sa);
      this.l(djp.rA, djp.rZ);
      this.l(djp.rB, djp.sb);
      this.j(djp.so);
      this.j(djp.sp);
      this.j(djp.sr);
      this.j(djp.sq);
      this.b(djp.so, djp.ss);
      this.b(djp.sp, djp.st);
      this.b(djp.sr, djp.sv);
      this.b(djp.sq, djp.su);
      this.l(djp.sw);
      this.l(djp.sx);
      this.l(djp.sz);
      this.l(djp.sy);
      this.c(djp.sw, djp.sA);
      this.c(djp.sx, djp.sB);
      this.c(djp.sz, djp.sD);
      this.c(djp.sy, djp.sC);
      this.a(djp.sE);
      this.a(djp.sF);
      this.a(djp.sG);
      this.a(djp.sH);
      this.l(djp.sE, djp.sI);
      this.l(djp.sF, djp.sJ);
      this.l(djp.sG, djp.sK);
      this.l(djp.sH, djp.sL);
      this.k(djp.ht, djp.co);
      this.k(djp.hu, djp.cp);
      this.H();
      this.s();
      this.ay();
      this.w();
      this.x();
      this.a(djp.oI, djp.oJ);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.C(djp.kV);
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
      this.I(djp.fu);
      this.I(djp.rv);
      this.b(djp.fv, cwu.gm);
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
      this.H(djp.cX);
      this.c(djp.cX);
      this.H(djp.oC);
      this.h();
      this.H(djp.tg);
      this.m(djp.cw, djp.cx);
      this.m(djp.en, djp.eo);
      this.a(djp.cI, djp.n, fnv::c);
      this.a(djp.oA, djp.p, fnv::d);
      this.B(djp.oY);
      this.B(djp.oP);
      this.y(djp.bb);
      this.y(djp.hF);
      this.D();
      this.G(djp.oG);
      this.G(djp.oH);
      this.e(djp.fl, fns.a(djp.fl));
      this.a(djp.el, fnx.d);
      this.a(djp.em, fnx.d);
      this.a(djp.tG);
      this.a(djp.lo, fnx.d);
      this.e(djp.j);
      this.e(djp.tj);
      this.e(djp.L);
      this.f(djp.M);
      this.f(djp.P);
      this.e(djp.N);
      this.d(djp.I);
      this.b(djp.tQ, fnx.f);
      this.a(djp.iH, fnx.d, fnx.e);
      this.a(djp.kZ, fnx.w, fnx.x);
      this.a(djp.hC, fnx.w, fnx.x);
      this.a(djp.tM, fnx.d, fnx.e);
      this.a(djp.tN, fnx.d, fnx.e);
      this.a(djp.tO, fnx.d, fnx.e);
      this.c(djp.ov, fnx.i);
      this.A();
      this.a(djp.pG, fnv::D);
      this.a(djp.pH, fnv::F);
      this.a(djp.lf, dxo.av, 0, 1, 2, 3);
      this.a(djp.gP, dxo.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djp.fL, dxo.av, 0, 1, 1, 2);
      this.a(djp.gQ, dxo.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djp.cJ, dxo.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(djp.lc, fna.d.b, dxo.at, 0, 1);
      this.j();
      this.i();
      this.aG();
      this.aI();
      this.aF();
      this.aH();
      this.a(djp.lr, null);
      this.a(djp.ls, cvn.a);
      this.a(djp.lt, cvn.b);
      this.a(djp.lu, cvn.c);
      this.a(djp.lv, cvn.d);
      this.a(djp.lw, cvn.e);
      this.a(djp.lx, cvn.f);
      this.a(djp.ly, cvn.g);
      this.a(djp.lz, cvn.h);
      this.a(djp.lA, cvn.i);
      this.a(djp.lB, cvn.j);
      this.a(djp.lC, cvn.k);
      this.a(djp.lD, cvn.l);
      this.a(djp.lE, cvn.m);
      this.a(djp.lF, cvn.n);
      this.a(djp.lG, cvn.o);
      this.a(djp.lH, cvn.p);
      this.r(djp.nz);
      this.a(djp.nz, new hdq.a());
      this.a(djp.tR, djp.iY);
      this.a(djp.tR, new hdr.a());
      this.a(djp.fS, djp.cv);
      this.a(djp.lh, djp.cv);
      this.a(djp.aT);
      this.a(djp.aU);
      this.a(djp.lY);
      this.a(djp.lZ);
      this.a(djp.ma);
      this.a(djp.mb);
      this.a(djp.mc);
      this.a(djp.md);
      this.a(djp.me);
      this.a(djp.mf);
      this.a(djp.mg);
      this.a(djp.mh);
      this.a(djp.mi);
      this.a(djp.mj);
      this.a(djp.mk);
      this.a(djp.ml);
      this.a(djp.mm);
      this.a(djp.mn);
      this.a(fnx.a, djp.mo, djp.mp, djp.mq, djp.mr, djp.ms, djp.mt, djp.mu, djp.mv, djp.mw, djp.mx, djp.my, djp.mz, djp.mA, djp.mB, djp.mC, djp.mD);
      this.a(djp.iY);
      this.a(djp.hG);
      this.a(djp.hH);
      this.a(djp.hI);
      this.a(djp.hJ);
      this.a(djp.hK);
      this.a(djp.hL);
      this.a(djp.hM);
      this.a(djp.hN);
      this.a(djp.hO);
      this.a(djp.hP);
      this.a(djp.hQ);
      this.a(djp.hR);
      this.a(djp.hS);
      this.a(djp.hT);
      this.a(djp.hU);
      this.a(djp.hV);
      this.a(djp.rq);
      this.i(djp.aX, djp.fm);
      this.i(djp.ev, djp.hW);
      this.i(djp.ew, djp.hX);
      this.i(djp.ex, djp.hY);
      this.i(djp.ey, djp.hZ);
      this.i(djp.ez, djp.ia);
      this.i(djp.eA, djp.ib);
      this.i(djp.eB, djp.ic);
      this.i(djp.eC, djp.id);
      this.i(djp.eD, djp.ie);
      this.i(djp.eE, djp.if);
      this.i(djp.eF, djp.ig);
      this.i(djp.eG, djp.ih);
      this.i(djp.eH, djp.ii);
      this.i(djp.eI, djp.ij);
      this.i(djp.eJ, djp.ik);
      this.i(djp.eK, djp.il);
      this.b(fnx.p, djp.lI, djp.lJ, djp.lK, djp.lL, djp.lM, djp.lN, djp.lO, djp.lP, djp.lQ, djp.lR, djp.lS, djp.lT, djp.lU, djp.lV, djp.lW, djp.lX);
      this.h(djp.bH, djp.iI);
      this.h(djp.bI, djp.iJ);
      this.h(djp.bJ, djp.iK);
      this.h(djp.bK, djp.iL);
      this.h(djp.bL, djp.iM);
      this.h(djp.bM, djp.iN);
      this.h(djp.bN, djp.iO);
      this.h(djp.bO, djp.iP);
      this.h(djp.bP, djp.iQ);
      this.h(djp.bQ, djp.iR);
      this.h(djp.bR, djp.iS);
      this.h(djp.bS, djp.iT);
      this.h(djp.bT, djp.iU);
      this.h(djp.bU, djp.iV);
      this.h(djp.bV, djp.iW);
      this.h(djp.bW, djp.iX);
      this.a(djp.tk);
      this.a(djp.eZ);
      this.b(djp.bB, djp.gx, fna.d.a);
      this.h(djp.bB);
      this.a(djp.bY, djp.gy, fna.d.b);
      this.a(djp.ca, djp.gz, fna.d.b);
      this.a(djp.tZ, djp.ub, fna.d.c);
      this.a(djp.ua, djp.uc, fna.d.b);
      this.a(djp.cb, djp.gA, fna.d.b);
      this.a(djp.cc, djp.gB, fna.d.b);
      this.a(djp.cd, djp.gC, fna.d.b);
      this.a(djp.ce, djp.gD, fna.d.b);
      this.a(djp.cf, djp.gE, fna.d.b);
      this.a(djp.cg, djp.gF, fna.d.b);
      this.a(djp.ch, djp.gG, fna.d.b);
      this.a(djp.ci, djp.gH, fna.d.b);
      this.a(djp.cj, djp.gI, fna.d.b);
      this.a(djp.cl, djp.gJ, fna.d.b);
      this.a(djp.ck, djp.gK, fna.d.b);
      this.a(djp.cn, djp.gL, fna.d.b);
      this.a(djp.cm, djp.gM, fna.d.b);
      this.a(djp.bC, djp.gN, fna.d.b);
      this.a(djp.bZ, djp.gn, fna.d.b);
      this.I();
      this.x(djp.fh);
      this.x(djp.fi);
      this.x(djp.fj);
      this.b(djp.bA, fna.d.a);
      this.h(djp.bA);
      this.b(djp.ef, fna.d.a);
      this.b(cwu.dS);
      this.c(djp.mE, djp.mF, fna.d.b);
      this.b(cwu.dT);
      this.b(djp.ti, fna.d.b);
      this.c(djp.pb, djp.pc, fna.d.b);
      this.c(djp.pd, djp.pe, fna.d.b);
      this.a(djp.pb, "_plant");
      this.a(djp.pd, "_plant");
      this.a(djp.nA, fna.d.a, fnv.c(fnv.a(djp.nB, "_stage0")));
      this.n();
      this.a(djp.bz, fna.d.b);
      this.d(djp.jc, fna.d.b);
      this.d(djp.jd, fna.d.b);
      this.d(djp.je, fna.d.b);
      this.o(djp.jf);
      this.o(djp.jg);
      this.k();
      this.l();
      this.m();
      this.a(djp.mY, djp.mT, djp.mO, djp.mJ, djp.ni, djp.nd, djp.ns, djp.nn);
      this.a(djp.mZ, djp.mU, djp.mP, djp.mK, djp.nj, djp.ne, djp.nt, djp.no);
      this.a(djp.na, djp.mV, djp.mQ, djp.mL, djp.nk, djp.nf, djp.nu, djp.np);
      this.a(djp.nb, djp.mW, djp.mR, djp.mM, djp.nl, djp.ng, djp.nv, djp.nq);
      this.a(djp.nc, djp.mX, djp.mS, djp.mN, djp.nm, djp.nh, djp.nw, djp.nr);
      this.f(djp.fs, djp.fq);
      this.f(djp.fr, djp.fp);
      this.m(djp.af).c(djp.af).a(djp.aA);
      this.m(djp.ar).c(djp.ar).a(djp.aJ);
      this.a(djp.ar, djp.du, djp.dE);
      this.a(djp.aS, fnx.s, -7158200);
      this.m(djp.ab).c(djp.ab).a(djp.ax);
      this.m(djp.am).c(djp.am).a(djp.aF);
      this.a(djp.am, djp.dn, djp.dz);
      this.a(djp.D, djp.gs, fna.d.b);
      this.a(djp.aO, fnx.s, -12012264);
      this.m(djp.ac).d(djp.ac).a(djp.ay);
      this.m(djp.an).d(djp.an).a(djp.aG);
      this.a(djp.an, djp.do, djp.dA);
      this.a(djp.E, djp.gt, fna.d.b);
      this.b(djp.aP, fnx.s);
      this.m(djp.Z).c(djp.Z).a(djp.av);
      this.m(djp.ak).c(djp.ak).a(djp.aD);
      this.a(djp.ak, djp.dm, djp.dy);
      this.a(djp.B, djp.gq, fna.d.b);
      this.a(djp.aM, fnx.s, -8345771);
      this.m(djp.X).c(djp.X).a(djp.at);
      this.m(djp.aq).c(djp.aq).a(djp.aB);
      this.a(djp.aq, djp.dk, djp.dw);
      this.a(djp.z, djp.go, fna.d.b);
      this.a(djp.aK, fnx.s, -12012264);
      this.m(djp.Y).c(djp.Y).a(djp.au);
      this.m(djp.aj).c(djp.aj).a(djp.aC);
      this.a(djp.aj, djp.dl, djp.dx);
      this.a(djp.A, djp.gp, fna.d.b);
      this.a(djp.aL, fnx.s, -10380959);
      this.m(djp.ad).c(djp.ad).a(djp.az);
      this.m(djp.ao).c(djp.ao).a(djp.aH);
      this.a(djp.ao, djp.dq, djp.dC);
      this.a(djp.F, djp.gu, fna.d.b);
      this.a(djp.aQ, fnx.s, -12012264);
      this.m(djp.ae).c(djp.ae).a(djp.u);
      this.m(djp.ap).c(djp.ap).a(djp.aI);
      this.a(djp.ap, djp.dr, djp.dD);
      this.a(djp.G, djp.gv, fna.d.b);
      this.b(djp.aR, fnx.s);
      this.m(djp.aa).c(djp.aa).a(djp.aw);
      this.m(djp.al).c(djp.al).a(djp.aE);
      this.a(djp.al, djp.dp, djp.dB);
      this.a(djp.C, djp.gr, fna.d.b);
      this.a(djp.aN, fnx.s, -12012264);
      this.m(djp.oU).b(djp.oU).a(djp.oW);
      this.m(djp.oV).b(djp.oV).a(djp.oX);
      this.a(djp.oV, djp.ds, djp.dF);
      this.a(djp.oZ, djp.pO, fna.d.b);
      this.n(djp.pf, djp.pQ);
      this.m(djp.oL).b(djp.oL).a(djp.oN);
      this.m(djp.oM).b(djp.oM).a(djp.oO);
      this.a(djp.oM, djp.dt, djp.dG);
      this.a(djp.oQ, djp.pP, fna.d.b);
      this.n(djp.oS, djp.pR);
      this.m(djp.ai).d(djp.ai);
      this.m(djp.as).d(djp.as);
      this.a(djp.x, djp.dv, djp.dH);
      this.b(djp.oT, fna.d.b);
      this.b(cwu.dP);
      this.j(djp.dK);
      this.l(djp.iw);
      this.v();
      this.p(djp.cY);
      this.q(djp.bw);
      this.q(djp.bx);
      this.q(djp.hE);
      this.u();
      this.t(djp.gi);
      this.t(djp.li);
      this.t(djp.lj);
      this.u(djp.hp);
      this.u(djp.hq);
      this.u(djp.hr);
      this.p();
      this.q();
      this.d(djp.cL, fnx.h);
      this.d(djp.oy, fnx.h);
      this.d(djp.ox, fnx.i);
      this.t();
      this.aC();
      this.ax();
      this.l(djp.eY, djp.fg);
      this.l(djp.m, djp.fc);
      this.l(djp.eX, djp.ff);
      this.l(djp.eW, djp.fe);
      this.aA();
      this.l(djp.eV, djp.fd);
      this.aB();
   }

   private void aJ() {
      hbm.b $$0 = fnq.a(this.a(cwu.hZ));
      Map<Integer, hbm.b> $$1 = new HashMap<>(16);
      fnj.a<Integer> $$2 = fnj.a(dxo.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         akv $$5 = fnv.a(cwu.hZ, $$4);
         $$2.a($$3, fnl.a().a(fnm.c, fnu.aa.a(djp.iv, $$4, fnv.h($$5), this.d)));
         hbm.b $$6 = fnq.a(fnu.bE.a(fns.a(cwu.hZ, $$4), fnv.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cwu.hZ, fnq.a(dod.c, $$0, $$1));
      this.b.accept(fni.a(djp.iv).a($$2));
   }

   private void o(djn $$0, djn $$1) {
      this.b($$0.j());
      fnv $$2 = fnv.b(fnv.J($$0));
      fnv $$3 = fnv.b(fnv.a($$0, "_lit"));
      akv $$4 = fnu.bR.a($$0, "_one_candle", $$2, this.d);
      akv $$5 = fnu.bS.a($$0, "_two_candles", $$2, this.d);
      akv $$6 = fnu.bT.a($$0, "_three_candles", $$2, this.d);
      akv $$7 = fnu.bU.a($$0, "_four_candles", $$2, this.d);
      akv $$8 = fnu.bR.a($$0, "_one_candle_lit", $$3, this.d);
      akv $$9 = fnu.bS.a($$0, "_two_candles_lit", $$3, this.d);
      akv $$10 = fnu.bT.a($$0, "_three_candles_lit", $$3, this.d);
      akv $$11 = fnu.bU.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fni.a($$0)
               .a(
                  fnj.a(dxo.aC, dxo.v)
                     .a(1, false, fnl.a().a(fnm.c, $$4))
                     .a(2, false, fnl.a().a(fnm.c, $$5))
                     .a(3, false, fnl.a().a(fnm.c, $$6))
                     .a(4, false, fnl.a().a(fnm.c, $$7))
                     .a(1, true, fnl.a().a(fnm.c, $$8))
                     .a(2, true, fnl.a().a(fnm.c, $$9))
                     .a(3, true, fnl.a().a(fnm.c, $$10))
                     .a(4, true, fnl.a().a(fnm.c, $$11))
               )
         );
      akv $$12 = fnu.bV.a($$1, fnv.a($$0, false), this.d);
      akv $$13 = fnu.bV.a($$1, "_lit", fnv.a($$0, true), this.d);
      this.b.accept(fni.a($$1).a(a(dxo.v, $$13, $$12)));
   }

   class a {
      private final fnv b;
      private final Map<fnt, akv> c = Maps.newHashMap();
      @Nullable
      private mf d;
      @Nullable
      private akv e;
      private final Set<djn> f = new HashSet<>();

      public a(final fnv $$0) {
         this.b = $$0;
      }

      public fna.a a(djn $$0, fnt $$1) {
         this.e = $$1.a($$0, this.b, fna.this.d);
         if (fna.this.f.containsKey($$0)) {
            fna.this.b.accept(fna.this.f.get($$0).create($$0, this.e, this.b, fna.this.d));
         } else {
            fna.this.b.accept(fna.c($$0, this.e));
         }

         return this;
      }

      public fna.a a(djn $$0, djn $$1) {
         akv $$2 = fns.a($$0);
         fna.this.b.accept(fna.c($$1, $$2));
         fna.this.c.a($$0.j(), $$1.j());
         this.f.add($$1);
         return this;
      }

      public fna.a a(djn $$0) {
         akv $$1 = fnu.s.a($$0, this.b, fna.this.d);
         akv $$2 = fnu.t.a($$0, this.b, fna.this.d);
         fna.this.b.accept(fna.b($$0, $$1, $$2));
         akv $$3 = fnu.u.a($$0, this.b, fna.this.d);
         fna.this.a($$0, $$3);
         return this;
      }

      public fna.a b(djn $$0) {
         akv $$1 = fnu.M.a($$0, this.b, fna.this.d);
         akv $$2 = fnu.N.a($$0, this.b, fna.this.d);
         akv $$3 = fnu.O.a($$0, this.b, fna.this.d);
         fna.this.b.accept(fna.a($$0, $$1, $$2, $$3));
         akv $$4 = fnu.P.a($$0, this.b, fna.this.d);
         fna.this.a($$0, $$4);
         return this;
      }

      public fna.a c(djn $$0) {
         fnv $$1 = fnv.s($$0);
         akv $$2 = fnu.D.a($$0, $$1, fna.this.d);
         akv $$3 = fnu.E.a($$0, $$1, fna.this.d);
         akv $$4 = fnu.F.a($$0, $$1, fna.this.d);
         akv $$5 = fnu.G.a($$0, $$1, fna.this.d);
         akv $$6 = fnu.H.a($$0, $$1, fna.this.d);
         fna.this.b.accept(fna.a($$0, $$2, $$3, $$4, $$5, $$6));
         akv $$7 = fnu.I.a($$0, $$1, fna.this.d);
         fna.this.a($$0, $$7);
         return this;
      }

      public fna.a d(djn $$0) {
         akv $$1 = fnu.J.a($$0, this.b, fna.this.d);
         akv $$2 = fnu.K.a($$0, this.b, fna.this.d);
         fna.this.b.accept(fna.c($$0, $$1, $$2));
         akv $$3 = fnu.L.a($$0, this.b, fna.this.d);
         fna.this.a($$0, $$3);
         return this;
      }

      public fna.a e(djn $$0) {
         fnv $$1 = fnv.s($$0);
         akv $$2 = fnu.R.a($$0, $$1, fna.this.d);
         akv $$3 = fnu.Q.a($$0, $$1, fna.this.d);
         akv $$4 = fnu.T.a($$0, $$1, fna.this.d);
         akv $$5 = fnu.S.a($$0, $$1, fna.this.d);
         fna.this.b.accept(fna.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fna.a f(djn $$0) {
         akv $$1 = fnu.V.a($$0, this.b, fna.this.d);
         akv $$2 = fnu.U.a($$0, this.b, fna.this.d);
         akv $$3 = fnu.X.a($$0, this.b, fna.this.d);
         akv $$4 = fnu.W.a($$0, this.b, fna.this.d);
         fna.this.b.accept(fna.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fna.a g(djn $$0) {
         akv $$1 = fnu.Y.a($$0, this.b, fna.this.d);
         akv $$2 = fnu.Z.a($$0, this.b, fna.this.d);
         fna.this.b.accept(fna.e($$0, $$1, $$2));
         return this;
      }

      public fna.a h(djn $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            djn $$1 = this.d.b().get(mf.b.r);
            akv $$2 = fnu.aa.a($$0, this.b, fna.this.d);
            fna.this.b.accept(fna.c($$0, $$2));
            fna.this.b.accept(fna.c($$1, $$2));
            fna.this.b($$0.j());
            return this;
         }
      }

      public fna.a i(djn $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            akv $$1 = this.a(fnu.ab, $$0);
            akv $$2 = this.a(fnu.ac, $$0);
            fna.this.b.accept(fna.e($$0, $$1, $$2, this.e));
            fna.this.a($$0, $$1);
            return this;
         }
      }

      public fna.a j(djn $$0) {
         akv $$1 = this.a(fnu.af, $$0);
         akv $$2 = this.a(fnu.ae, $$0);
         akv $$3 = this.a(fnu.ag, $$0);
         fna.this.b.accept(fna.b($$0, $$1, $$2, $$3));
         fna.this.a($$0, $$2);
         return this;
      }

      private fna.a k(djn $$0) {
         fnx $$1 = fna.this.g.getOrDefault($$0, fnx.a.get($$0));
         akv $$2 = $$1.a($$0, fna.this.d);
         fna.this.b.accept(fna.c($$0, $$2));
         return this;
      }

      private fna.a l(djn $$0) {
         fna.this.j($$0);
         return this;
      }

      private void m(djn $$0) {
         if (fna.this.e.contains($$0)) {
            fna.this.l($$0);
         } else {
            fna.this.k($$0);
         }
      }

      private akv a(fnt $$0, djn $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fna.this.d));
      }

      public fna.a a(mf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fna.a, djn> $$2 = fna.h.get($$0x);
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
      fnf create(djn var1, akv var2, fnv var3, BiConsumer<akv, fnr> var4);
   }

   static record c(fnt a, String b) {
   }

   static enum d {
      a(fnu.ap, fnu.as, false),
      b(fnu.ao, fnu.ar, false),
      c(fnu.aq, fnu.at, true);

      private final fnt d;
      private final fnt e;
      private final boolean f;

      private d(final fnt $$0, final fnt $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fnt a() {
         return this.d;
      }

      public fnt b() {
         return this.e;
      }

      public akv a(fna $$0, djn $$1) {
         cwm $$2 = $$1.j();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fnv a(djn $$0) {
         return this.f ? fnv.e($$0) : fnv.c($$0);
      }

      public fnv b(djn $$0) {
         return this.f ? fnv.g($$0) : fnv.f($$0);
      }
   }

   class e {
      private final fnv b;

      public e(final fnv $$0) {
         this.b = $$0;
      }

      public fna.e a(djn $$0) {
         fnv $$1 = this.b.c(fnw.d, this.b.a(fnw.i));
         akv $$2 = fnu.j.a($$0, $$1, fna.this.d);
         fna.this.b.accept(fna.d($$0, $$2));
         return this;
      }

      public fna.e b(djn $$0) {
         akv $$1 = fnu.j.a($$0, this.b, fna.this.d);
         fna.this.b.accept(fna.d($$0, $$1));
         return this;
      }

      public fna.e c(djn $$0) {
         akv $$1 = fnu.j.a($$0, this.b, fna.this.d);
         akv $$2 = fnu.k.a($$0, this.b, fna.this.d);
         fna.this.b.accept(fna.d($$0, $$1, $$2));
         return this;
      }

      public fna.e d(djn $$0) {
         fna.this.b.accept(fna.a($$0, this.b, fna.this.d));
         return this;
      }
   }
}
