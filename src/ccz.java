import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class ccz extends cci implements bqq, bri {
   private static final aja<Boolean> bX = aje.a(ccz.class, ajc.k);
   private static final aja<Integer> bY = aje.a(ccz.class, ajc.b);
   private static final cvp ca = cvp.a(crv.ud, crv.ue, crv.vi);
   private final bqp cb = new bqp(this.an, bY, bX);

   public ccz(bqg<? extends ccz> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new byj(this, 1.25));
      this.bR.a(3, new bxc(this, 1.0));
      this.bR.a(4, new byy(this, 1.2, cvp.a(crv.nQ), false));
      this.bR.a(4, new byy(this, 1.2, ca, false));
      this.bR.a(5, new bxp(this, 1.1));
      this.bR.a(6, new bzd(this, 1.0));
      this.bR.a(7, new bxy(this, cka.class, 6.0F));
      this.bR.a(8, new byl(this));
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 10.0).a(bsa.r, 0.25);
   }

   @Nullable
   @Override
   public bqt cN() {
      return (bqt)(this.i() && this.cQ() instanceof cka $$0 && $$0.b(crv.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(aja<?> $$0) {
      if (bY.equals($$0) && this.dM().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
      $$0.a(bY, 0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected aun v() {
      return auo.te;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.tg;
   }

   @Override
   protected aun o_() {
      return auo.tf;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.ti, 0.15F, 1.0F);
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bof.a(this.dM().B);
      } else {
         bof $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            crs $$4 = $$0.b($$1);
            return $$4.a(crv.nK) ? $$4.a($$0, this, $$1) : bof.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bA() && !this.p_();
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(crv.nK);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable aup $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, auo.th, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public esj b(bqt $$0) {
      ij $$1 = this.cF();
      if ($$1.o() == ij.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cma.a($$1);
         id $$3 = this.dm();
         id.a $$4 = new id.a();
         UnmodifiableIterator var6 = $$0.fF().iterator();

         while (var6.hasNext()) {
            bre $$5 = (bre)var6.next();
            ese $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (cma.a($$8)) {
                  esj $$9 = esj.a($$4, $$8);
                  if (cma.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(apu $$0, bqs $$1) {
      if ($$0.ak() != boc.a) {
         cib $$2 = bqg.bw.a((czg)$$0);
         if ($$2 != null) {
            $$2.a(bqh.a, new crs(crv.oU));
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.t(this.gd());
            $$2.a(this.p_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fS();
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
   protected void a(cka $$0, esj $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.cb.b();
   }

   @Override
   protected esj b(cka $$0, esj $$1) {
      return new esj(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cka $$0) {
      return (float)(this.g(bsa.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.ei());
   }

   @Nullable
   public ccz b(apu $$0, bpu $$1) {
      return bqg.ay.a((czg)$$0);
   }

   @Override
   public boolean o(crs $$0) {
      return ca.a($$0);
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
