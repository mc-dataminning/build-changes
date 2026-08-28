import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ezi extends eza {
   private static final int c = -1;
   public static final Codec<ezi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, ezi::new)
   );
   public static final ezb<ezi> b = new ezb<>("idcounts", ezi::new, a, bbd.k);
   private int d;

   public ezi() {
      this(-1);
   }

   public ezi(int $$0) {
      this.d = $$0;
   }

   public ezh a() {
      ezh $$0 = new ezh(++this.d);
      this.f();
      return $$0;
   }
}
