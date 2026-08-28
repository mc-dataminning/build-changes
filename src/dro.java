import com.mojang.serialization.MapCodec;

public class dro extends dtc {
   public static final MapCodec<dro> b = b(dro::new);

   @Override
   public MapCodec<dro> a() {
      return b;
   }

   protected dro(dzn.d $$0) {
      super(dtc.b.e, $$0);
   }
}
