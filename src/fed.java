import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fed extends gxb {
   static final akt a = new akt("pending_invite/accept_highlighted");
   static final akt b = new akt("pending_invite/accept");
   static final akt c = new akt("pending_invite/reject_highlighted");
   static final akt B = new akt("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xe D = xe.c("mco.invites.nopending");
   static final xe E = xe.c("mco.invites.button.accept");
   static final xe F = xe.c("mco.invites.button.reject");
   private final fon G;
   private final CompletableFuture<List<fcc>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fbs.a().i().a;
      } catch (fdf var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ad.g());
   @Nullable
   xe I;
   fed.b J;
   int K = -1;
   private fin L;
   private fin M;

   public fed(fon $$0, xe $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aN_() {
      fbn.f();
      this.J = new fed.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fed.a> $$1 = $$0.stream().map($$0x -> new fed.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((fin)fin.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.C();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fin)fin.a(xd.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fin)fin.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.C();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aE_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fbs $$2x = fbs.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fdf var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ad.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fdi $$3 = this.m.bc();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
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

   void C() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fjj.a<fed.a> {
      private static final int b = 38;
      final fcc c;
      private final List<fdm> d;

      a(fcc $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fed.a.a(), new fed.a.b());
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdm.a(fed.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fia $$0, fcc $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fed.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fed.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fed.this.p, fez.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fdm.a($$0, this.d, fed.this.J, $$2, $$3, $$4, $$5);
         fez.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xe a() {
         xe $$0 = xd.b(xe.b(this.c.b), xe.b(this.c.c), fez.a(this.c.e));
         return xe.a("narrator.select", $$0);
      }

      class a extends fdm {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fia $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fed.a : fed.b, $$1, $$2, 18, 18);
            if ($$3) {
               fed.this.I = fed.E;
            }
         }

         @Override
         public void a(int $$0) {
            fed.this.a($$0, true);
         }
      }

      class b extends fdm {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fia $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fed.c : fed.B, $$1, $$2, 18, 18);
            if ($$3) {
               fed.this.I = fed.F;
            }
         }

         @Override
         public void a(int $$0) {
            fed.this.a($$0, false);
         }
      }
   }

   class b extends gxa<fed.a> {
      public b() {
         super(fed.this.n, fed.this.o - 72, 32, 36);
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
         fed.this.K = $$0;
         fed.this.C();
      }

      public void a(@Nullable fed.a $$0) {
         super.a($$0);
         fed.this.K = this.aE_().indexOf($$0);
         fed.this.C();
      }
   }
}
