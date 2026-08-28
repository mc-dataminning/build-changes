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

public final class cxy implements ks {
   private static final List<wv> l = List.of(
      wv.c("item.op_warning.line1").a(n.m, n.r), wv.c("item.op_warning.line2").a(n.m), wv.c("item.op_warning.line3").a(n.m)
   );
   public static final MapCodec<cxy> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     cxu.e.fieldOf("id").forGetter(cxy::i),
                     ays.a(1, 99).fieldOf("count").orElse(1).forGetter(cxy::M),
                     ku.b.optionalFieldOf("components", ku.a).forGetter($$0xx -> $$0xx.r.g())
                  )
                  .apply($$0x, cxy::new)
         )
   );
   public static final Codec<cxy> b = Codec.lazyInitialized(a::codec);
   public static final Codec<cxy> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cxu.e.fieldOf("id").forGetter(cxy::i), ku.b.optionalFieldOf("components", ku.a).forGetter($$0x -> $$0x.r.g()))
                  .apply($$0, ($$0x, $$1) -> new cxy($$0x, 1, $$1))
         )
   );
   public static final Codec<cxy> d = b.validate(cxy::a);
   public static final Codec<cxy> e = c.validate(cxy::a);
   public static final Codec<cxy> f = ays.g(b).xmap($$0 -> $$0.orElse(cxy.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cxy> g = cxu.e.xmap(cxy::new, cxy::i);
   public static final yt<wg, cxy> h = new yt<wg, cxy>() {
      public cxy a(wg $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cxy.k;
         } else {
            js<cxu> $$2 = cxu.f.decode($$0);
            ku $$3 = ku.c.decode($$0);
            return new cxy($$2, $$1, $$3);
         }
      }

      public void a(wg $$0, cxy $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            cxu.f.encode($$0, $$1.i());
            ku.c.encode($$0, $$1.r.g());
         }
      }
   };
   public static final yt<wg, cxy> i = new yt<wg, cxy>() {
      public cxy a(wg $$0) {
         cxy $$1 = cxy.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wg $$0, cxy $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cxy.h.encode($$0, $$1);
         }
      }
   };
   public static final yt<wg, List<cxy>> j = h.a(yr.a(kb::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cxy k = new cxy((Void)null);
   private static final wv n = wv.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cxu q;
   final ky r;
   @Nullable
   private bvs s;

   public static DataResult<cxy> a(cxy $$0) {
      DataResult<baq> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static yt<wg, cxy> a(final yt<wg, cxy> $$0) {
      return new yt<wg, cxy>() {
         public cxy a(wg $$0x) {
            cxy $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alb<baq> $$2 = $$0.H().a(azm.a);
               cxy.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wg $$0x, cxy $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cvu> b() {
      return this.h().k(this);
   }

   @Override
   public kt a() {
      return (kt)(!this.f() ? this.r : kt.a);
   }

   public kt c() {
      return !this.f() ? this.h().g() : kt.a;
   }

   public ku d() {
      return !this.f() ? this.r.g() : ku.a;
   }

   public kt e() {
      return !this.f() ? this.r.i() : kt.a;
   }

   public boolean d(kw<?> $$0) {
      return !this.f() && this.r.d($$0);
   }

   public cxy(dho $$0) {
      this($$0, 1);
   }

   public cxy(js<cxu> $$0) {
      this($$0.a(), 1);
   }

   public cxy(js<cxu> $$0, int $$1, ku $$2) {
      this($$0.a(), $$1, ky.a($$0.a().g(), $$2));
   }

   public cxy(js<cxu> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cxy(dho $$0, int $$1) {
      this($$0, $$1, new ky($$0.i().g()));
   }

   private cxy(dho $$0, int $$1, ky $$2) {
      this.q = $$0.i();
      this.o = $$1;
      this.r = $$2;
      this.h().l(this);
   }

   private cxy(@Nullable Void $$0) {
      this.q = null;
      this.r = new ky(kt.a);
   }

   public static DataResult<baq> a(kt $$0) {
      if ($$0.c(kx.d) && $$0.a(kx.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dan $$1 = $$0.a(kx.an, dan.a);

         for (cxy $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(baq.a);
      }
   }

   public static Optional<cxy> a(ju.a $$0, ut $$1) {
      return b.parse($$0.a(uk.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cxy a(ju.a $$0, tw $$1) {
      return $$1.g() ? k : a($$0, (ut)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.q == cyc.a || this.o <= 0;
   }

   public boolean a(cte $$0) {
      return this.f() || this.h().a($$0);
   }

   public cxy a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cxy $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cxy g() {
      if (this.f()) {
         return k;
      } else {
         cxy $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cxu h() {
      return this.f() ? cyc.a : this.q;
   }

   public js<cxu> i() {
      return this.h().f();
   }

   public boolean a(axp<cxu> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cxu $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<js<cxu>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(js<cxu> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(jw<cxu> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axp<cxu>> j() {
      return this.h().f().c();
   }

   public btq a(dbp $$0) {
      cqi $$1 = $$0.o();
      jj $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new dyq($$0.q(), $$2, false))) {
         return btq.e;
      } else {
         cxu $$3 = this.h();
         btq $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof btq.d $$5 && $$5.c()) {
            $$1.b(awu.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dym $$0) {
      return this.h().a(this, $$0);
   }

   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = this.v();
      boolean $$4 = this.a((bwr)$$1) <= 0;
      btq $$5 = this.h().a($$0, $$1, $$2);
      return (btq)($$4 && $$5 instanceof btq.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cxy a(dhp $$0, bwr $$1) {
      cxy $$2 = this.v();
      cxy $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cxy a(bwr $$0, cxy $$1) {
      dbb $$2 = $$1.a(kx.y);
      dba $$3 = $$1.a(kx.z);
      int $$4 = $$1.M();
      cxy $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fU(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public ut b(ju.a $$0, ut $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (ut)b.encode(this, $$0.a(uk.a), $$1).getOrThrow();
      }
   }

   public ut a(ju.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (ut)b.encodeStart($$0.a(uk.a), this).getOrThrow();
      }
   }

   public ut b(ju.a $$0) {
      return (ut)(this.f() ? new tw() : this.b($$0, new tw()));
   }

   public int k() {
      return this.a(kx.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.c(kx.d) && !this.c(kx.f) && this.c(kx.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azk.a(this.a(kx.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kx.e, Integer.valueOf(azk.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kx.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, arn $$1, @Nullable aro $$2, Consumer<cxu> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arn $$1, @Nullable aro $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fU()) {
         return 0;
      } else {
         return $$0 > 0 ? dej.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable aro $$1, Consumer<cxu> $$2) {
      if ($$1 != null) {
         ap.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cxu $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cqi $$1) {
      if ($$1 instanceof aro $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bwr $$1, bwc $$2) {
      if ($$1.dV() instanceof arn $$3) {
         this.a($$0, $$3, $$1 instanceof aro $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cxy a(int $$0, dho $$1, bwr $$2, bwc $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cxy $$4 = this.b($$1, 1);
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

   public boolean a(cvk $$0, ctx $$1, cqi $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cxy $$0, cvk $$1, ctx $$2, cqi $$3, bxi $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bwr $$0, bwr $$1) {
      cxu $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kx.C)) {
         if ($$1 instanceof cqi $$3) {
            $$3.b(awu.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bwr $$0, bwr $$1) {
      this.h().b(this, $$0, $$1);
      dbc $$2 = this.a(kx.C);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bwc.a);
      }
   }

   public void a(dhp $$0, dym $$1, jj $$2, cqi $$3) {
      cxu $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awu.c.b($$4));
      }
   }

   public boolean b(dym $$0) {
      return this.h().b(this, $$0);
   }

   public btq a(cqi $$0, bwr $$1, btp $$2) {
      dgc $$3 = this.a(kx.E);
      if ($$3 != null && $$3.j()) {
         btq $$4 = $$3.a($$0, $$1, this);
         if ($$4 != btq.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public cxy v() {
      if (this.f()) {
         return k;
      } else {
         cxy $$0 = new cxy(this.h(), this.o, this.r.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public cxy c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cxy $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cxy a(dho $$0) {
      return this.a($$0, this.M());
   }

   public cxy a(dho $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cxy b(dho $$0, int $$1) {
      return new cxy($$0.i().f(), $$1, this.r.g());
   }

   public static boolean a(cxy $$0, cxy $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cxy> $$0, List<cxy> $$1) {
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

   public static boolean b(cxy $$0, cxy $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cxy $$0, cxy $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cxy> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable cxy $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cxy> $$0) {
      int $$1 = 0;

      for (cxy $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dhp $$0, bvs $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dhp $$0, cqi $$1, int $$2) {
      $$1.a(awu.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dhp $$0) {
      this.h().a(this, $$0);
   }

   public int a(bwr $$0) {
      return this.h().a(this, $$0);
   }

   public cya w() {
      return this.h().b(this);
   }

   public void a(dhp $$0, bwr $$1, int $$2) {
      cxy $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cxy $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fz(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().d_(this);
   }

   @Nullable
   public <T> T b(kw<T> $$0, @Nullable T $$1) {
      return this.r.b($$0, $$1);
   }

   public <T> void a(kw<T> $$0, kr $$1) {
      this.b($$0, $$1.a($$0));
   }

   @Nullable
   public <T, U> T a(kw<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kw<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T e(kw<? extends T> $$0) {
      return this.r.e($$0);
   }

   public void a(ku $$0) {
      ku $$1 = this.r.g();
      this.r.a($$0);
      Optional<Error<cxy>> $$2 = a(this).error();
      if ($$2.isPresent()) {
         m.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.r.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(ku $$0) {
      this.r.a($$0);
      this.h().l(this);
   }

   public void b(kt $$0) {
      this.r.a($$0);
      this.h().l(this);
   }

   public wv y() {
      wv $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public wv z() {
      wv $$0 = this.a(kx.g);
      if ($$0 != null) {
         return $$0;
      } else {
         dbe $$1 = this.a(kx.V);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bah.h($$2)) {
               return wv.b($$2);
            }
         }

         return null;
      }
   }

   public wv A() {
      return this.h().a(this);
   }

   public wv B() {
      xj $$0 = wv.i().b(this.y()).a(this.D().a());
      if (this.c(kx.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends day> void a(kw<T> $$0, cxu.b $$1, Consumer<wv> $$2, czn $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wv> a(cxu.b $$0, @Nullable cqi $$1, czn $$2) {
      boolean $$3 = this.h().a(this, $$1);
      if (!$$2.b() && this.c(kx.r)) {
         return $$3 ? l : List.of();
      } else {
         List<wv> $$4 = Lists.newArrayList();
         $$4.add(this.B());
         if (!$$2.a() && !this.c(kx.g)) {
            ewl $$5 = this.a(kx.M);
            if ($$5 != null) {
               $$4.add(cyl.a($$5));
            }
         }

         Consumer<wv> $$6 = $$4::add;
         if (!this.c(kx.q)) {
            this.h().a(this, $$0, $$4, $$2);
         }

         this.a(kx.V, $$0, $$6, $$2);
         this.a(kx.ad, $$0, $$6, $$2);
         this.a(kx.W, $$0, $$6, $$2);
         this.a(kx.J, $$0, $$6, $$2);
         this.a(kx.l, $$0, $$6, $$2);
         this.a(kx.K, $$0, $$6, $$2);
         this.a(kx.j, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kx.f, $$0, $$6, $$2);
         this.a(kx.ac, $$0, $$6, $$2);
         this.a(kx.T, $$0, $$6, $$2);
         cvw $$7 = this.a(kx.n);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wu.a);
            $$6.accept(cvw.c);
            $$7.a($$6);
         }

         cvw $$8 = this.a(kx.m);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wu.a);
            $$6.accept(cvw.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$4.add(wv.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$4.add(wv.b(md.g.b(this.h()).toString()).a(n.i));
            int $$9 = this.r.d();
            if ($$9 > 0) {
               $$4.add(wv.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dV().K())) {
            $$4.add(n);
         }

         if ($$3) {
            $$4.addAll(l);
         }

         return $$4;
      }
   }

   private void a(Consumer<wv> $$0, @Nullable cqi $$1) {
      dam $$2 = this.a(kx.o, dam.a);
      if ($$2.c()) {
         for (bwd $$3 : bwd.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wu.a);
                  $$0.accept(wv.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wv> $$0, @Nullable cqi $$1, js<bxs> $$2, bxv $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cxu.h)) {
            $$4 += $$1.i(bxx.c);
            $$5 = true;
         } else if ($$3.a(cxu.i)) {
            $$4 += $$1.i(bxx.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bxv.a.b || $$3.d() == bxv.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bxx.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wu.a().b(wv.a("attribute.modifier.equals." + $$3.d().a(), dam.d.format($$6), wv.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wv.a("attribute.modifier.plus." + $$3.d().a(), dam.d.format($$6), wv.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wv.a("attribute.modifier.take." + $$3.d().a(), dam.d.format(-$$6), wv.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kx.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cyu D() {
      cyu $$0 = this.a(kx.k, cyu.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cyu.c;
            case c -> cyu.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kx.D)) {
         return false;
      } else {
         den $$0 = this.a(kx.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(js<deh> $$0, int $$1) {
      dej.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kx.l, den.a).d();
   }

   public den G() {
      return this.a(kx.l, den.a);
   }

   public boolean H() {
      return this.s instanceof cmg;
   }

   public void a(@Nullable bvs $$0) {
      if (!this.f()) {
         this.s = $$0;
      }
   }

   @Nullable
   public cmg I() {
      return this.s instanceof cmg ? (cmg)this.J() : null;
   }

   @Nullable
   public bvs J() {
      return !this.f() ? this.s : null;
   }

   public void a(bwd $$0, BiConsumer<js<bxs>, bxv> $$1) {
      dam $$2 = this.a(kx.o, dam.a);
      $$2.a($$0, $$1);
      dej.a(this, $$0, $$1);
   }

   public void a(bwc $$0, BiConsumer<js<bxs>, bxv> $$1) {
      dam $$2 = this.a(kx.o, dam.a);
      $$2.a($$0, $$1);
      dej.a(this, $$0, $$1);
   }

   public wv K() {
      xj $$0 = wv.i().b(this.y());
      if (this.c(kx.g)) {
         $$0.a(n.u);
      }

      xj $$1 = wy.a((wv)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xb.d(this)));
      }

      return $$1;
   }

   public boolean a(dyq $$0) {
      cvw $$1 = this.a(kx.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dyq $$0) {
      cvw $$1 = this.a(kx.n);
      return $$1 != null && $$1.a($$0);
   }

   public int L() {
      return this.p;
   }

   public void d(int $$0) {
      this.p = $$0;
   }

   public int M() {
      return this.f() ? 0 : this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public void f(int $$0) {
      if (!this.f() && this.M() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.M() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable bwr $$1) {
      if ($$1 == null || !$$1.fU()) {
         this.h($$0);
      }
   }

   public cxy b(int $$0, @Nullable bwr $$1) {
      cxy $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dhp $$0, bwr $$1, int $$2) {
      dab $$3 = this.a(kx.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cmn $$0) {
      this.h().a($$0);
   }

   public awj N() {
      return this.h().a();
   }

   public boolean a(buh $$0) {
      dag $$1 = this.a(kx.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(cxy $$0) {
      dep $$1 = this.a(kx.F);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(dym $$0, dhp $$1, jj $$2, cqi $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
