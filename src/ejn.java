import com.mojang.serialization.Codec;

public class ejn implements ejv {
   public static final Codec<ejn> a = elw.a.fieldOf("state_provider").xmap(ejn::new, $$0 -> $$0.b).codec();
   public final elw b;

   public ejn(elw $$0) {
      this.b = $$0;
   }
}
