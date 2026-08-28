import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehe implements eha {
   public static final Codec<ehe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dzq.c).fieldOf("height").forGetter($$0x -> $$0x.b), dvv.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ehe::new)
   );
   public final int b;
   public final dvv c;

   public ehe(int $$0, dvv $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
