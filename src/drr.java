import com.mojang.serialization.MapCodec;

public class drr extends djn {
   public static final MapCodec<drr> a = b(drr::new);
   private static final double b = 5.0;
   private static final fbv c = djn.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<drr> a() {
      return a;
   }

   protected drr(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected float c(dwy $$0, dfo $$1, ji $$2) {
      return 1.0F;
   }
}
