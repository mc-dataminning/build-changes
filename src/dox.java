import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dox(alf e, String f) {
   public static final Codec<dox> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alf.a.fieldOf("asset_id").forGetter(dox::a), Codec.STRING.fieldOf("translation_key").forGetter(dox::b)).apply($$0, dox::new)
   );
   public static final zn<xa, dox> b = zn.a(alf.b, dox::a, zl.l, dox::b, dox::new);
   public static final Codec<ji<dox>> c = alb.a(lq.d, a);
   public static final zn<xa, ji<dox>> d = zl.a(lq.d, b);

   public alf a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
