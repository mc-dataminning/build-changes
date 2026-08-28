import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvh(jn<awd> e, float f, float g, xd h) {
   public static final Codec<cvh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awd.b.fieldOf("sound_event").forGetter(cvh::a),
               aym.n.fieldOf("use_duration").forGetter(cvh::b),
               aym.n.fieldOf("range").forGetter(cvh::c),
               xf.a.fieldOf("description").forGetter(cvh::d)
            )
            .apply($$0, cvh::new)
   );
   public static final zb<wo, cvh> b = zb.a(awd.d, cvh::a, yz.i, cvh::b, yz.i, cvh::c, xf.b, cvh::d, cvh::new);
   public static final Codec<jn<cvh>> c = aky.a(lv.I, a);
   public static final zb<wo, jn<cvh>> d = yz.a(lv.I, b);

   public jn<awd> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xd d() {
      return this.h;
   }
}
