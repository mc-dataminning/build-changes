import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ezh extends grl {
   private static final ajt a = new ajt("icon/unseen_notification");
   private static final ajt b = new ajt("icon/news");
   private static final ajt c = new ajt("icon/invite");
   private static final ajt y = new ajt("icon/trial_available");
   private final CompletableFuture<Boolean> z = ews.a().thenApply($$0 -> $$0.a() == ews.b.a);
   @Nullable
   private ezx.c A;
   @Nullable
   private ezh.a B;
   private volatile int C;
   private static boolean D;
   private static boolean E;
   private static boolean F;
   private final ezh.a G = new ezh.a() {
      @Override
      public ezx.c a(eyo $$0) {
         ezx.c $$1 = $$0.a.a();
         ezh.this.a($$0, $$1);
         ezh.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final ezh.a H = new ezh.a() {
      @Override
      public ezx.c a(eyo $$0) {
         ezx.c $$1 = $$0.a.a();
         ezh.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public ezh() {
      super(fbh.a);
   }

   @Override
   public void aN_() {
      if (this.A != null) {
         this.A.a();
      }
   }

   @Override
   public void aG_() {
      super.aG_();
      this.j.bb().b.a();
   }

   @Nullable
   private ezh.a C() {
      boolean $$0 = this.E() && this.z.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.G : this.H;
      }
   }

   @Override
   public void e() {
      ezh.a $$0 = this.C();
      if (!Objects.equals(this.B, $$0)) {
         this.B = $$0;
         if (this.B != null) {
            this.A = this.B.a(this.j.bb());
         } else {
            this.A = null;
         }
      }

      if (this.A != null) {
         this.A.b();
      }
   }

   private boolean D() {
      return this.j.m.T().c();
   }

   private boolean E() {
      return this.j.y instanceof fjt;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.z.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fdc $$0) {
      int $$1 = this.C;
      int $$2 = 24;
      int $$3 = this.l / 4 + 48;
      int $$4 = this.k / 2 + 100;
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

   void a(eyo $$0, ezx.c $$1) {
      $$1.a($$0.d, $$0x -> this.C = $$0x);
      $$1.a($$0.e, $$0x -> D = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         E = $$0.g.a();
      });
   }

   void b(eyo $$0, ezx.c $$1) {
      $$1.a($$0.b, $$0x -> {
         F = false;

         for (exo $$1x : $$0x) {
            if (!$$1x.a()) {
               F = true;
               break;
            }
         }
      });
   }

   interface a {
      ezx.c a(eyo var1);

      boolean a();
   }
}
