import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cfr(he<amg> b, int c, float d) {
   public static final Codec<cfr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               amg.b.fieldOf("sound_event").forGetter(cfr::a), aoi.j.fieldOf("use_duration").forGetter(cfr::b), aoi.k.fieldOf("range").forGetter(cfr::c)
            )
            .apply($$0, cfr::new)
   );

   public he<amg> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }
}
