import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fje extends hkx {
   static final aku a = aku.b("pending_invite/accept_highlighted");
   static final aku b = aku.b("pending_invite/accept");
   static final aku c = aku.b("pending_invite/reject_highlighted");
   static final aku C = aku.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wo E = wo.c("mco.invites.nopending");
   static final wo F = wo.c("mco.invites.button.accept");
   static final wo G = wo.c("mco.invites.button.reject");
   private final fuk H;
   private final CompletableFuture<List<fhe>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fgk.a().i().a;
      } catch (fig var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, af.h());
   @Nullable
   wo J;
   fje.b K;
   private fos L;
   private fos M;

   public fje(fuk $$0, wo $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aR_() {
      fgf.f();
      this.K = new fje.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fje.a> $$1 = $$0.stream().map($$0x -> new fje.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fos)fos.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fos)fos.a(wn.d, $$0 -> this.aO_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fos)fos.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fje.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fgk $$2x = fgk.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fig var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, af.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fij $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
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
      fje.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fpo.a<fje.a> {
      private static final int b = 38;
      final fhe c;
      private final List<fin> d;

      a(final fhe $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fje.a.a(), new fje.a.b());
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fin.a(fje.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fod $$0, fhe $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fje.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fje.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fje.this.p, fjz.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fin.a($$0, this.d, fje.this.K, $$2, $$3, $$4, $$5);
         fjz.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wo a() {
         wo $$0 = wn.b(wo.b(this.c.b), wo.b(this.c.c), fjz.a(this.c.e));
         return wo.a("narrator.select", $$0);
      }

      class a extends fin {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fod $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gmh::H, $$3 ? fje.a : fje.b, $$1, $$2, 18, 18);
            if ($$3) {
               fje.this.J = fje.F;
            }
         }

         @Override
         public void a(int $$0) {
            fje.this.c(true);
         }
      }

      class b extends fin {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fod $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gmh::H, $$3 ? fje.c : fje.C, $$1, $$2, 18, 18);
            if ($$3) {
               fje.this.J = fje.G;
            }
         }

         @Override
         public void a(int $$0) {
            fje.this.c(false);
         }
      }
   }

   class b extends fpo<fje.a> {
      public b() {
         super(flj.Q(), fje.this.n, fje.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fje.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fje.a $$0) {
         this.g($$0);
      }
   }
}
