import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqu(alb e, String f) {
   public static final Codec<dqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alb.a.fieldOf("asset_id").forGetter(dqu::a), Codec.STRING.fieldOf("translation_key").forGetter(dqu::b)).apply($$0, dqu::new)
   );
   public static final zb<wo, dqu> b = zb.a(alb.b, dqu::a, yz.l, dqu::b, dqu::new);
   public static final Codec<jn<dqu>> c = akx.a(lv.d, a);
   public static final zb<wo, jn<dqu>> d = yz.a(lv.d, b);

   public alb a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
