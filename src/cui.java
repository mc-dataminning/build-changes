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

public class cui implements cpg, dbv {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dex, cui> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ji.c<cui> b = lp.h.f(this);
   private final ki c;
   @Nullable
   private final cui j;
   @Nullable
   private String k;
   private final cpj l;

   public static int a(cui $$0) {
      return $$0 == null ? 0 : lp.h.a($$0);
   }

   public static cui b(int $$0) {
      return lp.h.a($$0);
   }

   @Deprecated
   public static cui a(dex $$0) {
      return d.getOrDefault($$0, cuq.a);
   }

   public cui(cui.a $$0) {
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
   public ji.c<cui> o() {
      return this.b;
   }

   public ki p() {
      return this.c;
   }

   public int q() {
      return this.c.a(km.b, 1);
   }

   public void a(dbw $$0, btn $$1, cun $$2, int $$3) {
   }

   public void a(cjf $$0) {
   }

   public void n(cun $$0) {
   }

   public boolean a(dsa $$0, dbw $$1, iz $$2, cmv $$3) {
      return true;
   }

   @Override
   public cui r() {
      return this;
   }

   public bqs a(cya $$0) {
      return bqs.e;
   }

   public float a(cun $$0, dsa $$1) {
      cxs $$2 = $$0.a(km.w);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      cpp $$4 = $$3.a(km.u);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqt.b($$3);
         } else {
            return bqt.d($$3);
         }
      } else {
         return bqt.c($$1.b($$2));
      }
   }

   public cun a(cun $$0, dbw $$1, btn $$2) {
      return $$0.b(km.u) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cun $$0) {
      return $$0.m();
   }

   public int f(cun $$0) {
      return ayx.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(cun $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayx.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cun $$0, crn $$1, cqa $$2, cmv $$3) {
      return false;
   }

   public boolean a(cun $$0, cun $$1, crn $$2, cqa $$3, cmv $$4, buf $$5) {
      return false;
   }

   public float a(cmv $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cun $$0, btn $$1, btn $$2) {
      return false;
   }

   public boolean a(cun $$0, dbw $$1, dsa $$2, iz $$3, btn $$4) {
      cxs $$5 = $$0.a(km.w);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsz.a);
         }

         return true;
      }
   }

   public boolean b(cun $$0, dsa $$1) {
      cxs $$2 = $$0.a(km.w);
      return $$2 != null && $$2.b($$1);
   }

   public bqs a(cun $$0, cmv $$1, btn $$2, bqr $$3) {
      return bqs.e;
   }

   public xo s() {
      return xo.c(this.a());
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

   public String i(cun $$0) {
      return this.a();
   }

   @Nullable
   public final cui u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cun $$0, dbw $$1, bss $$2, int $$3, boolean $$4) {
   }

   public void b(cun $$0, dbw $$1, cmv $$2) {
      this.a($$0, $$1);
   }

   public void a(cun $$0, dbw $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cwi c(cun $$0) {
      return $$0.b(km.u) ? cwi.b : cwi.a;
   }

   public int b(cun $$0) {
      cpp $$1 = $$0.a(km.u);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cun $$0, dbw $$1, btn $$2, int $$3) {
   }

   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
   }

   public Optional<crx> h(cun $$0) {
      return Optional.empty();
   }

   public xo o(cun $$0) {
      return xo.c(this.i($$0));
   }

   public boolean d_(cun $$0) {
      return $$0.B();
   }

   public boolean a(cun $$0) {
      return $$0.j() == 1 && $$0.b(km.c);
   }

   protected static evl a(dbw $$0, cmv $$1, dbf.b $$2) {
      evp $$3 = $$1.bx();
      evp $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dbf($$3, $$4, dbf.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cun $$0, cun $$1) {
      return false;
   }

   @Deprecated
   public cxi j() {
      return cxi.a;
   }

   public boolean m(cun $$0) {
      return false;
   }

   public cun w() {
      return new cun(this);
   }

   public avy al_() {
      return avz.kc;
   }

   public avy am_() {
      return avz.kd;
   }

   public avy e() {
      return avz.nB;
   }

   public boolean an_() {
      return true;
   }

   @Override
   public cpj i() {
      return this.l;
   }

   public static class a {
      private static final Interner<ki> a = Interners.newStrongInterner();
      @Nullable
      private ki.a b;
      @Nullable
      cui c;
      cpj d = cpl.g;

      public cui.a a(cpp $$0) {
         return this.a(km.u, $$0);
      }

      public cui.a a(int $$0) {
         return this.a(km.b, $$0);
      }

      public cui.a b(int $$0) {
         this.a(km.c, $$0);
         this.a(km.b, 1);
         this.a(km.d, 0);
         return this;
      }

      public cui.a a(cui $$0) {
         this.c = $$0;
         return this;
      }

      public cui.a a(cvh $$0) {
         return this.a(km.i, $$0);
      }

      public cui.a a() {
         return this.a(km.v, baa.a);
      }

      public cui.a a(cph... $$0) {
         this.d = cpl.e.a($$0);
         return this;
      }

      public <T> cui.a a(kl<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ki.a().a(km.ae);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cui.a a(cxi $$0) {
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
      cui.b a = new cui.b() {
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
         public epi a(epg $$0) {
            return null;
         }
      };

      @Nullable
      jk.a a();

      float b();

      @Nullable
      epi a(epg var1);

      static cui.b a(@Nullable final dbw $$0) {
         return $$0 == null ? a : new cui.b() {
            @Override
            public jk.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epi a(epg $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cui.b a(final jk.a $$0) {
         return new cui.b() {
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
            public epi a(epg $$0x) {
               return null;
            }
         };
      }
   }
}
