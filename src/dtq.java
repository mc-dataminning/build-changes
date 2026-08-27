import com.mojang.serialization.Codec;

public class dtq implements dty {
   public static final Codec<dtq> a = dvz.a.fieldOf("state_provider").xmap(dtq::new, $$0 -> $$0.b).codec();
   public final dvz b;

   public dtq(dvz $$0) {
      this.b = $$0;
   }
}
