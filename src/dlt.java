import com.mojang.serialization.MapCodec;

public class dlt extends die {
   public static final MapCodec<dlt> d = b(dlt::new);

   @Override
   protected MapCodec<? extends dlt> a() {
      return d;
   }

   protected dlt(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvj $$0, dvj $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
