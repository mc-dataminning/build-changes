import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtp(akv e, String f) {
   public static final Codec<dtp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akv.a.fieldOf("asset_id").forGetter(dtp::a), Codec.STRING.fieldOf("translation_key").forGetter(dtp::b)).apply($$0, dtp::new)
   );
   public static final yn<wa, dtp> b = yn.a(akv.b, dtp::a, yl.o, dtp::b, dtp::new);
   public static final Codec<jr<dtp>> c = akr.a(mc.d, a);
   public static final yn<wa, jr<dtp>> d = yl.a(mc.d, b);

   public akv a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
