import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eyp extends eyh {
   private static final int c = -1;
   public static final Codec<eyp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, eyp::new)
   );
   public static final eyi<eyp> b = new eyi<>("idcounts", eyp::new, a, bbb.k);
   private int d;

   public eyp() {
      this(-1);
   }

   public eyp(int $$0) {
      this.d = $$0;
   }

   public eyo a() {
      eyo $$0 = new eyo(++this.d);
      this.f();
      return $$0;
   }
}
