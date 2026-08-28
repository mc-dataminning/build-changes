import com.mojang.serialization.MapCodec;

public class dqy extends dlr {
   public static final MapCodec<dqy> c = b(dqy::new);
   public static final fah e = die.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dqy> a() {
      return c;
   }

   public dqy(dvi.d $$0) {
      super($$0, jm.b, e, false);
   }

   @Override
   protected dls c() {
      return (dls)dig.oB;
   }
}
