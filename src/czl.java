import com.mojang.serialization.MapCodec;

public class czl extends ctl {
   public static final MapCodec<czl> a = b(czl::new);
   protected static final float b = 6.0F;
   protected static final eia c = ctc.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   protected czl(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(apv.aK) || $$0.a(cte.dX) || super.d($$0, $$1, $$2);
   }
}
