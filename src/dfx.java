import com.mojang.serialization.MapCodec;

public class dfx extends dch {
   public static final MapCodec<dfx> d = b(dfx::new);

   @Override
   protected MapCodec<? extends dfx> a() {
      return d;
   }

   protected dfx(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpi $$0, dpi $$1, ij $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
