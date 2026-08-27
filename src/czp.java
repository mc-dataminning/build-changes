import com.mojang.serialization.MapCodec;

public class czp extends cvz {
   public static final MapCodec<czp> d = b(czp::new);

   @Override
   protected MapCodec<? extends czp> a() {
      return d;
   }

   protected czp(dio.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dip $$0, dip $$1, ia $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
