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

public final class cwn implements kq {
   public static final Codec<cwn> a = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     cwj.e.fieldOf("id").forGetter(cwn::i),
                     ayh.a(1, 99).fieldOf("count").orElse(1).forGetter(cwn::M),
                     ks.b.optionalFieldOf("components", ks.a).forGetter($$0x -> $$0x.p.g())
                  )
                  .apply($$0, cwn::new)
         )
   );
   public static final Codec<cwn> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cwj.e.fieldOf("id").forGetter(cwn::i), ks.b.optionalFieldOf("components", ks.a).forGetter($$0x -> $$0x.p.g()))
                  .apply($$0, ($$0x, $$1) -> new cwn($$0x, 1, $$1))
         )
   );
   public static final Codec<cwn> c = a.validate(cwn::c);
   public static final Codec<cwn> d = b.validate(cwn::c);
   public static final Codec<cwn> e = ayh.g(a).xmap($$0 -> $$0.orElse(cwn.j), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cwn> f = cwj.e.xmap(cwn::new, cwn::i);
   public static final ym<vz, cwn> g = new ym<vz, cwn>() {
      private static final ym<vz, jr<cwj>> a = yk.b(mc.K);

      public cwn a(vz $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cwn.j;
         } else {
            jr<cwj> $$2 = a.decode($$0);
            ks $$3 = ks.c.decode($$0);
            return new cwn($$2, $$1, $$3);
         }
      }

      public void a(vz $$0, cwn $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            a.encode($$0, $$1.i());
            ks.c.encode($$0, $$1.p.g());
         }
      }
   };
   public static final ym<vz, cwn> h = new ym<vz, cwn>() {
      public cwn a(vz $$0) {
         cwn $$1 = cwn.g.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(vz $$0, cwn $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cwn.g.encode($$0, $$1);
         }
      }
   };
   public static final ym<vz, List<cwn>> i = g.a(yk.a(ka::a));
   private static final Logger k = LogUtils.getLogger();
   public static final cwn j = new cwn((Void)null);
   private static final wo l = wo.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final cwj o;
   final kw p;
   @Nullable
   private buj q;

   private static DataResult<cwn> c(cwn $$0) {
      DataResult<bae> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static ym<vz, cwn> a(final ym<vz, cwn> $$0) {
      return new ym<vz, cwn>() {
         public cwn a(vz $$0x) {
            cwn $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               aks<bae> $$2 = $$0.H().a(aza.a);
               cwn.a.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(vz $$0x, cwn $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cuh> b() {
      return this.h().k(this);
   }

   @Override
   public kr a() {
      return (kr)(!this.f() ? this.p : kr.a);
   }

   public kr c() {
      return !this.f() ? this.h().g() : kr.a;
   }

   public ks d() {
      return !this.f() ? this.p.g() : ks.a;
   }

   public kr e() {
      return !this.f() ? this.p.i() : kr.a;
   }

   public boolean c(ku<?> $$0) {
      return !this.f() && this.p.d($$0);
   }

   public cwn(dgf $$0) {
      this($$0, 1);
   }

   public cwn(jr<cwj> $$0) {
      this($$0.a(), 1);
   }

   public cwn(jr<cwj> $$0, int $$1, ks $$2) {
      this($$0.a(), $$1, kw.a($$0.a().g(), $$2));
   }

   public cwn(jr<cwj> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cwn(dgf $$0, int $$1) {
      this($$0, $$1, new kw($$0.j().g()));
   }

   private cwn(dgf $$0, int $$1, kw $$2) {
      this.o = $$0.j();
      this.m = $$1;
      this.p = $$2;
      this.h().l(this);
   }

   private cwn(@Nullable Void $$0) {
      this.o = null;
      this.p = new kw(kr.a);
   }

   public static DataResult<bae> a(kr $$0) {
      if ($$0.b(kv.d) && $$0.a(kv.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         czf $$1 = $$0.a(kv.al, czf.a);

         for (cwn $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bae.a);
      }
   }

   public static Optional<cwn> a(jt.a $$0, un $$1) {
      return a.parse($$0.a(ue.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cwn a(jt.a $$0, tq $$1) {
      return $$1.g() ? j : a($$0, (un)$$1).orElse(j);
   }

   public boolean f() {
      return this == j || this.o == cwr.a || this.m <= 0;
   }

   public boolean a(crr $$0) {
      return this.f() || this.h().a($$0);
   }

   public cwn a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cwn $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cwn g() {
      if (this.f()) {
         return j;
      } else {
         cwn $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cwj h() {
      return this.f() ? cwr.a : this.o;
   }

   public jr<cwj> i() {
      return this.h().f();
   }

   public boolean a(axe<cwj> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cwj $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jr<cwj>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jr<cwj> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(jv<cwj> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axe<cwj>> j() {
      return this.h().f().c();
   }

   public bsi a(dag $$0) {
      cov $$1 = $$0.o();
      ji $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new dwz($$0.q(), $$2, false))) {
         return bsi.e;
      } else {
         cwj $$3 = this.h();
         bsi $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bsi.d $$5 && $$5.c()) {
            $$1.b(awj.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dwv $$0) {
      return this.h().a(this, $$0);
   }

   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = this.v();
      boolean $$4 = this.a((bvf)$$1) <= 0;
      bsi $$5 = this.h().a($$0, $$1, $$2);
      return (bsi)($$4 && $$5 instanceof bsi.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cwn a(dgg $$0, bvf $$1) {
      cwn $$2 = this.v();
      cwn $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cwn a(bvf $$0, cwn $$1) {
      czt $$2 = $$1.a(kv.y);
      czs $$3 = $$1.a(kv.z);
      int $$4 = $$1.M();
      cwn $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fV(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public un b(jt.a $$0, un $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (un)a.encode(this, $$0.a(ue.a), $$1).getOrThrow();
      }
   }

   public un a(jt.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (un)a.encodeStart($$0.a(ue.a), this).getOrThrow();
      }
   }

   public un b(jt.a $$0) {
      return (un)(this.f() ? new tq() : this.b($$0, new tq()));
   }

   public int k() {
      return this.a(kv.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.b(kv.d) && !this.b(kv.f) && this.b(kv.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return ayy.a(this.a(kv.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kv.e, Integer.valueOf(ayy.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kv.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, arc $$1, @Nullable ard $$2, Consumer<cwj> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arc $$1, @Nullable ard $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fV()) {
         return 0;
      } else {
         return $$0 > 0 ? dcz.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable ard $$1, Consumer<cwj> $$2) {
      if ($$1 != null) {
         ap.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cwj $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cov $$1) {
      if ($$1 instanceof ard $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bvf $$1, bur $$2) {
      if ($$1.dW() instanceof arc $$3) {
         this.a($$0, $$3, $$1 instanceof ard $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cwn a(int $$0, dgf $$1, bvf $$2, bur $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cwn $$4 = this.b($$1, 1);
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

   public boolean a(ctx $$0, csk $$1, cov $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cwn $$0, ctx $$1, csk $$2, cov $$3, bvx $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bvf $$0, bvf $$1) {
      cwj $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cov $$3) {
            $$3.b(awj.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bvf $$0, bvf $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dgg $$0, dwv $$1, ji $$2, cov $$3) {
      cwj $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awj.c.b($$4));
      }
   }

   public boolean b(dwv $$0) {
      return this.h().b(this, $$0);
   }

   public bsi a(cov $$0, bvf $$1, bsh $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cwn v() {
      if (this.f()) {
         return j;
      } else {
         cwn $$0 = new cwn(this.h(), this.m, this.p.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public cwn c(int $$0) {
      if (this.f()) {
         return j;
      } else {
         cwn $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cwn a(dgf $$0) {
      return this.a($$0, this.M());
   }

   public cwn a(dgf $$0, int $$1) {
      return this.f() ? j : this.b($$0, $$1);
   }

   private cwn b(dgf $$0, int $$1) {
      return new cwn($$0.j().f(), $$1, this.p.g());
   }

   public static boolean a(cwn $$0, cwn $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cwn> $$0, List<cwn> $$1) {
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

   public static boolean b(cwn $$0, cwn $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cwn $$0, cwn $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<cwn> a(String $$0) {
      return a.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(j), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cwn $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cwn> $$0) {
      int $$1 = 0;

      for (cwn $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dgg $$0, buj $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dgg $$0, cov $$1, int $$2) {
      $$1.a(awj.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dgg $$0) {
      this.h().a(this, $$0);
   }

   public int a(bvf $$0) {
      return this.h().a(this, $$0);
   }

   public cwp w() {
      return this.h().b(this);
   }

   public void a(dgg $$0, bvf $$1, int $$2) {
      cwn $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cwn $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fA(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().d_(this);
   }

   @Nullable
   public <T> T b(ku<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(ku<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(ku<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T d(ku<? extends T> $$0) {
      return this.p.e($$0);
   }

   public void a(ks $$0) {
      ks $$1 = this.p.g();
      this.p.a($$0);
      Optional<Error<cwn>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         k.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.p.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(ks $$0) {
      this.p.a($$0);
      this.h().l(this);
   }

   public void b(kr $$0) {
      this.p.a($$0);
      this.h().l(this);
   }

   public wo y() {
      wo $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public wo z() {
      wo $$0 = this.a(kv.g);
      if ($$0 != null) {
         return $$0;
      } else {
         czv $$1 = this.a(kv.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!azv.h($$2)) {
               return wo.b($$2);
            }
         }

         return null;
      }
   }

   public wo A() {
      return this.h().a(this);
   }

   public wo B() {
      xc $$0 = wo.i().b(this.y()).a(this.D().a());
      if (this.b(kv.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends czq> void a(ku<T> $$0, cwj.b $$1, Consumer<wo> $$2, cyf $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wo> a(cwj.b $$0, @Nullable cov $$1, cyf $$2) {
      boolean $$3 = cut.a(this, $$1);
      if (!$$2.b() && this.b(kv.r)) {
         return $$3 ? cut.a : List.of();
      } else {
         List<wo> $$4 = Lists.newArrayList();
         $$4.add(this.B());
         if (!$$2.a() && !this.b(kv.g)) {
            eup $$5 = this.a(kv.L);
            if ($$5 != null) {
               $$4.add(cxa.a($$5));
            }
         }

         Consumer<wo> $$6 = $$4::add;
         if (!this.b(kv.q)) {
            this.h().a(this, $$0, $$4, $$2);
         }

         this.a(kv.ab, $$0, $$6, $$2);
         this.a(kv.U, $$0, $$6, $$2);
         this.a(kv.I, $$0, $$6, $$2);
         this.a(kv.l, $$0, $$6, $$2);
         this.a(kv.J, $$0, $$6, $$2);
         this.a(kv.j, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kv.f, $$0, $$6, $$2);
         this.a(kv.aa, $$0, $$6, $$2);
         this.a(kv.R, $$0, $$6, $$2);
         cuj $$7 = this.a(kv.n);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wn.a);
            $$6.accept(cuj.c);
            $$7.a($$6);
         }

         cuj $$8 = this.a(kv.m);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wn.a);
            $$6.accept(cuj.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$4.add(wo.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$4.add(wo.b(mb.g.b(this.h()).toString()).a(n.i));
            int $$9 = this.p.d();
            if ($$9 > 0) {
               $$4.add(wo.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dW().K())) {
            $$4.add(l);
         }

         if ($$3) {
            $$4.addAll(cut.a);
         }

         return $$4;
      }
   }

   private void a(Consumer<wo> $$0, @Nullable cov $$1) {
      cze $$2 = this.a(kv.o, cze.a);
      if ($$2.c()) {
         for (bus $$3 : bus.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wn.a);
                  $$0.accept(wo.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wo> $$0, @Nullable cov $$1, jr<bwi> $$2, bwl $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cwj.g)) {
            $$4 += $$1.i(bwn.c);
            $$5 = true;
         } else if ($$3.a(cwj.h)) {
            $$4 += $$1.i(bwn.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bwl.a.b || $$3.d() == bwl.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bwn.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wn.a().b(wo.a("attribute.modifier.equals." + $$3.d().a(), cze.d.format($$6), wo.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wo.a("attribute.modifier.plus." + $$3.d().a(), cze.d.format($$6), wo.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wo.a("attribute.modifier.take." + $$3.d().a(), cze.d.format(-$$6), wo.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kv.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cxk D() {
      cxk $$0 = this.a(kv.k, cxk.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cxk.c;
            case c -> cxk.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.b(kv.C)) {
         return false;
      } else {
         ddd $$0 = this.a(kv.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jr<dcx> $$0, int $$1) {
      dcz.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kv.l, ddd.a).d();
   }

   public ddd G() {
      return this.a(kv.l, ddd.a);
   }

   public boolean H() {
      return this.q instanceof ckt;
   }

   public void a(@Nullable buj $$0) {
      if (!this.f()) {
         this.q = $$0;
      }
   }

   @Nullable
   public ckt I() {
      return this.q instanceof ckt ? (ckt)this.J() : null;
   }

   @Nullable
   public buj J() {
      return !this.f() ? this.q : null;
   }

   public void a(bus $$0, BiConsumer<jr<bwi>, bwl> $$1) {
      cze $$2 = this.a(kv.o, cze.a);
      $$2.a($$0, $$1);
      dcz.a(this, $$0, $$1);
   }

   public void a(bur $$0, BiConsumer<jr<bwi>, bwl> $$1) {
      cze $$2 = this.a(kv.o, cze.a);
      $$2.a($$0, $$1);
      dcz.a(this, $$0, $$1);
   }

   public wo K() {
      xc $$0 = wo.i().b(this.y());
      if (this.b(kv.g)) {
         $$0.a(n.u);
      }

      xc $$1 = wr.a((wo)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new wu(wu.a.b, new wu.c(this))));
      }

      return $$1;
   }

   public boolean a(dwz $$0) {
      cuj $$1 = this.a(kv.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dwz $$0) {
      cuj $$1 = this.a(kv.n);
      return $$1 != null && $$1.a($$0);
   }

   public int L() {
      return this.n;
   }

   public void d(int $$0) {
      this.n = $$0;
   }

   public int M() {
      return this.f() ? 0 : this.m;
   }

   public void e(int $$0) {
      this.m = $$0;
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

   public void a(int $$0, @Nullable bvf $$1) {
      if ($$1 == null || !$$1.fV()) {
         this.h($$0);
      }
   }

   public cwn b(int $$0, @Nullable bvf $$1) {
      cwn $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dgg $$0, bvf $$1, int $$2) {
      cyt $$3 = this.a(kv.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dZ(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cla $$0) {
      this.h().a($$0);
   }

   public avy N() {
      return this.h().a();
   }

   public boolean a(bsz $$0) {
      cyy $$1 = this.a(kv.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cwn $$0) {
      ddf $$1 = this.a(kv.E);
      return $$1 != null && $$1.a($$0);
   }
}
