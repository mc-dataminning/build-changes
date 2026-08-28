import com.mojang.serialization.Codec;

public class eiq implements eiy {
   public static final Codec<eiq> a = ekz.a.fieldOf("state_provider").xmap(eiq::new, $$0 -> $$0.b).codec();
   public final ekz b;

   public eiq(ekz $$0) {
      this.b = $$0;
   }
}
