import com.mojang.serialization.Codec;

public class ecq implements ecx {
   public static final Codec<ecq> a = drx.b.fieldOf("state").xmap(ecq::new, $$0 -> $$0.b).codec();
   public final drx b;

   public ecq(drx $$0) {
      this.b = $$0;
   }
}
