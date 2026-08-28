import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emv implements emr {
   public static final Codec<emv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, efd.c).fieldOf("height").forGetter($$0x -> $$0x.b), ebg.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, emv::new)
   );
   public final int b;
   public final ebg c;

   public emv(int $$0, ebg $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
