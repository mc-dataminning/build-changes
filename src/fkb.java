import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkb extends hmd {
   static final aku a = aku.b("pending_invite/accept_highlighted");
   static final aku b = aku.b("pending_invite/accept");
   static final aku c = aku.b("pending_invite/reject_highlighted");
   static final aku C = aku.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wp E = wp.c("mco.invites.nopending");
   static final wp F = wp.c("mco.invites.button.accept");
   static final wp G = wp.c("mco.invites.button.reject");
   private final fvi H;
   private final CompletableFuture<List<fib>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fhh.a().i().a;
      } catch (fjd var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, af.i());
   @Nullable
   wp J;
   fkb.b K;
   private fpq L;
   private fpq M;

   public fkb(fvi $$0, wp $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aR_() {
      fhc.f();
      this.K = new fkb.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fkb.a> $$1 = $$0.stream().map($$0x -> new fkb.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fpq)fpq.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fpq)fpq.a(wo.d, $$0 -> this.aO_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fpq)fpq.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fkb.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fhh $$2x = fhh.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fjd var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, af.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fjg $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
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
      fkb.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fqm.a<fkb.a> {
      private static final int b = 38;
      final fib c;
      private final List<fjk> d;

      a(final fib $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fkb.a.a(), new fkb.a.b());
      }

      @Override
      public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fjk.a(fkb.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fpc $$0, fib $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fkb.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fkb.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fkb.this.p, fkw.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fjk.a($$0, this.d, fkb.this.K, $$2, $$3, $$4, $$5);
         fkw.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wp a() {
         wp $$0 = wo.b(wp.b(this.c.b), wp.b(this.c.c), fkw.a(this.c.e));
         return wp.a("narrator.select", $$0);
      }

      class a extends fjk {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fpc $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gnh::H, $$3 ? fkb.a : fkb.b, $$1, $$2, 18, 18);
            if ($$3) {
               fkb.this.J = fkb.F;
            }
         }

         @Override
         public void a(int $$0) {
            fkb.this.c(true);
         }
      }

      class b extends fjk {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fpc $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gnh::H, $$3 ? fkb.c : fkb.C, $$1, $$2, 18, 18);
            if ($$3) {
               fkb.this.J = fkb.G;
            }
         }

         @Override
         public void a(int $$0) {
            fkb.this.c(false);
         }
      }
   }

   class b extends fqm<fkb.a> {
      public b() {
         super(fmg.Q(), fkb.this.n, fkb.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fkb.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fkb.a $$0) {
         this.g($$0);
      }
   }
}
