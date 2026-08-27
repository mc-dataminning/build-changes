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

public abstract class dey implements cdr {
   protected static final ha[] aD = new ha[]{ha.e, ha.f, ha.c, ha.d, ha.a, ha.b};
   protected final boolean aE;
   protected final float aF;
   protected final boolean aG;
   protected final czy aH;
   protected final float aI;
   protected final float aJ;
   protected final float aK;
   protected final boolean aL;
   protected final cdu aM;
   protected final dey.d aN;
   @Nullable
   protected aer aO;

   public dey(dey.d $$0) {
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
   public void a(dez $$0, cpm $$1, gu $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(apq.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dez $$0, dez $$1, ha $$2) {
      return false;
   }

   @Deprecated
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      aav.a($$1, $$2);
   }

   @Deprecated
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      return bgq.d;
   }

   @Deprecated
   public boolean a(dez $$0, cpl $$1, gu $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Deprecated
   public boolean g_(dez $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dez $$0) {
      return false;
   }

   @Deprecated
   public eac c_(dez $$0) {
      return ead.a.g();
   }

   @Deprecated
   public boolean d_(dez $$0) {
      return false;
   }

   public float ak_() {
      return 0.25F;
   }

   public float am_() {
      return 0.2F;
   }

   @Override
   public cdu m() {
      return this.aM;
   }

   @Deprecated
   public dez a(dez $$0, cyx $$1) {
      return $$0;
   }

   @Deprecated
   public dez a(dez $$0, cxg $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dez $$0, clf $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dez $$0, eab $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cix> a(dez $$0, ecm.a $$1) {
      aer $$2 = this.r();
      if ($$2 == ece.a) {
         return Collections.emptyList();
      } else {
         ecm $$3 = $$1.a(eer.g, $$0).a(eeq.o);
         akk $$4 = $$3.a();
         eco $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dez $$0, gu $$1) {
      return arp.a($$1);
   }

   @Deprecated
   public ehw f(dez $$0, cor $$1, gu $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public ehw b_(dez $$0, cor $$1, gu $$2) {
      return this.c($$0, $$1, $$2, ehi.a());
   }

   @Deprecated
   public ehw a(dez $$0, cor $$1, gu $$2) {
      return eht.a();
   }

   @Deprecated
   public int g(dez $$0, cor $$1, gu $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bgt b(dez $$0, cpl $$1, gu $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return true;
   }

   @Deprecated
   public float b(dez $$0, cor $$1, gu $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dez $$0, cpl $$1, gu $$2) {
      return 0;
   }

   @Deprecated
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return eht.b();
   }

   @Deprecated
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.aE ? $$0.j($$1, $$2) : eht.a();
   }

   @Deprecated
   public boolean a_(dez $$0, cor $$1, gu $$2) {
      return csl.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dez $$0, cor $$1, gu $$2) {
      return csl.a($$0.c($$1, $$2));
   }

   @Deprecated
   public ehw b(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
   }

   @Deprecated
   public float a(dez $$0, cbm $$1, cor $$2, gu $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dez $$0, akk $$1, gu $$2, cix $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dez $$0, cpl $$1, gu $$2, cbm $$3) {
   }

   @Deprecated
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return 0;
   }

   @Deprecated
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
   }

   @Deprecated
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return 0;
   }

   public final aer r() {
      if (this.aO == null) {
         aer $$0 = jb.f.b(this.p());
         this.aO = $$0.d("blocks/");
      }

      return this.aO;
   }

   @Deprecated
   public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
   }

   public abstract cis k();

   protected abstract csl p();

   public eag s() {
      return this.aN.a.apply(this.p().n());
   }

   public float t() {
      return this.aN.f;
   }

   public abstract static class a extends dfb<csl, dez> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eah l;
      private final eag m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dey.f q;
      private final dey.f r;
      private final dey.f s;
      private final dey.f t;
      private final dey.f u;
      private final Optional<dey.b> v;
      private final boolean w;
      private final dga x;
      private final boolean y;
      @Nullable
      protected dey.a.a a;
      private eac z = ead.a.g();
      private boolean A;

      protected a(csl $$0, ImmutableMap<dgc<?>, Comparable<?>> $$1, MapCodec<dez> $$2) {
         super($$0, $$1, $$2);
         dey.d $$3 = $$0.aN;
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
            ehw $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               egy $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dey.a.a(this.x());
         }

         this.k = this.D();
      }

      public csl b() {
         return this.e;
      }

      public he<csl> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         csl $$0 = this.b();
         return $$0 != csm.bs && $$0 != csm.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cor $$0, gu $$1, bim<?> $$2) {
         return this.b().aN.w.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cor $$0, gu $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cor $$0, gu $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ehw a(cor $$0, gu $$1, ha $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : eht.a(this.c($$0, $$1), $$2);
      }

      public ehw c(cor $$0, gu $$1) {
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

      public eag d(cor $$0, gu $$1) {
         return this.m;
      }

      public dez a(cyx $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dez a(cxg $$0) {
         return this.b().a(this.x(), $$0);
      }

      public cyq l() {
         return this.b().b_(this.x());
      }

      public boolean e(cor $$0, gu $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cor $$0, gu $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cor $$0, gu $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cor $$0, gu $$1, ha $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cpl $$0, gu $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cor $$0, gu $$1) {
         return this.n;
      }

      public float a(cbm $$0, cor $$1, gu $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cor $$0, gu $$1, ha $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eah o() {
         return this.l;
      }

      public boolean i(cor $$0, gu $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dez $$2 = this.x();
            return $$2.p() ? csl.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dez $$0, ha $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ehw j(cor $$0, gu $$1) {
         return this.a($$0, $$1, ehi.a());
      }

      public ehw a(cor $$0, gu $$1, ehi $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ehw k(cor $$0, gu $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ehi.a());
      }

      public ehw b(cor $$0, gu $$1, ehi $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ehw l(cor $$0, gu $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ehw c(cor $$0, gu $$1, ehi $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ehw m(cor $$0, gu $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cor $$0, gu $$1, bii $$2) {
         return this.a($$0, $$1, $$2, ha.b);
      }

      public final boolean a(cor $$0, gu $$1, bii $$2, ha $$3) {
         return csl.a(this.b($$0, $$1, ehi.a($$2)), $$3);
      }

      public ehd n(cor $$0, gu $$1) {
         return this.v.<ehd>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ehd.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cpl $$0, gu $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cpl $$0, gu $$1, csl $$2, gu $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cpm $$0, gu $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cpm $$0, gu $$1, int $$2, int $$3) {
         gu.a $$4 = new gu.a();

         for (ha $$5 : dey.aD) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cpm $$0, gu $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cpm $$0, gu $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cpl $$0, gu $$1, dez $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cpl $$0, gu $$1, dez $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(akk $$0, gu $$1, aru $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(akk $$0, gu $$1, aru $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cpl $$0, gu $$1, bii $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(akk $$0, gu $$1, cix $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cix> a(ecm.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bgq a(cpl $$0, cbm $$1, bgp $$2, egz $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cpl $$0, gu $$1, cbm $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cor $$0, gu $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cor $$0, gu $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dez a(ha $$0, dez $$1, cpm $$2, gu $$3, gu $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cor $$0, gu $$1, eas $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(clf $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eab $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cpo $$0, gu $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cor $$0, gu $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bgt b(cpl $$0, gu $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aqa<csl> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(aqa<csl> $$0, Predicate<dey.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(hi<csl> $$0) {
         return $$0.a(this.b().q());
      }

      public boolean a(he<csl> $$0) {
         return this.a($$0.a());
      }

      public Stream<aqa<csl>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof cuz;
      }

      @Nullable
      public <T extends dcl> dcm<T> a(cpl $$0, dcn<T> $$1) {
         return this.b() instanceof cuz ? ((cuz)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(csl $$0) {
         return this.b() == $$0;
      }

      public eac u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(gu $$0) {
         return this.b().a(this.x(), $$0);
      }

      public czy w() {
         return this.b().m(this.x());
      }

      public void a(cpl $$0, dez $$1, egz $$2, cce $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cor $$0, gu $$1, ha $$2) {
         return this.a($$0, $$1, $$2, dan.a);
      }

      public boolean a(cor $$0, gu $$1, ha $$2, dan $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cor $$0, gu $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dez x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dga A() {
         return this.x;
      }

      static final class a {
         private static final ha[] e = ha.values();
         private static final int f = dan.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ehw[] i;
         protected final ehw b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dez $$0) {
            csl $$1 = $$0.b();
            this.a = $$0.i(cpa.a, gu.b);
            this.g = $$1.c($$0, cpa.a, gu.b);
            this.h = $$1.g($$0, cpa.a, gu.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ehw[e.length];
               ehw $$2 = $$1.f($$0, cpa.a, gu.b);

               for (ha $$3 : e) {
                  this.i[$$3.ordinal()] = eht.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cpa.a, gu.b, ehi.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jb.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(ha.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ha $$4 : e) {
                  for (dan $$5 : dan.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cpa.a, gu.b, $$4);
                  }
               }

               this.d = csl.a($$0.k(cpa.a, gu.b));
            }
         }

         public boolean a(ha $$0, dan $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ha $$0, dan $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ehd evaluate(dez var1, cor var2, gu var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      Function<dez, eag> a = $$0 -> eag.a;
      boolean b = true;
      czy c = czy.f;
      ToIntFunction<dez> d = $$0 -> 0;
      float e;
      float f;
      boolean g;
      boolean h;
      float i = 0.6F;
      float j = 1.0F;
      float k = 1.0F;
      aer l;
      boolean m = true;
      boolean n;
      boolean o;
      @Deprecated
      boolean p;
      @Deprecated
      boolean q;
      boolean r;
      eah s = eah.a;
      boolean t = true;
      dga u = dga.a;
      boolean v;
      dey.e<bim<?>> w = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ha.b) && $$0.h() < 14;
      dey.f x = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dey.f y = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dey.f z = this.y;
      dey.f A = ($$0, $$1, $$2) -> false;
      dey.f B = ($$0, $$1, $$2) -> false;
      boolean C;
      cdu D = cdw.f;
      Optional<dey.b> E = Optional.empty();

      private d() {
      }

      public static dey.d a() {
         return new dey.d();
      }

      public static dey.d a(dey $$0) {
         dey.d $$1 = new dey.d();
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

      public dey.d a(chl $$0) {
         this.a = $$1 -> $$0.e();
         return this;
      }

      public dey.d a(eag $$0) {
         this.a = $$1 -> $$0;
         return this;
      }

      public dey.d a(Function<dez, eag> $$0) {
         this.a = $$0;
         return this;
      }

      public dey.d b() {
         this.b = false;
         this.m = false;
         return this;
      }

      public dey.d c() {
         this.m = false;
         return this;
      }

      public dey.d a(float $$0) {
         this.i = $$0;
         return this;
      }

      public dey.d b(float $$0) {
         this.j = $$0;
         return this;
      }

      public dey.d c(float $$0) {
         this.k = $$0;
         return this;
      }

      public dey.d a(czy $$0) {
         this.c = $$0;
         return this;
      }

      public dey.d a(ToIntFunction<dez> $$0) {
         this.d = $$0;
         return this;
      }

      public dey.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dey.d d() {
         return this.d(0.0F);
      }

      public dey.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dey.d e() {
         this.h = true;
         return this;
      }

      public dey.d f() {
         this.C = true;
         return this;
      }

      public dey.d g() {
         this.l = ece.a;
         return this;
      }

      public dey.d a(csl $$0) {
         this.l = $$0.r();
         return this;
      }

      public dey.d h() {
         this.o = true;
         return this;
      }

      public dey.d i() {
         this.p = true;
         return this;
      }

      public dey.d j() {
         this.r = true;
         return this;
      }

      @Deprecated
      public dey.d k() {
         this.q = true;
         return this;
      }

      public dey.d a(eah $$0) {
         this.s = $$0;
         return this;
      }

      public dey.d l() {
         this.n = true;
         return this;
      }

      public dey.d a(dey.e<bim<?>> $$0) {
         this.w = $$0;
         return this;
      }

      public dey.d a(dey.f $$0) {
         this.x = $$0;
         return this;
      }

      public dey.d b(dey.f $$0) {
         this.y = $$0;
         return this;
      }

      public dey.d c(dey.f $$0) {
         this.z = $$0;
         return this;
      }

      public dey.d d(dey.f $$0) {
         this.A = $$0;
         return this;
      }

      public dey.d e(dey.f $$0) {
         this.B = $$0;
         return this;
      }

      public dey.d m() {
         this.g = true;
         return this;
      }

      public dey.d e(float $$0) {
         this.f = $$0;
         return this;
      }

      public dey.d f(float $$0) {
         this.e = Math.max(0.0F, $$0);
         return this;
      }

      public dey.d a(dey.c $$0) {
         switch ($$0) {
            case c:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csl $$3 = $$0x.b();
                  long $$4 = arp.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.am_();
                  float $$6 = $$3.ak_();
                  double $$7 = arp.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = arp.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ehd($$7, $$5, $$8);
               });
               break;
            case b:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csl $$3 = $$0x.b();
                  long $$4 = arp.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ak_();
                  double $$6 = arp.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = arp.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ehd($$6, 0.0, $$7);
               });
               break;
            default:
               this.E = Optional.empty();
         }

         return this;
      }

      public dey.d n() {
         this.t = false;
         return this;
      }

      public dey.d a(cds... $$0) {
         this.D = cdw.d.a($$0);
         return this;
      }

      public dey.d a(dga $$0) {
         this.u = $$0;
         return this;
      }

      public dey.d o() {
         this.v = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dez var1, cor var2, gu var3, A var4);
   }

   public interface f {
      boolean test(dez var1, cor var2, gu var3);
   }
}
