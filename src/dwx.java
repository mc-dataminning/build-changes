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

public abstract class dwx implements crr {
   protected static final jn[] aG = new jn[]{jn.e, jn.f, jn.c, jn.d, jn.a, jn.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final drf aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final cru aP;
   protected final dwx.d aQ;
   protected final Optional<aku<evx>> aR;
   protected final String aS;

   public dwx(dwx.d $$0) {
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

   public dwx.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends djn> a();

   protected static <B extends djn> RecordCodecBuilder<B, dwx.d> t() {
      return dwx.d.a.fieldOf("properties").forGetter(dwx::s);
   }

   public static <B extends djn> MapCodec<B> b(Function<dwx.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dwy $$0, dgk $$1, ji $$2, int $$3, int $$4) {
   }

   protected boolean a(dwy $$0, etp $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dfy.a, ji.c);
         case b:
            return $$0.y().a(awv.a);
         case c:
            return !$$0.m(dfy.a, ji.c);
         default:
            return false;
      }
   }

   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$0;
   }

   protected boolean b(dwy $$0, dwy $$1, jn $$2) {
      return false;
   }

   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
   }

   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
   }

   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      if (!$$0.l() && $$3.b() != dgb.a.d) {
         djn $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof coy;
         if ($$5.a($$3)) {
            dua $$7 = $$0.x() ? $$1.c_($$2) : null;
            evv.a $$8 = new evv.a($$1).a(eym.f, fbb.b($$2)).a(eym.i, cwq.j).b(eym.h, $$7).b(eym.a, $$3.d());
            if ($$3.b() == dgb.a.c) {
               $$8.a(eym.j, $$3.e());
            }

            $$0.a($$1, $$2, cwq.j, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, djp.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      return bsl.e;
   }

   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      return bsl.f;
   }

   protected boolean a(dwy $$0, dgj $$1, ji $$2, int $$3, int $$4) {
      return false;
   }

   protected dpy a_(dwy $$0) {
      return dpy.b;
   }

   protected boolean g_(dwy $$0) {
      return false;
   }

   protected boolean f_(dwy $$0) {
      return false;
   }

   protected eta b_(dwy $$0) {
      return etb.a.g();
   }

   protected boolean c_(dwy $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cru i() {
      return this.aP;
   }

   protected dwy a(dwy $$0, dqf $$1) {
      return $$0;
   }

   protected dwy a(dwy $$0, dom $$1) {
      return $$0;
   }

   protected boolean a(dwy $$0, dah $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dwy $$0, esz $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cwq> a(dwy $$0, evv.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         evv $$2 = $$1.a(eym.g, $$0).a(eyl.r);
         ard $$3 = $$2.a();
         evx $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dwy $$0, ji $$1) {
      return ayz.a($$1);
   }

   protected fbv d_(dwy $$0) {
      return $$0.f(dfy.a, ji.c);
   }

   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      return this.b($$0, $$1, $$2, fbg.a());
   }

   protected fbv a(dwy $$0, dfo $$1, ji $$2) {
      return fbs.a();
   }

   protected int i_(dwy $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return null;
   }

   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return true;
   }

   protected float c(dwy $$0, dfo $$1, ji $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return 0;
   }

   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return fbs.b();
   }

   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.aH ? $$0.f($$1, $$2) : fbs.a();
   }

   protected boolean a_(dwy $$0, dfo $$1, ji $$2) {
      return djn.a($$0.g($$1, $$2));
   }

   protected fbv c(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
   }

   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
   }

   protected float a(dwy $$0, coy $$1, dfo $$2, ji $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
   }

   protected void a_(dwy $$0, dgj $$1, ji $$2, coy $$3) {
   }

   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return 0;
   }

   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
   }

   protected fbv a_(dwy $$0, dgj $$1, ji $$2) {
      return fbs.b();
   }

   protected int b(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return 0;
   }

   public final Optional<aku<evx>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
   }

   protected boolean e_(dwy $$0) {
      return !djn.a($$0.f(dfy.a, ji.c)) && $$0.y().c();
   }

   protected boolean f(dwy $$0) {
      return this.aJ;
   }

   protected drf h_(dwy $$0) {
      return this.aK;
   }

   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(this.j());
   }

   public abstract cwm j();

   protected abstract djn o();

   public ete w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dxa<djn, dwy> {
      private static final jn[] a = jn.values();
      private static final fbv[] f = af.a(new fbv[a.length], $$0 -> Arrays.fill($$0, fbs.a()));
      private static final fbv[] g = af.a(new fbv[a.length], $$0 -> Arrays.fill($$0, fbs.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final etf n;
      private final ete o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dwx.f s;
      private final dwx.f t;
      private final dwx.f u;
      private final dwx.f v;
      private final dwx.f w;
      @Nullable
      private final dwx.b x;
      private final boolean y;
      private final dxy z;
      private final boolean A;
      @Nullable
      private dwx.a.a B;
      private eta C = etb.a.g();
      private boolean D;
      private boolean E;
      private fbv F;
      private fbv[] G;
      private boolean H;
      private int I;

      protected a(djn $$0, Reference2ObjectArrayMap<dya<?>, Comparable<?>> $$1, MapCodec<dwy> $$2) {
         super($$0, $$1, $$2);
         dwx.d $$3 = $$0.aQ;
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
            fbv $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               faw $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dwx.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fbs.a();
         this.E = djn.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fbv[a.length];

            for (jn $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public djn b() {
         return this.d;
      }

      public jr<djn> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         djn $$0 = this.b();
         return $$0 != djp.bz && $$0 != djp.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dfo $$0, ji $$1, but<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fbv a(jn $$0) {
         return this.G[$$0.ordinal()];
      }

      public fbv h() {
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

      public ete a(dfo $$0, ji $$1) {
         return this.o;
      }

      public dwy a(dqf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dwy a(dom $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpy o() {
         return this.b().a_(this.B());
      }

      public boolean b(dfo $$0, ji $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dfo $$0, ji $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dfo $$0, ji $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dfo $$0, ji $$1, jn $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dgj $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dfo $$0, ji $$1) {
         return this.p;
      }

      public float a(coy $$0, dfo $$1, ji $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dfo $$0, ji $$1, jn $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public etf r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dwy $$0, jn $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fbv f(dfo $$0, ji $$1) {
         return this.a($$0, $$1, fbg.a());
      }

      public fbv a(dfo $$0, ji $$1, fbg $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbv g(dfo $$0, ji $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fbg.a());
      }

      public fbv b(dfo $$0, ji $$1, fbg $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fbv h(dfo $$0, ji $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fbv c(dfo $$0, ji $$1, fbg $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fbv i(dfo $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dfo $$0, ji $$1, bum $$2) {
         return this.a($$0, $$1, $$2, jn.b);
      }

      public final boolean a(dfo $$0, ji $$1, bum $$2, jn $$3) {
         return djn.a(this.b($$0, $$1, fbg.a($$2)), $$3);
      }

      public fbb a(ji $$0) {
         dwx.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fbb.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dgj $$0, ji $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgj $$0, ji $$1, djn $$2, @Nullable eui $$3, boolean $$4) {
         agd.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dgk $$0, ji $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dgk $$0, ji $$1, int $$2, int $$3) {
         ji.a $$4 = new ji.a();

         for (jn $$5 : dwx.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dgk $$0, ji $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dgk $$0, ji $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dgj $$0, ji $$1, dwy $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dgj $$0, ji $$1, dwy $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ard $$0, ji $$1, dgb $$2, BiConsumer<cwq, ji> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ard $$0, ji $$1, azh $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(ard $$0, ji $$1, azh $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dgj $$0, ji $$1, bum $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fbv b(dgj $$0, ji $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(ard $$0, ji $$1, cwq $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cwq> a(evv.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsl a(cwq $$0, dgj $$1, coy $$2, bsk $$3, fax $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsl a(dgj $$0, coy $$1, fax $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dgj $$0, ji $$1, coy $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dfo $$0, ji $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dfo $$0, ji $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dwy a(dgm $$0, dgy $$1, ji $$2, jn $$3, ji $$4, dwy $$5, azh $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(etp $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dah $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(esz $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dgm $$0, ji $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dfo $$0, ji $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsn c(dgj $$0, ji $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axf<djn> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axf<djn> $$0, Predicate<dwx.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jv<djn> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jr<djn> $$0) {
         return this.a($$0.a());
      }

      public Stream<axf<djn>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dmg;
      }

      @Nullable
      public <T extends dua> dub<T> a(dgj $$0, duc<T> $$1) {
         return this.b() instanceof dmg ? ((dmg)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(djn $$0) {
         return this.b() == $$0;
      }

      public boolean a(aku<djn> $$0) {
         return this.b().p().a($$0);
      }

      public eta y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(ji $$0) {
         return this.b().a(this.B(), $$0);
      }

      public drf A() {
         return this.b().h_(this.B());
      }

      public void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dfo $$0, ji $$1, jn $$2) {
         return this.a($$0, $$1, $$2, drt.a);
      }

      public boolean a(dfo $$0, ji $$1, jn $$2, drt $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dfo $$0, ji $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cwq a(dgm $$0, ji $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dwy B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dxy E() {
         return this.z;
      }

      static final class a {
         private static final jn[] d = jn.values();
         private static final int e = drt.values().length;
         protected final fbv a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dwy $$0) {
            djn $$1 = $$0.b();
            this.a = $$1.b($$0, dfy.a, ji.c, fbg.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mb.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jn.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jn $$2 : d) {
                  for (drt $$3 : drt.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dfy.a, ji.c, $$2);
                  }
               }

               this.c = djn.a($$0.g(dfy.a, ji.c));
            }
         }

         public boolean a(jn $$0, drt $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jn $$0, drt $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fbb evaluate(dwy var1, ji var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dwx.d> a = Codec.unit(() -> a());
      Function<dwy, ete> b = $$0 -> ete.a;
      boolean c = true;
      drf d = drf.f;
      ToIntFunction<dwy> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private aku<djn> m;
      private akn<djn, Optional<aku<evx>>> n = $$0 -> Optional.of(aku.a(mc.bg, $$0.a().f("blocks/")));
      private akn<djn, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      etf v = etf.a;
      boolean w = true;
      dxy x = dxy.a;
      boolean y;
      dwx.e<but<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jn.b) && $$0.k() < 14;
      dwx.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dwx.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dwx.f C = this.B;
      dwx.f D = ($$0, $$1, $$2) -> false;
      dwx.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cru G = crw.g;
      @Nullable
      dwx.b H;

      private d() {
      }

      public static dwx.d a() {
         return new dwx.d();
      }

      public static dwx.d a(dwx $$0) {
         dwx.d $$1 = b($$0);
         dwx.d $$2 = $$0.aQ;
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
      public static dwx.d b(dwx $$0) {
         dwx.d $$1 = new dwx.d();
         dwx.d $$2 = $$0.aQ;
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

      public dwx.d a(cvn $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dwx.d a(ete $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dwx.d a(Function<dwy, ete> $$0) {
         this.b = $$0;
         return this;
      }

      public dwx.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dwx.d c() {
         this.p = false;
         return this;
      }

      public dwx.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dwx.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dwx.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dwx.d a(drf $$0) {
         this.d = $$0;
         return this;
      }

      public dwx.d a(ToIntFunction<dwy> $$0) {
         this.e = $$0;
         return this;
      }

      public dwx.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dwx.d d() {
         return this.d(0.0F);
      }

      public dwx.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dwx.d e() {
         this.i = true;
         return this;
      }

      public dwx.d f() {
         this.F = true;
         return this;
      }

      public dwx.d g() {
         this.n = akn.fixed(Optional.empty());
         return this;
      }

      public dwx.d a(Optional<aku<evx>> $$0) {
         this.n = akn.fixed($$0);
         return this;
      }

      protected Optional<aku<evx>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dwx.d i() {
         this.r = true;
         return this;
      }

      public dwx.d j() {
         this.s = true;
         return this;
      }

      public dwx.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dwx.d l() {
         this.t = true;
         return this;
      }

      public dwx.d a(etf $$0) {
         this.v = $$0;
         return this;
      }

      public dwx.d m() {
         this.q = true;
         return this;
      }

      public dwx.d a(dwx.e<but<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dwx.d a(dwx.f $$0) {
         this.A = $$0;
         return this;
      }

      public dwx.d b(dwx.f $$0) {
         this.B = $$0;
         return this;
      }

      public dwx.d c(dwx.f $$0) {
         this.C = $$0;
         return this;
      }

      public dwx.d d(dwx.f $$0) {
         this.D = $$0;
         return this;
      }

      public dwx.d e(dwx.f $$0) {
         this.E = $$0;
         return this;
      }

      public dwx.d n() {
         this.h = true;
         return this;
      }

      public dwx.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dwx.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dwx.d a(dwx.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            djn $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.ar_();
            double $$5 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fbb($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            djn $$2 = $$0x.b();
            long $$3 = ayz.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.at_();
            float $$5 = $$2.ar_();
            double $$6 = ayz.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = ayz.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fbb($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dwx.d o() {
         this.w = false;
         return this;
      }

      public dwx.d a(crs... $$0) {
         this.G = crw.e.a($$0);
         return this;
      }

      public dwx.d a(dxy $$0) {
         this.x = $$0;
         return this;
      }

      public dwx.d p() {
         this.y = true;
         return this;
      }

      public dwx.d a(aku<djn> $$0) {
         this.m = $$0;
         return this;
      }

      public dwx.d a(String $$0) {
         this.o = akn.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dwy var1, dfo var2, ji var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dwy var1, dfo var2, ji var3);
   }
}
