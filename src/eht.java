import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eht(ehz b, float c) {
   public static final Codec<eht> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehz.a.fieldOf("above_root_provider").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("above_root_placement_chance").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eht::new)
   );

   public ehz a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }
}
