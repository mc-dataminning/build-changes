import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgh extends hdp {
   static final ale a = ale.b("pending_invite/accept_highlighted");
   static final ale b = ale.b("pending_invite/accept");
   static final ale c = ale.b("pending_invite/reject_highlighted");
   static final ale B = ale.b("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xe D = xe.c("mco.invites.nopending");
   static final xe E = xe.c("mco.invites.button.accept");
   static final xe F = xe.c("mco.invites.button.reject");
   private final fqh G;
   private final CompletableFuture<List<fei>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fdy.a().i().a;
      } catch (ffj var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ad.h());
   @Nullable
   xe I;
   fgh.b J;
   int K = -1;
   private fko L;
   private fko M;

   public fgh(fqh $$0, xe $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aS_() {
      fdt.f();
      this.J = new fgh.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fgh.a> $$1 = $$0.stream().map($$0x -> new fgh.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(D);
         }
      }, this.r);
      this.c(this.J);
      this.L = this.c((fko)fko.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.D();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fko)fko.a(xd.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fko)fko.a(F, $$0 -> {
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
               fdy $$2x = fdy.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (ffj var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ad.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               ffm $$3 = this.m.bc();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
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

   class a extends flk.a<fgh.a> {
      private static final int b = 38;
      final fei c;
      private final List<ffq> d;

      a(final fei $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fgh.a.a(), new fgh.a.b());
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ffq.a(fgh.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fkb $$0, fei $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fgh.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fgh.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fgh.this.p, fhd.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         ffq.a($$0, this.d, fgh.this.J, $$2, $$3, $$4, $$5);
         fhd.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xe a() {
         xe $$0 = xd.b(xe.b(this.c.b), xe.b(this.c.c), fhd.a(this.c.e));
         return xe.a("narrator.select", $$0);
      }

      class a extends ffq {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fkb $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(ghv::B, $$3 ? fgh.a : fgh.b, $$1, $$2, 18, 18);
            if ($$3) {
               fgh.this.I = fgh.E;
            }
         }

         @Override
         public void a(int $$0) {
            fgh.this.a($$0, true);
         }
      }

      class b extends ffq {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fkb $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(ghv::B, $$3 ? fgh.c : fgh.B, $$1, $$2, 18, 18);
            if ($$3) {
               fgh.this.I = fgh.F;
            }
         }

         @Override
         public void a(int $$0) {
            fgh.this.a($$0, false);
         }
      }
   }

   class b extends hdo<fgh.a> {
      public b() {
         super(fgh.this.n, fgh.this.o - 72, 32, 36);
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
         fgh.this.K = $$0;
         fgh.this.D();
      }

      public void a(@Nullable fgh.a $$0) {
         super.a($$0);
         fgh.this.K = this.aJ_().indexOf($$0);
         fgh.this.D();
      }
   }
}
