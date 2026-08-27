import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvi extends bur implements bjd, bjw {
   private static final aee<Boolean> bT = aeh.a(bvi.class, aeg.k);
   private static final aee<Integer> bU = aeh.a(bvi.class, aeg.b);
   private static final cmg bW = cmg.a(cji.tl, cji.tm, cji.uq);
   private final bjc bX = new bjc(this.an, bU, bT);

   public bvi(biu<? extends bvi> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bqu(this, 1.25));
      this.bO.a(3, new bpn(this, 1.0));
      this.bO.a(4, new brj(this, 1.2, cmg.a(cji.nf), false));
      this.bO.a(4, new brj(this, 1.2, bW, false));
      this.bO.a(5, new bqa(this, 1.1));
      this.bO.a(6, new bro(this, 1.0));
      this.bO.a(7, new bqj(this, cbu.class, 6.0F));
      this.bO.a(8, new bqw(this));
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 10.0).a(bkm.d, 0.25);
   }

   @Nullable
   @Override
   public bjg cN() {
      return (bjg)(this.i() && this.cQ() instanceof cbu $$0 && $$0.b(cji.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(aee<?> $$0) {
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
   public void b(qw $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected apc w() {
      return apd.rO;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.rQ;
   }

   @Override
   protected apc l_() {
      return apd.rP;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(apd.rS, 0.15F, 1.0F);
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fH()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bgy.a(this.dL().B);
      } else {
         bgy $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cjf $$4 = $$0.b($$1);
            return $$4.a(cji.mZ) ? $$4.a($$0, this, $$1) : bgy.d;
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
         this.a(cji.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable ape $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, apd.rR, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ehn b(bjg $$0) {
      ha $$1 = this.cE();
      if ($$1.o() == ha.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdq.a($$1);
         gw $$3 = this.dl();
         gw.a $$4 = new gw.a();
         UnmodifiableIterator var6 = $$0.fz().iterator();

         while (var6.hasNext()) {
            bjs $$5 = (bjs)var6.next();
            ehi $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dL().i($$4);
               if (cdq.a($$8)) {
                  ehn $$9 = ehn.a($$4, $$8);
                  if (cdq.a(this.dL(), $$0, $$6.c($$9))) {
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
   public void a(akq $$0, bjf $$1) {
      if ($$0.ai() != bgv.a) {
         cad $$2 = biu.bs.a((cpv)$$0);
         if ($$2 != null) {
            $$2.a(biv.a, new cjf(cji.oh));
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
   protected void a(cbu $$0, ehn $$1) {
      super.a($$0, $$1);
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.bX.b();
   }

   @Override
   protected ehn b(cbu $$0, ehn $$1) {
      return new ehn(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cbu $$0) {
      return (float)(this.b(bkm.d) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ef());
   }

   @Nullable
   public bvi b(akq $$0, bil $$1) {
      return biu.av.a((cpv)$$0);
   }

   @Override
   public boolean m(cjf $$0) {
      return bW.a($$0);
   }

   @Override
   public ehn cI() {
      return new ehn(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
