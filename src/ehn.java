import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehn(jm<cuj> c, ehp d) {
   public static final Codec<ehn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akn.a(lu.K).fieldOf("display").forGetter($$0x -> $$0x.c), ehp.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ehn::new)
   );
   public static final Codec<jm<ehn>> b = akm.a(lu.aN, a);

   public jm<cuj> a() {
      return this.c;
   }

   public ehp b() {
      return this.d;
   }
}
