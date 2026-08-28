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

public class fmw {
   final Consumer<fnb> b;
   final fmz c;
   final BiConsumer<aku, fnn> d;
   final List<djk> e = ImmutableList.of(djm.eL, djm.eR, djm.iw);
   final Map<djk, fmw.b> f = ImmutableMap.builder().put(djm.b, fmw::a).put(djm.tl, fmw::c).put(djm.fa, fmw::b).build();
   final Map<djk, fnt> g = ImmutableMap.builder()
      .put(djm.bc, fnt.y.get(djm.bc))
      .put(djm.jN, fnt.y.get(djm.jN))
      .put(djm.kr, fnt.a(fnr.a(djm.bc, "_top")))
      .put(djm.kt, fnt.a(fnr.a(djm.jN, "_top")))
      .put(djm.be, fnt.d.get(djm.bc).a($$0x -> $$0x.a(fns.i, fnr.J(djm.be))))
      .put(djm.jP, fnt.d.get(djm.jN).a($$0x -> $$0x.a(fns.i, fnr.J(djm.jP))))
      .put(djm.hA, fnt.d.get(djm.hA))
      .put(djm.ks, fnt.a(fnr.a(djm.hA, "_bottom")))
      .put(djm.pT, fnt.z.get(djm.pT))
      .put(djm.tl, fnt.z.get(djm.tl))
      .put(djm.hB, fnt.d.get(djm.hB).a($$0x -> $$0x.a(fns.i, fnr.J(djm.hB))))
      .put(djm.bd, fnt.d.get(djm.bd).a($$0x -> {
         $$0x.a(fns.d, fnr.a(djm.bc, "_top"));
         $$0x.a(fns.i, fnr.J(djm.bd));
      }))
      .put(djm.jO, fnt.d.get(djm.jO).a($$0x -> {
         $$0x.a(fns.d, fnr.a(djm.jN, "_top"));
         $$0x.a(fns.i, fnr.J(djm.jO));
      }))
      .put(djm.ro, fnt.z.get(djm.ro))
      .put(djm.rj, fnt.z.get(djm.rj))
      .build();
   static final Map<mf.b, BiConsumer<fmw.a, djk>> h = ImmutableMap.builder()
      .put(mf.b.a, fmw.a::a)
      .put(mf.b.e, fmw.a::l)
      .put(mf.b.b, fmw.a::k)
      .put(mf.b.c, fmw.a::k)
      .put(mf.b.f, fmw.a::c)
      .put(mf.b.g, fmw.a::d)
      .put(mf.b.h, fmw.a::e)
      .put(mf.b.i, fmw.a::f)
      .put(mf.b.k, fmw.a::h)
      .put(mf.b.l, fmw.a::i)
      .put(mf.b.m, fmw.a::j)
      .put(mf.b.n, fmw.a::g)
      .put(mf.b.p, fmw.a::m)
      .put(mf.b.q, fmw.a::b)
      .build();
   public static final List<Pair<jn, Function<aku, fnh>>> a = List.of(
      Pair.of(jn.c, (Function<aku, fnh>)$$0 -> fnh.a().a(fni.c, $$0)),
      Pair.of(jn.f, (Function<aku, fnh>)$$0 -> fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b).a(fni.d, true)),
      Pair.of(jn.d, (Function<aku, fnh>)$$0 -> fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c).a(fni.d, true)),
      Pair.of(jn.e, (Function<aku, fnh>)$$0 -> fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d).a(fni.d, true)),
      Pair.of(jn.b, (Function<aku, fnh>)$$0 -> fnh.a().a(fni.c, $$0).a(fni.a, fni.a.d).a(fni.d, true)),
      Pair.of(jn.a, (Function<aku, fnh>)$$0 -> fnh.a().a(fni.c, $$0).a(fni.a, fni.a.b).a(fni.d, true))
   );
   private static final Map<fmw.c, aku> i = new HashMap<>();

   private static fnb a(djk $$0, aku $$1, fnr $$2, BiConsumer<aku, fnn> $$3) {
      aku $$4 = fnq.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fnb b(djk $$0, aku $$1, fnr $$2, BiConsumer<aku, fnn> $$3) {
      aku $$4 = fnq.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fnb c(djk $$0, aku $$1, fnr $$2, BiConsumer<aku, fnn> $$3) {
      aku $$4 = fnq.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fmw(Consumer<fnb> $$0, fmz $$1, BiConsumer<aku, fnn> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cwj $$0, aku $$1) {
      this.c.a($$0, fnm.a($$1));
   }

   void a(djk $$0, aku $$1) {
      this.c.a($$0.j(), fnm.a($$1));
   }

   private void a(djk $$0, aku $$1, fmr $$2) {
      this.c.a($$0.j(), fnm.a($$1, $$2));
   }

   private aku a(cwj $$0) {
      return fnq.bE.a(fno.a($$0), fnr.b($$0), this.d);
   }

   aku a(cwj $$0, djk $$1) {
      return fnq.bE.a(fno.a($$0), fnr.I($$1), this.d);
   }

   private aku a(cwj $$0, djk $$1, String $$2) {
      return fnq.bE.a(fno.a($$0), fnr.k(fnr.a($$1, $$2)), this.d);
   }

   aku b(cwj $$0, djk $$1, String $$2) {
      aku $$3 = fnr.J($$1);
      aku $$4 = fnr.a($$1, $$2);
      return fnq.bI.a(fno.a($$0), fnr.c($$3, $$4), this.d);
   }

   void b(cwj $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(djk $$0) {
      cwj $$1 = $$0.j();
      if ($$1 != cwr.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(djk $$0, String $$1) {
      cwj $$2 = $$0.j();
      if ($$2 != cwr.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(djk $$0, String $$1) {
      cwj $$2 = $$0.j();
      if ($$2 != cwr.a) {
         aku $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fnf b() {
      return fnf.a(dxl.U).a(jn.f, fnh.a().a(fni.b, fni.a.b)).a(jn.d, fnh.a().a(fni.b, fni.a.c)).a(jn.e, fnh.a().a(fni.b, fni.a.d)).a(jn.c, fnh.a());
   }

   private static fnf c() {
      return fnf.a(dxl.U).a(jn.d, fnh.a()).a(jn.e, fnh.a().a(fni.b, fni.a.b)).a(jn.c, fnh.a().a(fni.b, fni.a.c)).a(jn.f, fnh.a().a(fni.b, fni.a.d));
   }

   private static fnf d() {
      return fnf.a(dxl.U).a(jn.f, fnh.a()).a(jn.d, fnh.a().a(fni.b, fni.a.b)).a(jn.e, fnh.a().a(fni.b, fni.a.c)).a(jn.c, fnh.a().a(fni.b, fni.a.d));
   }

   private static fnf e() {
      return fnf.a(dxl.S)
         .a(jn.a, fnh.a().a(fni.a, fni.a.b))
         .a(jn.b, fnh.a().a(fni.a, fni.a.d))
         .a(jn.c, fnh.a())
         .a(jn.d, fnh.a().a(fni.b, fni.a.c))
         .a(jn.e, fnh.a().a(fni.b, fni.a.d))
         .a(jn.f, fnh.a().a(fni.b, fni.a.b));
   }

   private static fne b(djk $$0, aku $$1) {
      return fne.a($$0, a($$1));
   }

   private static fnh[] a(aku $$0) {
      return new fnh[]{
         fnh.a().a(fni.c, $$0), fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b), fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c), fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d)
      };
   }

   private static fne a(djk $$0, aku $$1, aku $$2) {
      return fne.a($$0, fnh.a().a(fni.c, $$1), fnh.a().a(fni.c, $$2), fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c));
   }

   private static fnf a(dxm $$0, aku $$1, aku $$2) {
      return fnf.a($$0).a(true, fnh.a().a(fni.c, $$1)).a(false, fnh.a().a(fni.c, $$2));
   }

   private void d(djk $$0) {
      aku $$1 = fnt.a.create($$0, this.d);
      aku $$2 = fnt.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(djk $$0) {
      aku $$1 = fnt.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(djk $$0) {
      this.b.accept(fne.a($$0).a(fnf.a(dxl.by).a($$1 -> {
         String $$2 = "_" + $$1;
         aku $$3 = fnr.a($$0, $$2);
         return fnh.a().a(fni.c, fnq.c.a($$0, $$2, new fnr().a(fns.a, $$3), this.d));
      })));
      this.a($$0, fno.a($$0, "_0"));
   }

   static fnb b(djk $$0, aku $$1, aku $$2) {
      return fne.a($$0)
         .a(fnf.a(dxl.B).a(false, fnh.a().a(fni.c, $$1)).a(true, fnh.a().a(fni.c, $$2)))
         .a(
            fnf.a(dxl.X, dxl.U)
               .a(dxg.a, jn.f, fnh.a().a(fni.b, fni.a.b))
               .a(dxg.a, jn.e, fnh.a().a(fni.b, fni.a.d))
               .a(dxg.a, jn.d, fnh.a().a(fni.b, fni.a.c))
               .a(dxg.a, jn.c, fnh.a())
               .a(dxg.b, jn.f, fnh.a().a(fni.b, fni.a.b).a(fni.a, fni.a.b).a(fni.d, true))
               .a(dxg.b, jn.e, fnh.a().a(fni.b, fni.a.d).a(fni.a, fni.a.b).a(fni.d, true))
               .a(dxg.b, jn.d, fnh.a().a(fni.b, fni.a.c).a(fni.a, fni.a.b).a(fni.d, true))
               .a(dxg.b, jn.c, fnh.a().a(fni.a, fni.a.b).a(fni.d, true))
               .a(dxg.c, jn.f, fnh.a().a(fni.b, fni.a.d).a(fni.a, fni.a.c))
               .a(dxg.c, jn.e, fnh.a().a(fni.b, fni.a.b).a(fni.a, fni.a.c))
               .a(dxg.c, jn.d, fnh.a().a(fni.a, fni.a.c))
               .a(dxg.c, jn.c, fnh.a().a(fni.b, fni.a.c).a(fni.a, fni.a.c))
         );
   }

   private static fnf.d<jn, dxq, dxp, Boolean> a(fnf.d<jn, dxq, dxp, Boolean> $$0, dxq $$1, aku $$2, aku $$3, aku $$4, aku $$5) {
      return $$0.a(jn.f, $$1, dxp.a, false, fnh.a().a(fni.c, $$2))
         .a(jn.d, $$1, dxp.a, false, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b))
         .a(jn.e, $$1, dxp.a, false, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c))
         .a(jn.c, $$1, dxp.a, false, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d))
         .a(jn.f, $$1, dxp.b, false, fnh.a().a(fni.c, $$4))
         .a(jn.d, $$1, dxp.b, false, fnh.a().a(fni.c, $$4).a(fni.b, fni.a.b))
         .a(jn.e, $$1, dxp.b, false, fnh.a().a(fni.c, $$4).a(fni.b, fni.a.c))
         .a(jn.c, $$1, dxp.b, false, fnh.a().a(fni.c, $$4).a(fni.b, fni.a.d))
         .a(jn.f, $$1, dxp.a, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
         .a(jn.d, $$1, dxp.a, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c))
         .a(jn.e, $$1, dxp.a, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d))
         .a(jn.c, $$1, dxp.a, true, fnh.a().a(fni.c, $$3))
         .a(jn.f, $$1, dxp.b, true, fnh.a().a(fni.c, $$5).a(fni.b, fni.a.d))
         .a(jn.d, $$1, dxp.b, true, fnh.a().a(fni.c, $$5))
         .a(jn.e, $$1, dxp.b, true, fnh.a().a(fni.c, $$5).a(fni.b, fni.a.b))
         .a(jn.c, $$1, dxp.b, true, fnh.a().a(fni.c, $$5).a(fni.b, fni.a.c));
   }

   private static fnb a(djk $$0, aku $$1, aku $$2, aku $$3, aku $$4, aku $$5, aku $$6, aku $$7, aku $$8) {
      return fne.a($$0).a(a(a(fnf.a(dxl.U, dxl.ah, dxl.bh, dxl.z), dxq.b, $$1, $$2, $$3, $$4), dxq.a, $$5, $$6, $$7, $$8));
   }

   static fnb a(djk $$0, aku $$1, aku $$2, aku $$3, aku $$4, aku $$5) {
      return fnd.a($$0)
         .a(fnh.a().a(fni.c, $$1))
         .a(fnc.a().a(dxl.O, true), fnh.a().a(fni.c, $$2).a(fni.d, false))
         .a(fnc.a().a(dxl.P, true), fnh.a().a(fni.c, $$3).a(fni.d, false))
         .a(fnc.a().a(dxl.Q, true), fnh.a().a(fni.c, $$4).a(fni.d, false))
         .a(fnc.a().a(dxl.R, true), fnh.a().a(fni.c, $$5).a(fni.d, false));
   }

   static fnb c(djk $$0, aku $$1, aku $$2) {
      return fnd.a($$0)
         .a(fnh.a().a(fni.c, $$1))
         .a(fnc.a().a(dxl.O, true), fnh.a().a(fni.c, $$2).a(fni.d, true))
         .a(fnc.a().a(dxl.P, true), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b).a(fni.d, true))
         .a(fnc.a().a(dxl.Q, true), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c).a(fni.d, true))
         .a(fnc.a().a(dxl.R, true), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d).a(fni.d, true));
   }

   static fnb a(djk $$0, aku $$1, aku $$2, aku $$3) {
      return fnd.a($$0)
         .a(fnc.a().a(dxl.M, true), fnh.a().a(fni.c, $$1))
         .a(fnc.a().a(dxl.aa, dyg.b), fnh.a().a(fni.c, $$2).a(fni.d, true))
         .a(fnc.a().a(dxl.Z, dyg.b), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b).a(fni.d, true))
         .a(fnc.a().a(dxl.ab, dyg.b), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c).a(fni.d, true))
         .a(fnc.a().a(dxl.ac, dyg.b), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d).a(fni.d, true))
         .a(fnc.a().a(dxl.aa, dyg.c), fnh.a().a(fni.c, $$3).a(fni.d, true))
         .a(fnc.a().a(dxl.Z, dyg.c), fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b).a(fni.d, true))
         .a(fnc.a().a(dxl.ab, dyg.c), fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c).a(fni.d, true))
         .a(fnc.a().a(dxl.ac, dyg.c), fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d).a(fni.d, true));
   }

   static fnb a(djk $$0, aku $$1, aku $$2, aku $$3, aku $$4, boolean $$5) {
      return fne.a($$0, fnh.a().a(fni.d, $$5))
         .a(c())
         .a(
            fnf.a(dxl.u, dxl.z)
               .a(false, false, fnh.a().a(fni.c, $$2))
               .a(true, false, fnh.a().a(fni.c, $$4))
               .a(false, true, fnh.a().a(fni.c, $$1))
               .a(true, true, fnh.a().a(fni.c, $$3))
         );
   }

   static fnb b(djk $$0, aku $$1, aku $$2, aku $$3) {
      return fne.a($$0)
         .a(
            fnf.a(dxl.U, dxl.ai, dxl.bl)
               .a(jn.f, dxt.b, dyd.a, fnh.a().a(fni.c, $$2))
               .a(jn.e, dxt.b, dyd.a, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.d, dxt.b, dyd.a, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.c, dxt.b, dyd.a, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.f, dxt.b, dyd.e, fnh.a().a(fni.c, $$3))
               .a(jn.e, dxt.b, dyd.e, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.d, dxt.b, dyd.e, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.c, dxt.b, dyd.e, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.f, dxt.b, dyd.d, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.e, dxt.b, dyd.d, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.d, dxt.b, dyd.d, fnh.a().a(fni.c, $$3))
               .a(jn.c, dxt.b, dyd.d, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.f, dxt.b, dyd.c, fnh.a().a(fni.c, $$1))
               .a(jn.e, dxt.b, dyd.c, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.d, dxt.b, dyd.c, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.c, dxt.b, dyd.c, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.f, dxt.b, dyd.b, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.e, dxt.b, dyd.b, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.d, dxt.b, dyd.b, fnh.a().a(fni.c, $$1))
               .a(jn.c, dxt.b, dyd.b, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.f, dxt.a, dyd.a, fnh.a().a(fni.c, $$2).a(fni.a, fni.a.c).a(fni.d, true))
               .a(jn.e, dxt.a, dyd.a, fnh.a().a(fni.c, $$2).a(fni.a, fni.a.c).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.d, dxt.a, dyd.a, fnh.a().a(fni.c, $$2).a(fni.a, fni.a.c).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.c, dxt.a, dyd.a, fnh.a().a(fni.c, $$2).a(fni.a, fni.a.c).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.f, dxt.a, dyd.e, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.e, dxt.a, dyd.e, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.d, dxt.a, dyd.e, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.c, dxt.a, dyd.e, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.d, true))
               .a(jn.f, dxt.a, dyd.d, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.d, true))
               .a(jn.e, dxt.a, dyd.d, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.d, dxt.a, dyd.d, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.c, dxt.a, dyd.d, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.f, dxt.a, dyd.c, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.e, dxt.a, dyd.c, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.b, fni.a.d).a(fni.d, true))
               .a(jn.d, dxt.a, dyd.c, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.c, dxt.a, dyd.c, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.d, true))
               .a(jn.f, dxt.a, dyd.b, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.d, true))
               .a(jn.e, dxt.a, dyd.b, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.b, fni.a.c).a(fni.d, true))
               .a(jn.d, dxt.a, dyd.b, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.b, fni.a.b).a(fni.d, true))
               .a(jn.c, dxt.a, dyd.b, fnh.a().a(fni.c, $$1).a(fni.a, fni.a.c).a(fni.b, fni.a.d).a(fni.d, true))
         );
   }

   private static fnb c(djk $$0, aku $$1, aku $$2, aku $$3) {
      return fne.a($$0)
         .a(
            fnf.a(dxl.U, dxl.ai, dxl.z)
               .a(jn.c, dxt.b, false, fnh.a().a(fni.c, $$2))
               .a(jn.d, dxt.b, false, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c))
               .a(jn.f, dxt.b, false, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b))
               .a(jn.e, dxt.b, false, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d))
               .a(jn.c, dxt.a, false, fnh.a().a(fni.c, $$1))
               .a(jn.d, dxt.a, false, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c))
               .a(jn.f, dxt.a, false, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.b))
               .a(jn.e, dxt.a, false, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.d))
               .a(jn.c, dxt.b, true, fnh.a().a(fni.c, $$3))
               .a(jn.d, dxt.b, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c))
               .a(jn.f, dxt.b, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
               .a(jn.e, dxt.b, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d))
               .a(jn.c, dxt.a, true, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.c))
               .a(jn.d, dxt.a, true, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.a))
               .a(jn.f, dxt.a, true, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.d))
               .a(jn.e, dxt.a, true, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.c).a(fni.b, fni.a.b))
         );
   }

   private static fnb d(djk $$0, aku $$1, aku $$2, aku $$3) {
      return fne.a($$0)
         .a(
            fnf.a(dxl.U, dxl.ai, dxl.z)
               .a(jn.c, dxt.b, false, fnh.a().a(fni.c, $$2))
               .a(jn.d, dxt.b, false, fnh.a().a(fni.c, $$2))
               .a(jn.f, dxt.b, false, fnh.a().a(fni.c, $$2))
               .a(jn.e, dxt.b, false, fnh.a().a(fni.c, $$2))
               .a(jn.c, dxt.a, false, fnh.a().a(fni.c, $$1))
               .a(jn.d, dxt.a, false, fnh.a().a(fni.c, $$1))
               .a(jn.f, dxt.a, false, fnh.a().a(fni.c, $$1))
               .a(jn.e, dxt.a, false, fnh.a().a(fni.c, $$1))
               .a(jn.c, dxt.b, true, fnh.a().a(fni.c, $$3))
               .a(jn.d, dxt.b, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c))
               .a(jn.f, dxt.b, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
               .a(jn.e, dxt.b, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d))
               .a(jn.c, dxt.a, true, fnh.a().a(fni.c, $$3))
               .a(jn.d, dxt.a, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c))
               .a(jn.f, dxt.a, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
               .a(jn.e, dxt.a, true, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d))
         );
   }

   static fne c(djk $$0, aku $$1) {
      return fne.a($$0, fnh.a().a(fni.c, $$1));
   }

   private static fnf f() {
      return fnf.a(dxl.L).a(jn.a.b, fnh.a()).a(jn.a.c, fnh.a().a(fni.a, fni.a.b)).a(jn.a.a, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.b));
   }

   static fnb a(djk $$0, fnr $$1, BiConsumer<aku, fnn> $$2) {
      aku $$3 = fnq.g.a($$0, $$1, $$2);
      aku $$4 = fnq.h.a($$0, $$1, $$2);
      aku $$5 = fnq.i.a($$0, $$1, $$2);
      aku $$6 = fnq.j.a($$0, $$1, $$2);
      return fne.a($$0, fnh.a().a(fni.c, $$6))
         .a(fnf.a(dxl.L).a(jn.a.a, fnh.a().a(fni.c, $$3)).a(jn.a.b, fnh.a().a(fni.c, $$4)).a(jn.a.c, fnh.a().a(fni.c, $$5)));
   }

   static fnb d(djk $$0, aku $$1) {
      return fne.a($$0, fnh.a().a(fni.c, $$1)).a(f());
   }

   private void e(djk $$0, aku $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(djk $$0, fnt.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(djk $$0, fnt.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      this.b.accept(fne.a($$0, fnh.a().a(fni.c, $$2)).a(b()));
   }

   static fnb d(djk $$0, aku $$1, aku $$2) {
      return fne.a($$0)
         .a(
            fnf.a(dxl.L)
               .a(jn.a.b, fnh.a().a(fni.c, $$1))
               .a(jn.a.c, fnh.a().a(fni.c, $$2).a(fni.a, fni.a.b))
               .a(jn.a.a, fnh.a().a(fni.c, $$2).a(fni.a, fni.a.b).a(fni.b, fni.a.b))
         );
   }

   private void a(djk $$0, fnt.a $$1, fnt.a $$2) {
      aku $$3 = $$1.create($$0, this.d);
      aku $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(djk $$0) {
      Function<fnt.a, aku> $$1 = $$1x -> $$1x.updateTexture($$1xx -> $$1xx.a(fns.i, fnr.a($$0, "_active")))
            .updateTexture($$1xx -> $$1xx.a(fns.d, fnr.a($$0, "_top_active")))
            .createWithSuffix($$0, "_active", this.d);
      aku $$2 = fnt.w.create($$0, this.d);
      aku $$3 = fnt.x.create($$0, this.d);
      aku $$4 = $$1.apply(fnt.w);
      aku $$5 = $$1.apply(fnt.x);
      this.b
         .accept(
            fne.a($$0)
               .a(
                  fnf.a(dxl.L, dlf.c)
                     .a(jn.a.b, false, fnh.a().a(fni.c, $$2))
                     .a(jn.a.c, false, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.b))
                     .a(jn.a.a, false, fnh.a().a(fni.c, $$3).a(fni.a, fni.a.b).a(fni.b, fni.a.b))
                     .a(jn.a.b, true, fnh.a().a(fni.c, $$4))
                     .a(jn.a.c, true, fnh.a().a(fni.c, $$5).a(fni.a, fni.a.b))
                     .a(jn.a.a, true, fnh.a().a(fni.c, $$5).a(fni.a, fni.a.b).a(fni.b, fni.a.b))
               )
         );
   }

   private aku a(djk $$0, String $$1, fnp $$2, Function<aku, fnr> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fnr.a($$0, $$1)), this.d);
   }

   static fnb e(djk $$0, aku $$1, aku $$2) {
      return fne.a($$0).a(a(dxl.B, $$2, $$1));
   }

   static fnb e(djk $$0, aku $$1, aku $$2, aku $$3) {
      return fne.a($$0).a(fnf.a(dxl.bk).a(dyc.b, fnh.a().a(fni.c, $$1)).a(dyc.a, fnh.a().a(fni.c, $$2)).a(dyc.c, fnh.a().a(fni.c, $$3)));
   }

   public void a(djk $$0) {
      this.b($$0, fnt.a);
   }

   public void b(djk $$0, fnt.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(djk $$0, fnt.a $$1, int $$2) {
      aku $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fnm.a($$2));
   }

   private void g() {
      this.J(djm.ft);
      aku $$0 = this.a(cwr.gk, djm.ft);
      this.a(djm.ft, $$0, fnm.a(-12012264));
   }

   private void h(djk $$0) {
      aku $$1 = this.a($$0.j(), $$0);
      this.a($$0, $$1, new fmq());
   }

   private fmw.a i(djk $$0) {
      fnt $$1 = this.g.getOrDefault($$0, fnt.a.get($$0));
      return new fmw.a($$1.b()).a($$0, $$1.a());
   }

   public void a(djk $$0, djk $$1, djk $$2) {
      aku $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.j());
   }

   void j(djk $$0) {
      fnr $$1 = fnr.w($$0);
      aku $$2 = fnq.v.a($$0, $$1, this.d);
      aku $$3 = fnq.w.a($$0, $$1, this.d);
      aku $$4 = fnq.x.a($$0, $$1, this.d);
      aku $$5 = fnq.y.a($$0, $$1, this.d);
      aku $$6 = fnq.z.a($$0, $$1, this.d);
      aku $$7 = fnq.A.a($$0, $$1, this.d);
      aku $$8 = fnq.B.a($$0, $$1, this.d);
      aku $$9 = fnq.C.a($$0, $$1, this.d);
      this.b($$0.j());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(djk $$0, djk $$1) {
      aku $$2 = fnq.v.a($$0);
      aku $$3 = fnq.w.a($$0);
      aku $$4 = fnq.x.a($$0);
      aku $$5 = fnq.y.a($$0);
      aku $$6 = fnq.z.a($$0);
      aku $$7 = fnq.A.a($$0);
      aku $$8 = fnq.B.a($$0);
      aku $$9 = fnq.C.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(djk $$0) {
      fnr $$1 = fnr.b($$0);
      aku $$2 = fnq.ak.a($$0, $$1, this.d);
      aku $$3 = fnq.al.a($$0, $$1, this.d);
      aku $$4 = fnq.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(djk $$0) {
      fnr $$1 = fnr.b($$0);
      aku $$2 = fnq.ah.a($$0, $$1, this.d);
      aku $$3 = fnq.ai.a($$0, $$1, this.d);
      aku $$4 = fnq.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(djk $$0, djk $$1) {
      aku $$2 = fnq.ah.a($$0);
      aku $$3 = fnq.ai.a($$0);
      aku $$4 = fnq.aj.a($$0);
      this.c.a($$0.j(), $$1.j());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      aku $$0 = fno.a(djm.tf);
      aku $$1 = fno.a(djm.tf, "_partial_tilt");
      aku $$2 = fno.a(djm.tf, "_full_tilt");
      this.b
         .accept(
            fne.a(djm.tf)
               .a(b())
               .a(fnf.a(dxl.bo).a(dyf.a, fnh.a().a(fni.c, $$0)).a(dyf.b, fnh.a().a(fni.c, $$0)).a(dyf.c, fnh.a().a(fni.c, $$1)).a(dyf.d, fnh.a().a(fni.c, $$2)))
         );
   }

   private fmw.e m(djk $$0) {
      return new fmw.e(fnr.q($$0));
   }

   private void n(djk $$0) {
      this.d($$0, $$0);
   }

   private void d(djk $$0, djk $$1) {
      this.b.accept(c($$0, fno.a($$1)));
   }

   private void a(djk $$0, fmw.d $$1) {
      this.a($$0.j(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(djk $$0, fmw.d $$1, fnr $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djk $$0, fmw.d $$1) {
      fnr $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(djk $$0, fmw.d $$1, fnr $$2) {
      aku $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(djk $$0, fmw.d $$1, dxx<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fnf $$4 = fnf.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fnr $$5 = fnr.c(fnr.a($$0, $$4x));
            aku $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fnh.a().a(fni.c, $$6);
         });
         this.b($$0.j());
         this.b.accept(fne.a($$0).a($$4));
      }
   }

   private void a(djk $$0, djk $$1, fmw.d $$2) {
      this.a($$0.j(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(djk $$0, djk $$1, fmw.d $$2) {
      this.b($$0, $$2);
      fnr $$3 = $$2.b($$0);
      aku $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(djk $$0, djk $$1) {
      fnt $$2 = fnt.q.get($$0);
      aku $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      aku $$4 = fnq.aF.a($$1, $$2.b(), this.d);
      this.b.accept(fne.a($$1, fnh.a().a(fni.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(djk $$0, djk $$1) {
      this.b($$0.j());
      fnr $$2 = fnr.k($$0);
      fnr $$3 = fnr.a($$0, $$1);
      aku $$4 = fnq.aX.a($$1, $$3, this.d);
      this.b
         .accept(
            fne.a($$1, fnh.a().a(fni.c, $$4))
               .a(fnf.a(dxl.U).a(jn.e, fnh.a()).a(jn.d, fnh.a().a(fni.b, fni.a.d)).a(jn.c, fnh.a().a(fni.b, fni.a.b)).a(jn.f, fnh.a().a(fni.b, fni.a.c)))
         );
      this.b.accept(fne.a($$0).a(fnf.a(dxl.ay).a($$2x -> fnh.a().a(fni.c, fnq.aW[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      djk $$0 = djm.le;
      this.b($$0.j());
      aku $$1 = fno.a($$0, "_top");
      aku $$2 = fno.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      djk $$0 = djm.ld;
      this.b($$0.j());
      fnf $$1 = fnf.a(dpd.d, dxl.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fnh.a().a(fni.c, fno.a($$0, "_top_stage_" + $$1x));
            case b -> fnh.a().a(fni.c, fno.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fne.a($$0).a($$1));
   }

   private void a(djk $$0, djk $$1, djk $$2, djk $$3, djk $$4, djk $$5, djk $$6, djk $$7) {
      this.a($$0, fmw.d.b);
      this.a($$1, fmw.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(djk $$0, fmw.d $$1) {
      aku $$2 = this.a($$0, "_top", $$1.a(), fnr::c);
      aku $$3 = this.a($$0, "_bottom", $$1.a(), fnr::c);
      this.f($$0, $$2, $$3);
   }

   private void d(djk $$0, fmw.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(djk $$0) {
      aku $$1 = this.a($$0.j(), $$0, "_top");
      this.a($$0, $$1, new fmq());
      this.c($$0, fmw.d.a);
   }

   private void k() {
      this.a(djm.jb, "_front");
      aku $$0 = fno.a(djm.jb, "_top");
      aku $$1 = this.a(djm.jb, "_bottom", fmw.d.b.a(), fnr::c);
      this.f(djm.jb, $$0, $$1);
   }

   private void l() {
      aku $$0 = this.a(djm.bE, "_top", fnq.br, fnr::a);
      aku $$1 = this.a(djm.bE, "_bottom", fnq.br, fnr::a);
      this.f(djm.bE, $$0, $$1);
   }

   private void m() {
      aku $$0 = fno.a(djm.th, "_top");
      aku $$1 = fno.a(djm.th, "_bottom");
      this.b.accept(fne.a(djm.th).a(b()).a(fnf.a(dxl.ah).a(dxq.b, fnh.a().a(fni.c, $$1)).a(dxq.a, fnh.a().a(fni.c, $$0))));
   }

   private void f(djk $$0, aku $$1, aku $$2) {
      this.b.accept(fne.a($$0).a(fnf.a(dxl.ah).a(dxq.b, fnh.a().a(fni.c, $$2)).a(dxq.a, fnh.a().a(fni.c, $$1))));
   }

   private void p(djk $$0) {
      fnr $$1 = fnr.h($$0);
      fnr $$2 = fnr.e(fnr.a($$0, "_corner"));
      aku $$3 = fnq.au.a($$0, $$1, this.d);
      aku $$4 = fnq.av.a($$0, $$2, this.d);
      aku $$5 = fnq.aw.a($$0, $$1, this.d);
      aku $$6 = fnq.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fne.a($$0)
               .a(
                  fnf.a(dxl.aj)
                     .a(dxy.a, fnh.a().a(fni.c, $$3))
                     .a(dxy.b, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
                     .a(dxy.c, fnh.a().a(fni.c, $$5).a(fni.b, fni.a.b))
                     .a(dxy.d, fnh.a().a(fni.c, $$6).a(fni.b, fni.a.b))
                     .a(dxy.e, fnh.a().a(fni.c, $$5))
                     .a(dxy.f, fnh.a().a(fni.c, $$6))
                     .a(dxy.g, fnh.a().a(fni.c, $$4))
                     .a(dxy.h, fnh.a().a(fni.c, $$4).a(fni.b, fni.a.b))
                     .a(dxy.i, fnh.a().a(fni.c, $$4).a(fni.b, fni.a.c))
                     .a(dxy.j, fnh.a().a(fni.c, $$4).a(fni.b, fni.a.d))
               )
         );
   }

   private void q(djk $$0) {
      aku $$1 = this.a($$0, "", fnq.au, fnr::e);
      aku $$2 = this.a($$0, "", fnq.aw, fnr::e);
      aku $$3 = this.a($$0, "", fnq.ax, fnr::e);
      aku $$4 = this.a($$0, "_on", fnq.au, fnr::e);
      aku $$5 = this.a($$0, "_on", fnq.aw, fnr::e);
      aku $$6 = this.a($$0, "_on", fnq.ax, fnr::e);
      fnf $$7 = fnf.a(dxl.B, dxl.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return fnh.a().a(fni.c, $$6x ? $$4 : $$1);
            case b:
               return fnh.a().a(fni.c, $$6x ? $$4 : $$1).a(fni.b, fni.a.b);
            case c:
               return fnh.a().a(fni.c, $$6x ? $$5 : $$2).a(fni.b, fni.a.b);
            case d:
               return fnh.a().a(fni.c, $$6x ? $$6 : $$3).a(fni.b, fni.a.b);
            case e:
               return fnh.a().a(fni.c, $$6x ? $$5 : $$2);
            case f:
               return fnh.a().a(fni.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fne.a($$0).a($$7));
   }

   private void a(djk $$0, cwj $$1) {
      aku $$2 = fnq.aa.a($$0, fnr.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(djk $$0, aku $$1) {
      aku $$2 = fnq.aa.a($$0, fnr.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private aku g(djk $$0, djk $$1) {
      return fnq.aa.a($$0, fnr.x($$1), this.d);
   }

   public void a(djk $$0, djk $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(djk $$0) {
      this.a($$0, $$0);
   }

   private void h(djk $$0, djk $$1) {
      this.a($$0);
      aku $$2 = fnt.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(djk $$0) {
      this.b($$0.j());
      aku $$1 = fnt.l.create($$0, this.d);
      aku $$2 = fnt.m.create($$0, this.d);
      aku $$3 = fnt.n.create($$0, this.d);
      aku $$4 = fnt.o.create($$0, this.d);
      this.b
         .accept(
            fnd.a($$0)
               .a(fnc.a().a(dxl.V, 1, 2, 3, 4).a(dxl.U, jn.c), fnh.a().a(fni.c, $$1))
               .a(fnc.a().a(dxl.V, 1, 2, 3, 4).a(dxl.U, jn.f), fnh.a().a(fni.c, $$1).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.V, 1, 2, 3, 4).a(dxl.U, jn.d), fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c))
               .a(fnc.a().a(dxl.V, 1, 2, 3, 4).a(dxl.U, jn.e), fnh.a().a(fni.c, $$1).a(fni.b, fni.a.d))
               .a(fnc.a().a(dxl.V, 2, 3, 4).a(dxl.U, jn.c), fnh.a().a(fni.c, $$2))
               .a(fnc.a().a(dxl.V, 2, 3, 4).a(dxl.U, jn.f), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.V, 2, 3, 4).a(dxl.U, jn.d), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c))
               .a(fnc.a().a(dxl.V, 2, 3, 4).a(dxl.U, jn.e), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d))
               .a(fnc.a().a(dxl.V, 3, 4).a(dxl.U, jn.c), fnh.a().a(fni.c, $$3))
               .a(fnc.a().a(dxl.V, 3, 4).a(dxl.U, jn.f), fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.V, 3, 4).a(dxl.U, jn.d), fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c))
               .a(fnc.a().a(dxl.V, 3, 4).a(dxl.U, jn.e), fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d))
               .a(fnc.a().a(dxl.V, 4).a(dxl.U, jn.c), fnh.a().a(fni.c, $$4))
               .a(fnc.a().a(dxl.V, 4).a(dxl.U, jn.f), fnh.a().a(fni.c, $$4).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.V, 4).a(dxl.U, jn.d), fnh.a().a(fni.c, $$4).a(fni.b, fni.a.c))
               .a(fnc.a().a(dxl.V, 4).a(dxl.U, jn.e), fnh.a().a(fni.c, $$4).a(fni.b, fni.a.d))
         );
   }

   private void a(fnt.a $$0, djk... $$1) {
      for (djk $$2 : $$1) {
         aku $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fnt.a $$0, djk... $$1) {
      for (djk $$2 : $$1) {
         aku $$3 = $$0.create($$2, this.d);
         this.b.accept(fne.a($$2, fnh.a().a(fni.c, $$3)).a(c()));
      }
   }

   private void i(djk $$0, djk $$1) {
      this.a($$0);
      fnr $$2 = fnr.b($$0, $$1);
      aku $$3 = fnq.aL.a($$1, $$2, this.d);
      aku $$4 = fnq.aM.a($$1, $$2, this.d);
      aku $$5 = fnq.aN.a($$1, $$2, this.d);
      aku $$6 = fnq.aJ.a($$1, $$2, this.d);
      aku $$7 = fnq.aK.a($$1, $$2, this.d);
      cwj $$8 = $$1.j();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fnd.a($$1)
               .a(fnh.a().a(fni.c, $$3))
               .a(fnc.a().a(dxl.O, true), fnh.a().a(fni.c, $$4))
               .a(fnc.a().a(dxl.P, true), fnh.a().a(fni.c, $$4).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.Q, true), fnh.a().a(fni.c, $$5))
               .a(fnc.a().a(dxl.R, true), fnh.a().a(fni.c, $$5).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.O, false), fnh.a().a(fni.c, $$6))
               .a(fnc.a().a(dxl.P, false), fnh.a().a(fni.c, $$7))
               .a(fnc.a().a(dxl.Q, false), fnh.a().a(fni.c, $$7).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.R, false), fnh.a().a(fni.c, $$6).a(fni.b, fni.a.d))
         );
   }

   private void t(djk $$0) {
      fnr $$1 = fnr.C($$0);
      aku $$2 = fnq.aO.a($$0, $$1, this.d);
      aku $$3 = this.a($$0, "_conditional", fnq.aO, $$1x -> $$1.c(fns.i, $$1x));
      this.b.accept(fne.a($$0).a(a(dxl.g, $$3, $$2)).a(e()));
   }

   private void u(djk $$0) {
      aku $$1 = fnt.r.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fnh> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fnh.a().a(fni.c, fno.a(djm.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fnd.a(djm.nB)
               .a(fnc.a().a(dxl.at, 0), this.a(0))
               .a(fnc.a().a(dxl.at, 1), this.a(1))
               .a(fnc.a().a(dxl.bn, dxh.b), fnh.a().a(fni.c, fno.a(djm.nB, "_small_leaves")))
               .a(fnc.a().a(dxl.bn, dxh.c), fnh.a().a(fni.c, fno.a(djm.nB, "_large_leaves")))
         );
   }

   private fnf o() {
      return fnf.a(dxl.S)
         .a(jn.a, fnh.a().a(fni.a, fni.a.c))
         .a(jn.b, fnh.a())
         .a(jn.c, fnh.a().a(fni.a, fni.a.b))
         .a(jn.d, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.c))
         .a(jn.e, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.d))
         .a(jn.f, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.b));
   }

   private void p() {
      aku $$0 = fnr.a(djm.ow, "_top_open");
      this.b
         .accept(
            fne.a(djm.ow)
               .a(this.o())
               .a(
                  fnf.a(dxl.z)
                     .a(false, fnh.a().a(fni.c, fnt.f.create(djm.ow, this.d)))
                     .a(true, fnh.a().a(fni.c, fnt.f.get(djm.ow).a($$1 -> $$1.a(fns.f, $$0)).a(djm.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fnf a(dxx<T> $$0, T $$1, aku $$2, aku $$3) {
      fnh $$4 = fnh.a().a(fni.c, $$2);
      fnh $$5 = fnh.a().a(fni.c, $$3);
      return fnf.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(djk $$0, Function<djk, fnr> $$1) {
      fnr $$2 = $$1.apply($$0).b(fns.i, fns.c);
      fnr $$3 = $$2.c(fns.g, fnr.a($$0, "_front_honey"));
      aku $$4 = fnq.q.a($$0, "_empty", $$2, this.d);
      aku $$5 = fnq.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.j(), fnm.a(dje.c, fnm.a($$4), Map.of(5, fnm.a($$5))));
      this.b.accept(fne.a($$0).a(b()).a(a(dje.c, 5, $$5, $$4)));
   }

   private void a(djk $$0, dxx<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<aku> $$3 = new Int2ObjectOpenHashMap();
         fnf $$4 = fnf.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            aku $$5 = (aku)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, fnq.aY, fnr::g));
            return fnh.a().a(fni.c, $$5);
         });
         this.b($$0.j());
         this.b.accept(fne.a($$0).a($$4));
      }
   }

   private void q() {
      aku $$0 = fno.a(djm.oF, "_floor");
      aku $$1 = fno.a(djm.oF, "_ceiling");
      aku $$2 = fno.a(djm.oF, "_wall");
      aku $$3 = fno.a(djm.oF, "_between_walls");
      this.b(cwr.xs);
      this.b
         .accept(
            fne.a(djm.oF)
               .a(
                  fnf.a(dxl.U, dxl.Y)
                     .a(jn.c, dxj.a, fnh.a().a(fni.c, $$0))
                     .a(jn.d, dxj.a, fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c))
                     .a(jn.f, dxj.a, fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b))
                     .a(jn.e, dxj.a, fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d))
                     .a(jn.c, dxj.b, fnh.a().a(fni.c, $$1))
                     .a(jn.d, dxj.b, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c))
                     .a(jn.f, dxj.b, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.b))
                     .a(jn.e, dxj.b, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.d))
                     .a(jn.c, dxj.c, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d))
                     .a(jn.d, dxj.c, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b))
                     .a(jn.f, dxj.c, fnh.a().a(fni.c, $$2))
                     .a(jn.e, dxj.c, fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c))
                     .a(jn.d, dxj.d, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
                     .a(jn.c, dxj.d, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d))
                     .a(jn.f, dxj.d, fnh.a().a(fni.c, $$3))
                     .a(jn.e, dxj.d, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fne.a(djm.oB, fnh.a().a(fni.c, fno.a(djm.oB)))
               .a(
                  fnf.a(dxl.X, dxl.U)
                     .a(dxg.a, jn.c, fnh.a())
                     .a(dxg.a, jn.f, fnh.a().a(fni.b, fni.a.b))
                     .a(dxg.a, jn.d, fnh.a().a(fni.b, fni.a.c))
                     .a(dxg.a, jn.e, fnh.a().a(fni.b, fni.a.d))
                     .a(dxg.b, jn.c, fnh.a().a(fni.a, fni.a.b))
                     .a(dxg.b, jn.f, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.b))
                     .a(dxg.b, jn.d, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.c))
                     .a(dxg.b, jn.e, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.d))
                     .a(dxg.c, jn.d, fnh.a().a(fni.a, fni.a.c))
                     .a(dxg.c, jn.e, fnh.a().a(fni.a, fni.a.c).a(fni.b, fni.a.b))
                     .a(dxg.c, jn.c, fnh.a().a(fni.a, fni.a.c).a(fni.b, fni.a.c))
                     .a(dxg.c, jn.f, fnh.a().a(fni.a, fni.a.c).a(fni.b, fni.a.d))
               )
         );
   }

   private void d(djk $$0, fnt.a $$1) {
      aku $$2 = $$1.create($$0, this.d);
      aku $$3 = fnr.a($$0, "_front_on");
      aku $$4 = $$1.get($$0).a($$1x -> $$1x.a(fns.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fne.a($$0).a(a(dxl.v, $$4, $$2)).a(b()));
   }

   private void a(djk... $$0) {
      aku $$1 = fno.a("campfire_off");

      for (djk $$2 : $$0) {
         aku $$3 = fnq.bf.a($$2, fnr.H($$2), this.d);
         this.b($$2.j());
         this.b.accept(fne.a($$2).a(a(dxl.v, $$3, $$1)).a(c()));
      }
   }

   private void v(djk $$0) {
      aku $$1 = fnq.bA.a($$0, fnr.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void w(djk $$0) {
      aku $$1;
      if ($$0 == djm.tL) {
         $$1 = fnq.bC.a($$0, fnr.p($$0), this.d);
      } else {
         $$1 = fnq.bB.a($$0, fnr.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fnr $$0 = fnr.a(fnr.J(djm.cs), fnr.J(djm.n));
      aku $$1 = fnq.j.a(djm.cs, $$0, this.d);
      this.b.accept(c(djm.cs, $$1));
   }

   private void t() {
      this.b(cwr.me);
      this.b
         .accept(
            fnd.a(djm.cE)
               .a(
                  fnc.b(
                     fnc.a().a(dxl.ae, dxz.c).a(dxl.ad, dxz.c).a(dxl.af, dxz.c).a(dxl.ag, dxz.c),
                     fnc.a().a(dxl.ae, dxz.b, dxz.a).a(dxl.ad, dxz.b, dxz.a),
                     fnc.a().a(dxl.ad, dxz.b, dxz.a).a(dxl.af, dxz.b, dxz.a),
                     fnc.a().a(dxl.af, dxz.b, dxz.a).a(dxl.ag, dxz.b, dxz.a),
                     fnc.a().a(dxl.ag, dxz.b, dxz.a).a(dxl.ae, dxz.b, dxz.a)
                  ),
                  fnh.a().a(fni.c, fno.a("redstone_dust_dot"))
               )
               .a(fnc.a().a(dxl.ae, dxz.b, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_side0")))
               .a(fnc.a().a(dxl.af, dxz.b, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_side_alt0")))
               .a(fnc.a().a(dxl.ad, dxz.b, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_side_alt1")).a(fni.b, fni.a.d))
               .a(fnc.a().a(dxl.ag, dxz.b, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_side1")).a(fni.b, fni.a.d))
               .a(fnc.a().a(dxl.ae, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_up")))
               .a(fnc.a().a(dxl.ad, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_up")).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.af, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_up")).a(fni.b, fni.a.c))
               .a(fnc.a().a(dxl.ag, dxz.a), fnh.a().a(fni.c, fno.a("redstone_dust_up")).a(fni.b, fni.a.d))
         );
   }

   private void u() {
      this.b(cwr.mi);
      this.b
         .accept(
            fne.a(djm.hv)
               .a(c())
               .a(
                  fnf.a(dxl.bg, dxl.B)
                     .a(dxo.a, false, fnh.a().a(fni.c, fno.a(djm.hv)))
                     .a(dxo.a, true, fnh.a().a(fni.c, fno.a(djm.hv, "_on")))
                     .a(dxo.b, false, fnh.a().a(fni.c, fno.a(djm.hv, "_subtract")))
                     .a(dxo.b, true, fnh.a().a(fni.c, fno.a(djm.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fnr $$0 = fnr.a(djm.kq);
      fnr $$1 = fnr.a(fnr.a(djm.kd, "_side"), $$0.a(fns.f));
      aku $$2 = fnq.ab.a(djm.kd, $$1, this.d);
      aku $$3 = fnq.ac.a(djm.kd, $$1, this.d);
      aku $$4 = fnq.j.b(djm.kd, "_double", $$1, this.d);
      this.b.accept(e(djm.kd, $$2, $$3, $$4));
      this.b.accept(c(djm.kq, fnq.c.a(djm.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cwr.tn);
      this.b
         .accept(
            fnd.a(djm.fN)
               .a(fnh.a().a(fni.c, fnr.J(djm.fN)))
               .a(fnc.a().a(dxl.o, true), fnh.a().a(fni.c, fnr.a(djm.fN, "_bottle0")))
               .a(fnc.a().a(dxl.p, true), fnh.a().a(fni.c, fnr.a(djm.fN, "_bottle1")))
               .a(fnc.a().a(dxl.q, true), fnh.a().a(fni.c, fnr.a(djm.fN, "_bottle2")))
               .a(fnc.a().a(dxl.o, false), fnh.a().a(fni.c, fnr.a(djm.fN, "_empty0")))
               .a(fnc.a().a(dxl.p, false), fnh.a().a(fni.c, fnr.a(djm.fN, "_empty1")))
               .a(fnc.a().a(dxl.q, false), fnh.a().a(fni.c, fnr.a(djm.fN, "_empty2")))
         );
   }

   private void x(djk $$0) {
      aku $$1 = fnq.bw.a($$0, fnr.b($$0), this.d);
      aku $$2 = fno.a("mushroom_block_inside");
      this.b
         .accept(
            fnd.a($$0)
               .a(fnc.a().a(dxl.O, true), fnh.a().a(fni.c, $$1))
               .a(fnc.a().a(dxl.P, true), fnh.a().a(fni.c, $$1).a(fni.b, fni.a.b).a(fni.d, true))
               .a(fnc.a().a(dxl.Q, true), fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c).a(fni.d, true))
               .a(fnc.a().a(dxl.R, true), fnh.a().a(fni.c, $$1).a(fni.b, fni.a.d).a(fni.d, true))
               .a(fnc.a().a(dxl.M, true), fnh.a().a(fni.c, $$1).a(fni.a, fni.a.d).a(fni.d, true))
               .a(fnc.a().a(dxl.N, true), fnh.a().a(fni.c, $$1).a(fni.a, fni.a.b).a(fni.d, true))
               .a(fnc.a().a(dxl.O, false), fnh.a().a(fni.c, $$2))
               .a(fnc.a().a(dxl.P, false), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b).a(fni.d, false))
               .a(fnc.a().a(dxl.Q, false), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c).a(fni.d, false))
               .a(fnc.a().a(dxl.R, false), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d).a(fni.d, false))
               .a(fnc.a().a(dxl.M, false), fnh.a().a(fni.c, $$2).a(fni.a, fni.a.d).a(fni.d, false))
               .a(fnc.a().a(dxl.N, false), fnh.a().a(fni.c, $$2).a(fni.a, fni.a.b).a(fni.d, false))
         );
      this.a($$0, fnt.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cwr.sy);
      this.b
         .accept(
            fne.a(djm.et)
               .a(
                  fnf.a(dxl.aB)
                     .a(0, fnh.a().a(fni.c, fno.a(djm.et)))
                     .a(1, fnh.a().a(fni.c, fno.a(djm.et, "_slice1")))
                     .a(2, fnh.a().a(fni.c, fno.a(djm.et, "_slice2")))
                     .a(3, fnh.a().a(fni.c, fno.a(djm.et, "_slice3")))
                     .a(4, fnh.a().a(fni.c, fno.a(djm.et, "_slice4")))
                     .a(5, fnh.a().a(fni.c, fno.a(djm.et, "_slice5")))
                     .a(6, fnh.a().a(fni.c, fno.a(djm.et, "_slice6")))
               )
         );
   }

   private void y() {
      fnr $$0 = new fnr()
         .a(fns.c, fnr.a(djm.oz, "_side3"))
         .a(fns.o, fnr.J(djm.t))
         .a(fns.n, fnr.a(djm.oz, "_top"))
         .a(fns.j, fnr.a(djm.oz, "_side3"))
         .a(fns.l, fnr.a(djm.oz, "_side3"))
         .a(fns.k, fnr.a(djm.oz, "_side1"))
         .a(fns.m, fnr.a(djm.oz, "_side2"));
      this.b.accept(c(djm.oz, fnq.a.a(djm.oz, $$0, this.d)));
   }

   private void z() {
      fnr $$0 = new fnr()
         .a(fns.c, fnr.a(djm.oD, "_front"))
         .a(fns.o, fnr.a(djm.oD, "_bottom"))
         .a(fns.n, fnr.a(djm.oD, "_top"))
         .a(fns.j, fnr.a(djm.oD, "_front"))
         .a(fns.k, fnr.a(djm.oD, "_front"))
         .a(fns.l, fnr.a(djm.oD, "_side"))
         .a(fns.m, fnr.a(djm.oD, "_side"));
      this.b.accept(c(djm.oD, fnq.a.a(djm.oD, $$0, this.d)));
   }

   private void a(djk $$0, djk $$1, BiFunction<djk, djk, fnr> $$2) {
      fnr $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, fnq.a.a($$0, $$3, this.d)));
   }

   public void b(djk $$0) {
      fnr $$1 = new fnr()
         .a(fns.c, fnr.a($$0, "_particle"))
         .a(fns.o, fnr.a($$0, "_down"))
         .a(fns.n, fnr.a($$0, "_up"))
         .a(fns.j, fnr.a($$0, "_north"))
         .a(fns.k, fnr.a($$0, "_south"))
         .a(fns.l, fnr.a($$0, "_east"))
         .a(fns.m, fnr.a($$0, "_west"));
      this.b.accept(c($$0, fnq.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fnr $$0 = fnr.n(djm.fn);
      this.b.accept(c(djm.fn, fno.a(djm.fn)));
      this.a(djm.er, $$0);
      this.a(djm.es, $$0);
   }

   private void a(djk $$0, fnr $$1) {
      aku $$2 = fnq.p.a($$0, $$1.c(fns.g, fnr.J($$0)), this.d);
      this.b.accept(fne.a($$0, fnh.a().a(fni.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cwr.to);
      this.n(djm.fO);
      this.b.accept(c(djm.fQ, fnq.bz.a(djm.fQ, fnr.j(fnr.a(djm.K, "_still")), this.d)));
      this.b
         .accept(
            fne.a(djm.fP)
               .a(
                  fnf.a(dnv.g)
                     .a(1, fnh.a().a(fni.c, fnq.bx.a(djm.fP, "_level1", fnr.j(fnr.a(djm.J, "_still")), this.d)))
                     .a(2, fnh.a().a(fni.c, fnq.by.a(djm.fP, "_level2", fnr.j(fnr.a(djm.J, "_still")), this.d)))
                     .a(3, fnh.a().a(fni.c, fnq.bz.a(djm.fP, "_full", fnr.j(fnr.a(djm.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fne.a(djm.fR)
               .a(
                  fnf.a(dnv.g)
                     .a(1, fnh.a().a(fni.c, fnq.bx.a(djm.fR, "_level1", fnr.j(fnr.J(djm.rr)), this.d)))
                     .a(2, fnh.a().a(fni.c, fnq.by.a(djm.fR, "_level2", fnr.j(fnr.J(djm.rr)), this.d)))
                     .a(3, fnh.a().a(fni.c, fnq.bz.a(djm.fR, "_full", fnr.j(fnr.J(djm.rr)), this.d)))
               )
         );
   }

   private void C() {
      fnr $$0 = fnr.b(djm.kX);
      aku $$1 = fnq.aH.a(djm.kX, $$0, this.d);
      aku $$2 = this.a(djm.kX, "_dead", fnq.aH, $$1x -> $$0.c(fns.b, $$1x));
      this.b.accept(fne.a(djm.kX).a(a(dxl.ax, 5, $$2, $$1)));
   }

   private void D() {
      aku $$0 = fno.a(djm.tS);
      aku $$1 = fno.a(djm.tS, "_triggered");
      aku $$2 = fno.a(djm.tS, "_crafting");
      aku $$3 = fno.a(djm.tS, "_crafting_triggered");
      this.b
         .accept(
            fne.a(djm.tS)
               .a(fnf.a(dxl.W).a($$0x -> this.a($$0x, fnh.a())))
               .a(
                  fnf.a(dxl.H, dld.b)
                     .a(false, false, fnh.a().a(fni.c, $$0))
                     .a(true, true, fnh.a().a(fni.c, $$3))
                     .a(true, false, fnh.a().a(fni.c, $$1))
                     .a(false, true, fnh.a().a(fni.c, $$2))
               )
         );
   }

   private void y(djk $$0) {
      fnr $$1 = new fnr().a(fns.f, fnr.a(djm.cL, "_top")).a(fns.i, fnr.a(djm.cL, "_side")).a(fns.g, fnr.a($$0, "_front"));
      fnr $$2 = new fnr().a(fns.i, fnr.a(djm.cL, "_top")).a(fns.g, fnr.a($$0, "_front_vertical"));
      aku $$3 = fnq.p.a($$0, $$1, this.d);
      aku $$4 = fnq.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fne.a($$0)
               .a(
                  fnf.a(dxl.S)
                     .a(jn.a, fnh.a().a(fni.c, $$4).a(fni.a, fni.a.c))
                     .a(jn.b, fnh.a().a(fni.c, $$4))
                     .a(jn.c, fnh.a().a(fni.c, $$3))
                     .a(jn.f, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
                     .a(jn.d, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c))
                     .a(jn.e, fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d))
               )
         );
   }

   private void E() {
      aku $$0 = fno.a(djm.fT);
      aku $$1 = fno.a(djm.fT, "_filled");
      this.b.accept(fne.a(djm.fT).a(fnf.a(dxl.l).a(false, fnh.a().a(fni.c, $$0)).a(true, fnh.a().a(fni.c, $$1))).a(c()));
   }

   private void F() {
      aku $$0 = fno.a(djm.kW, "_side");
      aku $$1 = fno.a(djm.kW, "_noside");
      aku $$2 = fno.a(djm.kW, "_noside1");
      aku $$3 = fno.a(djm.kW, "_noside2");
      aku $$4 = fno.a(djm.kW, "_noside3");
      this.b
         .accept(
            fnd.a(djm.kW)
               .a(fnc.a().a(dxl.O, true), fnh.a().a(fni.c, $$0))
               .a(fnc.a().a(dxl.P, true), fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b).a(fni.d, true))
               .a(fnc.a().a(dxl.Q, true), fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c).a(fni.d, true))
               .a(fnc.a().a(dxl.R, true), fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d).a(fni.d, true))
               .a(fnc.a().a(dxl.M, true), fnh.a().a(fni.c, $$0).a(fni.a, fni.a.d).a(fni.d, true))
               .a(fnc.a().a(dxl.N, true), fnh.a().a(fni.c, $$0).a(fni.a, fni.a.b).a(fni.d, true))
               .a(fnc.a().a(dxl.O, false), fnh.a().a(fni.c, $$1).a(fni.e, 2), fnh.a().a(fni.c, $$2), fnh.a().a(fni.c, $$3), fnh.a().a(fni.c, $$4))
               .a(
                  fnc.a().a(dxl.P, false),
                  fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b).a(fni.d, true),
                  fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b).a(fni.d, true),
                  fnh.a().a(fni.c, $$4).a(fni.b, fni.a.b).a(fni.d, true),
                  fnh.a().a(fni.c, $$1).a(fni.e, 2).a(fni.b, fni.a.b).a(fni.d, true)
               )
               .a(
                  fnc.a().a(dxl.Q, false),
                  fnh.a().a(fni.c, $$3).a(fni.b, fni.a.c).a(fni.d, true),
                  fnh.a().a(fni.c, $$4).a(fni.b, fni.a.c).a(fni.d, true),
                  fnh.a().a(fni.c, $$1).a(fni.e, 2).a(fni.b, fni.a.c).a(fni.d, true),
                  fnh.a().a(fni.c, $$2).a(fni.b, fni.a.c).a(fni.d, true)
               )
               .a(
                  fnc.a().a(dxl.R, false),
                  fnh.a().a(fni.c, $$4).a(fni.b, fni.a.d).a(fni.d, true),
                  fnh.a().a(fni.c, $$1).a(fni.e, 2).a(fni.b, fni.a.d).a(fni.d, true),
                  fnh.a().a(fni.c, $$2).a(fni.b, fni.a.d).a(fni.d, true),
                  fnh.a().a(fni.c, $$3).a(fni.b, fni.a.d).a(fni.d, true)
               )
               .a(
                  fnc.a().a(dxl.M, false),
                  fnh.a().a(fni.c, $$1).a(fni.e, 2).a(fni.a, fni.a.d).a(fni.d, true),
                  fnh.a().a(fni.c, $$4).a(fni.a, fni.a.d).a(fni.d, true),
                  fnh.a().a(fni.c, $$2).a(fni.a, fni.a.d).a(fni.d, true),
                  fnh.a().a(fni.c, $$3).a(fni.a, fni.a.d).a(fni.d, true)
               )
               .a(
                  fnc.a().a(dxl.N, false),
                  fnh.a().a(fni.c, $$4).a(fni.a, fni.a.b).a(fni.d, true),
                  fnh.a().a(fni.c, $$3).a(fni.a, fni.a.b).a(fni.d, true),
                  fnh.a().a(fni.c, $$2).a(fni.a, fni.a.b).a(fni.d, true),
                  fnh.a().a(fni.c, $$1).a(fni.e, 2).a(fni.a, fni.a.b).a(fni.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fnd.a(djm.pE)
               .a(fnh.a().a(fni.c, fnr.J(djm.pE)))
               .a(fnc.a().a(dxl.aO, 1), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents1")))
               .a(fnc.a().a(dxl.aO, 2), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents2")))
               .a(fnc.a().a(dxl.aO, 3), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents3")))
               .a(fnc.a().a(dxl.aO, 4), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents4")))
               .a(fnc.a().a(dxl.aO, 5), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents5")))
               .a(fnc.a().a(dxl.aO, 6), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents6")))
               .a(fnc.a().a(dxl.aO, 7), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents7")))
               .a(fnc.a().a(dxl.aO, 8), fnh.a().a(fni.c, fnr.a(djm.pE, "_contents_ready")))
         );
   }

   private void z(djk $$0) {
      aku $$1 = fnq.c.a($$0, fnr.a($$0), this.d);
      aku $$2 = this.a($$0, "_powered", fnq.c, fnr::b);
      aku $$3 = this.a($$0, "_lit", fnq.c, fnr::b);
      aku $$4 = this.a($$0, "_lit_powered", fnq.c, fnr::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fnb a(djk $$0, aku $$1, aku $$2, aku $$3, aku $$4) {
      return fne.a($$0).a(fnf.a(dxl.v, dxl.B).a(($$4x, $$5) -> $$4x ? fnh.a().a(fni.c, $$5 ? $$4 : $$2) : fnh.a().a(fni.c, $$5 ? $$3 : $$1)));
   }

   private void j(djk $$0, djk $$1) {
      aku $$2 = fno.a($$0);
      aku $$3 = fno.a($$0, "_powered");
      aku $$4 = fno.a($$0, "_lit");
      aku $$5 = fno.a($$0, "_lit_powered");
      this.c.a($$0.j(), $$1.j());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void A(djk $$0) {
      this.b.accept(fne.a($$0, fnh.a().a(fni.c, fnq.ao.a($$0, fnr.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.A(djm.ra);
      this.A(djm.qZ);
      this.A(djm.qY);
      this.A(djm.qX);
   }

   private void I() {
      fnf.b<jn, dxr> $$0 = fnf.a(dxl.bp, dxl.bq);

      for (dxr $$1 : dxr.values()) {
         $$0.a(jn.b, $$1, this.a(jn.b, $$1));
      }

      for (dxr $$2 : dxr.values()) {
         $$0.a(jn.a, $$2, this.a(jn.a, $$2));
      }

      this.b.accept(fne.a(djm.sV).a($$0));
   }

   private fnh a(jn $$0, dxr $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fnr $$3 = fnr.c(fnr.a(djm.sV, $$2));
      return fnh.a().a(fni.c, fnq.an.a(djm.sV, $$2, $$3, this.d));
   }

   private void B(djk $$0) {
      fnr $$1 = new fnr().a(fns.e, fnr.J(djm.ei)).a(fns.f, fnr.J($$0)).a(fns.i, fnr.a($$0, "_side"));
      this.b.accept(c($$0, fnq.n.a($$0, $$1, this.d)));
   }

   private void J() {
      aku $$0 = fnr.a(djm.hw, "_side");
      fnr $$1 = new fnr().a(fns.f, fnr.a(djm.hw, "_top")).a(fns.i, $$0);
      fnr $$2 = new fnr().a(fns.f, fnr.a(djm.hw, "_inverted_top")).a(fns.i, $$0);
      this.b
         .accept(
            fne.a(djm.hw)
               .a(
                  fnf.a(dxl.t)
                     .a(false, fnh.a().a(fni.c, fnq.aI.a(djm.hw, $$1, this.d)))
                     .a(true, fnh.a().a(fni.c, fnq.aI.a(fno.a(djm.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void C(djk $$0) {
      this.b.accept(fne.a($$0, fnh.a().a(fni.c, fno.a($$0))).a(this.o()));
   }

   private void K() {
      djk $$0 = djm.sU;
      aku $$1 = fno.a($$0, "_on");
      aku $$2 = fno.a($$0);
      this.b.accept(fne.a($$0, fnh.a().a(fni.c, fno.a($$0))).a(this.o()).a(a(dxl.B, $$1, $$2)));
   }

   private void L() {
      fnr $$0 = new fnr().a(fns.C, fnr.J(djm.j)).a(fns.f, fnr.J(djm.cK));
      fnr $$1 = new fnr().a(fns.C, fnr.J(djm.j)).a(fns.f, fnr.a(djm.cK, "_moist"));
      aku $$2 = fnq.aZ.a(djm.cK, $$0, this.d);
      aku $$3 = fnq.aZ.a(fnr.a(djm.cK, "_moist"), $$1, this.d);
      this.b.accept(fne.a(djm.cK).a(a(dxl.aT, 7, $$3, $$2)));
   }

   private List<aku> D(djk $$0) {
      aku $$1 = fnq.ba.a(fno.a($$0, "_floor0"), fnr.y($$0), this.d);
      aku $$2 = fnq.ba.a(fno.a($$0, "_floor1"), fnr.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<aku> E(djk $$0) {
      aku $$1 = fnq.bb.a(fno.a($$0, "_side0"), fnr.y($$0), this.d);
      aku $$2 = fnq.bb.a(fno.a($$0, "_side1"), fnr.z($$0), this.d);
      aku $$3 = fnq.bc.a(fno.a($$0, "_side_alt0"), fnr.y($$0), this.d);
      aku $$4 = fnq.bc.a(fno.a($$0, "_side_alt1"), fnr.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<aku> F(djk $$0) {
      aku $$1 = fnq.bd.a(fno.a($$0, "_up0"), fnr.y($$0), this.d);
      aku $$2 = fnq.bd.a(fno.a($$0, "_up1"), fnr.z($$0), this.d);
      aku $$3 = fnq.be.a(fno.a($$0, "_up_alt0"), fnr.y($$0), this.d);
      aku $$4 = fnq.be.a(fno.a($$0, "_up_alt1"), fnr.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fnh> a(List<aku> $$0, UnaryOperator<fnh> $$1) {
      return $$0.stream().map($$0x -> fnh.a().a(fni.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fnc $$0 = fnc.a().a(dxl.O, false).a(dxl.P, false).a(dxl.Q, false).a(dxl.R, false).a(dxl.M, false);
      List<aku> $$1 = this.D(djm.cy);
      List<aku> $$2 = this.E(djm.cy);
      List<aku> $$3 = this.F(djm.cy);
      this.b
         .accept(
            fnd.a(djm.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fnc.b(fnc.a().a(dxl.O, true), $$0), a($$2, $$0x -> $$0x))
               .a(fnc.b(fnc.a().a(dxl.P, true), $$0), a($$2, $$0x -> $$0x.a(fni.b, fni.a.b)))
               .a(fnc.b(fnc.a().a(dxl.Q, true), $$0), a($$2, $$0x -> $$0x.a(fni.b, fni.a.c)))
               .a(fnc.b(fnc.a().a(dxl.R, true), $$0), a($$2, $$0x -> $$0x.a(fni.b, fni.a.d)))
               .a(fnc.a().a(dxl.M, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<aku> $$0 = this.D(djm.cz);
      List<aku> $$1 = this.E(djm.cz);
      this.b
         .accept(
            fnd.a(djm.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fni.b, fni.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fni.b, fni.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fni.b, fni.a.d)))
         );
   }

   private void G(djk $$0) {
      aku $$1 = fnt.t.create($$0, this.d);
      aku $$2 = fnt.u.create($$0, this.d);
      this.b($$0.j());
      this.b.accept(fne.a($$0).a(a(dxl.n, $$2, $$1)));
   }

   private void O() {
      fnr $$0 = fnr.a(fnr.a(djm.ah, "_side"), fnr.a(djm.ah, "_top"));
      aku $$1 = fnq.j.a(djm.ah, $$0, this.d);
      this.b.accept(d(djm.ah, $$1));
   }

   private void P() {
      this.b(cwr.af);
      djk $$0 = djm.H;
      fnf.b<Boolean, Integer> $$1 = fnf.a(doh.d, doh.b);
      aku $$2 = fno.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         aku $$4 = fno.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fnh.a().a(fni.c, $$4));
         $$1.a(false, $$3, fnh.a().a(fni.c, $$2));
      }

      this.b.accept(fne.a(djm.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fne.a(djm.lk)
               .a(
                  fnf.a(dxl.av)
                     .a(0, fnh.a().a(fni.c, this.a(djm.lk, "_0", fnq.c, fnr::b)))
                     .a(1, fnh.a().a(fni.c, this.a(djm.lk, "_1", fnq.c, fnr::b)))
                     .a(2, fnh.a().a(fni.c, this.a(djm.lk, "_2", fnq.c, fnr::b)))
                     .a(3, fnh.a().a(fni.c, this.a(djm.lk, "_3", fnq.c, fnr::b)))
               )
         );
   }

   private void R() {
      aku $$0 = fnr.J(djm.j);
      fnr $$1 = new fnr().a(fns.e, $$0).b(fns.e, fns.c).a(fns.f, fnr.a(djm.i, "_top")).a(fns.i, fnr.a(djm.i, "_snow"));
      fnh $$2 = fnh.a().a(fni.c, fnq.n.a(djm.i, "_snow", $$1, this.d));
      this.a(djm.i, fno.a(djm.i), $$2);
      this.a(djm.i, fno.a(djm.i), new fmq());
      aku $$3 = fnt.f.get(djm.fA).a($$1x -> $$1x.a(fns.e, $$0)).a(djm.fA, this.d);
      this.a(djm.fA, $$3, $$2);
      aku $$4 = fnt.f.get(djm.l).a($$1x -> $$1x.a(fns.e, $$0)).a(djm.l, this.d);
      this.a(djm.l, $$4, $$2);
   }

   private void a(djk $$0, aku $$1, fnh $$2) {
      List<fnh> $$3 = Arrays.asList(a($$1));
      this.b.accept(fne.a($$0).a(fnf.a(dxl.F).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cwr.se);
      this.b
         .accept(
            fne.a(djm.fX)
               .a(
                  fnf.a(dxl.au)
                     .a(0, fnh.a().a(fni.c, fno.a(djm.fX, "_stage0")))
                     .a(1, fnh.a().a(fni.c, fno.a(djm.fX, "_stage1")))
                     .a(2, fnh.a().a(fni.c, fno.a(djm.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(djm.lg, fno.a(djm.lg)));
   }

   private void k(djk $$0, djk $$1) {
      fnr $$2 = fnr.b($$1);
      aku $$3 = fnq.Y.a($$0, $$2, this.d);
      aku $$4 = fnq.Z.a($$0, $$2, this.d);
      this.b.accept(fne.a($$0).a(a(dxl.aW, 1, $$4, $$3)));
   }

   private void U() {
      aku $$0 = fno.a(djm.hz);
      aku $$1 = fno.a(djm.hz, "_side");
      this.b(cwr.mo);
      this.b
         .accept(
            fne.a(djm.hz)
               .a(
                  fnf.a(dxl.T)
                     .a(jn.a, fnh.a().a(fni.c, $$0))
                     .a(jn.c, fnh.a().a(fni.c, $$1))
                     .a(jn.f, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.b))
                     .a(jn.d, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.c))
                     .a(jn.e, fnh.a().a(fni.c, $$1).a(fni.b, fni.a.d))
               )
         );
   }

   private void l(djk $$0, djk $$1) {
      aku $$2 = fno.a($$0);
      this.b.accept(fne.a($$1, fnh.a().a(fni.c, $$2)));
      this.c.a($$0.j(), $$1.j());
   }

   private void V() {
      aku $$0 = fno.a(djm.fk, "_post_ends");
      aku $$1 = fno.a(djm.fk, "_post");
      aku $$2 = fno.a(djm.fk, "_cap");
      aku $$3 = fno.a(djm.fk, "_cap_alt");
      aku $$4 = fno.a(djm.fk, "_side");
      aku $$5 = fno.a(djm.fk, "_side_alt");
      this.b
         .accept(
            fnd.a(djm.fk)
               .a(fnh.a().a(fni.c, $$0))
               .a(fnc.a().a(dxl.O, false).a(dxl.P, false).a(dxl.Q, false).a(dxl.R, false), fnh.a().a(fni.c, $$1))
               .a(fnc.a().a(dxl.O, true).a(dxl.P, false).a(dxl.Q, false).a(dxl.R, false), fnh.a().a(fni.c, $$2))
               .a(fnc.a().a(dxl.O, false).a(dxl.P, true).a(dxl.Q, false).a(dxl.R, false), fnh.a().a(fni.c, $$2).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.O, false).a(dxl.P, false).a(dxl.Q, true).a(dxl.R, false), fnh.a().a(fni.c, $$3))
               .a(fnc.a().a(dxl.O, false).a(dxl.P, false).a(dxl.Q, false).a(dxl.R, true), fnh.a().a(fni.c, $$3).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.O, true), fnh.a().a(fni.c, $$4))
               .a(fnc.a().a(dxl.P, true), fnh.a().a(fni.c, $$4).a(fni.b, fni.a.b))
               .a(fnc.a().a(dxl.Q, true), fnh.a().a(fni.c, $$5))
               .a(fnc.a().a(dxl.R, true), fnh.a().a(fni.c, $$5).a(fni.b, fni.a.b))
         );
      this.c(djm.fk);
   }

   private void H(djk $$0) {
      this.b.accept(fne.a($$0, fnh.a().a(fni.c, fno.a($$0))).a(b()));
   }

   private void W() {
      aku $$0 = fno.a(djm.dI);
      aku $$1 = fno.a(djm.dI, "_on");
      this.c(djm.dI);
      this.b
         .accept(
            fne.a(djm.dI)
               .a(a(dxl.B, $$0, $$1))
               .a(
                  fnf.a(dxl.X, dxl.U)
                     .a(dxg.c, jn.c, fnh.a().a(fni.a, fni.a.c).a(fni.b, fni.a.c))
                     .a(dxg.c, jn.f, fnh.a().a(fni.a, fni.a.c).a(fni.b, fni.a.d))
                     .a(dxg.c, jn.d, fnh.a().a(fni.a, fni.a.c))
                     .a(dxg.c, jn.e, fnh.a().a(fni.a, fni.a.c).a(fni.b, fni.a.b))
                     .a(dxg.a, jn.c, fnh.a())
                     .a(dxg.a, jn.f, fnh.a().a(fni.b, fni.a.b))
                     .a(dxg.a, jn.d, fnh.a().a(fni.b, fni.a.c))
                     .a(dxg.a, jn.e, fnh.a().a(fni.b, fni.a.d))
                     .a(dxg.b, jn.c, fnh.a().a(fni.a, fni.a.b))
                     .a(dxg.b, jn.f, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.b))
                     .a(dxg.b, jn.d, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.c))
                     .a(dxg.b, jn.e, fnh.a().a(fni.a, fni.a.b).a(fni.b, fni.a.d))
               )
         );
   }

   private void X() {
      aku $$0 = this.a(cwr.gx, djm.fB);
      this.a(djm.fB, $$0, fnm.a(-9321636));
      this.b.accept(b(djm.fB, fno.a(djm.fB)));
   }

   private void Y() {
      this.c(djm.tP);
      this.b.accept(c(djm.tP, fno.a(djm.tP)));
   }

   private void Z() {
      this.b.accept(fne.a(djm.eq).a(fnf.a(dxl.K).a(jn.a.a, fnh.a().a(fni.c, fno.a(djm.eq, "_ns"))).a(jn.a.c, fnh.a().a(fni.c, fno.a(djm.eq, "_ew")))));
   }

   private void aa() {
      aku $$0 = fnt.a.create(djm.ei, this.d);
      this.b
         .accept(
            fne.a(
               djm.ei,
               fnh.a().a(fni.c, $$0),
               fnh.a().a(fni.c, $$0).a(fni.a, fni.a.b),
               fnh.a().a(fni.c, $$0).a(fni.a, fni.a.c),
               fnh.a().a(fni.c, $$0).a(fni.a, fni.a.d),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b).a(fni.a, fni.a.b),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b).a(fni.a, fni.a.c),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.b).a(fni.a, fni.a.d),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c).a(fni.a, fni.a.b),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c).a(fni.a, fni.a.c),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.c).a(fni.a, fni.a.d),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d).a(fni.a, fni.a.b),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d).a(fni.a, fni.a.c),
               fnh.a().a(fni.c, $$0).a(fni.b, fni.a.d).a(fni.a, fni.a.d)
            )
         );
   }

   private void ab() {
      aku $$0 = fno.a(djm.lq);
      aku $$1 = fno.a(djm.lq, "_on");
      this.b.accept(fne.a(djm.lq).a(a(dxl.B, $$1, $$0)).a(e()));
   }

   private void ac() {
      fnr $$0 = new fnr().a(fns.e, fnr.a(djm.bF, "_bottom")).a(fns.i, fnr.a(djm.bF, "_side"));
      aku $$1 = fnr.a(djm.bF, "_top_sticky");
      aku $$2 = fnr.a(djm.bF, "_top");
      fnr $$3 = $$0.c(fns.F, $$1);
      fnr $$4 = $$0.c(fns.F, $$2);
      aku $$5 = fno.a(djm.bF, "_base");
      this.a(djm.bF, $$5, $$4);
      this.a(djm.by, $$5, $$3);
      aku $$6 = fnq.n.a(djm.bF, "_inventory", $$0.c(fns.f, $$2), this.d);
      aku $$7 = fnq.n.a(djm.by, "_inventory", $$0.c(fns.f, $$1), this.d);
      this.a(djm.bF, $$6);
      this.a(djm.by, $$7);
   }

   private void a(djk $$0, aku $$1, fnr $$2) {
      aku $$3 = fnq.bo.a($$0, $$2, this.d);
      this.b.accept(fne.a($$0).a(a(dxl.k, $$1, $$3)).a(e()));
   }

   private void ad() {
      fnr $$0 = new fnr().a(fns.G, fnr.a(djm.bF, "_top")).a(fns.i, fnr.a(djm.bF, "_side"));
      fnr $$1 = $$0.c(fns.F, fnr.a(djm.bF, "_top_sticky"));
      fnr $$2 = $$0.c(fns.F, fnr.a(djm.bF, "_top"));
      this.b
         .accept(
            fne.a(djm.bG)
               .a(
                  fnf.a(dxl.C, dxl.bj)
                     .a(false, dxw.a, fnh.a().a(fni.c, fnq.bp.a(djm.bF, "_head", $$2, this.d)))
                     .a(false, dxw.b, fnh.a().a(fni.c, fnq.bp.a(djm.bF, "_head_sticky", $$1, this.d)))
                     .a(true, dxw.a, fnh.a().a(fni.c, fnq.bq.a(djm.bF, "_head_short", $$2, this.d)))
                     .a(true, dxw.b, fnh.a().a(fni.c, fnq.bq.a(djm.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      djk $$0 = djm.tT;
      fnr $$1 = fnr.a($$0, "_side_inactive", "_top_inactive");
      fnr $$2 = fnr.a($$0, "_side_active", "_top_active");
      fnr $$3 = fnr.a($$0, "_side_active", "_top_ejecting_reward");
      fnr $$4 = fnr.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fnr $$5 = fnr.a($$0, "_side_active_ominous", "_top_active_ominous");
      fnr $$6 = fnr.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      aku $$7 = fnq.o.a($$0, $$1, this.d);
      aku $$8 = fnq.o.a($$0, "_active", $$2, this.d);
      aku $$9 = fnq.o.a($$0, "_ejecting_reward", $$3, this.d);
      aku $$10 = fnq.o.a($$0, "_inactive_ominous", $$4, this.d);
      aku $$11 = fnq.o.a($$0, "_active_ominous", $$5, this.d);
      aku $$12 = fnq.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fne.a($$0).a(fnf.a(dxl.bB, dxl.bD).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fnh.a().a(fni.c, $$7x ? $$10 : $$7);
            case b, c, d -> fnh.a().a(fni.c, $$7x ? $$11 : $$8);
            case e -> fnh.a().a(fni.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      djk $$0 = djm.tU;
      fnr $$1 = fnr.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fnr $$2 = fnr.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fnr $$3 = fnr.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fnr $$4 = fnr.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      aku $$5 = fnq.bX.a($$0, $$1, this.d);
      aku $$6 = fnq.bX.a($$0, "_active", $$2, this.d);
      aku $$7 = fnq.bX.a($$0, "_unlocking", $$3, this.d);
      aku $$8 = fnq.bX.a($$0, "_ejecting_reward", $$4, this.d);
      fnr $$9 = fnr.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fnr $$10 = fnr.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnr $$11 = fnr.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fnr $$12 = fnr.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      aku $$13 = fnq.bX.a($$0, "_ominous", $$9, this.d);
      aku $$14 = fnq.bX.a($$0, "_active_ominous", $$10, this.d);
      aku $$15 = fnq.bX.a($$0, "_unlocking_ominous", $$11, this.d);
      aku $$16 = fnq.bX.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fne.a($$0).a(b()).a(fnf.a(dsk.b, dsk.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fnh.a().a(fni.c, $$9x ? $$13 : $$5);
            case b -> fnh.a().a(fni.c, $$9x ? $$14 : $$6);
            case c -> fnh.a().a(fni.c, $$9x ? $$15 : $$7);
            case d -> fnh.a().a(fni.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      aku $$0 = fno.a(djm.rs, "_inactive");
      aku $$1 = fno.a(djm.rs, "_active");
      this.a(djm.rs, $$0);
      this.b.accept(fne.a(djm.rs).a(fnf.a(dxl.br).a($$2 -> fnh.a().a(fni.c, $$2 != dyb.b && $$2 != dyb.c ? $$0 : $$1))));
   }

   private void ah() {
      aku $$0 = fno.a(djm.rt, "_inactive");
      aku $$1 = fno.a(djm.rt, "_active");
      this.a(djm.rt, $$0);
      this.b.accept(fne.a(djm.rt).a(fnf.a(dxl.br).a($$2 -> fnh.a().a(fni.c, $$2 != dyb.b && $$2 != dyb.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      aku $$0 = fnq.bW.a(djm.rx, fnr.a(false), this.d);
      aku $$1 = fnq.bW.a(djm.rx, "_can_summon", fnr.a(true), this.d);
      this.a(djm.rx, $$0);
      this.b.accept(fne.a(djm.rx).a(a(dxl.f, $$1, $$0)));
   }

   private void aj() {
      aku $$0 = fno.a(djm.ou, "_stable");
      aku $$1 = fno.a(djm.ou, "_unstable");
      this.a(djm.ou, $$0);
      this.b.accept(fne.a(djm.ou).a(a(dxl.e, $$1, $$0)));
   }

   private void ak() {
      aku $$0 = this.a(djm.sX, "", fnq.ao, fnr::c);
      aku $$1 = this.a(djm.sX, "_lit", fnq.ao, fnr::c);
      this.b.accept(fne.a(djm.sX).a(a(dxl.c, $$1, $$0)));
      aku $$2 = this.a(djm.sY, "", fnq.ao, fnr::c);
      aku $$3 = this.a(djm.sY, "_lit", fnq.ao, fnr::c);
      this.b.accept(fne.a(djm.sY).a(a(dxl.c, $$3, $$2)));
   }

   private void al() {
      aku $$0 = fnt.a.create(djm.fW, this.d);
      aku $$1 = this.a(djm.fW, "_on", fnq.c, fnr::b);
      this.b.accept(fne.a(djm.fW).a(a(dxl.v, $$1, $$0)));
   }

   private void m(djk $$0, djk $$1) {
      fnr $$2 = fnr.B($$0);
      this.b.accept(c($$0, fnq.bi.a($$0, $$2, this.d)));
      this.b.accept(fne.a($$1, fnh.a().a(fni.c, fnq.bk.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fnr $$0 = fnr.B(djm.dX);
      fnr $$1 = fnr.i(fnr.a(djm.dX, "_off"));
      aku $$2 = fnq.bm.a(djm.dX, $$0, this.d);
      aku $$3 = fnq.bj.a(djm.dX, "_off", $$1, this.d);
      this.b.accept(fne.a(djm.dX).a(a(dxl.v, $$2, $$3)));
      aku $$4 = fnq.bn.a(djm.dY, $$0, this.d);
      aku $$5 = fnq.bl.a(djm.dY, "_off", $$1, this.d);
      this.b.accept(fne.a(djm.dY).a(a(dxl.v, $$4, $$5)).a(d()));
      this.c(djm.dX);
   }

   private void an() {
      this.b(cwr.mh);
      this.b.accept(fne.a(djm.eu).a(fnf.a(dxl.aD, dxl.w, dxl.B).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fnh.a().a(fni.c, fnr.a(djm.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cwr.da);
      this.b
         .accept(
            fne.a(djm.nx)
               .a(
                  fnf.a(dxl.aV, dxl.J)
                     .a(1, false, Arrays.asList(a(fno.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(fno.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(fno.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(fno.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(fno.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(fno.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(fno.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(fno.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fnr $$0 = fnr.a(djm.ea);
      aku $$1 = fnq.c.a(djm.ec, $$0, this.d);
      this.b.accept(fne.a(djm.ea).a(fnf.a(dxl.aI).a($$1x -> fnh.a().a(fni.c, $$1x < 8 ? fno.a(djm.ea, "_height" + $$1x * 2) : $$1))));
      this.a(djm.ea, fno.a(djm.ea, "_height2"));
      this.b.accept(c(djm.ec, $$1));
   }

   private void aq() {
      this.b.accept(fne.a(djm.oE, fnh.a().a(fni.c, fno.a(djm.oE))).a(b()));
   }

   private void ar() {
      aku $$0 = fnt.a.create(djm.pC, this.d);
      this.a(djm.pC, $$0);
      this.b.accept(fne.a(djm.pC).a(fnf.a(dxl.bm).a($$0x -> fnh.a().a(fni.c, this.a(djm.pC, "_" + $$0x.c(), fnq.c, fnr::b)))));
   }

   private void as() {
      this.b(cwr.xv);
      this.b.accept(fne.a(djm.oK).a(fnf.a(dxl.av).a($$0 -> fnh.a().a(fni.c, this.a(djm.oK, "_stage" + $$0, fnq.ao, fnr::c)))));
   }

   private void at() {
      this.b(cwr.pX);
      this.b
         .accept(
            fne.a(djm.gd)
               .a(
                  fnf.a(dxl.b, dxl.P, dxl.O, dxl.Q, dxl.R)
                     .a(false, false, false, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_ns")))
                     .a(false, true, false, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_n")).a(fni.b, fni.a.b))
                     .a(false, false, true, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_n")))
                     .a(false, false, false, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_n")).a(fni.b, fni.a.c))
                     .a(false, false, false, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_n")).a(fni.b, fni.a.d))
                     .a(false, true, true, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_ne")))
                     .a(false, true, false, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_ne")).a(fni.b, fni.a.b))
                     .a(false, false, false, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_ne")).a(fni.b, fni.a.c))
                     .a(false, false, true, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_ne")).a(fni.b, fni.a.d))
                     .a(false, false, true, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_ns")))
                     .a(false, true, false, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_ns")).a(fni.b, fni.a.b))
                     .a(false, true, true, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_nse")))
                     .a(false, true, false, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_nse")).a(fni.b, fni.a.b))
                     .a(false, false, true, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_nse")).a(fni.b, fni.a.c))
                     .a(false, true, true, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_nse")).a(fni.b, fni.a.d))
                     .a(false, true, true, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_nsew")))
                     .a(true, false, false, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_ns")))
                     .a(true, false, true, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_n")))
                     .a(true, false, false, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_n")).a(fni.b, fni.a.c))
                     .a(true, true, false, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_n")).a(fni.b, fni.a.b))
                     .a(true, false, false, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_n")).a(fni.b, fni.a.d))
                     .a(true, true, true, false, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_ne")))
                     .a(true, true, false, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_ne")).a(fni.b, fni.a.b))
                     .a(true, false, false, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_ne")).a(fni.b, fni.a.c))
                     .a(true, false, true, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_ne")).a(fni.b, fni.a.d))
                     .a(true, false, true, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_ns")))
                     .a(true, true, false, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_ns")).a(fni.b, fni.a.b))
                     .a(true, true, true, true, false, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_nse")))
                     .a(true, true, false, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_nse")).a(fni.b, fni.a.b))
                     .a(true, false, true, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_nse")).a(fni.b, fni.a.c))
                     .a(true, true, true, false, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_nse")).a(fni.b, fni.a.d))
                     .a(true, true, true, true, true, fnh.a().a(fni.c, fno.a(djm.gd, "_attached_nsew")))
               )
         );
   }

   private void au() {
      this.c(djm.gc);
      this.b
         .accept(fne.a(djm.gc).a(fnf.a(dxl.b, dxl.B).a(($$0, $$1) -> fnh.a().a(fni.c, fnr.a(djm.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private aku a(int $$0, String $$1, fnr $$2) {
      switch ($$0) {
         case 1:
            return fnq.bs.a(fno.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return fnq.bt.a(fno.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return fnq.bu.a(fno.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return fnq.bv.a(fno.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private aku a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fnr.b(fnr.J(djm.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fnr.b(fnr.a(djm.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fnr.b(fnr.a(djm.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void av() {
      this.b(cwr.kM);
      this.b.accept(fne.a(djm.mH).a(fnf.a(dxl.aG, dxl.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void aw() {
      this.b(cwr.kN);
      Function<Integer, aku> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fnr $$2 = fnr.a($$1);
         return fnq.bD.a(djm.mI, $$1, $$2, this.d);
      };
      this.b.accept(fne.a(djm.mI).a(fnf.a(dqx.c).a($$1 -> fnh.a().a(fni.c, $$0.apply($$1)))));
   }

   private void I(djk $$0) {
      this.c($$0);
      this.J($$0);
   }

   private void b(djk $$0, cwj $$1) {
      this.b($$1);
      this.J($$0);
   }

   private void J(djk $$0) {
      aku $$1 = fno.a($$0);
      fnd $$2 = fnd.a($$0);
      fnc.c $$3 = af.a(fnc.a(), $$1x -> a.stream().<jn>map(Pair::getFirst).map(dom::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jn, Function<aku, fnh>> $$4 : a) {
         dxm $$5 = dom.b((jn)$$4.getFirst());
         Function<aku, fnh> $$6 = (Function<aku, fnh>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fnc.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void K(djk $$0) {
      aku $$1 = fnt.j.create($$0, this.d);
      aku $$2 = fnt.k.get($$0).a($$1x -> $$1x.a(fns.i, fnr.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      aku $$3 = fnt.k.get($$0).a($$1x -> $$1x.a(fns.i, fnr.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fnd $$4 = fnd.a($$0);
      fnc.c $$5 = fnc.a().a(dok.b, false);
      $$4.a(fnc.a().a(dok.b, true), fnh.a().a(fni.c, $$1));
      $$4.a($$5, fnh.a().a(fni.c, $$1));
      a.stream().<jn>map(Pair::getFirst).forEach($$2x -> {
         dxs<dyg> $$3x = dok.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dyg.a);
         }
      });

      for (Pair<jn, Function<aku, fnh>> $$6 : a) {
         jn $$7 = (jn)$$6.getFirst();
         dxs<dyg> $$8 = dok.a($$7);
         if ($$8 != null) {
            Function<aku, fnh> $$9 = (Function<aku, fnh>)$$6.getSecond();
            $$4.a(fnc.a().a($$8, dyg.c), $$9.apply($$2));
            $$4.a(fnc.a().a($$8, dyg.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void L(djk $$0) {
      fnf $$1 = fnf.a(dnc.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fnr $$3 = fnr.c(fnr.a($$0, $$2));
         aku $$4 = fmw.d.b.a().a($$0, $$2, $$3, this.d);
         return fnh.a().a(fni.c, $$4);
      });
      this.c($$0);
      this.b.accept(fne.a($$0).a($$1));
   }

   private void ax() {
      aku $$0 = fnr.a(djm.rw, "_bottom");
      fnr $$1 = new fnr().a(fns.e, $$0).a(fns.f, fnr.a(djm.rw, "_top")).a(fns.i, fnr.a(djm.rw, "_side"));
      fnr $$2 = new fnr().a(fns.e, $$0).a(fns.f, fnr.a(djm.rw, "_top_bloom")).a(fns.i, fnr.a(djm.rw, "_side_bloom"));
      aku $$3 = fnq.n.a(djm.rw, "", $$1, this.d);
      aku $$4 = fnq.n.a(djm.rw, "_bloom", $$2, this.d);
      this.b.accept(fne.a(djm.rw).a(fnf.a(dxl.d).a($$2x -> fnh.a().a(fni.c, $$2x ? $$4 : $$3))));
      this.a(djm.rw, $$3);
   }

   private void ay() {
      djk $$0 = djm.ct;
      aku $$1 = fno.a($$0);
      fnd $$2 = fnd.a($$0);
      List.of(Pair.of(jn.c, fni.a.a), Pair.of(jn.f, fni.a.b), Pair.of(jn.d, fni.a.c), Pair.of(jn.e, fni.a.d)).forEach($$2x -> {
         jn $$3 = (jn)$$2x.getFirst();
         fni.a $$4 = (fni.a)$$2x.getSecond();
         fnc.c $$5 = fnc.a().a(dxl.U, $$3);
         $$2.a($$5, fnh.a().a(fni.c, $$1).a(fni.b, $$4).a(fni.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fno.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fnd $$0, fnc.c $$1, fni.a $$2) {
      List.of(
            Pair.of(dxl.bs, fnq.aP),
            Pair.of(dxl.bt, fnq.aQ),
            Pair.of(dxl.bu, fnq.aR),
            Pair.of(dxl.bv, fnq.aS),
            Pair.of(dxl.bw, fnq.aT),
            Pair.of(dxl.bx, fnq.aU)
         )
         .forEach($$3 -> {
            dxm $$4 = (dxm)$$3.getFirst();
            fnp $$5 = (fnp)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fnd $$0, fnc.c $$1, fni.a $$2, dxm $$3, fnp $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fnr $$7 = new fnr().a(fns.b, fnr.a(djm.ct, $$6));
      fmw.c $$8 = new fmw.c($$4, $$6);
      aku $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(djm.ct, $$6, $$7, this.d));
      $$0.a(fnc.a($$1, fnc.a().a($$3, $$5)), fnh.a().a(fni.c, $$9).a(fni.b, $$2));
   }

   private void az() {
      this.b.accept(c(djm.ll, fnq.c.a(djm.ll, fnr.b(fno.a("magma")), this.d)));
   }

   private void a(djk $$0, @Nullable cvk $$1) {
      this.r($$0);
      cwj $$2 = $$0.j();
      aku $$3 = fnq.bK.a($$2, fnr.x($$0), this.d);
      hbh.b $$4 = $$1 != null ? fnm.a($$3, new hdo.a($$1)) : fnm.a($$3, new hdo.a());
      this.c.a($$2, $$4);
   }

   private void c(djk $$0, djk $$1, fmw.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aA() {
      aku $$0 = fno.a(djm.b);
      aku $$1 = fno.a(djm.b, "_mirrored");
      this.b.accept(a(djm.fb, $$0, $$1));
      this.a(djm.fb, $$0);
   }

   private void aB() {
      aku $$0 = fno.a(djm.tl);
      aku $$1 = fno.a(djm.tl, "_mirrored");
      this.b.accept(a(djm.tF, $$0, $$1).a(f()));
      this.a(djm.tF, $$0);
   }

   private void n(djk $$0, djk $$1) {
      this.a($$0, fmw.d.b);
      fnr $$2 = fnr.d(fnr.a($$0, "_pot"));
      aku $$3 = fmw.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aC() {
      aku $$0 = fnr.a(djm.pN, "_bottom");
      aku $$1 = fnr.a(djm.pN, "_top_off");
      aku $$2 = fnr.a(djm.pN, "_top");
      aku[] $$3 = new aku[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fnr $$5 = new fnr().a(fns.e, $$0).a(fns.f, $$4 == 0 ? $$1 : $$2).a(fns.i, fnr.a(djm.pN, "_side" + $$4));
         $$3[$$4] = fnq.n.a(djm.pN, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fne.a(djm.pN).a(fnf.a(dxl.bc).a($$1x -> fnh.a().a(fni.c, $$3[$$1x]))));
      this.a(djm.pN, $$3[0]);
   }

   private fnh a(jp $$0, fnh $$1) {
      switch ($$0) {
         case b:
            return $$1.a(fni.a, fni.a.b);
         case c:
            return $$1.a(fni.a, fni.a.b).a(fni.b, fni.a.c);
         case d:
            return $$1.a(fni.a, fni.a.b).a(fni.b, fni.a.d);
         case a:
            return $$1.a(fni.a, fni.a.b).a(fni.b, fni.a.b);
         case f:
            return $$1.a(fni.a, fni.a.d).a(fni.b, fni.a.c);
         case g:
            return $$1.a(fni.a, fni.a.d);
         case h:
            return $$1.a(fni.a, fni.a.d).a(fni.b, fni.a.b);
         case e:
            return $$1.a(fni.a, fni.a.d).a(fni.b, fni.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(fni.b, fni.a.c);
         case i:
            return $$1.a(fni.b, fni.a.d);
         case j:
            return $$1.a(fni.b, fni.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aD() {
      aku $$0 = fnr.a(djm.pD, "_top");
      aku $$1 = fnr.a(djm.pD, "_bottom");
      aku $$2 = fnr.a(djm.pD, "_side");
      aku $$3 = fnr.a(djm.pD, "_lock");
      fnr $$4 = new fnr().a(fns.o, $$2).a(fns.m, $$2).a(fns.l, $$2).a(fns.c, $$0).a(fns.j, $$0).a(fns.k, $$1).a(fns.n, $$3);
      aku $$5 = fnq.b.a(djm.pD, $$4, this.d);
      this.b.accept(fne.a(djm.pD, fnh.a().a(fni.c, $$5)).a(fnf.a(dxl.W).a($$0x -> this.a($$0x, fnh.a()))));
   }

   private void aE() {
      djk $$0 = djm.n;
      aku $$1 = fno.a($$0);
      fnt $$2 = fnt.a.get($$0);
      djk $$3 = djm.kg;
      aku $$4 = fnq.ab.a($$3, $$2.b(), this.d);
      aku $$5 = fnq.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(djk $$0, djk $$1, dqr.a $$2, aku $$3) {
      aku $$4 = fno.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.j(), fnm.a($$3, new hdp.a($$2)));
   }

   private void aF() {
      aku $$0 = fno.b("template_skull");
      this.a(djm.hj, djm.hk, dqr.b.g, $$0);
      this.a(djm.hh, djm.hi, dqr.b.e, $$0);
      this.a(djm.hf, djm.hg, dqr.b.f, $$0);
      this.a(djm.hb, djm.hc, dqr.b.c, $$0);
      this.a(djm.hd, djm.he, dqr.b.d, $$0);
      this.a(djm.hn, djm.ho, dqr.b.h, $$0);
      this.a(djm.hl, djm.hm, dqr.b.i, fno.a(cwr.vp));
   }

   private void a(djk $$0, djk $$1, cvk $$2) {
      aku $$3 = fno.a("banner");
      aku $$4 = fno.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cwj $$5 = $$0.j();
      this.c.a($$5, fnm.a($$4, new hdg.a($$2)));
   }

   private void aG() {
      this.a(djm.jh, djm.jx, cvk.a);
      this.a(djm.ji, djm.jy, cvk.b);
      this.a(djm.jj, djm.jz, cvk.c);
      this.a(djm.jk, djm.jA, cvk.d);
      this.a(djm.jl, djm.jB, cvk.e);
      this.a(djm.jm, djm.jC, cvk.f);
      this.a(djm.jn, djm.jD, cvk.g);
      this.a(djm.jo, djm.jE, cvk.h);
      this.a(djm.jp, djm.jF, cvk.i);
      this.a(djm.jq, djm.jG, cvk.j);
      this.a(djm.jr, djm.jH, cvk.k);
      this.a(djm.js, djm.jI, cvk.l);
      this.a(djm.jt, djm.jJ, cvk.m);
      this.a(djm.ju, djm.jK, cvk.n);
      this.a(djm.jv, djm.jL, cvk.o);
      this.a(djm.jw, djm.jM, cvk.p);
   }

   private void a(djk $$0, djk $$1, aku $$2, boolean $$3) {
      this.a($$0, $$1);
      cwj $$4 = $$0.j();
      aku $$5 = fnq.bM.a($$4, fnr.x($$1), this.d);
      hbh.b $$6 = fnm.a($$5, new hdi.a($$2));
      if ($$3) {
         hbh.b $$7 = fnm.a($$5, new hdi.a(hdi.a));
         this.c.a($$4, fnm.a($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aH() {
      this.a(djm.cD, djm.n, hdi.b, true);
      this.a(djm.hs, djm.n, hdi.c, true);
      this.a(djm.gb, djm.cv, hdi.d, false);
   }

   private void b(djk $$0, djk $$1, cvk $$2) {
      aku $$3 = fno.a("bed");
      this.b.accept(c($$0, $$3));
      cwj $$4 = $$0.j();
      aku $$5 = fnq.bL.a(fno.a($$4), fnr.x($$1), this.d);
      this.c.a($$4, fnm.a($$5, new hdh.a($$2)));
   }

   private void aI() {
      this.b(djm.bg, djm.bH, cvk.a);
      this.b(djm.bh, djm.bI, cvk.b);
      this.b(djm.bi, djm.bJ, cvk.c);
      this.b(djm.bj, djm.bK, cvk.d);
      this.b(djm.bk, djm.bL, cvk.e);
      this.b(djm.bl, djm.bM, cvk.f);
      this.b(djm.bm, djm.bN, cvk.g);
      this.b(djm.bn, djm.bO, cvk.h);
      this.b(djm.bo, djm.bP, cvk.i);
      this.b(djm.bp, djm.bQ, cvk.j);
      this.b(djm.bq, djm.bR, cvk.k);
      this.b(djm.br, djm.bS, cvk.l);
      this.b(djm.bs, djm.bT, cvk.m);
      this.b(djm.bt, djm.bU, cvk.n);
      this.b(djm.bu, djm.bV, cvk.o);
      this.b(djm.bv, djm.bW, cvk.p);
   }

   private void a(djk $$0, hdq.a $$1) {
      cwj $$2 = $$0.j();
      aku $$3 = fno.a($$2);
      this.c.a($$2, fnm.a($$3, $$1));
   }

   public void a() {
      me.a().filter(mf::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(djm.rH).a(me.x).a(djm.rH, djm.sf).a(djm.rL, djm.rP).a(me.z);
      this.i(djm.rG).a(me.B).a(djm.rG, djm.se).a(djm.rK, djm.rO).a(me.D);
      this.i(djm.rF).a(me.F).a(djm.rF, djm.sd).a(djm.rJ, djm.rN).a(me.H);
      this.i(djm.rE).a(me.J).a(djm.rE, djm.sc).a(djm.rI, djm.rM).a(me.L);
      this.z(djm.sM);
      this.z(djm.sN);
      this.z(djm.sO);
      this.z(djm.sP);
      this.j(djm.sM, djm.sQ);
      this.j(djm.sN, djm.sR);
      this.j(djm.sO, djm.sS);
      this.j(djm.sP, djm.sT);
      this.n(djm.a);
      this.d(djm.nE, djm.a);
      this.d(djm.nD, djm.a);
      this.n(djm.gj);
      this.n(djm.ed);
      this.d(djm.nF, djm.J);
      this.n(djm.fV);
      this.n(djm.mG);
      this.n(djm.fM);
      this.n(djm.gm);
      this.b(cwr.vd);
      this.n(djm.pI);
      this.n(djm.J);
      this.n(djm.K);
      this.n(djm.it);
      this.b(cwr.gh);
      this.o(djm.qo, djm.qF);
      this.o(djm.qp, djm.qG);
      this.o(djm.qq, djm.qH);
      this.o(djm.qr, djm.qI);
      this.o(djm.qs, djm.qJ);
      this.o(djm.qt, djm.qK);
      this.o(djm.qu, djm.qL);
      this.o(djm.qv, djm.qM);
      this.o(djm.qw, djm.qN);
      this.o(djm.qx, djm.qO);
      this.o(djm.qy, djm.qP);
      this.o(djm.qz, djm.qQ);
      this.o(djm.qA, djm.qR);
      this.o(djm.qB, djm.qS);
      this.o(djm.qC, djm.qT);
      this.o(djm.qD, djm.qU);
      this.o(djm.qn, djm.qE);
      this.n(djm.nC);
      this.n(djm.gO);
      this.n(djm.rr);
      this.n(djm.sZ);
      this.v(djm.ta);
      this.v(djm.tb);
      this.w(djm.tK);
      this.w(djm.tL);
      this.ak();
      this.h(djm.te, djm.tc);
      this.K(djm.tX);
      this.L(djm.tY);
      this.a(djm.tW);
      this.s(djm.td);
      this.a(djm.iu, cwr.hY);
      this.b(cwr.hY);
      this.aJ();
      this.a(djm.lp, cwr.jy);
      this.b(cwr.jy);
      this.f(djm.bX, fnr.a(djm.bF, "_side"));
      this.a(djm.U);
      this.a(djm.V);
      this.a(djm.iZ);
      this.a(djm.cF);
      this.a(djm.cG);
      this.a(djm.cH);
      this.a(djm.fZ);
      this.a(djm.ga);
      this.a(djm.ge);
      this.a(djm.Q);
      this.a(djm.W);
      this.a(djm.R);
      this.a(djm.co);
      this.a(djm.S);
      this.a(djm.T);
      this.a(djm.cp);
      this.b(djm.pL, fnt.d);
      this.a(djm.pK);
      this.a(djm.aY);
      this.a(djm.aZ);
      this.a(djm.ba);
      this.a(djm.fC);
      this.a(djm.hy);
      this.a(djm.dV);
      this.a(djm.dW);
      this.a(djm.hx);
      this.a(djm.qe);
      this.a(djm.ny);
      this.a(djm.ee);
      this.a(djm.k);
      this.a(djm.pM);
      this.a(djm.fU);
      this.a(djm.ep);
      this.a(djm.O);
      this.a(djm.pJ);
      this.a(djm.eb);
      this.b(djm.eg, fnt.g);
      this.b(djm.pS, fnt.d);
      this.b(djm.fo, fnt.d);
      this.n(djm.ag);
      this.n(djm.gw);
      this.a(djm.lm);
      this.a(djm.bf);
      this.a(djm.ja);
      this.a(djm.cv);
      this.a(djm.qm);
      this.a(djm.iG);
      this.a(djm.pa);
      this.a(djm.ej);
      this.a(djm.ek);
      this.b(djm.cA, fnt.b);
      this.g(djm.cB);
      this.a(djm.aV);
      this.b(djm.bD, fnt.v);
      this.b(cwr.cZ);
      this.b(djm.cr, fnt.f);
      this.b(djm.pF, fnt.d);
      this.a(djm.oR);
      this.a(djm.aW);
      this.a(djm.qV);
      this.a(djm.qW);
      this.a(djm.rp);
      this.a(djm.sW);
      this.a(djm.tH);
      this.a(djm.tI);
      this.a(djm.tJ);
      this.d(djm.ru);
      this.n(djm.tV);
      this.aE();
      this.a(djm.rC);
      this.a(djm.rD);
      this.a(djm.ry);
      this.a(djm.rz);
      this.a(djm.rA);
      this.a(djm.rB);
      this.l(djm.ry, djm.rY);
      this.l(djm.rz, djm.sa);
      this.l(djm.rA, djm.rZ);
      this.l(djm.rB, djm.sb);
      this.j(djm.so);
      this.j(djm.sp);
      this.j(djm.sr);
      this.j(djm.sq);
      this.b(djm.so, djm.ss);
      this.b(djm.sp, djm.st);
      this.b(djm.sr, djm.sv);
      this.b(djm.sq, djm.su);
      this.l(djm.sw);
      this.l(djm.sx);
      this.l(djm.sz);
      this.l(djm.sy);
      this.c(djm.sw, djm.sA);
      this.c(djm.sx, djm.sB);
      this.c(djm.sz, djm.sD);
      this.c(djm.sy, djm.sC);
      this.a(djm.sE);
      this.a(djm.sF);
      this.a(djm.sG);
      this.a(djm.sH);
      this.l(djm.sE, djm.sI);
      this.l(djm.sF, djm.sJ);
      this.l(djm.sG, djm.sK);
      this.l(djm.sH, djm.sL);
      this.k(djm.ht, djm.co);
      this.k(djm.hu, djm.cp);
      this.H();
      this.s();
      this.ay();
      this.w();
      this.x();
      this.a(djm.oI, djm.oJ);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.C(djm.kV);
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
      this.I(djm.fu);
      this.I(djm.rv);
      this.b(djm.fv, cwr.gm);
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
      this.H(djm.cX);
      this.c(djm.cX);
      this.H(djm.oC);
      this.h();
      this.H(djm.tg);
      this.m(djm.cw, djm.cx);
      this.m(djm.en, djm.eo);
      this.a(djm.cI, djm.n, fnr::c);
      this.a(djm.oA, djm.p, fnr::d);
      this.B(djm.oY);
      this.B(djm.oP);
      this.y(djm.bb);
      this.y(djm.hF);
      this.D();
      this.G(djm.oG);
      this.G(djm.oH);
      this.e(djm.fl, fno.a(djm.fl));
      this.a(djm.el, fnt.d);
      this.a(djm.em, fnt.d);
      this.a(djm.tG);
      this.a(djm.lo, fnt.d);
      this.e(djm.j);
      this.e(djm.tj);
      this.e(djm.L);
      this.f(djm.M);
      this.f(djm.P);
      this.e(djm.N);
      this.d(djm.I);
      this.b(djm.tQ, fnt.f);
      this.a(djm.iH, fnt.d, fnt.e);
      this.a(djm.kZ, fnt.w, fnt.x);
      this.a(djm.hC, fnt.w, fnt.x);
      this.a(djm.tM, fnt.d, fnt.e);
      this.a(djm.tN, fnt.d, fnt.e);
      this.a(djm.tO, fnt.d, fnt.e);
      this.c(djm.ov, fnt.i);
      this.A();
      this.a(djm.pG, fnr::D);
      this.a(djm.pH, fnr::F);
      this.a(djm.lf, dxl.av, 0, 1, 2, 3);
      this.a(djm.gP, dxl.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djm.fL, dxl.av, 0, 1, 1, 2);
      this.a(djm.gQ, dxl.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(djm.cJ, dxl.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(djm.lc, fmw.d.b, dxl.at, 0, 1);
      this.j();
      this.i();
      this.aG();
      this.aI();
      this.aF();
      this.aH();
      this.a(djm.lr, null);
      this.a(djm.ls, cvk.a);
      this.a(djm.lt, cvk.b);
      this.a(djm.lu, cvk.c);
      this.a(djm.lv, cvk.d);
      this.a(djm.lw, cvk.e);
      this.a(djm.lx, cvk.f);
      this.a(djm.ly, cvk.g);
      this.a(djm.lz, cvk.h);
      this.a(djm.lA, cvk.i);
      this.a(djm.lB, cvk.j);
      this.a(djm.lC, cvk.k);
      this.a(djm.lD, cvk.l);
      this.a(djm.lE, cvk.m);
      this.a(djm.lF, cvk.n);
      this.a(djm.lG, cvk.o);
      this.a(djm.lH, cvk.p);
      this.r(djm.nz);
      this.a(djm.nz, new hdj.a());
      this.a(djm.tR, djm.iY);
      this.a(djm.tR, new hdk.a());
      this.a(djm.fS, djm.cv);
      this.a(djm.lh, djm.cv);
      this.a(djm.aT);
      this.a(djm.aU);
      this.a(djm.lY);
      this.a(djm.lZ);
      this.a(djm.ma);
      this.a(djm.mb);
      this.a(djm.mc);
      this.a(djm.md);
      this.a(djm.me);
      this.a(djm.mf);
      this.a(djm.mg);
      this.a(djm.mh);
      this.a(djm.mi);
      this.a(djm.mj);
      this.a(djm.mk);
      this.a(djm.ml);
      this.a(djm.mm);
      this.a(djm.mn);
      this.a(fnt.a, djm.mo, djm.mp, djm.mq, djm.mr, djm.ms, djm.mt, djm.mu, djm.mv, djm.mw, djm.mx, djm.my, djm.mz, djm.mA, djm.mB, djm.mC, djm.mD);
      this.a(djm.iY);
      this.a(djm.hG);
      this.a(djm.hH);
      this.a(djm.hI);
      this.a(djm.hJ);
      this.a(djm.hK);
      this.a(djm.hL);
      this.a(djm.hM);
      this.a(djm.hN);
      this.a(djm.hO);
      this.a(djm.hP);
      this.a(djm.hQ);
      this.a(djm.hR);
      this.a(djm.hS);
      this.a(djm.hT);
      this.a(djm.hU);
      this.a(djm.hV);
      this.a(djm.rq);
      this.i(djm.aX, djm.fm);
      this.i(djm.ev, djm.hW);
      this.i(djm.ew, djm.hX);
      this.i(djm.ex, djm.hY);
      this.i(djm.ey, djm.hZ);
      this.i(djm.ez, djm.ia);
      this.i(djm.eA, djm.ib);
      this.i(djm.eB, djm.ic);
      this.i(djm.eC, djm.id);
      this.i(djm.eD, djm.ie);
      this.i(djm.eE, djm.if);
      this.i(djm.eF, djm.ig);
      this.i(djm.eG, djm.ih);
      this.i(djm.eH, djm.ii);
      this.i(djm.eI, djm.ij);
      this.i(djm.eJ, djm.ik);
      this.i(djm.eK, djm.il);
      this.b(fnt.p, djm.lI, djm.lJ, djm.lK, djm.lL, djm.lM, djm.lN, djm.lO, djm.lP, djm.lQ, djm.lR, djm.lS, djm.lT, djm.lU, djm.lV, djm.lW, djm.lX);
      this.h(djm.bH, djm.iI);
      this.h(djm.bI, djm.iJ);
      this.h(djm.bJ, djm.iK);
      this.h(djm.bK, djm.iL);
      this.h(djm.bL, djm.iM);
      this.h(djm.bM, djm.iN);
      this.h(djm.bN, djm.iO);
      this.h(djm.bO, djm.iP);
      this.h(djm.bP, djm.iQ);
      this.h(djm.bQ, djm.iR);
      this.h(djm.bR, djm.iS);
      this.h(djm.bS, djm.iT);
      this.h(djm.bT, djm.iU);
      this.h(djm.bU, djm.iV);
      this.h(djm.bV, djm.iW);
      this.h(djm.bW, djm.iX);
      this.a(djm.tk);
      this.a(djm.eZ);
      this.b(djm.bB, djm.gx, fmw.d.a);
      this.h(djm.bB);
      this.a(djm.bY, djm.gy, fmw.d.b);
      this.a(djm.ca, djm.gz, fmw.d.b);
      this.a(djm.tZ, djm.ub, fmw.d.c);
      this.a(djm.ua, djm.uc, fmw.d.b);
      this.a(djm.cb, djm.gA, fmw.d.b);
      this.a(djm.cc, djm.gB, fmw.d.b);
      this.a(djm.cd, djm.gC, fmw.d.b);
      this.a(djm.ce, djm.gD, fmw.d.b);
      this.a(djm.cf, djm.gE, fmw.d.b);
      this.a(djm.cg, djm.gF, fmw.d.b);
      this.a(djm.ch, djm.gG, fmw.d.b);
      this.a(djm.ci, djm.gH, fmw.d.b);
      this.a(djm.cj, djm.gI, fmw.d.b);
      this.a(djm.cl, djm.gJ, fmw.d.b);
      this.a(djm.ck, djm.gK, fmw.d.b);
      this.a(djm.cn, djm.gL, fmw.d.b);
      this.a(djm.cm, djm.gM, fmw.d.b);
      this.a(djm.bC, djm.gN, fmw.d.b);
      this.a(djm.bZ, djm.gn, fmw.d.b);
      this.I();
      this.x(djm.fh);
      this.x(djm.fi);
      this.x(djm.fj);
      this.b(djm.bA, fmw.d.a);
      this.h(djm.bA);
      this.b(djm.ef, fmw.d.a);
      this.b(cwr.dS);
      this.c(djm.mE, djm.mF, fmw.d.b);
      this.b(cwr.dT);
      this.b(djm.ti, fmw.d.b);
      this.c(djm.pb, djm.pc, fmw.d.b);
      this.c(djm.pd, djm.pe, fmw.d.b);
      this.a(djm.pb, "_plant");
      this.a(djm.pd, "_plant");
      this.a(djm.nA, fmw.d.a, fnr.c(fnr.a(djm.nB, "_stage0")));
      this.n();
      this.a(djm.bz, fmw.d.b);
      this.d(djm.jc, fmw.d.b);
      this.d(djm.jd, fmw.d.b);
      this.d(djm.je, fmw.d.b);
      this.o(djm.jf);
      this.o(djm.jg);
      this.k();
      this.l();
      this.m();
      this.a(djm.mY, djm.mT, djm.mO, djm.mJ, djm.ni, djm.nd, djm.ns, djm.nn);
      this.a(djm.mZ, djm.mU, djm.mP, djm.mK, djm.nj, djm.ne, djm.nt, djm.no);
      this.a(djm.na, djm.mV, djm.mQ, djm.mL, djm.nk, djm.nf, djm.nu, djm.np);
      this.a(djm.nb, djm.mW, djm.mR, djm.mM, djm.nl, djm.ng, djm.nv, djm.nq);
      this.a(djm.nc, djm.mX, djm.mS, djm.mN, djm.nm, djm.nh, djm.nw, djm.nr);
      this.f(djm.fs, djm.fq);
      this.f(djm.fr, djm.fp);
      this.m(djm.af).c(djm.af).a(djm.aA);
      this.m(djm.ar).c(djm.ar).a(djm.aJ);
      this.a(djm.ar, djm.du, djm.dE);
      this.a(djm.aS, fnt.s, -7158200);
      this.m(djm.ab).c(djm.ab).a(djm.ax);
      this.m(djm.am).c(djm.am).a(djm.aF);
      this.a(djm.am, djm.dn, djm.dz);
      this.a(djm.D, djm.gs, fmw.d.b);
      this.a(djm.aO, fnt.s, -12012264);
      this.m(djm.ac).d(djm.ac).a(djm.ay);
      this.m(djm.an).d(djm.an).a(djm.aG);
      this.a(djm.an, djm.do, djm.dA);
      this.a(djm.E, djm.gt, fmw.d.b);
      this.b(djm.aP, fnt.s);
      this.m(djm.Z).c(djm.Z).a(djm.av);
      this.m(djm.ak).c(djm.ak).a(djm.aD);
      this.a(djm.ak, djm.dm, djm.dy);
      this.a(djm.B, djm.gq, fmw.d.b);
      this.a(djm.aM, fnt.s, -8345771);
      this.m(djm.X).c(djm.X).a(djm.at);
      this.m(djm.aq).c(djm.aq).a(djm.aB);
      this.a(djm.aq, djm.dk, djm.dw);
      this.a(djm.z, djm.go, fmw.d.b);
      this.a(djm.aK, fnt.s, -12012264);
      this.m(djm.Y).c(djm.Y).a(djm.au);
      this.m(djm.aj).c(djm.aj).a(djm.aC);
      this.a(djm.aj, djm.dl, djm.dx);
      this.a(djm.A, djm.gp, fmw.d.b);
      this.a(djm.aL, fnt.s, -10380959);
      this.m(djm.ad).c(djm.ad).a(djm.az);
      this.m(djm.ao).c(djm.ao).a(djm.aH);
      this.a(djm.ao, djm.dq, djm.dC);
      this.a(djm.F, djm.gu, fmw.d.b);
      this.a(djm.aQ, fnt.s, -12012264);
      this.m(djm.ae).c(djm.ae).a(djm.u);
      this.m(djm.ap).c(djm.ap).a(djm.aI);
      this.a(djm.ap, djm.dr, djm.dD);
      this.a(djm.G, djm.gv, fmw.d.b);
      this.b(djm.aR, fnt.s);
      this.m(djm.aa).c(djm.aa).a(djm.aw);
      this.m(djm.al).c(djm.al).a(djm.aE);
      this.a(djm.al, djm.dp, djm.dB);
      this.a(djm.C, djm.gr, fmw.d.b);
      this.a(djm.aN, fnt.s, -12012264);
      this.m(djm.oU).b(djm.oU).a(djm.oW);
      this.m(djm.oV).b(djm.oV).a(djm.oX);
      this.a(djm.oV, djm.ds, djm.dF);
      this.a(djm.oZ, djm.pO, fmw.d.b);
      this.n(djm.pf, djm.pQ);
      this.m(djm.oL).b(djm.oL).a(djm.oN);
      this.m(djm.oM).b(djm.oM).a(djm.oO);
      this.a(djm.oM, djm.dt, djm.dG);
      this.a(djm.oQ, djm.pP, fmw.d.b);
      this.n(djm.oS, djm.pR);
      this.m(djm.ai).d(djm.ai);
      this.m(djm.as).d(djm.as);
      this.a(djm.x, djm.dv, djm.dH);
      this.b(djm.oT, fmw.d.b);
      this.b(cwr.dP);
      this.j(djm.dK);
      this.l(djm.iw);
      this.v();
      this.p(djm.cY);
      this.q(djm.bw);
      this.q(djm.bx);
      this.q(djm.hE);
      this.u();
      this.t(djm.gi);
      this.t(djm.li);
      this.t(djm.lj);
      this.u(djm.hp);
      this.u(djm.hq);
      this.u(djm.hr);
      this.p();
      this.q();
      this.d(djm.cL, fnt.h);
      this.d(djm.oy, fnt.h);
      this.d(djm.ox, fnt.i);
      this.t();
      this.aC();
      this.ax();
      this.l(djm.eY, djm.fg);
      this.l(djm.m, djm.fc);
      this.l(djm.eX, djm.ff);
      this.l(djm.eW, djm.fe);
      this.aA();
      this.l(djm.eV, djm.fd);
      this.aB();
   }

   private void aJ() {
      hbh.b $$0 = fnm.a(this.a(cwr.hZ));
      Map<Integer, hbh.b> $$1 = new HashMap<>(16);
      fnf.a<Integer> $$2 = fnf.a(dxl.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         aku $$5 = fnr.a(cwr.hZ, $$4);
         $$2.a($$3, fnh.a().a(fni.c, fnq.aa.a(djm.iv, $$4, fnr.h($$5), this.d)));
         hbh.b $$6 = fnm.a(fnq.bE.a(fno.a(cwr.hZ, $$4), fnr.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cwr.hZ, fnm.a(doa.c, $$0, $$1));
      this.b.accept(fne.a(djm.iv).a($$2));
   }

   private void o(djk $$0, djk $$1) {
      this.b($$0.j());
      fnr $$2 = fnr.b(fnr.J($$0));
      fnr $$3 = fnr.b(fnr.a($$0, "_lit"));
      aku $$4 = fnq.bR.a($$0, "_one_candle", $$2, this.d);
      aku $$5 = fnq.bS.a($$0, "_two_candles", $$2, this.d);
      aku $$6 = fnq.bT.a($$0, "_three_candles", $$2, this.d);
      aku $$7 = fnq.bU.a($$0, "_four_candles", $$2, this.d);
      aku $$8 = fnq.bR.a($$0, "_one_candle_lit", $$3, this.d);
      aku $$9 = fnq.bS.a($$0, "_two_candles_lit", $$3, this.d);
      aku $$10 = fnq.bT.a($$0, "_three_candles_lit", $$3, this.d);
      aku $$11 = fnq.bU.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fne.a($$0)
               .a(
                  fnf.a(dxl.aC, dxl.v)
                     .a(1, false, fnh.a().a(fni.c, $$4))
                     .a(2, false, fnh.a().a(fni.c, $$5))
                     .a(3, false, fnh.a().a(fni.c, $$6))
                     .a(4, false, fnh.a().a(fni.c, $$7))
                     .a(1, true, fnh.a().a(fni.c, $$8))
                     .a(2, true, fnh.a().a(fni.c, $$9))
                     .a(3, true, fnh.a().a(fni.c, $$10))
                     .a(4, true, fnh.a().a(fni.c, $$11))
               )
         );
      aku $$12 = fnq.bV.a($$1, fnr.a($$0, false), this.d);
      aku $$13 = fnq.bV.a($$1, "_lit", fnr.a($$0, true), this.d);
      this.b.accept(fne.a($$1).a(a(dxl.v, $$13, $$12)));
   }

   class a {
      private final fnr b;
      private final Map<fnp, aku> c = Maps.newHashMap();
      @Nullable
      private mf d;
      @Nullable
      private aku e;
      private final Set<djk> f = new HashSet<>();

      public a(final fnr $$0) {
         this.b = $$0;
      }

      public fmw.a a(djk $$0, fnp $$1) {
         this.e = $$1.a($$0, this.b, fmw.this.d);
         if (fmw.this.f.containsKey($$0)) {
            fmw.this.b.accept(fmw.this.f.get($$0).create($$0, this.e, this.b, fmw.this.d));
         } else {
            fmw.this.b.accept(fmw.c($$0, this.e));
         }

         return this;
      }

      public fmw.a a(djk $$0, djk $$1) {
         aku $$2 = fno.a($$0);
         fmw.this.b.accept(fmw.c($$1, $$2));
         fmw.this.c.a($$0.j(), $$1.j());
         this.f.add($$1);
         return this;
      }

      public fmw.a a(djk $$0) {
         aku $$1 = fnq.s.a($$0, this.b, fmw.this.d);
         aku $$2 = fnq.t.a($$0, this.b, fmw.this.d);
         fmw.this.b.accept(fmw.b($$0, $$1, $$2));
         aku $$3 = fnq.u.a($$0, this.b, fmw.this.d);
         fmw.this.a($$0, $$3);
         return this;
      }

      public fmw.a b(djk $$0) {
         aku $$1 = fnq.M.a($$0, this.b, fmw.this.d);
         aku $$2 = fnq.N.a($$0, this.b, fmw.this.d);
         aku $$3 = fnq.O.a($$0, this.b, fmw.this.d);
         fmw.this.b.accept(fmw.a($$0, $$1, $$2, $$3));
         aku $$4 = fnq.P.a($$0, this.b, fmw.this.d);
         fmw.this.a($$0, $$4);
         return this;
      }

      public fmw.a c(djk $$0) {
         fnr $$1 = fnr.s($$0);
         aku $$2 = fnq.D.a($$0, $$1, fmw.this.d);
         aku $$3 = fnq.E.a($$0, $$1, fmw.this.d);
         aku $$4 = fnq.F.a($$0, $$1, fmw.this.d);
         aku $$5 = fnq.G.a($$0, $$1, fmw.this.d);
         aku $$6 = fnq.H.a($$0, $$1, fmw.this.d);
         fmw.this.b.accept(fmw.a($$0, $$2, $$3, $$4, $$5, $$6));
         aku $$7 = fnq.I.a($$0, $$1, fmw.this.d);
         fmw.this.a($$0, $$7);
         return this;
      }

      public fmw.a d(djk $$0) {
         aku $$1 = fnq.J.a($$0, this.b, fmw.this.d);
         aku $$2 = fnq.K.a($$0, this.b, fmw.this.d);
         fmw.this.b.accept(fmw.c($$0, $$1, $$2));
         aku $$3 = fnq.L.a($$0, this.b, fmw.this.d);
         fmw.this.a($$0, $$3);
         return this;
      }

      public fmw.a e(djk $$0) {
         fnr $$1 = fnr.s($$0);
         aku $$2 = fnq.R.a($$0, $$1, fmw.this.d);
         aku $$3 = fnq.Q.a($$0, $$1, fmw.this.d);
         aku $$4 = fnq.T.a($$0, $$1, fmw.this.d);
         aku $$5 = fnq.S.a($$0, $$1, fmw.this.d);
         fmw.this.b.accept(fmw.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fmw.a f(djk $$0) {
         aku $$1 = fnq.V.a($$0, this.b, fmw.this.d);
         aku $$2 = fnq.U.a($$0, this.b, fmw.this.d);
         aku $$3 = fnq.X.a($$0, this.b, fmw.this.d);
         aku $$4 = fnq.W.a($$0, this.b, fmw.this.d);
         fmw.this.b.accept(fmw.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fmw.a g(djk $$0) {
         aku $$1 = fnq.Y.a($$0, this.b, fmw.this.d);
         aku $$2 = fnq.Z.a($$0, this.b, fmw.this.d);
         fmw.this.b.accept(fmw.e($$0, $$1, $$2));
         return this;
      }

      public fmw.a h(djk $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            djk $$1 = this.d.b().get(mf.b.r);
            aku $$2 = fnq.aa.a($$0, this.b, fmw.this.d);
            fmw.this.b.accept(fmw.c($$0, $$2));
            fmw.this.b.accept(fmw.c($$1, $$2));
            fmw.this.b($$0.j());
            return this;
         }
      }

      public fmw.a i(djk $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            aku $$1 = this.a(fnq.ab, $$0);
            aku $$2 = this.a(fnq.ac, $$0);
            fmw.this.b.accept(fmw.e($$0, $$1, $$2, this.e));
            fmw.this.a($$0, $$1);
            return this;
         }
      }

      public fmw.a j(djk $$0) {
         aku $$1 = this.a(fnq.af, $$0);
         aku $$2 = this.a(fnq.ae, $$0);
         aku $$3 = this.a(fnq.ag, $$0);
         fmw.this.b.accept(fmw.b($$0, $$1, $$2, $$3));
         fmw.this.a($$0, $$2);
         return this;
      }

      private fmw.a k(djk $$0) {
         fnt $$1 = fmw.this.g.getOrDefault($$0, fnt.a.get($$0));
         aku $$2 = $$1.a($$0, fmw.this.d);
         fmw.this.b.accept(fmw.c($$0, $$2));
         return this;
      }

      private fmw.a l(djk $$0) {
         fmw.this.j($$0);
         return this;
      }

      private void m(djk $$0) {
         if (fmw.this.e.contains($$0)) {
            fmw.this.l($$0);
         } else {
            fmw.this.k($$0);
         }
      }

      private aku a(fnp $$0, djk $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fmw.this.d));
      }

      public fmw.a a(mf $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fmw.a, djk> $$2 = fmw.h.get($$0x);
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
      fnb create(djk var1, aku var2, fnr var3, BiConsumer<aku, fnn> var4);
   }

   static record c(fnp a, String b) {
   }

   static enum d {
      a(fnq.ap, fnq.as, false),
      b(fnq.ao, fnq.ar, false),
      c(fnq.aq, fnq.at, true);

      private final fnp d;
      private final fnp e;
      private final boolean f;

      private d(final fnp $$0, final fnp $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fnp a() {
         return this.d;
      }

      public fnp b() {
         return this.e;
      }

      public aku a(fmw $$0, djk $$1) {
         cwj $$2 = $$1.j();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fnr a(djk $$0) {
         return this.f ? fnr.e($$0) : fnr.c($$0);
      }

      public fnr b(djk $$0) {
         return this.f ? fnr.g($$0) : fnr.f($$0);
      }
   }

   class e {
      private final fnr b;

      public e(final fnr $$0) {
         this.b = $$0;
      }

      public fmw.e a(djk $$0) {
         fnr $$1 = this.b.c(fns.d, this.b.a(fns.i));
         aku $$2 = fnq.j.a($$0, $$1, fmw.this.d);
         fmw.this.b.accept(fmw.d($$0, $$2));
         return this;
      }

      public fmw.e b(djk $$0) {
         aku $$1 = fnq.j.a($$0, this.b, fmw.this.d);
         fmw.this.b.accept(fmw.d($$0, $$1));
         return this;
      }

      public fmw.e c(djk $$0) {
         aku $$1 = fnq.j.a($$0, this.b, fmw.this.d);
         aku $$2 = fnq.k.a($$0, this.b, fmw.this.d);
         fmw.this.b.accept(fmw.d($$0, $$1, $$2));
         return this;
      }

      public fmw.e d(djk $$0) {
         fmw.this.b.accept(fmw.a($$0, this.b, fmw.this.d));
         return this;
      }
   }
}
