import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class epg extends gfx {
   private static final afw a = new afw("icon/unseen_notification");
   private static final afw b = new afw("icon/news");
   private static final afw c = new afw("icon/invite");
   private static final afw y = new afw("icon/trial_available");
   private final CompletableFuture<Boolean> z = emr.a().thenApply($$0 -> $$0.a() == emr.b.a);
   @Nullable
   private epw.c A;
   @Nullable
   private epg.a B;
   private volatile int C;
   private static boolean D;
   private static boolean E;
   private static boolean F;
   private final epg.a G = new epg.a() {
      @Override
      public epw.c a(eon $$0) {
         epw.c $$1 = $$0.a.a();
         epg.this.a($$0, $$1);
         epg.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final epg.a H = new epg.a() {
      @Override
      public epw.c a(eon $$0) {
         epw.c $$1 = $$0.a.a();
         epg.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public epg() {
      super(erg.a);
   }

   @Override
   public void aM_() {
      if (this.A != null) {
         this.A.a();
      }
   }

   @Override
   public void aE_() {
      super.aE_();
      this.f.aY().b.a();
   }

   @Nullable
   private epg.a C() {
      boolean $$0 = this.E() && this.z.getNow(false);
      if (!$$0) {
         return null;
      } else {
         return this.D() ? this.G : this.H;
      }
   }

   @Override
   public void d() {
      epg.a $$0 = this.C();
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
      return this.f.y instanceof ezi;
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.z.getNow(false)) {
         this.c($$0);
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
   }

   private void c(esy $$0) {
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

   void a(eon $$0, epw.c $$1) {
      $$1.a($$0.d, $$0x -> this.C = $$0x);
      $$1.a($$0.e, $$0x -> D = $$0x);
      $$1.a($$0.f, $$1x -> {
         $$0.g.a($$1x);
         E = $$0.g.a();
      });
   }

   void b(eon $$0, epw.c $$1) {
      $$1.a($$0.b, $$0x -> {
         F = false;

         for (enn $$1x : $$0x) {
            if (!$$1x.a()) {
               F = true;
               break;
            }
         }
      });
   }

   interface a {
      epw.c a(eon var1);

      boolean a();
   }
}
