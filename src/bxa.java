import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxa extends bwj implements bkv, blo {
   private static final afm<Boolean> bT = afp.a(bxa.class, afo.k);
   private static final afm<Integer> bU = afp.a(bxa.class, afo.b);
   private static final coc bW = coc.a(cle.tm, cle.tn, cle.ur);
   private final bku bX = new bku(this.an, bU, bT);

   public bxa(bkm<? extends bxa> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bsm(this, 1.25));
      this.bO.a(3, new brf(this, 1.0));
      this.bO.a(4, new btb(this, 1.2, coc.a(cle.nf), false));
      this.bO.a(4, new btb(this, 1.2, bW, false));
      this.bO.a(5, new brs(this, 1.1));
      this.bO.a(6, new btg(this, 1.0));
      this.bO.a(7, new bsb(this, cdm.class, 6.0F));
      this.bO.a(8, new bso(this));
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 10.0).a(bme.m, 0.25);
   }

   @Nullable
   @Override
   public bky cN() {
      return (bky)(this.i() && this.cQ() instanceof cdm $$0 && $$0.b(cle.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(afm<?> $$0) {
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
   public void b(rz $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected aqm w() {
      return aqn.rS;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.rU;
   }

   @Override
   protected aqm m_() {
      return aqn.rT;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.rW, 0.15F, 1.0F);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return biq.a(this.dL().B);
      } else {
         biq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            clb $$4 = $$0.b($$1);
            return $$4.a(cle.mZ) ? $$4.a($$0, this, $$1) : biq.d;
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
         this.a(cle.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable aqo $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, aqn.rV, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public eji b(bky $$0) {
      hx $$1 = this.cE();
      if ($$1.o() == hx.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cfi.a($$1);
         ht $$3 = this.dl();
         ht.a $$4 = new ht.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            blk $$5 = (blk)var6.next();
            ejd $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dL().i($$4);
               if (cfi.a($$8)) {
                  eji $$9 = eji.a($$4, $$8);
                  if (cfi.a(this.dL(), $$0, $$6.c($$9))) {
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
   public void a(ama $$0, bkx $$1) {
      if ($$0.ai() != bin.a) {
         cbv $$2 = bkm.bs.a((crs)$$0);
         if ($$2 != null) {
            $$2.a(bkn.a, new clb(cle.oh));
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
   protected void a(cdm $$0, eji $$1) {
      super.a($$0, $$1);
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.bX.b();
   }

   @Override
   protected eji b(cdm $$0, eji $$1) {
      return new eji(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cdm $$0) {
      return (float)(this.b(bme.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ef());
   }

   @Nullable
   public bxa b(ama $$0, bkd $$1) {
      return bkm.av.a((crs)$$0);
   }

   @Override
   public boolean m(clb $$0) {
      return bW.a($$0);
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
