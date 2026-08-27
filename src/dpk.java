import com.mojang.serialization.Codec;

public class dpk implements dpr {
   public static final Codec<dpk> a = dfa.b.fieldOf("state").xmap(dpk::new, $$0 -> $$0.b).codec();
   public final dfa b;

   public dpk(dfa $$0) {
      this.b = $$0;
   }
}
