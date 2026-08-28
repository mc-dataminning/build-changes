import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fdz extends gwj {
   private static final akq a = akq.b("icon/unseen_notification");
   private static final akq b = akq.b("icon/news");
   private static final akq c = akq.b("icon/invite");
   private static final akq A = akq.b("icon/trial_available");
   private final CompletableFuture<Boolean> B = fbm.a().thenApply($$0 -> $$0.a() == fbm.b.a);
   @Nullable
   private fep.c C;
   @Nullable
   private fdz.a D;
   private volatile int E;
   private static boolean F;
   private static boolean G;
   private static boolean H;
   private final fdz.a I = new fdz.a() {
      @Override
      public fep.c a(fdg $$0) {
         fep.c $$1 = $$0.a.a();
         fdz.this.a($$0, $$1);
         fdz.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fdz.a J = new fdz.a() {
      @Override
      public fep.c a(fdg $$0) {
         fep.c $$1 = $$0.a.a();
         fdz.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fdz() {
      super(fga.a);
   }

   @Override
   public void aP_() {
      if (this.C != null) {
         this.C.a();
      }
   }

   @Override
   public void aH_() {
      super.aH_();
      this.l.aY().b.a();
   }

   @Nullable
   private fdz.a D() {
      boolean $$0 = this.F() && this.B.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.E() ? this.I : this.J;
      }
   }

   @Override
   public void e() {
      fdz.a $$0 = this.D();
      if (!Objects.equals(this.D, $$0)) {
         this.D = $$0;
         if (this.D != null) {
            this.C = this.D.a(this.l.aY());
         } else {
            this.C = null;
         }
      }

      if (this.C != null) {
         this.C.b();
      }
   }

   private boolean E() {
      return this.l.m.T().c();
   }

   private boolean F() {
      return this.l.y instanceof fnz;
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.B.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fht $$0) {
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

   void a(fdg $$0, fep.c $$1) {
      $$1.a($$0.d, $$0x -> this.E = $$0x);
      $$1.a($$0.e, $$0x -> F = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         G = $$0.h.a();
      });
   }

   void b(fdg $$0, fep.c $$1) {
      $$1.a($$0.b, $$0x -> {
         H = false;

         for (fci $$1x : $$0x) {
            if (!$$1x.a()) {
               H = true;
               break;
            }
         }
      });
   }

   interface a {
      fep.c a(fdg var1);

      boolean a();
   }
}
