import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etl extends gld {
   static final ahh a = new ahh("pending_invite/accept_highlighted");
   static final ahh b = new ahh("pending_invite/accept");
   static final ahh c = new ahh("pending_invite/reject_highlighted");
   static final ahh v = new ahh("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final vg x = vg.c("mco.invites.nopending");
   static final vg y = vg.c("mco.invites.button.accept");
   static final vg z = vg.c("mco.invites.button.reject");
   private final fdm A;
   private final CompletableFuture<List<erk>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return era.a().i().a;
      } catch (esn var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   vg C;
   etl.b D;
   int E = -1;
   private exr F;
   private exr G;

   public etl(fdm $$0, vg $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aP_() {
      eqv.f();
      this.D = new etl.b();
      this.B.thenAcceptAsync($$0 -> {
         List<etl.a> $$1 = $$0.stream().map($$0x -> new etl.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aW().b(x);
         }
      }, this.j);
      this.d(this.D);
      this.F = this.d(exr.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.E();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(exr.a(vf.d, $$0 -> this.d()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.d(exr.a(z, $$0 -> {
         this.a(this.E, false);
         this.E = -1;
         this.E();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void d() {
      this.f.a(this.A);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.D.n()) {
         String $$2 = this.D.l().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               era $$2x = era.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (esn var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               esq $$3 = this.f.aZ();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
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

   void E() {
      this.F.k = this.a(this.E);
      this.G.k = this.a(this.E);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends eyn.a<etl.a> {
      private static final int b = 38;
      final erk c;
      private final List<esu> d;

      a(erk $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new etl.a.a(), new etl.a.b());
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         esu.a(etl.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(exe $$0, erk $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(etl.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(etl.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(etl.this.i, euh.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         esu.a($$0, this.d, etl.this.D, $$2, $$3, $$4, $$5);
         euh.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public vg a() {
         vg $$0 = vf.b(vg.b(this.c.b), vg.b(this.c.c), euh.a(this.c.e));
         return vg.a("narrator.select", $$0);
      }

      class a extends esu {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(exe $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? etl.a : etl.b, $$1, $$2, 18, 18);
            if ($$3) {
               etl.this.C = etl.y;
            }
         }

         @Override
         public void a(int $$0) {
            etl.this.a($$0, true);
         }
      }

      class b extends esu {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(exe $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? etl.c : etl.v, $$1, $$2, 18, 18);
            if ($$3) {
               etl.this.C = etl.z;
            }
         }

         @Override
         public void a(int $$0) {
            etl.this.a($$0, false);
         }
      }
   }

   class b extends glc<etl.a> {
      public b() {
         super(etl.this.g, etl.this.h - 72, 32, 36);
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
         etl.this.E = $$0;
         etl.this.E();
      }

      public void a(@Nullable etl.a $$0) {
         super.a($$0);
         etl.this.E = this.l().indexOf($$0);
         etl.this.E();
      }
   }
}
