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

public class cuj implements cph, dbw {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dey, cuj> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final ji.c<cuj> b = lp.h.f(this);
   private final ki c;
   @Nullable
   private final cuj j;
   @Nullable
   private String k;
   private final cpk l;

   public static int a(cuj $$0) {
      return $$0 == null ? 0 : lp.h.a($$0);
   }

   public static cuj b(int $$0) {
      return lp.h.a($$0);
   }

   @Deprecated
   public static cuj a(dey $$0) {
      return d.getOrDefault($$0, cur.a);
   }

   public cuj(cuj.a $$0) {
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
   public ji.c<cuj> o() {
      return this.b;
   }

   public ki p() {
      return this.c;
   }

   public int q() {
      return this.c.a(km.c, 1);
   }

   public void a(dbx $$0, bto $$1, cuo $$2, int $$3) {
   }

   public void a(cjg $$0) {
   }

   public void n(cuo $$0) {
   }

   public boolean a(dsb $$0, dbx $$1, iz $$2, cmw $$3) {
      return true;
   }

   @Override
   public cuj r() {
      return this;
   }

   public bqt a(cyb $$0) {
      return bqt.e;
   }

   public float a(cuo $$0, dsb $$1) {
      cxt $$2 = $$0.a(km.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      cpq $$4 = $$3.a(km.v);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqu.b($$3);
         } else {
            return bqu.d($$3);
         }
      } else {
         return bqu.c($$1.b($$2));
      }
   }

   public cuo a(cuo $$0, dbx $$1, bto $$2) {
      return $$0.b(km.v) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean e(cuo $$0) {
      return $$0.m();
   }

   public int f(cuo $$0) {
      return ayy.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int g(cuo $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayy.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cuo $$0, cro $$1, cqb $$2, cmw $$3) {
      return false;
   }

   public boolean a(cuo $$0, cuo $$1, cro $$2, cqb $$3, cmw $$4, bug $$5) {
      return false;
   }

   public float a(cmw $$0, float $$1) {
      return 0.0F;
   }

   public boolean a(cuo $$0, bto $$1, bto $$2) {
      return false;
   }

   public boolean a(cuo $$0, dbx $$1, dsb $$2, iz $$3, bto $$4) {
      cxt $$5 = $$0.a(km.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bta.a);
         }

         return true;
      }
   }

   public boolean b(cuo $$0, dsb $$1) {
      cxt $$2 = $$0.a(km.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqt a(cuo $$0, cmw $$1, bto $$2, bqs $$3) {
      return bqt.e;
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

   public String i(cuo $$0) {
      return this.a();
   }

   @Nullable
   public final cuj u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cuo $$0, dbx $$1, bst $$2, int $$3, boolean $$4) {
   }

   public void b(cuo $$0, dbx $$1, cmw $$2) {
      this.a($$0, $$1);
   }

   public void a(cuo $$0, dbx $$1) {
   }

   public boolean aj_() {
      return false;
   }

   public cwj c(cuo $$0) {
      return $$0.b(km.v) ? cwj.b : cwj.a;
   }

   public int b(cuo $$0) {
      cpq $$1 = $$0.a(km.v);
      return $$1 != null ? $$1.a() : 0;
   }

   public void a(cuo $$0, dbx $$1, bto $$2, int $$3) {
   }

   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
   }

   public Optional<cry> h(cuo $$0) {
      return Optional.empty();
   }

   public xo o(cuo $$0) {
      return xo.c(this.i($$0));
   }

   public boolean d_(cuo $$0) {
      return $$0.B();
   }

   public boolean a(cuo $$0) {
      return $$0.j() == 1 && $$0.b(km.d);
   }

   protected static evm a(dbx $$0, cmw $$1, dbg.b $$2) {
      evq $$3 = $$1.bx();
      evq $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gC()));
      return $$0.a(new dbg($$3, $$4, dbg.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cuo $$0, cuo $$1) {
      return false;
   }

   @Deprecated
   public cxj j() {
      return cxj.a;
   }

   public boolean m(cuo $$0) {
      return false;
   }

   public cuo w() {
      return new cuo(this);
   }

   public avy ak_() {
      return avz.kc;
   }

   public avy al_() {
      return avz.kd;
   }

   public avy e() {
      return avz.nB;
   }

   public boolean am_() {
      return true;
   }

   @Override
   public cpk i() {
      return this.l;
   }

   public static class a {
      private static final Interner<ki> a = Interners.newStrongInterner();
      @Nullable
      private ki.a b;
      @Nullable
      cuj c;
      cpk d = cpm.g;

      public cuj.a a(cpq $$0) {
         return this.a(km.v, $$0);
      }

      public cuj.a a(int $$0) {
         return this.a(km.c, $$0);
      }

      public cuj.a b(int $$0) {
         this.a(km.d, $$0);
         this.a(km.c, 1);
         this.a(km.e, 0);
         return this;
      }

      public cuj.a a(cuj $$0) {
         this.c = $$0;
         return this;
      }

      public cuj.a a(cvi $$0) {
         return this.a(km.j, $$0);
      }

      public cuj.a a() {
         return this.a(km.w, bab.a);
      }

      public cuj.a a(cpi... $$0) {
         this.d = cpm.e.a($$0);
         return this;
      }

      public <T> cuj.a a(kl<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ki.a().a(km.af);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cuj.a a(cxj $$0) {
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
      cuj.b a = new cuj.b() {
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
         public epj a(eph $$0) {
            return null;
         }
      };

      @Nullable
      jk.a a();

      float b();

      @Nullable
      epj a(eph var1);

      static cuj.b a(@Nullable final dbx $$0) {
         return $$0 == null ? a : new cuj.b() {
            @Override
            public jk.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epj a(eph $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cuj.b a(final jk.a $$0) {
         return new cuj.b() {
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
            public epj a(eph $$0x) {
               return null;
            }
         };
      }
   }
}
