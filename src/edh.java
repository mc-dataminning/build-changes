import com.mojang.serialization.Codec;

public class edh implements edp {
   public static final Codec<edh> a = efq.a.fieldOf("state_provider").xmap(edh::new, $$0 -> $$0.b).codec();
   public final efq b;

   public edh(efq $$0) {
      this.b = $$0;
   }
}
