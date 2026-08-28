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

public final class cud implements ki {
   public static final Codec<jj<cty>> a = lq.g
      .s()
      .validate($$0 -> $$0.a(cug.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cud> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cud::h),
                     axo.a(1, 99).fieldOf("count").orElse(1).forGetter(cud::H),
                     kk.b.optionalFieldOf("components", kk.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cud::new)
         )
   );
   public static final Codec<cud> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cud::h), kk.b.optionalFieldOf("components", kk.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cud($$0x, 1, $$1))
         )
   );
   public static final Codec<cud> d = b.validate(cud::b);
   public static final Codec<cud> e = c.validate(cud::b);
   public static final Codec<cud> f = axo.e(b).xmap($$0 -> $$0.orElse(cud.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cud> g = a.xmap(cud::new, cud::h);
   public static final ys<wf, cud> h = new ys<wf, cud>() {
      private static final ys<wf, jj<cty>> a = yq.b(lr.K);

      public cud a(wf $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cud.l;
         } else {
            jj<cty> $$2 = a.decode($$0);
            kk $$3 = kk.c.decode($$0);
            return new cud($$2, $$1, $$3);
         }
      }

      public void a(wf $$0, cud $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.H());
            a.encode($$0, $$1.h());
            kk.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final ys<wf, cud> i = new ys<wf, cud>() {
      public cud a(wf $$0) {
         cud $$1 = cud.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wf $$0, cud $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cud.h.encode($$0, $$1);
         }
      }
   };
   public static final ys<wf, List<cud>> j = h.a(yq.a(js::a));
   public static final ys<wf, List<cud>> k = i.a(yq.a(js::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cud l = new cud((Void)null);
   private static final wu n = wu.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cty q;
   final ko r;
   @Nullable
   private bsh s;

   private static DataResult<cud> b(cud $$0) {
      DataResult<azk> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.H() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.H() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static ys<wf, cud> a(final ys<wf, cud> $$0) {
      return new ys<wf, cud>() {
         public cud a(wf $$0x) {
            cud $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               aki<azk> $$2 = $$0.G().a(ayi.a);
               cud.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wf $$0x, cud $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cro> b() {
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

   public cud(dcf $$0) {
      this($$0, 1);
   }

   public cud(jj<cty> $$0) {
      this($$0.a(), 1);
   }

   public cud(jj<cty> $$0, int $$1, kk $$2) {
      this($$0.a(), $$1, ko.a($$0.a().p(), $$2));
   }

   public cud(jj<cty> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cud(dcf $$0, int $$1) {
      this($$0, $$1, new ko($$0.r().p()));
   }

   private cud(dcf $$0, int $$1, ko $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().m(this);
   }

   private cud(@Nullable Void $$0) {
      this.q = null;
      this.r = new ko(kj.a);
   }

   public static DataResult<azk> a(kj $$0) {
      if ($$0.b(kn.d) && $$0.a(kn.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cwy $$1 = $$0.a(kn.aa, cwy.a);

         for (cud $$2 : $$1.d()) {
            int $$3 = $$2.H();
            int $$4 = $$2.j();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(azk.a);
      }
   }

   public static Optional<cud> a(jl.a $$0, uu $$1) {
      return b.parse($$0.a(ul.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cud a(jl.a $$0, tx $$1) {
      return $$1.g() ? l : a($$0, (uu)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cug.a || this.o <= 0;
   }

   public boolean a(coz $$0) {
      return this.e() || this.g().a($$0);
   }

   public cud a(int $$0) {
      int $$1 = Math.min($$0, this.H());
      cud $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cud f() {
      if (this.e()) {
         return l;
      } else {
         cud $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public cty g() {
      return this.e() ? cug.a : this.q;
   }

   public jj<cty> h() {
      return this.g().o();
   }

   public boolean a(awm<cty> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(cty $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<jj<cty>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(jj<cty> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jn<cty> $$0) {
      return $$0.a(this.h());
   }

   public Stream<awm<cty>> i() {
      return this.g().o().c();
   }

   public bqh a(cxp $$0) {
      cml $$1 = $$0.o();
      ja $$2 = $$0.a();
      if ($$1 != null && !$$1.gb().e && !this.a(new dsp($$0.q(), $$2, false))) {
         return bqh.e;
      } else {
         cty $$3 = this.g();
         bqh $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avr.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dsl $$0) {
      return this.g().a(this, $$0);
   }

   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cud a(dcg $$0, btc $$1) {
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

   public void a(int $$0, aqm $$1, @Nullable aqn $$2, Consumer<cty> $$3) {
      if (this.l()) {
         if ($$0 > 0) {
            $$0 = czo.a($$1, this, $$0);
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
            cty $$5 = this.g();
            this.h(1);
            $$3.accept($$5);
         }
      }
   }

   public void a(int $$0, btc $$1, bso $$2) {
      if ($$1.dR() instanceof aqm $$3 && !$$1.fN()) {
         this.a($$0, $$3, $$1 instanceof aqn $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
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

   public boolean a(cre $$0, cpr $$1, cml $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cud $$0, cre $$1, cpr $$2, cml $$3, btu $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(btc $$0, cml $$1) {
      cty $$2 = this.g();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avr.c.b($$2));
         return true;
      } else {
         return false;
      }
   }

   public void b(btc $$0, cml $$1) {
      this.g().b(this, $$0, $$1);
   }

   public void a(dcg $$0, dsl $$1, ja $$2, cml $$3) {
      cty $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avr.c.b($$4));
      }
   }

   public boolean b(dsl $$0) {
      return this.g().b(this, $$0);
   }

   public bqh a(cml $$0, btc $$1, bqg $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cud s() {
      if (this.e()) {
         return l;
      } else {
         cud $$0 = new cud(this.g(), this.o, this.r.g());
         $$0.d(this.G());
         return $$0;
      }
   }

   public cud c(int $$0) {
      if (this.e()) {
         return l;
      } else {
         cud $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cud a(dcf $$0) {
      return this.a($$0, this.H());
   }

   public cud a(dcf $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   public cud b(dcf $$0, int $$1) {
      return new cud($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cud $$0, cud $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.H() != $$1.H() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cud> $$0, List<cud> $$1) {
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

   public static boolean b(cud $$0, cud $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cud $$0, cud $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cud> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cud $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cud> $$0) {
      int $$1 = 0;

      for (cud $$2 : $$0) {
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

   public void a(dcg $$0, bsh $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dcg $$0, cml $$1, int $$2) {
      $$1.a(avr.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dcg $$0) {
      this.g().a(this, $$0);
   }

   public int a(btc $$0) {
      return this.g().a(this, $$0);
   }

   public cvy u() {
      return this.g().b(this);
   }

   public void a(dcg $$0, btc $$1, int $$2) {
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
      Optional<Error<cud>> $$2 = b(this).error();
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

   private <T extends cxi> void a(km<T> $$0, cty.b $$1, Consumer<wu> $$2, cvw $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wu> a(cty.b $$0, @Nullable cml $$1, cvw $$2) {
      if (!$$2.b() && this.b(kn.q)) {
         return List.of();
      } else {
         List<wu> $$3 = Lists.newArrayList();
         xi $$4 = wu.i().b(this.w()).a(this.y().a());
         if (this.b(kn.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kn.g) && this.a(cug.rU)) {
            epw $$5 = this.a(kn.B);
            if ($$5 != null) {
               $$3.add(cul.a($$5));
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
         crq $$7 = this.a(kn.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wt.a);
            $$6.accept(crq.c);
            $$7.a($$6);
         }

         crq $$8 = this.a(kn.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wt.a);
            $$6.accept(crq.d);
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

         if ($$1 != null && !this.g().a($$1.dR().J())) {
            $$3.add(n);
         }

         return $$3;
      }
   }

   private void a(Consumer<wu> $$0, @Nullable cml $$1) {
      cwx $$2 = this.a(kn.n, cwx.a);
      if ($$2.c()) {
         for (bsp $$3 : bsp.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wt.a);
                  $$0.accept(wu.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wu> $$0, @Nullable cml $$1, jj<buf> $$2, bui $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == cty.e) {
            $$4 += $$1.h(buk.c);
            $$5 = true;
         } else if ($$3.b() == cty.f) {
            $$4 += $$1.h(buk.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == bui.a.b || $$3.e() == bui.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(buk.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wt.a().b(wu.a("attribute.modifier.equals." + $$3.e().a(), cwx.d.format($$6), wu.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wu.a("attribute.modifier.plus." + $$3.e().a(), cwx.d.format($$6), wu.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wu.a("attribute.modifier.take." + $$3.e().a(), cwx.d.format(-$$6), wu.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(kn.t);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cux y() {
      cux $$0 = this.a(kn.j, cux.a);
      if (!this.A()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cux.c;
            case c -> cux.d;
            default -> $$0;
         };
      }
   }

   public boolean z() {
      if (!this.g().a(this)) {
         return false;
      } else {
         czs $$0 = this.a(kn.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jj<czm> $$0, int $$1) {
      czo.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(kn.k, czs.a).d();
   }

   public czs B() {
      return this.a(kn.k, czs.a);
   }

   public boolean C() {
      return this.s instanceof cio;
   }

   public void a(@Nullable bsh $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public cio D() {
      return this.s instanceof cio ? (cio)this.E() : null;
   }

   @Nullable
   public bsh E() {
      return !this.e() ? this.s : null;
   }

   public void a(bsp $$0, BiConsumer<jj<buf>, bui> $$1) {
      cwx $$2 = this.a(kn.n, cwx.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      czo.a(this, $$0, $$1);
   }

   public void a(bso $$0, BiConsumer<jj<buf>, bui> $$1) {
      cwx $$2 = this.a(kn.n, cwx.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      czo.a(this, $$0, $$1);
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

   public boolean a(dsp $$0) {
      crq $$1 = this.a(kn.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dsp $$0) {
      crq $$1 = this.a(kn.m);
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

   public void a(int $$0, @Nullable btc $$1) {
      if ($$1 == null || !$$1.fN()) {
         this.h($$0);
      }
   }

   public cud b(int $$0, @Nullable btc $$1) {
      cud $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dcg $$0, btc $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(civ $$0) {
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

   public boolean a(bra $$0) {
      return !this.b(kn.w) || !$$0.a(avy.j);
   }
}
