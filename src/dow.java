import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dow(ale e, String f) {
   public static final Codec<dow> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a.fieldOf("asset_id").forGetter(dow::a), Codec.STRING.fieldOf("translation_key").forGetter(dow::b)).apply($$0, dow::new)
   );
   public static final zm<wz, dow> b = zm.a(ale.b, dow::a, zk.l, dow::b, dow::new);
   public static final Codec<ji<dow>> c = ala.a(lq.d, a);
   public static final zm<wz, ji<dow>> d = zk.a(lq.d, b);

   public ale a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
