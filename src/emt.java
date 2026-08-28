import com.mojang.serialization.Codec;

public class emt implements enb {
   public static final Codec<emt> a = ebq.a.fieldOf("state").xmap(emt::new, $$0 -> $$0.b).codec();
   public final ebq b;

   public emt(ebq $$0) {
      this.b = $$0;
   }
}
