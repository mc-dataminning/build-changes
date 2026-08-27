import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crk(in<aun> e, int f, float g) {
   public static final Codec<crk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aun.b.fieldOf("sound_event").forGetter(crk::a), awu.j.fieldOf("use_duration").forGetter(crk::b), awu.k.fieldOf("range").forGetter(crk::c)
            )
            .apply($$0, crk::new)
   );
   public static final yg<vt, crk> b = yg.a(aun.d, crk::a, ye.f, crk::b, ye.h, crk::c, crk::new);
   public static final Codec<in<crk>> c = ajr.a(ku.E, a);
   public static final yg<vt, in<crk>> d = ye.a(ku.E, b);

   public in<aun> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
