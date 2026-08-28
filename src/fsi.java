import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fsi extends fse<crx> {
   private static final all G = all.b("textures/gui/container/beacon.png");
   static final all H = all.b("container/beacon/button_disabled");
   static final all I = all.b("container/beacon/button_selected");
   static final all J = all.b("container/beacon/button_highlighted");
   static final all K = all.b("container/beacon/button");
   static final all L = all.b("container/beacon/confirm");
   static final all M = all.b("container/beacon/cancel");
   private static final xl N = xl.c("block.minecraft.beacon.primary");
   private static final xl O = xl.c("block.minecraft.beacon.secondary");
   private final List<fsi.a> P = Lists.newArrayList();
   @Nullable
   jq<btl> Q;
   @Nullable
   jq<btl> R;

   public fsi(final crx $$0, coq $$1, xl $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new csg() {
         @Override
         public void a(crs $$0x, int $$1, cwf $$2) {
         }

         @Override
         public void a(crs $$0x, int $$1, int $$2) {
            fsi.this.Q = $$0.m();
            fsi.this.R = $$0.n();
         }
      });
   }

   private <T extends flu & fsi.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.P.clear();
      this.a(new fsi.c(this.C + 164, this.D + 107));
      this.a(new fsi.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dsm.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jq<btl> $$4 = dsm.a.get($$0).get($$3);
            fsi.d $$5 = new fsi.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dsm.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jq<btl> $$10 = dsm.a.get(3).get($$9);
         fsi.d $$11 = new fsi.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jq<btl> $$12 = dsm.a.get(0).get(0);
      fsi.d $$13 = new fsi.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(flj $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(flj $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gjh::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cwf(cwj.oL), $$4 + 20, $$5 + 109);
      $$0.a(new cwf(cwj.oB), $$4 + 41, $$5 + 109);
      $$0.a(new cwf(cwj.oA), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cwf(cwj.oK), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cwf(cwj.oG), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fsi.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fsi.M, xk.e);
      }

      @Override
      public void b() {
         fsi.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fsi.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fsi.L, xk.d);
      }

      @Override
      public void b() {
         fsi.this.m.L().b(new aim(Optional.ofNullable(fsi.this.Q), Optional.ofNullable(fsi.this.R)));
         fsi.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
         this.j = fsi.this.z.o() && fsi.this.Q != null;
      }
   }

   class d extends fsi.e {
      private final boolean c;
      protected final int a;
      private jq<btl> d;
      private gyt f;

      public d(final int $$0, final int $$1, final jq<btl> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jq<btl> $$0) {
         this.d = $$0;
         this.f = fjx.Q().aG().a($$0);
         this.a(fnh.a(this.b($$0), null));
      }

      protected xz b(jq<btl> $$0) {
         return xl.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fsi.this.Q = this.d;
            } else {
               fsi.this.R = this.d;
            }

            fsi.this.F();
         }
      }

      @Override
      protected void a(flj $$0) {
         $$0.a(gjh::B, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fsi.this.Q : fsi.this.R));
      }

      @Override
      protected xz aO_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fln implements fsi.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xk.a);
      }

      protected e(int $$0, int $$1, xl $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(flj $$0, int $$1, int $$2, float $$3) {
         all $$4;
         if (!this.j) {
            $$4 = fsi.H;
         } else if (this.a) {
            $$4 = fsi.I;
         } else if (this.B()) {
            $$4 = fsi.J;
         } else {
            $$4 = fsi.K;
         }

         $$0.a(gjh::B, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(flj var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fpu $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fsi.e {
      private final all a;

      protected f(int $$0, int $$1, all $$2, xl $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(flj $$0) {
         $$0.a(gjh::B, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends fsi.d {
      public g(final int $$0, final int $$1, final jq<btl> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xz b(jq<btl> $$0) {
         return xl.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fsi.this.Q != null) {
            this.k = true;
            this.a(fsi.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
