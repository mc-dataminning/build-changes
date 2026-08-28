import com.mojang.serialization.MapCodec;

public class dvz extends dvr {
   public static final MapCodec<dvz> a = b(dvz::new);
   private static final ffk b = dmf.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dvz> a() {
      return a;
   }

   protected dvz(eag.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arq && $$3 instanceof ctn) {
         $$1.a(new iu($$2), true, $$3);
      }
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      ewo $$3 = $$1.b_($$2);
      ewo $$4 = $$1.b_($$2.d());
      return ($$3.a() == ewp.c || $$0.b() instanceof dqi) && $$4.a() == ewp.a;
   }
}
