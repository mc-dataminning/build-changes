import javax.annotation.Nullable;

public class cop extends coc {
   private static final byte c = 10;
   private int d = -1;

   public cop(bsj<? extends cop> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cop(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.bd, $$0, $$1, $$2, $$3);
   }

   @Override
   public coc.a v() {
      return coc.a.d;
   }

   @Override
   public dsh x() {
      return dfh.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dP().a(lj.ae, this.du(), this.dw() + 0.5, this.dA(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.ds().i());
      }

      if (this.Q) {
         double $$0 = this.ds().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if ($$0.c() instanceof cmn $$3 && $$3.bQ()) {
         bqw $$4 = this.dQ().d(this, $$0.d());
         this.a($$4, $$3.ds().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bqw $$0) {
      double $$1 = this.ds().i();
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
   protected ctv ag_() {
      return cud.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bqw $$0, double $$1) {
      if (!this.dP().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dP().a(this, $$0, null, this.du(), this.dw(), this.dA(), (float)(4.0 + this.ah.j() * 1.5 * $$2), false, dcd.a.d);
         this.ao();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqw $$2) {
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
      if (!this.dP().B) {
         this.dP().a(this, (byte)10);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avf.zy, avg.e, 1.0F, 1.0F);
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
   public float a(dbv $$0, dbj $$1, ja $$2, dsh $$3, eob $$4, float $$5) {
      return !this.D() || !$$3.a(avu.N) && !$$1.a_($$2.c()).a(avu.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dbv $$0, dbj $$1, ja $$2, dsh $$3, float $$4) {
      return !this.D() || !$$3.a(avu.N) && !$$1.a_($$2.c()).a(avu.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
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
   boolean d(bqw $$0) {
      return e($$0);
   }

   private static boolean e(bqw $$0) {
      return $$0.a(avw.j) || $$0.a(avw.m);
   }
}
