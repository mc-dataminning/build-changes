import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fka extends hhu {
   static final alz a = alz.b("pending_invite/accept_highlighted");
   static final alz b = alz.b("pending_invite/accept");
   static final alz c = alz.b("pending_invite/reject_highlighted");
   static final alz C = alz.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final xv E = xv.c("mco.invites.nopending");
   static final xv F = xv.c("mco.invites.button.accept");
   static final xv G = xv.c("mco.invites.button.reject");
   private final ftw H;
   private final CompletableFuture<List<fia>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fhg.a().i().a;
      } catch (fjc var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ae.h());
   @Nullable
   xv J;
   fka.b K;
   private fod L;
   private fod M;

   public fka(ftw $$0, xv $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aT_() {
      fhb.f();
      this.K = new fka.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fka.a> $$1 = $$0.stream().map($$0x -> new fka.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fod)fod.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fod)fod.a(xu.d, $$0 -> this.aP_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fod)fod.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aP_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.g() instanceof fka.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fhg $$2x = fhg.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fjc var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, ae.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fjf $$3 = this.m.bc();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
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
      fka.a $$0 = this.K.g();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fpa.a<fka.a> {
      private static final int b = 38;
      final fia c;
      private final List<fjj> d;

      a(final fia $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fka.a.a(), new fka.a.b());
      }

      @Override
      public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fjj.a(fka.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fnq $$0, fia $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fka.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fka.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fka.this.p, fkv.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fjj.a($$0, this.d, fka.this.K, $$2, $$3, $$4, $$5);
         fkv.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xv a() {
         xv $$0 = xu.b(xv.b(this.c.b), xv.b(this.c.c), fkv.a(this.c.e));
         return xv.a("narrator.select", $$0);
      }

      class a extends fjj {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fnq $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(glt::B, $$3 ? fka.a : fka.b, $$1, $$2, 18, 18);
            if ($$3) {
               fka.this.J = fka.F;
            }
         }

         @Override
         public void a(int $$0) {
            fka.this.c(true);
         }
      }

      class b extends fjj {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fnq $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(glt::B, $$3 ? fka.c : fka.C, $$1, $$2, 18, 18);
            if ($$3) {
               fka.this.J = fka.G;
            }
         }

         @Override
         public void a(int $$0) {
            fka.this.c(false);
         }
      }
   }

   class b extends fpa<fka.a> {
      public b() {
         super(fme.Q(), fka.this.n, fka.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fka.this.E();
      }

      public boolean b() {
         return this.k() == 0;
      }

      public void a(fka.a $$0) {
         this.g($$0);
      }
   }
}
