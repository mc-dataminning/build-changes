import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class chp extends cgy implements bve, bvx {
   private static final akm<Boolean> bY = akq.a(chp.class, ako.k);
   private static final akm<Integer> bZ = akq.a(chp.class, ako.b);
   private final bvd ca = new bvd(this.al, bZ, bY);

   public chp(bus<? extends chp> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new ccy(this, 1.25));
      this.bS.a(3, new cbr(this, 1.0));
      this.bS.a(4, new cdn(this, 1.2, $$0 -> $$0.a(cwq.nR), false));
      this.bS.a(4, new cdn(this, 1.2, $$0 -> $$0.a(axl.aw), false));
      this.bS.a(5, new cce(this, 1.1));
      this.bS.a(6, new cds(this, 1.0));
      this.bS.a(7, new ccn(this, cou.class, 6.0F));
      this.bS.a(8, new cda(this));
   }

   public static bwo.a n() {
      return cgy.gr().a(bwp.s, 10.0).a(bwp.v, 0.25);
   }

   @Nullable
   @Override
   public bvh cX() {
      return (bvh)(this.j() && this.da() instanceof cou $$0 && $$0.b(cwq.nR) ? $$0 : super.cX());
   }

   @Override
   public void a(akm<?> $$0) {
      if (bZ.equals($$0) && this.dV().C) {
         this.ca.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected awm t() {
      return awn.tz;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.tB;
   }

   @Override
   protected awm n_() {
      return awn.tA;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.tD, 0.15F, 1.0F);
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fW()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bsk.a;
      } else {
         bsk $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwm $$4 = $$0.b($$1);
            return (bsk)($$4.a(cwq.nL) ? $$4.a($$0, this, $$1) : bsk.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_();
   }

   @Override
   protected void f(arp $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cwq.nL);
      }
   }

   @Override
   public boolean j() {
      return this.ca.d();
   }

   @Override
   public void a(cwm $$0, @Nullable awo $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, awn.tC, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public ezy b(bvh $$0) {
      jm $$1 = this.cP();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqz.a($$1);
         jh $$3 = this.dv();
         jh.a $$4 = new jh.a();
         UnmodifiableIterator var6 = $$0.fM().iterator();

         while (var6.hasNext()) {
            bvt $$5 = (bvt)var6.next();
            ezt $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (cqz.a($$8)) {
                  ezy $$9 = ezy.a($$4, $$8);
                  if (cqz.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(arp $$0, bvg $$1) {
      if ($$0.ak() != bsh.a) {
         cmt $$2 = this.a(bus.bN, bug.a(this, false, true), $$0x -> {
            if (this.eX().f()) {
               $$0x.a(but.a, new cwm(cwq.oX));
            }

            $$0x.ai();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cou $$0, ezy $$1) {
      super.a($$0, $$1);
      this.a($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aW = this.aY = this.dL();
      this.ca.b();
   }

   @Override
   protected ezy b(cou $$0, ezy $$1) {
      return new ezy(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cou $$0) {
      return (float)(this.h(bwp.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.dY());
   }

   @Nullable
   public chp b(arp $$0, buc $$1) {
      return bus.aN.a($$0, bur.e);
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.aw);
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
