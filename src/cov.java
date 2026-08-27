import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cov(ij<atk> b, int c, float d) {
   public static final Codec<cov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atk.b.fieldOf("sound_event").forGetter(cov::a), avq.j.fieldOf("use_duration").forGetter(cov::b), avq.k.fieldOf("range").forGetter(cov::c)
            )
            .apply($$0, cov::new)
   );

   public ij<atk> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
