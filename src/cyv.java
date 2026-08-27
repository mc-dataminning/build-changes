import com.mojang.serialization.MapCodec;

public class cyv extends cvf {
   public static final MapCodec<cyv> d = b(cyv::new);

   @Override
   protected MapCodec<? extends cyv> a() {
      return d;
   }

   protected cyv(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhn $$0, dhn $$1, ib $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
