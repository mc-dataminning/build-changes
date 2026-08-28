import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public final class cuq implements kl {
   public static final Codec<jm<cul>> a = lt.g
      .s()
      .validate($$0 -> $$0.a(cut.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cuq> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cuq::h),
                     axw.a(1, 99).fieldOf("count").orElse(1).forGetter(cuq::H),
                     kn.b.optionalFieldOf("components", kn.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cuq::new)
         )
   );
   public static final Codec<cuq> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cuq::h), kn.b.optionalFieldOf("components", kn.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cuq($$0x, 1, $$1))
         )
   );
   public static final Codec<cuq> d = b.validate(cuq::b);
   public static final Codec<cuq> e = c.validate(cuq::b);
   public static final Codec<cuq> f = axw.e(b).xmap($$0 -> $$0.orElse(cuq.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cuq> g = a.xmap(cuq::new, cuq::h);
   public static final yx<wk, cuq> h = new yx<wk, cuq>() {
      private static final yx<wk, jm<cul>> a = yv.b(lu.K);

      public cuq a(wk $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cuq.l;
         } else {
            jm<cul> $$2 = a.decode($$0);
            kn $$3 = kn.c.decode($$0);
            return new cuq($$2, $$1, $$3);
         }
      }

      public void a(wk $$0, cuq $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.H());
            a.encode($$0, $$1.h());
            kn.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final yx<wk, cuq> i = new yx<wk, cuq>() {
      public cuq a(wk $$0) {
         cuq $$1 = cuq.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wk $$0, cuq $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cuq.h.encode($$0, $$1);
         }
      }
   };
   public static final yx<wk, List<cuq>> j = h.a(yv.a(jv::a));
   public static final yx<wk, List<cuq>> k = i.a(yv.a(jv::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cuq l = new cuq((Void)null);
   private static final wz n = wz.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cul q;
   final kr r;
   @Nullable
   private bsr s;

   private static DataResult<cuq> b(cuq $$0) {
      DataResult<azs> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.H() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.H() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static yx<wk, cuq> a(final yx<wk, cuq> $$0) {
      return new yx<wk, cuq>() {
         public cuq a(wk $$0x) {
            cuq $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               akp<azs> $$2 = $$0.G().a(ayq.a);
               cuq.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wk $$0x, cuq $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<csa> b() {
      return this.g().g(this);
   }

   @Override
   public km a() {
      return (km)(!this.e() ? this.r : km.a);
   }

   public km c() {
      return !this.e() ? this.g().p() : km.a;
   }

   public kn d() {
      return !this.e() ? this.r.f() : kn.a;
   }

   public cuq(dcv $$0) {
      this($$0, 1);
   }

   public cuq(jm<cul> $$0) {
      this($$0.a(), 1);
   }

   public cuq(jm<cul> $$0, int $$1, kn $$2) {
      this($$0.a(), $$1, kr.a($$0.a().p(), $$2));
   }

   public cuq(jm<cul> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cuq(dcv $$0, int $$1) {
      this($$0, $$1, new kr($$0.r().p()));
   }

   private cuq(dcv $$0, int $$1, kr $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().m(this);
   }

   private cuq(@Nullable Void $$0) {
      this.q = null;
      this.r = new kr(km.a);
   }

   public static DataResult<azs> a(km $$0) {
      if ($$0.b(kq.d) && $$0.a(kq.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cxo $$1 = $$0.a(kq.ab, cxo.a);

         for (cuq $$2 : $$1.d()) {
            int $$3 = $$2.H();
            int $$4 = $$2.j();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(azs.a);
      }
   }

   public static Optional<cuq> a(jo.a $$0, uy $$1) {
      return b.parse($$0.a(up.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cuq a(jo.a $$0, ub $$1) {
      return $$1.g() ? l : a($$0, (uy)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cut.a || this.o <= 0;
   }

   public boolean a(cpl $$0) {
      return this.e() || this.g().a($$0);
   }

   public cuq a(int $$0) {
      int $$1 = Math.min($$0, this.H());
      cuq $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cuq f() {
      if (this.e()) {
         return l;
      } else {
         cuq $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public cul g() {
      return this.e() ? cut.a : this.q;
   }

   public jm<cul> h() {
      return this.g().o();
   }

   public boolean a(awu<cul> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(cul $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<jm<cul>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(jm<cul> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jq<cul> $$0) {
      return $$0.a(this.h());
   }

   public Stream<awu<cul>> i() {
      return this.g().o().c();
   }

   public bqr a(cyf $$0) {
      cmx $$1 = $$0.o();
      jd $$2 = $$0.a();
      if ($$1 != null && !$$1.fZ().e && !this.a(new dtg($$0.q(), $$2, false))) {
         return bqr.e;
      } else {
         cul $$3 = this.g();
         bqr $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avz.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dtc $$0) {
      return this.g().a(this, $$0);
   }

   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cuq a(dcw $$0, btn $$1) {
      return this.g().a(this, $$0, $$1);
   }

   public uy b(jo.a $$0, uy $$1) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uy)b.encode(this, $$0.a(up.a), $$1).getOrThrow();
      }
   }

   public uy a(jo.a $$0) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uy)b.encodeStart($$0.a(up.a), this).getOrThrow();
      }
   }

   public uy b(jo.a $$0) {
      return (uy)(this.e() ? new ub() : this.b($$0, new ub()));
   }

   public int j() {
      return this.a(kq.c, Integer.valueOf(1));
   }

   public boolean k() {
      return this.j() > 1 && (!this.l() || !this.m());
   }

   public boolean l() {
      return this.b(kq.d) && !this.b(kq.f) && this.b(kq.e);
   }

   public boolean m() {
      return this.l() && this.n() > 0;
   }

   public int n() {
      return ayo.a(this.a(kq.e, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(kq.e, Integer.valueOf(ayo.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(kq.d, Integer.valueOf(0));
   }

   public void a(int $$0, aqu $$1, @Nullable aqv $$2, Consumer<cul> $$3) {
      if (this.l()) {
         if ($$2 == null || !$$2.fL()) {
            if ($$0 > 0) {
               $$0 = dae.a($$1, this, $$0);
               if ($$0 <= 0) {
                  return;
               }
            }

            if ($$2 != null && $$0 != 0) {
               an.u.a($$2, this, this.n() + $$0);
            }

            int $$4 = this.n() + $$0;
            this.b($$4);
            if ($$4 >= this.o()) {
               cul $$5 = this.g();
               this.h(1);
               $$3.accept($$5);
            }
         }
      }
   }

   public void a(int $$0, btn $$1, bsy $$2) {
      if ($$1.dO() instanceof aqu $$3) {
         this.a($$0, $$3, $$1 instanceof aqv $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cuq a(int $$0, dcv $$1, btn $$2, bsy $$3) {
      this.a($$0, $$2, $$3);
      if (this.e()) {
         cuq $$4 = this.b($$1, 1);
         if ($$4.l()) {
            $$4.b(0);
         }

         return $$4;
      } else {
         return this;
      }
   }

   public boolean p() {
      return this.g().d(this);
   }

   public int q() {
      return this.g().e(this);
   }

   public int r() {
      return this.g().f(this);
   }

   public boolean a(crq $$0, cqd $$1, cmx $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cuq $$0, crq $$1, cqd $$2, cmx $$3, bug $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(btn $$0, cmx $$1) {
      cul $$2 = this.g();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avz.c.b($$2));
         return true;
      } else {
         return false;
      }
   }

   public void b(btn $$0, cmx $$1) {
      this.g().b(this, $$0, $$1);
   }

   public void a(dcw $$0, dtc $$1, jd $$2, cmx $$3) {
      cul $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avz.c.b($$4));
      }
   }

   public boolean b(dtc $$0) {
      return this.g().b(this, $$0);
   }

   public bqr a(cmx $$0, btn $$1, bqq $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cuq s() {
      if (this.e()) {
         return l;
      } else {
         cuq $$0 = new cuq(this.g(), this.o, this.r.g());
         $$0.d(this.G());
         return $$0;
      }
   }

   public cuq c(int $$0) {
      if (this.e()) {
         return l;
      } else {
         cuq $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cuq a(dcv $$0) {
      return this.a($$0, this.H());
   }

   public cuq a(dcv $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   private cuq b(dcv $$0, int $$1) {
      return new cuq($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cuq $$0, cuq $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.H() != $$1.H() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cuq> $$0, List<cuq> $$1) {
      if ($$0.size() != $$1.size()) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
            if (!a($$0.get($$2), $$1.get($$2))) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean b(cuq $$0, cuq $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cuq $$0, cuq $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cuq> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cuq $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cuq> $$0) {
      int $$1 = 0;

      for (cuq $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String t() {
      return this.g().h(this);
   }

   @Override
   public String toString() {
      return this.H() + " " + this.g();
   }

   public void a(dcw $$0, bsr $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dcw $$0, cmx $$1, int $$2) {
      $$1.a(avz.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dcw $$0) {
      this.g().a(this, $$0);
   }

   public int a(btn $$0) {
      return this.g().a(this, $$0);
   }

   public cwo u() {
      return this.g().b(this);
   }

   public void a(dcw $$0, btn $$1, int $$2) {
      this.g().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.g().l(this);
   }

   @Nullable
   public <T> T b(kp<? super T> $$0, @Nullable T $$1) {
      return this.r.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kp<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kp<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kp<? extends T> $$0) {
      return this.r.d($$0);
   }

   public void a(kn $$0) {
      kn $$1 = this.r.f();
      this.r.a($$0);
      Optional<Error<cuq>> $$2 = b(this).error();
      if ($$2.isPresent()) {
         m.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.r.b($$1);
      } else {
         this.g().m(this);
      }
   }

   public void b(kn $$0) {
      this.r.a($$0);
      this.g().m(this);
   }

   public void b(km $$0) {
      this.r.a($$0);
      this.g().m(this);
   }

   public wz w() {
      wz $$0 = this.a(kq.g);
      if ($$0 != null) {
         return $$0;
      } else {
         wz $$1 = this.a(kq.h);
         return $$1 != null ? $$1 : this.g().n(this);
      }
   }

   private <T extends cxy> void a(kp<T> $$0, cul.b $$1, Consumer<wz> $$2, cwm $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wz> a(cul.b $$0, @Nullable cmx $$1, cwm $$2) {
      if (!$$2.b() && this.b(kq.q)) {
         return List.of();
      } else {
         List<wz> $$3 = Lists.newArrayList();
         xn $$4 = wz.i().b(this.w()).a(this.y().a());
         if (this.b(kq.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kq.g) && this.a(cut.rU)) {
            eqr $$5 = this.a(kq.B);
            if ($$5 != null) {
               $$3.add(cvc.a($$5));
            }
         }

         Consumer<wz> $$6 = $$3::add;
         if (!this.b(kq.p)) {
            this.g().a(this, $$0, $$3, $$2);
         }

         this.a(kq.R, $$0, $$6, $$2);
         this.a(kq.K, $$0, $$6, $$2);
         this.a(kq.y, $$0, $$6, $$2);
         this.a(kq.k, $$0, $$6, $$2);
         this.a(kq.z, $$0, $$6, $$2);
         this.a(kq.i, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kq.f, $$0, $$6, $$2);
         csc $$7 = this.a(kq.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wy.a);
            $$6.accept(csc.c);
            $$7.a($$6);
         }

         csc $$8 = this.a(kq.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wy.a);
            $$6.accept(csc.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.m()) {
               $$3.add(wz.a("item.durability", this.o() - this.n(), this.o()));
            }

            $$3.add(wz.b(lt.g.b(this.g()).toString()).a(n.i));
            int $$9 = this.r.d();
            if ($$9 > 0) {
               $$3.add(wz.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.g().a($$1.dO().J())) {
            $$3.add(n);
         }

         return $$3;
      }
   }

   private void a(Consumer<wz> $$0, @Nullable cmx $$1) {
      cxn $$2 = this.a(kq.n, cxn.a);
      if ($$2.c()) {
         for (bsz $$3 : bsz.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wy.a);
                  $$0.accept(wz.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wz> $$0, @Nullable cmx $$1, jm<bur> $$2, buu $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cul.e)) {
            $$4 += $$1.h(buw.c);
            $$5 = true;
         } else if ($$3.a(cul.f)) {
            $$4 += $$1.h(buw.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == buu.a.b || $$3.d() == buu.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(buw.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wy.a().b(wz.a("attribute.modifier.equals." + $$3.d().a(), cxn.d.format($$6), wz.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wz.a("attribute.modifier.plus." + $$3.d().a(), cxn.d.format($$6), wz.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wz.a("attribute.modifier.take." + $$3.d().a(), cxn.d.format(-$$6), wz.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(kq.t);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cvo y() {
      cvo $$0 = this.a(kq.j, cvo.a);
      if (!this.A()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cvo.c;
            case c -> cvo.d;
            default -> $$0;
         };
      }
   }

   public boolean z() {
      if (!this.g().a(this)) {
         return false;
      } else {
         dai $$0 = this.a(kq.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jm<dac> $$0, int $$1) {
      dae.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(kq.k, dai.a).d();
   }

   public dai B() {
      return this.a(kq.k, dai.a);
   }

   public boolean C() {
      return this.s instanceof cja;
   }

   public void a(@Nullable bsr $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public cja D() {
      return this.s instanceof cja ? (cja)this.E() : null;
   }

   @Nullable
   public bsr E() {
      return !this.e() ? this.s : null;
   }

   public void a(bsz $$0, BiConsumer<jm<bur>, buu> $$1) {
      cxn $$2 = this.a(kq.n, cxn.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      dae.a(this, $$0, $$1);
   }

   public void a(bsy $$0, BiConsumer<jm<bur>, buu> $$1) {
      cxn $$2 = this.a(kq.n, cxn.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      dae.a(this, $$0, $$1);
   }

   public wz F() {
      xn $$0 = wz.i().b(this.w());
      if (this.b(kq.g)) {
         $$0.a(n.u);
      }

      xn $$1 = xc.a((wz)$$0);
      if (!this.e()) {
         $$1.a(this.y().a()).a($$0x -> $$0x.a(new xf(xf.a.b, new xf.c(this))));
      }

      return $$1;
   }

   public boolean a(dtg $$0) {
      csc $$1 = this.a(kq.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dtg $$0) {
      csc $$1 = this.a(kq.m);
      return $$1 != null && $$1.a($$0);
   }

   public int G() {
      return this.p;
   }

   public void d(int $$0) {
      this.p = $$0;
   }

   public int H() {
      return this.e() ? 0 : this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public void f(int $$0) {
      if (!this.e() && this.H() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.H() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable btn $$1) {
      if ($$1 == null || !$$1.fL()) {
         this.h($$0);
      }
   }

   public cuq b(int $$0, @Nullable btn $$1) {
      cuq $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dcw $$0, btn $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cjh $$0) {
      this.g().a($$0);
   }

   public avo I() {
      return this.g().ap_();
   }

   public avo J() {
      return this.g().aq_();
   }

   public avo K() {
      return this.g().e();
   }

   public boolean a(brk $$0) {
      return !this.b(kq.w) || !$$0.a(awg.i);
   }
}
