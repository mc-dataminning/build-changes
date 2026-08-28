import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgb {
   public static final Codec<dgb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lr.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dgb::new)
   );
   private final lp b;
   private final float c;

   public dgb(lp $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lp a() {
      return this.b;
   }

   public boolean a(azs $$0) {
      return $$0.i() <= this.c;
   }
}
