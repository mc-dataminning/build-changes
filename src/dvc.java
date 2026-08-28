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

public abstract class dvc implements cqx {
   protected static final jl[] aG = new jl[]{jl.e, jl.f, jl.c, jl.d, jl.a, jl.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dpl aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final cra aP;
   protected final dvc.d aQ;
   protected final Optional<alg<eub>> aR;
   protected final String aS;

   public dvc(dvc.d $$0) {
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

   public dvc.d s() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dhy> a();

   protected static <B extends dhy> RecordCodecBuilder<B, dvc.d> t() {
      return dvc.d.a.fieldOf("properties").forGetter(dvc::s);
   }

   public static <B extends dhy> MapCodec<B> b(Function<dvc.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(dvd $$0, dew $$1, jg $$2, int $$3, int $$4) {
   }

   protected boolean a(dvd $$0, ert $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dek.a, jg.c);
         case b:
            return $$0.y().a(axf.a);
         case c:
            return !$$0.m(dek.a, jg.c);
         default:
            return false;
      }
   }

   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$0;
   }

   protected boolean b(dvd $$0, dvd $$1, jl $$2) {
      return false;
   }

   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
   }

   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
   }

   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if (!$$0.l() && $$3.a() != den.a.d) {
         dhy $$5 = $$0.b();
         boolean $$6 = $$3.b() instanceof coh;
         if ($$5.a($$3)) {
            dsg $$7 = $$0.x() ? $$1.c_($$2) : null;
            etz.a $$8 = new etz.a($$1).a(ews.f, ezh.b($$2)).a(ews.i, cvx.k).b(ews.h, $$7).b(ews.a, $$3.c());
            if ($$3.a() == den.a.c) {
               $$8.a(ews.j, $$3.d());
            }

            $$0.a($$1, $$2, cvx.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dia.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      return bry.e;
   }

   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      return bry.f;
   }

   protected boolean a(dvd $$0, dev $$1, jg $$2, int $$3, int $$4) {
      return false;
   }

   protected doe a_(dvd $$0) {
      return doe.c;
   }

   protected boolean g_(dvd $$0) {
      return false;
   }

   protected boolean f_(dvd $$0) {
      return false;
   }

   protected ere b_(dvd $$0) {
      return erf.a.g();
   }

   protected boolean c_(dvd $$0) {
      return false;
   }

   protected float at_() {
      return 0.25F;
   }

   protected float av_() {
      return 0.2F;
   }

   @Override
   public cra i() {
      return this.aP;
   }

   protected dvd a(dvd $$0, dol $$1) {
      return $$0;
   }

   protected dvd a(dvd $$0, dmu $$1) {
      return $$0;
   }

   protected boolean a(dvd $$0, czm $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.j()));
   }

   protected boolean a(dvd $$0, erd $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cvx> a(dvd $$0, etz.a $$1) {
      if (this.aR.isEmpty()) {
         return Collections.emptyList();
      } else {
         etz $$2 = $$1.a(ews.g, $$0).a(ewr.r);
         arm $$3 = $$2.a();
         eub $$4 = $$3.o().bd().b(this.aR.get());
         return $$4.a($$2);
      }
   }

   protected long a(dvd $$0, jg $$1) {
      return azj.a($$1);
   }

   protected fab d_(dvd $$0) {
      return $$0.f(dek.a, jg.c);
   }

   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      return this.b($$0, $$1, $$2, ezm.a());
   }

   protected fab a(dvd $$0, dea $$1, jg $$2) {
      return ezy.a();
   }

   protected int i_(dvd $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return null;
   }

   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return true;
   }

   protected float c(dvd $$0, dea $$1, jg $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dvd $$0, dev $$1, jg $$2) {
      return 0;
   }

   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ezy.b();
   }

   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.aH ? $$0.f($$1, $$2) : ezy.a();
   }

   protected boolean a_(dvd $$0, dea $$1, jg $$2) {
      return dhy.a($$0.g($$1, $$2));
   }

   protected fab c(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
   }

   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
   }

   protected float a(dvd $$0, coh $$1, dea $$2, jg $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
   }

   protected void a_(dvd $$0, dev $$1, jg $$2, coh $$3) {
   }

   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return 0;
   }

   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
   }

   protected fab a_(dvd $$0, dev $$1, jg $$2) {
      return ezy.b();
   }

   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return 0;
   }

   public final Optional<alg<eub>> u() {
      return this.aR;
   }

   public final String v() {
      return this.aS;
   }

   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
   }

   protected boolean e_(dvd $$0) {
      return !dhy.a($$0.f(dek.a, jg.c)) && $$0.y().c();
   }

   protected boolean f(dvd $$0) {
      return this.aJ;
   }

   protected dpl h_(dvd $$0) {
      return this.aK;
   }

   public abstract cvt j();

   protected abstract dhy o();

   public eri w() {
      return this.aQ.b.apply(this.o().m());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends dvf<dhy, dvd> {
      private static final jl[] a = jl.values();
      private static final fab[] f = ad.a(new fab[a.length], $$0 -> Arrays.fill($$0, ezy.a()));
      private static final fab[] g = ad.a(new fab[a.length], $$0 -> Arrays.fill($$0, ezy.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final erj n;
      private final eri o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dvc.f s;
      private final dvc.f t;
      private final dvc.f u;
      private final dvc.f v;
      private final dvc.f w;
      @Nullable
      private final dvc.b x;
      private final boolean y;
      private final dwe z;
      private final boolean A;
      @Nullable
      private dvc.a.a B;
      private ere C = erf.a.g();
      private boolean D;
      private boolean E;
      private fab F;
      private fab[] G;
      private boolean H;
      private int I;

      protected a(dhy $$0, Reference2ObjectArrayMap<dwg<?>, Comparable<?>> $$1, MapCodec<dvd> $$2) {
         super($$0, $$1, $$2);
         dvc.d $$3 = $$0.aQ;
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
            fab $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               ezc $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new dvc.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : ezy.a();
         this.E = dhy.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fab[a.length];

            for (jl $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dhy b() {
         return this.d;
      }

      public jp<dhy> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dhy $$0 = this.b();
         return $$0 != dia.bs && $$0 != dia.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dea $$0, jg $$1, bug<?> $$2) {
         return this.b().aQ.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fab a(jl $$0) {
         return this.G[$$0.ordinal()];
      }

      public fab h() {
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

      public eri a(dea $$0, jg $$1) {
         return this.o;
      }

      public dvd a(dol $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dvd a(dmu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public doe o() {
         return this.b().a_(this.B());
      }

      public boolean b(dea $$0, jg $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dea $$0, jg $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dea $$0, jg $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dea $$0, jg $$1, jl $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dev $$0, jg $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dea $$0, jg $$1) {
         return this.p;
      }

      public float a(coh $$0, dea $$1, jg $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dea $$0, jg $$1, jl $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public erj r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(dvd $$0, jl $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fab f(dea $$0, jg $$1) {
         return this.a($$0, $$1, ezm.a());
      }

      public fab a(dea $$0, jg $$1, ezm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fab g(dea $$0, jg $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ezm.a());
      }

      public fab b(dea $$0, jg $$1, ezm $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fab h(dea $$0, jg $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fab c(dea $$0, jg $$1, ezm $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fab i(dea $$0, jg $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(dea $$0, jg $$1, btz $$2) {
         return this.a($$0, $$1, $$2, jl.b);
      }

      public final boolean a(dea $$0, jg $$1, btz $$2, jl $$3) {
         return dhy.a(this.b($$0, $$1, ezm.a($$2)), $$3);
      }

      public ezh a(jg $$0) {
         dvc.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : ezh.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dev $$0, jg $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dev $$0, jg $$1, dhy $$2, @Nullable esm $$3, boolean $$4) {
         agr.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dew $$0, jg $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dew $$0, jg $$1, int $$2, int $$3) {
         jg.a $$4 = new jg.a();

         for (jl $$5 : dvc.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dew $$0, jg $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dew $$0, jg $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dev $$0, jg $$1, dvd $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(dev $$0, jg $$1, dvd $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arm $$0, jg $$1, den $$2, BiConsumer<cvx, jg> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arm $$0, jg $$1, azr $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arm $$0, jg $$1, azr $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dev $$0, jg $$1, btz $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fab b(dev $$0, jg $$1) {
         return this.b().a_(this.B(), $$0, $$1);
      }

      public void a(arm $$0, jg $$1, cvx $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cvx> a(etz.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bry a(cvx $$0, dev $$1, coh $$2, brx $$3, ezd $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bry a(dev $$0, coh $$1, ezd $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dev $$0, jg $$1, coh $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dea $$0, jg $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dea $$0, jg $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public dvd a(jl $$0, dvd $$1, dew $$2, jg $$3, jg $$4) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(ert $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(czm $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(erd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dey $$0, jg $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dea $$0, jg $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bsa c(dev $$0, jg $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axp<dhy> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axp<dhy> $$0, Predicate<dvc.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jt<dhy> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jp<dhy> $$0) {
         return this.a($$0.a());
      }

      public Stream<axp<dhy>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dkq;
      }

      @Nullable
      public <T extends dsg> dsh<T> a(dev $$0, dsi<T> $$1) {
         return this.b() instanceof dkq ? ((dkq)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dhy $$0) {
         return this.b() == $$0;
      }

      public boolean a(alg<dhy> $$0) {
         return this.b().p().a($$0);
      }

      public ere y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jg $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dpl A() {
         return this.b().h_(this.B());
      }

      public void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dea $$0, jg $$1, jl $$2) {
         return this.a($$0, $$1, $$2, dpz.a);
      }

      public boolean a(dea $$0, jg $$1, jl $$2, dpz $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dea $$0, jg $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract dvd B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dwe E() {
         return this.z;
      }

      static final class a {
         private static final jl[] d = jl.values();
         private static final int e = dpz.values().length;
         protected final fab a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(dvd $$0) {
            dhy $$1 = $$0.b();
            this.a = $$1.b($$0, dek.a, jg.c, ezm.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lx.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jl.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jl $$2 : d) {
                  for (dpz $$3 : dpz.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dek.a, jg.c, $$2);
                  }
               }

               this.c = dhy.a($$0.g(dek.a, jg.c));
            }
         }

         public boolean a(jl $$0, dpz $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jl $$0, dpz $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ezh evaluate(dvd var1, jg var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dvc.d> a = Codec.unit(() -> a());
      Function<dvd, eri> b = $$0 -> eri.a;
      boolean c = true;
      dpl d = dpl.f;
      ToIntFunction<dvd> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alg<dhy> m;
      private akz<dhy, Optional<alg<eub>>> n = $$0 -> Optional.of(alg.a(ly.bd, $$0.a().f("blocks/")));
      private akz<dhy, String> o = $$0 -> ad.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      erj v = erj.a;
      boolean w = true;
      dwe x = dwe.a;
      boolean y;
      dvc.e<bug<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jl.b) && $$0.k() < 14;
      dvc.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dvc.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dvc.f C = this.B;
      dvc.f D = ($$0, $$1, $$2) -> false;
      dvc.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cra G = crc.h;
      @Nullable
      dvc.b H;

      private d() {
      }

      public static dvc.d a() {
         return new dvc.d();
      }

      public static dvc.d a(dvc $$0) {
         dvc.d $$1 = b($$0);
         dvc.d $$2 = $$0.aQ;
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
      public static dvc.d b(dvc $$0) {
         dvc.d $$1 = new dvc.d();
         dvc.d $$2 = $$0.aQ;
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

      public dvc.d a(cuu $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dvc.d a(eri $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dvc.d a(Function<dvd, eri> $$0) {
         this.b = $$0;
         return this;
      }

      public dvc.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public dvc.d c() {
         this.p = false;
         return this;
      }

      public dvc.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dvc.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dvc.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dvc.d a(dpl $$0) {
         this.d = $$0;
         return this;
      }

      public dvc.d a(ToIntFunction<dvd> $$0) {
         this.e = $$0;
         return this;
      }

      public dvc.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dvc.d d() {
         return this.d(0.0F);
      }

      public dvc.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dvc.d e() {
         this.i = true;
         return this;
      }

      public dvc.d f() {
         this.F = true;
         return this;
      }

      public dvc.d g() {
         this.n = akz.fixed(Optional.empty());
         return this;
      }

      public dvc.d a(Optional<alg<eub>> $$0) {
         this.n = akz.fixed($$0);
         return this;
      }

      protected Optional<alg<eub>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public dvc.d i() {
         this.r = true;
         return this;
      }

      public dvc.d j() {
         this.s = true;
         return this;
      }

      public dvc.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public dvc.d l() {
         this.t = true;
         return this;
      }

      public dvc.d a(erj $$0) {
         this.v = $$0;
         return this;
      }

      public dvc.d m() {
         this.q = true;
         return this;
      }

      public dvc.d a(dvc.e<bug<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public dvc.d a(dvc.f $$0) {
         this.A = $$0;
         return this;
      }

      public dvc.d b(dvc.f $$0) {
         this.B = $$0;
         return this;
      }

      public dvc.d c(dvc.f $$0) {
         this.C = $$0;
         return this;
      }

      public dvc.d d(dvc.f $$0) {
         this.D = $$0;
         return this;
      }

      public dvc.d e(dvc.f $$0) {
         this.E = $$0;
         return this;
      }

      public dvc.d n() {
         this.h = true;
         return this;
      }

      public dvc.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dvc.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dvc.d a(dvc.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dhy $$2 = $$0x.b();
            long $$3 = azj.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.at_();
            double $$5 = azj.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azj.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new ezh($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dhy $$2 = $$0x.b();
            long $$3 = azj.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.av_();
            float $$5 = $$2.at_();
            double $$6 = azj.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azj.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new ezh($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dvc.d o() {
         this.w = false;
         return this;
      }

      public dvc.d a(cqy... $$0) {
         this.G = crc.f.a($$0);
         return this;
      }

      public dvc.d a(dwe $$0) {
         this.x = $$0;
         return this;
      }

      public dvc.d p() {
         this.y = true;
         return this;
      }

      public dvc.d a(alg<dhy> $$0) {
         this.m = $$0;
         return this;
      }

      public dvc.d a(String $$0) {
         this.o = akz.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(dvd var1, dea var2, jg var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(dvd var1, dea var2, jg var3);
   }
}
