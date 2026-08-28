import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dll {
   public static final Codec<dll> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lz.bk.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dll::new)
   );
   private final lx b;
   private final float c;

   public dll(lx $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public lx a() {
      return this.b;
   }

   public boolean a(bai $$0) {
      return $$0.i() <= this.c;
   }
}
