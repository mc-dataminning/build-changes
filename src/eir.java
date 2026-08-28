import com.mojang.serialization.Codec;

public class eir implements eiz {
   public static final Codec<eir> a = ela.a.fieldOf("state_provider").xmap(eir::new, $$0 -> $$0.b).codec();
   public final ela b;

   public eir(ela $$0) {
      this.b = $$0;
   }
}
