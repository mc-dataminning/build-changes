import com.mojang.serialization.MapCodec;

public class dwj extends dmf {
   public static final MapCodec<dwj> a = b(dwj::new);

   @Override
   public MapCodec<dwj> a() {
      return a;
   }

   public dwj(eag.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      feq $$4 = new feq(0.25, 0.05F, 0.25);
      if ($$3 instanceof bxe $$5 && $$5.b(bvl.K)) {
         $$4 = new feq(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
