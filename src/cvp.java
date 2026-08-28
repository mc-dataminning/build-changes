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

public final class cvp implements km {
   public static final Codec<jn<cvk>> a = lu.g
      .r()
      .validate($$0 -> $$0.a(cvt.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cvp> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cvp::i),
                     aym.a(1, 99).fieldOf("count").orElse(1).forGetter(cvp::J),
                     ko.b.optionalFieldOf("components", ko.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cvp::new)
         )
   );
   public static final Codec<cvp> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cvp::i), ko.b.optionalFieldOf("components", ko.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cvp($$0x, 1, $$1))
         )
   );
   public static final Codec<cvp> d = b.validate(cvp::c);
   public static final Codec<cvp> e = c.validate(cvp::c);
   public static final Codec<cvp> f = aym.e(b).xmap($$0 -> $$0.orElse(cvp.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cvp> g = a.xmap(cvp::new, cvp::i);
   public static final zb<wo, cvp> h = new zb<wo, cvp>() {
      private static final zb<wo, jn<cvk>> a = yz.b(lv.K);

      public cvp a(wo $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cvp.k;
         } else {
            jn<cvk> $$2 = a.decode($$0);
            ko $$3 = ko.c.decode($$0);
            return new cvp($$2, $$1, $$3);
         }
      }

      public void a(wo $$0, cvp $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.J());
            a.encode($$0, $$1.i());
            ko.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zb<wo, cvp> i = new zb<wo, cvp>() {
      public cvp a(wo $$0) {
         cvp $$1 = cvp.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wo $$0, cvp $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cvp.h.encode($$0, $$1);
         }
      }
   };
   public static final zb<wo, List<cvp>> j = h.a(yz.a(jw::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cvp k = new cvp((Void)null);
   private static final xd m = xd.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cvk p;
   final ks q;
   @Nullable
   private bto r;

   private static DataResult<cvp> c(cvp $$0) {
      DataResult<bai> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.J() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.J() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zb<wo, cvp> a(final zb<wo, cvp> $$0) {
      return new zb<wo, cvp>() {
         public cvp a(wo $$0x) {
            cvp $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               ala<bai> $$2 = $$0.H().a(azf.a);
               cvp.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wo $$0x, cvp $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<ctd> b() {
      return this.h().j(this);
   }

   @Override
   public kn a() {
      return (kn)(!this.f() ? this.q : kn.a);
   }

   public void c() {
      this.q.f();
   }

   public kn d() {
      return !this.f() ? this.h().o() : kn.a;
   }

   public ko e() {
      return !this.f() ? this.q.g() : ko.a;
   }

   public cvp(def $$0) {
      this($$0, 1);
   }

   public cvp(jn<cvk> $$0) {
      this($$0.a(), 1);
   }

   public cvp(jn<cvk> $$0, int $$1, ko $$2) {
      this($$0.a(), $$1, ks.a($$0.a().o(), $$2));
   }

   public cvp(jn<cvk> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cvp(def $$0, int $$1) {
      this($$0, $$1, new ks($$0.q().o()));
   }

   private cvp(def $$0, int $$1, ks $$2) {
      this.p = $$0.q();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cvp(@Nullable Void $$0) {
      this.p = null;
      this.q = new ks(kn.a);
   }

   public static DataResult<bai> a(kn $$0) {
      if ($$0.b(kr.d) && $$0.a(kr.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cyl $$1 = $$0.a(kr.ag, cyl.a);

         for (cvp $$2 : $$1.d()) {
            int $$3 = $$2.J();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bai.a);
      }
   }

   public static Optional<cvp> a(jp.a $$0, vc $$1) {
      return b.parse($$0.a(ut.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cvp a(jp.a $$0, uf $$1) {
      return $$1.g() ? k : a($$0, (vc)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cvt.a || this.n <= 0;
   }

   public boolean a(cqn $$0) {
      return this.f() || this.h().a($$0);
   }

   public cvp a(int $$0) {
      int $$1 = Math.min($$0, this.J());
      cvp $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cvp g() {
      if (this.f()) {
         return k;
      } else {
         cvp $$0 = this.u();
         this.e(0);
         return $$0;
      }
   }

   public cvk h() {
      return this.f() ? cvt.a : this.p;
   }

   public jn<cvk> i() {
      return this.h().n();
   }

   public boolean a(axj<cvk> $$0) {
      return this.h().n().a($$0);
   }

   public boolean a(cvk $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jn<cvk>> $$0) {
      return $$0.test(this.h().n());
   }

   public boolean a(jn<cvk> $$0) {
      return this.h().n() == $$0;
   }

   public boolean a(jr<cvk> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axj<cvk>> j() {
      return this.h().n().c();
   }

   public brp a(czm $$0) {
      cnu $$1 = $$0.o();
      je $$2 = $$0.a();
      if ($$1 != null && !$$1.gd().e && !this.a(new dus($$0.q(), $$2, false))) {
         return brp.e;
      } else {
         cvk $$3 = this.h();
         brp $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof brp.d $$5 && $$5.c()) {
            $$1.b(awo.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(duo $$0) {
      return this.h().a(this, $$0);
   }

   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = this.u();
      boolean $$4 = this.a((buk)$$1) <= 0;
      brp $$5 = this.h().a($$0, $$1, $$2);
      return (brp)($$4 && $$5 instanceof brp.d $$6 ? $$6.a(this.a($$1, $$3)) : $$5);
   }

   public cvp a(deg $$0, buk $$1) {
      cvp $$2 = this.u();
      cvp $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cvp a(buk $$0, cvp $$1) {
      cyz $$2 = $$1.a(kr.x);
      cyy $$3 = $$1.a(kr.y);
      int $$4 = $$1.J();
      cvp $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a($$0, this, $$4);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vc b(jp.a $$0, vc $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vc)b.encode(this, $$0.a(ut.a), $$1).getOrThrow();
      }
   }

   public vc a(jp.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vc)b.encodeStart($$0.a(ut.a), this).getOrThrow();
      }
   }

   public vc b(jp.a $$0) {
      return (vc)(this.f() ? new uf() : this.b($$0, new uf()));
   }

   public int k() {
      return this.a(kr.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.b(kr.d) && !this.b(kr.f) && this.b(kr.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azd.a(this.a(kr.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kr.e, Integer.valueOf(azd.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kr.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public void a(int $$0, arh $$1, @Nullable ari $$2, Consumer<cvk> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 > 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arh $$1, @Nullable ari $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fQ()) {
         return 0;
      } else {
         return $$0 > 0 ? dbm.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable ari $$1, Consumer<cvk> $$2) {
      if ($$1 != null) {
         an.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cvk $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cnu $$1) {
      if ($$1 instanceof ari $$2) {
         int $$3 = this.a($$0, $$2.B(), $$2);
         if ($$3 <= 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, buk $$1, btw $$2) {
      if ($$1.dS() instanceof arh $$3) {
         this.a($$0, $$3, $$1 instanceof ari $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cvp a(int $$0, def $$1, buk $$2, btw $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cvp $$4 = this.b($$1, 1);
         if ($$4.m()) {
            $$4.b(0);
         }

         return $$4;
      } else {
         return this;
      }
   }

   public boolean r() {
      return this.h().c(this);
   }

   public int s() {
      return this.h().d(this);
   }

   public int t() {
      return this.h().e(this);
   }

   public boolean a(cst $$0, crg $$1, cnu $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cvp $$0, cst $$1, crg $$2, cnu $$3, bvb $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(buk $$0, buk $$1) {
      cvk $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cnu $$3) {
            $$3.b(awo.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(buk $$0, buk $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(deg $$0, duo $$1, je $$2, cnu $$3) {
      cvk $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awo.c.b($$4));
      }
   }

   public boolean b(duo $$0) {
      return this.h().b(this, $$0);
   }

   public brp a(cnu $$0, buk $$1, bro $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cvp u() {
      if (this.f()) {
         return k;
      } else {
         cvp $$0 = new cvp(this.h(), this.n, this.q.h());
         $$0.d(this.I());
         return $$0;
      }
   }

   public cvp c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cvp $$1 = this.u();
         $$1.e($$0);
         return $$1;
      }
   }

   public cvp a(def $$0) {
      return this.a($$0, this.J());
   }

   public cvp a(def $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cvp b(def $$0, int $$1) {
      return new cvp($$0.q().n(), $$1, this.q.g());
   }

   public static boolean a(cvp $$0, cvp $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.J() != $$1.J() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cvp> $$0, List<cvp> $$1) {
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

   public static boolean b(cvp $$0, cvp $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cvp $$0, cvp $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cvp> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cvp $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cvp> $$0) {
      int $$1 = 0;

      for (cvp $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String v() {
      return this.h().d_(this);
   }

   @Override
   public String toString() {
      return this.J() + " " + this.h();
   }

   public void a(deg $$0, bto $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(deg $$0, cnu $$1, int $$2) {
      $$1.a(awo.b.b(this.h()), $$2);
      this.h().b(this, $$0, $$1);
   }

   public void a(deg $$0) {
      this.h().a(this, $$0);
   }

   public int a(buk $$0) {
      return this.h().a(this, $$0);
   }

   public cvr w() {
      return this.h().a(this);
   }

   public void a(deg $$0, buk $$1, int $$2) {
      cvp $$3 = this.u();
      this.h().a(this, $$0, $$1, $$2);
      cvp $$4 = this.a($$1, $$3);
      if ($$4 != this) {
         $$1.a($$1.fw(), $$4);
      }
   }

   public boolean x() {
      return this.h().k(this);
   }

   @Nullable
   public <T> T b(kq<? super T> $$0, @Nullable T $$1) {
      return this.q.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kq<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kq<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kq<? extends T> $$0) {
      return this.q.d($$0);
   }

   public void a(ko $$0) {
      ko $$1 = this.q.g();
      this.q.a($$0);
      Optional<Error<cvp>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         l.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.q.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(ko $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public void b(kn $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public xd y() {
      xd $$0 = this.a(kr.g);
      if ($$0 != null) {
         return $$0;
      } else {
         czb $$1 = this.a(kr.O);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!baa.h($$2)) {
               return xd.b($$2);
            }
         }

         xd $$3 = this.a(kr.h);
         return $$3 != null ? $$3 : this.h().m(this);
      }
   }

   private <T extends cyw> void a(kq<T> $$0, cvk.b $$1, Consumer<xd> $$2, cxh $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xd> a(cvk.b $$0, @Nullable cnu $$1, cxh $$2) {
      if (!$$2.b() && this.b(kr.q)) {
         return List.of();
      } else {
         List<xd> $$3 = Lists.newArrayList();
         xr $$4 = xd.i().b(this.y()).a(this.A().a());
         if (this.b(kr.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kr.g) && this.a(cvt.rV)) {
            esh $$5 = this.a(kr.G);
            if ($$5 != null) {
               $$3.add(cwc.a($$5));
            }
         }

         Consumer<xd> $$6 = $$3::add;
         if (!this.b(kr.p)) {
            this.h().a(this, $$0, $$3, $$2);
         }

         this.a(kr.W, $$0, $$6, $$2);
         this.a(kr.P, $$0, $$6, $$2);
         this.a(kr.D, $$0, $$6, $$2);
         this.a(kr.k, $$0, $$6, $$2);
         this.a(kr.E, $$0, $$6, $$2);
         this.a(kr.i, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kr.f, $$0, $$6, $$2);
         this.a(kr.V, $$0, $$6, $$2);
         this.a(kr.M, $$0, $$6, $$2);
         ctf $$7 = this.a(kr.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(xc.a);
            $$6.accept(ctf.c);
            $$7.a($$6);
         }

         ctf $$8 = this.a(kr.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(xc.a);
            $$6.accept(ctf.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xd.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xd.b(lu.g.b(this.h()).toString()).a(n.i));
            int $$9 = this.q.d();
            if ($$9 > 0) {
               $$3.add(xd.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dS().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xd> $$0, @Nullable cnu $$1) {
      cyk $$2 = this.a(kr.n, cyk.a);
      if ($$2.c()) {
         for (btx $$3 : btx.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xc.a);
                  $$0.accept(xd.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xd> $$0, @Nullable cnu $$1, jn<bvm> $$2, bvp $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cvk.f)) {
            $$4 += $$1.i(bvr.c);
            $$5 = true;
         } else if ($$3.a(cvk.g)) {
            $$4 += $$1.i(bvr.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bvp.a.b || $$3.d() == bvp.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bvr.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xc.a().b(xd.a("attribute.modifier.equals." + $$3.d().a(), cyk.d.format($$6), xd.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xd.a("attribute.modifier.plus." + $$3.d().a(), cyk.d.format($$6), xd.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xd.a("attribute.modifier.take." + $$3.d().a(), cyk.d.format(-$$6), xd.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean z() {
      Boolean $$0 = this.a(kr.t);
      return $$0 != null ? $$0 : this.h().e_(this);
   }

   public cwm A() {
      cwm $$0 = this.a(kr.j, cwm.a);
      if (!this.C()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cwm.c;
            case c -> cwm.d;
            default -> $$0;
         };
      }
   }

   public boolean B() {
      if (!this.b(kr.B)) {
         return false;
      } else {
         dbq $$0 = this.a(kr.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jn<dbk> $$0, int $$1) {
      dbm.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean C() {
      return !this.a(kr.k, dbq.a).d();
   }

   public dbq D() {
      return this.a(kr.k, dbq.a);
   }

   public boolean E() {
      return this.r instanceof cjx;
   }

   public void a(@Nullable bto $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public cjx F() {
      return this.r instanceof cjx ? (cjx)this.G() : null;
   }

   @Nullable
   public bto G() {
      return !this.f() ? this.r : null;
   }

   public void a(btx $$0, BiConsumer<jn<bvm>, bvp> $$1) {
      cyk $$2 = this.a(kr.n, cyk.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.h().h().a($$0, $$1);
      }

      dbm.a(this, $$0, $$1);
   }

   public void a(btw $$0, BiConsumer<jn<bvm>, bvp> $$1) {
      cyk $$2 = this.a(kr.n, cyk.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.h().h().a($$0, $$1);
      }

      dbm.a(this, $$0, $$1);
   }

   public xd H() {
      xr $$0 = xd.i().b(this.y());
      if (this.b(kr.g)) {
         $$0.a(n.u);
      }

      xr $$1 = xg.a((xd)$$0);
      if (!this.f()) {
         $$1.a(this.A().a()).a($$0x -> $$0x.a(new xj(xj.a.b, new xj.c(this))));
      }

      return $$1;
   }

   public boolean a(dus $$0) {
      ctf $$1 = this.a(kr.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dus $$0) {
      ctf $$1 = this.a(kr.m);
      return $$1 != null && $$1.a($$0);
   }

   public int I() {
      return this.o;
   }

   public void d(int $$0) {
      this.o = $$0;
   }

   public int J() {
      return this.f() ? 0 : this.n;
   }

   public void e(int $$0) {
      this.n = $$0;
   }

   public void f(int $$0) {
      if (!this.f() && this.J() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.J() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable buk $$1) {
      if ($$1 == null || !$$1.fQ()) {
         this.h($$0);
      }
   }

   public cvp b(int $$0, @Nullable buk $$1) {
      cvp $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(deg $$0, buk $$1, int $$2) {
      cyb $$3 = this.a(kr.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dV(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cke $$0) {
      this.h().a($$0);
   }

   public awd K() {
      return this.h().e();
   }

   public boolean a(bsg $$0) {
      return !this.b(kr.z) || !$$0.a(awv.i);
   }

   public boolean b(cvp $$0) {
      dbs $$1 = this.a(kr.C);
      return $$1 != null ? $$1.a($$0) : this.h().a(this, $$0);
   }

   public int L() {
      dbi $$0 = this.a(kr.B);
      return $$0 != null ? $$0.a() : 0;
   }
}
