import com.mojang.serialization.Codec;

public class eil implements eis {
   public static final Codec<eil> a = dxn.a.fieldOf("state").xmap(eil::new, $$0 -> $$0.b).codec();
   public final dxn b;

   public eil(dxn $$0) {
      this.b = $$0;
   }
}
