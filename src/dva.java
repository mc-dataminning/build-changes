import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dva(ald e, String f) {
   public static final Codec<dva> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a.fieldOf("asset_id").forGetter(dva::a), Codec.STRING.fieldOf("translation_key").forGetter(dva::b)).apply($$0, dva::new)
   );
   public static final yt<wg, dva> b = yt.a(ald.b, dva::a, yr.o, dva::b, dva::new);
   public static final Codec<js<dva>> c = akz.a(me.d, a);
   public static final yt<wg, js<dva>> d = yr.a(me.d, b);

   public ald a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
