import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcu {
   public static final Codec<dcu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(li.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dcu::new)
   );
   private final lg b;
   private final float c;

   public dcu(lg $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lg a() {
      return this.b;
   }

   public boolean a(azf $$0) {
      return $$0.i() <= this.c;
   }
}
