import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fkz extends fkv<cmz> {
   private static final ajv A = new ajv("textures/gui/container/beacon.png");
   static final ajv B = new ajv("container/beacon/button_disabled");
   static final ajv C = new ajv("container/beacon/button_selected");
   static final ajv D = new ajv("container/beacon/button_highlighted");
   static final ajv E = new ajv("container/beacon/button");
   static final ajv F = new ajv("container/beacon/confirm");
   static final ajv G = new ajv("container/beacon/cancel");
   private static final wi H = wi.c("block.minecraft.beacon.primary");
   private static final wi I = wi.c("block.minecraft.beacon.secondary");
   private final List<fkz.a> J = Lists.newArrayList();
   @Nullable
   in<bpk> K;
   @Nullable
   in<bpk> L;

   public fkz(final cmz $$0, cjz $$1, wi $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cni() {
         @Override
         public void a(cmw $$0x, int $$1, crs $$2) {
         }

         @Override
         public void a(cmw $$0x, int $$1, int $$2) {
            fkz.this.K = $$0.m();
            fkz.this.L = $$0.n();
         }
      });
   }

   private <T extends fdw & fkz.a> void a(T $$0) {
      this.c($$0);
      this.J.add($$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.J.clear();
      this.a(new fkz.c(this.w + 164, this.x + 107));
      this.a(new fkz.b(this.w + 190, this.x + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dmj.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            in<bpk> $$4 = dmj.a.get($$0).get($$3);
            fkz.d $$5 = new fkz.d(this.w + 76 + $$3 * 24 - $$2 / 2, this.x + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dmj.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         in<bpk> $$10 = dmj.a.get(3).get($$9);
         fkz.d $$11 = new fkz.d(this.w + 167 + $$9 * 24 - $$8 / 2, this.x + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      in<bpk> $$12 = dmj.a.get(0).get(0);
      fkz.d $$13 = new fkz.g(this.w + 167 + ($$7 - 1) * 24 - $$8 / 2, this.x + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   void E() {
      int $$0 = this.s.l();
      this.J.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fdl $$0, int $$1, int $$2) {
      $$0.a(this.m, H, 62, 10, 14737632);
      $$0.a(this.m, I, 169, 10, 14737632);
   }

   @Override
   protected void a(fdl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new crs(crv.oI), $$4 + 20, $$5 + 109);
      $$0.a(new crs(crv.oy), $$4 + 41, $$5 + 109);
      $$0.a(new crs(crv.ox), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new crs(crv.oH), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new crs(crv.oD), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fkz.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fkz.G, wh.e);
      }

      @Override
      public void b() {
         fkz.this.j.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fkz.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fkz.F, wh.d);
      }

      @Override
      public void b() {
         fkz.this.j.L().b(new agy(Optional.ofNullable(fkz.this.K), Optional.ofNullable(fkz.this.L)));
         fkz.this.j.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fkz.this.s.o() && fkz.this.K != null;
      }
   }

   class d extends fkz.e {
      private final boolean c;
      protected final int a;
      private in<bpk> d;
      private gls f;

      public d(int $$0, int $$1, in<bpk> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(in<bpk> $$0) {
         this.d = $$0;
         this.f = fby.Q().aG().a($$0);
         this.a(ffj.a(this.b($$0), null));
      }

      protected ww b(in<bpk> $$0) {
         return wi.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fkz.this.K = this.d;
            } else {
               fkz.this.L = this.d;
            }

            fkz.this.E();
         }
      }

      @Override
      protected void a(fdl $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fkz.this.K : fkz.this.L));
      }

      @Override
      protected ww aK_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fdp implements fkz.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wh.a);
      }

      protected e(int $$0, int $$1, wi $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fdl $$0, int $$1, int $$2, float $$3) {
         ajv $$4;
         if (!this.j) {
            $$4 = fkz.B;
         } else if (this.a) {
            $$4 = fkz.C;
         } else if (this.A()) {
            $$4 = fkz.D;
         } else {
            $$4 = fkz.E;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fdl var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fhu $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fkz.e {
      private final ajv a;

      protected f(int $$0, int $$1, ajv $$2, wi $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fdl $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends fkz.d {
      public g(int $$0, int $$1, in<bpk> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected ww b(in<bpk> $$0) {
         return wi.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fkz.this.K != null) {
            this.k = true;
            this.a(fkz.this.K);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
