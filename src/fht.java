import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fht extends hff {
   static final all a = all.b("pending_invite/accept_highlighted");
   static final all b = all.b("pending_invite/accept");
   static final all c = all.b("pending_invite/reject_highlighted");
   static final all B = all.b("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xl D = xl.c("mco.invites.nopending");
   static final xl E = xl.c("mco.invites.button.accept");
   static final xl F = xl.c("mco.invites.button.reject");
   private final frp G;
   private final CompletableFuture<List<ffu>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return ffa.a().i().a;
      } catch (fgv var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ae.h());
   @Nullable
   xl I;
   fht.b J;
   int K = -1;
   private flw L;
   private flw M;

   public fht(frp $$0, xl $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aS_() {
      fev.f();
      this.J = new fht.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fht.a> $$1 = $$0.stream().map($$0x -> new fht.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(D);
         }
      }, this.r);
      this.c(this.J);
      this.L = this.c((flw)flw.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.D();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((flw)flw.a(xk.d, $$0 -> this.aP_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((flw)flw.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.D();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.D();
   }

   @Override
   public void aP_() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aI_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               ffa $$2x = ffa.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fgv var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ae.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fgy $$3 = this.m.bc();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
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

   class a extends fms.a<fht.a> {
      private static final int b = 38;
      final ffu c;
      private final List<fhc> d;

      a(final ffu $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fht.a.a(), new fht.a.b());
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fhc.a(fht.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(flj $$0, ffu $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fht.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fht.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fht.this.p, fio.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fhc.a($$0, this.d, fht.this.J, $$2, $$3, $$4, $$5);
         fio.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xl a() {
         xl $$0 = xk.b(xl.b(this.c.b), xl.b(this.c.c), fio.a(this.c.e));
         return xl.a("narrator.select", $$0);
      }

      class a extends fhc {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(flj $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gjh::B, $$3 ? fht.a : fht.b, $$1, $$2, 18, 18);
            if ($$3) {
               fht.this.I = fht.E;
            }
         }

         @Override
         public void a(int $$0) {
            fht.this.a($$0, true);
         }
      }

      class b extends fhc {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(flj $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gjh::B, $$3 ? fht.c : fht.B, $$1, $$2, 18, 18);
            if ($$3) {
               fht.this.I = fht.F;
            }
         }

         @Override
         public void a(int $$0) {
            fht.this.a($$0, false);
         }
      }
   }

   class b extends hfe<fht.a> {
      public b() {
         super(fht.this.n, fht.this.o - 72, 32, 36);
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
         fht.this.K = $$0;
         fht.this.D();
      }

      public void a(@Nullable fht.a $$0) {
         super.a($$0);
         fht.this.K = this.aI_().indexOf($$0);
         fht.this.D();
      }
   }
}
