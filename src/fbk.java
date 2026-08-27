import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fbk extends fbg<cgh> {
   private static final agg x = new agg("textures/gui/container/beacon.png");
   static final agg y = new agg("container/beacon/button_disabled");
   static final agg z = new agg("container/beacon/button_selected");
   static final agg A = new agg("container/beacon/button_highlighted");
   static final agg B = new agg("container/beacon/button");
   static final agg C = new agg("container/beacon/confirm");
   static final agg D = new agg("container/beacon/cancel");
   private static final ur E = ur.c("block.minecraft.beacon.primary");
   private static final ur F = ur.c("block.minecraft.beacon.secondary");
   private final List<fbk.a> G = Lists.newArrayList();
   @Nullable
   bjt H;
   @Nullable
   bjt I;

   public fbk(final cgh $$0, cdl $$1, ur $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cgq() {
         @Override
         public void a(cge $$0x, int $$1, clb $$2) {
         }

         @Override
         public void a(cge $$0x, int $$1, int $$2) {
            fbk.this.H = $$0.m();
            fbk.this.I = $$0.n();
         }
      });
   }

   private <T extends euk & fbk.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.G.clear();
      this.a(new fbk.c(this.t + 164, this.u + 107));
      this.a(new fbk.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dem.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bjt $$4 = dem.a[$$0][$$3];
            fbk.d $$5 = new fbk.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dem.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bjt $$10 = dem.a[3][$$9];
         fbk.d $$11 = new fbk.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      fbk.d $$12 = new fbk.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dem.a[0][0]);
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
   protected void b(eub $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(eub $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new clb(cle.nV), $$4 + 20, $$5 + 109);
      $$0.a(new clb(cle.nL), $$4 + 41, $$5 + 109);
      $$0.a(new clb(cle.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new clb(cle.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new clb(cle.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fbk.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fbk.D, uq.e);
      }

      @Override
      public void b() {
         fbk.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fbk.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fbk.C, uq.d);
      }

      @Override
      public void b() {
         fbk.this.f.I().b(new adu(Optional.ofNullable(fbk.this.H), Optional.ofNullable(fbk.this.I)));
         fbk.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
         this.i = fbk.this.p.o() && fbk.this.H != null;
      }
   }

   class d extends fbk.e {
      private final boolean c;
      protected final int a;
      private bjt d;
      private gbh l;

      public d(int $$0, int $$1, bjt $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bjt $$0) {
         this.d = $$0;
         this.l = esr.N().aD().a($$0);
         this.a(evx.a(this.b($$0), null));
      }

      protected vf b(bjt $$0) {
         return ur.c($$0.d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fbk.this.H = this.d;
            } else {
               fbk.this.I = this.d;
            }

            fbk.this.E();
         }
      }

      @Override
      protected void a(eub $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? fbk.this.H : fbk.this.I));
      }

      @Override
      protected vf aL_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends eue implements fbk.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, uq.a);
      }

      protected e(int $$0, int $$1, ur $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(eub $$0, int $$1, int $$2, float $$3) {
         agg $$4;
         if (!this.i) {
            $$4 = fbk.y;
         } else if (this.a) {
            $$4 = fbk.z;
         } else if (this.n()) {
            $$4 = fbk.A;
         } else {
            $$4 = fbk.B;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(eub var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(eyf $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fbk.e {
      private final agg a;

      protected f(int $$0, int $$1, agg $$2, ur $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(eub $$0) {
         $$0.a(this.a, this.p() + 2, this.r() + 2, 18, 18);
      }
   }

   class g extends fbk.d {
      public g(int $$0, int $$1, bjt $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected vf b(bjt $$0) {
         return ur.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fbk.this.H != null) {
            this.j = true;
            this.a(fbk.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
