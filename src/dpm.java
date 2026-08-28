import com.mojang.serialization.MapCodec;

public class dpm extends dfy {
   public static final MapCodec<dpm> a = b(dpm::new);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      exa $$4 = new exa(0.25, 0.05F, 0.25);
      if ($$3 instanceof btn $$5 && $$5.b(bsb.K)) {
         $$4 = new exa(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
