import com.mojang.serialization.MapCodec;

public class div extends dff {
   public static final MapCodec<div> d = b(div::new);

   @Override
   protected MapCodec<? extends div> a() {
      return d;
   }

   protected div(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsh $$0, dsh $$1, jf $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
