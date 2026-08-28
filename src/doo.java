import com.mojang.serialization.MapCodec;

public class doo extends dfb {
   public static final MapCodec<doo> a = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      evt $$4 = new evt(0.25, 0.05F, 0.25);
      if ($$3 instanceof btr $$5 && $$5.b(bsg.K)) {
         $$4 = new evt(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
