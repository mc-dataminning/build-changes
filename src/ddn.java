import com.mojang.serialization.MapCodec;

public abstract class ddn extends dde {
   protected ddn(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddn> a();

   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(avr.af) || $$0.a(ddg.cC);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return $$1 == emp.c && !this.aG ? true : super.a($$0, $$1);
   }
}
