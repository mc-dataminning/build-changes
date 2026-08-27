import com.mojang.serialization.Codec;

public class dtq implements dtx {
   public static final Codec<dtq> a = djg.b.fieldOf("state").xmap(dtq::new, $$0 -> $$0.b).codec();
   public final djg b;

   public dtq(djg $$0) {
      this.b = $$0;
   }
}
