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

public abstract class dxu implements csq {
   protected static final jm[] aG = new jm[]{jm.e, jm.f, jm.c, jm.d, jm.a, jm.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dsc aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final cst aP;
   protected final dxu.d aQ;
   protected final Optional<aly<ewu>> aR;
   protected final String aS;

   public dxu(dxu.d $$0) {
      this.aH = $$0.c;
      this.aR = $$0.h();
      this.aS = $$0.q();
      this.aI = $$0.f;
      this.aJ = $$0.i;
      this.aK = $$0.d;
      this.aL = $$0.j;
      this.aM = $$0.k;
      this.aN = $$0.l;
      this.aO = $$0.F;
      this.aP = $$0.G;
      this.aQ = $$0;
   }

   public dxu.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dkm> a();

   protected static <B extends dkm> RecordCodecBuilder<B, dxu.d> t() {
      return dxu.d.a.fieldOf("properties").forGetter(dxu::s);
   }

   public static <B extends dkm> MapCodec<B> b(Function<dxu.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dxv $$0, dhj $$1, jh $$2, int $$3, int $$4) {
   }

   protected boolean a(dxv $$0, eum $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dgx.a, jh.c);
         case b:
            return $$0.y().a(aya.a);
         case c:
            return !$$0.m(dgx.a, jh.c);
         default:
            return false;
      }
   }

   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$0;
   }

   protected boolean b(dxv $$0, dxv $$1, jm $$2) {
      return false;
   }

   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
   }

   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
   }

   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      if (!$$0.l() && $$3.b() != dha.a.d) {
         dkm $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cpx;
         if ($$5.a($$3)) {
            dux $$7 = $$0.x() ? $$1.c_($$2) : null;
            ews.a $$8 = new ews.a($$1).a(ezj.f, fby.b($$2)).a(ezj.i, cxp.j).b(ezj.h, $$7).b(ezj.a, $$3.d());
            if ($$3.b() == dha.a.c) {
               $$8.a(ezj.j, $$3.e());
            }

            $$0.a($$1, $$2, cxp.j, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dko.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      return btj.e;
   }

   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      return btj.f;
   }

   protected boolean a(dxv $$0, dhi $$1, jh $$2, int $$3, int $$4) {
      return false;
   }

   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   protected boolean g_(dxv $$0) {
      return false;
   }

   protected boolean f_(dxv $$0) {
      return false;
   }

   protected etx b_(dxv $$0) {
      return ety.a.g();
   }

   protected boolean c_(dxv $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public cst i() {
      return this.aP;
   }

   protected dxv a(dxv $$0, drc $$1) {
      return $$0;
   }

   protected dxv a(dxv $$0, dpl $$1) {
      return $$0;
   }

   protected boolean a(dxv $$0, dbg $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dxv $$0, etw $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cxp> a(dxv $$0, ews.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         ews $$2 = $$1.a(ezj.g, $$0).a(ezi.r);
         ash $$3 = $$2.a();
         ewu $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dxv $$0, jh $$1) {
      return bae.a($$1);
   }

   protected fcs d_(dxv $$0) {
      return $$0.f(dgx.a, jh.c);
   }

   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      return this.b($$0, $$1, $$2, fcd.a());
   }

   protected fcs a(dxv $$0, dgn $$1, jh $$2) {
      return fcp.a();
   }

   protected int i_(dxv $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return null;
   }

   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return true;
   }

   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return 0;
   }

   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.b();
   }

   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.aH ? $$0.f($$1, $$2) : fcp.a();
   }

   protected boolean a_(dxv $$0, dgn $$1, jh $$2) {
      return dkm.a($$0.g($$1, $$2));
   }

   protected fcs c(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
   }

   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
   }

   protected float a(dxv $$0, cpx $$1, dgn $$2, jh $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dxv $$0, ash $$1, jh $$2, cxp $$3, boolean $$4) {
   }

   protected void a_(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
   }

   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return 0;
   }

   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
   }

   protected fcs a_(dxv $$0, dhi $$1, jh $$2) {
      return fcp.b();
   }

   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return 0;
   }

   public final Optional<aly<ewu>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
   }

   protected boolean e_(dxv $$0) {
      return !dkm.a($$0.f(dgx.a, jh.c)) && $$0.y().c();
   }

   protected boolean f(dxv $$0) {
      return this.aJ;
   }

   protected dsc h_(dxv $$0) {
      return this.aK;
   }

   public abstract cxl j();

   protected abstract dkm o();

   public eub w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dxx<dkm, dxv> {
      private static final jm[] a = jm.values();
      private static final fcs[] f = ae.a(new fcs[a.length], $$0 -> Arrays.fill($$0, fcp.a()));
      private static final fcs[] g = ae.a(new fcs[a.length], $$0 -> Arrays.fill($$0, fcp.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final euc n;
      private final eub o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dxu.f s;
      private final dxu.f t;
      private final dxu.f u;
      private final dxu.f v;
      private final dxu.f w;
      @Nullable
      private final dxu.b x;
      private final boolean y;
      private final dyv z;
      private final boolean A;
      @Nullable
      private dxu.a.a B;
      private etx C = ety.a.g();
      private boolean D;
      private boolean E;
      private fcs F;
      private fcs[] G;
      private boolean H;
      private int I;

      protected a(dkm $$0, Reference2ObjectArrayMap<dyx<?>, Comparable<?>> $$1, MapCodec<dxv> $$2) {
         super($$0, $$1, $$2);
         dxu.d $$3 = $$0.aQ;
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
         if (this.d.aQ.u) {
            return true;
         } else if (this.d.aQ.t) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            fcs $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fbt $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dxu.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fcp.a();
         this.E = dkm.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fcs[a.length];

            for (jm $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dkm b() {
         return this.d;
      }

      public jq<dkm> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dkm $$0 = this.b();
         return $$0 != dko.bz && $$0 != dko.nt && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dgn $$0, jh $$1, bvr<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fcs a(jm $$0) {
         return this.G[$$0.ordinal()];
      }

      public fcs h() {
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

      public eub a(dgn $$0, jh $$1) {
         return this.o;
      }

      public dxv a(drc $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dxv a(dpl $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dqv o() {
         return this.b().a_(this.B());
      }

      public boolean b(dgn $$0, jh $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dgn $$0, jh $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dgn $$0, jh $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dgn $$0, jh $$1, jm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dhi $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dgn $$0, jh $$1) {
         return this.p;
      }

      public float a(cpx $$0, dgn $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dgn $$0, jh $$1, jm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public euc r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dxv $$0, jm $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fcs f(dgn $$0, jh $$1) {
         return this.a($$0, $$1, fcd.a());
      }

      public fcs a(dgn $$0, jh $$1, fcd $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcs g(dgn $$0, jh $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fcd.a());
      }

      public fcs b(dgn $$0, jh $$1, fcd $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fcs h(dgn $$0, jh $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fcs c(dgn $$0, jh $$1, fcd $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fcs i(dgn $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dgn $$0, jh $$1, bvk $$2) {
         return this.a($$0, $$1, $$2, jm.b);
      }

      public final boolean a(dgn $$0, jh $$1, bvk $$2, jm $$3) {
         return dkm.a(this.b($$0, $$1, fcd.a($$2)), $$3);
      }

      public fby a(jh $$0) {
         dxu.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fby.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dhi $$0, jh $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dhi $$0, jh $$1, dkm $$2, @Nullable evf $$3, boolean $$4) {
         ahj.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dhj $$0, jh $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dhj $$0, jh $$1, int $$2, int $$3) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : dxu.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dhj $$0, jh $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dhj $$0, jh $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dhi $$0, jh $$1, dxv $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dhi $$0, jh $$1, dxv $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ash $$0, jh $$1, dha $$2, BiConsumer<cxp, jh> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ash $$0, jh $$1, bam $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(ash $$0, jh $$1, bam $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dhi $$0, jh $$1, bvk $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcs b(dhi $$0, jh $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(ash $$0, jh $$1, cxp $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cxp> a(ews.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public btj a(cxp $$0, dhi $$1, cpx $$2, bti $$3, fbu $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public btj a(dhi $$0, cpx $$1, fbu $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dhi $$0, jh $$1, cpx $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dgn $$0, jh $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dgn $$0, jh $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dxv a(dhl $$0, dhx $$1, jh $$2, jm $$3, jh $$4, dxv $$5, bam $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eum $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dbg $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(etw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dhl $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dgn $$0, jh $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public btl c(dhi $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(ayk<dkm> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(ayk<dkm> $$0, Predicate<dxu.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ju<dkm> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jq<dkm> $$0) {
         return this.a($$0.a());
      }

      public Stream<ayk<dkm>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dng;
      }

      @Nullable
      public <T extends dux> duy<T> a(dhi $$0, duz<T> $$1) {
         return this.b() instanceof dng ? ((dng)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dkm $$0) {
         return this.b() == $$0;
      }

      public boolean a(aly<dkm> $$0) {
         return this.b().p().a($$0);
      }

      public etx y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dsc A() {
         return this.b().h_(this.B());
      }

      public void a(dhi $$0, dxv $$1, fbu $$2, cqq $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dgn $$0, jh $$1, jm $$2) {
         return this.a($$0, $$1, $$2, dsq.a);
      }

      public boolean a(dgn $$0, jh $$1, jm $$2, dsq $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dgn $$0, jh $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dxv B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dyv E() {
         return this.z;
      }

      static final class a {
         private static final jm[] d = jm.values();
         private static final int e = dsq.values().length;
         protected final fcs a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dxv $$0) {
            dkm $$1 = $$0.b();
            this.a = $$1.b($$0, dgx.a, jh.c, fcd.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ma.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jm.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jm $$2 : d) {
                  for (dsq $$3 : dsq.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dgx.a, jh.c, $$2);
                  }
               }

               this.c = dkm.a($$0.g(dgx.a, jh.c));
            }
         }

         public boolean a(jm $$0, dsq $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jm $$0, dsq $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fby evaluate(dxv var1, jh var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dxu.d> a = Codec.unit(() -> a());
      Function<dxv, eub> b = $$0 -> eub.a;
      boolean c = true;
      dsc d = dsc.f;
      ToIntFunction<dxv> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private aly<dkm> m;
      private alr<dkm, Optional<aly<ewu>>> n = $$0 -> Optional.of(aly.a(mb.bg, $$0.a().f("blocks/")));
      private alr<dkm, String> o = $$0 -> ae.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      euc v = euc.a;
      boolean w = true;
      dyv x = dyv.a;
      boolean y;
      dxu.e<bvr<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jm.b) && $$0.k() < 14;
      dxu.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dxu.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dxu.f C = this.B;
      dxu.f D = ($$0, $$1, $$2) -> false;
      dxu.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cst G = csv.h;
      @Nullable
      dxu.b H;

      private d() {
      }

      public static dxu.d a() {
         return new dxu.d();
      }

      public static dxu.d a(dxu $$0) {
         dxu.d $$1 = b($$0);
         dxu.d $$2 = $$0.aQ;
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
      public static dxu.d b(dxu $$0) {
         dxu.d $$1 = new dxu.d();
         dxu.d $$2 = $$0.aQ;
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

      public dxu.d a(cwm $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dxu.d a(eub $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dxu.d a(Function<dxv, eub> $$0) {
         this.b = $$0;
         return this;
      }

      public dxu.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dxu.d c() {
         this.p = false;
         return this;
      }

      public dxu.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dxu.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dxu.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dxu.d a(dsc $$0) {
         this.d = $$0;
         return this;
      }

      public dxu.d a(ToIntFunction<dxv> $$0) {
         this.e = $$0;
         return this;
      }

      public dxu.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dxu.d d() {
         return this.d(0.0F);
      }

      public dxu.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dxu.d e() {
         this.i = true;
         return this;
      }

      public dxu.d f() {
         this.F = true;
         return this;
      }

      public dxu.d g() {
         this.n = alr.fixed(Optional.empty());
         return this;
      }

      public dxu.d a(Optional<aly<ewu>> $$0) {
         this.n = alr.fixed($$0);
         return this;
      }

      protected Optional<aly<ewu>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dxu.d i() {
         this.r = true;
         return this;
      }

      public dxu.d j() {
         this.s = true;
         return this;
      }

      public dxu.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dxu.d l() {
         this.t = true;
         return this;
      }

      public dxu.d a(euc $$0) {
         this.v = $$0;
         return this;
      }

      public dxu.d m() {
         this.q = true;
         return this;
      }

      public dxu.d a(dxu.e<bvr<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dxu.d a(dxu.f $$0) {
         this.A = $$0;
         return this;
      }

      public dxu.d b(dxu.f $$0) {
         this.B = $$0;
         return this;
      }

      public dxu.d c(dxu.f $$0) {
         this.C = $$0;
         return this;
      }

      public dxu.d d(dxu.f $$0) {
         this.D = $$0;
         return this;
      }

      public dxu.d e(dxu.f $$0) {
         this.E = $$0;
         return this;
      }

      public dxu.d n() {
         this.h = true;
         return this;
      }

      public dxu.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dxu.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dxu.d a(dxu.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dkm $$2 = $$0x.b();
            long $$3 = bae.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = bae.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = bae.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fby($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dkm $$2 = $$0x.b();
            long $$3 = bae.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = bae.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = bae.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fby($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dxu.d o() {
         this.w = false;
         return this;
      }

      public dxu.d a(csr... $$0) {
         this.G = csv.f.a($$0);
         return this;
      }

      public dxu.d a(dyv $$0) {
         this.x = $$0;
         return this;
      }

      public dxu.d p() {
         this.y = true;
         return this;
      }

      public dxu.d a(aly<dkm> $$0) {
         this.m = $$0;
         return this;
      }

      public dxu.d a(String $$0) {
         this.o = alr.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dxv var1, dgn var2, jh var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dxv var1, dgn var2, jh var3);
   }
}
