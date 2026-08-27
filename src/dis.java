import com.mojang.serialization.MapCodec;

public class dis extends ddp {
   public static final MapCodec<dis> c = b(dis::new);
   public static final eqk g = daa.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dis> a() {
      return c;
   }

   public dis(dmy.d $$0) {
      super($$0, ih.b, g, false, 0.1);
   }

   @Override
   protected int a(axd $$0) {
      return dff.a($$0);
   }

   @Override
   protected daa b() {
      return dac.oC;
   }

   @Override
   protected boolean g(dmz $$0) {
      return dff.a($$0);
   }
}
