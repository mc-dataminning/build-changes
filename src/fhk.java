import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fhk extends fhg<ckx> {
   private static final ajc x = new ajc("textures/gui/container/beacon.png");
   static final ajc y = new ajc("container/beacon/button_disabled");
   static final ajc z = new ajc("container/beacon/button_selected");
   static final ajc A = new ajc("container/beacon/button_highlighted");
   static final ajc B = new ajc("container/beacon/button");
   static final ajc C = new ajc("container/beacon/confirm");
   static final ajc D = new ajc("container/beacon/cancel");
   private static final vs E = vs.c("block.minecraft.beacon.primary");
   private static final vs F = vs.c("block.minecraft.beacon.secondary");
   private final List<fhk.a> G = Lists.newArrayList();
   @Nullable
   il<bnq> H;
   @Nullable
   il<bnq> I;

   public fhk(final ckx $$0, chz $$1, vs $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new clg() {
         @Override
         public void a(cku $$0x, int $$1, cpq $$2) {
         }

         @Override
         public void a(cku $$0x, int $$1, int $$2) {
            fhk.this.H = $$0.m();
            fhk.this.I = $$0.n();
         }
      });
   }

   private <T extends fai & fhk.a> void a(T $$0) {
      this.c($$0);
      this.G.add($$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.G.clear();
      this.a(new fhk.c(this.t + 164, this.u + 107));
      this.a(new fhk.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = djg.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            il<bnq> $$4 = djg.a.get($$0).get($$3);
            fhk.d $$5 = new fhk.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = djg.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         il<bnq> $$10 = djg.a.get(3).get($$9);
         fhk.d $$11 = new fhk.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      il<bnq> $$12 = djg.a.get(0).get(0);
      fhk.d $$13 = new fhk.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, $$12);
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
   protected void b(ezx $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(ezx $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cpq(cpt.oI), $$4 + 20, $$5 + 109);
      $$0.a(new cpq(cpt.oy), $$4 + 41, $$5 + 109);
      $$0.a(new cpq(cpt.ox), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cpq(cpt.oH), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cpq(cpt.oD), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fhk.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fhk.D, vr.e);
      }

      @Override
      public void b() {
         fhk.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fhk.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fhk.C, vr.d);
      }

      @Override
      public void b() {
         fhk.this.f.K().b(new agg(Optional.ofNullable(fhk.this.H), Optional.ofNullable(fhk.this.I)));
         fhk.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fhk.this.p.o() && fhk.this.H != null;
      }
   }

   class d extends fhk.e {
      private final boolean c;
      protected final int a;
      private il<bnq> d;
      private ghz f;

      public d(int $$0, int $$1, il<bnq> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(il<bnq> $$0) {
         this.d = $$0;
         this.f = eyk.P().aF().a($$0);
         this.a(fbv.a(this.b($$0), null));
      }

      protected wg b(il<bnq> $$0) {
         return vs.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fhk.this.H = this.d;
            } else {
               fhk.this.I = this.d;
            }

            fhk.this.I();
         }
      }

      @Override
      protected void a(ezx $$0) {
         $$0.a(this.B() + 2, this.C() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fhk.this.H : fhk.this.I));
      }

      @Override
      protected wg aM_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fab implements fhk.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, vr.a);
      }

      protected e(int $$0, int $$1, vs $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         ajc $$4;
         if (!this.j) {
            $$4 = fhk.y;
         } else if (this.a) {
            $$4 = fhk.z;
         } else if (this.z()) {
            $$4 = fhk.A;
         } else {
            $$4 = fhk.B;
         }

         $$0.a($$4, this.B(), this.C(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(ezx var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fef $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fhk.e {
      private final ajc a;

      protected f(int $$0, int $$1, ajc $$2, vs $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(ezx $$0) {
         $$0.a(this.a, this.B() + 2, this.C() + 2, 18, 18);
      }
   }

   class g extends fhk.d {
      public g(int $$0, int $$1, il<bnq> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected wg b(il<bnq> $$0) {
         return vs.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fhk.this.H != null) {
            this.k = true;
            this.a(fhk.this.H);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
