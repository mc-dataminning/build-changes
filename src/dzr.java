import com.mojang.serialization.Codec;

public class dzr implements dzz {
   public static final Codec<dzr> a = eca.a.fieldOf("state_provider").xmap(dzr::new, $$0 -> $$0.b).codec();
   public final eca b;

   public dzr(eca $$0) {
      this.b = $$0;
   }
}
