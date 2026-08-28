import com.mojang.serialization.MapCodec;

public class dmy extends dmf {
   public static final MapCodec<dmy> a = b(dmy::new);
   private static final ffk b = dmf.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dmy> a() {
      return a;
   }

   public dmy(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return !$$1.v($$2.e());
   }
}
