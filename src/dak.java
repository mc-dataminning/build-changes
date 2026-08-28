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

public final class dak implements kh {
   private static final List<xg> m = List.of(
      xg.c("item.op_warning.line1").a(o.m, o.r), xg.c("item.op_warning.line2").a(o.m), xg.c("item.op_warning.line3").a(o.m)
   );
   private static final xg n = xg.c("item.unbreakable").a(o.j);
   public static final MapCodec<dak> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     dag.e.fieldOf("id").forGetter(dak::i),
                     azg.a(1, 99).fieldOf("count").orElse(1).forGetter(dak::M),
                     kj.b.optionalFieldOf("components", kj.a).forGetter($$0xx -> $$0xx.t.g())
                  )
                  .apply($$0x, dak::new)
         )
   );
   public static final Codec<dak> b = Codec.lazyInitialized(a::codec);
   public static final Codec<dak> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(dag.e.fieldOf("id").forGetter(dak::i), kj.b.optionalFieldOf("components", kj.a).forGetter($$0x -> $$0x.t.g()))
                  .apply($$0, ($$0x, $$1) -> new dak($$0x, 1, $$1))
         )
   );
   public static final Codec<dak> d = b.validate(dak::a);
   public static final Codec<dak> e = c.validate(dak::a);
   public static final Codec<dak> f = azg.g(b).xmap($$0 -> $$0.orElse(dak.l), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<dak> g = dag.e.xmap(dak::new, dak::i);
   public static final ze<wp, dak> h = b(kj.c);
   public static final ze<wp, dak> i = b(kj.d);
   public static final ze<wp, dak> j = new ze<wp, dak>() {
      public dak a(wp $$0) {
         dak $$1 = dak.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wp $$0, dak $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            dak.h.encode($$0, $$1);
         }
      }
   };
   public static final ze<wp, List<dak>> k = h.a(zc.a(jp::a));
   private static final Logger o = LogUtils.getLogger();
   public static final dak l = new dak((Void)null);
   private static final xg p = xg.c("item.disabled").a(o.m);
   private int q;
   private int r;
   @Deprecated
   @Nullable
   private final dag s;
   final km t;
   @Nullable
   private bxe u;

   public static DataResult<dak> a(dak $$0) {
      DataResult<bbh> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   private static ze<wp, dak> b(final ze<wp, kj> $$0) {
      return new ze<wp, dak>() {
         public dak a(wp $$0x) {
            int $$1 = $$0.l();
            if ($$1 <= 0) {
               return dak.l;
            } else {
               jg<dag> $$2 = dag.f.decode($$0);
               kj $$3 = $$0.decode($$0);
               return new dak($$2, $$1, $$3);
            }
         }

         public void a(wp $$0x, dak $$1) {
            if ($$1.f()) {
               $$0.c(0);
            } else {
               $$0.c($$1.M());
               dag.f.encode($$0, $$1.i());
               $$0.encode($$0, $$1.t.g());
            }
         }
      };
   }

   public static ze<wp, dak> a(final ze<wp, dak> $$0) {
      return new ze<wp, dak>() {
         public dak a(wp $$0x) {
            dak $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alp<bbh> $$2 = $$0.H().a(bab.a);
               dak.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wp $$0x, dak $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cyj> b() {
      return this.h().k(this);
   }

   @Override
   public ki a() {
      return (ki)(!this.f() ? this.t : ki.a);
   }

   public ki c() {
      return !this.f() ? this.h().f() : ki.a;
   }

   public kj d() {
      return !this.f() ? this.t.g() : kj.a;
   }

   public ki e() {
      return !this.f() ? this.t.i() : ki.a;
   }

   public boolean d(kk<?> $$0) {
      return !this.f() && this.t.d($$0);
   }

   public dak(dki $$0) {
      this($$0, 1);
   }

   public dak(jg<dag> $$0) {
      this($$0.a(), 1);
   }

   public dak(jg<dag> $$0, int $$1, kj $$2) {
      this($$0.a(), $$1, km.a($$0.a().f(), $$2));
   }

   public dak(jg<dag> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public dak(dki $$0, int $$1) {
      this($$0, $$1, new km($$0.h().f()));
   }

   private dak(dki $$0, int $$1, km $$2) {
      this.s = $$0.h();
      this.q = $$1;
      this.t = $$2;
      this.h().l(this);
   }

   private dak(@Nullable Void $$0) {
      this.s = null;
      this.t = new km(ki.a);
   }

   public static DataResult<bbh> a(ki $$0) {
      if ($$0.c(kl.d) && $$0.a(kl.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         ddc $$1 = $$0.a(kl.ap, ddc.a);

         for (dak $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bbh.a);
      }
   }

   public static Optional<dak> a(ji.a $$0, va $$1) {
      return b.parse($$0.a(uo.a), $$1).resultOrPartial($$0x -> o.error("Tried to load invalid item: '{}'", $$0x));
   }

   public boolean f() {
      return this == l || this.s == dao.a || this.q <= 0;
   }

   public boolean a(cvs $$0) {
      return this.f() || this.h().a($$0);
   }

   public dak a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      dak $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public dak g() {
      if (this.f()) {
         return l;
      } else {
         dak $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public dag h() {
      return this.f() ? dao.a : this.s;
   }

   public jg<dag> i() {
      return this.h().e();
   }

   public boolean a(ayc<dag> $$0) {
      return this.h().e().a($$0);
   }

   public boolean a(dag $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jg<dag>> $$0) {
      return $$0.test(this.h().e());
   }

   public boolean a(jg<dag> $$0) {
      return this.h().e() == $$0;
   }

   public boolean a(jk<dag> $$0) {
      return $$0.a(this.i());
   }

   public Stream<ayc<dag>> j() {
      return this.h().e().c();
   }

   public bvc a(def $$0) {
      csi $$1 = $$0.o();
      iw $$2 = $$0.a();
      if ($$1 != null && !$$1.gk().e && !this.a(new ebu($$0.q(), $$2, false))) {
         return bvc.e;
      } else {
         dag $$3 = this.h();
         bvc $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bvc.d $$5 && $$5.c()) {
            $$1.b(axi.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(ebq $$0) {
      return this.h().a(this, $$0);
   }

   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = this.v();
      boolean $$4 = this.a((byf)$$1) <= 0;
      bvc $$5 = this.h().a($$0, $$1, $$2);
      return (bvc)($$4 && $$5 instanceof bvc.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public dak a(dkj $$0, byf $$1) {
      dak $$2 = this.v();
      dak $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private dak a(byf $$0, dak $$1) {
      ddr $$2 = $$1.a(kl.x);
      ddq $$3 = $$1.a(kl.y);
      int $$4 = $$1.M();
      dak $$5 = this;
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
      return azz.a(this.a(kl.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kl.e, Integer.valueOf(azz.a($$0, 0, this.p())));
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

   public void a(int $$0, asb $$1, @Nullable asc $$2, Consumer<dag> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, asb $$1, @Nullable asc $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fV()) {
         return 0;
      } else {
         return $$0 > 0 ? dgz.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable asc $$1, Consumer<dag> $$2) {
      if ($$1 != null) {
         aq.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         dag $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, csi $$1) {
      if ($$1 instanceof asc $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, byf $$1, bxo $$2) {
      if ($$1.dV() instanceof asb $$3) {
         this.a($$0, $$3, $$1 instanceof asc $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public dak a(int $$0, dki $$1, byf $$2, bxo $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         dak $$4 = this.b($$1, 1);
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

   public boolean a(cxz $$0, cwl $$1, csi $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(dak $$0, cxz $$1, cwl $$2, csi $$3, byw $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(byf $$0, byf $$1) {
      dag $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kl.B)) {
         if ($$1 instanceof csi $$3) {
            $$3.b(axi.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(byf $$0, byf $$1) {
      this.h().b(this, $$0, $$1);
      dds $$2 = this.a(kl.B);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bxo.a);
      }
   }

   public void a(dkj $$0, ebq $$1, iw $$2, csi $$3) {
      dag $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(axi.c.b($$4));
      }
   }

   public boolean b(ebq $$0) {
      return this.h().b(this, $$0);
   }

   public bvc a(csi $$0, byf $$1, bvb $$2) {
      dit $$3 = this.a(kl.D);
      if ($$3 != null && $$3.j()) {
         bvc $$4 = $$3.a($$0, $$1, this);
         if ($$4 != bvc.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public dak v() {
      if (this.f()) {
         return l;
      } else {
         dak $$0 = new dak(this.h(), this.q, this.t.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public dak c(int $$0) {
      if (this.f()) {
         return l;
      } else {
         dak $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public dak a(dki $$0) {
      return this.a($$0, this.M());
   }

   public dak a(dki $$0, int $$1) {
      return this.f() ? l : this.b($$0, $$1);
   }

   private dak b(dki $$0, int $$1) {
      return new dak($$0.h().e(), $$1, this.t.g());
   }

   public static boolean a(dak $$0, dak $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<dak> $$0, List<dak> $$1) {
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

   public static boolean b(dak $$0, dak $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(dak $$0, dak $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.t, $$1.t);
      }
   }

   public static MapCodec<dak> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable dak $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<dak> $$0) {
      int $$1 = 0;

      for (dak $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dkj $$0, bxe $$1, @Nullable bxo $$2) {
      if (this.r > 0) {
         this.r--;
      }

      if ($$0 instanceof asb $$3) {
         this.h().a(this, $$3, $$1, $$2);
      }
   }

   public void a(dkj $$0, csi $$1, int $$2) {
      $$1.a(axi.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dkj $$0) {
      this.h().a(this, $$0);
   }

   public int a(byf $$0) {
      return this.h().a(this, $$0);
   }

   public dam w() {
      return this.h().b(this);
   }

   public void a(dkj $$0, byf $$1, int $$2) {
      dak $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         dak $$4 = this.a($$1, $$3);
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
      return this.t.b($$0, $$1);
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
      return this.t.e($$0);
   }

   public void a(kj $$0) {
      kj $$1 = this.t.g();
      this.t.a($$0);
      Optional<Error<dak>> $$2 = a(this).error();
      if ($$2.isPresent()) {
         o.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.t.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kj $$0) {
      this.t.a($$0);
      this.h().l(this);
   }

   public void b(ki $$0) {
      this.t.a($$0);
      this.h().l(this);
   }

   public xg y() {
      xg $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public xg z() {
      xg $$0 = this.a(kl.g);
      if ($$0 != null) {
         return $$0;
      } else {
         ddu $$1 = this.a(kl.V);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bay.h($$2)) {
               return xg.b($$2);
            }
         }

         return null;
      }
   }

   public xg A() {
      return this.h().a(this);
   }

   public xg B() {
      xu $$0 = xg.i().b(this.y()).a(this.D().a());
      if (this.c(kl.g)) {
         $$0.a(o.u);
      }

      return $$0;
   }

   public <T extends ddp> void a(kk<T> $$0, dag.b $$1, ddo $$2, Consumer<xg> $$3, dbz $$4) {
      T $$5 = (T)this.a($$0);
      if ($$5 != null && $$2.a($$0)) {
         $$5.a($$1, $$3, $$4, this.t);
      }
   }

   public List<xg> a(dag.b $$0, @Nullable csi $$1, dbz $$2) {
      ddo $$3 = this.a(kl.q, ddo.c);
      if (!$$2.b() && $$3.a()) {
         boolean $$4 = this.h().a(this, $$1);
         return $$4 ? m : List.of();
      } else {
         List<xg> $$5 = Lists.newArrayList();
         $$5.add(this.B());
         this.a($$0, $$3, $$1, $$2, $$5::add);
         return $$5;
      }
   }

   public void a(dag.b $$0, ddo $$1, @Nullable csi $$2, dbz $$3, Consumer<xg> $$4) {
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
         $$4.accept(n);
      }

      this.a(kl.ad, $$0, $$1, $$4, $$3);
      this.a(kl.T, $$0, $$1, $$4, $$3);
      this.a(kl.aq, $$0, $$1, $$4, $$3);
      if ((this.a(dao.ff) || this.a(dao.zN)) && $$1.a(kl.aa)) {
         dcs $$5 = this.a(kl.aa, dcs.a);
         dle.a($$5, $$4, "SpawnData");
      }

      cyl $$6 = this.a(kl.n);
      if ($$6 != null && $$1.a(kl.n)) {
         $$4.accept(xf.a);
         $$4.accept(cyl.c);
         $$6.a($$4);
      }

      cyl $$7 = this.a(kl.m);
      if ($$7 != null && $$1.a(kl.m)) {
         $$4.accept(xf.a);
         $$4.accept(cyl.d);
         $$7.a($$4);
      }

      if ($$3.a()) {
         if (this.n() && $$1.a(kl.e)) {
            $$4.accept(xg.a("item.durability", this.p() - this.o(), this.p()));
         }

         $$4.accept(xg.b(mh.g.b(this.h()).toString()).a(o.i));
         int $$8 = this.t.d();
         if ($$8 > 0) {
            $$4.accept(xg.a("item.components", $$8).a(o.i));
         }
      }

      if ($$2 != null && !this.h().a($$2.dV().K())) {
         $$4.accept(p);
      }

      boolean $$9 = this.h().a(this, $$2);
      if ($$9) {
         m.forEach($$4);
      }
   }

   private void a(Consumer<xg> $$0, ddo $$1, @Nullable csi $$2) {
      if ($$1.a(kl.o)) {
         for (bxp $$3 : bxp.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xf.a);
                  $$0.accept(xg.c("item.modifiers." + $$3.c()).a(o.h));
                  $$4.setFalse();
               }

               this.a($$0, $$2, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xg> $$0, @Nullable csi $$1, jg<bzg> $$2, bzj $$3) {
      double $$4 = $$3.b();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(dag.h)) {
            $$4 += $$1.i(bzl.c);
            $$5 = true;
         } else if ($$3.a(dag.i)) {
            $$4 += $$1.i(bzl.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.c() == bzj.a.b || $$3.c() == bzj.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bzl.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xf.a().b(xg.a("attribute.modifier.equals." + $$3.c().a(), ddb.d.format($$6), xg.c($$2.a().c()))).a(o.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xg.a("attribute.modifier.plus." + $$3.c().a(), ddb.d.format($$6), xg.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xg.a("attribute.modifier.take." + $$3.c().a(), ddb.d.format(-$$6), xg.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kl.t);
      return $$0 != null ? $$0 : this.h().d_(this);
   }

   public dbg D() {
      dbg $$0 = this.a(kl.k, dbg.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> dbg.c;
            case c -> dbg.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kl.C)) {
         return false;
      } else {
         dhd $$0 = this.a(kl.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jg<dgx> $$0, int $$1) {
      dgz.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kl.l, dhd.a).d();
   }

   public dhd G() {
      return this.a(kl.l, dhd.a);
   }

   public boolean H() {
      return this.u instanceof cog;
   }

   public void a(@Nullable bxe $$0) {
      if (!this.f()) {
         this.u = $$0;
      }
   }

   @Nullable
   public cog I() {
      return this.u instanceof cog ? (cog)this.J() : null;
   }

   @Nullable
   public bxe J() {
      return !this.f() ? this.u : null;
   }

   public void a(bxp $$0, BiConsumer<jg<bzg>, bzj> $$1) {
      ddb $$2 = this.a(kl.o, ddb.a);
      $$2.a($$0, $$1);
      dgz.a(this, $$0, $$1);
   }

   public void a(bxo $$0, BiConsumer<jg<bzg>, bzj> $$1) {
      ddb $$2 = this.a(kl.o, ddb.a);
      $$2.a($$0, $$1);
      dgz.a(this, $$0, $$1);
   }

   public xg K() {
      xu $$0 = xg.i().b(this.y());
      if (this.c(kl.g)) {
         $$0.a(o.u);
      }

      xu $$1 = xj.a((xg)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xm.d(this)));
      }

      return $$1;
   }

   public boolean a(ebu $$0) {
      cyl $$1 = this.a(kl.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(ebu $$0) {
      cyl $$1 = this.a(kl.n);
      return $$1 != null && $$1.a($$0);
   }

   public int L() {
      return this.r;
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int M() {
      return this.f() ? 0 : this.q;
   }

   public void e(int $$0) {
      this.q = $$0;
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

   public void a(int $$0, @Nullable byf $$1) {
      if ($$1 == null || !$$1.fV()) {
         this.h($$0);
      }
   }

   public dak b(int $$0, @Nullable byf $$1) {
      dak $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dkj $$0, byf $$1, int $$2) {
      dcp $$3 = this.a(kl.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(coo $$0) {
      this.h().a($$0);
   }

   public boolean a(bvt $$0) {
      dcu $$1 = this.a(kl.z);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(dak $$0) {
      dhf $$1 = this.a(kl.E);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(ebq $$0, dkj $$1, iw $$2, csi $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
