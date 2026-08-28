import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecz implements ecx {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eey.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eey.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecz::new)
   );
   public final eey b;
   public final eey c;
   public final int d;

   public ecz(eey $$0, eey $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
