import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ezu extends ezm {
   private static final int c = -1;
   public static final Codec<ezu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, ezu::new)
   );
   public static final ezn<ezu> b = new ezn<>("idcounts", ezu::new, a, bbo.k);
   private int d;

   public ezu() {
      this(-1);
   }

   public ezu(int $$0) {
      this.d = $$0;
   }

   public ezt a() {
      ezt $$0 = new ezt(++this.d);
      this.f();
      return $$0;
   }
}
