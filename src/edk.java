import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edk implements edi {
   public static final Codec<edk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efj.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               efj.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edk::new)
   );
   public final efj b;
   public final efj c;
   public final int d;

   public edk(efj $$0, efj $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
