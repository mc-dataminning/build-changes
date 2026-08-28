import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fcv extends gve {
   private static final ale a = new ale("icon/unseen_notification");
   private static final ale b = new ale("icon/news");
   private static final ale c = new ale("icon/invite");
   private static final ale B = new ale("icon/trial_available");
   private final CompletableFuture<Boolean> C = fag.a().thenApply($$0 -> $$0.a() == fag.b.a);
   @Nullable
   private fdl.c D;
   @Nullable
   private fcv.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fcv.a J = new fcv.a() {
      @Override
      public fdl.c a(fcc $$0) {
         fdl.c $$1 = $$0.a.a();
         fcv.this.a($$0, $$1);
         fcv.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fcv.a K = new fcv.a() {
      @Override
      public fdl.c a(fcc $$0) {
         fdl.c $$1 = $$0.a.a();
         fcv.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fcv() {
      super(fev.a);
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
      this.m.ba().b.a();
   }

   @Nullable
   private fcv.a D() {
      boolean $$0 = this.F() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.E() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fcv.a $$0 = this.D();
      if (!Objects.equals(this.E, $$0)) {
         this.E = $$0;
         if (this.E != null) {
            this.D = this.E.a(this.m.ba());
         } else {
            this.D = null;
         }
      }

      if (this.D != null) {
         this.D.b();
      }
   }

   private boolean E() {
      return this.m.m.T().c();
   }

   private boolean F() {
      return this.m.y instanceof fng;
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fgp $$0) {
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

   void a(fcc $$0, fdl.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         H = $$0.g.a();
      });
   }

   void b(fcc $$0, fdl.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (fbc $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fdl.c a(fcc var1);

      boolean a();
   }
}
