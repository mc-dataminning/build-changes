import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvk extends but implements bjf, bjy {
   private static final aeg<Boolean> bT = aej.a(bvk.class, aei.k);
   private static final aeg<Integer> bU = aej.a(bvk.class, aei.b);
   private static final cmi bW = cmi.a(cjk.tl, cjk.tm, cjk.uq);
   private final bje bX = new bje(this.an, bU, bT);

   public bvk(biw<? extends bvk> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bqw(this, 1.25));
      this.bO.a(3, new bpp(this, 1.0));
      this.bO.a(4, new brl(this, 1.2, cmi.a(cjk.nf), false));
      this.bO.a(4, new brl(this, 1.2, bW, false));
      this.bO.a(5, new bqc(this, 1.1));
      this.bO.a(6, new brq(this, 1.0));
      this.bO.a(7, new bql(this, cbw.class, 6.0F));
      this.bO.a(8, new bqy(this));
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 10.0).a(bko.d, 0.25);
   }

   @Nullable
   @Override
   public bji cN() {
      return (bji)(this.i() && this.cQ() instanceof cbw $$0 && $$0.b(cjk.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(aeg<?> $$0) {
      if (bU.equals($$0) && this.dL().B) {
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
   public void b(qy $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected ape w() {
      return apf.rO;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.rQ;
   }

   @Override
   protected ape l_() {
      return apf.rP;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.rS, 0.15F, 1.0F);
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fH()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bha.a(this.dL().B);
      } else {
         bha $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cjh $$4 = $$0.b($$1);
            return $$4.a(cjk.mZ) ? $$4.a($$0, this, $$1) : bha.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bv() && !this.m_();
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(cjk.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable apg $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, apf.rR, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ehp b(bji $$0) {
      hc $$1 = this.cE();
      if ($$1.o() == hc.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cds.a($$1);
         gw $$3 = this.dl();
         gw.a $$4 = new gw.a();
         UnmodifiableIterator var6 = $$0.fz().iterator();

         while (var6.hasNext()) {
            bju $$5 = (bju)var6.next();
            ehk $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dL().i($$4);
               if (cds.a($$8)) {
                  ehp $$9 = ehp.a($$4, $$8);
                  if (cds.a(this.dL(), $$0, $$6.c($$9))) {
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
   public void a(aks $$0, bjh $$1) {
      if ($$0.ai() != bgx.a) {
         caf $$2 = biw.bs.a((cpx)$$0);
         if ($$2 != null) {
            $$2.a(bix.a, new cjh(cjk.oh));
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.t(this.fT());
            $$2.a(this.m_());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fI();
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
   protected void a(cbw $$0, ehp $$1) {
      super.a($$0, $$1);
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.bX.b();
   }

   @Override
   protected ehp b(cbw $$0, ehp $$1) {
      return new ehp(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbw $$0) {
      return (float)(this.b(bko.d) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ef());
   }

   @Nullable
   public bvk b(aks $$0, bin $$1) {
      return biw.av.a((cpx)$$0);
   }

   @Override
   public boolean m(cjh $$0) {
      return bW.a($$0);
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
