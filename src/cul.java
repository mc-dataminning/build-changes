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

public class cul implements cpj, dby {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dfa, cul> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ji.c<cul> b = lp.h.f(this);
   private final ki c;
   @Nullable
   private final cul j;
   @Nullable
   private String k;
   private final cpm l;

   public static int a(cul $$0) {
      return $$0 == null ? 0 : lp.h.a($$0);
   }

   public static cul b(int $$0) {
      return lp.h.a($$0);
   }

   @Deprecated
   public static cul a(dfa $$0) {
      return d.getOrDefault($$0, cut.a);
   }

   public cul(cul.a $$0) {
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
   public ji.c<cul> o() {
      return this.b;
   }

   public ki p() {
      return this.c;
   }

   public int q() {
      return this.c.a(km.c, 1);
   }

   public void a(dbz $$0, btq $$1, cuq $$2, int $$3) {
   }

   public void a(cji $$0) {
   }

   public void n(cuq $$0) {
   }

   public boolean a(dsd $$0, dbz $$1, iz $$2, cmy $$3) {
      return true;
   }

   @Override
   public cul r() {
      return this;
   }

   public bqv a(cyd $$0) {
      return bqv.e;
   }

   public float a(cuq $$0, dsd $$1) {
      cxv $$2 = $$0.a(km.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      cps $$4 = $$3.a(km.v);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqw.b($$3);
         } else {
            return bqw.d($$3);
         }
      } else {
         return bqw.c($$1.b($$2));
      }
   }

   public cuq a(cuq $$0, dbz $$1, btq $$2) {
      return $$0.b(km.v) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cuq $$0) {
      return $$0.m();
   }

   public int f(cuq $$0) {
      return ayz.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(cuq $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayz.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cuq $$0, crq $$1, cqd $$2, cmy $$3) {
      return false;
   }

   public boolean a(cuq $$0, cuq $$1, crq $$2, cqd $$3, cmy $$4, bui $$5) {
      return false;
   }

   public float a(cmy $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cuq $$0, btq $$1, btq $$2) {
      return false;
   }

   public boolean a(cuq $$0, dbz $$1, dsd $$2, iz $$3, btq $$4) {
      cxv $$5 = $$0.a(km.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, btc.a);
         }

         return true;
      }
   }

   public boolean b(cuq $$0, dsd $$1) {
      cxv $$2 = $$0.a(km.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqv a(cuq $$0, cmy $$1, btq $$2, bqu $$3) {
      return bqv.e;
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

   public String i(cuq $$0) {
      return this.a();
   }

   @Nullable
   public final cul u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cuq $$0, dbz $$1, bsv $$2, int $$3, boolean $$4) {
   }

   public void b(cuq $$0, dbz $$1, cmy $$2) {
      this.a($$0, $$1);
   }

   public void a(cuq $$0, dbz $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public cwl c(cuq $$0) {
      return $$0.b(km.v) ? cwl.b : cwl.a;
   }

   public int b(cuq $$0) {
      cps $$1 = $$0.a(km.v);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cuq $$0, dbz $$1, btq $$2, int $$3) {
   }

   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
   }

   public Optional<csa> h(cuq $$0) {
      return Optional.empty();
   }

   public xp o(cuq $$0) {
      return xp.c(this.i($$0));
   }

   public boolean d_(cuq $$0) {
      return $$0.B();
   }

   public boolean a(cuq $$0) {
      return $$0.j() == 1 && $$0.b(km.d);
   }

   protected static evo a(dbz $$0, cmy $$1, dbi.b $$2) {
      evs $$3 = $$1.bx();
      evs $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dbi($$3, $$4, dbi.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cuq $$0, cuq $$1) {
      return false;
   }

   @Deprecated
   public cxl j() {
      return cxl.a;
   }

   public boolean m(cuq $$0) {
      return false;
   }

   public cuq w() {
      return new cuq(this);
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
   public cpm i() {
      return this.l;
   }

   public static class a {
      private static final Interner<ki> a = Interners.newStrongInterner();
      @Nullable
      private ki.a b;
      @Nullable
      cul c;
      cpm d = cpo.g;

      public cul.a a(cps $$0) {
         return this.a(km.v, $$0);
      }

      public cul.a a(int $$0) {
         return this.a(km.c, $$0);
      }

      public cul.a b(int $$0) {
         this.a(km.d, $$0);
         this.a(km.c, 1);
         this.a(km.e, 0);
         return this;
      }

      public cul.a a(cul $$0) {
         this.c = $$0;
         return this;
      }

      public cul.a a(cvk $$0) {
         return this.a(km.j, $$0);
      }

      public cul.a a() {
         return this.a(km.w, bac.a);
      }

      public cul.a a(cpk... $$0) {
         this.d = cpo.e.a($$0);
         return this;
      }

      public <T> cul.a a(kl<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ki.a().a(km.af);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cul.a a(cxl $$0) {
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
      cul.b a = new cul.b() {
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
         public epl a(epj $$0) {
            return null;
         }
      };

      @Nullable
      jk.a a();

      float b();

      @Nullable
      epl a(epj var1);

      static cul.b a(@Nullable final dbz $$0) {
         return $$0 == null ? a : new cul.b() {
            @Override
            public jk.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epl a(epj $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cul.b a(final jk.a $$0) {
         return new cul.b() {
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
            public epl a(epj $$0x) {
               return null;
            }
         };
      }
   }
}
