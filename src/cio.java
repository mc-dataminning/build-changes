import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cio(hf<aot> b, int c, float d) {
   public static final Codec<cio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aot.b.fieldOf("sound_event").forGetter(cio::a), aqw.j.fieldOf("use_duration").forGetter(cio::b), aqw.k.fieldOf("range").forGetter(cio::c)
            )
            .apply($$0, cio::new)
   );

   public hf<aot> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
