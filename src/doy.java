import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record doy(alf e, String f) {
   public static final Codec<doy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a.fieldOf("asset_id").forGetter(doy::a), Codec.STRING.fieldOf("translation_key").forGetter(doy::b)).apply($$0, doy::new)
   );
   public static final zn<xa, doy> b = zn.a(alf.b, doy::a, zl.l, doy::b, doy::new);
   public static final Codec<ji<doy>> c = alb.a(lq.d, a);
   public static final zn<xa, ji<doy>> d = zl.a(lq.d, b);

   public alf a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
