import com.mojang.serialization.MapCodec;

public class dou extends dit {
   public static final MapCodec<dou> c = b(dou::new);
   public static final ews e = dff.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dou> a() {
      return c;
   }

   public dou(dsg.d $$0) {
      super($$0, jf.a, e, false);
   }

   @Override
   protected diu c() {
      return (diu)dfh.oz;
   }
}
