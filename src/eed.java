import com.mojang.serialization.Codec;

public class eed implements eek {
   public static final Codec<eed> a = dtc.b.fieldOf("state").xmap(eed::new, $$0 -> $$0.b).codec();
   public final dtc b;

   public eed(dtc $$0) {
      this.b = $$0;
   }
}
