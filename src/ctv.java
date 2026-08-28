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

public class ctv implements cos, dcc {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dff, ctv> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final jj.c<ctv> b = lq.g.f(this);
   private final kj c;
   @Nullable
   private final ctv j;
   @Nullable
   private String k;
   private final cov l;

   public static int a(ctv $$0) {
      return $$0 == null ? 0 : lq.g.a($$0);
   }

   public static ctv b(int $$0) {
      return lq.g.a($$0);
   }

   @Deprecated
   public static ctv a(dff $$0) {
      return d.getOrDefault($$0, cud.a);
   }

   public ctv(ctv.a $$0) {
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
   public jj.c<ctv> o() {
      return this.b;
   }

   public kj p() {
      return this.c;
   }

   public int q() {
      return this.c.a(kn.c, 1);
   }

   public void a(dcd $$0, bsy $$1, cua $$2, int $$3) {
   }

   public void a(cir $$0) {
   }

   public void m(cua $$0) {
   }

   public boolean a(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
      return true;
   }

   @Override
   public ctv r() {
      return this;
   }

   public bqd a(cxm $$0) {
      return bqd.e;
   }

   public float a(cua $$0, dsh $$1) {
      cxe $$2 = $$0.a(kn.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      cpb $$4 = $$3.a(kn.v);
      if ($$4 != null) {
         if ($$1.t($$4.d())) {
            $$1.c($$2);
            return bqe.b($$3);
         } else {
            return bqe.d($$3);
         }
      } else {
         return bqe.c($$1.b($$2));
      }
   }

   public cua a(cua $$0, dcd $$1, bsy $$2) {
      return $$0.b(kn.v) ? $$2.a($$1, $$0) : $$0;
   }

   public boolean d(cua $$0) {
      return $$0.m();
   }

   public int e(cua $$0) {
      return aye.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int f(cua $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return aye.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cua $$0, cra $$1, cpn $$2, cmh $$3) {
      return false;
   }

   public boolean a(cua $$0, cua $$1, cra $$2, cpn $$3, cmh $$4, btq $$5) {
      return false;
   }

   public float a(bsd $$0, float $$1, bqw $$2) {
      return 0.0F;
   }

   public boolean a(cua $$0, bsy $$1, bsy $$2) {
      return false;
   }

   public void b(cua $$0, bsy $$1, bsy $$2) {
   }

   public boolean a(cua $$0, dcd $$1, dsh $$2, ja $$3, bsy $$4) {
      cxe $$5 = $$0.a(kn.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bsk.a);
         }

         return true;
      }
   }

   public boolean b(cua $$0, dsh $$1) {
      cxe $$2 = $$0.a(kn.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqd a(cua $$0, cmh $$1, bsy $$2, bqc $$3) {
      return bqd.e;
   }

   public wu s() {
      return wu.c(this.a());
   }

   @Override
   public String toString() {
      return lq.g.b(this).a();
   }

   protected String t() {
      if (this.k == null) {
         this.k = ac.a("item", lq.g.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.t();
   }

   public String h(cua $$0) {
      return this.a();
   }

   @Nullable
   public final ctv u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cua $$0, dcd $$1, bsd $$2, int $$3, boolean $$4) {
   }

   public void b(cua $$0, dcd $$1, cmh $$2) {
      this.a($$0, $$1);
   }

   public void a(cua $$0, dcd $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cvv b(cua $$0) {
      return $$0.b(kn.v) ? cvv.b : cvv.a;
   }

   public int a(cua $$0, bsy $$1) {
      cpb $$2 = $$0.a(kn.v);
      return $$2 != null ? $$2.a() : 0;
   }

   public void a(cua $$0, dcd $$1, bsy $$2, int $$3) {
   }

   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
   }

   public Optional<crk> g(cua $$0) {
      return Optional.empty();
   }

   public wu n(cua $$0) {
      return wu.c(this.h($$0));
   }

   public boolean d_(cua $$0) {
      return $$0.A();
   }

   public boolean a(cua $$0) {
      return $$0.j() == 1 && $$0.b(kn.d);
   }

   protected static evv a(dcd $$0, cmh $$1, dbm.b $$2) {
      evz $$3 = $$1.bx();
      evz $$4 = $$3.e($$1.b($$1.dH(), $$1.dF()).a($$1.gy()));
      return $$0.a(new dbm($$3, $$4, dbm.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cua $$0, cua $$1) {
      return false;
   }

   @Deprecated
   public cwu j() {
      return cwu.a;
   }

   public boolean l(cua $$0) {
      return false;
   }

   public cua w() {
      return new cua(this);
   }

   public ave al_() {
      return avf.kc;
   }

   public ave am_() {
      return avf.kd;
   }

   public ave e() {
      return avf.nB;
   }

   public boolean an_() {
      return true;
   }

   @Override
   public cov i() {
      return this.l;
   }

   public static class a {
      private static final Interner<kj> a = Interners.newStrongInterner();
      @Nullable
      private kj.a b;
      @Nullable
      ctv c;
      cov d = cox.f;

      public ctv.a a(cpb $$0) {
         return this.a(kn.v, $$0);
      }

      public ctv.a a(int $$0) {
         return this.a(kn.c, $$0);
      }

      public ctv.a b(int $$0) {
         this.a(kn.d, $$0);
         this.a(kn.c, 1);
         this.a(kn.e, 0);
         return this;
      }

      public ctv.a a(ctv $$0) {
         this.c = $$0;
         return this;
      }

      public ctv.a a(cuu $$0) {
         return this.a(kn.j, $$0);
      }

      public ctv.a a() {
         return this.a(kn.w, azh.a);
      }

      public ctv.a a(cot... $$0) {
         this.d = cox.d.a($$0);
         return this;
      }

      public <T> ctv.a a(km<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = kj.a().a(kn.af);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public ctv.a a(cwu $$0) {
         return this.a(kn.n, $$0);
      }

      kj b() {
         kj $$0 = this.c();
         if ($$0.b(kn.e) && $$0.a(kn.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private kj c() {
         return this.b == null ? kn.af : (kj)a.intern(this.b.a());
      }
   }

   public interface b {
      ctv.b a = new ctv.b() {
         @Nullable
         @Override
         public jl.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public epq a(epo $$0) {
            return null;
         }
      };

      @Nullable
      jl.a a();

      float b();

      @Nullable
      epq a(epo var1);

      static ctv.b a(@Nullable final dcd $$0) {
         return $$0 == null ? a : new ctv.b() {
            @Override
            public jl.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epq a(epo $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static ctv.b a(final jl.a $$0) {
         return new ctv.b() {
            @Override
            public jl.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public epq a(epo $$0x) {
               return null;
            }
         };
      }
   }
}
