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

public abstract class dfk implements ceb {
   protected static final hc[] aD = new hc[]{hc.e, hc.f, hc.c, hc.d, hc.a, hc.b};
   protected final boolean aE;
   protected final float aF;
   protected final boolean aG;
   protected final dak aH;
   protected final float aI;
   protected final float aJ;
   protected final float aK;
   protected final boolean aL;
   protected final cee aM;
   protected final dfk.d aN;
   @Nullable
   protected aey aO;

   public dfk(dfk.d $$0) {
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
   public void a(dfl $$0, cpy $$1, gw $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(apz.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfl $$0, dfl $$1, hc $$2) {
      return false;
   }

   @Deprecated
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      abd.a($$1, $$2);
   }

   @Deprecated
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      return bha.d;
   }

   @Deprecated
   public boolean a(dfl $$0, cpx $$1, gw $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Deprecated
   public boolean g_(dfl $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dfl $$0) {
      return false;
   }

   @Deprecated
   public eao c_(dfl $$0) {
      return eap.a.g();
   }

   @Deprecated
   public boolean d_(dfl $$0) {
      return false;
   }

   public float ap_() {
      return 0.25F;
   }

   public float ar_() {
      return 0.2F;
   }

   @Override
   public cee m() {
      return this.aM;
   }

   @Deprecated
   public dfl a(dfl $$0, czj $$1) {
      return $$0;
   }

   @Deprecated
   public dfl a(dfl $$0, cxs $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfl $$0, clp $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dfl $$0, ean $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cjh> a(dfl $$0, ecy.a $$1) {
      aey $$2 = this.r();
      if ($$2 == ecq.a) {
         return Collections.emptyList();
      } else {
         ecy $$3 = $$1.a(efd.g, $$0).a(efc.o);
         aks $$4 = $$3.a();
         eda $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dfl $$0, gw $$1) {
      return ary.a($$1);
   }

   @Deprecated
   public eii f(dfl $$0, cpd $$1, gw $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      return this.c($$0, $$1, $$2, ehu.a());
   }

   @Deprecated
   public eii a(dfl $$0, cpd $$1, gw $$2) {
      return eif.a();
   }

   @Deprecated
   public int g(dfl $$0, cpd $$1, gw $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bhd b(dfl $$0, cpx $$1, gw $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return true;
   }

   @Deprecated
   public float b(dfl $$0, cpd $$1, gw $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return 0;
   }

   @Deprecated
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return eif.b();
   }

   @Deprecated
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.aE ? $$0.j($$1, $$2) : eif.a();
   }

   @Deprecated
   public boolean a_(dfl $$0, cpd $$1, gw $$2) {
      return csx.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dfl $$0, cpd $$1, gw $$2) {
      return csx.a($$0.c($$1, $$2));
   }

   @Deprecated
   public eii b(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
   }

   @Deprecated
   public float a(dfl $$0, cbw $$1, cpd $$2, gw $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dfl $$0, aks $$1, gw $$2, cjh $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfl $$0, cpx $$1, gw $$2, cbw $$3) {
   }

   @Deprecated
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return 0;
   }

   @Deprecated
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
   }

   @Deprecated
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return 0;
   }

   public final aey r() {
      if (this.aO == null) {
         aey $$0 = jd.f.b(this.p());
         this.aO = $$0.d("blocks/");
      }

      return this.aO;
   }

   @Deprecated
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
   }

   public abstract cjc k();

   protected abstract csx p();

   public eas s() {
      return this.aN.a.apply(this.p().n());
   }

   public float t() {
      return this.aN.f;
   }

   public abstract static class a extends dfn<csx, dfl> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eat l;
      private final eas m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dfk.f q;
      private final dfk.f r;
      private final dfk.f s;
      private final dfk.f t;
      private final dfk.f u;
      private final Optional<dfk.b> v;
      private final boolean w;
      private final dgm x;
      private final boolean y;
      @Nullable
      protected dfk.a.a a;
      private eao z = eap.a.g();
      private boolean A;

      protected a(csx $$0, ImmutableMap<dgo<?>, Comparable<?>> $$1, MapCodec<dfl> $$2) {
         super($$0, $$1, $$2);
         dfk.d $$3 = $$0.aN;
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
            eii $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ehk $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dfk.a.a(this.x());
         }

         this.k = this.D();
      }

      public csx b() {
         return this.e;
      }

      public hg<csx> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         csx $$0 = this.b();
         return $$0 != csy.bs && $$0 != csy.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cpd $$0, gw $$1, biw<?> $$2) {
         return this.b().aN.w.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cpd $$0, gw $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cpd $$0, gw $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eii a(cpd $$0, gw $$1, hc $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eif.a(this.c($$0, $$1), $$2);
      }

      public eii c(cpd $$0, gw $$1) {
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

      public eas d(cpd $$0, gw $$1) {
         return this.m;
      }

      public dfl a(czj $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dfl a(cxs $$0) {
         return this.b().a(this.x(), $$0);
      }

      public czc l() {
         return this.b().b_(this.x());
      }

      public boolean e(cpd $$0, gw $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cpd $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cpd $$0, gw $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cpd $$0, gw $$1, hc $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cpx $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cpd $$0, gw $$1) {
         return this.n;
      }

      public float a(cbw $$0, cpd $$1, gw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cpd $$0, gw $$1, hc $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eat o() {
         return this.l;
      }

      public boolean i(cpd $$0, gw $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dfl $$2 = this.x();
            return $$2.p() ? csx.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dfl $$0, hc $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eii j(cpd $$0, gw $$1) {
         return this.a($$0, $$1, ehu.a());
      }

      public eii a(cpd $$0, gw $$1, ehu $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eii k(cpd $$0, gw $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ehu.a());
      }

      public eii b(cpd $$0, gw $$1, ehu $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eii l(cpd $$0, gw $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eii c(cpd $$0, gw $$1, ehu $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eii m(cpd $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cpd $$0, gw $$1, bis $$2) {
         return this.a($$0, $$1, $$2, hc.b);
      }

      public final boolean a(cpd $$0, gw $$1, bis $$2, hc $$3) {
         return csx.a(this.b($$0, $$1, ehu.a($$2)), $$3);
      }

      public ehp n(cpd $$0, gw $$1) {
         return this.v.<ehp>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ehp.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cpx $$0, gw $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cpx $$0, gw $$1, csx $$2, gw $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cpy $$0, gw $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cpy $$0, gw $$1, int $$2, int $$3) {
         gw.a $$4 = new gw.a();

         for (hc $$5 : dfk.aD) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cpy $$0, gw $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cpy $$0, gw $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cpx $$0, gw $$1, dfl $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cpx $$0, gw $$1, dfl $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aks $$0, gw $$1, ase $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aks $$0, gw $$1, ase $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cpx $$0, gw $$1, bis $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aks $$0, gw $$1, cjh $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cjh> a(ecy.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bha a(cpx $$0, cbw $$1, bgz $$2, ehl $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cpx $$0, gw $$1, cbw $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cpd $$0, gw $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cpd $$0, gw $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dfl a(hc $$0, dfl $$1, cpy $$2, gw $$3, gw $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cpd $$0, gw $$1, ebe $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(clp $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(ean $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cqa $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cpd $$0, gw $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bhd b(cpx $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aqj<csx> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(aqj<csx> $$0, Predicate<dfk.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(hk<csx> $$0) {
         return $$0.a(this.b().q());
      }

      public boolean a(hg<csx> $$0) {
         return this.a($$0.a());
      }

      public Stream<aqj<csx>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof cvl;
      }

      @Nullable
      public <T extends dcx> dcy<T> a(cpx $$0, dcz<T> $$1) {
         return this.b() instanceof cvl ? ((cvl)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(csx $$0) {
         return this.b() == $$0;
      }

      public eao u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(gw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dak w() {
         return this.b().m(this.x());
      }

      public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cpd $$0, gw $$1, hc $$2) {
         return this.a($$0, $$1, $$2, daz.a);
      }

      public boolean a(cpd $$0, gw $$1, hc $$2, daz $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cpd $$0, gw $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dfl x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dgm A() {
         return this.x;
      }

      static final class a {
         private static final hc[] e = hc.values();
         private static final int f = daz.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eii[] i;
         protected final eii b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dfl $$0) {
            csx $$1 = $$0.b();
            this.a = $$0.i(cpm.a, gw.b);
            this.g = $$1.c($$0, cpm.a, gw.b);
            this.h = $$1.g($$0, cpm.a, gw.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eii[e.length];
               eii $$2 = $$1.f($$0, cpm.a, gw.b);

               for (hc $$3 : e) {
                  this.i[$$3.ordinal()] = eif.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cpm.a, gw.b, ehu.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jd.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(hc.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (hc $$4 : e) {
                  for (daz $$5 : daz.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cpm.a, gw.b, $$4);
                  }
               }

               this.d = csx.a($$0.k(cpm.a, gw.b));
            }
         }

         public boolean a(hc $$0, daz $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(hc $$0, daz $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ehp evaluate(dfl var1, cpd var2, gw var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      Function<dfl, eas> a = $$0 -> eas.a;
      boolean b = true;
      dak c = dak.f;
      ToIntFunction<dfl> d = $$0 -> 0;
      float e;
      float f;
      boolean g;
      boolean h;
      float i = 0.6F;
      float j = 1.0F;
      float k = 1.0F;
      aey l;
      boolean m = true;
      boolean n;
      boolean o;
      @Deprecated
      boolean p;
      @Deprecated
      boolean q;
      boolean r;
      eat s = eat.a;
      boolean t = true;
      dgm u = dgm.a;
      boolean v;
      dfk.e<biw<?>> w = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, hc.b) && $$0.h() < 14;
      dfk.f x = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dfk.f y = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dfk.f z = this.y;
      dfk.f A = ($$0, $$1, $$2) -> false;
      dfk.f B = ($$0, $$1, $$2) -> false;
      boolean C;
      cee D = ceg.f;
      Optional<dfk.b> E = Optional.empty();

      private d() {
      }

      public static dfk.d a() {
         return new dfk.d();
      }

      public static dfk.d a(dfk $$0) {
         dfk.d $$1 = new dfk.d();
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

      public dfk.d a(chv $$0) {
         this.a = $$1 -> $$0.e();
         return this;
      }

      public dfk.d a(eas $$0) {
         this.a = $$1 -> $$0;
         return this;
      }

      public dfk.d a(Function<dfl, eas> $$0) {
         this.a = $$0;
         return this;
      }

      public dfk.d b() {
         this.b = false;
         this.m = false;
         return this;
      }

      public dfk.d c() {
         this.m = false;
         return this;
      }

      public dfk.d a(float $$0) {
         this.i = $$0;
         return this;
      }

      public dfk.d b(float $$0) {
         this.j = $$0;
         return this;
      }

      public dfk.d c(float $$0) {
         this.k = $$0;
         return this;
      }

      public dfk.d a(dak $$0) {
         this.c = $$0;
         return this;
      }

      public dfk.d a(ToIntFunction<dfl> $$0) {
         this.d = $$0;
         return this;
      }

      public dfk.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dfk.d d() {
         return this.d(0.0F);
      }

      public dfk.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dfk.d e() {
         this.h = true;
         return this;
      }

      public dfk.d f() {
         this.C = true;
         return this;
      }

      public dfk.d g() {
         this.l = ecq.a;
         return this;
      }

      public dfk.d a(csx $$0) {
         this.l = $$0.r();
         return this;
      }

      public dfk.d h() {
         this.o = true;
         return this;
      }

      public dfk.d i() {
         this.p = true;
         return this;
      }

      public dfk.d j() {
         this.r = true;
         return this;
      }

      @Deprecated
      public dfk.d k() {
         this.q = true;
         return this;
      }

      public dfk.d a(eat $$0) {
         this.s = $$0;
         return this;
      }

      public dfk.d l() {
         this.n = true;
         return this;
      }

      public dfk.d a(dfk.e<biw<?>> $$0) {
         this.w = $$0;
         return this;
      }

      public dfk.d a(dfk.f $$0) {
         this.x = $$0;
         return this;
      }

      public dfk.d b(dfk.f $$0) {
         this.y = $$0;
         return this;
      }

      public dfk.d c(dfk.f $$0) {
         this.z = $$0;
         return this;
      }

      public dfk.d d(dfk.f $$0) {
         this.A = $$0;
         return this;
      }

      public dfk.d e(dfk.f $$0) {
         this.B = $$0;
         return this;
      }

      public dfk.d m() {
         this.g = true;
         return this;
      }

      public dfk.d e(float $$0) {
         this.f = $$0;
         return this;
      }

      public dfk.d f(float $$0) {
         this.e = Math.max(0.0F, $$0);
         return this;
      }

      public dfk.d a(dfk.c $$0) {
         switch ($$0) {
            case c:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csx $$3 = $$0x.b();
                  long $$4 = ary.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.ar_();
                  float $$6 = $$3.ap_();
                  double $$7 = ary.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ary.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ehp($$7, $$5, $$8);
               });
               break;
            case b:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csx $$3 = $$0x.b();
                  long $$4 = ary.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ap_();
                  double $$6 = ary.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ary.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ehp($$6, 0.0, $$7);
               });
               break;
            default:
               this.E = Optional.empty();
         }

         return this;
      }

      public dfk.d n() {
         this.t = false;
         return this;
      }

      public dfk.d a(cec... $$0) {
         this.D = ceg.d.a($$0);
         return this;
      }

      public dfk.d a(dgm $$0) {
         this.u = $$0;
         return this;
      }

      public dfk.d o() {
         this.v = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dfl var1, cpd var2, gw var3, A var4);
   }

   public interface f {
      boolean test(dfl var1, cpd var2, gw var3);
   }
}
