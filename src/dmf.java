import com.mojang.serialization.MapCodec;

public class dmf extends diq {
   public static final MapCodec<dmf> d = b(dmf::new);

   @Override
   protected MapCodec<? extends dmf> a() {
      return d;
   }

   protected dmf(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvv $$0, dvv $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
