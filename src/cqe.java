import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqe(il<atx> b, int c, float d) {
   public static final Codec<cqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.b.fieldOf("sound_event").forGetter(cqe::a), awe.k.fieldOf("use_duration").forGetter(cqe::b), awe.l.fieldOf("range").forGetter(cqe::c)
            )
            .apply($$0, cqe::new)
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
