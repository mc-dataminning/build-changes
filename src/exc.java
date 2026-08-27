import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exc extends gpe {
   static final ajh a = new ajh("pending_invite/accept_highlighted");
   static final ajh b = new ajh("pending_invite/accept");
   static final ajh c = new ajh("pending_invite/reject_highlighted");
   static final ajh v = new ajh("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final vu x = vu.c("mco.invites.nopending");
   static final vu y = vu.c("mco.invites.button.accept");
   static final vu z = vu.c("mco.invites.button.reject");
   private final fhh A;
   private final CompletableFuture<List<evb>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return eur.a().i().a;
      } catch (ewe var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   vu C;
   exc.b D;
   int E = -1;
   private fbi F;
   private fbi G;

   public exc(fhh $$0, vu $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aO_() {
      eum.f();
      this.D = new exc.b();
      this.B.thenAcceptAsync($$0 -> {
         List<exc.a> $$1 = $$0.stream().map($$0x -> new exc.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aY().b(x);
         }
      }, this.j);
      this.c(this.D);
      this.F = this.c((fbi)fbi.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.E();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.c((fbi)fbi.a(vt.d, $$0 -> this.d()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.c((fbi)fbi.a(z, $$0 -> {
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
               eur $$2x = eur.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (ewe var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               ewh $$3 = this.f.bb();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
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

   class a extends fce.a<exc.a> {
      private static final int b = 38;
      final evb c;
      private final List<ewl> d;

      a(evb $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new exc.a.a(), new exc.a.b());
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ewl.a(exc.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(fav $$0, evb $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(exc.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(exc.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(exc.this.i, exy.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         ewl.a($$0, this.d, exc.this.D, $$2, $$3, $$4, $$5);
         exy.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public vu a() {
         vu $$0 = vt.b(vu.b(this.c.b), vu.b(this.c.c), exy.a(this.c.e));
         return vu.a("narrator.select", $$0);
      }

      class a extends ewl {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fav $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? exc.a : exc.b, $$1, $$2, 18, 18);
            if ($$3) {
               exc.this.C = exc.y;
            }
         }

         @Override
         public void a(int $$0) {
            exc.this.a($$0, true);
         }
      }

      class b extends ewl {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fav $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? exc.c : exc.v, $$1, $$2, 18, 18);
            if ($$3) {
               exc.this.C = exc.z;
            }
         }

         @Override
         public void a(int $$0) {
            exc.this.a($$0, false);
         }
      }
   }

   class b extends gpd<exc.a> {
      public b() {
         super(exc.this.g, exc.this.h - 72, 32, 36);
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
         exc.this.E = $$0;
         exc.this.E();
      }

      public void a(@Nullable exc.a $$0) {
         super.a($$0);
         exc.this.E = this.l().indexOf($$0);
         exc.this.E();
      }
   }
}
