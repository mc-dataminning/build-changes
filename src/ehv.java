import com.mojang.serialization.Codec;

public class ehv implements eid {
   public static final Codec<ehv> a = eke.a.fieldOf("state_provider").xmap(ehv::new, $$0 -> $$0.b).codec();
   public final eke b;

   public ehv(eke $$0) {
      this.b = $$0;
   }
}
