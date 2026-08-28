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

public final class cvs implements kn {
   public static final Codec<jo<cvn>> a = lv.g
      .r()
      .validate($$0 -> $$0.a(cvw.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cvs> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cvs::i),
                     ayo.a(1, 99).fieldOf("count").orElse(1).forGetter(cvs::K),
                     kp.b.optionalFieldOf("components", kp.a).forGetter($$0x -> $$0x.q.g())
                  )
                  .apply($$0, cvs::new)
         )
   );
   public static final Codec<cvs> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cvs::i), kp.b.optionalFieldOf("components", kp.a).forGetter($$0x -> $$0x.q.g()))
                  .apply($$0, ($$0x, $$1) -> new cvs($$0x, 1, $$1))
         )
   );
   public static final Codec<cvs> d = b.validate(cvs::c);
   public static final Codec<cvs> e = c.validate(cvs::c);
   public static final Codec<cvs> f = ayo.e(b).xmap($$0 -> $$0.orElse(cvs.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cvs> g = a.xmap(cvs::new, cvs::i);
   public static final zc<wp, cvs> h = new zc<wp, cvs>() {
      private static final zc<wp, jo<cvn>> a = za.b(lw.K);

      public cvs a(wp $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cvs.k;
         } else {
            jo<cvn> $$2 = a.decode($$0);
            kp $$3 = kp.c.decode($$0);
            return new cvs($$2, $$1, $$3);
         }
      }

      public void a(wp $$0, cvs $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.K());
            a.encode($$0, $$1.i());
            kp.c.encode($$0, $$1.q.g());
         }
      }
   };
   public static final zc<wp, cvs> i = new zc<wp, cvs>() {
      public cvs a(wp $$0) {
         cvs $$1 = cvs.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wp $$0, cvs $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cvs.h.encode($$0, $$1);
         }
      }
   };
   public static final zc<wp, List<cvs>> j = h.a(za.a(jx::a));
   private static final Logger l = LogUtils.getLogger();
   public static final cvs k = new cvs((Void)null);
   private static final xe m = xe.c("item.disabled").a(n.m);
   private int n;
   private int o;
   @Deprecated
   @Nullable
   private final cvn p;
   final kt q;
   @Nullable
   private btr r;

   private static DataResult<cvs> c(cvs $$0) {
      DataResult<bak> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.K() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.K() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static zc<wp, cvs> a(final zc<wp, cvs> $$0) {
      return new zc<wp, cvs>() {
         public cvs a(wp $$0x) {
            cvs $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alc<bak> $$2 = $$0.H().a(azh.a);
               cvs.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wp $$0x, cvs $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<ctg> b() {
      return this.h().j(this);
   }

   @Override
   public ko a() {
      return (ko)(!this.f() ? this.q : ko.a);
   }

   public void c() {
      this.q.f();
   }

   public ko d() {
      return !this.f() ? this.h().o() : ko.a;
   }

   public kp e() {
      return !this.f() ? this.q.g() : kp.a;
   }

   public cvs(dei $$0) {
      this($$0, 1);
   }

   public cvs(jo<cvn> $$0) {
      this($$0.a(), 1);
   }

   public cvs(jo<cvn> $$0, int $$1, kp $$2) {
      this($$0.a(), $$1, kt.a($$0.a().o(), $$2));
   }

   public cvs(jo<cvn> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cvs(dei $$0, int $$1) {
      this($$0, $$1, new kt($$0.q().o()));
   }

   private cvs(dei $$0, int $$1, kt $$2) {
      this.p = $$0.q();
      this.n = $$1;
      this.q = $$2;
      this.h().l(this);
   }

   private cvs(@Nullable Void $$0) {
      this.p = null;
      this.q = new kt(ko.a);
   }

   public static DataResult<bak> a(ko $$0) {
      if ($$0.b(ks.d) && $$0.a(ks.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cyo $$1 = $$0.a(ks.ag, cyo.a);

         for (cvs $$2 : $$1.d()) {
            int $$3 = $$2.K();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bak.a);
      }
   }

   public static Optional<cvs> a(jq.a $$0, vd $$1) {
      return b.parse($$0.a(uu.a), $$1).resultOrPartial($$0x -> l.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cvs a(jq.a $$0, ug $$1) {
      return $$1.g() ? k : a($$0, (vd)$$1).orElse(k);
   }

   public boolean f() {
      return this == k || this.p == cvw.a || this.n <= 0;
   }

   public boolean a(cqq $$0) {
      return this.f() || this.h().a($$0);
   }

   public cvs a(int $$0) {
      int $$1 = Math.min($$0, this.K());
      cvs $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cvs g() {
      if (this.f()) {
         return k;
      } else {
         cvs $$0 = this.u();
         this.e(0);
         return $$0;
      }
   }

   public cvn h() {
      return this.f() ? cvw.a : this.p;
   }

   public jo<cvn> i() {
      return this.h().n();
   }

   public boolean a(axl<cvn> $$0) {
      return this.h().n().a($$0);
   }

   public boolean a(cvn $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jo<cvn>> $$0) {
      return $$0.test(this.h().n());
   }

   public boolean a(jo<cvn> $$0) {
      return this.h().n() == $$0;
   }

   public boolean a(js<cvn> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axl<cvn>> j() {
      return this.h().n().c();
   }

   public brs a(czp $$0) {
      cnx $$1 = $$0.o();
      jf $$2 = $$0.a();
      if ($$1 != null && !$$1.ge().e && !this.a(new duw($$0.q(), $$2, false))) {
         return brs.e;
      } else {
         cvn $$3 = this.h();
         brs $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof brs.d $$5 && $$5.c()) {
            $$1.b(awq.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dus $$0) {
      return this.h().a(this, $$0);
   }

   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = this.u();
      boolean $$4 = this.a((bun)$$1) <= 0;
      brs $$5 = this.h().a($$0, $$1, $$2);
      return (brs)($$4 && $$5 instanceof brs.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public cvs a(dej $$0, bun $$1) {
      cvs $$2 = this.u();
      cvs $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private cvs a(bun $$0, cvs $$1) {
      czc $$2 = $$1.a(ks.x);
      czb $$3 = $$1.a(ks.y);
      int $$4 = $$1.K();
      cvs $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a($$0, this, $$4);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public vd b(jq.a $$0, vd $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vd)b.encode(this, $$0.a(uu.a), $$1).getOrThrow();
      }
   }

   public vd a(jq.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (vd)b.encodeStart($$0.a(uu.a), this).getOrThrow();
      }
   }

   public vd b(jq.a $$0) {
      return (vd)(this.f() ? new ug() : this.b($$0, new ug()));
   }

   public int k() {
      return this.a(ks.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.b(ks.d) && !this.b(ks.f) && this.b(ks.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return azf.a(this.a(ks.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(ks.e, Integer.valueOf(azf.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(ks.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public void a(int $$0, arj $$1, @Nullable ark $$2, Consumer<cvn> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 > 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, arj $$1, @Nullable ark $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fR()) {
         return 0;
      } else {
         return $$0 > 0 ? dbp.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable ark $$1, Consumer<cvn> $$2) {
      if ($$1 != null) {
         an.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         cvn $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cnx $$1) {
      if ($$1 instanceof ark $$2) {
         int $$3 = this.a($$0, $$2.B(), $$2);
         if ($$3 <= 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bun $$1, btz $$2) {
      if ($$1.dS() instanceof arj $$3) {
         this.a($$0, $$3, $$1 instanceof ark $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public cvs a(int $$0, dei $$1, bun $$2, btz $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         cvs $$4 = this.b($$1, 1);
         if ($$4.m()) {
            $$4.b(0);
         }

         return $$4;
      } else {
         return this;
      }
   }

   public boolean r() {
      return this.h().c(this);
   }

   public int s() {
      return this.h().d(this);
   }

   public int t() {
      return this.h().e(this);
   }

   public boolean a(csw $$0, crj $$1, cnx $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(cvs $$0, csw $$1, crj $$2, cnx $$3, bve $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bun $$0, bun $$1) {
      cvn $$2 = this.h();
      if ($$2.a(this, $$0, $$1)) {
         if ($$1 instanceof cnx $$3) {
            $$3.b(awq.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bun $$0, bun $$1) {
      this.h().b(this, $$0, $$1);
   }

   public void a(dej $$0, dus $$1, jf $$2, cnx $$3) {
      cvn $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awq.c.b($$4));
      }
   }

   public boolean b(dus $$0) {
      return this.h().b(this, $$0);
   }

   public brs a(cnx $$0, bun $$1, brr $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public cvs u() {
      if (this.f()) {
         return k;
      } else {
         cvs $$0 = new cvs(this.h(), this.n, this.q.h());
         $$0.d(this.J());
         return $$0;
      }
   }

   public cvs c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         cvs $$1 = this.u();
         $$1.e($$0);
         return $$1;
      }
   }

   public cvs a(dei $$0) {
      return this.a($$0, this.K());
   }

   public cvs a(dei $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private cvs b(dei $$0, int $$1) {
      return new cvs($$0.q().n(), $$1, this.q.g());
   }

   public static boolean a(cvs $$0, cvs $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.K() != $$1.K() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cvs> $$0, List<cvs> $$1) {
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

   public static boolean b(cvs $$0, cvs $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(cvs $$0, cvs $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.q, $$1.q);
      }
   }

   public static MapCodec<cvs> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cvs $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cvs> $$0) {
      int $$1 = 0;

      for (cvs $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String v() {
      return this.h().d_(this);
   }

   @Override
   public String toString() {
      return this.K() + " " + this.h();
   }

   public void a(dej $$0, btr $$1, int $$2, boolean $$3) {
      if (this.o > 0) {
         this.o--;
      }

      if (this.h() != null) {
         this.h().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dej $$0, cnx $$1, int $$2) {
      $$1.a(awq.b.b(this.h()), $$2);
      this.h().b(this, $$0, $$1);
   }

   public void a(dej $$0) {
      this.h().a(this, $$0);
   }

   public int a(bun $$0) {
      return this.h().a(this, $$0);
   }

   public cvu w() {
      return this.h().a(this);
   }

   public void a(dej $$0, bun $$1, int $$2) {
      cvs $$3 = this.u();
      if (this.h().a(this, $$0, $$1, $$2)) {
         cvs $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fw(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().k(this);
   }

   @Nullable
   public <T> T b(kr<? super T> $$0, @Nullable T $$1) {
      return this.q.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kr<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kr<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kr<? extends T> $$0) {
      return this.q.d($$0);
   }

   public void a(kp $$0) {
      kp $$1 = this.q.g();
      this.q.a($$0);
      Optional<Error<cvs>> $$2 = c(this).error();
      if ($$2.isPresent()) {
         l.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.q.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(kp $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public void b(ko $$0) {
      this.q.a($$0);
      this.h().l(this);
   }

   public xe y() {
      xe $$0 = this.a(ks.g);
      if ($$0 != null) {
         return $$0;
      } else {
         cze $$1 = this.a(ks.O);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bac.h($$2)) {
               return xe.b($$2);
            }
         }

         xe $$3 = this.a(ks.h);
         return $$3 != null ? $$3 : this.h().m(this);
      }
   }

   public xe z() {
      xs $$0 = xe.i().b(this.y()).a(this.B().a());
      if (this.b(ks.g)) {
         $$0.a(n.u);
      }

      return $$0;
   }

   private <T extends cyz> void a(kr<T> $$0, cvn.b $$1, Consumer<xe> $$2, cxk $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<xe> a(cvn.b $$0, @Nullable cnx $$1, cxk $$2) {
      if (!$$2.b() && this.b(ks.q)) {
         return List.of();
      } else {
         List<xe> $$3 = Lists.newArrayList();
         $$3.add(this.z());
         if (!$$2.a() && !this.b(ks.g) && this.a(cvw.rV)) {
            esl $$4 = this.a(ks.G);
            if ($$4 != null) {
               $$3.add(cwf.a($$4));
            }
         }

         Consumer<xe> $$5 = $$3::add;
         if (!this.b(ks.p)) {
            this.h().a(this, $$0, $$3, $$2);
         }

         this.a(ks.W, $$0, $$5, $$2);
         this.a(ks.P, $$0, $$5, $$2);
         this.a(ks.D, $$0, $$5, $$2);
         this.a(ks.k, $$0, $$5, $$2);
         this.a(ks.E, $$0, $$5, $$2);
         this.a(ks.i, $$0, $$5, $$2);
         this.a($$5, $$1);
         this.a(ks.f, $$0, $$5, $$2);
         this.a(ks.V, $$0, $$5, $$2);
         this.a(ks.M, $$0, $$5, $$2);
         cti $$6 = this.a(ks.m);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xd.a);
            $$5.accept(cti.c);
            $$6.a($$5);
         }

         cti $$7 = this.a(ks.l);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xd.a);
            $$5.accept(cti.d);
            $$7.a($$5);
         }

         if ($$2.a()) {
            if (this.n()) {
               $$3.add(xe.a("item.durability", this.p() - this.o(), this.p()));
            }

            $$3.add(xe.b(lv.g.b(this.h()).toString()).a(n.i));
            int $$8 = this.q.d();
            if ($$8 > 0) {
               $$3.add(xe.a("item.components", $$8).a(n.i));
            }
         }

         if ($$1 != null && !this.h().a($$1.dS().J())) {
            $$3.add(m);
         }

         return $$3;
      }
   }

   private void a(Consumer<xe> $$0, @Nullable cnx $$1) {
      cyn $$2 = this.a(ks.n, cyn.a);
      if ($$2.c()) {
         for (bua $$3 : bua.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(xd.a);
                  $$0.accept(xe.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xe> $$0, @Nullable cnx $$1, jo<bvp> $$2, bvs $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cvn.f)) {
            $$4 += $$1.i(bvu.c);
            $$5 = true;
         } else if ($$3.a(cvn.g)) {
            $$4 += $$1.i(bvu.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bvs.a.b || $$3.d() == bvs.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bvu.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xd.a().b(xe.a("attribute.modifier.equals." + $$3.d().a(), cyn.d.format($$6), xe.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xe.a("attribute.modifier.plus." + $$3.d().a(), cyn.d.format($$6), xe.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xe.a("attribute.modifier.take." + $$3.d().a(), cyn.d.format(-$$6), xe.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean A() {
      Boolean $$0 = this.a(ks.t);
      return $$0 != null ? $$0 : this.h().e_(this);
   }

   public cwp B() {
      cwp $$0 = this.a(ks.j, cwp.a);
      if (!this.D()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cwp.c;
            case c -> cwp.d;
            default -> $$0;
         };
      }
   }

   public boolean C() {
      if (!this.b(ks.B)) {
         return false;
      } else {
         dbt $$0 = this.a(ks.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jo<dbn> $$0, int $$1) {
      dbp.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean D() {
      return !this.a(ks.k, dbt.a).d();
   }

   public dbt E() {
      return this.a(ks.k, dbt.a);
   }

   public boolean F() {
      return this.r instanceof cka;
   }

   public void a(@Nullable btr $$0) {
      if (!this.f()) {
         this.r = $$0;
      }
   }

   @Nullable
   public cka G() {
      return this.r instanceof cka ? (cka)this.H() : null;
   }

   @Nullable
   public btr H() {
      return !this.f() ? this.r : null;
   }

   public void a(bua $$0, BiConsumer<jo<bvp>, bvs> $$1) {
      cyn $$2 = this.a(ks.n, cyn.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.h().h().a($$0, $$1);
      }

      dbp.a(this, $$0, $$1);
   }

   public void a(btz $$0, BiConsumer<jo<bvp>, bvs> $$1) {
      cyn $$2 = this.a(ks.n, cyn.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.h().h().a($$0, $$1);
      }

      dbp.a(this, $$0, $$1);
   }

   public xe I() {
      xs $$0 = xe.i().b(this.y());
      if (this.b(ks.g)) {
         $$0.a(n.u);
      }

      xs $$1 = xh.a((xe)$$0);
      if (!this.f()) {
         $$1.a(this.B().a()).a($$0x -> $$0x.a(new xk(xk.a.b, new xk.c(this))));
      }

      return $$1;
   }

   public boolean a(duw $$0) {
      cti $$1 = this.a(ks.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(duw $$0) {
      cti $$1 = this.a(ks.m);
      return $$1 != null && $$1.a($$0);
   }

   public int J() {
      return this.o;
   }

   public void d(int $$0) {
      this.o = $$0;
   }

   public int K() {
      return this.f() ? 0 : this.n;
   }

   public void e(int $$0) {
      this.n = $$0;
   }

   public void f(int $$0) {
      if (!this.f() && this.K() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.K() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable bun $$1) {
      if ($$1 == null || !$$1.fR()) {
         this.h($$0);
      }
   }

   public cvs b(int $$0, @Nullable bun $$1) {
      cvs $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dej $$0, bun $$1, int $$2) {
      cye $$3 = this.a(ks.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dV(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(ckh $$0) {
      this.h().a($$0);
   }

   public awf L() {
      return this.h().e();
   }

   public boolean a(bsj $$0) {
      return !this.b(ks.z) || !$$0.a(awx.i);
   }

   public boolean b(cvs $$0) {
      dbv $$1 = this.a(ks.C);
      return $$1 != null ? $$1.a($$0) : this.h().a(this, $$0);
   }

   public int M() {
      dbl $$0 = this.a(ks.B);
      return $$0 != null ? $$0.a() : 0;
   }
}
