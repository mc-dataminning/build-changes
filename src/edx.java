import com.mojang.serialization.Codec;

public class edx implements eee {
   public static final Codec<edx> a = dta.b.fieldOf("state").xmap(edx::new, $$0 -> $$0.b).codec();
   public final dta b;

   public edx(dta $$0) {
      this.b = $$0;
   }
}
