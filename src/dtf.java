import com.mojang.serialization.MapCodec;

public class dtf extends djn {
   public static final MapCodec<dtf> a = b(dtf::new);

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   public dtf(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      fbb $$4 = new fbb(0.25, 0.05F, 0.25);
      if ($$3 instanceof bvi $$5 && $$5.b(btt.K)) {
         $$4 = new fbb(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
