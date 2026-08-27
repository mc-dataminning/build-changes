import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eyx extends eyt<cef> {
   private static final aep x = new aep("textures/gui/container/beacon.png");
   static final aep y = new aep("container/beacon/button_disabled");
   static final aep z = new aep("container/beacon/button_selected");
   static final aep A = new aep("container/beacon/button_highlighted");
   static final aep B = new aep("container/beacon/button");
   static final aep C = new aep("container/beacon/confirm");
   static final aep D = new aep("container/beacon/cancel");
   private static final te E = te.c("block.minecraft.beacon.primary");
   private static final te F = te.c("block.minecraft.beacon.secondary");
   private final List<eyx.a> G = Lists.newArrayList();
   @Nullable
   bhr H;
   @Nullable
   bhr I;

   public eyx(final cef $$0, cbk $$1, te $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new ceo() {
         @Override
         public void a(cec $$0x, int $$1, ciw $$2) {
         }

         @Override
         public void a(cec $$0x, int $$1, int $$2) {
            eyx.this.H = $$0.m();
            eyx.this.I = $$0.n();
         }
      });
   }

   private <T extends esg & eyx.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.G.clear();
      this.a(new eyx.c(this.t + 164, this.u + 107));
      this.a(new eyx.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dcf.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bhr $$4 = dcf.a[$$0][$$3];
            eyx.d $$5 = new eyx.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dcf.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bhr $$10 = dcf.a[3][$$9];
         eyx.d $$11 = new eyx.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      eyx.d $$12 = new eyx.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dcf.a[0][0]);
      $$12.j = false;
      this.a($$12);
   }

   @Override
   public void B() {
      super.B();
      this.D();
   }

   void D() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(erx $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(erx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new ciw(ciz.nV), $$4 + 20, $$5 + 109);
      $$0.a(new ciw(ciz.nL), $$4 + 41, $$5 + 109);
      $$0.a(new ciw(ciz.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new ciw(ciz.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new ciw(ciz.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends eyx.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, eyx.D, td.e);
      }

      @Override
      public void c() {
         eyx.this.f.t.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends eyx.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, eyx.C, td.d);
      }

      @Override
      public void c() {
         eyx.this.f.I().b(new acf(Optional.ofNullable(eyx.this.H), Optional.ofNullable(eyx.this.I)));
         eyx.this.f.t.q();
      }

      @Override
      public void a(int $$0) {
         this.i = eyx.this.p.o() && eyx.this.H != null;
      }
   }

   class d extends eyx.e {
      private final boolean c;
      protected final int a;
      private bhr d;
      private fyg l;

      public d(int $$0, int $$1, bhr $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bhr $$0) {
         this.d = $$0;
         this.l = eqn.N().aE().a($$0);
         this.a(etr.a(this.b($$0), null));
      }

      protected tr b(bhr $$0) {
         return te.c($$0.d());
      }

      @Override
      public void c() {
         if (!this.a()) {
            if (this.c) {
               eyx.this.H = this.d;
            } else {
               eyx.this.I = this.d;
            }

            eyx.this.D();
         }
      }

      @Override
      protected void a(erx $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? eyx.this.H : eyx.this.I));
      }

      @Override
      protected tr aB_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends esa implements eyx.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, td.a);
      }

      protected e(int $$0, int $$1, te $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(erx $$0, int $$1, int $$2, float $$3) {
         aep $$4;
         if (!this.i) {
            $$4 = eyx.y;
         } else if (this.a) {
            $$4 = eyx.z;
         } else if (this.n()) {
            $$4 = eyx.A;
         } else {
            $$4 = eyx.B;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(erx var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(evt $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends eyx.e {
      private final aep a;

      protected f(int $$0, int $$1, aep $$2, te $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(erx $$0) {
         $$0.a(this.a, this.p() + 2, this.r() + 2, 18, 18);
      }
   }

   class g extends eyx.d {
      public g(int $$0, int $$1, bhr $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected tr b(bhr $$0) {
         return te.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (eyx.this.H != null) {
            this.j = true;
            this.a(eyx.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
