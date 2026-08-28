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

public final class cwb implements kp {
   public static final Codec<jq<cvx>> a = ly.g
      .r()
      .validate($$0 -> $$0.a(cwf.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cwb> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cwb::i),
                     ayt.a(1, 99).fieldOf("count").orElse(1).forGetter(cwb::L),
                     kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cwb::new)
         )
   );
   public static final Codec<cwb> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cwb::i), kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cwb($$0x, 1, $$1))
         )
   );
   public static final Codec<cwb> d = b.validate(cwb::c);
   public static final Codec<cwb> e = c.validate(cwb::c);
   public static final Codec<cwb> f = ayt.f(b).xmap($$0 -> $$0.orElse(cwb.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cwb> g = a.xmap(cwb::new, cwb::i);
   public static final zg<wt, cwb> h = new zg<wt, cwb>() {
      private static final zg<wt, jq<cvx>> a = ze.b(lz.K);

      public cwb a(wt $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cwb.k;
         } else {
            jq<cvx> $$2 = a.decode($$0);
            kr $$3 = kr.c.decode($$0);
            return new cwb($$2, $$1, $$3);
         }
      }

      public void a(wt $$0, cwb $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.L());
            a.encode($$0, $$1.i());
            kr.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zg<wt, cwb> i = new zg<wt, cwb>() {
      public cwb a(wt $$0) {
         cwb $$1 = cwb.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wt $$0, cwb $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cwb.h.encode($$0, $$1);
         }
      }
   };
   public static final zg<wt, List<cwb>> j = h.a(ze.a(jz::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cwb k = new cwb((Void)null);
   private static final xi m = xi.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cvx p;
   final kv q;
   @Nullable
   private bue r;

   private static DataResult<cwb> c(cwb $$0) {
      DataResult<bap> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.L() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.L() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zg<wt, cwb> a(final zg<wt, cwb> $$0) {
      return new zg<wt, cwb>() {
         public cwb a(wt $$0x) {
            cwb $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alg<bap> $$2 = $$0.H().a(azm.a);
               cwb.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wt $$0x, cwb $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<ctv> b() {
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

   public cwb(dfa $$0) {
      this($$0, 1);
   }

   public cwb(jq<cvx> $$0) {
      this($$0.a(), 1);
   }

   public cwb(jq<cvx> $$0, int $$1, kr $$2) {
      this($$0.a(), $$1, kv.a($$0.a().g(), $$2));
   }

   public cwb(jq<cvx> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cwb(dfa $$0, int $$1) {
      this($$0, $$1, new kv($$0.j().g()));
   }

   private cwb(dfa $$0, int $$1, kv $$2) {
      this.p = $$0.j();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cwb(@Nullable Void $$0) {
      this.p = null;
      this.q = new kv(kq.a);
   }

   public static DataResult<bap> a(kq $$0) {
      if ($$0.b(ku.d) && $$0.a(ku.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cyt $$1 = $$0.a(ku.al, cyt.a);

         for (cwb $$2 : $$1.d()) {
            int $$3 = $$2.L();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bap.a);
      }
   }

   public static Optional<cwb> a(js.a $$0, vh $$1) {
      return b.parse($$0.a(uy.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cwb a(js.a $$0, uk $$1) {
      return $$1.g() ? k : a($$0, (vh)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cwf.a || this.n <= 0;
   }

   public boolean a(crf $$0) {
      return this.f() || this.h().a($$0);
   }

   public cwb a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cwb $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cwb g() {
      if (this.f()) {
         return k;
      } else {
         cwb $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cvx h() {
      return this.f() ? cwf.a : this.p;
   }

   public jq<cvx> i() {
      return this.h().f();
   }

   public boolean a(axq<cvx> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cvx $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jq<cvx>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jq<cvx> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(ju<cvx> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axq<cvx>> j() {
      return this.h().f().c();
   }

   public bsd a(czu $$0) {
      com $$1 = $$0.o();
      jh $$2 = $$0.a();
      if ($$1 != null && !$$1.gl().e && !this.a(new dvn($$0.q(), $$2, false))) {
         return bsd.e;
      } else {
         cvx $$3 = this.h();
         bsd $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bsd.d $$5 && $$5.c()) {
            $$1.b(awv.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dvj $$0) {
      return this.h().a(this, $$0);
   }

   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = this.v();
      boolean $$4 = this.a((bva)$$1) <= 0;
      bsd $$5 = this.h().a($$0, $$1, $$2);
      return (bsd)($$4 && $$5 instanceof bsd.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cwb a(dfb $$0, bva $$1) {
      cwb $$2 = this.v();
      cwb $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cwb a(bva $$0, cwb $$1) {
      czh $$2 = $$1.a(ku.y);
      czg $$3 = $$1.a(ku.z);
      int $$4 = $$1.L();
      cwb $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a($$0, this, $$4);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vh b(js.a $$0, vh $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vh)b.encode(this, $$0.a(uy.a), $$1).getOrThrow();
      }
   }

   public vh a(js.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vh)b.encodeStart($$0.a(uy.a), this).getOrThrow();
      }
   }

   public vh b(js.a $$0) {
      return (vh)(this.f() ? new uk() : this.b($$0, new uk()));
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
      return azk.a(this.a(ku.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(ku.e, Integer.valueOf(azk.a($$0, 0, this.p())));
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

   public void a(int $$0, arn $$1, @Nullable aro $$2, Consumer<cvx> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 > 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arn $$1, @Nullable aro $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fX()) {
         return 0;
      } else {
         return $$0 > 0 ? dbu.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable aro $$1, Consumer<cvx> $$2) {
      if ($$1 != null) {
         ao.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cvx $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, com $$1) {
      if ($$1 instanceof aro $$2) {
         int $$3 = this.a($$0, $$2.B(), $$2);
         if ($$3 <= 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bva $$1, bum $$2) {
      if ($$1.dX() instanceof arn $$3) {
         this.a($$0, $$3, $$1 instanceof aro $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cwb a(int $$0, dfa $$1, bva $$2, bum $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cwb $$4 = this.b($$1, 1);
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

   public boolean a(ctl $$0, cry $$1, com $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cwb $$0, ctl $$1, cry $$2, com $$3, bvs $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bva $$0, bva $$1) {
      cvx $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof com $$3) {
            $$3.b(awv.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bva $$0, bva $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dfb $$0, dvj $$1, jh $$2, com $$3) {
      cvx $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awv.c.b($$4));
      }
   }

   public boolean b(dvj $$0) {
      return this.h().b(this, $$0);
   }

   public bsd a(com $$0, bva $$1, bsc $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cwb v() {
      if (this.f()) {
         return k;
      } else {
         cwb $$0 = new cwb(this.h(), this.n, this.q.h());
         $$0.d(this.K());
         return $$0;
      }
   }

   public cwb c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cwb $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cwb a(dfa $$0) {
      return this.a($$0, this.L());
   }

   public cwb a(dfa $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cwb b(dfa $$0, int $$1) {
      return new cwb($$0.j().f(), $$1, this.q.g());
   }

   public static boolean a(cwb $$0, cwb $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cwb> $$0, List<cwb> $$1) {
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

   public static boolean b(cwb $$0, cwb $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cwb $$0, cwb $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cwb> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cwb $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cwb> $$0) {
      int $$1 = 0;

      for (cwb $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.L() + " " + this.h();
   }

   public void a(dfb $$0, bue $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dfb $$0, com $$1, int $$2) {
      $$1.a(awv.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dfb $$0) {
      this.h().a(this, $$0);
   }

   public int a(bva $$0) {
      return this.h().a(this, $$0);
   }

   public cwd w() {
      return this.h().b(this);
   }

   public void a(dfb $$0, bva $$1, int $$2) {
      cwb $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cwb $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fC(), $$4);
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
      Optional<Error<cwb>> $$2 = c(this).error();
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

   public xi y() {
      xi $$0 = this.a(ku.g);
      if ($$0 != null) {
         return $$0;
      } else {
         czj $$1 = this.a(ku.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bah.h($$2)) {
               return xi.b($$2);
            }
         }

         return this.z();
      }
   }

   public xi z() {
      return this.h().a(this);
   }

   public xi A() {
      xw $$0 = xi.i().b(this.y()).a(this.C().a());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends cze> void a(kt<T> $$0, cvx.b $$1, Consumer<xi> $$2, cxt $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xi> a(cvx.b $$0, @Nullable com $$1, cxt $$2) {
      if (!$$2.b() && this.b(ku.r)) {
         return List.of();
      } else {
         List<xi> $$3 = Lists.newArrayList();
         $$3.add(this.A());
         if (!$$2.a() && !this.b(ku.g)) {
            etc $$4 = this.a(ku.L);
            if ($$4 != null) {
               $$3.add(cwo.a($$4));
            }
         }

         Consumer<xi> $$5 = $$3::add;
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
         ctx $$6 = this.a(ku.n);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xh.a);
            $$5.accept(ctx.c);
            $$6.a($$5);
         }

         ctx $$7 = this.a(ku.m);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xh.a);
            $$5.accept(ctx.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xi.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xi.b(ly.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.q.d();
            if ($$8 > 0) {
               $$3.add(xi.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dX().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xi> $$0, @Nullable com $$1) {
      cys $$2 = this.a(ku.o, cys.a);
      if ($$2.c()) {
         for (bun $$3 : bun.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xh.a);
                  $$0.accept(xi.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xi> $$0, @Nullable com $$1, jq<bwd> $$2, bwg $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cvx.f)) {
            $$4 += $$1.i(bwi.c);
            $$5 = true;
         } else if ($$3.a(cvx.g)) {
            $$4 += $$1.i(bwi.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bwg.a.b || $$3.d() == bwg.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bwi.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xh.a().b(xi.a("attribute.modifier.equals." + $$3.d().a(), cys.d.format($$6), xi.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xi.a("attribute.modifier.plus." + $$3.d().a(), cys.d.format($$6), xi.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xi.a("attribute.modifier.take." + $$3.d().a(), cys.d.format(-$$6), xi.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean B() {
      Boolean $$0 = this.a(ku.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cwy C() {
      cwy $$0 = this.a(ku.k, cwy.a);
      if (!this.E()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cwy.c;
            case c -> cwy.d;
            default -> $$0;
         };
      }
   }

   public boolean D() {
      if (!this.b(ku.C)) {
         return false;
      } else {
         dby $$0 = this.a(ku.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jq<dbs> $$0, int $$1) {
      dbu.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean E() {
      return !this.a(ku.l, dby.a).d();
   }

   public dby F() {
      return this.a(ku.l, dby.a);
   }

   public boolean G() {
      return this.r instanceof cko;
   }

   public void a(@Nullable bue $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public cko H() {
      return this.r instanceof cko ? (cko)this.I() : null;
   }

   @Nullable
   public bue I() {
      return !this.f() ? this.r : null;
   }

   public void a(bun $$0, BiConsumer<jq<bwd>, bwg> $$1) {
      cys $$2 = this.a(ku.o, cys.a);
      $$2.a($$0, $$1);
      dbu.a(this, $$0, $$1);
   }

   public void a(bum $$0, BiConsumer<jq<bwd>, bwg> $$1) {
      cys $$2 = this.a(ku.o, cys.a);
      $$2.a($$0, $$1);
      dbu.a(this, $$0, $$1);
   }

   public xi J() {
      xw $$0 = xi.i().b(this.y());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      xw $$1 = xl.a((xi)$$0);
      if (!this.f()) {
         $$1.a(this.C().a()).a($$0x -> $$0x.a(new xo(xo.a.b, new xo.c(this))));
      }

      return $$1;
   }

   public boolean a(dvn $$0) {
      ctx $$1 = this.a(ku.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dvn $$0) {
      ctx $$1 = this.a(ku.n);
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

   public void a(int $$0, @Nullable bva $$1) {
      if ($$1 == null || !$$1.fX()) {
         this.h($$0);
      }
   }

   public cwb b(int $$0, @Nullable bva $$1) {
      cwb $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dfb $$0, bva $$1, int $$2) {
      cyh $$3 = this.a(ku.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.ea(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(ckv $$0) {
      this.h().a($$0);
   }

   public awk M() {
      return this.h().a();
   }

   public boolean a(bsu $$0) {
      cym $$1 = this.a(ku.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cwb $$0) {
      dca $$1 = this.a(ku.E);
      return $$1 != null && $$1.a($$0);
   }
}
