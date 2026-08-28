import com.mojang.serialization.Codec;

public class emh implements emp {
   public static final Codec<emh> a = ebe.a.fieldOf("state").xmap(emh::new, $$0 -> $$0.b).codec();
   public final ebe b;

   public emh(ebe $$0) {
      this.b = $$0;
   }
}
