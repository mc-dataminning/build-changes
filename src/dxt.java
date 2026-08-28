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

public abstract class dxt implements csp {
   protected static final jm[] aG = new jm[]{jm.e, jm.f, jm.c, jm.d, jm.a, jm.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dsb aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final css aP;
   protected final dxt.d aQ;
   protected final Optional<aly<ewt>> aR;
   protected final String aS;

   public dxt(dxt.d $$0) {
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

   public dxt.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dkl> a();

   protected static <B extends dkl> RecordCodecBuilder<B, dxt.d> t() {
      return dxt.d.a.fieldOf("properties").forGetter(dxt::s);
   }

   public static <B extends dkl> MapCodec<B> b(Function<dxt.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dxu $$0, dhi $$1, jh $$2, int $$3, int $$4) {
   }

   protected boolean a(dxu $$0, eul $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dgw.a, jh.c);
         case b:
            return $$0.y().a(aya.a);
         case c:
            return !$$0.m(dgw.a, jh.c);
         default:
            return false;
      }
   }

   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$0;
   }

   protected boolean b(dxu $$0, dxu $$1, jm $$2) {
      return false;
   }

   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
   }

   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
   }

   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dxu $$0, ash $$1, jh $$2, dgz $$3, BiConsumer<cxo, jh> $$4) {
      if (!$$0.l() && $$3.b() != dgz.a.d) {
         dkl $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cpw;
         if ($$5.a($$3)) {
            duw $$7 = $$0.x() ? $$1.c_($$2) : null;
            ewr.a $$8 = new ewr.a($$1).a(ezi.f, fbx.b($$2)).a(ezi.i, cxo.k).b(ezi.h, $$7).b(ezi.a, $$3.d());
            if ($$3.b() == dgz.a.c) {
               $$8.a(ezi.j, $$3.e());
            }

            $$0.a($$1, $$2, cxo.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dkn.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      return bti.e;
   }

   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      return bti.f;
   }

   protected boolean a(dxu $$0, dhh $$1, jh $$2, int $$3, int $$4) {
      return false;
   }

   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   protected boolean g_(dxu $$0) {
      return false;
   }

   protected boolean f_(dxu $$0) {
      return false;
   }

   protected etw b_(dxu $$0) {
      return etx.a.g();
   }

   protected boolean c_(dxu $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public css i() {
      return this.aP;
   }

   protected dxu a(dxu $$0, drb $$1) {
      return $$0;
   }

   protected dxu a(dxu $$0, dpk $$1) {
      return $$0;
   }

   protected boolean a(dxu $$0, dbf $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dxu $$0, etv $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cxo> a(dxu $$0, ewr.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         ewr $$2 = $$1.a(ezi.g, $$0).a(ezh.r);
         ash $$3 = $$2.a();
         ewt $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dxu $$0, jh $$1) {
      return bae.a($$1);
   }

   protected fcr d_(dxu $$0) {
      return $$0.f(dgw.a, jh.c);
   }

   protected fcr b_(dxu $$0, dgm $$1, jh $$2) {
      return this.b($$0, $$1, $$2, fcc.a());
   }

   protected fcr a(dxu $$0, dgm $$1, jh $$2) {
      return fco.a();
   }

   protected int i_(dxu $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return null;
   }

   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return true;
   }

   protected float c(dxu $$0, dgm $$1, jh $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return 0;
   }

   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.b();
   }

   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.aH ? $$0.f($$1, $$2) : fco.a();
   }

   protected boolean a_(dxu $$0, dgm $$1, jh $$2) {
      return dkl.a($$0.g($$1, $$2));
   }

   protected fcr c(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
   }

   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
   }

   protected float a(dxu $$0, cpw $$1, dgm $$2, jh $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dxu $$0, ash $$1, jh $$2, cxo $$3, boolean $$4) {
   }

   protected void a_(dxu $$0, dhh $$1, jh $$2, cpw $$3) {
   }

   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return 0;
   }

   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
   }

   protected fcr a_(dxu $$0, dhh $$1, jh $$2) {
      return fco.b();
   }

   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return 0;
   }

   public final Optional<aly<ewt>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
   }

   protected boolean e_(dxu $$0) {
      return !dkl.a($$0.f(dgw.a, jh.c)) && $$0.y().c();
   }

   protected boolean f(dxu $$0) {
      return this.aJ;
   }

   protected dsb h_(dxu $$0) {
      return this.aK;
   }

   public abstract cxk j();

   protected abstract dkl o();

   public eua w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dxw<dkl, dxu> {
      private static final jm[] a = jm.values();
      private static final fcr[] f = ae.a(new fcr[a.length], $$0 -> Arrays.fill($$0, fco.a()));
      private static final fcr[] g = ae.a(new fcr[a.length], $$0 -> Arrays.fill($$0, fco.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final eub n;
      private final eua o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dxt.f s;
      private final dxt.f t;
      private final dxt.f u;
      private final dxt.f v;
      private final dxt.f w;
      @Nullable
      private final dxt.b x;
      private final boolean y;
      private final dyu z;
      private final boolean A;
      @Nullable
      private dxt.a.a B;
      private etw C = etx.a.g();
      private boolean D;
      private boolean E;
      private fcr F;
      private fcr[] G;
      private boolean H;
      private int I;

      protected a(dkl $$0, Reference2ObjectArrayMap<dyw<?>, Comparable<?>> $$1, MapCodec<dxu> $$2) {
         super($$0, $$1, $$2);
         dxt.d $$3 = $$0.aQ;
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
            fcr $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fbs $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dxt.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fco.a();
         this.E = dkl.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fcr[a.length];

            for (jm $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dkl b() {
         return this.d;
      }

      public jq<dkl> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dkl $$0 = this.b();
         return $$0 != dkn.bz && $$0 != dkn.nt && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dgm $$0, jh $$1, bvq<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fcr a(jm $$0) {
         return this.G[$$0.ordinal()];
      }

      public fcr h() {
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

      public eua a(dgm $$0, jh $$1) {
         return this.o;
      }

      public dxu a(drb $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dxu a(dpk $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dqu o() {
         return this.b().a_(this.B());
      }

      public boolean b(dgm $$0, jh $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dgm $$0, jh $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dgm $$0, jh $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dgm $$0, jh $$1, jm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dhh $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dgm $$0, jh $$1) {
         return this.p;
      }

      public float a(cpw $$0, dgm $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dgm $$0, jh $$1, jm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public eub r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dxu $$0, jm $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fcr f(dgm $$0, jh $$1) {
         return this.a($$0, $$1, fcc.a());
      }

      public fcr a(dgm $$0, jh $$1, fcc $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcr g(dgm $$0, jh $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fcc.a());
      }

      public fcr b(dgm $$0, jh $$1, fcc $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fcr h(dgm $$0, jh $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fcr c(dgm $$0, jh $$1, fcc $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fcr i(dgm $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dgm $$0, jh $$1, bvj $$2) {
         return this.a($$0, $$1, $$2, jm.b);
      }

      public final boolean a(dgm $$0, jh $$1, bvj $$2, jm $$3) {
         return dkl.a(this.b($$0, $$1, fcc.a($$2)), $$3);
      }

      public fbx a(jh $$0) {
         dxt.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fbx.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dhh $$0, jh $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dhh $$0, jh $$1, dkl $$2, @Nullable eve $$3, boolean $$4) {
         ahj.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dhi $$0, jh $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dhi $$0, jh $$1, int $$2, int $$3) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : dxt.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dhi $$0, jh $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dhi $$0, jh $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dhh $$0, jh $$1, dxu $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dhh $$0, jh $$1, dxu $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ash $$0, jh $$1, dgz $$2, BiConsumer<cxo, jh> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ash $$0, jh $$1, bam $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(ash $$0, jh $$1, bam $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dhh $$0, jh $$1, bvj $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcr b(dhh $$0, jh $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(ash $$0, jh $$1, cxo $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cxo> a(ewr.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bti a(cxo $$0, dhh $$1, cpw $$2, bth $$3, fbt $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bti a(dhh $$0, cpw $$1, fbt $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dhh $$0, jh $$1, cpw $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dgm $$0, jh $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dgm $$0, jh $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dxu a(dhk $$0, dhw $$1, jh $$2, jm $$3, jh $$4, dxu $$5, bam $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eul $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dbf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(etv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dhk $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dgm $$0, jh $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public btk c(dhh $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(ayk<dkl> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(ayk<dkl> $$0, Predicate<dxt.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ju<dkl> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jq<dkl> $$0) {
         return this.a($$0.a());
      }

      public Stream<ayk<dkl>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dnf;
      }

      @Nullable
      public <T extends duw> dux<T> a(dhh $$0, duy<T> $$1) {
         return this.b() instanceof dnf ? ((dnf)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dkl $$0) {
         return this.b() == $$0;
      }

      public boolean a(aly<dkl> $$0) {
         return this.b().p().a($$0);
      }

      public etw y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dsb A() {
         return this.b().h_(this.B());
      }

      public void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dgm $$0, jh $$1, jm $$2) {
         return this.a($$0, $$1, $$2, dsp.a);
      }

      public boolean a(dgm $$0, jh $$1, jm $$2, dsp $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dgm $$0, jh $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dxu B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dyu E() {
         return this.z;
      }

      static final class a {
         private static final jm[] d = jm.values();
         private static final int e = dsp.values().length;
         protected final fcr a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dxu $$0) {
            dkl $$1 = $$0.b();
            this.a = $$1.b($$0, dgw.a, jh.c, fcc.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ma.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jm.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jm $$2 : d) {
                  for (dsp $$3 : dsp.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dgw.a, jh.c, $$2);
                  }
               }

               this.c = dkl.a($$0.g(dgw.a, jh.c));
            }
         }

         public boolean a(jm $$0, dsp $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jm $$0, dsp $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fbx evaluate(dxu var1, jh var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dxt.d> a = Codec.unit(() -> a());
      Function<dxu, eua> b = $$0 -> eua.a;
      boolean c = true;
      dsb d = dsb.f;
      ToIntFunction<dxu> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private aly<dkl> m;
      private alr<dkl, Optional<aly<ewt>>> n = $$0 -> Optional.of(aly.a(mb.bg, $$0.a().f("blocks/")));
      private alr<dkl, String> o = $$0 -> ae.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      eub v = eub.a;
      boolean w = true;
      dyu x = dyu.a;
      boolean y;
      dxt.e<bvq<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jm.b) && $$0.k() < 14;
      dxt.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dxt.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dxt.f C = this.B;
      dxt.f D = ($$0, $$1, $$2) -> false;
      dxt.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      css G = csu.h;
      @Nullable
      dxt.b H;

      private d() {
      }

      public static dxt.d a() {
         return new dxt.d();
      }

      public static dxt.d a(dxt $$0) {
         dxt.d $$1 = b($$0);
         dxt.d $$2 = $$0.aQ;
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
      public static dxt.d b(dxt $$0) {
         dxt.d $$1 = new dxt.d();
         dxt.d $$2 = $$0.aQ;
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

      public dxt.d a(cwl $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dxt.d a(eua $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dxt.d a(Function<dxu, eua> $$0) {
         this.b = $$0;
         return this;
      }

      public dxt.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dxt.d c() {
         this.p = false;
         return this;
      }

      public dxt.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dxt.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dxt.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dxt.d a(dsb $$0) {
         this.d = $$0;
         return this;
      }

      public dxt.d a(ToIntFunction<dxu> $$0) {
         this.e = $$0;
         return this;
      }

      public dxt.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dxt.d d() {
         return this.d(0.0F);
      }

      public dxt.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dxt.d e() {
         this.i = true;
         return this;
      }

      public dxt.d f() {
         this.F = true;
         return this;
      }

      public dxt.d g() {
         this.n = alr.fixed(Optional.empty());
         return this;
      }

      public dxt.d a(Optional<aly<ewt>> $$0) {
         this.n = alr.fixed($$0);
         return this;
      }

      protected Optional<aly<ewt>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dxt.d i() {
         this.r = true;
         return this;
      }

      public dxt.d j() {
         this.s = true;
         return this;
      }

      public dxt.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dxt.d l() {
         this.t = true;
         return this;
      }

      public dxt.d a(eub $$0) {
         this.v = $$0;
         return this;
      }

      public dxt.d m() {
         this.q = true;
         return this;
      }

      public dxt.d a(dxt.e<bvq<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dxt.d a(dxt.f $$0) {
         this.A = $$0;
         return this;
      }

      public dxt.d b(dxt.f $$0) {
         this.B = $$0;
         return this;
      }

      public dxt.d c(dxt.f $$0) {
         this.C = $$0;
         return this;
      }

      public dxt.d d(dxt.f $$0) {
         this.D = $$0;
         return this;
      }

      public dxt.d e(dxt.f $$0) {
         this.E = $$0;
         return this;
      }

      public dxt.d n() {
         this.h = true;
         return this;
      }

      public dxt.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dxt.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dxt.d a(dxt.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dkl $$2 = $$0x.b();
            long $$3 = bae.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = bae.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = bae.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fbx($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dkl $$2 = $$0x.b();
            long $$3 = bae.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = bae.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = bae.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fbx($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dxt.d o() {
         this.w = false;
         return this;
      }

      public dxt.d a(csq... $$0) {
         this.G = csu.f.a($$0);
         return this;
      }

      public dxt.d a(dyu $$0) {
         this.x = $$0;
         return this;
      }

      public dxt.d p() {
         this.y = true;
         return this;
      }

      public dxt.d a(aly<dkl> $$0) {
         this.m = $$0;
         return this;
      }

      public dxt.d a(String $$0) {
         this.o = alr.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dxu var1, dgm var2, jh var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dxu var1, dgm var2, jh var3);
   }
}
