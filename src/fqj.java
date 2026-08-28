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

public class fqj {
   final Consumer<fqo> b;
   final fqm c;
   final BiConsumer<alg, fra> d;
   final List<dma> e = ImmutableList.of(dmc.eM, dmc.eS, dmc.ix);
   final Map<dma, fqj.b> f = ImmutableMap.builder().put(dmc.b, fqj::a).put(dmc.tq, fqj::c).put(dmc.fb, fqj::b).build();
   final Map<dma, frg> g = ImmutableMap.builder()
      .put(dmc.bc, frg.C.get(dmc.bc))
      .put(dmc.jO, frg.C.get(dmc.jO))
      .put(dmc.ks, frg.a(fre.a(dmc.bc, "_top")))
      .put(dmc.ku, frg.a(fre.a(dmc.jO, "_top")))
      .put(dmc.be, frg.d.get(dmc.bc).a($$0x -> $$0x.a(frf.i, fre.J(dmc.be))))
      .put(dmc.jQ, frg.d.get(dmc.jO).a($$0x -> $$0x.a(frf.i, fre.J(dmc.jQ))))
      .put(dmc.hB, frg.d.get(dmc.hB))
      .put(dmc.kt, frg.a(fre.a(dmc.hB, "_bottom")))
      .put(dmc.pW, frg.D.get(dmc.pW))
      .put(dmc.tq, frg.D.get(dmc.tq))
      .put(dmc.hC, frg.d.get(dmc.hC).a($$0x -> $$0x.a(frf.i, fre.J(dmc.hC))))
      .put(dmc.bd, frg.d.get(dmc.bd).a($$0x -> {
         $$0x.a(frf.d, fre.a(dmc.bc, "_top"));
         $$0x.a(frf.i, fre.J(dmc.bd));
      }))
      .put(dmc.jP, frg.d.get(dmc.jP).a($$0x -> {
         $$0x.a(frf.d, fre.a(dmc.jO, "_top"));
         $$0x.a(frf.i, fre.J(dmc.jP));
      }))
      .put(dmc.rr, frg.D.get(dmc.rr))
      .put(dmc.rm, frg.D.get(dmc.rm))
      .build();
   static final Map<mj.b, BiConsumer<fqj.a, dma>> h = ImmutableMap.builder()
      .put(mj.b.a, fqj.a::a)
      .put(mj.b.e, fqj.a::l)
      .put(mj.b.b, fqj.a::k)
      .put(mj.b.c, fqj.a::k)
      .put(mj.b.f, fqj.a::c)
      .put(mj.b.g, fqj.a::d)
      .put(mj.b.h, fqj.a::e)
      .put(mj.b.i, fqj.a::f)
      .put(mj.b.k, fqj.a::h)
      .put(mj.b.l, fqj.a::i)
      .put(mj.b.m, fqj.a::j)
      .put(mj.b.n, fqj.a::g)
      .put(mj.b.p, fqj.a::m)
      .put(mj.b.q, fqj.a::b)
      .build();
   public static final List<Pair<ja, Function<alg, fqu>>> a = List.of(
      Pair.of(ja.c, (Function<alg, fqu>)$$0 -> fqu.a().a(fqv.c, $$0)),
      Pair.of(ja.f, (Function<alg, fqu>)$$0 -> fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b).a(fqv.d, true)),
      Pair.of(ja.d, (Function<alg, fqu>)$$0 -> fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c).a(fqv.d, true)),
      Pair.of(ja.e, (Function<alg, fqu>)$$0 -> fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d).a(fqv.d, true)),
      Pair.of(ja.b, (Function<alg, fqu>)$$0 -> fqu.a().a(fqv.c, $$0).a(fqv.a, fqv.a.d).a(fqv.d, true)),
      Pair.of(ja.a, (Function<alg, fqu>)$$0 -> fqu.a().a(fqv.c, $$0).a(fqv.a, fqv.a.b).a(fqv.d, true))
   );
   private static final Map<fqj.c, alg> i = new HashMap<>();

   private static fqo a(dma $$0, alg $$1, fre $$2, BiConsumer<alg, fra> $$3) {
      alg $$4 = frd.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fqo b(dma $$0, alg $$1, fre $$2, BiConsumer<alg, fra> $$3) {
      alg $$4 = frd.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fqo c(dma $$0, alg $$1, fre $$2, BiConsumer<alg, fra> $$3) {
      alg $$4 = frd.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fqj(Consumer<fqo> $$0, fqm $$1, BiConsumer<alg, fra> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cyu $$0, alg $$1) {
      this.c.a($$0, fqz.a($$1));
   }

   void a(dma $$0, alg $$1) {
      this.c.a($$0.h(), fqz.a($$1));
   }

   private void a(dma $$0, alg $$1, fqc $$2) {
      this.c.a($$0.h(), fqz.a($$1, $$2));
   }

   private alg a(cyu $$0) {
      return frd.bI.a(frb.a($$0), fre.b($$0), this.d);
   }

   alg a(cyu $$0, dma $$1) {
      return frd.bI.a(frb.a($$0), fre.I($$1), this.d);
   }

   private alg a(cyu $$0, dma $$1, String $$2) {
      return frd.bI.a(frb.a($$0), fre.k(fre.a($$1, $$2)), this.d);
   }

   alg b(cyu $$0, dma $$1, String $$2) {
      alg $$3 = fre.J($$1);
      alg $$4 = fre.a($$1, $$2);
      return frd.bM.a(frb.a($$0), fre.c($$3, $$4), this.d);
   }

   void b(cyu $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dma $$0) {
      cyu $$1 = $$0.h();
      if ($$1 != czc.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dma $$0, String $$1) {
      cyu $$2 = $$0.h();
      if ($$2 != czc.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dma $$0, String $$1) {
      cyu $$2 = $$0.h();
      if ($$2 != czc.a) {
         alg $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fqs b() {
      return fqs.a(eap.T).a(ja.f, fqu.a().a(fqv.b, fqv.a.b)).a(ja.d, fqu.a().a(fqv.b, fqv.a.c)).a(ja.e, fqu.a().a(fqv.b, fqv.a.d)).a(ja.c, fqu.a());
   }

   private static fqs c() {
      return fqs.a(eap.T).a(ja.d, fqu.a()).a(ja.e, fqu.a().a(fqv.b, fqv.a.b)).a(ja.c, fqu.a().a(fqv.b, fqv.a.c)).a(ja.f, fqu.a().a(fqv.b, fqv.a.d));
   }

   private static fqs d() {
      return fqs.a(eap.T).a(ja.f, fqu.a()).a(ja.d, fqu.a().a(fqv.b, fqv.a.b)).a(ja.e, fqu.a().a(fqv.b, fqv.a.c)).a(ja.c, fqu.a().a(fqv.b, fqv.a.d));
   }

   private static fqs e() {
      return fqs.a(eap.R)
         .a(ja.a, fqu.a().a(fqv.a, fqv.a.b))
         .a(ja.b, fqu.a().a(fqv.a, fqv.a.d))
         .a(ja.c, fqu.a())
         .a(ja.d, fqu.a().a(fqv.b, fqv.a.c))
         .a(ja.e, fqu.a().a(fqv.b, fqv.a.d))
         .a(ja.f, fqu.a().a(fqv.b, fqv.a.b));
   }

   private static fqr b(dma $$0, alg $$1) {
      return fqr.a($$0, a($$1));
   }

   private static fqu[] a(alg $$0) {
      return new fqu[]{
         fqu.a().a(fqv.c, $$0), fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b), fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c), fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d)
      };
   }

   private static fqr a(dma $$0, alg $$1, alg $$2) {
      return fqr.a($$0, fqu.a().a(fqv.c, $$1), fqu.a().a(fqv.c, $$2), fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.c), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c));
   }

   private static fqs a(eaq $$0, alg $$1, alg $$2) {
      return fqs.a($$0).a(true, fqu.a().a(fqv.c, $$1)).a(false, fqu.a().a(fqv.c, $$2));
   }

   private void d(dma $$0) {
      alg $$1 = frg.a.create($$0, this.d);
      alg $$2 = frg.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(dma $$0) {
      alg $$1 = frg.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(dma $$0) {
      this.b.accept(fqr.a($$0).a(fqs.a(eap.by).a($$1 -> {
         String $$2 = "_" + $$1;
         alg $$3 = fre.a($$0, $$2);
         return fqu.a().a(fqv.c, frd.c.a($$0, $$2, new fre().a(frf.a, $$3), this.d));
      })));
      this.a($$0, frb.a($$0, "_0"));
   }

   static fqo b(dma $$0, alg $$1, alg $$2) {
      return fqr.a($$0)
         .a(fqs.a(eap.A).a(false, fqu.a().a(fqv.c, $$1)).a(true, fqu.a().a(fqv.c, $$2)))
         .a(
            fqs.a(eap.X, eap.T)
               .a(eak.a, ja.f, fqu.a().a(fqv.b, fqv.a.b))
               .a(eak.a, ja.e, fqu.a().a(fqv.b, fqv.a.d))
               .a(eak.a, ja.d, fqu.a().a(fqv.b, fqv.a.c))
               .a(eak.a, ja.c, fqu.a())
               .a(eak.b, ja.f, fqu.a().a(fqv.b, fqv.a.b).a(fqv.a, fqv.a.b).a(fqv.d, true))
               .a(eak.b, ja.e, fqu.a().a(fqv.b, fqv.a.d).a(fqv.a, fqv.a.b).a(fqv.d, true))
               .a(eak.b, ja.d, fqu.a().a(fqv.b, fqv.a.c).a(fqv.a, fqv.a.b).a(fqv.d, true))
               .a(eak.b, ja.c, fqu.a().a(fqv.a, fqv.a.b).a(fqv.d, true))
               .a(eak.c, ja.f, fqu.a().a(fqv.b, fqv.a.d).a(fqv.a, fqv.a.c))
               .a(eak.c, ja.e, fqu.a().a(fqv.b, fqv.a.b).a(fqv.a, fqv.a.c))
               .a(eak.c, ja.d, fqu.a().a(fqv.a, fqv.a.c))
               .a(eak.c, ja.c, fqu.a().a(fqv.b, fqv.a.c).a(fqv.a, fqv.a.c))
         );
   }

   private static fqs.d<ja, eav, eau, Boolean> a(fqs.d<ja, eav, eau, Boolean> $$0, eav $$1, alg $$2, alg $$3, alg $$4, alg $$5) {
      return $$0.a(ja.f, $$1, eau.a, false, fqu.a().a(fqv.c, $$2))
         .a(ja.d, $$1, eau.a, false, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b))
         .a(ja.e, $$1, eau.a, false, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c))
         .a(ja.c, $$1, eau.a, false, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d))
         .a(ja.f, $$1, eau.b, false, fqu.a().a(fqv.c, $$4))
         .a(ja.d, $$1, eau.b, false, fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.b))
         .a(ja.e, $$1, eau.b, false, fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.c))
         .a(ja.c, $$1, eau.b, false, fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.d))
         .a(ja.f, $$1, eau.a, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
         .a(ja.d, $$1, eau.a, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c))
         .a(ja.e, $$1, eau.a, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d))
         .a(ja.c, $$1, eau.a, true, fqu.a().a(fqv.c, $$3))
         .a(ja.f, $$1, eau.b, true, fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.d))
         .a(ja.d, $$1, eau.b, true, fqu.a().a(fqv.c, $$5))
         .a(ja.e, $$1, eau.b, true, fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.b))
         .a(ja.c, $$1, eau.b, true, fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.c));
   }

   private static fqo a(dma $$0, alg $$1, alg $$2, alg $$3, alg $$4, alg $$5, alg $$6, alg $$7, alg $$8) {
      return fqr.a($$0).a(a(a(fqs.a(eap.T, eap.ah, eap.bh, eap.y), eav.b, $$1, $$2, $$3, $$4), eav.a, $$5, $$6, $$7, $$8));
   }

   static fqo a(dma $$0, alg $$1, alg $$2, alg $$3, alg $$4, alg $$5) {
      return fqq.a($$0)
         .a(fqu.a().a(fqv.c, $$1))
         .a(fqp.a().a(eap.N, true), fqu.a().a(fqv.c, $$2).a(fqv.d, false))
         .a(fqp.a().a(eap.O, true), fqu.a().a(fqv.c, $$3).a(fqv.d, false))
         .a(fqp.a().a(eap.P, true), fqu.a().a(fqv.c, $$4).a(fqv.d, false))
         .a(fqp.a().a(eap.Q, true), fqu.a().a(fqv.c, $$5).a(fqv.d, false));
   }

   static fqo c(dma $$0, alg $$1, alg $$2) {
      return fqq.a($$0)
         .a(fqu.a().a(fqv.c, $$1))
         .a(fqp.a().a(eap.N, true), fqu.a().a(fqv.c, $$2).a(fqv.d, true))
         .a(fqp.a().a(eap.O, true), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b).a(fqv.d, true))
         .a(fqp.a().a(eap.P, true), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c).a(fqv.d, true))
         .a(fqp.a().a(eap.Q, true), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d).a(fqv.d, true));
   }

   static fqo a(dma $$0, alg $$1, alg $$2, alg $$3) {
      return fqq.a($$0)
         .a(fqp.a().a(eap.L, true), fqu.a().a(fqv.c, $$1))
         .a(fqp.a().a(eap.aa, ebm.b), fqu.a().a(fqv.c, $$2).a(fqv.d, true))
         .a(fqp.a().a(eap.Z, ebm.b), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b).a(fqv.d, true))
         .a(fqp.a().a(eap.ab, ebm.b), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c).a(fqv.d, true))
         .a(fqp.a().a(eap.ac, ebm.b), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d).a(fqv.d, true))
         .a(fqp.a().a(eap.aa, ebm.c), fqu.a().a(fqv.c, $$3).a(fqv.d, true))
         .a(fqp.a().a(eap.Z, ebm.c), fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b).a(fqv.d, true))
         .a(fqp.a().a(eap.ab, ebm.c), fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c).a(fqv.d, true))
         .a(fqp.a().a(eap.ac, ebm.c), fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d).a(fqv.d, true));
   }

   static fqo a(dma $$0, alg $$1, alg $$2, alg $$3, alg $$4, boolean $$5) {
      return fqr.a($$0, fqu.a().a(fqv.d, $$5))
         .a(c())
         .a(
            fqs.a(eap.t, eap.y)
               .a(false, false, fqu.a().a(fqv.c, $$2))
               .a(true, false, fqu.a().a(fqv.c, $$4))
               .a(false, true, fqu.a().a(fqv.c, $$1))
               .a(true, true, fqu.a().a(fqv.c, $$3))
         );
   }

   static fqo b(dma $$0, alg $$1, alg $$2, alg $$3) {
      return fqr.a($$0)
         .a(
            fqs.a(eap.T, eap.ai, eap.bl)
               .a(ja.f, eay.b, ebi.a, fqu.a().a(fqv.c, $$2))
               .a(ja.e, eay.b, ebi.a, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.d, eay.b, ebi.a, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.c, eay.b, ebi.a, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.f, eay.b, ebi.e, fqu.a().a(fqv.c, $$3))
               .a(ja.e, eay.b, ebi.e, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.d, eay.b, ebi.e, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.c, eay.b, ebi.e, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.f, eay.b, ebi.d, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.e, eay.b, ebi.d, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.d, eay.b, ebi.d, fqu.a().a(fqv.c, $$3))
               .a(ja.c, eay.b, ebi.d, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.f, eay.b, ebi.c, fqu.a().a(fqv.c, $$1))
               .a(ja.e, eay.b, ebi.c, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.d, eay.b, ebi.c, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.c, eay.b, ebi.c, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.f, eay.b, ebi.b, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.e, eay.b, ebi.b, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.d, eay.b, ebi.b, fqu.a().a(fqv.c, $$1))
               .a(ja.c, eay.b, ebi.b, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.f, eay.a, ebi.a, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.c).a(fqv.d, true))
               .a(ja.e, eay.a, ebi.a, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.d, eay.a, ebi.a, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.c, eay.a, ebi.a, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.f, eay.a, ebi.e, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.e, eay.a, ebi.e, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.d, eay.a, ebi.e, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.c, eay.a, ebi.e, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.d, true))
               .a(ja.f, eay.a, ebi.d, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.d, true))
               .a(ja.e, eay.a, ebi.d, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.d, eay.a, ebi.d, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.c, eay.a, ebi.d, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.f, eay.a, ebi.c, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.e, eay.a, ebi.c, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(ja.d, eay.a, ebi.c, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.c, eay.a, ebi.c, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.d, true))
               .a(ja.f, eay.a, ebi.b, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.d, true))
               .a(ja.e, eay.a, ebi.b, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(ja.d, eay.a, ebi.b, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(ja.c, eay.a, ebi.b, fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d).a(fqv.d, true))
         );
   }

   private static fqo c(dma $$0, alg $$1, alg $$2, alg $$3) {
      return fqr.a($$0)
         .a(
            fqs.a(eap.T, eap.ai, eap.y)
               .a(ja.c, eay.b, false, fqu.a().a(fqv.c, $$2))
               .a(ja.d, eay.b, false, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c))
               .a(ja.f, eay.b, false, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b))
               .a(ja.e, eay.b, false, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d))
               .a(ja.c, eay.a, false, fqu.a().a(fqv.c, $$1))
               .a(ja.d, eay.a, false, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.c))
               .a(ja.f, eay.a, false, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.b))
               .a(ja.e, eay.a, false, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.d))
               .a(ja.c, eay.b, true, fqu.a().a(fqv.c, $$3))
               .a(ja.d, eay.b, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c))
               .a(ja.f, eay.b, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
               .a(ja.e, eay.b, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d))
               .a(ja.c, eay.a, true, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c))
               .a(ja.d, eay.a, true, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.a))
               .a(ja.f, eay.a, true, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d))
               .a(ja.e, eay.a, true, fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b))
         );
   }

   private static fqo d(dma $$0, alg $$1, alg $$2, alg $$3) {
      return fqr.a($$0)
         .a(
            fqs.a(eap.T, eap.ai, eap.y)
               .a(ja.c, eay.b, false, fqu.a().a(fqv.c, $$2))
               .a(ja.d, eay.b, false, fqu.a().a(fqv.c, $$2))
               .a(ja.f, eay.b, false, fqu.a().a(fqv.c, $$2))
               .a(ja.e, eay.b, false, fqu.a().a(fqv.c, $$2))
               .a(ja.c, eay.a, false, fqu.a().a(fqv.c, $$1))
               .a(ja.d, eay.a, false, fqu.a().a(fqv.c, $$1))
               .a(ja.f, eay.a, false, fqu.a().a(fqv.c, $$1))
               .a(ja.e, eay.a, false, fqu.a().a(fqv.c, $$1))
               .a(ja.c, eay.b, true, fqu.a().a(fqv.c, $$3))
               .a(ja.d, eay.b, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c))
               .a(ja.f, eay.b, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
               .a(ja.e, eay.b, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d))
               .a(ja.c, eay.a, true, fqu.a().a(fqv.c, $$3))
               .a(ja.d, eay.a, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c))
               .a(ja.f, eay.a, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
               .a(ja.e, eay.a, true, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d))
         );
   }

   static fqr c(dma $$0, alg $$1) {
      return fqr.a($$0, fqu.a().a(fqv.c, $$1));
   }

   private static fqs f() {
      return fqs.a(eap.K).a(ja.a.b, fqu.a()).a(ja.a.c, fqu.a().a(fqv.a, fqv.a.b)).a(ja.a.a, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b));
   }

   static fqo a(dma $$0, fre $$1, BiConsumer<alg, fra> $$2) {
      alg $$3 = frd.g.a($$0, $$1, $$2);
      alg $$4 = frd.h.a($$0, $$1, $$2);
      alg $$5 = frd.i.a($$0, $$1, $$2);
      alg $$6 = frd.j.a($$0, $$1, $$2);
      return fqr.a($$0, fqu.a().a(fqv.c, $$6))
         .a(fqs.a(eap.K).a(ja.a.a, fqu.a().a(fqv.c, $$3)).a(ja.a.b, fqu.a().a(fqv.c, $$4)).a(ja.a.c, fqu.a().a(fqv.c, $$5)));
   }

   static fqo d(dma $$0, alg $$1) {
      return fqr.a($$0, fqu.a().a(fqv.c, $$1)).a(f());
   }

   private void e(dma $$0, alg $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dma $$0, frg.a $$1) {
      alg $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(dma $$0, frg.a $$1) {
      alg $$2 = $$1.create($$0, this.d);
      this.b.accept(fqr.a($$0, fqu.a().a(fqv.c, $$2)).a(b()));
   }

   static fqo d(dma $$0, alg $$1, alg $$2) {
      return fqr.a($$0)
         .a(
            fqs.a(eap.K)
               .a(ja.a.b, fqu.a().a(fqv.c, $$1))
               .a(ja.a.c, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.b))
               .a(ja.a.a, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b))
         );
   }

   private void a(dma $$0, frg.a $$1, frg.a $$2) {
      alg $$3 = $$1.create($$0, this.d);
      alg $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(dma $$0) {
      alg $$1 = frg.A.create($$0, this.d);
      alg $$2 = frg.B.create($$0, this.d);
      alg $$3 = this.a(frg.A, $$0, "_awake");
      alg $$4 = this.a(frg.B, $$0, "_awake");
      alg $$5 = this.a(frg.A, $$0, "_dormant");
      alg $$6 = this.a(frg.B, $$0, "_dormant");
      this.b
         .accept(
            fqr.a($$0)
               .a(
                  fqs.a(eap.K, dnv.c)
                     .a(ja.a.b, eat.a, fqu.a().a(fqv.c, $$1))
                     .a(ja.a.c, eat.a, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.b))
                     .a(ja.a.a, eat.a, fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b))
                     .a(ja.a.b, eat.b, fqu.a().a(fqv.c, $$5))
                     .a(ja.a.c, eat.b, fqu.a().a(fqv.c, $$6).a(fqv.a, fqv.a.b))
                     .a(ja.a.a, eat.b, fqu.a().a(fqv.c, $$6).a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b))
                     .a(ja.a.b, eat.c, fqu.a().a(fqv.c, $$3))
                     .a(ja.a.c, eat.c, fqu.a().a(fqv.c, $$4).a(fqv.a, fqv.a.b))
                     .a(ja.a.a, eat.c, fqu.a().a(fqv.c, $$4).a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b))
               )
         );
   }

   private alg a(frg.a $$0, dma $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(frf.i, fre.a($$1, $$2)).a(frf.d, fre.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.d);
   }

   private alg a(dma $$0, String $$1, frc $$2, Function<alg, fre> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fre.a($$0, $$1)), this.d);
   }

   static fqo e(dma $$0, alg $$1, alg $$2) {
      return fqr.a($$0).a(a(eap.A, $$2, $$1));
   }

   static fqo e(dma $$0, alg $$1, alg $$2, alg $$3) {
      return fqr.a($$0).a(fqs.a(eap.bk).a(ebh.b, fqu.a().a(fqv.c, $$1)).a(ebh.a, fqu.a().a(fqv.c, $$2)).a(ebh.c, fqu.a().a(fqv.c, $$3)));
   }

   public void a(dma $$0) {
      this.b($$0, frg.a);
   }

   public void b(dma $$0, frg.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(dma $$0, frg.a $$1, int $$2) {
      alg $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fqz.a($$2));
   }

   private void g() {
      this.K(dmc.fu);
      alg $$0 = this.a(czc.go, dmc.fu);
      this.a(dmc.fu, $$0, fqz.a(-12012264));
   }

   private void h(dma $$0) {
      alg $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new fqb());
   }

   private fqj.a i(dma $$0) {
      frg $$1 = this.g.getOrDefault($$0, frg.a.get($$0));
      return new fqj.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dma $$0, dma $$1, dma $$2) {
      alg $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.h());
   }

   void j(dma $$0) {
      fre $$1 = fre.w($$0);
      alg $$2 = frd.v.a($$0, $$1, this.d);
      alg $$3 = frd.w.a($$0, $$1, this.d);
      alg $$4 = frd.x.a($$0, $$1, this.d);
      alg $$5 = frd.y.a($$0, $$1, this.d);
      alg $$6 = frd.z.a($$0, $$1, this.d);
      alg $$7 = frd.A.a($$0, $$1, this.d);
      alg $$8 = frd.B.a($$0, $$1, this.d);
      alg $$9 = frd.C.a($$0, $$1, this.d);
      this.b($$0.h());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dma $$0, dma $$1) {
      alg $$2 = frd.v.a($$0);
      alg $$3 = frd.w.a($$0);
      alg $$4 = frd.x.a($$0);
      alg $$5 = frd.y.a($$0);
      alg $$6 = frd.z.a($$0);
      alg $$7 = frd.A.a($$0);
      alg $$8 = frd.B.a($$0);
      alg $$9 = frd.C.a($$0);
      this.c.a($$0.h(), $$1.h());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dma $$0) {
      fre $$1 = fre.b($$0);
      alg $$2 = frd.ak.a($$0, $$1, this.d);
      alg $$3 = frd.al.a($$0, $$1, this.d);
      alg $$4 = frd.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dma $$0) {
      fre $$1 = fre.b($$0);
      alg $$2 = frd.ah.a($$0, $$1, this.d);
      alg $$3 = frd.ai.a($$0, $$1, this.d);
      alg $$4 = frd.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(dma $$0, dma $$1) {
      alg $$2 = frd.ah.a($$0);
      alg $$3 = frd.ai.a($$0);
      alg $$4 = frd.aj.a($$0);
      this.c.a($$0.h(), $$1.h());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      alg $$0 = frb.a(dmc.tk);
      alg $$1 = frb.a(dmc.tk, "_partial_tilt");
      alg $$2 = frb.a(dmc.tk, "_full_tilt");
      this.b
         .accept(
            fqr.a(dmc.tk)
               .a(b())
               .a(fqs.a(eap.bo).a(ebl.a, fqu.a().a(fqv.c, $$0)).a(ebl.b, fqu.a().a(fqv.c, $$0)).a(ebl.c, fqu.a().a(fqv.c, $$1)).a(ebl.d, fqu.a().a(fqv.c, $$2)))
         );
   }

   private fqj.e m(dma $$0) {
      return new fqj.e(fre.q($$0));
   }

   private void n(dma $$0) {
      this.d($$0, $$0);
   }

   private void d(dma $$0, dma $$1) {
      this.b.accept(c($$0, frb.a($$1)));
   }

   private void a(dma $$0, fqj.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dma $$0, fqj.d $$1, fre $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dma $$0, fqj.d $$1) {
      fre $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dma $$0, fqj.d $$1, fre $$2) {
      alg $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(dma $$0, fqj.d $$1, ebc<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fqs $$4 = fqs.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fre $$5 = fre.c(fre.a($$0, $$4x));
            alg $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fqu.a().a(fqv.c, $$6);
         });
         this.b($$0.h());
         this.b.accept(fqr.a($$0).a($$4));
      }
   }

   private void a(dma $$0, dma $$1, fqj.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dma $$0, dma $$1, fqj.d $$2) {
      this.b($$0, $$2);
      fre $$3 = $$2.b($$0);
      alg $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(dma $$0, dma $$1) {
      frg $$2 = frg.u.get($$0);
      alg $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      alg $$4 = frd.aJ.a($$1, $$2.b(), this.d);
      this.b.accept(fqr.a($$1, fqu.a().a(fqv.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(dma $$0, dma $$1) {
      this.b($$0.h());
      fre $$2 = fre.k($$0);
      fre $$3 = fre.a($$0, $$1);
      alg $$4 = frd.bb.a($$1, $$3, this.d);
      this.b
         .accept(
            fqr.a($$1, fqu.a().a(fqv.c, $$4))
               .a(fqs.a(eap.T).a(ja.e, fqu.a()).a(ja.d, fqu.a().a(fqv.b, fqv.a.d)).a(ja.c, fqu.a().a(fqv.b, fqv.a.b)).a(ja.f, fqu.a().a(fqv.b, fqv.a.c)))
         );
      this.b.accept(fqr.a($$0).a(fqs.a(eap.ay).a($$2x -> fqu.a().a(fqv.c, frd.ba[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      dma $$0 = dmc.lf;
      this.b($$0.h());
      alg $$1 = frb.a($$0, "_top");
      alg $$2 = frb.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      dma $$0 = dmc.le;
      this.b($$0.h());
      fqs $$1 = fqs.a(dru.e, eap.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fqu.a().a(fqv.c, frb.a($$0, "_top_stage_" + $$1x));
            case b -> fqu.a().a(fqv.c, frb.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fqr.a($$0).a($$1));
   }

   private void a(dma $$0, dma $$1, dma $$2, dma $$3, dma $$4, dma $$5, dma $$6, dma $$7) {
      this.a($$0, fqj.d.b);
      this.a($$1, fqj.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dma $$0, fqj.d $$1) {
      alg $$2 = this.a($$0, "_top", $$1.a(), fre::c);
      alg $$3 = this.a($$0, "_bottom", $$1.a(), fre::c);
      this.f($$0, $$2, $$3);
   }

   private void d(dma $$0, fqj.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dma $$0) {
      alg $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new fqb());
      this.c($$0, fqj.d.a);
   }

   private void k() {
      this.a(dmc.jc, "_front");
      alg $$0 = frb.a(dmc.jc, "_top");
      alg $$1 = this.a(dmc.jc, "_bottom", fqj.d.b.a(), fre::c);
      this.f(dmc.jc, $$0, $$1);
   }

   private void l() {
      alg $$0 = this.a(dmc.bF, "_top", frd.bv, fre::a);
      alg $$1 = this.a(dmc.bF, "_bottom", frd.bv, fre::a);
      this.f(dmc.bF, $$0, $$1);
   }

   private void m() {
      alg $$0 = frb.a(dmc.tm, "_top");
      alg $$1 = frb.a(dmc.tm, "_bottom");
      this.b.accept(fqr.a(dmc.tm).a(b()).a(fqs.a(eap.ah).a(eav.b, fqu.a().a(fqv.c, $$1)).a(eav.a, fqu.a().a(fqv.c, $$0))));
   }

   private void f(dma $$0, alg $$1, alg $$2) {
      this.b.accept(fqr.a($$0).a(fqs.a(eap.ah).a(eav.b, fqu.a().a(fqv.c, $$2)).a(eav.a, fqu.a().a(fqv.c, $$1))));
   }

   private void p(dma $$0) {
      fre $$1 = fre.h($$0);
      fre $$2 = fre.e(fre.a($$0, "_corner"));
      alg $$3 = frd.au.a($$0, $$1, this.d);
      alg $$4 = frd.av.a($$0, $$2, this.d);
      alg $$5 = frd.aw.a($$0, $$1, this.d);
      alg $$6 = frd.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fqr.a($$0)
               .a(
                  fqs.a(eap.aj)
                     .a(ebd.a, fqu.a().a(fqv.c, $$3))
                     .a(ebd.b, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
                     .a(ebd.c, fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.b))
                     .a(ebd.d, fqu.a().a(fqv.c, $$6).a(fqv.b, fqv.a.b))
                     .a(ebd.e, fqu.a().a(fqv.c, $$5))
                     .a(ebd.f, fqu.a().a(fqv.c, $$6))
                     .a(ebd.g, fqu.a().a(fqv.c, $$4))
                     .a(ebd.h, fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.b))
                     .a(ebd.i, fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.c))
                     .a(ebd.j, fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.d))
               )
         );
   }

   private void q(dma $$0) {
      alg $$1 = this.a($$0, "", frd.au, fre::e);
      alg $$2 = this.a($$0, "", frd.aw, fre::e);
      alg $$3 = this.a($$0, "", frd.ax, fre::e);
      alg $$4 = this.a($$0, "_on", frd.au, fre::e);
      alg $$5 = this.a($$0, "_on", frd.aw, fre::e);
      alg $$6 = this.a($$0, "_on", frd.ax, fre::e);
      fqs $$7 = fqs.a(eap.A, eap.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return fqu.a().a(fqv.c, $$6x ? $$4 : $$1);
            case b:
               return fqu.a().a(fqv.c, $$6x ? $$4 : $$1).a(fqv.b, fqv.a.b);
            case c:
               return fqu.a().a(fqv.c, $$6x ? $$5 : $$2).a(fqv.b, fqv.a.b);
            case d:
               return fqu.a().a(fqv.c, $$6x ? $$6 : $$3).a(fqv.b, fqv.a.b);
            case e:
               return fqu.a().a(fqv.c, $$6x ? $$5 : $$2);
            case f:
               return fqu.a().a(fqv.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fqr.a($$0).a($$7));
   }

   private void a(dma $$0, cyu $$1) {
      alg $$2 = frd.aa.a($$0, fre.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(dma $$0, alg $$1) {
      alg $$2 = frd.aa.a($$0, fre.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private alg g(dma $$0, dma $$1) {
      return frd.aa.a($$0, fre.x($$1), this.d);
   }

   public void a(dma $$0, dma $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(dma $$0) {
      this.a($$0, $$0);
   }

   private void h(dma $$0, dma $$1) {
      this.a($$0);
      alg $$2 = frg.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(dma $$0) {
      alg $$1 = frg.p.create($$0, this.d);
      alg $$2 = frg.q.create($$0, this.d);
      alg $$3 = frg.r.create($$0, this.d);
      alg $$4 = frg.s.create($$0, this.d);
      this.c($$0);
      this.a($$0, eap.V, $$1, $$2, $$3, $$4);
   }

   private void t(dma $$0) {
      alg $$1 = frg.l.create($$0, this.d);
      alg $$2 = frg.m.create($$0, this.d);
      alg $$3 = frg.n.create($$0, this.d);
      alg $$4 = frg.o.create($$0, this.d);
      this.b($$0.h());
      this.a($$0, eap.U, $$1, $$2, $$3, $$4);
   }

   private void a(dma $$0, eaz $$1, alg $$2, alg $$3, alg $$4, alg $$5) {
      this.b
         .accept(
            fqq.a($$0)
               .a(fqp.a().a($$1, 1, 2, 3, 4).a(eap.T, ja.c), fqu.a().a(fqv.c, $$2))
               .a(fqp.a().a($$1, 1, 2, 3, 4).a(eap.T, ja.f), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b))
               .a(fqp.a().a($$1, 1, 2, 3, 4).a(eap.T, ja.d), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c))
               .a(fqp.a().a($$1, 1, 2, 3, 4).a(eap.T, ja.e), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d))
               .a(fqp.a().a($$1, 2, 3, 4).a(eap.T, ja.c), fqu.a().a(fqv.c, $$3))
               .a(fqp.a().a($$1, 2, 3, 4).a(eap.T, ja.f), fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
               .a(fqp.a().a($$1, 2, 3, 4).a(eap.T, ja.d), fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c))
               .a(fqp.a().a($$1, 2, 3, 4).a(eap.T, ja.e), fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d))
               .a(fqp.a().a($$1, 3, 4).a(eap.T, ja.c), fqu.a().a(fqv.c, $$4))
               .a(fqp.a().a($$1, 3, 4).a(eap.T, ja.f), fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.b))
               .a(fqp.a().a($$1, 3, 4).a(eap.T, ja.d), fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.c))
               .a(fqp.a().a($$1, 3, 4).a(eap.T, ja.e), fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.d))
               .a(fqp.a().a($$1, 4).a(eap.T, ja.c), fqu.a().a(fqv.c, $$5))
               .a(fqp.a().a($$1, 4).a(eap.T, ja.f), fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.b))
               .a(fqp.a().a($$1, 4).a(eap.T, ja.d), fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.c))
               .a(fqp.a().a($$1, 4).a(eap.T, ja.e), fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.d))
         );
   }

   private void a(frg.a $$0, dma... $$1) {
      for (dma $$2 : $$1) {
         alg $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(frg.a $$0, dma... $$1) {
      for (dma $$2 : $$1) {
         alg $$3 = $$0.create($$2, this.d);
         this.b.accept(fqr.a($$2, fqu.a().a(fqv.c, $$3)).a(c()));
      }
   }

   private void i(dma $$0, dma $$1) {
      this.a($$0);
      fre $$2 = fre.b($$0, $$1);
      alg $$3 = frd.aP.a($$1, $$2, this.d);
      alg $$4 = frd.aQ.a($$1, $$2, this.d);
      alg $$5 = frd.aR.a($$1, $$2, this.d);
      alg $$6 = frd.aN.a($$1, $$2, this.d);
      alg $$7 = frd.aO.a($$1, $$2, this.d);
      cyu $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fqq.a($$1)
               .a(fqu.a().a(fqv.c, $$3))
               .a(fqp.a().a(eap.N, true), fqu.a().a(fqv.c, $$4))
               .a(fqp.a().a(eap.O, true), fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.b))
               .a(fqp.a().a(eap.P, true), fqu.a().a(fqv.c, $$5))
               .a(fqp.a().a(eap.Q, true), fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.b))
               .a(fqp.a().a(eap.N, false), fqu.a().a(fqv.c, $$6))
               .a(fqp.a().a(eap.O, false), fqu.a().a(fqv.c, $$7))
               .a(fqp.a().a(eap.P, false), fqu.a().a(fqv.c, $$7).a(fqv.b, fqv.a.b))
               .a(fqp.a().a(eap.Q, false), fqu.a().a(fqv.c, $$6).a(fqv.b, fqv.a.d))
         );
   }

   private void u(dma $$0) {
      fre $$1 = fre.C($$0);
      alg $$2 = frd.aS.a($$0, $$1, this.d);
      alg $$3 = this.a($$0, "_conditional", frd.aS, $$1x -> $$1.c(frf.i, $$1x));
      this.b.accept(fqr.a($$0).a(a(eap.f, $$3, $$2)).a(e()));
   }

   private void v(dma $$0) {
      alg $$1 = frg.v.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fqu> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fqu.a().a(fqv.c, frb.a(dmc.nC, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fqq.a(dmc.nC)
               .a(fqp.a().a(eap.at, 0), this.a(0))
               .a(fqp.a().a(eap.at, 1), this.a(1))
               .a(fqp.a().a(eap.bn, eal.b), fqu.a().a(fqv.c, frb.a(dmc.nC, "_small_leaves")))
               .a(fqp.a().a(eap.bn, eal.c), fqu.a().a(fqv.c, frb.a(dmc.nC, "_large_leaves")))
         );
   }

   private fqs o() {
      return fqs.a(eap.R)
         .a(ja.a, fqu.a().a(fqv.a, fqv.a.c))
         .a(ja.b, fqu.a())
         .a(ja.c, fqu.a().a(fqv.a, fqv.a.b))
         .a(ja.d, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.c))
         .a(ja.e, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.d))
         .a(ja.f, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b));
   }

   private void p() {
      alg $$0 = fre.a(dmc.ox, "_top_open");
      this.b
         .accept(
            fqr.a(dmc.ox)
               .a(this.o())
               .a(
                  fqs.a(eap.y)
                     .a(false, fqu.a().a(fqv.c, frg.f.create(dmc.ox, this.d)))
                     .a(true, fqu.a().a(fqv.c, frg.f.get(dmc.ox).a($$1 -> $$1.a(frf.f, $$0)).a(dmc.ox, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fqs a(ebc<T> $$0, T $$1, alg $$2, alg $$3) {
      fqu $$4 = fqu.a().a(fqv.c, $$2);
      fqu $$5 = fqu.a().a(fqv.c, $$3);
      return fqs.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dma $$0, Function<dma, fre> $$1) {
      fre $$2 = $$1.apply($$0).b(frf.i, frf.c);
      fre $$3 = $$2.c(frf.g, fre.a($$0, "_front_honey"));
      alg $$4 = frd.q.a($$0, "_empty", $$2, this.d);
      alg $$5 = frd.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.h(), fqz.a(dlu.c, fqz.a($$4), Map.of(5, fqz.a($$5))));
      this.b.accept(fqr.a($$0).a(b()).a(a(dlu.c, 5, $$5, $$4)));
   }

   private void a(dma $$0, ebc<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alg> $$3 = new Int2ObjectOpenHashMap();
         fqs $$4 = fqs.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            alg $$5 = (alg)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, frd.bc, fre::g));
            return fqu.a().a(fqv.c, $$5);
         });
         this.b($$0.h());
         this.b.accept(fqr.a($$0).a($$4));
      }
   }

   private void q() {
      alg $$0 = frb.a(dmc.oG, "_floor");
      alg $$1 = frb.a(dmc.oG, "_ceiling");
      alg $$2 = frb.a(dmc.oG, "_wall");
      alg $$3 = frb.a(dmc.oG, "_between_walls");
      this.b(czc.xy);
      this.b
         .accept(
            fqr.a(dmc.oG)
               .a(
                  fqs.a(eap.T, eap.Y)
                     .a(ja.c, ean.a, fqu.a().a(fqv.c, $$0))
                     .a(ja.d, ean.a, fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c))
                     .a(ja.f, ean.a, fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b))
                     .a(ja.e, ean.a, fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d))
                     .a(ja.c, ean.b, fqu.a().a(fqv.c, $$1))
                     .a(ja.d, ean.b, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.c))
                     .a(ja.f, ean.b, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.b))
                     .a(ja.e, ean.b, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.d))
                     .a(ja.c, ean.c, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d))
                     .a(ja.d, ean.c, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b))
                     .a(ja.f, ean.c, fqu.a().a(fqv.c, $$2))
                     .a(ja.e, ean.c, fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c))
                     .a(ja.d, ean.d, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
                     .a(ja.c, ean.d, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d))
                     .a(ja.f, ean.d, fqu.a().a(fqv.c, $$3))
                     .a(ja.e, ean.d, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fqr.a(dmc.oC, fqu.a().a(fqv.c, frb.a(dmc.oC)))
               .a(
                  fqs.a(eap.X, eap.T)
                     .a(eak.a, ja.c, fqu.a())
                     .a(eak.a, ja.f, fqu.a().a(fqv.b, fqv.a.b))
                     .a(eak.a, ja.d, fqu.a().a(fqv.b, fqv.a.c))
                     .a(eak.a, ja.e, fqu.a().a(fqv.b, fqv.a.d))
                     .a(eak.b, ja.c, fqu.a().a(fqv.a, fqv.a.b))
                     .a(eak.b, ja.f, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b))
                     .a(eak.b, ja.d, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.c))
                     .a(eak.b, ja.e, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.d))
                     .a(eak.c, ja.d, fqu.a().a(fqv.a, fqv.a.c))
                     .a(eak.c, ja.e, fqu.a().a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b))
                     .a(eak.c, ja.c, fqu.a().a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c))
                     .a(eak.c, ja.f, fqu.a().a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d))
               )
         );
   }

   private void d(dma $$0, frg.a $$1) {
      alg $$2 = $$1.create($$0, this.d);
      alg $$3 = fre.a($$0, "_front_on");
      alg $$4 = $$1.get($$0).a($$1x -> $$1x.a(frf.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fqr.a($$0).a(a(eap.u, $$4, $$2)).a(b()));
   }

   private void a(dma... $$0) {
      alg $$1 = frb.a("campfire_off");

      for (dma $$2 : $$0) {
         alg $$3 = frd.bj.a($$2, fre.H($$2), this.d);
         this.b($$2.h());
         this.b.accept(fqr.a($$2).a(a(eap.u, $$3, $$1)).a(c()));
      }
   }

   private void w(dma $$0) {
      alg $$1 = frd.bE.a($$0, fre.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void x(dma $$0) {
      alg $$1;
      if ($$0 == dmc.tQ) {
         $$1 = frd.bG.a($$0, fre.p($$0), this.d);
      } else {
         $$1 = frd.bF.a($$0, fre.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fre $$0 = fre.a(fre.J(dmc.ct), fre.J(dmc.n));
      alg $$1 = frd.j.a(dmc.ct, $$0, this.d);
      this.b.accept(c(dmc.ct, $$1));
   }

   private void t() {
      this.b(czc.mi);
      this.b
         .accept(
            fqq.a(dmc.cF)
               .a(
                  fqp.b(
                     fqp.a().a(eap.ae, ebe.c).a(eap.ad, ebe.c).a(eap.af, ebe.c).a(eap.ag, ebe.c),
                     fqp.a().a(eap.ae, ebe.b, ebe.a).a(eap.ad, ebe.b, ebe.a),
                     fqp.a().a(eap.ad, ebe.b, ebe.a).a(eap.af, ebe.b, ebe.a),
                     fqp.a().a(eap.af, ebe.b, ebe.a).a(eap.ag, ebe.b, ebe.a),
                     fqp.a().a(eap.ag, ebe.b, ebe.a).a(eap.ae, ebe.b, ebe.a)
                  ),
                  fqu.a().a(fqv.c, frb.a("redstone_dust_dot"))
               )
               .a(fqp.a().a(eap.ae, ebe.b, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_side0")))
               .a(fqp.a().a(eap.af, ebe.b, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_side_alt0")))
               .a(fqp.a().a(eap.ad, ebe.b, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_side_alt1")).a(fqv.b, fqv.a.d))
               .a(fqp.a().a(eap.ag, ebe.b, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_side1")).a(fqv.b, fqv.a.d))
               .a(fqp.a().a(eap.ae, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_up")))
               .a(fqp.a().a(eap.ad, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_up")).a(fqv.b, fqv.a.b))
               .a(fqp.a().a(eap.af, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_up")).a(fqv.b, fqv.a.c))
               .a(fqp.a().a(eap.ag, ebe.a), fqu.a().a(fqv.c, frb.a("redstone_dust_up")).a(fqv.b, fqv.a.d))
         );
   }

   private void u() {
      this.b(czc.mm);
      this.b
         .accept(
            fqr.a(dmc.hw)
               .a(c())
               .a(
                  fqs.a(eap.bg, eap.A)
                     .a(eas.a, false, fqu.a().a(fqv.c, frb.a(dmc.hw)))
                     .a(eas.a, true, fqu.a().a(fqv.c, frb.a(dmc.hw, "_on")))
                     .a(eas.b, false, fqu.a().a(fqv.c, frb.a(dmc.hw, "_subtract")))
                     .a(eas.b, true, fqu.a().a(fqv.c, frb.a(dmc.hw, "_on_subtract")))
               )
         );
   }

   private void v() {
      fre $$0 = fre.a(dmc.kr);
      fre $$1 = fre.a(fre.a(dmc.ke, "_side"), $$0.a(frf.f));
      alg $$2 = frd.ab.a(dmc.ke, $$1, this.d);
      alg $$3 = frd.ac.a(dmc.ke, $$1, this.d);
      alg $$4 = frd.j.b(dmc.ke, "_double", $$1, this.d);
      this.b.accept(e(dmc.ke, $$2, $$3, $$4));
      this.b.accept(c(dmc.kr, frd.c.a(dmc.kr, $$0, this.d)));
   }

   private void w() {
      this.b(czc.tt);
      this.b
         .accept(
            fqq.a(dmc.fO)
               .a(fqu.a().a(fqv.c, fre.J(dmc.fO)))
               .a(fqp.a().a(eap.n, true), fqu.a().a(fqv.c, fre.a(dmc.fO, "_bottle0")))
               .a(fqp.a().a(eap.o, true), fqu.a().a(fqv.c, fre.a(dmc.fO, "_bottle1")))
               .a(fqp.a().a(eap.p, true), fqu.a().a(fqv.c, fre.a(dmc.fO, "_bottle2")))
               .a(fqp.a().a(eap.n, false), fqu.a().a(fqv.c, fre.a(dmc.fO, "_empty0")))
               .a(fqp.a().a(eap.o, false), fqu.a().a(fqv.c, fre.a(dmc.fO, "_empty1")))
               .a(fqp.a().a(eap.p, false), fqu.a().a(fqv.c, fre.a(dmc.fO, "_empty2")))
         );
   }

   private void y(dma $$0) {
      alg $$1 = frd.bA.a($$0, fre.b($$0), this.d);
      alg $$2 = frb.a("mushroom_block_inside");
      this.b
         .accept(
            fqq.a($$0)
               .a(fqp.a().a(eap.N, true), fqu.a().a(fqv.c, $$1))
               .a(fqp.a().a(eap.O, true), fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(fqp.a().a(eap.P, true), fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(fqp.a().a(eap.Q, true), fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(fqp.a().a(eap.L, true), fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.d).a(fqv.d, true))
               .a(fqp.a().a(eap.M, true), fqu.a().a(fqv.c, $$1).a(fqv.a, fqv.a.b).a(fqv.d, true))
               .a(fqp.a().a(eap.N, false), fqu.a().a(fqv.c, $$2))
               .a(fqp.a().a(eap.O, false), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b).a(fqv.d, false))
               .a(fqp.a().a(eap.P, false), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c).a(fqv.d, false))
               .a(fqp.a().a(eap.Q, false), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d).a(fqv.d, false))
               .a(fqp.a().a(eap.L, false), fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.d).a(fqv.d, false))
               .a(fqp.a().a(eap.M, false), fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.b).a(fqv.d, false))
         );
      this.a($$0, frg.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(czc.sE);
      this.b
         .accept(
            fqr.a(dmc.eu)
               .a(
                  fqs.a(eap.aB)
                     .a(0, fqu.a().a(fqv.c, frb.a(dmc.eu)))
                     .a(1, fqu.a().a(fqv.c, frb.a(dmc.eu, "_slice1")))
                     .a(2, fqu.a().a(fqv.c, frb.a(dmc.eu, "_slice2")))
                     .a(3, fqu.a().a(fqv.c, frb.a(dmc.eu, "_slice3")))
                     .a(4, fqu.a().a(fqv.c, frb.a(dmc.eu, "_slice4")))
                     .a(5, fqu.a().a(fqv.c, frb.a(dmc.eu, "_slice5")))
                     .a(6, fqu.a().a(fqv.c, frb.a(dmc.eu, "_slice6")))
               )
         );
   }

   private void y() {
      fre $$0 = new fre()
         .a(frf.c, fre.a(dmc.oA, "_side3"))
         .a(frf.o, fre.J(dmc.t))
         .a(frf.n, fre.a(dmc.oA, "_top"))
         .a(frf.j, fre.a(dmc.oA, "_side3"))
         .a(frf.l, fre.a(dmc.oA, "_side3"))
         .a(frf.k, fre.a(dmc.oA, "_side1"))
         .a(frf.m, fre.a(dmc.oA, "_side2"));
      this.b.accept(c(dmc.oA, frd.a.a(dmc.oA, $$0, this.d)));
   }

   private void z() {
      fre $$0 = new fre()
         .a(frf.c, fre.a(dmc.oE, "_front"))
         .a(frf.o, fre.a(dmc.oE, "_bottom"))
         .a(frf.n, fre.a(dmc.oE, "_top"))
         .a(frf.j, fre.a(dmc.oE, "_front"))
         .a(frf.k, fre.a(dmc.oE, "_front"))
         .a(frf.l, fre.a(dmc.oE, "_side"))
         .a(frf.m, fre.a(dmc.oE, "_side"));
      this.b.accept(c(dmc.oE, frd.a.a(dmc.oE, $$0, this.d)));
   }

   private void a(dma $$0, dma $$1, BiFunction<dma, dma, fre> $$2) {
      fre $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, frd.a.a($$0, $$3, this.d)));
   }

   public void b(dma $$0) {
      fre $$1 = new fre()
         .a(frf.c, fre.a($$0, "_particle"))
         .a(frf.o, fre.a($$0, "_down"))
         .a(frf.n, fre.a($$0, "_up"))
         .a(frf.j, fre.a($$0, "_north"))
         .a(frf.k, fre.a($$0, "_south"))
         .a(frf.l, fre.a($$0, "_east"))
         .a(frf.m, fre.a($$0, "_west"));
      this.b.accept(c($$0, frd.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fre $$0 = fre.n(dmc.fo);
      this.b.accept(c(dmc.fo, frb.a(dmc.fo)));
      this.a(dmc.es, $$0);
      this.a(dmc.et, $$0);
   }

   private void a(dma $$0, fre $$1) {
      alg $$2 = frd.p.a($$0, $$1.c(frf.g, fre.J($$0)), this.d);
      this.b.accept(fqr.a($$0, fqu.a().a(fqv.c, $$2)).a(b()));
   }

   private void B() {
      this.b(czc.tu);
      this.n(dmc.fP);
      this.b.accept(c(dmc.fR, frd.bD.a(dmc.fR, fre.j(fre.a(dmc.K, "_still")), this.d)));
      this.b
         .accept(
            fqr.a(dmc.fQ)
               .a(
                  fqs.a(dqn.f)
                     .a(1, fqu.a().a(fqv.c, frd.bB.a(dmc.fQ, "_level1", fre.j(fre.a(dmc.J, "_still")), this.d)))
                     .a(2, fqu.a().a(fqv.c, frd.bC.a(dmc.fQ, "_level2", fre.j(fre.a(dmc.J, "_still")), this.d)))
                     .a(3, fqu.a().a(fqv.c, frd.bD.a(dmc.fQ, "_full", fre.j(fre.a(dmc.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fqr.a(dmc.fS)
               .a(
                  fqs.a(dqn.f)
                     .a(1, fqu.a().a(fqv.c, frd.bB.a(dmc.fS, "_level1", fre.j(fre.J(dmc.ru)), this.d)))
                     .a(2, fqu.a().a(fqv.c, frd.bC.a(dmc.fS, "_level2", fre.j(fre.J(dmc.ru)), this.d)))
                     .a(3, fqu.a().a(fqv.c, frd.bD.a(dmc.fS, "_full", fre.j(fre.J(dmc.ru)), this.d)))
               )
         );
   }

   private void C() {
      fre $$0 = fre.b(dmc.kY);
      alg $$1 = frd.aL.a(dmc.kY, $$0, this.d);
      alg $$2 = this.a(dmc.kY, "_dead", frd.aL, $$1x -> $$0.c(frf.b, $$1x));
      this.b.accept(fqr.a(dmc.kY).a(a(eap.ax, 5, $$2, $$1)));
   }

   private void D() {
      alg $$0 = frb.a(dmc.tX);
      alg $$1 = frb.a(dmc.tX, "_triggered");
      alg $$2 = frb.a(dmc.tX, "_crafting");
      alg $$3 = frb.a(dmc.tX, "_crafting_triggered");
      this.b
         .accept(
            fqr.a(dmc.tX)
               .a(fqs.a(eap.W).a($$0x -> this.a($$0x, fqu.a())))
               .a(
                  fqs.a(eap.G, dnt.b)
                     .a(false, false, fqu.a().a(fqv.c, $$0))
                     .a(true, true, fqu.a().a(fqv.c, $$3))
                     .a(true, false, fqu.a().a(fqv.c, $$1))
                     .a(false, true, fqu.a().a(fqv.c, $$2))
               )
         );
   }

   private void z(dma $$0) {
      fre $$1 = new fre().a(frf.f, fre.a(dmc.cM, "_top")).a(frf.i, fre.a(dmc.cM, "_side")).a(frf.g, fre.a($$0, "_front"));
      fre $$2 = new fre().a(frf.i, fre.a(dmc.cM, "_top")).a(frf.g, fre.a($$0, "_front_vertical"));
      alg $$3 = frd.p.a($$0, $$1, this.d);
      alg $$4 = frd.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fqr.a($$0)
               .a(
                  fqs.a(eap.R)
                     .a(ja.a, fqu.a().a(fqv.c, $$4).a(fqv.a, fqv.a.c))
                     .a(ja.b, fqu.a().a(fqv.c, $$4))
                     .a(ja.c, fqu.a().a(fqv.c, $$3))
                     .a(ja.f, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
                     .a(ja.d, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c))
                     .a(ja.e, fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d))
               )
         );
   }

   private void E() {
      alg $$0 = frb.a(dmc.fU);
      alg $$1 = frb.a(dmc.fU, "_filled");
      this.b.accept(fqr.a(dmc.fU).a(fqs.a(eap.k).a(false, fqu.a().a(fqv.c, $$0)).a(true, fqu.a().a(fqv.c, $$1))).a(c()));
   }

   private void F() {
      alg $$0 = frb.a(dmc.kX, "_side");
      alg $$1 = frb.a(dmc.kX, "_noside");
      alg $$2 = frb.a(dmc.kX, "_noside1");
      alg $$3 = frb.a(dmc.kX, "_noside2");
      alg $$4 = frb.a(dmc.kX, "_noside3");
      this.b
         .accept(
            fqq.a(dmc.kX)
               .a(fqp.a().a(eap.N, true), fqu.a().a(fqv.c, $$0))
               .a(fqp.a().a(eap.O, true), fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b).a(fqv.d, true))
               .a(fqp.a().a(eap.P, true), fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c).a(fqv.d, true))
               .a(fqp.a().a(eap.Q, true), fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d).a(fqv.d, true))
               .a(fqp.a().a(eap.L, true), fqu.a().a(fqv.c, $$0).a(fqv.a, fqv.a.d).a(fqv.d, true))
               .a(fqp.a().a(eap.M, true), fqu.a().a(fqv.c, $$0).a(fqv.a, fqv.a.b).a(fqv.d, true))
               .a(fqp.a().a(eap.N, false), fqu.a().a(fqv.c, $$1).a(fqv.e, 2), fqu.a().a(fqv.c, $$2), fqu.a().a(fqv.c, $$3), fqu.a().a(fqv.c, $$4))
               .a(
                  fqp.a().a(eap.O, false),
                  fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.b).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$1).a(fqv.e, 2).a(fqv.b, fqv.a.b).a(fqv.d, true)
               )
               .a(
                  fqp.a().a(eap.P, false),
                  fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.c).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.c).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$1).a(fqv.e, 2).a(fqv.b, fqv.a.c).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.c).a(fqv.d, true)
               )
               .a(
                  fqp.a().a(eap.Q, false),
                  fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.d).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$1).a(fqv.e, 2).a(fqv.b, fqv.a.d).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.d).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.d).a(fqv.d, true)
               )
               .a(
                  fqp.a().a(eap.L, false),
                  fqu.a().a(fqv.c, $$1).a(fqv.e, 2).a(fqv.a, fqv.a.d).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$4).a(fqv.a, fqv.a.d).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.d).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.d).a(fqv.d, true)
               )
               .a(
                  fqp.a().a(eap.M, false),
                  fqu.a().a(fqv.c, $$4).a(fqv.a, fqv.a.b).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$3).a(fqv.a, fqv.a.b).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$2).a(fqv.a, fqv.a.b).a(fqv.d, true),
                  fqu.a().a(fqv.c, $$1).a(fqv.e, 2).a(fqv.a, fqv.a.b).a(fqv.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fqq.a(dmc.pH)
               .a(fqu.a().a(fqv.c, fre.J(dmc.pH)))
               .a(fqp.a().a(eap.aO, 1), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents1")))
               .a(fqp.a().a(eap.aO, 2), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents2")))
               .a(fqp.a().a(eap.aO, 3), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents3")))
               .a(fqp.a().a(eap.aO, 4), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents4")))
               .a(fqp.a().a(eap.aO, 5), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents5")))
               .a(fqp.a().a(eap.aO, 6), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents6")))
               .a(fqp.a().a(eap.aO, 7), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents7")))
               .a(fqp.a().a(eap.aO, 8), fqu.a().a(fqv.c, fre.a(dmc.pH, "_contents_ready")))
         );
   }

   private void A(dma $$0) {
      alg $$1 = frd.c.a($$0, fre.a($$0), this.d);
      alg $$2 = this.a($$0, "_powered", frd.c, fre::b);
      alg $$3 = this.a($$0, "_lit", frd.c, fre::b);
      alg $$4 = this.a($$0, "_lit_powered", frd.c, fre::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fqo a(dma $$0, alg $$1, alg $$2, alg $$3, alg $$4) {
      return fqr.a($$0).a(fqs.a(eap.u, eap.A).a(($$4x, $$5) -> $$4x ? fqu.a().a(fqv.c, $$5 ? $$4 : $$2) : fqu.a().a(fqv.c, $$5 ? $$3 : $$1)));
   }

   private void j(dma $$0, dma $$1) {
      alg $$2 = frb.a($$0);
      alg $$3 = frb.a($$0, "_powered");
      alg $$4 = frb.a($$0, "_lit");
      alg $$5 = frb.a($$0, "_lit_powered");
      this.c.a($$0.h(), $$1.h());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dma $$0) {
      this.b.accept(fqr.a($$0, fqu.a().a(fqv.c, frd.ao.a($$0, fre.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.B(dmc.rd);
      this.B(dmc.rc);
      this.B(dmc.rb);
      this.B(dmc.ra);
   }

   private void I() {
      fqs.b<ja, eaw> $$0 = fqs.a(eap.bp, eap.bq);

      for (eaw $$1 : eaw.values()) {
         $$0.a(ja.b, $$1, this.a(ja.b, $$1));
      }

      for (eaw $$2 : eaw.values()) {
         $$0.a(ja.a, $$2, this.a(ja.a, $$2));
      }

      this.b.accept(fqr.a(dmc.sY).a($$0));
   }

   private fqu a(ja $$0, eaw $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fre $$3 = fre.c(fre.a(dmc.sY, $$2));
      return fqu.a().a(fqv.c, frd.an.a(dmc.sY, $$2, $$3, this.d));
   }

   private void C(dma $$0) {
      fre $$1 = new fre().a(frf.e, fre.J(dmc.ej)).a(frf.f, fre.J($$0)).a(frf.i, fre.a($$0, "_side"));
      this.b.accept(c($$0, frd.n.a($$0, $$1, this.d)));
   }

   private void J() {
      alg $$0 = fre.a(dmc.hx, "_side");
      fre $$1 = new fre().a(frf.f, fre.a(dmc.hx, "_top")).a(frf.i, $$0);
      fre $$2 = new fre().a(frf.f, fre.a(dmc.hx, "_inverted_top")).a(frf.i, $$0);
      this.b
         .accept(
            fqr.a(dmc.hx)
               .a(
                  fqs.a(eap.s)
                     .a(false, fqu.a().a(fqv.c, frd.aM.a(dmc.hx, $$1, this.d)))
                     .a(true, fqu.a().a(fqv.c, frd.aM.a(frb.a(dmc.hx, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void D(dma $$0) {
      this.b.accept(fqr.a($$0, fqu.a().a(fqv.c, frb.a($$0))).a(this.o()));
   }

   private void K() {
      dma $$0 = dmc.sX;
      alg $$1 = frb.a($$0, "_on");
      alg $$2 = frb.a($$0);
      this.b.accept(fqr.a($$0, fqu.a().a(fqv.c, frb.a($$0))).a(this.o()).a(a(eap.A, $$1, $$2)));
   }

   private void L() {
      fre $$0 = new fre().a(frf.C, fre.J(dmc.j)).a(frf.f, fre.J(dmc.cL));
      fre $$1 = new fre().a(frf.C, fre.J(dmc.j)).a(frf.f, fre.a(dmc.cL, "_moist"));
      alg $$2 = frd.bd.a(dmc.cL, $$0, this.d);
      alg $$3 = frd.bd.a(fre.a(dmc.cL, "_moist"), $$1, this.d);
      this.b.accept(fqr.a(dmc.cL).a(a(eap.aT, 7, $$3, $$2)));
   }

   private List<alg> E(dma $$0) {
      alg $$1 = frd.be.a(frb.a($$0, "_floor0"), fre.y($$0), this.d);
      alg $$2 = frd.be.a(frb.a($$0, "_floor1"), fre.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<alg> F(dma $$0) {
      alg $$1 = frd.bf.a(frb.a($$0, "_side0"), fre.y($$0), this.d);
      alg $$2 = frd.bf.a(frb.a($$0, "_side1"), fre.z($$0), this.d);
      alg $$3 = frd.bg.a(frb.a($$0, "_side_alt0"), fre.y($$0), this.d);
      alg $$4 = frd.bg.a(frb.a($$0, "_side_alt1"), fre.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<alg> G(dma $$0) {
      alg $$1 = frd.bh.a(frb.a($$0, "_up0"), fre.y($$0), this.d);
      alg $$2 = frd.bh.a(frb.a($$0, "_up1"), fre.z($$0), this.d);
      alg $$3 = frd.bi.a(frb.a($$0, "_up_alt0"), fre.y($$0), this.d);
      alg $$4 = frd.bi.a(frb.a($$0, "_up_alt1"), fre.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fqu> a(List<alg> $$0, UnaryOperator<fqu> $$1) {
      return $$0.stream().map($$0x -> fqu.a().a(fqv.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fqp $$0 = fqp.a().a(eap.N, false).a(eap.O, false).a(eap.P, false).a(eap.Q, false).a(eap.L, false);
      List<alg> $$1 = this.E(dmc.cz);
      List<alg> $$2 = this.F(dmc.cz);
      List<alg> $$3 = this.G(dmc.cz);
      this.b
         .accept(
            fqq.a(dmc.cz)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fqp.b(fqp.a().a(eap.N, true), $$0), a($$2, $$0x -> $$0x))
               .a(fqp.b(fqp.a().a(eap.O, true), $$0), a($$2, $$0x -> $$0x.a(fqv.b, fqv.a.b)))
               .a(fqp.b(fqp.a().a(eap.P, true), $$0), a($$2, $$0x -> $$0x.a(fqv.b, fqv.a.c)))
               .a(fqp.b(fqp.a().a(eap.Q, true), $$0), a($$2, $$0x -> $$0x.a(fqv.b, fqv.a.d)))
               .a(fqp.a().a(eap.L, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<alg> $$0 = this.E(dmc.cA);
      List<alg> $$1 = this.F(dmc.cA);
      this.b
         .accept(
            fqq.a(dmc.cA)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fqv.b, fqv.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fqv.b, fqv.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fqv.b, fqv.a.d)))
         );
   }

   private void H(dma $$0) {
      alg $$1 = frg.x.create($$0, this.d);
      alg $$2 = frg.y.create($$0, this.d);
      this.b($$0.h());
      this.b.accept(fqr.a($$0).a(a(eap.m, $$2, $$1)));
   }

   private void O() {
      fre $$0 = fre.a(fre.a(dmc.ah, "_side"), fre.a(dmc.ah, "_top"));
      alg $$1 = frd.j.a(dmc.ah, $$0, this.d);
      this.b.accept(d(dmc.ah, $$1));
   }

   private void P() {
      this.b(czc.af);
      dma $$0 = dmc.H;
      fqs.b<Boolean, Integer> $$1 = fqs.a(dra.d, dra.b);
      alg $$2 = frb.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         alg $$4 = frb.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fqu.a().a(fqv.c, $$4));
         $$1.a(false, $$3, fqu.a().a(fqv.c, $$2));
      }

      this.b.accept(fqr.a(dmc.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fqr.a(dmc.ll)
               .a(
                  fqs.a(eap.av)
                     .a(0, fqu.a().a(fqv.c, this.a(dmc.ll, "_0", frd.c, fre::b)))
                     .a(1, fqu.a().a(fqv.c, this.a(dmc.ll, "_1", frd.c, fre::b)))
                     .a(2, fqu.a().a(fqv.c, this.a(dmc.ll, "_2", frd.c, fre::b)))
                     .a(3, fqu.a().a(fqv.c, this.a(dmc.ll, "_3", frd.c, fre::b)))
               )
         );
   }

   private void R() {
      alg $$0 = fre.J(dmc.j);
      fre $$1 = new fre().a(frf.e, $$0).b(frf.e, frf.c).a(frf.f, fre.a(dmc.i, "_top")).a(frf.i, fre.a(dmc.i, "_snow"));
      fqu $$2 = fqu.a().a(fqv.c, frd.n.a(dmc.i, "_snow", $$1, this.d));
      this.a(dmc.i, frb.a(dmc.i), $$2);
      this.a(dmc.i, frb.a(dmc.i), new fqb());
      alg $$3 = frg.f.get(dmc.fB).a($$1x -> $$1x.a(frf.e, $$0)).a(dmc.fB, this.d);
      this.a(dmc.fB, $$3, $$2);
      alg $$4 = frg.f.get(dmc.l).a($$1x -> $$1x.a(frf.e, $$0)).a(dmc.l, this.d);
      this.a(dmc.l, $$4, $$2);
   }

   private void a(dma $$0, alg $$1, fqu $$2) {
      List<fqu> $$3 = Arrays.asList(a($$1));
      this.b.accept(fqr.a($$0).a(fqs.a(eap.E).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(czc.sk);
      this.b
         .accept(
            fqr.a(dmc.fY)
               .a(
                  fqs.a(eap.au)
                     .a(0, fqu.a().a(fqv.c, frb.a(dmc.fY, "_stage0")))
                     .a(1, fqu.a().a(fqv.c, frb.a(dmc.fY, "_stage1")))
                     .a(2, fqu.a().a(fqv.c, frb.a(dmc.fY, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(dmc.lh, frb.a(dmc.lh)));
   }

   private void k(dma $$0, dma $$1) {
      fre $$2 = fre.b($$1);
      alg $$3 = frd.Y.a($$0, $$2, this.d);
      alg $$4 = frd.Z.a($$0, $$2, this.d);
      this.b.accept(fqr.a($$0).a(a(eap.aW, 1, $$4, $$3)));
   }

   private void U() {
      alg $$0 = frb.a(dmc.hA);
      alg $$1 = frb.a(dmc.hA, "_side");
      this.b(czc.ms);
      this.b
         .accept(
            fqr.a(dmc.hA)
               .a(
                  fqs.a(eap.S)
                     .a(ja.a, fqu.a().a(fqv.c, $$0))
                     .a(ja.c, fqu.a().a(fqv.c, $$1))
                     .a(ja.f, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.b))
                     .a(ja.d, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.c))
                     .a(ja.e, fqu.a().a(fqv.c, $$1).a(fqv.b, fqv.a.d))
               )
         );
   }

   private void l(dma $$0, dma $$1) {
      alg $$2 = frb.a($$0);
      this.b.accept(fqr.a($$1, fqu.a().a(fqv.c, $$2)));
      this.c.a($$0.h(), $$1.h());
   }

   private void V() {
      alg $$0 = frb.a(dmc.fl, "_post_ends");
      alg $$1 = frb.a(dmc.fl, "_post");
      alg $$2 = frb.a(dmc.fl, "_cap");
      alg $$3 = frb.a(dmc.fl, "_cap_alt");
      alg $$4 = frb.a(dmc.fl, "_side");
      alg $$5 = frb.a(dmc.fl, "_side_alt");
      this.b
         .accept(
            fqq.a(dmc.fl)
               .a(fqu.a().a(fqv.c, $$0))
               .a(fqp.a().a(eap.N, false).a(eap.O, false).a(eap.P, false).a(eap.Q, false), fqu.a().a(fqv.c, $$1))
               .a(fqp.a().a(eap.N, true).a(eap.O, false).a(eap.P, false).a(eap.Q, false), fqu.a().a(fqv.c, $$2))
               .a(fqp.a().a(eap.N, false).a(eap.O, true).a(eap.P, false).a(eap.Q, false), fqu.a().a(fqv.c, $$2).a(fqv.b, fqv.a.b))
               .a(fqp.a().a(eap.N, false).a(eap.O, false).a(eap.P, true).a(eap.Q, false), fqu.a().a(fqv.c, $$3))
               .a(fqp.a().a(eap.N, false).a(eap.O, false).a(eap.P, false).a(eap.Q, true), fqu.a().a(fqv.c, $$3).a(fqv.b, fqv.a.b))
               .a(fqp.a().a(eap.N, true), fqu.a().a(fqv.c, $$4))
               .a(fqp.a().a(eap.O, true), fqu.a().a(fqv.c, $$4).a(fqv.b, fqv.a.b))
               .a(fqp.a().a(eap.P, true), fqu.a().a(fqv.c, $$5))
               .a(fqp.a().a(eap.Q, true), fqu.a().a(fqv.c, $$5).a(fqv.b, fqv.a.b))
         );
      this.c(dmc.fl);
   }

   private void I(dma $$0) {
      this.b.accept(fqr.a($$0, fqu.a().a(fqv.c, frb.a($$0))).a(b()));
   }

   private void W() {
      alg $$0 = frb.a(dmc.dJ);
      alg $$1 = frb.a(dmc.dJ, "_on");
      this.c(dmc.dJ);
      this.b
         .accept(
            fqr.a(dmc.dJ)
               .a(a(eap.A, $$0, $$1))
               .a(
                  fqs.a(eap.X, eap.T)
                     .a(eak.c, ja.c, fqu.a().a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.c))
                     .a(eak.c, ja.f, fqu.a().a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.d))
                     .a(eak.c, ja.d, fqu.a().a(fqv.a, fqv.a.c))
                     .a(eak.c, ja.e, fqu.a().a(fqv.a, fqv.a.c).a(fqv.b, fqv.a.b))
                     .a(eak.a, ja.c, fqu.a())
                     .a(eak.a, ja.f, fqu.a().a(fqv.b, fqv.a.b))
                     .a(eak.a, ja.d, fqu.a().a(fqv.b, fqv.a.c))
                     .a(eak.a, ja.e, fqu.a().a(fqv.b, fqv.a.d))
                     .a(eak.b, ja.c, fqu.a().a(fqv.a, fqv.a.b))
                     .a(eak.b, ja.f, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b))
                     .a(eak.b, ja.d, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.c))
                     .a(eak.b, ja.e, fqu.a().a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.d))
               )
         );
   }

   private void X() {
      alg $$0 = this.a(czc.gB, dmc.fC);
      this.a(dmc.fC, $$0, fqz.a(-9321636));
      this.b.accept(b(dmc.fC, frb.a(dmc.fC)));
   }

   private void Y() {
      this.c(dmc.tU);
      this.b.accept(c(dmc.tU, frb.a(dmc.tU)));
   }

   private void Z() {
      this.b.accept(fqr.a(dmc.er).a(fqs.a(eap.J).a(ja.a.a, fqu.a().a(fqv.c, frb.a(dmc.er, "_ns"))).a(ja.a.c, fqu.a().a(fqv.c, frb.a(dmc.er, "_ew")))));
   }

   private void aa() {
      alg $$0 = frg.a.create(dmc.ej, this.d);
      this.b
         .accept(
            fqr.a(
               dmc.ej,
               fqu.a().a(fqv.c, $$0),
               fqu.a().a(fqv.c, $$0).a(fqv.a, fqv.a.b),
               fqu.a().a(fqv.c, $$0).a(fqv.a, fqv.a.c),
               fqu.a().a(fqv.c, $$0).a(fqv.a, fqv.a.d),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b).a(fqv.a, fqv.a.b),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b).a(fqv.a, fqv.a.c),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.b).a(fqv.a, fqv.a.d),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c).a(fqv.a, fqv.a.b),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c).a(fqv.a, fqv.a.c),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.c).a(fqv.a, fqv.a.d),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d).a(fqv.a, fqv.a.b),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d).a(fqv.a, fqv.a.c),
               fqu.a().a(fqv.c, $$0).a(fqv.b, fqv.a.d).a(fqv.a, fqv.a.d)
            )
         );
   }

   private void ab() {
      alg $$0 = frb.a(dmc.lr);
      alg $$1 = frb.a(dmc.lr, "_on");
      this.b.accept(fqr.a(dmc.lr).a(a(eap.A, $$1, $$0)).a(e()));
   }

   private void ac() {
      fre $$0 = new fre().a(frf.e, fre.a(dmc.bG, "_bottom")).a(frf.i, fre.a(dmc.bG, "_side"));
      alg $$1 = fre.a(dmc.bG, "_top_sticky");
      alg $$2 = fre.a(dmc.bG, "_top");
      fre $$3 = $$0.c(frf.F, $$1);
      fre $$4 = $$0.c(frf.F, $$2);
      alg $$5 = frb.a(dmc.bG, "_base");
      this.a(dmc.bG, $$5, $$4);
      this.a(dmc.by, $$5, $$3);
      alg $$6 = frd.n.a(dmc.bG, "_inventory", $$0.c(frf.f, $$2), this.d);
      alg $$7 = frd.n.a(dmc.by, "_inventory", $$0.c(frf.f, $$1), this.d);
      this.a(dmc.bG, $$6);
      this.a(dmc.by, $$7);
   }

   private void a(dma $$0, alg $$1, fre $$2) {
      alg $$3 = frd.bs.a($$0, $$2, this.d);
      this.b.accept(fqr.a($$0).a(a(eap.j, $$1, $$3)).a(e()));
   }

   private void ad() {
      fre $$0 = new fre().a(frf.G, fre.a(dmc.bG, "_top")).a(frf.i, fre.a(dmc.bG, "_side"));
      fre $$1 = $$0.c(frf.F, fre.a(dmc.bG, "_top_sticky"));
      fre $$2 = $$0.c(frf.F, fre.a(dmc.bG, "_top"));
      this.b
         .accept(
            fqr.a(dmc.bH)
               .a(
                  fqs.a(eap.B, eap.bj)
                     .a(false, ebb.a, fqu.a().a(fqv.c, frd.bt.a(dmc.bG, "_head", $$2, this.d)))
                     .a(false, ebb.b, fqu.a().a(fqv.c, frd.bt.a(dmc.bG, "_head_sticky", $$1, this.d)))
                     .a(true, ebb.a, fqu.a().a(fqv.c, frd.bu.a(dmc.bG, "_head_short", $$2, this.d)))
                     .a(true, ebb.b, fqu.a().a(fqv.c, frd.bu.a(dmc.bG, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      dma $$0 = dmc.tY;
      fre $$1 = fre.a($$0, "_side_inactive", "_top_inactive");
      fre $$2 = fre.a($$0, "_side_active", "_top_active");
      fre $$3 = fre.a($$0, "_side_active", "_top_ejecting_reward");
      fre $$4 = fre.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fre $$5 = fre.a($$0, "_side_active_ominous", "_top_active_ominous");
      fre $$6 = fre.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alg $$7 = frd.o.a($$0, $$1, this.d);
      alg $$8 = frd.o.a($$0, "_active", $$2, this.d);
      alg $$9 = frd.o.a($$0, "_ejecting_reward", $$3, this.d);
      alg $$10 = frd.o.a($$0, "_inactive_ominous", $$4, this.d);
      alg $$11 = frd.o.a($$0, "_active_ominous", $$5, this.d);
      alg $$12 = frd.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fqr.a($$0).a(fqs.a(eap.bB, eap.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fqu.a().a(fqv.c, $$7x ? $$10 : $$7);
            case b, c, d -> fqu.a().a(fqv.c, $$7x ? $$11 : $$8);
            case e -> fqu.a().a(fqv.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      dma $$0 = dmc.tZ;
      fre $$1 = fre.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fre $$2 = fre.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fre $$3 = fre.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fre $$4 = fre.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alg $$5 = frd.cb.a($$0, $$1, this.d);
      alg $$6 = frd.cb.a($$0, "_active", $$2, this.d);
      alg $$7 = frd.cb.a($$0, "_unlocking", $$3, this.d);
      alg $$8 = frd.cb.a($$0, "_ejecting_reward", $$4, this.d);
      fre $$9 = fre.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fre $$10 = fre.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fre $$11 = fre.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fre $$12 = fre.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      alg $$13 = frd.cb.a($$0, "_ominous", $$9, this.d);
      alg $$14 = frd.cb.a($$0, "_active_ominous", $$10, this.d);
      alg $$15 = frd.cb.a($$0, "_unlocking_ominous", $$11, this.d);
      alg $$16 = frd.cb.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fqr.a($$0).a(b()).a(fqs.a(dvi.b, dvi.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fqu.a().a(fqv.c, $$9x ? $$13 : $$5);
            case b -> fqu.a().a(fqv.c, $$9x ? $$14 : $$6);
            case c -> fqu.a().a(fqv.c, $$9x ? $$15 : $$7);
            case d -> fqu.a().a(fqv.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      alg $$0 = frb.a(dmc.rv, "_inactive");
      alg $$1 = frb.a(dmc.rv, "_active");
      this.a(dmc.rv, $$0);
      this.b.accept(fqr.a(dmc.rv).a(fqs.a(eap.br).a($$2 -> fqu.a().a(fqv.c, $$2 != ebg.b && $$2 != ebg.c ? $$0 : $$1))));
   }

   private void ah() {
      alg $$0 = frb.a(dmc.rw, "_inactive");
      alg $$1 = frb.a(dmc.rw, "_active");
      this.a(dmc.rw, $$0);
      this.b.accept(fqr.a(dmc.rw).a(fqs.a(eap.br).a($$2 -> fqu.a().a(fqv.c, $$2 != ebg.b && $$2 != ebg.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      alg $$0 = frd.ca.a(dmc.rA, fre.a(false), this.d);
      alg $$1 = frd.ca.a(dmc.rA, "_can_summon", fre.a(true), this.d);
      this.a(dmc.rA, $$0);
      this.b.accept(fqr.a(dmc.rA).a(a(eap.e, $$1, $$0)));
   }

   private void aj() {
      alg $$0 = frb.a(dmc.ov, "_stable");
      alg $$1 = frb.a(dmc.ov, "_unstable");
      this.a(dmc.ov, $$0);
      this.b.accept(fqr.a(dmc.ov).a(a(eap.d, $$1, $$0)));
   }

   private void ak() {
      alg $$0 = this.a(dmc.ta, "", frd.ao, fre::c);
      alg $$1 = this.a(dmc.ta, "_lit", frd.ao, fre::c);
      this.b.accept(fqr.a(dmc.ta).a(a(eap.b, $$1, $$0)));
      alg $$2 = this.a(dmc.tb, "", frd.ao, fre::c);
      alg $$3 = this.a(dmc.tb, "_lit", frd.ao, fre::c);
      this.b.accept(fqr.a(dmc.tb).a(a(eap.b, $$3, $$2)));
   }

   private void al() {
      alg $$0 = frg.a.create(dmc.fX, this.d);
      alg $$1 = this.a(dmc.fX, "_on", frd.c, fre::b);
      this.b.accept(fqr.a(dmc.fX).a(a(eap.u, $$1, $$0)));
   }

   private void m(dma $$0, dma $$1) {
      fre $$2 = fre.B($$0);
      this.b.accept(c($$0, frd.bm.a($$0, $$2, this.d)));
      this.b.accept(fqr.a($$1, fqu.a().a(fqv.c, frd.bo.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fre $$0 = fre.B(dmc.dY);
      fre $$1 = fre.i(fre.a(dmc.dY, "_off"));
      alg $$2 = frd.bq.a(dmc.dY, $$0, this.d);
      alg $$3 = frd.bn.a(dmc.dY, "_off", $$1, this.d);
      this.b.accept(fqr.a(dmc.dY).a(a(eap.u, $$2, $$3)));
      alg $$4 = frd.br.a(dmc.dZ, $$0, this.d);
      alg $$5 = frd.bp.a(dmc.dZ, "_off", $$1, this.d);
      this.b.accept(fqr.a(dmc.dZ).a(a(eap.u, $$4, $$5)).a(d()));
      this.c(dmc.dY);
   }

   private void an() {
      this.b(czc.ml);
      this.b.accept(fqr.a(dmc.ev).a(fqs.a(eap.aD, eap.v, eap.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fqu.a().a(fqv.c, fre.a(dmc.ev, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(czc.dc);
      this.b
         .accept(
            fqr.a(dmc.ny)
               .a(
                  fqs.a(eap.aV, eap.I)
                     .a(1, false, Arrays.asList(a(frb.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(frb.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(frb.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(frb.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(frb.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(frb.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(frb.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(frb.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fre $$0 = fre.a(dmc.eb);
      alg $$1 = frd.c.a(dmc.ed, $$0, this.d);
      this.b.accept(fqr.a(dmc.eb).a(fqs.a(eap.aI).a($$1x -> fqu.a().a(fqv.c, $$1x < 8 ? frb.a(dmc.eb, "_height" + $$1x * 2) : $$1))));
      this.a(dmc.eb, frb.a(dmc.eb, "_height2"));
      this.b.accept(c(dmc.ed, $$1));
   }

   private void aq() {
      this.b.accept(fqr.a(dmc.oF, fqu.a().a(fqv.c, frb.a(dmc.oF))).a(b()));
   }

   private void ar() {
      alg $$0 = frg.a.create(dmc.pD, this.d);
      this.a(dmc.pD, $$0);
      this.b.accept(fqr.a(dmc.pD).a(fqs.a(eap.bm).a($$0x -> fqu.a().a(fqv.c, this.a(dmc.pD, "_" + $$0x.c(), frd.c, fre::b)))));
   }

   private void as() {
      Map<ebk, alg> $$0 = new HashMap<>();

      for (ebk $$1 : ebk.values()) {
         $$0.put($$1, this.a(dmc.pF, "_" + $$1.c(), frd.c, fre::b));
      }

      this.b.accept(fqr.a(dmc.pF).a(fqs.a(eap.bF).a($$1x -> fqu.a().a(fqv.c, $$0.get($$1x)))));
      this.c.a(czc.oX, fqz.a(dur.b, fqz.a($$0.get(ebk.a)), Map.of(ebk.c, fqz.a($$0.get(ebk.c)), ebk.b, fqz.a($$0.get(ebk.b)), ebk.d, fqz.a($$0.get(ebk.d)))));
   }

   private void at() {
      this.b(czc.xB);
      this.b.accept(fqr.a(dmc.oL).a(fqs.a(eap.av).a($$0 -> fqu.a().a(fqv.c, this.a(dmc.oL, "_stage" + $$0, frd.ao, fre::c)))));
   }

   private void au() {
      this.b(czc.qd);
      this.b
         .accept(
            fqr.a(dmc.ge)
               .a(
                  fqs.a(eap.a, eap.O, eap.N, eap.P, eap.Q)
                     .a(false, false, false, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_ns")))
                     .a(false, true, false, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_n")).a(fqv.b, fqv.a.b))
                     .a(false, false, true, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_n")))
                     .a(false, false, false, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_n")).a(fqv.b, fqv.a.c))
                     .a(false, false, false, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_n")).a(fqv.b, fqv.a.d))
                     .a(false, true, true, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_ne")))
                     .a(false, true, false, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_ne")).a(fqv.b, fqv.a.b))
                     .a(false, false, false, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_ne")).a(fqv.b, fqv.a.c))
                     .a(false, false, true, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_ne")).a(fqv.b, fqv.a.d))
                     .a(false, false, true, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_ns")))
                     .a(false, true, false, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_ns")).a(fqv.b, fqv.a.b))
                     .a(false, true, true, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_nse")))
                     .a(false, true, false, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_nse")).a(fqv.b, fqv.a.b))
                     .a(false, false, true, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_nse")).a(fqv.b, fqv.a.c))
                     .a(false, true, true, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_nse")).a(fqv.b, fqv.a.d))
                     .a(false, true, true, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_nsew")))
                     .a(true, false, false, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_ns")))
                     .a(true, false, true, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_n")))
                     .a(true, false, false, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_n")).a(fqv.b, fqv.a.c))
                     .a(true, true, false, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_n")).a(fqv.b, fqv.a.b))
                     .a(true, false, false, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_n")).a(fqv.b, fqv.a.d))
                     .a(true, true, true, false, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_ne")))
                     .a(true, true, false, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_ne")).a(fqv.b, fqv.a.b))
                     .a(true, false, false, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_ne")).a(fqv.b, fqv.a.c))
                     .a(true, false, true, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_ne")).a(fqv.b, fqv.a.d))
                     .a(true, false, true, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_ns")))
                     .a(true, true, false, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_ns")).a(fqv.b, fqv.a.b))
                     .a(true, true, true, true, false, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_nse")))
                     .a(true, true, false, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_nse")).a(fqv.b, fqv.a.b))
                     .a(true, false, true, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_nse")).a(fqv.b, fqv.a.c))
                     .a(true, true, true, false, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_nse")).a(fqv.b, fqv.a.d))
                     .a(true, true, true, true, true, fqu.a().a(fqv.c, frb.a(dmc.ge, "_attached_nsew")))
               )
         );
   }

   private void av() {
      this.c(dmc.gd);
      this.b
         .accept(fqr.a(dmc.gd).a(fqs.a(eap.a, eap.A).a(($$0, $$1) -> fqu.a().a(fqv.c, fre.a(dmc.gd, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private alg a(int $$0, String $$1, fre $$2) {
      switch ($$0) {
         case 1:
            return frd.bw.a(frb.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return frd.bx.a(frb.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return frd.by.a(frb.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return frd.bz.a(frb.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private alg a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fre.b(fre.J(dmc.mI)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fre.b(fre.a(dmc.mI, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fre.b(fre.a(dmc.mI, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void aw() {
      this.b(czc.kQ);
      this.b.accept(fqr.a(dmc.mI).a(fqs.a(eap.aG, eap.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void ax() {
      this.b(czc.kR);
      Function<Integer, alg> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fre $$2 = fre.a($$1);
         return frd.bH.a(dmc.mJ, $$1, $$2, this.d);
      };
      this.b.accept(fqr.a(dmc.mJ).a(fqs.a(dtq.c).a($$1 -> fqu.a().a(fqv.c, $$0.apply($$1)))));
   }

   private void J(dma $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dma $$0, cyu $$1) {
      this.b($$1);
      this.K($$0);
   }

   private void K(dma $$0) {
      alg $$1 = frb.a($$0);
      fqq $$2 = fqq.a($$0);
      fqp.c $$3 = af.a(fqp.a(), $$1x -> a.stream().<ja>map(Pair::getFirst).map(drf::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<ja, Function<alg, fqu>> $$4 : a) {
         eaq $$5 = drf.b((ja)$$4.getFirst());
         Function<alg, fqu> $$6 = (Function<alg, fqu>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fqp.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void L(dma $$0) {
      alg $$1 = frg.j.create($$0, this.d);
      alg $$2 = frg.k.get($$0).a($$1x -> $$1x.a(frf.i, fre.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      alg $$3 = frg.k.get($$0).a($$1x -> $$1x.a(frf.i, fre.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fqq $$4 = fqq.a($$0);
      fqp.c $$5 = fqp.a().a(drd.b, false);
      $$4.a(fqp.a().a(drd.b, true), fqu.a().a(fqv.c, $$1));
      $$4.a($$5, fqu.a().a(fqv.c, $$1));
      a.stream().<ja>map(Pair::getFirst).forEach($$2x -> {
         eax<ebm> $$3x = drd.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, ebm.a);
         }
      });

      for (Pair<ja, Function<alg, fqu>> $$6 : a) {
         ja $$7 = (ja)$$6.getFirst();
         eax<ebm> $$8 = drd.a($$7);
         if ($$8 != null) {
            Function<alg, fqu> $$9 = (Function<alg, fqu>)$$6.getSecond();
            $$4.a(fqp.a().a($$8, ebm.c), $$9.apply($$2));
            $$4.a(fqp.a().a($$8, ebm.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void M(dma $$0) {
      fqs $$1 = fqs.a(dpu.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fre $$3 = fre.c(fre.a($$0, $$2));
         alg $$4 = fqj.d.b.a().a($$0, $$2, $$3, this.d);
         return fqu.a().a(fqv.c, $$4);
      });
      this.c($$0);
      this.b.accept(fqr.a($$0).a($$1));
   }

   private void ay() {
      alg $$0 = fre.a(dmc.rz, "_bottom");
      fre $$1 = new fre().a(frf.e, $$0).a(frf.f, fre.a(dmc.rz, "_top")).a(frf.i, fre.a(dmc.rz, "_side"));
      fre $$2 = new fre().a(frf.e, $$0).a(frf.f, fre.a(dmc.rz, "_top_bloom")).a(frf.i, fre.a(dmc.rz, "_side_bloom"));
      alg $$3 = frd.n.a(dmc.rz, "", $$1, this.d);
      alg $$4 = frd.n.a(dmc.rz, "_bloom", $$2, this.d);
      this.b.accept(fqr.a(dmc.rz).a(fqs.a(eap.c).a($$2x -> fqu.a().a(fqv.c, $$2x ? $$4 : $$3))));
      this.a(dmc.rz, $$3);
   }

   private void az() {
      dma $$0 = dmc.cu;
      alg $$1 = frb.a($$0);
      fqq $$2 = fqq.a($$0);
      List.of(Pair.of(ja.c, fqv.a.a), Pair.of(ja.f, fqv.a.b), Pair.of(ja.d, fqv.a.c), Pair.of(ja.e, fqv.a.d)).forEach($$2x -> {
         ja $$3 = (ja)$$2x.getFirst();
         fqv.a $$4 = (fqv.a)$$2x.getSecond();
         fqp.c $$5 = fqp.a().a(eap.T, $$3);
         $$2.a($$5, fqu.a().a(fqv.c, $$1).a(fqv.b, $$4).a(fqv.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, frb.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fqq $$0, fqp.c $$1, fqv.a $$2) {
      List.of(
            Pair.of(eap.bs, frd.aT),
            Pair.of(eap.bt, frd.aU),
            Pair.of(eap.bu, frd.aV),
            Pair.of(eap.bv, frd.aW),
            Pair.of(eap.bw, frd.aX),
            Pair.of(eap.bx, frd.aY)
         )
         .forEach($$3 -> {
            eaq $$4 = (eaq)$$3.getFirst();
            frc $$5 = (frc)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fqq $$0, fqp.c $$1, fqv.a $$2, eaq $$3, frc $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fre $$7 = new fre().a(frf.b, fre.a(dmc.cu, $$6));
      fqj.c $$8 = new fqj.c($$4, $$6);
      alg $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dmc.cu, $$6, $$7, this.d));
      $$0.a(fqp.a($$1, fqp.a().a($$3, $$5)), fqu.a().a(fqv.c, $$9).a(fqv.b, $$2));
   }

   private void aA() {
      this.b.accept(c(dmc.lm, frd.c.a(dmc.lm, fre.b(frb.a("magma")), this.d)));
   }

   private void a(dma $$0, @Nullable cxw $$1) {
      this.r($$0);
      cyu $$2 = $$0.h();
      alg $$3 = frd.bO.a($$2, fre.x($$0), this.d);
      hff.b $$4 = $$1 != null ? fqz.a($$3, new hhr.a($$1)) : fqz.a($$3, new hhr.a());
      this.c.a($$2, $$4);
   }

   private void c(dma $$0, dma $$1, fqj.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aB() {
      alg $$0 = frb.a(dmc.b);
      alg $$1 = frb.a(dmc.b, "_mirrored");
      this.b.accept(a(dmc.fc, $$0, $$1));
      this.a(dmc.fc, $$0);
   }

   private void aC() {
      alg $$0 = frb.a(dmc.tq);
      alg $$1 = frb.a(dmc.tq, "_mirrored");
      this.b.accept(a(dmc.tK, $$0, $$1).a(f()));
      this.a(dmc.tK, $$0);
   }

   private void n(dma $$0, dma $$1) {
      this.a($$0, fqj.d.b);
      fre $$2 = fre.d(fre.a($$0, "_pot"));
      alg $$3 = fqj.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aD() {
      alg $$0 = fre.a(dmc.pQ, "_bottom");
      alg $$1 = fre.a(dmc.pQ, "_top_off");
      alg $$2 = fre.a(dmc.pQ, "_top");
      alg[] $$3 = new alg[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fre $$5 = new fre().a(frf.e, $$0).a(frf.f, $$4 == 0 ? $$1 : $$2).a(frf.i, fre.a(dmc.pQ, "_side" + $$4));
         $$3[$$4] = frd.n.a(dmc.pQ, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fqr.a(dmc.pQ).a(fqs.a(eap.bc).a($$1x -> fqu.a().a(fqv.c, $$3[$$1x]))));
      this.a(dmc.pQ, $$3[0]);
   }

   private fqu a(jc $$0, fqu $$1) {
      switch ($$0) {
         case b:
            return $$1.a(fqv.a, fqv.a.b);
         case c:
            return $$1.a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.c);
         case d:
            return $$1.a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.d);
         case a:
            return $$1.a(fqv.a, fqv.a.b).a(fqv.b, fqv.a.b);
         case f:
            return $$1.a(fqv.a, fqv.a.d).a(fqv.b, fqv.a.c);
         case g:
            return $$1.a(fqv.a, fqv.a.d);
         case h:
            return $$1.a(fqv.a, fqv.a.d).a(fqv.b, fqv.a.b);
         case e:
            return $$1.a(fqv.a, fqv.a.d).a(fqv.b, fqv.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(fqv.b, fqv.a.c);
         case i:
            return $$1.a(fqv.b, fqv.a.d);
         case j:
            return $$1.a(fqv.b, fqv.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aE() {
      alg $$0 = fre.a(dmc.pE, "_top");
      alg $$1 = fre.a(dmc.pE, "_bottom");
      alg $$2 = fre.a(dmc.pE, "_side");
      alg $$3 = fre.a(dmc.pE, "_lock");
      fre $$4 = new fre().a(frf.o, $$2).a(frf.m, $$2).a(frf.l, $$2).a(frf.c, $$0).a(frf.j, $$0).a(frf.k, $$1).a(frf.n, $$3);
      alg $$5 = frd.b.a(dmc.pE, $$4, this.d);
      this.b.accept(fqr.a(dmc.pE, fqu.a().a(fqv.c, $$5)).a(fqs.a(eap.W).a($$0x -> this.a($$0x, fqu.a()))));
   }

   private void aF() {
      dma $$0 = dmc.n;
      alg $$1 = frb.a($$0);
      frg $$2 = frg.a.get($$0);
      dma $$3 = dmc.kh;
      alg $$4 = frd.ab.a($$3, $$2.b(), this.d);
      alg $$5 = frd.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dma $$0, dma $$1, dtk.a $$2, alg $$3) {
      alg $$4 = frb.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.h(), fqz.a($$3, new hhs.a($$2)));
   }

   private void aG() {
      alg $$0 = frb.b("template_skull");
      this.a(dmc.hk, dmc.hl, dtk.b.g, $$0);
      this.a(dmc.hi, dmc.hj, dtk.b.e, $$0);
      this.a(dmc.hg, dmc.hh, dtk.b.f, $$0);
      this.a(dmc.hc, dmc.hd, dtk.b.c, $$0);
      this.a(dmc.he, dmc.hf, dtk.b.d, $$0);
      this.a(dmc.ho, dmc.hp, dtk.b.h, $$0);
      this.a(dmc.hm, dmc.hn, dtk.b.i, frb.a(czc.vv));
   }

   private void a(dma $$0, dma $$1, cxw $$2) {
      alg $$3 = frb.a("banner");
      alg $$4 = frb.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cyu $$5 = $$0.h();
      this.c.a($$5, fqz.a($$4, new hhj.a($$2)));
   }

   private void aH() {
      this.a(dmc.ji, dmc.jy, cxw.a);
      this.a(dmc.jj, dmc.jz, cxw.b);
      this.a(dmc.jk, dmc.jA, cxw.c);
      this.a(dmc.jl, dmc.jB, cxw.d);
      this.a(dmc.jm, dmc.jC, cxw.e);
      this.a(dmc.jn, dmc.jD, cxw.f);
      this.a(dmc.jo, dmc.jE, cxw.g);
      this.a(dmc.jp, dmc.jF, cxw.h);
      this.a(dmc.jq, dmc.jG, cxw.i);
      this.a(dmc.jr, dmc.jH, cxw.j);
      this.a(dmc.js, dmc.jI, cxw.k);
      this.a(dmc.jt, dmc.jJ, cxw.l);
      this.a(dmc.ju, dmc.jK, cxw.m);
      this.a(dmc.jv, dmc.jL, cxw.n);
      this.a(dmc.jw, dmc.jM, cxw.o);
      this.a(dmc.jx, dmc.jN, cxw.p);
   }

   private void a(dma $$0, dma $$1, alg $$2, boolean $$3) {
      this.a($$0, $$1);
      cyu $$4 = $$0.h();
      alg $$5 = frd.bQ.a($$4, fre.x($$1), this.d);
      hff.b $$6 = fqz.a($$5, new hhl.a($$2));
      if ($$3) {
         hff.b $$7 = fqz.a($$5, new hhl.a(hhl.a));
         this.c.a($$4, fqz.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aI() {
      this.a(dmc.cE, dmc.n, hhl.b, true);
      this.a(dmc.ht, dmc.n, hhl.c, true);
      this.a(dmc.gc, dmc.cw, hhl.d, false);
   }

   private void b(dma $$0, dma $$1, cxw $$2) {
      alg $$3 = frb.a("bed");
      this.b.accept(c($$0, $$3));
      cyu $$4 = $$0.h();
      alg $$5 = frd.bP.a(frb.a($$4), fre.x($$1), this.d);
      this.c.a($$4, fqz.a($$5, new hhk.a($$2)));
   }

   private void aJ() {
      this.b(dmc.bg, dmc.bI, cxw.a);
      this.b(dmc.bh, dmc.bJ, cxw.b);
      this.b(dmc.bi, dmc.bK, cxw.c);
      this.b(dmc.bj, dmc.bL, cxw.d);
      this.b(dmc.bk, dmc.bM, cxw.e);
      this.b(dmc.bl, dmc.bN, cxw.f);
      this.b(dmc.bm, dmc.bO, cxw.g);
      this.b(dmc.bn, dmc.bP, cxw.h);
      this.b(dmc.bo, dmc.bQ, cxw.i);
      this.b(dmc.bp, dmc.bR, cxw.j);
      this.b(dmc.bq, dmc.bS, cxw.k);
      this.b(dmc.br, dmc.bT, cxw.l);
      this.b(dmc.bs, dmc.bU, cxw.m);
      this.b(dmc.bt, dmc.bV, cxw.n);
      this.b(dmc.bu, dmc.bW, cxw.o);
      this.b(dmc.bv, dmc.bX, cxw.p);
   }

   private void a(dma $$0, hht.a $$1) {
      cyu $$2 = $$0.h();
      alg $$3 = frb.a($$2);
      this.c.a($$2, fqz.a($$3, $$1));
   }

   public void a() {
      mi.a().filter(mj::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dmc.rK).a(mi.x).a(dmc.rK, dmc.si).a(dmc.rO, dmc.rS).a(mi.z);
      this.i(dmc.rJ).a(mi.B).a(dmc.rJ, dmc.sh).a(dmc.rN, dmc.rR).a(mi.D);
      this.i(dmc.rI).a(mi.F).a(dmc.rI, dmc.sg).a(dmc.rM, dmc.rQ).a(mi.H);
      this.i(dmc.rH).a(mi.J).a(dmc.rH, dmc.sf).a(dmc.rL, dmc.rP).a(mi.L);
      this.A(dmc.sP);
      this.A(dmc.sQ);
      this.A(dmc.sR);
      this.A(dmc.sS);
      this.j(dmc.sP, dmc.sT);
      this.j(dmc.sQ, dmc.sU);
      this.j(dmc.sR, dmc.sV);
      this.j(dmc.sS, dmc.sW);
      this.n(dmc.a);
      this.d(dmc.nF, dmc.a);
      this.d(dmc.nE, dmc.a);
      this.n(dmc.gk);
      this.n(dmc.ee);
      this.d(dmc.nG, dmc.J);
      this.n(dmc.fW);
      this.n(dmc.mH);
      this.n(dmc.fN);
      this.n(dmc.gn);
      this.b(czc.vj);
      this.n(dmc.pL);
      this.n(dmc.J);
      this.n(dmc.K);
      this.n(dmc.iu);
      this.b(czc.gl);
      this.o(dmc.qr, dmc.qI);
      this.o(dmc.qs, dmc.qJ);
      this.o(dmc.qt, dmc.qK);
      this.o(dmc.qu, dmc.qL);
      this.o(dmc.qv, dmc.qM);
      this.o(dmc.qw, dmc.qN);
      this.o(dmc.qx, dmc.qO);
      this.o(dmc.qy, dmc.qP);
      this.o(dmc.qz, dmc.qQ);
      this.o(dmc.qA, dmc.qR);
      this.o(dmc.qB, dmc.qS);
      this.o(dmc.qC, dmc.qT);
      this.o(dmc.qD, dmc.qU);
      this.o(dmc.qE, dmc.qV);
      this.o(dmc.qF, dmc.qW);
      this.o(dmc.qG, dmc.qX);
      this.o(dmc.qq, dmc.qH);
      this.n(dmc.nD);
      this.n(dmc.gP);
      this.n(dmc.ru);
      this.n(dmc.tc);
      this.w(dmc.td);
      this.w(dmc.te);
      this.x(dmc.tP);
      this.x(dmc.tQ);
      this.ak();
      this.h(dmc.tj, dmc.tf);
      this.L(dmc.uc);
      this.M(dmc.ud);
      this.a(dmc.ub);
      this.t(dmc.tg);
      this.t(dmc.th);
      this.s(dmc.ti);
      this.b(dmc.ui, fqj.d.c);
      this.b(czc.da);
      this.a(dmc.iv, czc.ic);
      this.b(czc.ic);
      this.aK();
      this.a(dmc.lq, czc.jC);
      this.b(czc.jC);
      this.f(dmc.bY, fre.a(dmc.bG, "_side"));
      this.a(dmc.U);
      this.a(dmc.V);
      this.a(dmc.ja);
      this.a(dmc.cG);
      this.a(dmc.cH);
      this.a(dmc.cI);
      this.a(dmc.ga);
      this.a(dmc.gb);
      this.a(dmc.gf);
      this.a(dmc.Q);
      this.a(dmc.W);
      this.a(dmc.R);
      this.a(dmc.cp);
      this.a(dmc.S);
      this.a(dmc.T);
      this.a(dmc.cq);
      this.b(dmc.pO, frg.d);
      this.a(dmc.pN);
      this.a(dmc.aY);
      this.a(dmc.aZ);
      this.a(dmc.ba);
      this.a(dmc.fD);
      this.a(dmc.hz);
      this.a(dmc.dW);
      this.a(dmc.dX);
      this.a(dmc.hy);
      this.a(dmc.qh);
      this.a(dmc.nz);
      this.a(dmc.ef);
      this.a(dmc.k);
      this.a(dmc.pP);
      this.a(dmc.fV);
      this.a(dmc.eq);
      this.a(dmc.O);
      this.a(dmc.pM);
      this.a(dmc.ec);
      this.b(dmc.eh, frg.g);
      this.b(dmc.pV, frg.d);
      this.b(dmc.fp, frg.d);
      this.n(dmc.ag);
      this.n(dmc.gx);
      this.a(dmc.ln);
      this.a(dmc.bf);
      this.a(dmc.jb);
      this.a(dmc.cw);
      this.a(dmc.qp);
      this.a(dmc.iH);
      this.a(dmc.pb);
      this.a(dmc.ek);
      this.a(dmc.el);
      this.b(dmc.cB, frg.b);
      this.g(dmc.cC);
      this.a(dmc.aV);
      this.b(dmc.bE, frg.z);
      this.b(czc.db);
      this.b(dmc.cs, frg.f);
      this.b(dmc.pI, frg.d);
      this.a(dmc.oS);
      this.a(dmc.aW);
      this.a(dmc.qY);
      this.a(dmc.qZ);
      this.a(dmc.rs);
      this.a(dmc.sZ);
      this.a(dmc.tM);
      this.a(dmc.tN);
      this.a(dmc.tO);
      this.d(dmc.rx);
      this.n(dmc.ua);
      this.aF();
      this.a(dmc.rF);
      this.a(dmc.rG);
      this.a(dmc.rB);
      this.a(dmc.rC);
      this.a(dmc.rD);
      this.a(dmc.rE);
      this.l(dmc.rB, dmc.sb);
      this.l(dmc.rC, dmc.sd);
      this.l(dmc.rD, dmc.sc);
      this.l(dmc.rE, dmc.se);
      this.j(dmc.sr);
      this.j(dmc.ss);
      this.j(dmc.su);
      this.j(dmc.st);
      this.b(dmc.sr, dmc.sv);
      this.b(dmc.ss, dmc.sw);
      this.b(dmc.su, dmc.sy);
      this.b(dmc.st, dmc.sx);
      this.l(dmc.sz);
      this.l(dmc.sA);
      this.l(dmc.sC);
      this.l(dmc.sB);
      this.c(dmc.sz, dmc.sD);
      this.c(dmc.sA, dmc.sE);
      this.c(dmc.sC, dmc.sG);
      this.c(dmc.sB, dmc.sF);
      this.a(dmc.sH);
      this.a(dmc.sI);
      this.a(dmc.sJ);
      this.a(dmc.sK);
      this.l(dmc.sH, dmc.sL);
      this.l(dmc.sI, dmc.sM);
      this.l(dmc.sJ, dmc.sN);
      this.l(dmc.sK, dmc.sO);
      this.k(dmc.hu, dmc.cp);
      this.k(dmc.hv, dmc.cq);
      this.H();
      this.s();
      this.az();
      this.w();
      this.x();
      this.a(dmc.oJ, dmc.oK);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.D(dmc.kW);
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
      this.a(dmc.pG);
      this.au();
      this.av();
      this.aw();
      this.ax();
      this.g();
      this.J(dmc.fv);
      this.J(dmc.ry);
      this.b(dmc.fw, czc.gq);
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
      this.I(dmc.cY);
      this.c(dmc.cY);
      this.I(dmc.oD);
      this.h();
      this.I(dmc.tl);
      this.m(dmc.cx, dmc.cy);
      this.m(dmc.eo, dmc.ep);
      this.a(dmc.cJ, dmc.n, fre::c);
      this.a(dmc.oB, dmc.p, fre::d);
      this.C(dmc.oZ);
      this.C(dmc.oQ);
      this.z(dmc.bb);
      this.z(dmc.hG);
      this.D();
      this.H(dmc.oH);
      this.H(dmc.oI);
      this.e(dmc.fm, frb.a(dmc.fm));
      this.a(dmc.em, frg.d);
      this.a(dmc.en, frg.d);
      this.a(dmc.tL);
      this.a(dmc.lp, frg.d);
      this.e(dmc.j);
      this.e(dmc.to);
      this.e(dmc.L);
      this.f(dmc.M);
      this.f(dmc.P);
      this.e(dmc.N);
      this.d(dmc.I);
      this.b(dmc.tV, frg.f);
      this.a(dmc.iI, frg.d, frg.e);
      this.a(dmc.la, frg.A, frg.B);
      this.a(dmc.hD, frg.A, frg.B);
      this.a(dmc.tR, frg.d, frg.e);
      this.a(dmc.tS, frg.d, frg.e);
      this.a(dmc.tT, frg.d, frg.e);
      this.c(dmc.ow, frg.i);
      this.A();
      this.a(dmc.pJ, fre::D);
      this.a(dmc.pK, fre::F);
      this.a(dmc.lg, eap.av, 0, 1, 2, 3);
      this.a(dmc.gQ, eap.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmc.fM, eap.av, 0, 1, 1, 2);
      this.a(dmc.gR, eap.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmc.cK, eap.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dmc.ld, fqj.d.b, eap.at, 0, 1);
      this.j();
      this.i();
      this.aH();
      this.aJ();
      this.aG();
      this.aI();
      this.a(dmc.ls, null);
      this.a(dmc.lt, cxw.a);
      this.a(dmc.lu, cxw.b);
      this.a(dmc.lv, cxw.c);
      this.a(dmc.lw, cxw.d);
      this.a(dmc.lx, cxw.e);
      this.a(dmc.ly, cxw.f);
      this.a(dmc.lz, cxw.g);
      this.a(dmc.lA, cxw.h);
      this.a(dmc.lB, cxw.i);
      this.a(dmc.lC, cxw.j);
      this.a(dmc.lD, cxw.k);
      this.a(dmc.lE, cxw.l);
      this.a(dmc.lF, cxw.m);
      this.a(dmc.lG, cxw.n);
      this.a(dmc.lH, cxw.o);
      this.a(dmc.lI, cxw.p);
      this.r(dmc.nA);
      this.a(dmc.nA, new hhm.a());
      this.a(dmc.tW, dmc.iZ);
      this.a(dmc.tW, new hhn.a());
      this.a(dmc.fT, dmc.cw);
      this.a(dmc.li, dmc.cw);
      this.a(dmc.aT);
      this.a(dmc.aU);
      this.a(dmc.lZ);
      this.a(dmc.ma);
      this.a(dmc.mb);
      this.a(dmc.mc);
      this.a(dmc.md);
      this.a(dmc.me);
      this.a(dmc.mf);
      this.a(dmc.mg);
      this.a(dmc.mh);
      this.a(dmc.mi);
      this.a(dmc.mj);
      this.a(dmc.mk);
      this.a(dmc.ml);
      this.a(dmc.mm);
      this.a(dmc.mn);
      this.a(dmc.mo);
      this.a(frg.a, dmc.mp, dmc.mq, dmc.mr, dmc.ms, dmc.mt, dmc.mu, dmc.mv, dmc.mw, dmc.mx, dmc.my, dmc.mz, dmc.mA, dmc.mB, dmc.mC, dmc.mD, dmc.mE);
      this.a(dmc.iZ);
      this.a(dmc.hH);
      this.a(dmc.hI);
      this.a(dmc.hJ);
      this.a(dmc.hK);
      this.a(dmc.hL);
      this.a(dmc.hM);
      this.a(dmc.hN);
      this.a(dmc.hO);
      this.a(dmc.hP);
      this.a(dmc.hQ);
      this.a(dmc.hR);
      this.a(dmc.hS);
      this.a(dmc.hT);
      this.a(dmc.hU);
      this.a(dmc.hV);
      this.a(dmc.hW);
      this.a(dmc.rt);
      this.i(dmc.aX, dmc.fn);
      this.i(dmc.ew, dmc.hX);
      this.i(dmc.ex, dmc.hY);
      this.i(dmc.ey, dmc.hZ);
      this.i(dmc.ez, dmc.ia);
      this.i(dmc.eA, dmc.ib);
      this.i(dmc.eB, dmc.ic);
      this.i(dmc.eC, dmc.id);
      this.i(dmc.eD, dmc.ie);
      this.i(dmc.eE, dmc.if);
      this.i(dmc.eF, dmc.ig);
      this.i(dmc.eG, dmc.ih);
      this.i(dmc.eH, dmc.ii);
      this.i(dmc.eI, dmc.ij);
      this.i(dmc.eJ, dmc.ik);
      this.i(dmc.eK, dmc.il);
      this.i(dmc.eL, dmc.im);
      this.b(frg.t, dmc.lJ, dmc.lK, dmc.lL, dmc.lM, dmc.lN, dmc.lO, dmc.lP, dmc.lQ, dmc.lR, dmc.lS, dmc.lT, dmc.lU, dmc.lV, dmc.lW, dmc.lX, dmc.lY);
      this.h(dmc.bI, dmc.iJ);
      this.h(dmc.bJ, dmc.iK);
      this.h(dmc.bK, dmc.iL);
      this.h(dmc.bL, dmc.iM);
      this.h(dmc.bM, dmc.iN);
      this.h(dmc.bN, dmc.iO);
      this.h(dmc.bO, dmc.iP);
      this.h(dmc.bP, dmc.iQ);
      this.h(dmc.bQ, dmc.iR);
      this.h(dmc.bR, dmc.iS);
      this.h(dmc.bS, dmc.iT);
      this.h(dmc.bT, dmc.iU);
      this.h(dmc.bU, dmc.iV);
      this.h(dmc.bV, dmc.iW);
      this.h(dmc.bW, dmc.iX);
      this.h(dmc.bX, dmc.iY);
      this.a(dmc.tp);
      this.a(dmc.fa);
      this.b(dmc.bB, dmc.gy, fqj.d.a);
      this.h(dmc.bB);
      this.a(dmc.bZ, dmc.gz, fqj.d.b);
      this.a(dmc.cb, dmc.gA, fqj.d.b);
      this.a(dmc.ue, dmc.ug, fqj.d.c);
      this.a(dmc.uf, dmc.uh, fqj.d.b);
      this.a(dmc.cc, dmc.gB, fqj.d.b);
      this.a(dmc.cd, dmc.gC, fqj.d.b);
      this.a(dmc.ce, dmc.gD, fqj.d.b);
      this.a(dmc.cf, dmc.gE, fqj.d.b);
      this.a(dmc.cg, dmc.gF, fqj.d.b);
      this.a(dmc.ch, dmc.gG, fqj.d.b);
      this.a(dmc.ci, dmc.gH, fqj.d.b);
      this.a(dmc.cj, dmc.gI, fqj.d.b);
      this.a(dmc.ck, dmc.gJ, fqj.d.b);
      this.a(dmc.cm, dmc.gK, fqj.d.b);
      this.a(dmc.cl, dmc.gL, fqj.d.b);
      this.a(dmc.co, dmc.gM, fqj.d.b);
      this.a(dmc.cn, dmc.gN, fqj.d.b);
      this.a(dmc.bC, dmc.gO, fqj.d.b);
      this.a(dmc.ca, dmc.go, fqj.d.b);
      this.I();
      this.y(dmc.fi);
      this.y(dmc.fj);
      this.y(dmc.fk);
      this.b(dmc.bA, fqj.d.a);
      this.h(dmc.bA);
      this.b(dmc.bD, fqj.d.a);
      this.h(dmc.bD);
      this.b(dmc.eg, fqj.d.a);
      this.b(czc.dU);
      this.c(dmc.mF, dmc.mG, fqj.d.b);
      this.b(czc.dV);
      this.b(dmc.tn, fqj.d.b);
      this.c(dmc.pc, dmc.pd, fqj.d.b);
      this.c(dmc.pe, dmc.pf, fqj.d.b);
      this.a(dmc.pc, "_plant");
      this.a(dmc.pe, "_plant");
      this.a(dmc.nB, fqj.d.a, fre.c(fre.a(dmc.nC, "_stage0")));
      this.n();
      this.a(dmc.bz, fqj.d.b);
      this.d(dmc.jd, fqj.d.b);
      this.d(dmc.je, fqj.d.b);
      this.d(dmc.jf, fqj.d.b);
      this.o(dmc.jg);
      this.o(dmc.jh);
      this.k();
      this.l();
      this.m();
      this.a(dmc.mZ, dmc.mU, dmc.mP, dmc.mK, dmc.nj, dmc.ne, dmc.nt, dmc.no);
      this.a(dmc.na, dmc.mV, dmc.mQ, dmc.mL, dmc.nk, dmc.nf, dmc.nu, dmc.np);
      this.a(dmc.nb, dmc.mW, dmc.mR, dmc.mM, dmc.nl, dmc.ng, dmc.nv, dmc.nq);
      this.a(dmc.nc, dmc.mX, dmc.mS, dmc.mN, dmc.nm, dmc.nh, dmc.nw, dmc.nr);
      this.a(dmc.nd, dmc.mY, dmc.mT, dmc.mO, dmc.nn, dmc.ni, dmc.nx, dmc.ns);
      this.f(dmc.ft, dmc.fr);
      this.f(dmc.fs, dmc.fq);
      this.m(dmc.af).c(dmc.af).a(dmc.aA);
      this.m(dmc.ar).c(dmc.ar).a(dmc.aJ);
      this.a(dmc.ar, dmc.dv, dmc.dF);
      this.a(dmc.aS, frg.w, -7158200);
      this.m(dmc.ab).c(dmc.ab).a(dmc.ax);
      this.m(dmc.am).c(dmc.am).a(dmc.aF);
      this.a(dmc.am, dmc.do, dmc.dA);
      this.a(dmc.D, dmc.gt, fqj.d.b);
      this.a(dmc.aO, frg.w, -12012264);
      this.m(dmc.ac).d(dmc.ac).a(dmc.ay);
      this.m(dmc.an).d(dmc.an).a(dmc.aG);
      this.a(dmc.an, dmc.dp, dmc.dB);
      this.a(dmc.E, dmc.gu, fqj.d.b);
      this.b(dmc.aP, frg.w);
      this.m(dmc.Z).c(dmc.Z).a(dmc.av);
      this.m(dmc.ak).c(dmc.ak).a(dmc.aD);
      this.a(dmc.ak, dmc.dn, dmc.dz);
      this.a(dmc.B, dmc.gr, fqj.d.b);
      this.a(dmc.aM, frg.w, -8345771);
      this.m(dmc.X).c(dmc.X).a(dmc.at);
      this.m(dmc.aq).c(dmc.aq).a(dmc.aB);
      this.a(dmc.aq, dmc.dl, dmc.dx);
      this.a(dmc.z, dmc.gp, fqj.d.b);
      this.a(dmc.aK, frg.w, -12012264);
      this.m(dmc.Y).c(dmc.Y).a(dmc.au);
      this.m(dmc.aj).c(dmc.aj).a(dmc.aC);
      this.a(dmc.aj, dmc.dm, dmc.dy);
      this.a(dmc.A, dmc.gq, fqj.d.b);
      this.a(dmc.aL, frg.w, -10380959);
      this.m(dmc.ad).c(dmc.ad).a(dmc.az);
      this.m(dmc.ao).c(dmc.ao).a(dmc.aH);
      this.a(dmc.ao, dmc.dr, dmc.dD);
      this.a(dmc.F, dmc.gv, fqj.d.b);
      this.a(dmc.aQ, frg.w, -12012264);
      this.m(dmc.ae).c(dmc.ae).a(dmc.u);
      this.m(dmc.ap).c(dmc.ap).a(dmc.aI);
      this.a(dmc.ap, dmc.ds, dmc.dE);
      this.a(dmc.G, dmc.gw, fqj.d.b);
      this.b(dmc.aR, frg.w);
      this.m(dmc.aa).c(dmc.aa).a(dmc.aw);
      this.m(dmc.al).c(dmc.al).a(dmc.aE);
      this.a(dmc.al, dmc.dq, dmc.dC);
      this.a(dmc.C, dmc.gs, fqj.d.b);
      this.a(dmc.aN, frg.w, -12012264);
      this.m(dmc.oV).b(dmc.oV).a(dmc.oX);
      this.m(dmc.oW).b(dmc.oW).a(dmc.oY);
      this.a(dmc.oW, dmc.dt, dmc.dG);
      this.a(dmc.pa, dmc.pR, fqj.d.b);
      this.n(dmc.pg, dmc.pT);
      this.m(dmc.oM).b(dmc.oM).a(dmc.oO);
      this.m(dmc.oN).b(dmc.oN).a(dmc.oP);
      this.a(dmc.oN, dmc.du, dmc.dH);
      this.a(dmc.oR, dmc.pS, fqj.d.b);
      this.n(dmc.oT, dmc.pU);
      this.m(dmc.ai).d(dmc.ai);
      this.m(dmc.as).d(dmc.as);
      this.a(dmc.x, dmc.dw, dmc.dI);
      this.b(dmc.oU, fqj.d.b);
      this.b(czc.dR);
      this.j(dmc.dL);
      this.l(dmc.ix);
      this.v();
      this.p(dmc.cZ);
      this.q(dmc.bw);
      this.q(dmc.bx);
      this.q(dmc.hF);
      this.u();
      this.u(dmc.gj);
      this.u(dmc.lj);
      this.u(dmc.lk);
      this.v(dmc.hq);
      this.v(dmc.hr);
      this.v(dmc.hs);
      this.p();
      this.q();
      this.d(dmc.cM, frg.h);
      this.d(dmc.oz, frg.h);
      this.d(dmc.oy, frg.i);
      this.t();
      this.aD();
      this.ay();
      this.l(dmc.eZ, dmc.fh);
      this.l(dmc.m, dmc.fd);
      this.l(dmc.eY, dmc.fg);
      this.l(dmc.eX, dmc.ff);
      this.aB();
      this.l(dmc.eW, dmc.fe);
      this.aC();
   }

   private void aK() {
      hff.b $$0 = fqz.a(this.a(czc.id));
      Map<Integer, hff.b> $$1 = new HashMap<>(16);
      fqs.a<Integer> $$2 = fqs.a(eap.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         alg $$5 = fre.a(czc.id, $$4);
         $$2.a($$3, fqu.a().a(fqv.c, frd.aa.a(dmc.iw, $$4, fre.h($$5), this.d)));
         hff.b $$6 = fqz.a(frd.bI.a(frb.a(czc.id, $$4), fre.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(czc.id, fqz.a(dqt.c, $$0, $$1));
      this.b.accept(fqr.a(dmc.iw).a($$2));
   }

   private void o(dma $$0, dma $$1) {
      this.b($$0.h());
      fre $$2 = fre.b(fre.J($$0));
      fre $$3 = fre.b(fre.a($$0, "_lit"));
      alg $$4 = frd.bV.a($$0, "_one_candle", $$2, this.d);
      alg $$5 = frd.bW.a($$0, "_two_candles", $$2, this.d);
      alg $$6 = frd.bX.a($$0, "_three_candles", $$2, this.d);
      alg $$7 = frd.bY.a($$0, "_four_candles", $$2, this.d);
      alg $$8 = frd.bV.a($$0, "_one_candle_lit", $$3, this.d);
      alg $$9 = frd.bW.a($$0, "_two_candles_lit", $$3, this.d);
      alg $$10 = frd.bX.a($$0, "_three_candles_lit", $$3, this.d);
      alg $$11 = frd.bY.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fqr.a($$0)
               .a(
                  fqs.a(eap.aC, eap.u)
                     .a(1, false, fqu.a().a(fqv.c, $$4))
                     .a(2, false, fqu.a().a(fqv.c, $$5))
                     .a(3, false, fqu.a().a(fqv.c, $$6))
                     .a(4, false, fqu.a().a(fqv.c, $$7))
                     .a(1, true, fqu.a().a(fqv.c, $$8))
                     .a(2, true, fqu.a().a(fqv.c, $$9))
                     .a(3, true, fqu.a().a(fqv.c, $$10))
                     .a(4, true, fqu.a().a(fqv.c, $$11))
               )
         );
      alg $$12 = frd.bZ.a($$1, fre.a($$0, false), this.d);
      alg $$13 = frd.bZ.a($$1, "_lit", fre.a($$0, true), this.d);
      this.b.accept(fqr.a($$1).a(a(eap.u, $$13, $$12)));
   }

   class a {
      private final fre b;
      private final Map<frc, alg> c = Maps.newHashMap();
      @Nullable
      private mj d;
      @Nullable
      private alg e;
      private final Set<dma> f = new HashSet<>();

      public a(final fre $$0) {
         this.b = $$0;
      }

      public fqj.a a(dma $$0, frc $$1) {
         this.e = $$1.a($$0, this.b, fqj.this.d);
         if (fqj.this.f.containsKey($$0)) {
            fqj.this.b.accept(fqj.this.f.get($$0).create($$0, this.e, this.b, fqj.this.d));
         } else {
            fqj.this.b.accept(fqj.c($$0, this.e));
         }

         return this;
      }

      public fqj.a a(dma $$0, dma $$1) {
         alg $$2 = frb.a($$0);
         fqj.this.b.accept(fqj.c($$1, $$2));
         fqj.this.c.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public fqj.a a(dma $$0) {
         alg $$1 = frd.s.a($$0, this.b, fqj.this.d);
         alg $$2 = frd.t.a($$0, this.b, fqj.this.d);
         fqj.this.b.accept(fqj.b($$0, $$1, $$2));
         alg $$3 = frd.u.a($$0, this.b, fqj.this.d);
         fqj.this.a($$0, $$3);
         return this;
      }

      public fqj.a b(dma $$0) {
         alg $$1 = frd.M.a($$0, this.b, fqj.this.d);
         alg $$2 = frd.N.a($$0, this.b, fqj.this.d);
         alg $$3 = frd.O.a($$0, this.b, fqj.this.d);
         fqj.this.b.accept(fqj.a($$0, $$1, $$2, $$3));
         alg $$4 = frd.P.a($$0, this.b, fqj.this.d);
         fqj.this.a($$0, $$4);
         return this;
      }

      public fqj.a c(dma $$0) {
         fre $$1 = fre.s($$0);
         alg $$2 = frd.D.a($$0, $$1, fqj.this.d);
         alg $$3 = frd.E.a($$0, $$1, fqj.this.d);
         alg $$4 = frd.F.a($$0, $$1, fqj.this.d);
         alg $$5 = frd.G.a($$0, $$1, fqj.this.d);
         alg $$6 = frd.H.a($$0, $$1, fqj.this.d);
         fqj.this.b.accept(fqj.a($$0, $$2, $$3, $$4, $$5, $$6));
         alg $$7 = frd.I.a($$0, $$1, fqj.this.d);
         fqj.this.a($$0, $$7);
         return this;
      }

      public fqj.a d(dma $$0) {
         alg $$1 = frd.J.a($$0, this.b, fqj.this.d);
         alg $$2 = frd.K.a($$0, this.b, fqj.this.d);
         fqj.this.b.accept(fqj.c($$0, $$1, $$2));
         alg $$3 = frd.L.a($$0, this.b, fqj.this.d);
         fqj.this.a($$0, $$3);
         return this;
      }

      public fqj.a e(dma $$0) {
         fre $$1 = fre.s($$0);
         alg $$2 = frd.R.a($$0, $$1, fqj.this.d);
         alg $$3 = frd.Q.a($$0, $$1, fqj.this.d);
         alg $$4 = frd.T.a($$0, $$1, fqj.this.d);
         alg $$5 = frd.S.a($$0, $$1, fqj.this.d);
         fqj.this.b.accept(fqj.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fqj.a f(dma $$0) {
         alg $$1 = frd.V.a($$0, this.b, fqj.this.d);
         alg $$2 = frd.U.a($$0, this.b, fqj.this.d);
         alg $$3 = frd.X.a($$0, this.b, fqj.this.d);
         alg $$4 = frd.W.a($$0, this.b, fqj.this.d);
         fqj.this.b.accept(fqj.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fqj.a g(dma $$0) {
         alg $$1 = frd.Y.a($$0, this.b, fqj.this.d);
         alg $$2 = frd.Z.a($$0, this.b, fqj.this.d);
         fqj.this.b.accept(fqj.e($$0, $$1, $$2));
         return this;
      }

      public fqj.a h(dma $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dma $$1 = this.d.b().get(mj.b.r);
            alg $$2 = frd.aa.a($$0, this.b, fqj.this.d);
            fqj.this.b.accept(fqj.c($$0, $$2));
            fqj.this.b.accept(fqj.c($$1, $$2));
            fqj.this.b($$0.h());
            return this;
         }
      }

      public fqj.a i(dma $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alg $$1 = this.a(frd.ab, $$0);
            alg $$2 = this.a(frd.ac, $$0);
            fqj.this.b.accept(fqj.e($$0, $$1, $$2, this.e));
            fqj.this.a($$0, $$1);
            return this;
         }
      }

      public fqj.a j(dma $$0) {
         alg $$1 = this.a(frd.af, $$0);
         alg $$2 = this.a(frd.ae, $$0);
         alg $$3 = this.a(frd.ag, $$0);
         fqj.this.b.accept(fqj.b($$0, $$1, $$2, $$3));
         fqj.this.a($$0, $$2);
         return this;
      }

      private fqj.a k(dma $$0) {
         frg $$1 = fqj.this.g.getOrDefault($$0, frg.a.get($$0));
         alg $$2 = $$1.a($$0, fqj.this.d);
         fqj.this.b.accept(fqj.c($$0, $$2));
         return this;
      }

      private fqj.a l(dma $$0) {
         fqj.this.j($$0);
         return this;
      }

      private void m(dma $$0) {
         if (fqj.this.e.contains($$0)) {
            fqj.this.l($$0);
         } else {
            fqj.this.k($$0);
         }
      }

      private alg a(frc $$0, dma $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fqj.this.d));
      }

      public fqj.a a(mj $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fqj.a, dma> $$2 = fqj.h.get($$0x);
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
      fqo create(dma var1, alg var2, fre var3, BiConsumer<alg, fra> var4);
   }

   static record c(frc a, String b) {
   }

   static enum d {
      a(frd.ap, frd.as, false),
      b(frd.ao, frd.ar, false),
      c(frd.aq, frd.at, true);

      private final frc d;
      private final frc e;
      private final boolean f;

      private d(final frc $$0, final frc $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public frc a() {
         return this.d;
      }

      public frc b() {
         return this.e;
      }

      public alg a(fqj $$0, dma $$1) {
         cyu $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fre a(dma $$0) {
         return this.f ? fre.e($$0) : fre.c($$0);
      }

      public fre b(dma $$0) {
         return this.f ? fre.g($$0) : fre.f($$0);
      }
   }

   class e {
      private final fre b;

      public e(final fre $$0) {
         this.b = $$0;
      }

      public fqj.e a(dma $$0) {
         fre $$1 = this.b.c(frf.d, this.b.a(frf.i));
         alg $$2 = frd.j.a($$0, $$1, fqj.this.d);
         fqj.this.b.accept(fqj.d($$0, $$2));
         return this;
      }

      public fqj.e b(dma $$0) {
         alg $$1 = frd.j.a($$0, this.b, fqj.this.d);
         fqj.this.b.accept(fqj.d($$0, $$1));
         return this;
      }

      public fqj.e c(dma $$0) {
         alg $$1 = frd.j.a($$0, this.b, fqj.this.d);
         alg $$2 = frd.k.a($$0, this.b, fqj.this.d);
         fqj.this.b.accept(fqj.d($$0, $$1, $$2));
         return this;
      }

      public fqj.e d(dma $$0) {
         fqj.this.b.accept(fqj.a($$0, this.b, fqj.this.d));
         return this;
      }
   }
}
