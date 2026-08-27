import com.mojang.serialization.Codec;

public class eba implements ebh {
   public static final Codec<eba> a = dqh.b.fieldOf("state").xmap(eba::new, $$0 -> $$0.b).codec();
   public final dqh b;

   public eba(dqh $$0) {
      this.b = $$0;
   }
}
