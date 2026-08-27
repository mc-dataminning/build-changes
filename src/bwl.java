import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwl extends bvu implements bkg, bkz {
   private static final afc<Boolean> bT = aff.a(bwl.class, afe.k);
   private static final afc<Integer> bU = aff.a(bwl.class, afe.b);
   private static final cnk bW = cnk.a(ckm.tl, ckm.tm, ckm.uq);
   private final bkf bX = new bkf(this.an, bU, bT);

   public bwl(bjx<? extends bwl> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new brx(this, 1.25));
      this.bO.a(3, new bqq(this, 1.0));
      this.bO.a(4, new bsm(this, 1.2, cnk.a(ckm.nf), false));
      this.bO.a(4, new bsm(this, 1.2, bW, false));
      this.bO.a(5, new brd(this, 1.1));
      this.bO.a(6, new bsr(this, 1.0));
      this.bO.a(7, new brm(this, ccx.class, 6.0F));
      this.bO.a(8, new brz(this));
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 10.0).a(blp.m, 0.25);
   }

   @Nullable
   @Override
   public bkj cN() {
      return (bkj)(this.i() && this.cQ() instanceof ccx $$0 && $$0.b(ckm.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(afc<?> $$0) {
      if (bU.equals($$0) && this.dL().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, false);
      this.an.a(bU, 0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected aqc w() {
      return aqd.rQ;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.rS;
   }

   @Override
   protected aqc m_() {
      return aqd.rR;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.rU, 0.15F, 1.0F);
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bib.a(this.dL().B);
      } else {
         bib $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            ckj $$4 = $$0.b($$1);
            return $$4.a(ckm.mZ) ? $$4.a($$0, this, $$1) : bib.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bv() && !this.n_();
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(ckm.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable aqe $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, aqd.rT, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public eif b(bkj $$0) {
      hx $$1 = this.cE();
      if ($$1.o() == hx.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cet.a($$1);
         ht $$3 = this.dl();
         ht.a $$4 = new ht.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bkv $$5 = (bkv)var6.next();
            eia $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dL().i($$4);
               if (cet.a($$8)) {
                  eif $$9 = eif.a($$4, $$8);
                  if (cet.a(this.dL(), $$0, $$6.c($$9))) {
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
   public void a(alq $$0, bki $$1) {
      if ($$0.ai() != bhy.a) {
         cbg $$2 = bjx.bs.a((cqz)$$0);
         if ($$2 != null) {
            $$2.a(bjy.a, new ckj(ckm.oh));
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.t(this.fU());
            $$2.a(this.n_());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fJ();
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
   protected void a(ccx $$0, eif $$1) {
      super.a($$0, $$1);
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.bX.b();
   }

   @Override
   protected eif b(ccx $$0, eif $$1) {
      return new eif(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(ccx $$0) {
      return (float)(this.b(blp.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ef());
   }

   @Nullable
   public bwl b(alq $$0, bjo $$1) {
      return bjx.av.a((cqz)$$0);
   }

   @Override
   public boolean m(ckj $$0) {
      return bW.a($$0);
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
