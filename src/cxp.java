import com.mojang.serialization.MapCodec;

public class cxp extends cua {
   public static final MapCodec<cxp> d = b(cxp::new);

   @Override
   protected MapCodec<? extends cxp> a() {
      return d;
   }

   protected cxp(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgb $$0, dgb $$1, hx $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
