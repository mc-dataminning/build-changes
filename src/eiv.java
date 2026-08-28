import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiv implements eia {
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               esx.a.fieldOf("state").forGetter($$0x -> $$0x.b),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter($$0x -> $$0x.e),
               kg.a(mc.f).fieldOf("valid_blocks").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eiv::new)
   );
   public final esx b;
   public final boolean c;
   public final int d;
   public final int e;
   public final jv<djk> f;

   public eiv(esx $$0, boolean $$1, int $$2, int $$3, jv<djk> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }
}
