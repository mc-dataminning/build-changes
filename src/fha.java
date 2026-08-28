import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fha extends hep {
   static final ali a = ali.b("pending_invite/accept_highlighted");
   static final ali b = ali.b("pending_invite/accept");
   static final ali c = ali.b("pending_invite/reject_highlighted");
   static final ali B = ali.b("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xi D = xi.c("mco.invites.nopending");
   static final xi E = xi.c("mco.invites.button.accept");
   static final xi F = xi.c("mco.invites.button.reject");
   private final fra G;
   private final CompletableFuture<List<ffb>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fer.a().i().a;
      } catch (fgc var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ae.h());
   @Nullable
   xi I;
   fha.b J;
   int K = -1;
   private flh L;
   private flh M;

   public fha(fra $$0, xi $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aR_() {
      fem.f();
      this.J = new fha.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fha.a> $$1 = $$0.stream().map($$0x -> new fha.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(D);
         }
      }, this.r);
      this.c(this.J);
      this.L = this.c((flh)flh.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.D();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((flh)flh.a(xh.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((flh)flh.a(F, $$0 -> {
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
         String $$2 = this.J.aI_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fer $$2x = fer.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fgc var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ae.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fgf $$3 = this.m.bc();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
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

   class a extends fmd.a<fha.a> {
      private static final int b = 38;
      final ffb c;
      private final List<fgj> d;

      a(final ffb $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fha.a.a(), new fha.a.b());
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fgj.a(fha.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fku $$0, ffb $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fha.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fha.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fha.this.p, fhw.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fgj.a($$0, this.d, fha.this.J, $$2, $$3, $$4, $$5);
         fhw.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xi a() {
         xi $$0 = xh.b(xi.b(this.c.b), xi.b(this.c.c), fhw.a(this.c.e));
         return xi.a("narrator.select", $$0);
      }

      class a extends fgj {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fku $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gir::B, $$3 ? fha.a : fha.b, $$1, $$2, 18, 18);
            if ($$3) {
               fha.this.I = fha.E;
            }
         }

         @Override
         public void a(int $$0) {
            fha.this.a($$0, true);
         }
      }

      class b extends fgj {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fku $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gir::B, $$3 ? fha.c : fha.B, $$1, $$2, 18, 18);
            if ($$3) {
               fha.this.I = fha.F;
            }
         }

         @Override
         public void a(int $$0) {
            fha.this.a($$0, false);
         }
      }
   }

   class b extends heo<fha.a> {
      public b() {
         super(fha.this.n, fha.this.o - 72, 32, 36);
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
         fha.this.K = $$0;
         fha.this.D();
      }

      public void a(@Nullable fha.a $$0) {
         super.a($$0);
         fha.this.K = this.aI_().indexOf($$0);
         fha.this.D();
      }
   }
}
