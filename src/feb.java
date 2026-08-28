import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feb extends gwj {
   static final akq a = akq.b("pending_invite/accept_highlighted");
   static final akq b = akq.b("pending_invite/accept");
   static final akq c = akq.b("pending_invite/reject_highlighted");
   static final akq A = akq.b("pending_invite/reject");
   private static final Logger B = LogUtils.getLogger();
   private static final wy C = wy.c("mco.invites.nopending");
   static final wy D = wy.c("mco.invites.button.accept");
   static final wy E = wy.c("mco.invites.button.reject");
   private final fnx F;
   private final CompletableFuture<List<fcc>> G = CompletableFuture.supplyAsync(() -> {
      try {
         return fbs.a().i().a;
      } catch (fdd var1x) {
         B.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ad.h());
   @Nullable
   wy H;
   feb.b I;
   int J = -1;
   private fig K;
   private fig L;

   public feb(fnx $$0, wy $$1) {
      super($$1);
      this.F = $$0;
   }

   @Override
   public void aP_() {
      fbn.f();
      this.I = new feb.b();
      this.G.thenAcceptAsync($$0 -> {
         List<feb.a> $$1 = $$0.stream().map($$0x -> new feb.a($$0x)).toList();
         this.I.a($$1);
         if ($$1.isEmpty()) {
            this.l.aV().b(C);
         }
      }, this.p);
      this.c(this.I);
      this.K = this.c((fig)fig.a(D, $$0 -> {
         this.a(this.J, true);
         this.J = -1;
         this.D();
      }).a(this.m / 2 - 174, this.n - 32, 100, 20).a());
      this.c((fig)fig.a(wx.d, $$0 -> this.d()).a(this.m / 2 - 50, this.n - 32, 100, 20).a());
      this.L = this.c((fig)fig.a(E, $$0 -> {
         this.a(this.J, false);
         this.J = -1;
         this.D();
      }).a(this.m / 2 + 74, this.n - 32, 100, 20).a());
      this.D();
   }

   @Override
   public void d() {
      this.l.a(this.F);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.I.l()) {
         String $$2 = this.I.aG_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fbs $$2x = fbs.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fdd var3x) {
               B.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ad.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.I.a($$0);
               fdg $$3 = this.l.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.p);
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H = null;
      $$0.a(this.o, this.k, this.m / 2, 12, -1);
      if (this.H != null) {
         $$0.a(this.o, this.H, $$1, $$2);
      }

      if (this.G.isDone() && this.I.l() == 0) {
         $$0.a(this.o, C, this.m / 2, this.n / 2 - 20, -1);
      }
   }

   void D() {
      this.K.k = this.a(this.J);
      this.L.k = this.a(this.J);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fjc.a<feb.a> {
      private static final int b = 38;
      final fcc c;
      private final List<fdk> d;

      a(final fcc $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new feb.a.a(), new feb.a.b());
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdk.a(feb.this.I, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fht $$0, fcc $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(feb.this.o, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(feb.this.o, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(feb.this.o, fex.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fdk.a($$0, this.d, feb.this.I, $$2, $$3, $$4, $$5);
         fex.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(wy.b(this.c.b), wy.b(this.c.c), fex.a(this.c.e));
         return wy.a("narrator.select", $$0);
      }

      class a extends fdk {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fht $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? feb.a : feb.b, $$1, $$2, 18, 18);
            if ($$3) {
               feb.this.H = feb.D;
            }
         }

         @Override
         public void a(int $$0) {
            feb.this.a($$0, true);
         }
      }

      class b extends fdk {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fht $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? feb.c : feb.A, $$1, $$2, 18, 18);
            if ($$3) {
               feb.this.H = feb.E;
            }
         }

         @Override
         public void a(int $$0) {
            feb.this.a($$0, false);
         }
      }
   }

   class b extends gwi<feb.a> {
      public b() {
         super(feb.this.m, feb.this.n - 72, 32, 36);
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
         feb.this.J = $$0;
         feb.this.D();
      }

      public void a(@Nullable feb.a $$0) {
         super.a($$0);
         feb.this.J = this.aG_().indexOf($$0);
         feb.this.D();
      }
   }
}
