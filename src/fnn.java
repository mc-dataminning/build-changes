import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnn extends hqd {
   static final alg a = alg.b("pending_invite/accept_highlighted");
   static final alg b = alg.b("pending_invite/accept");
   static final alg c = alg.b("pending_invite/reject_highlighted");
   static final alg C = alg.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wy E = wy.c("mco.invites.nopending");
   static final wy F = wy.c("mco.invites.button.accept");
   static final wy G = wy.c("mco.invites.button.reject");
   private final fys H;
   private final CompletableFuture<List<fln>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fkt.a().i().a;
      } catch (fmp var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ag.i());
   @Nullable
   wy J;
   fnn.b K;
   private fta L;
   private fta M;

   public fnn(fys $$0, wy $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aO_() {
      fko.f();
      this.K = new fnn.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fnn.a> $$1 = $$0.stream().map($$0x -> new fnn.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fta)fta.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fta)fta.a(wx.d, $$0 -> this.aL_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fta)fta.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aL_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fnn.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fkt $$2x = fkt.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fmp var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, ag.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fms $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
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
      fnn.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends ftw.a<fnn.a> {
      private static final int b = 38;
      final fln c;
      private final List<fmw> d;

      a(final fln $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fnn.a.a(), new fnn.a.b());
      }

      @Override
      public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fmw.a(fnn.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fsm $$0, fln $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fnn.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fnn.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fnn.this.p, foi.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fmw.a($$0, this.d, fnn.this.K, $$2, $$3, $$4, $$5);
         foi.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(wy.b(this.c.b), wy.b(this.c.c), foi.a(this.c.e));
         return wy.a("narrator.select", $$0);
      }

      class a extends fmw {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fsm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(grc::H, $$3 ? fnn.a : fnn.b, $$1, $$2, 18, 18);
            if ($$3) {
               fnn.this.J = fnn.F;
            }
         }

         @Override
         public void a(int $$0) {
            fnn.this.c(true);
         }
      }

      class b extends fmw {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fsm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(grc::H, $$3 ? fnn.c : fnn.C, $$1, $$2, 18, 18);
            if ($$3) {
               fnn.this.J = fnn.G;
            }
         }

         @Override
         public void a(int $$0) {
            fnn.this.c(false);
         }
      }
   }

   class b extends ftw<fnn.a> {
      public b() {
         super(fpt.Q(), fnn.this.n, fnn.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fnn.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fnn.a $$0) {
         this.g($$0);
      }
   }
}
