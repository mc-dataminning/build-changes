import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fqw extends fqs<crb> {
   private static final alc G = alc.b("textures/gui/container/beacon.png");
   static final alc H = alc.b("container/beacon/button_disabled");
   static final alc I = alc.b("container/beacon/button_selected");
   static final alc J = alc.b("container/beacon/button_highlighted");
   static final alc K = alc.b("container/beacon/button");
   static final alc L = alc.b("container/beacon/confirm");
   static final alc M = alc.b("container/beacon/cancel");
   private static final xd N = xd.c("block.minecraft.beacon.primary");
   private static final xd O = xd.c("block.minecraft.beacon.secondary");
   private final List<fqw.a> P = Lists.newArrayList();
   @Nullable
   jn<bst> Q;
   @Nullable
   jn<bst> R;

   public fqw(final crb $$0, cnt $$1, xd $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new crk() {
         @Override
         public void a(cqw $$0x, int $$1, cvp $$2) {
         }

         @Override
         public void a(cqw $$0x, int $$1, int $$2) {
            fqw.this.Q = $$0.m();
            fqw.this.R = $$0.n();
         }
      });
   }

   private <T extends fki & fqw.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.P.clear();
      this.a(new fqw.c(this.C + 164, this.D + 107));
      this.a(new fqw.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = drn.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jn<bst> $$4 = drn.a.get($$0).get($$3);
            fqw.d $$5 = new fqw.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = drn.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jn<bst> $$10 = drn.a.get(3).get($$9);
         fqw.d $$11 = new fqw.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jn<bst> $$12 = drn.a.get(0).get(0);
      fqw.d $$13 = new fqw.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fjx $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fjx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(ghq::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cvp(cvt.oL), $$4 + 20, $$5 + 109);
      $$0.a(new cvp(cvt.oB), $$4 + 41, $$5 + 109);
      $$0.a(new cvp(cvt.oA), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cvp(cvt.oK), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cvp(cvt.oG), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fqw.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fqw.M, xc.e);
      }

      @Override
      public void b() {
         fqw.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fqw.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fqw.L, xc.d);
      }

      @Override
      public void b() {
         fqw.this.m.L().b(new aie(Optional.ofNullable(fqw.this.Q), Optional.ofNullable(fqw.this.R)));
         fqw.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
         this.j = fqw.this.z.o() && fqw.this.Q != null;
      }
   }

   class d extends fqw.e {
      private final boolean c;
      protected final int a;
      private jn<bst> d;
      private gxb f;

      public d(final int $$0, final int $$1, final jn<bst> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jn<bst> $$0) {
         this.d = $$0;
         this.f = fil.Q().aG().a($$0);
         this.a(flv.a(this.b($$0), null));
      }

      protected xr b(jn<bst> $$0) {
         return xd.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fqw.this.Q = this.d;
            } else {
               fqw.this.R = this.d;
            }

            fqw.this.F();
         }
      }

      @Override
      protected void a(fjx $$0) {
         $$0.a(ghq::B, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fqw.this.Q : fqw.this.R));
      }

      @Override
      protected xr aO_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fkb implements fqw.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xc.a);
      }

      protected e(int $$0, int $$1, xd $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fjx $$0, int $$1, int $$2, float $$3) {
         alc $$4;
         if (!this.j) {
            $$4 = fqw.H;
         } else if (this.a) {
            $$4 = fqw.I;
         } else if (this.B()) {
            $$4 = fqw.J;
         } else {
            $$4 = fqw.K;
         }

         $$0.a(ghq::B, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fjx var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(foh $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fqw.e {
      private final alc a;

      protected f(int $$0, int $$1, alc $$2, xd $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fjx $$0) {
         $$0.a(ghq::B, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends fqw.d {
      public g(final int $$0, final int $$1, final jn<bst> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xr b(jn<bst> $$0) {
         return xd.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fqw.this.Q != null) {
            this.k = true;
            this.a(fqw.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
