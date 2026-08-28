import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fef extends gwq {
   private static final akr a = akr.b("icon/unseen_notification");
   private static final akr b = akr.b("icon/news");
   private static final akr c = akr.b("icon/invite");
   private static final akr B = akr.b("icon/trial_available");
   private final CompletableFuture<Boolean> C = fbs.a().thenApply($$0 -> $$0.a() == fbs.b.a);
   @Nullable
   private fev.c D;
   @Nullable
   private fef.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fef.a J = new fef.a() {
      @Override
      public fev.c a(fdm $$0) {
         fev.c $$1 = $$0.a.a();
         fef.this.a($$0, $$1);
         fef.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fef.a K = new fef.a() {
      @Override
      public fev.c a(fdm $$0) {
         fev.c $$1 = $$0.a.a();
         fef.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fef() {
      super(fgg.a);
   }

   @Override
   public void aT_() {
      if (this.D != null) {
         this.D.a();
      }
   }

   @Override
   public void aL_() {
      super.aL_();
      this.l.aY().b.a();
   }

   @Nullable
   private fef.a C() {
      boolean $$0 = this.E() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fef.a $$0 = this.C();
      if (!Objects.equals(this.E, $$0)) {
         this.E = $$0;
         if (this.E != null) {
            this.D = this.E.a(this.l.aY());
         } else {
            this.D = null;
         }
      }

      if (this.D != null) {
         this.D.b();
      }
   }

   private boolean D() {
      return this.l.m.T().c();
   }

   private boolean E() {
      return this.l.y instanceof fof;
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fhz $$0) {
      int $$1 = this.F;
      int $$2 = 24;
      int $$3 = this.n / 4 + 48;
      int $$4 = this.m / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (I) {
         $$0.a(a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.E != null && this.E.a()) {
         if (H) {
            $$0.a(b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (G) {
            $$0.a(B, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(fdm $$0, fev.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         H = $$0.h.a();
      });
   }

   void b(fdm $$0, fev.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (fco $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fev.c a(fdm var1);

      boolean a();
   }
}
