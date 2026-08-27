import com.mojang.serialization.Codec;

public class drr implements drz {
   public static final Codec<drr> a = dua.a.fieldOf("state_provider").xmap(drr::new, $$0 -> $$0.b).codec();
   public final dua b;

   public drr(dua $$0) {
      this.b = $$0;
   }
}
