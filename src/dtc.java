import com.mojang.serialization.MapCodec;

public class dtc extends djk {
   public static final MapCodec<dtc> a = b(dtc::new);

   @Override
   public MapCodec<dtc> a() {
      return a;
   }

   public dtc(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      fay $$4 = new fay(0.25, 0.05F, 0.25);
      if ($$3 instanceof bvf $$5 && $$5.b(btq.K)) {
         $$4 = new fay(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
