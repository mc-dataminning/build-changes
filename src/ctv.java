import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctv(jj<avg> e, int f, float g) {
   public static final Codec<ctv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avg.b.fieldOf("sound_event").forGetter(ctv::a), axo.l.fieldOf("use_duration").forGetter(ctv::b), axo.m.fieldOf("range").forGetter(ctv::c)
            )
            .apply($$0, ctv::new)
   );
   public static final ys<wf, ctv> b = ys.a(avg.d, ctv::a, yq.g, ctv::b, yq.i, ctv::c, ctv::new);
   public static final Codec<jj<ctv>> c = akg.a(lr.I, a);
   public static final ys<wf, jj<ctv>> d = yq.a(lr.I, b);

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
