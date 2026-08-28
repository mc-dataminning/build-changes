import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dun implements cqk {
   protected static final jj[] aG = new jj[]{jj.e, jj.f, jj.c, jj.d, jj.a, jj.b};
   protected final boolean aH;
   protected final float aI;
   protected final boolean aJ;
   protected final dox aK;
   protected final float aL;
   protected final float aM;
   protected final float aN;
   protected final boolean aO;
   protected final cqn aP;
   protected final dun.d aQ;
   @Nullable
   protected alb<etm> aR;

   public dun(dun.d $$0) {
      this.aH = $$0.c;
      this.aR = $$0.m;
      this.aI = $$0.f;
      this.aJ = $$0.i;
      this.aK = $$0.d;
      this.aL = $$0.j;
      this.aM = $$0.k;
      this.aN = $$0.l;
      this.aO = $$0.D;
      this.aP = $$0.E;
      this.aQ = $$0;
   }

   public dun.d t() {
      return this.aQ;
   }

   protected abstract MapCodec<? extends dhj> a();

   protected static <B extends dhj> RecordCodecBuilder<B, dun.d> u() {
      return dun.d.a.fieldOf("properties").forGetter(dun::t);
   }

   public static <B extends dhj> MapCodec<B> b(Function<dun.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(duo $$0, deh $$1, je $$2, int $$3, int $$4) {
   }

   protected boolean a(duo $$0, ere $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(ddv.a, je.c);
         case b:
            return $$0.y().a(awz.a);
         case c:
            return !$$0.m(ddv.a, je.c);
         default:
            return false;
      }
   }

   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$0;
   }

   protected boolean b(duo $$0, duo $$1, jj $$2) {
      return false;
   }

   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
   }

   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
   }

   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if ($$0.x() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if (!$$0.l() && $$3.a() != ddy.a.d) {
         dhj $$5 = $$0.b();
         boolean $$6 = $$3.b() instanceof cnu;
         if ($$5.a($$3)) {
            drs $$7 = $$0.x() ? $$1.c_($$2) : null;
            etk.a $$8 = new etk.a($$1).a(ewd.f, eys.b($$2)).a(ewd.i, cvp.k).b(ewd.h, $$7).b(ewd.a, $$3.c());
            if ($$3.a() == ddy.a.c) {
               $$8.a(ewd.j, $$3.d());
            }

            $$0.a($$1, $$2, cvp.k, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dhl.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      return brp.e;
   }

   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      return brp.f;
   }

   protected boolean a(duo $$0, deg $$1, je $$2, int $$3, int $$4) {
      return false;
   }

   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   protected boolean g_(duo $$0) {
      return false;
   }

   protected boolean f_(duo $$0) {
      return false;
   }

   protected eqp b_(duo $$0) {
      return eqq.a.g();
   }

   protected boolean c_(duo $$0) {
      return false;
   }

   protected float as_() {
      return 0.25F;
   }

   protected float au_() {
      return 0.2F;
   }

   @Override
   public cqn i() {
      return this.aP;
   }

   protected duo a(duo $$0, dnx $$1) {
      return $$0;
   }

   protected duo a(duo $$0, dmg $$1) {
      return $$0;
   }

   protected boolean a(duo $$0, czk $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.q()));
   }

   protected boolean a(duo $$0, eqo $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<cvp> a(duo $$0, etk.a $$1) {
      alb<etm> $$2 = this.v();
      if ($$2 == etd.a) {
         return Collections.emptyList();
      } else {
         etk $$3 = $$1.a(ewd.g, $$0).a(ewc.r);
         arh $$4 = $$3.a();
         etm $$5 = $$4.o().bd().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(duo $$0, je $$1) {
      return azd.a($$1);
   }

   protected ezm d_(duo $$0) {
      return $$0.f(ddv.a, je.c);
   }

   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      return this.b($$0, $$1, $$2, eyx.a());
   }

   protected ezm a(duo $$0, ddl $$1, je $$2) {
      return ezj.a();
   }

   protected int i_(duo $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected brr b(duo $$0, deg $$1, je $$2) {
      return null;
   }

   protected boolean a(duo $$0, dej $$1, je $$2) {
      return true;
   }

   protected float c(duo $$0, ddl $$1, je $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(duo $$0, deg $$1, je $$2) {
      return 0;
   }

   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.b();
   }

   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.aH ? $$0.f($$1, $$2) : ezj.a();
   }

   protected boolean a_(duo $$0, ddl $$1, je $$2) {
      return dhj.a($$0.g($$1, $$2));
   }

   protected ezm c(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
   }

   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
   }

   protected float a(duo $$0, cnu $$1, ddl $$2, je $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
   }

   protected void a_(duo $$0, deg $$1, je $$2, cnu $$3) {
   }

   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return 0;
   }

   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
   }

   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return 0;
   }

   public final alb<etm> v() {
      if (this.aR == null) {
         alc $$0 = lu.e.b(this.r());
         this.aR = alb.a(lv.bd, $$0.f("blocks/"));
      }

      return this.aR;
   }

   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
   }

   protected boolean e_(duo $$0) {
      return !dhj.a($$0.f(ddv.a, je.c)) && $$0.y().c();
   }

   protected boolean f(duo $$0) {
      return this.aJ;
   }

   protected dox h_(duo $$0) {
      return this.aK;
   }

   public abstract cvk q();

   protected abstract dhj r();

   public eqt w() {
      return this.aQ.b.apply(this.r().o());
   }

   public float x() {
      return this.aQ.g;
   }

   public abstract static class a extends duq<dhj, duo> {
      private static final jj[] a = jj.values();
      private static final ezm[] f = ad.a(new ezm[a.length], $$0 -> Arrays.fill($$0, ezj.a()));
      private static final ezm[] g = ad.a(new ezm[a.length], $$0 -> Arrays.fill($$0, ezj.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final equ n;
      private final eqt o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final dun.f s;
      private final dun.f t;
      private final dun.f u;
      private final dun.f v;
      private final dun.f w;
      @Nullable
      private final dun.b x;
      private final boolean y;
      private final dvp z;
      private final boolean A;
      @Nullable
      private dun.a.a B;
      private eqp C = eqq.a.g();
      private boolean D;
      private boolean E;
      private ezm F;
      private ezm[] G;
      private boolean H;
      private int I;

      protected a(dhj $$0, Reference2ObjectArrayMap<dvr<?>, Comparable<?>> $$1, MapCodec<duo> $$2) {
         super($$0, $$1, $$2);
         dun.d $$3 = $$0.aQ;
         this.h = $$3.e.applyAsInt(this.B());
         this.i = $$0.g_(this.B());
         this.j = $$3.o;
         this.k = $$3.p;
         this.l = $$3.q;
         this.n = $$3.t;
         this.o = $$3.b.apply(this.B());
         this.p = $$3.g;
         this.q = $$3.h;
         this.r = $$3.n;
         this.s = $$3.y;
         this.t = $$3.z;
         this.u = $$3.A;
         this.v = $$3.B;
         this.w = $$3.C;
         this.x = $$3.F;
         this.y = $$3.u;
         this.z = $$3.v;
         this.A = $$3.w;
      }

      private boolean H() {
         if (this.d.aQ.s) {
            return true;
         } else if (this.d.aQ.r) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            ezm $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               eyn $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().p()) {
            this.B = new dun.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : ezj.a();
         this.E = dhj.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new ezm[a.length];

            for (jj $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dhj b() {
         return this.d;
      }

      public jn<dhj> c() {
         return this.d.s();
      }

      @Deprecated
      public boolean d() {
         dhj $$0 = this.b();
         return $$0 != dhl.bs && $$0 != dhl.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(ddl $$0, je $$1, btv<?> $$2) {
         return this.b().aQ.x.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public ezm a(jj $$0) {
         return this.G[$$0.ordinal()];
      }

      public ezm h() {
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

      public eqt a(ddl $$0, je $$1) {
         return this.o;
      }

      public duo a(dnx $$0) {
         return this.b().a(this.B(), $$0);
      }

      public duo a(dmg $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dnq o() {
         return this.b().a_(this.B());
      }

      public boolean b(ddl $$0, je $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(ddl $$0, je $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(ddl $$0, je $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(ddl $$0, je $$1, jj $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(deg $$0, je $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(ddl $$0, je $$1) {
         return this.p;
      }

      public float a(cnu $$0, ddl $$1, je $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(ddl $$0, je $$1, jj $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public equ r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(duo $$0, jj $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public ezm f(ddl $$0, je $$1) {
         return this.a($$0, $$1, eyx.a());
      }

      public ezm a(ddl $$0, je $$1, eyx $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public ezm g(ddl $$0, je $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, eyx.a());
      }

      public ezm b(ddl $$0, je $$1, eyx $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public ezm h(ddl $$0, je $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public ezm c(ddl $$0, je $$1, eyx $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public ezm i(ddl $$0, je $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean a(ddl $$0, je $$1, bto $$2) {
         return this.a($$0, $$1, $$2, jj.b);
      }

      public final boolean a(ddl $$0, je $$1, bto $$2, jj $$3) {
         return dhj.a(this.b($$0, $$1, eyx.a($$2)), $$3);
      }

      public eys a(je $$0) {
         dun.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : eys.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(deg $$0, je $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(deg $$0, je $$1, dhj $$2, @Nullable erx $$3, boolean $$4) {
         agn.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(deh $$0, je $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(deh $$0, je $$1, int $$2, int $$3) {
         je.a $$4 = new je.a();

         for (jj $$5 : dun.aG) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.B(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(deh $$0, je $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(deh $$0, je $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(deg $$0, je $$1, duo $$2, boolean $$3) {
         this.b().b(this.B(), $$0, $$1, $$2, $$3);
      }

      public void b(deg $$0, je $$1, duo $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arh $$0, je $$1, ddy $$2, BiConsumer<cvp, je> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(arh $$0, je $$1, azl $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(arh $$0, je $$1, azl $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(deg $$0, je $$1, bto $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(arh $$0, je $$1, cvp $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<cvp> a(etk.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public brp a(cvp $$0, deg $$1, cnu $$2, bro $$3, eyo $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public brp a(deg $$0, cnu $$1, eyo $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(deg $$0, je $$1, cnu $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(ddl $$0, je $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(ddl $$0, je $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public duo a(jj $$0, duo $$1, deh $$2, je $$3, je $$4) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(ere $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(czk $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(eqo $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dej $$0, je $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(ddl $$0, je $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public brr b(deg $$0, je $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(axj<dhj> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(axj<dhj> $$0, Predicate<dun.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jr<dhj> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(jn<dhj> $$0) {
         return this.a($$0.a());
      }

      public Stream<axj<dhj>> w() {
         return this.b().s().c();
      }

      public boolean x() {
         return this.b() instanceof dkb;
      }

      @Nullable
      public <T extends drs> drt<T> a(deg $$0, dru<T> $$1) {
         return this.b() instanceof dkb ? ((dkb)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dhj $$0) {
         return this.b() == $$0;
      }

      public boolean a(alb<dhj> $$0) {
         return this.b().s().a($$0);
      }

      public eqp y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(je $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dox A() {
         return this.b().h_(this.B());
      }

      public void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(ddl $$0, je $$1, jj $$2) {
         return this.a($$0, $$1, $$2, dpl.a);
      }

      public boolean a(ddl $$0, je $$1, jj $$2, dpl $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(ddl $$0, je $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      protected abstract duo B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public dvp E() {
         return this.z;
      }

      static final class a {
         private static final jj[] d = jj.values();
         private static final int e = dpl.values().length;
         protected final ezm a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(duo $$0) {
            dhj $$1 = $$0.b();
            this.a = $$1.b($$0, ddv.a, je.c, eyx.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lu.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jj.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jj $$2 : d) {
                  for (dpl $$3 : dpl.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, ddv.a, je.c, $$2);
                  }
               }

               this.c = dhj.a($$0.g(ddv.a, je.c));
            }
         }

         public boolean a(jj $$0, dpl $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jj $$0, dpl $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   public interface b {
      eys evaluate(duo var1, je var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dun.d> a = Codec.unit(() -> a());
      Function<duo, eqt> b = $$0 -> eqt.a;
      boolean c = true;
      dox d = dox.f;
      ToIntFunction<duo> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      alb<etm> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      equ t = equ.a;
      boolean u = true;
      dvp v = dvp.a;
      boolean w;
      dun.e<btv<?>> x = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jj.b) && $$0.k() < 14;
      dun.f y = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      dun.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      dun.f A = this.z;
      dun.f B = ($$0, $$1, $$2) -> false;
      dun.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cqn E = cqp.h;
      @Nullable
      dun.b F;

      private d() {
      }

      public static dun.d a() {
         return new dun.d();
      }

      public static dun.d a(dun $$0) {
         dun.d $$1 = b($$0);
         dun.d $$2 = $$0.aQ;
         $$1.l = $$2.l;
         $$1.y = $$2.y;
         $$1.x = $$2.x;
         $$1.B = $$2.B;
         $$1.z = $$2.z;
         $$1.A = $$2.A;
         $$1.m = $$2.m;
         return $$1;
      }

      @Deprecated
      public static dun.d b(dun $$0) {
         dun.d $$1 = new dun.d();
         dun.d $$2 = $$0.aQ;
         $$1.g = $$2.g;
         $$1.f = $$2.f;
         $$1.c = $$2.c;
         $$1.i = $$2.i;
         $$1.e = $$2.e;
         $$1.b = $$2.b;
         $$1.d = $$2.d;
         $$1.j = $$2.j;
         $$1.k = $$2.k;
         $$1.D = $$2.D;
         $$1.n = $$2.n;
         $$1.o = $$2.o;
         $$1.p = $$2.p;
         $$1.q = $$2.q;
         $$1.r = $$2.r;
         $$1.s = $$2.s;
         $$1.t = $$2.t;
         $$1.h = $$2.h;
         $$1.F = $$2.F;
         $$1.u = $$2.u;
         $$1.E = $$2.E;
         $$1.C = $$2.C;
         $$1.v = $$2.v;
         $$1.w = $$2.w;
         return $$1;
      }

      public dun.d a(cuj $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dun.d a(eqt $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dun.d a(Function<duo, eqt> $$0) {
         this.b = $$0;
         return this;
      }

      public dun.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dun.d c() {
         this.n = false;
         return this;
      }

      public dun.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dun.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dun.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dun.d a(dox $$0) {
         this.d = $$0;
         return this;
      }

      public dun.d a(ToIntFunction<duo> $$0) {
         this.e = $$0;
         return this;
      }

      public dun.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dun.d d() {
         return this.d(0.0F);
      }

      public dun.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dun.d e() {
         this.i = true;
         return this;
      }

      public dun.d f() {
         this.D = true;
         return this;
      }

      public dun.d g() {
         this.m = etd.a;
         return this;
      }

      public dun.d a(dhj $$0) {
         this.m = $$0.v();
         return this;
      }

      public dun.d h() {
         this.p = true;
         return this;
      }

      public dun.d i() {
         this.q = true;
         return this;
      }

      public dun.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dun.d k() {
         this.r = true;
         return this;
      }

      public dun.d a(equ $$0) {
         this.t = $$0;
         return this;
      }

      public dun.d l() {
         this.o = true;
         return this;
      }

      public dun.d a(dun.e<btv<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dun.d a(dun.f $$0) {
         this.y = $$0;
         return this;
      }

      public dun.d b(dun.f $$0) {
         this.z = $$0;
         return this;
      }

      public dun.d c(dun.f $$0) {
         this.A = $$0;
         return this;
      }

      public dun.d d(dun.f $$0) {
         this.B = $$0;
         return this;
      }

      public dun.d e(dun.f $$0) {
         this.C = $$0;
         return this;
      }

      public dun.d m() {
         this.h = true;
         return this;
      }

      public dun.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dun.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dun.d a(dun.c $$0) {
         this.F = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
            dhj $$2 = $$0x.b();
            long $$3 = azd.b($$1.u(), 0, $$1.w());
            float $$4 = $$2.as_();
            double $$5 = azd.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = azd.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new eys($$5, 0.0, $$6);
         };
            case c -> ($$0x, $$1) -> {
            dhj $$2 = $$0x.b();
            long $$3 = azd.b($$1.u(), 0, $$1.w());
            double $$4 = ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.au_();
            float $$5 = $$2.as_();
            double $$6 = azd.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = azd.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new eys($$6, $$4, $$7);
         };
         };
         return this;
      }

      public dun.d n() {
         this.u = false;
         return this;
      }

      public dun.d a(cql... $$0) {
         this.E = cqp.f.a($$0);
         return this;
      }

      public dun.d a(dvp $$0) {
         this.v = $$0;
         return this;
      }

      public dun.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(duo var1, ddl var2, je var3, A var4);
   }

   public interface f {
      boolean test(duo var1, ddl var2, je var3);
   }
}
