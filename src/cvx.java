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

public final class cvx implements ko {
   public static final Codec<jp<cvt>> a = lx.g
      .r()
      .validate($$0 -> $$0.a(cwb.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cvx> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cvx::i),
                     ays.a(1, 99).fieldOf("count").orElse(1).forGetter(cvx::L),
                     kq.b.optionalFieldOf("components", kq.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cvx::new)
         )
   );
   public static final Codec<cvx> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cvx::i), kq.b.optionalFieldOf("components", kq.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cvx($$0x, 1, $$1))
         )
   );
   public static final Codec<cvx> d = b.validate(cvx::c);
   public static final Codec<cvx> e = c.validate(cvx::c);
   public static final Codec<cvx> f = ays.f(b).xmap($$0 -> $$0.orElse(cvx.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cvx> g = a.xmap(cvx::new, cvx::i);
   public static final zf<ws, cvx> h = new zf<ws, cvx>() {
      private static final zf<ws, jp<cvt>> a = zd.b(ly.K);

      public cvx a(ws $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cvx.k;
         } else {
            jp<cvt> $$2 = a.decode($$0);
            kq $$3 = kq.c.decode($$0);
            return new cvx($$2, $$1, $$3);
         }
      }

      public void a(ws $$0, cvx $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.L());
            a.encode($$0, $$1.i());
            kq.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zf<ws, cvx> i = new zf<ws, cvx>() {
      public cvx a(ws $$0) {
         cvx $$1 = cvx.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(ws $$0, cvx $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cvx.h.encode($$0, $$1);
         }
      }
   };
   public static final zf<ws, List<cvx>> j = h.a(zd.a(jy::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cvx k = new cvx((Void)null);
   private static final xh m = xh.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cvt p;
   final ku q;
   @Nullable
   private btz r;

   private static DataResult<cvx> c(cvx $$0) {
      DataResult<bao> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.L() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.L() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zf<ws, cvx> a(final zf<ws, cvx> $$0) {
      return new zf<ws, cvx>() {
         public cvx a(ws $$0x) {
            cvx $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alf<bao> $$2 = $$0.H().a(azl.a);
               cvx.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(ws $$0x, cvx $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<ctq> b() {
      return this.h().j(this);
   }

   @Override
   public kp a() {
      return (kp)(!this.f() ? this.q : kp.a);
   }

   public void c() {
      this.q.f();
   }

   public kp d() {
      return !this.f() ? this.h().g() : kp.a;
   }

   public kq e() {
      return !this.f() ? this.q.g() : kq.a;
   }

   public cvx(deu $$0) {
      this($$0, 1);
   }

   public cvx(jp<cvt> $$0) {
      this($$0.a(), 1);
   }

   public cvx(jp<cvt> $$0, int $$1, kq $$2) {
      this($$0.a(), $$1, ku.a($$0.a().g(), $$2));
   }

   public cvx(jp<cvt> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cvx(deu $$0, int $$1) {
      this($$0, $$1, new ku($$0.j().g()));
   }

   private cvx(deu $$0, int $$1, ku $$2) {
      this.p = $$0.j();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cvx(@Nullable Void $$0) {
      this.p = null;
      this.q = new ku(kp.a);
   }

   public static DataResult<bao> a(kp $$0) {
      if ($$0.b(kt.d) && $$0.a(kt.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cyn $$1 = $$0.a(kt.ak, cyn.a);

         for (cvx $$2 : $$1.d()) {
            int $$3 = $$2.L();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bao.a);
      }
   }

   public static Optional<cvx> a(jr.a $$0, vg $$1) {
      return b.parse($$0.a(ux.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cvx a(jr.a $$0, uj $$1) {
      return $$1.g() ? k : a($$0, (vg)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cwb.a || this.n <= 0;
   }

   public boolean a(cra $$0) {
      return this.f() || this.h().a($$0);
   }

   public cvx a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cvx $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cvx g() {
      if (this.f()) {
         return k;
      } else {
         cvx $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cvt h() {
      return this.f() ? cwb.a : this.p;
   }

   public jp<cvt> i() {
      return this.h().f();
   }

   public boolean a(axp<cvt> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cvt $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jp<cvt>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jp<cvt> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(jt<cvt> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axp<cvt>> j() {
      return this.h().f().c();
   }

   public bry a(czo $$0) {
      coh $$1 = $$0.o();
      jg $$2 = $$0.a();
      if ($$1 != null && !$$1.gl().e && !this.a(new dvh($$0.q(), $$2, false))) {
         return bry.e;
      } else {
         cvt $$3 = this.h();
         bry $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bry.d $$5 && $$5.c()) {
            $$1.b(awu.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dvd $$0) {
      return this.h().a(this, $$0);
   }

   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = this.v();
      boolean $$4 = this.a((buv)$$1) <= 0;
      bry $$5 = this.h().a($$0, $$1, $$2);
      return (bry)($$4 && $$5 instanceof bry.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cvx a(dev $$0, buv $$1) {
      cvx $$2 = this.v();
      cvx $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cvx a(buv $$0, cvx $$1) {
      czb $$2 = $$1.a(kt.y);
      cza $$3 = $$1.a(kt.z);
      int $$4 = $$1.L();
      cvx $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a($$0, this, $$4);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vg b(jr.a $$0, vg $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vg)b.encode(this, $$0.a(ux.a), $$1).getOrThrow();
      }
   }

   public vg a(jr.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vg)b.encodeStart($$0.a(ux.a), this).getOrThrow();
      }
   }

   public vg b(jr.a $$0) {
      return (vg)(this.f() ? new uj() : this.b($$0, new uj()));
   }

   public int k() {
      return this.a(kt.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.b(kt.d) && !this.b(kt.f) && this.b(kt.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azj.a(this.a(kt.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kt.e, Integer.valueOf(azj.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kt.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, arm $$1, @Nullable arn $$2, Consumer<cvt> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 > 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arm $$1, @Nullable arn $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fX()) {
         return 0;
      } else {
         return $$0 > 0 ? dbo.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arn $$1, Consumer<cvt> $$2) {
      if ($$1 != null) {
         an.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cvt $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, coh $$1) {
      if ($$1 instanceof arn $$2) {
         int $$3 = this.a($$0, $$2.B(), $$2);
         if ($$3 <= 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, buv $$1, buh $$2) {
      if ($$1.dX() instanceof arm $$3) {
         this.a($$0, $$3, $$1 instanceof arn $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cvx a(int $$0, deu $$1, buv $$2, buh $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cvx $$4 = this.b($$1, 1);
         if ($$4.m()) {
            $$4.b(0);
         }

         return $$4;
      } else {
         return this;
      }
   }

   public boolean s() {
      return this.h().c(this);
   }

   public int t() {
      return this.h().d(this);
   }

   public int u() {
      return this.h().e(this);
   }

   public boolean a(ctg $$0, crt $$1, coh $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cvx $$0, ctg $$1, crt $$2, coh $$3, bvn $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(buv $$0, buv $$1) {
      cvt $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof coh $$3) {
            $$3.b(awu.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(buv $$0, buv $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dev $$0, dvd $$1, jg $$2, coh $$3) {
      cvt $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awu.c.b($$4));
      }
   }

   public boolean b(dvd $$0) {
      return this.h().b(this, $$0);
   }

   public bry a(coh $$0, buv $$1, brx $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cvx v() {
      if (this.f()) {
         return k;
      } else {
         cvx $$0 = new cvx(this.h(), this.n, this.q.h());
         $$0.d(this.K());
         return $$0;
      }
   }

   public cvx c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cvx $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cvx a(deu $$0) {
      return this.a($$0, this.L());
   }

   public cvx a(deu $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cvx b(deu $$0, int $$1) {
      return new cvx($$0.j().f(), $$1, this.q.g());
   }

   public static boolean a(cvx $$0, cvx $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cvx> $$0, List<cvx> $$1) {
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

   public static boolean b(cvx $$0, cvx $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cvx $$0, cvx $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cvx> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cvx $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cvx> $$0) {
      int $$1 = 0;

      for (cvx $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.L() + " " + this.h();
   }

   public void a(dev $$0, btz $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dev $$0, coh $$1, int $$2) {
      $$1.a(awu.b.b(this.h()), $$2);
      this.h().b(this, $$0, $$1);
   }

   public void a(dev $$0) {
      this.h().a(this, $$0);
   }

   public int a(buv $$0) {
      return this.h().a(this, $$0);
   }

   public cvz w() {
      return this.h().a(this);
   }

   public void a(dev $$0, buv $$1, int $$2) {
      cvx $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cvx $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fC(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().k(this);
   }

   @Nullable
   public <T> T b(ks<? super T> $$0, @Nullable T $$1) {
      return this.q.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(ks<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(ks<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(ks<? extends T> $$0) {
      return this.q.d($$0);
   }

   public void a(kq $$0) {
      kq $$1 = this.q.g();
      this.q.a($$0);
      Optional<Error<cvx>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         l.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.q.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kq $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public void b(kp $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public xh y() {
      xh $$0 = this.a(kt.g);
      if ($$0 != null) {
         return $$0;
      } else {
         czd $$1 = this.a(kt.S);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bag.h($$2)) {
               return xh.b($$2);
            }
         }

         return this.z();
      }
   }

   public xh z() {
      return this.h().c_(this);
   }

   public xh A() {
      xv $$0 = xh.i().b(this.y()).a(this.C().a());
      if (this.b(kt.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends cyy> void a(ks<T> $$0, cvt.b $$1, Consumer<xh> $$2, cxp $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xh> a(cvt.b $$0, @Nullable coh $$1, cxp $$2) {
      if (!$$2.b() && this.b(kt.r)) {
         return List.of();
      } else {
         List<xh> $$3 = Lists.newArrayList();
         $$3.add(this.A());
         if (!$$2.a() && !this.b(kt.g) && this.a(cwb.rV)) {
            esw $$4 = this.a(kt.K);
            if ($$4 != null) {
               $$3.add(cwk.a($$4));
            }
         }

         Consumer<xh> $$5 = $$3::add;
         if (!this.b(kt.q)) {
            this.h().a(this, $$0, $$3, $$2);
         }

         this.a(kt.aa, $$0, $$5, $$2);
         this.a(kt.T, $$0, $$5, $$2);
         this.a(kt.H, $$0, $$5, $$2);
         this.a(kt.l, $$0, $$5, $$2);
         this.a(kt.I, $$0, $$5, $$2);
         this.a(kt.j, $$0, $$5, $$2);
         this.a($$5, $$1);
         this.a(kt.f, $$0, $$5, $$2);
         this.a(kt.Z, $$0, $$5, $$2);
         this.a(kt.Q, $$0, $$5, $$2);
         cts $$6 = this.a(kt.n);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xg.a);
            $$5.accept(cts.c);
            $$6.a($$5);
         }

         cts $$7 = this.a(kt.m);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xg.a);
            $$5.accept(cts.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xh.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xh.b(lx.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.q.d();
            if ($$8 > 0) {
               $$3.add(xh.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dX().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xh> $$0, @Nullable coh $$1) {
      cym $$2 = this.a(kt.o, cym.a);
      if ($$2.c()) {
         for (bui $$3 : bui.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xg.a);
                  $$0.accept(xh.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xh> $$0, @Nullable coh $$1, jp<bvy> $$2, bwb $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cvt.f)) {
            $$4 += $$1.i(bwd.c);
            $$5 = true;
         } else if ($$3.a(cvt.g)) {
            $$4 += $$1.i(bwd.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bwb.a.b || $$3.d() == bwb.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bwd.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xg.a().b(xh.a("attribute.modifier.equals." + $$3.d().a(), cym.d.format($$6), xh.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xh.a("attribute.modifier.plus." + $$3.d().a(), cym.d.format($$6), xh.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xh.a("attribute.modifier.take." + $$3.d().a(), cym.d.format(-$$6), xh.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean B() {
      Boolean $$0 = this.a(kt.u);
      return $$0 != null ? $$0 : this.h().d_(this);
   }

   public cwu C() {
      cwu $$0 = this.a(kt.k, cwu.a);
      if (!this.E()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cwu.c;
            case c -> cwu.d;
            default -> $$0;
         };
      }
   }

   public boolean D() {
      if (!this.b(kt.C)) {
         return false;
      } else {
         dbs $$0 = this.a(kt.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jp<dbm> $$0, int $$1) {
      dbo.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean E() {
      return !this.a(kt.l, dbs.a).d();
   }

   public dbs F() {
      return this.a(kt.l, dbs.a);
   }

   public boolean G() {
      return this.r instanceof ckj;
   }

   public void a(@Nullable btz $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public ckj H() {
      return this.r instanceof ckj ? (ckj)this.I() : null;
   }

   @Nullable
   public btz I() {
      return !this.f() ? this.r : null;
   }

   public void a(bui $$0, BiConsumer<jp<bvy>, bwb> $$1) {
      cym $$2 = this.a(kt.o, cym.a);
      $$2.a($$0, $$1);
      dbo.a(this, $$0, $$1);
   }

   public void a(buh $$0, BiConsumer<jp<bvy>, bwb> $$1) {
      cym $$2 = this.a(kt.o, cym.a);
      $$2.a($$0, $$1);
      dbo.a(this, $$0, $$1);
   }

   public xh J() {
      xv $$0 = xh.i().b(this.y());
      if (this.b(kt.g)) {
         $$0.a(n.u);
      }

      xv $$1 = xk.a((xh)$$0);
      if (!this.f()) {
         $$1.a(this.C().a()).a($$0x -> $$0x.a(new xn(xn.a.b, new xn.c(this))));
      }

      return $$1;
   }

   public boolean a(dvh $$0) {
      cts $$1 = this.a(kt.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dvh $$0) {
      cts $$1 = this.a(kt.n);
      return $$1 != null && $$1.a($$0);
   }

   public int K() {
      return this.o;
   }

   public void d(int $$0) {
      this.o = $$0;
   }

   public int L() {
      return this.f() ? 0 : this.n;
   }

   public void e(int $$0) {
      this.n = $$0;
   }

   public void f(int $$0) {
      if (!this.f() && this.L() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.L() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable buv $$1) {
      if ($$1 == null || !$$1.fX()) {
         this.h($$0);
      }
   }

   public cvx b(int $$0, @Nullable buv $$1) {
      cvx $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dev $$0, buv $$1, int $$2) {
      cyd $$3 = this.a(kt.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.ea(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(ckq $$0) {
      this.h().a($$0);
   }

   public awj M() {
      return this.h().a();
   }

   public boolean a(bsp $$0) {
      return !this.b(kt.A) || !$$0.a(axb.i);
   }

   public boolean b(cvx $$0) {
      dbu $$1 = this.a(kt.E);
      return $$1 != null && $$1.a($$0);
   }
}
