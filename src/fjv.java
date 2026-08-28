import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjv extends hhp {
   static final alz a = alz.b("pending_invite/accept_highlighted");
   static final alz b = alz.b("pending_invite/accept");
   static final alz c = alz.b("pending_invite/reject_highlighted");
   static final alz C = alz.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final xv E = xv.c("mco.invites.nopending");
   static final xv F = xv.c("mco.invites.button.accept");
   static final xv G = xv.c("mco.invites.button.reject");
   private final ftr H;
   private final CompletableFuture<List<fhv>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fhb.a().i().a;
      } catch (fix var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ae.h());
   @Nullable
   xv J;
   fjv.b K;
   int L = -1;
   private fny M;
   private fny N;

   public fjv(ftr $$0, xv $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aT_() {
      fgw.f();
      this.K = new fjv.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fjv.a> $$1 = $$0.stream().map($$0x -> new fjv.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.M = this.c((fny)fny.a(F, $$0 -> {
         this.a(this.L, true);
         this.L = -1;
         this.E();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fny)fny.a(xu.d, $$0 -> this.aP_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.N = this.c((fny)fny.a(G, $$0 -> {
         this.a(this.L, false);
         this.L = -1;
         this.E();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aP_() {
      this.m.a(this.H);
   }

   void a(int $$0, boolean $$1) {
      String $$2 = this.K.aI_().get($$0).c.a;
      CompletableFuture.<Boolean>supplyAsync(() -> {
         try {
            fhb $$2x = fhb.a();
            if ($$1) {
               $$2x.a($$2);
            } else {
               $$2x.b($$2);
            }

            return true;
         } catch (fix var3x) {
            D.error("Couldn't handle invite", var3x);
            return false;
         }
      }, ae.h()).thenAcceptAsync($$2x -> {
         if ($$2x) {
            this.K.a($$0);
            fja $$3 = this.m.bc();
            if ($$1) {
               $$3.c.a();
            }

            $$3.d.a();
         }
      }, this.r);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      $$0.a(this.p, this.l, this.n / 2, 12, -1);
      if (this.J != null) {
         $$0.a(this.p, this.J, $$1, $$2);
      }

      if (this.I.isDone() && this.K.b()) {
         $$0.a(this.p, E, this.n / 2, this.o / 2 - 20, -1);
      }
   }

   void E() {
      this.M.k = this.a(this.L);
      this.N.k = this.a(this.L);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fov.a<fjv.a> {
      private static final int b = 38;
      final fhv c;
      private final List<fje> d;

      a(final fhv $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fjv.a.a(), new fjv.a.b());
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fje.a(fjv.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fnl $$0, fhv $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fjv.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fjv.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fjv.this.p, fkq.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fje.a($$0, this.d, fjv.this.K, $$2, $$3, $$4, $$5);
         fkq.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xv a() {
         xv $$0 = xu.b(xv.b(this.c.b), xv.b(this.c.c), fkq.a(this.c.e));
         return xv.a("narrator.select", $$0);
      }

      class a extends fje {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fnl $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(glo::B, $$3 ? fjv.a : fjv.b, $$1, $$2, 18, 18);
            if ($$3) {
               fjv.this.J = fjv.F;
            }
         }

         @Override
         public void a(int $$0) {
            fjv.this.a($$0, true);
         }
      }

      class b extends fje {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fnl $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(glo::B, $$3 ? fjv.c : fjv.C, $$1, $$2, 18, 18);
            if ($$3) {
               fjv.this.J = fjv.G;
            }
         }

         @Override
         public void a(int $$0) {
            fjv.this.a($$0, false);
         }
      }
   }

   class b extends fov<fjv.a> {
      public b() {
         super(flz.Q(), fjv.this.n, fjv.this.o - 72, 32, 36);
      }

      @Override
      public void a(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void b(int $$0) {
         super.b($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         fjv.this.L = $$0;
         fjv.this.E();
      }

      public boolean b() {
         return this.k() == 0;
      }
   }
}
