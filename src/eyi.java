import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eyi extends eya {
   private static final int c = -1;
   public static final Codec<eyi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, eyi::new)
   );
   public static final eyb<eyi> b = new eyb<>("idcounts", eyi::new, a, bbb.k);
   private int d;

   public eyi() {
      this(-1);
   }

   public eyi(int $$0) {
      this.d = $$0;
   }

   public eyh a() {
      eyh $$0 = new eyh(++this.d);
      this.f();
      return $$0;
   }
}
