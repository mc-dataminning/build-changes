import com.mojang.serialization.Codec;

public class eda implements edi {
   public static final Codec<eda> a = efj.a.fieldOf("state_provider").xmap(eda::new, $$0 -> $$0.b).codec();
   public final efj b;

   public eda(efj $$0) {
      this.b = $$0;
   }
}
