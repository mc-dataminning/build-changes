import com.mojang.serialization.MapCodec;

public class dkq extends dfn {
   public static final MapCodec<dkq> c = b(dkq::new);
   public static final est g = dby.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dkq> a() {
      return c;
   }

   public dkq(doy.d $$0) {
      super($$0, ih.b, g, false, 0.1);
   }

   @Override
   protected int a(axr $$0) {
      return dhd.a($$0);
   }

   @Override
   protected dby b() {
      return dca.oC;
   }

   @Override
   protected boolean g(doz $$0) {
      return dhd.a($$0);
   }
}
