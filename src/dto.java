import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dto(akv e, String f) {
   public static final Codec<dto> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akv.a.fieldOf("asset_id").forGetter(dto::a), Codec.STRING.fieldOf("translation_key").forGetter(dto::b)).apply($$0, dto::new)
   );
   public static final yn<wa, dto> b = yn.a(akv.b, dto::a, yl.o, dto::b, dto::new);
   public static final Codec<jr<dto>> c = akr.a(mc.d, a);
   public static final yn<wa, jr<dto>> d = yl.a(mc.d, b);

   public akv a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
