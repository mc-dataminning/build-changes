import com.mojang.serialization.Codec;

public class dtk implements dtr {
   public static final Codec<dtk> a = dja.b.fieldOf("state").xmap(dtk::new, $$0 -> $$0.b).codec();
   public final dja b;

   public dtk(dja $$0) {
      this.b = $$0;
   }
}
