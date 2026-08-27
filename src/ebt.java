import com.mojang.serialization.Codec;

public class ebt implements ecb {
   public static final Codec<ebt> a = eec.a.fieldOf("state_provider").xmap(ebt::new, $$0 -> $$0.b).codec();
   public final eec b;

   public ebt(eec $$0) {
      this.b = $$0;
   }
}
