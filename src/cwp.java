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

public final class cwp implements kq {
   private static final List<wp> k = List.of(
      wp.c("item.op_warning.line1").a(n.m, n.r), wp.c("item.op_warning.line2").a(n.m), wp.c("item.op_warning.line3").a(n.m)
   );
   public static final Codec<cwp> a = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     cwl.e.fieldOf("id").forGetter(cwp::i),
                     ayi.a(1, 99).fieldOf("count").orElse(1).forGetter(cwp::M),
                     ks.b.optionalFieldOf("components", ks.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cwp::new)
         )
   );
   public static final Codec<cwp> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cwl.e.fieldOf("id").forGetter(cwp::i), ks.b.optionalFieldOf("components", ks.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cwp($$0x, 1, $$1))
         )
   );
   public static final Codec<cwp> c = a.validate(cwp::c);
   public static final Codec<cwp> d = b.validate(cwp::c);
   public static final Codec<cwp> e = ayi.g(a).xmap($$0 -> $$0.orElse(cwp.j), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cwp> f = cwl.e.xmap(cwp::new, cwp::i);
   public static final yn<wa, cwp> g = new yn<wa, cwp>() {
      private static final yn<wa, jr<cwl>> a = yl.b(mc.K);

      public cwp a(wa $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cwp.j;
         } else {
            jr<cwl> $$2 = a.decode($$0);
            ks $$3 = ks.c.decode($$0);
            return new cwp($$2, $$1, $$3);
         }
      }

      public void a(wa $$0, cwp $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            a.encode($$0, $$1.i());
            ks.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final yn<wa, cwp> h = new yn<wa, cwp>() {
      public cwp a(wa $$0) {
         cwp $$1 = cwp.g.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wa $$0, cwp $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cwp.g.encode($$0, $$1);
         }
      }
   };
   public static final yn<wa, List<cwp>> i = g.a(yl.a(ka::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cwp j = new cwp((Void)null);
   private static final wp m = wp.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cwl p;
   final kw q;
   @Nullable
   private bul r;

   private static DataResult<cwp> c(cwp $$0) {
      DataResult<baf> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static yn<wa, cwp> a(final yn<wa, cwp> $$0) {
      return new yn<wa, cwp>() {
         public cwp a(wa $$0x) {
            cwp $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               akt<baf> $$2 = $$0.H().a(azb.a);
               cwp.a.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wa $$0x, cwp $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cuj> b() {
      return this.h().k(this);
   }

   @Override
   public kr a() {
      return (kr)(!this.f() ? this.q : kr.a);
   }

   public kr c() {
      return !this.f() ? this.h().g() : kr.a;
   }

   public ks d() {
      return !this.f() ? this.q.g() : ks.a;
   }

   public kr e() {
      return !this.f() ? this.q.i() : kr.a;
   }

   public boolean c(ku<?> $$0) {
      return !this.f() && this.q.d($$0);
   }

   public cwp(dgh $$0) {
      this($$0, 1);
   }

   public cwp(jr<cwl> $$0) {
      this($$0.a(), 1);
   }

   public cwp(jr<cwl> $$0, int $$1, ks $$2) {
      this($$0.a(), $$1, kw.a($$0.a().g(), $$2));
   }

   public cwp(jr<cwl> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cwp(dgh $$0, int $$1) {
      this($$0, $$1, new kw($$0.j().g()));
   }

   private cwp(dgh $$0, int $$1, kw $$2) {
      this.p = $$0.j();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cwp(@Nullable Void $$0) {
      this.p = null;
      this.q = new kw(kr.a);
   }

   public static DataResult<baf> a(kr $$0) {
      if ($$0.b(kv.d) && $$0.a(kv.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         czh $$1 = $$0.a(kv.al, czh.a);

         for (cwp $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(baf.a);
      }
   }

   public static Optional<cwp> a(jt.a $$0, un $$1) {
      return a.parse($$0.a(ue.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cwp a(jt.a $$0, tq $$1) {
      return $$1.g() ? j : a($$0, (un)$$1).orElse(j);
   }

   public boolean f() {
      return this == j || this.p == cwt.a || this.n <= 0;
   }

   public boolean a(crt $$0) {
      return this.f() || this.h().a($$0);
   }

   public cwp a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cwp $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cwp g() {
      if (this.f()) {
         return j;
      } else {
         cwp $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cwl h() {
      return this.f() ? cwt.a : this.p;
   }

   public jr<cwl> i() {
      return this.h().f();
   }

   public boolean a(axf<cwl> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cwl $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jr<cwl>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jr<cwl> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(jv<cwl> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axf<cwl>> j() {
      return this.h().f().c();
   }

   public bsk a(dai $$0) {
      cox $$1 = $$0.o();
      ji $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new dxb($$0.q(), $$2, false))) {
         return bsk.e;
      } else {
         cwl $$3 = this.h();
         bsk $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bsk.d $$5 && $$5.c()) {
            $$1.b(awk.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dwx $$0) {
      return this.h().a(this, $$0);
   }

   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = this.v();
      boolean $$4 = this.a((bvh)$$1) <= 0;
      bsk $$5 = this.h().a($$0, $$1, $$2);
      return (bsk)($$4 && $$5 instanceof bsk.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cwp a(dgi $$0, bvh $$1) {
      cwp $$2 = this.v();
      cwp $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cwp a(bvh $$0, cwp $$1) {
      czv $$2 = $$1.a(kv.y);
      czu $$3 = $$1.a(kv.z);
      int $$4 = $$1.M();
      cwp $$5 = this;
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
      return ayz.a(this.a(kv.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kv.e, Integer.valueOf(ayz.a($$0, 0, this.p())));
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

   public void a(int $$0, ard $$1, @Nullable are $$2, Consumer<cwl> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, ard $$1, @Nullable are $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fV()) {
         return 0;
      } else {
         return $$0 > 0 ? ddb.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable are $$1, Consumer<cwl> $$2) {
      if ($$1 != null) {
         ap.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cwl $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cox $$1) {
      if ($$1 instanceof are $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bvh $$1, but $$2) {
      if ($$1.dV() instanceof ard $$3) {
         this.a($$0, $$3, $$1 instanceof are $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cwp a(int $$0, dgh $$1, bvh $$2, but $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cwp $$4 = this.b($$1, 1);
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

   public boolean a(ctz $$0, csm $$1, cox $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cwp $$0, ctz $$1, csm $$2, cox $$3, bvz $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bvh $$0, bvh $$1) {
      cwl $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cox $$3) {
            $$3.b(awk.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bvh $$0, bvh $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dgi $$0, dwx $$1, ji $$2, cox $$3) {
      cwl $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awk.c.b($$4));
      }
   }

   public boolean b(dwx $$0) {
      return this.h().b(this, $$0);
   }

   public bsk a(cox $$0, bvh $$1, bsj $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cwp v() {
      if (this.f()) {
         return j;
      } else {
         cwp $$0 = new cwp(this.h(), this.n, this.q.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public cwp c(int $$0) {
      if (this.f()) {
         return j;
      } else {
         cwp $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cwp a(dgh $$0) {
      return this.a($$0, this.M());
   }

   public cwp a(dgh $$0, int $$1) {
      return this.f() ? j : this.b($$0, $$1);
   }

   private cwp b(dgh $$0, int $$1) {
      return new cwp($$0.j().f(), $$1, this.q.g());
   }

   public static boolean a(cwp $$0, cwp $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cwp> $$0, List<cwp> $$1) {
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

   public static boolean b(cwp $$0, cwp $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cwp $$0, cwp $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cwp> a(String $$0) {
      return a.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(j), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cwp $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cwp> $$0) {
      int $$1 = 0;

      for (cwp $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dgi $$0, bul $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dgi $$0, cox $$1, int $$2) {
      $$1.a(awk.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dgi $$0) {
      this.h().a(this, $$0);
   }

   public int a(bvh $$0) {
      return this.h().a(this, $$0);
   }

   public cwr w() {
      return this.h().b(this);
   }

   public void a(dgi $$0, bvh $$1, int $$2) {
      cwp $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cwp $$4 = this.a($$1, $$3);
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
      return this.q.b($$0, $$1);
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
      return this.q.e($$0);
   }

   public void a(ks $$0) {
      ks $$1 = this.q.g();
      this.q.a($$0);
      Optional<Error<cwp>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         l.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.q.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(ks $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public void b(kr $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public wp y() {
      wp $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public wp z() {
      wp $$0 = this.a(kv.g);
      if ($$0 != null) {
         return $$0;
      } else {
         czx $$1 = this.a(kv.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!azw.h($$2)) {
               return wp.b($$2);
            }
         }

         return null;
      }
   }

   public wp A() {
      return this.h().a(this);
   }

   public wp B() {
      xd $$0 = wp.i().b(this.y()).a(this.D().a());
      if (this.b(kv.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends czs> void a(ku<T> $$0, cwl.b $$1, Consumer<wp> $$2, cyh $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wp> a(cwl.b $$0, @Nullable cox $$1, cyh $$2) {
      boolean $$3 = this.h().a(this, $$1);
      if (!$$2.b() && this.b(kv.r)) {
         return $$3 ? k : List.of();
      } else {
         List<wp> $$4 = Lists.newArrayList();
         $$4.add(this.B());
         if (!$$2.a() && !this.b(kv.g)) {
            eur $$5 = this.a(kv.L);
            if ($$5 != null) {
               $$4.add(cxc.a($$5));
            }
         }

         Consumer<wp> $$6 = $$4::add;
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
         cul $$7 = this.a(kv.n);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wo.a);
            $$6.accept(cul.c);
            $$7.a($$6);
         }

         cul $$8 = this.a(kv.m);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wo.a);
            $$6.accept(cul.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$4.add(wp.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$4.add(wp.b(mb.g.b(this.h()).toString()).a(n.i));
            int $$9 = this.q.d();
            if ($$9 > 0) {
               $$4.add(wp.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dV().K())) {
            $$4.add(m);
         }

         if ($$3) {
            $$4.addAll(k);
         }

         return $$4;
      }
   }

   private void a(Consumer<wp> $$0, @Nullable cox $$1) {
      czg $$2 = this.a(kv.o, czg.a);
      if ($$2.c()) {
         for (buu $$3 : buu.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wo.a);
                  $$0.accept(wp.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wp> $$0, @Nullable cox $$1, jr<bwk> $$2, bwn $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cwl.g)) {
            $$4 += $$1.i(bwp.c);
            $$5 = true;
         } else if ($$3.a(cwl.h)) {
            $$4 += $$1.i(bwp.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bwn.a.b || $$3.d() == bwn.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bwp.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wo.a().b(wp.a("attribute.modifier.equals." + $$3.d().a(), czg.d.format($$6), wp.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wp.a("attribute.modifier.plus." + $$3.d().a(), czg.d.format($$6), wp.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wp.a("attribute.modifier.take." + $$3.d().a(), czg.d.format(-$$6), wp.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kv.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cxm D() {
      cxm $$0 = this.a(kv.k, cxm.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cxm.c;
            case c -> cxm.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.b(kv.C)) {
         return false;
      } else {
         ddf $$0 = this.a(kv.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jr<dcz> $$0, int $$1) {
      ddb.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kv.l, ddf.a).d();
   }

   public ddf G() {
      return this.a(kv.l, ddf.a);
   }

   public boolean H() {
      return this.r instanceof ckv;
   }

   public void a(@Nullable bul $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public ckv I() {
      return this.r instanceof ckv ? (ckv)this.J() : null;
   }

   @Nullable
   public bul J() {
      return !this.f() ? this.r : null;
   }

   public void a(buu $$0, BiConsumer<jr<bwk>, bwn> $$1) {
      czg $$2 = this.a(kv.o, czg.a);
      $$2.a($$0, $$1);
      ddb.a(this, $$0, $$1);
   }

   public void a(but $$0, BiConsumer<jr<bwk>, bwn> $$1) {
      czg $$2 = this.a(kv.o, czg.a);
      $$2.a($$0, $$1);
      ddb.a(this, $$0, $$1);
   }

   public wp K() {
      xd $$0 = wp.i().b(this.y());
      if (this.b(kv.g)) {
         $$0.a(n.u);
      }

      xd $$1 = ws.a((wp)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new wv(wv.a.b, new wv.c(this))));
      }

      return $$1;
   }

   public boolean a(dxb $$0) {
      cul $$1 = this.a(kv.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dxb $$0) {
      cul $$1 = this.a(kv.n);
      return $$1 != null && $$1.a($$0);
   }

   public int L() {
      return this.o;
   }

   public void d(int $$0) {
      this.o = $$0;
   }

   public int M() {
      return this.f() ? 0 : this.n;
   }

   public void e(int $$0) {
      this.n = $$0;
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

   public void a(int $$0, @Nullable bvh $$1) {
      if ($$1 == null || !$$1.fV()) {
         this.h($$0);
      }
   }

   public cwp b(int $$0, @Nullable bvh $$1) {
      cwp $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dgi $$0, bvh $$1, int $$2) {
      cyv $$3 = this.a(kv.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(clc $$0) {
      this.h().a($$0);
   }

   public avz N() {
      return this.h().a();
   }

   public boolean a(btb $$0) {
      cza $$1 = this.a(kv.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cwp $$0) {
      ddh $$1 = this.a(kv.E);
      return $$1 != null && $$1.a($$0);
   }
}
