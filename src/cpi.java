import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cpi(il<ato> b, int c, float d) {
   public static final Codec<cpi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ato.b.fieldOf("sound_event").forGetter(cpi::a), avu.j.fieldOf("use_duration").forGetter(cpi::b), avu.k.fieldOf("range").forGetter(cpi::c)
            )
            .apply($$0, cpi::new)
   );

   public il<ato> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
