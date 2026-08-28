import com.mojang.serialization.Codec;

public class egh implements egp {
   public static final Codec<egh> a = eiq.a.fieldOf("state_provider").xmap(egh::new, $$0 -> $$0.b).codec();
   public final eiq b;

   public egh(eiq $$0) {
      this.b = $$0;
   }
}
