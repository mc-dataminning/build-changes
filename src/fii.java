import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fii extends fie<clr> {
   private static final ajh x = new ajh("textures/gui/container/beacon.png");
   static final ajh y = new ajh("container/beacon/button_disabled");
   static final ajh z = new ajh("container/beacon/button_selected");
   static final ajh A = new ajh("container/beacon/button_highlighted");
   static final ajh B = new ajh("container/beacon/button");
   static final ajh C = new ajh("container/beacon/confirm");
   static final ajh D = new ajh("container/beacon/cancel");
   private static final vu E = vu.c("block.minecraft.beacon.primary");
   private static final vu F = vu.c("block.minecraft.beacon.secondary");
   private final List<fii.a> G = Lists.newArrayList();
   @Nullable
   il<boh> H;
   @Nullable
   il<boh> I;

   public fii(final clr $$0, cir $$1, vu $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cma() {
         @Override
         public void a(clo $$0x, int $$1, cqk $$2) {
         }

         @Override
         public void a(clo $$0x, int $$1, int $$2) {
            fii.this.H = $$0.m();
            fii.this.I = $$0.n();
         }
      });
   }

   private <T extends fbe & fii.a> void a(T $$0) {
      this.c($$0);
      this.G.add($$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.G.clear();
      this.a(new fii.c(this.t + 164, this.u + 107));
      this.a(new fii.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dkb.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            il<boh> $$4 = dkb.a.get($$0).get($$3);
            fii.d $$5 = new fii.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dkb.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         il<boh> $$10 = dkb.a.get(3).get($$9);
         fii.d $$11 = new fii.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      il<boh> $$12 = dkb.a.get(0).get(0);
      fii.d $$13 = new fii.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void E() {
      super.E();
      this.I();
   }

   void I() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fat $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(fat $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cqk(cqn.oI), $$4 + 20, $$5 + 109);
      $$0.a(new cqk(cqn.oy), $$4 + 41, $$5 + 109);
      $$0.a(new cqk(cqn.ox), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cqk(cqn.oH), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cqk(cqn.oD), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fii.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fii.D, vt.e);
      }

      @Override
      public void b() {
         fii.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fii.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fii.C, vt.d);
      }

      @Override
      public void b() {
         fii.this.f.L().b(new agk(Optional.ofNullable(fii.this.H), Optional.ofNullable(fii.this.I)));
         fii.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fii.this.p.o() && fii.this.H != null;
      }
   }

   class d extends fii.e {
      private final boolean c;
      protected final int a;
      private il<boh> d;
      private giz f;

      public d(int $$0, int $$1, il<boh> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(il<boh> $$0) {
         this.d = $$0;
         this.f = ezg.Q().aG().a($$0);
         this.a(fcr.a(this.b($$0), null));
      }

      protected wi b(il<boh> $$0) {
         return vu.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fii.this.H = this.d;
            } else {
               fii.this.I = this.d;
            }

            fii.this.I();
         }
      }

      @Override
      protected void a(fat $$0) {
         $$0.a(this.B() + 2, this.C() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fii.this.H : fii.this.I));
      }

      @Override
      protected wi aL_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fax implements fii.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, vt.a);
      }

      protected e(int $$0, int $$1, vu $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fat $$0, int $$1, int $$2, float $$3) {
         ajh $$4;
         if (!this.j) {
            $$4 = fii.y;
         } else if (this.a) {
            $$4 = fii.z;
         } else if (this.z()) {
            $$4 = fii.A;
         } else {
            $$4 = fii.B;
         }

         $$0.a($$4, this.B(), this.C(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fat var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ffc $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fii.e {
      private final ajh a;

      protected f(int $$0, int $$1, ajh $$2, vu $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fat $$0) {
         $$0.a(this.a, this.B() + 2, this.C() + 2, 18, 18);
      }
   }

   class g extends fii.d {
      public g(int $$0, int $$1, il<boh> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected wi b(il<boh> $$0) {
         return vu.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fii.this.H != null) {
            this.k = true;
            this.a(fii.this.H);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
