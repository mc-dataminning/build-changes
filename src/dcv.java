import com.mojang.serialization.MapCodec;

public class dcv extends czf {
   public static final MapCodec<dcv> d = b(dcv::new);

   @Override
   protected MapCodec<? extends dcv> a() {
      return d;
   }

   protected dcv(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dme $$0, dme $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
