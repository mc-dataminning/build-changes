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

public abstract class dvi implements crc {
   protected static final jm[] aG = new jm[]{jm.e, jm.f, jm.c, jm.d, jm.a, jm.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dpr aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final crf aP;
   protected final dvi.d aQ;
   protected final Optional<alh<euh>> aR;
   protected final String aS;

   public dvi(dvi.d $$0) {
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

   public dvi.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends die> a();

   protected static <B extends die> RecordCodecBuilder<B, dvi.d> t() {
      return dvi.d.a.fieldOf("properties").forGetter(dvi::s);
   }

   public static <B extends die> MapCodec<B> b(Function<dvi.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dvj $$0, dfc $$1, jh $$2, int $$3, int $$4) {
   }

   protected boolean a(dvj $$0, erz $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(deq.a, jh.c);
         case b:
            return $$0.y().a(axg.a);
         case c:
            return !$$0.m(deq.a, jh.c);
         default:
            return false;
      }
   }

   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$0;
   }

   protected boolean b(dvj $$0, dvj $$1, jm $$2) {
      return false;
   }

   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
   }

   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
   }

   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dvj $$0, arn $$1, jh $$2, det $$3, BiConsumer<cwb, jh> $$4) {
      if (!$$0.l() && $$3.a() != det.a.d) {
         die $$5 = $$0.b();
         boolean $$6 = $$3.b() instanceof com;
         if ($$5.a($$3)) {
            dsm $$7 = $$0.x() ? $$1.c_($$2) : null;
            euf.a $$8 = new euf.a($$1).a(ewy.f, ezn.b($$2)).a(ewy.i, cwb.k).b(ewy.h, $$7).b(ewy.a, $$3.c());
            if ($$3.a() == det.a.c) {
               $$8.a(ewy.j, $$3.d());
            }

            $$0.a($$1, $$2, cwb.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dig.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      return bsd.e;
   }

   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      return bsd.f;
   }

   protected boolean a(dvj $$0, dfb $$1, jh $$2, int $$3, int $$4) {
      return false;
   }

   protected dok a_(dvj $$0) {
      return dok.c;
   }

   protected boolean g_(dvj $$0) {
      return false;
   }

   protected boolean f_(dvj $$0) {
      return false;
   }

   protected erk b_(dvj $$0) {
      return erl.a.g();
   }

   protected boolean c_(dvj $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public crf i() {
      return this.aP;
   }

   protected dvj a(dvj $$0, dor $$1) {
      return $$0;
   }

   protected dvj a(dvj $$0, dna $$1) {
      return $$0;
   }

   protected boolean a(dvj $$0, czs $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dvj $$0, erj $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cwb> a(dvj $$0, euf.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         euf $$2 = $$1.a(ewy.g, $$0).a(ewx.r);
         arn $$3 = $$2.a();
         euh $$4 = $$3.o().bc().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dvj $$0, jh $$1) {
      return azk.a($$1);
   }

   protected fah d_(dvj $$0) {
      return $$0.f(deq.a, jh.c);
   }

   protected fah b_(dvj $$0, deg $$1, jh $$2) {
      return this.b($$0, $$1, $$2, ezs.a());
   }

   protected fah a(dvj $$0, deg $$1, jh $$2) {
      return fae.a();
   }

   protected int i_(dvj $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return null;
   }

   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return true;
   }

   protected float c(dvj $$0, deg $$1, jh $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return 0;
   }

   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return fae.b();
   }

   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.aH ? $$0.f($$1, $$2) : fae.a();
   }

   protected boolean a_(dvj $$0, deg $$1, jh $$2) {
      return die.a($$0.g($$1, $$2));
   }

   protected fah c(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
   }

   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
   }

   protected float a(dvj $$0, com $$1, deg $$2, jh $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
   }

   protected void a_(dvj $$0, dfb $$1, jh $$2, com $$3) {
   }

   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return 0;
   }

   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
   }

   protected fah a_(dvj $$0, dfb $$1, jh $$2) {
      return fae.b();
   }

   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return 0;
   }

   public final Optional<alh<euh>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
   }

   protected boolean e_(dvj $$0) {
      return !die.a($$0.f(deq.a, jh.c)) && $$0.y().c();
   }

   protected boolean f(dvj $$0) {
      return this.aJ;
   }

   protected dpr h_(dvj $$0) {
      return this.aK;
   }

   public abstract cvx j();

   protected abstract die o();

   public ero w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dvl<die, dvj> {
      private static final jm[] a = jm.values();
      private static final fah[] f = ae.a(new fah[a.length], $$0 -> Arrays.fill($$0, fae.a()));
      private static final fah[] g = ae.a(new fah[a.length], $$0 -> Arrays.fill($$0, fae.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final erp n;
      private final ero o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dvi.f s;
      private final dvi.f t;
      private final dvi.f u;
      private final dvi.f v;
      private final dvi.f w;
      @Nullable
      private final dvi.b x;
      private final boolean y;
      private final dwk z;
      private final boolean A;
      @Nullable
      private dvi.a.a B;
      private erk C = erl.a.g();
      private boolean D;
      private boolean E;
      private fah F;
      private fah[] G;
      private boolean H;
      private int I;

      protected a(die $$0, Reference2ObjectArrayMap<dwm<?>, Comparable<?>> $$1, MapCodec<dvj> $$2) {
         super($$0, $$1, $$2);
         dvi.d $$3 = $$0.aQ;
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
            fah $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               ezi $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dvi.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fae.a();
         this.E = die.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fah[a.length];

            for (jm $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public die b() {
         return this.d;
      }

      public jq<die> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         die $$0 = this.b();
         return $$0 != dig.bs && $$0 != dig.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(deg $$0, jh $$1, bul<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fah a(jm $$0) {
         return this.G[$$0.ordinal()];
      }

      public fah h() {
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

      public ero a(deg $$0, jh $$1) {
         return this.o;
      }

      public dvj a(dor $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dvj a(dna $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dok o() {
         return this.b().a_(this.B());
      }

      public boolean b(deg $$0, jh $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(deg $$0, jh $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(deg $$0, jh $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(deg $$0, jh $$1, jm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dfb $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(deg $$0, jh $$1) {
         return this.p;
      }

      public float a(com $$0, deg $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(deg $$0, jh $$1, jm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public erp r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dvj $$0, jm $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fah f(deg $$0, jh $$1) {
         return this.a($$0, $$1, ezs.a());
      }

      public fah a(deg $$0, jh $$1, ezs $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fah g(deg $$0, jh $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ezs.a());
      }

      public fah b(deg $$0, jh $$1, ezs $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fah h(deg $$0, jh $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fah c(deg $$0, jh $$1, ezs $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fah i(deg $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(deg $$0, jh $$1, bue $$2) {
         return this.a($$0, $$1, $$2, jm.b);
      }

      public final boolean a(deg $$0, jh $$1, bue $$2, jm $$3) {
         return die.a(this.b($$0, $$1, ezs.a($$2)), $$3);
      }

      public ezn a(jh $$0) {
         dvi.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : ezn.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dfb $$0, jh $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dfb $$0, jh $$1, die $$2, @Nullable ess $$3, boolean $$4) {
         ags.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dfc $$0, jh $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dfc $$0, jh $$1, int $$2, int $$3) {
         jh.a $$4 = new jh.a();

         for (jm $$5 : dvi.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dfc $$0, jh $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dfc $$0, jh $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dfb $$0, jh $$1, dvj $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dfb $$0, jh $$1, dvj $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arn $$0, jh $$1, det $$2, BiConsumer<cwb, jh> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arn $$0, jh $$1, azs $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arn $$0, jh $$1, azs $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dfb $$0, jh $$1, bue $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fah b(dfb $$0, jh $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arn $$0, jh $$1, cwb $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cwb> a(euf.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bsd a(cwb $$0, dfb $$1, com $$2, bsc $$3, ezj $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bsd a(dfb $$0, com $$1, ezj $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dfb $$0, jh $$1, com $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(deg $$0, jh $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(deg $$0, jh $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dvj a(jm $$0, dvj $$1, dfc $$2, jh $$3, jh $$4) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(erz $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(czs $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(erj $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dfe $$0, jh $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(deg $$0, jh $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsf c(dfb $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axq<die> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axq<die> $$0, Predicate<dvi.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(ju<die> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jq<die> $$0) {
         return this.a($$0.a());
      }

      public Stream<axq<die>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dkw;
      }

      @Nullable
      public <T extends dsm> dsn<T> a(dfb $$0, dso<T> $$1) {
         return this.b() instanceof dkw ? ((dkw)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(die $$0) {
         return this.b() == $$0;
      }

      public boolean a(alh<die> $$0) {
         return this.b().p().a($$0);
      }

      public erk y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jh $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpr A() {
         return this.b().h_(this.B());
      }

      public void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(deg $$0, jh $$1, jm $$2) {
         return this.a($$0, $$1, $$2, dqf.a);
      }

      public boolean a(deg $$0, jh $$1, jm $$2, dqf $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(deg $$0, jh $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dvj B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dwk E() {
         return this.z;
      }

      static final class a {
         private static final jm[] d = jm.values();
         private static final int e = dqf.values().length;
         protected final fah a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dvj $$0) {
            die $$1 = $$0.b();
            this.a = $$1.b($$0, deq.a, jh.c, ezs.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", ly.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jm.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jm $$2 : d) {
                  for (dqf $$3 : dqf.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, deq.a, jh.c, $$2);
                  }
               }

               this.c = die.a($$0.g(deq.a, jh.c));
            }
         }

         public boolean a(jm $$0, dqf $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jm $$0, dqf $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ezn evaluate(dvj var1, jh var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dvi.d> a = Codec.unit(() -> a());
      Function<dvj, ero> b = $$0 -> ero.a;
      boolean c = true;
      dpr d = dpr.f;
      ToIntFunction<dvj> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alh<die> m;
      private ala<die, Optional<alh<euh>>> n = $$0 -> Optional.of(alh.a(lz.bd, $$0.a().f("blocks/")));
      private ala<die, String> o = $$0 -> ae.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      erp v = erp.a;
      boolean w = true;
      dwk x = dwk.a;
      boolean y;
      dvi.e<bul<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jm.b) && $$0.k() < 14;
      dvi.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dvi.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dvi.f C = this.B;
      dvi.f D = ($$0, $$1, $$2) -> false;
      dvi.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      crf G = crh.h;
      @Nullable
      dvi.b H;

      private d() {
      }

      public static dvi.d a() {
         return new dvi.d();
      }

      public static dvi.d a(dvi $$0) {
         dvi.d $$1 = b($$0);
         dvi.d $$2 = $$0.aQ;
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
      public static dvi.d b(dvi $$0) {
         dvi.d $$1 = new dvi.d();
         dvi.d $$2 = $$0.aQ;
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

      public dvi.d a(cuy $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dvi.d a(ero $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dvi.d a(Function<dvj, ero> $$0) {
         this.b = $$0;
         return this;
      }

      public dvi.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dvi.d c() {
         this.p = false;
         return this;
      }

      public dvi.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dvi.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dvi.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dvi.d a(dpr $$0) {
         this.d = $$0;
         return this;
      }

      public dvi.d a(ToIntFunction<dvj> $$0) {
         this.e = $$0;
         return this;
      }

      public dvi.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dvi.d d() {
         return this.d(0.0F);
      }

      public dvi.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dvi.d e() {
         this.i = true;
         return this;
      }

      public dvi.d f() {
         this.F = true;
         return this;
      }

      public dvi.d g() {
         this.n = ala.fixed(Optional.empty());
         return this;
      }

      public dvi.d a(Optional<alh<euh>> $$0) {
         this.n = ala.fixed($$0);
         return this;
      }

      protected Optional<alh<euh>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dvi.d i() {
         this.r = true;
         return this;
      }

      public dvi.d j() {
         this.s = true;
         return this;
      }

      public dvi.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dvi.d l() {
         this.t = true;
         return this;
      }

      public dvi.d a(erp $$0) {
         this.v = $$0;
         return this;
      }

      public dvi.d m() {
         this.q = true;
         return this;
      }

      public dvi.d a(dvi.e<bul<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dvi.d a(dvi.f $$0) {
         this.A = $$0;
         return this;
      }

      public dvi.d b(dvi.f $$0) {
         this.B = $$0;
         return this;
      }

      public dvi.d c(dvi.f $$0) {
         this.C = $$0;
         return this;
      }

      public dvi.d d(dvi.f $$0) {
         this.D = $$0;
         return this;
      }

      public dvi.d e(dvi.f $$0) {
         this.E = $$0;
         return this;
      }

      public dvi.d n() {
         this.h = true;
         return this;
      }

      public dvi.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dvi.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dvi.d a(dvi.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            die $$2 = $$0x.b();
            long $$3 = azk.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = azk.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azk.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new ezn($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            die $$2 = $$0x.b();
            long $$3 = azk.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = azk.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azk.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new ezn($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dvi.d o() {
         this.w = false;
         return this;
      }

      public dvi.d a(crd... $$0) {
         this.G = crh.f.a($$0);
         return this;
      }

      public dvi.d a(dwk $$0) {
         this.x = $$0;
         return this;
      }

      public dvi.d p() {
         this.y = true;
         return this;
      }

      public dvi.d a(alh<die> $$0) {
         this.m = $$0;
         return this;
      }

      public dvi.d a(String $$0) {
         this.o = ala.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dvj var1, deg var2, jh var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dvj var1, deg var2, jh var3);
   }
}
