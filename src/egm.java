import com.mojang.serialization.Codec;

public class egm implements egt {
   public static final Codec<egm> a = dvo.a.fieldOf("state").xmap(egm::new, $$0 -> $$0.b).codec();
   public final dvo b;

   public egm(dvo $$0) {
      this.b = $$0;
   }
}
