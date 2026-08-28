import javax.annotation.Nullable;

public class cqv extends cqd {
   private int e = 200;

   public cqv(bvq<? extends cqv> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqv(dhh $$0, bwf $$1, cxo $$2, @Nullable cxo $$3) {
      super(bvq.bn, $$1, $$0, $$2, $$3);
   }

   public cqv(dhh $$0, double $$1, double $$2, double $$3, cxo $$4, @Nullable cxo $$5) {
      super(bvq.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C && !this.l()) {
         this.dW().a(ls.R, this.dB(), this.dD(), this.dH(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bwf $$0) {
      super.a($$0);
      buo $$1 = new buo(buq.x, this.e, 0);
      $$0.b($$1, this.E());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.e = $$0.h("Duration");
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Duration", this.e);
   }

   @Override
   protected cxo v() {
      return new cxo(cxs.wf);
   }
}
