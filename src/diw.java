import com.mojang.serialization.MapCodec;

public class diw extends dfc {
   public static final MapCodec<diw> d = b(diw::new);

   @Override
   protected MapCodec<? extends diw> a() {
      return d;
   }

   protected diw(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, iw $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
