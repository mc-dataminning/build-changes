import com.mojang.serialization.Codec;

public class eab implements eai {
   public static final Codec<eab> a = dpi.b.fieldOf("state").xmap(eab::new, $$0 -> $$0.b).codec();
   public final dpi b;

   public eab(dpi $$0) {
      this.b = $$0;
   }
}
