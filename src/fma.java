import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fma extends hol {
   static final ale a = ale.b("pending_invite/accept_highlighted");
   static final ale b = ale.b("pending_invite/accept");
   static final ale c = ale.b("pending_invite/reject_highlighted");
   static final ale C = ale.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final ww E = ww.c("mco.invites.nopending");
   static final ww F = ww.c("mco.invites.button.accept");
   static final ww G = ww.c("mco.invites.button.reject");
   private final fxi H;
   private final CompletableFuture<List<fka>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fjg.a().i().a;
      } catch (flc var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, af.i());
   @Nullable
   ww J;
   fma.b K;
   private frq L;
   private frq M;

   public fma(fxi $$0, ww $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aN_() {
      fjb.f();
      this.K = new fma.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fma.a> $$1 = $$0.stream().map($$0x -> new fma.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((frq)frq.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((frq)frq.a(wv.d, $$0 -> this.aK_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((frq)frq.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aK_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fma.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fjg $$2x = fjg.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (flc var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, af.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               flf $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
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
      fma.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fsm.a<fma.a> {
      private static final int b = 38;
      final fka c;
      private final List<flj> d;

      a(final fka $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fma.a.a(), new fma.a.b());
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         flj.a(fma.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(frc $$0, fka $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fma.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fma.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fma.this.p, fmv.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         flj.a($$0, this.d, fma.this.K, $$2, $$3, $$4, $$5);
         fmv.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public ww a() {
         ww $$0 = wv.b(ww.b(this.c.b), ww.b(this.c.c), fmv.a(this.c.e));
         return ww.a("narrator.select", $$0);
      }

      class a extends flj {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(frc $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gpn::H, $$3 ? fma.a : fma.b, $$1, $$2, 18, 18);
            if ($$3) {
               fma.this.J = fma.F;
            }
         }

         @Override
         public void a(int $$0) {
            fma.this.c(true);
         }
      }

      class b extends flj {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(frc $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gpn::H, $$3 ? fma.c : fma.C, $$1, $$2, 18, 18);
            if ($$3) {
               fma.this.J = fma.G;
            }
         }

         @Override
         public void a(int $$0) {
            fma.this.c(false);
         }
      }
   }

   class b extends fsm<fma.a> {
      public b() {
         super(fof.Q(), fma.this.n, fma.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fma.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fma.a $$0) {
         this.g($$0);
      }
   }
}
