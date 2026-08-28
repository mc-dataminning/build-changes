import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fft extends hct {
   static final alb a = alb.b("pending_invite/accept_highlighted");
   static final alb b = alb.b("pending_invite/accept");
   static final alb c = alb.b("pending_invite/reject_highlighted");
   static final alb B = alb.b("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xd D = xd.c("mco.invites.nopending");
   static final xd E = xd.c("mco.invites.button.accept");
   static final xd F = xd.c("mco.invites.button.reject");
   private final fpt G;
   private final CompletableFuture<List<fdu>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fdk.a().i().a;
      } catch (fev var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ad.h());
   @Nullable
   xd I;
   fft.b J;
   int K = -1;
   private fka L;
   private fka M;

   public fft(fpt $$0, xd $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aT_() {
      fdf.f();
      this.J = new fft.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fft.a> $$1 = $$0.stream().map($$0x -> new fft.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(D);
         }
      }, this.r);
      this.c(this.J);
      this.L = this.c((fka)fka.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.D();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fka)fka.a(xc.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fka)fka.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.D();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.D();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aK_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fdk $$2x = fdk.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fev var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ad.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fey $$3 = this.m.bb();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.I = null;
      $$0.a(this.p, this.l, this.n / 2, 12, -1);
      if (this.I != null) {
         $$0.a(this.p, this.I, $$1, $$2);
      }

      if (this.H.isDone() && this.J.l() == 0) {
         $$0.a(this.p, D, this.n / 2, this.o / 2 - 20, -1);
      }
   }

   void D() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fkw.a<fft.a> {
      private static final int b = 38;
      final fdu c;
      private final List<ffc> d;

      a(final fdu $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fft.a.a(), new fft.a.b());
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ffc.a(fft.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fjn $$0, fdu $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fft.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fft.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fft.this.p, fgp.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         ffc.a($$0, this.d, fft.this.J, $$2, $$3, $$4, $$5);
         fgp.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xd a() {
         xd $$0 = xc.b(xd.b(this.c.b), xd.b(this.c.c), fgp.a(this.c.e));
         return xd.a("narrator.select", $$0);
      }

      class a extends ffc {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fjn $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(ghe::C, $$3 ? fft.a : fft.b, $$1, $$2, 18, 18);
            if ($$3) {
               fft.this.I = fft.E;
            }
         }

         @Override
         public void a(int $$0) {
            fft.this.a($$0, true);
         }
      }

      class b extends ffc {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fjn $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(ghe::C, $$3 ? fft.c : fft.B, $$1, $$2, 18, 18);
            if ($$3) {
               fft.this.I = fft.F;
            }
         }

         @Override
         public void a(int $$0) {
            fft.this.a($$0, false);
         }
      }
   }

   class b extends hcs<fft.a> {
      public b() {
         super(fft.this.n, fft.this.o - 72, 32, 36);
      }

      @Override
      public void a(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return this.l() * 36;
      }

      @Override
      public int b() {
         return 260;
      }

      @Override
      public void b(int $$0) {
         super.b($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         fft.this.K = $$0;
         fft.this.D();
      }

      public void a(@Nullable fft.a $$0) {
         super.a($$0);
         fft.this.K = this.aK_().indexOf($$0);
         fft.this.D();
      }
   }
}
