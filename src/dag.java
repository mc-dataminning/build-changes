import com.mojang.serialization.MapCodec;

public class dag extends cwq {
   public static final MapCodec<dag> d = b(dag::new);

   @Override
   protected MapCodec<? extends dag> a() {
      return d;
   }

   protected dag(djg.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djh $$0, djh $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
