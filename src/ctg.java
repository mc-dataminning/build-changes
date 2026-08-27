import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctg(ix<avg> e, int f, float g) {
   public static final Codec<ctg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avg.b.fieldOf("sound_event").forGetter(ctg::a), axm.j.fieldOf("use_duration").forGetter(ctg::b), axm.k.fieldOf("range").forGetter(ctg::c)
            )
            .apply($$0, ctg::new)
   );
   public static final yv<wi, ctg> b = yv.a(avg.d, ctg::a, yt.f, ctg::b, yt.h, ctg::c, ctg::new);
   public static final Codec<ix<ctg>> c = aki.a(lf.E, a);
   public static final yv<wi, ix<ctg>> d = yt.a(lf.E, b);

   public ix<avg> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
