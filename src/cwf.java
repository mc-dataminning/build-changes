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

public final class cwf implements kp {
   public static final Codec<jq<cwb>> a = lz.g
      .r()
      .validate($$0 -> $$0.a(cwj.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cwf> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cwf::i),
                     ayw.a(1, 99).fieldOf("count").orElse(1).forGetter(cwf::L),
                     kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cwf::new)
         )
   );
   public static final Codec<cwf> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cwf::i), kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cwf($$0x, 1, $$1))
         )
   );
   public static final Codec<cwf> d = b.validate(cwf::c);
   public static final Codec<cwf> e = c.validate(cwf::c);
   public static final Codec<cwf> f = ayw.f(b).xmap($$0 -> $$0.orElse(cwf.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cwf> g = a.xmap(cwf::new, cwf::i);
   public static final zj<ww, cwf> h = new zj<ww, cwf>() {
      private static final zj<ww, jq<cwb>> a = zh.b(ma.K);

      public cwf a(ww $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cwf.k;
         } else {
            jq<cwb> $$2 = a.decode($$0);
            kr $$3 = kr.c.decode($$0);
            return new cwf($$2, $$1, $$3);
         }
      }

      public void a(ww $$0, cwf $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.L());
            a.encode($$0, $$1.i());
            kr.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zj<ww, cwf> i = new zj<ww, cwf>() {
      public cwf a(ww $$0) {
         cwf $$1 = cwf.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(ww $$0, cwf $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cwf.h.encode($$0, $$1);
         }
      }
   };
   public static final zj<ww, List<cwf>> j = h.a(zh.a(jz::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cwf k = new cwf((Void)null);
   private static final xl m = xl.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cwb p;
   final kv q;
   @Nullable
   private bui r;

   private static DataResult<cwf> c(cwf $$0) {
      DataResult<bat> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.L() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.L() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zj<ww, cwf> a(final zj<ww, cwf> $$0) {
      return new zj<ww, cwf>() {
         public cwf a(ww $$0x) {
            cwf $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alj<bat> $$2 = $$0.H().a(azp.a);
               cwf.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(ww $$0x, cwf $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<ctz> b() {
      return this.h().k(this);
   }

   @Override
   public kq a() {
      return (kq)(!this.f() ? this.q : kq.a);
   }

   public void c() {
      this.q.f();
   }

   public kq d() {
      return !this.f() ? this.h().g() : kq.a;
   }

   public kr e() {
      return !this.f() ? this.q.g() : kr.a;
   }

   public cwf(dfe $$0) {
      this($$0, 1);
   }

   public cwf(jq<cwb> $$0) {
      this($$0.a(), 1);
   }

   public cwf(jq<cwb> $$0, int $$1, kr $$2) {
      this($$0.a(), $$1, kv.a($$0.a().g(), $$2));
   }

   public cwf(jq<cwb> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cwf(dfe $$0, int $$1) {
      this($$0, $$1, new kv($$0.j().g()));
   }

   private cwf(dfe $$0, int $$1, kv $$2) {
      this.p = $$0.j();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cwf(@Nullable Void $$0) {
      this.p = null;
      this.q = new kv(kq.a);
   }

   public static DataResult<bat> a(kq $$0) {
      if ($$0.b(ku.d) && $$0.a(ku.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cyx $$1 = $$0.a(ku.al, cyx.a);

         for (cwf $$2 : $$1.d()) {
            int $$3 = $$2.L();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bat.a);
      }
   }

   public static Optional<cwf> a(js.a $$0, vk $$1) {
      return b.parse($$0.a(vb.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cwf a(js.a $$0, un $$1) {
      return $$1.g() ? k : a($$0, (vk)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cwj.a || this.n <= 0;
   }

   public boolean a(crj $$0) {
      return this.f() || this.h().a($$0);
   }

   public cwf a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cwf $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cwf g() {
      if (this.f()) {
         return k;
      } else {
         cwf $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cwb h() {
      return this.f() ? cwj.a : this.p;
   }

   public jq<cwb> i() {
      return this.h().f();
   }

   public boolean a(axt<cwb> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cwb $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jq<cwb>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jq<cwb> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(ju<cwb> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axt<cwb>> j() {
      return this.h().f().c();
   }

   public bsh a(czy $$0) {
      cor $$1 = $$0.o();
      jh $$2 = $$0.a();
      if ($$1 != null && !$$1.gm().e && !this.a(new dvs($$0.q(), $$2, false))) {
         return bsh.e;
      } else {
         cwb $$3 = this.h();
         bsh $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bsh.d $$5 && $$5.c()) {
            $$1.b(awy.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dvo $$0) {
      return this.h().a(this, $$0);
   }

   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = this.v();
      boolean $$4 = this.a((bve)$$1) <= 0;
      bsh $$5 = this.h().a($$0, $$1, $$2);
      return (bsh)($$4 && $$5 instanceof bsh.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cwf a(dff $$0, bve $$1) {
      cwf $$2 = this.v();
      cwf $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cwf a(bve $$0, cwf $$1) {
      czl $$2 = $$1.a(ku.y);
      czk $$3 = $$1.a(ku.z);
      int $$4 = $$1.L();
      cwf $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a($$0, this, $$4);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vk b(js.a $$0, vk $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vk)b.encode(this, $$0.a(vb.a), $$1).getOrThrow();
      }
   }

   public vk a(js.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vk)b.encodeStart($$0.a(vb.a), this).getOrThrow();
      }
   }

   public vk b(js.a $$0) {
      return (vk)(this.f() ? new un() : this.b($$0, new un()));
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
      return azn.a(this.a(ku.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(ku.e, Integer.valueOf(azn.a($$0, 0, this.p())));
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

   public void a(int $$0, arq $$1, @Nullable arr $$2, Consumer<cwb> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 > 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arq $$1, @Nullable arr $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fY()) {
         return 0;
      } else {
         return $$0 > 0 ? dby.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arr $$1, Consumer<cwb> $$2) {
      if ($$1 != null) {
         ao.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cwb $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cor $$1) {
      if ($$1 instanceof arr $$2) {
         int $$3 = this.a($$0, $$2.B(), $$2);
         if ($$3 <= 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bve $$1, buq $$2) {
      if ($$1.dY() instanceof arq $$3) {
         this.a($$0, $$3, $$1 instanceof arr $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cwf a(int $$0, dfe $$1, bve $$2, buq $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cwf $$4 = this.b($$1, 1);
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

   public boolean a(ctp $$0, csc $$1, cor $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cwf $$0, ctp $$1, csc $$2, cor $$3, bvw $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bve $$0, bve $$1) {
      cwb $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cor $$3) {
            $$3.b(awy.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bve $$0, bve $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dff $$0, dvo $$1, jh $$2, cor $$3) {
      cwb $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awy.c.b($$4));
      }
   }

   public boolean b(dvo $$0) {
      return this.h().b(this, $$0);
   }

   public bsh a(cor $$0, bve $$1, bsg $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cwf v() {
      if (this.f()) {
         return k;
      } else {
         cwf $$0 = new cwf(this.h(), this.n, this.q.h());
         $$0.d(this.K());
         return $$0;
      }
   }

   public cwf c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cwf $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cwf a(dfe $$0) {
      return this.a($$0, this.L());
   }

   public cwf a(dfe $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cwf b(dfe $$0, int $$1) {
      return new cwf($$0.j().f(), $$1, this.q.g());
   }

   public static boolean a(cwf $$0, cwf $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cwf> $$0, List<cwf> $$1) {
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

   public static boolean b(cwf $$0, cwf $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cwf $$0, cwf $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cwf> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cwf $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cwf> $$0) {
      int $$1 = 0;

      for (cwf $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.L() + " " + this.h();
   }

   public void a(dff $$0, bui $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dff $$0, cor $$1, int $$2) {
      $$1.a(awy.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dff $$0) {
      this.h().a(this, $$0);
   }

   public int a(bve $$0) {
      return this.h().a(this, $$0);
   }

   public cwh w() {
      return this.h().b(this);
   }

   public void a(dff $$0, bve $$1, int $$2) {
      cwf $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cwf $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fD(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().d_(this);
   }

   @Nullable
   public <T> T b(kt<? super T> $$0, @Nullable T $$1) {
      return this.q.b($$0, $$1);
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
      return this.q.d($$0);
   }

   public void a(kr $$0) {
      kr $$1 = this.q.g();
      this.q.a($$0);
      Optional<Error<cwf>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         l.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.q.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kr $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public void b(kq $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public xl y() {
      xl $$0 = this.a(ku.g);
      if ($$0 != null) {
         return $$0;
      } else {
         czn $$1 = this.a(ku.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bak.h($$2)) {
               return xl.b($$2);
            }
         }

         return this.z();
      }
   }

   public xl z() {
      return this.h().a(this);
   }

   public xl A() {
      xz $$0 = xl.i().b(this.y()).a(this.C().a());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends czi> void a(kt<T> $$0, cwb.b $$1, Consumer<xl> $$2, cxx $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xl> a(cwb.b $$0, @Nullable cor $$1, cxx $$2) {
      if (!$$2.b() && this.b(ku.r)) {
         return List.of();
      } else {
         List<xl> $$3 = Lists.newArrayList();
         $$3.add(this.A());
         if (!$$2.a() && !this.b(ku.g)) {
            etg $$4 = this.a(ku.L);
            if ($$4 != null) {
               $$3.add(cws.a($$4));
            }
         }

         Consumer<xl> $$5 = $$3::add;
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
         cub $$6 = this.a(ku.n);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xk.a);
            $$5.accept(cub.c);
            $$6.a($$5);
         }

         cub $$7 = this.a(ku.m);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xk.a);
            $$5.accept(cub.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xl.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xl.b(lz.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.q.d();
            if ($$8 > 0) {
               $$3.add(xl.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dY().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xl> $$0, @Nullable cor $$1) {
      cyw $$2 = this.a(ku.o, cyw.a);
      if ($$2.c()) {
         for (bur $$3 : bur.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xk.a);
                  $$0.accept(xl.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xl> $$0, @Nullable cor $$1, jq<bwh> $$2, bwk $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cwb.f)) {
            $$4 += $$1.i(bwm.c);
            $$5 = true;
         } else if ($$3.a(cwb.g)) {
            $$4 += $$1.i(bwm.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bwk.a.b || $$3.d() == bwk.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bwm.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xk.a().b(xl.a("attribute.modifier.equals." + $$3.d().a(), cyw.d.format($$6), xl.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xl.a("attribute.modifier.plus." + $$3.d().a(), cyw.d.format($$6), xl.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xl.a("attribute.modifier.take." + $$3.d().a(), cyw.d.format(-$$6), xl.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean B() {
      Boolean $$0 = this.a(ku.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cxc C() {
      cxc $$0 = this.a(ku.k, cxc.a);
      if (!this.E()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cxc.c;
            case c -> cxc.d;
            default -> $$0;
         };
      }
   }

   public boolean D() {
      if (!this.b(ku.C)) {
         return false;
      } else {
         dcc $$0 = this.a(ku.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jq<dbw> $$0, int $$1) {
      dby.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean E() {
      return !this.a(ku.l, dcc.a).d();
   }

   public dcc F() {
      return this.a(ku.l, dcc.a);
   }

   public boolean G() {
      return this.r instanceof cks;
   }

   public void a(@Nullable bui $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public cks H() {
      return this.r instanceof cks ? (cks)this.I() : null;
   }

   @Nullable
   public bui I() {
      return !this.f() ? this.r : null;
   }

   public void a(bur $$0, BiConsumer<jq<bwh>, bwk> $$1) {
      cyw $$2 = this.a(ku.o, cyw.a);
      $$2.a($$0, $$1);
      dby.a(this, $$0, $$1);
   }

   public void a(buq $$0, BiConsumer<jq<bwh>, bwk> $$1) {
      cyw $$2 = this.a(ku.o, cyw.a);
      $$2.a($$0, $$1);
      dby.a(this, $$0, $$1);
   }

   public xl J() {
      xz $$0 = xl.i().b(this.y());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      xz $$1 = xo.a((xl)$$0);
      if (!this.f()) {
         $$1.a(this.C().a()).a($$0x -> $$0x.a(new xr(xr.a.b, new xr.c(this))));
      }

      return $$1;
   }

   public boolean a(dvs $$0) {
      cub $$1 = this.a(ku.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dvs $$0) {
      cub $$1 = this.a(ku.n);
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

   public void a(int $$0, @Nullable bve $$1) {
      if ($$1 == null || !$$1.fY()) {
         this.h($$0);
      }
   }

   public cwf b(int $$0, @Nullable bve $$1) {
      cwf $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dff $$0, bve $$1, int $$2) {
      cyl $$3 = this.a(ku.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.eb(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(ckz $$0) {
      this.h().a($$0);
   }

   public awn M() {
      return this.h().a();
   }

   public boolean a(bsy $$0) {
      cyq $$1 = this.a(ku.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cwf $$0) {
      dce $$1 = this.a(ku.E);
      return $$1 != null && $$1.a($$0);
   }
}
