import com.mojang.serialization.MapCodec;

public class drr extends die {
   public static final MapCodec<drr> a = b(drr::new);

   @Override
   public MapCodec<drr> a() {
      return a;
   }

   public drr(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      ezn $$4 = new ezn(0.25, 0.05F, 0.25);
      if ($$3 instanceof bva $$5 && $$5.b(btl.K)) {
         $$4 = new ezn(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
