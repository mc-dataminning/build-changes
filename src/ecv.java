import com.mojang.serialization.Codec;

public class ecv implements edd {
   public static final Codec<ecv> a = efe.a.fieldOf("state_provider").xmap(ecv::new, $$0 -> $$0.b).codec();
   public final efe b;

   public ecv(efe $$0) {
      this.b = $$0;
   }
}
