import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cui(jm<avo> e, int f, float g) {
   public static final Codec<cui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avo.b.fieldOf("sound_event").forGetter(cui::a), axw.l.fieldOf("use_duration").forGetter(cui::b), axw.m.fieldOf("range").forGetter(cui::c)
            )
            .apply($$0, cui::new)
   );
   public static final yx<wk, cui> b = yx.a(avo.d, cui::a, yv.g, cui::b, yv.i, cui::c, cui::new);
   public static final Codec<jm<cui>> c = akn.a(lu.I, a);
   public static final yx<wk, jm<cui>> d = yv.a(lu.I, b);

   public jm<avo> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
