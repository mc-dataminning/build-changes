import javax.annotation.Nullable;

public class cno extends cnc {
   private static final byte c = 10;
   private int d = -1;

   public cno(brn<? extends cno> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cno(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.bc, $$0, $$1, $$2, $$3);
   }

   @Override
   public cnc.a v() {
      return cnc.a.d;
   }

   @Override
   public dqh x() {
      return ddg.ck.n();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dN().a(kx.ab, this.ds(), this.du() + 0.5, this.dy(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dq().i());
      }

      if (this.Q) {
         double $$0 = this.dq().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if ($$0.c() instanceof cln $$3 && $$3.bO()) {
         bqf $$4 = this.dO().d(this, $$0.d());
         this.a($$4, $$3.dq().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bqf $$0) {
      double $$1 = this.dq().i();
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
   protected csu ag_() {
      return ctc.nP;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bqf $$0, double $$1) {
      if (!this.dN().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dN().a(this, $$0, null, this.ds(), this.du(), this.dy(), (float)(4.0 + this.ah.j() * 1.5 * $$2), false, dad.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bqf $$2) {
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
      if (!this.dN().B) {
         this.dN().a(this, (byte)10);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), avc.zk, avd.e, 1.0F, 1.0F);
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
   public float a(czv $$0, czj $$1, in $$2, dqh $$3, ema $$4, float $$5) {
      return !this.D() || !$$3.a(avr.N) && !$$1.a_($$2.c()).a(avr.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(czv $$0, czj $$1, in $$2, dqh $$3, float $$4) {
      return !this.D() || !$$3.a(avr.N) && !$$1.a_($$2.c()).a(avr.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bqf $$0) {
      return e($$0);
   }

   private static boolean e(bqf $$0) {
      return $$0.a(avt.j) || $$0.a(avt.m);
   }
}
