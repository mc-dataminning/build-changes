import com.mojang.serialization.MapCodec;

public class drq extends djm {
   public static final MapCodec<drq> a = b(drq::new);
   private static final double b = 5.0;
   private static final fbu c = djm.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   protected drq(dww.d $$0) {
      super($$0);
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.a;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected float c(dwx $$0, dfn $$1, ji $$2) {
      return 1.0F;
   }
}
