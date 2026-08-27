import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezb extends eyx<ceh> {
   private static final aer x = new aer("textures/gui/container/beacon.png");
   static final aer y = new aer("container/beacon/button_disabled");
   static final aer z = new aer("container/beacon/button_selected");
   static final aer A = new aer("container/beacon/button_highlighted");
   static final aer B = new aer("container/beacon/button");
   static final aer C = new aer("container/beacon/confirm");
   static final aer D = new aer("container/beacon/cancel");
   private static final tf E = tf.c("block.minecraft.beacon.primary");
   private static final tf F = tf.c("block.minecraft.beacon.secondary");
   private final List<ezb.a> G = Lists.newArrayList();
   @Nullable
   bht H;
   @Nullable
   bht I;

   public ezb(final ceh $$0, cbm $$1, tf $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new ceq() {
         @Override
         public void a(cee $$0x, int $$1, ciy $$2) {
         }

         @Override
         public void a(cee $$0x, int $$1, int $$2) {
            ezb.this.H = $$0.m();
            ezb.this.I = $$0.n();
         }
      });
   }

   private <T extends esf & ezb.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.G.clear();
      this.a(new ezb.c(this.t + 164, this.u + 107));
      this.a(new ezb.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dch.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bht $$4 = dch.a[$$0][$$3];
            ezb.d $$5 = new ezb.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dch.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bht $$10 = dch.a[3][$$9];
         ezb.d $$11 = new ezb.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      ezb.d $$12 = new ezb.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dch.a[0][0]);
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
   protected void b(erw $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(erw $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new ciy(cjb.nV), $$4 + 20, $$5 + 109);
      $$0.a(new ciy(cjb.nL), $$4 + 41, $$5 + 109);
      $$0.a(new ciy(cjb.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new ciy(cjb.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new ciy(cjb.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends ezb.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, ezb.D, te.e);
      }

      @Override
      public void c() {
         ezb.this.f.v.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends ezb.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, ezb.C, te.d);
      }

      @Override
      public void c() {
         ezb.this.f.J().b(new ach(Optional.ofNullable(ezb.this.H), Optional.ofNullable(ezb.this.I)));
         ezb.this.f.v.q();
      }

      @Override
      public void a(int $$0) {
         this.i = ezb.this.p.o() && ezb.this.H != null;
      }
   }

   class d extends ezb.e {
      private final boolean c;
      protected final int a;
      private bht d;
      private fyl l;

      public d(int $$0, int $$1, bht $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bht $$0) {
         this.d = $$0;
         this.l = eqm.O().aF().a($$0);
         this.a(etq.a(this.b($$0), null));
      }

      protected ts b(bht $$0) {
         return tf.c($$0.d());
      }

      @Override
      public void c() {
         if (!this.a()) {
            if (this.c) {
               ezb.this.H = this.d;
            } else {
               ezb.this.I = this.d;
            }

            ezb.this.D();
         }
      }

      @Override
      protected void a(erw $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? ezb.this.H : ezb.this.I));
      }

      @Override
      protected ts aB_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends erz implements ezb.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, te.a);
      }

      protected e(int $$0, int $$1, tf $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, float $$3) {
         aer $$4;
         if (!this.i) {
            $$4 = ezb.y;
         } else if (this.a) {
            $$4 = ezb.z;
         } else if (this.n()) {
            $$4 = ezb.A;
         } else {
            $$4 = ezb.B;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(erw var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(evx $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends ezb.e {
      private final aer a;

      protected f(int $$0, int $$1, aer $$2, tf $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(erw $$0) {
         $$0.a(this.a, this.p() + 2, this.r() + 2, 18, 18);
      }
   }

   class g extends ezb.d {
      public g(int $$0, int $$1, bht $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected ts b(bht $$0) {
         return tf.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (ezb.this.H != null) {
            this.j = true;
            this.a(ezb.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
