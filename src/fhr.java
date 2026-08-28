import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fhr extends hff {
   private static final all a = all.b("icon/unseen_notification");
   private static final all b = all.b("icon/news");
   private static final all c = all.b("icon/invite");
   private static final all B = all.b("icon/trial_available");
   private final CompletableFuture<Boolean> C = feu.a().thenApply($$0 -> $$0.a() == feu.b.a);
   @Nullable
   private fig.c D;
   @Nullable
   private fhr.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fhr.a J = new fhr.a() {
      @Override
      public fig.c a(fgy $$0) {
         fig.c $$1 = $$0.a.a();
         fhr.this.a($$0, $$1);
         fhr.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fhr.a K = new fhr.a() {
      @Override
      public fig.c a(fgy $$0) {
         fig.c $$1 = $$0.a.a();
         fhr.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fhr() {
      super(fjo.a);
   }

   @Override
   public void aS_() {
      if (this.D != null) {
         this.D.a();
      }
   }

   @Override
   public void aJ_() {
      super.aJ_();
      this.m.bc().b.a();
   }

   @Nullable
   private fhr.a D() {
      boolean $$0 = this.F() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.E() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fhr.a $$0 = this.D();
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

   private boolean E() {
      return this.m.n.V().c();
   }

   private boolean F() {
      return this.m.z instanceof frr;
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
   }

   private void c(flj $$0) {
      int $$1 = this.F;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      int $$4 = this.n / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (I) {
         $$0.a(gjh::B, a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.E != null && this.E.a()) {
         if (H) {
            $$0.a(gjh::B, b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(gjh::B, c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (G) {
            $$0.a(gjh::B, B, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(fgy $$0, fig.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         H = $$0.h.a();
      });
   }

   void b(fgy $$0, fig.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (fga $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fig.c a(fgy var1);

      boolean a();
   }
}
