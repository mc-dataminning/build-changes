import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czt(jg<awq> e, float f, float g, xc h) {
   public static final Codec<czt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awq.b.fieldOf("sound_event").forGetter(czt::a),
               ayy.o.fieldOf("use_duration").forGetter(czt::b),
               ayy.o.fieldOf("range").forGetter(czt::c),
               xe.a.fieldOf("description").forGetter(czt::d)
            )
            .apply($$0, czt::new)
   );
   public static final za<wn, czt> b = za.a(awq.d, czt::a, yy.l, czt::b, yy.l, czt::c, xe.b, czt::d, czt::new);
   public static final Codec<jg<czt>> c = alg.a(mi.aU, a);
   public static final za<wn, jg<czt>> d = yy.a(mi.aU, b);

   public jg<awq> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xc d() {
      return this.h;
   }
}
