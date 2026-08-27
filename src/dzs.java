import com.mojang.serialization.Codec;

public class dzs implements dzz {
   public static final Codec<dzs> a = doz.b.fieldOf("state").xmap(dzs::new, $$0 -> $$0.b).codec();
   public final doz b;

   public dzs(doz $$0) {
      this.b = $$0;
   }
}
