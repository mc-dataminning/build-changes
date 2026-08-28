import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvq(jp<awj> e, float f, float g, xh h) {
   public static final Codec<cvq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awj.b.fieldOf("sound_event").forGetter(cvq::a),
               ays.o.fieldOf("use_duration").forGetter(cvq::b),
               ays.o.fieldOf("range").forGetter(cvq::c),
               xj.a.fieldOf("description").forGetter(cvq::d)
            )
            .apply($$0, cvq::new)
   );
   public static final zf<ws, cvq> b = zf.a(awj.d, cvq::a, zd.j, cvq::b, zd.j, cvq::c, xj.b, cvq::d, cvq::new);
   public static final Codec<jp<cvq>> c = ald.a(ly.I, a);
   public static final zf<ws, jp<cvq>> d = zd.a(ly.I, b);

   public jp<awj> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xh d() {
      return this.h;
   }
}
