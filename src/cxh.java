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

public final class cxh implements kq {
   private static final List<wp> l = List.of(
      wp.c("item.op_warning.line1").a(n.m, n.r), wp.c("item.op_warning.line2").a(n.m), wp.c("item.op_warning.line3").a(n.m)
   );
   public static final MapCodec<cxh> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     cxd.e.fieldOf("id").forGetter(cxh::i),
                     ayi.a(1, 99).fieldOf("count").orElse(1).forGetter(cxh::M),
                     ks.b.optionalFieldOf("components", ks.a).forGetter($$0xx -> $$0xx.r.g())
                  )
                  .apply($$0x, cxh::new)
         )
   );
   public static final Codec<cxh> b = Codec.lazyInitialized(a::codec);
   public static final Codec<cxh> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cxd.e.fieldOf("id").forGetter(cxh::i), ks.b.optionalFieldOf("components", ks.a).forGetter($$0x -> $$0x.r.g()))
                  .apply($$0, ($$0x, $$1) -> new cxh($$0x, 1, $$1))
         )
   );
   public static final Codec<cxh> d = b.validate(cxh::a);
   public static final Codec<cxh> e = c.validate(cxh::a);
   public static final Codec<cxh> f = ayi.g(b).xmap($$0 -> $$0.orElse(cxh.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cxh> g = cxd.e.xmap(cxh::new, cxh::i);
   public static final yn<wa, cxh> h = new yn<wa, cxh>() {
      public cxh a(wa $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cxh.k;
         } else {
            jr<cxd> $$2 = cxd.f.decode($$0);
            ks $$3 = ks.c.decode($$0);
            return new cxh($$2, $$1, $$3);
         }
      }

      public void a(wa $$0, cxh $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            cxd.f.encode($$0, $$1.i());
            ks.c.encode($$0, $$1.r.g());
         }
      }
   };
   public static final yn<wa, cxh> i = new yn<wa, cxh>() {
      public cxh a(wa $$0) {
         cxh $$1 = cxh.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wa $$0, cxh $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cxh.h.encode($$0, $$1);
         }
      }
   };
   public static final yn<wa, List<cxh>> j = h.a(yl.a(ka::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cxh k = new cxh((Void)null);
   private static final wp n = wp.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cxd q;
   final kw r;
   @Nullable
   private bva s;

   public static DataResult<cxh> a(cxh $$0) {
      DataResult<baf> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static yn<wa, cxh> a(final yn<wa, cxh> $$0) {
      return new yn<wa, cxh>() {
         public cxh a(wa $$0x) {
            cxh $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               aks<baf> $$2 = $$0.H().a(azb.a);
               cxh.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wa $$0x, cxh $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cvd> b() {
      return this.h().k(this);
   }

   @Override
   public kr a() {
      return (kr)(!this.f() ? this.r : kr.a);
   }

   public kr c() {
      return !this.f() ? this.h().g() : kr.a;
   }

   public ks d() {
      return !this.f() ? this.r.g() : ks.a;
   }

   public kr e() {
      return !this.f() ? this.r.i() : kr.a;
   }

   public boolean c(ku<?> $$0) {
      return !this.f() && this.r.d($$0);
   }

   public cxh(dgy $$0) {
      this($$0, 1);
   }

   public cxh(jr<cxd> $$0) {
      this($$0.a(), 1);
   }

   public cxh(jr<cxd> $$0, int $$1, ks $$2) {
      this($$0.a(), $$1, kw.a($$0.a().g(), $$2));
   }

   public cxh(jr<cxd> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cxh(dgy $$0, int $$1) {
      this($$0, $$1, new kw($$0.i().g()));
   }

   private cxh(dgy $$0, int $$1, kw $$2) {
      this.q = $$0.i();
      this.o = $$1;
      this.r = $$2;
      this.h().l(this);
   }

   private cxh(@Nullable Void $$0) {
      this.q = null;
      this.r = new kw(kr.a);
   }

   public static DataResult<baf> a(kr $$0) {
      if ($$0.b(kv.d) && $$0.a(kv.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         czx $$1 = $$0.a(kv.an, czx.a);

         for (cxh $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(baf.a);
      }
   }

   public static Optional<cxh> a(jt.a $$0, un $$1) {
      return b.parse($$0.a(ue.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cxh a(jt.a $$0, tq $$1) {
      return $$1.g() ? k : a($$0, (un)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.q == cxl.a || this.o <= 0;
   }

   public boolean a(csn $$0) {
      return this.f() || this.h().a($$0);
   }

   public cxh a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cxh $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cxh g() {
      if (this.f()) {
         return k;
      } else {
         cxh $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cxd h() {
      return this.f() ? cxl.a : this.q;
   }

   public jr<cxd> i() {
      return this.h().f();
   }

   public boolean a(axf<cxd> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cxd $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jr<cxd>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jr<cxd> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(jv<cxd> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axf<cxd>> j() {
      return this.h().f().c();
   }

   public bsy a(daz $$0) {
      cpr $$1 = $$0.o();
      ji $$2 = $$0.a();
      if ($$1 != null && !$$1.gm().e && !this.a(new dxu($$0.q(), $$2, false))) {
         return bsy.e;
      } else {
         cxd $$3 = this.h();
         bsy $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bsy.d $$5 && $$5.c()) {
            $$1.b(awk.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dxq $$0) {
      return this.h().a(this, $$0);
   }

   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = this.v();
      boolean $$4 = this.a((bvy)$$1) <= 0;
      bsy $$5 = this.h().a($$0, $$1, $$2);
      return (bsy)($$4 && $$5 instanceof bsy.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cxh a(dgz $$0, bvy $$1) {
      cxh $$2 = this.v();
      cxh $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cxh a(bvy $$0, cxh $$1) {
      dal $$2 = $$1.a(kv.y);
      dak $$3 = $$1.a(kv.z);
      int $$4 = $$1.M();
      cxh $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fX(), $$0::b);
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
         return (un)b.encode(this, $$0.a(ue.a), $$1).getOrThrow();
      }
   }

   public un a(jt.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (un)b.encodeStart($$0.a(ue.a), this).getOrThrow();
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

   public void a(int $$0, ard $$1, @Nullable are $$2, Consumer<cxd> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, ard $$1, @Nullable are $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fX()) {
         return 0;
      } else {
         return $$0 > 0 ? ddt.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable are $$1, Consumer<cxd> $$2) {
      if ($$1 != null) {
         ap.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cxd $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cpr $$1) {
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

   public void a(int $$0, bvy $$1, bvj $$2) {
      if ($$1.dU() instanceof ard $$3) {
         this.a($$0, $$3, $$1 instanceof are $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cxh a(int $$0, dgy $$1, bvy $$2, bvj $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cxh $$4 = this.b($$1, 1);
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

   public boolean a(cut $$0, ctg $$1, cpr $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cxh $$0, cut $$1, ctg $$2, cpr $$3, bwq $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bvy $$0, bvy $$1) {
      cxd $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.b(kv.C)) {
         if ($$1 instanceof cpr $$3) {
            $$3.b(awk.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bvy $$0, bvy $$1) {
      this.h().b(this, $$0, $$1);
      dam $$2 = this.a(kv.C);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bvj.a);
      }
   }

   public void a(dgz $$0, dxq $$1, ji $$2, cpr $$3) {
      cxd $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awk.c.b($$4));
      }
   }

   public boolean b(dxq $$0) {
      return this.h().b(this, $$0);
   }

   public bsy a(cpr $$0, bvy $$1, bsx $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cxh v() {
      if (this.f()) {
         return k;
      } else {
         cxh $$0 = new cxh(this.h(), this.o, this.r.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public cxh c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cxh $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cxh a(dgy $$0) {
      return this.a($$0, this.M());
   }

   public cxh a(dgy $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cxh b(dgy $$0, int $$1) {
      return new cxh($$0.i().f(), $$1, this.r.g());
   }

   public static boolean a(cxh $$0, cxh $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cxh> $$0, List<cxh> $$1) {
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

   public static boolean b(cxh $$0, cxh $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cxh $$0, cxh $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cxh> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable cxh $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cxh> $$0) {
      int $$1 = 0;

      for (cxh $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dgz $$0, bva $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dgz $$0, cpr $$1, int $$2) {
      $$1.a(awk.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dgz $$0) {
      this.h().a(this, $$0);
   }

   public int a(bvy $$0) {
      return this.h().a(this, $$0);
   }

   public cxj w() {
      return this.h().b(this);
   }

   public void a(dgz $$0, bvy $$1, int $$2) {
      cxh $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cxh $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fC(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().d_(this);
   }

   @Nullable
   public <T> T b(ku<T> $$0, @Nullable T $$1) {
      return this.r.b($$0, $$1);
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
      return this.r.e($$0);
   }

   public void a(ks $$0) {
      ks $$1 = this.r.g();
      this.r.a($$0);
      Optional<Error<cxh>> $$2 = a(this).error();
      if ($$2.isPresent()) {
         m.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.r.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(ks $$0) {
      this.r.a($$0);
      this.h().l(this);
   }

   public void b(kr $$0) {
      this.r.a($$0);
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
         dao $$1 = this.a(kv.V);
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

   private <T extends dai> void a(ku<T> $$0, cxd.b $$1, Consumer<wp> $$2, cyx $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wp> a(cxd.b $$0, @Nullable cpr $$1, cyx $$2) {
      boolean $$3 = this.h().a(this, $$1);
      if (!$$2.b() && this.b(kv.r)) {
         return $$3 ? l : List.of();
      } else {
         List<wp> $$4 = Lists.newArrayList();
         $$4.add(this.B());
         if (!$$2.a() && !this.b(kv.g)) {
            evo $$5 = this.a(kv.M);
            if ($$5 != null) {
               $$4.add(cxu.a($$5));
            }
         }

         Consumer<wp> $$6 = $$4::add;
         if (!this.b(kv.q)) {
            this.h().a(this, $$0, $$4, $$2);
         }

         this.a(kv.V, $$0, $$6, $$2);
         this.a(kv.ad, $$0, $$6, $$2);
         this.a(kv.W, $$0, $$6, $$2);
         this.a(kv.J, $$0, $$6, $$2);
         this.a(kv.l, $$0, $$6, $$2);
         this.a(kv.K, $$0, $$6, $$2);
         this.a(kv.j, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kv.f, $$0, $$6, $$2);
         this.a(kv.ac, $$0, $$6, $$2);
         this.a(kv.T, $$0, $$6, $$2);
         cvf $$7 = this.a(kv.n);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wo.a);
            $$6.accept(cvf.c);
            $$7.a($$6);
         }

         cvf $$8 = this.a(kv.m);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wo.a);
            $$6.accept(cvf.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$4.add(wp.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$4.add(wp.b(mb.g.b(this.h()).toString()).a(n.i));
            int $$9 = this.r.d();
            if ($$9 > 0) {
               $$4.add(wp.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dU().K())) {
            $$4.add(n);
         }

         if ($$3) {
            $$4.addAll(l);
         }

         return $$4;
      }
   }

   private void a(Consumer<wp> $$0, @Nullable cpr $$1) {
      czw $$2 = this.a(kv.o, czw.a);
      if ($$2.c()) {
         for (bvk $$3 : bvk.values()) {
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

   private void a(Consumer<wp> $$0, @Nullable cpr $$1, jr<bxb> $$2, bxe $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cxd.h)) {
            $$4 += $$1.i(bxg.c);
            $$5 = true;
         } else if ($$3.a(cxd.i)) {
            $$4 += $$1.i(bxg.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bxe.a.b || $$3.d() == bxe.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bxg.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wo.a().b(wp.a("attribute.modifier.equals." + $$3.d().a(), czw.d.format($$6), wp.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wp.a("attribute.modifier.plus." + $$3.d().a(), czw.d.format($$6), wp.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wp.a("attribute.modifier.take." + $$3.d().a(), czw.d.format(-$$6), wp.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kv.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cyd D() {
      cyd $$0 = this.a(kv.k, cyd.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cyd.c;
            case c -> cyd.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.b(kv.D)) {
         return false;
      } else {
         ddx $$0 = this.a(kv.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jr<ddr> $$0, int $$1) {
      ddt.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kv.l, ddx.a).d();
   }

   public ddx G() {
      return this.a(kv.l, ddx.a);
   }

   public boolean H() {
      return this.s instanceof clp;
   }

   public void a(@Nullable bva $$0) {
      if (!this.f()) {
         this.s = $$0;
      }
   }

   @Nullable
   public clp I() {
      return this.s instanceof clp ? (clp)this.J() : null;
   }

   @Nullable
   public bva J() {
      return !this.f() ? this.s : null;
   }

   public void a(bvk $$0, BiConsumer<jr<bxb>, bxe> $$1) {
      czw $$2 = this.a(kv.o, czw.a);
      $$2.a($$0, $$1);
      ddt.a(this, $$0, $$1);
   }

   public void a(bvj $$0, BiConsumer<jr<bxb>, bxe> $$1) {
      czw $$2 = this.a(kv.o, czw.a);
      $$2.a($$0, $$1);
      ddt.a(this, $$0, $$1);
   }

   public wp K() {
      xd $$0 = wp.i().b(this.y());
      if (this.b(kv.g)) {
         $$0.a(n.u);
      }

      xd $$1 = ws.a((wp)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new wv.d(this)));
      }

      return $$1;
   }

   public boolean a(dxu $$0) {
      cvf $$1 = this.a(kv.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dxu $$0) {
      cvf $$1 = this.a(kv.n);
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

   public void a(int $$0, @Nullable bvy $$1) {
      if ($$1 == null || !$$1.fX()) {
         this.h($$0);
      }
   }

   public cxh b(int $$0, @Nullable bvy $$1) {
      cxh $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dgz $$0, bvy $$1, int $$2) {
      czl $$3 = this.a(kv.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dX(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(clw $$0) {
      this.h().a($$0);
   }

   public avz N() {
      return this.h().a();
   }

   public boolean a(btp $$0) {
      czq $$1 = this.a(kv.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(cxh $$0) {
      ddz $$1 = this.a(kv.F);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(dxq $$0, dgz $$1, ji $$2, cpr $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
