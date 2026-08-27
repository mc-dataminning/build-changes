import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class evg extends gnd {
   private static final aiy a = new aiy("icon/unseen_notification");
   private static final aiy b = new aiy("icon/news");
   private static final aiy c = new aiy("icon/invite");
   private static final aiy v = new aiy("icon/trial_available");
   private final CompletableFuture<Boolean> w = esr.a().thenApply($$0 -> $$0.a() == esr.b.a);
   @Nullable
   private evw.c x;
   @Nullable
   private evg.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final evg.a D = new evg.a() {
      @Override
      public evw.c a(eun $$0) {
         evw.c $$1 = $$0.a.a();
         evg.this.a($$0, $$1);
         evg.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final evg.a E = new evg.a() {
      @Override
      public evw.c a(eun $$0) {
         evw.c $$1 = $$0.a.a();
         evg.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public evg() {
      super(exg.a);
   }

   @Override
   public void aQ_() {
      if (this.x != null) {
         this.x.a();
      }
   }

   @Override
   public void aI_() {
      super.aI_();
      this.f.ba().b.a();
   }

   @Nullable
   private evg.a E() {
      boolean $$0 = this.I() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.H() ? this.D : this.E;
      }
   }

   @Override
   public void e() {
      evg.a $$0 = this.E();
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
      return this.f.y instanceof ffq;
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
   }

   private void c(ezb $$0) {
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

   void a(eun $$0, evw.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(eun $$0, evw.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (etn $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      evw.c a(eun var1);

      boolean a();
   }
}
