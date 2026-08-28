import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egv implements egt {
   public static final Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiu.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eiu.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egv::new)
   );
   public final eiu b;
   public final eiu c;
   public final int d;

   public egv(eiu $$0, eiu $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
