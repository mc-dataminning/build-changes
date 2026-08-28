import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fgq extends hee {
   private static final alh a = alh.b("icon/unseen_notification");
   private static final alh b = alh.b("icon/news");
   private static final alh c = alh.b("icon/invite");
   private static final alh B = alh.b("icon/trial_available");
   private final CompletableFuture<Boolean> C = fed.a().thenApply($$0 -> $$0.a() == fed.b.a);
   @Nullable
   private fhg.c D;
   @Nullable
   private fgq.a E;
   private volatile int F;
   private static boolean G;
   private static boolean H;
   private static boolean I;
   private final fgq.a J = new fgq.a() {
      @Override
      public fhg.c a(ffx $$0) {
         fhg.c $$1 = $$0.a.a();
         fgq.this.a($$0, $$1);
         fgq.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final fgq.a K = new fgq.a() {
      @Override
      public fhg.c a(ffx $$0) {
         fhg.c $$1 = $$0.a.a();
         fgq.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public fgq() {
      super(fir.a);
   }

   @Override
   public void aS_() {
      if (this.D != null) {
         this.D.a();
      }
   }

   @Override
   public void aK_() {
      super.aK_();
      this.m.bd().b.a();
   }

   @Nullable
   private fgq.a D() {
      boolean $$0 = this.F() && this.C.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.E() ? this.J : this.K;
      }
   }

   @Override
   public void e() {
      fgq.a $$0 = this.D();
      if (!Objects.equals(this.E, $$0)) {
         this.E = $$0;
         if (this.E != null) {
            this.D = this.E.a(this.m.bd());
         } else {
            this.D = null;
         }
      }

      if (this.D != null) {
         this.D.b();
      }
   }

   private boolean E() {
      return this.m.n.V().c();
   }

   private boolean F() {
      return this.m.z instanceof fqu;
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.C.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fkm $$0) {
      int $$1 = this.F;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      int $$4 = this.n / 2 + 100;
      int $$5 = $$3 + 48 + 2;
      int $$6 = $$4 - 3;
      if (I) {
         $$0.a(gig::B, a, $$6 - 12, $$5 + 3, 10, 10);
         $$6 -= 16;
      }

      if (this.E != null && this.E.a()) {
         if (H) {
            $$0.a(gig::B, b, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if ($$1 != 0) {
            $$0.a(gig::B, c, $$6 - 14, $$5 + 1, 14, 14);
            $$6 -= 16;
         }

         if (G) {
            $$0.a(gig::B, B, $$6 - 10, $$5 + 4, 8, 8);
         }
      }
   }

   void a(ffx $$0, fhg.c $$1) {
      $$1.a($$0.d, $$0x -> this.F = $$0x);
      $$1.a($$0.e, $$0x -> G = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.h.a($$1x);
         H = $$0.h.a();
      });
   }

   void b(ffx $$0, fhg.c $$1) {
      $$1.a($$0.b, $$0x -> {
         I = false;

         for (fez $$1x : $$0x) {
            if (!$$1x.a()) {
               I = true;
               break;
            }
         }
      });
   }

   interface a {
      fhg.c a(ffx var1);

      boolean a();
   }
}
