import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class esy extends gkn {
   private static final ahg a = new ahg("icon/unseen_notification");
   private static final ahg b = new ahg("icon/news");
   private static final ahg c = new ahg("icon/invite");
   private static final ahg v = new ahg("icon/trial_available");
   private final CompletableFuture<Boolean> w = eqj.a().thenApply($$0 -> $$0.a() == eqj.b.a);
   @Nullable
   private eto.c x;
   @Nullable
   private esy.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final esy.a D = new esy.a() {
      @Override
      public eto.c a(esf $$0) {
         eto.c $$1 = $$0.a.a();
         esy.this.a($$0, $$1);
         esy.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final esy.a E = new esy.a() {
      @Override
      public eto.c a(esf $$0) {
         eto.c $$1 = $$0.a.a();
         esy.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public esy() {
      super(euy.a);
   }

   @Override
   public void aN_() {
      if (this.x != null) {
         this.x.a();
      }
   }

   @Override
   public void aF_() {
      super.aF_();
      this.f.aY().b.a();
   }

   @Nullable
   private esy.a C() {
      boolean $$0 = this.E() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.D : this.E;
      }
   }

   @Override
   public void d() {
      esy.a $$0 = this.C();
      if (!Objects.equals(this.y, $$0)) {
         this.y = $$0;
         if (this.y != null) {
            this.x = this.y.a(this.f.aY());
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
      return this.f.y instanceof fde;
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
   }

   private void c(ews $$0) {
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

   void a(esf $$0, eto.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(esf $$0, eto.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (erf $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      eto.c a(esf var1);

      boolean a();
   }
}
