import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cuj implements cpg, dct {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dfw, cuj> d = Maps.newHashMap();
   public static final akq e = akq.b("base_attack_damage");
   public static final akq f = akq.b("base_attack_speed");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final jm.c<cuj> b = lt.g.f(this);
   private final km c;
   @Nullable
   private final cuj j;
   @Nullable
   private String k;
   private final cpj l;

   public static int a(cuj $$0) {
      return $$0 == null ? 0 : lt.g.a($$0);
   }

   public static cuj b(int $$0) {
      return lt.g.a($$0);
   }

   @Deprecated
   public static cuj a(dfw $$0) {
      return d.getOrDefault($$0, cur.a);
   }

   public cuj(cuj.a $$0) {
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
   public jm.c<cuj> o() {
      return this.b;
   }

   public km p() {
      return this.c;
   }

   public int q() {
      return this.c.a(kq.c, 1);
   }

   public void a(dcu $$0, btl $$1, cuo $$2, int $$3) {
   }

   public void a(cjf $$0) {
   }

   public void m(cuo $$0) {
   }

   public boolean a(dta $$0, dcu $$1, jd $$2, cmv $$3) {
      return true;
   }

   @Override
   public cuj r() {
      return this;
   }

   public bqq a(cyd $$0) {
      return bqq.e;
   }

   public float a(cuo $$0, dta $$1) {
      cxv $$2 = $$0.a(kq.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      cpp $$4 = $$3.a(kq.v);
      if ($$4 != null) {
         if ($$1.u($$4.d())) {
            $$1.c($$2);
            return bqr.b($$3);
         } else {
            return bqr.d($$3);
         }
      } else {
         return bqr.c($$1.b($$2));
      }
   }

   public cuo a(cuo $$0, dcu $$1, btl $$2) {
      cpp $$3 = $$0.a(kq.v);
      return $$3 != null ? $$2.a($$1, $$0, $$3) : $$0;
   }

   public boolean d(cuo $$0) {
      return $$0.m();
   }

   public int e(cuo $$0) {
      return ayn.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int f(cuo $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayn.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cuo $$0, cro $$1, cqb $$2, cmv $$3) {
      return false;
   }

   public boolean a(cuo $$0, cuo $$1, cro $$2, cqb $$3, cmv $$4, bue $$5) {
      return false;
   }

   public float a(bsq $$0, float $$1, brj $$2) {
      return 0.0F;
   }

   public boolean a(cuo $$0, btl $$1, btl $$2) {
      return false;
   }

   public void b(cuo $$0, btl $$1, btl $$2) {
   }

   public boolean a(cuo $$0, dcu $$1, dta $$2, jd $$3, btl $$4) {
      cxv $$5 = $$0.a(kq.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsx.a);
         }

         return true;
      }
   }

   public boolean b(cuo $$0, dta $$1) {
      cxv $$2 = $$0.a(kq.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqq a(cuo $$0, cmv $$1, btl $$2, bqp $$3) {
      return bqq.e;
   }

   public wy s() {
      return wy.c(this.a());
   }

   @Override
   public String toString() {
      return lt.g.b(this).a();
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

   public String h(cuo $$0) {
      return this.a();
   }

   @Nullable
   public final cuj u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cuo $$0, dcu $$1, bsq $$2, int $$3, boolean $$4) {
   }

   public void b(cuo $$0, dcu $$1, cmv $$2) {
      this.a($$0, $$1);
   }

   public void a(cuo $$0, dcu $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cwm b(cuo $$0) {
      return $$0.b(kq.v) ? cwm.b : cwm.a;
   }

   public int a(cuo $$0, btl $$1) {
      cpp $$2 = $$0.a(kq.v);
      return $$2 != null ? $$2.a() : 0;
   }

   public void a(cuo $$0, dcu $$1, btl $$2, int $$3) {
   }

   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
   }

   public Optional<cry> g(cuo $$0) {
      return Optional.empty();
   }

   public wy n(cuo $$0) {
      return wy.c(this.h($$0));
   }

   public boolean d_(cuo $$0) {
      return $$0.A();
   }

   public boolean a(cuo $$0) {
      return $$0.j() == 1 && $$0.b(kq.d);
   }

   protected static ews a(dcu $$0, cmv $$1, dcd.b $$2) {
      eww $$3 = $$1.by();
      eww $$4 = $$3.e($$1.c($$1.dI(), $$1.dG()).a($$1.gz()));
      return $$0.a(new dcd($$3, $$4, dcd.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cuo $$0, cuo $$1) {
      return false;
   }

   @Deprecated
   public cxl j() {
      return cxl.a;
   }

   public boolean l(cuo $$0) {
      return false;
   }

   public cuo w() {
      return new cuo(this);
   }

   public avn al_() {
      return avo.kc;
   }

   public avn am_() {
      return avo.kd;
   }

   public avn e() {
      return avo.nB;
   }

   public boolean an_() {
      return true;
   }

   @Override
   public cpj i() {
      return this.l;
   }

   public static class a {
      private static final Interner<km> a = Interners.newStrongInterner();
      @Nullable
      private km.a b;
      @Nullable
      cuj c;
      cpj d = cpl.f;

      public cuj.a a(cpp $$0) {
         return this.a(kq.v, $$0);
      }

      public cuj.a a(int $$0) {
         return this.a(kq.c, $$0);
      }

      public cuj.a b(int $$0) {
         this.a(kq.d, $$0);
         this.a(kq.c, 1);
         this.a(kq.e, 0);
         return this;
      }

      public cuj.a a(cuj $$0) {
         this.c = $$0;
         return this;
      }

      public cuj.a a(cvm $$0) {
         return this.a(kq.j, $$0);
      }

      public cuj.a a() {
         return this.a(kq.w, azr.a);
      }

      public cuj.a a(akp<cut> $$0) {
         return this.a(kq.R, new cus(new ctj<>($$0), true));
      }

      public cuj.a a(cph... $$0) {
         this.d = cpl.d.a($$0);
         return this;
      }

      public <T> cuj.a a(kp<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = km.a().a(kq.ag);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cuj.a a(cxl $$0) {
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
      cuj.b a = new cuj.b() {
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
         public eqn a(eql $$0) {
            return null;
         }
      };

      @Nullable
      jo.a a();

      float b();

      @Nullable
      eqn a(eql var1);

      static cuj.b a(@Nullable final dcu $$0) {
         return $$0 == null ? a : new cuj.b() {
            @Override
            public jo.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public eqn a(eql $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cuj.b a(final jo.a $$0) {
         return new cuj.b() {
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
            public eqn a(eql $$0x) {
               return null;
            }
         };
      }
   }
}
