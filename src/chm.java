import javax.annotation.Nullable;

public class chm extends cha {
   private static final byte c = 10;
   private int d = -1;

   public chm(blz<? extends chm> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public chm(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.ba, $$0, $$1, $$2, $$3);
   }

   @Override
   public cha.a w() {
      return cha.a.d;
   }

   @Override
   public djh y() {
      return cws.ck.o();
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
   public boolean a(bkt $$0, float $$1) {
      if ($$0.c() instanceof cfo $$3 && $$3.bN()) {
         bkt $$4 = this.dN().d(this, $$0.d());
         this.a($$4, $$3.dp().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bkt $$0) {
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
   protected cmt ah_() {
      return cnb.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bkt $$0, double $$1) {
      if (!this.dM().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dM().a(this, $$0, null, this.dr(), this.dt(), this.dx(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, ctp.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bkt $$2) {
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
            this.dM().a(null, this.dr(), this.dt(), this.dx(), ars.yB, art.e, 1.0F, 1.0F);
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
   public float a(cth $$0, csv $$1, hx $$2, djh $$3, eer $$4, float $$5) {
      return !this.E() || !$$3.a(ash.N) && !$$1.a_($$2.c()).a(ash.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cth $$0, csv $$1, hx $$2, djh $$3, float $$4) {
      return !this.E() || !$$3.a(ash.N) && !$$1.a_($$2.c()).a(ash.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
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
   boolean d(bkt $$0) {
      return e($$0);
   }

   private static boolean e(bkt $$0) {
      return $$0.a(asj.j) || $$0.a(asj.m);
   }
}
