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

public final class cur implements kh {
   public static final Codec<ji<cum>> a = lp.h
      .r()
      .validate($$0 -> $$0.a(cuu.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cur> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cur::h),
                     ayh.l.fieldOf("count").orElse(1).forGetter(cur::I),
                     kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cur::new)
         )
   );
   public static final Codec<cur> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cur::h), kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cur($$0x, 1, $$1))
         )
   );
   public static final Codec<cur> d = b.validate(cur::b);
   public static final Codec<cur> e = c.validate(cur::b);
   public static final Codec<cur> f = ayh.e(b).xmap($$0 -> $$0.orElse(cur.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cur> g = a.xmap(cur::new, cur::h);
   public static final zn<xa, cur> h = new zn<xa, cur>() {
      private static final zn<xa, ji<cum>> a = zl.b(lq.G);

      public cur a(xa $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cur.l;
         } else {
            ji<cum> $$2 = a.decode($$0);
            kj $$3 = kj.c.decode($$0);
            return new cur($$2, $$1, $$3);
         }
      }

      public void a(xa $$0, cur $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.I());
            a.encode($$0, $$1.h());
            kj.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final zn<xa, cur> i = new zn<xa, cur>() {
      public cur a(xa $$0) {
         cur $$1 = cur.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(xa $$0, cur $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cur.h.encode($$0, $$1);
         }
      }
   };
   public static final zn<xa, List<cur>> j = h.a(zl.a(jr::a));
   public static final zn<xa, List<cur>> k = i.a(zl.a(jr::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cur l = new cur((Void)null);
   private static final xp n = xp.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cum q;
   final kn r;
   @Nullable
   private bsw s;

   private static DataResult<cur> b(cur $$0) {
      DataResult<bac> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.I() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.I() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static zn<xa, cur> a(final zn<xa, cur> $$0) {
      return new zn<xa, cur>() {
         public cur a(xa $$0x) {
            cur $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               ald<bac> $$2 = $$0.G().a(azb.a);
               cur.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(xa $$0x, cur $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<csb> b() {
      return this.g().h(this);
   }

   @Override
   public ki a() {
      return (ki)(!this.e() ? this.r : ki.a);
   }

   public ki c() {
      return !this.e() ? this.g().p() : ki.a;
   }

   public kj d() {
      return !this.e() ? this.r.f() : kj.a;
   }

   public cur(dbz $$0) {
      this($$0, 1);
   }

   public cur(ji<cum> $$0) {
      this($$0.a(), 1);
   }

   public cur(ji<cum> $$0, int $$1, kj $$2) {
      this($$0.a(), $$1, kn.a($$0.a().p(), $$2));
   }

   public cur(ji<cum> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cur(dbz $$0, int $$1) {
      this($$0, $$1, new kn($$0.r().p()));
   }

   private cur(dbz $$0, int $$1, kn $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().n(this);
   }

   private cur(@Nullable Void $$0) {
      this.q = null;
      this.r = new kn(ki.a);
   }

   public static DataResult<bac> a(ki $$0) {
      return $$0.b(km.d) && $$0.a(km.c, 1) > 1 ? DataResult.error(() -> "Item cannot be both damageable and stackable") : DataResult.success(bac.a);
   }

   public static Optional<cur> a(jk.a $$0, vp $$1) {
      return b.parse($$0.a(vg.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cur a(jk.a $$0, us $$1) {
      return $$1.g() ? l : a($$0, (vp)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cuu.a || this.o <= 0;
   }

   public boolean a(cpn $$0) {
      return this.e() || this.g().a($$0);
   }

   public cur a(int $$0) {
      int $$1 = Math.min($$0, this.I());
      cur $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cur f() {
      if (this.e()) {
         return l;
      } else {
         cur $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public cum g() {
      return this.e() ? cuu.a : this.q;
   }

   public ji<cum> h() {
      return this.g().o();
   }

   public boolean a(axf<cum> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(cum $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<ji<cum>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(ji<cum> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jm<cum> $$0) {
      return $$0.a(this.h());
   }

   public Stream<axf<cum>> i() {
      return this.g().o().c();
   }

   public bqw a(cye $$0) {
      cmz $$1 = $$0.o();
      iz $$2 = $$0.a();
      if ($$1 != null && !$$1.gd().e && !this.a(new dsi($$0.q(), $$2, false))) {
         return bqw.e;
      } else {
         cum $$3 = this.g();
         bqw $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(awk.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dse $$0) {
      return this.g().a(this, $$0);
   }

   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cur a(dca $$0, btr $$1) {
      return this.g().a(this, $$0, $$1);
   }

   public vp b(jk.a $$0, vp $$1) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vp)b.encode(this, $$0.a(vg.a), $$1).getOrThrow();
      }
   }

   public vp a(jk.a $$0) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vp)b.encodeStart($$0.a(vg.a), this).getOrThrow();
      }
   }

   public vp b(jk.a $$0) {
      return (vp)(this.e() ? new us() : this.b($$0, new us()));
   }

   public int j() {
      return this.a(km.c, Integer.valueOf(1));
   }

   public boolean k() {
      return this.j() > 1 && (!this.l() || !this.m());
   }

   public boolean l() {
      return this.b(km.d) && !this.b(km.f) && this.b(km.e);
   }

   public boolean m() {
      return this.l() && this.n() > 0;
   }

   public int n() {
      return ayz.a(this.a(km.e, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(km.e, Integer.valueOf(ayz.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(km.d, Integer.valueOf(0));
   }

   public void a(int $$0, azh $$1, @Nullable arg $$2, Runnable $$3) {
      if (this.l()) {
         if ($$0 > 0) {
            int $$4 = dad.a(daf.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (dab.a(this, $$4, $$1)) {
                  $$5++;
               }
            }

            $$0 -= $$5;
            if ($$0 <= 0) {
               return;
            }
         }

         if ($$2 != null && $$0 != 0) {
            am.u.a($$2, this, this.n() + $$0);
         }

         int $$7 = this.n() + $$0;
         this.b($$7);
         if ($$7 >= this.o()) {
            $$3.run();
         }
      }
   }

   public void a(int $$0, btr $$1, btd $$2) {
      if (!$$1.dP().B) {
         if ($$1 instanceof cmz $$3 && $$3.fP()) {
            return;
         }

         this.a($$0, $$1.el(), $$1 instanceof arg $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            cum $$2x = this.g();
            this.h(1);
            if ($$1 instanceof cmz) {
               ((cmz)$$1).b(awk.d.b($$2x));
            }

            this.b(0);
         });
      }
   }

   public boolean p() {
      return this.g().e(this);
   }

   public int q() {
      return this.g().f(this);
   }

   public int r() {
      return this.g().g(this);
   }

   public boolean a(crr $$0, cqe $$1, cmz $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cur $$0, crr $$1, cqe $$2, cmz $$3, buj $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(btr $$0, cmz $$1) {
      cum $$2 = this.g();
      dah $$3 = this.C();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(awk.c.b($$2));
         dad.a($$1, $$0, $$3);
      }
   }

   public void a(dca $$0, dse $$1, iz $$2, cmz $$3) {
      cum $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awk.c.b($$4));
      }
   }

   public boolean b(dse $$0) {
      return this.g().b(this, $$0);
   }

   public bqw a(cmz $$0, btr $$1, bqv $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cur s() {
      if (this.e()) {
         return l;
      } else {
         cur $$0 = new cur(this.g(), this.o, this.r.g());
         $$0.d(this.H());
         return $$0;
      }
   }

   public cur c(int $$0) {
      if (this.e()) {
         return l;
      } else {
         cur $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cur a(dbz $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   public cur b(dbz $$0, int $$1) {
      return new cur($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cur $$0, cur $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.I() != $$1.I() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cur> $$0, List<cur> $$1) {
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

   public static boolean b(cur $$0, cur $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cur $$0, cur $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cur> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cur $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cur> $$0) {
      int $$1 = 0;

      for (cur $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String t() {
      return this.g().i(this);
   }

   @Override
   public String toString() {
      return this.I() + " " + this.g();
   }

   public void a(dca $$0, bsw $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dca $$0, cmz $$1, int $$2) {
      $$1.a(awk.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dca $$0) {
      this.g().a(this, $$0);
   }

   public int u() {
      return this.g().b(this);
   }

   public cwm v() {
      return this.g().c(this);
   }

   public void a(dca $$0, btr $$1, int $$2) {
      this.g().a(this, $$0, $$1, $$2);
   }

   public boolean w() {
      return this.g().m(this);
   }

   @Nullable
   public <T> T b(kl<? super T> $$0, @Nullable T $$1) {
      return this.r.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kl<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kl<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kl<? extends T> $$0) {
      return this.r.d($$0);
   }

   public void a(kj $$0) {
      kj $$1 = this.r.f();
      this.r.a($$0);
      Optional<Error<cur>> $$2 = b(this).error();
      if ($$2.isPresent()) {
         m.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.r.b($$1);
      } else {
         this.g().n(this);
      }
   }

   public void b(kj $$0) {
      this.r.a($$0);
      this.g().n(this);
   }

   public void b(ki $$0) {
      this.r.a($$0);
      this.g().n(this);
   }

   public xp x() {
      xp $$0 = this.a(km.g);
      if ($$0 != null) {
         return $$0;
      } else {
         xp $$1 = this.a(km.h);
         return $$1 != null ? $$1 : this.g().o(this);
      }
   }

   private <T extends cxx> void a(kl<T> $$0, cum.b $$1, Consumer<xp> $$2, cwk $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xp> a(cum.b $$0, @Nullable cmz $$1, cwk $$2) {
      if (!$$2.b() && this.b(km.q)) {
         return List.of();
      } else {
         List<xp> $$3 = Lists.newArrayList();
         yd $$4 = xp.i().b(this.x()).a(this.z().a());
         if (this.b(km.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(km.g) && this.a(cuu.rU)) {
            epk $$5 = this.a(km.B);
            if ($$5 != null) {
               $$3.add(cuz.a($$5));
            }
         }

         Consumer<xp> $$6 = $$3::add;
         if (!this.b(km.p)) {
            this.g().a(this, $$0, $$3, $$2);
         }

         this.a(km.K, $$0, $$6, $$2);
         this.a(km.y, $$0, $$6, $$2);
         this.a(km.k, $$0, $$6, $$2);
         this.a(km.z, $$0, $$6, $$2);
         this.a(km.i, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(km.f, $$0, $$6, $$2);
         csd $$7 = this.a(km.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(xo.a);
            $$6.accept(csd.c);
            $$7.a($$6);
         }

         csd $$8 = this.a(km.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(xo.a);
            $$6.accept(csd.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.m()) {
               $$3.add(xp.a("item.durability", this.o() - this.n(), this.o()));
            }

            $$3.add(xp.b(lp.h.b(this.g()).toString()).a(n.i));
            int $$9 = this.r.d();
            if ($$9 > 0) {
               $$3.add(xp.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.g().a($$1.dP().J())) {
            $$3.add(n);
         }

         return $$3;
      }
   }

   private void a(Consumer<xp> $$0, @Nullable cmz $$1) {
      cxm $$2 = this.a(km.n, cxm.a);
      if ($$2.c()) {
         for (btd $$3 : btd.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xo.a);
                  $$0.accept(xp.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xp> $$0, @Nullable cmz $$1, ji<buu> $$2, bux $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == cum.e) {
            $$4 += $$1.h(buz.c);
            $$4 += (double)dad.a(this, null);
            $$5 = true;
         } else if ($$3.b() == cum.f) {
            $$4 += $$1.h(buz.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == bux.a.b || $$3.e() == bux.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(buz.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xo.a().b(xp.a("attribute.modifier.equals." + $$3.e().a(), cxm.d.format($$6), xp.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xp.a("attribute.modifier.plus." + $$3.e().a(), cxm.d.format($$6), xp.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(xp.a("attribute.modifier.take." + $$3.e().a(), cxm.d.format(-$$6), xp.c($$2.a().c())).a(n.m));
      }
   }

   public boolean y() {
      Boolean $$0 = this.a(km.t);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cvl z() {
      cvl $$0 = this.a(km.j, cvl.a);
      if (!this.B()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cvl.c;
            case c -> cvl.d;
            default -> $$0;
         };
      }
   }

   public boolean A() {
      if (!this.g().a(this)) {
         return false;
      } else {
         dah $$0 = this.a(km.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(dac $$0, int $$1) {
      dad.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean B() {
      return !this.a(km.k, dah.a).d();
   }

   public dah C() {
      return this.a(km.k, dah.a);
   }

   public boolean D() {
      return this.s instanceof cjc;
   }

   public void a(@Nullable bsw $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public cjc E() {
      return this.s instanceof cjc ? (cjc)this.F() : null;
   }

   @Nullable
   public bsw F() {
      return !this.e() ? this.s : null;
   }

   public void a(btd $$0, BiConsumer<ji<buu>, bux> $$1) {
      cxm $$2 = this.a(km.n, cxm.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }
   }

   public xp G() {
      yd $$0 = xp.i().b(this.x());
      if (this.b(km.g)) {
         $$0.a(n.u);
      }

      yd $$1 = xs.a((xp)$$0);
      if (!this.e()) {
         $$1.a(this.z().a()).a($$0x -> $$0x.a(new xv(xv.a.b, new xv.c(this))));
      }

      return $$1;
   }

   public boolean a(dsi $$0) {
      csd $$1 = this.a(km.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dsi $$0) {
      csd $$1 = this.a(km.m);
      return $$1 != null && $$1.a($$0);
   }

   public int H() {
      return this.p;
   }

   public void d(int $$0) {
      this.p = $$0;
   }

   public int I() {
      return this.e() ? 0 : this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public void f(int $$0) {
      if (!this.e() && this.I() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.I() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable btr $$1) {
      if ($$1 == null || !$$1.fP()) {
         this.h($$0);
      }
   }

   public void b(dca $$0, btr $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cjj $$0) {
      this.g().a($$0);
   }

   public avz J() {
      return this.g().ak_();
   }

   public avz K() {
      return this.g().al_();
   }

   public avz L() {
      return this.g().e();
   }

   public boolean a(brp $$0) {
      return !this.b(km.w) || !$$0.a(awr.j);
   }
}
