import com.mojang.serialization.MapCodec;

public class eiz extends eiq {
   public static final MapCodec<eiz> b = dvj.a.fieldOf("state").xmap(eiz::new, $$0 -> $$0.c);
   private final dvj c;

   protected eiz(dvj $$0) {
      this.c = $$0;
   }

   @Override
   protected eir<?> a() {
      return eir.a;
   }

   @Override
   public dvj a(azs $$0, jh $$1) {
      return this.c;
   }
}
