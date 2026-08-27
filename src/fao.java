import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fao extends gsq {
   static final akf a = new akf("pending_invite/accept_highlighted");
   static final akf b = new akf("pending_invite/accept");
   static final akf c = new akf("pending_invite/reject_highlighted");
   static final akf B = new akf("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final ws D = ws.c("mco.invites.nopending");
   static final ws E = ws.c("mco.invites.button.accept");
   static final ws F = ws.c("mco.invites.button.reject");
   private final fkt G;
   private final CompletableFuture<List<eyn>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return eyd.a().i().a;
      } catch (ezq var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   ws I;
   fao.b J;
   int K = -1;
   private feu L;
   private feu M;

   public fao(fkt $$0, ws $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aM_() {
      exy.f();
      this.J = new fao.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fao.a> $$1 = $$0.stream().map($$0x -> new fao.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((feu)feu.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.C();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((feu)feu.a(wr.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((feu)feu.a(F, $$0 -> {
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
         String $$2 = this.J.aE_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               eyd $$2x = eyd.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (ezq var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               ezt $$3 = this.m.bb();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
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

   class a extends ffq.a<fao.a> {
      private static final int b = 38;
      final eyn c;
      private final List<ezx> d;

      a(eyn $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fao.a.a(), new fao.a.b());
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ezx.a(fao.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(feh $$0, eyn $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fao.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fao.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fao.this.p, fbk.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         ezx.a($$0, this.d, fao.this.J, $$2, $$3, $$4, $$5);
         fbk.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public ws a() {
         ws $$0 = wr.b(ws.b(this.c.b), ws.b(this.c.c), fbk.a(this.c.e));
         return ws.a("narrator.select", $$0);
      }

      class a extends ezx {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(feh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fao.a : fao.b, $$1, $$2, 18, 18);
            if ($$3) {
               fao.this.I = fao.E;
            }
         }

         @Override
         public void a(int $$0) {
            fao.this.a($$0, true);
         }
      }

      class b extends ezx {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(feh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fao.c : fao.B, $$1, $$2, 18, 18);
            if ($$3) {
               fao.this.I = fao.F;
            }
         }

         @Override
         public void a(int $$0) {
            fao.this.a($$0, false);
         }
      }
   }

   class b extends gsp<fao.a> {
      public b() {
         super(fao.this.n, fao.this.o - 72, 32, 36);
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
         fao.this.K = $$0;
         fao.this.C();
      }

      public void a(@Nullable fao.a $$0) {
         super.a($$0);
         fao.this.K = this.aE_().indexOf($$0);
         fao.this.C();
      }
   }
}
