import com.mojang.serialization.Codec;

public class eim implements eit {
   public static final Codec<eim> a = dxo.a.fieldOf("state").xmap(eim::new, $$0 -> $$0.b).codec();
   public final dxo b;

   public eim(dxo $$0) {
      this.b = $$0;
   }
}
