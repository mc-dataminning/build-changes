import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmy(ih<ars> b, int c, float d) {
   public static final Codec<cmy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ars.b.fieldOf("sound_event").forGetter(cmy::a), atx.j.fieldOf("use_duration").forGetter(cmy::b), atx.k.fieldOf("range").forGetter(cmy::c)
            )
            .apply($$0, cmy::new)
   );

   public ih<ars> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
