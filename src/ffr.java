import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ffr extends hct {
   private static final alb a = alb.b("icon/unseen_notification");
   private static final alb b = alb.b("icon/news");
   private static final alb c = alb.b("icon/invite");
   private static final alb B = alb.b("icon/trial_available");
   private final CompletableFuture<Boolean> C = fde.a().thenApply($$0 -> $$0.a() == fde.b.a);
   @Nullable
   private fgh.c D;
   @Nullable
   private ffr.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final ffr.a J = new ffr.a() {
      @Override
      public fgh.c a(fey $$0) {
         fgh.c $$1 = $$0.a.a();
         ffr.this.a($$0, $$1);
         ffr.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final ffr.a K = new ffr.a() {
      @Override
      public fgh.c a(fey $$0) {
         fgh.c $$1 = $$0.a.a();
         ffr.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public ffr() {
      super(fhs.a);
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
      this.m.bb().b.a();
   }

   @Nullable
   private ffr.a D() {
      boolean $$0 = this.F() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.E() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      ffr.a $$0 = this.D();
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

   private boolean E() {
      return this.m.n.V().c();
   }

   private boolean F() {
      return this.m.z instanceof fpv;
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fjn $$0) {
      int $$1 = this.F;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      int $$4 = this.n / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (I) {
         $$0.a(ghe::C, a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.E != null && this.E.a()) {
         if (H) {
            $$0.a(ghe::C, b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(ghe::C, c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (G) {
            $$0.a(ghe::C, B, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(fey $$0, fgh.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         H = $$0.h.a();
      });
   }

   void b(fey $$0, fgh.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (fea $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fgh.c a(fey var1);

      boolean a();
   }
}
