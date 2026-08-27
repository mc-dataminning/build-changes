import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public final class crj implements jk {
   private static final Codec<il<cre>> j = aws.b(
      kr.h.r(),
      (Function<il<cre>, DataResult<il<cre>>>)($$0 -> $$0.a(crm.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<crj> a = aws.a(
      (Supplier<Codec<crj>>)(() -> aws.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(
                        j.fieldOf("id").forGetter(crj::g),
                        aws.a(aws.j, "count", Integer.valueOf(1)).forGetter(crj::G),
                        aws.a(jm.b, "components", jm.a).forGetter($$0x -> $$0x.p.f())
                     )
                     .apply($$0, crj::new)
            ),
            crj::b
         ))
   );
   public static final Codec<crj> b = aws.e(a).xmap($$0 -> $$0.orElse(crj.i), $$0 -> $$0.d() ? Optional.empty() : Optional.of($$0));
   public static final Codec<crj> c = j.xmap(crj::new, crj::g);
   public static final Codec<crj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(j.fieldOf("id").forGetter(crj::g), aws.a(aws.j, "count", Integer.valueOf(1)).forGetter(crj::G)).apply($$0, crj::new)
   );
   public static final ye<vr, crj> e = new ye<vr, crj>() {
      private static final ye<vr, il<cre>> a = yc.b(ks.F);

      public crj a(vr $$0) {
         int $$1 = $$0.readByte();
         if ($$1 <= 0) {
            return crj.i;
         } else {
            il<cre> $$2 = a.decode($$0);
            jm $$3 = jm.c.decode($$0);
            return new crj($$2, $$1, $$3);
         }
      }

      public void a(vr $$0, crj $$1) {
         if ($$1.d()) {
            $$0.k(0);
         } else {
            $$0.k($$1.G());
            a.encode($$0, $$1.g());
            jm.c.encode($$0, $$1.p.f());
         }
      }
   };
   public static final ye<vr, crj> f = new ye<vr, crj>() {
      public crj a(vr $$0) {
         crj $$1 = crj.e.decode($$0);
         if ($$1.d()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(vr $$0, crj $$1) {
         if ($$1.d()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            crj.e.encode($$0, $$1);
         }
      }
   };
   public static final ye<vr, List<crj>> g = e.a(yc.a(iu::a));
   public static final ye<vr, List<crj>> h = f.a(yc.a(iu::a));
   private static final Logger k = LogUtils.getLogger();
   public static final crj i = new crj((Void)null);
   private static final wg l = wg.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final cre o;
   final jq p;
   @Nullable
   private bpv q;

   private static DataResult<crj> b(crj $$0) {
      return $$0.G() > $$0.i()
         ? DataResult.error(() -> "Item stack with stack size of " + $$0.G() + " was larger than maximum: " + $$0.i()).setPartial(() -> $$0.c($$0.i()))
         : DataResult.success($$0);
   }

   public Optional<cot> b() {
      return this.f().h(this);
   }

   @Override
   public jl a() {
      return (jl)(!this.d() ? this.p : jl.a);
   }

   public jm c() {
      return !this.d() ? this.p.f() : jm.a;
   }

   public crj(cyw $$0) {
      this($$0, 1);
   }

   public crj(il<cre> $$0) {
      this($$0.a(), 1);
   }

   public crj(il<cre> $$0, int $$1, jm $$2) {
      this($$0.a(), $$1, jq.a($$0.a().o(), $$2));
   }

   public crj(il<cre> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public crj(cyw $$0, int $$1) {
      this($$0, $$1, new jq($$0.p().o()));
   }

   private crj(cyw $$0, int $$1, jq $$2) {
      this.o = $$0.p();
      this.m = $$1;
      this.p = $$2;
      this.f().n(this);
   }

   private crj(@Nullable Void $$0) {
      this.o = null;
      this.p = new jq(jl.a);
   }

   public static Optional<crj> a(in.a $$0, uj $$1) {
      return a.parse($$0.a(ua.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static crj a(in.a $$0, tm $$1) {
      return $$1.g() ? i : a($$0, (uj)$$1).orElse(i);
   }

   public boolean d() {
      return this == i || this.o == crm.a || this.m <= 0;
   }

   public boolean a(cmg $$0) {
      return this.d() || this.f().a($$0);
   }

   public crj a(int $$0) {
      int $$1 = Math.min($$0, this.G());
      crj $$2 = this.c($$1);
      this.g($$1);
      return $$2;
   }

   public crj e() {
      if (this.d()) {
         return i;
      } else {
         crj $$0 = this.r();
         this.e(0);
         return $$0;
      }
   }

   public cre f() {
      return this.d() ? crm.a : this.o;
   }

   public il<cre> g() {
      return this.f().n();
   }

   public boolean a(avr<cre> $$0) {
      return this.f().n().a($$0);
   }

   public boolean a(cre $$0) {
      return this.f() == $$0;
   }

   public boolean a(Predicate<il<cre>> $$0) {
      return $$0.test(this.f().n());
   }

   public boolean a(il<cre> $$0) {
      return this.f().n() == $$0;
   }

   public boolean a(ip<cre> $$0) {
      return $$0.a(this.g());
   }

   public Stream<avr<cre>> h() {
      return this.f().n().c();
   }

   public boa a(cuq $$0) {
      cjt $$1 = $$0.o();
      ib $$2 = $$0.a();
      if ($$1 != null && !$$1.ga().e && !this.a(new dpd($$0.q(), $$2, false))) {
         return boa.d;
      } else {
         cre $$3 = this.f();
         boa $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(auw.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(doz $$0) {
      return this.f().a(this, $$0);
   }

   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      return this.f().a($$0, $$1, $$2);
   }

   public crj a(cyx $$0, bqo $$1) {
      return this.f().a(this, $$0, $$1);
   }

   public uj b(in.a $$0, uj $$1) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encode(this, $$0.a(ua.a), $$1), IllegalStateException::new);
      }
   }

   public uj a(in.a $$0) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encodeStart($$0.a(ua.a), this), IllegalStateException::new);
      }
   }

   public uj b(in.a $$0) {
      return (uj)(this.d() ? new tm() : this.b($$0, new tm()));
   }

   public int i() {
      return this.f().q();
   }

   public boolean j() {
      return this.i() > 1 && (!this.k() || !this.l());
   }

   public boolean k() {
      return !this.d() && this.f().s() ? !this.b(jp.c) && this.b(jp.b) : false;
   }

   public boolean l() {
      return this.k() && this.m() > 0;
   }

   public int m() {
      return this.a(jp.b, Integer.valueOf(0));
   }

   public void b(int $$0) {
      this.b(jp.b, Integer.valueOf($$0));
   }

   public int n() {
      return this.f().r();
   }

   public void a(int $$0, axr $$1, @Nullable apt $$2, Runnable $$3) {
      if (this.k()) {
         if ($$0 > 0) {
            int $$4 = cwr.a(cwt.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (cwo.a(this, $$4, $$1)) {
                  $$5++;
               }
            }

            $$0 -= $$5;
            if ($$0 <= 0) {
               return;
            }
         }

         if ($$2 != null && $$0 != 0) {
            am.u.a($$2, this, this.m() + $$0);
         }

         int $$7 = this.m() + $$0;
         this.b($$7);
         if ($$7 >= this.n()) {
            $$3.run();
         }
      }
   }

   public void a(int $$0, bqo $$1, bqc $$2) {
      if (!$$1.dM().B) {
         if ($$1 instanceof cjt $$3 && $$3.fM()) {
            return;
         }

         this.a($$0, $$1.ei(), $$1 instanceof apt $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            cre $$2x = this.f();
            this.g(1);
            if ($$1 instanceof cjt) {
               ((cjt)$$1).b(auw.d.b($$2x));
            }

            this.b(0);
         });
      }
   }

   public boolean o() {
      return this.f().e(this);
   }

   public int p() {
      return this.f().f(this);
   }

   public int q() {
      return this.f().g(this);
   }

   public boolean a(cok $$0, cmx $$1, cjt $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public boolean a(crj $$0, cok $$1, cmx $$2, cjt $$3, brf $$4) {
      return this.f().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bqo $$0, cjt $$1) {
      cre $$2 = this.f();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(auw.c.b($$2));
      }
   }

   public void a(cyx $$0, doz $$1, ib $$2, cjt $$3) {
      cre $$4 = this.f();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(auw.c.b($$4));
      }
   }

   public boolean b(doz $$0) {
      return this.f().a_($$0);
   }

   public boa a(cjt $$0, bqo $$1, bnz $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public crj r() {
      if (this.d()) {
         return i;
      } else {
         crj $$0 = new crj(this.f(), this.m, this.p.g());
         $$0.d(this.F());
         return $$0;
      }
   }

   public crj c(int $$0) {
      if (this.d()) {
         return i;
      } else {
         crj $$1 = this.r();
         $$1.e($$0);
         return $$1;
      }
   }

   public crj a(cyw $$0, int $$1) {
      return this.d() ? i : this.b($$0, $$1);
   }

   public crj b(cyw $$0, int $$1) {
      return new crj($$0.p().n(), $$1, this.p.f());
   }

   public static boolean a(crj $$0, crj $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.G() != $$1.G() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<crj> $$0, List<crj> $$1) {
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

   public static boolean b(crj $$0, crj $$1) {
      return $$0.a($$1.f());
   }

   public static boolean c(crj $$0, crj $$1) {
      if (!$$0.a($$1.f())) {
         return false;
      } else {
         return $$0.d() && $$1.d() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<crj> a(String $$0) {
      return a.optionalFieldOf($$0).xmap($$0x -> $$0x.orElse(i), $$0x -> $$0x.d() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable crj $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.f().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<crj> $$0) {
      int $$1 = 0;

      for (crj $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String s() {
      return this.f().i(this);
   }

   @Override
   public String toString() {
      return this.G() + " " + this.f();
   }

   public void a(cyx $$0, bpv $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.f() != null) {
         this.f().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(cyx $$0, cjt $$1, int $$2) {
      $$1.a(auw.b.b(this.f()), $$2);
      this.f().b(this, $$0, $$1);
   }

   public void a(cyx $$0) {
      this.f().a(this, $$0);
   }

   public int t() {
      return this.f().b(this);
   }

   public ctb u() {
      return this.f().c(this);
   }

   public void a(cyx $$0, bqo $$1, int $$2) {
      this.f().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.f().m(this);
   }

   @Nullable
   public <T> T b(jo<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(jo<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(jo<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(jo<? extends T> $$0) {
      return this.p.d($$0);
   }

   public void a(jm $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public void a(jl $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public wg w() {
      wg $$0 = this.a(jp.d);
      return $$0 != null ? $$0 : this.f().o(this);
   }

   private <T extends cuj> void a(jo<T> $$0, Consumer<wg> $$1, csz $$2) {
      T $$3 = (T)this.a($$0);
      if ($$3 != null) {
         $$3.a($$1, $$2);
      }
   }

   public List<wg> a(@Nullable cjt $$0, csz $$1) {
      List<wg> $$2 = Lists.newArrayList();
      wu $$3 = wg.i().b(this.w()).a(this.y().e);
      if (this.b(jp.d)) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.b(jp.d) && this.a(crm.rT)) {
         emd $$4 = this.a(jp.s);
         if ($$4 != null) {
            $$2.add(crq.a($$4));
         }
      }

      Consumer<wg> $$5 = $$2::add;
      if (!this.b(jp.k)) {
         this.f().a(this, $$0 == null ? null : $$0.dM(), $$2, $$1);
      }

      this.a(jp.B, $$5, $$1);
      this.a(jp.p, $$5, $$1);
      this.a(jp.f, $$5, $$1);
      this.a(jp.q, $$5, $$1);
      this.a(jp.e, $$5, $$1);
      this.a($$5, $$0);
      this.a(jp.c, $$5, $$1);
      cov $$6 = this.a(jp.h);
      if ($$6 != null && $$6.a()) {
         $$5.accept(wf.a);
         $$5.accept(cov.c);
         $$6.a($$5);
      }

      cov $$7 = this.a(jp.g);
      if ($$7 != null && $$7.a()) {
         $$5.accept(wf.a);
         $$5.accept(cov.d);
         $$7.a($$5);
      }

      if ($$1.a()) {
         if (this.l()) {
            $$2.add(wg.a("item.durability", this.n() - this.m(), this.n()));
         }

         $$2.add(wg.b(kr.h.b(this.f()).toString()).a(n.i));
         int $$8 = this.p.d();
         if ($$8 > 0) {
            $$2.add(wg.a("item.components", $$8).a(n.i));
         }
      }

      if ($$0 != null && !this.f().a($$0.dM().J())) {
         $$2.add(l);
      }

      return $$2;
   }

   private void a(Consumer<wg> $$0, @Nullable cjt $$1) {
      ctz $$2 = this.a(jp.i, ctz.a);
      if ($$2.c()) {
         for (bqc $$3 : bqc.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wf.a);
                  $$0.accept(wg.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wg> $$0, @Nullable cjt $$1, il<brq> $$2, brt $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a() == cre.e) {
            $$4 += $$1.h(brv.c);
            $$4 += (double)cwr.a(this, null);
            $$5 = true;
         } else if ($$3.a() == cre.f) {
            $$4 += $$1.h(brv.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.b() == brt.a.b || $$3.b() == brt.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(brv.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wf.a().b(wg.a("attribute.modifier.equals." + $$3.b().a(), ctz.d.format($$6), wg.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wg.a("attribute.modifier.plus." + $$3.b().a(), ctz.d.format($$6), wg.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(wg.a("attribute.modifier.take." + $$3.b().a(), ctz.d.format(-$$6), wg.c($$2.a().c())).a(n.m));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(jp.n);
      return $$0 != null ? $$0 : this.f().d_(this);
   }

   public csa y() {
      return this.f().p(this);
   }

   public boolean z() {
      if (!this.f().a(this)) {
         return false;
      } else {
         cwx $$0 = this.a(jp.f);
         return $$0 != null && $$0.d();
      }
   }

   public void a(cwq $$0, int $$1) {
      cwr.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(jp.f, cwx.a).d();
   }

   public boolean B() {
      return this.q instanceof cfw;
   }

   public void a(@Nullable bpv $$0) {
      if (!this.d()) {
         this.q = $$0;
      }
   }

   @Nullable
   public cfw C() {
      return this.q instanceof cfw ? (cfw)this.D() : null;
   }

   @Nullable
   public bpv D() {
      return !this.d() ? this.q : null;
   }

   public void a(bqc $$0, BiConsumer<il<brq>, brt> $$1) {
      ctz $$2 = this.a(jp.i, ctz.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.f().a($$0).forEach($$1);
      }
   }

   public wg E() {
      wu $$0 = wg.i().b(this.w());
      if (this.b(jp.d)) {
         $$0.a(n.u);
      }

      wu $$1 = wj.a((wg)$$0);
      if (!this.d()) {
         $$1.a(this.y().e).a($$0x -> $$0x.a(new wm(wm.a.b, new wm.c(this))));
      }

      return $$1;
   }

   public boolean a(dpd $$0) {
      cov $$1 = this.a(jp.g);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dpd $$0) {
      cov $$1 = this.a(jp.h);
      return $$1 != null && $$1.a($$0);
   }

   public int F() {
      return this.n;
   }

   public void d(int $$0) {
      this.n = $$0;
   }

   public int G() {
      return this.d() ? 0 : this.m;
   }

   public void e(int $$0) {
      this.m = $$0;
   }

   public void f(int $$0) {
      this.e(this.G() + $$0);
   }

   public void g(int $$0) {
      this.f(-$$0);
   }

   public void a(int $$0, @Nullable bqo $$1) {
      if ($$1 == null || !$$1.fM()) {
         this.g($$0);
      }
   }

   public void b(cyx $$0, bqo $$1, int $$2) {
      this.f().a($$0, $$1, this, $$2);
   }

   public void a(cgd $$0) {
      this.f().a($$0);
   }

   public boolean H() {
      return this.f().y();
   }

   public aul I() {
      return this.f().al_();
   }

   public aul J() {
      return this.f().am_();
   }

   public aul K() {
      return this.f().e();
   }
}
