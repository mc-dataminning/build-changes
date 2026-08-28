import com.mojang.serialization.MapCodec;

public class drc extends dlx {
   public static final MapCodec<drc> c = b(drc::new);
   public static final fal g = dij.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<drc> a() {
      return c;
   }

   public drc(dvn.d $$0) {
      super($$0, jm.b, g, false, 0.1);
   }

   @Override
   protected int a(azv $$0) {
      return dno.a($$0);
   }

   @Override
   protected dij b() {
      return dil.oC;
   }

   @Override
   protected boolean h(dvo $$0) {
      return dno.a($$0);
   }
}
