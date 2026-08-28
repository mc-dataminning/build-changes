import com.mojang.serialization.MapCodec;

public class dnh extends dhe {
   public static final MapCodec<dnh> a = b(dnh::new);
   protected static final float b = 6.0F;
   protected static final eyx c = dgv.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   protected dnh(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(aws.aM) || $$0.a(dgx.dX) || super.b($$0, $$1, $$2);
   }
}
