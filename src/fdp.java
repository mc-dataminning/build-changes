import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdp extends gvu {
   static final akk a = new akk("pending_invite/accept_highlighted");
   static final akk b = new akk("pending_invite/accept");
   static final akk c = new akk("pending_invite/reject_highlighted");
   static final akk A = new akk("pending_invite/reject");
   private static final Logger B = LogUtils.getLogger();
   private static final wu C = wu.c("mco.invites.nopending");
   static final wu D = wu.c("mco.invites.button.accept");
   static final wu E = wu.c("mco.invites.button.reject");
   private final fnl F;
   private final CompletableFuture<List<fbo>> G = CompletableFuture.supplyAsync(() -> {
      try {
         return fbe.a().i().a;
      } catch (fcr var1x) {
         B.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.h());
   @Nullable
   wu H;
   fdp.b I;
   int J = -1;
   private fhu K;
   private fhu L;

   public fdp(fnl $$0, wu $$1) {
      super($$1);
      this.F = $$0;
   }

   @Override
   public void aP_() {
      faz.f();
      this.I = new fdp.b();
      this.G.thenAcceptAsync($$0 -> {
         List<fdp.a> $$1 = $$0.stream().map($$0x -> new fdp.a($$0x)).toList();
         this.I.a($$1);
         if ($$1.isEmpty()) {
            this.l.aV().b(C);
         }
      }, this.p);
      this.c(this.I);
      this.K = this.c((fhu)fhu.a(D, $$0 -> {
         this.a(this.J, true);
         this.J = -1;
         this.D();
      }).a(this.m / 2 - 174, this.n - 32, 100, 20).a());
      this.c((fhu)fhu.a(wt.d, $$0 -> this.d()).a(this.m / 2 - 50, this.n - 32, 100, 20).a());
      this.L = this.c((fhu)fhu.a(E, $$0 -> {
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
               fbe $$2x = fbe.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fcr var3x) {
               B.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.I.a($$0);
               fcu $$3 = this.l.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.p);
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
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

   class a extends fiq.a<fdp.a> {
      private static final int b = 38;
      final fbo c;
      private final List<fcy> d;

      a(final fbo $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fdp.a.a(), new fdp.a.b());
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fcy.a(fdp.this.I, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fhh $$0, fbo $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fdp.this.o, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fdp.this.o, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fdp.this.o, fel.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fcy.a($$0, this.d, fdp.this.I, $$2, $$3, $$4, $$5);
         fel.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wu a() {
         wu $$0 = wt.b(wu.b(this.c.b), wu.b(this.c.c), fel.a(this.c.e));
         return wu.a("narrator.select", $$0);
      }

      class a extends fcy {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fhh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fdp.a : fdp.b, $$1, $$2, 18, 18);
            if ($$3) {
               fdp.this.H = fdp.D;
            }
         }

         @Override
         public void a(int $$0) {
            fdp.this.a($$0, true);
         }
      }

      class b extends fcy {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fhh $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fdp.c : fdp.A, $$1, $$2, 18, 18);
            if ($$3) {
               fdp.this.H = fdp.E;
            }
         }

         @Override
         public void a(int $$0) {
            fdp.this.a($$0, false);
         }
      }
   }

   class b extends gvt<fdp.a> {
      public b() {
         super(fdp.this.m, fdp.this.n - 72, 32, 36);
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
         fdp.this.J = $$0;
         fdp.this.D();
      }

      public void a(@Nullable fdp.a $$0) {
         super.a($$0);
         fdp.this.J = this.aG_().indexOf($$0);
         fdp.this.D();
      }
   }
}
