import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record end(enj b, float c) {
   public static final Codec<end> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enj.a.fieldOf("above_root_provider").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("above_root_placement_chance").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, end::new)
   );

   public enj a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }
}
