import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcy extends gvf {
   static final ale a = new ale("pending_invite/accept_highlighted");
   static final ale b = new ale("pending_invite/accept");
   static final ale c = new ale("pending_invite/reject_highlighted");
   static final ale B = new ale("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xo D = xo.c("mco.invites.nopending");
   static final xo E = xo.c("mco.invites.button.accept");
   static final xo F = xo.c("mco.invites.button.reject");
   private final fnc G;
   private final CompletableFuture<List<fax>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fan.a().i().a;
      } catch (fca var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.h());
   @Nullable
   xo I;
   fcy.b J;
   int K = -1;
   private fhd L;
   private fhd M;

   public fcy(fnc $$0, xo $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aM_() {
      fai.f();
      this.J = new fcy.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fcy.a> $$1 = $$0.stream().map($$0x -> new fcy.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aX().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((fhd)fhd.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.E();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fhd)fhd.a(xn.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fhd)fhd.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.E();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aD_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fan $$2x = fan.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fca var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fcd $$3 = this.m.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
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

   void E() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fhz.a<fcy.a> {
      private static final int b = 38;
      final fax c;
      private final List<fch> d;

      a(final fax $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fcy.a.a(), new fcy.a.b());
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fch.a(fcy.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fgq $$0, fax $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fcy.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fcy.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fcy.this.p, fdu.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fch.a($$0, this.d, fcy.this.J, $$2, $$3, $$4, $$5);
         fdu.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xo a() {
         xo $$0 = xn.b(xo.b(this.c.b), xo.b(this.c.c), fdu.a(this.c.e));
         return xo.a("narrator.select", $$0);
      }

      class a extends fch {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fgq $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fcy.a : fcy.b, $$1, $$2, 18, 18);
            if ($$3) {
               fcy.this.I = fcy.E;
            }
         }

         @Override
         public void a(int $$0) {
            fcy.this.a($$0, true);
         }
      }

      class b extends fch {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fgq $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fcy.c : fcy.B, $$1, $$2, 18, 18);
            if ($$3) {
               fcy.this.I = fcy.F;
            }
         }

         @Override
         public void a(int $$0) {
            fcy.this.a($$0, false);
         }
      }
   }

   class b extends gve<fcy.a> {
      public b() {
         super(fcy.this.n, fcy.this.o - 72, 32, 36);
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
         fcy.this.K = $$0;
         fcy.this.E();
      }

      public void a(@Nullable fcy.a $$0) {
         super.a($$0);
         fcy.this.K = this.aD_().indexOf($$0);
         fcy.this.E();
      }
   }
}
