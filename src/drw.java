import com.mojang.serialization.Codec;

public class drw implements dse {
   public static final Codec<drw> a = duf.a.fieldOf("state_provider").xmap(drw::new, $$0 -> $$0.b).codec();
   public final duf b;

   public drw(duf $$0) {
      this.b = $$0;
   }
}
