import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezs extends gru {
   static final ajv a = new ajv("pending_invite/accept_highlighted");
   static final ajv b = new ajv("pending_invite/accept");
   static final ajv c = new ajv("pending_invite/reject_highlighted");
   static final ajv y = new ajv("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final wi A = wi.c("mco.invites.nopending");
   static final wi B = wi.c("mco.invites.button.accept");
   static final wi C = wi.c("mco.invites.button.reject");
   private final fjx D;
   private final CompletableFuture<List<exr>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return exh.a().i().a;
      } catch (eyu var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   wi F;
   ezs.b G;
   int H = -1;
   private fdy I;
   private fdy J;

   public ezs(fjx $$0, wi $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aM_() {
      exc.f();
      this.G = new ezs.b();
      this.E.thenAcceptAsync($$0 -> {
         List<ezs.a> $$1 = $$0.stream().map($$0x -> new ezs.a($$0x)).toList();
         this.G.a($$1);
         if ($$1.isEmpty()) {
            this.j.aY().b(A);
         }
      }, this.n);
      this.c(this.G);
      this.I = this.c((fdy)fdy.a(B, $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.C();
      }).a(this.k / 2 - 174, this.l - 32, 100, 20).a());
      this.c((fdy)fdy.a(wh.d, $$0 -> this.d()).a(this.k / 2 - 50, this.l - 32, 100, 20).a());
      this.J = this.c((fdy)fdy.a(C, $$0 -> {
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
         String $$2 = this.G.aE_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               exh $$2x = exh.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (eyu var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.a($$0);
               eyx $$3 = this.j.bb();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.n);
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
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

   class a extends feu.a<ezs.a> {
      private static final int b = 38;
      final exr c;
      private final List<ezb> d;

      a(exr $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new ezs.a.a(), new ezs.a.b());
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ezb.a(ezs.this.G, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fdl $$0, exr $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(ezs.this.m, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(ezs.this.m, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(ezs.this.m, fao.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         ezb.a($$0, this.d, ezs.this.G, $$2, $$3, $$4, $$5);
         fao.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wi a() {
         wi $$0 = wh.b(wi.b(this.c.b), wi.b(this.c.c), fao.a(this.c.e));
         return wi.a("narrator.select", $$0);
      }

      class a extends ezb {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fdl $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? ezs.a : ezs.b, $$1, $$2, 18, 18);
            if ($$3) {
               ezs.this.F = ezs.B;
            }
         }

         @Override
         public void a(int $$0) {
            ezs.this.a($$0, true);
         }
      }

      class b extends ezb {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fdl $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? ezs.c : ezs.y, $$1, $$2, 18, 18);
            if ($$3) {
               ezs.this.F = ezs.C;
            }
         }

         @Override
         public void a(int $$0) {
            ezs.this.a($$0, false);
         }
      }
   }

   class b extends grt<ezs.a> {
      public b() {
         super(ezs.this.k, ezs.this.l - 72, 32, 36);
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
         ezs.this.H = $$0;
         ezs.this.C();
      }

      public void a(@Nullable ezs.a $$0) {
         super.a($$0);
         ezs.this.H = this.aE_().indexOf($$0);
         ezs.this.C();
      }
   }
}
