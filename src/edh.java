import com.mojang.serialization.Codec;

public class edh implements edo {
   public static final Codec<edh> a = dsk.b.fieldOf("state").xmap(edh::new, $$0 -> $$0.b).codec();
   public final dsk b;

   public edh(dsk $$0) {
      this.b = $$0;
   }
}
