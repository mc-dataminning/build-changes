import com.mojang.serialization.MapCodec;

public class dlm extends djw {
   public static final MapCodec<dlm> a = b(dlm::new);
   protected static final float b = 6.0F;
   protected static final fbu c = djm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(awp.co);
   }
}
