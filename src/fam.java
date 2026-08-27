import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fam extends gsq {
   private static final akf a = new akf("icon/unseen_notification");
   private static final akf b = new akf("icon/news");
   private static final akf c = new akf("icon/invite");
   private static final akf B = new akf("icon/trial_available");
   private final CompletableFuture<Boolean> C = exx.a().thenApply($$0 -> $$0.a() == exx.b.a);
   @Nullable
   private fbc.c D;
   @Nullable
   private fam.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fam.a J = new fam.a() {
      @Override
      public fbc.c a(ezt $$0) {
         fbc.c $$1 = $$0.a.a();
         fam.this.a($$0, $$1);
         fam.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fam.a K = new fam.a() {
      @Override
      public fbc.c a(ezt $$0) {
         fbc.c $$1 = $$0.a.a();
         fam.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fam() {
      super(fcm.a);
   }

   @Override
   public void aM_() {
      if (this.D != null) {
         this.D.a();
      }
   }

   @Override
   public void aF_() {
      super.aF_();
      this.m.bb().b.a();
   }

   @Nullable
   private fam.a C() {
      boolean $$0 = this.E() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fam.a $$0 = this.C();
      if (!Objects.equals(this.E, $$0)) {
         this.E = $$0;
         if (this.E != null) {
            this.D = this.E.a(this.m.bb());
         } else {
            this.D = null;
         }
      }

      if (this.D != null) {
         this.D.b();
      }
   }

   private boolean D() {
      return this.m.m.T().c();
   }

   private boolean E() {
      return this.m.y instanceof fky;
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
   }

   private void c(feh $$0) {
      int $$1 = this.F;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      int $$4 = this.n / 2 + 100;
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

   void a(ezt $$0, fbc.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         H = $$0.g.a();
      });
   }

   void b(ezt $$0, fbc.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (eyt $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fbc.c a(ezt var1);

      boolean a();
   }
}
