import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ess extends gkc {
   private static final ahd a = new ahd("icon/unseen_notification");
   private static final ahd b = new ahd("icon/news");
   private static final ahd c = new ahd("icon/invite");
   private static final ahd v = new ahd("icon/trial_available");
   private final CompletableFuture<Boolean> w = eqd.a().thenApply($$0 -> $$0.a() == eqd.b.a);
   @Nullable
   private eti.c x;
   @Nullable
   private ess.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final ess.a D = new ess.a() {
      @Override
      public eti.c a(erz $$0) {
         eti.c $$1 = $$0.a.a();
         ess.this.a($$0, $$1);
         ess.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final ess.a E = new ess.a() {
      @Override
      public eti.c a(erz $$0) {
         eti.c $$1 = $$0.a.a();
         ess.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public ess() {
      super(eus.a);
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
      this.f.aX().b.a();
   }

   @Nullable
   private ess.a C() {
      boolean $$0 = this.E() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.D : this.E;
      }
   }

   @Override
   public void d() {
      ess.a $$0 = this.C();
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
      return this.f.y instanceof fcy;
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
   }

   private void c(ewm $$0) {
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

   void a(erz $$0, eti.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(erz $$0, eti.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (eqz $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      eti.c a(erz var1);

      boolean a();
   }
}
