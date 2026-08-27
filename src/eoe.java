import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class eoe extends ger {
   private static final aer a = new aer("icon/unseen_notification");
   private static final aer b = new aer("icon/news");
   private static final aer c = new aer("icon/invite");
   private static final aer y = new aer("icon/trial_available");
   private final CompletableFuture<Boolean> z = elp.a().thenApply($$0 -> $$0.a() == elp.b.a);
   @Nullable
   private eou.c A;
   @Nullable
   private eoe.a B;
   private volatile int C;
   private static boolean D;
   private static boolean E;
   private static boolean F;
   private final eoe.a G = new eoe.a() {
      @Override
      public eou.c a(enm $$0) {
         eou.c $$1 = $$0.a.a();
         eoe.this.a($$0, $$1);
         eoe.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final eoe.a H = new eoe.a() {
      @Override
      public eou.c a(enm $$0) {
         eou.c $$1 = $$0.a.a();
         eoe.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public eoe() {
      super(eqd.a);
   }

   @Override
   public void aC_() {
      if (this.A != null) {
         this.A.a();
      }
   }

   @Override
   public void au_() {
      super.au_();
      this.f.aY().b.a();
   }

   @Nullable
   private eoe.a C() {
      boolean $$0 = this.E() && this.z.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.G : this.H;
      }
   }

   @Override
   public void c() {
      eoe.a $$0 = this.C();
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

   private boolean D() {
      return this.f.m.P().c();
   }

   private boolean E() {
      return this.f.y instanceof eyf;
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.z.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
   }

   private void c(erv $$0) {
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

   void a(enm $$0, eou.c $$1) {
      $$1.a($$0.e, $$0x -> this.C = $$0x);
      $$1.a($$0.f, $$0x -> D = $$0x);
      $$1.a($$0.g, $$1x -> {
         $$0.h.a($$1x);
         E = $$0.h.a();
      });
   }

   void b(enm $$0, eou.c $$1) {
      $$1.a($$0.b, $$0x -> {
         F = false;

         for (eml $$1x : $$0x) {
            if (!$$1x.a()) {
               F = true;
               break;
            }
         }
      });
   }

   interface a {
      eou.c a(enm var1);

      boolean a();
   }
}
