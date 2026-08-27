import com.mojang.serialization.Codec;

public class dvo implements dvw {
   public static final Codec<dvo> a = dxx.a.fieldOf("state_provider").xmap(dvo::new, $$0 -> $$0.b).codec();
   public final dxx b;

   public dvo(dxx $$0) {
      this.b = $$0;
   }
}
