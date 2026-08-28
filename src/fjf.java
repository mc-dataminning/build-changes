import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjf extends hlf {
   static final akv a = akv.b("pending_invite/accept_highlighted");
   static final akv b = akv.b("pending_invite/accept");
   static final akv c = akv.b("pending_invite/reject_highlighted");
   static final akv C = akv.b("pending_invite/reject");
   private static final Logger D = LogUtils.getLogger();
   private static final wp E = wp.c("mco.invites.nopending");
   static final wp F = wp.c("mco.invites.button.accept");
   static final wp G = wp.c("mco.invites.button.reject");
   private final fum H;
   private final CompletableFuture<List<fhf>> I = CompletableFuture.supplyAsync(() -> {
      try {
         return fgl.a().i().a;
      } catch (fih var1x) {
         D.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, af.i());
   @Nullable
   wp J;
   fjf.b K;
   private fou L;
   private fou M;

   public fjf(fum $$0, wp $$1) {
      super($$1);
      this.H = $$0;
   }

   @Override
   public void aR_() {
      fgg.f();
      this.K = new fjf.b();
      this.I.thenAcceptAsync($$0 -> {
         List<fjf.a> $$1 = $$0.stream().map($$0x -> new fjf.a($$0x)).toList();
         this.K.a($$1);
         if ($$1.isEmpty()) {
            this.m.aY().b(E);
         }
      }, this.r);
      this.c(this.K);
      this.L = this.c((fou)fou.a(F, $$0 -> this.c(true)).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fou)fou.a(wo.d, $$0 -> this.aO_()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fou)fou.a(G, $$0 -> this.c(false)).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   @Override
   void c(boolean $$0) {
      if (this.K.p() instanceof fjf.a $$1) {
         String $$2 = $$1.c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fgl $$2x = fgl.a();
               if ($$0) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fih var3) {
               D.error("Couldn't handle invite", var3);
               return false;
            }
         }, af.i()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.K.a($$1);
               this.E();
               fik $$3 = this.m.bb();
               if ($$0) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.r);
      }
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      this.J = null;
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 12, -1);
      if (this.J != null) {
         $$0.a(this.p, this.J, $$1, $$2);
      }

      if (this.I.isDone() && this.K.b()) {
         $$0.a(this.p, E, this.n / 2, this.o / 2 - 20, -1);
      }
   }

   void E() {
      fjf.a $$0 = this.K.p();
      this.L.k = $$0 != null;
      this.M.k = $$0 != null;
   }

   class a extends fpq.a<fjf.a> {
      private static final int b = 38;
      final fhf c;
      private final List<fio> d;

      a(final fhf $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fjf.a.a(), new fjf.a.b());
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fio.a(fjf.this.K, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fof $$0, fhf $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.b(fjf.this.p, $$1.b, $$2 + 38, $$3 + 1, -1);
         $$0.b(fjf.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644);
         $$0.b(fjf.this.p, fka.a($$1.e), $$2 + 38, $$3 + 24, 7105644);
         fio.a($$0, this.d, fjf.this.K, $$2, $$3, $$4, $$5);
         fka.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wp a() {
         wp $$0 = wo.b(wp.b(this.c.b), wp.b(this.c.c), fka.a(this.c.e));
         return wp.a("narrator.select", $$0);
      }

      class a extends fio {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fof $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gmj::H, $$3 ? fjf.a : fjf.b, $$1, $$2, 18, 18);
            if ($$3) {
               fjf.this.J = fjf.F;
            }
         }

         @Override
         public void a(int $$0) {
            fjf.this.c(true);
         }
      }

      class b extends fio {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fof $$0, int $$1, int $$2, boolean $$3) {
            $$0.a(gmj::H, $$3 ? fjf.c : fjf.C, $$1, $$2, 18, 18);
            if ($$3) {
               fjf.this.J = fjf.G;
            }
         }

         @Override
         public void a(int $$0) {
            fjf.this.c(false);
         }
      }
   }

   class b extends fpq<fjf.a> {
      public b() {
         super(flk.Q(), fjf.this.n, fjf.this.o - 72, 32, 36);
      }

      @Override
      public int a() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         fjf.this.E();
      }

      public boolean b() {
         return this.t() == 0;
      }

      public void a(fjf.a $$0) {
         this.g($$0);
      }
   }
}
