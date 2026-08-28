import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxi(jq<axe> e, float f, float g, xv h) {
   public static final Codec<cxi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound_event").forGetter(cxi::a),
               azn.o.fieldOf("use_duration").forGetter(cxi::b),
               azn.o.fieldOf("range").forGetter(cxi::c),
               xx.a.fieldOf("description").forGetter(cxi::d)
            )
            .apply($$0, cxi::new)
   );
   public static final zt<xg, cxi> b = zt.a(axe.d, cxi::a, zr.l, cxi::b, zr.l, cxi::c, xx.b, cxi::d, cxi::new);
   public static final Codec<jq<cxi>> c = alv.a(mb.I, a);
   public static final zt<xg, jq<cxi>> d = zr.a(mb.I, b);

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
