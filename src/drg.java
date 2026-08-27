import com.mojang.serialization.Codec;

public class drg implements drn {
   public static final Codec<drg> a = dgw.b.fieldOf("state").xmap(drg::new, $$0 -> $$0.b).codec();
   public final dgw b;

   public drg(dgw $$0) {
      this.b = $$0;
   }
}
