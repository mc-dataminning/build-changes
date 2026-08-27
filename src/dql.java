import com.mojang.serialization.Codec;

public class dql implements dqs {
   public static final Codec<dql> a = dgb.b.fieldOf("state").xmap(dql::new, $$0 -> $$0.b).codec();
   public final dgb b;

   public dql(dgb $$0) {
      this.b = $$0;
   }
}
