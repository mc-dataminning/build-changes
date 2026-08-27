import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class exa extends gpe {
   private static final ajh a = new ajh("icon/unseen_notification");
   private static final ajh b = new ajh("icon/news");
   private static final ajh c = new ajh("icon/invite");
   private static final ajh v = new ajh("icon/trial_available");
   private final CompletableFuture<Boolean> w = eul.a().thenApply($$0 -> $$0.a() == eul.b.a);
   @Nullable
   private exq.c x;
   @Nullable
   private exa.a y;
   private volatile int z;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private final exa.a D = new exa.a() {
      @Override
      public exq.c a(ewh $$0) {
         exq.c $$1 = $$0.a.a();
         exa.this.a($$0, $$1);
         exa.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final exa.a E = new exa.a() {
      @Override
      public exq.c a(ewh $$0) {
         exq.c $$1 = $$0.a.a();
         exa.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public exa() {
      super(eza.a);
   }

   @Override
   public void aO_() {
      if (this.x != null) {
         this.x.a();
      }
   }

   @Override
   public void aG_() {
      super.aG_();
      this.f.bb().b.a();
   }

   @Nullable
   private exa.a E() {
      boolean $$0 = this.I() && this.w.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.H() ? this.D : this.E;
      }
   }

   @Override
   public void e() {
      exa.a $$0 = this.E();
      if (!Objects.equals(this.y, $$0)) {
         this.y = $$0;
         if (this.y != null) {
            this.x = this.y.a(this.f.bb());
         } else {
            this.x = null;
         }
      }

      if (this.x != null) {
         this.x.b();
      }
   }

   private boolean H() {
      return this.f.m.R().c();
   }

   private boolean I() {
      return this.f.y instanceof fhm;
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.w.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
   }

   private void c(fav $$0) {
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

   void a(ewh $$0, exq.c $$1) {
      $$1.a($$0.d, $$0x -> this.z = $$0x);
      $$1.a($$0.e, $$0x -> A = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         B = $$0.g.a();
      });
   }

   void b(ewh $$0, exq.c $$1) {
      $$1.a($$0.b, $$0x -> {
         C = false;

         for (evh $$1x : $$0x) {
            if (!$$1x.a()) {
               C = true;
               break;
            }
         }
      });
   }

   interface a {
      exq.c a(ewh var1);

      boolean a();
   }
}
