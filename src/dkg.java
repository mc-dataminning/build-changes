import com.mojang.serialization.MapCodec;

public class dkg extends dlj {
   public static final MapCodec<dkg> a = b(dkg::new);
   private static final fbv[] b = new fbv[]{
      djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected dgi d() {
      return cwu.ve;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b[this.h($$0)];
   }
}
