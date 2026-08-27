import com.mojang.serialization.MapCodec;

public class czx extends cvc {
   public static final MapCodec<czx> a = b(czx::new);
   protected static final ekb b = cut.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czx(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(arc.aK) || $$0.a(cuv.dX) || super.d($$0, $$1, $$2);
   }
}
