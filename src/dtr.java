import com.mojang.serialization.Codec;

public class dtr implements dty {
   public static final Codec<dtr> a = djh.b.fieldOf("state").xmap(dtr::new, $$0 -> $$0.b).codec();
   public final djh b;

   public dtr(djh $$0) {
      this.b = $$0;
   }
}
