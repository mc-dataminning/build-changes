import com.mojang.serialization.Codec;

public class eis implements eiz {
   public static final Codec<eis> a = dxu.a.fieldOf("state").xmap(eis::new, $$0 -> $$0.b).codec();
   public final dxu b;

   public eis(dxu $$0) {
      this.b = $$0;
   }
}
