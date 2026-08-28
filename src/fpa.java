import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpa extends hro {
   static final alk a = alk.b("pending_invite/accept_highlighted");
   static final alk b = alk.b("pending_invite/accept");
   static final alk c = alk.b("pending_invite/reject_highlighted");
   static final alk C = alk.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final xc E = xc.c("mco.invites.nopending");
   static final xc F = xc.c("mco.invites.button.accept");
   static final xc G = xc.c("mco.invites.button.reject");
   private final gaf H;
   private final CompletableFuture<List<fmz>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fmf.a().j().a;
      } catch (fob var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ag.i());
   @Nullable
   xc J;
   fpa.b K;
   private fun L;
   private fun M;

   public fpa(gaf $$0, xc $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aS_() {
      fma.f();
      this.K = new fpa.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fpa.a> $$1 = $$0.stream().map($$0x -> new fpa.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fun)fun.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fun)fun.a(xb.d, $$0 -> this.aP_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fun)fun.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aP_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fpa.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fmf $$2x = fmf.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fob var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, ag.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               foe $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
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
      fpa.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fvj.a<fpa.a> {
      private static final int b = 38;
      final fmz c;
      private final List<foi> d;

      a(final fmz $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fpa.a.a(), new fpa.a.b());
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         foi.a(fpa.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(ftz $$0, fmz $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fpa.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fpa.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fpa.this.p, fpv.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         foi.a($$0, this.d, fpa.this.K, $$2, $$3, $$4, $$5);
         fpv.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xc a() {
         xc $$0 = xb.b(xc.b(this.c.b), xc.b(this.c.c), fpv.a(this.c.e));
         return xc.a("narrator.select", $$0);
      }

      class a extends foi {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(ftz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gsn::H, $$3 ? fpa.a : fpa.b, $$1, $$2, 18, 18);
            if ($$3) {
               fpa.this.J = fpa.F;
            }
         }

         @Override
         public void a(int $$0) {
            fpa.this.c(true);
         }
      }

      class b extends foi {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(ftz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gsn::H, $$3 ? fpa.c : fpa.C, $$1, $$2, 18, 18);
            if ($$3) {
               fpa.this.J = fpa.G;
            }
         }

         @Override
         public void a(int $$0) {
            fpa.this.c(false);
         }
      }
   }

   class b extends fvj<fpa.a> {
      public b() {
         super(frf.Q(), fpa.this.n, fpa.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fpa.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fpa.a $$0) {
         this.g($$0);
      }
   }
}
