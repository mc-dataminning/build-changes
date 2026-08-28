import com.mojang.serialization.MapCodec;

public abstract class dlv extends dmf {
   private static final ffk a = dmf.b(4.0, 0.0, 10.0);

   protected dlv(eag.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlv> a();

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return a($$1, $$2.e(), ja.b);
   }
}
