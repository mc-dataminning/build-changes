import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fky extends hne {
   static final ald a = ald.b("pending_invite/accept_highlighted");
   static final ald b = ald.b("pending_invite/accept");
   static final ald c = ald.b("pending_invite/reject_highlighted");
   static final ald C = ald.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wv E = wv.c("mco.invites.nopending");
   static final wv F = wv.c("mco.invites.button.accept");
   static final wv G = wv.c("mco.invites.button.reject");
   private final fwf H;
   private final CompletableFuture<List<fiy>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fie.a().i().a;
      } catch (fka var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, af.i());
   @Nullable
   wv J;
   fky.b K;
   private fqn L;
   private fqn M;

   public fky(fwf $$0, wv $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aN_() {
      fhz.f();
      this.K = new fky.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fky.a> $$1 = $$0.stream().map($$0x -> new fky.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fqn)fqn.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fqn)fqn.a(wu.d, $$0 -> this.aK_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fqn)fqn.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aK_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fky.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fie $$2x = fie.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fka var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, af.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fkd $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
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
      fky.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends frj.a<fky.a> {
      private static final int b = 38;
      final fiy c;
      private final List<fkh> d;

      a(final fiy $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fky.a.a(), new fky.a.b());
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fkh.a(fky.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fpz $$0, fiy $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fky.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fky.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fky.this.p, flt.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fkh.a($$0, this.d, fky.this.K, $$2, $$3, $$4, $$5);
         flt.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wv a() {
         wv $$0 = wu.b(wv.b(this.c.b), wv.b(this.c.c), flt.a(this.c.e));
         return wv.a("narrator.select", $$0);
      }

      class a extends fkh {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fpz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(goi::H, $$3 ? fky.a : fky.b, $$1, $$2, 18, 18);
            if ($$3) {
               fky.this.J = fky.F;
            }
         }

         @Override
         public void a(int $$0) {
            fky.this.c(true);
         }
      }

      class b extends fkh {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fpz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(goi::H, $$3 ? fky.c : fky.C, $$1, $$2, 18, 18);
            if ($$3) {
               fky.this.J = fky.G;
            }
         }

         @Override
         public void a(int $$0) {
            fky.this.c(false);
         }
      }
   }

   class b extends frj<fky.a> {
      public b() {
         super(fnd.Q(), fky.this.n, fky.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fky.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fky.a $$0) {
         this.g($$0);
      }
   }
}
