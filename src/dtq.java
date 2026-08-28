import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtq(akv e, String f) {
   public static final Codec<dtq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akv.a.fieldOf("asset_id").forGetter(dtq::a), Codec.STRING.fieldOf("translation_key").forGetter(dtq::b)).apply($$0, dtq::new)
   );
   public static final yn<wa, dtq> b = yn.a(akv.b, dtq::a, yl.o, dtq::b, dtq::new);
   public static final Codec<jr<dtq>> c = akr.a(mc.d, a);
   public static final yn<wa, jr<dtq>> d = yl.a(mc.d, b);

   public akv a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
