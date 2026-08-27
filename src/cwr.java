import com.mojang.serialization.MapCodec;

public class cwr extends cvc {
   public static final MapCodec<cwr> a = b(cwr::new);
   protected static final float b = 6.0F;
   protected static final ekb c = cut.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cwr> a() {
      return a;
   }

   protected cwr(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(arc.cd);
   }
}
