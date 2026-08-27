import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fbt extends gty {
   private static final akn a = new akn("icon/unseen_notification");
   private static final akn b = new akn("icon/news");
   private static final akn c = new akn("icon/invite");
   private static final akn B = new akn("icon/trial_available");
   private final CompletableFuture<Boolean> C = eze.a().thenApply($$0 -> $$0.a() == eze.b.a);
   @Nullable
   private fcj.c D;
   @Nullable
   private fbt.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fbt.a J = new fbt.a() {
      @Override
      public fcj.c a(fba $$0) {
         fcj.c $$1 = $$0.a.a();
         fbt.this.a($$0, $$1);
         fbt.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fbt.a K = new fbt.a() {
      @Override
      public fcj.c a(fba $$0) {
         fcj.c $$1 = $$0.a.a();
         fbt.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fbt() {
      super(fdt.a);
   }

   @Override
   public void aN_() {
      if (this.D != null) {
         this.D.a();
      }
   }

   @Override
   public void aG_() {
      super.aG_();
      this.m.ba().b.a();
   }

   @Nullable
   private fbt.a C() {
      boolean $$0 = this.E() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fbt.a $$0 = this.C();
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

   private boolean D() {
      return this.m.m.T().c();
   }

   private boolean E() {
      return this.m.y instanceof fme;
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
   }

   private void c(ffn $$0) {
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

   void a(fba $$0, fcj.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         H = $$0.g.a();
      });
   }

   void b(fba $$0, fcj.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (faa $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fcj.c a(fba var1);

      boolean a();
   }
}
