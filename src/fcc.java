import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fcc extends fby<cgu> {
   private static final agm x = new agm("textures/gui/container/beacon.png");
   static final agm y = new agm("container/beacon/button_disabled");
   static final agm z = new agm("container/beacon/button_selected");
   static final agm A = new agm("container/beacon/button_highlighted");
   static final agm B = new agm("container/beacon/button");
   static final agm C = new agm("container/beacon/confirm");
   static final agm D = new agm("container/beacon/cancel");
   private static final uv E = uv.c("block.minecraft.beacon.primary");
   private static final uv F = uv.c("block.minecraft.beacon.secondary");
   private final List<fcc.a> G = Lists.newArrayList();
   @Nullable
   bkg H;
   @Nullable
   bkg I;

   public fcc(final cgu $$0, cdy $$1, uv $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new chd() {
         @Override
         public void a(cgr $$0x, int $$1, clo $$2) {
         }

         @Override
         public void a(cgr $$0x, int $$1, int $$2) {
            fcc.this.H = $$0.m();
            fcc.this.I = $$0.n();
         }
      });
   }

   private <T extends evc & fcc.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.G.clear();
      this.a(new fcc.c(this.t + 164, this.u + 107));
      this.a(new fcc.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dfd.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bkg $$4 = dfd.a[$$0][$$3];
            fcc.d $$5 = new fcc.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dfd.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bkg $$10 = dfd.a[3][$$9];
         fcc.d $$11 = new fcc.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      fcc.d $$12 = new fcc.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dfd.a[0][0]);
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
   protected void b(eut $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(eut $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new clo(clr.oG), $$4 + 20, $$5 + 109);
      $$0.a(new clo(clr.ow), $$4 + 41, $$5 + 109);
      $$0.a(new clo(clr.ov), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new clo(clr.oF), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new clo(clr.oB), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fcc.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fcc.D, uu.e);
      }

      @Override
      public void b() {
         fcc.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fcc.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fcc.C, uu.d);
      }

      @Override
      public void b() {
         fcc.this.f.I().b(new aea(Optional.ofNullable(fcc.this.H), Optional.ofNullable(fcc.this.I)));
         fcc.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.i = fcc.this.p.o() && fcc.this.H != null;
      }
   }

   class d extends fcc.e {
      private final boolean c;
      protected final int a;
      private bkg d;
      private gbz l;

      public d(int $$0, int $$1, bkg $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bkg $$0) {
         this.d = $$0;
         this.l = eti.N().aD().a($$0);
         this.a(ewp.a(this.b($$0), null));
      }

      protected vj b(bkg $$0) {
         return uv.c($$0.d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fcc.this.H = this.d;
            } else {
               fcc.this.I = this.d;
            }

            fcc.this.E();
         }
      }

      @Override
      protected void a(eut $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? fcc.this.H : fcc.this.I));
      }

      @Override
      protected vj aN_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends euw implements fcc.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, uu.a);
      }

      protected e(int $$0, int $$1, uv $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(eut $$0, int $$1, int $$2, float $$3) {
         agm $$4;
         if (!this.i) {
            $$4 = fcc.y;
         } else if (this.a) {
            $$4 = fcc.z;
         } else if (this.n()) {
            $$4 = fcc.A;
         } else {
            $$4 = fcc.B;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(eut var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(eyx $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fcc.e {
      private final agm a;

      protected f(int $$0, int $$1, agm $$2, uv $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(eut $$0) {
         $$0.a(this.a, this.p() + 2, this.r() + 2, 18, 18);
      }
   }

   class g extends fcc.d {
      public g(int $$0, int $$1, bkg $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected vj b(bkg $$0) {
         return uv.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fcc.this.H != null) {
            this.j = true;
            this.a(fcc.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
