import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fjz extends hmd {
   private static final aku a = aku.b("icon/unseen_notification");
   private static final aku b = aku.b("icon/news");
   private static final aku c = aku.b("icon/invite");
   private static final aku C = aku.b("icon/trial_available");
   private final CompletableFuture<Boolean> D = fhb.a().thenApply($$0 -> $$0.a() == fhb.b.a);
   @Nullable
   private fko.c E;
   @Nullable
   private fjz.a F;
   private volatile int G;
   private static boolean H;
   private static boolean I;
   private static boolean J;
   private final fjz.a K = new fjz.a() {
      @Override
      public fko.c a(fjg $$0) {
         fko.c $$1 = $$0.a.a();
         fjz.this.a($$0, $$1);
         fjz.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fjz.a L = new fjz.a() {
      @Override
      public fko.c a(fjg $$0) {
         fko.c $$1 = $$0.a.a();
         fjz.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fjz() {
      super(flx.a);
   }

   @Override
   public void aR_() {
      if (this.E != null) {
         this.E.a();
      }
   }

   @Override
   public void aJ_() {
      super.aJ_();
      this.m.bb().b.a();
   }

   @Nullable
   private fjz.a E() {
      boolean $$0 = this.G() && this.D.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.F() ? this.K : this.L;
      }
   }

   @Override
   public void e() {
      fjz.a $$0 = this.E();
      if (!Objects.equals(this.F, $$0)) {
         this.F = $$0;
         if (this.F != null) {
            this.E = this.F.a(this.m.bb());
         } else {
            this.E = null;
         }
      }

      if (this.E != null) {
         this.E.b();
      }
   }

   private boolean F() {
      return this.m.n.W().c();
   }

   private boolean G() {
      return this.m.z instanceof fvk;
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.D.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fpc $$0) {
      int $$1 = this.G;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      int $$4 = this.n / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (J) {
         $$0.a(gnh::H, a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.F != null && this.F.a()) {
         if (I) {
            $$0.a(gnh::H, b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(gnh::H, c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (H) {
            $$0.a(gnh::H, C, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(fjg $$0, fko.c $$1) {
      $$1.a($$0.d, $$0x -> this.G = $$0x);
      $$1.a($$0.e, $$0x -> H = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         I = $$0.h.a();
      });
   }

   void b(fjg $$0, fko.c $$1) {
      $$1.a($$0.b, $$0x -> {
         J = false;

         for (fih $$1x : $$0x) {
            if (!$$1x.a()) {
               J = true;
               break;
            }
         }
      });
   }

   interface a {
      fko.c a(fjg var1);

      boolean a();
   }
}
