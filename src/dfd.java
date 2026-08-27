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

public abstract class dfd implements cdu {
   protected static final hc[] aD = new hc[]{hc.e, hc.f, hc.c, hc.d, hc.a, hc.b};
   protected final boolean aE;
   protected final float aF;
   protected final boolean aG;
   protected final dad aH;
   protected final float aI;
   protected final float aJ;
   protected final float aK;
   protected final boolean aL;
   protected final cdx aM;
   protected final dfd.d aN;
   @Nullable
   protected aeu aO;

   public dfd(dfd.d $$0) {
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
   public void a(dfe $$0, cpr $$1, gw $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      switch ($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(apt.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfe $$0, dfe $$1, hc $$2) {
      return false;
   }

   @Deprecated
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      aay.a($$1, $$2);
   }

   @Deprecated
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if ($$0.t() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }
   }

   @Deprecated
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      return bgt.d;
   }

   @Deprecated
   public boolean a(dfe $$0, cpq $$1, gw $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Deprecated
   public boolean g_(dfe $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(dfe $$0) {
      return false;
   }

   @Deprecated
   public eah c_(dfe $$0) {
      return eai.a.g();
   }

   @Deprecated
   public boolean d_(dfe $$0) {
      return false;
   }

   public float ak_() {
      return 0.25F;
   }

   public float am_() {
      return 0.2F;
   }

   @Override
   public cdx m() {
      return this.aM;
   }

   @Deprecated
   public dfe a(dfe $$0, czc $$1) {
      return $$0;
   }

   @Deprecated
   public dfe a(dfe $$0, cxl $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(dfe $$0, cli $$1) {
      return $$0.r() && ($$1.n().b() || !$$1.n().a(this.k()));
   }

   @Deprecated
   public boolean a(dfe $$0, eag $$1) {
      return $$0.r() || !$$0.e();
   }

   @Deprecated
   public List<cja> a(dfe $$0, ecr.a $$1) {
      aeu $$2 = this.r();
      if ($$2 == ecj.a) {
         return Collections.emptyList();
      } else {
         ecr $$3 = $$1.a(eew.g, $$0).a(eev.o);
         akn $$4 = $$3.a();
         ect $$5 = $$4.n().aH().getLootTable($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(dfe $$0, gw $$1) {
      return ars.a($$1);
   }

   @Deprecated
   public eib f(dfe $$0, cow $$1, gw $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public eib b_(dfe $$0, cow $$1, gw $$2) {
      return this.c($$0, $$1, $$2, ehn.a());
   }

   @Deprecated
   public eib a(dfe $$0, cow $$1, gw $$2) {
      return ehy.a();
   }

   @Deprecated
   public int g(dfe $$0, cow $$1, gw $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.M();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      return null;
   }

   @Deprecated
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return true;
   }

   @Deprecated
   public float b(dfe $$0, cow $$1, gw $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return 0;
   }

   @Deprecated
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return ehy.b();
   }

   @Deprecated
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.aE ? $$0.j($$1, $$2) : ehy.a();
   }

   @Deprecated
   public boolean a_(dfe $$0, cow $$1, gw $$2) {
      return csq.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(dfe $$0, cow $$1, gw $$2) {
      return csq.a($$0.c($$1, $$2));
   }

   @Deprecated
   public eib b(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
   }

   @Deprecated
   public float a(dfe $$0, cbp $$1, cow $$2, gw $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.e($$0) ? 30 : 100;
         return $$1.d($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(dfe $$0, akn $$1, gw $$2, cja $$3, boolean $$4) {
   }

   @Deprecated
   public void a(dfe $$0, cpq $$1, gw $$2, cbp $$3) {
   }

   @Deprecated
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return 0;
   }

   @Deprecated
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
   }

   @Deprecated
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return 0;
   }

   public final aeu r() {
      if (this.aO == null) {
         aeu $$0 = jd.f.b(this.p());
         this.aO = $$0.d("blocks/");
      }

      return this.aO;
   }

   @Deprecated
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
   }

   public abstract civ k();

   protected abstract csq p();

   public eal s() {
      return this.aN.a.apply(this.p().n());
   }

   public float t() {
      return this.aN.f;
   }

   public abstract static class a extends dfg<csq, dfe> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final boolean i;
      @Deprecated
      private final boolean j;
      @Deprecated
      private boolean k;
      private final eam l;
      private final eal m;
      private final float n;
      private final boolean o;
      private final boolean p;
      private final dfd.f q;
      private final dfd.f r;
      private final dfd.f s;
      private final dfd.f t;
      private final dfd.f u;
      private final Optional<dfd.b> v;
      private final boolean w;
      private final dgf x;
      private final boolean y;
      @Nullable
      protected dfd.a.a a;
      private eah z = eai.a.g();
      private boolean A;

      protected a(csq $$0, ImmutableMap<dgh<?>, Comparable<?>> $$1, MapCodec<dfe> $$2) {
         super($$0, $$1, $$2);
         dfd.d $$3 = $$0.aN;
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
            eib $$0 = this.a.b;
            if ($$0.c()) {
               return false;
            } else {
               ehd $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.z = this.e.c_(this.x());
         this.A = this.e.e_(this.x());
         if (!this.b().o()) {
            this.a = new dfd.a.a(this.x());
         }

         this.k = this.D();
      }

      public csq b() {
         return this.e;
      }

      public hg<csq> c() {
         return this.e.q();
      }

      @Deprecated
      public boolean d() {
         csq $$0 = this.b();
         return $$0 != csr.bs && $$0 != csr.mY && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.k;
      }

      public boolean a(cow $$0, gw $$1, bip<?> $$2) {
         return this.b().aN.w.test(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cow $$0, gw $$1) {
         return this.a != null ? this.a.g : this.b().c(this.x(), $$0, $$1);
      }

      public int b(cow $$0, gw $$1) {
         return this.a != null ? this.a.h : this.b().g(this.x(), $$0, $$1);
      }

      public eib a(cow $$0, gw $$1, hc $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : ehy.a(this.c($$0, $$1), $$2);
      }

      public eib c(cow $$0, gw $$1) {
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

      public eal d(cow $$0, gw $$1) {
         return this.m;
      }

      public dfe a(czc $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dfe a(cxl $$0) {
         return this.b().a(this.x(), $$0);
      }

      public cyv l() {
         return this.b().b_(this.x());
      }

      public boolean e(cow $$0, gw $$1) {
         return this.u.test(this.x(), $$0, $$1);
      }

      public float f(cow $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean g(cow $$0, gw $$1) {
         return this.q.test(this.x(), $$0, $$1);
      }

      public boolean m() {
         return this.b().f_(this.x());
      }

      public int b(cow $$0, gw $$1, hc $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean n() {
         return this.b().d_(this.x());
      }

      public int a(cpq $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public float h(cow $$0, gw $$1) {
         return this.n;
      }

      public float a(cbp $$0, cow $$1, gw $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public int c(cow $$0, gw $$1, hc $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eam o() {
         return this.l;
      }

      public boolean i(cow $$0, gw $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            dfe $$2 = this.x();
            return $$2.p() ? csq.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean p() {
         return this.p;
      }

      public boolean a(dfe $$0, hc $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public eib j(cow $$0, gw $$1) {
         return this.a($$0, $$1, ehn.a());
      }

      public eib a(cow $$0, gw $$1, ehn $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public eib k(cow $$0, gw $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, ehn.a());
      }

      public eib b(cow $$0, gw $$1, ehn $$2) {
         return this.b().c(this.x(), $$0, $$1, $$2);
      }

      public eib l(cow $$0, gw $$1) {
         return this.b().b_(this.x(), $$0, $$1);
      }

      public eib c(cow $$0, gw $$1, ehn $$2) {
         return this.b().b(this.x(), $$0, $$1, $$2);
      }

      public eib m(cow $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public final boolean a(cow $$0, gw $$1, bil $$2) {
         return this.a($$0, $$1, $$2, hc.b);
      }

      public final boolean a(cow $$0, gw $$1, bil $$2, hc $$3) {
         return csq.a(this.b($$0, $$1, ehn.a($$2)), $$3);
      }

      public ehi n(cow $$0, gw $$1) {
         return this.v.<ehi>map($$2 -> $$2.evaluate(this.x(), $$0, $$1)).orElse(ehi.b);
      }

      public boolean q() {
         return this.v.isPresent();
      }

      public boolean a(cpq $$0, gw $$1, int $$2, int $$3) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cpq $$0, gw $$1, csq $$2, gw $$3, boolean $$4) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cpr $$0, gw $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cpr $$0, gw $$1, int $$2, int $$3) {
         gw.a $$4 = new gw.a();

         for (hc $$5 : dfd.aD) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.x(), $$4, $$1, $$2, $$3);
         }
      }

      public final void b(cpr $$0, gw $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cpr $$0, gw $$1, int $$2, int $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(cpq $$0, gw $$1, dfe $$2, boolean $$3) {
         this.b().b(this.x(), $$0, $$1, $$2, $$3);
      }

      public void b(cpq $$0, gw $$1, dfe $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public void a(akn $$0, gw $$1, arx $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void b(akn $$0, gw $$1, arx $$2) {
         this.b().b(this.x(), $$0, $$1, $$2);
      }

      public void a(cpq $$0, gw $$1, bil $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public void a(akn $$0, gw $$1, cja $$2, boolean $$3) {
         this.b().a(this.x(), $$0, $$1, $$2, $$3);
      }

      public List<cja> a(ecr.a $$0) {
         return this.b().a(this.x(), $$0);
      }

      public bgt a(cpq $$0, cbp $$1, bgs $$2, ehe $$3) {
         return this.b().a(this.x(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cpq $$0, gw $$1, cbp $$2) {
         this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean o(cow $$0, gw $$1) {
         return this.r.test(this.x(), $$0, $$1);
      }

      public boolean p(cow $$0, gw $$1) {
         return this.s.test(this.x(), $$0, $$1);
      }

      public dfe a(hc $$0, dfe $$1, cpr $$2, gw $$3, gw $$4) {
         return this.b().a(this.x(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cow $$0, gw $$1, eax $$2) {
         return this.b().a(this.x(), $$0, $$1, $$2);
      }

      public boolean a(cli $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean a(eag $$0) {
         return this.b().a(this.x(), $$0);
      }

      public boolean r() {
         return this.y;
      }

      public boolean a(cpt $$0, gw $$1) {
         return this.b().a(this.x(), $$0, $$1);
      }

      public boolean q(cow $$0, gw $$1) {
         return this.t.test(this.x(), $$0, $$1);
      }

      @Nullable
      public bgw b(cpq $$0, gw $$1) {
         return this.b().b(this.x(), $$0, $$1);
      }

      public boolean a(aqd<csq> $$0) {
         return this.b().q().a($$0);
      }

      public boolean a(aqd<csq> $$0, Predicate<dfd.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(hk<csq> $$0) {
         return $$0.a(this.b().q());
      }

      public boolean a(hg<csq> $$0) {
         return this.a($$0.a());
      }

      public Stream<aqd<csq>> s() {
         return this.b().q().c();
      }

      public boolean t() {
         return this.b() instanceof cve;
      }

      @Nullable
      public <T extends dcq> dcr<T> a(cpq $$0, dcs<T> $$1) {
         return this.b() instanceof cve ? ((cve)this.b()).a($$0, this.x(), $$1) : null;
      }

      public boolean a(csq $$0) {
         return this.b() == $$0;
      }

      public eah u() {
         return this.z;
      }

      public boolean v() {
         return this.A;
      }

      public long a(gw $$0) {
         return this.b().a(this.x(), $$0);
      }

      public dad w() {
         return this.b().m(this.x());
      }

      public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cow $$0, gw $$1, hc $$2) {
         return this.a($$0, $$1, $$2, das.a);
      }

      public boolean a(cow $$0, gw $$1, hc $$2, das $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.x(), $$0, $$1, $$2);
      }

      public boolean r(cow $$0, gw $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.x(), $$0, $$1);
      }

      protected abstract dfe x();

      public boolean y() {
         return this.o;
      }

      public boolean z() {
         return this.w;
      }

      public dgf A() {
         return this.x;
      }

      static final class a {
         private static final hc[] e = hc.values();
         private static final int f = das.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final eib[] i;
         protected final eib b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(dfe $$0) {
            csq $$1 = $$0.b();
            this.a = $$0.i(cpf.a, gw.b);
            this.g = $$1.c($$0, cpf.a, gw.b);
            this.h = $$1.g($$0, cpf.a, gw.b);
            if (!$$0.p()) {
               this.i = null;
            } else {
               this.i = new eib[e.length];
               eib $$2 = $$1.f($$0, cpf.a, gw.b);

               for (hc $$3 : e) {
                  this.i[$$3.ordinal()] = ehy.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cpf.a, gw.b, ehn.a());
            if (!this.b.c() && $$0.q()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", jd.f.b($$1))
               );
            } else {
               this.c = Arrays.stream(hc.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for (hc $$4 : e) {
                  for (das $$5 : das.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cpf.a, gw.b, $$4);
                  }
               }

               this.d = csq.a($$0.k(cpf.a, gw.b));
            }
         }

         public boolean a(hc $$0, das $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(hc $$0, das $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public interface b {
      ehi evaluate(dfe var1, cow var2, gw var3);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      Function<dfe, eal> a = $$0 -> eal.a;
      boolean b = true;
      dad c = dad.f;
      ToIntFunction<dfe> d = $$0 -> 0;
      float e;
      float f;
      boolean g;
      boolean h;
      float i = 0.6F;
      float j = 1.0F;
      float k = 1.0F;
      aeu l;
      boolean m = true;
      boolean n;
      boolean o;
      @Deprecated
      boolean p;
      @Deprecated
      boolean q;
      boolean r;
      eam s = eam.a;
      boolean t = true;
      dgf u = dgf.a;
      boolean v;
      dfd.e<bip<?>> w = ($$0, $$1, $$2, $$3) -> $$0.d($$1, $$2, hc.b) && $$0.h() < 14;
      dfd.f x = ($$0, $$1, $$2) -> $$0.r($$1, $$2);
      dfd.f y = ($$0, $$1, $$2) -> $$0.d() && $$0.r($$1, $$2);
      dfd.f z = this.y;
      dfd.f A = ($$0, $$1, $$2) -> false;
      dfd.f B = ($$0, $$1, $$2) -> false;
      boolean C;
      cdx D = cdz.f;
      Optional<dfd.b> E = Optional.empty();

      private d() {
      }

      public static dfd.d a() {
         return new dfd.d();
      }

      public static dfd.d a(dfd $$0) {
         dfd.d $$1 = new dfd.d();
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

      public dfd.d a(cho $$0) {
         this.a = $$1 -> $$0.e();
         return this;
      }

      public dfd.d a(eal $$0) {
         this.a = $$1 -> $$0;
         return this;
      }

      public dfd.d a(Function<dfe, eal> $$0) {
         this.a = $$0;
         return this;
      }

      public dfd.d b() {
         this.b = false;
         this.m = false;
         return this;
      }

      public dfd.d c() {
         this.m = false;
         return this;
      }

      public dfd.d a(float $$0) {
         this.i = $$0;
         return this;
      }

      public dfd.d b(float $$0) {
         this.j = $$0;
         return this;
      }

      public dfd.d c(float $$0) {
         this.k = $$0;
         return this;
      }

      public dfd.d a(dad $$0) {
         this.c = $$0;
         return this;
      }

      public dfd.d a(ToIntFunction<dfe> $$0) {
         this.d = $$0;
         return this;
      }

      public dfd.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public dfd.d d() {
         return this.d(0.0F);
      }

      public dfd.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public dfd.d e() {
         this.h = true;
         return this;
      }

      public dfd.d f() {
         this.C = true;
         return this;
      }

      public dfd.d g() {
         this.l = ecj.a;
         return this;
      }

      public dfd.d a(csq $$0) {
         this.l = $$0.r();
         return this;
      }

      public dfd.d h() {
         this.o = true;
         return this;
      }

      public dfd.d i() {
         this.p = true;
         return this;
      }

      public dfd.d j() {
         this.r = true;
         return this;
      }

      @Deprecated
      public dfd.d k() {
         this.q = true;
         return this;
      }

      public dfd.d a(eam $$0) {
         this.s = $$0;
         return this;
      }

      public dfd.d l() {
         this.n = true;
         return this;
      }

      public dfd.d a(dfd.e<bip<?>> $$0) {
         this.w = $$0;
         return this;
      }

      public dfd.d a(dfd.f $$0) {
         this.x = $$0;
         return this;
      }

      public dfd.d b(dfd.f $$0) {
         this.y = $$0;
         return this;
      }

      public dfd.d c(dfd.f $$0) {
         this.z = $$0;
         return this;
      }

      public dfd.d d(dfd.f $$0) {
         this.A = $$0;
         return this;
      }

      public dfd.d e(dfd.f $$0) {
         this.B = $$0;
         return this;
      }

      public dfd.d m() {
         this.g = true;
         return this;
      }

      public dfd.d e(float $$0) {
         this.f = $$0;
         return this;
      }

      public dfd.d f(float $$0) {
         this.e = Math.max(0.0F, $$0);
         return this;
      }

      public dfd.d a(dfd.c $$0) {
         switch ($$0) {
            case c:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csq $$3 = $$0x.b();
                  long $$4 = ars.b($$2.u(), 0, $$2.w());
                  double $$5 = ((double)((float)($$4 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$3.am_();
                  float $$6 = $$3.ak_();
                  double $$7 = ars.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  double $$8 = ars.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$6), (double)$$6);
                  return new ehi($$7, $$5, $$8);
               });
               break;
            case b:
               this.E = Optional.of(($$0x, $$1, $$2) -> {
                  csq $$3 = $$0x.b();
                  long $$4 = ars.b($$2.u(), 0, $$2.w());
                  float $$5 = $$3.ak_();
                  double $$6 = ars.a(((double)((float)($$4 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  double $$7 = ars.a(((double)((float)($$4 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                  return new ehi($$6, 0.0, $$7);
               });
               break;
            default:
               this.E = Optional.empty();
         }

         return this;
      }

      public dfd.d n() {
         this.t = false;
         return this;
      }

      public dfd.d a(cdv... $$0) {
         this.D = cdz.d.a($$0);
         return this;
      }

      public dfd.d a(dgf $$0) {
         this.u = $$0;
         return this;
      }

      public dfd.d o() {
         this.v = true;
         return this;
      }
   }

   public interface e<A> {
      boolean test(dfe var1, cow var2, gw var3, A var4);
   }

   public interface f {
      boolean test(dfe var1, cow var2, gw var3);
   }
}
