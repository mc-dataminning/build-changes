import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cti(ix<avh> e, int f, float g) {
   public static final Codec<cti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avh.b.fieldOf("sound_event").forGetter(cti::a), axn.j.fieldOf("use_duration").forGetter(cti::b), axn.k.fieldOf("range").forGetter(cti::c)
            )
            .apply($$0, cti::new)
   );
   public static final yv<wi, cti> b = yv.a(avh.d, cti::a, yt.f, cti::b, yt.h, cti::c, cti::new);
   public static final Codec<ix<cti>> c = akj.a(lf.E, a);
   public static final yv<wi, ix<cti>> d = yt.a(lf.E, b);

   public ix<avh> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
