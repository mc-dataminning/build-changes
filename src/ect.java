import com.mojang.serialization.Codec;

public class ect implements eda {
   public static final Codec<ect> a = dsa.b.fieldOf("state").xmap(ect::new, $$0 -> $$0.b).codec();
   public final dsa b;

   public ect(dsa $$0) {
      this.b = $$0;
   }
}
