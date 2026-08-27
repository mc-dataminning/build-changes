import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esu extends gkc {
   static final ahd a = new ahd("pending_invite/accept_highlighted");
   static final ahd b = new ahd("pending_invite/accept");
   static final ahd c = new ahd("pending_invite/reject_highlighted");
   static final ahd v = new ahd("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final vd x = vd.c("mco.invites.nopending");
   static final vd y = vd.c("mco.invites.button.accept");
   static final vd z = vd.c("mco.invites.button.reject");
   private final fct A;
   private final CompletableFuture<List<eqt>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return eqj.a().i().a;
      } catch (erw var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   vd C;
   esu.b D;
   int E = -1;
   private ewy F;
   private ewy G;

   public esu(fct $$0, vd $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aN_() {
      eqe.e();
      this.D = new esu.b();
      this.B.thenAcceptAsync($$0 -> {
         List<esu.a> $$1 = $$0.stream().map($$0x -> new esu.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aU().b(x);
         }
      }, this.j);
      this.d(this.D);
      this.F = this.d(ewy.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.C();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(ewy.a(vc.d, $$0 -> this.aE_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.d(ewy.a(z, $$0 -> {
         this.a(this.E, false);
         this.E = -1;
         this.C();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void aE_() {
      this.f.a(this.A);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.D.n()) {
         String $$2 = this.D.l().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               eqj $$2x = eqj.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (erw var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               erz $$3 = this.f.aX();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C = null;
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.C != null) {
         $$0.a(this.i, this.C, $$1, $$2);
      }

      if (this.B.isDone() && this.D.n() == 0) {
         $$0.a(this.i, x, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   @Override
   void C() {
      this.F.k = this.a(this.E);
      this.G.k = this.a(this.E);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends exu.a<esu.a> {
      private static final int b = 38;
      final eqt c;
      private final List<esd> d;

      a(eqt $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new esu.a.a(), new esu.a.b());
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         esd.a(esu.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(ewm $$0, eqt $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(esu.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(esu.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(esu.this.i, etq.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         esd.a($$0, this.d, esu.this.D, $$2, $$3, $$4, $$5);
         etq.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public vd a() {
         vd $$0 = vc.b(vd.b(this.c.b), vd.b(this.c.c), etq.a(this.c.e));
         return vd.a("narrator.select", $$0);
      }

      class a extends esd {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(ewm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? esu.a : esu.b, $$1, $$2, 18, 18);
            if ($$3) {
               esu.this.C = esu.y;
            }
         }

         @Override
         public void a(int $$0) {
            esu.this.a($$0, true);
         }
      }

      class b extends esd {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(ewm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? esu.c : esu.v, $$1, $$2, 18, 18);
            if ($$3) {
               esu.this.C = esu.z;
            }
         }

         @Override
         public void a(int $$0) {
            esu.this.a($$0, false);
         }
      }
   }

   class b extends gkb<esu.a> {
      public b() {
         super(esu.this.g, esu.this.h - 72, 32, 36);
      }

      public void b(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return this.n() * 36;
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
         esu.this.E = $$0;
         esu.this.C();
      }

      public void a(@Nullable esu.a $$0) {
         super.a($$0);
         esu.this.E = this.l().indexOf($$0);
         esu.this.C();
      }
   }
}
