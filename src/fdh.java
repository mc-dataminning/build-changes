import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdh extends gvm {
   static final akk a = new akk("pending_invite/accept_highlighted");
   static final akk b = new akk("pending_invite/accept");
   static final akk c = new akk("pending_invite/reject_highlighted");
   static final akk A = new akk("pending_invite/reject");
   private static final Logger B = LogUtils.getLogger();
   private static final wu C = wu.c("mco.invites.nopending");
   static final wu D = wu.c("mco.invites.button.accept");
   static final wu E = wu.c("mco.invites.button.reject");
   private final fnd F;
   private final CompletableFuture<List<fbg>> G = CompletableFuture.supplyAsync(() -> {
      try {
         return faw.a().i().a;
      } catch (fcj var1x) {
         B.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.h());
   @Nullable
   wu H;
   fdh.b I;
   int J = -1;
   private fhm K;
   private fhm L;

   public fdh(fnd $$0, wu $$1) {
      super($$1);
      this.F = $$0;
   }

   @Override
   public void aO_() {
      far.f();
      this.I = new fdh.b();
      this.G.thenAcceptAsync($$0 -> {
         List<fdh.a> $$1 = $$0.stream().map($$0x -> new fdh.a($$0x)).toList();
         this.I.a($$1);
         if ($$1.isEmpty()) {
            this.l.aX().b(C);
         }
      }, this.p);
      this.c(this.I);
      this.K = this.c((fhm)fhm.a(D, $$0 -> {
         this.a(this.J, true);
         this.J = -1;
         this.E();
      }).a(this.m / 2 - 174, this.n - 32, 100, 20).a());
      this.c((fhm)fhm.a(wt.d, $$0 -> this.d()).a(this.m / 2 - 50, this.n - 32, 100, 20).a());
      this.L = this.c((fhm)fhm.a(E, $$0 -> {
         this.a(this.J, false);
         this.J = -1;
         this.E();
      }).a(this.m / 2 + 74, this.n - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void d() {
      this.l.a(this.F);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.I.l()) {
         String $$2 = this.I.aF_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               faw $$2x = faw.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fcj var3x) {
               B.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.I.a($$0);
               fcm $$3 = this.l.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.p);
      }
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
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

   void E() {
      this.K.k = this.a(this.J);
      this.L.k = this.a(this.J);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fii.a<fdh.a> {
      private static final int b = 38;
      final fbg c;
      private final List<fcq> d;

      a(final fbg $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fdh.a.a(), new fdh.a.b());
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fcq.a(fdh.this.I, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fgz $$0, fbg $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fdh.this.o, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fdh.this.o, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fdh.this.o, fed.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fcq.a($$0, this.d, fdh.this.I, $$2, $$3, $$4, $$5);
         fed.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wu a() {
         wu $$0 = wt.b(wu.b(this.c.b), wu.b(this.c.c), fed.a(this.c.e));
         return wu.a("narrator.select", $$0);
      }

      class a extends fcq {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fgz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fdh.a : fdh.b, $$1, $$2, 18, 18);
            if ($$3) {
               fdh.this.H = fdh.D;
            }
         }

         @Override
         public void a(int $$0) {
            fdh.this.a($$0, true);
         }
      }

      class b extends fcq {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fgz $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fdh.c : fdh.A, $$1, $$2, 18, 18);
            if ($$3) {
               fdh.this.H = fdh.E;
            }
         }

         @Override
         public void a(int $$0) {
            fdh.this.a($$0, false);
         }
      }
   }

   class b extends gvl<fdh.a> {
      public b() {
         super(fdh.this.m, fdh.this.n - 72, 32, 36);
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
         fdh.this.J = $$0;
         fdh.this.E();
      }

      public void a(@Nullable fdh.a $$0) {
         super.a($$0);
         fdh.this.J = this.aF_().indexOf($$0);
         fdh.this.E();
      }
   }
}
