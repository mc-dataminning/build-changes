import com.mojang.serialization.Codec;

public class dvp implements dvw {
   public static final Codec<dvp> a = dlf.b.fieldOf("state").xmap(dvp::new, $$0 -> $$0.b).codec();
   public final dlf b;

   public dvp(dlf $$0) {
      this.b = $$0;
   }
}
