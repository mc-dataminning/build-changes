import com.mojang.serialization.MapCodec;

public class cvc extends cyi {
   public static final MapCodec<cvc> a = b(cvc::new);

   @Override
   public MapCodec<cvc> a() {
      return a;
   }

   public cvc(dga.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ht $$4 = $$2.d();
         dgb $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), hx.b)) {
            atb.a($$1, $$2, $$3, js.D);
         }
      }
   }
}
