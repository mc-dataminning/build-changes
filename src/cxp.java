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

public final class cxp implements kp {
   public static final Codec<cxp> a = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     cxl.e.fieldOf("id").forGetter(cxp::i),
                     azn.a(1, 99).fieldOf("count").orElse(1).forGetter(cxp::L),
                     kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.p.g())
                  )
                  .apply($$0, cxp::new)
         )
   );
   public static final Codec<cxp> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cxl.e.fieldOf("id").forGetter(cxp::i), kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.p.g()))
                  .apply($$0, ($$0x, $$1) -> new cxp($$0x, 1, $$1))
         )
   );
   public static final Codec<cxp> c = a.validate(cxp::c);
   public static final Codec<cxp> d = b.validate(cxp::c);
   public static final Codec<cxp> e = azn.f(a).xmap($$0 -> $$0.orElse(cxp.j), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cxp> f = cxl.e.xmap(cxp::new, cxp::i);
   public static final zt<xg, cxp> g = new zt<xg, cxp>() {
      private static final zt<xg, jq<cxl>> a = zr.b(mb.K);

      public cxp a(xg $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cxp.j;
         } else {
            jq<cxl> $$2 = a.decode($$0);
            kr $$3 = kr.c.decode($$0);
            return new cxp($$2, $$1, $$3);
         }
      }

      public void a(xg $$0, cxp $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.L());
            a.encode($$0, $$1.i());
            kr.c.encode($$0, $$1.p.g());
         }
      }
   };
   public static final zt<xg, cxp> h = new zt<xg, cxp>() {
      public cxp a(xg $$0) {
         cxp $$1 = cxp.g.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(xg $$0, cxp $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cxp.g.encode($$0, $$1);
         }
      }
   };
   public static final zt<xg, List<cxp>> i = g.a(zr.a(jz::a));
   private static final Logger k = LogUtils.getLogger();
   public static final cxp j = new cxp((Void)null);
   private static final xv l = xv.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final cxl o;
   final kv p;
   @Nullable
   private bvk q;

   private static DataResult<cxp> c(cxp $$0) {
      DataResult<bbk> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.L() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.L() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zt<xg, cxp> a(final zt<xg, cxp> $$0) {
      return new zt<xg, cxp>() {
         public cxp a(xg $$0x) {
            cxp $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alx<bbk> $$2 = $$0.H().a(bag.a);
               cxp.a.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(xg $$0x, cxp $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cvj> b() {
      return this.h().k(this);
   }

   @Override
   public kq a() {
      return (kq)(!this.f() ? this.p : kq.a);
   }

   public void c() {
      this.p.f();
   }

   public kq d() {
      return !this.f() ? this.h().g() : kq.a;
   }

   public kr e() {
      return !this.f() ? this.p.g() : kr.a;
   }

   public cxp(dhh $$0) {
      this($$0, 1);
   }

   public cxp(jq<cxl> $$0) {
      this($$0.a(), 1);
   }

   public cxp(jq<cxl> $$0, int $$1, kr $$2) {
      this($$0.a(), $$1, kv.a($$0.a().g(), $$2));
   }

   public cxp(jq<cxl> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cxp(dhh $$0, int $$1) {
      this($$0, $$1, new kv($$0.j().g()));
   }

   private cxp(dhh $$0, int $$1, kv $$2) {
      this.o = $$0.j();
      this.m = $$1;
      this.p = $$2;
      this.h().l(this);
   }

   private cxp(@Nullable Void $$0) {
      this.o = null;
      this.p = new kv(kq.a);
   }

   public static DataResult<bbk> a(kq $$0) {
      if ($$0.b(ku.d) && $$0.a(ku.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dah $$1 = $$0.a(ku.al, dah.a);

         for (cxp $$2 : $$1.d()) {
            int $$3 = $$2.L();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bbk.a);
      }
   }

   public static Optional<cxp> a(js.a $$0, vu $$1) {
      return a.parse($$0.a(vl.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cxp a(js.a $$0, ux $$1) {
      return $$1.g() ? j : a($$0, (vu)$$1).orElse(j);
   }

   public boolean f() {
      return this == j || this.o == cxt.a || this.m <= 0;
   }

   public boolean a(cst $$0) {
      return this.f() || this.h().a($$0);
   }

   public cxp a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cxp $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cxp g() {
      if (this.f()) {
         return j;
      } else {
         cxp $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cxl h() {
      return this.f() ? cxt.a : this.o;
   }

   public jq<cxl> i() {
      return this.h().f();
   }

   public boolean a(ayk<cxl> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cxl $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jq<cxl>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jq<cxl> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(ju<cxl> $$0) {
      return $$0.a(this.i());
   }

   public Stream<ayk<cxl>> j() {
      return this.h().f().c();
   }

   public btj a(dbi $$0) {
      cpx $$1 = $$0.o();
      jh $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new dxz($$0.q(), $$2, false))) {
         return btj.e;
      } else {
         cxl $$3 = this.h();
         btj $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof btj.d $$5 && $$5.c()) {
            $$1.b(axp.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dxv $$0) {
      return this.h().a(this, $$0);
   }

   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = this.v();
      boolean $$4 = this.a((bwg)$$1) <= 0;
      btj $$5 = this.h().a($$0, $$1, $$2);
      return (btj)($$4 && $$5 instanceof btj.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cxp a(dhi $$0, bwg $$1) {
      cxp $$2 = this.v();
      cxp $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cxp a(bwg $$0, cxp $$1) {
      dav $$2 = $$1.a(ku.y);
      dau $$3 = $$1.a(ku.z);
      int $$4 = $$1.L();
      cxp $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fV(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vu b(js.a $$0, vu $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vu)a.encode(this, $$0.a(vl.a), $$1).getOrThrow();
      }
   }

   public vu a(js.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vu)a.encodeStart($$0.a(vl.a), this).getOrThrow();
      }
   }

   public vu b(js.a $$0) {
      return (vu)(this.f() ? new ux() : this.b($$0, new ux()));
   }

   public int k() {
      return this.a(ku.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.b(ku.d) && !this.b(ku.f) && this.b(ku.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return bae.a(this.a(ku.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(ku.e, Integer.valueOf(bae.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(ku.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, ash $$1, @Nullable asi $$2, Consumer<cxl> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, ash $$1, @Nullable asi $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fV()) {
         return 0;
      } else {
         return $$0 > 0 ? deb.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable asi $$1, Consumer<cxl> $$2) {
      if ($$1 != null) {
         ao.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cxl $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cpx $$1) {
      if ($$1 instanceof asi $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bwg $$1, bvs $$2) {
      if ($$1.dW() instanceof ash $$3) {
         this.a($$0, $$3, $$1 instanceof asi $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cxp a(int $$0, dhh $$1, bwg $$2, bvs $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cxp $$4 = this.b($$1, 1);
         if ($$4.m()) {
            $$4.b(0);
         }

         return $$4;
      } else {
         return this;
      }
   }

   public boolean s() {
      return this.h().d(this);
   }

   public int t() {
      return this.h().e(this);
   }

   public int u() {
      return this.h().f(this);
   }

   public boolean a(cuz $$0, ctm $$1, cpx $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cxp $$0, cuz $$1, ctm $$2, cpx $$3, bwy $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bwg $$0, bwg $$1) {
      cxl $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cpx $$3) {
            $$3.b(axp.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bwg $$0, bwg $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dhi $$0, dxv $$1, jh $$2, cpx $$3) {
      cxl $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(axp.c.b($$4));
      }
   }

   public boolean b(dxv $$0) {
      return this.h().b(this, $$0);
   }

   public btj a(cpx $$0, bwg $$1, bti $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cxp v() {
      if (this.f()) {
         return j;
      } else {
         cxp $$0 = new cxp(this.h(), this.m, this.p.h());
         $$0.d(this.K());
         return $$0;
      }
   }

   public cxp c(int $$0) {
      if (this.f()) {
         return j;
      } else {
         cxp $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cxp a(dhh $$0) {
      return this.a($$0, this.L());
   }

   public cxp a(dhh $$0, int $$1) {
      return this.f() ? j : this.b($$0, $$1);
   }

   private cxp b(dhh $$0, int $$1) {
      return new cxp($$0.j().f(), $$1, this.p.g());
   }

   public static boolean a(cxp $$0, cxp $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cxp> $$0, List<cxp> $$1) {
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

   public static boolean b(cxp $$0, cxp $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cxp $$0, cxp $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<cxp> a(String $$0) {
      return a.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(j), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cxp $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cxp> $$0) {
      int $$1 = 0;

      for (cxp $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.L() + " " + this.h();
   }

   public void a(dhi $$0, bvk $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dhi $$0, cpx $$1, int $$2) {
      $$1.a(axp.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dhi $$0) {
      this.h().a(this, $$0);
   }

   public int a(bwg $$0) {
      return this.h().a(this, $$0);
   }

   public cxr w() {
      return this.h().b(this);
   }

   public void a(dhi $$0, bwg $$1, int $$2) {
      cxp $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cxp $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fA(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().d_(this);
   }

   @Nullable
   public <T> T b(kt<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kt<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kt<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kt<? extends T> $$0) {
      return this.p.d($$0);
   }

   public void a(kr $$0) {
      kr $$1 = this.p.g();
      this.p.a($$0);
      Optional<Error<cxp>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         k.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.p.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kr $$0) {
      this.p.a($$0);
      this.h().l(this);
   }

   public void b(kq $$0) {
      this.p.a($$0);
      this.h().l(this);
   }

   public xv y() {
      xv $$0 = this.a(ku.g);
      if ($$0 != null) {
         return $$0;
      } else {
         dax $$1 = this.a(ku.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bbb.h($$2)) {
               return xv.b($$2);
            }
         }

         return this.z();
      }
   }

   public xv z() {
      return this.h().a(this);
   }

   public xv A() {
      yj $$0 = xv.i().b(this.y()).a(this.C().a());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends das> void a(kt<T> $$0, cxl.b $$1, Consumer<xv> $$2, czh $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xv> a(cxl.b $$0, @Nullable cpx $$1, czh $$2) {
      if (!$$2.b() && this.b(ku.r)) {
         return List.of();
      } else {
         List<xv> $$3 = Lists.newArrayList();
         $$3.add(this.A());
         if (!$$2.a() && !this.b(ku.g)) {
            evp $$4 = this.a(ku.L);
            if ($$4 != null) {
               $$3.add(cyc.a($$4));
            }
         }

         Consumer<xv> $$5 = $$3::add;
         if (!this.b(ku.q)) {
            this.h().a(this, $$0, $$3, $$2);
         }

         this.a(ku.ab, $$0, $$5, $$2);
         this.a(ku.U, $$0, $$5, $$2);
         this.a(ku.I, $$0, $$5, $$2);
         this.a(ku.l, $$0, $$5, $$2);
         this.a(ku.J, $$0, $$5, $$2);
         this.a(ku.j, $$0, $$5, $$2);
         this.a($$5, $$1);
         this.a(ku.f, $$0, $$5, $$2);
         this.a(ku.aa, $$0, $$5, $$2);
         this.a(ku.R, $$0, $$5, $$2);
         cvl $$6 = this.a(ku.n);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xu.a);
            $$5.accept(cvl.c);
            $$6.a($$5);
         }

         cvl $$7 = this.a(ku.m);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xu.a);
            $$5.accept(cvl.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xv.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xv.b(ma.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.p.d();
            if ($$8 > 0) {
               $$3.add(xv.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dW().J())) {
            $$3.add(l);
         }

         return $$3;
      }
   }

   private void a(Consumer<xv> $$0, @Nullable cpx $$1) {
      dag $$2 = this.a(ku.o, dag.a);
      if ($$2.c()) {
         for (bvt $$3 : bvt.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xu.a);
                  $$0.accept(xv.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xv> $$0, @Nullable cpx $$1, jq<bxj> $$2, bxm $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cxl.g)) {
            $$4 += $$1.i(bxo.c);
            $$5 = true;
         } else if ($$3.a(cxl.h)) {
            $$4 += $$1.i(bxo.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bxm.a.b || $$3.d() == bxm.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bxo.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xu.a().b(xv.a("attribute.modifier.equals." + $$3.d().a(), dag.d.format($$6), xv.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xv.a("attribute.modifier.plus." + $$3.d().a(), dag.d.format($$6), xv.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xv.a("attribute.modifier.take." + $$3.d().a(), dag.d.format(-$$6), xv.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean B() {
      Boolean $$0 = this.a(ku.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cym C() {
      cym $$0 = this.a(ku.k, cym.a);
      if (!this.E()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cym.c;
            case c -> cym.d;
            default -> $$0;
         };
      }
   }

   public boolean D() {
      if (!this.b(ku.C)) {
         return false;
      } else {
         def $$0 = this.a(ku.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jq<ddz> $$0, int $$1) {
      deb.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean E() {
      return !this.a(ku.l, def.a).d();
   }

   public def F() {
      return this.a(ku.l, def.a);
   }

   public boolean G() {
      return this.q instanceof clu;
   }

   public void a(@Nullable bvk $$0) {
      if (!this.f()) {
         this.q = $$0;
      }
   }

   @Nullable
   public clu H() {
      return this.q instanceof clu ? (clu)this.I() : null;
   }

   @Nullable
   public bvk I() {
      return !this.f() ? this.q : null;
   }

   public void a(bvt $$0, BiConsumer<jq<bxj>, bxm> $$1) {
      dag $$2 = this.a(ku.o, dag.a);
      $$2.a($$0, $$1);
      deb.a(this, $$0, $$1);
   }

   public void a(bvs $$0, BiConsumer<jq<bxj>, bxm> $$1) {
      dag $$2 = this.a(ku.o, dag.a);
      $$2.a($$0, $$1);
      deb.a(this, $$0, $$1);
   }

   public xv J() {
      yj $$0 = xv.i().b(this.y());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      yj $$1 = xy.a((xv)$$0);
      if (!this.f()) {
         $$1.a(this.C().a()).a($$0x -> $$0x.a(new yb(yb.a.b, new yb.c(this))));
      }

      return $$1;
   }

   public boolean a(dxz $$0) {
      cvl $$1 = this.a(ku.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dxz $$0) {
      cvl $$1 = this.a(ku.n);
      return $$1 != null && $$1.a($$0);
   }

   public int K() {
      return this.n;
   }

   public void d(int $$0) {
      this.n = $$0;
   }

   public int L() {
      return this.f() ? 0 : this.m;
   }

   public void e(int $$0) {
      this.m = $$0;
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

   public void a(int $$0, @Nullable bwg $$1) {
      if ($$1 == null || !$$1.fV()) {
         this.h($$0);
      }
   }

   public cxp b(int $$0, @Nullable bwg $$1) {
      cxp $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dhi $$0, bwg $$1, int $$2) {
      czv $$3 = this.a(ku.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dZ(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cmb $$0) {
      this.h().a($$0);
   }

   public axe M() {
      return this.h().a();
   }

   public boolean a(bua $$0) {
      daa $$1 = this.a(ku.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cxp $$0) {
      deh $$1 = this.a(ku.E);
      return $$1 != null && $$1.a($$0);
   }
}
