import com.mojang.serialization.MapCodec;

public class cwz extends cvj {
   public static final MapCodec<cwz> a = b(cwz::new);
   protected static final float b = 6.0F;
   protected static final ekn c = cva.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cwz> a() {
      return a;
   }

   protected cwz(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(arg.cd);
   }
}
