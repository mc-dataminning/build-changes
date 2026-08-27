import com.mojang.serialization.Codec;

public class drx implements dse {
   public static final Codec<drx> a = dhn.b.fieldOf("state").xmap(drx::new, $$0 -> $$0.b).codec();
   public final dhn b;

   public drx(dhn $$0) {
      this.b = $$0;
   }
}
