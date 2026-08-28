import com.mojang.serialization.MapCodec;

public class eml extends emd {
   public static final MapCodec<eml> a = axe.a(lq.f).fieldOf("tag").xmap(eml::new, $$0 -> $$0.b);
   private final axe<dey> b;

   public eml(axe<dey> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsb $$0, azg $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eme<?> a() {
      return eme.d;
   }
}
