import com.mojang.serialization.Codec;

public class eea implements eei {
   public static final Codec<eea> a = egj.a.fieldOf("state_provider").xmap(eea::new, $$0 -> $$0.b).codec();
   public final egj b;

   public eea(egj $$0) {
      this.b = $$0;
   }
}
