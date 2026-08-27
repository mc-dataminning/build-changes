import com.mojang.serialization.Codec;

public class dyn extends dye {
   public static final Codec<dyn> b = dlj.b.fieldOf("state").xmap(dyn::new, $$0 -> $$0.c).codec();
   private final dlj c;

   protected dyn(dlj $$0) {
      this.c = $$0;
   }

   @Override
   protected dyf<?> a() {
      return dyf.a;
   }

   @Override
   public dlj a(awp $$0, hz $$1) {
      return this.c;
   }
}
