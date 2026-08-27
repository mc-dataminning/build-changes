import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eem implements eek {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egl.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               egl.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eem::new)
   );
   public final egl b;
   public final egl c;
   public final int d;

   public eem(egl $$0, egl $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
