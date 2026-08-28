import com.mojang.serialization.MapCodec;

public class dnu extends dkd {
   public static final MapCodec<dnu> d = b(dnu::new);

   @Override
   protected MapCodec<? extends dnu> a() {
      return d;
   }

   protected dnu(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxo $$0, dxo $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
