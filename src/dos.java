import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dos(alb e, String f) {
   public static final Codec<dos> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a.fieldOf("asset_id").forGetter(dos::a), Codec.STRING.fieldOf("translation_key").forGetter(dos::b)).apply($$0, dos::new)
   );
   public static final zj<ww, dos> b = zj.a(alb.b, dos::a, zh.l, dos::b, dos::new);
   public static final Codec<ji<dos>> c = akx.a(lq.d, a);
   public static final zj<ww, ji<dos>> d = zh.a(lq.d, b);

   public alb a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
