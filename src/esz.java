import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class esz extends gko {
   private static final ahg a = new ahg("icon/unseen_notification");
   private static final ahg b = new ahg("icon/news");
   private static final ahg c = new ahg("icon/invite");
   private static final ahg v = new ahg("icon/trial_available");
   private final CompletableFuture<Boolean> w = eqk.a().thenApply($$0 -> $$0.a() == eqk.b.a);
   @Nullable
   private etp.c x;
   @Nullable
   private esz.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final esz.a D = new esz.a() {
      @Override
      public etp.c a(esg $$0) {
         etp.c $$1 = $$0.a.a();
         esz.this.a($$0, $$1);
         esz.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final esz.a E = new esz.a() {
      @Override
      public etp.c a(esg $$0) {
         etp.c $$1 = $$0.a.a();
         esz.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public esz() {
      super(euz.a);
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
   private esz.a D() {
      boolean $$0 = this.H() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.E() ? this.D : this.E;
      }
   }

   @Override
   public void d() {
      esz.a $$0 = this.D();
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

   private boolean E() {
      return this.f.m.Q().c();
   }

   private boolean H() {
      return this.f.y instanceof fdf;
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
   }

   private void c(ewt $$0) {
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

   void a(esg $$0, etp.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(esg $$0, etp.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (erg $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      etp.c a(esg var1);

      boolean a();
   }
}
