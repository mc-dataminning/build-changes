import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cbd extends cam implements bou, bpm {
   private static final aii<Boolean> bV = ail.a(cbd.class, aik.k);
   private static final aii<Integer> bW = ail.a(cbd.class, aik.b);
   private static final csp bY = csp.a(cpt.ub, cpt.uc, cpt.vg);
   private final bot bZ = new bot(this.am, bW, bV);

   public cbd(bol<? extends cbd> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new bwn(this, 1.25));
      this.bP.a(3, new bvg(this, 1.0));
      this.bP.a(4, new bxc(this, 1.2, csp.a(cpt.nQ), false));
      this.bP.a(4, new bxc(this, 1.2, bY, false));
      this.bP.a(5, new bvt(this, 1.1));
      this.bP.a(6, new bxh(this, 1.0));
      this.bP.a(7, new bwc(this, cia.class, 6.0F));
      this.bP.a(8, new bwp(this));
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 10.0).a(bqe.o, 0.25);
   }

   @Nullable
   @Override
   public box cK() {
      return (box)(this.i() && this.cN() instanceof cia $$0 && $$0.b(cpt.nQ) ? $$0 : super.cK());
   }

   @Override
   public void a(aii<?> $$0) {
      if (bW.equals($$0) && this.dJ().B) {
         this.bZ.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, false);
      this.am.a(bW, 0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      this.bZ.a($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.bZ.b($$0);
   }

   @Override
   protected ato y() {
      return atp.sT;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.sV;
   }

   @Override
   protected ato n_() {
      return atp.sU;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.sX, 0.15F, 1.0F);
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bM() && !$$0.fK()) {
         if (!this.dJ().B) {
            $$0.m(this);
         }

         return bml.a(this.dJ().B);
      } else {
         bml $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cpq $$4 = $$0.b($$1);
            return $$4.a(cpt.nK) ? $$4.a($$0, this, $$1) : bml.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(cpt.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bZ.d();
   }

   @Override
   public void a(@Nullable atq $$0) {
      this.bZ.a(true);
      if ($$0 != null) {
         this.dJ().a(null, this, atp.sW, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public eov b(box $$0) {
      ih $$1 = this.cC();
      if ($$1.o() == ih.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cjy.a($$1);
         ib $$3 = this.dj();
         ib.a $$4 = new ib.a();
         UnmodifiableIterator var6 = $$0.fC().iterator();

         while (var6.hasNext()) {
            bpi $$5 = (bpi)var6.next();
            eoq $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dJ().j($$4);
               if (cjy.a($$8)) {
                  eov $$9 = eov.a($$4, $$8);
                  if (cjy.a(this.dJ(), $$0, $$6.c($$9))) {
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
   public void a(apa $$0, bow $$1) {
      if ($$0.aj() != bmi.a) {
         cgb $$2 = bol.bv.a((cwe)$$0);
         if ($$2 != null) {
            $$2.a(bom.a, new cpq(cpt.oU));
            $$2.b(this.do(), this.dq(), this.du(), this.dz(), this.dB());
            $$2.t(this.gb());
            $$2.a(this.o_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cy());
            }

            $$2.fQ();
            $$0.b($$2);
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cia $$0, eov $$1) {
      super.a($$0, $$1);
      this.a($$0.dz(), $$0.dB() * 0.5F);
      this.M = this.aV = this.aX = this.dz();
      this.bZ.b();
   }

   @Override
   protected eov b(cia $$0, eov $$1) {
      return new eov(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cia $$0) {
      return (float)(this.g(bqe.o) * 0.225 * (double)this.bZ.c());
   }

   @Override
   public boolean a() {
      return this.bZ.a(this.ef());
   }

   @Nullable
   public cbd b(apa $$0, boa $$1) {
      return bol.ax.a((cwe)$$0);
   }

   @Override
   public boolean o(cpq $$0) {
      return bY.a($$0);
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.6F * this.cF()), (double)(this.dd() * 0.4F));
   }
}
