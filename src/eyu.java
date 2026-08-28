import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eyu extends eym {
   private static final int c = -1;
   public static final Codec<eyu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, eyu::new)
   );
   public static final eyn<eyu> b = new eyn<>("idcounts", eyu::new, a, bbb.k);
   private int d;

   public eyu() {
      this(-1);
   }

   public eyu(int $$0) {
      this.d = $$0;
   }

   public eyt a() {
      eyt $$0 = new eyt(++this.d);
      this.f();
      return $$0;
   }
}
