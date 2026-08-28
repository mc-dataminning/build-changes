import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fhy extends hfq {
   private static final alj a = alj.b("icon/unseen_notification");
   private static final alj b = alj.b("icon/news");
   private static final alj c = alj.b("icon/invite");
   private static final alj B = alj.b("icon/trial_available");
   private final CompletableFuture<Boolean> C = ffb.a().thenApply($$0 -> $$0.a() == ffb.b.a);
   @Nullable
   private fin.c D;
   @Nullable
   private fhy.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fhy.a J = new fhy.a() {
      @Override
      public fin.c a(fhf $$0) {
         fin.c $$1 = $$0.a.a();
         fhy.this.a($$0, $$1);
         fhy.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fhy.a K = new fhy.a() {
      @Override
      public fin.c a(fhf $$0) {
         fin.c $$1 = $$0.a.a();
         fhy.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fhy() {
      super(fjv.a);
   }

   @Override
   public void aR_() {
      if (this.D != null) {
         this.D.a();
      }
   }

   @Override
   public void aI_() {
      super.aI_();
      this.m.bc().b.a();
   }

   @Nullable
   private fhy.a F() {
      boolean $$0 = this.J() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.G() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fhy.a $$0 = this.F();
      if (!Objects.equals(this.E, $$0)) {
         this.E = $$0;
         if (this.E != null) {
            this.D = this.E.a(this.m.bc());
         } else {
            this.D = null;
         }
      }

      if (this.D != null) {
         this.D.b();
      }
   }

   private boolean G() {
      return this.m.n.V().c();
   }

   private boolean J() {
      return this.m.z instanceof fry;
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
   }

   private void c(flq $$0) {
      int $$1 = this.F;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      int $$4 = this.n / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (I) {
         $$0.a(gjq::B, a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.E != null && this.E.a()) {
         if (H) {
            $$0.a(gjq::B, b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(gjq::B, c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (G) {
            $$0.a(gjq::B, B, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(fhf $$0, fin.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         H = $$0.h.a();
      });
   }

   void b(fhf $$0, fin.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (fgh $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fin.c a(fhf var1);

      boolean a();
   }
}
