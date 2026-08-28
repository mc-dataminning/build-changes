import com.mojang.serialization.MapCodec;

public class dej extends dfq implements dfk {
   public static final MapCodec<dej> a = b(dej::new);
   private static final ewy b = ewv.a(dfh.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dfh.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dej> a() {
      return a;
   }

   protected dej(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(dfj.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      drz.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
