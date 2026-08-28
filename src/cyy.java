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

public final class cyy implements kf {
   private static final List<wy> l = List.of(
      wy.c("item.op_warning.line1").a(n.m, n.r), wy.c("item.op_warning.line2").a(n.m), wy.c("item.op_warning.line3").a(n.m)
   );
   private static final wy m = wy.c("item.unbreakable").a(n.j);
   public static final MapCodec<cyy> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     cyu.e.fieldOf("id").forGetter(cyy::i),
                     ayu.a(1, 99).fieldOf("count").orElse(1).forGetter(cyy::M),
                     kh.b.optionalFieldOf("components", kh.a).forGetter($$0xx -> $$0xx.s.g())
                  )
                  .apply($$0x, cyy::new)
         )
   );
   public static final Codec<cyy> b = Codec.lazyInitialized(a::codec);
   public static final Codec<cyy> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cyu.e.fieldOf("id").forGetter(cyy::i), kh.b.optionalFieldOf("components", kh.a).forGetter($$0x -> $$0x.s.g()))
                  .apply($$0, ($$0x, $$1) -> new cyy($$0x, 1, $$1))
         )
   );
   public static final Codec<cyy> d = b.validate(cyy::a);
   public static final Codec<cyy> e = c.validate(cyy::a);
   public static final Codec<cyy> f = ayu.g(b).xmap($$0 -> $$0.orElse(cyy.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cyy> g = cyu.e.xmap(cyy::new, cyy::i);
   public static final yw<wj, cyy> h = new yw<wj, cyy>() {
      public cyy a(wj $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cyy.k;
         } else {
            je<cyu> $$2 = cyu.f.decode($$0);
            kh $$3 = kh.c.decode($$0);
            return new cyy($$2, $$1, $$3);
         }
      }

      public void a(wj $$0, cyy $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            cyu.f.encode($$0, $$1.i());
            kh.c.encode($$0, $$1.s.g());
         }
      }
   };
   public static final yw<wj, cyy> i = new yw<wj, cyy>() {
      public cyy a(wj $$0) {
         cyy $$1 = cyy.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wj $$0, cyy $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cyy.h.encode($$0, $$1);
         }
      }
   };
   public static final yw<wj, List<cyy>> j = h.a(yu.a(jn::a));
   private static final Logger n = LogUtils.getLogger();
   public static final cyy k = new cyy((Void)null);
   private static final wy o = wy.c("item.disabled").a(n.m);
   private int p;
   private int q;
   @Deprecated
   @Nullable
   private final cyu r;
   final kk s;
   @Nullable
   private bwd t;

   public static DataResult<cyy> a(cyy $$0) {
      DataResult<bau> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static yw<wj, cyy> a(final yw<wj, cyy> $$0) {
      return new yw<wj, cyy>() {
         public cyy a(wj $$0x) {
            cyy $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               ale<bau> $$2 = $$0.H().a(azo.a);
               cyy.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wj $$0x, cyy $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cwx> b() {
      return this.h().k(this);
   }

   @Override
   public kg a() {
      return (kg)(!this.f() ? this.s : kg.a);
   }

   public kg c() {
      return !this.f() ? this.h().f() : kg.a;
   }

   public kh d() {
      return !this.f() ? this.s.g() : kh.a;
   }

   public kg e() {
      return !this.f() ? this.s.i() : kg.a;
   }

   public boolean d(ki<?> $$0) {
      return !this.f() && this.s.d($$0);
   }

   public cyy(diu $$0) {
      this($$0, 1);
   }

   public cyy(je<cyu> $$0) {
      this($$0.a(), 1);
   }

   public cyy(je<cyu> $$0, int $$1, kh $$2) {
      this($$0.a(), $$1, kk.a($$0.a().f(), $$2));
   }

   public cyy(je<cyu> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cyy(diu $$0, int $$1) {
      this($$0, $$1, new kk($$0.h().f()));
   }

   private cyy(diu $$0, int $$1, kk $$2) {
      this.r = $$0.h();
      this.p = $$1;
      this.s = $$2;
      this.h().l(this);
   }

   private cyy(@Nullable Void $$0) {
      this.r = null;
      this.s = new kk(kg.a);
   }

   public static DataResult<bau> a(kg $$0) {
      if ($$0.c(kj.d) && $$0.a(kj.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dbq $$1 = $$0.a(kj.ap, dbq.a);

         for (cyy $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bau.a);
      }
   }

   public static Optional<cyy> a(jg.a $$0, uw $$1) {
      return b.parse($$0.a(un.a), $$1).resultOrPartial($$0x -> n.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cyy a(jg.a $$0, tz $$1) {
      return $$1.g() ? k : a($$0, (uw)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.r == czc.a || this.p <= 0;
   }

   public boolean a(cuh $$0) {
      return this.f() || this.h().a($$0);
   }

   public cyy a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cyy $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cyy g() {
      if (this.f()) {
         return k;
      } else {
         cyy $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cyu h() {
      return this.f() ? czc.a : this.r;
   }

   public je<cyu> i() {
      return this.h().e();
   }

   public boolean a(axr<cyu> $$0) {
      return this.h().e().a($$0);
   }

   public boolean a(cyu $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<je<cyu>> $$0) {
      return $$0.test(this.h().e());
   }

   public boolean a(je<cyu> $$0) {
      return this.h().e() == $$0;
   }

   public boolean a(ji<cyu> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axr<cyu>> j() {
      return this.h().e().c();
   }

   public bub a(dct $$0) {
      cqy $$1 = $$0.o();
      iu $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new ead($$0.q(), $$2, false))) {
         return bub.e;
      } else {
         cyu $$3 = this.h();
         bub $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bub.d $$5 && $$5.c()) {
            $$1.b(awx.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dzz $$0) {
      return this.h().a(this, $$0);
   }

   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = this.v();
      boolean $$4 = this.a((bxc)$$1) <= 0;
      bub $$5 = this.h().a($$0, $$1, $$2);
      return (bub)($$4 && $$5 instanceof bub.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cyy a(div $$0, bxc $$1) {
      cyy $$2 = this.v();
      cyy $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cyy a(bxc $$0, cyy $$1) {
      dcf $$2 = $$1.a(kj.x);
      dce $$3 = $$1.a(kj.y);
      int $$4 = $$1.M();
      cyy $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fU(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public uw b(jg.a $$0, uw $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uw)b.encode(this, $$0.a(un.a), $$1).getOrThrow();
      }
   }

   public uw a(jg.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uw)b.encodeStart($$0.a(un.a), this).getOrThrow();
      }
   }

   public uw b(jg.a $$0) {
      return (uw)(this.f() ? new tz() : this.b($$0, new tz()));
   }

   public int k() {
      return this.a(kj.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.c(kj.d) && !this.c(kj.f) && this.c(kj.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azm.a(this.a(kj.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kj.e, Integer.valueOf(azm.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kj.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, arq $$1, @Nullable arr $$2, Consumer<cyu> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arq $$1, @Nullable arr $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fU()) {
         return 0;
      } else {
         return $$0 > 0 ? dfn.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arr $$1, Consumer<cyu> $$2) {
      if ($$1 != null) {
         ap.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cyu $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cqy $$1) {
      if ($$1 instanceof arr $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bxc $$1, bwn $$2) {
      if ($$1.dV() instanceof arq $$3) {
         this.a($$0, $$3, $$1 instanceof arr $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cyy a(int $$0, diu $$1, bxc $$2, bwn $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cyy $$4 = this.b($$1, 1);
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

   public boolean a(cwn $$0, cva $$1, cqy $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cyy $$0, cwn $$1, cva $$2, cqy $$3, bxt $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bxc $$0, bxc $$1) {
      cyu $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kj.B)) {
         if ($$1 instanceof cqy $$3) {
            $$3.b(awx.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bxc $$0, bxc $$1) {
      this.h().b(this, $$0, $$1);
      dcg $$2 = this.a(kj.B);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bwn.a);
      }
   }

   public void a(div $$0, dzz $$1, iu $$2, cqy $$3) {
      cyu $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awx.c.b($$4));
      }
   }

   public boolean b(dzz $$0) {
      return this.h().b(this, $$0);
   }

   public bub a(cqy $$0, bxc $$1, bua $$2) {
      dhh $$3 = this.a(kj.D);
      if ($$3 != null && $$3.j()) {
         bub $$4 = $$3.a($$0, $$1, this);
         if ($$4 != bub.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public cyy v() {
      if (this.f()) {
         return k;
      } else {
         cyy $$0 = new cyy(this.h(), this.p, this.s.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public cyy c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cyy $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cyy a(diu $$0) {
      return this.a($$0, this.M());
   }

   public cyy a(diu $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cyy b(diu $$0, int $$1) {
      return new cyy($$0.h().e(), $$1, this.s.g());
   }

   public static boolean a(cyy $$0, cyy $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cyy> $$0, List<cyy> $$1) {
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

   public static boolean b(cyy $$0, cyy $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cyy $$0, cyy $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.s, $$1.s);
      }
   }

   public static MapCodec<cyy> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable cyy $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cyy> $$0) {
      int $$1 = 0;

      for (cyy $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(div $$0, bwd $$1, int $$2, boolean $$3) {
      if (this.q > 0) {
         this.q--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(div $$0, cqy $$1, int $$2) {
      $$1.a(awx.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(div $$0) {
      this.h().a(this, $$0);
   }

   public int a(bxc $$0) {
      return this.h().a(this, $$0);
   }

   public cza w() {
      return this.h().b(this);
   }

   public void a(div $$0, bxc $$1, int $$2) {
      cyy $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cyy $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fz(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().e_(this);
   }

   @Nullable
   public <T> T b(ki<T> $$0, @Nullable T $$1) {
      return this.s.b($$0, $$1);
   }

   public <T> void a(ki<T> $$0, ke $$1) {
      this.b($$0, $$1.a($$0));
   }

   @Nullable
   public <T, U> T a(ki<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(ki<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T e(ki<? extends T> $$0) {
      return this.s.e($$0);
   }

   public void a(kh $$0) {
      kh $$1 = this.s.g();
      this.s.a($$0);
      Optional<Error<cyy>> $$2 = a(this).error();
      if ($$2.isPresent()) {
         n.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.s.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kh $$0) {
      this.s.a($$0);
      this.h().l(this);
   }

   public void b(kg $$0) {
      this.s.a($$0);
      this.h().l(this);
   }

   public wy y() {
      wy $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public wy z() {
      wy $$0 = this.a(kj.g);
      if ($$0 != null) {
         return $$0;
      } else {
         dci $$1 = this.a(kj.V);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bal.h($$2)) {
               return wy.b($$2);
            }
         }

         return null;
      }
   }

   public wy A() {
      return this.h().a(this);
   }

   public wy B() {
      xm $$0 = wy.i().b(this.y()).a(this.D().a());
      if (this.c(kj.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   public <T extends dcd> void a(ki<T> $$0, cyu.b $$1, dcc $$2, Consumer<wy> $$3, dan $$4) {
      T $$5 = (T)this.a($$0);
      if ($$5 != null && $$2.a($$0)) {
         $$5.a($$1, $$3, $$4, this.s);
      }
   }

   public List<wy> a(cyu.b $$0, @Nullable cqy $$1, dan $$2) {
      dcc $$3 = this.a(kj.q, dcc.c);
      if (!$$2.b() && $$3.a()) {
         boolean $$4 = this.h().a(this, $$1);
         return $$4 ? l : List.of();
      } else {
         List<wy> $$5 = Lists.newArrayList();
         $$5.add(this.B());
         this.a($$0, $$3, $$1, $$2, $$5::add);
         return $$5;
      }
   }

   public void a(cyu.b $$0, dcc $$1, @Nullable cqy $$2, dan $$3, Consumer<wy> $$4) {
      this.h().a(this, $$0, $$1, $$4, $$3);
      this.a(kj.aB, $$0, $$1, $$4, $$3);
      this.a(kj.ab, $$0, $$1, $$4, $$3);
      this.a(kj.M, $$0, $$1, $$4, $$3);
      this.a(kj.ar, $$0, $$1, $$4, $$3);
      this.a(kj.at, $$0, $$1, $$4, $$3);
      this.a(kj.ap, $$0, $$1, $$4, $$3);
      this.a(kj.am, $$0, $$1, $$4, $$3);
      this.a(kj.ao, $$0, $$1, $$4, $$3);
      this.a(kj.V, $$0, $$1, $$4, $$3);
      this.a(kj.P, $$0, $$1, $$4, $$3);
      this.a(kj.aj, $$0, $$1, $$4, $$3);
      this.a(kj.ai, $$0, $$1, $$4, $$3);
      this.a(kj.R, $$0, $$1, $$4, $$3);
      this.a(kj.ae, $$0, $$1, $$4, $$3);
      this.a(kj.W, $$0, $$1, $$4, $$3);
      this.a(kj.J, $$0, $$1, $$4, $$3);
      this.a(kj.l, $$0, $$1, $$4, $$3);
      this.a(kj.K, $$0, $$1, $$4, $$3);
      this.a(kj.j, $$0, $$1, $$4, $$3);
      this.a($$4, $$1, $$2);
      if (this.c(kj.f) && $$1.a(kj.f)) {
         $$4.accept(m);
      }

      this.a(kj.ad, $$0, $$1, $$4, $$3);
      this.a(kj.T, $$0, $$1, $$4, $$3);
      this.a(kj.aq, $$0, $$1, $$4, $$3);
      this.a(kj.aa, $$0, $$1, $$4, $$3);
      cwz $$5 = this.a(kj.n);
      if ($$5 != null && $$1.a(kj.n)) {
         $$4.accept(wx.a);
         $$4.accept(cwz.c);
         $$5.a($$4);
      }

      cwz $$6 = this.a(kj.m);
      if ($$6 != null && $$1.a(kj.m)) {
         $$4.accept(wx.a);
         $$4.accept(cwz.d);
         $$6.a($$4);
      }

      if ($$3.a()) {
         if (this.n() && $$1.a(kj.e)) {
            $$4.accept(wy.a("item.durability", this.p() - this.o(), this.p()));
         }

         $$4.accept(wy.b(mf.g.b(this.h()).toString()).a(n.i));
         int $$7 = this.s.d();
         if ($$7 > 0) {
            $$4.accept(wy.a("item.components", $$7).a(n.i));
         }
      }

      if ($$2 != null && !this.h().a($$2.dV().K())) {
         $$4.accept(o);
      }

      boolean $$8 = this.h().a(this, $$2);
      if ($$8) {
         l.forEach($$4);
      }
   }

   private void a(Consumer<wy> $$0, dcc $$1, @Nullable cqy $$2) {
      if ($$1.a(kj.o)) {
         for (bwo $$3 : bwo.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wx.a);
                  $$0.accept(wy.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$2, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wy> $$0, @Nullable cqy $$1, je<byd> $$2, byg $$3) {
      double $$4 = $$3.b();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cyu.h)) {
            $$4 += $$1.i(byi.c);
            $$5 = true;
         } else if ($$3.a(cyu.i)) {
            $$4 += $$1.i(byi.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.c() == byg.a.b || $$3.c() == byg.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(byi.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wx.a().b(wy.a("attribute.modifier.equals." + $$3.c().a(), dbp.d.format($$6), wy.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wy.a("attribute.modifier.plus." + $$3.c().a(), dbp.d.format($$6), wy.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wy.a("attribute.modifier.take." + $$3.c().a(), dbp.d.format(-$$6), wy.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kj.t);
      return $$0 != null ? $$0 : this.h().d_(this);
   }

   public czu D() {
      czu $$0 = this.a(kj.k, czu.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> czu.c;
            case c -> czu.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kj.C)) {
         return false;
      } else {
         dfr $$0 = this.a(kj.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(je<dfl> $$0, int $$1) {
      dfn.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kj.l, dfr.a).d();
   }

   public dfr G() {
      return this.a(kj.l, dfr.a);
   }

   public boolean H() {
      return this.t instanceof cmw;
   }

   public void a(@Nullable bwd $$0) {
      if (!this.f()) {
         this.t = $$0;
      }
   }

   @Nullable
   public cmw I() {
      return this.t instanceof cmw ? (cmw)this.J() : null;
   }

   @Nullable
   public bwd J() {
      return !this.f() ? this.t : null;
   }

   public void a(bwo $$0, BiConsumer<je<byd>, byg> $$1) {
      dbp $$2 = this.a(kj.o, dbp.a);
      $$2.a($$0, $$1);
      dfn.a(this, $$0, $$1);
   }

   public void a(bwn $$0, BiConsumer<je<byd>, byg> $$1) {
      dbp $$2 = this.a(kj.o, dbp.a);
      $$2.a($$0, $$1);
      dfn.a(this, $$0, $$1);
   }

   public wy K() {
      xm $$0 = wy.i().b(this.y());
      if (this.c(kj.g)) {
         $$0.a(n.u);
      }

      xm $$1 = xb.a((wy)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xe.d(this)));
      }

      return $$1;
   }

   public boolean a(ead $$0) {
      cwz $$1 = this.a(kj.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(ead $$0) {
      cwz $$1 = this.a(kj.n);
      return $$1 != null && $$1.a($$0);
   }

   public int L() {
      return this.q;
   }

   public void d(int $$0) {
      this.q = $$0;
   }

   public int M() {
      return this.f() ? 0 : this.p;
   }

   public void e(int $$0) {
      this.p = $$0;
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

   public void a(int $$0, @Nullable bxc $$1) {
      if ($$1 == null || !$$1.fU()) {
         this.h($$0);
      }
   }

   public cyy b(int $$0, @Nullable bxc $$1) {
      cyy $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(div $$0, bxc $$1, int $$2) {
      dbd $$3 = this.a(kj.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cnd $$0) {
      this.h().a($$0);
   }

   public boolean a(bus $$0) {
      dbi $$1 = this.a(kj.z);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(cyy $$0) {
      dft $$1 = this.a(kj.E);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(dzz $$0, div $$1, iu $$2, cqy $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
