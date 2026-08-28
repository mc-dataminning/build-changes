import javax.annotation.Nullable;

public class cpv extends cpd {
   private int d = 200;

   public cpv(bur<? extends cpv> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpv(dgh $$0, bvg $$1, cwo $$2, @Nullable cwo $$3) {
      super(bur.bm, $$1, $$0, $$2, $$3);
   }

   public cpv(dgh $$0, double $$1, double $$2, double $$3, cwo $$4, @Nullable cwo $$5) {
      super(bur.bm, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.l()) {
         this.dV().a(lt.S, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
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
   protected cwo v() {
      return new cwo(cws.wp);
   }
}
