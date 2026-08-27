import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class eoo extends gfb {
   private static final aew a = new aew("icon/unseen_notification");
   private static final aew b = new aew("icon/news");
   private static final aew c = new aew("icon/invite");
   private static final aew y = new aew("icon/trial_available");
   private final CompletableFuture<Boolean> z = elz.a().thenApply($$0 -> $$0.a() == elz.b.a);
   @Nullable
   private epe.c A;
   @Nullable
   private eoo.a B;
   private volatile int C;
   private static boolean D;
   private static boolean E;
   private static boolean F;
   private final eoo.a G = new eoo.a() {
      @Override
      public epe.c a(env $$0) {
         epe.c $$1 = $$0.a.a();
         eoo.this.a($$0, $$1);
         eoo.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final eoo.a H = new eoo.a() {
      @Override
      public epe.c a(env $$0) {
         epe.c $$1 = $$0.a.a();
         eoo.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public eoo() {
      super(eqn.a);
   }

   @Override
   public void aH_() {
      if (this.A != null) {
         this.A.a();
      }
   }

   @Override
   public void aA_() {
      super.aA_();
      this.f.aY().b.a();
   }

   @Nullable
   private eoo.a D() {
      boolean $$0 = this.F() && this.z.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.E() ? this.G : this.H;
      }
   }

   @Override
   public void c() {
      eoo.a $$0 = this.D();
      if (!Objects.equals(this.B, $$0)) {
         this.B = $$0;
         if (this.B != null) {
            this.A = this.B.a(this.f.aY());
         } else {
            this.A = null;
         }
      }

      if (this.A != null) {
         this.A.b();
      }
   }

   private boolean E() {
      return this.f.m.P().c();
   }

   private boolean F() {
      return this.f.y instanceof eyp;
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.z.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
   }

   private void c(esf $$0) {
      int $$1 = this.C;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      int $$4 = this.g / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (F) {
         $$0.a(a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.B != null && this.B.a()) {
         if (E) {
            $$0.a(b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (D) {
            $$0.a(y, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(env $$0, epe.c $$1) {
      $$1.a($$0.d, $$0x -> this.C = $$0x);
      $$1.a($$0.e, $$0x -> D = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         E = $$0.g.a();
      });
   }

   void b(env $$0, epe.c $$1) {
      $$1.a($$0.b, $$0x -> {
         F = false;

         for (emv $$1x : $$0x) {
            if (!$$1x.a()) {
               F = true;
               break;
            }
         }
      });
   }

   interface a {
      epe.c a(env var1);

      boolean a();
   }
}
