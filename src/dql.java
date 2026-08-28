import com.mojang.serialization.MapCodec;

public class dql extends dmr {
   public static final MapCodec<dql> d = b(dql::new);

   @Override
   protected MapCodec<? extends dql> a() {
      return d;
   }

   protected dql(eas.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eat $$0, eat $$1, jb $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
