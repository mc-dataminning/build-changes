import com.mojang.serialization.Codec;

public class dxm implements dxu {
   public static final Codec<dxm> a = dzv.a.fieldOf("state_provider").xmap(dxm::new, $$0 -> $$0.b).codec();
   public final dzv b;

   public dxm(dzv $$0) {
      this.b = $$0;
   }
}
