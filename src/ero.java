import com.mojang.serialization.MapCodec;

public class ero extends erg {
   public static final MapCodec<ero> a = axe.a(mc.f).fieldOf("tag").xmap(ero::new, $$0 -> $$0.b);
   private final axe<djk> b;

   public ero(axe<djk> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwv $$0, azg $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erh<?> a() {
      return erh.d;
   }
}
