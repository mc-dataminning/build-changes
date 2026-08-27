import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvo extends bux implements bjj, bkc {
   private static final aef<Boolean> bT = aei.a(bvo.class, aeh.k);
   private static final aef<Integer> bU = aei.a(bvo.class, aeh.b);
   private static final cmm bW = cmm.a(cjo.tl, cjo.tm, cjo.uq);
   private final bji bX = new bji(this.an, bU, bT);

   public bvo(bja<? extends bvo> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bra(this, 1.25));
      this.bO.a(3, new bpt(this, 1.0));
      this.bO.a(4, new brp(this, 1.2, cmm.a(cjo.nf), false));
      this.bO.a(4, new brp(this, 1.2, bW, false));
      this.bO.a(5, new bqg(this, 1.1));
      this.bO.a(6, new bru(this, 1.0));
      this.bO.a(7, new bqp(this, cca.class, 6.0F));
      this.bO.a(8, new brc(this));
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 10.0).a(bks.m, 0.25);
   }

   @Nullable
   @Override
   public bjm cN() {
      return (bjm)(this.i() && this.cQ() instanceof cca $$0 && $$0.b(cjo.nf) ? $$0 : super.cN());
   }

   @Override
   public void a(aef<?> $$0) {
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
   protected apf w() {
      return apg.rO;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.rQ;
   }

   @Override
   protected apf l_() {
      return apg.rP;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.rS, 0.15F, 1.0F);
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bhe.a(this.dL().B);
      } else {
         bhe $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cjl $$4 = $$0.b($$1);
            return $$4.a(cjo.mZ) ? $$4.a($$0, this, $$1) : bhe.d;
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
         this.a(cjo.mZ);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable aph $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, apg.rR, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ehh b(bjm $$0) {
      ha $$1 = this.cE();
      if ($$1.o() == ha.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdw.a($$1);
         gw $$3 = this.dl();
         gw.a $$4 = new gw.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bjy $$5 = (bjy)var6.next();
            ehc $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dL().i($$4);
               if (cdw.a($$8)) {
                  ehh $$9 = ehh.a($$4, $$8);
                  if (cdw.a(this.dL(), $$0, $$6.c($$9))) {
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
   public void a(akt $$0, bjl $$1) {
      if ($$0.ai() != bhb.a) {
         caj $$2 = bja.bs.a((cqb)$$0);
         if ($$2 != null) {
            $$2.a(bjb.a, new cjl(cjo.oh));
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.t(this.fU());
            $$2.a(this.m_());
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
   protected void a(cca $$0, ehh $$1) {
      super.a($$0, $$1);
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.bX.b();
   }

   @Override
   protected ehh b(cca $$0, ehh $$1) {
      return new ehh(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cca $$0) {
      return (float)(this.b(bks.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.ef());
   }

   @Nullable
   public bvo b(akt $$0, bir $$1) {
      return bja.av.a((cqb)$$0);
   }

   @Override
   public boolean m(cjl $$0) {
      return bW.a($$0);
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
