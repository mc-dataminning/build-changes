import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyw(je<awm> e, float f, float g, wy h) {
   public static final Codec<cyw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(cyw::a),
               ayu.o.fieldOf("use_duration").forGetter(cyw::b),
               ayu.o.fieldOf("range").forGetter(cyw::c),
               xa.a.fieldOf("description").forGetter(cyw::d)
            )
            .apply($$0, cyw::new)
   );
   public static final yw<wj, cyw> b = yw.a(awm.d, cyw::a, yu.l, cyw::b, yu.l, cyw::c, xa.b, cyw::d, cyw::new);
   public static final Codec<je<cyw>> c = alc.a(mg.aU, a);
   public static final yw<wj, je<cyw>> d = yu.a(mg.aU, b);

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
