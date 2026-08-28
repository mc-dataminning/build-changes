import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dui(aku e, String f) {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a.fieldOf("asset_id").forGetter(dui::a), Codec.STRING.fieldOf("translation_key").forGetter(dui::b)).apply($$0, dui::new)
   );
   public static final yn<wa, dui> b = yn.a(aku.b, dui::a, yl.o, dui::b, dui::new);
   public static final Codec<jr<dui>> c = akq.a(mc.d, a);
   public static final yn<wa, jr<dui>> d = yl.a(mc.d, b);

   public aku a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
