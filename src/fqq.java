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

public class fqq {
   final Consumer<fqv> b;
   final fqt c;
   final BiConsumer<alg, frh> d;
   final List<dmf> e = ImmutableList.of(dmh.eP, dmh.eV, dmh.iA);
   final Map<dmf, fqq.b> f = ImmutableMap.builder().put(dmh.b, fqq::a).put(dmh.tt, fqq::c).put(dmh.fe, fqq::b).build();
   final Map<dmf, frn> g = ImmutableMap.builder()
      .put(dmh.bc, frn.C.get(dmh.bc))
      .put(dmh.jR, frn.C.get(dmh.jR))
      .put(dmh.kv, frn.a(frl.a(dmh.bc, "_top")))
      .put(dmh.kx, frn.a(frl.a(dmh.jR, "_top")))
      .put(dmh.be, frn.d.get(dmh.bc).a($$0x -> $$0x.a(frm.i, frl.J(dmh.be))))
      .put(dmh.jT, frn.d.get(dmh.jR).a($$0x -> $$0x.a(frm.i, frl.J(dmh.jT))))
      .put(dmh.hE, frn.d.get(dmh.hE))
      .put(dmh.kw, frn.a(frl.a(dmh.hE, "_bottom")))
      .put(dmh.pZ, frn.D.get(dmh.pZ))
      .put(dmh.tt, frn.D.get(dmh.tt))
      .put(dmh.hF, frn.d.get(dmh.hF).a($$0x -> $$0x.a(frm.i, frl.J(dmh.hF))))
      .put(dmh.bd, frn.d.get(dmh.bd).a($$0x -> {
         $$0x.a(frm.d, frl.a(dmh.bc, "_top"));
         $$0x.a(frm.i, frl.J(dmh.bd));
      }))
      .put(dmh.jS, frn.d.get(dmh.jS).a($$0x -> {
         $$0x.a(frm.d, frl.a(dmh.jR, "_top"));
         $$0x.a(frm.i, frl.J(dmh.jS));
      }))
      .put(dmh.ru, frn.D.get(dmh.ru))
      .put(dmh.rp, frn.D.get(dmh.rp))
      .build();
   static final Map<mj.b, BiConsumer<fqq.a, dmf>> h = ImmutableMap.builder()
      .put(mj.b.a, fqq.a::a)
      .put(mj.b.e, fqq.a::l)
      .put(mj.b.b, fqq.a::k)
      .put(mj.b.c, fqq.a::k)
      .put(mj.b.f, fqq.a::c)
      .put(mj.b.g, fqq.a::d)
      .put(mj.b.h, fqq.a::e)
      .put(mj.b.i, fqq.a::f)
      .put(mj.b.k, fqq.a::h)
      .put(mj.b.l, fqq.a::i)
      .put(mj.b.m, fqq.a::j)
      .put(mj.b.n, fqq.a::g)
      .put(mj.b.p, fqq.a::m)
      .put(mj.b.q, fqq.a::b)
      .build();
   public static final List<Pair<ja, Function<alg, frb>>> a = List.of(
      Pair.of(ja.c, (Function<alg, frb>)$$0 -> frb.a().a(frc.c, $$0)),
      Pair.of(ja.f, (Function<alg, frb>)$$0 -> frb.a().a(frc.c, $$0).a(frc.b, frc.a.b).a(frc.d, true)),
      Pair.of(ja.d, (Function<alg, frb>)$$0 -> frb.a().a(frc.c, $$0).a(frc.b, frc.a.c).a(frc.d, true)),
      Pair.of(ja.e, (Function<alg, frb>)$$0 -> frb.a().a(frc.c, $$0).a(frc.b, frc.a.d).a(frc.d, true)),
      Pair.of(ja.b, (Function<alg, frb>)$$0 -> frb.a().a(frc.c, $$0).a(frc.a, frc.a.d).a(frc.d, true)),
      Pair.of(ja.a, (Function<alg, frb>)$$0 -> frb.a().a(frc.c, $$0).a(frc.a, frc.a.b).a(frc.d, true))
   );
   private static final Map<fqq.c, alg> i = new HashMap<>();

   private static fqv a(dmf $$0, alg $$1, frl $$2, BiConsumer<alg, frh> $$3) {
      alg $$4 = frk.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fqv b(dmf $$0, alg $$1, frl $$2, BiConsumer<alg, frh> $$3) {
      alg $$4 = frk.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fqv c(dmf $$0, alg $$1, frl $$2, BiConsumer<alg, frh> $$3) {
      alg $$4 = frk.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fqq(Consumer<fqv> $$0, fqt $$1, BiConsumer<alg, frh> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cyz $$0, alg $$1) {
      this.c.a($$0, frg.a($$1));
   }

   void a(dmf $$0, alg $$1) {
      this.c.a($$0.h(), frg.a($$1));
   }

   private void a(dmf $$0, alg $$1, fqj $$2) {
      this.c.a($$0.h(), frg.a($$1, $$2));
   }

   private alg a(cyz $$0) {
      return frk.bI.a(fri.a($$0), frl.b($$0), this.d);
   }

   alg a(cyz $$0, dmf $$1) {
      return frk.bI.a(fri.a($$0), frl.I($$1), this.d);
   }

   private alg a(cyz $$0, dmf $$1, String $$2) {
      return frk.bI.a(fri.a($$0), frl.k(frl.a($$1, $$2)), this.d);
   }

   alg b(cyz $$0, dmf $$1, String $$2) {
      alg $$3 = frl.J($$1);
      alg $$4 = frl.a($$1, $$2);
      return frk.bM.a(fri.a($$0), frl.c($$3, $$4), this.d);
   }

   void b(cyz $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dmf $$0) {
      cyz $$1 = $$0.h();
      if ($$1 != czh.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dmf $$0, String $$1) {
      cyz $$2 = $$0.h();
      if ($$2 != czh.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dmf $$0, String $$1) {
      cyz $$2 = $$0.h();
      if ($$2 != czh.a) {
         alg $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fqz b() {
      return fqz.a(eax.T).a(ja.f, frb.a().a(frc.b, frc.a.b)).a(ja.d, frb.a().a(frc.b, frc.a.c)).a(ja.e, frb.a().a(frc.b, frc.a.d)).a(ja.c, frb.a());
   }

   private static fqz c() {
      return fqz.a(eax.T).a(ja.d, frb.a()).a(ja.e, frb.a().a(frc.b, frc.a.b)).a(ja.c, frb.a().a(frc.b, frc.a.c)).a(ja.f, frb.a().a(frc.b, frc.a.d));
   }

   private static fqz d() {
      return fqz.a(eax.T).a(ja.f, frb.a()).a(ja.d, frb.a().a(frc.b, frc.a.b)).a(ja.e, frb.a().a(frc.b, frc.a.c)).a(ja.c, frb.a().a(frc.b, frc.a.d));
   }

   private static fqz e() {
      return fqz.a(eax.R)
         .a(ja.a, frb.a().a(frc.a, frc.a.b))
         .a(ja.b, frb.a().a(frc.a, frc.a.d))
         .a(ja.c, frb.a())
         .a(ja.d, frb.a().a(frc.b, frc.a.c))
         .a(ja.e, frb.a().a(frc.b, frc.a.d))
         .a(ja.f, frb.a().a(frc.b, frc.a.b));
   }

   private static fqy b(dmf $$0, alg $$1) {
      return fqy.a($$0, a($$1));
   }

   private static frb[] a(alg $$0) {
      return new frb[]{
         frb.a().a(frc.c, $$0), frb.a().a(frc.c, $$0).a(frc.b, frc.a.b), frb.a().a(frc.c, $$0).a(frc.b, frc.a.c), frb.a().a(frc.c, $$0).a(frc.b, frc.a.d)
      };
   }

   private static fqy a(dmf $$0, alg $$1, alg $$2) {
      return fqy.a($$0, frb.a().a(frc.c, $$1), frb.a().a(frc.c, $$2), frb.a().a(frc.c, $$1).a(frc.b, frc.a.c), frb.a().a(frc.c, $$2).a(frc.b, frc.a.c));
   }

   private static fqz a(eay $$0, alg $$1, alg $$2) {
      return fqz.a($$0).a(true, frb.a().a(frc.c, $$1)).a(false, frb.a().a(frc.c, $$2));
   }

   private void d(dmf $$0) {
      alg $$1 = frn.a.create($$0, this.d);
      alg $$2 = frn.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(dmf $$0) {
      alg $$1 = frn.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(dmf $$0) {
      this.b.accept(fqy.a($$0).a(fqz.a(eax.by).a($$1 -> {
         String $$2 = "_" + $$1;
         alg $$3 = frl.a($$0, $$2);
         return frb.a().a(frc.c, frk.c.a($$0, $$2, new frl().a(frm.a, $$3), this.d));
      })));
      this.a($$0, fri.a($$0, "_0"));
   }

   static fqv b(dmf $$0, alg $$1, alg $$2) {
      return fqy.a($$0)
         .a(fqz.a(eax.A).a(false, frb.a().a(frc.c, $$1)).a(true, frb.a().a(frc.c, $$2)))
         .a(
            fqz.a(eax.X, eax.T)
               .a(eas.a, ja.f, frb.a().a(frc.b, frc.a.b))
               .a(eas.a, ja.e, frb.a().a(frc.b, frc.a.d))
               .a(eas.a, ja.d, frb.a().a(frc.b, frc.a.c))
               .a(eas.a, ja.c, frb.a())
               .a(eas.b, ja.f, frb.a().a(frc.b, frc.a.b).a(frc.a, frc.a.b).a(frc.d, true))
               .a(eas.b, ja.e, frb.a().a(frc.b, frc.a.d).a(frc.a, frc.a.b).a(frc.d, true))
               .a(eas.b, ja.d, frb.a().a(frc.b, frc.a.c).a(frc.a, frc.a.b).a(frc.d, true))
               .a(eas.b, ja.c, frb.a().a(frc.a, frc.a.b).a(frc.d, true))
               .a(eas.c, ja.f, frb.a().a(frc.b, frc.a.d).a(frc.a, frc.a.c))
               .a(eas.c, ja.e, frb.a().a(frc.b, frc.a.b).a(frc.a, frc.a.c))
               .a(eas.c, ja.d, frb.a().a(frc.a, frc.a.c))
               .a(eas.c, ja.c, frb.a().a(frc.b, frc.a.c).a(frc.a, frc.a.c))
         );
   }

   private static fqz.d<ja, ebd, ebc, Boolean> a(fqz.d<ja, ebd, ebc, Boolean> $$0, ebd $$1, alg $$2, alg $$3, alg $$4, alg $$5) {
      return $$0.a(ja.f, $$1, ebc.a, false, frb.a().a(frc.c, $$2))
         .a(ja.d, $$1, ebc.a, false, frb.a().a(frc.c, $$2).a(frc.b, frc.a.b))
         .a(ja.e, $$1, ebc.a, false, frb.a().a(frc.c, $$2).a(frc.b, frc.a.c))
         .a(ja.c, $$1, ebc.a, false, frb.a().a(frc.c, $$2).a(frc.b, frc.a.d))
         .a(ja.f, $$1, ebc.b, false, frb.a().a(frc.c, $$4))
         .a(ja.d, $$1, ebc.b, false, frb.a().a(frc.c, $$4).a(frc.b, frc.a.b))
         .a(ja.e, $$1, ebc.b, false, frb.a().a(frc.c, $$4).a(frc.b, frc.a.c))
         .a(ja.c, $$1, ebc.b, false, frb.a().a(frc.c, $$4).a(frc.b, frc.a.d))
         .a(ja.f, $$1, ebc.a, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
         .a(ja.d, $$1, ebc.a, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c))
         .a(ja.e, $$1, ebc.a, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d))
         .a(ja.c, $$1, ebc.a, true, frb.a().a(frc.c, $$3))
         .a(ja.f, $$1, ebc.b, true, frb.a().a(frc.c, $$5).a(frc.b, frc.a.d))
         .a(ja.d, $$1, ebc.b, true, frb.a().a(frc.c, $$5))
         .a(ja.e, $$1, ebc.b, true, frb.a().a(frc.c, $$5).a(frc.b, frc.a.b))
         .a(ja.c, $$1, ebc.b, true, frb.a().a(frc.c, $$5).a(frc.b, frc.a.c));
   }

   private static fqv a(dmf $$0, alg $$1, alg $$2, alg $$3, alg $$4, alg $$5, alg $$6, alg $$7, alg $$8) {
      return fqy.a($$0).a(a(a(fqz.a(eax.T, eax.ah, eax.bh, eax.y), ebd.b, $$1, $$2, $$3, $$4), ebd.a, $$5, $$6, $$7, $$8));
   }

   static fqv a(dmf $$0, alg $$1, alg $$2, alg $$3, alg $$4, alg $$5) {
      return fqx.a($$0)
         .a(frb.a().a(frc.c, $$1))
         .a(fqw.a().a(eax.N, true), frb.a().a(frc.c, $$2).a(frc.d, false))
         .a(fqw.a().a(eax.O, true), frb.a().a(frc.c, $$3).a(frc.d, false))
         .a(fqw.a().a(eax.P, true), frb.a().a(frc.c, $$4).a(frc.d, false))
         .a(fqw.a().a(eax.Q, true), frb.a().a(frc.c, $$5).a(frc.d, false));
   }

   static fqv c(dmf $$0, alg $$1, alg $$2) {
      return fqx.a($$0)
         .a(frb.a().a(frc.c, $$1))
         .a(fqw.a().a(eax.N, true), frb.a().a(frc.c, $$2).a(frc.d, true))
         .a(fqw.a().a(eax.O, true), frb.a().a(frc.c, $$2).a(frc.b, frc.a.b).a(frc.d, true))
         .a(fqw.a().a(eax.P, true), frb.a().a(frc.c, $$2).a(frc.b, frc.a.c).a(frc.d, true))
         .a(fqw.a().a(eax.Q, true), frb.a().a(frc.c, $$2).a(frc.b, frc.a.d).a(frc.d, true));
   }

   static fqv a(dmf $$0, alg $$1, alg $$2, alg $$3) {
      return fqx.a($$0)
         .a(fqw.a().a(eax.L, true), frb.a().a(frc.c, $$1))
         .a(fqw.a().a(eax.aa, ebu.b), frb.a().a(frc.c, $$2).a(frc.d, true))
         .a(fqw.a().a(eax.Z, ebu.b), frb.a().a(frc.c, $$2).a(frc.b, frc.a.b).a(frc.d, true))
         .a(fqw.a().a(eax.ab, ebu.b), frb.a().a(frc.c, $$2).a(frc.b, frc.a.c).a(frc.d, true))
         .a(fqw.a().a(eax.ac, ebu.b), frb.a().a(frc.c, $$2).a(frc.b, frc.a.d).a(frc.d, true))
         .a(fqw.a().a(eax.aa, ebu.c), frb.a().a(frc.c, $$3).a(frc.d, true))
         .a(fqw.a().a(eax.Z, ebu.c), frb.a().a(frc.c, $$3).a(frc.b, frc.a.b).a(frc.d, true))
         .a(fqw.a().a(eax.ab, ebu.c), frb.a().a(frc.c, $$3).a(frc.b, frc.a.c).a(frc.d, true))
         .a(fqw.a().a(eax.ac, ebu.c), frb.a().a(frc.c, $$3).a(frc.b, frc.a.d).a(frc.d, true));
   }

   static fqv a(dmf $$0, alg $$1, alg $$2, alg $$3, alg $$4, boolean $$5) {
      return fqy.a($$0, frb.a().a(frc.d, $$5))
         .a(c())
         .a(
            fqz.a(eax.t, eax.y)
               .a(false, false, frb.a().a(frc.c, $$2))
               .a(true, false, frb.a().a(frc.c, $$4))
               .a(false, true, frb.a().a(frc.c, $$1))
               .a(true, true, frb.a().a(frc.c, $$3))
         );
   }

   static fqv b(dmf $$0, alg $$1, alg $$2, alg $$3) {
      return fqy.a($$0)
         .a(
            fqz.a(eax.T, eax.ai, eax.bl)
               .a(ja.f, ebg.b, ebq.a, frb.a().a(frc.c, $$2))
               .a(ja.e, ebg.b, ebq.a, frb.a().a(frc.c, $$2).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.d, ebg.b, ebq.a, frb.a().a(frc.c, $$2).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.c, ebg.b, ebq.a, frb.a().a(frc.c, $$2).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.f, ebg.b, ebq.e, frb.a().a(frc.c, $$3))
               .a(ja.e, ebg.b, ebq.e, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.d, ebg.b, ebq.e, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.c, ebg.b, ebq.e, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.f, ebg.b, ebq.d, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.e, ebg.b, ebq.d, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.d, ebg.b, ebq.d, frb.a().a(frc.c, $$3))
               .a(ja.c, ebg.b, ebq.d, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.f, ebg.b, ebq.c, frb.a().a(frc.c, $$1))
               .a(ja.e, ebg.b, ebq.c, frb.a().a(frc.c, $$1).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.d, ebg.b, ebq.c, frb.a().a(frc.c, $$1).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.c, ebg.b, ebq.c, frb.a().a(frc.c, $$1).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.f, ebg.b, ebq.b, frb.a().a(frc.c, $$1).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.e, ebg.b, ebq.b, frb.a().a(frc.c, $$1).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.d, ebg.b, ebq.b, frb.a().a(frc.c, $$1))
               .a(ja.c, ebg.b, ebq.b, frb.a().a(frc.c, $$1).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.f, ebg.a, ebq.a, frb.a().a(frc.c, $$2).a(frc.a, frc.a.c).a(frc.d, true))
               .a(ja.e, ebg.a, ebq.a, frb.a().a(frc.c, $$2).a(frc.a, frc.a.c).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.d, ebg.a, ebq.a, frb.a().a(frc.c, $$2).a(frc.a, frc.a.c).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.c, ebg.a, ebq.a, frb.a().a(frc.c, $$2).a(frc.a, frc.a.c).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.f, ebg.a, ebq.e, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.e, ebg.a, ebq.e, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.d, ebg.a, ebq.e, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.c, ebg.a, ebq.e, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.d, true))
               .a(ja.f, ebg.a, ebq.d, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.d, true))
               .a(ja.e, ebg.a, ebq.d, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.d, ebg.a, ebq.d, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.c, ebg.a, ebq.d, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.f, ebg.a, ebq.c, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.e, ebg.a, ebq.c, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.b, frc.a.d).a(frc.d, true))
               .a(ja.d, ebg.a, ebq.c, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.c, ebg.a, ebq.c, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.d, true))
               .a(ja.f, ebg.a, ebq.b, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.d, true))
               .a(ja.e, ebg.a, ebq.b, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.b, frc.a.c).a(frc.d, true))
               .a(ja.d, ebg.a, ebq.b, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.b, frc.a.b).a(frc.d, true))
               .a(ja.c, ebg.a, ebq.b, frb.a().a(frc.c, $$1).a(frc.a, frc.a.c).a(frc.b, frc.a.d).a(frc.d, true))
         );
   }

   private static fqv c(dmf $$0, alg $$1, alg $$2, alg $$3) {
      return fqy.a($$0)
         .a(
            fqz.a(eax.T, eax.ai, eax.y)
               .a(ja.c, ebg.b, false, frb.a().a(frc.c, $$2))
               .a(ja.d, ebg.b, false, frb.a().a(frc.c, $$2).a(frc.b, frc.a.c))
               .a(ja.f, ebg.b, false, frb.a().a(frc.c, $$2).a(frc.b, frc.a.b))
               .a(ja.e, ebg.b, false, frb.a().a(frc.c, $$2).a(frc.b, frc.a.d))
               .a(ja.c, ebg.a, false, frb.a().a(frc.c, $$1))
               .a(ja.d, ebg.a, false, frb.a().a(frc.c, $$1).a(frc.b, frc.a.c))
               .a(ja.f, ebg.a, false, frb.a().a(frc.c, $$1).a(frc.b, frc.a.b))
               .a(ja.e, ebg.a, false, frb.a().a(frc.c, $$1).a(frc.b, frc.a.d))
               .a(ja.c, ebg.b, true, frb.a().a(frc.c, $$3))
               .a(ja.d, ebg.b, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c))
               .a(ja.f, ebg.b, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
               .a(ja.e, ebg.b, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d))
               .a(ja.c, ebg.a, true, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.c))
               .a(ja.d, ebg.a, true, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.a))
               .a(ja.f, ebg.a, true, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.d))
               .a(ja.e, ebg.a, true, frb.a().a(frc.c, $$3).a(frc.a, frc.a.c).a(frc.b, frc.a.b))
         );
   }

   private static fqv d(dmf $$0, alg $$1, alg $$2, alg $$3) {
      return fqy.a($$0)
         .a(
            fqz.a(eax.T, eax.ai, eax.y)
               .a(ja.c, ebg.b, false, frb.a().a(frc.c, $$2))
               .a(ja.d, ebg.b, false, frb.a().a(frc.c, $$2))
               .a(ja.f, ebg.b, false, frb.a().a(frc.c, $$2))
               .a(ja.e, ebg.b, false, frb.a().a(frc.c, $$2))
               .a(ja.c, ebg.a, false, frb.a().a(frc.c, $$1))
               .a(ja.d, ebg.a, false, frb.a().a(frc.c, $$1))
               .a(ja.f, ebg.a, false, frb.a().a(frc.c, $$1))
               .a(ja.e, ebg.a, false, frb.a().a(frc.c, $$1))
               .a(ja.c, ebg.b, true, frb.a().a(frc.c, $$3))
               .a(ja.d, ebg.b, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c))
               .a(ja.f, ebg.b, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
               .a(ja.e, ebg.b, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d))
               .a(ja.c, ebg.a, true, frb.a().a(frc.c, $$3))
               .a(ja.d, ebg.a, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c))
               .a(ja.f, ebg.a, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
               .a(ja.e, ebg.a, true, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d))
         );
   }

   static fqy c(dmf $$0, alg $$1) {
      return fqy.a($$0, frb.a().a(frc.c, $$1));
   }

   private static fqz f() {
      return fqz.a(eax.K).a(ja.a.b, frb.a()).a(ja.a.c, frb.a().a(frc.a, frc.a.b)).a(ja.a.a, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.b));
   }

   static fqv a(dmf $$0, frl $$1, BiConsumer<alg, frh> $$2) {
      alg $$3 = frk.g.a($$0, $$1, $$2);
      alg $$4 = frk.h.a($$0, $$1, $$2);
      alg $$5 = frk.i.a($$0, $$1, $$2);
      alg $$6 = frk.j.a($$0, $$1, $$2);
      return fqy.a($$0, frb.a().a(frc.c, $$6))
         .a(fqz.a(eax.K).a(ja.a.a, frb.a().a(frc.c, $$3)).a(ja.a.b, frb.a().a(frc.c, $$4)).a(ja.a.c, frb.a().a(frc.c, $$5)));
   }

   static fqv d(dmf $$0, alg $$1) {
      return fqy.a($$0, frb.a().a(frc.c, $$1)).a(f());
   }

   private void e(dmf $$0, alg $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dmf $$0, frn.a $$1) {
      alg $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(dmf $$0, frn.a $$1) {
      alg $$2 = $$1.create($$0, this.d);
      this.b.accept(fqy.a($$0, frb.a().a(frc.c, $$2)).a(b()));
   }

   static fqv d(dmf $$0, alg $$1, alg $$2) {
      return fqy.a($$0)
         .a(
            fqz.a(eax.K)
               .a(ja.a.b, frb.a().a(frc.c, $$1))
               .a(ja.a.c, frb.a().a(frc.c, $$2).a(frc.a, frc.a.b))
               .a(ja.a.a, frb.a().a(frc.c, $$2).a(frc.a, frc.a.b).a(frc.b, frc.a.b))
         );
   }

   private void a(dmf $$0, frn.a $$1, frn.a $$2) {
      alg $$3 = $$1.create($$0, this.d);
      alg $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(dmf $$0) {
      alg $$1 = frn.A.create($$0, this.d);
      alg $$2 = frn.B.create($$0, this.d);
      alg $$3 = this.a(frn.A, $$0, "_awake");
      alg $$4 = this.a(frn.B, $$0, "_awake");
      alg $$5 = this.a(frn.A, $$0, "_dormant");
      alg $$6 = this.a(frn.B, $$0, "_dormant");
      this.b
         .accept(
            fqy.a($$0)
               .a(
                  fqz.a(eax.K, dob.c)
                     .a(ja.a.b, ebb.a, frb.a().a(frc.c, $$1))
                     .a(ja.a.c, ebb.a, frb.a().a(frc.c, $$2).a(frc.a, frc.a.b))
                     .a(ja.a.a, ebb.a, frb.a().a(frc.c, $$2).a(frc.a, frc.a.b).a(frc.b, frc.a.b))
                     .a(ja.a.b, ebb.b, frb.a().a(frc.c, $$5))
                     .a(ja.a.c, ebb.b, frb.a().a(frc.c, $$6).a(frc.a, frc.a.b))
                     .a(ja.a.a, ebb.b, frb.a().a(frc.c, $$6).a(frc.a, frc.a.b).a(frc.b, frc.a.b))
                     .a(ja.a.b, ebb.c, frb.a().a(frc.c, $$3))
                     .a(ja.a.c, ebb.c, frb.a().a(frc.c, $$4).a(frc.a, frc.a.b))
                     .a(ja.a.a, ebb.c, frb.a().a(frc.c, $$4).a(frc.a, frc.a.b).a(frc.b, frc.a.b))
               )
         );
   }

   private alg a(frn.a $$0, dmf $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(frm.i, frl.a($$1, $$2)).a(frm.d, frl.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.d);
   }

   private alg a(dmf $$0, String $$1, frj $$2, Function<alg, frl> $$3) {
      return $$2.a($$0, $$1, $$3.apply(frl.a($$0, $$1)), this.d);
   }

   static fqv e(dmf $$0, alg $$1, alg $$2) {
      return fqy.a($$0).a(a(eax.A, $$2, $$1));
   }

   static fqv e(dmf $$0, alg $$1, alg $$2, alg $$3) {
      return fqy.a($$0).a(fqz.a(eax.bk).a(ebp.b, frb.a().a(frc.c, $$1)).a(ebp.a, frb.a().a(frc.c, $$2)).a(ebp.c, frb.a().a(frc.c, $$3)));
   }

   public void a(dmf $$0) {
      this.b($$0, frn.a);
   }

   public void b(dmf $$0, frn.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(dmf $$0, frn.a $$1, int $$2) {
      alg $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, frg.a($$2));
   }

   private void g() {
      this.K(dmh.fx);
      alg $$0 = this.a(czh.gr, dmh.fx);
      this.a(dmh.fx, $$0, frg.a(-12012264));
   }

   private void h(dmf $$0) {
      alg $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new fqi());
   }

   private fqq.a i(dmf $$0) {
      frn $$1 = this.g.getOrDefault($$0, frn.a.get($$0));
      return new fqq.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dmf $$0, dmf $$1, dmf $$2) {
      alg $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.h());
   }

   void j(dmf $$0) {
      frl $$1 = frl.w($$0);
      alg $$2 = frk.v.a($$0, $$1, this.d);
      alg $$3 = frk.w.a($$0, $$1, this.d);
      alg $$4 = frk.x.a($$0, $$1, this.d);
      alg $$5 = frk.y.a($$0, $$1, this.d);
      alg $$6 = frk.z.a($$0, $$1, this.d);
      alg $$7 = frk.A.a($$0, $$1, this.d);
      alg $$8 = frk.B.a($$0, $$1, this.d);
      alg $$9 = frk.C.a($$0, $$1, this.d);
      this.b($$0.h());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dmf $$0, dmf $$1) {
      alg $$2 = frk.v.a($$0);
      alg $$3 = frk.w.a($$0);
      alg $$4 = frk.x.a($$0);
      alg $$5 = frk.y.a($$0);
      alg $$6 = frk.z.a($$0);
      alg $$7 = frk.A.a($$0);
      alg $$8 = frk.B.a($$0);
      alg $$9 = frk.C.a($$0);
      this.c.a($$0.h(), $$1.h());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dmf $$0) {
      frl $$1 = frl.b($$0);
      alg $$2 = frk.ak.a($$0, $$1, this.d);
      alg $$3 = frk.al.a($$0, $$1, this.d);
      alg $$4 = frk.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dmf $$0) {
      frl $$1 = frl.b($$0);
      alg $$2 = frk.ah.a($$0, $$1, this.d);
      alg $$3 = frk.ai.a($$0, $$1, this.d);
      alg $$4 = frk.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(dmf $$0, dmf $$1) {
      alg $$2 = frk.ah.a($$0);
      alg $$3 = frk.ai.a($$0);
      alg $$4 = frk.aj.a($$0);
      this.c.a($$0.h(), $$1.h());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      alg $$0 = fri.a(dmh.tn);
      alg $$1 = fri.a(dmh.tn, "_partial_tilt");
      alg $$2 = fri.a(dmh.tn, "_full_tilt");
      this.b
         .accept(
            fqy.a(dmh.tn)
               .a(b())
               .a(fqz.a(eax.bo).a(ebt.a, frb.a().a(frc.c, $$0)).a(ebt.b, frb.a().a(frc.c, $$0)).a(ebt.c, frb.a().a(frc.c, $$1)).a(ebt.d, frb.a().a(frc.c, $$2)))
         );
   }

   private fqq.e m(dmf $$0) {
      return new fqq.e(frl.q($$0));
   }

   private void n(dmf $$0) {
      this.d($$0, $$0);
   }

   private void d(dmf $$0, dmf $$1) {
      this.b.accept(c($$0, fri.a($$1)));
   }

   private void a(dmf $$0, fqq.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dmf $$0, fqq.d $$1, frl $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dmf $$0, fqq.d $$1) {
      frl $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dmf $$0, fqq.d $$1, frl $$2) {
      alg $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(dmf $$0, fqq.d $$1, ebk<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fqz $$4 = fqz.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            frl $$5 = frl.c(frl.a($$0, $$4x));
            alg $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return frb.a().a(frc.c, $$6);
         });
         this.b($$0.h());
         this.b.accept(fqy.a($$0).a($$4));
      }
   }

   private void a(dmf $$0, dmf $$1, fqq.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dmf $$0, dmf $$1, fqq.d $$2) {
      this.b($$0, $$2);
      frl $$3 = $$2.b($$0);
      alg $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(dmf $$0, dmf $$1) {
      frn $$2 = frn.u.get($$0);
      alg $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      alg $$4 = frk.aJ.a($$1, $$2.b(), this.d);
      this.b.accept(fqy.a($$1, frb.a().a(frc.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(dmf $$0, dmf $$1) {
      this.b($$0.h());
      frl $$2 = frl.k($$0);
      frl $$3 = frl.a($$0, $$1);
      alg $$4 = frk.bb.a($$1, $$3, this.d);
      this.b
         .accept(
            fqy.a($$1, frb.a().a(frc.c, $$4))
               .a(fqz.a(eax.T).a(ja.e, frb.a()).a(ja.d, frb.a().a(frc.b, frc.a.d)).a(ja.c, frb.a().a(frc.b, frc.a.b)).a(ja.f, frb.a().a(frc.b, frc.a.c)))
         );
      this.b.accept(fqy.a($$0).a(fqz.a(eax.ay).a($$2x -> frb.a().a(frc.c, frk.ba[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      dmf $$0 = dmh.li;
      this.b($$0.h());
      alg $$1 = fri.a($$0, "_top");
      alg $$2 = fri.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      dmf $$0 = dmh.lh;
      this.b($$0.h());
      fqz $$1 = fqz.a(dsa.e, eax.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> frb.a().a(frc.c, fri.a($$0, "_top_stage_" + $$1x));
            case b -> frb.a().a(frc.c, fri.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fqy.a($$0).a($$1));
   }

   private void a(dmf $$0, dmf $$1, dmf $$2, dmf $$3, dmf $$4, dmf $$5, dmf $$6, dmf $$7) {
      this.a($$0, fqq.d.b);
      this.a($$1, fqq.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dmf $$0, fqq.d $$1) {
      alg $$2 = this.a($$0, "_top", $$1.a(), frl::c);
      alg $$3 = this.a($$0, "_bottom", $$1.a(), frl::c);
      this.f($$0, $$2, $$3);
   }

   private void d(dmf $$0, fqq.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dmf $$0) {
      alg $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new fqi());
      this.c($$0, fqq.d.a);
   }

   private void k() {
      this.a(dmh.jf, "_front");
      alg $$0 = fri.a(dmh.jf, "_top");
      alg $$1 = this.a(dmh.jf, "_bottom", fqq.d.b.a(), frl::c);
      this.f(dmh.jf, $$0, $$1);
   }

   private void l() {
      alg $$0 = this.a(dmh.bH, "_top", frk.bv, frl::a);
      alg $$1 = this.a(dmh.bH, "_bottom", frk.bv, frl::a);
      this.f(dmh.bH, $$0, $$1);
   }

   private void m() {
      alg $$0 = fri.a(dmh.tp, "_top");
      alg $$1 = fri.a(dmh.tp, "_bottom");
      this.b.accept(fqy.a(dmh.tp).a(b()).a(fqz.a(eax.ah).a(ebd.b, frb.a().a(frc.c, $$1)).a(ebd.a, frb.a().a(frc.c, $$0))));
   }

   private void f(dmf $$0, alg $$1, alg $$2) {
      this.b.accept(fqy.a($$0).a(fqz.a(eax.ah).a(ebd.b, frb.a().a(frc.c, $$2)).a(ebd.a, frb.a().a(frc.c, $$1))));
   }

   private void p(dmf $$0) {
      frl $$1 = frl.h($$0);
      frl $$2 = frl.e(frl.a($$0, "_corner"));
      alg $$3 = frk.au.a($$0, $$1, this.d);
      alg $$4 = frk.av.a($$0, $$2, this.d);
      alg $$5 = frk.aw.a($$0, $$1, this.d);
      alg $$6 = frk.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fqy.a($$0)
               .a(
                  fqz.a(eax.aj)
                     .a(ebl.a, frb.a().a(frc.c, $$3))
                     .a(ebl.b, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
                     .a(ebl.c, frb.a().a(frc.c, $$5).a(frc.b, frc.a.b))
                     .a(ebl.d, frb.a().a(frc.c, $$6).a(frc.b, frc.a.b))
                     .a(ebl.e, frb.a().a(frc.c, $$5))
                     .a(ebl.f, frb.a().a(frc.c, $$6))
                     .a(ebl.g, frb.a().a(frc.c, $$4))
                     .a(ebl.h, frb.a().a(frc.c, $$4).a(frc.b, frc.a.b))
                     .a(ebl.i, frb.a().a(frc.c, $$4).a(frc.b, frc.a.c))
                     .a(ebl.j, frb.a().a(frc.c, $$4).a(frc.b, frc.a.d))
               )
         );
   }

   private void q(dmf $$0) {
      alg $$1 = this.a($$0, "", frk.au, frl::e);
      alg $$2 = this.a($$0, "", frk.aw, frl::e);
      alg $$3 = this.a($$0, "", frk.ax, frl::e);
      alg $$4 = this.a($$0, "_on", frk.au, frl::e);
      alg $$5 = this.a($$0, "_on", frk.aw, frl::e);
      alg $$6 = this.a($$0, "_on", frk.ax, frl::e);
      fqz $$7 = fqz.a(eax.A, eax.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return frb.a().a(frc.c, $$6x ? $$4 : $$1);
            case b:
               return frb.a().a(frc.c, $$6x ? $$4 : $$1).a(frc.b, frc.a.b);
            case c:
               return frb.a().a(frc.c, $$6x ? $$5 : $$2).a(frc.b, frc.a.b);
            case d:
               return frb.a().a(frc.c, $$6x ? $$6 : $$3).a(frc.b, frc.a.b);
            case e:
               return frb.a().a(frc.c, $$6x ? $$5 : $$2);
            case f:
               return frb.a().a(frc.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fqy.a($$0).a($$7));
   }

   private void a(dmf $$0, cyz $$1) {
      alg $$2 = frk.aa.a($$0, frl.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(dmf $$0, alg $$1) {
      alg $$2 = frk.aa.a($$0, frl.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private alg g(dmf $$0, dmf $$1) {
      return frk.aa.a($$0, frl.x($$1), this.d);
   }

   public void a(dmf $$0, dmf $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(dmf $$0) {
      this.a($$0, $$0);
   }

   private void h(dmf $$0, dmf $$1) {
      this.a($$0);
      alg $$2 = frn.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(dmf $$0) {
      alg $$1 = frn.p.create($$0, this.d);
      alg $$2 = frn.q.create($$0, this.d);
      alg $$3 = frn.r.create($$0, this.d);
      alg $$4 = frn.s.create($$0, this.d);
      this.c($$0);
      this.a($$0, eax.V, $$1, $$2, $$3, $$4);
   }

   private void t(dmf $$0) {
      alg $$1 = frn.l.create($$0, this.d);
      alg $$2 = frn.m.create($$0, this.d);
      alg $$3 = frn.n.create($$0, this.d);
      alg $$4 = frn.o.create($$0, this.d);
      this.b($$0.h());
      this.a($$0, eax.U, $$1, $$2, $$3, $$4);
   }

   private void a(dmf $$0, ebh $$1, alg $$2, alg $$3, alg $$4, alg $$5) {
      this.b
         .accept(
            fqx.a($$0)
               .a(fqw.a().a($$1, 1, 2, 3, 4).a(eax.T, ja.c), frb.a().a(frc.c, $$2))
               .a(fqw.a().a($$1, 1, 2, 3, 4).a(eax.T, ja.f), frb.a().a(frc.c, $$2).a(frc.b, frc.a.b))
               .a(fqw.a().a($$1, 1, 2, 3, 4).a(eax.T, ja.d), frb.a().a(frc.c, $$2).a(frc.b, frc.a.c))
               .a(fqw.a().a($$1, 1, 2, 3, 4).a(eax.T, ja.e), frb.a().a(frc.c, $$2).a(frc.b, frc.a.d))
               .a(fqw.a().a($$1, 2, 3, 4).a(eax.T, ja.c), frb.a().a(frc.c, $$3))
               .a(fqw.a().a($$1, 2, 3, 4).a(eax.T, ja.f), frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
               .a(fqw.a().a($$1, 2, 3, 4).a(eax.T, ja.d), frb.a().a(frc.c, $$3).a(frc.b, frc.a.c))
               .a(fqw.a().a($$1, 2, 3, 4).a(eax.T, ja.e), frb.a().a(frc.c, $$3).a(frc.b, frc.a.d))
               .a(fqw.a().a($$1, 3, 4).a(eax.T, ja.c), frb.a().a(frc.c, $$4))
               .a(fqw.a().a($$1, 3, 4).a(eax.T, ja.f), frb.a().a(frc.c, $$4).a(frc.b, frc.a.b))
               .a(fqw.a().a($$1, 3, 4).a(eax.T, ja.d), frb.a().a(frc.c, $$4).a(frc.b, frc.a.c))
               .a(fqw.a().a($$1, 3, 4).a(eax.T, ja.e), frb.a().a(frc.c, $$4).a(frc.b, frc.a.d))
               .a(fqw.a().a($$1, 4).a(eax.T, ja.c), frb.a().a(frc.c, $$5))
               .a(fqw.a().a($$1, 4).a(eax.T, ja.f), frb.a().a(frc.c, $$5).a(frc.b, frc.a.b))
               .a(fqw.a().a($$1, 4).a(eax.T, ja.d), frb.a().a(frc.c, $$5).a(frc.b, frc.a.c))
               .a(fqw.a().a($$1, 4).a(eax.T, ja.e), frb.a().a(frc.c, $$5).a(frc.b, frc.a.d))
         );
   }

   private void a(frn.a $$0, dmf... $$1) {
      for (dmf $$2 : $$1) {
         alg $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(frn.a $$0, dmf... $$1) {
      for (dmf $$2 : $$1) {
         alg $$3 = $$0.create($$2, this.d);
         this.b.accept(fqy.a($$2, frb.a().a(frc.c, $$3)).a(c()));
      }
   }

   private void i(dmf $$0, dmf $$1) {
      this.a($$0);
      frl $$2 = frl.b($$0, $$1);
      alg $$3 = frk.aP.a($$1, $$2, this.d);
      alg $$4 = frk.aQ.a($$1, $$2, this.d);
      alg $$5 = frk.aR.a($$1, $$2, this.d);
      alg $$6 = frk.aN.a($$1, $$2, this.d);
      alg $$7 = frk.aO.a($$1, $$2, this.d);
      cyz $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fqx.a($$1)
               .a(frb.a().a(frc.c, $$3))
               .a(fqw.a().a(eax.N, true), frb.a().a(frc.c, $$4))
               .a(fqw.a().a(eax.O, true), frb.a().a(frc.c, $$4).a(frc.b, frc.a.b))
               .a(fqw.a().a(eax.P, true), frb.a().a(frc.c, $$5))
               .a(fqw.a().a(eax.Q, true), frb.a().a(frc.c, $$5).a(frc.b, frc.a.b))
               .a(fqw.a().a(eax.N, false), frb.a().a(frc.c, $$6))
               .a(fqw.a().a(eax.O, false), frb.a().a(frc.c, $$7))
               .a(fqw.a().a(eax.P, false), frb.a().a(frc.c, $$7).a(frc.b, frc.a.b))
               .a(fqw.a().a(eax.Q, false), frb.a().a(frc.c, $$6).a(frc.b, frc.a.d))
         );
   }

   private void u(dmf $$0) {
      frl $$1 = frl.C($$0);
      alg $$2 = frk.aS.a($$0, $$1, this.d);
      alg $$3 = this.a($$0, "_conditional", frk.aS, $$1x -> $$1.c(frm.i, $$1x));
      this.b.accept(fqy.a($$0).a(a(eax.f, $$3, $$2)).a(e()));
   }

   private void v(dmf $$0) {
      alg $$1 = frn.v.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<frb> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> frb.a().a(frc.c, fri.a(dmh.nF, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fqx.a(dmh.nF)
               .a(fqw.a().a(eax.at, 0), this.a(0))
               .a(fqw.a().a(eax.at, 1), this.a(1))
               .a(fqw.a().a(eax.bn, eat.b), frb.a().a(frc.c, fri.a(dmh.nF, "_small_leaves")))
               .a(fqw.a().a(eax.bn, eat.c), frb.a().a(frc.c, fri.a(dmh.nF, "_large_leaves")))
         );
   }

   private fqz o() {
      return fqz.a(eax.R)
         .a(ja.a, frb.a().a(frc.a, frc.a.c))
         .a(ja.b, frb.a())
         .a(ja.c, frb.a().a(frc.a, frc.a.b))
         .a(ja.d, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.c))
         .a(ja.e, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.d))
         .a(ja.f, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.b));
   }

   private void p() {
      alg $$0 = frl.a(dmh.oA, "_top_open");
      this.b
         .accept(
            fqy.a(dmh.oA)
               .a(this.o())
               .a(
                  fqz.a(eax.y)
                     .a(false, frb.a().a(frc.c, frn.f.create(dmh.oA, this.d)))
                     .a(true, frb.a().a(frc.c, frn.f.get(dmh.oA).a($$1 -> $$1.a(frm.f, $$0)).a(dmh.oA, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fqz a(ebk<T> $$0, T $$1, alg $$2, alg $$3) {
      frb $$4 = frb.a().a(frc.c, $$2);
      frb $$5 = frb.a().a(frc.c, $$3);
      return fqz.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dmf $$0, Function<dmf, frl> $$1) {
      frl $$2 = $$1.apply($$0).b(frm.i, frm.c);
      frl $$3 = $$2.c(frm.g, frl.a($$0, "_front_honey"));
      alg $$4 = frk.q.a($$0, "_empty", $$2, this.d);
      alg $$5 = frk.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.h(), frg.a(dlz.c, frg.a($$4), Map.of(5, frg.a($$5))));
      this.b.accept(fqy.a($$0).a(b()).a(a(dlz.c, 5, $$5, $$4)));
   }

   private void a(dmf $$0, ebk<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alg> $$3 = new Int2ObjectOpenHashMap();
         fqz $$4 = fqz.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alg $$5 = (alg)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, frk.bc, frl::g));
            return frb.a().a(frc.c, $$5);
         });
         this.b($$0.h());
         this.b.accept(fqy.a($$0).a($$4));
      }
   }

   private void q() {
      alg $$0 = fri.a(dmh.oJ, "_floor");
      alg $$1 = fri.a(dmh.oJ, "_ceiling");
      alg $$2 = fri.a(dmh.oJ, "_wall");
      alg $$3 = fri.a(dmh.oJ, "_between_walls");
      this.b(czh.xD);
      this.b
         .accept(
            fqy.a(dmh.oJ)
               .a(
                  fqz.a(eax.T, eax.Y)
                     .a(ja.c, eav.a, frb.a().a(frc.c, $$0))
                     .a(ja.d, eav.a, frb.a().a(frc.c, $$0).a(frc.b, frc.a.c))
                     .a(ja.f, eav.a, frb.a().a(frc.c, $$0).a(frc.b, frc.a.b))
                     .a(ja.e, eav.a, frb.a().a(frc.c, $$0).a(frc.b, frc.a.d))
                     .a(ja.c, eav.b, frb.a().a(frc.c, $$1))
                     .a(ja.d, eav.b, frb.a().a(frc.c, $$1).a(frc.b, frc.a.c))
                     .a(ja.f, eav.b, frb.a().a(frc.c, $$1).a(frc.b, frc.a.b))
                     .a(ja.e, eav.b, frb.a().a(frc.c, $$1).a(frc.b, frc.a.d))
                     .a(ja.c, eav.c, frb.a().a(frc.c, $$2).a(frc.b, frc.a.d))
                     .a(ja.d, eav.c, frb.a().a(frc.c, $$2).a(frc.b, frc.a.b))
                     .a(ja.f, eav.c, frb.a().a(frc.c, $$2))
                     .a(ja.e, eav.c, frb.a().a(frc.c, $$2).a(frc.b, frc.a.c))
                     .a(ja.d, eav.d, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
                     .a(ja.c, eav.d, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d))
                     .a(ja.f, eav.d, frb.a().a(frc.c, $$3))
                     .a(ja.e, eav.d, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fqy.a(dmh.oF, frb.a().a(frc.c, fri.a(dmh.oF)))
               .a(
                  fqz.a(eax.X, eax.T)
                     .a(eas.a, ja.c, frb.a())
                     .a(eas.a, ja.f, frb.a().a(frc.b, frc.a.b))
                     .a(eas.a, ja.d, frb.a().a(frc.b, frc.a.c))
                     .a(eas.a, ja.e, frb.a().a(frc.b, frc.a.d))
                     .a(eas.b, ja.c, frb.a().a(frc.a, frc.a.b))
                     .a(eas.b, ja.f, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.b))
                     .a(eas.b, ja.d, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.c))
                     .a(eas.b, ja.e, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.d))
                     .a(eas.c, ja.d, frb.a().a(frc.a, frc.a.c))
                     .a(eas.c, ja.e, frb.a().a(frc.a, frc.a.c).a(frc.b, frc.a.b))
                     .a(eas.c, ja.c, frb.a().a(frc.a, frc.a.c).a(frc.b, frc.a.c))
                     .a(eas.c, ja.f, frb.a().a(frc.a, frc.a.c).a(frc.b, frc.a.d))
               )
         );
   }

   private void d(dmf $$0, frn.a $$1) {
      alg $$2 = $$1.create($$0, this.d);
      alg $$3 = frl.a($$0, "_front_on");
      alg $$4 = $$1.get($$0).a($$1x -> $$1x.a(frm.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fqy.a($$0).a(a(eax.u, $$4, $$2)).a(b()));
   }

   private void a(dmf... $$0) {
      alg $$1 = fri.a("campfire_off");

      for (dmf $$2 : $$0) {
         alg $$3 = frk.bj.a($$2, frl.H($$2), this.d);
         this.b($$2.h());
         this.b.accept(fqy.a($$2).a(a(eax.u, $$3, $$1)).a(c()));
      }
   }

   private void w(dmf $$0) {
      alg $$1 = frk.bE.a($$0, frl.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void x(dmf $$0) {
      alg $$1;
      if ($$0 == dmh.tT) {
         $$1 = frk.bG.a($$0, frl.p($$0), this.d);
      } else {
         $$1 = frk.bF.a($$0, frl.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      frl $$0 = frl.a(frl.J(dmh.cv), frl.J(dmh.n));
      alg $$1 = frk.j.a(dmh.cv, $$0, this.d);
      this.b.accept(c(dmh.cv, $$1));
   }

   private void t() {
      this.b(czh.ml);
      this.b
         .accept(
            fqx.a(dmh.cH)
               .a(
                  fqw.b(
                     fqw.a().a(eax.ae, ebm.c).a(eax.ad, ebm.c).a(eax.af, ebm.c).a(eax.ag, ebm.c),
                     fqw.a().a(eax.ae, ebm.b, ebm.a).a(eax.ad, ebm.b, ebm.a),
                     fqw.a().a(eax.ad, ebm.b, ebm.a).a(eax.af, ebm.b, ebm.a),
                     fqw.a().a(eax.af, ebm.b, ebm.a).a(eax.ag, ebm.b, ebm.a),
                     fqw.a().a(eax.ag, ebm.b, ebm.a).a(eax.ae, ebm.b, ebm.a)
                  ),
                  frb.a().a(frc.c, fri.a("redstone_dust_dot"))
               )
               .a(fqw.a().a(eax.ae, ebm.b, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_side0")))
               .a(fqw.a().a(eax.af, ebm.b, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_side_alt0")))
               .a(fqw.a().a(eax.ad, ebm.b, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_side_alt1")).a(frc.b, frc.a.d))
               .a(fqw.a().a(eax.ag, ebm.b, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_side1")).a(frc.b, frc.a.d))
               .a(fqw.a().a(eax.ae, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_up")))
               .a(fqw.a().a(eax.ad, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_up")).a(frc.b, frc.a.b))
               .a(fqw.a().a(eax.af, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_up")).a(frc.b, frc.a.c))
               .a(fqw.a().a(eax.ag, ebm.a), frb.a().a(frc.c, fri.a("redstone_dust_up")).a(frc.b, frc.a.d))
         );
   }

   private void u() {
      this.b(czh.mp);
      this.b
         .accept(
            fqy.a(dmh.hz)
               .a(c())
               .a(
                  fqz.a(eax.bg, eax.A)
                     .a(eba.a, false, frb.a().a(frc.c, fri.a(dmh.hz)))
                     .a(eba.a, true, frb.a().a(frc.c, fri.a(dmh.hz, "_on")))
                     .a(eba.b, false, frb.a().a(frc.c, fri.a(dmh.hz, "_subtract")))
                     .a(eba.b, true, frb.a().a(frc.c, fri.a(dmh.hz, "_on_subtract")))
               )
         );
   }

   private void v() {
      frl $$0 = frl.a(dmh.ku);
      frl $$1 = frl.a(frl.a(dmh.kh, "_side"), $$0.a(frm.f));
      alg $$2 = frk.ab.a(dmh.kh, $$1, this.d);
      alg $$3 = frk.ac.a(dmh.kh, $$1, this.d);
      alg $$4 = frk.j.b(dmh.kh, "_double", $$1, this.d);
      this.b.accept(e(dmh.kh, $$2, $$3, $$4));
      this.b.accept(c(dmh.ku, frk.c.a(dmh.ku, $$0, this.d)));
   }

   private void w() {
      this.b(czh.ty);
      this.b
         .accept(
            fqx.a(dmh.fR)
               .a(frb.a().a(frc.c, frl.J(dmh.fR)))
               .a(fqw.a().a(eax.n, true), frb.a().a(frc.c, frl.a(dmh.fR, "_bottle0")))
               .a(fqw.a().a(eax.o, true), frb.a().a(frc.c, frl.a(dmh.fR, "_bottle1")))
               .a(fqw.a().a(eax.p, true), frb.a().a(frc.c, frl.a(dmh.fR, "_bottle2")))
               .a(fqw.a().a(eax.n, false), frb.a().a(frc.c, frl.a(dmh.fR, "_empty0")))
               .a(fqw.a().a(eax.o, false), frb.a().a(frc.c, frl.a(dmh.fR, "_empty1")))
               .a(fqw.a().a(eax.p, false), frb.a().a(frc.c, frl.a(dmh.fR, "_empty2")))
         );
   }

   private void y(dmf $$0) {
      alg $$1 = frk.bA.a($$0, frl.b($$0), this.d);
      alg $$2 = fri.a("mushroom_block_inside");
      this.b
         .accept(
            fqx.a($$0)
               .a(fqw.a().a(eax.N, true), frb.a().a(frc.c, $$1))
               .a(fqw.a().a(eax.O, true), frb.a().a(frc.c, $$1).a(frc.b, frc.a.b).a(frc.d, true))
               .a(fqw.a().a(eax.P, true), frb.a().a(frc.c, $$1).a(frc.b, frc.a.c).a(frc.d, true))
               .a(fqw.a().a(eax.Q, true), frb.a().a(frc.c, $$1).a(frc.b, frc.a.d).a(frc.d, true))
               .a(fqw.a().a(eax.L, true), frb.a().a(frc.c, $$1).a(frc.a, frc.a.d).a(frc.d, true))
               .a(fqw.a().a(eax.M, true), frb.a().a(frc.c, $$1).a(frc.a, frc.a.b).a(frc.d, true))
               .a(fqw.a().a(eax.N, false), frb.a().a(frc.c, $$2))
               .a(fqw.a().a(eax.O, false), frb.a().a(frc.c, $$2).a(frc.b, frc.a.b).a(frc.d, false))
               .a(fqw.a().a(eax.P, false), frb.a().a(frc.c, $$2).a(frc.b, frc.a.c).a(frc.d, false))
               .a(fqw.a().a(eax.Q, false), frb.a().a(frc.c, $$2).a(frc.b, frc.a.d).a(frc.d, false))
               .a(fqw.a().a(eax.L, false), frb.a().a(frc.c, $$2).a(frc.a, frc.a.d).a(frc.d, false))
               .a(fqw.a().a(eax.M, false), frb.a().a(frc.c, $$2).a(frc.a, frc.a.b).a(frc.d, false))
         );
      this.a($$0, frn.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(czh.sJ);
      this.b
         .accept(
            fqy.a(dmh.ex)
               .a(
                  fqz.a(eax.aB)
                     .a(0, frb.a().a(frc.c, fri.a(dmh.ex)))
                     .a(1, frb.a().a(frc.c, fri.a(dmh.ex, "_slice1")))
                     .a(2, frb.a().a(frc.c, fri.a(dmh.ex, "_slice2")))
                     .a(3, frb.a().a(frc.c, fri.a(dmh.ex, "_slice3")))
                     .a(4, frb.a().a(frc.c, fri.a(dmh.ex, "_slice4")))
                     .a(5, frb.a().a(frc.c, fri.a(dmh.ex, "_slice5")))
                     .a(6, frb.a().a(frc.c, fri.a(dmh.ex, "_slice6")))
               )
         );
   }

   private void y() {
      frl $$0 = new frl()
         .a(frm.c, frl.a(dmh.oD, "_side3"))
         .a(frm.o, frl.J(dmh.t))
         .a(frm.n, frl.a(dmh.oD, "_top"))
         .a(frm.j, frl.a(dmh.oD, "_side3"))
         .a(frm.l, frl.a(dmh.oD, "_side3"))
         .a(frm.k, frl.a(dmh.oD, "_side1"))
         .a(frm.m, frl.a(dmh.oD, "_side2"));
      this.b.accept(c(dmh.oD, frk.a.a(dmh.oD, $$0, this.d)));
   }

   private void z() {
      frl $$0 = new frl()
         .a(frm.c, frl.a(dmh.oH, "_front"))
         .a(frm.o, frl.a(dmh.oH, "_bottom"))
         .a(frm.n, frl.a(dmh.oH, "_top"))
         .a(frm.j, frl.a(dmh.oH, "_front"))
         .a(frm.k, frl.a(dmh.oH, "_front"))
         .a(frm.l, frl.a(dmh.oH, "_side"))
         .a(frm.m, frl.a(dmh.oH, "_side"));
      this.b.accept(c(dmh.oH, frk.a.a(dmh.oH, $$0, this.d)));
   }

   private void a(dmf $$0, dmf $$1, BiFunction<dmf, dmf, frl> $$2) {
      frl $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, frk.a.a($$0, $$3, this.d)));
   }

   public void b(dmf $$0) {
      frl $$1 = new frl()
         .a(frm.c, frl.a($$0, "_particle"))
         .a(frm.o, frl.a($$0, "_down"))
         .a(frm.n, frl.a($$0, "_up"))
         .a(frm.j, frl.a($$0, "_north"))
         .a(frm.k, frl.a($$0, "_south"))
         .a(frm.l, frl.a($$0, "_east"))
         .a(frm.m, frl.a($$0, "_west"));
      this.b.accept(c($$0, frk.a.a($$0, $$1, this.d)));
   }

   private void A() {
      frl $$0 = frl.n(dmh.fr);
      this.b.accept(c(dmh.fr, fri.a(dmh.fr)));
      this.a(dmh.ev, $$0);
      this.a(dmh.ew, $$0);
   }

   private void a(dmf $$0, frl $$1) {
      alg $$2 = frk.p.a($$0, $$1.c(frm.g, frl.J($$0)), this.d);
      this.b.accept(fqy.a($$0, frb.a().a(frc.c, $$2)).a(b()));
   }

   private void B() {
      this.b(czh.tz);
      this.n(dmh.fS);
      this.b.accept(c(dmh.fU, frk.bD.a(dmh.fU, frl.j(frl.a(dmh.K, "_still")), this.d)));
      this.b
         .accept(
            fqy.a(dmh.fT)
               .a(
                  fqz.a(dqt.f)
                     .a(1, frb.a().a(frc.c, frk.bB.a(dmh.fT, "_level1", frl.j(frl.a(dmh.J, "_still")), this.d)))
                     .a(2, frb.a().a(frc.c, frk.bC.a(dmh.fT, "_level2", frl.j(frl.a(dmh.J, "_still")), this.d)))
                     .a(3, frb.a().a(frc.c, frk.bD.a(dmh.fT, "_full", frl.j(frl.a(dmh.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fqy.a(dmh.fV)
               .a(
                  fqz.a(dqt.f)
                     .a(1, frb.a().a(frc.c, frk.bB.a(dmh.fV, "_level1", frl.j(frl.J(dmh.rx)), this.d)))
                     .a(2, frb.a().a(frc.c, frk.bC.a(dmh.fV, "_level2", frl.j(frl.J(dmh.rx)), this.d)))
                     .a(3, frb.a().a(frc.c, frk.bD.a(dmh.fV, "_full", frl.j(frl.J(dmh.rx)), this.d)))
               )
         );
   }

   private void C() {
      frl $$0 = frl.b(dmh.lb);
      alg $$1 = frk.aL.a(dmh.lb, $$0, this.d);
      alg $$2 = this.a(dmh.lb, "_dead", frk.aL, $$1x -> $$0.c(frm.b, $$1x));
      this.b.accept(fqy.a(dmh.lb).a(a(eax.ax, 5, $$2, $$1)));
   }

   private void D() {
      alg $$0 = fri.a(dmh.ua);
      alg $$1 = fri.a(dmh.ua, "_triggered");
      alg $$2 = fri.a(dmh.ua, "_crafting");
      alg $$3 = fri.a(dmh.ua, "_crafting_triggered");
      this.b
         .accept(
            fqy.a(dmh.ua)
               .a(fqz.a(eax.W).a($$0x -> this.a($$0x, frb.a())))
               .a(
                  fqz.a(eax.G, dnz.b)
                     .a(false, false, frb.a().a(frc.c, $$0))
                     .a(true, true, frb.a().a(frc.c, $$3))
                     .a(true, false, frb.a().a(frc.c, $$1))
                     .a(false, true, frb.a().a(frc.c, $$2))
               )
         );
   }

   private void z(dmf $$0) {
      frl $$1 = new frl().a(frm.f, frl.a(dmh.cO, "_top")).a(frm.i, frl.a(dmh.cO, "_side")).a(frm.g, frl.a($$0, "_front"));
      frl $$2 = new frl().a(frm.i, frl.a(dmh.cO, "_top")).a(frm.g, frl.a($$0, "_front_vertical"));
      alg $$3 = frk.p.a($$0, $$1, this.d);
      alg $$4 = frk.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fqy.a($$0)
               .a(
                  fqz.a(eax.R)
                     .a(ja.a, frb.a().a(frc.c, $$4).a(frc.a, frc.a.c))
                     .a(ja.b, frb.a().a(frc.c, $$4))
                     .a(ja.c, frb.a().a(frc.c, $$3))
                     .a(ja.f, frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
                     .a(ja.d, frb.a().a(frc.c, $$3).a(frc.b, frc.a.c))
                     .a(ja.e, frb.a().a(frc.c, $$3).a(frc.b, frc.a.d))
               )
         );
   }

   private void E() {
      alg $$0 = fri.a(dmh.fX);
      alg $$1 = fri.a(dmh.fX, "_filled");
      this.b.accept(fqy.a(dmh.fX).a(fqz.a(eax.k).a(false, frb.a().a(frc.c, $$0)).a(true, frb.a().a(frc.c, $$1))).a(c()));
   }

   private void F() {
      alg $$0 = fri.a(dmh.la, "_side");
      alg $$1 = fri.a(dmh.la, "_noside");
      alg $$2 = fri.a(dmh.la, "_noside1");
      alg $$3 = fri.a(dmh.la, "_noside2");
      alg $$4 = fri.a(dmh.la, "_noside3");
      this.b
         .accept(
            fqx.a(dmh.la)
               .a(fqw.a().a(eax.N, true), frb.a().a(frc.c, $$0))
               .a(fqw.a().a(eax.O, true), frb.a().a(frc.c, $$0).a(frc.b, frc.a.b).a(frc.d, true))
               .a(fqw.a().a(eax.P, true), frb.a().a(frc.c, $$0).a(frc.b, frc.a.c).a(frc.d, true))
               .a(fqw.a().a(eax.Q, true), frb.a().a(frc.c, $$0).a(frc.b, frc.a.d).a(frc.d, true))
               .a(fqw.a().a(eax.L, true), frb.a().a(frc.c, $$0).a(frc.a, frc.a.d).a(frc.d, true))
               .a(fqw.a().a(eax.M, true), frb.a().a(frc.c, $$0).a(frc.a, frc.a.b).a(frc.d, true))
               .a(fqw.a().a(eax.N, false), frb.a().a(frc.c, $$1).a(frc.e, 2), frb.a().a(frc.c, $$2), frb.a().a(frc.c, $$3), frb.a().a(frc.c, $$4))
               .a(
                  fqw.a().a(eax.O, false),
                  frb.a().a(frc.c, $$2).a(frc.b, frc.a.b).a(frc.d, true),
                  frb.a().a(frc.c, $$3).a(frc.b, frc.a.b).a(frc.d, true),
                  frb.a().a(frc.c, $$4).a(frc.b, frc.a.b).a(frc.d, true),
                  frb.a().a(frc.c, $$1).a(frc.e, 2).a(frc.b, frc.a.b).a(frc.d, true)
               )
               .a(
                  fqw.a().a(eax.P, false),
                  frb.a().a(frc.c, $$3).a(frc.b, frc.a.c).a(frc.d, true),
                  frb.a().a(frc.c, $$4).a(frc.b, frc.a.c).a(frc.d, true),
                  frb.a().a(frc.c, $$1).a(frc.e, 2).a(frc.b, frc.a.c).a(frc.d, true),
                  frb.a().a(frc.c, $$2).a(frc.b, frc.a.c).a(frc.d, true)
               )
               .a(
                  fqw.a().a(eax.Q, false),
                  frb.a().a(frc.c, $$4).a(frc.b, frc.a.d).a(frc.d, true),
                  frb.a().a(frc.c, $$1).a(frc.e, 2).a(frc.b, frc.a.d).a(frc.d, true),
                  frb.a().a(frc.c, $$2).a(frc.b, frc.a.d).a(frc.d, true),
                  frb.a().a(frc.c, $$3).a(frc.b, frc.a.d).a(frc.d, true)
               )
               .a(
                  fqw.a().a(eax.L, false),
                  frb.a().a(frc.c, $$1).a(frc.e, 2).a(frc.a, frc.a.d).a(frc.d, true),
                  frb.a().a(frc.c, $$4).a(frc.a, frc.a.d).a(frc.d, true),
                  frb.a().a(frc.c, $$2).a(frc.a, frc.a.d).a(frc.d, true),
                  frb.a().a(frc.c, $$3).a(frc.a, frc.a.d).a(frc.d, true)
               )
               .a(
                  fqw.a().a(eax.M, false),
                  frb.a().a(frc.c, $$4).a(frc.a, frc.a.b).a(frc.d, true),
                  frb.a().a(frc.c, $$3).a(frc.a, frc.a.b).a(frc.d, true),
                  frb.a().a(frc.c, $$2).a(frc.a, frc.a.b).a(frc.d, true),
                  frb.a().a(frc.c, $$1).a(frc.e, 2).a(frc.a, frc.a.b).a(frc.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fqx.a(dmh.pK)
               .a(frb.a().a(frc.c, frl.J(dmh.pK)))
               .a(fqw.a().a(eax.aO, 1), frb.a().a(frc.c, frl.a(dmh.pK, "_contents1")))
               .a(fqw.a().a(eax.aO, 2), frb.a().a(frc.c, frl.a(dmh.pK, "_contents2")))
               .a(fqw.a().a(eax.aO, 3), frb.a().a(frc.c, frl.a(dmh.pK, "_contents3")))
               .a(fqw.a().a(eax.aO, 4), frb.a().a(frc.c, frl.a(dmh.pK, "_contents4")))
               .a(fqw.a().a(eax.aO, 5), frb.a().a(frc.c, frl.a(dmh.pK, "_contents5")))
               .a(fqw.a().a(eax.aO, 6), frb.a().a(frc.c, frl.a(dmh.pK, "_contents6")))
               .a(fqw.a().a(eax.aO, 7), frb.a().a(frc.c, frl.a(dmh.pK, "_contents7")))
               .a(fqw.a().a(eax.aO, 8), frb.a().a(frc.c, frl.a(dmh.pK, "_contents_ready")))
         );
   }

   private void A(dmf $$0) {
      alg $$1 = frk.c.a($$0, frl.a($$0), this.d);
      alg $$2 = this.a($$0, "_powered", frk.c, frl::b);
      alg $$3 = this.a($$0, "_lit", frk.c, frl::b);
      alg $$4 = this.a($$0, "_lit_powered", frk.c, frl::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fqv a(dmf $$0, alg $$1, alg $$2, alg $$3, alg $$4) {
      return fqy.a($$0).a(fqz.a(eax.u, eax.A).a(($$4x, $$5) -> $$4x ? frb.a().a(frc.c, $$5 ? $$4 : $$2) : frb.a().a(frc.c, $$5 ? $$3 : $$1)));
   }

   private void j(dmf $$0, dmf $$1) {
      alg $$2 = fri.a($$0);
      alg $$3 = fri.a($$0, "_powered");
      alg $$4 = fri.a($$0, "_lit");
      alg $$5 = fri.a($$0, "_lit_powered");
      this.c.a($$0.h(), $$1.h());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dmf $$0) {
      this.b.accept(fqy.a($$0, frb.a().a(frc.c, frk.ao.a($$0, frl.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.B(dmh.rg);
      this.B(dmh.rf);
      this.B(dmh.re);
      this.B(dmh.rd);
   }

   private void I() {
      fqz.b<ja, ebe> $$0 = fqz.a(eax.bp, eax.bq);

      for (ebe $$1 : ebe.values()) {
         $$0.a(ja.b, $$1, this.a(ja.b, $$1));
      }

      for (ebe $$2 : ebe.values()) {
         $$0.a(ja.a, $$2, this.a(ja.a, $$2));
      }

      this.b.accept(fqy.a(dmh.tb).a($$0));
   }

   private frb a(ja $$0, ebe $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      frl $$3 = frl.c(frl.a(dmh.tb, $$2));
      return frb.a().a(frc.c, frk.an.a(dmh.tb, $$2, $$3, this.d));
   }

   private void C(dmf $$0) {
      frl $$1 = new frl().a(frm.e, frl.J(dmh.em)).a(frm.f, frl.J($$0)).a(frm.i, frl.a($$0, "_side"));
      this.b.accept(c($$0, frk.n.a($$0, $$1, this.d)));
   }

   private void J() {
      alg $$0 = frl.a(dmh.hA, "_side");
      frl $$1 = new frl().a(frm.f, frl.a(dmh.hA, "_top")).a(frm.i, $$0);
      frl $$2 = new frl().a(frm.f, frl.a(dmh.hA, "_inverted_top")).a(frm.i, $$0);
      this.b
         .accept(
            fqy.a(dmh.hA)
               .a(
                  fqz.a(eax.s)
                     .a(false, frb.a().a(frc.c, frk.aM.a(dmh.hA, $$1, this.d)))
                     .a(true, frb.a().a(frc.c, frk.aM.a(fri.a(dmh.hA, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void D(dmf $$0) {
      this.b.accept(fqy.a($$0, frb.a().a(frc.c, fri.a($$0))).a(this.o()));
   }

   private void K() {
      dmf $$0 = dmh.ta;
      alg $$1 = fri.a($$0, "_on");
      alg $$2 = fri.a($$0);
      this.b.accept(fqy.a($$0, frb.a().a(frc.c, fri.a($$0))).a(this.o()).a(a(eax.A, $$1, $$2)));
   }

   private void L() {
      frl $$0 = new frl().a(frm.C, frl.J(dmh.j)).a(frm.f, frl.J(dmh.cN));
      frl $$1 = new frl().a(frm.C, frl.J(dmh.j)).a(frm.f, frl.a(dmh.cN, "_moist"));
      alg $$2 = frk.bd.a(dmh.cN, $$0, this.d);
      alg $$3 = frk.bd.a(frl.a(dmh.cN, "_moist"), $$1, this.d);
      this.b.accept(fqy.a(dmh.cN).a(a(eax.aT, 7, $$3, $$2)));
   }

   private List<alg> E(dmf $$0) {
      alg $$1 = frk.be.a(fri.a($$0, "_floor0"), frl.y($$0), this.d);
      alg $$2 = frk.be.a(fri.a($$0, "_floor1"), frl.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<alg> F(dmf $$0) {
      alg $$1 = frk.bf.a(fri.a($$0, "_side0"), frl.y($$0), this.d);
      alg $$2 = frk.bf.a(fri.a($$0, "_side1"), frl.z($$0), this.d);
      alg $$3 = frk.bg.a(fri.a($$0, "_side_alt0"), frl.y($$0), this.d);
      alg $$4 = frk.bg.a(fri.a($$0, "_side_alt1"), frl.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alg> G(dmf $$0) {
      alg $$1 = frk.bh.a(fri.a($$0, "_up0"), frl.y($$0), this.d);
      alg $$2 = frk.bh.a(fri.a($$0, "_up1"), frl.z($$0), this.d);
      alg $$3 = frk.bi.a(fri.a($$0, "_up_alt0"), frl.y($$0), this.d);
      alg $$4 = frk.bi.a(fri.a($$0, "_up_alt1"), frl.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<frb> a(List<alg> $$0, UnaryOperator<frb> $$1) {
      return $$0.stream().map($$0x -> frb.a().a(frc.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fqw $$0 = fqw.a().a(eax.N, false).a(eax.O, false).a(eax.P, false).a(eax.Q, false).a(eax.L, false);
      List<alg> $$1 = this.E(dmh.cB);
      List<alg> $$2 = this.F(dmh.cB);
      List<alg> $$3 = this.G(dmh.cB);
      this.b
         .accept(
            fqx.a(dmh.cB)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fqw.b(fqw.a().a(eax.N, true), $$0), a($$2, $$0x -> $$0x))
               .a(fqw.b(fqw.a().a(eax.O, true), $$0), a($$2, $$0x -> $$0x.a(frc.b, frc.a.b)))
               .a(fqw.b(fqw.a().a(eax.P, true), $$0), a($$2, $$0x -> $$0x.a(frc.b, frc.a.c)))
               .a(fqw.b(fqw.a().a(eax.Q, true), $$0), a($$2, $$0x -> $$0x.a(frc.b, frc.a.d)))
               .a(fqw.a().a(eax.L, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<alg> $$0 = this.E(dmh.cC);
      List<alg> $$1 = this.F(dmh.cC);
      this.b
         .accept(
            fqx.a(dmh.cC)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(frc.b, frc.a.b)))
               .a(a($$1, $$0x -> $$0x.a(frc.b, frc.a.c)))
               .a(a($$1, $$0x -> $$0x.a(frc.b, frc.a.d)))
         );
   }

   private void H(dmf $$0) {
      alg $$1 = frn.x.create($$0, this.d);
      alg $$2 = frn.y.create($$0, this.d);
      this.b($$0.h());
      this.b.accept(fqy.a($$0).a(a(eax.m, $$2, $$1)));
   }

   private void O() {
      frl $$0 = frl.a(frl.a(dmh.ah, "_side"), frl.a(dmh.ah, "_top"));
      alg $$1 = frk.j.a(dmh.ah, $$0, this.d);
      this.b.accept(d(dmh.ah, $$1));
   }

   private void P() {
      this.b(czh.af);
      dmf $$0 = dmh.H;
      fqz.b<Boolean, Integer> $$1 = fqz.a(drg.d, drg.b);
      alg $$2 = fri.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alg $$4 = fri.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, frb.a().a(frc.c, $$4));
         $$1.a(false, $$3, frb.a().a(frc.c, $$2));
      }

      this.b.accept(fqy.a(dmh.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fqy.a(dmh.lo)
               .a(
                  fqz.a(eax.av)
                     .a(0, frb.a().a(frc.c, this.a(dmh.lo, "_0", frk.c, frl::b)))
                     .a(1, frb.a().a(frc.c, this.a(dmh.lo, "_1", frk.c, frl::b)))
                     .a(2, frb.a().a(frc.c, this.a(dmh.lo, "_2", frk.c, frl::b)))
                     .a(3, frb.a().a(frc.c, this.a(dmh.lo, "_3", frk.c, frl::b)))
               )
         );
   }

   private void R() {
      alg $$0 = frl.J(dmh.j);
      frl $$1 = new frl().a(frm.e, $$0).b(frm.e, frm.c).a(frm.f, frl.a(dmh.i, "_top")).a(frm.i, frl.a(dmh.i, "_snow"));
      frb $$2 = frb.a().a(frc.c, frk.n.a(dmh.i, "_snow", $$1, this.d));
      this.a(dmh.i, fri.a(dmh.i), $$2);
      this.a(dmh.i, fri.a(dmh.i), new fqi());
      alg $$3 = frn.f.get(dmh.fE).a($$1x -> $$1x.a(frm.e, $$0)).a(dmh.fE, this.d);
      this.a(dmh.fE, $$3, $$2);
      alg $$4 = frn.f.get(dmh.l).a($$1x -> $$1x.a(frm.e, $$0)).a(dmh.l, this.d);
      this.a(dmh.l, $$4, $$2);
   }

   private void a(dmf $$0, alg $$1, frb $$2) {
      List<frb> $$3 = Arrays.asList(a($$1));
      this.b.accept(fqy.a($$0).a(fqz.a(eax.E).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(czh.sp);
      this.b
         .accept(
            fqy.a(dmh.gb)
               .a(
                  fqz.a(eax.au)
                     .a(0, frb.a().a(frc.c, fri.a(dmh.gb, "_stage0")))
                     .a(1, frb.a().a(frc.c, fri.a(dmh.gb, "_stage1")))
                     .a(2, frb.a().a(frc.c, fri.a(dmh.gb, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(dmh.lk, fri.a(dmh.lk)));
   }

   private void k(dmf $$0, dmf $$1) {
      frl $$2 = frl.b($$1);
      alg $$3 = frk.Y.a($$0, $$2, this.d);
      alg $$4 = frk.Z.a($$0, $$2, this.d);
      this.b.accept(fqy.a($$0).a(a(eax.aW, 1, $$4, $$3)));
   }

   private void U() {
      alg $$0 = fri.a(dmh.hD);
      alg $$1 = fri.a(dmh.hD, "_side");
      this.b(czh.mv);
      this.b
         .accept(
            fqy.a(dmh.hD)
               .a(
                  fqz.a(eax.S)
                     .a(ja.a, frb.a().a(frc.c, $$0))
                     .a(ja.c, frb.a().a(frc.c, $$1))
                     .a(ja.f, frb.a().a(frc.c, $$1).a(frc.b, frc.a.b))
                     .a(ja.d, frb.a().a(frc.c, $$1).a(frc.b, frc.a.c))
                     .a(ja.e, frb.a().a(frc.c, $$1).a(frc.b, frc.a.d))
               )
         );
   }

   private void l(dmf $$0, dmf $$1) {
      alg $$2 = fri.a($$0);
      this.b.accept(fqy.a($$1, frb.a().a(frc.c, $$2)));
      this.c.a($$0.h(), $$1.h());
   }

   private void V() {
      alg $$0 = fri.a(dmh.fo, "_post_ends");
      alg $$1 = fri.a(dmh.fo, "_post");
      alg $$2 = fri.a(dmh.fo, "_cap");
      alg $$3 = fri.a(dmh.fo, "_cap_alt");
      alg $$4 = fri.a(dmh.fo, "_side");
      alg $$5 = fri.a(dmh.fo, "_side_alt");
      this.b
         .accept(
            fqx.a(dmh.fo)
               .a(frb.a().a(frc.c, $$0))
               .a(fqw.a().a(eax.N, false).a(eax.O, false).a(eax.P, false).a(eax.Q, false), frb.a().a(frc.c, $$1))
               .a(fqw.a().a(eax.N, true).a(eax.O, false).a(eax.P, false).a(eax.Q, false), frb.a().a(frc.c, $$2))
               .a(fqw.a().a(eax.N, false).a(eax.O, true).a(eax.P, false).a(eax.Q, false), frb.a().a(frc.c, $$2).a(frc.b, frc.a.b))
               .a(fqw.a().a(eax.N, false).a(eax.O, false).a(eax.P, true).a(eax.Q, false), frb.a().a(frc.c, $$3))
               .a(fqw.a().a(eax.N, false).a(eax.O, false).a(eax.P, false).a(eax.Q, true), frb.a().a(frc.c, $$3).a(frc.b, frc.a.b))
               .a(fqw.a().a(eax.N, true), frb.a().a(frc.c, $$4))
               .a(fqw.a().a(eax.O, true), frb.a().a(frc.c, $$4).a(frc.b, frc.a.b))
               .a(fqw.a().a(eax.P, true), frb.a().a(frc.c, $$5))
               .a(fqw.a().a(eax.Q, true), frb.a().a(frc.c, $$5).a(frc.b, frc.a.b))
         );
      this.c(dmh.fo);
   }

   private void I(dmf $$0) {
      this.b.accept(fqy.a($$0, frb.a().a(frc.c, fri.a($$0))).a(b()));
   }

   private void W() {
      alg $$0 = fri.a(dmh.dL);
      alg $$1 = fri.a(dmh.dL, "_on");
      this.c(dmh.dL);
      this.b
         .accept(
            fqy.a(dmh.dL)
               .a(a(eax.A, $$0, $$1))
               .a(
                  fqz.a(eax.X, eax.T)
                     .a(eas.c, ja.c, frb.a().a(frc.a, frc.a.c).a(frc.b, frc.a.c))
                     .a(eas.c, ja.f, frb.a().a(frc.a, frc.a.c).a(frc.b, frc.a.d))
                     .a(eas.c, ja.d, frb.a().a(frc.a, frc.a.c))
                     .a(eas.c, ja.e, frb.a().a(frc.a, frc.a.c).a(frc.b, frc.a.b))
                     .a(eas.a, ja.c, frb.a())
                     .a(eas.a, ja.f, frb.a().a(frc.b, frc.a.b))
                     .a(eas.a, ja.d, frb.a().a(frc.b, frc.a.c))
                     .a(eas.a, ja.e, frb.a().a(frc.b, frc.a.d))
                     .a(eas.b, ja.c, frb.a().a(frc.a, frc.a.b))
                     .a(eas.b, ja.f, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.b))
                     .a(eas.b, ja.d, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.c))
                     .a(eas.b, ja.e, frb.a().a(frc.a, frc.a.b).a(frc.b, frc.a.d))
               )
         );
   }

   private void X() {
      alg $$0 = this.a(czh.gE, dmh.fF);
      this.a(dmh.fF, $$0, frg.a(-9321636));
      this.b.accept(b(dmh.fF, fri.a(dmh.fF)));
   }

   private void Y() {
      this.c(dmh.tX);
      this.b.accept(c(dmh.tX, fri.a(dmh.tX)));
   }

   private void Z() {
      this.b.accept(fqy.a(dmh.eu).a(fqz.a(eax.J).a(ja.a.a, frb.a().a(frc.c, fri.a(dmh.eu, "_ns"))).a(ja.a.c, frb.a().a(frc.c, fri.a(dmh.eu, "_ew")))));
   }

   private void aa() {
      alg $$0 = frn.a.create(dmh.em, this.d);
      this.b
         .accept(
            fqy.a(
               dmh.em,
               frb.a().a(frc.c, $$0),
               frb.a().a(frc.c, $$0).a(frc.a, frc.a.b),
               frb.a().a(frc.c, $$0).a(frc.a, frc.a.c),
               frb.a().a(frc.c, $$0).a(frc.a, frc.a.d),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.b),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.b).a(frc.a, frc.a.b),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.b).a(frc.a, frc.a.c),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.b).a(frc.a, frc.a.d),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.c),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.c).a(frc.a, frc.a.b),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.c).a(frc.a, frc.a.c),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.c).a(frc.a, frc.a.d),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.d),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.d).a(frc.a, frc.a.b),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.d).a(frc.a, frc.a.c),
               frb.a().a(frc.c, $$0).a(frc.b, frc.a.d).a(frc.a, frc.a.d)
            )
         );
   }

   private void ab() {
      alg $$0 = fri.a(dmh.lu);
      alg $$1 = fri.a(dmh.lu, "_on");
      this.b.accept(fqy.a(dmh.lu).a(a(eax.A, $$1, $$0)).a(e()));
   }

   private void ac() {
      frl $$0 = new frl().a(frm.e, frl.a(dmh.bI, "_bottom")).a(frm.i, frl.a(dmh.bI, "_side"));
      alg $$1 = frl.a(dmh.bI, "_top_sticky");
      alg $$2 = frl.a(dmh.bI, "_top");
      frl $$3 = $$0.c(frm.F, $$1);
      frl $$4 = $$0.c(frm.F, $$2);
      alg $$5 = fri.a(dmh.bI, "_base");
      this.a(dmh.bI, $$5, $$4);
      this.a(dmh.by, $$5, $$3);
      alg $$6 = frk.n.a(dmh.bI, "_inventory", $$0.c(frm.f, $$2), this.d);
      alg $$7 = frk.n.a(dmh.by, "_inventory", $$0.c(frm.f, $$1), this.d);
      this.a(dmh.bI, $$6);
      this.a(dmh.by, $$7);
   }

   private void a(dmf $$0, alg $$1, frl $$2) {
      alg $$3 = frk.bs.a($$0, $$2, this.d);
      this.b.accept(fqy.a($$0).a(a(eax.j, $$1, $$3)).a(e()));
   }

   private void ad() {
      frl $$0 = new frl().a(frm.G, frl.a(dmh.bI, "_top")).a(frm.i, frl.a(dmh.bI, "_side"));
      frl $$1 = $$0.c(frm.F, frl.a(dmh.bI, "_top_sticky"));
      frl $$2 = $$0.c(frm.F, frl.a(dmh.bI, "_top"));
      this.b
         .accept(
            fqy.a(dmh.bJ)
               .a(
                  fqz.a(eax.B, eax.bj)
                     .a(false, ebj.a, frb.a().a(frc.c, frk.bt.a(dmh.bI, "_head", $$2, this.d)))
                     .a(false, ebj.b, frb.a().a(frc.c, frk.bt.a(dmh.bI, "_head_sticky", $$1, this.d)))
                     .a(true, ebj.a, frb.a().a(frc.c, frk.bu.a(dmh.bI, "_head_short", $$2, this.d)))
                     .a(true, ebj.b, frb.a().a(frc.c, frk.bu.a(dmh.bI, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      dmf $$0 = dmh.ub;
      frl $$1 = frl.a($$0, "_side_inactive", "_top_inactive");
      frl $$2 = frl.a($$0, "_side_active", "_top_active");
      frl $$3 = frl.a($$0, "_side_active", "_top_ejecting_reward");
      frl $$4 = frl.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      frl $$5 = frl.a($$0, "_side_active_ominous", "_top_active_ominous");
      frl $$6 = frl.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alg $$7 = frk.o.a($$0, $$1, this.d);
      alg $$8 = frk.o.a($$0, "_active", $$2, this.d);
      alg $$9 = frk.o.a($$0, "_ejecting_reward", $$3, this.d);
      alg $$10 = frk.o.a($$0, "_inactive_ominous", $$4, this.d);
      alg $$11 = frk.o.a($$0, "_active_ominous", $$5, this.d);
      alg $$12 = frk.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fqy.a($$0).a(fqz.a(eax.bB, eax.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> frb.a().a(frc.c, $$7x ? $$10 : $$7);
            case b, c, d -> frb.a().a(frc.c, $$7x ? $$11 : $$8);
            case e -> frb.a().a(frc.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      dmf $$0 = dmh.uc;
      frl $$1 = frl.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      frl $$2 = frl.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      frl $$3 = frl.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      frl $$4 = frl.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alg $$5 = frk.cb.a($$0, $$1, this.d);
      alg $$6 = frk.cb.a($$0, "_active", $$2, this.d);
      alg $$7 = frk.cb.a($$0, "_unlocking", $$3, this.d);
      alg $$8 = frk.cb.a($$0, "_ejecting_reward", $$4, this.d);
      frl $$9 = frl.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      frl $$10 = frl.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      frl $$11 = frl.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      frl $$12 = frl.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alg $$13 = frk.cb.a($$0, "_ominous", $$9, this.d);
      alg $$14 = frk.cb.a($$0, "_active_ominous", $$10, this.d);
      alg $$15 = frk.cb.a($$0, "_unlocking_ominous", $$11, this.d);
      alg $$16 = frk.cb.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fqy.a($$0).a(b()).a(fqz.a(dvq.b, dvq.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> frb.a().a(frc.c, $$9x ? $$13 : $$5);
            case b -> frb.a().a(frc.c, $$9x ? $$14 : $$6);
            case c -> frb.a().a(frc.c, $$9x ? $$15 : $$7);
            case d -> frb.a().a(frc.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      alg $$0 = fri.a(dmh.ry, "_inactive");
      alg $$1 = fri.a(dmh.ry, "_active");
      this.a(dmh.ry, $$0);
      this.b.accept(fqy.a(dmh.ry).a(fqz.a(eax.br).a($$2 -> frb.a().a(frc.c, $$2 != ebo.b && $$2 != ebo.c ? $$0 : $$1))));
   }

   private void ah() {
      alg $$0 = fri.a(dmh.rz, "_inactive");
      alg $$1 = fri.a(dmh.rz, "_active");
      this.a(dmh.rz, $$0);
      this.b.accept(fqy.a(dmh.rz).a(fqz.a(eax.br).a($$2 -> frb.a().a(frc.c, $$2 != ebo.b && $$2 != ebo.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      alg $$0 = frk.ca.a(dmh.rD, frl.a(false), this.d);
      alg $$1 = frk.ca.a(dmh.rD, "_can_summon", frl.a(true), this.d);
      this.a(dmh.rD, $$0);
      this.b.accept(fqy.a(dmh.rD).a(a(eax.e, $$1, $$0)));
   }

   private void aj() {
      alg $$0 = fri.a(dmh.oy, "_stable");
      alg $$1 = fri.a(dmh.oy, "_unstable");
      this.a(dmh.oy, $$0);
      this.b.accept(fqy.a(dmh.oy).a(a(eax.d, $$1, $$0)));
   }

   private void ak() {
      alg $$0 = this.a(dmh.td, "", frk.ao, frl::c);
      alg $$1 = this.a(dmh.td, "_lit", frk.ao, frl::c);
      this.b.accept(fqy.a(dmh.td).a(a(eax.b, $$1, $$0)));
      alg $$2 = this.a(dmh.te, "", frk.ao, frl::c);
      alg $$3 = this.a(dmh.te, "_lit", frk.ao, frl::c);
      this.b.accept(fqy.a(dmh.te).a(a(eax.b, $$3, $$2)));
   }

   private void al() {
      alg $$0 = frn.a.create(dmh.ga, this.d);
      alg $$1 = this.a(dmh.ga, "_on", frk.c, frl::b);
      this.b.accept(fqy.a(dmh.ga).a(a(eax.u, $$1, $$0)));
   }

   private void m(dmf $$0, dmf $$1) {
      frl $$2 = frl.B($$0);
      this.b.accept(c($$0, frk.bm.a($$0, $$2, this.d)));
      this.b.accept(fqy.a($$1, frb.a().a(frc.c, frk.bo.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      frl $$0 = frl.B(dmh.ea);
      frl $$1 = frl.i(frl.a(dmh.ea, "_off"));
      alg $$2 = frk.bq.a(dmh.ea, $$0, this.d);
      alg $$3 = frk.bn.a(dmh.ea, "_off", $$1, this.d);
      this.b.accept(fqy.a(dmh.ea).a(a(eax.u, $$2, $$3)));
      alg $$4 = frk.br.a(dmh.eb, $$0, this.d);
      alg $$5 = frk.bp.a(dmh.eb, "_off", $$1, this.d);
      this.b.accept(fqy.a(dmh.eb).a(a(eax.u, $$4, $$5)).a(d()));
      this.c(dmh.ea);
   }

   private void an() {
      this.b(czh.mo);
      this.b.accept(fqy.a(dmh.ey).a(fqz.a(eax.aD, eax.v, eax.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return frb.a().a(frc.c, frl.a(dmh.ey, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(czh.de);
      this.b
         .accept(
            fqy.a(dmh.nB)
               .a(
                  fqz.a(eax.aV, eax.I)
                     .a(1, false, Arrays.asList(a(fri.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(fri.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(fri.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(fri.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(fri.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(fri.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(fri.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(fri.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      frl $$0 = frl.a(dmh.ed);
      alg $$1 = frk.c.a(dmh.ef, $$0, this.d);
      this.b.accept(fqy.a(dmh.ed).a(fqz.a(eax.aI).a($$1x -> frb.a().a(frc.c, $$1x < 8 ? fri.a(dmh.ed, "_height" + $$1x * 2) : $$1))));
      this.a(dmh.ed, fri.a(dmh.ed, "_height2"));
      this.b.accept(c(dmh.ef, $$1));
   }

   private void aq() {
      this.b.accept(fqy.a(dmh.oI, frb.a().a(frc.c, fri.a(dmh.oI))).a(b()));
   }

   private void ar() {
      alg $$0 = frn.a.create(dmh.pG, this.d);
      this.a(dmh.pG, $$0);
      this.b.accept(fqy.a(dmh.pG).a(fqz.a(eax.bm).a($$0x -> frb.a().a(frc.c, this.a(dmh.pG, "_" + $$0x.c(), frk.c, frl::b)))));
   }

   private void as() {
      Map<ebs, alg> $$0 = new HashMap<>();

      for (ebs $$1 : ebs.values()) {
         $$0.put($$1, this.a(dmh.pI, "_" + $$1.c(), frk.c, frl::b));
      }

      this.b.accept(fqy.a(dmh.pI).a(fqz.a(eax.bF).a($$1x -> frb.a().a(frc.c, $$0.get($$1x)))));
      this.c.a(czh.pa, frg.a(duz.b, frg.a($$0.get(ebs.a)), Map.of(ebs.c, frg.a($$0.get(ebs.c)), ebs.b, frg.a($$0.get(ebs.b)), ebs.d, frg.a($$0.get(ebs.d)))));
   }

   private void at() {
      this.b(czh.xG);
      this.b.accept(fqy.a(dmh.oO).a(fqz.a(eax.av).a($$0 -> frb.a().a(frc.c, this.a(dmh.oO, "_stage" + $$0, frk.ao, frl::c)))));
   }

   private void au() {
      this.b(czh.qg);
      this.b
         .accept(
            fqy.a(dmh.gh)
               .a(
                  fqz.a(eax.a, eax.O, eax.N, eax.P, eax.Q)
                     .a(false, false, false, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_ns")))
                     .a(false, true, false, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_n")).a(frc.b, frc.a.b))
                     .a(false, false, true, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_n")))
                     .a(false, false, false, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_n")).a(frc.b, frc.a.c))
                     .a(false, false, false, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_n")).a(frc.b, frc.a.d))
                     .a(false, true, true, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_ne")))
                     .a(false, true, false, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_ne")).a(frc.b, frc.a.b))
                     .a(false, false, false, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_ne")).a(frc.b, frc.a.c))
                     .a(false, false, true, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_ne")).a(frc.b, frc.a.d))
                     .a(false, false, true, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_ns")))
                     .a(false, true, false, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_ns")).a(frc.b, frc.a.b))
                     .a(false, true, true, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_nse")))
                     .a(false, true, false, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_nse")).a(frc.b, frc.a.b))
                     .a(false, false, true, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_nse")).a(frc.b, frc.a.c))
                     .a(false, true, true, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_nse")).a(frc.b, frc.a.d))
                     .a(false, true, true, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_nsew")))
                     .a(true, false, false, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_ns")))
                     .a(true, false, true, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_n")))
                     .a(true, false, false, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_n")).a(frc.b, frc.a.c))
                     .a(true, true, false, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_n")).a(frc.b, frc.a.b))
                     .a(true, false, false, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_n")).a(frc.b, frc.a.d))
                     .a(true, true, true, false, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_ne")))
                     .a(true, true, false, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_ne")).a(frc.b, frc.a.b))
                     .a(true, false, false, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_ne")).a(frc.b, frc.a.c))
                     .a(true, false, true, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_ne")).a(frc.b, frc.a.d))
                     .a(true, false, true, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_ns")))
                     .a(true, true, false, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_ns")).a(frc.b, frc.a.b))
                     .a(true, true, true, true, false, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_nse")))
                     .a(true, true, false, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_nse")).a(frc.b, frc.a.b))
                     .a(true, false, true, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_nse")).a(frc.b, frc.a.c))
                     .a(true, true, true, false, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_nse")).a(frc.b, frc.a.d))
                     .a(true, true, true, true, true, frb.a().a(frc.c, fri.a(dmh.gh, "_attached_nsew")))
               )
         );
   }

   private void av() {
      this.c(dmh.gg);
      this.b
         .accept(fqy.a(dmh.gg).a(fqz.a(eax.a, eax.A).a(($$0, $$1) -> frb.a().a(frc.c, frl.a(dmh.gg, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alg a(int $$0, String $$1, frl $$2) {
      switch ($$0) {
         case 1:
            return frk.bw.a(fri.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return frk.bx.a(fri.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return frk.by.a(fri.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return frk.bz.a(fri.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alg a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", frl.b(frl.J(dmh.mL)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", frl.b(frl.a(dmh.mL, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", frl.b(frl.a(dmh.mL, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void aw() {
      this.b(czh.kT);
      this.b.accept(fqy.a(dmh.mL).a(fqz.a(eax.aG, eax.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void ax() {
      this.b(czh.kU);
      Function<Integer, alg> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         frl $$2 = frl.a($$1);
         return frk.bH.a(dmh.mM, $$1, $$2, this.d);
      };
      this.b.accept(fqy.a(dmh.mM).a(fqz.a(dtx.c).a($$1 -> frb.a().a(frc.c, $$0.apply($$1)))));
   }

   private void J(dmf $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dmf $$0, cyz $$1) {
      this.b($$1);
      this.K($$0);
   }

   private void K(dmf $$0) {
      alg $$1 = fri.a($$0);
      fqx $$2 = fqx.a($$0);
      fqw.c $$3 = af.a(fqw.a(), $$1x -> a.stream().<ja>map(Pair::getFirst).map(drl::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<ja, Function<alg, frb>> $$4 : a) {
         eay $$5 = drl.b((ja)$$4.getFirst());
         Function<alg, frb> $$6 = (Function<alg, frb>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fqw.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void L(dmf $$0) {
      alg $$1 = frn.j.create($$0, this.d);
      alg $$2 = frn.k.get($$0).a($$1x -> $$1x.a(frm.i, frl.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      alg $$3 = frn.k.get($$0).a($$1x -> $$1x.a(frm.i, frl.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fqx $$4 = fqx.a($$0);
      fqw.c $$5 = fqw.a().a(drj.b, false);
      $$4.a(fqw.a().a(drj.b, true), frb.a().a(frc.c, $$1));
      $$4.a($$5, frb.a().a(frc.c, $$1));
      a.stream().<ja>map(Pair::getFirst).forEach($$2x -> {
         ebf<ebu> $$3x = drj.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, ebu.a);
         }
      });

      for (Pair<ja, Function<alg, frb>> $$6 : a) {
         ja $$7 = (ja)$$6.getFirst();
         ebf<ebu> $$8 = drj.a($$7);
         if ($$8 != null) {
            Function<alg, frb> $$9 = (Function<alg, frb>)$$6.getSecond();
            $$4.a(fqw.a().a($$8, ebu.c), $$9.apply($$2));
            $$4.a(fqw.a().a($$8, ebu.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void M(dmf $$0) {
      fqz $$1 = fqz.a(dqa.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         frl $$3 = frl.c(frl.a($$0, $$2));
         alg $$4 = fqq.d.b.a().a($$0, $$2, $$3, this.d);
         return frb.a().a(frc.c, $$4);
      });
      this.c($$0);
      this.b.accept(fqy.a($$0).a($$1));
   }

   private void ay() {
      alg $$0 = frl.a(dmh.rC, "_bottom");
      frl $$1 = new frl().a(frm.e, $$0).a(frm.f, frl.a(dmh.rC, "_top")).a(frm.i, frl.a(dmh.rC, "_side"));
      frl $$2 = new frl().a(frm.e, $$0).a(frm.f, frl.a(dmh.rC, "_top_bloom")).a(frm.i, frl.a(dmh.rC, "_side_bloom"));
      alg $$3 = frk.n.a(dmh.rC, "", $$1, this.d);
      alg $$4 = frk.n.a(dmh.rC, "_bloom", $$2, this.d);
      this.b.accept(fqy.a(dmh.rC).a(fqz.a(eax.c).a($$2x -> frb.a().a(frc.c, $$2x ? $$4 : $$3))));
      this.a(dmh.rC, $$3);
   }

   private void az() {
      dmf $$0 = dmh.cw;
      alg $$1 = fri.a($$0);
      fqx $$2 = fqx.a($$0);
      List.of(Pair.of(ja.c, frc.a.a), Pair.of(ja.f, frc.a.b), Pair.of(ja.d, frc.a.c), Pair.of(ja.e, frc.a.d)).forEach($$2x -> {
         ja $$3 = (ja)$$2x.getFirst();
         frc.a $$4 = (frc.a)$$2x.getSecond();
         fqw.c $$5 = fqw.a().a(eax.T, $$3);
         $$2.a($$5, frb.a().a(frc.c, $$1).a(frc.b, $$4).a(frc.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fri.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fqx $$0, fqw.c $$1, frc.a $$2) {
      List.of(
            Pair.of(eax.bs, frk.aT),
            Pair.of(eax.bt, frk.aU),
            Pair.of(eax.bu, frk.aV),
            Pair.of(eax.bv, frk.aW),
            Pair.of(eax.bw, frk.aX),
            Pair.of(eax.bx, frk.aY)
         )
         .forEach($$3 -> {
            eay $$4 = (eay)$$3.getFirst();
            frj $$5 = (frj)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fqx $$0, fqw.c $$1, frc.a $$2, eay $$3, frj $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      frl $$7 = new frl().a(frm.b, frl.a(dmh.cw, $$6));
      fqq.c $$8 = new fqq.c($$4, $$6);
      alg $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dmh.cw, $$6, $$7, this.d));
      $$0.a(fqw.a($$1, fqw.a().a($$3, $$5)), frb.a().a(frc.c, $$9).a(frc.b, $$2));
   }

   private void aA() {
      this.b.accept(c(dmh.lp, frk.c.a(dmh.lp, frl.b(fri.a("magma")), this.d)));
   }

   private void a(dmf $$0, @Nullable cyb $$1) {
      this.r($$0);
      cyz $$2 = $$0.h();
      alg $$3 = frk.bO.a($$2, frl.x($$0), this.d);
      hfn.b $$4 = $$1 != null ? frg.a($$3, new hhz.a($$1)) : frg.a($$3, new hhz.a());
      this.c.a($$2, $$4);
   }

   private void c(dmf $$0, dmf $$1, fqq.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aB() {
      alg $$0 = fri.a(dmh.b);
      alg $$1 = fri.a(dmh.b, "_mirrored");
      this.b.accept(a(dmh.ff, $$0, $$1));
      this.a(dmh.ff, $$0);
   }

   private void aC() {
      alg $$0 = fri.a(dmh.tt);
      alg $$1 = fri.a(dmh.tt, "_mirrored");
      this.b.accept(a(dmh.tN, $$0, $$1).a(f()));
      this.a(dmh.tN, $$0);
   }

   private void n(dmf $$0, dmf $$1) {
      this.a($$0, fqq.d.b);
      frl $$2 = frl.d(frl.a($$0, "_pot"));
      alg $$3 = fqq.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aD() {
      alg $$0 = frl.a(dmh.pT, "_bottom");
      alg $$1 = frl.a(dmh.pT, "_top_off");
      alg $$2 = frl.a(dmh.pT, "_top");
      alg[] $$3 = new alg[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         frl $$5 = new frl().a(frm.e, $$0).a(frm.f, $$4 == 0 ? $$1 : $$2).a(frm.i, frl.a(dmh.pT, "_side" + $$4));
         $$3[$$4] = frk.n.a(dmh.pT, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fqy.a(dmh.pT).a(fqz.a(eax.bc).a($$1x -> frb.a().a(frc.c, $$3[$$1x]))));
      this.a(dmh.pT, $$3[0]);
   }

   private frb a(jc $$0, frb $$1) {
      switch ($$0) {
         case b:
            return $$1.a(frc.a, frc.a.b);
         case c:
            return $$1.a(frc.a, frc.a.b).a(frc.b, frc.a.c);
         case d:
            return $$1.a(frc.a, frc.a.b).a(frc.b, frc.a.d);
         case a:
            return $$1.a(frc.a, frc.a.b).a(frc.b, frc.a.b);
         case f:
            return $$1.a(frc.a, frc.a.d).a(frc.b, frc.a.c);
         case g:
            return $$1.a(frc.a, frc.a.d);
         case h:
            return $$1.a(frc.a, frc.a.d).a(frc.b, frc.a.b);
         case e:
            return $$1.a(frc.a, frc.a.d).a(frc.b, frc.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(frc.b, frc.a.c);
         case i:
            return $$1.a(frc.b, frc.a.d);
         case j:
            return $$1.a(frc.b, frc.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aE() {
      alg $$0 = frl.a(dmh.pH, "_top");
      alg $$1 = frl.a(dmh.pH, "_bottom");
      alg $$2 = frl.a(dmh.pH, "_side");
      alg $$3 = frl.a(dmh.pH, "_lock");
      frl $$4 = new frl().a(frm.o, $$2).a(frm.m, $$2).a(frm.l, $$2).a(frm.c, $$0).a(frm.j, $$0).a(frm.k, $$1).a(frm.n, $$3);
      alg $$5 = frk.b.a(dmh.pH, $$4, this.d);
      this.b.accept(fqy.a(dmh.pH, frb.a().a(frc.c, $$5)).a(fqz.a(eax.W).a($$0x -> this.a($$0x, frb.a()))));
   }

   private void aF() {
      dmf $$0 = dmh.n;
      alg $$1 = fri.a($$0);
      frn $$2 = frn.a.get($$0);
      dmf $$3 = dmh.kk;
      alg $$4 = frk.ab.a($$3, $$2.b(), this.d);
      alg $$5 = frk.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dmf $$0, dmf $$1, dtr.a $$2, alg $$3) {
      alg $$4 = fri.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.h(), frg.a($$3, new hia.a($$2)));
   }

   private void aG() {
      alg $$0 = fri.b("template_skull");
      this.a(dmh.hn, dmh.ho, dtr.b.g, $$0);
      this.a(dmh.hl, dmh.hm, dtr.b.e, $$0);
      this.a(dmh.hj, dmh.hk, dtr.b.f, $$0);
      this.a(dmh.hf, dmh.hg, dtr.b.c, $$0);
      this.a(dmh.hh, dmh.hi, dtr.b.d, $$0);
      this.a(dmh.hr, dmh.hs, dtr.b.h, $$0);
      this.a(dmh.hp, dmh.hq, dtr.b.i, fri.a(czh.vA));
   }

   private void a(dmf $$0, dmf $$1, cyb $$2) {
      alg $$3 = fri.a("banner");
      alg $$4 = fri.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cyz $$5 = $$0.h();
      this.c.a($$5, frg.a($$4, new hhr.a($$2)));
   }

   private void aH() {
      this.a(dmh.jl, dmh.jB, cyb.a);
      this.a(dmh.jm, dmh.jC, cyb.b);
      this.a(dmh.jn, dmh.jD, cyb.c);
      this.a(dmh.jo, dmh.jE, cyb.d);
      this.a(dmh.jp, dmh.jF, cyb.e);
      this.a(dmh.jq, dmh.jG, cyb.f);
      this.a(dmh.jr, dmh.jH, cyb.g);
      this.a(dmh.js, dmh.jI, cyb.h);
      this.a(dmh.jt, dmh.jJ, cyb.i);
      this.a(dmh.ju, dmh.jK, cyb.j);
      this.a(dmh.jv, dmh.jL, cyb.k);
      this.a(dmh.jw, dmh.jM, cyb.l);
      this.a(dmh.jx, dmh.jN, cyb.m);
      this.a(dmh.jy, dmh.jO, cyb.n);
      this.a(dmh.jz, dmh.jP, cyb.o);
      this.a(dmh.jA, dmh.jQ, cyb.p);
   }

   private void a(dmf $$0, dmf $$1, alg $$2, boolean $$3) {
      this.a($$0, $$1);
      cyz $$4 = $$0.h();
      alg $$5 = frk.bQ.a($$4, frl.x($$1), this.d);
      hfn.b $$6 = frg.a($$5, new hht.a($$2));
      if ($$3) {
         hfn.b $$7 = frg.a($$5, new hht.a(hht.a));
         this.c.a($$4, frg.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aI() {
      this.a(dmh.cG, dmh.n, hht.b, true);
      this.a(dmh.hw, dmh.n, hht.c, true);
      this.a(dmh.gf, dmh.cy, hht.d, false);
   }

   private void b(dmf $$0, dmf $$1, cyb $$2) {
      alg $$3 = fri.a("bed");
      this.b.accept(c($$0, $$3));
      cyz $$4 = $$0.h();
      alg $$5 = frk.bP.a(fri.a($$4), frl.x($$1), this.d);
      this.c.a($$4, frg.a($$5, new hhs.a($$2)));
   }

   private void aJ() {
      this.b(dmh.bg, dmh.bK, cyb.a);
      this.b(dmh.bh, dmh.bL, cyb.b);
      this.b(dmh.bi, dmh.bM, cyb.c);
      this.b(dmh.bj, dmh.bN, cyb.d);
      this.b(dmh.bk, dmh.bO, cyb.e);
      this.b(dmh.bl, dmh.bP, cyb.f);
      this.b(dmh.bm, dmh.bQ, cyb.g);
      this.b(dmh.bn, dmh.bR, cyb.h);
      this.b(dmh.bo, dmh.bS, cyb.i);
      this.b(dmh.bp, dmh.bT, cyb.j);
      this.b(dmh.bq, dmh.bU, cyb.k);
      this.b(dmh.br, dmh.bV, cyb.l);
      this.b(dmh.bs, dmh.bW, cyb.m);
      this.b(dmh.bt, dmh.bX, cyb.n);
      this.b(dmh.bu, dmh.bY, cyb.o);
      this.b(dmh.bv, dmh.bZ, cyb.p);
   }

   private void a(dmf $$0, hib.a $$1) {
      cyz $$2 = $$0.h();
      alg $$3 = fri.a($$2);
      this.c.a($$2, frg.a($$3, $$1));
   }

   public void a() {
      mi.a().filter(mj::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dmh.rN).a(mi.x).a(dmh.rN, dmh.sl).a(dmh.rR, dmh.rV).a(mi.z);
      this.i(dmh.rM).a(mi.B).a(dmh.rM, dmh.sk).a(dmh.rQ, dmh.rU).a(mi.D);
      this.i(dmh.rL).a(mi.F).a(dmh.rL, dmh.sj).a(dmh.rP, dmh.rT).a(mi.H);
      this.i(dmh.rK).a(mi.J).a(dmh.rK, dmh.si).a(dmh.rO, dmh.rS).a(mi.L);
      this.A(dmh.sS);
      this.A(dmh.sT);
      this.A(dmh.sU);
      this.A(dmh.sV);
      this.j(dmh.sS, dmh.sW);
      this.j(dmh.sT, dmh.sX);
      this.j(dmh.sU, dmh.sY);
      this.j(dmh.sV, dmh.sZ);
      this.n(dmh.a);
      this.d(dmh.nI, dmh.a);
      this.d(dmh.nH, dmh.a);
      this.n(dmh.gn);
      this.n(dmh.eg);
      this.d(dmh.nJ, dmh.J);
      this.n(dmh.fZ);
      this.n(dmh.mK);
      this.n(dmh.fQ);
      this.n(dmh.gq);
      this.b(czh.vo);
      this.n(dmh.pO);
      this.n(dmh.J);
      this.n(dmh.K);
      this.n(dmh.ix);
      this.b(czh.go);
      this.o(dmh.qu, dmh.qL);
      this.o(dmh.qv, dmh.qM);
      this.o(dmh.qw, dmh.qN);
      this.o(dmh.qx, dmh.qO);
      this.o(dmh.qy, dmh.qP);
      this.o(dmh.qz, dmh.qQ);
      this.o(dmh.qA, dmh.qR);
      this.o(dmh.qB, dmh.qS);
      this.o(dmh.qC, dmh.qT);
      this.o(dmh.qD, dmh.qU);
      this.o(dmh.qE, dmh.qV);
      this.o(dmh.qF, dmh.qW);
      this.o(dmh.qG, dmh.qX);
      this.o(dmh.qH, dmh.qY);
      this.o(dmh.qI, dmh.qZ);
      this.o(dmh.qJ, dmh.ra);
      this.o(dmh.qt, dmh.qK);
      this.n(dmh.nG);
      this.n(dmh.gS);
      this.n(dmh.rx);
      this.n(dmh.tf);
      this.w(dmh.tg);
      this.w(dmh.th);
      this.x(dmh.tS);
      this.x(dmh.tT);
      this.ak();
      this.h(dmh.tm, dmh.ti);
      this.L(dmh.uf);
      this.M(dmh.ug);
      this.a(dmh.ue);
      this.t(dmh.tj);
      this.t(dmh.tk);
      this.s(dmh.tl);
      this.b(dmh.ul, fqq.d.c);
      this.b(czh.da);
      this.a(dmh.iy, czh.if);
      this.b(czh.if);
      this.aK();
      this.a(dmh.lt, czh.jF);
      this.b(czh.jF);
      this.f(dmh.ca, frl.a(dmh.bI, "_side"));
      this.a(dmh.U);
      this.a(dmh.V);
      this.a(dmh.jd);
      this.a(dmh.cI);
      this.a(dmh.cJ);
      this.a(dmh.cK);
      this.a(dmh.gd);
      this.a(dmh.ge);
      this.a(dmh.gi);
      this.a(dmh.Q);
      this.a(dmh.W);
      this.a(dmh.R);
      this.a(dmh.cr);
      this.a(dmh.S);
      this.a(dmh.T);
      this.a(dmh.cs);
      this.b(dmh.pR, frn.d);
      this.a(dmh.pQ);
      this.a(dmh.aY);
      this.a(dmh.aZ);
      this.a(dmh.ba);
      this.a(dmh.fG);
      this.a(dmh.hC);
      this.a(dmh.dY);
      this.a(dmh.dZ);
      this.a(dmh.hB);
      this.a(dmh.qk);
      this.a(dmh.nC);
      this.a(dmh.ei);
      this.a(dmh.k);
      this.a(dmh.pS);
      this.a(dmh.fY);
      this.a(dmh.et);
      this.a(dmh.O);
      this.a(dmh.pP);
      this.a(dmh.ee);
      this.b(dmh.ek, frn.g);
      this.b(dmh.pY, frn.d);
      this.b(dmh.fs, frn.d);
      this.n(dmh.ag);
      this.n(dmh.gA);
      this.a(dmh.lq);
      this.a(dmh.bf);
      this.a(dmh.je);
      this.a(dmh.cy);
      this.a(dmh.qs);
      this.a(dmh.iK);
      this.a(dmh.pe);
      this.a(dmh.en);
      this.a(dmh.eo);
      this.b(dmh.cD, frn.b);
      this.g(dmh.cE);
      this.a(dmh.aV);
      this.b(dmh.bG, frn.z);
      this.b(czh.dd);
      this.b(dmh.cu, frn.f);
      this.b(dmh.pL, frn.d);
      this.a(dmh.oV);
      this.a(dmh.aW);
      this.a(dmh.rb);
      this.a(dmh.rc);
      this.a(dmh.rv);
      this.a(dmh.tc);
      this.a(dmh.tP);
      this.a(dmh.tQ);
      this.a(dmh.tR);
      this.d(dmh.rA);
      this.n(dmh.ud);
      this.aF();
      this.a(dmh.rI);
      this.a(dmh.rJ);
      this.a(dmh.rE);
      this.a(dmh.rF);
      this.a(dmh.rG);
      this.a(dmh.rH);
      this.l(dmh.rE, dmh.se);
      this.l(dmh.rF, dmh.sg);
      this.l(dmh.rG, dmh.sf);
      this.l(dmh.rH, dmh.sh);
      this.j(dmh.su);
      this.j(dmh.sv);
      this.j(dmh.sx);
      this.j(dmh.sw);
      this.b(dmh.su, dmh.sy);
      this.b(dmh.sv, dmh.sz);
      this.b(dmh.sx, dmh.sB);
      this.b(dmh.sw, dmh.sA);
      this.l(dmh.sC);
      this.l(dmh.sD);
      this.l(dmh.sF);
      this.l(dmh.sE);
      this.c(dmh.sC, dmh.sG);
      this.c(dmh.sD, dmh.sH);
      this.c(dmh.sF, dmh.sJ);
      this.c(dmh.sE, dmh.sI);
      this.a(dmh.sK);
      this.a(dmh.sL);
      this.a(dmh.sM);
      this.a(dmh.sN);
      this.l(dmh.sK, dmh.sO);
      this.l(dmh.sL, dmh.sP);
      this.l(dmh.sM, dmh.sQ);
      this.l(dmh.sN, dmh.sR);
      this.k(dmh.hx, dmh.cr);
      this.k(dmh.hy, dmh.cs);
      this.H();
      this.s();
      this.az();
      this.w();
      this.x();
      this.a(dmh.oM, dmh.oN);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.D(dmh.kZ);
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
      this.at();
      this.as();
      this.a(dmh.pJ);
      this.au();
      this.av();
      this.aw();
      this.ax();
      this.g();
      this.J(dmh.fy);
      this.J(dmh.rB);
      this.b(dmh.fz, czh.gt);
      this.aA();
      this.aE();
      this.ag();
      this.ah();
      this.ai();
      this.Y();
      this.P();
      this.O();
      this.ae();
      this.af();
      this.I(dmh.da);
      this.c(dmh.da);
      this.I(dmh.oG);
      this.h();
      this.I(dmh.to);
      this.m(dmh.cz, dmh.cA);
      this.m(dmh.er, dmh.es);
      this.a(dmh.cL, dmh.n, frl::c);
      this.a(dmh.oE, dmh.p, frl::d);
      this.C(dmh.pc);
      this.C(dmh.oT);
      this.z(dmh.bb);
      this.z(dmh.hJ);
      this.D();
      this.H(dmh.oK);
      this.H(dmh.oL);
      this.e(dmh.fp, fri.a(dmh.fp));
      this.a(dmh.ep, frn.d);
      this.a(dmh.eq, frn.d);
      this.a(dmh.tO);
      this.a(dmh.ls, frn.d);
      this.e(dmh.j);
      this.e(dmh.tr);
      this.e(dmh.L);
      this.f(dmh.M);
      this.f(dmh.P);
      this.e(dmh.N);
      this.d(dmh.I);
      this.b(dmh.tY, frn.f);
      this.a(dmh.iL, frn.d, frn.e);
      this.a(dmh.ld, frn.A, frn.B);
      this.a(dmh.hG, frn.A, frn.B);
      this.a(dmh.tU, frn.d, frn.e);
      this.a(dmh.tV, frn.d, frn.e);
      this.a(dmh.tW, frn.d, frn.e);
      this.c(dmh.oz, frn.i);
      this.A();
      this.a(dmh.pM, frl::D);
      this.a(dmh.pN, frl::F);
      this.a(dmh.lj, eax.av, 0, 1, 2, 3);
      this.a(dmh.gT, eax.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmh.fP, eax.av, 0, 1, 1, 2);
      this.a(dmh.gU, eax.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmh.cM, eax.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dmh.lg, fqq.d.b, eax.at, 0, 1);
      this.j();
      this.i();
      this.aH();
      this.aJ();
      this.aG();
      this.aI();
      this.a(dmh.lv, null);
      this.a(dmh.lw, cyb.a);
      this.a(dmh.lx, cyb.b);
      this.a(dmh.ly, cyb.c);
      this.a(dmh.lz, cyb.d);
      this.a(dmh.lA, cyb.e);
      this.a(dmh.lB, cyb.f);
      this.a(dmh.lC, cyb.g);
      this.a(dmh.lD, cyb.h);
      this.a(dmh.lE, cyb.i);
      this.a(dmh.lF, cyb.j);
      this.a(dmh.lG, cyb.k);
      this.a(dmh.lH, cyb.l);
      this.a(dmh.lI, cyb.m);
      this.a(dmh.lJ, cyb.n);
      this.a(dmh.lK, cyb.o);
      this.a(dmh.lL, cyb.p);
      this.r(dmh.nD);
      this.a(dmh.nD, new hhu.a());
      this.a(dmh.tZ, dmh.jc);
      this.a(dmh.tZ, new hhv.a());
      this.a(dmh.fW, dmh.cy);
      this.a(dmh.ll, dmh.cy);
      this.a(dmh.aT);
      this.a(dmh.aU);
      this.a(dmh.mc);
      this.a(dmh.md);
      this.a(dmh.me);
      this.a(dmh.mf);
      this.a(dmh.mg);
      this.a(dmh.mh);
      this.a(dmh.mi);
      this.a(dmh.mj);
      this.a(dmh.mk);
      this.a(dmh.ml);
      this.a(dmh.mm);
      this.a(dmh.mn);
      this.a(dmh.mo);
      this.a(dmh.mp);
      this.a(dmh.mq);
      this.a(dmh.mr);
      this.a(frn.a, dmh.ms, dmh.mt, dmh.mu, dmh.mv, dmh.mw, dmh.mx, dmh.my, dmh.mz, dmh.mA, dmh.mB, dmh.mC, dmh.mD, dmh.mE, dmh.mF, dmh.mG, dmh.mH);
      this.a(dmh.jc);
      this.a(dmh.hK);
      this.a(dmh.hL);
      this.a(dmh.hM);
      this.a(dmh.hN);
      this.a(dmh.hO);
      this.a(dmh.hP);
      this.a(dmh.hQ);
      this.a(dmh.hR);
      this.a(dmh.hS);
      this.a(dmh.hT);
      this.a(dmh.hU);
      this.a(dmh.hV);
      this.a(dmh.hW);
      this.a(dmh.hX);
      this.a(dmh.hY);
      this.a(dmh.hZ);
      this.a(dmh.rw);
      this.i(dmh.aX, dmh.fq);
      this.i(dmh.ez, dmh.ia);
      this.i(dmh.eA, dmh.ib);
      this.i(dmh.eB, dmh.ic);
      this.i(dmh.eC, dmh.id);
      this.i(dmh.eD, dmh.ie);
      this.i(dmh.eE, dmh.if);
      this.i(dmh.eF, dmh.ig);
      this.i(dmh.eG, dmh.ih);
      this.i(dmh.eH, dmh.ii);
      this.i(dmh.eI, dmh.ij);
      this.i(dmh.eJ, dmh.ik);
      this.i(dmh.eK, dmh.il);
      this.i(dmh.eL, dmh.im);
      this.i(dmh.eM, dmh.in);
      this.i(dmh.eN, dmh.io);
      this.i(dmh.eO, dmh.ip);
      this.b(frn.t, dmh.lM, dmh.lN, dmh.lO, dmh.lP, dmh.lQ, dmh.lR, dmh.lS, dmh.lT, dmh.lU, dmh.lV, dmh.lW, dmh.lX, dmh.lY, dmh.lZ, dmh.ma, dmh.mb);
      this.h(dmh.bK, dmh.iM);
      this.h(dmh.bL, dmh.iN);
      this.h(dmh.bM, dmh.iO);
      this.h(dmh.bN, dmh.iP);
      this.h(dmh.bO, dmh.iQ);
      this.h(dmh.bP, dmh.iR);
      this.h(dmh.bQ, dmh.iS);
      this.h(dmh.bR, dmh.iT);
      this.h(dmh.bS, dmh.iU);
      this.h(dmh.bT, dmh.iV);
      this.h(dmh.bU, dmh.iW);
      this.h(dmh.bV, dmh.iX);
      this.h(dmh.bW, dmh.iY);
      this.h(dmh.bX, dmh.iZ);
      this.h(dmh.bY, dmh.ja);
      this.h(dmh.bZ, dmh.jb);
      this.a(dmh.ts);
      this.a(dmh.fd);
      this.b(dmh.bB, dmh.gB, fqq.d.a);
      this.h(dmh.bB);
      this.a(dmh.cb, dmh.gC, fqq.d.b);
      this.a(dmh.cd, dmh.gD, fqq.d.b);
      this.a(dmh.uh, dmh.uj, fqq.d.c);
      this.a(dmh.ui, dmh.uk, fqq.d.b);
      this.a(dmh.ce, dmh.gE, fqq.d.b);
      this.a(dmh.cf, dmh.gF, fqq.d.b);
      this.a(dmh.cg, dmh.gG, fqq.d.b);
      this.a(dmh.ch, dmh.gH, fqq.d.b);
      this.a(dmh.ci, dmh.gI, fqq.d.b);
      this.a(dmh.cj, dmh.gJ, fqq.d.b);
      this.a(dmh.ck, dmh.gK, fqq.d.b);
      this.a(dmh.cl, dmh.gL, fqq.d.b);
      this.a(dmh.cm, dmh.gM, fqq.d.b);
      this.a(dmh.co, dmh.gN, fqq.d.b);
      this.a(dmh.cn, dmh.gO, fqq.d.b);
      this.a(dmh.cq, dmh.gP, fqq.d.b);
      this.a(dmh.cp, dmh.gQ, fqq.d.b);
      this.a(dmh.bC, dmh.gR, fqq.d.b);
      this.a(dmh.cc, dmh.gr, fqq.d.b);
      this.I();
      this.y(dmh.fl);
      this.y(dmh.fm);
      this.y(dmh.fn);
      this.b(dmh.bA, fqq.d.a);
      this.h(dmh.bA);
      this.a(dmh.bE, fqq.d.b);
      this.a(dmh.bF, fqq.d.b);
      this.b(dmh.bD, fqq.d.a);
      this.h(dmh.bD);
      this.b(dmh.ej, fqq.d.a);
      this.b(czh.dW);
      this.c(dmh.mI, dmh.mJ, fqq.d.b);
      this.b(czh.dX);
      this.b(dmh.tq, fqq.d.b);
      this.c(dmh.pf, dmh.pg, fqq.d.b);
      this.c(dmh.ph, dmh.pi, fqq.d.b);
      this.a(dmh.pf, "_plant");
      this.a(dmh.ph, "_plant");
      this.a(dmh.nE, fqq.d.a, frl.c(frl.a(dmh.nF, "_stage0")));
      this.n();
      this.a(dmh.eh, fqq.d.b);
      this.a(dmh.bz, fqq.d.b);
      this.d(dmh.jg, fqq.d.b);
      this.d(dmh.jh, fqq.d.b);
      this.d(dmh.ji, fqq.d.b);
      this.o(dmh.jj);
      this.o(dmh.jk);
      this.k();
      this.l();
      this.m();
      this.a(dmh.nc, dmh.mX, dmh.mS, dmh.mN, dmh.nm, dmh.nh, dmh.nw, dmh.nr);
      this.a(dmh.nd, dmh.mY, dmh.mT, dmh.mO, dmh.nn, dmh.ni, dmh.nx, dmh.ns);
      this.a(dmh.ne, dmh.mZ, dmh.mU, dmh.mP, dmh.no, dmh.nj, dmh.ny, dmh.nt);
      this.a(dmh.nf, dmh.na, dmh.mV, dmh.mQ, dmh.np, dmh.nk, dmh.nz, dmh.nu);
      this.a(dmh.ng, dmh.nb, dmh.mW, dmh.mR, dmh.nq, dmh.nl, dmh.nA, dmh.nv);
      this.f(dmh.fw, dmh.fu);
      this.f(dmh.fv, dmh.ft);
      this.m(dmh.af).c(dmh.af).a(dmh.aA);
      this.m(dmh.ar).c(dmh.ar).a(dmh.aJ);
      this.a(dmh.ar, dmh.dx, dmh.dH);
      this.a(dmh.aS, frn.w, -7158200);
      this.m(dmh.ab).c(dmh.ab).a(dmh.ax);
      this.m(dmh.am).c(dmh.am).a(dmh.aF);
      this.a(dmh.am, dmh.dq, dmh.dC);
      this.a(dmh.D, dmh.gw, fqq.d.b);
      this.a(dmh.aO, frn.w, -12012264);
      this.m(dmh.ac).d(dmh.ac).a(dmh.ay);
      this.m(dmh.an).d(dmh.an).a(dmh.aG);
      this.a(dmh.an, dmh.dr, dmh.dD);
      this.a(dmh.E, dmh.gx, fqq.d.b);
      this.b(dmh.aP, frn.w);
      this.m(dmh.Z).c(dmh.Z).a(dmh.av);
      this.m(dmh.ak).c(dmh.ak).a(dmh.aD);
      this.a(dmh.ak, dmh.dp, dmh.dB);
      this.a(dmh.B, dmh.gu, fqq.d.b);
      this.a(dmh.aM, frn.w, -8345771);
      this.m(dmh.X).c(dmh.X).a(dmh.at);
      this.m(dmh.aq).c(dmh.aq).a(dmh.aB);
      this.a(dmh.aq, dmh.dn, dmh.dz);
      this.a(dmh.z, dmh.gs, fqq.d.b);
      this.a(dmh.aK, frn.w, -12012264);
      this.m(dmh.Y).c(dmh.Y).a(dmh.au);
      this.m(dmh.aj).c(dmh.aj).a(dmh.aC);
      this.a(dmh.aj, dmh.do, dmh.dA);
      this.a(dmh.A, dmh.gt, fqq.d.b);
      this.a(dmh.aL, frn.w, -10380959);
      this.m(dmh.ad).c(dmh.ad).a(dmh.az);
      this.m(dmh.ao).c(dmh.ao).a(dmh.aH);
      this.a(dmh.ao, dmh.dt, dmh.dF);
      this.a(dmh.F, dmh.gy, fqq.d.b);
      this.a(dmh.aQ, frn.w, -12012264);
      this.m(dmh.ae).c(dmh.ae).a(dmh.u);
      this.m(dmh.ap).c(dmh.ap).a(dmh.aI);
      this.a(dmh.ap, dmh.du, dmh.dG);
      this.a(dmh.G, dmh.gz, fqq.d.b);
      this.b(dmh.aR, frn.w);
      this.m(dmh.aa).c(dmh.aa).a(dmh.aw);
      this.m(dmh.al).c(dmh.al).a(dmh.aE);
      this.a(dmh.al, dmh.ds, dmh.dE);
      this.a(dmh.C, dmh.gv, fqq.d.b);
      this.a(dmh.aN, frn.w, -12012264);
      this.m(dmh.oY).b(dmh.oY).a(dmh.pa);
      this.m(dmh.oZ).b(dmh.oZ).a(dmh.pb);
      this.a(dmh.oZ, dmh.dv, dmh.dI);
      this.a(dmh.pd, dmh.pU, fqq.d.b);
      this.n(dmh.pj, dmh.pW);
      this.m(dmh.oP).b(dmh.oP).a(dmh.oR);
      this.m(dmh.oQ).b(dmh.oQ).a(dmh.oS);
      this.a(dmh.oQ, dmh.dw, dmh.dJ);
      this.a(dmh.oU, dmh.pV, fqq.d.b);
      this.n(dmh.oW, dmh.pX);
      this.m(dmh.ai).d(dmh.ai);
      this.m(dmh.as).d(dmh.as);
      this.a(dmh.x, dmh.dy, dmh.dK);
      this.b(dmh.oX, fqq.d.b);
      this.b(czh.dT);
      this.j(dmh.dN);
      this.l(dmh.iA);
      this.v();
      this.p(dmh.db);
      this.q(dmh.bw);
      this.q(dmh.bx);
      this.q(dmh.hI);
      this.u();
      this.u(dmh.gm);
      this.u(dmh.lm);
      this.u(dmh.ln);
      this.v(dmh.ht);
      this.v(dmh.hu);
      this.v(dmh.hv);
      this.p();
      this.q();
      this.d(dmh.cO, frn.h);
      this.d(dmh.oC, frn.h);
      this.d(dmh.oB, frn.i);
      this.t();
      this.aD();
      this.ay();
      this.l(dmh.fc, dmh.fk);
      this.l(dmh.m, dmh.fg);
      this.l(dmh.fb, dmh.fj);
      this.l(dmh.fa, dmh.fi);
      this.aB();
      this.l(dmh.eZ, dmh.fh);
      this.aC();
   }

   private void aK() {
      hfn.b $$0 = frg.a(this.a(czh.ig));
      Map<Integer, hfn.b> $$1 = new HashMap<>(16);
      fqz.a<Integer> $$2 = fqz.a(eax.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         alg $$5 = frl.a(czh.ig, $$4);
         $$2.a($$3, frb.a().a(frc.c, frk.aa.a(dmh.iz, $$4, frl.h($$5), this.d)));
         hfn.b $$6 = frg.a(frk.bI.a(fri.a(czh.ig, $$4), frl.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(czh.ig, frg.a(dqz.c, $$0, $$1));
      this.b.accept(fqy.a(dmh.iz).a($$2));
   }

   private void o(dmf $$0, dmf $$1) {
      this.b($$0.h());
      frl $$2 = frl.b(frl.J($$0));
      frl $$3 = frl.b(frl.a($$0, "_lit"));
      alg $$4 = frk.bV.a($$0, "_one_candle", $$2, this.d);
      alg $$5 = frk.bW.a($$0, "_two_candles", $$2, this.d);
      alg $$6 = frk.bX.a($$0, "_three_candles", $$2, this.d);
      alg $$7 = frk.bY.a($$0, "_four_candles", $$2, this.d);
      alg $$8 = frk.bV.a($$0, "_one_candle_lit", $$3, this.d);
      alg $$9 = frk.bW.a($$0, "_two_candles_lit", $$3, this.d);
      alg $$10 = frk.bX.a($$0, "_three_candles_lit", $$3, this.d);
      alg $$11 = frk.bY.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fqy.a($$0)
               .a(
                  fqz.a(eax.aC, eax.u)
                     .a(1, false, frb.a().a(frc.c, $$4))
                     .a(2, false, frb.a().a(frc.c, $$5))
                     .a(3, false, frb.a().a(frc.c, $$6))
                     .a(4, false, frb.a().a(frc.c, $$7))
                     .a(1, true, frb.a().a(frc.c, $$8))
                     .a(2, true, frb.a().a(frc.c, $$9))
                     .a(3, true, frb.a().a(frc.c, $$10))
                     .a(4, true, frb.a().a(frc.c, $$11))
               )
         );
      alg $$12 = frk.bZ.a($$1, frl.a($$0, false), this.d);
      alg $$13 = frk.bZ.a($$1, "_lit", frl.a($$0, true), this.d);
      this.b.accept(fqy.a($$1).a(a(eax.u, $$13, $$12)));
   }

   class a {
      private final frl b;
      private final Map<frj, alg> c = Maps.newHashMap();
      @Nullable
      private mj d;
      @Nullable
      private alg e;
      private final Set<dmf> f = new HashSet<>();

      public a(final frl $$0) {
         this.b = $$0;
      }

      public fqq.a a(dmf $$0, frj $$1) {
         this.e = $$1.a($$0, this.b, fqq.this.d);
         if (fqq.this.f.containsKey($$0)) {
            fqq.this.b.accept(fqq.this.f.get($$0).create($$0, this.e, this.b, fqq.this.d));
         } else {
            fqq.this.b.accept(fqq.c($$0, this.e));
         }

         return this;
      }

      public fqq.a a(dmf $$0, dmf $$1) {
         alg $$2 = fri.a($$0);
         fqq.this.b.accept(fqq.c($$1, $$2));
         fqq.this.c.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public fqq.a a(dmf $$0) {
         alg $$1 = frk.s.a($$0, this.b, fqq.this.d);
         alg $$2 = frk.t.a($$0, this.b, fqq.this.d);
         fqq.this.b.accept(fqq.b($$0, $$1, $$2));
         alg $$3 = frk.u.a($$0, this.b, fqq.this.d);
         fqq.this.a($$0, $$3);
         return this;
      }

      public fqq.a b(dmf $$0) {
         alg $$1 = frk.M.a($$0, this.b, fqq.this.d);
         alg $$2 = frk.N.a($$0, this.b, fqq.this.d);
         alg $$3 = frk.O.a($$0, this.b, fqq.this.d);
         fqq.this.b.accept(fqq.a($$0, $$1, $$2, $$3));
         alg $$4 = frk.P.a($$0, this.b, fqq.this.d);
         fqq.this.a($$0, $$4);
         return this;
      }

      public fqq.a c(dmf $$0) {
         frl $$1 = frl.s($$0);
         alg $$2 = frk.D.a($$0, $$1, fqq.this.d);
         alg $$3 = frk.E.a($$0, $$1, fqq.this.d);
         alg $$4 = frk.F.a($$0, $$1, fqq.this.d);
         alg $$5 = frk.G.a($$0, $$1, fqq.this.d);
         alg $$6 = frk.H.a($$0, $$1, fqq.this.d);
         fqq.this.b.accept(fqq.a($$0, $$2, $$3, $$4, $$5, $$6));
         alg $$7 = frk.I.a($$0, $$1, fqq.this.d);
         fqq.this.a($$0, $$7);
         return this;
      }

      public fqq.a d(dmf $$0) {
         alg $$1 = frk.J.a($$0, this.b, fqq.this.d);
         alg $$2 = frk.K.a($$0, this.b, fqq.this.d);
         fqq.this.b.accept(fqq.c($$0, $$1, $$2));
         alg $$3 = frk.L.a($$0, this.b, fqq.this.d);
         fqq.this.a($$0, $$3);
         return this;
      }

      public fqq.a e(dmf $$0) {
         frl $$1 = frl.s($$0);
         alg $$2 = frk.R.a($$0, $$1, fqq.this.d);
         alg $$3 = frk.Q.a($$0, $$1, fqq.this.d);
         alg $$4 = frk.T.a($$0, $$1, fqq.this.d);
         alg $$5 = frk.S.a($$0, $$1, fqq.this.d);
         fqq.this.b.accept(fqq.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fqq.a f(dmf $$0) {
         alg $$1 = frk.V.a($$0, this.b, fqq.this.d);
         alg $$2 = frk.U.a($$0, this.b, fqq.this.d);
         alg $$3 = frk.X.a($$0, this.b, fqq.this.d);
         alg $$4 = frk.W.a($$0, this.b, fqq.this.d);
         fqq.this.b.accept(fqq.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fqq.a g(dmf $$0) {
         alg $$1 = frk.Y.a($$0, this.b, fqq.this.d);
         alg $$2 = frk.Z.a($$0, this.b, fqq.this.d);
         fqq.this.b.accept(fqq.e($$0, $$1, $$2));
         return this;
      }

      public fqq.a h(dmf $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dmf $$1 = this.d.b().get(mj.b.r);
            alg $$2 = frk.aa.a($$0, this.b, fqq.this.d);
            fqq.this.b.accept(fqq.c($$0, $$2));
            fqq.this.b.accept(fqq.c($$1, $$2));
            fqq.this.b($$0.h());
            return this;
         }
      }

      public fqq.a i(dmf $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alg $$1 = this.a(frk.ab, $$0);
            alg $$2 = this.a(frk.ac, $$0);
            fqq.this.b.accept(fqq.e($$0, $$1, $$2, this.e));
            fqq.this.a($$0, $$1);
            return this;
         }
      }

      public fqq.a j(dmf $$0) {
         alg $$1 = this.a(frk.af, $$0);
         alg $$2 = this.a(frk.ae, $$0);
         alg $$3 = this.a(frk.ag, $$0);
         fqq.this.b.accept(fqq.b($$0, $$1, $$2, $$3));
         fqq.this.a($$0, $$2);
         return this;
      }

      private fqq.a k(dmf $$0) {
         frn $$1 = fqq.this.g.getOrDefault($$0, frn.a.get($$0));
         alg $$2 = $$1.a($$0, fqq.this.d);
         fqq.this.b.accept(fqq.c($$0, $$2));
         return this;
      }

      private fqq.a l(dmf $$0) {
         fqq.this.j($$0);
         return this;
      }

      private void m(dmf $$0) {
         if (fqq.this.e.contains($$0)) {
            fqq.this.l($$0);
         } else {
            fqq.this.k($$0);
         }
      }

      private alg a(frj $$0, dmf $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fqq.this.d));
      }

      public fqq.a a(mj $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fqq.a, dmf> $$2 = fqq.h.get($$0x);
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
      fqv create(dmf var1, alg var2, frl var3, BiConsumer<alg, frh> var4);
   }

   static record c(frj a, String b) {
   }

   static enum d {
      a(frk.ap, frk.as, false),
      b(frk.ao, frk.ar, false),
      c(frk.aq, frk.at, true);

      private final frj d;
      private final frj e;
      private final boolean f;

      private d(final frj $$0, final frj $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public frj a() {
         return this.d;
      }

      public frj b() {
         return this.e;
      }

      public alg a(fqq $$0, dmf $$1) {
         cyz $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public frl a(dmf $$0) {
         return this.f ? frl.e($$0) : frl.c($$0);
      }

      public frl b(dmf $$0) {
         return this.f ? frl.g($$0) : frl.f($$0);
      }
   }

   class e {
      private final frl b;

      public e(final frl $$0) {
         this.b = $$0;
      }

      public fqq.e a(dmf $$0) {
         frl $$1 = this.b.c(frm.d, this.b.a(frm.i));
         alg $$2 = frk.j.a($$0, $$1, fqq.this.d);
         fqq.this.b.accept(fqq.d($$0, $$2));
         return this;
      }

      public fqq.e b(dmf $$0) {
         alg $$1 = frk.j.a($$0, this.b, fqq.this.d);
         fqq.this.b.accept(fqq.d($$0, $$1));
         return this;
      }

      public fqq.e c(dmf $$0) {
         alg $$1 = frk.j.a($$0, this.b, fqq.this.d);
         alg $$2 = frk.k.a($$0, this.b, fqq.this.d);
         fqq.this.b.accept(fqq.d($$0, $$1, $$2));
         return this;
      }

      public fqq.e d(dmf $$0) {
         fqq.this.b.accept(fqq.a($$0, this.b, fqq.this.d));
         return this;
      }
   }
}
