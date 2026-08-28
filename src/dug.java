import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dug(alp e, String f) {
   public static final Codec<dug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alp.a.fieldOf("asset_id").forGetter(dug::a), Codec.STRING.fieldOf("translation_key").forGetter(dug::b)).apply($$0, dug::new)
   );
   public static final zi<wv, dug> b = zi.a(alp.b, dug::a, zg.o, dug::b, dug::new);
   public static final Codec<jq<dug>> c = all.a(mb.d, a);
   public static final zi<wv, jq<dug>> d = zg.a(mb.d, b);

   public alp a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
