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

public abstract class dyl implements ctb {
   protected static final jo[] D = new jo[]{jo.e, jo.f, jo.c, jo.d, jo.a, jo.b};
   protected final boolean E;
   protected final float F;
   protected final boolean G;
   protected final dsn H;
   protected final float I;
   protected final float J;
   protected final float K;
   protected final boolean L;
   protected final cte M;
   protected final dyl.d N;
   protected final Optional<alc<exq>> O;
   protected final String P;

   public dyl(dyl.d $$0) {
      this.E = $$0.c;
      this.O = $$0.h();
      this.P = $$0.q();
      this.F = $$0.f;
      this.G = $$0.i;
      this.H = $$0.d;
      this.I = $$0.j;
      this.J = $$0.k;
      this.K = $$0.l;
      this.L = $$0.F;
      this.M = $$0.G;
      this.N = $$0;
   }

   public dyl.d s() {
      return this.N;
   }

   protected abstract MapCodec<? extends dku> a();

   protected static <B extends dku> RecordCodecBuilder<B, dyl.d> t() {
      return dyl.d.a.fieldOf("properties").forGetter(dyl::s);
   }

   public static <B extends dku> MapCodec<B> b(Function<dyl.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dym $$0, dhq $$1, jj $$2, int $$3, int $$4) {
   }

   protected boolean a(dym $$0, evi $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dhf.a, jj.c);
         case b:
            return $$0.y().a(axf.a);
         case c:
            return !$$0.m(dhf.a, jj.c);
         default:
            return false;
      }
   }

   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$0;
   }

   protected boolean b(dym $$0, dym $$1, jo $$2) {
      return false;
   }

   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
   }

   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
   }

   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
   }

   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if (!$$0.l() && $$3.b() != dhi.a.d) {
         dku $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cqi;
         if ($$5.a($$3)) {
            dvl $$7 = $$0.x() ? $$1.c_($$2) : null;
            exo.a $$8 = new exo.a($$1).a(faf.f, fcu.b($$2)).a(faf.i, cxy.k).b(faf.h, $$7).b(faf.a, $$3.d());
            if ($$3.b() == dhi.a.c) {
               $$8.a(faf.j, $$3.e());
            }

            $$0.a($$1, $$2, cxy.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dkw.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      return btq.e;
   }

   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      return btq.f;
   }

   protected boolean a(dym $$0, dhp $$1, jj $$2, int $$3, int $$4) {
      return false;
   }

   protected drf a_(dym $$0) {
      return drf.b;
   }

   protected boolean g_(dym $$0) {
      return false;
   }

   protected boolean f_(dym $$0) {
      return false;
   }

   protected eut b_(dym $$0) {
      return euu.a.g();
   }

   protected boolean c_(dym $$0) {
      return false;
   }

   protected float an_() {
      return 0.25F;
   }

   protected float ap_() {
      return 0.2F;
   }

   @Override
   public cte k() {
      return this.M;
   }

   protected dym a(dym $$0, drm $$1) {
      return $$0;
   }

   protected dym a(dym $$0, dpv $$1) {
      return $$0;
   }

   protected boolean a(dym $$0, dbn $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.i()));
   }

   protected boolean a(dym $$0, eus $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cxy> a(dym $$0, exo.a $$1) {
      if (this.O.isEmpty()) {
         return Collections.emptyList();
      } else {
         exo $$2 = $$1.a(faf.g, $$0).a(fae.r);
         arn $$3 = $$2.a();
         exq $$4 = $$3.p().bc().b(this.O.get());
         return $$4.a($$2);
      }
   }

   protected long a(dym $$0, jj $$1) {
      return azk.a($$1);
   }

   protected fdo d_(dym $$0) {
      return $$0.f(dhf.a, jj.c);
   }

   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      return this.b($$0, $$1, $$2, fcz.a());
   }

   protected fdo a(dym $$0, dgv $$1, jj $$2) {
      return fdl.a();
   }

   protected int i_(dym $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return null;
   }

   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return true;
   }

   protected float c(dym $$0, dgv $$1, jj $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dym $$0, dhp $$1, jj $$2) {
      return 0;
   }

   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.b();
   }

   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.E ? $$0.f($$1, $$2) : fdl.a();
   }

   protected boolean a_(dym $$0, dgv $$1, jj $$2) {
      return dku.a($$0.g($$1, $$2));
   }

   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
   }

   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
   }

   protected float a(dym $$0, cqi $$1, dgv $$2, jj $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
   }

   protected void a_(dym $$0, dhp $$1, jj $$2, cqi $$3) {
   }

   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return 0;
   }

   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
   }

   protected fdo a_(dym $$0, dhp $$1, jj $$2) {
      return fdl.b();
   }

   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return 0;
   }

   public final Optional<alc<exq>> u() {
      return this.O;
   }

   public final String v() {
      return this.P;
   }

   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
   }

   protected boolean e_(dym $$0) {
      return !dku.a($$0.f(dhf.a, jj.c)) && $$0.y().c();
   }

   protected boolean f(dym $$0) {
      return this.G;
   }

   protected dsn h_(dym $$0) {
      return this.H;
   }

   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(this.i());
   }

   public abstract cxu i();

   protected abstract dku o();

   public eux w() {
      return this.N.b.apply(this.o().m());
   }

   public float x() {
      return this.N.g;
   }

   public abstract static class a extends dyo<dku, dym> {
      private static final jo[] a = jo.values();
      private static final fdo[] f = af.a(new fdo[a.length], $$0 -> Arrays.fill($$0, fdl.a()));
      private static final fdo[] g = af.a(new fdo[a.length], $$0 -> Arrays.fill($$0, fdl.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final euy n;
      private final eux o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dyl.f s;
      private final dyl.f t;
      private final dyl.f u;
      private final dyl.f v;
      private final dyl.f w;
      @Nullable
      private final dyl.b x;
      private final boolean y;
      private final dzn z;
      private final boolean A;
      @Nullable
      private dyl.a.a B;
      private eut C = euu.a.g();
      private boolean D;
      private boolean E;
      private fdo F;
      private fdo[] G;
      private boolean H;
      private int I;

      protected a(dku $$0, Reference2ObjectArrayMap<dzp<?>, Comparable<?>> $$1, MapCodec<dym> $$2) {
         super($$0, $$1, $$2);
         dyl.d $$3 = $$0.N;
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
         if (this.d.N.u) {
            return true;
         } else if (this.d.N.t) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            fdo $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fcp $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dyl.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fdl.a();
         this.E = dku.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fdo[a.length];

            for (jo $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dku b() {
         return this.d;
      }

      public js<dku> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dku $$0 = this.b();
         return $$0 != dkw.bz && $$0 != dkw.nA && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dgv $$0, jj $$1, bwb<?> $$2) {
         return this.b().N.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fdo a(jo $$0) {
         return this.G[$$0.ordinal()];
      }

      public fdo h() {
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

      public eux a(dgv $$0, jj $$1) {
         return this.o;
      }

      public dym a(drm $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dym a(dpv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public drf o() {
         return this.b().a_(this.B());
      }

      public boolean b(dgv $$0, jj $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dgv $$0, jj $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dgv $$0, jj $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dgv $$0, jj $$1, jo $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dhp $$0, jj $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dgv $$0, jj $$1) {
         return this.p;
      }

      public float a(cqi $$0, dgv $$1, jj $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dgv $$0, jj $$1, jo $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public euy r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dym $$0, jo $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fdo f(dgv $$0, jj $$1) {
         return this.a($$0, $$1, fcz.a());
      }

      public fdo a(dgv $$0, jj $$1, fcz $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fdo g(dgv $$0, jj $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fcz.a());
      }

      public fdo b(dgv $$0, jj $$1, fcz $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fdo h(dgv $$0, jj $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fdo c(dgv $$0, jj $$1, fcz $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fdo i(dgv $$0, jj $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dgv $$0, jj $$1, bvs $$2) {
         return this.a($$0, $$1, $$2, jo.b);
      }

      public final boolean a(dgv $$0, jj $$1, bvs $$2, jo $$3) {
         return dku.a(this.b($$0, $$1, fcz.a($$2)), $$3);
      }

      public fcu a(jj $$0) {
         dyl.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fcu.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dhp $$0, jj $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dhp $$0, jj $$1, dku $$2, @Nullable ewb $$3, boolean $$4) {
         agj.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dhq $$0, jj $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dhq $$0, jj $$1, int $$2, int $$3) {
         jj.a $$4 = new jj.a();

         for (jo $$5 : dyl.D) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dhq $$0, jj $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dhq $$0, jj $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dhp $$0, jj $$1, dym $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arn $$0, jj $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arn $$0, jj $$1, dhi $$2, BiConsumer<cxy, jj> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arn $$0, jj $$1, azs $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arn $$0, jj $$1, azs $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dhp $$0, jj $$1, bvs $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fdo b(dhp $$0, jj $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arn $$0, jj $$1, cxy $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cxy> a(exo.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public btq a(cxy $$0, dhp $$1, cqi $$2, btp $$3, fcq $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public btq a(dhp $$0, cqi $$1, fcq $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dhp $$0, jj $$1, cqi $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dgv $$0, jj $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dgv $$0, jj $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dym a(dhs $$0, die $$1, jj $$2, jo $$3, jj $$4, dym $$5, azs $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(evi $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dbn $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(eus $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dhs $$0, jj $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dgv $$0, jj $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bts c(dhp $$0, jj $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axp<dku> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axp<dku> $$0, Predicate<dyl.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jw<dku> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(js<dku> $$0) {
         return this.a($$0.a());
      }

      public Stream<axp<dku>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dnn;
      }

      @Nullable
      public <T extends dvl> dvm<T> a(dhp $$0, dvn<T> $$1) {
         return this.b() instanceof dnn ? ((dnn)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dku $$0) {
         return this.b() == $$0;
      }

      public boolean a(alc<dku> $$0) {
         return this.b().p().a($$0);
      }

      public eut y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jj $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dsn A() {
         return this.b().h_(this.B());
      }

      public void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dgv $$0, jj $$1, jo $$2) {
         return this.a($$0, $$1, $$2, dtb.a);
      }

      public boolean a(dgv $$0, jj $$1, jo $$2, dtb $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dgv $$0, jj $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public cxy a(dhs $$0, jj $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract dym B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dzn E() {
         return this.z;
      }

      static final class a {
         private static final jo[] d = jo.values();
         private static final int e = dtb.values().length;
         protected final fdo a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dym $$0) {
            dku $$1 = $$0.b();
            this.a = $$1.b($$0, dhf.a, jj.c, fcz.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", md.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jo.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jo $$2 : d) {
                  for (dtb $$3 : dtb.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dhf.a, jj.c, $$2);
                  }
               }

               this.c = dku.a($$0.g(dhf.a, jj.c));
            }
         }

         public boolean a(jo $$0, dtb $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jo $$0, dtb $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fcu evaluate(dym var1, jj var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dyl.d> a = Codec.unit(() -> a());
      Function<dym, eux> b = $$0 -> eux.a;
      boolean c = true;
      dsn d = dsn.f;
      ToIntFunction<dym> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alc<dku> m;
      private akv<dku, Optional<alc<exq>>> n = $$0 -> Optional.of(alc.a(me.bn, $$0.a().f("blocks/")));
      private akv<dku, String> o = $$0 -> af.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      euy v = euy.a;
      boolean w = true;
      dzn x = dzn.a;
      boolean y;
      dyl.e<bwb<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jo.b) && $$0.k() < 14;
      dyl.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dyl.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dyl.f C = this.B;
      dyl.f D = ($$0, $$1, $$2) -> false;
      dyl.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cte G = ctg.g;
      @Nullable
      dyl.b H;

      private d() {
      }

      public static dyl.d a() {
         return new dyl.d();
      }

      public static dyl.d a(dyl $$0) {
         dyl.d $$1 = b($$0);
         dyl.d $$2 = $$0.N;
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
      public static dyl.d b(dyl $$0) {
         dyl.d $$1 = new dyl.d();
         dyl.d $$2 = $$0.N;
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

      public dyl.d a(cwv $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dyl.d a(eux $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dyl.d a(Function<dym, eux> $$0) {
         this.b = $$0;
         return this;
      }

      public dyl.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dyl.d c() {
         this.p = false;
         return this;
      }

      public dyl.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dyl.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dyl.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dyl.d a(dsn $$0) {
         this.d = $$0;
         return this;
      }

      public dyl.d a(ToIntFunction<dym> $$0) {
         this.e = $$0;
         return this;
      }

      public dyl.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dyl.d d() {
         return this.d(0.0F);
      }

      public dyl.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dyl.d e() {
         this.i = true;
         return this;
      }

      public dyl.d f() {
         this.F = true;
         return this;
      }

      public dyl.d g() {
         this.n = akv.fixed(Optional.empty());
         return this;
      }

      public dyl.d a(Optional<alc<exq>> $$0) {
         this.n = akv.fixed($$0);
         return this;
      }

      protected Optional<alc<exq>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dyl.d i() {
         this.r = true;
         return this;
      }

      public dyl.d j() {
         this.s = true;
         return this;
      }

      public dyl.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dyl.d l() {
         this.t = true;
         return this;
      }

      public dyl.d a(euy $$0) {
         this.v = $$0;
         return this;
      }

      public dyl.d m() {
         this.q = true;
         return this;
      }

      public dyl.d a(dyl.e<bwb<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dyl.d a(dyl.f $$0) {
         this.A = $$0;
         return this;
      }

      public dyl.d b(dyl.f $$0) {
         this.B = $$0;
         return this;
      }

      public dyl.d c(dyl.f $$0) {
         this.C = $$0;
         return this;
      }

      public dyl.d d(dyl.f $$0) {
         this.D = $$0;
         return this;
      }

      public dyl.d e(dyl.f $$0) {
         this.E = $$0;
         return this;
      }

      public dyl.d n() {
         this.h = true;
         return this;
      }

      public dyl.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dyl.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dyl.d a(dyl.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dku $$2 = $$0x.b();
            long $$3 = azk.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.an_();
            double $$5 = azk.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azk.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new fcu($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dku $$2 = $$0x.b();
            long $$3 = azk.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.ap_();
            float $$5 = $$2.an_();
            double $$6 = azk.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azk.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new fcu($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dyl.d o() {
         this.w = false;
         return this;
      }

      public dyl.d a(ctc... $$0) {
         this.G = ctg.e.a($$0);
         return this;
      }

      public dyl.d a(dzn $$0) {
         this.x = $$0;
         return this;
      }

      public dyl.d p() {
         this.y = true;
         return this;
      }

      public dyl.d a(alc<dku> $$0) {
         this.m = $$0;
         return this;
      }

      public dyl.d a(String $$0) {
         this.o = akv.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dym var1, dgv var2, jj var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dym var1, dgv var2, jj var3);
   }
}
