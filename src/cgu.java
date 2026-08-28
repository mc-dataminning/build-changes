import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cgu extends cgd implements buk, bvc {
   private static final akh<Boolean> bY = akl.a(cgu.class, akj.k);
   private static final akh<Integer> bZ = akl.a(cgu.class, akj.b);
   private final buj ca = new buj(this.am, bZ, bY);

   public cgu(bty<? extends cgu> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new ccd(this, 1.25));
      this.bS.a(3, new caw(this, 1.0));
      this.bS.a(4, new ccs(this, 1.2, $$0 -> $$0.a(cvw.nR), false));
      this.bS.a(4, new ccs(this, 1.2, $$0 -> $$0.a(axe.ar), false));
      this.bS.a(5, new cbj(this, 1.1));
      this.bS.a(6, new ccx(this, 1.0));
      this.bS.a(7, new cbs(this, cnx.class, 6.0F));
      this.bS.a(8, new ccf(this));
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.s, 10.0).a(bvu.v, 0.25);
   }

   @Nullable
   @Override
   public bun cU() {
      return (bun)(this.i() && this.cX() instanceof cnx $$0 && $$0.b(cvw.nR) ? $$0 : super.cU());
   }

   @Override
   public void a(akh<?> $$0) {
      if (bZ.equals($$0) && this.dS().B) {
         this.ca.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected awf w() {
      return awg.tB;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.tD;
   }

   @Override
   protected awf o_() {
      return awg.tC;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.tF, 0.15F, 1.0F);
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      boolean $$2 = this.n($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.fT()) {
         if (!this.dS().B) {
            $$0.n(this);
         }

         return brs.a;
      } else {
         brs $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvs $$4 = $$0.b($$1);
            return (brs)($$4.a(cvw.nL) ? $$4.a($$0, this, $$1) : brs.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bI() && !this.p_();
   }

   @Override
   protected void eE() {
      super.eE();
      if (this.i()) {
         this.a(cvw.nL);
      }
   }

   @Override
   public boolean i() {
      return this.ca.d();
   }

   @Override
   public void a(cvs $$0, @Nullable awh $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dS().a(null, this, awg.tE, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public eyw b(bun $$0) {
      jk $$1 = this.cM();
      if ($$1.o() == jk.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqa.a($$1);
         jf $$3 = this.ds();
         jf.a $$4 = new jf.a();
         UnmodifiableIterator var6 = $$0.fK().iterator();

         while (var6.hasNext()) {
            buz $$5 = (buz)var6.next();
            eyr $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dS().j($$4);
               if (cqa.a($$8)) {
                  eyw $$9 = eyw.a($$4, $$8);
                  if (cqa.a(this.dS(), $$0, $$6.c($$9))) {
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
   public void a(arj $$0, bum $$1) {
      if ($$0.am() != brp.a) {
         cly $$2 = bty.bx.a($$0, btx.i);
         if ($$2 != null) {
            $$2.a(btz.a, new cvs(cvw.oX));
            $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$2.u(this.gd());
            $$2.a(this.p_());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            $$2.fW();
            $$0.b($$2);
            this.as();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cnx $$0, eyw $$1) {
      super.a($$0, $$1);
      this.a($$0.dI(), $$0.dK() * 0.5F);
      this.O = this.aT = this.aV = this.dI();
      this.ca.b();
   }

   @Override
   protected eyw b(cnx $$0, eyw $$1) {
      return new eyw(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cnx $$0) {
      return (float)(this.h(bvu.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.dV());
   }

   @Nullable
   public cgu b(arj $$0, btk $$1) {
      return bty.az.a($$0, btx.e);
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ar);
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
