import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqx extends ghr {
   static final agi a = new agi("pending_invite/accept_highlighted");
   static final agi b = new agi("pending_invite/accept");
   static final agi c = new agi("pending_invite/reject_highlighted");
   static final agi v = new agi("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final ur x = ur.c("mco.invites.nopending");
   static final ur y = ur.c("mco.invites.button.accept");
   static final ur z = ur.c("mco.invites.button.reject");
   private final fau A;
   private final CompletableFuture<List<eow>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return eom.a().i().a;
      } catch (epz var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   ur C;
   eqx.b D;
   int E = -1;
   private euz F;
   private euz G;

   public eqx(fau $$0, ur $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aP_() {
      eoh.e();
      this.D = new eqx.b();
      this.B.thenAcceptAsync($$0 -> {
         List<eqx.a> $$1 = $$0.stream().map($$0x -> new eqx.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aU().b(x);
         }
      }, this.j);
      this.d(this.D);
      this.F = this.d(euz.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.C();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(euz.a(uq.d, $$0 -> this.aF_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.d(euz.a(z, $$0 -> {
         this.a(this.E, false);
         this.E = -1;
         this.C();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void aF_() {
      this.f.a(this.A);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.D.k()) {
         String $$2 = this.D.i().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               eom $$2x = eom.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (epz var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               eqc $$3 = this.f.aX();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C = null;
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.C != null) {
         $$0.a(this.i, this.C, $$1, $$2);
      }

      if (this.B.isDone() && this.D.k() == 0) {
         $$0.a(this.i, x, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   @Override
   void C() {
      this.F.j = this.a(this.E);
      this.G.j = this.a(this.E);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends evv.a<eqx.a> {
      private static final int b = 38;
      final eow c;
      private final List<eqg> d;

      a(eow $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eqx.a.a(), new eqx.a.b());
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eqg.a(eqx.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(euo $$0, eow $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eqx.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eqx.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eqx.this.i, ert.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         eqg.a($$0, this.d, eqx.this.D, $$2, $$3, $$4, $$5);
         ert.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public ur a() {
         ur $$0 = uq.b(ur.b(this.c.b), ur.b(this.c.c), ert.a(this.c.e));
         return ur.a("narrator.select", $$0);
      }

      class a extends eqg {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(euo $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eqx.a : eqx.b, $$1, $$2, 18, 18);
            if ($$3) {
               eqx.this.C = eqx.y;
            }
         }

         @Override
         public void a(int $$0) {
            eqx.this.a($$0, true);
         }
      }

      class b extends eqg {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(euo $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eqx.c : eqx.v, $$1, $$2, 18, 18);
            if ($$3) {
               eqx.this.C = eqx.z;
            }
         }

         @Override
         public void a(int $$0) {
            eqx.this.a($$0, false);
         }
      }
   }

   class b extends ghq<eqx.a> {
      public b() {
         super(eqx.this.g, eqx.this.h, 32, eqx.this.h - 40, 36);
      }

      public void b(int $$0) {
         this.j($$0);
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int b() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         eqx.this.E = $$0;
         eqx.this.C();
      }

      public void a(@Nullable eqx.a $$0) {
         super.a($$0);
         eqx.this.E = this.i().indexOf($$0);
         eqx.this.C();
      }
   }
}
