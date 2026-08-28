import com.mojang.serialization.Codec;

public class eit implements eja {
   public static final Codec<eit> a = dxv.a.fieldOf("state").xmap(eit::new, $$0 -> $$0.b).codec();
   public final dxv b;

   public eit(dxv $$0) {
      this.b = $$0;
   }
}
