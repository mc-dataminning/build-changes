import javax.annotation.Nullable;

public class cot extends cog {
   private static final byte c = 10;
   private int d = -1;

   public cot(bsn<? extends cot> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cot(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.bd, $$0, $$1, $$2, $$3);
   }

   @Override
   public cog.a v() {
      return cog.a.d;
   }

   @Override
   public dsl x() {
      return dfk.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dR().a(lj.ae, this.dw(), this.dy() + 0.5, this.dC(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.du().i());
      }

      if (this.Q) {
         double $$0 = this.du().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if ($$0.c() instanceof cmr $$3 && $$3.bS()) {
         bra $$4 = this.dS().d(this, $$0.d());
         this.a($$4, $$3.du().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bra $$0) {
      double $$1 = this.du().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ag_());
      } else {
         if (this.d < 0) {
            this.B();
            this.d = this.ah.a(20) + this.ah.a(20);
         }
      }
   }

   @Override
   protected cty ag_() {
      return cug.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bra $$0, double $$1) {
      if (!this.dR().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dR().a(this, $$0, null, this.dw(), this.dy(), this.dC(), (float)(4.0 + this.ah.j() * 1.5 * $$2), false, dcg.a.d);
         this.aq();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.B();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.B();
      } else {
         super.b($$0);
      }
   }

   public void B() {
      this.d = 80;
      if (!this.dR().B) {
         this.dR().a(this, (byte)10);
         if (!this.aY()) {
            this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.zy, avi.e, 1.0F, 1.0F);
         }
      }
   }

   public int C() {
      return this.d;
   }

   public boolean D() {
      return this.d > -1;
   }

   @Override
   public float a(dby $$0, dbm $$1, ja $$2, dsl $$3, eoj $$4, float $$5) {
      return !this.D() || !$$3.a(avw.N) && !$$1.a_($$2.c()).a(avw.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dby $$0, dbm $$1, ja $$2, dsl $$3, float $$4) {
      return !this.D() || !$$3.a(avw.N) && !$$1.a_($$2.c()).a(avw.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bra $$0) {
      return e($$0);
   }

   private static boolean e(bra $$0) {
      return $$0.a(avy.j) || $$0.a(avy.m);
   }
}
