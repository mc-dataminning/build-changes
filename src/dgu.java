import com.mojang.serialization.MapCodec;

public class dgu extends dde {
   public static final MapCodec<dgu> d = b(dgu::new);

   @Override
   protected MapCodec<? extends dgu> a() {
      return d;
   }

   protected dgu(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dqh $$0, dqh $$1, is $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
