import com.mojang.serialization.Codec;

public class dxp implements dxw {
   public static final Codec<dxp> a = dnb.b.fieldOf("state").xmap(dxp::new, $$0 -> $$0.b).codec();
   public final dnb b;

   public dxp(dnb $$0) {
      this.b = $$0;
   }
}
