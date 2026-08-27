import com.mojang.serialization.Codec;

public class ebw implements ecd {
   public static final Codec<ebw> a = drd.b.fieldOf("state").xmap(ebw::new, $$0 -> $$0.b).codec();
   public final drd b;

   public ebw(drd $$0) {
      this.b = $$0;
   }
}
