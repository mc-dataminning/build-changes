import javax.annotation.Nullable;

public class cpw extends cpe {
   private int d = 200;

   public cpw(bur<? extends cpw> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpw(dgi $$0, bvg $$1, cwp $$2, @Nullable cwp $$3) {
      super(bur.bn, $$1, $$0, $$2, $$3);
   }

   public cpw(dgi $$0, double $$1, double $$2, double $$3, cwp $$4, @Nullable cwp $$5) {
      super(bur.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C && !this.l()) {
         this.dW().a(lt.S, this.dB(), this.dD(), this.dH(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bvg $$0) {
      super.a($$0);
      btp $$1 = new btp(btr.x, this.d, 0);
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
   protected cwp v() {
      return new cwp(cwt.wp);
   }
}
