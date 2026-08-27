import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezj extends grl {
   static final ajt a = new ajt("pending_invite/accept_highlighted");
   static final ajt b = new ajt("pending_invite/accept");
   static final ajt c = new ajt("pending_invite/reject_highlighted");
   static final ajt y = new ajt("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final wg A = wg.c("mco.invites.nopending");
   static final wg B = wg.c("mco.invites.button.accept");
   static final wg C = wg.c("mco.invites.button.reject");
   private final fjo D;
   private final CompletableFuture<List<exi>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return ewy.a().i().a;
      } catch (eyl var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   wg F;
   ezj.b G;
   int H = -1;
   private fdp I;
   private fdp J;

   public ezj(fjo $$0, wg $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aN_() {
      ewt.f();
      this.G = new ezj.b();
      this.E.thenAcceptAsync($$0 -> {
         List<ezj.a> $$1 = $$0.stream().map($$0x -> new ezj.a($$0x)).toList();
         this.G.a($$1);
         if ($$1.isEmpty()) {
            this.j.aY().b(A);
         }
      }, this.n);
      this.c(this.G);
      this.I = this.c((fdp)fdp.a(B, $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.C();
      }).a(this.k / 2 - 174, this.l - 32, 100, 20).a());
      this.c((fdp)fdp.a(wf.d, $$0 -> this.d()).a(this.k / 2 - 50, this.l - 32, 100, 20).a());
      this.J = this.c((fdp)fdp.a(C, $$0 -> {
         this.a(this.H, false);
         this.H = -1;
         this.C();
      }).a(this.k / 2 + 74, this.l - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void d() {
      this.j.a(this.D);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.G.l()) {
         String $$2 = this.G.aF_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               ewy $$2x = ewy.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (eyl var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.a($$0);
               eyo $$3 = this.j.bb();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.n);
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F = null;
      $$0.a(this.m, this.i, this.k / 2, 12, -1);
      if (this.F != null) {
         $$0.a(this.m, this.F, $$1, $$2);
      }

      if (this.E.isDone() && this.G.l() == 0) {
         $$0.a(this.m, A, this.k / 2, this.l / 2 - 20, -1);
      }
   }

   void C() {
      this.I.k = this.a(this.H);
      this.J.k = this.a(this.H);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fel.a<ezj.a> {
      private static final int b = 38;
      final exi c;
      private final List<eys> d;

      a(exi $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new ezj.a.a(), new ezj.a.b());
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eys.a(ezj.this.G, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fdc $$0, exi $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(ezj.this.m, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(ezj.this.m, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(ezj.this.m, faf.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         eys.a($$0, this.d, ezj.this.G, $$2, $$3, $$4, $$5);
         faf.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wg a() {
         wg $$0 = wf.b(wg.b(this.c.b), wg.b(this.c.c), faf.a(this.c.e));
         return wg.a("narrator.select", $$0);
      }

      class a extends eys {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fdc $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? ezj.a : ezj.b, $$1, $$2, 18, 18);
            if ($$3) {
               ezj.this.F = ezj.B;
            }
         }

         @Override
         public void a(int $$0) {
            ezj.this.a($$0, true);
         }
      }

      class b extends eys {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fdc $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? ezj.c : ezj.y, $$1, $$2, 18, 18);
            if ($$3) {
               ezj.this.F = ezj.C;
            }
         }

         @Override
         public void a(int $$0) {
            ezj.this.a($$0, false);
         }
      }
   }

   class b extends grk<ezj.a> {
      public b() {
         super(ezj.this.k, ezj.this.l - 72, 32, 36);
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
         ezj.this.H = $$0;
         ezj.this.C();
      }

      public void a(@Nullable ezj.a $$0) {
         super.a($$0);
         ezj.this.H = this.aF_().indexOf($$0);
         ezj.this.C();
      }
   }
}
