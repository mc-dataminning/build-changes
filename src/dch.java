import com.mojang.serialization.MapCodec;

public abstract class dch extends dby {
   protected dch(doy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dch> a();

   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(avc.af) || $$0.a(dca.cC);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return $$1 == elh.c && !this.aG ? true : super.a($$0, $$1);
   }
}
