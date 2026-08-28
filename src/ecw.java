import com.mojang.serialization.Codec;

public class ecw implements edd {
   public static final Codec<ecw> a = dsd.b.fieldOf("state").xmap(ecw::new, $$0 -> $$0.b).codec();
   public final dsd b;

   public ecw(dsd $$0) {
      this.b = $$0;
   }
}
