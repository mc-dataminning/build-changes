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

public final class cua implements ki {
   public static final Codec<jj<ctv>> a = lq.g
      .s()
      .validate($$0 -> $$0.a(cud.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cua> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cua::h),
                     axm.l.fieldOf("count").orElse(1).forGetter(cua::H),
                     kk.b.optionalFieldOf("components", kk.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cua::new)
         )
   );
   public static final Codec<cua> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cua::h), kk.b.optionalFieldOf("components", kk.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cua($$0x, 1, $$1))
         )
   );
   public static final Codec<cua> d = b.validate(cua::b);
   public static final Codec<cua> e = c.validate(cua::b);
   public static final Codec<cua> f = axm.e(b).xmap($$0 -> $$0.orElse(cua.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cua> g = a.xmap(cua::new, cua::h);
   public static final ys<wf, cua> h = new ys<wf, cua>() {
      private static final ys<wf, jj<ctv>> a = yq.b(lr.K);

      public cua a(wf $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cua.l;
         } else {
            jj<ctv> $$2 = a.decode($$0);
            kk $$3 = kk.c.decode($$0);
            return new cua($$2, $$1, $$3);
         }
      }

      public void a(wf $$0, cua $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.H());
            a.encode($$0, $$1.h());
            kk.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final ys<wf, cua> i = new ys<wf, cua>() {
      public cua a(wf $$0) {
         cua $$1 = cua.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wf $$0, cua $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cua.h.encode($$0, $$1);
         }
      }
   };
   public static final ys<wf, List<cua>> j = h.a(yq.a(js::a));
   public static final ys<wf, List<cua>> k = i.a(yq.a(js::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cua l = new cua((Void)null);
   private static final wu n = wu.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final ctv q;
   final ko r;
   @Nullable
   private bsd s;

   private static DataResult<cua> b(cua $$0) {
      DataResult<azh> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.H() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.H() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static ys<wf, cua> a(final ys<wf, cua> $$0) {
      return new ys<wf, cua>() {
         public cua a(wf $$0x) {
            cua $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               aki<azh> $$2 = $$0.G().a(ayg.a);
               cua.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wf $$0x, cua $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<crk> b() {
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

   public cua(dcc $$0) {
      this($$0, 1);
   }

   public cua(jj<ctv> $$0) {
      this($$0.a(), 1);
   }

   public cua(jj<ctv> $$0, int $$1, kk $$2) {
      this($$0.a(), $$1, ko.a($$0.a().p(), $$2));
   }

   public cua(jj<ctv> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cua(dcc $$0, int $$1) {
      this($$0, $$1, new ko($$0.r().p()));
   }

   private cua(dcc $$0, int $$1, ko $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().m(this);
   }

   private cua(@Nullable Void $$0) {
      this.q = null;
      this.r = new ko(kj.a);
   }

   public static DataResult<azh> a(kj $$0) {
      return $$0.b(kn.d) && $$0.a(kn.c, 1) > 1 ? DataResult.error(() -> "Item cannot be both damageable and stackable") : DataResult.success(azh.a);
   }

   public static Optional<cua> a(jl.a $$0, uu $$1) {
      return b.parse($$0.a(ul.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cua a(jl.a $$0, tx $$1) {
      return $$1.g() ? l : a($$0, (uu)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cud.a || this.o <= 0;
   }

   public boolean a(cov $$0) {
      return this.e() || this.g().a($$0);
   }

   public cua a(int $$0) {
      int $$1 = Math.min($$0, this.H());
      cua $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cua f() {
      if (this.e()) {
         return l;
      } else {
         cua $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public ctv g() {
      return this.e() ? cud.a : this.q;
   }

   public jj<ctv> h() {
      return this.g().o();
   }

   public boolean a(awk<ctv> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(ctv $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<jj<ctv>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(jj<ctv> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jn<ctv> $$0) {
      return $$0.a(this.h());
   }

   public Stream<awk<ctv>> i() {
      return this.g().o().c();
   }

   public bqd a(cxm $$0) {
      cmh $$1 = $$0.o();
      ja $$2 = $$0.a();
      if ($$1 != null && !$$1.fZ().e && !this.a(new dsl($$0.q(), $$2, false))) {
         return bqd.e;
      } else {
         ctv $$3 = this.g();
         bqd $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avp.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dsh $$0) {
      return this.g().a(this, $$0);
   }

   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cua a(dcd $$0, bsy $$1) {
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
      return aye.a(this.a(kn.e, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(kn.e, Integer.valueOf(aye.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(kn.d, Integer.valueOf(0));
   }

   public void a(int $$0, aqk $$1, @Nullable aql $$2, Runnable $$3) {
      if (this.l()) {
         if ($$0 > 0) {
            $$0 = czl.a($$1, this, $$0);
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
            $$3.run();
         }
      }
   }

   public void a(int $$0, bsy $$1, bsk $$2) {
      if (!($$1.dP() instanceof aqk $$3)) {
         return;
      }

      if ($$1 instanceof cmh $$4 && $$4.fL()) {
         return;
      }

      this.a($$0, $$3, $$1 instanceof aql $$6 ? $$6 : null, () -> {
         $$1.e($$2);
         ctv $$2x = this.g();
         this.h(1);
         if ($$1 instanceof cmh) {
            ((cmh)$$1).b(avp.d.b($$2x));
         }

         this.b(0);
      });
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

   public boolean a(cra $$0, cpn $$1, cmh $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cua $$0, cra $$1, cpn $$2, cmh $$3, btq $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(bsy $$0, cmh $$1) {
      ctv $$2 = this.g();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avp.c.b($$2));
         return true;
      } else {
         return false;
      }
   }

   public void b(bsy $$0, cmh $$1) {
      this.g().b(this, $$0, $$1);
   }

   public void a(dcd $$0, dsh $$1, ja $$2, cmh $$3) {
      ctv $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avp.c.b($$4));
      }
   }

   public boolean b(dsh $$0) {
      return this.g().b(this, $$0);
   }

   public bqd a(cmh $$0, bsy $$1, bqc $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cua s() {
      if (this.e()) {
         return l;
      } else {
         cua $$0 = new cua(this.g(), this.o, this.r.g());
         $$0.d(this.G());
         return $$0;
      }
   }

   public cua c(int $$0) {
      if (this.e()) {
         return l;
      } else {
         cua $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cua a(dcc $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   public cua b(dcc $$0, int $$1) {
      return new cua($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cua $$0, cua $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.H() != $$1.H() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cua> $$0, List<cua> $$1) {
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

   public static boolean b(cua $$0, cua $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cua $$0, cua $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cua> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cua $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cua> $$0) {
      int $$1 = 0;

      for (cua $$2 : $$0) {
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

   public void a(dcd $$0, bsd $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dcd $$0, cmh $$1, int $$2) {
      $$1.a(avp.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dcd $$0) {
      this.g().a(this, $$0);
   }

   public int a(bsy $$0) {
      return this.g().a(this, $$0);
   }

   public cvv u() {
      return this.g().b(this);
   }

   public void a(dcd $$0, bsy $$1, int $$2) {
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
      Optional<Error<cua>> $$2 = b(this).error();
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

   private <T extends cxf> void a(km<T> $$0, ctv.b $$1, Consumer<wu> $$2, cvt $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wu> a(ctv.b $$0, @Nullable cmh $$1, cvt $$2) {
      if (!$$2.b() && this.b(kn.q)) {
         return List.of();
      } else {
         List<wu> $$3 = Lists.newArrayList();
         xi $$4 = wu.i().b(this.w()).a(this.y().a());
         if (this.b(kn.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kn.g) && this.a(cud.rU)) {
            epo $$5 = this.a(kn.B);
            if ($$5 != null) {
               $$3.add(cui.a($$5));
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
         crm $$7 = this.a(kn.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wt.a);
            $$6.accept(crm.c);
            $$7.a($$6);
         }

         crm $$8 = this.a(kn.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wt.a);
            $$6.accept(crm.d);
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

         if ($$1 != null && !this.g().a($$1.dP().J())) {
            $$3.add(n);
         }

         return $$3;
      }
   }

   private void a(Consumer<wu> $$0, @Nullable cmh $$1) {
      cwu $$2 = this.a(kn.n, cwu.a);
      if ($$2.c()) {
         for (bsk $$3 : bsk.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wt.a);
                  $$0.accept(wu.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wu> $$0, @Nullable cmh $$1, jj<bub> $$2, bue $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == ctv.e) {
            $$4 += $$1.h(bug.c);
            $$5 = true;
         } else if ($$3.b() == ctv.f) {
            $$4 += $$1.h(bug.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == bue.a.b || $$3.e() == bue.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bug.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wt.a().b(wu.a("attribute.modifier.equals." + $$3.e().a(), cwu.d.format($$6), wu.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wu.a("attribute.modifier.plus." + $$3.e().a(), cwu.d.format($$6), wu.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(wu.a("attribute.modifier.take." + $$3.e().a(), cwu.d.format(-$$6), wu.c($$2.a().c())).a(n.m));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(kn.t);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cuu y() {
      cuu $$0 = this.a(kn.j, cuu.a);
      if (!this.A()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cuu.c;
            case c -> cuu.d;
            default -> $$0;
         };
      }
   }

   public boolean z() {
      if (!this.g().a(this)) {
         return false;
      } else {
         czp $$0 = this.a(kn.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jj<czj> $$0, int $$1) {
      czl.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(kn.k, czp.a).d();
   }

   public czp B() {
      return this.a(kn.k, czp.a);
   }

   public boolean C() {
      return this.s instanceof cik;
   }

   public void a(@Nullable bsd $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public cik D() {
      return this.s instanceof cik ? (cik)this.E() : null;
   }

   @Nullable
   public bsd E() {
      return !this.e() ? this.s : null;
   }

   public void a(bsk $$0, BiConsumer<jj<bub>, bue> $$1) {
      cwu $$2 = this.a(kn.n, cwu.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      czl.a(this, $$0, $$1);
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

   public boolean a(dsl $$0) {
      crm $$1 = this.a(kn.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dsl $$0) {
      crm $$1 = this.a(kn.m);
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

   public void a(int $$0, @Nullable bsy $$1) {
      if ($$1 == null || !$$1.fL()) {
         this.h($$0);
      }
   }

   public void b(dcd $$0, bsy $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cir $$0) {
      this.g().a($$0);
   }

   public ave I() {
      return this.g().al_();
   }

   public ave J() {
      return this.g().am_();
   }

   public ave K() {
      return this.g().e();
   }

   public boolean a(bqw $$0) {
      return !this.b(kn.w) || !$$0.a(avw.j);
   }
}
