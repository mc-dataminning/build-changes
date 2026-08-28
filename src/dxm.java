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

public abstract class dxm implements csl {
   protected static final jm[] aG = new jm[]{jm.e, jm.f, jm.c, jm.d, jm.a, jm.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dru aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final cso aP;
   protected final dxm.d aQ;
   protected final Optional<aly<ewm>> aR;
   protected final String aS;

   public dxm(dxm.d $$0) {
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

   public dxm.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dke> a();

   protected static <B extends dke> RecordCodecBuilder<B, dxm.d> t() {
      return dxm.d.a.fieldOf("properties").forGetter(dxm::s);
   }

   public static <B extends dke> MapCodec<B> b(Function<dxm.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dxn $$0, dhb $$1, jh $$2, int $$3, int $$4) {
   }

   protected boolean a(dxn $$0, eue $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dgp.a, jh.c);
         case b:
            return $$0.y().a(aya.a);
         case c:
            return !$$0.m(dgp.a, jh.c);
         default:
            return false;
      }
   }

   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$0;
   }

   protected boolean b(dxn $$0, dxn $$1, jm $$2) {
      return false;
   }

   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
   }

   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
   }

   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dxn $$0, ash $$1, jh $$2, dgs $$3, BiConsumer<cxk, jh> $$4) {
      if (!$$0.l() && $$3.b() != dgs.a.d) {
         dke $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cps;
         if ($$5.a($$3)) {
            dup $$7 = $$0.x() ? $$1.c_($$2) : null;
            ewk.a $$8 = new ewk.a($$1).a(ezd.f, fbs.b($$2)).a(ezd.i, cxk.k).b(ezd.h, $$7).b(ezd.a, $$3.d());
            if ($$3.b() == dgs.a.c) {
               $$8.a(ezd.j, $$3.e());
            }

            $$0.a($$1, $$2, cxk.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dkg.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      return bte.e;
   }

   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      return bte.f;
   }

   protected boolean a(dxn $$0, dha $$1, jh $$2, int $$3, int $$4) {
      return false;
   }

   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   protected boolean g_(dxn $$0) {
      return false;
   }

   protected boolean f_(dxn $$0) {
      return false;
   }

   protected etp b_(dxn $$0) {
      return etq.a.g();
   }

   protected boolean c_(dxn $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public cso i() {
      return this.aP;
   }

   protected dxn a(dxn $$0, dqu $$1) {
      return $$0;
   }

   protected dxn a(dxn $$0, dpd $$1) {
      return $$0;
   }

   protected boolean a(dxn $$0, dbb $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dxn $$0, eto $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cxk> a(dxn $$0, ewk.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         ewk $$2 = $$1.a(ezd.g, $$0).a(ezc.r);
         ash $$3 = $$2.a();
         ewm $$4 = $$3.p().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dxn $$0, jh $$1) {
      return bae.a($$1);
   }

   protected fcm d_(dxn $$0) {
      return $$0.f(dgp.a, jh.c);
   }

   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      return this.b($$0, $$1, $$2, fbx.a());
   }

   protected fcm a(dxn $$0, dgf $$1, jh $$2) {
      return fcj.a();
   }

   protected int i_(dxn $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return null;
   }

   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return true;
   }

   protected float c(dxn $$0, dgf $$1, jh $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dxn $$0, dha $$1, jh $$2) {
      return 0;
   }

   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return fcj.b();
   }

   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.aH ? $$0.f($$1, $$2) : fcj.a();
   }

   protected boolean a_(dxn $$0, dgf $$1, jh $$2) {
      return dke.a($$0.g($$1, $$2));
   }

   protected fcm c(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
   }

   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
   }

   protected float a(dxn $$0, cps $$1, dgf $$2, jh $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dxn $$0, ash $$1, jh $$2, cxk $$3, boolean $$4) {
   }

   protected void a_(dxn $$0, dha $$1, jh $$2, cps $$3) {
   }

   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return 0;
   }

   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
   }

   protected fcm a_(dxn $$0, dha $$1, jh $$2) {
      return fcj.b();
   }

   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return 0;
   }

   public final Optional<aly<ewm>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
   }

   protected boolean e_(dxn $$0) {
      return !dke.a($$0.f(dgp.a, jh.c)) && $$0.y().c();
   }

   protected boolean f(dxn $$0) {
      return this.aJ;
   }

   protected dru h_(dxn $$0) {
      return this.aK;
   }

   public abstract cxg j();

   protected abstract dke o();

   public ett w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dxp<dke, dxn> {
      private static final jm[] a = jm.values();
      private static final fcm[] f = ae.a(new fcm[a.length], $$0 -> Arrays.fill($$0, fcj.a()));
      private static final fcm[] g = ae.a(new fcm[a.length], $$0 -> Arrays.fill($$0, fcj.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final etu n;
      private final ett o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dxm.f s;
      private final dxm.f t;
      private final dxm.f u;
      private final dxm.f v;
      private final dxm.f w;
      @Nullable
      private final dxm.b x;
      private final boolean y;
      private final dyn z;
      private final boolean A;
      @Nullable
      private dxm.a.a B;
      private etp C = etq.a.g();
      private boolean D;
      private boolean E;
      private fcm F;
      private fcm[] G;
      private boolean H;
      private int I;

      protected a(dke $$0, Reference2ObjectArrayMap<dyp<?>, Comparable<?>> $$1, MapCodec<dxn> $$2) {
         super($$0, $$1, $$2);
         dxm.d $$3 = $$0.aQ;
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
            fcm $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fbn $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dxm.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fcj.a();
         this.E = dke.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fcm[a.length];

            for (jm $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dke b() {
         return this.d;
      }

      public jq<dke> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dke $$0 = this.b();
         return $$0 != dkg.bz && $$0 != dkg.nt && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dgf $$0, jh $$1, bvm<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fcm a(jm $$0) {
         return this.G[$$0.ordinal()];
      }

      public fcm h() {
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

      public ett a(dgf $$0, jh $$1) {
         return this.o;
      }

      public dxn a(dqu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dxn a(dpd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dqn o() {
         return this.b().a_(this.B());
      }

      public boolean b(dgf $$0, jh $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dgf $$0, jh $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dgf $$0, jh $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dgf $$0, jh $$1, jm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dha $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dgf $$0, jh $$1) {
         return this.p;
      }

      public float a(cps $$0, dgf $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dgf $$0, jh $$1, jm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public etu r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dxn $$0, jm $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fcm f(dgf $$0, jh $$1) {
         return this.a($$0, $$1, fbx.a());
      }

      public fcm a(dgf $$0, jh $$1, fbx $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcm g(dgf $$0, jh $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fbx.a());
      }

      public fcm b(dgf $$0, jh $$1, fbx $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fcm h(dgf $$0, jh $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fcm c(dgf $$0, jh $$1, fbx $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fcm i(dgf $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dgf $$0, jh $$1, bvf $$2) {
         return this.a($$0, $$1, $$2, jm.b);
      }

      public final boolean a(dgf $$0, jh $$1, bvf $$2, jm $$3) {
         return dke.a(this.b($$0, $$1, fbx.a($$2)), $$3);
      }

      public fbs a(jh $$0) {
         dxm.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fbs.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dha $$0, jh $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dha $$0, jh $$1, dke $$2, @Nullable eux $$3, boolean $$4) {
         ahj.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dhb $$0, jh $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dhb $$0, jh $$1, int $$2, int $$3) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : dxm.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dhb $$0, jh $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dhb $$0, jh $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dha $$0, jh $$1, dxn $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dha $$0, jh $$1, dxn $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ash $$0, jh $$1, dgs $$2, BiConsumer<cxk, jh> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ash $$0, jh $$1, bam $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(ash $$0, jh $$1, bam $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dha $$0, jh $$1, bvf $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fcm b(dha $$0, jh $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(ash $$0, jh $$1, cxk $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cxk> a(ewk.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bte a(cxk $$0, dha $$1, cps $$2, btd $$3, fbo $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bte a(dha $$0, cps $$1, fbo $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dha $$0, jh $$1, cps $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dgf $$0, jh $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dgf $$0, jh $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dxn a(dhd $$0, dhp $$1, jh $$2, jm $$3, jh $$4, dxn $$5, bam $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eue $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dbb $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(eto $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dhd $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dgf $$0, jh $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public btg c(dha $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(ayk<dke> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(ayk<dke> $$0, Predicate<dxm.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ju<dke> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jq<dke> $$0) {
         return this.a($$0.a());
      }

      public Stream<ayk<dke>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dmy;
      }

      @Nullable
      public <T extends dup> duq<T> a(dha $$0, dur<T> $$1) {
         return this.b() instanceof dmy ? ((dmy)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dke $$0) {
         return this.b() == $$0;
      }

      public boolean a(aly<dke> $$0) {
         return this.b().p().a($$0);
      }

      public etp y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dru A() {
         return this.b().h_(this.B());
      }

      public void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dgf $$0, jh $$1, jm $$2) {
         return this.a($$0, $$1, $$2, dsi.a);
      }

      public boolean a(dgf $$0, jh $$1, jm $$2, dsi $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dgf $$0, jh $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dxn B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dyn E() {
         return this.z;
      }

      static final class a {
         private static final jm[] d = jm.values();
         private static final int e = dsi.values().length;
         protected final fcm a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dxn $$0) {
            dke $$1 = $$0.b();
            this.a = $$1.b($$0, dgp.a, jh.c, fbx.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ma.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jm.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jm $$2 : d) {
                  for (dsi $$3 : dsi.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dgp.a, jh.c, $$2);
                  }
               }

               this.c = dke.a($$0.g(dgp.a, jh.c));
            }
         }

         public boolean a(jm $$0, dsi $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jm $$0, dsi $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fbs evaluate(dxn var1, jh var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dxm.d> a = Codec.unit(() -> a());
      Function<dxn, ett> b = $$0 -> ett.a;
      boolean c = true;
      dru d = dru.f;
      ToIntFunction<dxn> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private aly<dke> m;
      private alr<dke, Optional<aly<ewm>>> n = $$0 -> Optional.of(aly.a(mb.bf, $$0.a().f("blocks/")));
      private alr<dke, String> o = $$0 -> ae.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      etu v = etu.a;
      boolean w = true;
      dyn x = dyn.a;
      boolean y;
      dxm.e<bvm<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jm.b) && $$0.k() < 14;
      dxm.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dxm.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dxm.f C = this.B;
      dxm.f D = ($$0, $$1, $$2) -> false;
      dxm.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cso G = csq.h;
      @Nullable
      dxm.b H;

      private d() {
      }

      public static dxm.d a() {
         return new dxm.d();
      }

      public static dxm.d a(dxm $$0) {
         dxm.d $$1 = b($$0);
         dxm.d $$2 = $$0.aQ;
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
      public static dxm.d b(dxm $$0) {
         dxm.d $$1 = new dxm.d();
         dxm.d $$2 = $$0.aQ;
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

      public dxm.d a(cwh $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dxm.d a(ett $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dxm.d a(Function<dxn, ett> $$0) {
         this.b = $$0;
         return this;
      }

      public dxm.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dxm.d c() {
         this.p = false;
         return this;
      }

      public dxm.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dxm.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dxm.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dxm.d a(dru $$0) {
         this.d = $$0;
         return this;
      }

      public dxm.d a(ToIntFunction<dxn> $$0) {
         this.e = $$0;
         return this;
      }

      public dxm.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dxm.d d() {
         return this.d(0.0F);
      }

      public dxm.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dxm.d e() {
         this.i = true;
         return this;
      }

      public dxm.d f() {
         this.F = true;
         return this;
      }

      public dxm.d g() {
         this.n = alr.fixed(Optional.empty());
         return this;
      }

      public dxm.d a(Optional<aly<ewm>> $$0) {
         this.n = alr.fixed($$0);
         return this;
      }

      protected Optional<aly<ewm>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dxm.d i() {
         this.r = true;
         return this;
      }

      public dxm.d j() {
         this.s = true;
         return this;
      }

      public dxm.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dxm.d l() {
         this.t = true;
         return this;
      }

      public dxm.d a(etu $$0) {
         this.v = $$0;
         return this;
      }

      public dxm.d m() {
         this.q = true;
         return this;
      }

      public dxm.d a(dxm.e<bvm<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dxm.d a(dxm.f $$0) {
         this.A = $$0;
         return this;
      }

      public dxm.d b(dxm.f $$0) {
         this.B = $$0;
         return this;
      }

      public dxm.d c(dxm.f $$0) {
         this.C = $$0;
         return this;
      }

      public dxm.d d(dxm.f $$0) {
         this.D = $$0;
         return this;
      }

      public dxm.d e(dxm.f $$0) {
         this.E = $$0;
         return this;
      }

      public dxm.d n() {
         this.h = true;
         return this;
      }

      public dxm.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dxm.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dxm.d a(dxm.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dke $$2 = $$0x.b();
            long $$3 = bae.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = bae.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = bae.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fbs($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dke $$2 = $$0x.b();
            long $$3 = bae.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = bae.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = bae.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fbs($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dxm.d o() {
         this.w = false;
         return this;
      }

      public dxm.d a(csm... $$0) {
         this.G = csq.f.a($$0);
         return this;
      }

      public dxm.d a(dyn $$0) {
         this.x = $$0;
         return this;
      }

      public dxm.d p() {
         this.y = true;
         return this;
      }

      public dxm.d a(aly<dke> $$0) {
         this.m = $$0;
         return this;
      }

      public dxm.d a(String $$0) {
         this.o = alr.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dxn var1, dgf var2, jh var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dxn var1, dgf var2, jh var3);
   }
}
