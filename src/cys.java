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

public final class cys implements kf {
   private static final List<ww> l = List.of(
      ww.c("item.op_warning.line1").a(n.m, n.r), ww.c("item.op_warning.line2").a(n.m), ww.c("item.op_warning.line3").a(n.m)
   );
   private static final ww m = ww.c("item.unbreakable").a(n.j);
   public static final MapCodec<cys> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     cyo.e.fieldOf("id").forGetter(cys::i),
                     ays.a(1, 99).fieldOf("count").orElse(1).forGetter(cys::M),
                     kh.b.optionalFieldOf("components", kh.a).forGetter($$0xx -> $$0xx.s.g())
                  )
                  .apply($$0x, cys::new)
         )
   );
   public static final Codec<cys> b = Codec.lazyInitialized(a::codec);
   public static final Codec<cys> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cyo.e.fieldOf("id").forGetter(cys::i), kh.b.optionalFieldOf("components", kh.a).forGetter($$0x -> $$0x.s.g()))
                  .apply($$0, ($$0x, $$1) -> new cys($$0x, 1, $$1))
         )
   );
   public static final Codec<cys> d = b.validate(cys::a);
   public static final Codec<cys> e = c.validate(cys::a);
   public static final Codec<cys> f = ays.g(b).xmap($$0 -> $$0.orElse(cys.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cys> g = cyo.e.xmap(cys::new, cys::i);
   public static final yu<wh, cys> h = new yu<wh, cys>() {
      public cys a(wh $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cys.k;
         } else {
            je<cyo> $$2 = cyo.f.decode($$0);
            kh $$3 = kh.c.decode($$0);
            return new cys($$2, $$1, $$3);
         }
      }

      public void a(wh $$0, cys $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            cyo.f.encode($$0, $$1.i());
            kh.c.encode($$0, $$1.s.g());
         }
      }
   };
   public static final yu<wh, cys> i = new yu<wh, cys>() {
      public cys a(wh $$0) {
         cys $$1 = cys.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wh $$0, cys $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cys.h.encode($$0, $$1);
         }
      }
   };
   public static final yu<wh, List<cys>> j = h.a(ys.a(jn::a));
   private static final Logger n = LogUtils.getLogger();
   public static final cys k = new cys((Void)null);
   private static final ww o = ww.c("item.disabled").a(n.m);
   private int p;
   private int q;
   @Deprecated
   @Nullable
   private final cyo r;
   final kk s;
   @Nullable
   private bwa t;

   public static DataResult<cys> a(cys $$0) {
      DataResult<bas> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static yu<wh, cys> a(final yu<wh, cys> $$0) {
      return new yu<wh, cys>() {
         public cys a(wh $$0x) {
            cys $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alc<bas> $$2 = $$0.H().a(azm.a);
               cys.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wh $$0x, cys $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cwr> b() {
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

   public cys(dio $$0) {
      this($$0, 1);
   }

   public cys(je<cyo> $$0) {
      this($$0.a(), 1);
   }

   public cys(je<cyo> $$0, int $$1, kh $$2) {
      this($$0.a(), $$1, kk.a($$0.a().f(), $$2));
   }

   public cys(je<cyo> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cys(dio $$0, int $$1) {
      this($$0, $$1, new kk($$0.h().f()));
   }

   private cys(dio $$0, int $$1, kk $$2) {
      this.r = $$0.h();
      this.p = $$1;
      this.s = $$2;
      this.h().l(this);
   }

   private cys(@Nullable Void $$0) {
      this.r = null;
      this.s = new kk(kg.a);
   }

   public static DataResult<bas> a(kg $$0) {
      if ($$0.c(kj.d) && $$0.a(kj.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dbk $$1 = $$0.a(kj.ap, dbk.a);

         for (cys $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bas.a);
      }
   }

   public static Optional<cys> a(jg.a $$0, uu $$1) {
      return b.parse($$0.a(ul.a), $$1).resultOrPartial($$0x -> n.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cys a(jg.a $$0, tx $$1) {
      return $$1.g() ? k : a($$0, (uu)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.r == cyw.a || this.p <= 0;
   }

   public boolean a(cub $$0) {
      return this.f() || this.h().a($$0);
   }

   public cys a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cys $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cys g() {
      if (this.f()) {
         return k;
      } else {
         cys $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cyo h() {
      return this.f() ? cyw.a : this.r;
   }

   public je<cyo> i() {
      return this.h().e();
   }

   public boolean a(axp<cyo> $$0) {
      return this.h().e().a($$0);
   }

   public boolean a(cyo $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<je<cyo>> $$0) {
      return $$0.test(this.h().e());
   }

   public boolean a(je<cyo> $$0) {
      return this.h().e() == $$0;
   }

   public boolean a(ji<cyo> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axp<cyo>> j() {
      return this.h().e().c();
   }

   public bty a(dcn $$0) {
      cqs $$1 = $$0.o();
      iu $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new dzs($$0.q(), $$2, false))) {
         return bty.e;
      } else {
         cyo $$3 = this.h();
         bty $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bty.d $$5 && $$5.c()) {
            $$1.b(awv.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dzo $$0) {
      return this.h().a(this, $$0);
   }

   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = this.v();
      boolean $$4 = this.a((bwz)$$1) <= 0;
      bty $$5 = this.h().a($$0, $$1, $$2);
      return (bty)($$4 && $$5 instanceof bty.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cys a(dip $$0, bwz $$1) {
      cys $$2 = this.v();
      cys $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cys a(bwz $$0, cys $$1) {
      dbz $$2 = $$1.a(kj.x);
      dby $$3 = $$1.a(kj.y);
      int $$4 = $$1.M();
      cys $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fU(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public uu b(jg.a $$0, uu $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uu)b.encode(this, $$0.a(ul.a), $$1).getOrThrow();
      }
   }

   public uu a(jg.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uu)b.encodeStart($$0.a(ul.a), this).getOrThrow();
      }
   }

   public uu b(jg.a $$0) {
      return (uu)(this.f() ? new tx() : this.b($$0, new tx()));
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
      return azk.a(this.a(kj.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kj.e, Integer.valueOf(azk.a($$0, 0, this.p())));
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

   public void a(int $$0, aro $$1, @Nullable arp $$2, Consumer<cyo> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, aro $$1, @Nullable arp $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fU()) {
         return 0;
      } else {
         return $$0 > 0 ? dfh.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arp $$1, Consumer<cyo> $$2) {
      if ($$1 != null) {
         ap.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cyo $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cqs $$1) {
      if ($$1 instanceof arp $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bwz $$1, bwk $$2) {
      if ($$1.dV() instanceof aro $$3) {
         this.a($$0, $$3, $$1 instanceof arp $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cys a(int $$0, dio $$1, bwz $$2, bwk $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cys $$4 = this.b($$1, 1);
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

   public boolean a(cwh $$0, cuu $$1, cqs $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cys $$0, cwh $$1, cuu $$2, cqs $$3, bxq $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bwz $$0, bwz $$1) {
      cyo $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kj.B)) {
         if ($$1 instanceof cqs $$3) {
            $$3.b(awv.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bwz $$0, bwz $$1) {
      this.h().b(this, $$0, $$1);
      dca $$2 = this.a(kj.B);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bwk.a);
      }
   }

   public void a(dip $$0, dzo $$1, iu $$2, cqs $$3) {
      cyo $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awv.c.b($$4));
      }
   }

   public boolean b(dzo $$0) {
      return this.h().b(this, $$0);
   }

   public bty a(cqs $$0, bwz $$1, btx $$2) {
      dhb $$3 = this.a(kj.D);
      if ($$3 != null && $$3.j()) {
         bty $$4 = $$3.a($$0, $$1, this);
         if ($$4 != bty.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public cys v() {
      if (this.f()) {
         return k;
      } else {
         cys $$0 = new cys(this.h(), this.p, this.s.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public cys c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cys $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cys a(dio $$0) {
      return this.a($$0, this.M());
   }

   public cys a(dio $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cys b(dio $$0, int $$1) {
      return new cys($$0.h().e(), $$1, this.s.g());
   }

   public static boolean a(cys $$0, cys $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cys> $$0, List<cys> $$1) {
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

   public static boolean b(cys $$0, cys $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cys $$0, cys $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.s, $$1.s);
      }
   }

   public static MapCodec<cys> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable cys $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cys> $$0) {
      int $$1 = 0;

      for (cys $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dip $$0, bwa $$1, int $$2, boolean $$3) {
      if (this.q > 0) {
         this.q--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dip $$0, cqs $$1, int $$2) {
      $$1.a(awv.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dip $$0) {
      this.h().a(this, $$0);
   }

   public int a(bwz $$0) {
      return this.h().a(this, $$0);
   }

   public cyu w() {
      return this.h().b(this);
   }

   public void a(dip $$0, bwz $$1, int $$2) {
      cys $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cys $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fz(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().d_(this);
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
      Optional<Error<cys>> $$2 = a(this).error();
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

   public ww y() {
      ww $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public ww z() {
      ww $$0 = this.a(kj.g);
      if ($$0 != null) {
         return $$0;
      } else {
         dcc $$1 = this.a(kj.V);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!baj.h($$2)) {
               return ww.b($$2);
            }
         }

         return null;
      }
   }

   public ww A() {
      return this.h().a(this);
   }

   public ww B() {
      xk $$0 = ww.i().b(this.y()).a(this.D().a());
      if (this.c(kj.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   public <T extends dbx> void a(ki<T> $$0, cyo.b $$1, dbw $$2, Consumer<ww> $$3, dah $$4) {
      T $$5 = (T)this.a($$0);
      if ($$5 != null && $$2.a($$0)) {
         $$5.a($$1, $$3, $$4, this.s);
      }
   }

   public List<ww> a(cyo.b $$0, @Nullable cqs $$1, dah $$2) {
      dbw $$3 = this.a(kj.q, dbw.c);
      if (!$$2.b() && $$3.a()) {
         boolean $$4 = this.h().a(this, $$1);
         return $$4 ? l : List.of();
      } else {
         List<ww> $$5 = Lists.newArrayList();
         $$5.add(this.B());
         this.a($$0, $$3, $$1, $$2, $$5::add);
         return $$5;
      }
   }

   public void a(cyo.b $$0, dbw $$1, @Nullable cqs $$2, dah $$3, Consumer<ww> $$4) {
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
      cwt $$5 = this.a(kj.n);
      if ($$5 != null && $$1.a(kj.n)) {
         $$4.accept(wv.a);
         $$4.accept(cwt.c);
         $$5.a($$4);
      }

      cwt $$6 = this.a(kj.m);
      if ($$6 != null && $$1.a(kj.m)) {
         $$4.accept(wv.a);
         $$4.accept(cwt.d);
         $$6.a($$4);
      }

      if ($$3.a()) {
         if (this.n() && $$1.a(kj.e)) {
            $$4.accept(ww.a("item.durability", this.p() - this.o(), this.p()));
         }

         $$4.accept(ww.b(mf.g.b(this.h()).toString()).a(n.i));
         int $$7 = this.s.d();
         if ($$7 > 0) {
            $$4.accept(ww.a("item.components", $$7).a(n.i));
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

   private void a(Consumer<ww> $$0, dbw $$1, @Nullable cqs $$2) {
      if ($$1.a(kj.o)) {
         for (bwl $$3 : bwl.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wv.a);
                  $$0.accept(ww.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$2, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<ww> $$0, @Nullable cqs $$1, je<bya> $$2, byd $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cyo.h)) {
            $$4 += $$1.i(byf.c);
            $$5 = true;
         } else if ($$3.a(cyo.i)) {
            $$4 += $$1.i(byf.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == byd.a.b || $$3.d() == byd.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(byf.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wv.a().b(ww.a("attribute.modifier.equals." + $$3.d().a(), dbj.d.format($$6), ww.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(ww.a("attribute.modifier.plus." + $$3.d().a(), dbj.d.format($$6), ww.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(ww.a("attribute.modifier.take." + $$3.d().a(), dbj.d.format(-$$6), ww.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kj.t);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public czo D() {
      czo $$0 = this.a(kj.k, czo.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> czo.c;
            case c -> czo.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kj.C)) {
         return false;
      } else {
         dfl $$0 = this.a(kj.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(je<dff> $$0, int $$1) {
      dfh.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kj.l, dfl.a).d();
   }

   public dfl G() {
      return this.a(kj.l, dfl.a);
   }

   public boolean H() {
      return this.t instanceof cmq;
   }

   public void a(@Nullable bwa $$0) {
      if (!this.f()) {
         this.t = $$0;
      }
   }

   @Nullable
   public cmq I() {
      return this.t instanceof cmq ? (cmq)this.J() : null;
   }

   @Nullable
   public bwa J() {
      return !this.f() ? this.t : null;
   }

   public void a(bwl $$0, BiConsumer<je<bya>, byd> $$1) {
      dbj $$2 = this.a(kj.o, dbj.a);
      $$2.a($$0, $$1);
      dfh.a(this, $$0, $$1);
   }

   public void a(bwk $$0, BiConsumer<je<bya>, byd> $$1) {
      dbj $$2 = this.a(kj.o, dbj.a);
      $$2.a($$0, $$1);
      dfh.a(this, $$0, $$1);
   }

   public ww K() {
      xk $$0 = ww.i().b(this.y());
      if (this.c(kj.g)) {
         $$0.a(n.u);
      }

      xk $$1 = wz.a((ww)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xc.d(this)));
      }

      return $$1;
   }

   public boolean a(dzs $$0) {
      cwt $$1 = this.a(kj.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dzs $$0) {
      cwt $$1 = this.a(kj.n);
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

   public void a(int $$0, @Nullable bwz $$1) {
      if ($$1 == null || !$$1.fU()) {
         this.h($$0);
      }
   }

   public cys b(int $$0, @Nullable bwz $$1) {
      cys $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dip $$0, bwz $$1, int $$2) {
      dax $$3 = this.a(kj.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cmx $$0) {
      this.h().a($$0);
   }

   public boolean a(bup $$0) {
      dbc $$1 = this.a(kj.z);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(cys $$0) {
      dfn $$1 = this.a(kj.E);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(dzo $$0, dip $$1, iu $$2, cqs $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
