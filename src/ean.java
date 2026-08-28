import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ean implements cuq {
   protected static final jb[] E = new jb[]{jb.e, jb.f, jb.c, jb.d, jb.a, jb.b};
   protected final boolean F;
   protected final float G;
   protected final boolean H;
   protected final duj I;
   protected final float J;
   protected final float K;
   protected final float L;
   protected final boolean M;
   protected final cut N;
   protected final ean.d O;
   protected final Optional<alf<ezt>> P;
   protected final String Q;

   public ean(ean.d $$0) {
      this.F = $$0.c;
      this.P = $$0.h();
      this.Q = $$0.q();
      this.G = $$0.f;
      this.H = $$0.i;
      this.I = $$0.d;
      this.J = $$0.j;
      this.K = $$0.k;
      this.L = $$0.l;
      this.M = $$0.F;
      this.N = $$0.G;
      this.O = $$0;
   }

   public ean.d s() {
      return this.O;
   }

   protected abstract MapCodec<? extends dmm> a();

   protected static <B extends dmm> RecordCodecBuilder<B, ean.d> t() {
      return ean.d.a.fieldOf("properties").forGetter(ean::s);
   }

   public static <B extends dmm> MapCodec<B> b(Function<ean.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(eao $$0, dji $$1, iv $$2, int $$3, int $$4) {
   }

   protected boolean a(eao $$0, exk $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dix.a, iv.c);
         case b:
            return $$0.y().a(axh.a);
         case c:
            return !$$0.m(dix.a, iv.c);
         default:
            return false;
      }
   }

   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$0;
   }

   protected boolean b(eao $$0, eao $$1, jb $$2) {
      return false;
   }

   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
   }

   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
   }

   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
   }

   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      if (!$$0.l() && $$3.b() != dja.a.d) {
         dmm $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof crj;
         if ($$5.a($$3)) {
            dxm $$7 = $$0.x() ? $$1.c_($$2) : null;
            ezr.a $$8 = new ezr.a($$1).a(fci.f, fex.b($$2)).a(fci.i, czk.k).b(fci.h, $$7).b(fci.a, $$3.d());
            if ($$3.b() == dja.a.c) {
               $$8.a(fci.j, $$3.e());
            }

            $$0.a($$1, $$2, czk.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dmo.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      return bug.e;
   }

   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      return bug.f;
   }

   protected boolean a(eao $$0, djh $$1, iv $$2, int $$3, int $$4) {
      return false;
   }

   protected dsz a_(eao $$0) {
      return dsz.b;
   }

   protected boolean g_(eao $$0) {
      return false;
   }

   protected boolean f_(eao $$0) {
      return false;
   }

   protected ewv b_(eao $$0) {
      return eww.a.g();
   }

   protected boolean c_(eao $$0) {
      return false;
   }

   protected float ao_() {
      return 0.25F;
   }

   protected float aq_() {
      return 0.2F;
   }

   @Override
   public cut k() {
      return this.N;
   }

   protected eao a(eao $$0, dtg $$1) {
      return $$0;
   }

   protected eao a(eao $$0, drp $$1) {
      return $$0;
   }

   protected boolean a(eao $$0, ddd $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(eao $$0, ewu $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<czk> a(eao $$0, ezr.a $$1) {
      if (this.P.isEmpty()) {
         return Collections.emptyList();
      } else {
         ezr $$2 = $$1.a(fci.g, $$0).a(fch.r);
         arq $$3 = $$2.a();
         ezt $$4 = $$3.p().bc().b(this.P.get());
         return $$4.a($$2);
      }
   }

   protected long a(eao $$0, iv $$1) {
      return azm.a($$1);
   }

   protected ffr d_(eao $$0) {
      return $$0.f(dix.a, iv.c);
   }

   protected ffr b_(eao $$0, din $$1, iv $$2) {
      return this.b($$0, $$1, $$2, ffc.a());
   }

   protected ffr a(eao $$0, din $$1, iv $$2) {
      return ffo.a();
   }

   protected int i_(eao $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return null;
   }

   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return true;
   }

   protected float c(eao $$0, din $$1, iv $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(eao $$0, djh $$1, iv $$2) {
      return 0;
   }

   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.b();
   }

   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.F ? $$0.f($$1, $$2) : ffo.a();
   }

   protected ffr a(eao $$0, din $$1, iv $$2, bwi $$3) {
      return ffo.b();
   }

   protected boolean a_(eao $$0, din $$1, iv $$2) {
      return dmm.a($$0.g($$1, $$2));
   }

   protected ffr c(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
   }

   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
   }

   protected float a(eao $$0, crj $$1, din $$2, iv $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(eao $$0, arq $$1, iv $$2, czk $$3, boolean $$4) {
   }

   protected void a_(eao $$0, djh $$1, iv $$2, crj $$3) {
   }

   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return 0;
   }

   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
   }

   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return 0;
   }

   public final Optional<alf<ezt>> u() {
      return this.P;
   }

   public final String v() {
      return this.Q;
   }

   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
   }

   protected boolean e_(eao $$0) {
      return !dmm.a($$0.f(dix.a, iv.c)) && $$0.y().c();
   }

   protected boolean f(eao $$0) {
      return this.H;
   }

   protected duj h_(eao $$0) {
      return this.I;
   }

   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(this.h());
   }

   public abstract czg h();

   protected abstract dmm o();

   public ewz w() {
      return this.O.b.apply(this.o().m());
   }

   public float x() {
      return this.O.g;
   }

   public abstract static class a extends eaq<dmm, eao> {
      private static final jb[] a = jb.values();
      private static final ffr[] f = ag.a(new ffr[a.length], $$0 -> Arrays.fill($$0, ffo.a()));
      private static final ffr[] g = ag.a(new ffr[a.length], $$0 -> Arrays.fill($$0, ffo.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final exa n;
      private final ewz o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final ean.f s;
      private final ean.f t;
      private final ean.f u;
      private final ean.f v;
      private final ean.f w;
      @Nullable
      private final ean.b x;
      private final boolean y;
      private final ebp z;
      private final boolean A;
      @Nullable
      private ean.a.a B;
      private ewv C = eww.a.g();
      private boolean D;
      private boolean E;
      private ffr F;
      private ffr[] G;
      private boolean H;
      private int I;

      protected a(dmm $$0, Reference2ObjectArrayMap<ebr<?>, Comparable<?>> $$1, MapCodec<eao> $$2) {
         super($$0, $$1, $$2);
         ean.d $$3 = $$0.O;
         this.h = $$3.e.applyAsInt(this.B());
         this.i = $$0.g_(this.B());
         this.j = $$3.q;
         this.k = $$3.r;
         this.l = $$3.s;
         this.n = $$3.v;
         this.o = $$3.b.apply(this.B());
         this.p = $$3.g;
         this.q = $$3.h;
         this.r = $$3.p;
         this.s = $$3.A;
         this.t = $$3.B;
         this.u = $$3.C;
         this.v = $$3.D;
         this.w = $$3.E;
         this.x = $$3.H;
         this.y = $$3.w;
         this.z = $$3.x;
         this.A = $$3.y;
      }

      private boolean H() {
         if (this.d.O.u) {
            return true;
         } else if (this.d.O.t) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            ffr $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fes $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new ean.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : ffo.a();
         this.E = dmm.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new ffr[a.length];

            for (jb $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dmm b() {
         return this.d;
      }

      public jf<dmm> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dmm $$0 = this.b();
         return $$0 != dmo.bz && $$0 != dmo.nE && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(din $$0, iv $$1, bwr<?> $$2) {
         return this.b().O.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public ffr a(jb $$0) {
         return this.G[$$0.ordinal()];
      }

      public ffr h() {
         return this.F;
      }

      public boolean i() {
         return this.B == null || this.B.b;
      }

      public boolean j() {
         return this.i;
      }

      public int k() {
         return this.h;
      }

      public boolean l() {
         return this.j;
      }

      public boolean m() {
         return this.k;
      }

      @Deprecated
      public boolean n() {
         return this.l;
      }

      public ewz a(din $$0, iv $$1) {
         return this.o;
      }

      public eao a(dtg $$0) {
         return this.b().a(this.B(), $$0);
      }

      public eao a(drp $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dsz o() {
         return this.b().a_(this.B());
      }

      public boolean b(din $$0, iv $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(din $$0, iv $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(din $$0, iv $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(din $$0, iv $$1, jb $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(djh $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(din $$0, iv $$1) {
         return this.p;
      }

      public float a(crj $$0, din $$1, iv $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(din $$0, iv $$1, jb $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public exa r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(eao $$0, jb $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public ffr f(din $$0, iv $$1) {
         return this.a($$0, $$1, ffc.a());
      }

      public ffr a(din $$0, iv $$1, ffc $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffr g(din $$0, iv $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ffc.a());
      }

      public ffr b(din $$0, iv $$1, ffc $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ffr a(din $$0, iv $$1, bwi $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffr h(din $$0, iv $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public ffr c(din $$0, iv $$1, ffc $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public ffr i(din $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(din $$0, iv $$1, bwi $$2) {
         return this.a($$0, $$1, $$2, jb.b);
      }

      public final boolean a(din $$0, iv $$1, bwi $$2, jb $$3) {
         return dmm.a(this.b($$0, $$1, ffc.a($$2)), $$3);
      }

      public fex a(iv $$0) {
         ean.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fex.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(djh $$0, iv $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djh $$0, iv $$1, dmm $$2, @Nullable eyd $$3, boolean $$4) {
         agm.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dji $$0, iv $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dji $$0, iv $$1, int $$2, int $$3) {
         iv.a $$4 = new iv.a();

         for (jb $$5 : ean.E) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dji $$0, iv $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dji $$0, iv $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djh $$0, iv $$1, eao $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iv $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arq $$0, iv $$1, dja $$2, BiConsumer<czk, iv> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iv $$1, azv $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arq $$0, iv $$1, azv $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(djh $$0, iv $$1, bwi $$2, bxb $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iv $$1, czk $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<czk> a(ezr.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bug a(czk $$0, djh $$1, crj $$2, buf $$3, fet $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bug a(djh $$0, crj $$1, fet $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(djh $$0, iv $$1, crj $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(din $$0, iv $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(din $$0, iv $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public eao a(djk $$0, djw $$1, iv $$2, jb $$3, iv $$4, eao $$5, azv $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(exk $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ddd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ewu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(djk $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(din $$0, iv $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bui b(djh $$0, iv $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axr<dmm> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axr<dmm> $$0, Predicate<ean.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jj<dmm> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jf<dmm> $$0) {
         return this.a($$0.a());
      }

      public Stream<axr<dmm>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dpg;
      }

      @Nullable
      public <T extends dxm> dxn<T> a(djh $$0, dxo<T> $$1) {
         return this.b() instanceof dpg ? ((dpg)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dmm $$0) {
         return this.b() == $$0;
      }

      public boolean a(alf<dmm> $$0) {
         return this.b().p().a($$0);
      }

      public ewv y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public duj A() {
         return this.b().h_(this.B());
      }

      public void a(djh $$0, eao $$1, fet $$2, cse $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(din $$0, iv $$1, jb $$2) {
         return this.a($$0, $$1, $$2, dux.a);
      }

      public boolean a(din $$0, iv $$1, jb $$2, dux $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(din $$0, iv $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public czk a(djk $$0, iv $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract eao B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public ebp E() {
         return this.z;
      }

      static final class a {
         private static final jb[] d = jb.values();
         private static final int e = dux.values().length;
         protected final ffr a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(eao $$0) {
            dmm $$1 = $$0.b();
            this.a = $$1.b($$0, dix.a, iv.c, ffc.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mg.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jb.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jb $$2 : d) {
                  for (dux $$3 : dux.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dix.a, iv.c, $$2);
                  }
               }

               this.c = dmm.a($$0.g(dix.a, iv.c));
            }
         }

         public boolean a(jb $$0, dux $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jb $$0, dux $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fex evaluate(eao var1, iv var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<ean.d> a = Codec.unit(() -> a());
      Function<eao, ewz> b = $$0 -> ewz.a;
      boolean c = true;
      duj d = duj.f;
      ToIntFunction<eao> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alf<dmm> m;
      private aky<dmm, Optional<alf<ezt>>> n = $$0 -> Optional.of(alf.a(mh.bq, $$0.a().f("blocks/")));
      private aky<dmm, String> o = $$0 -> ag.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      exa v = exa.a;
      boolean w = true;
      ebp x = ebp.a;
      boolean y;
      ean.e<bwr<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jb.b) && $$0.k() < 14;
      ean.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      ean.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      ean.f C = this.B;
      ean.f D = ($$0, $$1, $$2) -> false;
      ean.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cut G = cuv.g;
      @Nullable
      ean.b H;

      private d() {
      }

      public static ean.d a() {
         return new ean.d();
      }

      public static ean.d a(ean $$0) {
         ean.d $$1 = b($$0);
         ean.d $$2 = $$0.O;
         $$1.l = $$2.l;
         $$1.A = $$2.A;
         $$1.z = $$2.z;
         $$1.D = $$2.D;
         $$1.B = $$2.B;
         $$1.C = $$2.C;
         $$1.n = $$2.n;
         $$1.o = $$2.o;
         return $$1;
      }

      @Deprecated
      public static ean.d b(ean $$0) {
         ean.d $$1 = new ean.d();
         ean.d $$2 = $$0.O;
         $$1.g = $$2.g;
         $$1.f = $$2.f;
         $$1.c = $$2.c;
         $$1.i = $$2.i;
         $$1.e = $$2.e;
         $$1.b = $$2.b;
         $$1.d = $$2.d;
         $$1.j = $$2.j;
         $$1.k = $$2.k;
         $$1.F = $$2.F;
         $$1.p = $$2.p;
         $$1.q = $$2.q;
         $$1.r = $$2.r;
         $$1.s = $$2.s;
         $$1.t = $$2.t;
         $$1.u = $$2.u;
         $$1.v = $$2.v;
         $$1.h = $$2.h;
         $$1.H = $$2.H;
         $$1.w = $$2.w;
         $$1.G = $$2.G;
         $$1.E = $$2.E;
         $$1.x = $$2.x;
         $$1.y = $$2.y;
         return $$1;
      }

      public ean.d a(cyi $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public ean.d a(ewz $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public ean.d a(Function<eao, ewz> $$0) {
         this.b = $$0;
         return this;
      }

      public ean.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public ean.d c() {
         this.p = false;
         return this;
      }

      public ean.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public ean.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public ean.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public ean.d a(duj $$0) {
         this.d = $$0;
         return this;
      }

      public ean.d a(ToIntFunction<eao> $$0) {
         this.e = $$0;
         return this;
      }

      public ean.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public ean.d d() {
         return this.d(0.0F);
      }

      public ean.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public ean.d e() {
         this.i = true;
         return this;
      }

      public ean.d f() {
         this.F = true;
         return this;
      }

      public ean.d g() {
         this.n = aky.fixed(Optional.empty());
         return this;
      }

      public ean.d a(Optional<alf<ezt>> $$0) {
         this.n = aky.fixed($$0);
         return this;
      }

      protected Optional<alf<ezt>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public ean.d i() {
         this.r = true;
         return this;
      }

      public ean.d j() {
         this.s = true;
         return this;
      }

      public ean.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public ean.d l() {
         this.t = true;
         return this;
      }

      public ean.d a(exa $$0) {
         this.v = $$0;
         return this;
      }

      public ean.d m() {
         this.q = true;
         return this;
      }

      public ean.d a(ean.e<bwr<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public ean.d a(ean.f $$0) {
         this.A = $$0;
         return this;
      }

      public ean.d b(ean.f $$0) {
         this.B = $$0;
         return this;
      }

      public ean.d c(ean.f $$0) {
         this.C = $$0;
         return this;
      }

      public ean.d d(ean.f $$0) {
         this.D = $$0;
         return this;
      }

      public ean.d e(ean.f $$0) {
         this.E = $$0;
         return this;
      }

      public ean.d n() {
         this.h = true;
         return this;
      }

      public ean.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public ean.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public ean.d a(ean.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dmm $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ao_();
            double $$5 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fex($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dmm $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.aq_();
            float $$5 = $$2.ao_();
            double $$6 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fex($$6, $$4, $$7);
         };
         };
         return this;
      }

      public ean.d o() {
         this.w = false;
         return this;
      }

      public ean.d a(cur... $$0) {
         this.G = cuv.e.a($$0);
         return this;
      }

      public ean.d a(ebp $$0) {
         this.x = $$0;
         return this;
      }

      public ean.d p() {
         this.y = true;
         return this;
      }

      public ean.d a(alf<dmm> $$0) {
         this.m = $$0;
         return this;
      }

      public ean.d a(String $$0) {
         this.o = aky.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(eao var1, din var2, iv var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(eao var1, din var2, iv var3);
   }
}
