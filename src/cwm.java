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

public final class cwm implements kp {
   public static final Codec<jq<cwi>> a = lz.g
      .r()
      .validate($$0 -> $$0.a(cwq.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cwm> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cwm::i),
                     ayv.a(1, 99).fieldOf("count").orElse(1).forGetter(cwm::L),
                     kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cwm::new)
         )
   );
   public static final Codec<cwm> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cwm::i), kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cwm($$0x, 1, $$1))
         )
   );
   public static final Codec<cwm> d = b.validate(cwm::c);
   public static final Codec<cwm> e = c.validate(cwm::c);
   public static final Codec<cwm> f = ayv.f(b).xmap($$0 -> $$0.orElse(cwm.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cwm> g = a.xmap(cwm::new, cwm::i);
   public static final zh<wu, cwm> h = new zh<wu, cwm>() {
      private static final zh<wu, jq<cwi>> a = zf.b(ma.K);

      public cwm a(wu $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cwm.k;
         } else {
            jq<cwi> $$2 = a.decode($$0);
            kr $$3 = kr.c.decode($$0);
            return new cwm($$2, $$1, $$3);
         }
      }

      public void a(wu $$0, cwm $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.L());
            a.encode($$0, $$1.i());
            kr.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zh<wu, cwm> i = new zh<wu, cwm>() {
      public cwm a(wu $$0) {
         cwm $$1 = cwm.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wu $$0, cwm $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cwm.h.encode($$0, $$1);
         }
      }
   };
   public static final zh<wu, List<cwm>> j = h.a(zf.a(jz::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cwm k = new cwm((Void)null);
   private static final xj m = xj.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cwi p;
   final kv q;
   @Nullable
   private bul r;

   private static DataResult<cwm> c(cwm $$0) {
      DataResult<bas> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.L() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.L() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zh<wu, cwm> a(final zh<wu, cwm> $$0) {
      return new zh<wu, cwm>() {
         public cwm a(wu $$0x) {
            cwm $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alh<bas> $$2 = $$0.H().a(azo.a);
               cwm.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wu $$0x, cwm $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cug> b() {
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

   public cwm(dfl $$0) {
      this($$0, 1);
   }

   public cwm(jq<cwi> $$0) {
      this($$0.a(), 1);
   }

   public cwm(jq<cwi> $$0, int $$1, kr $$2) {
      this($$0.a(), $$1, kv.a($$0.a().g(), $$2));
   }

   public cwm(jq<cwi> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cwm(dfl $$0, int $$1) {
      this($$0, $$1, new kv($$0.j().g()));
   }

   private cwm(dfl $$0, int $$1, kv $$2) {
      this.p = $$0.j();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cwm(@Nullable Void $$0) {
      this.p = null;
      this.q = new kv(kq.a);
   }

   public static DataResult<bas> a(kq $$0) {
      if ($$0.b(ku.d) && $$0.a(ku.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cze $$1 = $$0.a(ku.al, cze.a);

         for (cwm $$2 : $$1.d()) {
            int $$3 = $$2.L();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bas.a);
      }
   }

   public static Optional<cwm> a(js.a $$0, vi $$1) {
      return b.parse($$0.a(uz.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cwm a(js.a $$0, ul $$1) {
      return $$1.g() ? k : a($$0, (vi)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cwq.a || this.n <= 0;
   }

   public boolean a(crq $$0) {
      return this.f() || this.h().a($$0);
   }

   public cwm a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cwm $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cwm g() {
      if (this.f()) {
         return k;
      } else {
         cwm $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cwi h() {
      return this.f() ? cwq.a : this.p;
   }

   public jq<cwi> i() {
      return this.h().f();
   }

   public boolean a(axs<cwi> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cwi $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jq<cwi>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jq<cwi> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(ju<cwi> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axs<cwi>> j() {
      return this.h().f().c();
   }

   public bsk a(daf $$0) {
      cou $$1 = $$0.o();
      jh $$2 = $$0.a();
      if ($$1 != null && !$$1.gh().e && !this.a(new dvz($$0.q(), $$2, false))) {
         return bsk.e;
      } else {
         cwi $$3 = this.h();
         bsk $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bsk.d $$5 && $$5.c()) {
            $$1.b(awx.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dvv $$0) {
      return this.h().a(this, $$0);
   }

   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = this.v();
      boolean $$4 = this.a((bvh)$$1) <= 0;
      bsk $$5 = this.h().a($$0, $$1, $$2);
      return (bsk)($$4 && $$5 instanceof bsk.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cwm a(dfm $$0, bvh $$1) {
      cwm $$2 = this.v();
      cwm $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cwm a(bvh $$0, cwm $$1) {
      czs $$2 = $$1.a(ku.y);
      czr $$3 = $$1.a(ku.z);
      int $$4 = $$1.L();
      cwm $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fT(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vi b(js.a $$0, vi $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vi)b.encode(this, $$0.a(uz.a), $$1).getOrThrow();
      }
   }

   public vi a(js.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vi)b.encodeStart($$0.a(uz.a), this).getOrThrow();
      }
   }

   public vi b(js.a $$0) {
      return (vi)(this.f() ? new ul() : this.b($$0, new ul()));
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
      return azm.a(this.a(ku.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(ku.e, Integer.valueOf(azm.a($$0, 0, this.p())));
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

   public void a(int $$0, arp $$1, @Nullable arq $$2, Consumer<cwi> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 > 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arp $$1, @Nullable arq $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fT()) {
         return 0;
      } else {
         return $$0 > 0 ? dcf.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arq $$1, Consumer<cwi> $$2) {
      if ($$1 != null) {
         ao.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cwi $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cou $$1) {
      if ($$1 instanceof arq $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 <= 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bvh $$1, but $$2) {
      if ($$1.dV() instanceof arp $$3) {
         this.a($$0, $$3, $$1 instanceof arq $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cwm a(int $$0, dfl $$1, bvh $$2, but $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cwm $$4 = this.b($$1, 1);
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

   public boolean a(ctw $$0, csj $$1, cou $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cwm $$0, ctw $$1, csj $$2, cou $$3, bvz $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bvh $$0, bvh $$1) {
      cwi $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cou $$3) {
            $$3.b(awx.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bvh $$0, bvh $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dfm $$0, dvv $$1, jh $$2, cou $$3) {
      cwi $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awx.c.b($$4));
      }
   }

   public boolean b(dvv $$0) {
      return this.h().b(this, $$0);
   }

   public bsk a(cou $$0, bvh $$1, bsj $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cwm v() {
      if (this.f()) {
         return k;
      } else {
         cwm $$0 = new cwm(this.h(), this.n, this.q.h());
         $$0.d(this.K());
         return $$0;
      }
   }

   public cwm c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cwm $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cwm a(dfl $$0) {
      return this.a($$0, this.L());
   }

   public cwm a(dfl $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cwm b(dfl $$0, int $$1) {
      return new cwm($$0.j().f(), $$1, this.q.g());
   }

   public static boolean a(cwm $$0, cwm $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cwm> $$0, List<cwm> $$1) {
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

   public static boolean b(cwm $$0, cwm $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cwm $$0, cwm $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cwm> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cwm $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cwm> $$0) {
      int $$1 = 0;

      for (cwm $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.L() + " " + this.h();
   }

   public void a(dfm $$0, bul $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dfm $$0, cou $$1, int $$2) {
      $$1.a(awx.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dfm $$0) {
      this.h().a(this, $$0);
   }

   public int a(bvh $$0) {
      return this.h().a(this, $$0);
   }

   public cwo w() {
      return this.h().b(this);
   }

   public void a(dfm $$0, bvh $$1, int $$2) {
      cwm $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cwm $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fy(), $$4);
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
      Optional<Error<cwm>> $$2 = c(this).error();
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

   public xj y() {
      xj $$0 = this.a(ku.g);
      if ($$0 != null) {
         return $$0;
      } else {
         czu $$1 = this.a(ku.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!baj.h($$2)) {
               return xj.b($$2);
            }
         }

         return this.z();
      }
   }

   public xj z() {
      return this.h().a(this);
   }

   public xj A() {
      xx $$0 = xj.i().b(this.y()).a(this.C().a());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends czp> void a(kt<T> $$0, cwi.b $$1, Consumer<xj> $$2, cye $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xj> a(cwi.b $$0, @Nullable cou $$1, cye $$2) {
      if (!$$2.b() && this.b(ku.r)) {
         return List.of();
      } else {
         List<xj> $$3 = Lists.newArrayList();
         $$3.add(this.A());
         if (!$$2.a() && !this.b(ku.g)) {
            etn $$4 = this.a(ku.L);
            if ($$4 != null) {
               $$3.add(cwz.a($$4));
            }
         }

         Consumer<xj> $$5 = $$3::add;
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
         cui $$6 = this.a(ku.n);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xi.a);
            $$5.accept(cui.c);
            $$6.a($$5);
         }

         cui $$7 = this.a(ku.m);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xi.a);
            $$5.accept(cui.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xj.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xj.b(lz.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.q.d();
            if ($$8 > 0) {
               $$3.add(xj.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dV().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xj> $$0, @Nullable cou $$1) {
      czd $$2 = this.a(ku.o, czd.a);
      if ($$2.c()) {
         for (buu $$3 : buu.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xi.a);
                  $$0.accept(xj.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xj> $$0, @Nullable cou $$1, jq<bwk> $$2, bwn $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cwi.f)) {
            $$4 += $$1.i(bwp.c);
            $$5 = true;
         } else if ($$3.a(cwi.g)) {
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
         $$0.accept(xi.a().b(xj.a("attribute.modifier.equals." + $$3.d().a(), czd.d.format($$6), xj.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xj.a("attribute.modifier.plus." + $$3.d().a(), czd.d.format($$6), xj.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xj.a("attribute.modifier.take." + $$3.d().a(), czd.d.format(-$$6), xj.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean B() {
      Boolean $$0 = this.a(ku.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cxj C() {
      cxj $$0 = this.a(ku.k, cxj.a);
      if (!this.E()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cxj.c;
            case c -> cxj.d;
            default -> $$0;
         };
      }
   }

   public boolean D() {
      if (!this.b(ku.C)) {
         return false;
      } else {
         dcj $$0 = this.a(ku.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jq<dcd> $$0, int $$1) {
      dcf.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean E() {
      return !this.a(ku.l, dcj.a).d();
   }

   public dcj F() {
      return this.a(ku.l, dcj.a);
   }

   public boolean G() {
      return this.r instanceof ckv;
   }

   public void a(@Nullable bul $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public ckv H() {
      return this.r instanceof ckv ? (ckv)this.I() : null;
   }

   @Nullable
   public bul I() {
      return !this.f() ? this.r : null;
   }

   public void a(buu $$0, BiConsumer<jq<bwk>, bwn> $$1) {
      czd $$2 = this.a(ku.o, czd.a);
      $$2.a($$0, $$1);
      dcf.a(this, $$0, $$1);
   }

   public void a(but $$0, BiConsumer<jq<bwk>, bwn> $$1) {
      czd $$2 = this.a(ku.o, czd.a);
      $$2.a($$0, $$1);
      dcf.a(this, $$0, $$1);
   }

   public xj J() {
      xx $$0 = xj.i().b(this.y());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      xx $$1 = xm.a((xj)$$0);
      if (!this.f()) {
         $$1.a(this.C().a()).a($$0x -> $$0x.a(new xp(xp.a.b, new xp.c(this))));
      }

      return $$1;
   }

   public boolean a(dvz $$0) {
      cui $$1 = this.a(ku.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dvz $$0) {
      cui $$1 = this.a(ku.n);
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

   public void a(int $$0, @Nullable bvh $$1) {
      if ($$1 == null || !$$1.fT()) {
         this.h($$0);
      }
   }

   public cwm b(int $$0, @Nullable bvh $$1) {
      cwm $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dfm $$0, bvh $$1, int $$2) {
      cys $$3 = this.a(ku.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(clc $$0) {
      this.h().a($$0);
   }

   public awm M() {
      return this.h().a();
   }

   public boolean a(btb $$0) {
      cyx $$1 = this.a(ku.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cwm $$0) {
      dcl $$1 = this.a(ku.E);
      return $$1 != null && $$1.a($$0);
   }
}
