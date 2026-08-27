import com.mojang.serialization.MapCodec;

public class ddc extends dej implements ded {
   public static final MapCodec<ddc> a = b(ddc::new);
   private static final evf b = evc.a(dea.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dea.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   protected ddc(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(dec.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      dqs.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
