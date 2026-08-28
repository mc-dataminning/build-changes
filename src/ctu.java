import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctu(jj<avg> e, int f, float g) {
   public static final Codec<ctu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avg.b.fieldOf("sound_event").forGetter(ctu::a), axo.l.fieldOf("use_duration").forGetter(ctu::b), axo.m.fieldOf("range").forGetter(ctu::c)
            )
            .apply($$0, ctu::new)
   );
   public static final ys<wf, ctu> b = ys.a(avg.d, ctu::a, yq.g, ctu::b, yq.i, ctu::c, ctu::new);
   public static final Codec<jj<ctu>> c = akg.a(lr.I, a);
   public static final ys<wf, jj<ctu>> d = yq.a(lr.I, b);

   public jj<avg> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
