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

public final class cvl implements km {
   public static final Codec<jn<cvg>> a = lu.g
      .r()
      .validate($$0 -> $$0.a(cvo.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cvl> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cvl::i),
                     ayl.a(1, 99).fieldOf("count").orElse(1).forGetter(cvl::J),
                     ko.b.optionalFieldOf("components", ko.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cvl::new)
         )
   );
   public static final Codec<cvl> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cvl::i), ko.b.optionalFieldOf("components", ko.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cvl($$0x, 1, $$1))
         )
   );
   public static final Codec<cvl> d = b.validate(cvl::c);
   public static final Codec<cvl> e = c.validate(cvl::c);
   public static final Codec<cvl> f = ayl.e(b).xmap($$0 -> $$0.orElse(cvl.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cvl> g = a.xmap(cvl::new, cvl::i);
   public static final zb<wo, cvl> h = new zb<wo, cvl>() {
      private static final zb<wo, jn<cvg>> a = yz.b(lv.K);

      public cvl a(wo $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cvl.k;
         } else {
            jn<cvg> $$2 = a.decode($$0);
            ko $$3 = ko.c.decode($$0);
            return new cvl($$2, $$1, $$3);
         }
      }

      public void a(wo $$0, cvl $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.J());
            a.encode($$0, $$1.i());
            ko.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zb<wo, cvl> i = new zb<wo, cvl>() {
      public cvl a(wo $$0) {
         cvl $$1 = cvl.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wo $$0, cvl $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cvl.h.encode($$0, $$1);
         }
      }
   };
   public static final zb<wo, List<cvl>> j = h.a(yz.a(jw::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cvl k = new cvl((Void)null);
   private static final xd m = xd.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cvg p;
   final ks q;
   @Nullable
   private btj r;

   private static DataResult<cvl> c(cvl $$0) {
      DataResult<bah> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.J() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.J() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zb<wo, cvl> a(final zb<wo, cvl> $$0) {
      return new zb<wo, cvl>() {
         public cvl a(wo $$0x) {
            cvl $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               akz<bah> $$2 = $$0.H().a(aze.a);
               cvl.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wo $$0x, cvl $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<csx> b() {
      return this.h().k(this);
   }

   @Override
   public kn a() {
      return (kn)(!this.f() ? this.q : kn.a);
   }

   public void c() {
      this.q.f();
   }

   public kn d() {
      return !this.f() ? this.h().p() : kn.a;
   }

   public ko e() {
      return !this.f() ? this.q.g() : ko.a;
   }

   public cvl(ddr $$0) {
      this($$0, 1);
   }

   public cvl(jn<cvg> $$0) {
      this($$0.a(), 1);
   }

   public cvl(jn<cvg> $$0, int $$1, ko $$2) {
      this($$0.a(), $$1, ks.a($$0.a().p(), $$2));
   }

   public cvl(jn<cvg> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cvl(ddr $$0, int $$1) {
      this($$0, $$1, new ks($$0.r().p()));
   }

   private cvl(ddr $$0, int $$1, ks $$2) {
      this.p = $$0.r();
      this.n = $$1;
      this.q = $$2;
      this.h().m(this);
   }

   private cvl(@Nullable Void $$0) {
      this.p = null;
      this.q = new ks(kn.a);
   }

   public static DataResult<bah> a(kn $$0) {
      if ($$0.b(kr.d) && $$0.a(kr.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cyh $$1 = $$0.a(kr.ad, cyh.a);

         for (cvl $$2 : $$1.d()) {
            int $$3 = $$2.J();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bah.a);
      }
   }

   public static Optional<cvl> a(jp.a $$0, vc $$1) {
      return b.parse($$0.a(ut.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cvl a(jp.a $$0, uf $$1) {
      return $$1.g() ? k : a($$0, (vc)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cvo.a || this.n <= 0;
   }

   public boolean a(cqh $$0) {
      return this.f() || this.h().a($$0);
   }

   public cvl a(int $$0) {
      int $$1 = Math.min($$0, this.J());
      cvl $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cvl g() {
      if (this.f()) {
         return k;
      } else {
         cvl $$0 = this.u();
         this.e(0);
         return $$0;
      }
   }

   public cvg h() {
      return this.f() ? cvo.a : this.p;
   }

   public jn<cvg> i() {
      return this.h().o();
   }

   public boolean a(axi<cvg> $$0) {
      return this.h().o().a($$0);
   }

   public boolean a(cvg $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jn<cvg>> $$0) {
      return $$0.test(this.h().o());
   }

   public boolean a(jn<cvg> $$0) {
      return this.h().o() == $$0;
   }

   public boolean a(jr<cvg> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axi<cvg>> j() {
      return this.h().o().c();
   }

   public brk a(cyy $$0) {
      cnp $$1 = $$0.o();
      je $$2 = $$0.a();
      if ($$1 != null && !$$1.gd().e && !this.a(new due($$0.q(), $$2, false))) {
         return brk.e;
      } else {
         cvg $$3 = this.h();
         brk $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof brk.d $$5 && $$5.c()) {
            $$1.b(awn.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dua $$0) {
      return this.h().a(this, $$0);
   }

   public brk a(dds $$0, cnp $$1, brj $$2) {
      return this.h().a($$0, $$1, $$2);
   }

   public cvl a(dds $$0, buf $$1) {
      return this.h().a(this, $$0, $$1);
   }

   public vc b(jp.a $$0, vc $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vc)b.encode(this, $$0.a(ut.a), $$1).getOrThrow();
      }
   }

   public vc a(jp.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vc)b.encodeStart($$0.a(ut.a), this).getOrThrow();
      }
   }

   public vc b(jp.a $$0) {
      return (vc)(this.f() ? new uf() : this.b($$0, new uf()));
   }

   public int k() {
      return this.a(kr.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.b(kr.d) && !this.b(kr.f) && this.b(kr.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azc.a(this.a(kr.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kr.e, Integer.valueOf(azc.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kr.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public void a(int $$0, arg $$1, @Nullable arh $$2, Consumer<cvg> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 > 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arg $$1, @Nullable arh $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fP()) {
         return 0;
      } else {
         return $$0 > 0 ? day.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable arh $$1, Consumer<cvg> $$2) {
      if ($$1 != null) {
         an.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cvg $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cnp $$1) {
      if ($$1 instanceof arh $$2) {
         int $$3 = this.a($$0, $$2.B(), $$2);
         if ($$3 <= 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, buf $$1, btr $$2) {
      if ($$1.dS() instanceof arg $$3) {
         this.a($$0, $$3, $$1 instanceof arh $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cvl a(int $$0, ddr $$1, buf $$2, btr $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cvl $$4 = this.b($$1, 1);
         if ($$4.m()) {
            $$4.b(0);
         }

         return $$4;
      } else {
         return this;
      }
   }

   public boolean r() {
      return this.h().d(this);
   }

   public int s() {
      return this.h().e(this);
   }

   public int t() {
      return this.h().f(this);
   }

   public boolean a(csn $$0, cra $$1, cnp $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cvl $$0, csn $$1, cra $$2, cnp $$3, buw $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(buf $$0, buf $$1) {
      cvg $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cnp $$3) {
            $$3.b(awn.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(buf $$0, buf $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dds $$0, dua $$1, je $$2, cnp $$3) {
      cvg $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awn.c.b($$4));
      }
   }

   public boolean b(dua $$0) {
      return this.h().b(this, $$0);
   }

   public brk a(cnp $$0, buf $$1, brj $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cvl u() {
      if (this.f()) {
         return k;
      } else {
         cvl $$0 = new cvl(this.h(), this.n, this.q.h());
         $$0.d(this.I());
         return $$0;
      }
   }

   public cvl c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cvl $$1 = this.u();
         $$1.e($$0);
         return $$1;
      }
   }

   public cvl a(ddr $$0) {
      return this.a($$0, this.J());
   }

   public cvl a(ddr $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cvl b(ddr $$0, int $$1) {
      return new cvl($$0.r().o(), $$1, this.q.g());
   }

   public static boolean a(cvl $$0, cvl $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.J() != $$1.J() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cvl> $$0, List<cvl> $$1) {
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

   public static boolean b(cvl $$0, cvl $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cvl $$0, cvl $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cvl> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cvl $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cvl> $$0) {
      int $$1 = 0;

      for (cvl $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String v() {
      return this.h().d_(this);
   }

   @Override
   public String toString() {
      return this.J() + " " + this.h();
   }

   public void a(dds $$0, btj $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dds $$0, cnp $$1, int $$2) {
      $$1.a(awn.b.b(this.h()), $$2);
      this.h().b(this, $$0, $$1);
   }

   public void a(dds $$0) {
      this.h().a(this, $$0);
   }

   public int a(buf $$0) {
      return this.h().a(this, $$0);
   }

   public cxh w() {
      return this.h().b(this);
   }

   public void a(dds $$0, buf $$1, int $$2) {
      this.h().a(this, $$0, $$1, $$2);
   }

   public boolean x() {
      return this.h().l(this);
   }

   @Nullable
   public <T> T b(kq<? super T> $$0, @Nullable T $$1) {
      return this.q.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kq<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kq<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kq<? extends T> $$0) {
      return this.q.d($$0);
   }

   public void a(ko $$0) {
      ko $$1 = this.q.g();
      this.q.a($$0);
      Optional<Error<cvl>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         l.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.q.b($$1);
      } else {
         this.h().m(this);
      }
   }

   public void b(ko $$0) {
      this.q.a($$0);
      this.h().m(this);
   }

   public void b(kn $$0) {
      this.q.a($$0);
      this.h().m(this);
   }

   public xd y() {
      cyu $$0 = this.a(kr.L);
      if ($$0 != null) {
         String $$1 = $$0.d().a();
         if (!azz.h($$1)) {
            return xd.b($$1);
         }
      }

      xd $$2 = this.a(kr.g);
      if ($$2 != null) {
         return $$2;
      } else {
         xd $$3 = this.a(kr.h);
         return $$3 != null ? $$3 : this.h().n(this);
      }
   }

   private <T extends cyr> void a(kq<T> $$0, cvg.b $$1, Consumer<xd> $$2, cxf $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xd> a(cvg.b $$0, @Nullable cnp $$1, cxf $$2) {
      if (!$$2.b() && this.b(kr.q)) {
         return List.of();
      } else {
         List<xd> $$3 = Lists.newArrayList();
         xr $$4 = xd.i().b(this.y()).a(this.A().a());
         if (this.b(kr.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kr.g) && this.a(cvo.rV)) {
            ert $$5 = this.a(kr.D);
            if ($$5 != null) {
               $$3.add(cvx.a($$5));
            }
         }

         Consumer<xd> $$6 = $$3::add;
         if (!this.b(kr.p)) {
            this.h().a(this, $$0, $$3, $$2);
         }

         this.a(kr.T, $$0, $$6, $$2);
         this.a(kr.M, $$0, $$6, $$2);
         this.a(kr.A, $$0, $$6, $$2);
         this.a(kr.k, $$0, $$6, $$2);
         this.a(kr.B, $$0, $$6, $$2);
         this.a(kr.i, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kr.f, $$0, $$6, $$2);
         csz $$7 = this.a(kr.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(xc.a);
            $$6.accept(csz.c);
            $$7.a($$6);
         }

         csz $$8 = this.a(kr.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(xc.a);
            $$6.accept(csz.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xd.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xd.b(lu.g.b(this.h()).toString()).a(n.i));
            int $$9 = this.q.d();
            if ($$9 > 0) {
               $$3.add(xd.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dS().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xd> $$0, @Nullable cnp $$1) {
      cyg $$2 = this.a(kr.n, cyg.a);
      if ($$2.c()) {
         for (bts $$3 : bts.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xc.a);
                  $$0.accept(xd.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xd> $$0, @Nullable cnp $$1, jn<bvh> $$2, bvk $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cvg.f)) {
            $$4 += $$1.i(bvm.c);
            $$5 = true;
         } else if ($$3.a(cvg.g)) {
            $$4 += $$1.i(bvm.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bvk.a.b || $$3.d() == bvk.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bvm.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xc.a().b(xd.a("attribute.modifier.equals." + $$3.d().a(), cyg.d.format($$6), xd.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xd.a("attribute.modifier.plus." + $$3.d().a(), cyg.d.format($$6), xd.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xd.a("attribute.modifier.take." + $$3.d().a(), cyg.d.format(-$$6), xd.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean z() {
      Boolean $$0 = this.a(kr.t);
      return $$0 != null ? $$0 : this.h().e_(this);
   }

   public cwj A() {
      cwj $$0 = this.a(kr.j, cwj.a);
      if (!this.C()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cwj.c;
            case c -> cwj.d;
            default -> $$0;
         };
      }
   }

   public boolean B() {
      if (!this.b(kr.y)) {
         return false;
      } else if (!this.h().a(this)) {
         return false;
      } else {
         dbc $$0 = this.a(kr.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jn<daw> $$0, int $$1) {
      day.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean C() {
      return !this.a(kr.k, dbc.a).d();
   }

   public dbc D() {
      return this.a(kr.k, dbc.a);
   }

   public boolean E() {
      return this.r instanceof cjs;
   }

   public void a(@Nullable btj $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public cjs F() {
      return this.r instanceof cjs ? (cjs)this.G() : null;
   }

   @Nullable
   public btj G() {
      return !this.f() ? this.r : null;
   }

   public void a(bts $$0, BiConsumer<jn<bvh>, bvk> $$1) {
      cyg $$2 = this.a(kr.n, cyg.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.h().j().a($$0, $$1);
      }

      day.a(this, $$0, $$1);
   }

   public void a(btr $$0, BiConsumer<jn<bvh>, bvk> $$1) {
      cyg $$2 = this.a(kr.n, cyg.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.h().j().a($$0, $$1);
      }

      day.a(this, $$0, $$1);
   }

   public xd H() {
      xr $$0 = xd.i().b(this.y());
      if (this.b(kr.g)) {
         $$0.a(n.u);
      }

      xr $$1 = xg.a((xd)$$0);
      if (!this.f()) {
         $$1.a(this.A().a()).a($$0x -> $$0x.a(new xj(xj.a.b, new xj.c(this))));
      }

      return $$1;
   }

   public boolean a(due $$0) {
      csz $$1 = this.a(kr.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(due $$0) {
      csz $$1 = this.a(kr.m);
      return $$1 != null && $$1.a($$0);
   }

   public int I() {
      return this.o;
   }

   public void d(int $$0) {
      this.o = $$0;
   }

   public int J() {
      return this.f() ? 0 : this.n;
   }

   public void e(int $$0) {
      this.n = $$0;
   }

   public void f(int $$0) {
      if (!this.f() && this.J() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.J() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable buf $$1) {
      if ($$1 == null || !$$1.fP()) {
         this.h($$0);
      }
   }

   public cvl b(int $$0, @Nullable buf $$1) {
      cvl $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dds $$0, buf $$1, int $$2) {
      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cjz $$0) {
      this.h().a($$0);
   }

   public awc K() {
      return this.h().ao_();
   }

   public awc L() {
      return this.h().ap_();
   }

   public awc M() {
      return this.h().e();
   }

   public boolean a(bsb $$0) {
      return !this.b(kr.w) || !$$0.a(awu.i);
   }

   public boolean b(cvl $$0) {
      dbe $$1 = this.a(kr.z);
      return $$1 != null ? $$1.a($$0) : this.h().a(this, $$0);
   }

   public int N() {
      dau $$0 = this.a(kr.y);
      return $$0 != null ? $$0.a() : this.h().g();
   }
}
