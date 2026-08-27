import com.mojang.serialization.Codec;

public class dvw implements dwd {
   public static final Codec<dvw> a = dlj.b.fieldOf("state").xmap(dvw::new, $$0 -> $$0.b).codec();
   public final dlj b;

   public dvw(dlj $$0) {
      this.b = $$0;
   }
}
