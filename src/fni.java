import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fni extends hpw {
   static final alg a = alg.b("pending_invite/accept_highlighted");
   static final alg b = alg.b("pending_invite/accept");
   static final alg c = alg.b("pending_invite/reject_highlighted");
   static final alg C = alg.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wy E = wy.c("mco.invites.nopending");
   static final wy F = wy.c("mco.invites.button.accept");
   static final wy G = wy.c("mco.invites.button.reject");
   private final fyn H;
   private final CompletableFuture<List<fli>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fko.a().i().a;
      } catch (fmk var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ag.i());
   @Nullable
   wy J;
   fni.b K;
   private fsv L;
   private fsv M;

   public fni(fyn $$0, wy $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aO_() {
      fkj.f();
      this.K = new fni.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fni.a> $$1 = $$0.stream().map($$0x -> new fni.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fsv)fsv.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fsv)fsv.a(wx.d, $$0 -> this.aL_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fsv)fsv.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aL_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fni.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fko $$2x = fko.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fmk var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, ag.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fmn $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      this.J = null;
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 12, -1);
      if (this.J != null) {
         $$0.a(this.p, this.J, $$1, $$2);
      }

      if (this.I.isDone() && this.K.b()) {
         $$0.a(this.p, E, this.n / 2, this.o / 2 - 20, -1);
      }
   }

   void E() {
      fni.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends ftr.a<fni.a> {
      private static final int b = 38;
      final fli c;
      private final List<fmr> d;

      a(final fli $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fni.a.a(), new fni.a.b());
      }

      @Override
      public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fmr.a(fni.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fsh $$0, fli $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fni.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fni.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fni.this.p, fod.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fmr.a($$0, this.d, fni.this.K, $$2, $$3, $$4, $$5);
         fod.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(wy.b(this.c.b), wy.b(this.c.c), fod.a(this.c.e));
         return wy.a("narrator.select", $$0);
      }

      class a extends fmr {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fsh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gqx::H, $$3 ? fni.a : fni.b, $$1, $$2, 18, 18);
            if ($$3) {
               fni.this.J = fni.F;
            }
         }

         @Override
         public void a(int $$0) {
            fni.this.c(true);
         }
      }

      class b extends fmr {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fsh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gqx::H, $$3 ? fni.c : fni.C, $$1, $$2, 18, 18);
            if ($$3) {
               fni.this.J = fni.G;
            }
         }

         @Override
         public void a(int $$0) {
            fni.this.c(false);
         }
      }
   }

   class b extends ftr<fni.a> {
      public b() {
         super(fpo.Q(), fni.this.n, fni.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fni.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fni.a $$0) {
         this.g($$0);
      }
   }
}
