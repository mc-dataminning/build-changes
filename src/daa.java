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

public final class daa implements kh {
   private static final List<xc> l = List.of(
      xc.c("item.op_warning.line1").a(o.m, o.r), xc.c("item.op_warning.line2").a(o.m), xc.c("item.op_warning.line3").a(o.m)
   );
   private static final xc m = xc.c("item.unbreakable").a(o.j);
   public static final MapCodec<daa> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     czw.e.fieldOf("id").forGetter(daa::i),
                     ayy.a(1, 99).fieldOf("count").orElse(1).forGetter(daa::M),
                     kj.b.optionalFieldOf("components", kj.a).forGetter($$0xx -> $$0xx.s.g())
                  )
                  .apply($$0x, daa::new)
         )
   );
   public static final Codec<daa> b = Codec.lazyInitialized(a::codec);
   public static final Codec<daa> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(czw.e.fieldOf("id").forGetter(daa::i), kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.s.g()))
                  .apply($$0, ($$0x, $$1) -> new daa($$0x, 1, $$1))
         )
   );
   public static final Codec<daa> d = b.validate(daa::a);
   public static final Codec<daa> e = c.validate(daa::a);
   public static final Codec<daa> f = ayy.g(b).xmap($$0 -> $$0.orElse(daa.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<daa> g = czw.e.xmap(daa::new, daa::i);
   public static final za<wn, daa> h = new za<wn, daa>() {
      public daa a(wn $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return daa.k;
         } else {
            jg<czw> $$2 = czw.f.decode($$0);
            kj $$3 = kj.c.decode($$0);
            return new daa($$2, $$1, $$3);
         }
      }

      public void a(wn $$0, daa $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            czw.f.encode($$0, $$1.i());
            kj.c.encode($$0, $$1.s.g());
         }
      }
   };
   public static final za<wn, daa> i = new za<wn, daa>() {
      public daa a(wn $$0) {
         daa $$1 = daa.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wn $$0, daa $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            daa.h.encode($$0, $$1);
         }
      }
   };
   public static final za<wn, List<daa>> j = h.a(yy.a(jp::a));
   private static final Logger n = LogUtils.getLogger();
   public static final daa k = new daa((Void)null);
   private static final xc o = xc.c("item.disabled").a(o.m);
   private int p;
   private int q;
   @Deprecated
   @Nullable
   private final czw r;
   final km s;
   @Nullable
   private bwv t;

   public static DataResult<daa> a(daa $$0) {
      DataResult<bay> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static za<wn, daa> a(final za<wn, daa> $$0) {
      return new za<wn, daa>() {
         public daa a(wn $$0x) {
            daa $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               ali<bay> $$2 = $$0.H().a(azs.a);
               daa.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wn $$0x, daa $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cxz> b() {
      return this.h().k(this);
   }

   @Override
   public ki a() {
      return (ki)(!this.f() ? this.s : ki.a);
   }

   public ki c() {
      return !this.f() ? this.h().f() : ki.a;
   }

   public kj d() {
      return !this.f() ? this.s.g() : kj.a;
   }

   public ki e() {
      return !this.f() ? this.s.i() : ki.a;
   }

   public boolean d(kk<?> $$0) {
      return !this.f() && this.s.d($$0);
   }

   public daa(djy $$0) {
      this($$0, 1);
   }

   public daa(jg<czw> $$0) {
      this($$0.a(), 1);
   }

   public daa(jg<czw> $$0, int $$1, kj $$2) {
      this($$0.a(), $$1, km.a($$0.a().f(), $$2));
   }

   public daa(jg<czw> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public daa(djy $$0, int $$1) {
      this($$0, $$1, new km($$0.h().f()));
   }

   private daa(djy $$0, int $$1, km $$2) {
      this.r = $$0.h();
      this.p = $$1;
      this.s = $$2;
      this.h().l(this);
   }

   private daa(@Nullable Void $$0) {
      this.r = null;
      this.s = new km(ki.a);
   }

   public static DataResult<bay> a(ki $$0) {
      if ($$0.c(kl.d) && $$0.a(kl.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dcs $$1 = $$0.a(kl.ap, dcs.a);

         for (daa $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bay.a);
      }
   }

   public static Optional<daa> a(ji.a $$0, va $$1) {
      return b.parse($$0.a(uo.a), $$1).resultOrPartial($$0x -> n.error("Tried to load invalid item: '{}'", $$0x));
   }

   public boolean f() {
      return this == k || this.r == dae.a || this.p <= 0;
   }

   public boolean a(cvj $$0) {
      return this.f() || this.h().a($$0);
   }

   public daa a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      daa $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public daa g() {
      if (this.f()) {
         return k;
      } else {
         daa $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public czw h() {
      return this.f() ? dae.a : this.r;
   }

   public jg<czw> i() {
      return this.h().e();
   }

   public boolean a(axv<czw> $$0) {
      return this.h().e().a($$0);
   }

   public boolean a(czw $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jg<czw>> $$0) {
      return $$0.test(this.h().e());
   }

   public boolean a(jg<czw> $$0) {
      return this.h().e() == $$0;
   }

   public boolean a(jk<czw> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axv<czw>> j() {
      return this.h().e().c();
   }

   public but a(ddv $$0) {
      crz $$1 = $$0.o();
      iw $$2 = $$0.a();
      if ($$1 != null && !$$1.gk().e && !this.a(new ebk($$0.q(), $$2, false))) {
         return but.e;
      } else {
         czw $$3 = this.h();
         but $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof but.d $$5 && $$5.c()) {
            $$1.b(axb.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(ebg $$0) {
      return this.h().a(this, $$0);
   }

   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = this.v();
      boolean $$4 = this.a((bxw)$$1) <= 0;
      but $$5 = this.h().a($$0, $$1, $$2);
      return (but)($$4 && $$5 instanceof but.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public daa a(djz $$0, bxw $$1) {
      daa $$2 = this.v();
      daa $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private daa a(bxw $$0, daa $$1) {
      ddh $$2 = $$1.a(kl.x);
      ddg $$3 = $$1.a(kl.y);
      int $$4 = $$1.M();
      daa $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fV(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public va b(ji.a $$0, va $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (va)b.encode(this, $$0.a(uo.a), $$1).getOrThrow();
      }
   }

   public va a(ji.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (va)b.encodeStart($$0.a(uo.a), this).getOrThrow();
      }
   }

   public int k() {
      return this.a(kl.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.c(kl.d) && !this.c(kl.f) && this.c(kl.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azq.a(this.a(kl.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kl.e, Integer.valueOf(azq.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kl.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, aru $$1, @Nullable arv $$2, Consumer<czw> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, aru $$1, @Nullable arv $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fV()) {
         return 0;
      } else {
         return $$0 > 0 ? dgp.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arv $$1, Consumer<czw> $$2) {
      if ($$1 != null) {
         aq.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         czw $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, crz $$1) {
      if ($$1 instanceof arv $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bxw $$1, bxf $$2) {
      if ($$1.dV() instanceof aru $$3) {
         this.a($$0, $$3, $$1 instanceof arv $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public daa a(int $$0, djy $$1, bxw $$2, bxf $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         daa $$4 = this.b($$1, 1);
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

   public boolean a(cxp $$0, cwc $$1, crz $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(daa $$0, cxp $$1, cwc $$2, crz $$3, byn $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bxw $$0, bxw $$1) {
      czw $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kl.B)) {
         if ($$1 instanceof crz $$3) {
            $$3.b(axb.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bxw $$0, bxw $$1) {
      this.h().b(this, $$0, $$1);
      ddi $$2 = this.a(kl.B);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bxf.a);
      }
   }

   public void a(djz $$0, ebg $$1, iw $$2, crz $$3) {
      czw $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(axb.c.b($$4));
      }
   }

   public boolean b(ebg $$0) {
      return this.h().b(this, $$0);
   }

   public but a(crz $$0, bxw $$1, bus $$2) {
      dij $$3 = this.a(kl.D);
      if ($$3 != null && $$3.j()) {
         but $$4 = $$3.a($$0, $$1, this);
         if ($$4 != but.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public daa v() {
      if (this.f()) {
         return k;
      } else {
         daa $$0 = new daa(this.h(), this.p, this.s.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public daa c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         daa $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public daa a(djy $$0) {
      return this.a($$0, this.M());
   }

   public daa a(djy $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private daa b(djy $$0, int $$1) {
      return new daa($$0.h().e(), $$1, this.s.g());
   }

   public static boolean a(daa $$0, daa $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<daa> $$0, List<daa> $$1) {
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

   public static boolean b(daa $$0, daa $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(daa $$0, daa $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.s, $$1.s);
      }
   }

   public static MapCodec<daa> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable daa $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<daa> $$0) {
      int $$1 = 0;

      for (daa $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(djz $$0, bwv $$1, @Nullable bxf $$2) {
      if (this.q > 0) {
         this.q--;
      }

      if ($$0 instanceof aru $$3) {
         this.h().a(this, $$3, $$1, $$2);
      }
   }

   public void a(djz $$0, crz $$1, int $$2) {
      $$1.a(axb.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(djz $$0) {
      this.h().a(this, $$0);
   }

   public int a(bxw $$0) {
      return this.h().a(this, $$0);
   }

   public dac w() {
      return this.h().b(this);
   }

   public void a(djz $$0, bxw $$1, int $$2) {
      daa $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         daa $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fA(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().e_(this);
   }

   @Nullable
   public <T> T b(kk<T> $$0, @Nullable T $$1) {
      return this.s.b($$0, $$1);
   }

   public <T> void a(kk<T> $$0, kg $$1) {
      this.b($$0, $$1.a($$0));
   }

   @Nullable
   public <T, U> T a(kk<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kk<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T e(kk<? extends T> $$0) {
      return this.s.e($$0);
   }

   public void a(kj $$0) {
      kj $$1 = this.s.g();
      this.s.a($$0);
      Optional<Error<daa>> $$2 = a(this).error();
      if ($$2.isPresent()) {
         n.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.s.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kj $$0) {
      this.s.a($$0);
      this.h().l(this);
   }

   public void b(ki $$0) {
      this.s.a($$0);
      this.h().l(this);
   }

   public xc y() {
      xc $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public xc z() {
      xc $$0 = this.a(kl.g);
      if ($$0 != null) {
         return $$0;
      } else {
         ddk $$1 = this.a(kl.V);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bap.h($$2)) {
               return xc.b($$2);
            }
         }

         return null;
      }
   }

   public xc A() {
      return this.h().a(this);
   }

   public xc B() {
      xq $$0 = xc.i().b(this.y()).a(this.D().a());
      if (this.c(kl.g)) {
         $$0.a(o.u);
      }

      return $$0;
   }

   public <T extends ddf> void a(kk<T> $$0, czw.b $$1, dde $$2, Consumer<xc> $$3, dbp $$4) {
      T $$5 = (T)this.a($$0);
      if ($$5 != null && $$2.a($$0)) {
         $$5.a($$1, $$3, $$4, this.s);
      }
   }

   public List<xc> a(czw.b $$0, @Nullable crz $$1, dbp $$2) {
      dde $$3 = this.a(kl.q, dde.c);
      if (!$$2.b() && $$3.a()) {
         boolean $$4 = this.h().a(this, $$1);
         return $$4 ? l : List.of();
      } else {
         List<xc> $$5 = Lists.newArrayList();
         $$5.add(this.B());
         this.a($$0, $$3, $$1, $$2, $$5::add);
         return $$5;
      }
   }

   public void a(czw.b $$0, dde $$1, @Nullable crz $$2, dbp $$3, Consumer<xc> $$4) {
      this.h().a(this, $$0, $$1, $$4, $$3);
      this.a(kl.aC, $$0, $$1, $$4, $$3);
      this.a(kl.ab, $$0, $$1, $$4, $$3);
      this.a(kl.M, $$0, $$1, $$4, $$3);
      this.a(kl.ar, $$0, $$1, $$4, $$3);
      this.a(kl.at, $$0, $$1, $$4, $$3);
      this.a(kl.ap, $$0, $$1, $$4, $$3);
      this.a(kl.am, $$0, $$1, $$4, $$3);
      this.a(kl.ao, $$0, $$1, $$4, $$3);
      this.a(kl.V, $$0, $$1, $$4, $$3);
      this.a(kl.P, $$0, $$1, $$4, $$3);
      this.a(kl.aj, $$0, $$1, $$4, $$3);
      this.a(kl.ai, $$0, $$1, $$4, $$3);
      this.a(kl.R, $$0, $$1, $$4, $$3);
      this.a(kl.ae, $$0, $$1, $$4, $$3);
      this.a(kl.W, $$0, $$1, $$4, $$3);
      this.a(kl.J, $$0, $$1, $$4, $$3);
      this.a(kl.l, $$0, $$1, $$4, $$3);
      this.a(kl.K, $$0, $$1, $$4, $$3);
      this.a(kl.j, $$0, $$1, $$4, $$3);
      this.a($$4, $$1, $$2);
      if (this.c(kl.f) && $$1.a(kl.f)) {
         $$4.accept(m);
      }

      this.a(kl.ad, $$0, $$1, $$4, $$3);
      this.a(kl.T, $$0, $$1, $$4, $$3);
      this.a(kl.aq, $$0, $$1, $$4, $$3);
      if ((this.a(dae.ff) || this.a(dae.zN)) && $$1.a(kl.aa)) {
         dci $$5 = this.a(kl.aa, dci.a);
         dku.a($$5, $$4, "SpawnData");
      }

      cyb $$6 = this.a(kl.n);
      if ($$6 != null && $$1.a(kl.n)) {
         $$4.accept(xb.a);
         $$4.accept(cyb.c);
         $$6.a($$4);
      }

      cyb $$7 = this.a(kl.m);
      if ($$7 != null && $$1.a(kl.m)) {
         $$4.accept(xb.a);
         $$4.accept(cyb.d);
         $$7.a($$4);
      }

      if ($$3.a()) {
         if (this.n() && $$1.a(kl.e)) {
            $$4.accept(xc.a("item.durability", this.p() - this.o(), this.p()));
         }

         $$4.accept(xc.b(mh.g.b(this.h()).toString()).a(o.i));
         int $$8 = this.s.d();
         if ($$8 > 0) {
            $$4.accept(xc.a("item.components", $$8).a(o.i));
         }
      }

      if ($$2 != null && !this.h().a($$2.dV().K())) {
         $$4.accept(o);
      }

      boolean $$9 = this.h().a(this, $$2);
      if ($$9) {
         l.forEach($$4);
      }
   }

   private void a(Consumer<xc> $$0, dde $$1, @Nullable crz $$2) {
      if ($$1.a(kl.o)) {
         for (bxg $$3 : bxg.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xb.a);
                  $$0.accept(xc.c("item.modifiers." + $$3.c()).a(o.h));
                  $$4.setFalse();
               }

               this.a($$0, $$2, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xc> $$0, @Nullable crz $$1, jg<byx> $$2, bza $$3) {
      double $$4 = $$3.b();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(czw.h)) {
            $$4 += $$1.i(bzc.c);
            $$5 = true;
         } else if ($$3.a(czw.i)) {
            $$4 += $$1.i(bzc.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.c() == bza.a.b || $$3.c() == bza.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bzc.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xb.a().b(xc.a("attribute.modifier.equals." + $$3.c().a(), dcr.d.format($$6), xc.c($$2.a().c()))).a(o.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xc.a("attribute.modifier.plus." + $$3.c().a(), dcr.d.format($$6), xc.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xc.a("attribute.modifier.take." + $$3.c().a(), dcr.d.format(-$$6), xc.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kl.t);
      return $$0 != null ? $$0 : this.h().d_(this);
   }

   public daw D() {
      daw $$0 = this.a(kl.k, daw.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> daw.c;
            case c -> daw.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kl.C)) {
         return false;
      } else {
         dgt $$0 = this.a(kl.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jg<dgn> $$0, int $$1) {
      dgp.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kl.l, dgt.a).d();
   }

   public dgt G() {
      return this.a(kl.l, dgt.a);
   }

   public boolean H() {
      return this.t instanceof cnx;
   }

   public void a(@Nullable bwv $$0) {
      if (!this.f()) {
         this.t = $$0;
      }
   }

   @Nullable
   public cnx I() {
      return this.t instanceof cnx ? (cnx)this.J() : null;
   }

   @Nullable
   public bwv J() {
      return !this.f() ? this.t : null;
   }

   public void a(bxg $$0, BiConsumer<jg<byx>, bza> $$1) {
      dcr $$2 = this.a(kl.o, dcr.a);
      $$2.a($$0, $$1);
      dgp.a(this, $$0, $$1);
   }

   public void a(bxf $$0, BiConsumer<jg<byx>, bza> $$1) {
      dcr $$2 = this.a(kl.o, dcr.a);
      $$2.a($$0, $$1);
      dgp.a(this, $$0, $$1);
   }

   public xc K() {
      xq $$0 = xc.i().b(this.y());
      if (this.c(kl.g)) {
         $$0.a(o.u);
      }

      xq $$1 = xf.a((xc)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xi.d(this)));
      }

      return $$1;
   }

   public boolean a(ebk $$0) {
      cyb $$1 = this.a(kl.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(ebk $$0) {
      cyb $$1 = this.a(kl.n);
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

   public void a(int $$0, @Nullable bxw $$1) {
      if ($$1 == null || !$$1.fV()) {
         this.h($$0);
      }
   }

   public daa b(int $$0, @Nullable bxw $$1) {
      daa $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(djz $$0, bxw $$1, int $$2) {
      dcf $$3 = this.a(kl.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(coe $$0) {
      this.h().a($$0);
   }

   public boolean a(bvk $$0) {
      dck $$1 = this.a(kl.z);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(daa $$0) {
      dgv $$1 = this.a(kl.E);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(ebg $$0, djz $$1, iw $$2, crz $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
