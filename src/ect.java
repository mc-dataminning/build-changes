import com.mojang.serialization.Codec;

public class ect implements edb {
   public static final Codec<ect> a = efc.a.fieldOf("state_provider").xmap(ect::new, $$0 -> $$0.b).codec();
   public final efc b;

   public ect(efc $$0) {
      this.b = $$0;
   }
}
