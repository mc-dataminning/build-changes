import com.mojang.serialization.MapCodec;

public class drt extends dlr {
   public static final MapCodec<drt> c = b(drt::new);
   public static final fah e = die.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<drt> a() {
      return c;
   }

   public drt(dvi.d $$0) {
      super($$0, jm.a, e, false);
   }

   @Override
   protected dls c() {
      return (dls)dig.oz;
   }
}
