import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cor(ij<atj> b, int c, float d) {
   public static final Codec<cor> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atj.b.fieldOf("sound_event").forGetter(cor::a), avp.j.fieldOf("use_duration").forGetter(cor::b), avp.k.fieldOf("range").forGetter(cor::c)
            )
            .apply($$0, cor::new)
   );

   public ij<atj> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
