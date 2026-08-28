import com.mojang.serialization.Codec;

public class efm implements efu {
   public static final Codec<efm> a = ehv.a.fieldOf("state_provider").xmap(efm::new, $$0 -> $$0.b).codec();
   public final ehv b;

   public efm(ehv $$0) {
      this.b = $$0;
   }
}
