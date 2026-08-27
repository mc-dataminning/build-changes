import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cix(he<apc> b, int c, float d) {
   public static final Codec<cix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               apc.b.fieldOf("sound_event").forGetter(cix::a), arf.j.fieldOf("use_duration").forGetter(cix::b), arf.k.fieldOf("range").forGetter(cix::c)
            )
            .apply($$0, cix::new)
   );

   public he<apc> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
