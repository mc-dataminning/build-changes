import com.mojang.serialization.MapCodec;

public class dmu extends dho {
   public static final MapCodec<dmu> c = b(dmu::new);
   public static final evf e = dea.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dmu> a() {
      return c;
   }

   public dmu(drc.d $$0) {
      super($$0, it.b, e, false);
   }

   @Override
   protected dhp c() {
      return (dhp)dec.oB;
   }
}
