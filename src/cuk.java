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

public final class cuk implements kh {
   public static final Codec<ji<cuf>> a = lp.h
      .r()
      .validate($$0 -> $$0.a(cun.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cuk> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cuk::h),
                     ayc.l.fieldOf("count").orElse(1).forGetter(cuk::I),
                     kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cuk::new)
         )
   );
   public static final Codec<cuk> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cuk::h), kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cuk($$0x, 1, $$1))
         )
   );
   public static final Codec<cuk> d = b.validate(cuk::b);
   public static final Codec<cuk> e = c.validate(cuk::b);
   public static final Codec<cuk> f = ayc.e(b).xmap($$0 -> $$0.orElse(cuk.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cuk> g = a.xmap(cuk::new, cuk::h);
   public static final zj<ww, cuk> h = new zj<ww, cuk>() {
      private static final zj<ww, ji<cuf>> a = zh.b(lq.G);

      public cuk a(ww $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cuk.l;
         } else {
            ji<cuf> $$2 = a.decode($$0);
            kj $$3 = kj.c.decode($$0);
            return new cuk($$2, $$1, $$3);
         }
      }

      public void a(ww $$0, cuk $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.I());
            a.encode($$0, $$1.h());
            kj.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final zj<ww, cuk> i = new zj<ww, cuk>() {
      public cuk a(ww $$0) {
         cuk $$1 = cuk.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(ww $$0, cuk $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cuk.h.encode($$0, $$1);
         }
      }
   };
   public static final zj<ww, List<cuk>> j = h.a(zh.a(jr::a));
   public static final zj<ww, List<cuk>> k = i.a(zh.a(jr::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cuk l = new cuk((Void)null);
   private static final xl n = xl.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cuf q;
   final kn r;
   @Nullable
   private bsp s;

   private static DataResult<cuk> b(cuk $$0) {
      DataResult<azx> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.I() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.I() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static zj<ww, cuk> a(final zj<ww, cuk> $$0) {
      return new zj<ww, cuk>() {
         public cuk a(ww $$0x) {
            cuk $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               akz<azx> $$2 = $$0.G().a(ayw.a);
               cuk.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(ww $$0x, cuk $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cru> b() {
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

   public cuk(dbs $$0) {
      this($$0, 1);
   }

   public cuk(ji<cuf> $$0) {
      this($$0.a(), 1);
   }

   public cuk(ji<cuf> $$0, int $$1, kj $$2) {
      this($$0.a(), $$1, kn.a($$0.a().p(), $$2));
   }

   public cuk(ji<cuf> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cuk(dbs $$0, int $$1) {
      this($$0, $$1, new kn($$0.r().p()));
   }

   private cuk(dbs $$0, int $$1, kn $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().n(this);
   }

   private cuk(@Nullable Void $$0) {
      this.q = null;
      this.r = new kn(ki.a);
   }

   public static DataResult<azx> a(ki $$0) {
      return $$0.b(km.c) && $$0.a(km.b, 1) > 1 ? DataResult.error(() -> "Item cannot be both damageable and stackable") : DataResult.success(azx.a);
   }

   public static Optional<cuk> a(jk.a $$0, vo $$1) {
      return b.parse($$0.a(vf.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cuk a(jk.a $$0, ur $$1) {
      return $$1.g() ? l : a($$0, (vo)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cun.a || this.o <= 0;
   }

   public boolean a(cpg $$0) {
      return this.e() || this.g().a($$0);
   }

   public cuk a(int $$0) {
      int $$1 = Math.min($$0, this.I());
      cuk $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cuk f() {
      if (this.e()) {
         return l;
      } else {
         cuk $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public cuf g() {
      return this.e() ? cun.a : this.q;
   }

   public ji<cuf> h() {
      return this.g().o();
   }

   public boolean a(axb<cuf> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(cuf $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<ji<cuf>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(ji<cuf> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jm<cuf> $$0) {
      return $$0.a(this.h());
   }

   public Stream<axb<cuf>> i() {
      return this.g().o().c();
   }

   public bqp a(cxx $$0) {
      cms $$1 = $$0.o();
      iz $$2 = $$0.a();
      if ($$1 != null && !$$1.gd().e && !this.a(new dsb($$0.q(), $$2, false))) {
         return bqp.e;
      } else {
         cuf $$3 = this.g();
         bqp $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(awg.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(drx $$0) {
      return this.g().a(this, $$0);
   }

   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cuk a(dbt $$0, btk $$1) {
      return this.g().a(this, $$0, $$1);
   }

   public vo b(jk.a $$0, vo $$1) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vo)b.encode(this, $$0.a(vf.a), $$1).getOrThrow();
      }
   }

   public vo a(jk.a $$0) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vo)b.encodeStart($$0.a(vf.a), this).getOrThrow();
      }
   }

   public vo b(jk.a $$0) {
      return (vo)(this.e() ? new ur() : this.b($$0, new ur()));
   }

   public int j() {
      return this.a(km.b, Integer.valueOf(1));
   }

   public boolean k() {
      return this.j() > 1 && (!this.l() || !this.m());
   }

   public boolean l() {
      return this.b(km.c) && !this.b(km.e) && this.b(km.d);
   }

   public boolean m() {
      return this.l() && this.n() > 0;
   }

   public int n() {
      return ayu.a(this.a(km.d, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(km.d, Integer.valueOf(ayu.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(km.c, Integer.valueOf(0));
   }

   public void a(int $$0, azc $$1, @Nullable arc $$2, Runnable $$3) {
      if (this.l()) {
         if ($$0 > 0) {
            int $$4 = czw.a(czy.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (czu.a(this, $$4, $$1)) {
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

   public void a(int $$0, btk $$1, bsw $$2) {
      if (!$$1.dP().B) {
         if ($$1 instanceof cms $$3 && $$3.fP()) {
            return;
         }

         this.a($$0, $$1.el(), $$1 instanceof arc $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            cuf $$2x = this.g();
            this.h(1);
            if ($$1 instanceof cms) {
               ((cms)$$1).b(awg.d.b($$2x));
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

   public boolean a(crk $$0, cpx $$1, cms $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cuk $$0, crk $$1, cpx $$2, cms $$3, buc $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(btk $$0, cms $$1) {
      cuf $$2 = this.g();
      daa $$3 = this.C();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(awg.c.b($$2));
         czw.a($$1, $$0, $$3);
      }
   }

   public void a(dbt $$0, drx $$1, iz $$2, cms $$3) {
      cuf $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awg.c.b($$4));
      }
   }

   public boolean b(drx $$0) {
      return this.g().b(this, $$0);
   }

   public bqp a(cms $$0, btk $$1, bqo $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cuk s() {
      if (this.e()) {
         return l;
      } else {
         cuk $$0 = new cuk(this.g(), this.o, this.r.g());
         $$0.d(this.H());
         return $$0;
      }
   }

   public cuk c(int $$0) {
      if (this.e()) {
         return l;
      } else {
         cuk $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cuk a(dbs $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   public cuk b(dbs $$0, int $$1) {
      return new cuk($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cuk $$0, cuk $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.I() != $$1.I() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cuk> $$0, List<cuk> $$1) {
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

   public static boolean b(cuk $$0, cuk $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cuk $$0, cuk $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cuk> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cuk $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cuk> $$0) {
      int $$1 = 0;

      for (cuk $$2 : $$0) {
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

   public void a(dbt $$0, bsp $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dbt $$0, cms $$1, int $$2) {
      $$1.a(awg.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dbt $$0) {
      this.g().a(this, $$0);
   }

   public int u() {
      return this.g().b(this);
   }

   public cwf v() {
      return this.g().c(this);
   }

   public void a(dbt $$0, btk $$1, int $$2) {
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
      Optional<Error<cuk>> $$2 = b(this).error();
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

   public xl x() {
      xl $$0 = this.a(km.f);
      if ($$0 != null) {
         return $$0;
      } else {
         xl $$1 = this.a(km.g);
         return $$1 != null ? $$1 : this.g().o(this);
      }
   }

   private <T extends cxq> void a(kl<T> $$0, cuf.b $$1, Consumer<xl> $$2, cwd $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xl> a(cuf.b $$0, @Nullable cms $$1, cwd $$2) {
      if (!$$2.b() && this.b(km.p)) {
         return List.of();
      } else {
         List<xl> $$3 = Lists.newArrayList();
         xz $$4 = xl.i().b(this.x()).a(this.z().a());
         if (this.b(km.f)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(km.f) && this.a(cun.rU)) {
            epd $$5 = this.a(km.A);
            if ($$5 != null) {
               $$3.add(cus.a($$5));
            }
         }

         Consumer<xl> $$6 = $$3::add;
         if (!this.b(km.o)) {
            this.g().a(this, $$0, $$3, $$2);
         }

         this.a(km.J, $$0, $$6, $$2);
         this.a(km.x, $$0, $$6, $$2);
         this.a(km.j, $$0, $$6, $$2);
         this.a(km.y, $$0, $$6, $$2);
         this.a(km.h, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(km.e, $$0, $$6, $$2);
         crw $$7 = this.a(km.l);
         if ($$7 != null && $$7.a()) {
            $$6.accept(xk.a);
            $$6.accept(crw.c);
            $$7.a($$6);
         }

         crw $$8 = this.a(km.k);
         if ($$8 != null && $$8.a()) {
            $$6.accept(xk.a);
            $$6.accept(crw.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.m()) {
               $$3.add(xl.a("item.durability", this.o() - this.n(), this.o()));
            }

            $$3.add(xl.b(lp.h.b(this.g()).toString()).a(n.i));
            int $$9 = this.r.d();
            if ($$9 > 0) {
               $$3.add(xl.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.g().a($$1.dP().J())) {
            $$3.add(n);
         }

         return $$3;
      }
   }

   private void a(Consumer<xl> $$0, @Nullable cms $$1) {
      cxf $$2 = this.a(km.m, cxf.a);
      if ($$2.c()) {
         for (bsw $$3 : bsw.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xk.a);
                  $$0.accept(xl.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xl> $$0, @Nullable cms $$1, ji<bun> $$2, buq $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == cuf.e) {
            $$4 += $$1.h(bus.c);
            $$4 += (double)czw.a(this, null);
            $$5 = true;
         } else if ($$3.b() == cuf.f) {
            $$4 += $$1.h(bus.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == buq.a.b || $$3.e() == buq.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bus.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xk.a().b(xl.a("attribute.modifier.equals." + $$3.e().a(), cxf.d.format($$6), xl.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xl.a("attribute.modifier.plus." + $$3.e().a(), cxf.d.format($$6), xl.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(xl.a("attribute.modifier.take." + $$3.e().a(), cxf.d.format(-$$6), xl.c($$2.a().c())).a(n.m));
      }
   }

   public boolean y() {
      Boolean $$0 = this.a(km.s);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cve z() {
      cve $$0 = this.a(km.i, cve.a);
      if (!this.B()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cve.c;
            case c -> cve.d;
            default -> $$0;
         };
      }
   }

   public boolean A() {
      if (!this.g().a(this)) {
         return false;
      } else {
         daa $$0 = this.a(km.j);
         return $$0 != null && $$0.d();
      }
   }

   public void a(czv $$0, int $$1) {
      czw.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean B() {
      return !this.a(km.j, daa.a).d();
   }

   public daa C() {
      return this.a(km.j, daa.a);
   }

   public boolean D() {
      return this.s instanceof civ;
   }

   public void a(@Nullable bsp $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public civ E() {
      return this.s instanceof civ ? (civ)this.F() : null;
   }

   @Nullable
   public bsp F() {
      return !this.e() ? this.s : null;
   }

   public void a(bsw $$0, BiConsumer<ji<bun>, buq> $$1) {
      cxf $$2 = this.a(km.m, cxf.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }
   }

   public xl G() {
      xz $$0 = xl.i().b(this.x());
      if (this.b(km.f)) {
         $$0.a(n.u);
      }

      xz $$1 = xo.a((xl)$$0);
      if (!this.e()) {
         $$1.a(this.z().a()).a($$0x -> $$0x.a(new xr(xr.a.b, new xr.c(this))));
      }

      return $$1;
   }

   public boolean a(dsb $$0) {
      crw $$1 = this.a(km.k);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dsb $$0) {
      crw $$1 = this.a(km.l);
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

   public void a(int $$0, @Nullable btk $$1) {
      if ($$1 == null || !$$1.fP()) {
         this.h($$0);
      }
   }

   public void b(dbt $$0, btk $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cjc $$0) {
      this.g().a($$0);
   }

   public avv J() {
      return this.g().al_();
   }

   public avv K() {
      return this.g().am_();
   }

   public avv L() {
      return this.g().e();
   }

   public boolean a(bri $$0) {
      return !this.b(km.v) || !$$0.a(awn.j);
   }
}
