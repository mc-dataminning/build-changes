import com.mojang.serialization.Codec;

public class eli implements elq {
   public static final Codec<eli> a = enr.a.fieldOf("state_provider").xmap(eli::new, $$0 -> $$0.b).codec();
   public final enr b;

   public eli(enr $$0) {
      this.b = $$0;
   }
}
