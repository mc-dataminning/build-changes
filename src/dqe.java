import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe implements dqa {
   public static final Codec<dqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dis.c).fieldOf("height").forGetter($$0x -> $$0x.b), dfj.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dqe::new)
   );
   public final int b;
   public final dfj c;

   public dqe(int $$0, dfj $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
