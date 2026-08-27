import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eta extends gkn {
   static final ahg a = new ahg("pending_invite/accept_highlighted");
   static final ahg b = new ahg("pending_invite/accept");
   static final ahg c = new ahg("pending_invite/reject_highlighted");
   static final ahg v = new ahg("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final vf x = vf.c("mco.invites.nopending");
   static final vf y = vf.c("mco.invites.button.accept");
   static final vf z = vf.c("mco.invites.button.reject");
   private final fcz A;
   private final CompletableFuture<List<eqz>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return eqp.a().i().a;
      } catch (esc var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   vf C;
   eta.b D;
   int E = -1;
   private exe F;
   private exe G;

   public eta(fcz $$0, vf $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aN_() {
      eqk.e();
      this.D = new eta.b();
      this.B.thenAcceptAsync($$0 -> {
         List<eta.a> $$1 = $$0.stream().map($$0x -> new eta.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aV().b(x);
         }
      }, this.j);
      this.d(this.D);
      this.F = this.d(exe.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.C();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(exe.a(ve.d, $$0 -> this.aE_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.d(exe.a(z, $$0 -> {
         this.a(this.E, false);
         this.E = -1;
         this.C();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void aE_() {
      this.f.a(this.A);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.D.n()) {
         String $$2 = this.D.l().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               eqp $$2x = eqp.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (esc var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               esf $$3 = this.f.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C = null;
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.C != null) {
         $$0.a(this.i, this.C, $$1, $$2);
      }

      if (this.B.isDone() && this.D.n() == 0) {
         $$0.a(this.i, x, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   @Override
   void C() {
      this.F.k = this.a(this.E);
      this.G.k = this.a(this.E);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends eya.a<eta.a> {
      private static final int b = 38;
      final eqz c;
      private final List<esj> d;

      a(eqz $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eta.a.a(), new eta.a.b());
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         esj.a(eta.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(ews $$0, eqz $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eta.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eta.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eta.this.i, etw.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         esj.a($$0, this.d, eta.this.D, $$2, $$3, $$4, $$5);
         etw.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public vf a() {
         vf $$0 = ve.b(vf.b(this.c.b), vf.b(this.c.c), etw.a(this.c.e));
         return vf.a("narrator.select", $$0);
      }

      class a extends esj {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(ews $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eta.a : eta.b, $$1, $$2, 18, 18);
            if ($$3) {
               eta.this.C = eta.y;
            }
         }

         @Override
         public void a(int $$0) {
            eta.this.a($$0, true);
         }
      }

      class b extends esj {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(ews $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eta.c : eta.v, $$1, $$2, 18, 18);
            if ($$3) {
               eta.this.C = eta.z;
            }
         }

         @Override
         public void a(int $$0) {
            eta.this.a($$0, false);
         }
      }
   }

   class b extends gkm<eta.a> {
      public b() {
         super(eta.this.g, eta.this.h - 72, 32, 36);
      }

      public void b(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return this.n() * 36;
      }

      @Override
      public int b() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         eta.this.E = $$0;
         eta.this.C();
      }

      public void a(@Nullable eta.a $$0) {
         super.a($$0);
         eta.this.E = this.l().indexOf($$0);
         eta.this.C();
      }
   }
}
