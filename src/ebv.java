import com.mojang.serialization.Codec;

public class ebv implements ecd {
   public static final Codec<ebv> a = eee.a.fieldOf("state_provider").xmap(ebv::new, $$0 -> $$0.b).codec();
   public final eee b;

   public ebv(eee $$0) {
      this.b = $$0;
   }
}
