import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dov(ale e, String f) {
   public static final Codec<dov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a.fieldOf("asset_id").forGetter(dov::a), Codec.STRING.fieldOf("translation_key").forGetter(dov::b)).apply($$0, dov::new)
   );
   public static final zm<wz, dov> b = zm.a(ale.b, dov::a, zk.l, dov::b, dov::new);
   public static final Codec<ji<dov>> c = ala.a(lq.d, a);
   public static final zm<wz, ji<dov>> d = zk.a(lq.d, b);

   public ale a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
