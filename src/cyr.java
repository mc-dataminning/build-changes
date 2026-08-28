import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyr(je<awm> e, float f, float g, wy h) {
   public static final Codec<cyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(cyr::a),
               ayu.o.fieldOf("use_duration").forGetter(cyr::b),
               ayu.o.fieldOf("range").forGetter(cyr::c),
               xa.a.fieldOf("description").forGetter(cyr::d)
            )
            .apply($$0, cyr::new)
   );
   public static final yw<wj, cyr> b = yw.a(awm.d, cyr::a, yu.l, cyr::b, yu.l, cyr::c, xa.b, cyr::d, cyr::new);
   public static final Codec<je<cyr>> c = alc.a(mg.aT, a);
   public static final yw<wj, je<cyr>> d = yu.a(mg.aT, b);

   public je<awm> a() {
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
