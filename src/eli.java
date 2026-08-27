import java.util.Objects;
import javax.annotation.Nullable;

public class eli extends gan {
   private static final acq a = new acq("realms", "textures/gui/realms/invite_icon.png");
   private static final acq b = new acq("realms", "textures/gui/realms/trial_icon.png");
   private static final acq c = new acq("realms", "textures/gui/realms/news_notification_mainscreen.png");
   private static final acq G = new acq("minecraft", "textures/gui/unseen_notification.png");
   @Nullable
   private elx.c H;
   @Nullable
   private eli.a I;
   private volatile int J;
   static boolean K;
   private static boolean L;
   static boolean M;
   private static boolean N;
   private static boolean O;
   private final eli.a P = new eli.a() {
      @Override
      public elx.c a(ekq $$0) {
         elx.c $$1 = $$0.a.a();
         eli.this.a($$0, $$1);
         eli.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return true;
      }
   };
   private final eli.a Q = new eli.a() {
      @Override
      public elx.c a(ekq $$0) {
         elx.c $$1 = $$0.a.a();
         eli.this.b($$0, $$1);
         return $$1;
      }

      @Override
      public boolean a() {
         return false;
      }
   };

   public eli() {
      super(enf.a);
   }

   @Override
   public void b() {
      this.E();
      if (this.H != null) {
         this.H.a();
      }
   }

   @Override
   public void ay_() {
      super.ay_();
      this.f.aX().b.a();
   }

   @Nullable
   private eli.a B() {
      boolean $$0 = this.D() && M;
      if (!$$0) {
         return null;
      } else {
         return this.C() ? this.P : this.Q;
      }
   }

   @Override
   public void f() {
      eli.a $$0 = this.B();
      if (!Objects.equals(this.I, $$0)) {
         this.I = $$0;
         if (this.I != null) {
            this.H = this.I.a(this.f.aX());
         } else {
            this.H = null;
         }
      }

      if (this.H != null) {
         this.H.b();
      }
   }

   private boolean C() {
      return this.f.m.O().c();
   }

   private boolean D() {
      return this.f.z instanceof euw;
   }

   private void E() {
      if (!K) {
         K = true;
         (new Thread("Realms Notification Availability checker #1") {
            @Override
            public void run() {
               eiz $$0 = eiz.a();

               try {
                  eiz.a $$1 = $$0.j();
                  if ($$1 != eiz.a.a) {
                     return;
                  }
               } catch (ekm var3) {
                  if (var3.a != 401) {
                     eli.K = false;
                  }

                  return;
               }

               eli.M = true;
            }
         }).start();
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (M) {
         this.a($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(eox $$0, int $$1, int $$2) {
      int $$3 = this.J;
      int $$4 = 24;
      int $$5 = this.h / 4 + 48;
      int $$6 = this.g / 2 + 80;
      int $$7 = $$5 + 48 + 2;
      int $$8 = 0;
      if (O) {
         $$0.a(G, $$6 - $$8 + 5, $$7 + 3, 0.0F, 0.0F, 10, 10, 10, 10);
         $$8 += 14;
      }

      if (this.I != null && this.I.a()) {
         if (N) {
            $$0.c().a();
            $$0.c().b(0.4F, 0.4F, 0.4F);
            $$0.a(c, (int)((double)($$6 + 2 - $$8) * 2.5), (int)((double)$$7 * 2.5), 0.0F, 0.0F, 40, 40, 40, 40);
            $$0.c().b();
            $$8 += 14;
         }

         if ($$3 != 0) {
            $$0.a(a, $$6 - $$8, $$7 - 6, 0.0F, 0.0F, 15, 25, 31, 25);
            $$8 += 16;
         }

         if (L) {
            int $$9 = 0;
            if ((ac.b() / 800L & 1L) == 1L) {
               $$9 = 8;
            }

            $$0.a(b, $$6 + 4 - $$8, $$7 + 4, 0.0F, (float)$$9, 8, 8, 8, 16);
         }
      }
   }

   void a(ekq $$0, elx.c $$1) {
      $$1.a($$0.e, $$0x -> this.J = $$0x);
      $$1.a($$0.f, $$0x -> L = $$0x);
      $$1.a($$0.g, $$1x -> {
         $$0.h.a($$1x);
         N = $$0.h.a();
      });
   }

   void b(ekq $$0, elx.c $$1) {
      $$1.a($$0.b, $$0x -> {
         O = false;

         for (ejp $$1x : $$0x) {
            if (!$$1x.a()) {
               O = true;
               break;
            }
         }
      });
   }

   interface a {
      elx.c a(ekq var1);

      boolean a();
   }
}
