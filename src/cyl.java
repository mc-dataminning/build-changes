import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cyl(je<awk> e, float f, float g, ww h) {
   public static final Codec<cyl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awk.b.fieldOf("sound_event").forGetter(cyl::a),
               ays.o.fieldOf("use_duration").forGetter(cyl::b),
               ays.o.fieldOf("range").forGetter(cyl::c),
               wy.a.fieldOf("description").forGetter(cyl::d)
            )
            .apply($$0, cyl::new)
   );
   public static final yu<wh, cyl> b = yu.a(awk.d, cyl::a, ys.l, cyl::b, ys.l, cyl::c, wy.b, cyl::d, cyl::new);
   public static final Codec<je<cyl>> c = ala.a(mg.aS, a);
   public static final yu<wh, je<cyl>> d = ys.a(mg.aS, b);

   public je<awk> a() {
      return this.e;
   }

   public float b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public ww d() {
      return this.h;
   }
}
