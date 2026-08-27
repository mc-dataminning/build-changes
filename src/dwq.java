import com.mojang.serialization.Codec;

public class dwq implements dwy {
   public static final Codec<dwq> a = dyz.a.fieldOf("state_provider").xmap(dwq::new, $$0 -> $$0.b).codec();
   public final dyz b;

   public dwq(dyz $$0) {
      this.b = $$0;
   }
}
