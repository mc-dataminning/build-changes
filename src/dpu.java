import com.mojang.serialization.Codec;

public class dpu implements dqc {
   public static final Codec<dpu> a = dsd.a.fieldOf("state_provider").xmap(dpu::new, $$0 -> $$0.b).codec();
   public final dsd b;

   public dpu(dsd $$0) {
      this.b = $$0;
   }
}
