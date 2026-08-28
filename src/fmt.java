import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmt extends hpj {
   static final alg a = alg.b("pending_invite/accept_highlighted");
   static final alg b = alg.b("pending_invite/accept");
   static final alg c = alg.b("pending_invite/reject_highlighted");
   static final alg C = alg.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wy E = wy.c("mco.invites.nopending");
   static final wy F = wy.c("mco.invites.button.accept");
   static final wy G = wy.c("mco.invites.button.reject");
   private final fyb H;
   private final CompletableFuture<List<fkt>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fjz.a().i().a;
      } catch (flv var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, af.i());
   @Nullable
   wy J;
   fmt.b K;
   private fsj L;
   private fsj M;

   public fmt(fyb $$0, wy $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aO_() {
      fju.f();
      this.K = new fmt.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fmt.a> $$1 = $$0.stream().map($$0x -> new fmt.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fsj)fsj.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fsj)fsj.a(wx.d, $$0 -> this.aL_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fsj)fsj.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aL_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fmt.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fjz $$2x = fjz.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (flv var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, af.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fly $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
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
      fmt.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends ftf.a<fmt.a> {
      private static final int b = 38;
      final fkt c;
      private final List<fmc> d;

      a(final fkt $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fmt.a.a(), new fmt.a.b());
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fmc.a(fmt.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(frv $$0, fkt $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fmt.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fmt.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fmt.this.p, fno.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fmc.a($$0, this.d, fmt.this.K, $$2, $$3, $$4, $$5);
         fno.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(wy.b(this.c.b), wy.b(this.c.c), fno.a(this.c.e));
         return wy.a("narrator.select", $$0);
      }

      class a extends fmc {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(frv $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gqk::H, $$3 ? fmt.a : fmt.b, $$1, $$2, 18, 18);
            if ($$3) {
               fmt.this.J = fmt.F;
            }
         }

         @Override
         public void a(int $$0) {
            fmt.this.c(true);
         }
      }

      class b extends fmc {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(frv $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gqk::H, $$3 ? fmt.c : fmt.C, $$1, $$2, 18, 18);
            if ($$3) {
               fmt.this.J = fmt.G;
            }
         }

         @Override
         public void a(int $$0) {
            fmt.this.c(false);
         }
      }
   }

   class b extends ftf<fmt.a> {
      public b() {
         super(foz.Q(), fmt.this.n, fmt.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fmt.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fmt.a $$0) {
         this.g($$0);
      }
   }
}
