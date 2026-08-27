import com.mojang.serialization.MapCodec;

public abstract class ddq extends dea {
   protected static final int a = 2;
   protected static final evf b = dea.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected ddq(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddq> a();

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !this.a($$0, $$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return a($$1, $$2.d(), it.b);
   }
}
