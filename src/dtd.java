import com.mojang.serialization.MapCodec;

public class dtd extends djl {
   public static final MapCodec<dtd> a = b(dtd::new);

   @Override
   public MapCodec<dtd> a() {
      return a;
   }

   public dtd(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      faz $$4 = new faz(0.25, 0.05F, 0.25);
      if ($$3 instanceof bvg $$5 && $$5.b(btr.K)) {
         $$4 = new faz(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
