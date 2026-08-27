import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxy implements dxw {
   public static final Codec<dxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzx.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dzx.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dxy::new)
   );
   public final dzx b;
   public final dzx c;
   public final int d;

   public dxy(dzx $$0, dzx $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
