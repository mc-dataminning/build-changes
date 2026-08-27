import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cix(hg<apd> b, int c, float d) {
   public static final Codec<cix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               apd.b.fieldOf("sound_event").forGetter(cix::a), arg.j.fieldOf("use_duration").forGetter(cix::b), arg.k.fieldOf("range").forGetter(cix::c)
            )
            .apply($$0, cix::new)
   );

   public hg<apd> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
