import com.mojang.serialization.Codec;

public class egi implements egp {
   public static final Codec<egi> a = dvj.a.fieldOf("state").xmap(egi::new, $$0 -> $$0.b).codec();
   public final dvj b;

   public egi(dvj $$0) {
      this.b = $$0;
   }
}
