import com.mojang.serialization.MapCodec;

public class cyj extends cut {
   public static final MapCodec<cyj> d = b(cyj::new);

   @Override
   protected MapCodec<? extends cyj> a() {
      return d;
   }

   protected cyj(dgv.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgw $$0, dgw $$1, hx $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
