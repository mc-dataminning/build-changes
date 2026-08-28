import com.mojang.serialization.Codec;

public class eik implements eis {
   public static final Codec<eik> a = ekt.a.fieldOf("state_provider").xmap(eik::new, $$0 -> $$0.b).codec();
   public final ekt b;

   public eik(ekt $$0) {
      this.b = $$0;
   }
}
