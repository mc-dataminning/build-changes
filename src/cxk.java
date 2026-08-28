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

public final class cxk implements kp {
   public static final Codec<jq<cxg>> a = ma.g
      .r()
      .validate($$0 -> $$0.a(cxo.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cxk> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cxk::i),
                     azn.a(1, 99).fieldOf("count").orElse(1).forGetter(cxk::L),
                     kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cxk::new)
         )
   );
   public static final Codec<cxk> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cxk::i), kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cxk($$0x, 1, $$1))
         )
   );
   public static final Codec<cxk> d = b.validate(cxk::c);
   public static final Codec<cxk> e = c.validate(cxk::c);
   public static final Codec<cxk> f = azn.f(b).xmap($$0 -> $$0.orElse(cxk.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cxk> g = a.xmap(cxk::new, cxk::i);
   public static final zt<xg, cxk> h = new zt<xg, cxk>() {
      private static final zt<xg, jq<cxg>> a = zr.b(mb.K);

      public cxk a(xg $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cxk.k;
         } else {
            jq<cxg> $$2 = a.decode($$0);
            kr $$3 = kr.c.decode($$0);
            return new cxk($$2, $$1, $$3);
         }
      }

      public void a(xg $$0, cxk $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.L());
            a.encode($$0, $$1.i());
            kr.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zt<xg, cxk> i = new zt<xg, cxk>() {
      public cxk a(xg $$0) {
         cxk $$1 = cxk.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(xg $$0, cxk $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cxk.h.encode($$0, $$1);
         }
      }
   };
   public static final zt<xg, List<cxk>> j = h.a(zr.a(jz::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cxk k = new cxk((Void)null);
   private static final xv m = xv.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cxg p;
   final kv q;
   @Nullable
   private bvf r;

   private static DataResult<cxk> c(cxk $$0) {
      DataResult<bbk> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.L() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.L() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zt<xg, cxk> a(final zt<xg, cxk> $$0) {
      return new zt<xg, cxk>() {
         public cxk a(xg $$0x) {
            cxk $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alx<bbk> $$2 = $$0.H().a(bag.a);
               cxk.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(xg $$0x, cxk $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cve> b() {
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

   public cxk(dgz $$0) {
      this($$0, 1);
   }

   public cxk(jq<cxg> $$0) {
      this($$0.a(), 1);
   }

   public cxk(jq<cxg> $$0, int $$1, kr $$2) {
      this($$0.a(), $$1, kv.a($$0.a().g(), $$2));
   }

   public cxk(jq<cxg> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cxk(dgz $$0, int $$1) {
      this($$0, $$1, new kv($$0.j().g()));
   }

   private cxk(dgz $$0, int $$1, kv $$2) {
      this.p = $$0.j();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cxk(@Nullable Void $$0) {
      this.p = null;
      this.q = new kv(kq.a);
   }

   public static DataResult<bbk> a(kq $$0) {
      if ($$0.b(ku.d) && $$0.a(ku.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dac $$1 = $$0.a(ku.al, dac.a);

         for (cxk $$2 : $$1.d()) {
            int $$3 = $$2.L();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bbk.a);
      }
   }

   public static Optional<cxk> a(js.a $$0, vu $$1) {
      return b.parse($$0.a(vl.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cxk a(js.a $$0, ux $$1) {
      return $$1.g() ? k : a($$0, (vu)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cxo.a || this.n <= 0;
   }

   public boolean a(cso $$0) {
      return this.f() || this.h().a($$0);
   }

   public cxk a(int $$0) {
      int $$1 = Math.min($$0, this.L());
      cxk $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cxk g() {
      if (this.f()) {
         return k;
      } else {
         cxk $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cxg h() {
      return this.f() ? cxo.a : this.p;
   }

   public jq<cxg> i() {
      return this.h().f();
   }

   public boolean a(ayk<cxg> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cxg $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jq<cxg>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jq<cxg> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(ju<cxg> $$0) {
      return $$0.a(this.i());
   }

   public Stream<ayk<cxg>> j() {
      return this.h().f().c();
   }

   public bte a(dbd $$0) {
      cps $$1 = $$0.o();
      jh $$2 = $$0.a();
      if ($$1 != null && !$$1.gh().e && !this.a(new dxr($$0.q(), $$2, false))) {
         return bte.e;
      } else {
         cxg $$3 = this.h();
         bte $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bte.d $$5 && $$5.c()) {
            $$1.b(axp.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dxn $$0) {
      return this.h().a(this, $$0);
   }

   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = this.v();
      boolean $$4 = this.a((bwb)$$1) <= 0;
      bte $$5 = this.h().a($$0, $$1, $$2);
      return (bte)($$4 && $$5 instanceof bte.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cxk a(dha $$0, bwb $$1) {
      cxk $$2 = this.v();
      cxk $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cxk a(bwb $$0, cxk $$1) {
      daq $$2 = $$1.a(ku.y);
      dap $$3 = $$1.a(ku.z);
      int $$4 = $$1.L();
      cxk $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fT(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vu b(js.a $$0, vu $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vu)b.encode(this, $$0.a(vl.a), $$1).getOrThrow();
      }
   }

   public vu a(js.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vu)b.encodeStart($$0.a(vl.a), this).getOrThrow();
      }
   }

   public vu b(js.a $$0) {
      return (vu)(this.f() ? new ux() : this.b($$0, new ux()));
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
      return bae.a(this.a(ku.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(ku.e, Integer.valueOf(bae.a($$0, 0, this.p())));
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

   public void a(int $$0, ash $$1, @Nullable asi $$2, Consumer<cxg> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, ash $$1, @Nullable asi $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fT()) {
         return 0;
      } else {
         return $$0 > 0 ? ddt.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable asi $$1, Consumer<cxg> $$2) {
      if ($$1 != null) {
         ao.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cxg $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cps $$1) {
      if ($$1 instanceof asi $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bwb $$1, bvn $$2) {
      if ($$1.dV() instanceof ash $$3) {
         this.a($$0, $$3, $$1 instanceof asi $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cxk a(int $$0, dgz $$1, bwb $$2, bvn $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cxk $$4 = this.b($$1, 1);
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

   public boolean a(cuu $$0, cth $$1, cps $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cxk $$0, cuu $$1, cth $$2, cps $$3, bwt $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bwb $$0, bwb $$1) {
      cxg $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cps $$3) {
            $$3.b(axp.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bwb $$0, bwb $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dha $$0, dxn $$1, jh $$2, cps $$3) {
      cxg $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(axp.c.b($$4));
      }
   }

   public boolean b(dxn $$0) {
      return this.h().b(this, $$0);
   }

   public bte a(cps $$0, bwb $$1, btd $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cxk v() {
      if (this.f()) {
         return k;
      } else {
         cxk $$0 = new cxk(this.h(), this.n, this.q.h());
         $$0.d(this.K());
         return $$0;
      }
   }

   public cxk c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cxk $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cxk a(dgz $$0) {
      return this.a($$0, this.L());
   }

   public cxk a(dgz $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cxk b(dgz $$0, int $$1) {
      return new cxk($$0.j().f(), $$1, this.q.g());
   }

   public static boolean a(cxk $$0, cxk $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.L() != $$1.L() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cxk> $$0, List<cxk> $$1) {
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

   public static boolean b(cxk $$0, cxk $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cxk $$0, cxk $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cxk> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cxk $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cxk> $$0) {
      int $$1 = 0;

      for (cxk $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.L() + " " + this.h();
   }

   public void a(dha $$0, bvf $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dha $$0, cps $$1, int $$2) {
      $$1.a(axp.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dha $$0) {
      this.h().a(this, $$0);
   }

   public int a(bwb $$0) {
      return this.h().a(this, $$0);
   }

   public cxm w() {
      return this.h().b(this);
   }

   public void a(dha $$0, bwb $$1, int $$2) {
      cxk $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cxk $$4 = this.a($$1, $$3);
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
      Optional<Error<cxk>> $$2 = c(this).error();
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

   public xv y() {
      xv $$0 = this.a(ku.g);
      if ($$0 != null) {
         return $$0;
      } else {
         das $$1 = this.a(ku.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bbb.h($$2)) {
               return xv.b($$2);
            }
         }

         return this.z();
      }
   }

   public xv z() {
      return this.h().a(this);
   }

   public xv A() {
      yj $$0 = xv.i().b(this.y()).a(this.C().a());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends dan> void a(kt<T> $$0, cxg.b $$1, Consumer<xv> $$2, czc $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xv> a(cxg.b $$0, @Nullable cps $$1, czc $$2) {
      if (!$$2.b() && this.b(ku.r)) {
         return List.of();
      } else {
         List<xv> $$3 = Lists.newArrayList();
         $$3.add(this.A());
         if (!$$2.a() && !this.b(ku.g)) {
            evh $$4 = this.a(ku.L);
            if ($$4 != null) {
               $$3.add(cxx.a($$4));
            }
         }

         Consumer<xv> $$5 = $$3::add;
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
         cvg $$6 = this.a(ku.n);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xu.a);
            $$5.accept(cvg.c);
            $$6.a($$5);
         }

         cvg $$7 = this.a(ku.m);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xu.a);
            $$5.accept(cvg.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xv.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xv.b(ma.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.q.d();
            if ($$8 > 0) {
               $$3.add(xv.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dV().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xv> $$0, @Nullable cps $$1) {
      dab $$2 = this.a(ku.o, dab.a);
      if ($$2.c()) {
         for (bvo $$3 : bvo.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xu.a);
                  $$0.accept(xv.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xv> $$0, @Nullable cps $$1, jq<bxe> $$2, bxh $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cxg.f)) {
            $$4 += $$1.i(bxj.c);
            $$5 = true;
         } else if ($$3.a(cxg.g)) {
            $$4 += $$1.i(bxj.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bxh.a.b || $$3.d() == bxh.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bxj.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xu.a().b(xv.a("attribute.modifier.equals." + $$3.d().a(), dab.d.format($$6), xv.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xv.a("attribute.modifier.plus." + $$3.d().a(), dab.d.format($$6), xv.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xv.a("attribute.modifier.take." + $$3.d().a(), dab.d.format(-$$6), xv.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean B() {
      Boolean $$0 = this.a(ku.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cyh C() {
      cyh $$0 = this.a(ku.k, cyh.a);
      if (!this.E()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cyh.c;
            case c -> cyh.d;
            default -> $$0;
         };
      }
   }

   public boolean D() {
      if (!this.b(ku.C)) {
         return false;
      } else {
         ddx $$0 = this.a(ku.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jq<ddr> $$0, int $$1) {
      ddt.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean E() {
      return !this.a(ku.l, ddx.a).d();
   }

   public ddx F() {
      return this.a(ku.l, ddx.a);
   }

   public boolean G() {
      return this.r instanceof clp;
   }

   public void a(@Nullable bvf $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public clp H() {
      return this.r instanceof clp ? (clp)this.I() : null;
   }

   @Nullable
   public bvf I() {
      return !this.f() ? this.r : null;
   }

   public void a(bvo $$0, BiConsumer<jq<bxe>, bxh> $$1) {
      dab $$2 = this.a(ku.o, dab.a);
      $$2.a($$0, $$1);
      ddt.a(this, $$0, $$1);
   }

   public void a(bvn $$0, BiConsumer<jq<bxe>, bxh> $$1) {
      dab $$2 = this.a(ku.o, dab.a);
      $$2.a($$0, $$1);
      ddt.a(this, $$0, $$1);
   }

   public xv J() {
      yj $$0 = xv.i().b(this.y());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      yj $$1 = xy.a((xv)$$0);
      if (!this.f()) {
         $$1.a(this.C().a()).a($$0x -> $$0x.a(new yb(yb.a.b, new yb.c(this))));
      }

      return $$1;
   }

   public boolean a(dxr $$0) {
      cvg $$1 = this.a(ku.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dxr $$0) {
      cvg $$1 = this.a(ku.n);
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

   public void a(int $$0, @Nullable bwb $$1) {
      if ($$1 == null || !$$1.fT()) {
         this.h($$0);
      }
   }

   public cxk b(int $$0, @Nullable bwb $$1) {
      cxk $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dha $$0, bwb $$1, int $$2) {
      czq $$3 = this.a(ku.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(clw $$0) {
      this.h().a($$0);
   }

   public axe M() {
      return this.h().a();
   }

   public boolean a(btv $$0) {
      czv $$1 = this.a(ku.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cxk $$0) {
      ddz $$1 = this.a(ku.E);
      return $$1 != null && $$1.a($$0);
   }
}
