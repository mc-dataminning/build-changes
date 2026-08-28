import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxd(jq<axe> e, float f, float g, xv h) {
   public static final Codec<cxd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound_event").forGetter(cxd::a),
               azn.o.fieldOf("use_duration").forGetter(cxd::b),
               azn.o.fieldOf("range").forGetter(cxd::c),
               xx.a.fieldOf("description").forGetter(cxd::d)
            )
            .apply($$0, cxd::new)
   );
   public static final zt<xg, cxd> b = zt.a(axe.d, cxd::a, zr.l, cxd::b, zr.l, cxd::c, xx.b, cxd::d, cxd::new);
   public static final Codec<jq<cxd>> c = alv.a(mb.I, a);
   public static final zt<xg, jq<cxd>> d = zr.a(mb.I, b);

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
