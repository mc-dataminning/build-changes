import com.mojang.serialization.Codec;

public class dxo implements dxw {
   public static final Codec<dxo> a = dzx.a.fieldOf("state_provider").xmap(dxo::new, $$0 -> $$0.b).codec();
   public final dzx b;

   public dxo(dzx $$0) {
      this.b = $$0;
   }
}
