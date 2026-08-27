import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ciq(he<aov> b, int c, float d) {
   public static final Codec<ciq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aov.b.fieldOf("sound_event").forGetter(ciq::a), aqy.j.fieldOf("use_duration").forGetter(ciq::b), aqy.k.fieldOf("range").forGetter(ciq::c)
            )
            .apply($$0, ciq::new)
   );

   public he<aov> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
