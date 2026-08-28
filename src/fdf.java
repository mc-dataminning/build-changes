import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fdf extends gvm {
   private static final akk a = new akk("icon/unseen_notification");
   private static final akk b = new akk("icon/news");
   private static final akk c = new akk("icon/invite");
   private static final akk A = new akk("icon/trial_available");
   private final CompletableFuture<Boolean> B = faq.a().thenApply($$0 -> $$0.a() == faq.b.a);
   @Nullable
   private fdv.c C;
   @Nullable
   private fdf.a D;
   private volatile int E;
   private static boolean F;
   private static boolean G;
   private static boolean H;
   private final fdf.a I = new fdf.a() {
      @Override
      public fdv.c a(fcm $$0) {
         fdv.c $$1 = $$0.a.a();
         fdf.this.a($$0, $$1);
         fdf.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fdf.a J = new fdf.a() {
      @Override
      public fdv.c a(fcm $$0) {
         fdv.c $$1 = $$0.a.a();
         fdf.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fdf() {
      super(fff.a);
   }

   @Override
   public void aO_() {
      if (this.C != null) {
         this.C.a();
      }
   }

   @Override
   public void aG_() {
      super.aG_();
      this.l.ba().b.a();
   }

   @Nullable
   private fdf.a E() {
      boolean $$0 = this.G() && this.B.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.F() ? this.I : this.J;
      }
   }

   @Override
   public void e() {
      fdf.a $$0 = this.E();
      if (!Objects.equals(this.D, $$0)) {
         this.D = $$0;
         if (this.D != null) {
            this.C = this.D.a(this.l.ba());
         } else {
            this.C = null;
         }
      }

      if (this.C != null) {
         this.C.b();
      }
   }

   private boolean F() {
      return this.l.m.T().c();
   }

   private boolean G() {
      return this.l.y instanceof fnf;
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.B.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fgz $$0) {
      int $$1 = this.E;
      int $$2 = 24;
      int $$3 = this.n / 4 + 48;
      int $$4 = this.m / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (H) {
         $$0.a(a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.D != null && this.D.a()) {
         if (G) {
            $$0.a(b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (F) {
            $$0.a(A, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(fcm $$0, fdv.c $$1) {
      $$1.a($$0.d, $$0x -> this.E = $$0x);
      $$1.a($$0.e, $$0x -> F = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         G = $$0.g.a();
      });
   }

   void b(fcm $$0, fdv.c $$1) {
      $$1.a($$0.b, $$0x -> {
         H = false;

         for (fbm $$1x : $$0x) {
            if (!$$1x.a()) {
               H = true;
               break;
            }
         }
      });
   }

   interface a {
      fdv.c a(fcm var1);

      boolean a();
   }
}
