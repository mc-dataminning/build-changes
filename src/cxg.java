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

public final class cxg implements kp {
   public static final Codec<cxg> a = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     cxc.e.fieldOf("id").forGetter(cxg::i),
                     azd.a(1, 99).fieldOf("count").orElse(1).forGetter(cxg::M),
                     kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.p.g())
                  )
                  .apply($$0, cxg::new)
         )
   );
   public static final Codec<cxg> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(cxc.e.fieldOf("id").forGetter(cxg::i), kr.b.optionalFieldOf("components", kr.a).forGetter($$0x -> $$0x.p.g()))
                  .apply($$0, ($$0x, $$1) -> new cxg($$0x, 1, $$1))
         )
   );
   public static final Codec<cxg> c = a.validate(cxg::c);
   public static final Codec<cxg> d = b.validate(cxg::c);
   public static final Codec<cxg> e = azd.f(a).xmap($$0 -> $$0.orElse(cxg.j), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cxg> f = cxc.e.xmap(cxg::new, cxg::i);
   public static final zi<wv, cxg> g = new zi<wv, cxg>() {
      private static final zi<wv, jq<cxc>> a = zg.b(mb.K);

      public cxg a(wv $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cxg.j;
         } else {
            jq<cxc> $$2 = a.decode($$0);
            kr $$3 = kr.c.decode($$0);
            return new cxg($$2, $$1, $$3);
         }
      }

      public void a(wv $$0, cxg $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            a.encode($$0, $$1.i());
            kr.c.encode($$0, $$1.p.g());
         }
      }
   };
   public static final zi<wv, cxg> h = new zi<wv, cxg>() {
      public cxg a(wv $$0) {
         cxg $$1 = cxg.g.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wv $$0, cxg $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cxg.g.encode($$0, $$1);
         }
      }
   };
   public static final zi<wv, List<cxg>> i = g.a(zg.a(jz::a));
   private static final Logger k = LogUtils.getLogger();
   public static final cxg j = new cxg((Void)null);
   private static final xk l = xk.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final cxc o;
   final kv p;
   @Nullable
   private bvb q;

   private static DataResult<cxg> c(cxg $$0) {
      DataResult<bba> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zi<wv, cxg> a(final zi<wv, cxg> $$0) {
      return new zi<wv, cxg>() {
         public cxg a(wv $$0x) {
            cxg $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               aln<bba> $$2 = $$0.H().a(azw.a);
               cxg.a.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wv $$0x, cxg $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cva> b() {
      return this.h().k(this);
   }

   @Override
   public kq a() {
      return (kq)(!this.f() ? this.p : kq.a);
   }

   public void c() {
      this.p.f();
   }

   public kq d() {
      return !this.f() ? this.h().g() : kq.a;
   }

   public kr e() {
      return !this.f() ? this.p.g() : kr.a;
   }

   public cxg(dgy $$0) {
      this($$0, 1);
   }

   public cxg(jq<cxc> $$0) {
      this($$0.a(), 1);
   }

   public cxg(jq<cxc> $$0, int $$1, kr $$2) {
      this($$0.a(), $$1, kv.a($$0.a().g(), $$2));
   }

   public cxg(jq<cxc> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cxg(dgy $$0, int $$1) {
      this($$0, $$1, new kv($$0.j().g()));
   }

   private cxg(dgy $$0, int $$1, kv $$2) {
      this.o = $$0.j();
      this.m = $$1;
      this.p = $$2;
      this.h().l(this);
   }

   private cxg(@Nullable Void $$0) {
      this.o = null;
      this.p = new kv(kq.a);
   }

   public static DataResult<bba> a(kq $$0) {
      if ($$0.b(ku.d) && $$0.a(ku.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         czy $$1 = $$0.a(ku.al, czy.a);

         for (cxg $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bba.a);
      }
   }

   public static Optional<cxg> a(js.a $$0, vj $$1) {
      return a.parse($$0.a(va.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cxg a(js.a $$0, um $$1) {
      return $$1.g() ? j : a($$0, (vj)$$1).orElse(j);
   }

   public boolean f() {
      return this == j || this.o == cxk.a || this.m <= 0;
   }

   public boolean a(csk $$0) {
      return this.f() || this.h().a($$0);
   }

   public cxg a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      cxg $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cxg g() {
      if (this.f()) {
         return j;
      } else {
         cxg $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public cxc h() {
      return this.f() ? cxk.a : this.o;
   }

   public jq<cxc> i() {
      return this.h().f();
   }

   public boolean a(aya<cxc> $$0) {
      return this.h().f().a($$0);
   }

   public boolean a(cxc $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jq<cxc>> $$0) {
      return $$0.test(this.h().f());
   }

   public boolean a(jq<cxc> $$0) {
      return this.h().f() == $$0;
   }

   public boolean a(ju<cxc> $$0) {
      return $$0.a(this.i());
   }

   public Stream<aya<cxc>> j() {
      return this.h().f().c();
   }

   public bta a(daz $$0) {
      cpo $$1 = $$0.o();
      jh $$2 = $$0.a();
      if ($$1 != null && !$$1.gj().e && !this.a(new dxs($$0.q(), $$2, false))) {
         return bta.e;
      } else {
         cxc $$3 = this.h();
         bta $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bta.d $$5 && $$5.c()) {
            $$1.b(axf.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dxo $$0) {
      return this.h().a(this, $$0);
   }

   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = this.v();
      boolean $$4 = this.a((bvx)$$1) <= 0;
      bta $$5 = this.h().a($$0, $$1, $$2);
      return (bta)($$4 && $$5 instanceof bta.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cxg a(dgz $$0, bvx $$1) {
      cxg $$2 = this.v();
      cxg $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cxg a(bvx $$0, cxg $$1) {
      dam $$2 = $$1.a(ku.y);
      dal $$3 = $$1.a(ku.z);
      int $$4 = $$1.M();
      cxg $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fV(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vj b(js.a $$0, vj $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vj)a.encode(this, $$0.a(va.a), $$1).getOrThrow();
      }
   }

   public vj a(js.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vj)a.encodeStart($$0.a(va.a), this).getOrThrow();
      }
   }

   public vj b(js.a $$0) {
      return (vj)(this.f() ? new um() : this.b($$0, new um()));
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
      return azu.a(this.a(ku.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(ku.e, Integer.valueOf(azu.a($$0, 0, this.p())));
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

   public void a(int $$0, arx $$1, @Nullable ary $$2, Consumer<cxc> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arx $$1, @Nullable ary $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fV()) {
         return 0;
      } else {
         return $$0 > 0 ? dds.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable ary $$1, Consumer<cxc> $$2) {
      if ($$1 != null) {
         ao.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cxc $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cpo $$1) {
      if ($$1 instanceof ary $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bvx $$1, bvj $$2) {
      if ($$1.dW() instanceof arx $$3) {
         this.a($$0, $$3, $$1 instanceof ary $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cxg a(int $$0, dgy $$1, bvx $$2, bvj $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cxg $$4 = this.b($$1, 1);
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

   public boolean a(cuq $$0, ctd $$1, cpo $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cxg $$0, cuq $$1, ctd $$2, cpo $$3, bwp $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bvx $$0, bvx $$1) {
      cxc $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cpo $$3) {
            $$3.b(axf.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bvx $$0, bvx $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dgz $$0, dxo $$1, jh $$2, cpo $$3) {
      cxc $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(axf.c.b($$4));
      }
   }

   public boolean b(dxo $$0) {
      return this.h().b(this, $$0);
   }

   public bta a(cpo $$0, bvx $$1, bsz $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cxg v() {
      if (this.f()) {
         return j;
      } else {
         cxg $$0 = new cxg(this.h(), this.m, this.p.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public cxg c(int $$0) {
      if (this.f()) {
         return j;
      } else {
         cxg $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public cxg a(dgy $$0) {
      return this.a($$0, this.M());
   }

   public cxg a(dgy $$0, int $$1) {
      return this.f() ? j : this.b($$0, $$1);
   }

   private cxg b(dgy $$0, int $$1) {
      return new cxg($$0.j().f(), $$1, this.p.g());
   }

   public static boolean a(cxg $$0, cxg $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cxg> $$0, List<cxg> $$1) {
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

   public static boolean b(cxg $$0, cxg $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cxg $$0, cxg $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<cxg> a(String $$0) {
      return a.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(j), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cxg $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cxg> $$0) {
      int $$1 = 0;

      for (cxg $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dgz $$0, bvb $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dgz $$0, cpo $$1, int $$2) {
      $$1.a(axf.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(dgz $$0) {
      this.h().a(this, $$0);
   }

   public int a(bvx $$0) {
      return this.h().a(this, $$0);
   }

   public cxi w() {
      return this.h().b(this);
   }

   public void a(dgz $$0, bvx $$1, int $$2) {
      cxg $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cxg $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fA(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().d_(this);
   }

   @Nullable
   public <T> T b(kt<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
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
      return this.p.d($$0);
   }

   public void a(kr $$0) {
      kr $$1 = this.p.g();
      this.p.a($$0);
      Optional<Error<cxg>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         k.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.p.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kr $$0) {
      this.p.a($$0);
      this.h().l(this);
   }

   public void b(kq $$0) {
      this.p.a($$0);
      this.h().l(this);
   }

   public xk y() {
      xk $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public xk z() {
      xk $$0 = this.a(ku.g);
      if ($$0 != null) {
         return $$0;
      } else {
         dao $$1 = this.a(ku.T);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bar.h($$2)) {
               return xk.b($$2);
            }
         }

         return null;
      }
   }

   public xk A() {
      return this.h().a(this);
   }

   public xk B() {
      xy $$0 = xk.i().b(this.y()).a(this.D().a());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends daj> void a(kt<T> $$0, cxc.b $$1, Consumer<xk> $$2, cyy $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xk> a(cxc.b $$0, @Nullable cpo $$1, cyy $$2) {
      if (!$$2.b() && this.b(ku.r)) {
         return List.of();
      } else {
         List<xk> $$3 = Lists.newArrayList();
         $$3.add(this.B());
         if (!$$2.a() && !this.b(ku.g)) {
            evi $$4 = this.a(ku.L);
            if ($$4 != null) {
               $$3.add(cxt.a($$4));
            }
         }

         Consumer<xk> $$5 = $$3::add;
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
         cvc $$6 = this.a(ku.n);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xj.a);
            $$5.accept(cvc.c);
            $$6.a($$5);
         }

         cvc $$7 = this.a(ku.m);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xj.a);
            $$5.accept(cvc.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xk.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xk.b(ma.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.p.d();
            if ($$8 > 0) {
               $$3.add(xk.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dW().K())) {
            $$3.add(l);
         }

         return $$3;
      }
   }

   private void a(Consumer<xk> $$0, @Nullable cpo $$1) {
      czx $$2 = this.a(ku.o, czx.a);
      if ($$2.c()) {
         for (bvk $$3 : bvk.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xj.a);
                  $$0.accept(xk.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xk> $$0, @Nullable cpo $$1, jq<bxa> $$2, bxd $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cxc.g)) {
            $$4 += $$1.i(bxf.c);
            $$5 = true;
         } else if ($$3.a(cxc.h)) {
            $$4 += $$1.i(bxf.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bxd.a.b || $$3.d() == bxd.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bxf.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xj.a().b(xk.a("attribute.modifier.equals." + $$3.d().a(), czx.d.format($$6), xk.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xk.a("attribute.modifier.plus." + $$3.d().a(), czx.d.format($$6), xk.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xk.a("attribute.modifier.take." + $$3.d().a(), czx.d.format(-$$6), xk.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(ku.u);
      return $$0 != null ? $$0 : this.h().c_(this);
   }

   public cyd D() {
      cyd $$0 = this.a(ku.k, cyd.a);
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
      if (!this.b(ku.C)) {
         return false;
      } else {
         ddw $$0 = this.a(ku.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jq<ddq> $$0, int $$1) {
      dds.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(ku.l, ddw.a).d();
   }

   public ddw G() {
      return this.a(ku.l, ddw.a);
   }

   public boolean H() {
      return this.q instanceof cll;
   }

   public void a(@Nullable bvb $$0) {
      if (!this.f()) {
         this.q = $$0;
      }
   }

   @Nullable
   public cll I() {
      return this.q instanceof cll ? (cll)this.J() : null;
   }

   @Nullable
   public bvb J() {
      return !this.f() ? this.q : null;
   }

   public void a(bvk $$0, BiConsumer<jq<bxa>, bxd> $$1) {
      czx $$2 = this.a(ku.o, czx.a);
      $$2.a($$0, $$1);
      dds.a(this, $$0, $$1);
   }

   public void a(bvj $$0, BiConsumer<jq<bxa>, bxd> $$1) {
      czx $$2 = this.a(ku.o, czx.a);
      $$2.a($$0, $$1);
      dds.a(this, $$0, $$1);
   }

   public xk K() {
      xy $$0 = xk.i().b(this.y());
      if (this.b(ku.g)) {
         $$0.a(n.u);
      }

      xy $$1 = xn.a((xk)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xq(xq.a.b, new xq.c(this))));
      }

      return $$1;
   }

   public boolean a(dxs $$0) {
      cvc $$1 = this.a(ku.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dxs $$0) {
      cvc $$1 = this.a(ku.n);
      return $$1 != null && $$1.a($$0);
   }

   public int L() {
      return this.n;
   }

   public void d(int $$0) {
      this.n = $$0;
   }

   public int M() {
      return this.f() ? 0 : this.m;
   }

   public void e(int $$0) {
      this.m = $$0;
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

   public void a(int $$0, @Nullable bvx $$1) {
      if ($$1 == null || !$$1.fV()) {
         this.h($$0);
      }
   }

   public cxg b(int $$0, @Nullable bvx $$1) {
      cxg $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dgz $$0, bvx $$1, int $$2) {
      czm $$3 = this.a(ku.x);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dZ(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cls $$0) {
      this.h().a($$0);
   }

   public awu N() {
      return this.h().a();
   }

   public boolean a(btr $$0) {
      czr $$1 = this.a(ku.A);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean b(cxg $$0) {
      ddy $$1 = this.a(ku.E);
      return $$1 != null && $$1.a($$0);
   }
}
