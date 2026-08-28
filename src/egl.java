import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egl implements egj {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eik.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               eik.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egl::new)
   );
   public final eik b;
   public final eik c;
   public final int d;

   public egl(eik $$0, eik $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
