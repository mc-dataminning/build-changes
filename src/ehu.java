import com.mojang.serialization.Codec;

public class ehu implements eic {
   public static final Codec<ehu> a = ekd.a.fieldOf("state_provider").xmap(ehu::new, $$0 -> $$0.b).codec();
   public final ekd b;

   public ehu(ekd $$0) {
      this.b = $$0;
   }
}
