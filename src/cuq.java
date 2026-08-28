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

public final class cuq implements kh {
   public static final Codec<ji<cul>> a = lp.h
      .r()
      .validate($$0 -> $$0.a(cut.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cuq> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cuq::h),
                     ayh.l.fieldOf("count").orElse(1).forGetter(cuq::I),
                     kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cuq::new)
         )
   );
   public static final Codec<cuq> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cuq::h), kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cuq($$0x, 1, $$1))
         )
   );
   public static final Codec<cuq> d = b.validate(cuq::b);
   public static final Codec<cuq> e = c.validate(cuq::b);
   public static final Codec<cuq> f = ayh.e(b).xmap($$0 -> $$0.orElse(cuq.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cuq> g = a.xmap(cuq::new, cuq::h);
   public static final zn<xa, cuq> h = new zn<xa, cuq>() {
      private static final zn<xa, ji<cul>> a = zl.b(lq.G);

      public cuq a(xa $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cuq.l;
         } else {
            ji<cul> $$2 = a.decode($$0);
            kj $$3 = kj.c.decode($$0);
            return new cuq($$2, $$1, $$3);
         }
      }

      public void a(xa $$0, cuq $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.I());
            a.encode($$0, $$1.h());
            kj.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final zn<xa, cuq> i = new zn<xa, cuq>() {
      public cuq a(xa $$0) {
         cuq $$1 = cuq.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(xa $$0, cuq $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cuq.h.encode($$0, $$1);
         }
      }
   };
   public static final zn<xa, List<cuq>> j = h.a(zl.a(jr::a));
   public static final zn<xa, List<cuq>> k = i.a(zl.a(jr::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cuq l = new cuq((Void)null);
   private static final xp n = xp.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cul q;
   final kn r;
   @Nullable
   private bsv s;

   private static DataResult<cuq> b(cuq $$0) {
      DataResult<bac> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.I() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.I() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static zn<xa, cuq> a(final zn<xa, cuq> $$0) {
      return new zn<xa, cuq>() {
         public cuq a(xa $$0x) {
            cuq $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               ald<bac> $$2 = $$0.G().a(azb.a);
               cuq.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(xa $$0x, cuq $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<csa> b() {
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

   public cuq(dby $$0) {
      this($$0, 1);
   }

   public cuq(ji<cul> $$0) {
      this($$0.a(), 1);
   }

   public cuq(ji<cul> $$0, int $$1, kj $$2) {
      this($$0.a(), $$1, kn.a($$0.a().p(), $$2));
   }

   public cuq(ji<cul> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cuq(dby $$0, int $$1) {
      this($$0, $$1, new kn($$0.r().p()));
   }

   private cuq(dby $$0, int $$1, kn $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().n(this);
   }

   private cuq(@Nullable Void $$0) {
      this.q = null;
      this.r = new kn(ki.a);
   }

   public static DataResult<bac> a(ki $$0) {
      return $$0.b(km.d) && $$0.a(km.c, 1) > 1 ? DataResult.error(() -> "Item cannot be both damageable and stackable") : DataResult.success(bac.a);
   }

   public static Optional<cuq> a(jk.a $$0, vp $$1) {
      return b.parse($$0.a(vg.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cuq a(jk.a $$0, us $$1) {
      return $$1.g() ? l : a($$0, (vp)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cut.a || this.o <= 0;
   }

   public boolean a(cpm $$0) {
      return this.e() || this.g().a($$0);
   }

   public cuq a(int $$0) {
      int $$1 = Math.min($$0, this.I());
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

   public ji<cul> h() {
      return this.g().o();
   }

   public boolean a(axf<cul> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(cul $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<ji<cul>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(ji<cul> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jm<cul> $$0) {
      return $$0.a(this.h());
   }

   public Stream<axf<cul>> i() {
      return this.g().o().c();
   }

   public bqv a(cyd $$0) {
      cmy $$1 = $$0.o();
      iz $$2 = $$0.a();
      if ($$1 != null && !$$1.gd().e && !this.a(new dsh($$0.q(), $$2, false))) {
         return bqv.e;
      } else {
         cul $$3 = this.g();
         bqv $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(awk.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dsd $$0) {
      return this.g().a(this, $$0);
   }

   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cuq a(dbz $$0, btq $$1) {
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
            int $$4 = dac.a(dae.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (daa.a(this, $$4, $$1)) {
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

   public void a(int $$0, btq $$1, btc $$2) {
      if (!$$1.dP().B) {
         if ($$1 instanceof cmy $$3 && $$3.fP()) {
            return;
         }

         this.a($$0, $$1.el(), $$1 instanceof arg $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            cul $$2x = this.g();
            this.h(1);
            if ($$1 instanceof cmy) {
               ((cmy)$$1).b(awk.d.b($$2x));
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

   public boolean a(crq $$0, cqd $$1, cmy $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cuq $$0, crq $$1, cqd $$2, cmy $$3, bui $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(btq $$0, cmy $$1) {
      cul $$2 = this.g();
      dag $$3 = this.C();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(awk.c.b($$2));
         dac.a($$1, $$0, $$3);
      }
   }

   public void a(dbz $$0, dsd $$1, iz $$2, cmy $$3) {
      cul $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awk.c.b($$4));
      }
   }

   public boolean b(dsd $$0) {
      return this.g().b(this, $$0);
   }

   public bqv a(cmy $$0, btq $$1, bqu $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cuq s() {
      if (this.e()) {
         return l;
      } else {
         cuq $$0 = new cuq(this.g(), this.o, this.r.g());
         $$0.d(this.H());
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

   public cuq a(dby $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   public cuq b(dby $$0, int $$1) {
      return new cuq($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cuq $$0, cuq $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.I() != $$1.I() ? false : c($$0, $$1);
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
      return this.g().i(this);
   }

   @Override
   public String toString() {
      return this.I() + " " + this.g();
   }

   public void a(dbz $$0, bsv $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dbz $$0, cmy $$1, int $$2) {
      $$1.a(awk.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dbz $$0) {
      this.g().a(this, $$0);
   }

   public int u() {
      return this.g().b(this);
   }

   public cwl v() {
      return this.g().c(this);
   }

   public void a(dbz $$0, btq $$1, int $$2) {
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
      Optional<Error<cuq>> $$2 = b(this).error();
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

   private <T extends cxw> void a(kl<T> $$0, cul.b $$1, Consumer<xp> $$2, cwj $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xp> a(cul.b $$0, @Nullable cmy $$1, cwj $$2) {
      if (!$$2.b() && this.b(km.q)) {
         return List.of();
      } else {
         List<xp> $$3 = Lists.newArrayList();
         yd $$4 = xp.i().b(this.x()).a(this.z().a());
         if (this.b(km.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(km.g) && this.a(cut.rU)) {
            epj $$5 = this.a(km.B);
            if ($$5 != null) {
               $$3.add(cuy.a($$5));
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
         csc $$7 = this.a(km.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(xo.a);
            $$6.accept(csc.c);
            $$7.a($$6);
         }

         csc $$8 = this.a(km.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(xo.a);
            $$6.accept(csc.d);
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

   private void a(Consumer<xp> $$0, @Nullable cmy $$1) {
      cxl $$2 = this.a(km.n, cxl.a);
      if ($$2.c()) {
         for (btc $$3 : btc.values()) {
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

   private void a(Consumer<xp> $$0, @Nullable cmy $$1, ji<but> $$2, buw $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == cul.e) {
            $$4 += $$1.h(buy.c);
            $$4 += (double)dac.a(this, null);
            $$5 = true;
         } else if ($$3.b() == cul.f) {
            $$4 += $$1.h(buy.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == buw.a.b || $$3.e() == buw.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(buy.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xo.a().b(xp.a("attribute.modifier.equals." + $$3.e().a(), cxl.d.format($$6), xp.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xp.a("attribute.modifier.plus." + $$3.e().a(), cxl.d.format($$6), xp.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(xp.a("attribute.modifier.take." + $$3.e().a(), cxl.d.format(-$$6), xp.c($$2.a().c())).a(n.m));
      }
   }

   public boolean y() {
      Boolean $$0 = this.a(km.t);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cvk z() {
      cvk $$0 = this.a(km.j, cvk.a);
      if (!this.B()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cvk.c;
            case c -> cvk.d;
            default -> $$0;
         };
      }
   }

   public boolean A() {
      if (!this.g().a(this)) {
         return false;
      } else {
         dag $$0 = this.a(km.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(dab $$0, int $$1) {
      dac.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean B() {
      return !this.a(km.k, dag.a).d();
   }

   public dag C() {
      return this.a(km.k, dag.a);
   }

   public boolean D() {
      return this.s instanceof cjb;
   }

   public void a(@Nullable bsv $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public cjb E() {
      return this.s instanceof cjb ? (cjb)this.F() : null;
   }

   @Nullable
   public bsv F() {
      return !this.e() ? this.s : null;
   }

   public void a(btc $$0, BiConsumer<ji<but>, buw> $$1) {
      cxl $$2 = this.a(km.n, cxl.a);
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

   public boolean a(dsh $$0) {
      csc $$1 = this.a(km.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dsh $$0) {
      csc $$1 = this.a(km.m);
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

   public void a(int $$0, @Nullable btq $$1) {
      if ($$1 == null || !$$1.fP()) {
         this.h($$0);
      }
   }

   public void b(dbz $$0, btq $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cji $$0) {
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

   public boolean a(bro $$0) {
      return !this.b(km.w) || !$$0.a(awr.j);
   }
}
