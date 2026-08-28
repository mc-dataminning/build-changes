import com.mojang.serialization.Codec;

public class eey implements efg {
   public static final Codec<eey> a = ehh.a.fieldOf("state_provider").xmap(eey::new, $$0 -> $$0.b).codec();
   public final ehh b;

   public eey(ehh $$0) {
      this.b = $$0;
   }
}
