import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fdf extends fdb<chn> {
   private static final agt x = new agt("textures/gui/container/beacon.png");
   static final agt y = new agt("container/beacon/button_disabled");
   static final agt z = new agt("container/beacon/button_selected");
   static final agt A = new agt("container/beacon/button_highlighted");
   static final agt B = new agt("container/beacon/button");
   static final agt C = new agt("container/beacon/confirm");
   static final agt D = new agt("container/beacon/cancel");
   private static final vb E = vb.c("block.minecraft.beacon.primary");
   private static final vb F = vb.c("block.minecraft.beacon.secondary");
   private final List<fdf.a> G = Lists.newArrayList();
   @Nullable
   bkq H;
   @Nullable
   bkq I;

   public fdf(final chn $$0, ceq $$1, vb $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new chw() {
         @Override
         public void a(chk $$0x, int $$1, cmh $$2) {
         }

         @Override
         public void a(chk $$0x, int $$1, int $$2) {
            fdf.this.H = $$0.m();
            fdf.this.I = $$0.n();
         }
      });
   }

   private <T extends ewf & fdf.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.G.clear();
      this.a(new fdf.c(this.t + 164, this.u + 107));
      this.a(new fdf.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dfy.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bkq $$4 = dfy.a[$$0][$$3];
            fdf.d $$5 = new fdf.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dfy.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bkq $$10 = dfy.a[3][$$9];
         fdf.d $$11 = new fdf.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      fdf.d $$12 = new fdf.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dfy.a[0][0]);
      $$12.j = false;
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
   protected void b(evw $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(evw $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cmh(cmk.oG), $$4 + 20, $$5 + 109);
      $$0.a(new cmh(cmk.ow), $$4 + 41, $$5 + 109);
      $$0.a(new cmh(cmk.ov), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cmh(cmk.oF), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cmh(cmk.oB), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fdf.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fdf.D, va.e);
      }

      @Override
      public void b() {
         fdf.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fdf.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fdf.C, va.d);
      }

      @Override
      public void b() {
         fdf.this.f.I().b(new aeh(Optional.ofNullable(fdf.this.H), Optional.ofNullable(fdf.this.I)));
         fdf.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.i = fdf.this.p.o() && fdf.this.H != null;
      }
   }

   class d extends fdf.e {
      private final boolean c;
      protected final int a;
      private bkq d;
      private gdo l;

      public d(int $$0, int $$1, bkq $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bkq $$0) {
         this.d = $$0;
         this.l = euk.N().aD().a($$0);
         this.a(exs.a(this.b($$0), null));
      }

      protected vp b(bkq $$0) {
         return vb.c($$0.d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fdf.this.H = this.d;
            } else {
               fdf.this.I = this.d;
            }

            fdf.this.E();
         }
      }

      @Override
      protected void a(evw $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? fdf.this.H : fdf.this.I));
      }

      @Override
      protected vp aM_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends evz implements fdf.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, va.a);
      }

      protected e(int $$0, int $$1, vb $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(evw $$0, int $$1, int $$2, float $$3) {
         agt $$4;
         if (!this.i) {
            $$4 = fdf.y;
         } else if (this.a) {
            $$4 = fdf.z;
         } else if (this.n()) {
            $$4 = fdf.A;
         } else {
            $$4 = fdf.B;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(evw var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(faa $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fdf.e {
      private final agt a;

      protected f(int $$0, int $$1, agt $$2, vb $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(evw $$0) {
         $$0.a(this.a, this.p() + 2, this.r() + 2, 18, 18);
      }
   }

   class g extends fdf.d {
      public g(int $$0, int $$1, bkq $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected vp b(bkq $$0) {
         return vb.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fdf.this.H != null) {
            this.j = true;
            this.a(fdf.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
