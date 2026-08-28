import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fef extends gwo {
   static final akr a = akr.b("pending_invite/accept_highlighted");
   static final akr b = akr.b("pending_invite/accept");
   static final akr c = akr.b("pending_invite/reject_highlighted");
   static final akr B = akr.b("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final wz D = wz.c("mco.invites.nopending");
   static final wz E = wz.c("mco.invites.button.accept");
   static final wz F = wz.c("mco.invites.button.reject");
   private final fob G;
   private final CompletableFuture<List<fcg>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fbw.a().i().a;
      } catch (fdh var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ad.h());
   @Nullable
   wz I;
   fef.b J;
   int K = -1;
   private fik L;
   private fik M;

   public fef(fob $$0, wz $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aT_() {
      fbr.f();
      this.J = new fef.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fef.a> $$1 = $$0.stream().map($$0x -> new fef.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.l.aV().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((fik)fik.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.C();
      }).a(this.m / 2 - 174, this.n - 32, 100, 20).a());
      this.c((fik)fik.a(wy.d, $$0 -> this.d()).a(this.m / 2 - 50, this.n - 32, 100, 20).a());
      this.M = this.c((fik)fik.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.C();
      }).a(this.m / 2 + 74, this.n - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void d() {
      this.l.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aK_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fbw $$2x = fbw.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fdh var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ad.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fdk $$3 = this.l.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.I = null;
      $$0.a(this.o, this.k, this.m / 2, 12, -1);
      if (this.I != null) {
         $$0.a(this.o, this.I, $$1, $$2);
      }

      if (this.H.isDone() && this.J.l() == 0) {
         $$0.a(this.o, D, this.m / 2, this.n / 2 - 20, -1);
      }
   }

   void C() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fjg.a<fef.a> {
      private static final int b = 38;
      final fcg c;
      private final List<fdo> d;

      a(final fcg $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fef.a.a(), new fef.a.b());
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdo.a(fef.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fhx $$0, fcg $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fef.this.o, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fef.this.o, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fef.this.o, ffb.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fdo.a($$0, this.d, fef.this.J, $$2, $$3, $$4, $$5);
         ffb.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wz a() {
         wz $$0 = wy.b(wz.b(this.c.b), wz.b(this.c.c), ffb.a(this.c.e));
         return wz.a("narrator.select", $$0);
      }

      class a extends fdo {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fhx $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fef.a : fef.b, $$1, $$2, 18, 18);
            if ($$3) {
               fef.this.I = fef.E;
            }
         }

         @Override
         public void a(int $$0) {
            fef.this.a($$0, true);
         }
      }

      class b extends fdo {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fhx $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fef.c : fef.B, $$1, $$2, 18, 18);
            if ($$3) {
               fef.this.I = fef.F;
            }
         }

         @Override
         public void a(int $$0) {
            fef.this.a($$0, false);
         }
      }
   }

   class b extends gwn<fef.a> {
      public b() {
         super(fef.this.m, fef.this.n - 72, 32, 36);
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
         fef.this.K = $$0;
         fef.this.C();
      }

      public void a(@Nullable fef.a $$0) {
         super.a($$0);
         fef.this.K = this.aK_().indexOf($$0);
         fef.this.C();
      }
   }
}
