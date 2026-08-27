import com.mojang.serialization.Codec;

public class dtj implements dtr {
   public static final Codec<dtj> a = dvs.a.fieldOf("state_provider").xmap(dtj::new, $$0 -> $$0.b).codec();
   public final dvs b;

   public dtj(dvs $$0) {
      this.b = $$0;
   }
}
