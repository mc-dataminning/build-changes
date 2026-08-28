import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record doz(alf e, String f) {
   public static final Codec<doz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a.fieldOf("asset_id").forGetter(doz::a), Codec.STRING.fieldOf("translation_key").forGetter(doz::b)).apply($$0, doz::new)
   );
   public static final zn<xa, doz> b = zn.a(alf.b, doz::a, zl.l, doz::b, doz::new);
   public static final Codec<ji<doz>> c = alb.a(lq.d, a);
   public static final zn<xa, ji<doz>> d = zl.a(lq.d, b);

   public alf a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
