import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class etj extends gld {
   private static final ahh a = new ahh("icon/unseen_notification");
   private static final ahh b = new ahh("icon/news");
   private static final ahh c = new ahh("icon/invite");
   private static final ahh v = new ahh("icon/trial_available");
   private final CompletableFuture<Boolean> w = equ.a().thenApply($$0 -> $$0.a() == equ.b.a);
   @Nullable
   private etz.c x;
   @Nullable
   private etj.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final etj.a D = new etj.a() {
      @Override
      public etz.c a(esq $$0) {
         etz.c $$1 = $$0.a.a();
         etj.this.a($$0, $$1);
         etj.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final etj.a E = new etj.a() {
      @Override
      public etz.c a(esq $$0) {
         etz.c $$1 = $$0.a.a();
         etj.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public etj() {
      super(evj.a);
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
      this.f.aZ().b.a();
   }

   @Nullable
   private etj.a E() {
      boolean $$0 = this.I() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.H() ? this.D : this.E;
      }
   }

   @Override
   public void e() {
      etj.a $$0 = this.E();
      if (!Objects.equals(this.y, $$0)) {
         this.y = $$0;
         if (this.y != null) {
            this.x = this.y.a(this.f.aZ());
         } else {
            this.x = null;
         }
      }

      if (this.x != null) {
         this.x.b();
      }
   }

   private boolean H() {
      return this.f.m.Q().c();
   }

   private boolean I() {
      return this.f.y instanceof fdr;
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
   }

   private void c(exe $$0) {
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

   void a(esq $$0, etz.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(esq $$0, etz.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (erq $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      etz.c a(esq var1);

      boolean a();
   }
}
