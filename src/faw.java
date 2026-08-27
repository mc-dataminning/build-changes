import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class faw extends gtb {
   private static final akh a = new akh("icon/unseen_notification");
   private static final akh b = new akh("icon/news");
   private static final akh c = new akh("icon/invite");
   private static final akh B = new akh("icon/trial_available");
   private final CompletableFuture<Boolean> C = eyh.a().thenApply($$0 -> $$0.a() == eyh.b.a);
   @Nullable
   private fbm.c D;
   @Nullable
   private faw.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final faw.a J = new faw.a() {
      @Override
      public fbm.c a(fad $$0) {
         fbm.c $$1 = $$0.a.a();
         faw.this.a($$0, $$1);
         faw.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final faw.a K = new faw.a() {
      @Override
      public fbm.c a(fad $$0) {
         fbm.c $$1 = $$0.a.a();
         faw.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public faw() {
      super(fcw.a);
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
      this.m.bc().b.a();
   }

   @Nullable
   private faw.a C() {
      boolean $$0 = this.E() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      faw.a $$0 = this.C();
      if (!Objects.equals(this.E, $$0)) {
         this.E = $$0;
         if (this.E != null) {
            this.D = this.E.a(this.m.bc());
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
      return this.m.y instanceof fli;
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fer $$0) {
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

   void a(fad $$0, fbm.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         H = $$0.g.a();
      });
   }

   void b(fad $$0, fbm.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (ezd $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fbm.c a(fad var1);

      boolean a();
   }
}
