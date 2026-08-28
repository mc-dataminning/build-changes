import com.mojang.serialization.Codec;

public class ekq implements ekx {
   public static final Codec<ekq> a = dzo.a.fieldOf("state").xmap(ekq::new, $$0 -> $$0.b).codec();
   public final dzo b;

   public ekq(dzo $$0) {
      this.b = $$0;
   }
}
