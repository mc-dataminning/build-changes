import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class eog extends ged {
   private static final aep a = new aep("icon/unseen_notification");
   private static final aep b = new aep("icon/news");
   private static final aep c = new aep("icon/invite");
   private static final aep y = new aep("icon/trial_available");
   private final CompletableFuture<Boolean> z = elr.a().thenApply($$0 -> $$0.a() == elr.b.a);
   @Nullable
   private eow.c A;
   @Nullable
   private eog.a B;
   private volatile int C;
   private static boolean D;
   private static boolean E;
   private static boolean F;
   private final eog.a G = new eog.a() {
      @Override
      public eow.c a(eno $$0) {
         eow.c $$1 = $$0.a.a();
         eog.this.a($$0, $$1);
         eog.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final eog.a H = new eog.a() {
      @Override
      public eow.c a(eno $$0) {
         eow.c $$1 = $$0.a.a();
         eog.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public eog() {
      super(eqf.a);
   }

   @Override
   public void aE_() {
      if (this.A != null) {
         this.A.a();
      }
   }

   @Override
   public void av_() {
      super.av_();
      this.f.aX().b.a();
   }

   @Nullable
   private eog.a B() {
      boolean $$0 = this.D() && this.z.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.C() ? this.G : this.H;
      }
   }

   @Override
   public void c() {
      eog.a $$0 = this.B();
      if (!Objects.equals(this.B, $$0)) {
         this.B = $$0;
         if (this.B != null) {
            this.A = this.B.a(this.f.aX());
         } else {
            this.A = null;
         }
      }

      if (this.A != null) {
         this.A.b();
      }
   }

   private boolean C() {
      return this.f.m.O().c();
   }

   private boolean D() {
      return this.f.z instanceof eya;
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.z.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
   }

   private void c(erx $$0) {
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

   void a(eno $$0, eow.c $$1) {
      $$1.a($$0.e, $$0x -> this.C = $$0x);
      $$1.a($$0.f, $$0x -> D = $$0x);
      $$1.a($$0.g, $$1x -> {
         $$0.h.a($$1x);
         E = $$0.h.a();
      });
   }

   void b(eno $$0, eow.c $$1) {
      $$1.a($$0.b, $$0x -> {
         F = false;

         for (emn $$1x : $$0x) {
            if (!$$1x.a()) {
               F = true;
               break;
            }
         }
      });
   }

   interface a {
      eow.c a(eno var1);

      boolean a();
   }
}
