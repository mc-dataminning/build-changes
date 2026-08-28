import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvy(jq<awn> e, float f, float g, xl h) {
   public static final Codec<cvy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awn.b.fieldOf("sound_event").forGetter(cvy::a),
               ayw.o.fieldOf("use_duration").forGetter(cvy::b),
               ayw.o.fieldOf("range").forGetter(cvy::c),
               xn.a.fieldOf("description").forGetter(cvy::d)
            )
            .apply($$0, cvy::new)
   );
   public static final zj<ww, cvy> b = zj.a(awn.d, cvy::a, zh.j, cvy::b, zh.j, cvy::c, xn.b, cvy::d, cvy::new);
   public static final Codec<jq<cvy>> c = alh.a(ma.I, a);
   public static final zj<ww, jq<cvy>> d = zh.a(ma.I, b);

   public jq<awn> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xl d() {
      return this.h;
   }
}
