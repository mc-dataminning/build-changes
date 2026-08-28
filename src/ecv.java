import com.mojang.serialization.Codec;

public class ecv implements edc {
   public static final Codec<ecv> a = dsc.b.fieldOf("state").xmap(ecv::new, $$0 -> $$0.b).codec();
   public final dsc b;

   public ecv(dsc $$0) {
      this.b = $$0;
   }
}
