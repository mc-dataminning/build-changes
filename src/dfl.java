import com.mojang.serialization.MapCodec;

public class dfl extends czn {
   public static final MapCodec<dfl> c = b(dfl::new);
   public static final elu e = cvz.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dfl> a() {
      return c;
   }

   public dfl(dio.d $$0) {
      super($$0, ia.a, e, false);
   }

   @Override
   protected czo c() {
      return (czo)cwb.oz;
   }
}
