import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgs extends hee {
   static final alh a = alh.b("pending_invite/accept_highlighted");
   static final alh b = alh.b("pending_invite/accept");
   static final alh c = alh.b("pending_invite/reject_highlighted");
   static final alh B = alh.b("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xh D = xh.c("mco.invites.nopending");
   static final xh E = xh.c("mco.invites.button.accept");
   static final xh F = xh.c("mco.invites.button.reject");
   private final fqs G;
   private final CompletableFuture<List<fet>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fej.a().i().a;
      } catch (ffu var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ad.h());
   @Nullable
   xh I;
   fgs.b J;
   int K = -1;
   private fkz L;
   private fkz M;

   public fgs(fqs $$0, xh $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aS_() {
      fee.f();
      this.J = new fgs.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fgs.a> $$1 = $$0.stream().map($$0x -> new fgs.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.ba().b(D);
         }
      }, this.r);
      this.c(this.J);
      this.L = this.c((fkz)fkz.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.D();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fkz)fkz.a(xg.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fkz)fkz.a(F, $$0 -> {
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
         String $$2 = this.J.aJ_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fej $$2x = fej.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (ffu var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ad.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               ffx $$3 = this.m.bd();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
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

   class a extends flv.a<fgs.a> {
      private static final int b = 38;
      final fet c;
      private final List<fgb> d;

      a(final fet $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fgs.a.a(), new fgs.a.b());
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fgb.a(fgs.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fkm $$0, fet $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fgs.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fgs.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fgs.this.p, fho.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fgb.a($$0, this.d, fgs.this.J, $$2, $$3, $$4, $$5);
         fho.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xh a() {
         xh $$0 = xg.b(xh.b(this.c.b), xh.b(this.c.c), fho.a(this.c.e));
         return xh.a("narrator.select", $$0);
      }

      class a extends fgb {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fkm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gig::B, $$3 ? fgs.a : fgs.b, $$1, $$2, 18, 18);
            if ($$3) {
               fgs.this.I = fgs.E;
            }
         }

         @Override
         public void a(int $$0) {
            fgs.this.a($$0, true);
         }
      }

      class b extends fgb {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fkm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gig::B, $$3 ? fgs.c : fgs.B, $$1, $$2, 18, 18);
            if ($$3) {
               fgs.this.I = fgs.F;
            }
         }

         @Override
         public void a(int $$0) {
            fgs.this.a($$0, false);
         }
      }
   }

   class b extends hed<fgs.a> {
      public b() {
         super(fgs.this.n, fgs.this.o - 72, 32, 36);
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
         fgs.this.K = $$0;
         fgs.this.D();
      }

      public void a(@Nullable fgs.a $$0) {
         super.a($$0);
         fgs.this.K = this.aJ_().indexOf($$0);
         fgs.this.D();
      }
   }
}
