import com.mojang.serialization.MapCodec;

public class dbk extends cvj {
   public static final MapCodec<dbk> a = b(dbk::new);
   protected static final float b = 6.0F;
   protected static final ekn c = cva.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   protected dbk(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(arg.aK) || $$0.a(cvc.dX) || super.b($$0, $$1, $$2);
   }
}
