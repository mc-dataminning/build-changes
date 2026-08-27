import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtz implements dtx {
   public static final Codec<dtz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvy.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dvy.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dtz::new)
   );
   public final dvy b;
   public final dvy c;
   public final int d;

   public dtz(dvy $$0, dvy $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
