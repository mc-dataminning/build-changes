import javax.annotation.Nullable;

public class cpu extends cpc {
   private int d = 200;

   public cpu(buq<? extends cpu> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpu(dgg $$0, bvf $$1, cwn $$2, @Nullable cwn $$3) {
      super(buq.bm, $$1, $$0, $$2, $$3);
   }

   public cpu(dgg $$0, double $$1, double $$2, double $$3, cwn $$4, @Nullable cwn $$5) {
      super(buq.bm, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C && !this.l()) {
         this.dW().a(lt.S, this.dB(), this.dD(), this.dH(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bvf $$0) {
      super.a($$0);
      bto $$1 = new bto(btq.x, this.d, 0);
      $$0.b($$1, this.E());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.d = $$0.h("Duration");
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Duration", this.d);
   }

   @Override
   protected cwn v() {
      return new cwn(cwr.wp);
   }
}
