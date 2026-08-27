import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erc extends ghw {
   static final agm a = new agm("pending_invite/accept_highlighted");
   static final agm b = new agm("pending_invite/accept");
   static final agm c = new agm("pending_invite/reject_highlighted");
   static final agm v = new agm("pending_invite/reject");
   private static final Logger w = LogUtils.getLogger();
   private static final uv x = uv.c("mco.invites.nopending");
   static final uv y = uv.c("mco.invites.button.accept");
   static final uv z = uv.c("mco.invites.button.reject");
   private final faz A;
   private final CompletableFuture<List<epb>> B = CompletableFuture.supplyAsync(() -> {
      try {
         return eor.a().i().a;
      } catch (eqe var1x) {
         w.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   uv C;
   erc.b D;
   int E = -1;
   private eve F;
   private eve G;

   public erc(faz $$0, uv $$1) {
      super($$1);
      this.A = $$0;
   }

   @Override
   public void aQ_() {
      eom.e();
      this.D = new erc.b();
      this.B.thenAcceptAsync($$0 -> {
         List<erc.a> $$1 = $$0.stream().map($$0x -> new erc.a($$0x)).toList();
         this.D.a($$1);
         if ($$1.isEmpty()) {
            this.f.aU().b(x);
         }
      }, this.j);
      this.d(this.D);
      this.F = this.d(eve.a(y, $$0 -> {
         this.a(this.E, true);
         this.E = -1;
         this.C();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(eve.a(uu.d, $$0 -> this.aG_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.G = this.d(eve.a(z, $$0 -> {
         this.a(this.E, false);
         this.E = -1;
         this.C();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void aG_() {
      this.f.a(this.A);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.D.k()) {
         String $$2 = this.D.i().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               eor $$2x = eor.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (eqe var3x) {
               w.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.D.b($$0);
               eqh $$3 = this.f.aX();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C = null;
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.C != null) {
         $$0.a(this.i, this.C, $$1, $$2);
      }

      if (this.B.isDone() && this.D.k() == 0) {
         $$0.a(this.i, x, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   @Override
   void C() {
      this.F.j = this.a(this.E);
      this.G.j = this.a(this.E);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends ewa.a<erc.a> {
      private static final int b = 38;
      final epb c;
      private final List<eql> d;

      a(epb $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new erc.a.a(), new erc.a.b());
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eql.a(erc.this.D, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(eut $$0, epb $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(erc.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(erc.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(erc.this.i, ery.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         eql.a($$0, this.d, erc.this.D, $$2, $$3, $$4, $$5);
         ery.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public uv a() {
         uv $$0 = uu.b(uv.b(this.c.b), uv.b(this.c.c), ery.a(this.c.e));
         return uv.a("narrator.select", $$0);
      }

      class a extends eql {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(eut $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? erc.a : erc.b, $$1, $$2, 18, 18);
            if ($$3) {
               erc.this.C = erc.y;
            }
         }

         @Override
         public void a(int $$0) {
            erc.this.a($$0, true);
         }
      }

      class b extends eql {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(eut $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? erc.c : erc.v, $$1, $$2, 18, 18);
            if ($$3) {
               erc.this.C = erc.z;
            }
         }

         @Override
         public void a(int $$0) {
            erc.this.a($$0, false);
         }
      }
   }

   class b extends ghv<erc.a> {
      public b() {
         super(erc.this.g, erc.this.h, 32, erc.this.h - 40, 36);
      }

      public void b(int $$0) {
         this.j($$0);
      }

      @Override
      public int a() {
         return this.k() * 36;
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
         erc.this.E = $$0;
         erc.this.C();
      }

      public void a(@Nullable erc.a $$0) {
         super.a($$0);
         erc.this.E = this.i().indexOf($$0);
         erc.this.C();
      }
   }
}
