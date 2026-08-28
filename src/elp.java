import com.mojang.serialization.Codec;

public class elp implements elx {
   public static final Codec<elp> a = eny.a.fieldOf("state_provider").xmap(elp::new, $$0 -> $$0.b).codec();
   public final eny b;

   public elp(eny $$0) {
      this.b = $$0;
   }
}
