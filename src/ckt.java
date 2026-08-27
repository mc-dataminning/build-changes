import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ckt(ib<aqm> b, int c, float d) {
   public static final Codec<ckt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqm.b.fieldOf("sound_event").forGetter(ckt::a), asq.j.fieldOf("use_duration").forGetter(ckt::b), asq.k.fieldOf("range").forGetter(ckt::c)
            )
            .apply($$0, ckt::new)
   );

   public ib<aqm> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
