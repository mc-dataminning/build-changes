import com.mojang.serialization.Codec;

public class eaq implements eay {
   public static final Codec<eaq> a = ecz.a.fieldOf("state_provider").xmap(eaq::new, $$0 -> $$0.b).codec();
   public final ecz b;

   public eaq(ecz $$0) {
      this.b = $$0;
   }
}
