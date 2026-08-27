import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ciz(hg<ape> b, int c, float d) {
   public static final Codec<ciz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ape.b.fieldOf("sound_event").forGetter(ciz::a), arh.j.fieldOf("use_duration").forGetter(ciz::b), arh.k.fieldOf("range").forGetter(ciz::c)
            )
            .apply($$0, ciz::new)
   );

   public hg<ape> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
