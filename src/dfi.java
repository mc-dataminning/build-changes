import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class dfi implements cdz {
   protected static final ha[] aD = new ha[]{ha.e, ha.f, ha.c, ha.d, ha.a, ha.b};
   protected final boolean aE;
   protected final float aF;
   protected final boolean aG;
   protected final dai aH;
   protected final float aI;
   protected final float aJ;
   protected final float aK;
   protected final boolean aL;
   protected final cec aM;
   protected final dfi.d aN;
   @Nullable
   protected aew aO;

   public dfi(dfi.d $$0) {
      this.aE = $$0.b;
      this.aO = $$0.l;
      this.aF = $$0.e;
      this.aG = $$0.h;
      this.aH = $$0.c;
      this.aI = $$0.i;
      this.aJ = $$0.j;
      this.aK = $$0.k;
      this.aL = $$0.C;
      this.aM = $$0.D;
      this.aN = $$0;
   }

   @Deprecated
   public void a(dfj $$0, cpw $$1, gw $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(apx.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfj $$0, dfj $$1, ha $$2) {
      return false;
   }

   @Deprecated
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      abb.a($$1, $$2);
   }

   @Deprecated
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      return bgy.d;
   }

   @Deprecated
   public boolean a(dfj $$0, cpv $$1, gw $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Deprecated
   public boolean g_(dfj $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dfj $$0) {
      return false;
   }

   @Deprecated
   public eam c_(dfj $$0) {
      return ean.a.g();
   }

   @Deprecated
   public boolean d_(dfj $$0) {
      return false;
   }

   public float ap_() {
      return 0.25F;
   }

   public float ar_() {
      return 0.2F;
   }

   @Override
   public cec m() {
      return this.aM;
   }

   @Deprecated
   public dfj a(dfj $$0, czh $$1) {
      return $$0;
   }

   @Deprecated
   public dfj a(dfj $$0, cxq $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfj $$0, cln $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dfj $$0, eal $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cjf> a(dfj $$0, ecw.a $$1) {
      aew $$2 = this.r();
      if ($$2 == eco.a) {
         return Collections.emptyList();
      } else {
         ecw $$3 = $$1.a(efb.g, $$0).a(efa.o);
         akq $$4 = $$3.a();
         ecy $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dfj $$0, gw $$1) {
      return arw.a($$1);
   }

   @Deprecated
   public eig f(dfj $$0, cpb $$1, gw $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public eig b_(dfj $$0, cpb $$1, gw $$2) {
      return this.c($$0, $$1, $$2, ehs.a());
   }

   @Deprecated
   public eig a(dfj $$0, cpb $$1, gw $$2) {
      return eid.a();
   }

   @Deprecated
   public int g(dfj $$0, cpb $$1, gw $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bhb b(dfj $$0, cpv $$1, gw $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return true;
   }

   @Deprecated
   public float b(dfj $$0, cpb $$1, gw $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return 0;
   }

   @Deprecated
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return eid.b();
   }

   @Deprecated
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.aE ? $$0.j($$1, $$2) : eid.a();
   }

   @Deprecated
   public boolean a_(dfj $$0, cpb $$1, gw $$2) {
      return csv.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dfj $$0, cpb $$1, gw $$2) {
      return csv.a($$0.c($$1, $$2));
   }

   @Deprecated
   public eig b(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
   }

   @Deprecated
   public float a(dfj $$0, cbu $$1, cpb $$2, gw $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dfj $$0, akq $$1, gw $$2, cjf $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfj $$0, cpv $$1, gw $$2, cbu $$3) {
   }

   @Deprecated
   public int a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return 0;
   }

   @Deprecated
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
   }

   @Deprecated
   public int b(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return 0;
   }

   public final aew r() {
      if (this.aO == null) {
         aew $$0 = jb.f.b(this.p());
         this.aO = $$0.d("blocks/");
      }

      return this.aO;
   }

   @Deprecated
   public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
   }

   public abstract cja k();

   protected abstract csv p();

   public eaq s() {
      return this.aN.a.apply(this.p().n());
   }

   public float t() {
      return this.aN.f;
   }

   public abstract static class a extends dfl<csv, dfj> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final ear l;
      private final eaq m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dfi.f q;
      private final dfi.f r;
      private final dfi.f s;
      private final dfi.f t;
      private final dfi.f u;
      private final Optional<dfi.b> v;
      private final boolean w;
      private final dgk x;
      private final boolean y;
      @Nullable
      protected dfi.a.a a;
      private eam z = ean.a.g();
      private boolean A;

      protected a(csv $$0, ImmutableMap<dgm<?>, Comparable<?>> $$1, MapCodec<dfj> $$2) {
         super($$0, $$1, $$2);
         dfi.d $$3 = $$0.aN;
         this.b = $$3.d.applyAsInt(this.x());
         this.g = $$0.g_(this.x());
         this.h = $$3.n;
         this.i = $$3.o;
         this.j = $$3.p;
         this.l = $$3.s;
         this.m = $$3.a.apply(this.x());
         this.n = $$3.f;
         this.o = $$3.g;
         this.p = $$3.m;
         this.q = $$3.x;
         this.r = $$3.y;
         this.s = $$3.z;
         this.t = $$3.A;
         this.u = $$3.B;
         this.v = $$3.E;
         this.w = $$3.t;
         this.x = $$3.u;
         this.y = $$3.v;
      }

      private boolean D() {
         if (this.e.aN.r) {
            return true;
         } else if (this.e.aN.q) {
            return false;
         } else if (this.a == null) {
            return false;
         } else {
            eig $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ehi $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dfi.a.a(this.x());
         }

         this.k = this.D();
      }

      public csv b() {
         return this.e;
      }

      public he<csv> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         csv $$0 = this.b();
         return $$0 != csw.bs && $$0 != csw.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cpb $$0, gw $$1, biu<?> $$2) {
         return this.b().aN.w.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cpb $$0, gw $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cpb $$0, gw $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eig a(cpb $$0, gw $$1, ha $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eid.a(this.c($$0, $$1), $$2);
      }

      public eig c(cpb $$0, gw $$1) {
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

      public eaq d(cpb $$0, gw $$1) {
         return this.m;
      }

      public dfj a(czh $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dfj a(cxq $$0) {
         return this.b().a(this.x(), $$0);
      }

      public cza l() {
         return this.b().b_(this.x());
      }

      public boolean e(cpb $$0, gw $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cpb $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cpb $$0, gw $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cpb $$0, gw $$1, ha $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cpv $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cpb $$0, gw $$1) {
         return this.n;
      }

      public float a(cbu $$0, cpb $$1, gw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cpb $$0, gw $$1, ha $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ear o() {
         return this.l;
      }

      public boolean i(cpb $$0, gw $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dfj $$2 = this.x();
            return $$2.p() ? csv.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dfj $$0, ha $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eig j(cpb $$0, gw $$1) {
         return this.a($$0, $$1, ehs.a());
      }

      public eig a(cpb $$0, gw $$1, ehs $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eig k(cpb $$0, gw $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ehs.a());
      }

      public eig b(cpb $$0, gw $$1, ehs $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eig l(cpb $$0, gw $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eig c(cpb $$0, gw $$1, ehs $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eig m(cpb $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cpb $$0, gw $$1, biq $$2) {
         return this.a($$0, $$1, $$2, ha.b);
      }

      public final boolean a(cpb $$0, gw $$1, biq $$2, ha $$3) {
         return csv.a(this.b($$0, $$1, ehs.a($$2)), $$3);
      }

      public ehn n(cpb $$0, gw $$1) {
         return this.v.<ehn>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ehn.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cpv $$0, gw $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cpv $$0, gw $$1, csv $$2, gw $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cpw $$0, gw $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cpw $$0, gw $$1, int $$2, int $$3) {
         gw.a $$4 = new gw.a();

         for (ha $$5 : dfi.aD) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cpw $$0, gw $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cpw $$0, gw $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cpv $$0, gw $$1, dfj $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cpv $$0, gw $$1, dfj $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(akq $$0, gw $$1, asc $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(akq $$0, gw $$1, asc $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cpv $$0, gw $$1, biq $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(akq $$0, gw $$1, cjf $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cjf> a(ecw.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bgy a(cpv $$0, cbu $$1, bgx $$2, ehj $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cpv $$0, gw $$1, cbu $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cpb $$0, gw $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cpb $$0, gw $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dfj a(ha $$0, dfj $$1, cpw $$2, gw $$3, gw $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cpb $$0, gw $$1, ebc $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cln $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eal $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cpy $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cpb $$0, gw $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bhb b(cpv $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aqh<csv> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(aqh<csv> $$0, Predicate<dfi.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(hi<csv> $$0) {
         return $$0.a(this.b().q());
      }

      public boolean a(he<csv> $$0) {
         return this.a($$0.a());
      }

      public Stream<aqh<csv>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof cvj;
      }

      @Nullable
      public <T extends dcv> dcw<T> a(cpv $$0, dcx<T> $$1) {
         return this.b() instanceof cvj ? ((cvj)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(csv $$0) {
         return this.b() == $$0;
      }

      public eam u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(gw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dai w() {
         return this.b().m(this.x());
      }

      public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cpb $$0, gw $$1, ha $$2) {
         return this.a($$0, $$1, $$2, dax.a);
      }

      public boolean a(cpb $$0, gw $$1, ha $$2, dax $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cpb $$0, gw $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dfj x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dgk A() {
         return this.x;
      }

      static final class a {
         private static final ha[] e = ha.values();
         private static final int f = dax.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eig[] i;
         protected final eig b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dfj $$0) {
            csv $$1 = $$0.b();
            this.a = $$0.i(cpk.a, gw.b);
            this.g = $$1.c($$0, cpk.a, gw.b);
            this.h = $$1.g($$0, cpk.a, gw.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eig[e.length];
               eig $$2 = $$1.f($$0, cpk.a, gw.b);

               for (ha $$3 : e) {
                  this.i[$$3.ordinal()] = eid.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cpk.a, gw.b, ehs.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jb.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(ha.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ha $$4 : e) {
                  for (dax $$5 : dax.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cpk.a, gw.b, $$4);
                  }
               }

               this.d = csv.a($$0.k(cpk.a, gw.b));
            }
         }

         public boolean a(ha $$0, dax $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ha $$0, dax $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ehn evaluate(dfj var1, cpb var2, gw var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      Function<dfj, eaq> a = $$0 -> eaq.a;
      boolean b = true;
      dai c = dai.f;
      ToIntFunction<dfj> d = $$0 -> 0;
      float e;
      float f;
      boolean g;
      boolean h;
      float i = 0.6F;
      float j = 1.0F;
      float k = 1.0F;
      aew l;
      boolean m = true;
      boolean n;
      boolean o;
      @Deprecated
      boolean p;
      @Deprecated
      boolean q;
      boolean r;
      ear s = ear.a;
      boolean t = true;
      dgk u = dgk.a;
      boolean v;
      dfi.e<biu<?>> w = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ha.b) && $$0.h() < 14;
      dfi.f x = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dfi.f y = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dfi.f z = this.y;
      dfi.f A = ($$0, $$1, $$2) -> false;
      dfi.f B = ($$0, $$1, $$2) -> false;
      boolean C;
      cec D = cee.f;
      Optional<dfi.b> E = Optional.empty();

      private d() {
      }

      public static dfi.d a() {
         return new dfi.d();
      }

      public static dfi.d a(dfi $$0) {
         dfi.d $$1 = new dfi.d();
         $$1.f = $$0.aN.f;
         $$1.e = $$0.aN.e;
         $$1.b = $$0.aN.b;
         $$1.h = $$0.aN.h;
         $$1.d = $$0.aN.d;
         $$1.a = $$0.aN.a;
         $$1.c = $$0.aN.c;
         $$1.i = $$0.aN.i;
         $$1.j = $$0.aN.j;
         $$1.C = $$0.aN.C;
         $$1.m = $$0.aN.m;
         $$1.n = $$0.aN.n;
         $$1.o = $$0.aN.o;
         $$1.p = $$0.aN.p;
         $$1.q = $$0.aN.q;
         $$1.r = $$0.aN.r;
         $$1.s = $$0.aN.s;
         $$1.g = $$0.aN.g;
         $$1.E = $$0.aN.E;
         $$1.t = $$0.aN.t;
         $$1.D = $$0.aN.D;
         $$1.B = $$0.aN.B;
         $$1.u = $$0.aN.u;
         $$1.v = $$0.aN.v;
         return $$1;
      }

      public dfi.d a(cht $$0) {
         this.a = $$1 -> $$0.e();
         return this;
      }

      public dfi.d a(eaq $$0) {
         this.a = $$1 -> $$0;
         return this;
      }

      public dfi.d a(Function<dfj, eaq> $$0) {
         this.a = $$0;
         return this;
      }

      public dfi.d b() {
         this.b = false;
         this.m = false;
         return this;
      }

      public dfi.d c() {
         this.m = false;
         return this;
      }

      public dfi.d a(float $$0) {
         this.i = $$0;
         return this;
      }

      public dfi.d b(float $$0) {
         this.j = $$0;
         return this;
      }

      public dfi.d c(float $$0) {
         this.k = $$0;
         return this;
      }

      public dfi.d a(dai $$0) {
         this.c = $$0;
         return this;
      }

      public dfi.d a(ToIntFunction<dfj> $$0) {
         this.d = $$0;
         return this;
      }

      public dfi.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dfi.d d() {
         return this.d(0.0F);
      }

      public dfi.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dfi.d e() {
         this.h = true;
         return this;
      }

      public dfi.d f() {
         this.C = true;
         return this;
      }

      public dfi.d g() {
         this.l = eco.a;
         return this;
      }

      public dfi.d a(csv $$0) {
         this.l = $$0.r();
         return this;
      }

      public dfi.d h() {
         this.o = true;
         return this;
      }

      public dfi.d i() {
         this.p = true;
         return this;
      }

      public dfi.d j() {
         this.r = true;
         return this;
      }

      @Deprecated
      public dfi.d k() {
         this.q = true;
         return this;
      }

      public dfi.d a(ear $$0) {
         this.s = $$0;
         return this;
      }

      public dfi.d l() {
         this.n = true;
         return this;
      }

      public dfi.d a(dfi.e<biu<?>> $$0) {
         this.w = $$0;
         return this;
      }

      public dfi.d a(dfi.f $$0) {
         this.x = $$0;
         return this;
      }

      public dfi.d b(dfi.f $$0) {
         this.y = $$0;
         return this;
      }

      public dfi.d c(dfi.f $$0) {
         this.z = $$0;
         return this;
      }

      public dfi.d d(dfi.f $$0) {
         this.A = $$0;
         return this;
      }

      public dfi.d e(dfi.f $$0) {
         this.B = $$0;
         return this;
      }

      public dfi.d m() {
         this.g = true;
         return this;
      }

      public dfi.d e(float $$0) {
         this.f = $$0;
         return this;
      }

      public dfi.d f(float $$0) {
         this.e = Math.max(0.0F, $$0);
         return this;
      }

      public dfi.d a(dfi.c $$0) {
         switch ($$0) {
            case c:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csv $$3 = $$0x.b();
                  long $$4 = arw.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ar_();
                  float $$6 = $$3.ap_();
                  double $$7 = arw.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = arw.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ehn($$7, $$5, $$8);
               });
               break;
            case b:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csv $$3 = $$0x.b();
                  long $$4 = arw.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ap_();
                  double $$6 = arw.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = arw.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ehn($$6, 0.0, $$7);
               });
               break;
            default:
               this.E = Optional.empty();
         }

         return this;
      }

      public dfi.d n() {
         this.t = false;
         return this;
      }

      public dfi.d a(cea... $$0) {
         this.D = cee.d.a($$0);
         return this;
      }

      public dfi.d a(dgk $$0) {
         this.u = $$0;
         return this;
      }

      public dfi.d o() {
         this.v = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dfj var1, cpb var2, gw var3, A var4);
   }

   public interface f {
      boolean test(dfj var1, cpb var2, gw var3);
   }
}
