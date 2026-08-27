import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqc(il<atx> b, int c, float d) {
   public static final Codec<cqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.b.fieldOf("sound_event").forGetter(cqc::a), awe.k.fieldOf("use_duration").forGetter(cqc::b), awe.l.fieldOf("range").forGetter(cqc::c)
            )
            .apply($$0, cqc::new)
   );

   public il<atx> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
