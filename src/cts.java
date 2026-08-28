import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cts(jj<ave> e, int f, float g) {
   public static final Codec<cts> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ave.b.fieldOf("sound_event").forGetter(cts::a), axm.l.fieldOf("use_duration").forGetter(cts::b), axm.m.fieldOf("range").forGetter(cts::c)
            )
            .apply($$0, cts::new)
   );
   public static final ys<wf, cts> b = ys.a(ave.d, cts::a, yq.g, cts::b, yq.i, cts::c, cts::new);
   public static final Codec<jj<cts>> c = akg.a(lr.I, a);
   public static final ys<wf, jj<cts>> d = yq.a(lr.I, b);

   public jj<ave> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
