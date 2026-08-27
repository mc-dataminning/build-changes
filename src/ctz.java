import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctz(ja<avn> e, int f, float g) {
   public static final Codec<ctz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avn.b.fieldOf("sound_event").forGetter(ctz::a), axu.j.fieldOf("use_duration").forGetter(ctz::b), axu.k.fieldOf("range").forGetter(ctz::c)
            )
            .apply($$0, ctz::new)
   );
   public static final zc<wp, ctz> b = zc.a(avn.d, ctz::a, za.g, ctz::b, za.i, ctz::c, ctz::new);
   public static final Codec<ja<ctz>> c = akp.a(li.E, a);
   public static final zc<wp, ja<ctz>> d = za.a(li.E, b);

   public ja<avn> a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public float c() {
      return this.g;
   }
}
