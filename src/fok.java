import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fok extends hrc {
   static final alr a = alr.b("pending_invite/accept_highlighted");
   static final alr b = alr.b("pending_invite/accept");
   static final alr c = alr.b("pending_invite/reject_highlighted");
   static final alr C = alr.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final xg E = xg.c("mco.invites.nopending");
   static final xg F = xg.c("mco.invites.button.accept");
   static final xg G = xg.c("mco.invites.button.reject");
   private final fzq H;
   private final CompletableFuture<List<fmk>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return flq.a().j().a;
      } catch (fnm var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ag.i());
   @Nullable
   xg J;
   fok.b K;
   private fty L;
   private fty M;

   public fok(fzq $$0, xg $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aO_() {
      fll.f();
      this.K = new fok.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fok.a> $$1 = $$0.stream().map($$0x -> new fok.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fty)fty.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fty)fty.a(xf.d, $$0 -> this.aL_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fty)fty.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aL_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fok.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               flq $$2x = flq.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fnm var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, ag.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fnp $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
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
      fok.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fuu.a<fok.a> {
      private static final int b = 38;
      final fmk c;
      private final List<fnt> d;

      a(final fmk $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fok.a.a(), new fok.a.b());
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fnt.a(fok.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(ftk $$0, fmk $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fok.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fok.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fok.this.p, fpg.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fnt.a($$0, this.d, fok.this.K, $$2, $$3, $$4, $$5);
         fpg.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xg a() {
         xg $$0 = xf.b(xg.b(this.c.b), xg.b(this.c.c), fpg.a(this.c.e));
         return xg.a("narrator.select", $$0);
      }

      class a extends fnt {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(ftk $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gry::H, $$3 ? fok.a : fok.b, $$1, $$2, 18, 18);
            if ($$3) {
               fok.this.J = fok.F;
            }
         }

         @Override
         public void a(int $$0) {
            fok.this.c(true);
         }
      }

      class b extends fnt {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(ftk $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gry::H, $$3 ? fok.c : fok.C, $$1, $$2, 18, 18);
            if ($$3) {
               fok.this.J = fok.G;
            }
         }

         @Override
         public void a(int $$0) {
            fok.this.c(false);
         }
      }
   }

   class b extends fuu<fok.a> {
      public b() {
         super(fqq.Q(), fok.this.n, fok.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fok.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fok.a $$0) {
         this.g($$0);
      }
   }
}
