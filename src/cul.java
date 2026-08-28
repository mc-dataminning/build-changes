import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cul implements cpi, dcv {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dfy, cul> d = Maps.newHashMap();
   public static final akr e = akr.b("base_attack_damage");
   public static final akr f = akr.b("base_attack_speed");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final jm.c<cul> b = lt.g.f(this);
   private final km c;
   @Nullable
   private final cul j;
   @Nullable
   private String k;
   private final cpl l;

   public static int a(cul $$0) {
      return $$0 == null ? 0 : lt.g.a($$0);
   }

   public static cul b(int $$0) {
      return lt.g.a($$0);
   }

   @Deprecated
   public static cul a(dfy $$0) {
      return d.getOrDefault($$0, cut.a);
   }

   public cul(cul.a $$0) {
      this.c = $$0.b();
      this.j = $$0.c;
      this.l = $$0.d;
      if (ab.aV) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jm.c<cul> o() {
      return this.b;
   }

   public km p() {
      return this.c;
   }

   public int q() {
      return this.c.a(kq.c, 1);
   }

   public void a(dcw $$0, btn $$1, cuq $$2, int $$3) {
   }

   public void a(cjh $$0) {
   }

   public void m(cuq $$0) {
   }

   public boolean a(dtc $$0, dcw $$1, jd $$2, cmx $$3) {
      return true;
   }

   @Override
   public cul r() {
      return this;
   }

   public bqr a(cyf $$0) {
      return bqr.e;
   }

   public float a(cuq $$0, dtc $$1) {
      cxx $$2 = $$0.a(kq.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      cpr $$4 = $$3.a(kq.v);
      if ($$4 != null) {
         if ($$1.u($$4.d())) {
            $$1.c($$2);
            return bqs.b($$3);
         } else {
            return bqs.d($$3);
         }
      } else {
         return bqs.c($$1.b($$2));
      }
   }

   public cuq a(cuq $$0, dcw $$1, btn $$2) {
      cpr $$3 = $$0.a(kq.v);
      return $$3 != null ? $$2.a($$1, $$0, $$3) : $$0;
   }

   public boolean d(cuq $$0) {
      return $$0.m();
   }

   public int e(cuq $$0) {
      return ayo.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int f(cuq $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayo.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cuq $$0, crq $$1, cqd $$2, cmx $$3) {
      return false;
   }

   public boolean a(cuq $$0, cuq $$1, crq $$2, cqd $$3, cmx $$4, bug $$5) {
      return false;
   }

   public float a(bsr $$0, float $$1, brk $$2) {
      return 0.0F;
   }

   public boolean a(cuq $$0, btn $$1, btn $$2) {
      return false;
   }

   public void b(cuq $$0, btn $$1, btn $$2) {
   }

   public boolean a(cuq $$0, dcw $$1, dtc $$2, jd $$3, btn $$4) {
      cxx $$5 = $$0.a(kq.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsy.a);
         }

         return true;
      }
   }

   public boolean b(cuq $$0, dtc $$1) {
      cxx $$2 = $$0.a(kq.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqr a(cuq $$0, cmx $$1, btn $$2, bqq $$3) {
      return bqr.e;
   }

   public wz s() {
      return wz.c(this.a());
   }

   @Override
   public String toString() {
      return lt.g.e(this).g();
   }

   protected String t() {
      if (this.k == null) {
         this.k = ad.a("item", lt.g.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.t();
   }

   public String h(cuq $$0) {
      return this.a();
   }

   @Nullable
   public final cul u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cuq $$0, dcw $$1, bsr $$2, int $$3, boolean $$4) {
   }

   public void b(cuq $$0, dcw $$1, cmx $$2) {
      this.a($$0, $$1);
   }

   public void a(cuq $$0, dcw $$1) {
   }

   public boolean ao_() {
      return false;
   }

   public cwo b(cuq $$0) {
      return $$0.b(kq.v) ? cwo.b : cwo.a;
   }

   public int a(cuq $$0, btn $$1) {
      cpr $$2 = $$0.a(kq.v);
      return $$2 != null ? $$2.a() : 0;
   }

   public void a(cuq $$0, dcw $$1, btn $$2, int $$3) {
   }

   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
   }

   public Optional<csa> g(cuq $$0) {
      return Optional.empty();
   }

   public wz n(cuq $$0) {
      return wz.c(this.h($$0));
   }

   public boolean d_(cuq $$0) {
      return $$0.A();
   }

   public boolean a(cuq $$0) {
      return $$0.j() == 1 && $$0.b(kq.d);
   }

   protected static ewy a(dcw $$0, cmx $$1, dcf.b $$2) {
      exc $$3 = $$1.by();
      exc $$4 = $$3.e($$1.c($$1.dG(), $$1.dE()).a($$1.gy()));
      return $$0.a(new dcf($$3, $$4, dcf.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cuq $$0, cuq $$1) {
      return false;
   }

   @Deprecated
   public cxn j() {
      return cxn.a;
   }

   public boolean l(cuq $$0) {
      return false;
   }

   public cuq w() {
      return new cuq(this);
   }

   public avo ap_() {
      return avp.kc;
   }

   public avo aq_() {
      return avp.kd;
   }

   public avo e() {
      return avp.nB;
   }

   public boolean ar_() {
      return true;
   }

   @Override
   public cpl i() {
      return this.l;
   }

   public static class a {
      private static final Interner<km> a = Interners.newStrongInterner();
      @Nullable
      private km.a b;
      @Nullable
      cul c;
      cpl d = cpn.f;

      public cul.a a(cpr $$0) {
         return this.a(kq.v, $$0);
      }

      public cul.a a(int $$0) {
         return this.a(kq.c, $$0);
      }

      public cul.a b(int $$0) {
         this.a(kq.d, $$0);
         this.a(kq.c, 1);
         this.a(kq.e, 0);
         return this;
      }

      public cul.a a(cul $$0) {
         this.c = $$0;
         return this;
      }

      public cul.a a(cvo $$0) {
         return this.a(kq.j, $$0);
      }

      public cul.a a() {
         return this.a(kq.w, azs.a);
      }

      public cul.a a(akq<cuv> $$0) {
         return this.a(kq.R, new cuu(new ctl<>($$0), true));
      }

      public cul.a a(cpj... $$0) {
         this.d = cpn.d.a($$0);
         return this;
      }

      public <T> cul.a a(kp<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = km.a().a(kq.ag);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cul.a a(cxn $$0) {
         return this.a(kq.n, $$0);
      }

      km b() {
         km $$0 = this.c();
         if ($$0.b(kq.e) && $$0.a(kq.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private km c() {
         return this.b == null ? kq.ag : (km)a.intern(this.b.a());
      }
   }

   public interface b {
      cul.b a = new cul.b() {
         @Nullable
         @Override
         public jo.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public eqt a(eqr $$0) {
            return null;
         }
      };

      @Nullable
      jo.a a();

      float b();

      @Nullable
      eqt a(eqr var1);

      static cul.b a(@Nullable final dcw $$0) {
         return $$0 == null ? a : new cul.b() {
            @Override
            public jo.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public eqt a(eqr $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cul.b a(final jo.a $$0) {
         return new cul.b() {
            @Override
            public jo.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public eqt a(eqr $$0x) {
               return null;
            }
         };
      }
   }
}
