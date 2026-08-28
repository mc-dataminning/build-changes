import com.mojang.serialization.MapCodec;

public class err extends erj {
   public static final MapCodec<err> a = axf.a(mc.f).fieldOf("tag").xmap(err::new, $$0 -> $$0.b);
   private final axf<djn> b;

   public err(axf<djn> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwy $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erk<?> a() {
      return erk.d;
   }
}
