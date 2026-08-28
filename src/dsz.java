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

public abstract class dsz implements cpg {
   protected static final ji[] aF = new ji[]{ji.e, ji.f, ji.c, ji.d, ji.a, ji.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dnk aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cpj aO;
   protected final dsz.d aP;
   @Nullable
   protected akp<erq> aQ;

   public dsz(dsz.d $$0) {
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

   public dsz.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dfw> a();

   protected static <B extends dfw> RecordCodecBuilder<B, dsz.d> u() {
      return dsz.d.a.fieldOf("properties").forGetter(dsz::t);
   }

   public static <B extends dfw> MapCodec<B> b(Function<dsz.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dta $$0, dcv $$1, jd $$2, int $$3, int $$4) {
   }

   protected boolean a(dta $$0, epn $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dcj.a, jd.c);
         case b:
            return $$0.u().a(awj.a);
         case c:
            return !$$0.r(dcj.a, jd.c);
         default:
            return false;
      }
   }

   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$0;
   }

   protected boolean a(dta $$0, dta $$1, ji $$2) {
      return false;
   }

   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      age.a($$1, $$2);
   }

   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
   }

   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dta $$0, dcu $$1, jd $$2, dcm $$3, BiConsumer<cuo, jd> $$4) {
      if (!$$0.i() && $$3.j() != dcm.a.d) {
         dfw $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmv;
         if ($$5.a($$3) && $$1 instanceof aqt $$7) {
            dqf $$8 = $$0.t() ? $$1.c_($$2) : null;
            ero.a $$9 = new ero.a($$7).a(euh.f, eww.b($$2)).a(euh.i, cuo.l).b(euh.h, $$8).b(euh.a, $$3.g());
            if ($$3.j() == dcm.a.c) {
               $$9.a(euh.j, $$3.a());
            }

            $$0.a($$7, $$2, cuo.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfy.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      return bqq.e;
   }

   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      return bqs.d;
   }

   protected boolean a(dta $$0, dcu $$1, jd $$2, int $$3, int $$4) {
      return false;
   }

   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   protected boolean f_(dta $$0) {
      return false;
   }

   protected boolean e_(dta $$0) {
      return false;
   }

   protected eoy b_(dta $$0) {
      return eoz.a.g();
   }

   protected boolean c_(dta $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cpj i() {
      return this.aO;
   }

   protected dta a(dta $$0, dmk $$1) {
      return $$0;
   }

   protected dta a(dta $$0, dkt $$1) {
      return $$0;
   }

   protected boolean a(dta $$0, cyb $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dta $$0, eox $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cuo> a(dta $$0, ero.a $$1) {
      akp<erq> $$2 = this.v();
      if ($$2 == erh.a) {
         return Collections.emptyList();
      } else {
         ero $$3 = $$1.a(euh.g, $$0).a(eug.r);
         aqt $$4 = $$3.a();
         erq $$5 = $$4.o().be().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dta $$0, jd $$1) {
      return ayn.a($$1);
   }

   protected exp f(dta $$0, dca $$1, jd $$2) {
      return $$0.j($$1, $$2);
   }

   protected exp b_(dta $$0, dca $$1, jd $$2) {
      return this.b($$0, $$1, $$2, exb.a());
   }

   protected exp a(dta $$0, dca $$1, jd $$2) {
      return exm.a();
   }

   protected int g(dta $$0, dca $$1, jd $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return null;
   }

   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return true;
   }

   protected float d(dta $$0, dca $$1, jd $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dta $$0, dcu $$1, jd $$2) {
      return 0;
   }

   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.b();
   }

   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.aG ? $$0.j($$1, $$2) : exm.a();
   }

   protected boolean c(dta $$0, dca $$1, jd $$2) {
      return dfw.a($$0.k($$1, $$2));
   }

   protected boolean h(dta $$0, dca $$1, jd $$2) {
      return dfw.a($$0.c($$1, $$2));
   }

   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
   }

   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
   }

   protected float a(dta $$0, cmv $$1, dca $$2, jd $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
   }

   protected void a_(dta $$0, dcu $$1, jd $$2, cmv $$3) {
   }

   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return 0;
   }

   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
   }

   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return 0;
   }

   public final akp<erq> v() {
      if (this.aQ == null) {
         akq $$0 = lt.e.b(this.q());
         this.aQ = akp.a(lu.bc, $$0.f("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
   }

   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return !dfw.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dta $$0) {
      return this.aI;
   }

   protected dnk g_(dta $$0) {
      return this.aJ;
   }

   public abstract cuj r();

   protected abstract dfw q();

   public epc w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dtc<dfw, dta> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final epd l;
      private final epc m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsz.f q;
      private final dsz.f r;
      private final dsz.f s;
      private final dsz.f t;
      private final dsz.f u;
      @Nullable
      private final dsz.b v;
      private final boolean w;
      private final dub x;
      private final boolean y;
      @Nullable
      protected dsz.a.a a;
      private eoy z = eoz.a.g();
      private boolean A;

      protected a(dfw $$0, Reference2ObjectArrayMap<dud<?>, Comparable<?>> $$1, MapCodec<dta> $$2) {
         super($$0, $$1, $$2);
         dsz.d $$3 = $$0.aP;
         this.b = $$3.e.applyAsInt(this.x());
         this.g = $$0.f_(this.x());
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
            exp $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ewr $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsz.a.a(this.x());
         }

         this.k = this.D();
      }

      public dfw b() {
         return this.e;
      }

      public jm<dfw> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dfw $$0 = this.b();
         return $$0 != dfy.bs && $$0 != dfy.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dca $$0, jd $$1, bsw<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dca $$0, jd $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dca $$0, jd $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public exp a(dca $$0, jd $$1, ji $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : exm.a(this.c($$0, $$1), $$2);
      }

      public exp c(dca $$0, jd $$1) {
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

      public epc d(dca $$0, jd $$1) {
         return this.m;
      }

      public dta a(dmk $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dta a(dkt $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmd l() {
         return this.b().a_(this.x());
      }

      public boolean e(dca $$0, jd $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dca $$0, jd $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dca $$0, jd $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dca $$0, jd $$1, ji $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dcu $$0, jd $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dca $$0, jd $$1) {
         return this.n;
      }

      public float a(cmv $$0, dca $$1, jd $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dca $$0, jd $$1, ji $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public epd o() {
         return this.l;
      }

      public boolean i(dca $$0, jd $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dta $$2 = this.x();
            return $$2.p() ? dfw.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dta $$0, ji $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public exp j(dca $$0, jd $$1) {
         return this.a($$0, $$1, exb.a());
      }

      public exp a(dca $$0, jd $$1, exb $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public exp k(dca $$0, jd $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, exb.a());
      }

      public exp b(dca $$0, jd $$1, exb $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public exp l(dca $$0, jd $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public exp c(dca $$0, jd $$1, exb $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public exp m(dca $$0, jd $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dca $$0, jd $$1, bsq $$2) {
         return this.a($$0, $$1, $$2, ji.b);
      }

      public final boolean a(dca $$0, jd $$1, bsq $$2, ji $$3) {
         return dfw.a(this.b($$0, $$1, exb.a($$2)), $$3);
      }

      public eww n(dca $$0, jd $$1) {
         dsz.b $$2 = this.v;
         return $$2 != null ? $$2.evaluate(this.x(), $$0, $$1) : eww.b;
      }

      public boolean q() {
         return this.v != null;
      }

      public boolean a(dcu $$0, jd $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcu $$0, jd $$1, dfw $$2, jd $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dcv $$0, jd $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dcv $$0, jd $$1, int $$2, int $$3) {
         jd.a $$4 = new jd.a();

         for (ji $$5 : dsz.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dcv $$0, jd $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dcv $$0, jd $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcu $$0, jd $$1, dta $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dcu $$0, jd $$1, dta $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcu $$0, jd $$1, dcm $$2, BiConsumer<cuo, jd> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqt $$0, jd $$1, ayv $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqt $$0, jd $$1, ayv $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dcu $$0, jd $$1, bsq $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqt $$0, jd $$1, cuo $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cuo> a(ero.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqs a(cuo $$0, dcu $$1, cmv $$2, bqp $$3, ews $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqq a(dcu $$0, cmv $$1, ews $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dcu $$0, jd $$1, cmv $$2) {
         this.b().a_(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dca $$0, jd $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dca $$0, jd $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dta a(ji $$0, dta $$1, dcv $$2, jd $$3, jd $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(epn $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cyb $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eox $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dcx $$0, jd $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dca $$0, jd $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqu b(dcu $$0, jd $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awt<dfw> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(awt<dfw> $$0, Predicate<dsz.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jq<dfw> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(jm<dfw> $$0) {
         return this.a($$0.a());
      }

      public Stream<awt<dfw>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dio;
      }

      @Nullable
      public <T extends dqf> dqg<T> a(dcu $$0, dqh<T> $$1) {
         return this.b() instanceof dio ? ((dio)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dfw $$0) {
         return this.b() == $$0;
      }

      public boolean a(akp<dfw> $$0) {
         return this.b().s().a($$0);
      }

      public eoy u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(jd $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dnk w() {
         return this.b().g_(this.x());
      }

      public void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dca $$0, jd $$1, ji $$2) {
         return this.a($$0, $$1, $$2, dny.a);
      }

      public boolean a(dca $$0, jd $$1, ji $$2, dny $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dca $$0, jd $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dta x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dub A() {
         return this.x;
      }

      static final class a {
         private static final ji[] e = ji.values();
         private static final int f = dny.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final exp[] i;
         protected final exp b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dta $$0) {
            dfw $$1 = $$0.b();
            this.a = $$0.i(dcj.a, jd.c);
            this.g = $$1.a_($$0, dcj.a, jd.c);
            this.h = $$1.g($$0, dcj.a, jd.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new exp[e.length];
               exp $$2 = $$1.f($$0, dcj.a, jd.c);

               for (ji $$3 : e) {
                  this.i[$$3.ordinal()] = exm.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dcj.a, jd.c, exb.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lt.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(ji.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ji $$4 : e) {
                  for (dny $$5 : dny.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dcj.a, jd.c, $$4);
                  }
               }

               this.d = dfw.a($$0.k(dcj.a, jd.c));
            }
         }

         public boolean a(ji $$0, dny $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ji $$0, dny $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      eww evaluate(dta var1, dca var2, jd var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsz.d> a = Codec.unit(() -> a());
      Function<dta, epc> b = $$0 -> epc.a;
      boolean c = true;
      dnk d = dnk.f;
      ToIntFunction<dta> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akp<erq> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      epd t = epd.a;
      boolean u = true;
      dub v = dub.a;
      boolean w;
      dsz.e<bsw<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ji.b) && $$0.h() < 14;
      dsz.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsz.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsz.f A = this.z;
      dsz.f B = ($$0, $$1, $$2) -> false;
      dsz.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      cpj E = cpl.f;
      @Nullable
      dsz.b F;

      private d() {
      }

      public static dsz.d a() {
         return new dsz.d();
      }

      public static dsz.d a(dsz $$0) {
         dsz.d $$1 = b($$0);
         dsz.d $$2 = $$0.aP;
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
      public static dsz.d b(dsz $$0) {
         dsz.d $$1 = new dsz.d();
         dsz.d $$2 = $$0.aP;
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

      public dsz.d a(ctg $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsz.d a(epc $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsz.d a(Function<dta, epc> $$0) {
         this.b = $$0;
         return this;
      }

      public dsz.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsz.d c() {
         this.n = false;
         return this;
      }

      public dsz.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsz.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsz.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsz.d a(dnk $$0) {
         this.d = $$0;
         return this;
      }

      public dsz.d a(ToIntFunction<dta> $$0) {
         this.e = $$0;
         return this;
      }

      public dsz.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsz.d d() {
         return this.d(0.0F);
      }

      public dsz.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsz.d e() {
         this.i = true;
         return this;
      }

      public dsz.d f() {
         this.D = true;
         return this;
      }

      public dsz.d g() {
         this.m = erh.a;
         return this;
      }

      public dsz.d a(dfw $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsz.d h() {
         this.p = true;
         return this;
      }

      public dsz.d i() {
         this.q = true;
         return this;
      }

      public dsz.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsz.d k() {
         this.r = true;
         return this;
      }

      public dsz.d a(epd $$0) {
         this.t = $$0;
         return this;
      }

      public dsz.d l() {
         this.o = true;
         return this;
      }

      public dsz.d a(dsz.e<bsw<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsz.d a(dsz.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsz.d b(dsz.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsz.d c(dsz.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsz.d d(dsz.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsz.d e(dsz.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsz.d m() {
         this.h = true;
         return this;
      }

      public dsz.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsz.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsz.d a(dsz.c $$0) {
         this.F = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1, $$2) -> {
            dfw $$3 = $$0x.b();
            long $$4 = ayn.b($$2.u(), 0, $$2.w());
            float $$5 = $$3.ar_();
            double $$6 = ayn.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            double $$7 = ayn.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
            return new eww($$6, 0.0, $$7);
         };
            case c -> ($$0x, $$1, $$2) -> {
            dfw $$3 = $$0x.b();
            long $$4 = ayn.b($$2.u(), 0, $$2.w());
            double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
            float $$6 = $$3.ar_();
            double $$7 = ayn.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
            double $$8 = ayn.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
            return new eww($$7, $$5, $$8);
         };
         };
         return this;
      }

      public dsz.d n() {
         this.u = false;
         return this;
      }

      public dsz.d a(cph... $$0) {
         this.E = cpl.d.a($$0);
         return this;
      }

      public dsz.d a(dub $$0) {
         this.v = $$0;
         return this;
      }

      public dsz.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dta var1, dca var2, jd var3, A var4);
   }

   public interface f {
      boolean test(dta var1, dca var2, jd var3);
   }
}
