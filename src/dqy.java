import com.mojang.serialization.MapCodec;

public class dqy extends dne {
   public static final MapCodec<dqy> d = b(dqy::new);

   @Override
   protected MapCodec<? extends dqy> a() {
      return d;
   }

   protected dqy(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(ebg $$0, ebg $$1, jc $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
