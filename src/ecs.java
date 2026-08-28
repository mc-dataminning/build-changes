import com.mojang.serialization.Codec;

public class ecs implements eda {
   public static final Codec<ecs> a = efb.a.fieldOf("state_provider").xmap(ecs::new, $$0 -> $$0.b).codec();
   public final efb b;

   public ecs(efb $$0) {
      this.b = $$0;
   }
}
