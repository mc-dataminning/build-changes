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

public abstract class ebd implements cve {
   protected static final jb[] E = new jb[]{jb.e, jb.f, jb.c, jb.d, jb.a, jb.b};
   protected final boolean F;
   protected final float G;
   protected final boolean H;
   protected final duz I;
   protected final float J;
   protected final float K;
   protected final float L;
   protected final boolean M;
   protected final cvh N;
   protected final ebd.d O;
   protected final Optional<alh<fam>> P;
   protected final String Q;

   public ebd(ebd.d $$0) {
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

   public ebd.d s() {
      return this.O;
   }

   protected abstract MapCodec<? extends dnc> a();

   protected static <B extends dnc> RecordCodecBuilder<B, ebd.d> t() {
      return ebd.d.a.fieldOf("properties").forGetter(ebd::s);
   }

   public static <B extends dnc> MapCodec<B> b(Function<ebd.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(ebe $$0, djy $$1, iv $$2, int $$3, int $$4) {
   }

   protected boolean a(ebe $$0, eyd $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(djn.a, iv.c);
         case b:
            return $$0.y().a(axj.a);
         case c:
            return !$$0.m(djn.a, iv.c);
         default:
            return false;
      }
   }

   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$0;
   }

   protected boolean b(ebe $$0, ebe $$1, jb $$2) {
      return false;
   }

   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
   }

   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
   }

   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
   }

   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if (!$$0.l() && $$3.b() != djq.a.d) {
         dnc $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof crx;
         if ($$5.a($$3)) {
            dyc $$7 = $$0.x() ? $$1.c_($$2) : null;
            fak.a $$8 = new fak.a($$1).a(fdb.f, ffq.b($$2)).a(fdb.i, czy.k).b(fdb.h, $$7).b(fdb.a, $$3.d());
            if ($$3.b() == djq.a.c) {
               $$8.a(fdb.j, $$3.e());
            }

            $$0.a($$1, $$2, czy.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dne.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      return bur.e;
   }

   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      return bur.f;
   }

   protected boolean a(ebe $$0, djx $$1, iv $$2, int $$3, int $$4) {
      return false;
   }

   protected dtp a_(ebe $$0) {
      return dtp.b;
   }

   protected boolean g_(ebe $$0) {
      return false;
   }

   protected boolean f_(ebe $$0) {
      return false;
   }

   protected exo b_(ebe $$0) {
      return exp.a.g();
   }

   protected boolean c_(ebe $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public cvh k() {
      return this.N;
   }

   protected ebe a(ebe $$0, dtw $$1) {
      return $$0;
   }

   protected ebe a(ebe $$0, dsf $$1) {
      return $$0;
   }

   protected boolean a(ebe $$0, ddr $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(ebe $$0, exn $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<czy> a(ebe $$0, fak.a $$1) {
      if (this.P.isEmpty()) {
         return Collections.emptyList();
      } else {
         fak $$2 = $$1.a(fdb.g, $$0).a(fda.r);
         ars $$3 = $$2.a();
         fam $$4 = $$3.p().bc().b(this.P.get());
         return $$4.a($$2);
      }
   }

   protected long a(ebe $$0, iv $$1) {
      return azo.a($$1);
   }

   protected fgk d_(ebe $$0) {
      return $$0.f(djn.a, iv.c);
   }

   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      return this.b($$0, $$1, $$2, ffv.a());
   }

   protected fgk a(ebe $$0, djb $$1, iv $$2) {
      return fgh.a();
   }

   protected int i_(ebe $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return null;
   }

   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return true;
   }

   protected float c(ebe $$0, djb $$1, iv $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(ebe $$0, djx $$1, iv $$2) {
      return 0;
   }

   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.b();
   }

   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.F ? $$0.f($$1, $$2) : fgh.a();
   }

   protected fgk a(ebe $$0, djb $$1, iv $$2, bwt $$3) {
      return fgh.b();
   }

   protected boolean a_(ebe $$0, djb $$1, iv $$2) {
      return dnc.a($$0.g($$1, $$2));
   }

   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
   }

   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
   }

   protected float a(ebe $$0, crx $$1, djb $$2, iv $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
   }

   protected void a_(ebe $$0, djx $$1, iv $$2, crx $$3) {
   }

   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return 0;
   }

   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
   }

   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return 0;
   }

   public final Optional<alh<fam>> u() {
      return this.P;
   }

   public final String v() {
      return this.Q;
   }

   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
   }

   protected boolean e_(ebe $$0) {
      return !dnc.a($$0.f(djn.a, iv.c)) && $$0.y().c();
   }

   protected boolean f(ebe $$0) {
      return this.H;
   }

   protected duz h_(ebe $$0) {
      return this.I;
   }

   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(this.h());
   }

   public abstract czu h();

   protected abstract dnc o();

   public exs w() {
      return this.O.b.apply(this.o().m());
   }

   public float x() {
      return this.O.g;
   }

   public abstract static class a extends ebg<dnc, ebe> {
      private static final jb[] a = jb.values();
      private static final fgk[] f = ag.a(new fgk[a.length], $$0 -> Arrays.fill($$0, fgh.a()));
      private static final fgk[] g = ag.a(new fgk[a.length], $$0 -> Arrays.fill($$0, fgh.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final ext n;
      private final exs o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final ebd.f s;
      private final ebd.f t;
      private final ebd.f u;
      private final ebd.f v;
      private final ebd.f w;
      @Nullable
      private final ebd.b x;
      private final boolean y;
      private final ecf z;
      private final boolean A;
      @Nullable
      private ebd.a.a B;
      private exo C = exp.a.g();
      private boolean D;
      private boolean E;
      private fgk F;
      private fgk[] G;
      private boolean H;
      private int I;

      protected a(dnc $$0, Reference2ObjectArrayMap<ech<?>, Comparable<?>> $$1, MapCodec<ebe> $$2) {
         super($$0, $$1, $$2);
         ebd.d $$3 = $$0.O;
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
            fgk $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               ffl $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new ebd.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fgh.a();
         this.E = dnc.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fgk[a.length];

            for (jb $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dnc b() {
         return this.d;
      }

      public jf<dnc> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dnc $$0 = this.b();
         return $$0 != dne.bz && $$0 != dne.nE && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(djb $$0, iv $$1, bxc<?> $$2) {
         return this.b().O.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fgk a(jb $$0) {
         return this.G[$$0.ordinal()];
      }

      public fgk h() {
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

      public exs a(djb $$0, iv $$1) {
         return this.o;
      }

      public ebe a(dtw $$0) {
         return this.b().a(this.B(), $$0);
      }

      public ebe a(dsf $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dtp o() {
         return this.b().a_(this.B());
      }

      public boolean b(djb $$0, iv $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(djb $$0, iv $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(djb $$0, iv $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(djb $$0, iv $$1, jb $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(djx $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(djb $$0, iv $$1) {
         return this.p;
      }

      public float a(crx $$0, djb $$1, iv $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(djb $$0, iv $$1, jb $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ext r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(ebe $$0, jb $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fgk f(djb $$0, iv $$1) {
         return this.a($$0, $$1, ffv.a());
      }

      public fgk a(djb $$0, iv $$1, ffv $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fgk g(djb $$0, iv $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, ffv.a());
      }

      public fgk b(djb $$0, iv $$1, ffv $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fgk a(djb $$0, iv $$1, bwt $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fgk h(djb $$0, iv $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fgk c(djb $$0, iv $$1, ffv $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fgk i(djb $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(djb $$0, iv $$1, bwt $$2) {
         return this.a($$0, $$1, $$2, jb.b);
      }

      public final boolean a(djb $$0, iv $$1, bwt $$2, jb $$3) {
         return dnc.a(this.b($$0, $$1, ffv.a($$2)), $$3);
      }

      public ffq a(iv $$0) {
         ebd.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : ffq.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(djx $$0, iv $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djx $$0, iv $$1, dnc $$2, @Nullable eyw $$3, boolean $$4) {
         ago.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(djy $$0, iv $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(djy $$0, iv $$1, int $$2, int $$3) {
         iv.a $$4 = new iv.a();

         for (jb $$5 : ebd.E) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(djy $$0, iv $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(djy $$0, iv $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(djx $$0, iv $$1, ebe $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ars $$0, iv $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(ars $$0, iv $$1, djq $$2, BiConsumer<czy, iv> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ars $$0, iv $$1, azx $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(ars $$0, iv $$1, azx $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(djx $$0, iv $$1, bwt $$2, bxm $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(ars $$0, iv $$1, czy $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<czy> a(fak.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bur a(czy $$0, djx $$1, crx $$2, buq $$3, ffm $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bur a(djx $$0, crx $$1, ffm $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(djx $$0, iv $$1, crx $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(djb $$0, iv $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(djb $$0, iv $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public ebe a(dka $$0, dkm $$1, iv $$2, jb $$3, iv $$4, ebe $$5, azx $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(eyd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(ddr $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(exn $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dka $$0, iv $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(djb $$0, iv $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public but b(djx $$0, iv $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axt<dnc> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(axt<dnc> $$0, Predicate<ebd.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jj<dnc> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jf<dnc> $$0) {
         return this.a($$0.a());
      }

      public Stream<axt<dnc>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dpw;
      }

      @Nullable
      public <T extends dyc> dyd<T> a(djx $$0, dye<T> $$1) {
         return this.b() instanceof dpw ? ((dpw)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dnc $$0) {
         return this.b() == $$0;
      }

      public boolean a(alh<dnc> $$0) {
         return this.b().p().a($$0);
      }

      public exo y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(iv $$0) {
         return this.b().a(this.B(), $$0);
      }

      public duz A() {
         return this.b().h_(this.B());
      }

      public void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(djb $$0, iv $$1, jb $$2) {
         return this.a($$0, $$1, $$2, dvn.a);
      }

      public boolean a(djb $$0, iv $$1, jb $$2, dvn $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(djb $$0, iv $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public czy a(dka $$0, iv $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract ebe B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public ecf E() {
         return this.z;
      }

      static final class a {
         private static final jb[] d = jb.values();
         private static final int e = dvn.values().length;
         protected final fgk a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(ebe $$0) {
            dnc $$1 = $$0.b();
            this.a = $$1.b($$0, djn.a, iv.c, ffv.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mg.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jb.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jb $$2 : d) {
                  for (dvn $$3 : dvn.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, djn.a, iv.c, $$2);
                  }
               }

               this.c = dnc.a($$0.g(djn.a, iv.c));
            }
         }

         public boolean a(jb $$0, dvn $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jb $$0, dvn $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ffq evaluate(ebe var1, iv var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<ebd.d> a = Codec.unit(() -> a());
      Function<ebe, exs> b = $$0 -> exs.a;
      boolean c = true;
      duz d = duz.f;
      ToIntFunction<ebe> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private alh<dnc> m;
      private ala<dnc, Optional<alh<fam>>> n = $$0 -> Optional.of(alh.a(mh.br, $$0.a().f("blocks/")));
      private ala<dnc, String> o = $$0 -> ag.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      ext v = ext.a;
      boolean w = true;
      ecf x = ecf.a;
      boolean y;
      ebd.e<bxc<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jb.b) && $$0.k() < 14;
      ebd.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      ebd.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      ebd.f C = this.B;
      ebd.f D = ($$0, $$1, $$2) -> false;
      ebd.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cvh G = cvj.g;
      @Nullable
      ebd.b H;

      private d() {
      }

      public static ebd.d a() {
         return new ebd.d();
      }

      public static ebd.d a(ebd $$0) {
         ebd.d $$1 = b($$0);
         ebd.d $$2 = $$0.O;
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
      public static ebd.d b(ebd $$0) {
         ebd.d $$1 = new ebd.d();
         ebd.d $$2 = $$0.O;
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

      public ebd.d a(cyw $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public ebd.d a(exs $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public ebd.d a(Function<ebe, exs> $$0) {
         this.b = $$0;
         return this;
      }

      public ebd.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public ebd.d c() {
         this.p = false;
         return this;
      }

      public ebd.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public ebd.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public ebd.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public ebd.d a(duz $$0) {
         this.d = $$0;
         return this;
      }

      public ebd.d a(ToIntFunction<ebe> $$0) {
         this.e = $$0;
         return this;
      }

      public ebd.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public ebd.d d() {
         return this.d(0.0F);
      }

      public ebd.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public ebd.d e() {
         this.i = true;
         return this;
      }

      public ebd.d f() {
         this.F = true;
         return this;
      }

      public ebd.d g() {
         this.n = ala.fixed(Optional.empty());
         return this;
      }

      public ebd.d a(Optional<alh<fam>> $$0) {
         this.n = ala.fixed($$0);
         return this;
      }

      protected Optional<alh<fam>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public ebd.d i() {
         this.r = true;
         return this;
      }

      public ebd.d j() {
         this.s = true;
         return this;
      }

      public ebd.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public ebd.d l() {
         this.t = true;
         return this;
      }

      public ebd.d a(ext $$0) {
         this.v = $$0;
         return this;
      }

      public ebd.d m() {
         this.q = true;
         return this;
      }

      public ebd.d a(ebd.e<bxc<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public ebd.d a(ebd.f $$0) {
         this.A = $$0;
         return this;
      }

      public ebd.d b(ebd.f $$0) {
         this.B = $$0;
         return this;
      }

      public ebd.d c(ebd.f $$0) {
         this.C = $$0;
         return this;
      }

      public ebd.d d(ebd.f $$0) {
         this.D = $$0;
         return this;
      }

      public ebd.d e(ebd.f $$0) {
         this.E = $$0;
         return this;
      }

      public ebd.d n() {
         this.h = true;
         return this;
      }

      public ebd.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public ebd.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public ebd.d a(ebd.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dnc $$2 = $$0x.b();
            long $$3 = azo.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = azo.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azo.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new ffq($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dnc $$2 = $$0x.b();
            long $$3 = azo.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = azo.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azo.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new ffq($$6, $$4, $$7);
         };
         };
         return this;
      }

      public ebd.d o() {
         this.w = false;
         return this;
      }

      public ebd.d a(cvf... $$0) {
         this.G = cvj.e.a($$0);
         return this;
      }

      public ebd.d a(ecf $$0) {
         this.x = $$0;
         return this;
      }

      public ebd.d p() {
         this.y = true;
         return this;
      }

      public ebd.d a(alh<dnc> $$0) {
         this.m = $$0;
         return this;
      }

      public ebd.d a(String $$0) {
         this.o = ala.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(ebe var1, djb var2, iv var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(ebe var1, djb var2, iv var3);
   }
}
