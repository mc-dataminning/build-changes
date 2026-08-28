import com.mojang.serialization.Codec;

public class ecx implements ede {
   public static final Codec<ecx> a = dse.b.fieldOf("state").xmap(ecx::new, $$0 -> $$0.b).codec();
   public final dse b;

   public ecx(dse $$0) {
      this.b = $$0;
   }
}
