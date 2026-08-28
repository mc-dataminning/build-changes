import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cuf implements cpd, dbs {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<deu, cuf> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ji.c<cuf> b = lp.h.f(this);
   private final ki c;
   @Nullable
   private final cuf j;
   @Nullable
   private String k;
   private final cpg l;

   public static int a(cuf $$0) {
      return $$0 == null ? 0 : lp.h.a($$0);
   }

   public static cuf b(int $$0) {
      return lp.h.a($$0);
   }

   @Deprecated
   public static cuf a(deu $$0) {
      return d.getOrDefault($$0, cun.a);
   }

   public cuf(cuf.a $$0) {
      this.c = $$0.b();
      this.j = $$0.c;
      this.l = $$0.d;
      if (aa.aX) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public ji.c<cuf> o() {
      return this.b;
   }

   public ki p() {
      return this.c;
   }

   public int q() {
      return this.c.a(km.b, 1);
   }

   public void a(dbt $$0, btk $$1, cuk $$2, int $$3) {
   }

   public void a(cjc $$0) {
   }

   public void n(cuk $$0) {
   }

   public boolean a(drx $$0, dbt $$1, iz $$2, cms $$3) {
      return true;
   }

   @Override
   public cuf r() {
      return this;
   }

   public bqp a(cxx $$0) {
      return bqp.e;
   }

   public float a(cuk $$0, drx $$1) {
      cxp $$2 = $$0.a(km.w);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      cpm $$4 = $$3.a(km.u);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqq.b($$3);
         } else {
            return bqq.d($$3);
         }
      } else {
         return bqq.c($$1.b($$2));
      }
   }

   public cuk a(cuk $$0, dbt $$1, btk $$2) {
      return $$0.b(km.u) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cuk $$0) {
      return $$0.m();
   }

   public int f(cuk $$0) {
      return ayu.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(cuk $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayu.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cuk $$0, crk $$1, cpx $$2, cms $$3) {
      return false;
   }

   public boolean a(cuk $$0, cuk $$1, crk $$2, cpx $$3, cms $$4, buc $$5) {
      return false;
   }

   public float a(cms $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cuk $$0, btk $$1, btk $$2) {
      return false;
   }

   public boolean a(cuk $$0, dbt $$1, drx $$2, iz $$3, btk $$4) {
      cxp $$5 = $$0.a(km.w);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsw.a);
         }

         return true;
      }
   }

   public boolean b(cuk $$0, drx $$1) {
      cxp $$2 = $$0.a(km.w);
      return $$2 != null && $$2.b($$1);
   }

   public bqp a(cuk $$0, cms $$1, btk $$2, bqo $$3) {
      return bqp.e;
   }

   public xl s() {
      return xl.c(this.a());
   }

   @Override
   public String toString() {
      return lp.h.b(this).a();
   }

   protected String t() {
      if (this.k == null) {
         this.k = ac.a("item", lp.h.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.t();
   }

   public String i(cuk $$0) {
      return this.a();
   }

   @Nullable
   public final cuf u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cuk $$0, dbt $$1, bsp $$2, int $$3, boolean $$4) {
   }

   public void b(cuk $$0, dbt $$1, cms $$2) {
      this.a($$0, $$1);
   }

   public void a(cuk $$0, dbt $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cwf c(cuk $$0) {
      return $$0.b(km.u) ? cwf.b : cwf.a;
   }

   public int b(cuk $$0) {
      cpm $$1 = $$0.a(km.u);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cuk $$0, dbt $$1, btk $$2, int $$3) {
   }

   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
   }

   public Optional<cru> h(cuk $$0) {
      return Optional.empty();
   }

   public xl o(cuk $$0) {
      return xl.c(this.i($$0));
   }

   public boolean d_(cuk $$0) {
      return $$0.B();
   }

   public boolean a(cuk $$0) {
      return $$0.j() == 1 && $$0.b(km.c);
   }

   protected static evi a(dbt $$0, cms $$1, dbc.b $$2) {
      evm $$3 = $$1.bx();
      evm $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dbc($$3, $$4, dbc.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cuk $$0, cuk $$1) {
      return false;
   }

   @Deprecated
   public cxf j() {
      return cxf.a;
   }

   public boolean m(cuk $$0) {
      return false;
   }

   public cuk w() {
      return new cuk(this);
   }

   public avv al_() {
      return avw.kc;
   }

   public avv am_() {
      return avw.kd;
   }

   public avv e() {
      return avw.nB;
   }

   public boolean an_() {
      return true;
   }

   @Override
   public cpg i() {
      return this.l;
   }

   public static class a {
      private static final Interner<ki> a = Interners.newStrongInterner();
      @Nullable
      private ki.a b;
      @Nullable
      cuf c;
      cpg d = cpi.g;

      public cuf.a a(cpm $$0) {
         return this.a(km.u, $$0);
      }

      public cuf.a a(int $$0) {
         return this.a(km.b, $$0);
      }

      public cuf.a b(int $$0) {
         this.a(km.c, $$0);
         this.a(km.b, 1);
         this.a(km.d, 0);
         return this;
      }

      public cuf.a a(cuf $$0) {
         this.c = $$0;
         return this;
      }

      public cuf.a a(cve $$0) {
         return this.a(km.i, $$0);
      }

      public cuf.a a() {
         return this.a(km.v, azx.a);
      }

      public cuf.a a(cpe... $$0) {
         this.d = cpi.e.a($$0);
         return this;
      }

      public <T> cuf.a a(kl<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ki.a().a(km.ae);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cuf.a a(cxf $$0) {
         return this.a(km.m, $$0);
      }

      ki b() {
         ki $$0 = this.c();
         if ($$0.b(km.d) && $$0.a(km.b, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private ki c() {
         return this.b == null ? km.ae : (ki)a.intern(this.b.a());
      }
   }

   public interface b {
      cuf.b a = new cuf.b() {
         @Nullable
         @Override
         public jk.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public epf a(epd $$0) {
            return null;
         }
      };

      @Nullable
      jk.a a();

      float b();

      @Nullable
      epf a(epd var1);

      static cuf.b a(@Nullable final dbt $$0) {
         return $$0 == null ? a : new cuf.b() {
            @Override
            public jk.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epf a(epd $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cuf.b a(final jk.a $$0) {
         return new cuf.b() {
            @Override
            public jk.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public epf a(epd $$0x) {
               return null;
            }
         };
      }
   }
}
