import com.mojang.serialization.Codec;

public class ebu implements ecb {
   public static final Codec<ebu> a = drb.b.fieldOf("state").xmap(ebu::new, $$0 -> $$0.b).codec();
   public final drb b;

   public ebu(drb $$0) {
      this.b = $$0;
   }
}
