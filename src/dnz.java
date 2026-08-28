import com.mojang.serialization.MapCodec;

public class dnz extends dit {
   public static final MapCodec<dnz> c = b(dnz::new);
   public static final ews e = dff.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dnz> a() {
      return c;
   }

   public dnz(dsg.d $$0) {
      super($$0, jf.b, e, false);
   }

   @Override
   protected diu c() {
      return (diu)dfh.oB;
   }
}
