import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class frl extends frh<cro> {
   private static final alh G = alh.b("textures/gui/container/beacon.png");
   static final alh H = alh.b("container/beacon/button_disabled");
   static final alh I = alh.b("container/beacon/button_selected");
   static final alh J = alh.b("container/beacon/button_highlighted");
   static final alh K = alh.b("container/beacon/button");
   static final alh L = alh.b("container/beacon/confirm");
   static final alh M = alh.b("container/beacon/cancel");
   private static final xh N = xh.c("block.minecraft.beacon.primary");
   private static final xh O = xh.c("block.minecraft.beacon.secondary");
   private final List<frl.a> P = Lists.newArrayList();
   @Nullable
   jp<btc> Q;
   @Nullable
   jp<btc> R;

   public frl(final cro $$0, cog $$1, xh $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new crx() {
         @Override
         public void a(crj $$0x, int $$1, cvx $$2) {
         }

         @Override
         public void a(crj $$0x, int $$1, int $$2) {
            frl.this.Q = $$0.m();
            frl.this.R = $$0.n();
         }
      });
   }

   private <T extends fkx & frl.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.P.clear();
      this.a(new frl.c(this.C + 164, this.D + 107));
      this.a(new frl.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dsb.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jp<btc> $$4 = dsb.a.get($$0).get($$3);
            frl.d $$5 = new frl.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dsb.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jp<btc> $$10 = dsb.a.get(3).get($$9);
         frl.d $$11 = new frl.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jp<btc> $$12 = dsb.a.get(0).get(0);
      frl.d $$13 = new frl.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void D() {
      super.D();
      this.F();
   }

   void F() {
      int $$0 = this.z.l();
      this.P.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fkm $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fkm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gig::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cvx(cwb.oL), $$4 + 20, $$5 + 109);
      $$0.a(new cvx(cwb.oB), $$4 + 41, $$5 + 109);
      $$0.a(new cvx(cwb.oA), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cvx(cwb.oK), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cvx(cwb.oG), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends frl.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, frl.M, xg.e);
      }

      @Override
      public void b() {
         frl.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends frl.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, frl.L, xg.d);
      }

      @Override
      public void b() {
         frl.this.m.L().b(new aii(Optional.ofNullable(frl.this.Q), Optional.ofNullable(frl.this.R)));
         frl.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
         this.j = frl.this.z.o() && frl.this.Q != null;
      }
   }

   class d extends frl.e {
      private final boolean c;
      protected final int a;
      private jp<btc> d;
      private gxs f;

      public d(final int $$0, final int $$1, final jp<btc> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jp<btc> $$0) {
         this.d = $$0;
         this.f = fja.Q().aG().a($$0);
         this.a(fmk.a(this.b($$0), null));
      }

      protected xv b(jp<btc> $$0) {
         return xh.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               frl.this.Q = this.d;
            } else {
               frl.this.R = this.d;
            }

            frl.this.F();
         }
      }

      @Override
      protected void a(fkm $$0) {
         $$0.a(gig::B, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? frl.this.Q : frl.this.R));
      }

      @Override
      protected xv aP_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fkq implements frl.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xg.a);
      }

      protected e(int $$0, int $$1, xh $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fkm $$0, int $$1, int $$2, float $$3) {
         alh $$4;
         if (!this.j) {
            $$4 = frl.H;
         } else if (this.a) {
            $$4 = frl.I;
         } else if (this.B()) {
            $$4 = frl.J;
         } else {
            $$4 = frl.K;
         }

         $$0.a(gig::B, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fkm var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fox $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends frl.e {
      private final alh a;

      protected f(int $$0, int $$1, alh $$2, xh $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fkm $$0) {
         $$0.a(gig::B, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends frl.d {
      public g(final int $$0, final int $$1, final jp<btc> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xv b(jp<btc> $$0) {
         return xh.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (frl.this.Q != null) {
            this.k = true;
            this.a(frl.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
