import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evi extends gnd {
   static final aiy a = new aiy("pending_invite/accept_highlighted");
   static final aiy b = new aiy("pending_invite/accept");
   static final aiy c = new aiy("pending_invite/reject_highlighted");
   static final aiy v = new aiy("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final vq x = vq.c("mco.invites.nopending");
   static final vq y = vq.c("mco.invites.button.accept");
   static final vq z = vq.c("mco.invites.button.reject");
   private final ffl A;
   private final CompletableFuture<List<eth>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return esx.a().i().a;
      } catch (euk var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   vq C;
   evi.b D;
   int E = -1;
   private ezo F;
   private ezo G;

   public evi(ffl $$0, vq $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aQ_() {
      ess.f();
      this.D = new evi.b();
      this.B.thenAcceptAsync($$0 -> {
         List<evi.a> $$1 = $$0.stream().map($$0x -> new evi.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aX().b(x);
         }
      }, this.j);
      this.c(this.D);
      this.F = this.c((ezo)ezo.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.E();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.c((ezo)ezo.a(vp.d, $$0 -> this.d()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.c((ezo)ezo.a(z, $$0 -> {
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
               esx $$2x = esx.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (euk var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               eun $$3 = this.f.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
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

   class a extends fak.a<evi.a> {
      private static final int b = 38;
      final eth c;
      private final List<eur> d;

      a(eth $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new evi.a.a(), new evi.a.b());
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eur.a(evi.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(ezb $$0, eth $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(evi.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(evi.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(evi.this.i, ewe.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         eur.a($$0, this.d, evi.this.D, $$2, $$3, $$4, $$5);
         ewe.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public vq a() {
         vq $$0 = vp.b(vq.b(this.c.b), vq.b(this.c.c), ewe.a(this.c.e));
         return vq.a("narrator.select", $$0);
      }

      class a extends eur {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(ezb $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? evi.a : evi.b, $$1, $$2, 18, 18);
            if ($$3) {
               evi.this.C = evi.y;
            }
         }

         @Override
         public void a(int $$0) {
            evi.this.a($$0, true);
         }
      }

      class b extends eur {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(ezb $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? evi.c : evi.v, $$1, $$2, 18, 18);
            if ($$3) {
               evi.this.C = evi.z;
            }
         }

         @Override
         public void a(int $$0) {
            evi.this.a($$0, false);
         }
      }
   }

   class b extends gnc<evi.a> {
      public b() {
         super(evi.this.g, evi.this.h - 72, 32, 36);
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
         evi.this.E = $$0;
         evi.this.E();
      }

      public void a(@Nullable evi.a $$0) {
         super.a($$0);
         evi.this.E = this.l().indexOf($$0);
         evi.this.E();
      }
   }
}
