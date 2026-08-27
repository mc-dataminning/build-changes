import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dli implements cjt {
   protected static final ie[] aF = new ie[]{ie.e, ie.f, ie.c, ie.d, ie.a, ie.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dge aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cjw aO;
   protected final dli.d aP;
   @Nullable
   protected aiy aQ;

   public dli(dli.d $$0) {
      this.aG = $$0.c;
      this.aQ = $$0.m;
      this.aH = $$0.f;
      this.aI = $$0.i;
      this.aJ = $$0.d;
      this.aK = $$0.j;
      this.aL = $$0.k;
      this.aM = $$0.l;
      this.aN = $$0.D;
      this.aO = $$0.E;
      this.aP = $$0;
   }

   public dli.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends cys> a();

   protected static <B extends cys> RecordCodecBuilder<B, dli.d> u() {
      return dli.d.a.fieldOf("properties").forGetter(dli::t);
   }

   public static <B extends cys> MapCodec<B> b(Function<dli.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dlj $$0, cvs $$1, hz $$2, int $$3, int $$4) {
   }

   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(auf.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$0;
   }

   protected boolean a(dlj $$0, dlj $$1, ie $$2) {
      return false;
   }

   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      aep.a($$1, $$2);
   }

   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
   }

   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dlj $$0, cvr $$1, hz $$2, cvj $$3, BiConsumer<cpd, hz> $$4) {
      if (!$$0.i() && $$3.j() != cvj.a.d) {
         cys $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof chl;
         if ($$5.a($$3) && $$1 instanceof aow $$7) {
            dix $$8 = $$0.t() ? $$1.c_($$2) : null;
            eji.a $$9 = new eji.a($$7).a(eln.f, enz.b($$2)).a(eln.i, cpd.h).b(eln.h, $$8).b(eln.a, $$3.g());
            if ($$3.j() == cvj.a.c) {
               $$9.a(eln.j, $$3.a());
            }

            $$0.a($$7, $$2, cpd.h, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, cyu.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      return blw.d;
   }

   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      return bly.d;
   }

   protected boolean a(dlj $$0, cvr $$1, hz $$2, int $$3, int $$4) {
      return false;
   }

   protected dex b_(dlj $$0) {
      return dex.c;
   }

   protected boolean g_(dlj $$0) {
      return false;
   }

   protected boolean f_(dlj $$0) {
      return false;
   }

   protected egw c_(dlj $$0) {
      return egx.a.g();
   }

   protected boolean d_(dlj $$0) {
      return false;
   }

   protected float aw_() {
      return 0.25F;
   }

   protected float ay_() {
      return 0.2F;
   }

   @Override
   public cjw m() {
      return this.aO;
   }

   protected dlj a(dlj $$0, dfe $$1) {
      return $$0;
   }

   protected dlj a(dlj $$0, ddo $$1) {
      return $$0;
   }

   protected boolean a(dlj $$0, crk $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.j()));
   }

   protected boolean a(dlj $$0, egv $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cpd> a(dlj $$0, eji.a $$1) {
      aiy $$2 = this.v();
      if ($$2 == eja.a) {
         return Collections.emptyList();
      } else {
         eji $$3 = $$1.a(eln.g, $$0).a(elm.p);
         aow $$4 = $$3.a();
         ejk $$5 = $$4.o().aL().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dlj $$0, hz $$1) {
      return awi.a($$1);
   }

   protected eos f(dlj $$0, cux $$1, hz $$2) {
      return $$0.j($$1, $$2);
   }

   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      return this.b($$0, $$1, $$2, eoe.a());
   }

   protected eos a(dlj $$0, cux $$1, hz $$2) {
      return eop.a();
   }

   protected int g(dlj $$0, cux $$1, hz $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.O();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return null;
   }

   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return true;
   }

   protected float d(dlj $$0, cux $$1, hz $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return 0;
   }

   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return eop.b();
   }

   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.aG ? $$0.j($$1, $$2) : eop.a();
   }

   protected boolean c(dlj $$0, cux $$1, hz $$2) {
      return cys.a($$0.k($$1, $$2));
   }

   protected boolean h(dlj $$0, cux $$1, hz $$2) {
      return cys.a($$0.c($$1, $$2));
   }

   protected eos c(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
   }

   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
   }

   protected float a(dlj $$0, chl $$1, cux $$2, hz $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dlj $$0, aow $$1, hz $$2, cpd $$3, boolean $$4) {
   }

   protected void a(dlj $$0, cvr $$1, hz $$2, chl $$3) {
   }

   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return 0;
   }

   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
   }

   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return 0;
   }

   public final aiy v() {
      if (this.aQ == null) {
         aiy $$0 = kf.e.b(this.q());
         this.aQ = $$0.d("blocks/");
      }

      return this.aQ;
   }

   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
   }

   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return !cys.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean e_(dlj $$0) {
      return this.aI;
   }

   protected dge h_(dlj $$0) {
      return this.aJ;
   }

   public abstract coy j();

   protected abstract cys q();

   public eha w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dll<cys, dlj> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final ehb l;
      private final eha m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dli.f q;
      private final dli.f r;
      private final dli.f s;
      private final dli.f t;
      private final dli.f u;
      private final Optional<dli.b> v;
      private final boolean w;
      private final dmk x;
      private final boolean y;
      @Nullable
      protected dli.a.a a;
      private egw z = egx.a.g();
      private boolean A;

      protected a(cys $$0, ImmutableMap<dmm<?>, Comparable<?>> $$1, MapCodec<dlj> $$2) {
         super($$0, $$1, $$2);
         dli.d $$3 = $$0.aP;
         this.b = $$3.e.applyAsInt(this.x());
         this.g = $$0.g_(this.x());
         this.h = $$3.o;
         this.i = $$3.p;
         this.j = $$3.q;
         this.l = $$3.t;
         this.m = $$3.b.apply(this.x());
         this.n = $$3.g;
         this.o = $$3.h;
         this.p = $$3.n;
         this.q = $$3.y;
         this.r = $$3.z;
         this.s = $$3.A;
         this.t = $$3.B;
         this.u = $$3.C;
         this.v = $$3.F;
         this.w = $$3.u;
         this.x = $$3.v;
         this.y = $$3.w;
      }

      private boolean D() {
         if (this.e.aP.s) {
            return true;
         } else if (this.e.aP.r) {
            return false;
         } else if (this.a == null) {
            return false;
         } else {
            eos $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               enu $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().p()) {
            this.a = new dli.a.a(this.x());
         }

         this.k = this.D();
      }

      public cys b() {
         return this.e;
      }

      public ij<cys> c() {
         return this.e.r();
      }

      @Deprecated
      public boolean d() {
         cys $$0 = this.b();
         return $$0 != cyu.bs && $$0 != cyu.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cux $$0, hz $$1, bnw<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cux $$0, hz $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(cux $$0, hz $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eos a(cux $$0, hz $$1, ie $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eop.a(this.c($$0, $$1), $$2);
      }

      public eos c(cux $$0, hz $$1) {
         return this.b().f(this.x(), $$0, $$1);
      }

      public boolean f() {
         return this.a == null || this.a.c;
      }

      public boolean g() {
         return this.g;
      }

      public int h() {
         return this.b;
      }

      public boolean i() {
         return this.h;
      }

      public boolean j() {
         return this.i;
      }

      @Deprecated
      public boolean k() {
         return this.j;
      }

      public eha d(cux $$0, hz $$1) {
         return this.m;
      }

      public dlj a(dfe $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dlj a(ddo $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dex l() {
         return this.b().b_(this.x());
      }

      public boolean e(cux $$0, hz $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cux $$0, hz $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(cux $$0, hz $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cux $$0, hz $$1, ie $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cvr $$0, hz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cux $$0, hz $$1) {
         return this.n;
      }

      public float a(chl $$0, cux $$1, hz $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cux $$0, hz $$1, ie $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ehb o() {
         return this.l;
      }

      public boolean i(cux $$0, hz $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dlj $$2 = this.x();
            return $$2.p() ? cys.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dlj $$0, ie $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eos j(cux $$0, hz $$1) {
         return this.a($$0, $$1, eoe.a());
      }

      public eos a(cux $$0, hz $$1, eoe $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eos k(cux $$0, hz $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, eoe.a());
      }

      public eos b(cux $$0, hz $$1, eoe $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eos l(cux $$0, hz $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eos c(cux $$0, hz $$1, eoe $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eos m(cux $$0, hz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cux $$0, hz $$1, bnq $$2) {
         return this.a($$0, $$1, $$2, ie.b);
      }

      public final boolean a(cux $$0, hz $$1, bnq $$2, ie $$3) {
         return cys.a(this.b($$0, $$1, eoe.a($$2)), $$3);
      }

      public enz n(cux $$0, hz $$1) {
         return this.v.<enz>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(enz.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cvr $$0, hz $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cvr $$0, hz $$1, cys $$2, hz $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cvs $$0, hz $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cvs $$0, hz $$1, int $$2, int $$3) {
         hz.a $$4 = new hz.a();

         for (ie $$5 : dli.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cvs $$0, hz $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cvs $$0, hz $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cvr $$0, hz $$1, dlj $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cvr $$0, hz $$1, dlj $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cvr $$0, hz $$1, cvj $$2, BiConsumer<cpd, hz> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aow $$0, hz $$1, awp $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aow $$0, hz $$1, awp $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cvr $$0, hz $$1, bnq $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aow $$0, hz $$1, cpd $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cpd> a(eji.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bly a(cpd $$0, cvr $$1, chl $$2, blv $$3, env $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public blw a(cvr $$0, chl $$1, env $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(cvr $$0, hz $$1, chl $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cux $$0, hz $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cux $$0, hz $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dlj a(ie $$0, dlj $$1, cvs $$2, hz $$3, hz $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cux $$0, hz $$1, ehm $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(crk $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(egv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cvu $$0, hz $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cux $$0, hz $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bma b(cvr $$0, hz $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aup<cys> $$0) {
         return this.b().r().a($$0);
      }

      public boolean a(aup<cys> $$0, Predicate<dli.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(in<cys> $$0) {
         return $$0.a(this.b().r());
      }

      public boolean a(ij<cys> $$0) {
         return this.a($$0.a());
      }

      public Stream<aup<cys>> s() {
         return this.b().r().c();
      }

      public boolean t() {
         return this.b() instanceof dbk;
      }

      @Nullable
      public <T extends dix> diy<T> a(cvr $$0, diz<T> $$1) {
         return this.b() instanceof dbk ? ((dbk)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(cys $$0) {
         return this.b() == $$0;
      }

      public boolean a(aix<cys> $$0) {
         return this.b().r().a($$0);
      }

      public egw u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(hz $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dge w() {
         return this.b().h_(this.x());
      }

      public void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cux $$0, hz $$1, ie $$2) {
         return this.a($$0, $$1, $$2, dgs.a);
      }

      public boolean a(cux $$0, hz $$1, ie $$2, dgs $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cux $$0, hz $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dlj x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dmk A() {
         return this.x;
      }

      static final class a {
         private static final ie[] e = ie.values();
         private static final int f = dgs.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eos[] i;
         protected final eos b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dlj $$0) {
            cys $$1 = $$0.b();
            this.a = $$0.i(cvg.a, hz.c);
            this.g = $$1.a_($$0, cvg.a, hz.c);
            this.h = $$1.g($$0, cvg.a, hz.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eos[e.length];
               eos $$2 = $$1.f($$0, cvg.a, hz.c);

               for (ie $$3 : e) {
                  this.i[$$3.ordinal()] = eop.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, cvg.a, hz.c, eoe.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", kf.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ie.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ie $$4 : e) {
                  for (dgs $$5 : dgs.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cvg.a, hz.c, $$4);
                  }
               }

               this.d = cys.a($$0.k(cvg.a, hz.c));
            }
         }

         public boolean a(ie $$0, dgs $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ie $$0, dgs $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      enz evaluate(dlj var1, cux var2, hz var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dli.d> a = Codec.unit(() -> a());
      Function<dlj, eha> b = $$0 -> eha.a;
      boolean c = true;
      dge d = dge.f;
      ToIntFunction<dlj> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      aiy m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      ehb t = ehb.a;
      boolean u = true;
      dmk v = dmk.a;
      boolean w;
      dli.e<bnw<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ie.b) && $$0.h() < 14;
      dli.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dli.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dli.f A = this.z;
      dli.f B = ($$0, $$1, $$2) -> false;
      dli.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cjw E = cjy.g;
      Optional<dli.b> F = Optional.empty();

      private d() {
      }

      public static dli.d a() {
         return new dli.d();
      }

      public static dli.d a(dli $$0) {
         dli.d $$1 = b($$0);
         dli.d $$2 = $$0.aP;
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
      public static dli.d b(dli $$0) {
         dli.d $$1 = new dli.d();
         dli.d $$2 = $$0.aP;
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

      public dli.d a(cnr $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dli.d a(eha $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dli.d a(Function<dlj, eha> $$0) {
         this.b = $$0;
         return this;
      }

      public dli.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dli.d c() {
         this.n = false;
         return this;
      }

      public dli.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dli.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dli.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dli.d a(dge $$0) {
         this.d = $$0;
         return this;
      }

      public dli.d a(ToIntFunction<dlj> $$0) {
         this.e = $$0;
         return this;
      }

      public dli.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dli.d d() {
         return this.d(0.0F);
      }

      public dli.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dli.d e() {
         this.i = true;
         return this;
      }

      public dli.d f() {
         this.D = true;
         return this;
      }

      public dli.d g() {
         this.m = eja.a;
         return this;
      }

      public dli.d a(cys $$0) {
         this.m = $$0.v();
         return this;
      }

      public dli.d h() {
         this.p = true;
         return this;
      }

      public dli.d i() {
         this.q = true;
         return this;
      }

      public dli.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dli.d k() {
         this.r = true;
         return this;
      }

      public dli.d a(ehb $$0) {
         this.t = $$0;
         return this;
      }

      public dli.d l() {
         this.o = true;
         return this;
      }

      public dli.d a(dli.e<bnw<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dli.d a(dli.f $$0) {
         this.y = $$0;
         return this;
      }

      public dli.d b(dli.f $$0) {
         this.z = $$0;
         return this;
      }

      public dli.d c(dli.f $$0) {
         this.A = $$0;
         return this;
      }

      public dli.d d(dli.f $$0) {
         this.B = $$0;
         return this;
      }

      public dli.d e(dli.f $$0) {
         this.C = $$0;
         return this;
      }

      public dli.d m() {
         this.h = true;
         return this;
      }

      public dli.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dli.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dli.d a(dli.c $$0) {
         switch ($$0) {
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cys $$3 = $$0x.b();
                  long $$4 = awi.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ay_();
                  float $$6 = $$3.aw_();
                  double $$7 = awi.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = awi.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new enz($$7, $$5, $$8);
               });
               break;
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  cys $$3 = $$0x.b();
                  long $$4 = awi.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.aw_();
                  double $$6 = awi.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = awi.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new enz($$6, 0.0, $$7);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dli.d n() {
         this.u = false;
         return this;
      }

      public dli.d a(cju... $$0) {
         this.E = cjy.e.a($$0);
         return this;
      }

      public dli.d a(dmk $$0) {
         this.v = $$0;
         return this;
      }

      public dli.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dlj var1, cux var2, hz var3, A var4);
   }

   public interface f {
      boolean test(dlj var1, cux var2, hz var3);
   }
}
