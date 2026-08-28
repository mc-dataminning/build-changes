import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czg(jf<awm> e, float f, float g, wy h) {
   public static final Codec<czg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(czg::a),
               ayu.o.fieldOf("use_duration").forGetter(czg::b),
               ayu.o.fieldOf("range").forGetter(czg::c),
               xa.a.fieldOf("description").forGetter(czg::d)
            )
            .apply($$0, czg::new)
   );
   public static final yw<wj, czg> b = yw.a(awm.d, czg::a, yu.l, czg::b, yu.l, czg::c, xa.b, czg::d, czg::new);
   public static final Codec<jf<czg>> c = alc.a(mh.aU, a);
   public static final yw<wj, jf<czg>> d = yu.a(mh.aU, b);

   public jf<awm> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public wy d() {
      return this.h;
   }
}
