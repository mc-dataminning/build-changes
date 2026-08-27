import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbb {
   public static final Codec<dbb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kx.aX.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dbb::new)
   );
   private final kv b;
   private final float c;

   public dbb(kv $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public kv a() {
      return this.b;
   }

   public boolean a(ayg $$0) {
      return $$0.i() <= this.c;
   }
}
