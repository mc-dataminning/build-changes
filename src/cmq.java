import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmq(ih<arr> b, int c, float d) {
   public static final Codec<cmq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arr.b.fieldOf("sound_event").forGetter(cmq::a), atw.j.fieldOf("use_duration").forGetter(cmq::b), atw.k.fieldOf("range").forGetter(cmq::c)
            )
            .apply($$0, cmq::new)
   );

   public ih<arr> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
