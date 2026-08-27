import javax.annotation.Nullable;

public class chl extends cgz {
   private static final byte c = 10;
   private int d = -1;

   public chl(bly<? extends chl> $$0, cto $$1) {
      super($$0, $$1);
   }

   public chl(cto $$0, double $$1, double $$2, double $$3) {
      super(bly.ba, $$0, $$1, $$2, $$3);
   }

   @Override
   public cgz.a w() {
      return cgz.a.d;
   }

   @Override
   public djg y() {
      return cwr.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dM().a(jx.ab, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dp().i());
      }

      if (this.P) {
         double $$0 = this.dp().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if ($$0.c() instanceof cfn $$3 && $$3.bN()) {
         bks $$4 = this.dN().d(this, $$0.d());
         this.a($$4, $$3.dp().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bks $$0) {
      double $$1 = this.dp().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ah_());
      } else {
         if (this.d < 0) {
            this.C();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected cms ah_() {
      return cna.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bks $$0, double $$1) {
      if (!this.dM().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dM().a(this, $$0, null, this.dr(), this.dt(), this.dx(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, cto.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bks $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.C();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.C();
      } else {
         super.b($$0);
      }
   }

   public void C() {
      this.d = 80;
      if (!this.dM().B) {
         this.dM().a(this, (byte)10);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), arr.yB, ars.e, 1.0F, 1.0F);
         }
      }
   }

   public int D() {
      return this.d;
   }

   public boolean E() {
      return this.d > -1;
   }

   @Override
   public float a(ctg $$0, csu $$1, hx $$2, djg $$3, eeq $$4, float $$5) {
      return !this.E() || !$$3.a(asg.N) && !$$1.a_($$2.c()).a(asg.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(ctg $$0, csu $$1, hx $$2, djg $$3, float $$4) {
      return !this.E() || !$$3.a(asg.N) && !$$1.a_($$2.c()).a(asg.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bks $$0) {
      return e($$0);
   }

   private static boolean e(bks $$0) {
      return $$0.a(asi.j) || $$0.a(asi.m);
   }
}
