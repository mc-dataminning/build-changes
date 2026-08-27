import com.mojang.serialization.Codec;

public class dvv implements dwd {
   public static final Codec<dvv> a = dye.a.fieldOf("state_provider").xmap(dvv::new, $$0 -> $$0.b).codec();
   public final dye b;

   public dvv(dye $$0) {
      this.b = $$0;
   }
}
