import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvd extends bum implements biy, bjr {
   private static final aec<Boolean> bT = aef.a(bvd.class, aee.k);
   private static final aec<Integer> bU = aef.a(bvd.class, aee.b);
   private static final cmb bW = cmb.a(cjd.tl, cjd.tm, cjd.uq);
   private final bix bX = new bix(this.an, bU, bT);

   public bvd(bip<? extends bvd> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bqp(this, 1.25));
      this.bO.a(3, new bpi(this, 1.0));
      this.bO.a(4, new bre(this, 1.2, cmb.a(cjd.nf), false));
      this.bO.a(4, new bre(this, 1.2, bW, false));
      this.bO.a(5, new bpv(this, 1.1));
      this.bO.a(6, new brj(this, 1.0));
      this.bO.a(7, new bqe(this, cbp.class, 6.0F));
      this.bO.a(8, new bqr(this));
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 10.0).a(bkh.d, 0.25);
   }

   @Nullable
   @Override
   public bjb cN() {
      return (bjb)(this.i() && this.cQ() instanceof cbp $$0 && $$0.b(cjd.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(aec<?> $$0) {
      if (bU.equals($$0) && this.dK().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, false);
      this.an.a(bU, 0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected aoy r() {
      return aoz.rO;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.rQ;
   }

   @Override
   protected aoy h_() {
      return aoz.rP;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.rS, 0.15F, 1.0F);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fG()) {
         if (!this.dK().B) {
            $$0.n(this);
         }

         return bgt.a(this.dK().B);
      } else {
         bgt $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cja $$4 = $$0.b($$1);
            return $$4.a(cjd.mZ) ? $$4.a($$0, this, $$1) : bgt.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bv() && !this.i_();
   }

   @Override
   protected void ew() {
      super.ew();
      if (this.i()) {
         this.a(cjd.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable apa $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dK().a(null, this, aoz.rR, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ehi b(bjb $$0) {
      hc $$1 = this.cE();
      if ($$1.o() == hc.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdl.a($$1);
         gw $$3 = this.dk();
         gw.a $$4 = new gw.a();
         UnmodifiableIterator var6 = $$0.fy().iterator();

         while (var6.hasNext()) {
            bjn $$5 = (bjn)var6.next();
            ehd $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dK().i($$4);
               if (cdl.a($$8)) {
                  ehi $$9 = ehi.a($$4, $$8);
                  if (cdl.a(this.dK(), $$0, $$6.c($$9))) {
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
   public void a(akn $$0, bja $$1) {
      if ($$0.ai() != bgq.a) {
         bzy $$2 = bip.bs.a((cpq)$$0);
         if ($$2 != null) {
            $$2.a(biq.a, new cja(cjd.oh));
            $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$2.t(this.fQ());
            $$2.a(this.i_());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fF();
            $$0.b($$2);
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cbp $$0, ehi $$1) {
      super.a($$0, $$1);
      this.a($$0.dA(), $$0.dC() * 0.5F);
      this.N = this.aU = this.aW = this.dA();
      this.bX.b();
   }

   @Override
   protected ehi b(cbp $$0, ehi $$1) {
      return new ehi(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbp $$0) {
      return (float)(this.b(bkh.d) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ee());
   }

   @Nullable
   public bvd b(akn $$0, big $$1) {
      return bip.av.a((cpq)$$0);
   }

   @Override
   public boolean m(cja $$0) {
      return bW.a($$0);
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
