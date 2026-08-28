import com.mojang.serialization.Codec;

public class edg implements edo {
   public static final Codec<edg> a = efp.a.fieldOf("state_provider").xmap(edg::new, $$0 -> $$0.b).codec();
   public final efp b;

   public edg(efp $$0) {
      this.b = $$0;
   }
}
