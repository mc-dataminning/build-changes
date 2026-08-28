import javax.annotation.Nullable;

public class cpx extends cpf {
   private int d = 200;

   public cpx(but<? extends cpx> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cpx(dgj $$0, bvi $$1, cwq $$2, @Nullable cwq $$3) {
      super(but.bm, $$1, $$0, $$2, $$3);
   }

   public cpx(dgj $$0, double $$1, double $$2, double $$3, cwq $$4, @Nullable cwq $$5) {
      super(but.bm, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C && !this.l()) {
         this.dV().a(lt.S, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bvi $$0) {
      super.a($$0);
      btr $$1 = new btr(btt.x, this.d, 0);
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
   protected cwq v() {
      return new cwq(cwu.wp);
   }
}
