import com.mojang.serialization.MapCodec;

public class dek extends czp {
   public static final MapCodec<dek> b = b(dek::new);

   protected dek(dio.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dek> a() {
      return b;
   }

   @Override
   public elu c(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.a();
   }

   @Override
   public float d(dip $$0, cse $$1, hv $$2) {
      return 1.0F;
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return true;
   }
}
