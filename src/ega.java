import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ega implements efy {
   public static final Codec<ega> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehz.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ehz.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ega::new)
   );
   public final ehz b;
   public final ehz c;
   public final int d;

   public ega(ehz $$0, ehz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
