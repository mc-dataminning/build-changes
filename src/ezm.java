import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezm extends ezi<ceo> {
   private static final aex x = new aex("textures/gui/container/beacon.png");
   static final aex y = new aex("container/beacon/button_disabled");
   static final aex z = new aex("container/beacon/button_selected");
   static final aex A = new aex("container/beacon/button_highlighted");
   static final aex B = new aex("container/beacon/button");
   static final aex C = new aex("container/beacon/confirm");
   static final aex D = new aex("container/beacon/cancel");
   private static final tl E = tl.c("block.minecraft.beacon.primary");
   private static final tl F = tl.c("block.minecraft.beacon.secondary");
   private final List<ezm.a> G = Lists.newArrayList();
   @Nullable
   bib H;
   @Nullable
   bib I;

   public ezm(final ceo $$0, cbt $$1, tl $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cex() {
         @Override
         public void a(cel $$0x, int $$1, cjf $$2) {
         }

         @Override
         public void a(cel $$0x, int $$1, int $$2) {
            ezm.this.H = $$0.m();
            ezm.this.I = $$0.n();
         }
      });
   }

   private <T extends eso & ezm.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aI_() {
      super.aI_();
      this.G.clear();
      this.a(new ezm.c(this.t + 164, this.u + 107));
      this.a(new ezm.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dcq.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bib $$4 = dcq.a[$$0][$$3];
            ezm.d $$5 = new ezm.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dcq.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bib $$10 = dcq.a[3][$$9];
         ezm.d $$11 = new ezm.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      ezm.d $$12 = new ezm.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dcq.a[0][0]);
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
   protected void b(esf $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(esf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cjf(cji.nV), $$4 + 20, $$5 + 109);
      $$0.a(new cjf(cji.nL), $$4 + 41, $$5 + 109);
      $$0.a(new cjf(cji.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cjf(cji.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cjf(cji.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends ezm.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, ezm.D, tk.e);
      }

      @Override
      public void c() {
         ezm.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends ezm.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, ezm.C, tk.d);
      }

      @Override
      public void c() {
         ezm.this.f.J().b(new acn(Optional.ofNullable(ezm.this.H), Optional.ofNullable(ezm.this.I)));
         ezm.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
         this.i = ezm.this.p.o() && ezm.this.H != null;
      }
   }

   class d extends ezm.e {
      private final boolean c;
      protected final int a;
      private bib d;
      private fze l;

      public d(int $$0, int $$1, bib $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bib $$0) {
         this.d = $$0;
         this.l = eqv.O().aE().a($$0);
         this.a(eua.a(this.b($$0), null));
      }

      protected ty b(bib $$0) {
         return tl.c($$0.d());
      }

      @Override
      public void c() {
         if (!this.a()) {
            if (this.c) {
               ezm.this.H = this.d;
            } else {
               ezm.this.I = this.d;
            }

            ezm.this.E();
         }
      }

      @Override
      protected void a(esf $$0) {
         $$0.a(this.r() + 2, this.t() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? ezm.this.H : ezm.this.I));
      }

      @Override
      protected ty aF_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends esi implements ezm.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, tk.a);
      }

      protected e(int $$0, int $$1, tl $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(esf $$0, int $$1, int $$2, float $$3) {
         aex $$4;
         if (!this.i) {
            $$4 = ezm.y;
         } else if (this.a) {
            $$4 = ezm.z;
         } else if (this.o()) {
            $$4 = ezm.A;
         } else {
            $$4 = ezm.B;
         }

         $$0.a($$4, this.r(), this.t(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(esf var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ewi $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends ezm.e {
      private final aex a;

      protected f(int $$0, int $$1, aex $$2, tl $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(esf $$0) {
         $$0.a(this.a, this.r() + 2, this.t() + 2, 18, 18);
      }
   }

   class g extends ezm.d {
      public g(int $$0, int $$1, bib $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected ty b(bib $$0) {
         return tl.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (ezm.this.H != null) {
            this.j = true;
            this.a(ezm.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
