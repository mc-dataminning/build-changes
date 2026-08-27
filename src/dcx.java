import com.mojang.serialization.MapCodec;

public class dcx extends cvc implements cuw {
   public static final MapCodec<dcx> a = b(dcx::new);
   protected static final float b = 6.0F;
   protected static final ekb c = cut.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   protected dcx(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return true;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      cxa $$4 = (cxa)($$3.a(cuv.bu) ? cuv.iI : cuv.iH);
      if ($$4.o().a($$0, $$2) && $$0.t($$2.c())) {
         cxa.a($$0, $$4.o(), $$2, 2);
      }
   }
}
