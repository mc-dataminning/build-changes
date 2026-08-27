import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqg implements dqc {
   public static final Codec<dqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, diu.c).fieldOf("height").forGetter($$0x -> $$0x.b), dfl.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dqg::new)
   );
   public final int b;
   public final dfl c;

   public dqg(int $$0, dfl $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
