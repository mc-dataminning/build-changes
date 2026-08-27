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

public final class crs implements jm {
   private static final Codec<in<crn>> j = awu.b(
      kt.h.r(),
      (Function<in<crn>, DataResult<in<crn>>>)($$0 -> $$0.a(crv.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<crs> a = awu.a(
      (Supplier<Codec<crs>>)(() -> awu.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(
                        j.fieldOf("id").forGetter(crs::g),
                        awu.j.fieldOf("count").orElse(1).forGetter(crs::G),
                        awu.a(jo.b, "components", jo.a).forGetter($$0x -> $$0x.p.f())
                     )
                     .apply($$0, crs::new)
            ),
            crs::b
         ))
   );
   public static final Codec<crs> b = awu.a(
      (Supplier<Codec<crs>>)(() -> awu.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(j.fieldOf("id").forGetter(crs::g), awu.a(jo.b, "components", jo.a).forGetter($$0x -> $$0x.p.f()))
                     .apply($$0, ($$0x, $$1) -> new crs($$0x, 1, $$1))
            ),
            crs::b
         ))
   );
   public static final Codec<crs> c = awu.e(a).xmap($$0 -> $$0.orElse(crs.i), $$0 -> $$0.d() ? Optional.empty() : Optional.of($$0));
   public static final Codec<crs> d = j.xmap(crs::new, crs::g);
   public static final yg<vt, crs> e = new yg<vt, crs>() {
      private static final yg<vt, in<crn>> a = ye.b(ku.G);

      public crs a(vt $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return crs.i;
         } else {
            in<crn> $$2 = a.decode($$0);
            jo $$3 = jo.c.decode($$0);
            return new crs($$2, $$1, $$3);
         }
      }

      public void a(vt $$0, crs $$1) {
         if ($$1.d()) {
            $$0.c(0);
         } else {
            $$0.c($$1.G());
            a.encode($$0, $$1.g());
            jo.c.encode($$0, $$1.p.f());
         }
      }
   };
   public static final yg<vt, crs> f = new yg<vt, crs>() {
      public crs a(vt $$0) {
         crs $$1 = crs.e.decode($$0);
         if ($$1.d()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(vt $$0, crs $$1) {
         if ($$1.d()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            crs.e.encode($$0, $$1);
         }
      }
   };
   public static final yg<vt, List<crs>> g = e.a(ye.a(iw::a));
   public static final yg<vt, List<crs>> h = f.a(ye.a(iw::a));
   private static final Logger k = LogUtils.getLogger();
   public static final crs i = new crs((Void)null);
   private static final wi l = wi.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final crn o;
   final js p;
   @Nullable
   private bqa q;

   private static DataResult<crs> b(crs $$0) {
      return $$0.G() > $$0.i()
         ? DataResult.error(() -> "Item stack with stack size of " + $$0.G() + " was larger than maximum: " + $$0.i()).setPartial(() -> $$0.c($$0.i()))
         : DataResult.success($$0);
   }

   public Optional<cpc> b() {
      return this.f().h(this);
   }

   @Override
   public jn a() {
      return (jn)(!this.d() ? this.p : jn.a);
   }

   public jo c() {
      return !this.d() ? this.p.f() : jo.a;
   }

   public crs(czf $$0) {
      this($$0, 1);
   }

   public crs(in<crn> $$0) {
      this($$0.a(), 1);
   }

   public crs(in<crn> $$0, int $$1, jo $$2) {
      this($$0.a(), $$1, js.a($$0.a().o(), $$2));
   }

   public crs(in<crn> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public crs(czf $$0, int $$1) {
      this($$0, $$1, new js($$0.p().o()));
   }

   private crs(czf $$0, int $$1, js $$2) {
      this.o = $$0.p();
      this.m = $$1;
      this.p = $$2;
      this.f().n(this);
   }

   private crs(@Nullable Void $$0) {
      this.o = null;
      this.p = new js(jn.a);
   }

   public static Optional<crs> a(ip.a $$0, ul $$1) {
      return a.parse($$0.a(uc.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static crs a(ip.a $$0, to $$1) {
      return $$1.g() ? i : a($$0, (ul)$$1).orElse(i);
   }

   public boolean d() {
      return this == i || this.o == crv.a || this.m <= 0;
   }

   public boolean a(cmn $$0) {
      return this.d() || this.f().a($$0);
   }

   public crs a(int $$0) {
      int $$1 = Math.min($$0, this.G());
      crs $$2 = this.c($$1);
      this.g($$1);
      return $$2;
   }

   public crs e() {
      if (this.d()) {
         return i;
      } else {
         crs $$0 = this.r();
         this.e(0);
         return $$0;
      }
   }

   public crn f() {
      return this.d() ? crv.a : this.o;
   }

   public in<crn> g() {
      return this.f().n();
   }

   public boolean a(avt<crn> $$0) {
      return this.f().n().a($$0);
   }

   public boolean a(crn $$0) {
      return this.f() == $$0;
   }

   public boolean a(Predicate<in<crn>> $$0) {
      return $$0.test(this.f().n());
   }

   public boolean a(in<crn> $$0) {
      return this.f().n() == $$0;
   }

   public boolean a(ir<crn> $$0) {
      return $$0.a(this.g());
   }

   public Stream<avt<crn>> h() {
      return this.f().n().c();
   }

   public bof a(cuz $$0) {
      cka $$1 = $$0.o();
      id $$2 = $$0.a();
      if ($$1 != null && !$$1.ga().e && !this.a(new dpm($$0.q(), $$2, false))) {
         return bof.d;
      } else {
         crn $$3 = this.f();
         bof $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(auz.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dpi $$0) {
      return this.f().a(this, $$0);
   }

   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      return this.f().a($$0, $$1, $$2);
   }

   public crs a(czg $$0, bqt $$1) {
      return this.f().a(this, $$0, $$1);
   }

   public ul b(ip.a $$0, ul $$1) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encode(this, $$0.a(uc.a), $$1), IllegalStateException::new);
      }
   }

   public ul a(ip.a $$0) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encodeStart($$0.a(uc.a), this), IllegalStateException::new);
      }
   }

   public ul b(ip.a $$0) {
      return (ul)(this.d() ? new to() : this.b($$0, new to()));
   }

   public int i() {
      return this.f().q();
   }

   public boolean j() {
      return this.i() > 1 && (!this.k() || !this.l());
   }

   public boolean k() {
      return !this.d() && this.f().s() ? !this.b(jr.c) && this.b(jr.b) : false;
   }

   public boolean l() {
      return this.k() && this.m() > 0;
   }

   public int m() {
      return axm.a(this.a(jr.b, Integer.valueOf(0)), 0, this.n());
   }

   public void b(int $$0) {
      this.b(jr.b, Integer.valueOf(axm.a($$0, 0, this.n())));
   }

   public int n() {
      return this.f().r();
   }

   public void a(int $$0, axt $$1, @Nullable apv $$2, Runnable $$3) {
      if (this.k()) {
         if ($$0 > 0) {
            int $$4 = cxa.a(cxc.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (cwx.a(this, $$4, $$1)) {
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

   public void a(int $$0, bqt $$1, bqh $$2) {
      if (!$$1.dM().B) {
         if ($$1 instanceof cka $$3 && $$3.fM()) {
            return;
         }

         this.a($$0, $$1.ei(), $$1 instanceof apv $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            crn $$2x = this.f();
            this.g(1);
            if ($$1 instanceof cka) {
               ((cka)$$1).b(auz.d.b($$2x));
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

   public boolean a(cos $$0, cne $$1, cka $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public boolean a(crs $$0, cos $$1, cne $$2, cka $$3, brk $$4) {
      return this.f().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bqt $$0, cka $$1) {
      crn $$2 = this.f();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(auz.c.b($$2));
      }
   }

   public void a(czg $$0, dpi $$1, id $$2, cka $$3) {
      crn $$4 = this.f();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(auz.c.b($$4));
      }
   }

   public boolean b(dpi $$0) {
      return this.f().a_($$0);
   }

   public bof a(cka $$0, bqt $$1, boe $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public crs r() {
      if (this.d()) {
         return i;
      } else {
         crs $$0 = new crs(this.f(), this.m, this.p.g());
         $$0.d(this.F());
         return $$0;
      }
   }

   public crs c(int $$0) {
      if (this.d()) {
         return i;
      } else {
         crs $$1 = this.r();
         $$1.e($$0);
         return $$1;
      }
   }

   public crs a(czf $$0, int $$1) {
      return this.d() ? i : this.b($$0, $$1);
   }

   public crs b(czf $$0, int $$1) {
      return new crs($$0.p().n(), $$1, this.p.f());
   }

   public static boolean a(crs $$0, crs $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.G() != $$1.G() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<crs> $$0, List<crs> $$1) {
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

   public static boolean b(crs $$0, crs $$1) {
      return $$0.a($$1.f());
   }

   public static boolean c(crs $$0, crs $$1) {
      if (!$$0.a($$1.f())) {
         return false;
      } else {
         return $$0.d() && $$1.d() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<crs> a(String $$0) {
      return a.optionalFieldOf($$0).xmap($$0x -> $$0x.orElse(i), $$0x -> $$0x.d() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable crs $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.f().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<crs> $$0) {
      int $$1 = 0;

      for (crs $$2 : $$0) {
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

   public void a(czg $$0, bqa $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.f() != null) {
         this.f().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(czg $$0, cka $$1, int $$2) {
      $$1.a(auz.b.b(this.f()), $$2);
      this.f().b(this, $$0, $$1);
   }

   public void a(czg $$0) {
      this.f().a(this, $$0);
   }

   public int t() {
      return this.f().b(this);
   }

   public ctk u() {
      return this.f().c(this);
   }

   public void a(czg $$0, bqt $$1, int $$2) {
      this.f().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.f().m(this);
   }

   @Nullable
   public <T> T b(jq<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(jq<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(jq<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(jq<? extends T> $$0) {
      return this.p.d($$0);
   }

   public void a(jo $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public void a(jn $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public wi w() {
      wi $$0 = this.a(jr.d);
      return $$0 != null ? $$0 : this.f().o(this);
   }

   private <T extends cus> void a(jq<T> $$0, Consumer<wi> $$1, cti $$2) {
      T $$3 = (T)this.a($$0);
      if ($$3 != null) {
         $$3.a($$1, $$2);
      }
   }

   public List<wi> a(@Nullable cka $$0, cti $$1) {
      List<wi> $$2 = Lists.newArrayList();
      ww $$3 = wi.i().b(this.w()).a(this.y().e);
      if (this.b(jr.d)) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.b(jr.d) && this.a(crv.rT)) {
         emm $$4 = this.a(jr.s);
         if ($$4 != null) {
            $$2.add(crz.a($$4));
         }
      }

      Consumer<wi> $$5 = $$2::add;
      if (!this.b(jr.k)) {
         this.f().a(this, $$0 == null ? null : $$0.dM(), $$2, $$1);
      }

      this.a(jr.B, $$5, $$1);
      this.a(jr.p, $$5, $$1);
      this.a(jr.f, $$5, $$1);
      this.a(jr.q, $$5, $$1);
      this.a(jr.e, $$5, $$1);
      this.a($$5, $$0);
      this.a(jr.c, $$5, $$1);
      cpe $$6 = this.a(jr.h);
      if ($$6 != null && $$6.a()) {
         $$5.accept(wh.a);
         $$5.accept(cpe.c);
         $$6.a($$5);
      }

      cpe $$7 = this.a(jr.g);
      if ($$7 != null && $$7.a()) {
         $$5.accept(wh.a);
         $$5.accept(cpe.d);
         $$7.a($$5);
      }

      if ($$1.a()) {
         if (this.l()) {
            $$2.add(wi.a("item.durability", this.n() - this.m(), this.n()));
         }

         $$2.add(wi.b(kt.h.b(this.f()).toString()).a(n.i));
         int $$8 = this.p.d();
         if ($$8 > 0) {
            $$2.add(wi.a("item.components", $$8).a(n.i));
         }
      }

      if ($$0 != null && !this.f().a($$0.dM().J())) {
         $$2.add(l);
      }

      return $$2;
   }

   private void a(Consumer<wi> $$0, @Nullable cka $$1) {
      cui $$2 = this.a(jr.i, cui.a);
      if ($$2.c()) {
         for (bqh $$3 : bqh.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wh.a);
                  $$0.accept(wi.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wi> $$0, @Nullable cka $$1, in<brv> $$2, bry $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == crn.e) {
            $$4 += $$1.h(bsa.c);
            $$4 += (double)cxa.a(this, null);
            $$5 = true;
         } else if ($$3.b() == crn.f) {
            $$4 += $$1.h(bsa.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == bry.a.b || $$3.e() == bry.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bsa.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wh.a().b(wi.a("attribute.modifier.equals." + $$3.e().a(), cui.d.format($$6), wi.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wi.a("attribute.modifier.plus." + $$3.e().a(), cui.d.format($$6), wi.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(wi.a("attribute.modifier.take." + $$3.e().a(), cui.d.format(-$$6), wi.c($$2.a().c())).a(n.m));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(jr.n);
      return $$0 != null ? $$0 : this.f().d_(this);
   }

   public csj y() {
      return this.f().p(this);
   }

   public boolean z() {
      if (!this.f().a(this)) {
         return false;
      } else {
         cxg $$0 = this.a(jr.f);
         return $$0 != null && $$0.d();
      }
   }

   public void a(cwz $$0, int $$1) {
      cxa.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(jr.f, cxg.a).d();
   }

   public boolean B() {
      return this.q instanceof cgd;
   }

   public void a(@Nullable bqa $$0) {
      if (!this.d()) {
         this.q = $$0;
      }
   }

   @Nullable
   public cgd C() {
      return this.q instanceof cgd ? (cgd)this.D() : null;
   }

   @Nullable
   public bqa D() {
      return !this.d() ? this.q : null;
   }

   public void a(bqh $$0, BiConsumer<in<brv>, bry> $$1) {
      cui $$2 = this.a(jr.i, cui.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.f().a($$0).forEach($$1);
      }
   }

   public wi E() {
      ww $$0 = wi.i().b(this.w());
      if (this.b(jr.d)) {
         $$0.a(n.u);
      }

      ww $$1 = wl.a((wi)$$0);
      if (!this.d()) {
         $$1.a(this.y().e).a($$0x -> $$0x.a(new wo(wo.a.b, new wo.c(this))));
      }

      return $$1;
   }

   public boolean a(dpm $$0) {
      cpe $$1 = this.a(jr.g);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dpm $$0) {
      cpe $$1 = this.a(jr.h);
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

   public void a(int $$0, @Nullable bqt $$1) {
      if ($$1 == null || !$$1.fM()) {
         this.g($$0);
      }
   }

   public void b(czg $$0, bqt $$1, int $$2) {
      this.f().a($$0, $$1, this, $$2);
   }

   public void a(cgk $$0) {
      this.f().a($$0);
   }

   public boolean H() {
      return this.f().y();
   }

   public aun I() {
      return this.f().ak_();
   }

   public aun J() {
      return this.f().al_();
   }

   public aun K() {
      return this.f().e();
   }
}
