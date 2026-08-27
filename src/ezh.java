import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezh extends ezd<cej> {
   private static final aeu x = new aeu("textures/gui/container/beacon.png");
   static final aeu y = new aeu("container/beacon/button_disabled");
   static final aeu z = new aeu("container/beacon/button_selected");
   static final aeu A = new aeu("container/beacon/button_highlighted");
   static final aeu B = new aeu("container/beacon/button");
   static final aeu C = new aeu("container/beacon/confirm");
   static final aeu D = new aeu("container/beacon/cancel");
   private static final ti E = ti.c("block.minecraft.beacon.primary");
   private static final ti F = ti.c("block.minecraft.beacon.secondary");
   private final List<ezh.a> G = Lists.newArrayList();
   @Nullable
   bhw H;
   @Nullable
   bhw I;

   public ezh(final cej $$0, cbo $$1, ti $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new ces() {
         @Override
         public void a(ceg $$0x, int $$1, cja $$2) {
         }

         @Override
         public void a(ceg $$0x, int $$1, int $$2) {
            ezh.this.H = $$0.m();
            ezh.this.I = $$0.n();
         }
      });
   }

   private <T extends esj & ezh.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.G.clear();
      this.a(new ezh.c(this.t + 164, this.u + 107));
      this.a(new ezh.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dcl.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bhw $$4 = dcl.a[$$0][$$3];
            ezh.d $$5 = new ezh.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dcl.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bhw $$10 = dcl.a[3][$$9];
         ezh.d $$11 = new ezh.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      ezh.d $$12 = new ezh.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dcl.a[0][0]);
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
   protected void b(esa $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(esa $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cja(cjd.nV), $$4 + 20, $$5 + 109);
      $$0.a(new cja(cjd.nL), $$4 + 41, $$5 + 109);
      $$0.a(new cja(cjd.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cja(cjd.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cja(cjd.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends ezh.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, ezh.D, th.e);
      }

      @Override
      public void c() {
         ezh.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends ezh.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, ezh.C, th.d);
      }

      @Override
      public void c() {
         ezh.this.f.J().b(new ack(Optional.ofNullable(ezh.this.H), Optional.ofNullable(ezh.this.I)));
         ezh.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
         this.i = ezh.this.p.o() && ezh.this.H != null;
      }
   }

   class d extends ezh.e {
      private final boolean c;
      protected final int a;
      private bhw d;
      private fyz l;

      public d(int $$0, int $$1, bhw $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bhw $$0) {
         this.d = $$0;
         this.l = eqq.O().aE().a($$0);
         this.a(etv.a(this.b($$0), null));
      }

      protected tv b(bhw $$0) {
         return ti.c($$0.d());
      }

      @Override
      public void c() {
         if (!this.a()) {
            if (this.c) {
               ezh.this.H = this.d;
            } else {
               ezh.this.I = this.d;
            }

            ezh.this.E();
         }
      }

      @Override
      protected void a(esa $$0) {
         $$0.a(this.r() + 2, this.t() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? ezh.this.H : ezh.this.I));
      }

      @Override
      protected tv aA_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends esd implements ezh.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, th.a);
      }

      protected e(int $$0, int $$1, ti $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(esa $$0, int $$1, int $$2, float $$3) {
         aeu $$4;
         if (!this.i) {
            $$4 = ezh.y;
         } else if (this.a) {
            $$4 = ezh.z;
         } else if (this.o()) {
            $$4 = ezh.A;
         } else {
            $$4 = ezh.B;
         }

         $$0.a($$4, this.r(), this.t(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(esa var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ewd $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends ezh.e {
      private final aeu a;

      protected f(int $$0, int $$1, aeu $$2, ti $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(esa $$0) {
         $$0.a(this.a, this.r() + 2, this.t() + 2, 18, 18);
      }
   }

   class g extends ezh.d {
      public g(int $$0, int $$1, bhw $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected tv b(bhw $$0) {
         return ti.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (ezh.this.H != null) {
            this.j = true;
            this.a(ezh.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
