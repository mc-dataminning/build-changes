import com.mojang.serialization.Codec;

public class ejo implements ejv {
   public static final Codec<ejo> a = dym.a.fieldOf("state").xmap(ejo::new, $$0 -> $$0.b).codec();
   public final dym b;

   public ejo(dym $$0) {
      this.b = $$0;
   }
}
