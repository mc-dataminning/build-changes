import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcy {
   public static final Codec<dcy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(li.bf.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dcy::new)
   );
   private final lg b;
   private final float c;

   public dcy(lg $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lg a() {
      return this.b;
   }

   public boolean a(azh $$0) {
      return $$0.i() <= this.c;
   }
}
