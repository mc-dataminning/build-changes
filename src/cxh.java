import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxh(jq<axe> e, float f, float g, xv h) {
   public static final Codec<cxh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound_event").forGetter(cxh::a),
               azn.o.fieldOf("use_duration").forGetter(cxh::b),
               azn.o.fieldOf("range").forGetter(cxh::c),
               xx.a.fieldOf("description").forGetter(cxh::d)
            )
            .apply($$0, cxh::new)
   );
   public static final zt<xg, cxh> b = zt.a(axe.d, cxh::a, zr.l, cxh::b, zr.l, cxh::c, xx.b, cxh::d, cxh::new);
   public static final Codec<jq<cxh>> c = alv.a(mb.I, a);
   public static final zt<xg, jq<cxh>> d = zr.a(mb.I, b);

   public jq<axe> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xv d() {
      return this.h;
   }
}
