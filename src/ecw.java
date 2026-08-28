import com.mojang.serialization.Codec;

public class ecw implements ede {
   public static final Codec<ecw> a = eff.a.fieldOf("state_provider").xmap(ecw::new, $$0 -> $$0.b).codec();
   public final eff b;

   public ecw(eff $$0) {
      this.b = $$0;
   }
}
