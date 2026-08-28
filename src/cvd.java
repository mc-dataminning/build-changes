import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvd(jn<awc> e, float f, float g, xd h) {
   public static final Codec<cvd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awc.b.fieldOf("sound_event").forGetter(cvd::a),
               ayl.m.fieldOf("use_duration").forGetter(cvd::b),
               ayl.m.fieldOf("range").forGetter(cvd::c),
               xf.a.fieldOf("description").forGetter(cvd::d)
            )
            .apply($$0, cvd::new)
   );
   public static final zb<wo, cvd> b = zb.a(awc.d, cvd::a, yz.i, cvd::b, yz.i, cvd::c, xf.b, cvd::d, cvd::new);
   public static final Codec<jn<cvd>> c = akx.a(lv.I, a);
   public static final zb<wo, jn<cvd>> d = yz.a(lv.I, b);

   public jn<awc> a() {
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
