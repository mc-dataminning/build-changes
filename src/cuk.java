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

public class cuk implements cpi, dbx {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dez, cuk> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ji.c<cuk> b = lp.h.f(this);
   private final ki c;
   @Nullable
   private final cuk j;
   @Nullable
   private String k;
   private final cpl l;

   public static int a(cuk $$0) {
      return $$0 == null ? 0 : lp.h.a($$0);
   }

   public static cuk b(int $$0) {
      return lp.h.a($$0);
   }

   @Deprecated
   public static cuk a(dez $$0) {
      return d.getOrDefault($$0, cus.a);
   }

   public cuk(cuk.a $$0) {
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
   public ji.c<cuk> o() {
      return this.b;
   }

   public ki p() {
      return this.c;
   }

   public int q() {
      return this.c.a(km.c, 1);
   }

   public void a(dby $$0, btp $$1, cup $$2, int $$3) {
   }

   public void a(cjh $$0) {
   }

   public void n(cup $$0) {
   }

   public boolean a(dsc $$0, dby $$1, iz $$2, cmx $$3) {
      return true;
   }

   @Override
   public cuk r() {
      return this;
   }

   public bqu a(cyc $$0) {
      return bqu.e;
   }

   public float a(cup $$0, dsc $$1) {
      cxu $$2 = $$0.a(km.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      cpr $$4 = $$3.a(km.v);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqv.b($$3);
         } else {
            return bqv.d($$3);
         }
      } else {
         return bqv.c($$1.b($$2));
      }
   }

   public cup a(cup $$0, dby $$1, btp $$2) {
      return $$0.b(km.v) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cup $$0) {
      return $$0.m();
   }

   public int f(cup $$0) {
      return ayz.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(cup $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayz.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cup $$0, crp $$1, cqc $$2, cmx $$3) {
      return false;
   }

   public boolean a(cup $$0, cup $$1, crp $$2, cqc $$3, cmx $$4, buh $$5) {
      return false;
   }

   public float a(cmx $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cup $$0, btp $$1, btp $$2) {
      return false;
   }

   public boolean a(cup $$0, dby $$1, dsc $$2, iz $$3, btp $$4) {
      cxu $$5 = $$0.a(km.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, btb.a);
         }

         return true;
      }
   }

   public boolean b(cup $$0, dsc $$1) {
      cxu $$2 = $$0.a(km.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqu a(cup $$0, cmx $$1, btp $$2, bqt $$3) {
      return bqu.e;
   }

   public xp s() {
      return xp.c(this.a());
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

   public String i(cup $$0) {
      return this.a();
   }

   @Nullable
   public final cuk u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cup $$0, dby $$1, bsu $$2, int $$3, boolean $$4) {
   }

   public void b(cup $$0, dby $$1, cmx $$2) {
      this.a($$0, $$1);
   }

   public void a(cup $$0, dby $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public cwk c(cup $$0) {
      return $$0.b(km.v) ? cwk.b : cwk.a;
   }

   public int b(cup $$0) {
      cpr $$1 = $$0.a(km.v);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cup $$0, dby $$1, btp $$2, int $$3) {
   }

   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
   }

   public Optional<crz> h(cup $$0) {
      return Optional.empty();
   }

   public xp o(cup $$0) {
      return xp.c(this.i($$0));
   }

   public boolean d_(cup $$0) {
      return $$0.B();
   }

   public boolean a(cup $$0) {
      return $$0.j() == 1 && $$0.b(km.d);
   }

   protected static evn a(dby $$0, cmx $$1, dbh.b $$2) {
      evr $$3 = $$1.bx();
      evr $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dbh($$3, $$4, dbh.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cup $$0, cup $$1) {
      return false;
   }

   @Deprecated
   public cxk j() {
      return cxk.a;
   }

   public boolean m(cup $$0) {
      return false;
   }

   public cup w() {
      return new cup(this);
   }

   public avz ak_() {
      return awa.kc;
   }

   public avz al_() {
      return awa.kd;
   }

   public avz e() {
      return awa.nB;
   }

   public boolean am_() {
      return true;
   }

   @Override
   public cpl i() {
      return this.l;
   }

   public static class a {
      private static final Interner<ki> a = Interners.newStrongInterner();
      @Nullable
      private ki.a b;
      @Nullable
      cuk c;
      cpl d = cpn.g;

      public cuk.a a(cpr $$0) {
         return this.a(km.v, $$0);
      }

      public cuk.a a(int $$0) {
         return this.a(km.c, $$0);
      }

      public cuk.a b(int $$0) {
         this.a(km.d, $$0);
         this.a(km.c, 1);
         this.a(km.e, 0);
         return this;
      }

      public cuk.a a(cuk $$0) {
         this.c = $$0;
         return this;
      }

      public cuk.a a(cvj $$0) {
         return this.a(km.j, $$0);
      }

      public cuk.a a() {
         return this.a(km.w, bac.a);
      }

      public cuk.a a(cpj... $$0) {
         this.d = cpn.e.a($$0);
         return this;
      }

      public <T> cuk.a a(kl<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ki.a().a(km.af);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cuk.a a(cxk $$0) {
         return this.a(km.n, $$0);
      }

      ki b() {
         ki $$0 = this.c();
         if ($$0.b(km.e) && $$0.a(km.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private ki c() {
         return this.b == null ? km.af : (ki)a.intern(this.b.a());
      }
   }

   public interface b {
      cuk.b a = new cuk.b() {
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
         public epk a(epi $$0) {
            return null;
         }
      };

      @Nullable
      jk.a a();

      float b();

      @Nullable
      epk a(epi var1);

      static cuk.b a(@Nullable final dby $$0) {
         return $$0 == null ? a : new cuk.b() {
            @Override
            public jk.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epk a(epi $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cuk.b a(final jk.a $$0) {
         return new cuk.b() {
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
            public epk a(epi $$0x) {
               return null;
            }
         };
      }
   }
}
