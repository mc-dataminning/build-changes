import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiu implements eis {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekt.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               ekt.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eiu::new)
   );
   public final ekt b;
   public final ekt c;
   public final int d;

   public eiu(ekt $$0, ekt $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
