import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcx extends gve {
   static final ale a = new ale("pending_invite/accept_highlighted");
   static final ale b = new ale("pending_invite/accept");
   static final ale c = new ale("pending_invite/reject_highlighted");
   static final ale B = new ale("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xo D = xo.c("mco.invites.nopending");
   static final xo E = xo.c("mco.invites.button.accept");
   static final xo F = xo.c("mco.invites.button.reject");
   private final fnb G;
   private final CompletableFuture<List<faw>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fam.a().i().a;
      } catch (fbz var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.h());
   @Nullable
   xo I;
   fcx.b J;
   int K = -1;
   private fhc L;
   private fhc M;

   public fcx(fnb $$0, xo $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aM_() {
      fah.f();
      this.J = new fcx.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fcx.a> $$1 = $$0.stream().map($$0x -> new fcx.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aX().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((fhc)fhc.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.D();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fhc)fhc.a(xn.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fhc)fhc.a(F, $$0 -> {
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
         String $$2 = this.J.aE_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fam $$2x = fam.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fbz var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fcc $$3 = this.m.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
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

   class a extends fhy.a<fcx.a> {
      private static final int b = 38;
      final faw c;
      private final List<fcg> d;

      a(final faw $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fcx.a.a(), new fcx.a.b());
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fcg.a(fcx.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fgp $$0, faw $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fcx.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fcx.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fcx.this.p, fdt.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fcg.a($$0, this.d, fcx.this.J, $$2, $$3, $$4, $$5);
         fdt.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xo a() {
         xo $$0 = xn.b(xo.b(this.c.b), xo.b(this.c.c), fdt.a(this.c.e));
         return xo.a("narrator.select", $$0);
      }

      class a extends fcg {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fgp $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fcx.a : fcx.b, $$1, $$2, 18, 18);
            if ($$3) {
               fcx.this.I = fcx.E;
            }
         }

         @Override
         public void a(int $$0) {
            fcx.this.a($$0, true);
         }
      }

      class b extends fcg {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fgp $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fcx.c : fcx.B, $$1, $$2, 18, 18);
            if ($$3) {
               fcx.this.I = fcx.F;
            }
         }

         @Override
         public void a(int $$0) {
            fcx.this.a($$0, false);
         }
      }
   }

   class b extends gvd<fcx.a> {
      public b() {
         super(fcx.this.n, fcx.this.o - 72, 32, 36);
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
         fcx.this.K = $$0;
         fcx.this.D();
      }

      public void a(@Nullable fcx.a $$0) {
         super.a($$0);
         fcx.this.K = this.aE_().indexOf($$0);
         fcx.this.D();
      }
   }
}
