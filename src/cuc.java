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

public final class cuc implements ki {
   public static final Codec<jj<ctx>> a = lq.g
      .s()
      .validate($$0 -> $$0.a(cuf.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cuc> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cuc::h),
                     axo.a(1, 99).fieldOf("count").orElse(1).forGetter(cuc::H),
                     kk.b.optionalFieldOf("components", kk.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cuc::new)
         )
   );
   public static final Codec<cuc> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cuc::h), kk.b.optionalFieldOf("components", kk.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cuc($$0x, 1, $$1))
         )
   );
   public static final Codec<cuc> d = b.validate(cuc::b);
   public static final Codec<cuc> e = c.validate(cuc::b);
   public static final Codec<cuc> f = axo.e(b).xmap($$0 -> $$0.orElse(cuc.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cuc> g = a.xmap(cuc::new, cuc::h);
   public static final ys<wf, cuc> h = new ys<wf, cuc>() {
      private static final ys<wf, jj<ctx>> a = yq.b(lr.K);

      public cuc a(wf $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cuc.l;
         } else {
            jj<ctx> $$2 = a.decode($$0);
            kk $$3 = kk.c.decode($$0);
            return new cuc($$2, $$1, $$3);
         }
      }

      public void a(wf $$0, cuc $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.H());
            a.encode($$0, $$1.h());
            kk.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final ys<wf, cuc> i = new ys<wf, cuc>() {
      public cuc a(wf $$0) {
         cuc $$1 = cuc.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wf $$0, cuc $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cuc.h.encode($$0, $$1);
         }
      }
   };
   public static final ys<wf, List<cuc>> j = h.a(yq.a(js::a));
   public static final ys<wf, List<cuc>> k = i.a(yq.a(js::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cuc l = new cuc((Void)null);
   private static final wu n = wu.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final ctx q;
   final ko r;
   @Nullable
   private bsg s;

   private static DataResult<cuc> b(cuc $$0) {
      DataResult<azk> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.H() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.H() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static ys<wf, cuc> a(final ys<wf, cuc> $$0) {
      return new ys<wf, cuc>() {
         public cuc a(wf $$0x) {
            cuc $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               aki<azk> $$2 = $$0.G().a(ayi.a);
               cuc.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wf $$0x, cuc $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<crn> b() {
      return this.g().g(this);
   }

   @Override
   public kj a() {
      return (kj)(!this.e() ? this.r : kj.a);
   }

   public kj c() {
      return !this.e() ? this.g().p() : kj.a;
   }

   public kk d() {
      return !this.e() ? this.r.f() : kk.a;
   }

   public cuc(dce $$0) {
      this($$0, 1);
   }

   public cuc(jj<ctx> $$0) {
      this($$0.a(), 1);
   }

   public cuc(jj<ctx> $$0, int $$1, kk $$2) {
      this($$0.a(), $$1, ko.a($$0.a().p(), $$2));
   }

   public cuc(jj<ctx> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cuc(dce $$0, int $$1) {
      this($$0, $$1, new ko($$0.r().p()));
   }

   private cuc(dce $$0, int $$1, ko $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().m(this);
   }

   private cuc(@Nullable Void $$0) {
      this.q = null;
      this.r = new ko(kj.a);
   }

   public static DataResult<azk> a(kj $$0) {
      if ($$0.b(kn.d) && $$0.a(kn.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cwx $$1 = $$0.a(kn.aa, cwx.a);

         for (cuc $$2 : $$1.d()) {
            int $$3 = $$2.H();
            int $$4 = $$2.j();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(azk.a);
      }
   }

   public static Optional<cuc> a(jl.a $$0, uu $$1) {
      return b.parse($$0.a(ul.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cuc a(jl.a $$0, tx $$1) {
      return $$1.g() ? l : a($$0, (uu)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cuf.a || this.o <= 0;
   }

   public boolean a(coy $$0) {
      return this.e() || this.g().a($$0);
   }

   public cuc a(int $$0) {
      int $$1 = Math.min($$0, this.H());
      cuc $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cuc f() {
      if (this.e()) {
         return l;
      } else {
         cuc $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public ctx g() {
      return this.e() ? cuf.a : this.q;
   }

   public jj<ctx> h() {
      return this.g().o();
   }

   public boolean a(awm<ctx> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(ctx $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<jj<ctx>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(jj<ctx> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jn<ctx> $$0) {
      return $$0.a(this.h());
   }

   public Stream<awm<ctx>> i() {
      return this.g().o().c();
   }

   public bqg a(cxo $$0) {
      cmk $$1 = $$0.o();
      ja $$2 = $$0.a();
      if ($$1 != null && !$$1.ga().e && !this.a(new dso($$0.q(), $$2, false))) {
         return bqg.e;
      } else {
         ctx $$3 = this.g();
         bqg $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avr.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dsk $$0) {
      return this.g().a(this, $$0);
   }

   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cuc a(dcf $$0, btb $$1) {
      return this.g().a(this, $$0, $$1);
   }

   public uu b(jl.a $$0, uu $$1) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uu)b.encode(this, $$0.a(ul.a), $$1).getOrThrow();
      }
   }

   public uu a(jl.a $$0) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uu)b.encodeStart($$0.a(ul.a), this).getOrThrow();
      }
   }

   public uu b(jl.a $$0) {
      return (uu)(this.e() ? new tx() : this.b($$0, new tx()));
   }

   public int j() {
      return this.a(kn.c, Integer.valueOf(1));
   }

   public boolean k() {
      return this.j() > 1 && (!this.l() || !this.m());
   }

   public boolean l() {
      return this.b(kn.d) && !this.b(kn.f) && this.b(kn.e);
   }

   public boolean m() {
      return this.l() && this.n() > 0;
   }

   public int n() {
      return ayg.a(this.a(kn.e, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(kn.e, Integer.valueOf(ayg.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(kn.d, Integer.valueOf(0));
   }

   public void a(int $$0, aqm $$1, @Nullable aqn $$2, Runnable $$3) {
      if (this.l()) {
         if ($$0 > 0) {
            $$0 = czn.a($$1, this, $$0);
            if ($$0 <= 0) {
               return;
            }
         }

         if ($$2 != null && $$0 != 0) {
            am.u.a($$2, this, this.n() + $$0);
         }

         int $$4 = this.n() + $$0;
         this.b($$4);
         if ($$4 >= this.o()) {
            $$3.run();
         }
      }
   }

   public void a(int $$0, btb $$1, bsn $$2) {
      if (!($$1.dQ() instanceof aqm $$3)) {
         return;
      }

      if ($$1 instanceof cmk $$4 && $$4.fM()) {
         return;
      }

      this.a($$0, $$3, $$1 instanceof aqn $$6 ? $$6 : null, () -> {
         $$1.e($$2);
         ctx $$2x = this.g();
         this.h(1);
         if ($$1 instanceof cmk) {
            ((cmk)$$1).b(avr.d.b($$2x));
         }

         this.b(0);
      });
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

   public boolean a(crd $$0, cpq $$1, cmk $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cuc $$0, crd $$1, cpq $$2, cmk $$3, btt $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(btb $$0, cmk $$1) {
      ctx $$2 = this.g();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avr.c.b($$2));
         return true;
      } else {
         return false;
      }
   }

   public void b(btb $$0, cmk $$1) {
      this.g().b(this, $$0, $$1);
   }

   public void a(dcf $$0, dsk $$1, ja $$2, cmk $$3) {
      ctx $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avr.c.b($$4));
      }
   }

   public boolean b(dsk $$0) {
      return this.g().b(this, $$0);
   }

   public bqg a(cmk $$0, btb $$1, bqf $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cuc s() {
      if (this.e()) {
         return l;
      } else {
         cuc $$0 = new cuc(this.g(), this.o, this.r.g());
         $$0.d(this.G());
         return $$0;
      }
   }

   public cuc c(int $$0) {
      if (this.e()) {
         return l;
      } else {
         cuc $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cuc a(dce $$0) {
      return this.a($$0, this.H());
   }

   public cuc a(dce $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   public cuc b(dce $$0, int $$1) {
      return new cuc($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cuc $$0, cuc $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.H() != $$1.H() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cuc> $$0, List<cuc> $$1) {
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

   public static boolean b(cuc $$0, cuc $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cuc $$0, cuc $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cuc> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cuc $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cuc> $$0) {
      int $$1 = 0;

      for (cuc $$2 : $$0) {
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

   public void a(dcf $$0, bsg $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dcf $$0, cmk $$1, int $$2) {
      $$1.a(avr.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dcf $$0) {
      this.g().a(this, $$0);
   }

   public int a(btb $$0) {
      return this.g().a(this, $$0);
   }

   public cvx u() {
      return this.g().b(this);
   }

   public void a(dcf $$0, btb $$1, int $$2) {
      this.g().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.g().l(this);
   }

   @Nullable
   public <T> T b(km<? super T> $$0, @Nullable T $$1) {
      return this.r.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(km<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(km<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(km<? extends T> $$0) {
      return this.r.d($$0);
   }

   public void a(kk $$0) {
      kk $$1 = this.r.f();
      this.r.a($$0);
      Optional<Error<cuc>> $$2 = b(this).error();
      if ($$2.isPresent()) {
         m.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.r.b($$1);
      } else {
         this.g().m(this);
      }
   }

   public void b(kk $$0) {
      this.r.a($$0);
      this.g().m(this);
   }

   public void b(kj $$0) {
      this.r.a($$0);
      this.g().m(this);
   }

   public wu w() {
      wu $$0 = this.a(kn.g);
      if ($$0 != null) {
         return $$0;
      } else {
         wu $$1 = this.a(kn.h);
         return $$1 != null ? $$1 : this.g().n(this);
      }
   }

   private <T extends cxh> void a(km<T> $$0, ctx.b $$1, Consumer<wu> $$2, cvv $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wu> a(ctx.b $$0, @Nullable cmk $$1, cvv $$2) {
      if (!$$2.b() && this.b(kn.q)) {
         return List.of();
      } else {
         List<wu> $$3 = Lists.newArrayList();
         xi $$4 = wu.i().b(this.w()).a(this.y().a());
         if (this.b(kn.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kn.g) && this.a(cuf.rU)) {
            epu $$5 = this.a(kn.B);
            if ($$5 != null) {
               $$3.add(cuk.a($$5));
            }
         }

         Consumer<wu> $$6 = $$3::add;
         if (!this.b(kn.p)) {
            this.g().a(this, $$0, $$3, $$2);
         }

         this.a(kn.K, $$0, $$6, $$2);
         this.a(kn.y, $$0, $$6, $$2);
         this.a(kn.k, $$0, $$6, $$2);
         this.a(kn.z, $$0, $$6, $$2);
         this.a(kn.i, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kn.f, $$0, $$6, $$2);
         crp $$7 = this.a(kn.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wt.a);
            $$6.accept(crp.c);
            $$7.a($$6);
         }

         crp $$8 = this.a(kn.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wt.a);
            $$6.accept(crp.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.m()) {
               $$3.add(wu.a("item.durability", this.o() - this.n(), this.o()));
            }

            $$3.add(wu.b(lq.g.b(this.g()).toString()).a(n.i));
            int $$9 = this.r.d();
            if ($$9 > 0) {
               $$3.add(wu.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.g().a($$1.dQ().J())) {
            $$3.add(n);
         }

         return $$3;
      }
   }

   private void a(Consumer<wu> $$0, @Nullable cmk $$1) {
      cww $$2 = this.a(kn.n, cww.a);
      if ($$2.c()) {
         for (bsn $$3 : bsn.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wt.a);
                  $$0.accept(wu.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wu> $$0, @Nullable cmk $$1, jj<bue> $$2, buh $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == ctx.e) {
            $$4 += $$1.h(buj.c);
            $$5 = true;
         } else if ($$3.b() == ctx.f) {
            $$4 += $$1.h(buj.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == buh.a.b || $$3.e() == buh.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(buj.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wt.a().b(wu.a("attribute.modifier.equals." + $$3.e().a(), cww.d.format($$6), wu.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wu.a("attribute.modifier.plus." + $$3.e().a(), cww.d.format($$6), wu.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wu.a("attribute.modifier.take." + $$3.e().a(), cww.d.format(-$$6), wu.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(kn.t);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cuw y() {
      cuw $$0 = this.a(kn.j, cuw.a);
      if (!this.A()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cuw.c;
            case c -> cuw.d;
            default -> $$0;
         };
      }
   }

   public boolean z() {
      if (!this.g().a(this)) {
         return false;
      } else {
         czr $$0 = this.a(kn.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jj<czl> $$0, int $$1) {
      czn.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(kn.k, czr.a).d();
   }

   public czr B() {
      return this.a(kn.k, czr.a);
   }

   public boolean C() {
      return this.s instanceof cin;
   }

   public void a(@Nullable bsg $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public cin D() {
      return this.s instanceof cin ? (cin)this.E() : null;
   }

   @Nullable
   public bsg E() {
      return !this.e() ? this.s : null;
   }

   public void a(bsn $$0, BiConsumer<jj<bue>, buh> $$1) {
      cww $$2 = this.a(kn.n, cww.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      czn.a(this, $$0, $$1);
   }

   public wu F() {
      xi $$0 = wu.i().b(this.w());
      if (this.b(kn.g)) {
         $$0.a(n.u);
      }

      xi $$1 = wx.a((wu)$$0);
      if (!this.e()) {
         $$1.a(this.y().a()).a($$0x -> $$0x.a(new xa(xa.a.b, new xa.c(this))));
      }

      return $$1;
   }

   public boolean a(dso $$0) {
      crp $$1 = this.a(kn.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dso $$0) {
      crp $$1 = this.a(kn.m);
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

   public void a(int $$0, @Nullable btb $$1) {
      if ($$1 == null || !$$1.fM()) {
         this.h($$0);
      }
   }

   public cuc b(int $$0, @Nullable btb $$1) {
      cuc $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dcf $$0, btb $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(ciu $$0) {
      this.g().a($$0);
   }

   public avg I() {
      return this.g().al_();
   }

   public avg J() {
      return this.g().am_();
   }

   public avg K() {
      return this.g().e();
   }

   public boolean a(bqz $$0) {
      return !this.b(kn.w) || !$$0.a(avy.j);
   }
}
