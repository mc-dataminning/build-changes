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

public final class czy implements kg {
   private static final List<xa> l = List.of(
      xa.c("item.op_warning.line1").a(o.m, o.r), xa.c("item.op_warning.line2").a(o.m), xa.c("item.op_warning.line3").a(o.m)
   );
   private static final xa m = xa.c("item.unbreakable").a(o.j);
   public static final MapCodec<czy> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
            $$0x -> $$0x.group(
                     czu.e.fieldOf("id").forGetter(czy::i),
                     ayw.a(1, 99).fieldOf("count").orElse(1).forGetter(czy::M),
                     ki.b.optionalFieldOf("components", ki.a).forGetter($$0xx -> $$0xx.s.g())
                  )
                  .apply($$0x, czy::new)
         )
   );
   public static final Codec<czy> b = Codec.lazyInitialized(a::codec);
   public static final Codec<czy> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(czu.e.fieldOf("id").forGetter(czy::i), ki.b.optionalFieldOf("components", ki.a).forGetter($$0x -> $$0x.s.g()))
                  .apply($$0, ($$0x, $$1) -> new czy($$0x, 1, $$1))
         )
   );
   public static final Codec<czy> d = b.validate(czy::a);
   public static final Codec<czy> e = c.validate(czy::a);
   public static final Codec<czy> f = ayw.g(b).xmap($$0 -> $$0.orElse(czy.k), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<czy> g = czu.e.xmap(czy::new, czy::i);
   public static final yy<wl, czy> h = new yy<wl, czy>() {
      public czy a(wl $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return czy.k;
         } else {
            jf<czu> $$2 = czu.f.decode($$0);
            ki $$3 = ki.c.decode($$0);
            return new czy($$2, $$1, $$3);
         }
      }

      public void a(wl $$0, czy $$1) {
         if ($$1.f()) {
            $$0.c(0);
         } else {
            $$0.c($$1.M());
            czu.f.encode($$0, $$1.i());
            ki.c.encode($$0, $$1.s.g());
         }
      }
   };
   public static final yy<wl, czy> i = new yy<wl, czy>() {
      public czy a(wl $$0) {
         czy $$1 = czy.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wl $$0, czy $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            czy.h.encode($$0, $$1);
         }
      }
   };
   public static final yy<wl, List<czy>> j = h.a(yw.a(jo::a));
   private static final Logger n = LogUtils.getLogger();
   public static final czy k = new czy((Void)null);
   private static final xa o = xa.c("item.disabled").a(o.m);
   private int p;
   private int q;
   @Deprecated
   @Nullable
   private final czu r;
   final kl s;
   @Nullable
   private bwt t;

   public static DataResult<czy> a(czy $$0) {
      DataResult<baw> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   public static yy<wl, czy> a(final yy<wl, czy> $$0) {
      return new yy<wl, czy>() {
         public czy a(wl $$0x) {
            czy $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               alg<baw> $$2 = $$0.H().a(azq.a);
               czy.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wl $$0x, czy $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cxx> b() {
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

   public czy(djw $$0) {
      this($$0, 1);
   }

   public czy(jf<czu> $$0) {
      this($$0.a(), 1);
   }

   public czy(jf<czu> $$0, int $$1, ki $$2) {
      this($$0.a(), $$1, kl.a($$0.a().f(), $$2));
   }

   public czy(jf<czu> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public czy(djw $$0, int $$1) {
      this($$0, $$1, new kl($$0.h().f()));
   }

   private czy(djw $$0, int $$1, kl $$2) {
      this.r = $$0.h();
      this.p = $$1;
      this.s = $$2;
      this.h().l(this);
   }

   private czy(@Nullable Void $$0) {
      this.r = null;
      this.s = new kl(kh.a);
   }

   public static DataResult<baw> a(kh $$0) {
      if ($$0.c(kk.d) && $$0.a(kk.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dcq $$1 = $$0.a(kk.ap, dcq.a);

         for (czy $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(baw.a);
      }
   }

   public static Optional<czy> a(jh.a $$0, uy $$1) {
      return b.parse($$0.a(un.a), $$1).resultOrPartial($$0x -> n.error("Tried to load invalid item: '{}'", $$0x));
   }

   public boolean f() {
      return this == k || this.r == dac.a || this.p <= 0;
   }

   public boolean a(cvh $$0) {
      return this.f() || this.h().a($$0);
   }

   public czy a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      czy $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public czy g() {
      if (this.f()) {
         return k;
      } else {
         czy $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public czu h() {
      return this.f() ? dac.a : this.r;
   }

   public jf<czu> i() {
      return this.h().e();
   }

   public boolean a(axt<czu> $$0) {
      return this.h().e().a($$0);
   }

   public boolean a(czu $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jf<czu>> $$0) {
      return $$0.test(this.h().e());
   }

   public boolean a(jf<czu> $$0) {
      return this.h().e() == $$0;
   }

   public boolean a(jj<czu> $$0) {
      return $$0.a(this.i());
   }

   public Stream<axt<czu>> j() {
      return this.h().e().c();
   }

   public bur a(ddt $$0) {
      crx $$1 = $$0.o();
      iv $$2 = $$0.a();
      if ($$1 != null && !$$1.gk().e && !this.a(new ebi($$0.q(), $$2, false))) {
         return bur.e;
      } else {
         czu $$3 = this.h();
         bur $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bur.d $$5 && $$5.c()) {
            $$1.b(awz.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(ebe $$0) {
      return this.h().a(this, $$0);
   }

   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = this.v();
      boolean $$4 = this.a((bxu)$$1) <= 0;
      bur $$5 = this.h().a($$0, $$1, $$2);
      return (bur)($$4 && $$5 instanceof bur.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public czy a(djx $$0, bxu $$1) {
      czy $$2 = this.v();
      czy $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private czy a(bxu $$0, czy $$1) {
      ddf $$2 = $$1.a(kk.x);
      dde $$3 = $$1.a(kk.y);
      int $$4 = $$1.M();
      czy $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.fV(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public uy b(jh.a $$0, uy $$1) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uy)b.encode(this, $$0.a(un.a), $$1).getOrThrow();
      }
   }

   public uy a(jh.a $$0) {
      if (this.f()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (uy)b.encodeStart($$0.a(un.a), this).getOrThrow();
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
      return azo.a(this.a(kk.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kk.e, Integer.valueOf(azo.a($$0, 0, this.p())));
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

   public void a(int $$0, ars $$1, @Nullable art $$2, Consumer<czu> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, ars $$1, @Nullable art $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.fV()) {
         return 0;
      } else {
         return $$0 > 0 ? dgn.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable art $$1, Consumer<czu> $$2) {
      if ($$1 != null) {
         aq.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         czu $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, crx $$1) {
      if ($$1 instanceof art $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {
         });
      }
   }

   public void a(int $$0, bxu $$1, bxd $$2) {
      if ($$1.dV() instanceof ars $$3) {
         this.a($$0, $$3, $$1 instanceof art $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public czy a(int $$0, djw $$1, bxu $$2, bxd $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         czy $$4 = this.b($$1, 1);
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

   public boolean a(cxn $$0, cwa $$1, crx $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(czy $$0, cxn $$1, cwa $$2, crx $$3, byl $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bxu $$0, bxu $$1) {
      czu $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kk.B)) {
         if ($$1 instanceof crx $$3) {
            $$3.b(awz.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(bxu $$0, bxu $$1) {
      this.h().b(this, $$0, $$1);
      ddg $$2 = this.a(kk.B);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bxd.a);
      }
   }

   public void a(djx $$0, ebe $$1, iv $$2, crx $$3) {
      czu $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(awz.c.b($$4));
      }
   }

   public boolean b(ebe $$0) {
      return this.h().b(this, $$0);
   }

   public bur a(crx $$0, bxu $$1, buq $$2) {
      dih $$3 = this.a(kk.D);
      if ($$3 != null && $$3.j()) {
         bur $$4 = $$3.a($$0, $$1, this);
         if ($$4 != bur.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public czy v() {
      if (this.f()) {
         return k;
      } else {
         czy $$0 = new czy(this.h(), this.p, this.s.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public czy c(int $$0) {
      if (this.f()) {
         return k;
      } else {
         czy $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public czy a(djw $$0) {
      return this.a($$0, this.M());
   }

   public czy a(djw $$0, int $$1) {
      return this.f() ? k : this.b($$0, $$1);
   }

   private czy b(djw $$0, int $$1) {
      return new czy($$0.h().e(), $$1, this.s.g());
   }

   public static boolean a(czy $$0, czy $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<czy> $$0, List<czy> $$1) {
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

   public static boolean b(czy $$0, czy $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(czy $$0, czy $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.s, $$1.s);
      }
   }

   public static MapCodec<czy> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(k), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable czy $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<czy> $$0) {
      int $$1 = 0;

      for (czy $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(djx $$0, bwt $$1, @Nullable bxd $$2) {
      if (this.q > 0) {
         this.q--;
      }

      if ($$0 instanceof ars $$3) {
         this.h().a(this, $$3, $$1, $$2);
      }
   }

   public void a(djx $$0, crx $$1, int $$2) {
      $$1.a(awz.b.b(this.h()), $$2);
      this.h().a(this, $$0, $$1);
   }

   public void a(djx $$0) {
      this.h().a(this, $$0);
   }

   public int a(bxu $$0) {
      return this.h().a(this, $$0);
   }

   public daa w() {
      return this.h().b(this);
   }

   public void a(djx $$0, bxu $$1, int $$2) {
      czy $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         czy $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fA(), $$4);
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
      Optional<Error<czy>> $$2 = a(this).error();
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

   public xa y() {
      xa $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public xa z() {
      xa $$0 = this.a(kk.g);
      if ($$0 != null) {
         return $$0;
      } else {
         ddi $$1 = this.a(kk.V);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!ban.h($$2)) {
               return xa.b($$2);
            }
         }

         return null;
      }
   }

   public xa A() {
      return this.h().a(this);
   }

   public xa B() {
      xo $$0 = xa.i().b(this.y()).a(this.D().a());
      if (this.c(kk.g)) {
         $$0.a(o.u);
      }

      return $$0;
   }

   public <T extends ddd> void a(kj<T> $$0, czu.b $$1, ddc $$2, Consumer<xa> $$3, dbn $$4) {
      T $$5 = (T)this.a($$0);
      if ($$5 != null && $$2.a($$0)) {
         $$5.a($$1, $$3, $$4, this.s);
      }
   }

   public List<xa> a(czu.b $$0, @Nullable crx $$1, dbn $$2) {
      ddc $$3 = this.a(kk.q, ddc.c);
      if (!$$2.b() && $$3.a()) {
         boolean $$4 = this.h().a(this, $$1);
         return $$4 ? l : List.of();
      } else {
         List<xa> $$5 = Lists.newArrayList();
         $$5.add(this.B());
         this.a($$0, $$3, $$1, $$2, $$5::add);
         return $$5;
      }
   }

   public void a(czu.b $$0, ddc $$1, @Nullable crx $$2, dbn $$3, Consumer<xa> $$4) {
      this.h().a(this, $$0, $$1, $$4, $$3);
      this.a(kk.aC, $$0, $$1, $$4, $$3);
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
      cxz $$5 = this.a(kk.n);
      if ($$5 != null && $$1.a(kk.n)) {
         $$4.accept(wz.a);
         $$4.accept(cxz.c);
         $$5.a($$4);
      }

      cxz $$6 = this.a(kk.m);
      if ($$6 != null && $$1.a(kk.m)) {
         $$4.accept(wz.a);
         $$4.accept(cxz.d);
         $$6.a($$4);
      }

      if ($$3.a()) {
         if (this.n() && $$1.a(kk.e)) {
            $$4.accept(xa.a("item.durability", this.p() - this.o(), this.p()));
         }

         $$4.accept(xa.b(mg.g.b(this.h()).toString()).a(o.i));
         int $$7 = this.s.d();
         if ($$7 > 0) {
            $$4.accept(xa.a("item.components", $$7).a(o.i));
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

   private void a(Consumer<xa> $$0, ddc $$1, @Nullable crx $$2) {
      if ($$1.a(kk.o)) {
         for (bxe $$3 : bxe.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wz.a);
                  $$0.accept(xa.c("item.modifiers." + $$3.c()).a(o.h));
                  $$4.setFalse();
               }

               this.a($$0, $$2, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<xa> $$0, @Nullable crx $$1, jf<byv> $$2, byy $$3) {
      double $$4 = $$3.b();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(czu.h)) {
            $$4 += $$1.i(bza.c);
            $$5 = true;
         } else if ($$3.a(czu.i)) {
            $$4 += $$1.i(bza.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.c() == byy.a.b || $$3.c() == byy.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bza.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wz.a().b(xa.a("attribute.modifier.equals." + $$3.c().a(), dcp.d.format($$6), xa.c($$2.a().c()))).a(o.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xa.a("attribute.modifier.plus." + $$3.c().a(), dcp.d.format($$6), xa.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(xa.a("attribute.modifier.take." + $$3.c().a(), dcp.d.format(-$$6), xa.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kk.t);
      return $$0 != null ? $$0 : this.h().d_(this);
   }

   public dau D() {
      dau $$0 = this.a(kk.k, dau.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> dau.c;
            case c -> dau.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kk.C)) {
         return false;
      } else {
         dgr $$0 = this.a(kk.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jf<dgl> $$0, int $$1) {
      dgn.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kk.l, dgr.a).d();
   }

   public dgr G() {
      return this.a(kk.l, dgr.a);
   }

   public boolean H() {
      return this.t instanceof cnv;
   }

   public void a(@Nullable bwt $$0) {
      if (!this.f()) {
         this.t = $$0;
      }
   }

   @Nullable
   public cnv I() {
      return this.t instanceof cnv ? (cnv)this.J() : null;
   }

   @Nullable
   public bwt J() {
      return !this.f() ? this.t : null;
   }

   public void a(bxe $$0, BiConsumer<jf<byv>, byy> $$1) {
      dcp $$2 = this.a(kk.o, dcp.a);
      $$2.a($$0, $$1);
      dgn.a(this, $$0, $$1);
   }

   public void a(bxd $$0, BiConsumer<jf<byv>, byy> $$1) {
      dcp $$2 = this.a(kk.o, dcp.a);
      $$2.a($$0, $$1);
      dgn.a(this, $$0, $$1);
   }

   public xa K() {
      xo $$0 = xa.i().b(this.y());
      if (this.c(kk.g)) {
         $$0.a(o.u);
      }

      xo $$1 = xd.a((xa)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xg.d(this)));
      }

      return $$1;
   }

   public boolean a(ebi $$0) {
      cxz $$1 = this.a(kk.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(ebi $$0) {
      cxz $$1 = this.a(kk.n);
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

   public void a(int $$0, @Nullable bxu $$1) {
      if ($$1 == null || !$$1.fV()) {
         this.h($$0);
      }
   }

   public czy b(int $$0, @Nullable bxu $$1) {
      czy $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(djx $$0, bxu $$1, int $$2) {
      dcd $$3 = this.a(kk.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.dY(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(coc $$0) {
      this.h().a($$0);
   }

   public boolean a(bvi $$0) {
      dci $$1 = this.a(kk.z);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(czy $$0) {
      dgt $$1 = this.a(kk.E);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(ebe $$0, djx $$1, iv $$2, crx $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
