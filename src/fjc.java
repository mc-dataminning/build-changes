import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjc extends hky {
   static final aku a = aku.b("pending_invite/accept_highlighted");
   static final aku b = aku.b("pending_invite/accept");
   static final aku c = aku.b("pending_invite/reject_highlighted");
   static final aku C = aku.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wo E = wo.c("mco.invites.nopending");
   static final wo F = wo.c("mco.invites.button.accept");
   static final wo G = wo.c("mco.invites.button.reject");
   private final fui H;
   private final CompletableFuture<List<fhc>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fgi.a().i().a;
      } catch (fie var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, af.h());
   @Nullable
   wo J;
   fjc.b K;
   private fop L;
   private fop M;

   public fjc(fui $$0, wo $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aR_() {
      fgd.f();
      this.K = new fjc.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fjc.a> $$1 = $$0.stream().map($$0x -> new fjc.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fop)fop.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fop)fop.a(wn.d, $$0 -> this.aO_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fop)fop.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fjc.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fgi $$2x = fgi.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fie var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, af.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fih $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
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
      fjc.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fpm.a<fjc.a> {
      private static final int b = 38;
      final fhc c;
      private final List<fil> d;

      a(final fhc $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fjc.a.a(), new fjc.a.b());
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fil.a(fjc.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fob $$0, fhc $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fjc.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fjc.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fjc.this.p, fjx.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fil.a($$0, this.d, fjc.this.K, $$2, $$3, $$4, $$5);
         fjx.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wo a() {
         wo $$0 = wn.b(wo.b(this.c.b), wo.b(this.c.c), fjx.a(this.c.e));
         return wo.a("narrator.select", $$0);
      }

      class a extends fil {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fob $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gmf::H, $$3 ? fjc.a : fjc.b, $$1, $$2, 18, 18);
            if ($$3) {
               fjc.this.J = fjc.F;
            }
         }

         @Override
         public void a(int $$0) {
            fjc.this.c(true);
         }
      }

      class b extends fil {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fob $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gmf::H, $$3 ? fjc.c : fjc.C, $$1, $$2, 18, 18);
            if ($$3) {
               fjc.this.J = fjc.G;
            }
         }

         @Override
         public void a(int $$0) {
            fjc.this.c(false);
         }
      }
   }

   class b extends fpm<fjc.a> {
      public b() {
         super(flh.Q(), fjc.this.n, fjc.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fjc.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fjc.a $$0) {
         this.g($$0);
      }
   }
}
