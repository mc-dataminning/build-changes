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

public abstract class dez implements cds {
   protected static final ha[] aD = new ha[]{ha.e, ha.f, ha.c, ha.d, ha.a, ha.b};
   protected final boolean aE;
   protected final float aF;
   protected final boolean aG;
   protected final czz aH;
   protected final float aI;
   protected final float aJ;
   protected final float aK;
   protected final boolean aL;
   protected final cdv aM;
   protected final dez.d aN;
   @Nullable
   protected aer aO;

   public dez(dez.d $$0) {
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
   public void a(dfa $$0, cpn $$1, gu $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
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
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfa $$0, dfa $$1, ha $$2) {
      return false;
   }

   @Deprecated
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      aav.a($$1, $$2);
   }

   @Deprecated
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      return bgq.d;
   }

   @Deprecated
   public boolean a(dfa $$0, cpm $$1, gu $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Deprecated
   public boolean g_(dfa $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dfa $$0) {
      return false;
   }

   @Deprecated
   public ead c_(dfa $$0) {
      return eae.a.g();
   }

   @Deprecated
   public boolean d_(dfa $$0) {
      return false;
   }

   public float al_() {
      return 0.25F;
   }

   public float an_() {
      return 0.2F;
   }

   @Override
   public cdv m() {
      return this.aM;
   }

   @Deprecated
   public dfa a(dfa $$0, cyy $$1) {
      return $$0;
   }

   @Deprecated
   public dfa a(dfa $$0, cxh $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfa $$0, clg $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dfa $$0, eac $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<ciy> a(dfa $$0, ecn.a $$1) {
      aer $$2 = this.r();
      if ($$2 == ecf.a) {
         return Collections.emptyList();
      } else {
         ecn $$3 = $$1.a(ees.g, $$0).a(eer.o);
         akk $$4 = $$3.a();
         ecp $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dfa $$0, gu $$1) {
      return arp.a($$1);
   }

   @Deprecated
   public ehx f(dfa $$0, cos $$1, gu $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      return this.c($$0, $$1, $$2, ehj.a());
   }

   @Deprecated
   public ehx a(dfa $$0, cos $$1, gu $$2) {
      return ehu.a();
   }

   @Deprecated
   public int g(dfa $$0, cos $$1, gu $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return true;
   }

   @Deprecated
   public float b(dfa $$0, cos $$1, gu $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return 0;
   }

   @Deprecated
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ehu.b();
   }

   @Deprecated
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.aE ? $$0.j($$1, $$2) : ehu.a();
   }

   @Deprecated
   public boolean a_(dfa $$0, cos $$1, gu $$2) {
      return csm.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dfa $$0, cos $$1, gu $$2) {
      return csm.a($$0.c($$1, $$2));
   }

   @Deprecated
   public ehx b(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
   }

   @Deprecated
   public float a(dfa $$0, cbn $$1, cos $$2, gu $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dfa $$0, akk $$1, gu $$2, ciy $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfa $$0, cpm $$1, gu $$2, cbn $$3) {
   }

   @Deprecated
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return 0;
   }

   @Deprecated
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
   }

   @Deprecated
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
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
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
   }

   public abstract cit k();

   protected abstract csm p();

   public eah s() {
      return this.aN.a.apply(this.p().n());
   }

   public float t() {
      return this.aN.f;
   }

   public abstract static class a extends dfc<csm, dfa> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eai l;
      private final eah m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dez.f q;
      private final dez.f r;
      private final dez.f s;
      private final dez.f t;
      private final dez.f u;
      private final Optional<dez.b> v;
      private final boolean w;
      private final dgb x;
      private final boolean y;
      @Nullable
      protected dez.a.a a;
      private ead z = eae.a.g();
      private boolean A;

      protected a(csm $$0, ImmutableMap<dgd<?>, Comparable<?>> $$1, MapCodec<dfa> $$2) {
         super($$0, $$1, $$2);
         dez.d $$3 = $$0.aN;
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
            ehx $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               egz $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dez.a.a(this.x());
         }

         this.k = this.D();
      }

      public csm b() {
         return this.e;
      }

      public he<csm> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         csm $$0 = this.b();
         return $$0 != csn.bs && $$0 != csn.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cos $$0, gu $$1, bim<?> $$2) {
         return this.b().aN.w.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cos $$0, gu $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cos $$0, gu $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public ehx a(cos $$0, gu $$1, ha $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ehu.a(this.c($$0, $$1), $$2);
      }

      public ehx c(cos $$0, gu $$1) {
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

      public eah d(cos $$0, gu $$1) {
         return this.m;
      }

      public dfa a(cyy $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dfa a(cxh $$0) {
         return this.b().a(this.x(), $$0);
      }

      public cyr l() {
         return this.b().b_(this.x());
      }

      public boolean e(cos $$0, gu $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cos $$0, gu $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cos $$0, gu $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cos $$0, gu $$1, ha $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cpm $$0, gu $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cos $$0, gu $$1) {
         return this.n;
      }

      public float a(cbn $$0, cos $$1, gu $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cos $$0, gu $$1, ha $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eai o() {
         return this.l;
      }

      public boolean i(cos $$0, gu $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dfa $$2 = this.x();
            return $$2.p() ? csm.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dfa $$0, ha $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public ehx j(cos $$0, gu $$1) {
         return this.a($$0, $$1, ehj.a());
      }

      public ehx a(cos $$0, gu $$1, ehj $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public ehx k(cos $$0, gu $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ehj.a());
      }

      public ehx b(cos $$0, gu $$1, ehj $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public ehx l(cos $$0, gu $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public ehx c(cos $$0, gu $$1, ehj $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public ehx m(cos $$0, gu $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cos $$0, gu $$1, bii $$2) {
         return this.a($$0, $$1, $$2, ha.b);
      }

      public final boolean a(cos $$0, gu $$1, bii $$2, ha $$3) {
         return csm.a(this.b($$0, $$1, ehj.a($$2)), $$3);
      }

      public ehe n(cos $$0, gu $$1) {
         return this.v.<ehe>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ehe.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cpm $$0, gu $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cpm $$0, gu $$1, csm $$2, gu $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cpn $$0, gu $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cpn $$0, gu $$1, int $$2, int $$3) {
         gu.a $$4 = new gu.a();

         for (ha $$5 : dez.aD) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cpn $$0, gu $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cpn $$0, gu $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cpm $$0, gu $$1, dfa $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cpm $$0, gu $$1, dfa $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(akk $$0, gu $$1, aru $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(akk $$0, gu $$1, aru $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cpm $$0, gu $$1, bii $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(akk $$0, gu $$1, ciy $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<ciy> a(ecn.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bgq a(cpm $$0, cbn $$1, bgp $$2, eha $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cpm $$0, gu $$1, cbn $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cos $$0, gu $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cos $$0, gu $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dfa a(ha $$0, dfa $$1, cpn $$2, gu $$3, gu $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cos $$0, gu $$1, eat $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(clg $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eac $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cpp $$0, gu $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cos $$0, gu $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bgt b(cpm $$0, gu $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aqa<csm> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(aqa<csm> $$0, Predicate<dez.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(hi<csm> $$0) {
         return $$0.a(this.b().q());
      }

      public boolean a(he<csm> $$0) {
         return this.a($$0.a());
      }

      public Stream<aqa<csm>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof cva;
      }

      @Nullable
      public <T extends dcm> dcn<T> a(cpm $$0, dco<T> $$1) {
         return this.b() instanceof cva ? ((cva)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(csm $$0) {
         return this.b() == $$0;
      }

      public ead u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(gu $$0) {
         return this.b().a(this.x(), $$0);
      }

      public czz w() {
         return this.b().m(this.x());
      }

      public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cos $$0, gu $$1, ha $$2) {
         return this.a($$0, $$1, $$2, dao.a);
      }

      public boolean a(cos $$0, gu $$1, ha $$2, dao $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cos $$0, gu $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dfa x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dgb A() {
         return this.x;
      }

      static final class a {
         private static final ha[] e = ha.values();
         private static final int f = dao.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final ehx[] i;
         protected final ehx b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dfa $$0) {
            csm $$1 = $$0.b();
            this.a = $$0.i(cpb.a, gu.b);
            this.g = $$1.c($$0, cpb.a, gu.b);
            this.h = $$1.g($$0, cpb.a, gu.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new ehx[e.length];
               ehx $$2 = $$1.f($$0, cpb.a, gu.b);

               for (ha $$3 : e) {
                  this.i[$$3.ordinal()] = ehu.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cpb.a, gu.b, ehj.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jb.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(ha.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (ha $$4 : e) {
                  for (dao $$5 : dao.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cpb.a, gu.b, $$4);
                  }
               }

               this.d = csm.a($$0.k(cpb.a, gu.b));
            }
         }

         public boolean a(ha $$0, dao $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(ha $$0, dao $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ehe evaluate(dfa var1, cos var2, gu var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      Function<dfa, eah> a = $$0 -> eah.a;
      boolean b = true;
      czz c = czz.f;
      ToIntFunction<dfa> d = $$0 -> 0;
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
      eai s = eai.a;
      boolean t = true;
      dgb u = dgb.a;
      boolean v;
      dez.e<bim<?>> w = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, ha.b) && $$0.h() < 14;
      dez.f x = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dez.f y = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dez.f z = this.y;
      dez.f A = ($$0, $$1, $$2) -> false;
      dez.f B = ($$0, $$1, $$2) -> false;
      boolean C;
      cdv D = cdx.f;
      Optional<dez.b> E = Optional.empty();

      private d() {
      }

      public static dez.d a() {
         return new dez.d();
      }

      public static dez.d a(dez $$0) {
         dez.d $$1 = new dez.d();
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

      public dez.d a(chm $$0) {
         this.a = $$1 -> $$0.e();
         return this;
      }

      public dez.d a(eah $$0) {
         this.a = $$1 -> $$0;
         return this;
      }

      public dez.d a(Function<dfa, eah> $$0) {
         this.a = $$0;
         return this;
      }

      public dez.d b() {
         this.b = false;
         this.m = false;
         return this;
      }

      public dez.d c() {
         this.m = false;
         return this;
      }

      public dez.d a(float $$0) {
         this.i = $$0;
         return this;
      }

      public dez.d b(float $$0) {
         this.j = $$0;
         return this;
      }

      public dez.d c(float $$0) {
         this.k = $$0;
         return this;
      }

      public dez.d a(czz $$0) {
         this.c = $$0;
         return this;
      }

      public dez.d a(ToIntFunction<dfa> $$0) {
         this.d = $$0;
         return this;
      }

      public dez.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dez.d d() {
         return this.d(0.0F);
      }

      public dez.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dez.d e() {
         this.h = true;
         return this;
      }

      public dez.d f() {
         this.C = true;
         return this;
      }

      public dez.d g() {
         this.l = ecf.a;
         return this;
      }

      public dez.d a(csm $$0) {
         this.l = $$0.r();
         return this;
      }

      public dez.d h() {
         this.o = true;
         return this;
      }

      public dez.d i() {
         this.p = true;
         return this;
      }

      public dez.d j() {
         this.r = true;
         return this;
      }

      @Deprecated
      public dez.d k() {
         this.q = true;
         return this;
      }

      public dez.d a(eai $$0) {
         this.s = $$0;
         return this;
      }

      public dez.d l() {
         this.n = true;
         return this;
      }

      public dez.d a(dez.e<bim<?>> $$0) {
         this.w = $$0;
         return this;
      }

      public dez.d a(dez.f $$0) {
         this.x = $$0;
         return this;
      }

      public dez.d b(dez.f $$0) {
         this.y = $$0;
         return this;
      }

      public dez.d c(dez.f $$0) {
         this.z = $$0;
         return this;
      }

      public dez.d d(dez.f $$0) {
         this.A = $$0;
         return this;
      }

      public dez.d e(dez.f $$0) {
         this.B = $$0;
         return this;
      }

      public dez.d m() {
         this.g = true;
         return this;
      }

      public dez.d e(float $$0) {
         this.f = $$0;
         return this;
      }

      public dez.d f(float $$0) {
         this.e = Math.max(0.0F, $$0);
         return this;
      }

      public dez.d a(dez.c $$0) {
         switch ($$0) {
            case c:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csm $$3 = $$0x.b();
                  long $$4 = arp.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.an_();
                  float $$6 = $$3.al_();
                  double $$7 = arp.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = arp.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ehe($$7, $$5, $$8);
               });
               break;
            case b:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csm $$3 = $$0x.b();
                  long $$4 = arp.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.al_();
                  double $$6 = arp.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = arp.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ehe($$6, 0.0, $$7);
               });
               break;
            default:
               this.E = Optional.empty();
         }

         return this;
      }

      public dez.d n() {
         this.t = false;
         return this;
      }

      public dez.d a(cdt... $$0) {
         this.D = cdx.d.a($$0);
         return this;
      }

      public dez.d a(dgb $$0) {
         this.u = $$0;
         return this;
      }

      public dez.d o() {
         this.v = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dfa var1, cos var2, gu var3, A var4);
   }

   public interface f {
      boolean test(dfa var1, cos var2, gu var3);
   }
}
