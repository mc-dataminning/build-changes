import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ezk extends ezc {
   private static final int c = -1;
   public static final Codec<ezk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, ezk::new)
   );
   public static final ezd<ezk> b = new ezd<>("idcounts", ezk::new, a, bbf.k);
   private int d;

   public ezk() {
      this(-1);
   }

   public ezk(int $$0) {
      this.d = $$0;
   }

   public ezj a() {
      ezj $$0 = new ezj(++this.d);
      this.f();
      return $$0;
   }
}
