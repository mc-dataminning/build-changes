import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cis(hg<aoy> b, int c, float d) {
   public static final Codec<cis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aoy.b.fieldOf("sound_event").forGetter(cis::a), arb.j.fieldOf("use_duration").forGetter(cis::b), arb.k.fieldOf("range").forGetter(cis::c)
            )
            .apply($$0, cis::new)
   );

   public hg<aoy> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
