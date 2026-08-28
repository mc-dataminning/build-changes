import com.mojang.serialization.Codec;

public class ekp implements ekx {
   public static final Codec<ekp> a = emy.a.fieldOf("state_provider").xmap(ekp::new, $$0 -> $$0.b).codec();
   public final emy b;

   public ekp(emy $$0) {
      this.b = $$0;
   }
}
