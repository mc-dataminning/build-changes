import com.mojang.serialization.Codec;

public class emg implements emp {
   public static final Codec<emg> a = eoq.a.fieldOf("state_provider").xmap(emg::new, $$0 -> $$0.b).codec();
   public final eoq b;

   public emg(eoq $$0) {
      this.b = $$0;
   }
}
