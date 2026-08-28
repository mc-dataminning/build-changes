import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enf implements enb {
   public static final Codec<enf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, efn.c).fieldOf("height").forGetter($$0x -> $$0x.b), ebq.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, enf::new)
   );
   public final int b;
   public final ebq c;

   public enf(int $$0, ebq $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
