import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ewc extends gob {
   private static final ajc a = new ajc("icon/unseen_notification");
   private static final ajc b = new ajc("icon/news");
   private static final ajc c = new ajc("icon/invite");
   private static final ajc v = new ajc("icon/trial_available");
   private final CompletableFuture<Boolean> w = etn.a().thenApply($$0 -> $$0.a() == etn.b.a);
   @Nullable
   private ews.c x;
   @Nullable
   private ewc.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final ewc.a D = new ewc.a() {
      @Override
      public ews.c a(evj $$0) {
         ews.c $$1 = $$0.a.a();
         ewc.this.a($$0, $$1);
         ewc.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final ewc.a E = new ewc.a() {
      @Override
      public ews.c a(evj $$0) {
         ews.c $$1 = $$0.a.a();
         ewc.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public ewc() {
      super(eyc.a);
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
      this.f.ba().b.a();
   }

   @Nullable
   private ewc.a E() {
      boolean $$0 = this.I() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.H() ? this.D : this.E;
      }
   }

   @Override
   public void e() {
      ewc.a $$0 = this.E();
      if (!Objects.equals(this.y, $$0)) {
         this.y = $$0;
         if (this.y != null) {
            this.x = this.y.a(this.f.ba());
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
      return this.f.y instanceof fgm;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
   }

   private void c(ezx $$0) {
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

   void a(evj $$0, ews.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(evj $$0, ews.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (euj $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      ews.c a(evj var1);

      boolean a();
   }
}
