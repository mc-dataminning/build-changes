import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cjd(he<apf> b, int c, float d) {
   public static final Codec<cjd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               apf.b.fieldOf("sound_event").forGetter(cjd::a), arj.j.fieldOf("use_duration").forGetter(cjd::b), arj.k.fieldOf("range").forGetter(cjd::c)
            )
            .apply($$0, cjd::new)
   );

   public he<apf> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
