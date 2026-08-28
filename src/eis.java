import com.mojang.serialization.Codec;

public class eis implements eja {
   public static final Codec<eis> a = elb.a.fieldOf("state_provider").xmap(eis::new, $$0 -> $$0.b).codec();
   public final elb b;

   public eis(elb $$0) {
      this.b = $$0;
   }
}
