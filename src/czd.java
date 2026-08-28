import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czd(jf<awm> e, float f, float g, wy h) {
   public static final Codec<czd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(czd::a),
               ayu.o.fieldOf("use_duration").forGetter(czd::b),
               ayu.o.fieldOf("range").forGetter(czd::c),
               xa.a.fieldOf("description").forGetter(czd::d)
            )
            .apply($$0, czd::new)
   );
   public static final yw<wj, czd> b = yw.a(awm.d, czd::a, yu.l, czd::b, yu.l, czd::c, xa.b, czd::d, czd::new);
   public static final Codec<jf<czd>> c = alc.a(mh.aU, a);
   public static final yw<wj, jf<czd>> d = yu.a(mh.aU, b);

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
