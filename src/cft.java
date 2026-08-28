import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cft extends cfc implements bti, buc {
   private static final ajv<Boolean> ca = ajz.a(cft.class, ajx.k);
   private static final ajv<Integer> cb = ajz.a(cft.class, ajx.b);
   private final bth cc = new bth(this.ao, cb, ca);

   public cft(bsw<? extends cft> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cbd(this, 1.25));
      this.bU.a(3, new bzw(this, 1.0));
      this.bU.a(4, new cbs(this, 1.2, $$0 -> $$0.a(cur.nR), false));
      this.bU.a(4, new cbs(this, 1.2, $$0 -> $$0.a(awm.ar), false));
      this.bU.a(5, new caj(this, 1.1));
      this.bU.a(6, new cbx(this, 1.0));
      this.bU.a(7, new cas(this, cmv.class, 6.0F));
      this.bU.a(8, new cbf(this));
   }

   public static but.a s() {
      return btn.A().a(buu.s, 10.0).a(buu.v, 0.25);
   }

   @Nullable
   @Override
   public btl cR() {
      return (btl)(this.i() && this.cU() instanceof cmv $$0 && $$0.b(cur.nR) ? $$0 : super.cR());
   }

   @Override
   public void a(ajv<?> $$0) {
      if (cb.equals($$0) && this.dQ().B) {
         this.cc.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
      $$0.a(cb, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.cc.a($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.cc.b($$0);
   }

   @Override
   protected avn v() {
      return avo.tA;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.tC;
   }

   @Override
   protected avn n_() {
      return avo.tB;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.tE, 0.15F, 1.0F);
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bT() && !$$0.fO()) {
         if (!this.dQ().B) {
            $$0.n(this);
         }

         return bqq.a(this.dQ().B);
      } else {
         bqq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuo $$4 = $$0.b($$1);
            return $$4.a(cur.nL) ? $$4.a($$0, this, $$1) : bqq.e;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bE() && !this.o_();
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cur.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cc.d();
   }

   @Override
   public void a(@Nullable avp $$0) {
      this.cc.a(true);
      if ($$0 != null) {
         this.dQ().a(null, this, avo.tD, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public eww b(btl $$0) {
      ji $$1 = this.cJ();
      if ($$1.o() == ji.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cow.a($$1);
         jd $$3 = this.dq();
         jd.a $$4 = new jd.a();
         UnmodifiableIterator var6 = $$0.fF().iterator();

         while (var6.hasNext()) {
            bty $$5 = (bty)var6.next();
            ewr $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dQ().j($$4);
               if (cow.a($$8)) {
                  eww $$9 = eww.a($$4, $$8);
                  if (cow.a(this.dQ(), $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(aqt $$0, btk $$1) {
      if ($$0.al() != bqn.a) {
         ckw $$2 = bsw.bx.a((dcu)$$0);
         if ($$2 != null) {
            $$2.a(bsx.a, new cuo(cur.oW));
            $$2.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$2.c(this.gb());
            $$2.a(this.o_());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.p(this.cF());
            }

            $$2.fP();
            $$0.b($$2);
            this.aq();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cmv $$0, eww $$1) {
      super.a($$0, $$1);
      this.a($$0.dG(), $$0.dI() * 0.5F);
      this.O = this.aY = this.ba = this.dG();
      this.cc.b();
   }

   @Override
   protected eww b(cmv $$0, eww $$1) {
      return new eww(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmv $$0) {
      return (float)(this.g(buu.v) * 0.225 * (double)this.cc.c());
   }

   @Override
   public boolean a() {
      return this.cc.a(this.dT());
   }

   @Nullable
   public cft b(aqt $$0, bsk $$1) {
      return bsw.az.a((dcu)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.ar);
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }
}
