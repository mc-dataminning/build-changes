import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eba implements eay {
   public static final Codec<eba> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ecz.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eba::new)
   );
   public final ecz b;
   public final ecz c;
   public final int d;

   public eba(ecz $$0, ecz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
