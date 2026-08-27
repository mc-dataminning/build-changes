import com.mojang.serialization.Codec;

public class eaa implements eai {
   public static final Codec<eaa> a = ecj.a.fieldOf("state_provider").xmap(eaa::new, $$0 -> $$0.b).codec();
   public final ecj b;

   public eaa(ecj $$0) {
      this.b = $$0;
   }
}
