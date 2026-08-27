import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpu implements dpq {
   public static final Codec<dpu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dii.c).fieldOf("height").forGetter($$0x -> $$0x.b), dez.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dpu::new)
   );
   public final int b;
   public final dez c;

   public dpu(int $$0, dez $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
