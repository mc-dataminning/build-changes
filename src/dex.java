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

public abstract class dex implements cdq {
   protected static final hb[] aD = new hb[]{hb.e, hb.f, hb.c, hb.d, hb.a, hb.b};
   protected final boolean aE;
   protected final float aF;
   protected final boolean aG;
   protected final czx aH;
   protected final float aI;
   protected final float aJ;
   protected final float aK;
   protected final boolean aL;
   protected final cdt aM;
   protected final dex.d aN;
   @Nullable
   protected aep aO;

   public dex(dex.d $$0) {
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
   public void a(dey $$0, cpl $$1, gv $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(apo.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dey $$0, dey $$1, hb $$2) {
      return false;
   }

   @Deprecated
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      aau.a($$1, $$2);
   }

   @Deprecated
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      return bgo.d;
   }

   @Deprecated
   public boolean a(dey $$0, cpk $$1, gv $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Deprecated
   public boolean g_(dey $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dey $$0) {
      return false;
   }

   @Deprecated
   public eab c_(dey $$0) {
      return eac.a.g();
   }

   @Deprecated
   public boolean d_(dey $$0) {
      return false;
   }

   public float al_() {
      return 0.25F;
   }

   public float an_() {
      return 0.2F;
   }

   @Override
   public cdt m() {
      return this.aM;
   }

   @Deprecated
   public dey a(dey $$0, cyw $$1) {
      return $$0;
   }

   @Deprecated
   public dey a(dey $$0, cxf $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dey $$0, cle $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dey $$0, eaa $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<ciw> a(dey $$0, ecn.a $$1) {
      aep $$2 = this.r();
      if ($$2 == ecd.a) {
         return Collections.emptyList();
      } else {
         ecn $$3 = $$1.a(eet.g, $$0).a(ees.n);
         aki $$4 = $$3.a();
         ecp $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dey $$0, gv $$1) {
      return aro.a($$1);
   }

   @Deprecated
   public ehy f(dey $$0, coq $$1, gv $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public ehy b_(dey $$0, coq $$1, gv $$2) {
      return this.c($$0, $$1, $$2, ehk.a());
   }

   @Deprecated
   public ehy a(dey $$0, coq $$1, gv $$2) {
      return ehv.a();
   }

   @Deprecated
   public int g(dey $$0, coq $$1, gv $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bgr b(dey $$0, cpk $$1, gv $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return true;
   }

   @Deprecated
   public float b(dey $$0, coq $$1, gv $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dey $$0, cpk $$1, gv $$2) {
      return 0;
   }

   @Deprecated
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ehv.b();
   }

   @Deprecated
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.aE ? $$0.j($$1, $$2) : ehv.a();
   }

   @Deprecated
   public boolean a_(dey $$0, coq $$1, gv $$2) {
      return csk.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dey $$0, coq $$1, gv $$2) {
      return csk.a($$0.c($$1, $$2));
   }

   @Deprecated
   public ehy b(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
   }

   @Deprecated
   public float a(dey $$0, cbl $$1, coq $$2, gv $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dey $$0, aki $$1, gv $$2, ciw $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
   }

   @Deprecated
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return 0;
   }

   @Deprecated
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
   }

   @Deprecated
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return 0;
   }

   public final aep r() {
      if (this.aO == null) {
         aep $$0 = jc.f.b(this.p());
         this.aO = $$0.d("blocks/");
      }

      return this.aO;
   }

   @Deprecated
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
   }

   public abstract cir k();

   protected abstract csk p();

   public eaf s() {
      return this.aN.a.apply(this.p().n());
   }

   public float t() {
      return this.aN.f;
   }

   public abstract static class a extends dfa<csk, dey> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eag l;
      private final eaf m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dex.f q;
      private final dex.f r;
      private final dex.f s;
      private final dex.f t;
      private final dex.f u;
      private final Optional<dex.b> v;
      private final boolean w;
      private final dfz x;
      private final boolean y;
      @Nullable
      protected dex.a.a a;
      private eab z = eac.a.g();
      private boolean A;

      protected a(csk $$0, ImmutableMap<dgb<?>, Comparable<?>> $$1, MapCodec<dey> $$2) {
         super($$0, $$1, $$2);
         dex.d $$3 = $$0.aN;
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
            ehy $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               eha $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dex.a.a(this.x());
         }

         this.k = this.D();
      }

      public csk b() {
         return this.e;
      }

      public hf<csk> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         csk $$0 = this.b();
         return $$0 != csl.bs && $$0 != csl.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(coq $$0, gv $$1, bik<?> $$2) {
         return this.b().aN.w.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(coq $$0, gv $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(coq $$0, gv $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ehy a(coq $$0, gv $$1, hb $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ehv.a(this.c($$0, $$1), $$2);
      }

      public ehy c(coq $$0, gv $$1) {
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

      public eaf d(coq $$0, gv $$1) {
         return this.m;
      }

      public dey a(cyw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dey a(cxf $$0) {
         return this.b().a(this.x(), $$0);
      }

      public cyp l() {
         return this.b().b_(this.x());
      }

      public boolean e(coq $$0, gv $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(coq $$0, gv $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(coq $$0, gv $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(coq $$0, gv $$1, hb $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cpk $$0, gv $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(coq $$0, gv $$1) {
         return this.n;
      }

      public float a(cbl $$0, coq $$1, gv $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(coq $$0, gv $$1, hb $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eag o() {
         return this.l;
      }

      public boolean i(coq $$0, gv $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dey $$2 = this.x();
            return $$2.p() ? csk.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dey $$0, hb $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ehy j(coq $$0, gv $$1) {
         return this.a($$0, $$1, ehk.a());
      }

      public ehy a(coq $$0, gv $$1, ehk $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ehy k(coq $$0, gv $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ehk.a());
      }

      public ehy b(coq $$0, gv $$1, ehk $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ehy l(coq $$0, gv $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ehy c(coq $$0, gv $$1, ehk $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ehy m(coq $$0, gv $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(coq $$0, gv $$1, big $$2) {
         return this.a($$0, $$1, $$2, hb.b);
      }

      public final boolean a(coq $$0, gv $$1, big $$2, hb $$3) {
         return csk.a(this.b($$0, $$1, ehk.a($$2)), $$3);
      }

      public ehf n(coq $$0, gv $$1) {
         return this.v.<ehf>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ehf.b);
      }

      public boolean q() {
         return !this.v.isEmpty();
      }

      public boolean a(cpk $$0, gv $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cpk $$0, gv $$1, csk $$2, gv $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cpl $$0, gv $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cpl $$0, gv $$1, int $$2, int $$3) {
         gv.a $$4 = new gv.a();

         for (hb $$5 : dex.aD) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cpl $$0, gv $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cpl $$0, gv $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cpk $$0, gv $$1, dey $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cpk $$0, gv $$1, dey $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(aki $$0, gv $$1, art $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(aki $$0, gv $$1, art $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cpk $$0, gv $$1, big $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(aki $$0, gv $$1, ciw $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<ciw> a(ecn.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bgo a(cpk $$0, cbl $$1, bgn $$2, ehb $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cpk $$0, gv $$1, cbl $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(coq $$0, gv $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(coq $$0, gv $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dey a(hb $$0, dey $$1, cpl $$2, gv $$3, gv $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(coq $$0, gv $$1, ear $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cle $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eaa $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cpn $$0, gv $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(coq $$0, gv $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bgr b(cpk $$0, gv $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(apy<csk> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(apy<csk> $$0, Predicate<dex.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(hj<csk> $$0) {
         return $$0.a(this.b().q());
      }

      public Stream<apy<csk>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof cuy;
      }

      @Nullable
      public <T extends dck> dcl<T> a(cpk $$0, dcm<T> $$1) {
         return this.b() instanceof cuy ? ((cuy)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(csk $$0) {
         return this.b() == $$0;
      }

      public eab u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(gv $$0) {
         return this.b().a(this.x(), $$0);
      }

      public czx w() {
         return this.b().m(this.x());
      }

      public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(coq $$0, gv $$1, hb $$2) {
         return this.a($$0, $$1, $$2, dam.a);
      }

      public boolean a(coq $$0, gv $$1, hb $$2, dam $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(coq $$0, gv $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dey x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dfz A() {
         return this.x;
      }

      static final class a {
         private static final hb[] e = hb.values();
         private static final int f = dam.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ehy[] i;
         protected final ehy b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dey $$0) {
            csk $$1 = $$0.b();
            this.a = $$0.i(coz.a, gv.b);
            this.g = $$1.c($$0, coz.a, gv.b);
            this.h = $$1.g($$0, coz.a, gv.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ehy[e.length];
               ehy $$2 = $$1.f($$0, coz.a, gv.b);

               for (hb $$3 : e) {
                  this.i[$$3.ordinal()] = ehv.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, coz.a, gv.b, ehk.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jc.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(hb.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (hb $$4 : e) {
                  for (dam $$5 : dam.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, coz.a, gv.b, $$4);
                  }
               }

               this.d = csk.a($$0.k(coz.a, gv.b));
            }
         }

         public boolean a(hb $$0, dam $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(hb $$0, dam $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ehf evaluate(dey var1, coq var2, gv var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      Function<dey, eaf> a = $$0 -> eaf.a;
      boolean b = true;
      czx c = czx.f;
      ToIntFunction<dey> d = $$0 -> 0;
      float e;
      float f;
      boolean g;
      boolean h;
      float i = 0.6F;
      float j = 1.0F;
      float k = 1.0F;
      aep l;
      boolean m = true;
      boolean n;
      boolean o;
      @Deprecated
      boolean p;
      @Deprecated
      boolean q;
      boolean r;
      eag s = eag.a;
      boolean t = true;
      dfz u = dfz.a;
      boolean v;
      dex.e<bik<?>> w = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, hb.b) && $$0.h() < 14;
      dex.f x = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dex.f y = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dex.f z = this.y;
      dex.f A = ($$0, $$1, $$2) -> false;
      dex.f B = ($$0, $$1, $$2) -> false;
      boolean C;
      cdt D = cdv.f;
      Optional<dex.b> E = Optional.empty();

      private d() {
      }

      public static dex.d a() {
         return new dex.d();
      }

      public static dex.d a(dex $$0) {
         dex.d $$1 = new dex.d();
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

      public dex.d a(chk $$0) {
         this.a = $$1 -> $$0.e();
         return this;
      }

      public dex.d a(eaf $$0) {
         this.a = $$1 -> $$0;
         return this;
      }

      public dex.d a(Function<dey, eaf> $$0) {
         this.a = $$0;
         return this;
      }

      public dex.d b() {
         this.b = false;
         this.m = false;
         return this;
      }

      public dex.d c() {
         this.m = false;
         return this;
      }

      public dex.d a(float $$0) {
         this.i = $$0;
         return this;
      }

      public dex.d b(float $$0) {
         this.j = $$0;
         return this;
      }

      public dex.d c(float $$0) {
         this.k = $$0;
         return this;
      }

      public dex.d a(czx $$0) {
         this.c = $$0;
         return this;
      }

      public dex.d a(ToIntFunction<dey> $$0) {
         this.d = $$0;
         return this;
      }

      public dex.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dex.d d() {
         return this.d(0.0F);
      }

      public dex.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dex.d e() {
         this.h = true;
         return this;
      }

      public dex.d f() {
         this.C = true;
         return this;
      }

      public dex.d g() {
         this.l = ecd.a;
         return this;
      }

      public dex.d a(csk $$0) {
         this.l = $$0.r();
         return this;
      }

      public dex.d h() {
         this.o = true;
         return this;
      }

      public dex.d i() {
         this.p = true;
         return this;
      }

      public dex.d j() {
         this.r = true;
         return this;
      }

      @Deprecated
      public dex.d k() {
         this.q = true;
         return this;
      }

      public dex.d a(eag $$0) {
         this.s = $$0;
         return this;
      }

      public dex.d l() {
         this.n = true;
         return this;
      }

      public dex.d a(dex.e<bik<?>> $$0) {
         this.w = $$0;
         return this;
      }

      public dex.d a(dex.f $$0) {
         this.x = $$0;
         return this;
      }

      public dex.d b(dex.f $$0) {
         this.y = $$0;
         return this;
      }

      public dex.d c(dex.f $$0) {
         this.z = $$0;
         return this;
      }

      public dex.d d(dex.f $$0) {
         this.A = $$0;
         return this;
      }

      public dex.d e(dex.f $$0) {
         this.B = $$0;
         return this;
      }

      public dex.d m() {
         this.g = true;
         return this;
      }

      public dex.d e(float $$0) {
         this.f = $$0;
         return this;
      }

      public dex.d f(float $$0) {
         this.e = Math.max(0.0F, $$0);
         return this;
      }

      public dex.d a(dex.c $$0) {
         switch ($$0) {
            case c:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csk $$3 = $$0x.b();
                  long $$4 = aro.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.an_();
                  float $$6 = $$3.al_();
                  double $$7 = aro.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = aro.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ehf($$7, $$5, $$8);
               });
               break;
            case b:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csk $$3 = $$0x.b();
                  long $$4 = aro.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.al_();
                  double $$6 = aro.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = aro.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ehf($$6, 0.0, $$7);
               });
               break;
            default:
               this.E = Optional.empty();
         }

         return this;
      }

      public dex.d n() {
         this.t = false;
         return this;
      }

      public dex.d a(cdr... $$0) {
         this.D = cdv.d.a($$0);
         return this;
      }

      public dex.d a(dfz $$0) {
         this.u = $$0;
         return this;
      }

      public dex.d o() {
         this.v = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dey var1, coq var2, gv var3, A var4);
   }

   public interface f {
      boolean test(dey var1, coq var2, gv var3);
   }
}
