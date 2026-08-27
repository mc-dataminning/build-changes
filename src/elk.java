import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elk extends gan {
   static final Logger a = LogUtils.getLogger();
   static final acq b = new acq("realms", "textures/gui/realms/accept_icon.png");
   static final acq c = new acq("realms", "textures/gui/realms/reject_icon.png");
   private static final sw G = sw.c("mco.invites.nopending");
   static final sw H = sw.c("mco.invites.button.accept");
   static final sw I = sw.c("mco.invites.button.reject");
   private final euq J;
   @Nullable
   sw K;
   boolean L;
   elk.b M;
   int N = -1;
   private epi O;
   private epi P;

   public elk(euq $$0, sw $$1) {
      super($$1);
      this.J = $$0;
   }

   @Override
   public void b() {
      this.M = new elk.b();
      (new Thread("Realms-pending-invitations-fetcher") {
         @Override
         public void run() {
            eiz $$0 = eiz.a();

            try {
               List<ejj> $$1 = $$0.l().a;
               List<elk.a> $$2 = $$1.stream().map($$0x -> elk.this.new a($$0x)).collect(Collectors.toList());
               elk.this.f.execute(() -> elk.this.M.a($$2));
            } catch (ekm var7) {
               elk.a.error("Couldn't list invites");
            } finally {
               elk.this.L = true;
            }
         }
      }).start();
      this.e(this.M);
      this.O = this.d(epi.a(sw.c("mco.invites.button.accept"), $$0 -> {
         this.c(this.N);
         this.N = -1;
         this.B();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(epi.a(sv.d, $$0 -> this.f.a(new eiu(this.J))).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.P = this.d(epi.a(sw.c("mco.invites.button.reject"), $$0 -> {
         this.b(this.N);
         this.N = -1;
         this.B();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.B();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(new eiu(this.J));
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   void a(int $$0) {
      this.M.b($$0);
   }

   void b(final int $$0) {
      if ($$0 < this.M.k()) {
         (new Thread("Realms-reject-invitation") {
            @Override
            public void run() {
               try {
                  eiz $$0 = eiz.a();
                  $$0.b(elk.this.M.i().get($$0).c.a);
                  elk.this.f.execute(() -> elk.this.a($$0));
               } catch (ekm var2) {
                  elk.a.error("Couldn't reject invite");
               }
            }
         }).start();
      }
   }

   void c(final int $$0) {
      if ($$0 < this.M.k()) {
         (new Thread("Realms-accept-invitation") {
            @Override
            public void run() {
               try {
                  eiz $$0 = eiz.a();
                  $$0.a(elk.this.M.i().get($$0).c.a);
                  elk.this.f.execute(() -> elk.this.a($$0));
               } catch (ekm var2) {
                  elk.a.error("Couldn't accept invite");
               }
            }
         }).start();
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.K = null;
      this.a($$0);
      this.M.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, 16777215);
      if (this.K != null) {
         this.a($$0, this.K, $$1, $$2);
      }

      if (this.M.k() == 0 && this.L) {
         $$0.a(this.i, G, this.g / 2, this.h / 2 - 20, 16777215);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(eox $$0, @Nullable sw $$1, int $$2, int $$3) {
      if ($$1 != null) {
         int $$4 = $$2 + 12;
         int $$5 = $$3 - 12;
         int $$6 = this.i.a($$1);
         $$0.b($$4 - 3, $$5 - 3, $$4 + $$6 + 3, $$5 + 8 + 3, -1073741824, -1073741824);
         $$0.b(this.i, $$1, $$4, $$5, 16777215);
      }
   }

   @Override
   void B() {
      this.O.s = this.i(this.N);
      this.P.s = this.i(this.N);
   }

   private boolean i(int $$0) {
      return $$0 != -1;
   }

   class a extends eqc.a<elk.a> {
      private static final int b = 38;
      final ejj c;
      private final List<eku> d;

      a(ejj $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new elk.a.a(), new elk.a.b());
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eku.a(elk.this.M, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(eox $$0, ejj $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(elk.this.i, $$1.b, $$2 + 38, $$3 + 1, 16777215, false);
         $$0.a(elk.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(elk.this.i, emf.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         eku.a($$0, this.d, elk.this.M, $$2, $$3, $$4, $$5);
         emf.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public sw a() {
         sw $$0 = sv.b(sw.b(this.c.b), sw.b(this.c.c), emf.a(this.c.e));
         return sw.a("narrator.select", $$0);
      }

      class a extends eku {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(eox $$0, int $$1, int $$2, boolean $$3) {
            float $$4 = $$3 ? 19.0F : 0.0F;
            $$0.a(elk.b, $$1, $$2, $$4, 0.0F, 18, 18, 37, 18);
            if ($$3) {
               elk.this.K = elk.H;
            }
         }

         @Override
         public void a(int $$0) {
            elk.this.c($$0);
         }
      }

      class b extends eku {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(eox $$0, int $$1, int $$2, boolean $$3) {
            float $$4 = $$3 ? 19.0F : 0.0F;
            $$0.a(elk.c, $$1, $$2, $$4, 0.0F, 18, 18, 37, 18);
            if ($$3) {
               elk.this.K = elk.I;
            }
         }

         @Override
         public void a(int $$0) {
            elk.this.b($$0);
         }
      }
   }

   class b extends gam<elk.a> {
      public b() {
         super(elk.this.g, elk.this.h, 32, elk.this.h - 40, 36);
      }

      public void b(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int b() {
         return 260;
      }

      @Override
      public void a(eox $$0) {
         elk.this.a($$0);
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         elk.this.N = $$0;
         elk.this.B();
      }

      public void a(@Nullable elk.a $$0) {
         super.a($$0);
         elk.this.N = this.i().indexOf($$0);
         elk.this.B();
      }
   }
}
