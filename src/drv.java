import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drv(dsb b, float c) {
   public static final Codec<drv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.a.fieldOf("above_root_provider").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("above_root_placement_chance").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, drv::new)
   );

   public dsb a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }
}
