import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czr(jf<awo> e, float f, float g, xa h) {
   public static final Codec<czr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awo.b.fieldOf("sound_event").forGetter(czr::a),
               ayw.o.fieldOf("use_duration").forGetter(czr::b),
               ayw.o.fieldOf("range").forGetter(czr::c),
               xc.a.fieldOf("description").forGetter(czr::d)
            )
            .apply($$0, czr::new)
   );
   public static final yy<wl, czr> b = yy.a(awo.d, czr::a, yw.l, czr::b, yw.l, czr::c, xc.b, czr::d, czr::new);
   public static final Codec<jf<czr>> c = ale.a(mh.aU, a);
   public static final yy<wl, jf<czr>> d = yw.a(mh.aU, b);

   public jf<awo> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public xa d() {
      return this.h;
   }
}
