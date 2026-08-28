import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtp(aku e, String f) {
   public static final Codec<dtp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a.fieldOf("asset_id").forGetter(dtp::a), Codec.STRING.fieldOf("translation_key").forGetter(dtp::b)).apply($$0, dtp::new)
   );
   public static final ym<vz, dtp> b = ym.a(aku.b, dtp::a, yk.o, dtp::b, dtp::new);
   public static final Codec<jr<dtp>> c = akq.a(mc.d, a);
   public static final ym<vz, jr<dtp>> d = yk.a(mc.d, b);

   public aku a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
