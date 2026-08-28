import com.mojang.serialization.Codec;

public class ehs implements eia {
   public static final Codec<ehs> a = ekb.a.fieldOf("state_provider").xmap(ehs::new, $$0 -> $$0.b).codec();
   public final ekb b;

   public ehs(ekb $$0) {
      this.b = $$0;
   }
}
