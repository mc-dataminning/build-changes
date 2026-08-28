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

public class cum implements cpk, dbz {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dfb, cum> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ji.c<cum> b = lp.h.f(this);
   private final ki c;
   @Nullable
   private final cum j;
   @Nullable
   private String k;
   private final cpn l;

   public static int a(cum $$0) {
      return $$0 == null ? 0 : lp.h.a($$0);
   }

   public static cum b(int $$0) {
      return lp.h.a($$0);
   }

   @Deprecated
   public static cum a(dfb $$0) {
      return d.getOrDefault($$0, cuu.a);
   }

   public cum(cum.a $$0) {
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
   public ji.c<cum> o() {
      return this.b;
   }

   public ki p() {
      return this.c;
   }

   public int q() {
      return this.c.a(km.c, 1);
   }

   public void a(dca $$0, btr $$1, cur $$2, int $$3) {
   }

   public void a(cjj $$0) {
   }

   public void n(cur $$0) {
   }

   public boolean a(dse $$0, dca $$1, iz $$2, cmz $$3) {
      return true;
   }

   @Override
   public cum r() {
      return this;
   }

   public bqw a(cye $$0) {
      return bqw.e;
   }

   public float a(cur $$0, dse $$1) {
      cxw $$2 = $$0.a(km.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      cpt $$4 = $$3.a(km.v);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqx.b($$3);
         } else {
            return bqx.d($$3);
         }
      } else {
         return bqx.c($$1.b($$2));
      }
   }

   public cur a(cur $$0, dca $$1, btr $$2) {
      return $$0.b(km.v) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cur $$0) {
      return $$0.m();
   }

   public int f(cur $$0) {
      return ayz.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(cur $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayz.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cur $$0, crr $$1, cqe $$2, cmz $$3) {
      return false;
   }

   public boolean a(cur $$0, cur $$1, crr $$2, cqe $$3, cmz $$4, buj $$5) {
      return false;
   }

   public float a(cmz $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cur $$0, btr $$1, btr $$2) {
      return false;
   }

   public boolean a(cur $$0, dca $$1, dse $$2, iz $$3, btr $$4) {
      cxw $$5 = $$0.a(km.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, btd.a);
         }

         return true;
      }
   }

   public boolean b(cur $$0, dse $$1) {
      cxw $$2 = $$0.a(km.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqw a(cur $$0, cmz $$1, btr $$2, bqv $$3) {
      return bqw.e;
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

   public String i(cur $$0) {
      return this.a();
   }

   @Nullable
   public final cum u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cur $$0, dca $$1, bsw $$2, int $$3, boolean $$4) {
   }

   public void b(cur $$0, dca $$1, cmz $$2) {
      this.a($$0, $$1);
   }

   public void a(cur $$0, dca $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public cwm c(cur $$0) {
      return $$0.b(km.v) ? cwm.b : cwm.a;
   }

   public int b(cur $$0) {
      cpt $$1 = $$0.a(km.v);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cur $$0, dca $$1, btr $$2, int $$3) {
   }

   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
   }

   public Optional<csb> h(cur $$0) {
      return Optional.empty();
   }

   public xp o(cur $$0) {
      return xp.c(this.i($$0));
   }

   public boolean d_(cur $$0) {
      return $$0.B();
   }

   public boolean a(cur $$0) {
      return $$0.j() == 1 && $$0.b(km.d);
   }

   protected static evp a(dca $$0, cmz $$1, dbj.b $$2) {
      evt $$3 = $$1.bx();
      evt $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dbj($$3, $$4, dbj.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cur $$0, cur $$1) {
      return false;
   }

   @Deprecated
   public cxm j() {
      return cxm.a;
   }

   public boolean m(cur $$0) {
      return false;
   }

   public cur w() {
      return new cur(this);
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
   public cpn i() {
      return this.l;
   }

   public static class a {
      private static final Interner<ki> a = Interners.newStrongInterner();
      @Nullable
      private ki.a b;
      @Nullable
      cum c;
      cpn d = cpp.g;

      public cum.a a(cpt $$0) {
         return this.a(km.v, $$0);
      }

      public cum.a a(int $$0) {
         return this.a(km.c, $$0);
      }

      public cum.a b(int $$0) {
         this.a(km.d, $$0);
         this.a(km.c, 1);
         this.a(km.e, 0);
         return this;
      }

      public cum.a a(cum $$0) {
         this.c = $$0;
         return this;
      }

      public cum.a a(cvl $$0) {
         return this.a(km.j, $$0);
      }

      public cum.a a() {
         return this.a(km.w, bac.a);
      }

      public cum.a a(cpl... $$0) {
         this.d = cpp.e.a($$0);
         return this;
      }

      public <T> cum.a a(kl<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ki.a().a(km.af);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cum.a a(cxm $$0) {
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
      cum.b a = new cum.b() {
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
         public epm a(epk $$0) {
            return null;
         }
      };

      @Nullable
      jk.a a();

      float b();

      @Nullable
      epm a(epk var1);

      static cum.b a(@Nullable final dca $$0) {
         return $$0 == null ? a : new cum.b() {
            @Override
            public jk.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epm a(epk $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cum.b a(final jk.a $$0) {
         return new cum.b() {
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
            public epm a(epk $$0x) {
               return null;
            }
         };
      }
   }
}
