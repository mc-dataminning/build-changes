import com.mojang.serialization.MapCodec;

public class dok extends div {
   public static final MapCodec<dok> c = b(dok::new);
   public static final exn g = dfc.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dok> a() {
      return c;
   }

   public dok(dtb.d $$0) {
      super($$0, iw.b, g, false, 0.1);
   }

   @Override
   protected int a(ayt $$0) {
      return dkn.a($$0);
   }

   @Override
   protected dfc b() {
      return dfe.pC;
   }

   @Override
   protected boolean g(dtc $$0) {
      return dkn.a($$0);
   }
}
