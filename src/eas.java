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

public abstract class eas implements cut {
   protected static final jb[] E = new jb[]{jb.e, jb.f, jb.c, jb.d, jb.a, jb.b};
   protected final boolean F;
   protected final float G;
   protected final boolean H;
   protected final duo I;
   protected final float J;
   protected final float K;
   protected final float L;
   protected final boolean M;
   protected final cuw N;
   protected final eas.d O;
   protected final Optional<alf<ezy>> P;
   protected final String Q;

   public eas(eas.d $$0) {
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

   public eas.d s() {
      return this.O;
   }

   protected abstract MapCodec<? extends dmr> a();

   protected static <B extends dmr> RecordCodecBuilder<B, eas.d> t() {
      return eas.d.a.fieldOf("properties").forGetter(eas::s);
   }

   public static <B extends dmr> MapCodec<B> b(Function<eas.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(eat $$0, djn $$1, iv $$2, int $$3, int $$4) {
   }

   protected boolean a(eat $$0, exp $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(djc.a, iv.c);
         case b:
            return $$0.y().a(axh.a);
         case c:
            return !$$0.m(djc.a, iv.c);
         default:
            return false;
      }
   }

   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$0;
   }

   protected boolean b(eat $$0, eat $$1, jb $$2) {
      return false;
   }

   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
   }

   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
   }

   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
   }

   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if (!$$0.l() && $$3.b() != djf.a.d) {
         dmr $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof crm;
         if ($$5.a($$3)) {
            dxr $$7 = $$0.x() ? $$1.c_($$2) : null;
            ezw.a $$8 = new ezw.a($$1).a(fcn.f, ffc.b($$2)).a(fcn.i, czn.k).b(fcn.h, $$7).b(fcn.a, $$3.d());
            if ($$3.b() == djf.a.c) {
               $$8.a(fcn.j, $$3.e());
            }

            $$0.a($$1, $$2, czn.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dmt.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      return bug.e;
   }

   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      return bug.f;
   }

   protected boolean a(eat $$0, djm $$1, iv $$2, int $$3, int $$4) {
      return false;
   }

   protected dte a_(eat $$0) {
      return dte.b;
   }

   protected boolean g_(eat $$0) {
      return false;
   }

   protected boolean f_(eat $$0) {
      return false;
   }

   protected exa b_(eat $$0) {
      return exb.a.g();
   }

   protected boolean c_(eat $$0) {
      return false;
   }

   protected float ao_() {
      return 0.25F;
   }

   protected float aq_() {
      return 0.2F;
   }

   @Override
   public cuw k() {
      return this.N;
   }

   protected eat a(eat $$0, dtl $$1) {
      return $$0;
   }

   protected eat a(eat $$0, dru $$1) {
      return $$0;
   }

   protected boolean a(eat $$0, ddg $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(eat $$0, ewz $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<czn> a(eat $$0, ezw.a $$1) {
      if (this.P.isEmpty()) {
         return Collections.emptyList();
      } else {
         ezw $$2 = $$1.a(fcn.g, $$0).a(fcm.r);
         arq $$3 = $$2.a();
         ezy $$4 = $$3.p().bc().b(this.P.get());
         return $$4.a($$2);
      }
   }

   protected long a(eat $$0, iv $$1) {
      return azm.a($$1);
   }

   protected ffw d_(eat $$0) {
      return $$0.f(djc.a, iv.c);
   }

   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      return this.b($$0, $$1, $$2, ffh.a());
   }

   protected ffw a(eat $$0, diq $$1, iv $$2) {
      return fft.a();
   }

   protected int i_(eat $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return null;
   }

   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return true;
   }

   protected float c(eat $$0, diq $$1, iv $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(eat $$0, djm $$1, iv $$2) {
      return 0;
   }

   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.b();
   }

   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.F ? $$0.f($$1, $$2) : fft.a();
   }

   protected ffw a(eat $$0, diq $$1, iv $$2, bwi $$3) {
      return fft.b();
   }

   protected boolean a_(eat $$0, diq $$1, iv $$2) {
      return dmr.a($$0.g($$1, $$2));
   }

   protected ffw c(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
   }

   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
   }

   protected float a(eat $$0, crm $$1, diq $$2, iv $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(eat $$0, arq $$1, iv $$2, czn $$3, boolean $$4) {
   }

   protected void a_(eat $$0, djm $$1, iv $$2, crm $$3) {
   }

   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return 0;
   }

   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
   }

   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return 0;
   }

   public final Optional<alf<ezy>> u() {
      return this.P;
   }

   public final String v() {
      return this.Q;
   }

   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
   }

   protected boolean e_(eat $$0) {
      return !dmr.a($$0.f(djc.a, iv.c)) && $$0.y().c();
   }

   protected boolean f(eat $$0) {
      return this.H;
   }

   protected duo h_(eat $$0) {
      return this.I;
   }

   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(this.h());
   }

   public abstract czj h();

   protected abstract dmr o();

   public exe w() {
      return this.O.b.apply(this.o().m());
   }

   public float x() {
      return this.O.g;
   }

   public abstract static class a extends eav<dmr, eat> {
      private static final jb[] a = jb.values();
      private static final ffw[] f = ag.a(new ffw[a.length], $$0 -> Arrays.fill($$0, fft.a()));
      private static final ffw[] g = ag.a(new ffw[a.length], $$0 -> Arrays.fill($$0, fft.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final exf n;
      private final exe o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final eas.f s;
      private final eas.f t;
      private final eas.f u;
      private final eas.f v;
      private final eas.f w;
      @Nullable
      private final eas.b x;
      private final boolean y;
      private final ebu z;
      private final boolean A;
      @Nullable
      private eas.a.a B;
      private exa C = exb.a.g();
      private boolean D;
      private boolean E;
      private ffw F;
      private ffw[] G;
      private boolean H;
      private int I;

      protected a(dmr $$0, Reference2ObjectArrayMap<ebw<?>, Comparable<?>> $$1, MapCodec<eat> $$2) {
         super($$0, $$1, $$2);
         eas.d $$3 = $$0.O;
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
            ffw $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fex $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new eas.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fft.a();
         this.E = dmr.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new ffw[a.length];

            for (jb $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dmr b() {
         return this.d;
      }

      public jf<dmr> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dmr $$0 = this.b();
         return $$0 != dmt.bz && $$0 != dmt.nE && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(diq $$0, iv $$1, bwr<?> $$2) {
         return this.b().O.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public ffw a(jb $$0) {
         return this.G[$$0.ordinal()];
      }

      public ffw h() {
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

      public exe a(diq $$0, iv $$1) {
         return this.o;
      }

      public eat a(dtl $$0) {
         return this.b().a(this.B(), $$0);
      }

      public eat a(dru $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dte o() {
         return this.b().a_(this.B());
      }

      public boolean b(diq $$0, iv $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(diq $$0, iv $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(diq $$0, iv $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(diq $$0, iv $$1, jb $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(djm $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(diq $$0, iv $$1) {
         return this.p;
      }

      public float a(crm $$0, diq $$1, iv $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(diq $$0, iv $$1, jb $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public exf r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(eat $$0, jb $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public ffw f(diq $$0, iv $$1) {
         return this.a($$0, $$1, ffh.a());
      }

      public ffw a(diq $$0, iv $$1, ffh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffw g(diq $$0, iv $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ffh.a());
      }

      public ffw b(diq $$0, iv $$1, ffh $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ffw a(diq $$0, iv $$1, bwi $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ffw h(diq $$0, iv $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public ffw c(diq $$0, iv $$1, ffh $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public ffw i(diq $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(diq $$0, iv $$1, bwi $$2) {
         return this.a($$0, $$1, $$2, jb.b);
      }

      public final boolean a(diq $$0, iv $$1, bwi $$2, jb $$3) {
         return dmr.a(this.b($$0, $$1, ffh.a($$2)), $$3);
      }

      public ffc a(iv $$0) {
         eas.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : ffc.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(djm $$0, iv $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djm $$0, iv $$1, dmr $$2, @Nullable eyi $$3, boolean $$4) {
         agm.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(djn $$0, iv $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(djn $$0, iv $$1, int $$2, int $$3) {
         iv.a $$4 = new iv.a();

         for (jb $$5 : eas.E) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(djn $$0, iv $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(djn $$0, iv $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djm $$0, iv $$1, eat $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iv $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arq $$0, iv $$1, djf $$2, BiConsumer<czn, iv> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iv $$1, azv $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arq $$0, iv $$1, azv $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(djm $$0, iv $$1, bwi $$2, bxb $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arq $$0, iv $$1, czn $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<czn> a(ezw.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bug a(czn $$0, djm $$1, crm $$2, buf $$3, fey $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bug a(djm $$0, crm $$1, fey $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(djm $$0, iv $$1, crm $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(diq $$0, iv $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(diq $$0, iv $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public eat a(djp $$0, dkb $$1, iv $$2, jb $$3, iv $$4, eat $$5, azv $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(exp $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ddg $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ewz $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(djp $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(diq $$0, iv $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bui b(djm $$0, iv $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axr<dmr> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axr<dmr> $$0, Predicate<eas.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jj<dmr> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jf<dmr> $$0) {
         return this.a($$0.a());
      }

      public Stream<axr<dmr>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dpl;
      }

      @Nullable
      public <T extends dxr> dxs<T> a(djm $$0, dxt<T> $$1) {
         return this.b() instanceof dpl ? ((dpl)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dmr $$0) {
         return this.b() == $$0;
      }

      public boolean a(alf<dmr> $$0) {
         return this.b().p().a($$0);
      }

      public exa y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public duo A() {
         return this.b().h_(this.B());
      }

      public void a(djm $$0, eat $$1, fey $$2, csh $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(diq $$0, iv $$1, jb $$2) {
         return this.a($$0, $$1, $$2, dvc.a);
      }

      public boolean a(diq $$0, iv $$1, jb $$2, dvc $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(diq $$0, iv $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public czn a(djp $$0, iv $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract eat B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public ebu E() {
         return this.z;
      }

      static final class a {
         private static final jb[] d = jb.values();
         private static final int e = dvc.values().length;
         protected final ffw a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(eat $$0) {
            dmr $$1 = $$0.b();
            this.a = $$1.b($$0, djc.a, iv.c, ffh.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mg.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jb.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jb $$2 : d) {
                  for (dvc $$3 : dvc.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, djc.a, iv.c, $$2);
                  }
               }

               this.c = dmr.a($$0.g(djc.a, iv.c));
            }
         }

         public boolean a(jb $$0, dvc $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jb $$0, dvc $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ffc evaluate(eat var1, iv var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<eas.d> a = Codec.unit(() -> a());
      Function<eat, exe> b = $$0 -> exe.a;
      boolean c = true;
      duo d = duo.f;
      ToIntFunction<eat> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alf<dmr> m;
      private aky<dmr, Optional<alf<ezy>>> n = $$0 -> Optional.of(alf.a(mh.br, $$0.a().f("blocks/")));
      private aky<dmr, String> o = $$0 -> ag.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      exf v = exf.a;
      boolean w = true;
      ebu x = ebu.a;
      boolean y;
      eas.e<bwr<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jb.b) && $$0.k() < 14;
      eas.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      eas.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      eas.f C = this.B;
      eas.f D = ($$0, $$1, $$2) -> false;
      eas.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cuw G = cuy.g;
      @Nullable
      eas.b H;

      private d() {
      }

      public static eas.d a() {
         return new eas.d();
      }

      public static eas.d a(eas $$0) {
         eas.d $$1 = b($$0);
         eas.d $$2 = $$0.O;
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
      public static eas.d b(eas $$0) {
         eas.d $$1 = new eas.d();
         eas.d $$2 = $$0.O;
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

      public eas.d a(cyl $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public eas.d a(exe $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public eas.d a(Function<eat, exe> $$0) {
         this.b = $$0;
         return this;
      }

      public eas.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public eas.d c() {
         this.p = false;
         return this;
      }

      public eas.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public eas.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public eas.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public eas.d a(duo $$0) {
         this.d = $$0;
         return this;
      }

      public eas.d a(ToIntFunction<eat> $$0) {
         this.e = $$0;
         return this;
      }

      public eas.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public eas.d d() {
         return this.d(0.0F);
      }

      public eas.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public eas.d e() {
         this.i = true;
         return this;
      }

      public eas.d f() {
         this.F = true;
         return this;
      }

      public eas.d g() {
         this.n = aky.fixed(Optional.empty());
         return this;
      }

      public eas.d a(Optional<alf<ezy>> $$0) {
         this.n = aky.fixed($$0);
         return this;
      }

      protected Optional<alf<ezy>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public eas.d i() {
         this.r = true;
         return this;
      }

      public eas.d j() {
         this.s = true;
         return this;
      }

      public eas.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public eas.d l() {
         this.t = true;
         return this;
      }

      public eas.d a(exf $$0) {
         this.v = $$0;
         return this;
      }

      public eas.d m() {
         this.q = true;
         return this;
      }

      public eas.d a(eas.e<bwr<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public eas.d a(eas.f $$0) {
         this.A = $$0;
         return this;
      }

      public eas.d b(eas.f $$0) {
         this.B = $$0;
         return this;
      }

      public eas.d c(eas.f $$0) {
         this.C = $$0;
         return this;
      }

      public eas.d d(eas.f $$0) {
         this.D = $$0;
         return this;
      }

      public eas.d e(eas.f $$0) {
         this.E = $$0;
         return this;
      }

      public eas.d n() {
         this.h = true;
         return this;
      }

      public eas.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public eas.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public eas.d a(eas.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dmr $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ao_();
            double $$5 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new ffc($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dmr $$2 = $$0x.b();
            long $$3 = azm.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.aq_();
            float $$5 = $$2.ao_();
            double $$6 = azm.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azm.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new ffc($$6, $$4, $$7);
         };
         };
         return this;
      }

      public eas.d o() {
         this.w = false;
         return this;
      }

      public eas.d a(cuu... $$0) {
         this.G = cuy.e.a($$0);
         return this;
      }

      public eas.d a(ebu $$0) {
         this.x = $$0;
         return this;
      }

      public eas.d p() {
         this.y = true;
         return this;
      }

      public eas.d a(alf<dmr> $$0) {
         this.m = $$0;
         return this;
      }

      public eas.d a(String $$0) {
         this.o = aky.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(eat var1, diq var2, iv var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(eat var1, diq var2, iv var3);
   }
}
