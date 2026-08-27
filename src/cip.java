import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cip(he<aov> b, int c, float d) {
   public static final Codec<cip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aov.b.fieldOf("sound_event").forGetter(cip::a), aqy.j.fieldOf("use_duration").forGetter(cip::b), aqy.k.fieldOf("range").forGetter(cip::c)
            )
            .apply($$0, cip::new)
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
