import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbv extends gty {
   static final akn a = new akn("pending_invite/accept_highlighted");
   static final akn b = new akn("pending_invite/accept");
   static final akn c = new akn("pending_invite/reject_highlighted");
   static final akn B = new akn("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final wx D = wx.c("mco.invites.nopending");
   static final wx E = wx.c("mco.invites.button.accept");
   static final wx F = wx.c("mco.invites.button.reject");
   private final flz G;
   private final CompletableFuture<List<ezu>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return ezk.a().i().a;
      } catch (fax var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.h());
   @Nullable
   wx I;
   fbv.b J;
   int K = -1;
   private fga L;
   private fga M;

   public fbv(flz $$0, wx $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aN_() {
      ezf.f();
      this.J = new fbv.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fbv.a> $$1 = $$0.stream().map($$0x -> new fbv.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aX().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((fga)fga.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.C();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fga)fga.a(ww.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fga)fga.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.C();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aF_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               ezk $$2x = ezk.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fax var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fba $$3 = this.m.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
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

   void C() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fgw.a<fbv.a> {
      private static final int b = 38;
      final ezu c;
      private final List<fbe> d;

      a(ezu $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fbv.a.a(), new fbv.a.b());
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fbe.a(fbv.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(ffn $$0, ezu $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fbv.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fbv.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fbv.this.p, fcr.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fbe.a($$0, this.d, fbv.this.J, $$2, $$3, $$4, $$5);
         fcr.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wx a() {
         wx $$0 = ww.b(wx.b(this.c.b), wx.b(this.c.c), fcr.a(this.c.e));
         return wx.a("narrator.select", $$0);
      }

      class a extends fbe {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(ffn $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fbv.a : fbv.b, $$1, $$2, 18, 18);
            if ($$3) {
               fbv.this.I = fbv.E;
            }
         }

         @Override
         public void a(int $$0) {
            fbv.this.a($$0, true);
         }
      }

      class b extends fbe {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(ffn $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fbv.c : fbv.B, $$1, $$2, 18, 18);
            if ($$3) {
               fbv.this.I = fbv.F;
            }
         }

         @Override
         public void a(int $$0) {
            fbv.this.a($$0, false);
         }
      }
   }

   class b extends gtx<fbv.a> {
      public b() {
         super(fbv.this.n, fbv.this.o - 72, 32, 36);
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
         fbv.this.K = $$0;
         fbv.this.C();
      }

      public void a(@Nullable fbv.a $$0) {
         super.a($$0);
         fbv.this.K = this.aF_().indexOf($$0);
         fbv.this.C();
      }
   }
}
