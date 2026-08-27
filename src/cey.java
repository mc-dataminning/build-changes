import java.util.List;
import javax.annotation.Nullable;

public class cey extends cew {
   public static final double e = 0.375;

   public cey(bpd<? extends cey> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cey(cxb $$0, ib $$1) {
      super(bpd.al, $$0, $$1);
      this.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ai().k() / 2.0;
      double $$1 = (double)this.ai().l();
      this.a(new epo(this.dr() - $$0, this.dt(), this.dx() - $$0, this.dr() + $$0, this.dt() + $$1, this.dx() + $$0));
   }

   @Override
   public void a(ih $$0) {
   }

   @Override
   public int A() {
      return 9;
   }

   @Override
   public int B() {
      return 9;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void b(@Nullable box $$0) {
      this.a(aty.nB, 1.0F, 1.0F);
   }

   @Override
   public void b(ta $$0) {
   }

   @Override
   public void a(ta $$0) {
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      if (this.dM().B) {
         return bnd.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bpr> $$4 = this.dM().a(bpr.class, new epo(this.dr() - 7.0, this.dt() - 7.0, this.dx() - 7.0, this.dr() + 7.0, this.dt() + 7.0, this.dx() + 7.0));

         for (bpr $$5 : $$4) {
            if ($$5.gc() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.am();
            if ($$0.ga().d) {
               for (bpr $$7 : $$4) {
                  if ($$7.gb() && $$7.gc() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(drp.b, $$0);
         }

         return bnd.b;
      }
   }

   @Override
   public boolean z() {
      return this.dM().a_(this.c).a(aun.S);
   }

   public static cey b(cxb $$0, ib $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (cey $$6 : $$0.a(cey.class, new epo((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.D().equals($$1)) {
            return $$6;
         }
      }

      cey $$7 = new cey($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(aty.nC, 1.0F, 1.0F);
   }

   @Override
   public yb<aam> di() {
      return new aan(this, 0, this.D());
   }

   @Override
   public ept q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cqm dz() {
      return new cqm(cqp.uI);
   }
}
