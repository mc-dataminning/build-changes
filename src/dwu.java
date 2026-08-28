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

public abstract class dwu implements cro {
   protected static final jn[] aG = new jn[]{jn.e, jn.f, jn.c, jn.d, jn.a, jn.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final drc aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final crr aP;
   protected final dwu.d aQ;
   protected final Optional<akt<evu>> aR;
   protected final String aS;

   public dwu(dwu.d $$0) {
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

   public dwu.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends djk> a();

   protected static <B extends djk> RecordCodecBuilder<B, dwu.d> t() {
      return dwu.d.a.fieldOf("properties").forGetter(dwu::s);
   }

   public static <B extends djk> MapCodec<B> b(Function<dwu.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dwv $$0, dgh $$1, ji $$2, int $$3, int $$4) {
   }

   protected boolean a(dwv $$0, etm $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dfv.a, ji.c);
         case b:
            return $$0.y().a(awu.a);
         case c:
            return !$$0.m(dfv.a, ji.c);
         default:
            return false;
      }
   }

   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$0;
   }

   protected boolean b(dwv $$0, dwv $$1, jn $$2) {
      return false;
   }

   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
   }

   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
   }

   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if (!$$0.l() && $$3.b() != dfy.a.d) {
         djk $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cov;
         if ($$5.a($$3)) {
            dtx $$7 = $$0.x() ? $$1.c_($$2) : null;
            evs.a $$8 = new evs.a($$1).a(eyj.f, fay.b($$2)).a(eyj.i, cwn.j).b(eyj.h, $$7).b(eyj.a, $$3.d());
            if ($$3.b() == dfy.a.c) {
               $$8.a(eyj.j, $$3.e());
            }

            $$0.a($$1, $$2, cwn.j, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, djm.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      return bsi.e;
   }

   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      return bsi.f;
   }

   protected boolean a(dwv $$0, dgg $$1, ji $$2, int $$3, int $$4) {
      return false;
   }

   protected dpv a_(dwv $$0) {
      return dpv.b;
   }

   protected boolean g_(dwv $$0) {
      return false;
   }

   protected boolean f_(dwv $$0) {
      return false;
   }

   protected esx b_(dwv $$0) {
      return esy.a.g();
   }

   protected boolean c_(dwv $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public crr i() {
      return this.aP;
   }

   protected dwv a(dwv $$0, dqc $$1) {
      return $$0;
   }

   protected dwv a(dwv $$0, doj $$1) {
      return $$0;
   }

   protected boolean a(dwv $$0, dae $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dwv $$0, esw $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cwn> a(dwv $$0, evs.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         evs $$2 = $$1.a(eyj.g, $$0).a(eyi.r);
         arc $$3 = $$2.a();
         evu $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dwv $$0, ji $$1) {
      return ayy.a($$1);
   }

   protected fbs d_(dwv $$0) {
      return $$0.f(dfv.a, ji.c);
   }

   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return this.b($$0, $$1, $$2, fbd.a());
   }

   protected fbs a(dwv $$0, dfl $$1, ji $$2) {
      return fbp.a();
   }

   protected int i_(dwv $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return null;
   }

   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return true;
   }

   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return 0;
   }

   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.b();
   }

   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.aH ? $$0.f($$1, $$2) : fbp.a();
   }

   protected boolean a_(dwv $$0, dfl $$1, ji $$2) {
      return djk.a($$0.g($$1, $$2));
   }

   protected fbs c(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
   }

   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
   }

   protected float a(dwv $$0, cov $$1, dfl $$2, ji $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
   }

   protected void a_(dwv $$0, dgg $$1, ji $$2, cov $$3) {
   }

   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return 0;
   }

   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
   }

   protected fbs a_(dwv $$0, dgg $$1, ji $$2) {
      return fbp.b();
   }

   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return 0;
   }

   public final Optional<akt<evu>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
   }

   protected boolean e_(dwv $$0) {
      return !djk.a($$0.f(dfv.a, ji.c)) && $$0.y().c();
   }

   protected boolean f(dwv $$0) {
      return this.aJ;
   }

   protected drc h_(dwv $$0) {
      return this.aK;
   }

   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(this.j());
   }

   public abstract cwj j();

   protected abstract djk o();

   public etb w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dwx<djk, dwv> {
      private static final jn[] a = jn.values();
      private static final fbs[] f = af.a(new fbs[a.length], $$0 -> Arrays.fill($$0, fbp.a()));
      private static final fbs[] g = af.a(new fbs[a.length], $$0 -> Arrays.fill($$0, fbp.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final etc n;
      private final etb o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dwu.f s;
      private final dwu.f t;
      private final dwu.f u;
      private final dwu.f v;
      private final dwu.f w;
      @Nullable
      private final dwu.b x;
      private final boolean y;
      private final dxv z;
      private final boolean A;
      @Nullable
      private dwu.a.a B;
      private esx C = esy.a.g();
      private boolean D;
      private boolean E;
      private fbs F;
      private fbs[] G;
      private boolean H;
      private int I;

      protected a(djk $$0, Reference2ObjectArrayMap<dxx<?>, Comparable<?>> $$1, MapCodec<dwv> $$2) {
         super($$0, $$1, $$2);
         dwu.d $$3 = $$0.aQ;
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
            fbs $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fat $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dwu.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fbp.a();
         this.E = djk.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fbs[a.length];

            for (jn $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public djk b() {
         return this.d;
      }

      public jr<djk> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         djk $$0 = this.b();
         return $$0 != djm.bz && $$0 != djm.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dfl $$0, ji $$1, buq<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fbs a(jn $$0) {
         return this.G[$$0.ordinal()];
      }

      public fbs h() {
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

      public etb a(dfl $$0, ji $$1) {
         return this.o;
      }

      public dwv a(dqc $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dwv a(doj $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpv o() {
         return this.b().a_(this.B());
      }

      public boolean b(dfl $$0, ji $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dfl $$0, ji $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dfl $$0, ji $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dfl $$0, ji $$1, jn $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dgg $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dfl $$0, ji $$1) {
         return this.p;
      }

      public float a(cov $$0, dfl $$1, ji $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dfl $$0, ji $$1, jn $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public etc r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dwv $$0, jn $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fbs f(dfl $$0, ji $$1) {
         return this.a($$0, $$1, fbd.a());
      }

      public fbs a(dfl $$0, ji $$1, fbd $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbs g(dfl $$0, ji $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fbd.a());
      }

      public fbs b(dfl $$0, ji $$1, fbd $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fbs h(dfl $$0, ji $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fbs c(dfl $$0, ji $$1, fbd $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fbs i(dfl $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dfl $$0, ji $$1, buj $$2) {
         return this.a($$0, $$1, $$2, jn.b);
      }

      public final boolean a(dfl $$0, ji $$1, buj $$2, jn $$3) {
         return djk.a(this.b($$0, $$1, fbd.a($$2)), $$3);
      }

      public fay a(ji $$0) {
         dwu.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fay.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dgg $$0, ji $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgg $$0, ji $$1, djk $$2, @Nullable euf $$3, boolean $$4) {
         agc.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dgh $$0, ji $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dgh $$0, ji $$1, int $$2, int $$3) {
         ji.a $$4 = new ji.a();

         for (jn $$5 : dwu.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dgh $$0, ji $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dgh $$0, ji $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgg $$0, ji $$1, dwv $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dgg $$0, ji $$1, dwv $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arc $$0, ji $$1, dfy $$2, BiConsumer<cwn, ji> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arc $$0, ji $$1, azg $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arc $$0, ji $$1, azg $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dgg $$0, ji $$1, buj $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbs b(dgg $$0, ji $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arc $$0, ji $$1, cwn $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cwn> a(evs.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsi a(cwn $$0, dgg $$1, cov $$2, bsh $$3, fau $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsi a(dgg $$0, cov $$1, fau $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dgg $$0, ji $$1, cov $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dfl $$0, ji $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dfl $$0, ji $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dwv a(dgj $$0, dgv $$1, ji $$2, jn $$3, ji $$4, dwv $$5, azg $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(etm $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dae $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(esw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dgj $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dfl $$0, ji $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsk c(dgg $$0, ji $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axe<djk> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axe<djk> $$0, Predicate<dwu.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jv<djk> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jr<djk> $$0) {
         return this.a($$0.a());
      }

      public Stream<axe<djk>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dmd;
      }

      @Nullable
      public <T extends dtx> dty<T> a(dgg $$0, dtz<T> $$1) {
         return this.b() instanceof dmd ? ((dmd)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(djk $$0) {
         return this.b() == $$0;
      }

      public boolean a(akt<djk> $$0) {
         return this.b().p().a($$0);
      }

      public esx y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(ji $$0) {
         return this.b().a(this.B(), $$0);
      }

      public drc A() {
         return this.b().h_(this.B());
      }

      public void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dfl $$0, ji $$1, jn $$2) {
         return this.a($$0, $$1, $$2, drq.a);
      }

      public boolean a(dfl $$0, ji $$1, jn $$2, drq $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dfl $$0, ji $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cwn a(dgj $$0, ji $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dwv B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dxv E() {
         return this.z;
      }

      static final class a {
         private static final jn[] d = jn.values();
         private static final int e = drq.values().length;
         protected final fbs a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dwv $$0) {
            djk $$1 = $$0.b();
            this.a = $$1.b($$0, dfv.a, ji.c, fbd.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mb.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jn.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jn $$2 : d) {
                  for (drq $$3 : drq.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dfv.a, ji.c, $$2);
                  }
               }

               this.c = djk.a($$0.g(dfv.a, ji.c));
            }
         }

         public boolean a(jn $$0, drq $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jn $$0, drq $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fay evaluate(dwv var1, ji var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dwu.d> a = Codec.unit(() -> a());
      Function<dwv, etb> b = $$0 -> etb.a;
      boolean c = true;
      drc d = drc.f;
      ToIntFunction<dwv> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private akt<djk> m;
      private akm<djk, Optional<akt<evu>>> n = $$0 -> Optional.of(akt.a(mc.bg, $$0.a().f("blocks/")));
      private akm<djk, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      etc v = etc.a;
      boolean w = true;
      dxv x = dxv.a;
      boolean y;
      dwu.e<buq<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jn.b) && $$0.k() < 14;
      dwu.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dwu.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dwu.f C = this.B;
      dwu.f D = ($$0, $$1, $$2) -> false;
      dwu.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      crr G = crt.g;
      @Nullable
      dwu.b H;

      private d() {
      }

      public static dwu.d a() {
         return new dwu.d();
      }

      public static dwu.d a(dwu $$0) {
         dwu.d $$1 = b($$0);
         dwu.d $$2 = $$0.aQ;
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
      public static dwu.d b(dwu $$0) {
         dwu.d $$1 = new dwu.d();
         dwu.d $$2 = $$0.aQ;
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

      public dwu.d a(cvk $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dwu.d a(etb $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dwu.d a(Function<dwv, etb> $$0) {
         this.b = $$0;
         return this;
      }

      public dwu.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dwu.d c() {
         this.p = false;
         return this;
      }

      public dwu.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dwu.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dwu.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dwu.d a(drc $$0) {
         this.d = $$0;
         return this;
      }

      public dwu.d a(ToIntFunction<dwv> $$0) {
         this.e = $$0;
         return this;
      }

      public dwu.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dwu.d d() {
         return this.d(0.0F);
      }

      public dwu.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dwu.d e() {
         this.i = true;
         return this;
      }

      public dwu.d f() {
         this.F = true;
         return this;
      }

      public dwu.d g() {
         this.n = akm.fixed(Optional.empty());
         return this;
      }

      public dwu.d a(Optional<akt<evu>> $$0) {
         this.n = akm.fixed($$0);
         return this;
      }

      protected Optional<akt<evu>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dwu.d i() {
         this.r = true;
         return this;
      }

      public dwu.d j() {
         this.s = true;
         return this;
      }

      public dwu.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dwu.d l() {
         this.t = true;
         return this;
      }

      public dwu.d a(etc $$0) {
         this.v = $$0;
         return this;
      }

      public dwu.d m() {
         this.q = true;
         return this;
      }

      public dwu.d a(dwu.e<buq<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dwu.d a(dwu.f $$0) {
         this.A = $$0;
         return this;
      }

      public dwu.d b(dwu.f $$0) {
         this.B = $$0;
         return this;
      }

      public dwu.d c(dwu.f $$0) {
         this.C = $$0;
         return this;
      }

      public dwu.d d(dwu.f $$0) {
         this.D = $$0;
         return this;
      }

      public dwu.d e(dwu.f $$0) {
         this.E = $$0;
         return this;
      }

      public dwu.d n() {
         this.h = true;
         return this;
      }

      public dwu.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dwu.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dwu.d a(dwu.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            djk $$2 = $$0x.b();
            long $$3 = ayy.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ar_();
            double $$5 = ayy.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = ayy.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fay($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            djk $$2 = $$0x.b();
            long $$3 = ayy.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.at_();
            float $$5 = $$2.ar_();
            double $$6 = ayy.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = ayy.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fay($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dwu.d o() {
         this.w = false;
         return this;
      }

      public dwu.d a(crp... $$0) {
         this.G = crt.e.a($$0);
         return this;
      }

      public dwu.d a(dxv $$0) {
         this.x = $$0;
         return this;
      }

      public dwu.d p() {
         this.y = true;
         return this;
      }

      public dwu.d a(akt<djk> $$0) {
         this.m = $$0;
         return this;
      }

      public dwu.d a(String $$0) {
         this.o = akm.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dwv var1, dfl var2, ji var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dwv var1, dfl var2, ji var3);
   }
}
