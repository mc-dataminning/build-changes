import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fcx extends gvg {
   private static final alf a = new alf("icon/unseen_notification");
   private static final alf b = new alf("icon/news");
   private static final alf c = new alf("icon/invite");
   private static final alf B = new alf("icon/trial_available");
   private final CompletableFuture<Boolean> C = fai.a().thenApply($$0 -> $$0.a() == fai.b.a);
   @Nullable
   private fdn.c D;
   @Nullable
   private fcx.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fcx.a J = new fcx.a() {
      @Override
      public fdn.c a(fce $$0) {
         fdn.c $$1 = $$0.a.a();
         fcx.this.a($$0, $$1);
         fcx.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fcx.a K = new fcx.a() {
      @Override
      public fdn.c a(fce $$0) {
         fdn.c $$1 = $$0.a.a();
         fcx.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fcx() {
      super(fex.a);
   }

   @Override
   public void aM_() {
      if (this.D != null) {
         this.D.a();
      }
   }

   @Override
   public void aE_() {
      super.aE_();
      this.m.ba().b.a();
   }

   @Nullable
   private fcx.a E() {
      boolean $$0 = this.I() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.F() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fcx.a $$0 = this.E();
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

   private boolean F() {
      return this.m.m.T().c();
   }

   private boolean I() {
      return this.m.y instanceof fni;
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fgr $$0) {
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

   void a(fce $$0, fdn.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         H = $$0.g.a();
      });
   }

   void b(fce $$0, fdn.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (fbe $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fdn.c a(fce var1);

      boolean a();
   }
}
