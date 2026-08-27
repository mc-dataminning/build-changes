import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class esc extends gjl {
   private static final agt a = new agt("icon/unseen_notification");
   private static final agt b = new agt("icon/news");
   private static final agt c = new agt("icon/invite");
   private static final agt v = new agt("icon/trial_available");
   private final CompletableFuture<Boolean> w = epn.a().thenApply($$0 -> $$0.a() == epn.b.a);
   @Nullable
   private ess.c x;
   @Nullable
   private esc.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final esc.a D = new esc.a() {
      @Override
      public ess.c a(erj $$0) {
         ess.c $$1 = $$0.a.a();
         esc.this.a($$0, $$1);
         esc.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final esc.a E = new esc.a() {
      @Override
      public ess.c a(erj $$0) {
         ess.c $$1 = $$0.a.a();
         esc.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public esc() {
      super(euc.a);
   }

   @Override
   public void aP_() {
      if (this.x != null) {
         this.x.a();
      }
   }

   @Override
   public void aH_() {
      super.aH_();
      this.f.aX().b.a();
   }

   @Nullable
   private esc.a C() {
      boolean $$0 = this.E() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.D : this.E;
      }
   }

   @Override
   public void d() {
      esc.a $$0 = this.C();
      if (!Objects.equals(this.y, $$0)) {
         this.y = $$0;
         if (this.y != null) {
            this.x = this.y.a(this.f.aX());
         } else {
            this.x = null;
         }
      }

      if (this.x != null) {
         this.x.b();
      }
   }

   private boolean D() {
      return this.f.m.Q().c();
   }

   private boolean E() {
      return this.f.y instanceof fch;
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
   }

   private void c(evw $$0) {
      int $$1 = this.z;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      int $$4 = this.g / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (C) {
         $$0.a(a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.y != null && this.y.a()) {
         if (B) {
            $$0.a(b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (A) {
            $$0.a(v, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(erj $$0, ess.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(erj $$0, ess.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (eqj $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      ess.c a(erj var1);

      boolean a();
   }
}
