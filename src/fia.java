import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fia extends hfq {
   static final alj a = alj.b("pending_invite/accept_highlighted");
   static final alj b = alj.b("pending_invite/accept");
   static final alj c = alj.b("pending_invite/reject_highlighted");
   static final alj B = alj.b("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xj D = xj.c("mco.invites.nopending");
   static final xj E = xj.c("mco.invites.button.accept");
   static final xj F = xj.c("mco.invites.button.reject");
   private final frw G;
   private final CompletableFuture<List<fgb>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return ffh.a().i().a;
      } catch (fhc var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ae.h());
   @Nullable
   xj I;
   fia.b J;
   int K = -1;
   private fmd L;
   private fmd M;

   public fia(frw $$0, xj $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aR_() {
      ffc.f();
      this.J = new fia.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fia.a> $$1 = $$0.stream().map($$0x -> new fia.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(D);
         }
      }, this.r);
      this.c(this.J);
      this.L = this.c((fmd)fmd.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.F();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fmd)fmd.a(xi.d, $$0 -> this.aO_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fmd)fmd.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.F();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.F();
   }

   @Override
   public void aO_() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aH_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               ffh $$2x = ffh.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fhc var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ae.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fhf $$3 = this.m.bc();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
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

   void F() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fmz.a<fia.a> {
      private static final int b = 38;
      final fgb c;
      private final List<fhj> d;

      a(final fgb $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fia.a.a(), new fia.a.b());
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fhj.a(fia.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(flq $$0, fgb $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fia.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fia.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fia.this.p, fiv.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fhj.a($$0, this.d, fia.this.J, $$2, $$3, $$4, $$5);
         fiv.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xj a() {
         xj $$0 = xi.b(xj.b(this.c.b), xj.b(this.c.c), fiv.a(this.c.e));
         return xj.a("narrator.select", $$0);
      }

      class a extends fhj {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(flq $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gjq::B, $$3 ? fia.a : fia.b, $$1, $$2, 18, 18);
            if ($$3) {
               fia.this.I = fia.E;
            }
         }

         @Override
         public void a(int $$0) {
            fia.this.a($$0, true);
         }
      }

      class b extends fhj {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(flq $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gjq::B, $$3 ? fia.c : fia.B, $$1, $$2, 18, 18);
            if ($$3) {
               fia.this.I = fia.F;
            }
         }

         @Override
         public void a(int $$0) {
            fia.this.a($$0, false);
         }
      }
   }

   class b extends hfp<fia.a> {
      public b() {
         super(fia.this.n, fia.this.o - 72, 32, 36);
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
         fia.this.K = $$0;
         fia.this.F();
      }

      public void a(@Nullable fia.a $$0) {
         super.a($$0);
         fia.this.K = this.aH_().indexOf($$0);
         fia.this.F();
      }
   }
}
