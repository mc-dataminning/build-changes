import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elu implements elq {
   public static final Codec<elu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, eee.c).fieldOf("height").forGetter($$0x -> $$0x.b), eah.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, elu::new)
   );
   public final int b;
   public final eah c;

   public elu(int $$0, eah $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
