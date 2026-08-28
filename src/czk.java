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

public final class czk implements kg {
   private static final List<wy> l = List.of(
      wy.c("item.op_warning.line1").a(o.m, o.r), wy.c("item.op_warning.line2").a(o.m), wy.c("item.op_warning.line3").a(o.m)
   );
   private static final wy m = wy.c("item.unbreakable").a(o.j);
   public static final MapCodec<czk> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     czg.e.fieldOf("id").forGetter(czk::i),
                     ayu.a(1, 99).fieldOf("count").orElse(1).forGetter(czk::M),
                     ki.b.optionalFieldOf("components", ki.a).forGetter($$0xx -> $$0xx.s.g())
                  )
                  .apply($$0x, czk::new)
         )
   );
   public static final Codec<czk> b = Codec.lazyInitialized(a::codec);
   public static final Codec<czk> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(czg.e.fieldOf("id").forGetter(czk::i), ki.b.optionalFieldOf("components", ki.a).forGetter($$0x -> $$0x.s.g()))
                  .apply($$0, ($$0x, $$1) -> new czk($$0x, 1, $$1))
         )
   );
   public static final Codec<czk> d = b.validate(czk::a);
   public static final Codec<czk> e = c.validate(czk::a);
   public static final Codec<czk> f = ayu.g(b).xmap($$0 -> $$0.orElse(czk.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<czk> g = czg.e.xmap(czk::new, czk::i);
   public static final yw<wj, czk> h = new yw<wj, czk>() {
      public czk a(wj $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return czk.k;
         } else {
            jf<czg> $$2 = czg.f.decode($$0);
            ki $$3 = ki.c.decode($$0);
            return new czk($$2, $$1, $$3);
         }
      }

      public void a(wj $$0, czk $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            czg.f.encode($$0, $$1.i());
            ki.c.encode($$0, $$1.s.g());
         }
      }
   };
   public static final yw<wj, czk> i = new yw<wj, czk>() {
      public czk a(wj $$0) {
         czk $$1 = czk.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wj $$0, czk $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            czk.h.encode($$0, $$1);
         }
      }
   };
   public static final yw<wj, List<czk>> j = h.a(yu.a(jo::a));
   private static final Logger n = LogUtils.getLogger();
   public static final czk k = new czk((Void)null);
   private static final wy o = wy.c("item.disabled").a(o.m);
   private int p;
   private int q;
   @Deprecated
   @Nullable
   private final czg r;
   final kl s;
   @Nullable
   private bwi t;

   public static DataResult<czk> a(czk $$0) {
      DataResult<bau> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static yw<wj, czk> a(final yw<wj, czk> $$0) {
      return new yw<wj, czk>() {
         public czk a(wj $$0x) {
            czk $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               ale<bau> $$2 = $$0.H().a(azo.a);
               czk.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wj $$0x, czk $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cxj> b() {
      return this.h().k(this);
   }

   @Override
   public kh a() {
      return (kh)(!this.f() ? this.s : kh.a);
   }

   public kh c() {
      return !this.f() ? this.h().f() : kh.a;
   }

   public ki d() {
      return !this.f() ? this.s.g() : ki.a;
   }

   public kh e() {
      return !this.f() ? this.s.i() : kh.a;
   }

   public boolean d(kj<?> $$0) {
      return !this.f() && this.s.d($$0);
   }

   public czk(djg $$0) {
      this($$0, 1);
   }

   public czk(jf<czg> $$0) {
      this($$0.a(), 1);
   }

   public czk(jf<czg> $$0, int $$1, ki $$2) {
      this($$0.a(), $$1, kl.a($$0.a().f(), $$2));
   }

   public czk(jf<czg> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public czk(djg $$0, int $$1) {
      this($$0, $$1, new kl($$0.h().f()));
   }

   private czk(djg $$0, int $$1, kl $$2) {
      this.r = $$0.h();
      this.p = $$1;
      this.s = $$2;
      this.h().l(this);
   }

   private czk(@Nullable Void $$0) {
      this.r = null;
      this.s = new kl(kh.a);
   }

   public static DataResult<bau> a(kh $$0) {
      if ($$0.c(kk.d) && $$0.a(kk.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dcc $$1 = $$0.a(kk.ap, dcc.a);

         for (czk $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bau.a);
      }
   }

   public static Optional<czk> a(jh.a $$0, uw $$1) {
      return b.parse($$0.a(un.a), $$1).resultOrPartial($$0x -> n.error("Tried to load invalid item: '{}'", $$0x));
   }

   public boolean f() {
      return this == k || this.r == czo.a || this.p <= 0;
   }

   public boolean a(cut $$0) {
      return this.f() || this.h().a($$0);
   }

   public czk a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      czk $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public czk g() {
      if (this.f()) {
         return k;
      } else {
         czk $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public czg h() {
      return this.f() ? czo.a : this.r;
   }

   public jf<czg> i() {
      return this.h().e();
   }

   public boolean a(axr<czg> $$0) {
      return this.h().e().a($$0);
   }

   public boolean a(czg $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jf<czg>> $$0) {
      return $$0.test(this.h().e());
   }

   public boolean a(jf<czg> $$0) {
      return this.h().e() == $$0;
   }

   public boolean a(jj<czg> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axr<czg>> j() {
      return this.h().e().c();
   }

   public bug a(ddf $$0) {
      crj $$1 = $$0.o();
      iv $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new eas($$0.q(), $$2, false))) {
         return bug.e;
      } else {
         czg $$3 = this.h();
         bug $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bug.d $$5 && $$5.c()) {
            $$1.b(awx.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(eao $$0) {
      return this.h().a(this, $$0);
   }

   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = this.v();
      boolean $$4 = this.a((bxj)$$1) <= 0;
      bug $$5 = this.h().a($$0, $$1, $$2);
      return (bug)($$4 && $$5 instanceof bug.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public czk a(djh $$0, bxj $$1) {
      czk $$2 = this.v();
      czk $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private czk a(bxj $$0, czk $$1) {
      dcr $$2 = $$1.a(kk.x);
      dcq $$3 = $$1.a(kk.y);
      int $$4 = $$1.M();
      czk $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fU(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public uw b(jh.a $$0, uw $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uw)b.encode(this, $$0.a(un.a), $$1).getOrThrow();
      }
   }

   public uw a(jh.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uw)b.encodeStart($$0.a(un.a), this).getOrThrow();
      }
   }

   public int k() {
      return this.a(kk.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.c(kk.d) && !this.c(kk.f) && this.c(kk.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azm.a(this.a(kk.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kk.e, Integer.valueOf(azm.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kk.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, arq $$1, @Nullable arr $$2, Consumer<czg> $$3) {
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
         return $$0 > 0 ? dfz.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arr $$1, Consumer<czg> $$2) {
      if ($$1 != null) {
         aq.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         czg $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, crj $$1) {
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

   public void a(int $$0, bxj $$1, bws $$2) {
      if ($$1.dU() instanceof arq $$3) {
         this.a($$0, $$3, $$1 instanceof arr $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public czk a(int $$0, djg $$1, bxj $$2, bws $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         czk $$4 = this.b($$1, 1);
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

   public boolean a(cwz $$0, cvm $$1, crj $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(czk $$0, cwz $$1, cvm $$2, crj $$3, bya $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bxj $$0, bxj $$1) {
      czg $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kk.B)) {
         if ($$1 instanceof crj $$3) {
            $$3.b(awx.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bxj $$0, bxj $$1) {
      this.h().b(this, $$0, $$1);
      dcs $$2 = this.a(kk.B);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bws.a);
      }
   }

   public void a(djh $$0, eao $$1, iv $$2, crj $$3) {
      czg $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awx.c.b($$4));
      }
   }

   public boolean b(eao $$0) {
      return this.h().b(this, $$0);
   }

   public bug a(crj $$0, bxj $$1, buf $$2) {
      dht $$3 = this.a(kk.D);
      if ($$3 != null && $$3.j()) {
         bug $$4 = $$3.a($$0, $$1, this);
         if ($$4 != bug.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public czk v() {
      if (this.f()) {
         return k;
      } else {
         czk $$0 = new czk(this.h(), this.p, this.s.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public czk c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         czk $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public czk a(djg $$0) {
      return this.a($$0, this.M());
   }

   public czk a(djg $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private czk b(djg $$0, int $$1) {
      return new czk($$0.h().e(), $$1, this.s.g());
   }

   public static boolean a(czk $$0, czk $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<czk> $$0, List<czk> $$1) {
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

   public static boolean b(czk $$0, czk $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(czk $$0, czk $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.s, $$1.s);
      }
   }

   public static MapCodec<czk> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable czk $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<czk> $$0) {
      int $$1 = 0;

      for (czk $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(djh $$0, bwi $$1, @Nullable bws $$2) {
      if (this.q > 0) {
         this.q--;
      }

      if ($$0 instanceof arq $$3) {
         this.h().a(this, $$3, $$1, $$2);
      }
   }

   public void a(djh $$0, crj $$1, int $$2) {
      $$1.a(awx.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(djh $$0) {
      this.h().a(this, $$0);
   }

   public int a(bxj $$0) {
      return this.h().a(this, $$0);
   }

   public czm w() {
      return this.h().b(this);
   }

   public void a(djh $$0, bxj $$1, int $$2) {
      czk $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         czk $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fz(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().e_(this);
   }

   @Nullable
   public <T> T b(kj<T> $$0, @Nullable T $$1) {
      return this.s.b($$0, $$1);
   }

   public <T> void a(kj<T> $$0, kf $$1) {
      this.b($$0, $$1.a($$0));
   }

   @Nullable
   public <T, U> T a(kj<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kj<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T e(kj<? extends T> $$0) {
      return this.s.e($$0);
   }

   public void a(ki $$0) {
      ki $$1 = this.s.g();
      this.s.a($$0);
      Optional<Error<czk>> $$2 = a(this).error();
      if ($$2.isPresent()) {
         n.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.s.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(ki $$0) {
      this.s.a($$0);
      this.h().l(this);
   }

   public void b(kh $$0) {
      this.s.a($$0);
      this.h().l(this);
   }

   public wy y() {
      wy $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public wy z() {
      wy $$0 = this.a(kk.g);
      if ($$0 != null) {
         return $$0;
      } else {
         dcu $$1 = this.a(kk.V);
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
      if (this.c(kk.g)) {
         $$0.a(o.u);
      }

      return $$0;
   }

   public <T extends dcp> void a(kj<T> $$0, czg.b $$1, dco $$2, Consumer<wy> $$3, daz $$4) {
      T $$5 = (T)this.a($$0);
      if ($$5 != null && $$2.a($$0)) {
         $$5.a($$1, $$3, $$4, this.s);
      }
   }

   public List<wy> a(czg.b $$0, @Nullable crj $$1, daz $$2) {
      dco $$3 = this.a(kk.q, dco.c);
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

   public void a(czg.b $$0, dco $$1, @Nullable crj $$2, daz $$3, Consumer<wy> $$4) {
      this.h().a(this, $$0, $$1, $$4, $$3);
      this.a(kk.aB, $$0, $$1, $$4, $$3);
      this.a(kk.ab, $$0, $$1, $$4, $$3);
      this.a(kk.M, $$0, $$1, $$4, $$3);
      this.a(kk.ar, $$0, $$1, $$4, $$3);
      this.a(kk.at, $$0, $$1, $$4, $$3);
      this.a(kk.ap, $$0, $$1, $$4, $$3);
      this.a(kk.am, $$0, $$1, $$4, $$3);
      this.a(kk.ao, $$0, $$1, $$4, $$3);
      this.a(kk.V, $$0, $$1, $$4, $$3);
      this.a(kk.P, $$0, $$1, $$4, $$3);
      this.a(kk.aj, $$0, $$1, $$4, $$3);
      this.a(kk.ai, $$0, $$1, $$4, $$3);
      this.a(kk.R, $$0, $$1, $$4, $$3);
      this.a(kk.ae, $$0, $$1, $$4, $$3);
      this.a(kk.W, $$0, $$1, $$4, $$3);
      this.a(kk.J, $$0, $$1, $$4, $$3);
      this.a(kk.l, $$0, $$1, $$4, $$3);
      this.a(kk.K, $$0, $$1, $$4, $$3);
      this.a(kk.j, $$0, $$1, $$4, $$3);
      this.a($$4, $$1, $$2);
      if (this.c(kk.f) && $$1.a(kk.f)) {
         $$4.accept(m);
      }

      this.a(kk.ad, $$0, $$1, $$4, $$3);
      this.a(kk.T, $$0, $$1, $$4, $$3);
      this.a(kk.aq, $$0, $$1, $$4, $$3);
      this.a(kk.aa, $$0, $$1, $$4, $$3);
      cxl $$5 = this.a(kk.n);
      if ($$5 != null && $$1.a(kk.n)) {
         $$4.accept(wx.a);
         $$4.accept(cxl.c);
         $$5.a($$4);
      }

      cxl $$6 = this.a(kk.m);
      if ($$6 != null && $$1.a(kk.m)) {
         $$4.accept(wx.a);
         $$4.accept(cxl.d);
         $$6.a($$4);
      }

      if ($$3.a()) {
         if (this.n() && $$1.a(kk.e)) {
            $$4.accept(wy.a("item.durability", this.p() - this.o(), this.p()));
         }

         $$4.accept(wy.b(mg.g.b(this.h()).toString()).a(o.i));
         int $$7 = this.s.d();
         if ($$7 > 0) {
            $$4.accept(wy.a("item.components", $$7).a(o.i));
         }
      }

      if ($$2 != null && !this.h().a($$2.dU().K())) {
         $$4.accept(o);
      }

      boolean $$8 = this.h().a(this, $$2);
      if ($$8) {
         l.forEach($$4);
      }
   }

   private void a(Consumer<wy> $$0, dco $$1, @Nullable crj $$2) {
      if ($$1.a(kk.o)) {
         for (bwt $$3 : bwt.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wx.a);
                  $$0.accept(wy.c("item.modifiers." + $$3.c()).a(o.h));
                  $$4.setFalse();
               }

               this.a($$0, $$2, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wy> $$0, @Nullable crj $$1, jf<byk> $$2, byn $$3) {
      double $$4 = $$3.b();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(czg.h)) {
            $$4 += $$1.i(byp.c);
            $$5 = true;
         } else if ($$3.a(czg.i)) {
            $$4 += $$1.i(byp.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.c() == byn.a.b || $$3.c() == byn.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(byp.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wx.a().b(wy.a("attribute.modifier.equals." + $$3.c().a(), dcb.d.format($$6), wy.c($$2.a().c()))).a(o.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wy.a("attribute.modifier.plus." + $$3.c().a(), dcb.d.format($$6), wy.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wy.a("attribute.modifier.take." + $$3.c().a(), dcb.d.format(-$$6), wy.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kk.t);
      return $$0 != null ? $$0 : this.h().d_(this);
   }

   public dag D() {
      dag $$0 = this.a(kk.k, dag.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> dag.c;
            case c -> dag.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kk.C)) {
         return false;
      } else {
         dgd $$0 = this.a(kk.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jf<dfx> $$0, int $$1) {
      dfz.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kk.l, dgd.a).d();
   }

   public dgd G() {
      return this.a(kk.l, dgd.a);
   }

   public boolean H() {
      return this.t instanceof cnh;
   }

   public void a(@Nullable bwi $$0) {
      if (!this.f()) {
         this.t = $$0;
      }
   }

   @Nullable
   public cnh I() {
      return this.t instanceof cnh ? (cnh)this.J() : null;
   }

   @Nullable
   public bwi J() {
      return !this.f() ? this.t : null;
   }

   public void a(bwt $$0, BiConsumer<jf<byk>, byn> $$1) {
      dcb $$2 = this.a(kk.o, dcb.a);
      $$2.a($$0, $$1);
      dfz.a(this, $$0, $$1);
   }

   public void a(bws $$0, BiConsumer<jf<byk>, byn> $$1) {
      dcb $$2 = this.a(kk.o, dcb.a);
      $$2.a($$0, $$1);
      dfz.a(this, $$0, $$1);
   }

   public wy K() {
      xm $$0 = wy.i().b(this.y());
      if (this.c(kk.g)) {
         $$0.a(o.u);
      }

      xm $$1 = xb.a((wy)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xe.d(this)));
      }

      return $$1;
   }

   public boolean a(eas $$0) {
      cxl $$1 = this.a(kk.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(eas $$0) {
      cxl $$1 = this.a(kk.n);
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

   public void a(int $$0, @Nullable bxj $$1) {
      if ($$1 == null || !$$1.fU()) {
         this.h($$0);
      }
   }

   public czk b(int $$0, @Nullable bxj $$1) {
      czk $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(djh $$0, bxj $$1, int $$2) {
      dbp $$3 = this.a(kk.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dX(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cno $$0) {
      this.h().a($$0);
   }

   public boolean a(bux $$0) {
      dbu $$1 = this.a(kk.z);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(czk $$0) {
      dgf $$1 = this.a(kk.E);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(eao $$0, djh $$1, iv $$2, crj $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
