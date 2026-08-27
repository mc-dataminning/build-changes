import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fdw extends fds<chx> {
   private static final ahd x = new ahd("textures/gui/container/beacon.png");
   static final ahd y = new ahd("container/beacon/button_disabled");
   static final ahd z = new ahd("container/beacon/button_selected");
   static final ahd A = new ahd("container/beacon/button_highlighted");
   static final ahd B = new ahd("container/beacon/button");
   static final ahd C = new ahd("container/beacon/confirm");
   static final ahd D = new ahd("container/beacon/cancel");
   private static final vd E = vd.c("block.minecraft.beacon.primary");
   private static final vd F = vd.c("block.minecraft.beacon.secondary");
   private final List<fdw.a> G = Lists.newArrayList();
   @Nullable
   bla H;
   @Nullable
   bla I;

   public fdw(final chx $$0, cfa $$1, vd $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cig() {
         @Override
         public void a(chu $$0x, int $$1, cmr $$2) {
         }

         @Override
         public void a(chu $$0x, int $$1, int $$2) {
            fdw.this.H = $$0.m();
            fdw.this.I = $$0.n();
         }
      });
   }

   private <T extends eww & fdw.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.G.clear();
      this.a(new fdw.c(this.t + 164, this.u + 107));
      this.a(new fdw.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dgj.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bla $$4 = dgj.a[$$0][$$3];
            fdw.d $$5 = new fdw.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dgj.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bla $$10 = dgj.a[3][$$9];
         fdw.d $$11 = new fdw.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      fdw.d $$12 = new fdw.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dgj.a[0][0]);
      $$12.k = false;
      this.a($$12);
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   void E() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(ewm $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(ewm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cmr(cmu.oG), $$4 + 20, $$5 + 109);
      $$0.a(new cmr(cmu.ow), $$4 + 41, $$5 + 109);
      $$0.a(new cmr(cmu.ov), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cmr(cmu.oF), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cmr(cmu.oB), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fdw.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fdw.D, vc.e);
      }

      @Override
      public void b() {
         fdw.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fdw.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fdw.C, vc.d);
      }

      @Override
      public void b() {
         fdw.this.f.I().b(new aer(Optional.ofNullable(fdw.this.H), Optional.ofNullable(fdw.this.I)));
         fdw.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fdw.this.p.o() && fdw.this.H != null;
      }
   }

   class d extends fdw.e {
      private final boolean c;
      protected final int a;
      private bla d;
      private gef f;

      public d(int $$0, int $$1, bla $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bla $$0) {
         this.d = $$0;
         this.f = eva.N().aD().a($$0);
         this.a(eyj.a(this.b($$0), null));
      }

      protected vr b(bla $$0) {
         return vd.c($$0.d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fdw.this.H = this.d;
            } else {
               fdw.this.I = this.d;
            }

            fdw.this.E();
         }
      }

      @Override
      protected void a(ewm $$0) {
         $$0.a(this.B() + 2, this.C() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d == (this.c ? fdw.this.H : fdw.this.I));
      }

      @Override
      protected vr aK_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends ewp implements fdw.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, vc.a);
      }

      protected e(int $$0, int $$1, vd $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(ewm $$0, int $$1, int $$2, float $$3) {
         ahd $$4;
         if (!this.j) {
            $$4 = fdw.y;
         } else if (this.a) {
            $$4 = fdw.z;
         } else if (this.z()) {
            $$4 = fdw.A;
         } else {
            $$4 = fdw.B;
         }

         $$0.a($$4, this.B(), this.C(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(ewm var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(far $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fdw.e {
      private final ahd a;

      protected f(int $$0, int $$1, ahd $$2, vd $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(ewm $$0) {
         $$0.a(this.a, this.B() + 2, this.C() + 2, 18, 18);
      }
   }

   class g extends fdw.d {
      public g(int $$0, int $$1, bla $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected vr b(bla $$0) {
         return vd.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fdw.this.H != null) {
            this.k = true;
            this.a(fdw.this.H);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
