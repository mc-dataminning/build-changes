import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drp implements drn {
   public static final Codec<drp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dto.a.fieldOf("cap_provider").forGetter($$0x -> $$0x.b),
               dto.a.fieldOf("stem_provider").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter($$0x -> $$0x.d)
            )
            .apply($$0, drp::new)
   );
   public final dto b;
   public final dto c;
   public final int d;

   public drp(dto $$0, dto $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }
}
