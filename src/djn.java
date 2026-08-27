import com.mojang.serialization.MapCodec;

public class djn extends ddp {
   public static final MapCodec<djn> c = b(djn::new);
   protected static final eqk g = daa.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<djn> a() {
      return c;
   }

   public djn(dmy.d $$0) {
      super($$0, ih.a, g, false, 0.1);
   }

   @Override
   protected int a(axd $$0) {
      return dff.a($$0);
   }

   @Override
   protected daa b() {
      return dac.oA;
   }

   @Override
   protected boolean g(dmz $$0) {
      return dff.a($$0);
   }
}
