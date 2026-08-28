import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
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

public abstract class dsj implements cov {
   protected static final jf[] aF = new jf[]{jf.e, jf.f, jf.c, jf.d, jf.a, jf.b};
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final dmu aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final coy aO;
   protected final dsj.d aP;
   @Nullable
   protected akj<eqz> aQ;

   public dsj(dsj.d $$0) {
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

   public dsj.d t() {
      return this.aP;
   }

   protected abstract MapCodec<? extends dfh> a();

   protected static <B extends dfh> RecordCodecBuilder<B, dsj.d> u() {
      return dsj.d.a.fieldOf("properties").forGetter(dsj::t);
   }

   public static <B extends dfh> MapCodec<B> b(Function<dsj.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(u()).apply($$1, $$0));
   }

   protected void a(dsk $$0, dcg $$1, ja $$2, int $$3, int $$4) {
   }

   protected boolean a(dsk $$0, eow $$1) {
      switch ($$1) {
         case a:
            return !$$0.r(dbu.a, ja.c);
         case b:
            return $$0.u().a(awc.a);
         case c:
            return !$$0.r(dbu.a, ja.c);
         default:
            return false;
      }
   }

   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$0;
   }

   protected boolean a(dsk $$0, dsk $$1, jf $$2) {
      return false;
   }

   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      afy.a($$1, $$2);
   }

   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
   }

   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.o($$2);
      }
   }

   protected void a(dsk $$0, dcf $$1, ja $$2, dbx $$3, BiConsumer<cuc, ja> $$4) {
      if (!$$0.i() && $$3.j() != dbx.a.d) {
         dfh $$5 = $$0.b();
         boolean $$6 = $$3.f() instanceof cmk;
         if ($$5.a($$3) && $$1 instanceof aqm $$7) {
            dpp $$8 = $$0.t() ? $$1.c_($$2) : null;
            eqx.a $$9 = new eqx.a($$7).a(etq.f, ewf.b($$2)).a(etq.i, cuc.l).b(etq.h, $$8).b(etq.a, $$3.g());
            if ($$3.j() == dbx.a.c) {
               $$9.a(etq.j, $$3.a());
            }

            $$0.a($$7, $$2, cuc.l, $$6);
            $$0.a($$9).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dfj.a.o(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      return bqg.e;
   }

   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      return bqi.d;
   }

   protected boolean a(dsk $$0, dcf $$1, ja $$2, int $$3, int $$4) {
      return false;
   }

   protected dln a_(dsk $$0) {
      return dln.c;
   }

   protected boolean f_(dsk $$0) {
      return false;
   }

   protected boolean e_(dsk $$0) {
      return false;
   }

   protected eoh b_(dsk $$0) {
      return eoi.a.g();
   }

   protected boolean c_(dsk $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public coy i() {
      return this.aO;
   }

   protected dsk a(dsk $$0, dlu $$1) {
      return $$0;
   }

   protected dsk a(dsk $$0, dke $$1) {
      return $$0;
   }

   protected boolean a(dsk $$0, cxm $$1) {
      return $$0.r() && ($$1.n().e() || !$$1.n().a(this.r()));
   }

   protected boolean a(dsk $$0, eog $$1) {
      return $$0.r() || !$$0.e();
   }

   protected List<cuc> a(dsk $$0, eqx.a $$1) {
      akj<eqz> $$2 = this.v();
      if ($$2 == eqq.a) {
         return Collections.emptyList();
      } else {
         eqx $$3 = $$1.a(etq.g, $$0).a(etp.r);
         aqm $$4 = $$3.a();
         eqz $$5 = $$4.o().bf().b($$2);
         return $$5.a($$3);
      }
   }

   protected long a(dsk $$0, ja $$1) {
      return ayg.a($$1);
   }

   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      return $$0.j($$1, $$2);
   }

   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      return this.b($$0, $$1, $$2, ewk.a());
   }

   protected ewy a(dsk $$0, dbl $$1, ja $$2) {
      return ewv.a();
   }

   protected int g(dsk $$0, dbl $$1, ja $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.Q();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return null;
   }

   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return true;
   }

   protected float d(dsk $$0, dbl $$1, ja $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return 0;
   }

   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.b();
   }

   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.aG ? $$0.j($$1, $$2) : ewv.a();
   }

   protected boolean c(dsk $$0, dbl $$1, ja $$2) {
      return dfh.a($$0.k($$1, $$2));
   }

   protected boolean h(dsk $$0, dbl $$1, ja $$2) {
      return dfh.a($$0.c($$1, $$2));
   }

   protected ewy c(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
   }

   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
   }

   protected float a(dsk $$0, cmk $$1, dbl $$2, ja $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
   }

   protected void a_(dsk $$0, dcf $$1, ja $$2, cmk $$3) {
   }

   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return 0;
   }

   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
   }

   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return 0;
   }

   public final akj<eqz> v() {
      if (this.aQ == null) {
         akk $$0 = lq.e.b(this.q());
         this.aQ = akj.a(lr.bb, $$0.d("blocks/"));
      }

      return this.aQ;
   }

   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
   }

   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return !dfh.a($$0.j($$1, $$2)) && $$0.u().c();
   }

   protected boolean d_(dsk $$0) {
      return this.aI;
   }

   protected dmu g_(dsk $$0) {
      return this.aJ;
   }

   public abstract ctx r();

   protected abstract dfh q();

   public eol w() {
      return this.aP.b.apply(this.q().o());
   }

   public float x() {
      return this.aP.g;
   }

   public abstract static class a extends dsm<dfh, dsk> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eom l;
      private final eol m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dsj.f q;
      private final dsj.f r;
      private final dsj.f s;
      private final dsj.f t;
      private final dsj.f u;
      private final Optional<dsj.b> v;
      private final boolean w;
      private final dtl x;
      private final boolean y;
      @Nullable
      protected dsj.a.a a;
      private eoh z = eoi.a.g();
      private boolean A;

      protected a(dfh $$0, Reference2ObjectArrayMap<dtn<?>, Comparable<?>> $$1, MapCodec<dsk> $$2) {
         super($$0, $$1, $$2);
         dsj.d $$3 = $$0.aP;
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
            ewy $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ewa $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.b_(this.x());
         this.A = this.e.d_(this.x());
         if (!this.b().p()) {
            this.a = new dsj.a.a(this.x());
         }

         this.k = this.D();
      }

      public dfh b() {
         return this.e;
      }

      public jj<dfh> c() {
         return this.e.s();
      }

      @Deprecated
      public boolean d() {
         dfh $$0 = this.b();
         return $$0 != dfj.bs && $$0 != dfj.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(dbl $$0, ja $$1, bsm<?> $$2) {
         return this.b().aP.x.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(dbl $$0, ja $$1) {
         return this.a != null ? this.a.g : this.b().a_(this.x(), $$0, $$1);
      }

      public int b(dbl $$0, ja $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ewy a(dbl $$0, ja $$1, jf $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ewv.a(this.c($$0, $$1), $$2);
      }

      public ewy c(dbl $$0, ja $$1) {
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

      public eol d(dbl $$0, ja $$1) {
         return this.m;
      }

      public dsk a(dlu $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dsk a(dke $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dln l() {
         return this.b().a_(this.x());
      }

      public boolean e(dbl $$0, ja $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(dbl $$0, ja $$1) {
         return this.b().d(this.x(), $$0, $$1);
      }

      public boolean g(dbl $$0, ja $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().e_(this.x());
      }

      public int b(dbl $$0, ja $$1, jf $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().c_(this.x());
      }

      public int a(dcf $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(dbl $$0, ja $$1) {
         return this.n;
      }

      public float a(cmk $$0, dbl $$1, ja $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(dbl $$0, ja $$1, jf $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eom o() {
         return this.l;
      }

      public boolean i(dbl $$0, ja $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dsk $$2 = this.x();
            return $$2.p() ? dfh.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dsk $$0, jf $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ewy j(dbl $$0, ja $$1) {
         return this.a($$0, $$1, ewk.a());
      }

      public ewy a(dbl $$0, ja $$1, ewk $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ewy k(dbl $$0, ja $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ewk.a());
      }

      public ewy b(dbl $$0, ja $$1, ewk $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ewy l(dbl $$0, ja $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ewy c(dbl $$0, ja $$1, ewk $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ewy m(dbl $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(dbl $$0, ja $$1, bsg $$2) {
         return this.a($$0, $$1, $$2, jf.b);
      }

      public final boolean a(dbl $$0, ja $$1, bsg $$2, jf $$3) {
         return dfh.a(this.b($$0, $$1, ewk.a($$2)), $$3);
      }

      public ewf n(dbl $$0, ja $$1) {
         return this.v.<ewf>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ewf.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(dcf $$0, ja $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcf $$0, ja $$1, dfh $$2, ja $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dcg $$0, ja $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dcg $$0, ja $$1, int $$2, int $$3) {
         ja.a $$4 = new ja.a();

         for (jf $$5 : dsj.aF) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(dcg $$0, ja $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dcg $$0, ja $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcf $$0, ja $$1, dsk $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(dcf $$0, ja $$1, dsk $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(dcf $$0, ja $$1, dbx $$2, BiConsumer<cuc, ja> $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aqm $$0, ja $$1, ayo $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aqm $$0, ja $$1, ayo $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(dcf $$0, ja $$1, bsg $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aqm $$0, ja $$1, cuc $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cuc> a(eqx.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bqi a(cuc $$0, dcf $$1, cmk $$2, bqf $$3, ewb $$4) {
         return this.b().a($$0, this.x(), $$1, $$4.a(), $$2, $$3, $$4);
      }

      public bqg a(dcf $$0, cmk $$1, ewb $$2) {
         return this.b().a(this.x(), $$0, $$2.a(), $$1, $$2);
      }

      public void a(dcf $$0, ja $$1, cmk $$2) {
         this.b().a_(this.x(), $$0, $$1, $$2);
      }

      public boolean o(dbl $$0, ja $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(dbl $$0, ja $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dsk a(jf $$0, dsk $$1, dcg $$2, ja $$3, ja $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(eow $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(cxm $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eog $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(dci $$0, ja $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(dbl $$0, ja $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bqk b(dcf $$0, ja $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(awm<dfh> $$0) {
         return this.b().s().a($$0);
      }

      public boolean a(awm<dfh> $$0, Predicate<dsj.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jn<dfh> $$0) {
         return $$0.a(this.b().s());
      }

      public boolean a(jj<dfh> $$0) {
         return this.a($$0.a());
      }

      public Stream<awm<dfh>> s() {
         return this.b().s().c();
      }

      public boolean t() {
         return this.b() instanceof dhz;
      }

      @Nullable
      public <T extends dpp> dpq<T> a(dcf $$0, dpr<T> $$1) {
         return this.b() instanceof dhz ? ((dhz)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(dfh $$0) {
         return this.b() == $$0;
      }

      public boolean a(akj<dfh> $$0) {
         return this.b().s().a($$0);
      }

      public eoh u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(ja $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dmu w() {
         return this.b().g_(this.x());
      }

      public void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(dbl $$0, ja $$1, jf $$2) {
         return this.a($$0, $$1, $$2, dni.a);
      }

      public boolean a(dbl $$0, ja $$1, jf $$2, dni $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(dbl $$0, ja $$1) {
         return this.a != null ? this.a.d : this.b().c(this.x(), $$0, $$1);
      }

      protected abstract dsk x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dtl A() {
         return this.x;
      }

      static final class a {
         private static final jf[] e = jf.values();
         private static final int f = dni.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ewy[] i;
         protected final ewy b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dsk $$0) {
            dfh $$1 = $$0.b();
            this.a = $$0.i(dbu.a, ja.c);
            this.g = $$1.a_($$0, dbu.a, ja.c);
            this.h = $$1.g($$0, dbu.a, ja.c);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ewy[e.length];
               ewy $$2 = $$1.f($$0, dbu.a, ja.c);

               for (jf $$3 : e) {
                  this.i[$$3.ordinal()] = ewv.a($$2, $$3);
               }
            }

            this.b = $$1.b($$0, dbu.a, ja.c, ewk.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", lq.e.b($$1))
               );
            } else {
               this.c = Arrays.stream(jf.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (jf $$4 : e) {
                  for (dni $$5 : dni.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, dbu.a, ja.c, $$4);
                  }
               }

               this.d = dfh.a($$0.k(dbu.a, ja.c));
            }
         }

         public boolean a(jf $$0, dni $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(jf $$0, dni $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ewf evaluate(dsk var1, dbl var2, ja var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<dsj.d> a = Codec.unit(() -> a());
      Function<dsk, eol> b = $$0 -> eol.a;
      boolean c = true;
      dmu d = dmu.f;
      ToIntFunction<dsk> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      akj<eqz> m;
      boolean n = true;
      boolean o;
      boolean p;
      @Deprecated
      boolean q;
      @Deprecated
      boolean r;
      boolean s;
      eom t = eom.a;
      boolean u = true;
      dtl v = dtl.a;
      boolean w;
      dsj.e<bsm<?>> x = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, jf.b) && $$0.h() < 14;
      dsj.f y = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dsj.f z = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dsj.f A = this.z;
      dsj.f B = ($$0, $$1, $$2) -> false;
      dsj.f C = ($$0, $$1, $$2) -> false;
      boolean D;
      coy E = cpa.f;
      Optional<dsj.b> F = Optional.empty();

      private d() {
      }

      public static dsj.d a() {
         return new dsj.d();
      }

      public static dsj.d a(dsj $$0) {
         dsj.d $$1 = b($$0);
         dsj.d $$2 = $$0.aP;
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
      public static dsj.d b(dsj $$0) {
         dsj.d $$1 = new dsj.d();
         dsj.d $$2 = $$0.aP;
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

      public dsj.d a(csv $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public dsj.d a(eol $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public dsj.d a(Function<dsk, eol> $$0) {
         this.b = $$0;
         return this;
      }

      public dsj.d b() {
         this.c = false;
         this.n = false;
         return this;
      }

      public dsj.d c() {
         this.n = false;
         return this;
      }

      public dsj.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public dsj.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public dsj.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public dsj.d a(dmu $$0) {
         this.d = $$0;
         return this;
      }

      public dsj.d a(ToIntFunction<dsk> $$0) {
         this.e = $$0;
         return this;
      }

      public dsj.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dsj.d d() {
         return this.d(0.0F);
      }

      public dsj.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dsj.d e() {
         this.i = true;
         return this;
      }

      public dsj.d f() {
         this.D = true;
         return this;
      }

      public dsj.d g() {
         this.m = eqq.a;
         return this;
      }

      public dsj.d a(dfh $$0) {
         this.m = $$0.v();
         return this;
      }

      public dsj.d h() {
         this.p = true;
         return this;
      }

      public dsj.d i() {
         this.q = true;
         return this;
      }

      public dsj.d j() {
         this.s = true;
         return this;
      }

      @Deprecated
      public dsj.d k() {
         this.r = true;
         return this;
      }

      public dsj.d a(eom $$0) {
         this.t = $$0;
         return this;
      }

      public dsj.d l() {
         this.o = true;
         return this;
      }

      public dsj.d a(dsj.e<bsm<?>> $$0) {
         this.x = $$0;
         return this;
      }

      public dsj.d a(dsj.f $$0) {
         this.y = $$0;
         return this;
      }

      public dsj.d b(dsj.f $$0) {
         this.z = $$0;
         return this;
      }

      public dsj.d c(dsj.f $$0) {
         this.A = $$0;
         return this;
      }

      public dsj.d d(dsj.f $$0) {
         this.B = $$0;
         return this;
      }

      public dsj.d e(dsj.f $$0) {
         this.C = $$0;
         return this;
      }

      public dsj.d m() {
         this.h = true;
         return this;
      }

      public dsj.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public dsj.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public dsj.d a(dsj.c $$0) {
         switch ($$0) {
            case b:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfh $$3 = $$0x.b();
                  long $$4 = ayg.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ar_();
                  double $$6 = ayg.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ayg.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ewf($$6, 0.0, $$7);
               });
               break;
            case c:
               this.F = Optional.of(($$0x, $$1, $$2) -> {
                  dfh $$3 = $$0x.b();
                  long $$4 = ayg.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.at_();
                  float $$6 = $$3.ar_();
                  double $$7 = ayg.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ayg.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ewf($$7, $$5, $$8);
               });
               break;
            default:
               this.F = Optional.empty();
         }

         return this;
      }

      public dsj.d n() {
         this.u = false;
         return this;
      }

      public dsj.d a(cow... $$0) {
         this.E = cpa.d.a($$0);
         return this;
      }

      public dsj.d a(dtl $$0) {
         this.v = $$0;
         return this;
      }

      public dsj.d o() {
         this.w = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dsk var1, dbl var2, ja var3, A var4);
   }

   public interface f {
      boolean test(dsk var1, dbl var2, ja var3);
   }
}
