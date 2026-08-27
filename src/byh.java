import java.util.List;
import javax.annotation.Nullable;

public class byh extends byf {
   public static final double e = 0.375;

   public byh(biu<? extends byh> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public byh(cpv $$0, gw $$1) {
      super(biu.ah, $$0, $$1);
      this.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void y() {
      this.p((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ag().k() / 2.0;
      double $$1 = (double)this.ag().l();
      this.a(new ehi(this.dq() - $$0, this.ds(), this.dw() - $$0, this.dq() + $$0, this.ds() + $$1, this.dw() + $$0));
   }

   @Override
   public void a(ha $$0) {
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
   protected float a(bjs $$0, bir $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable biq $$0) {
      this.a(apd.mq, 1.0F, 1.0F);
   }

   @Override
   public void b(qw $$0) {
   }

   @Override
   public void a(qw $$0) {
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      if (this.dL().B) {
         return bgy.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bji> $$4 = this.dL().a(bji.class, new ehi(this.dq() - 7.0, this.ds() - 7.0, this.dw() - 7.0, this.dq() + 7.0, this.ds() + 7.0, this.dw() + 7.0));

         for (bji $$5 : $$4) {
            if ($$5.fS() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         boolean $$6 = false;
         if (!$$2) {
            this.ak();
            if ($$0.fS().d) {
               for (bji $$7 : $$4) {
                  if ($$7.fR() && $$7.fS() == this) {
                     $$7.a(true, false);
                     $$6 = true;
                  }
               }
            }
         }

         if ($$2 || $$6) {
            this.a(djt.b, $$0);
         }

         return bgy.b;
      }
   }

   @Override
   public boolean z() {
      return this.dL().a_(this.c).a(aps.S);
   }

   public static byh b(cpv $$0, gw $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for (byh $$6 : $$0.a(byh.class, new ehi((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.E().equals($$1)) {
            return $$6;
         }
      }

      byh $$7 = new byh($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void C() {
      this.a(apd.mr, 1.0F, 1.0F);
   }

   @Override
   public vd<ww> di() {
      return new wx(this, 0, this.E());
   }

   @Override
   public ehn q(float $$0) {
      return this.l($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cjf dy() {
      return new cjf(cji.tQ);
   }
}
