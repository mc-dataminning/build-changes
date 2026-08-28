import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egy(jj<cty> c, eha d) {
   public static final Codec<egy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a(lr.K).fieldOf("display").forGetter($$0x -> $$0x.c), eha.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egy::new)
   );
   public static final Codec<jj<egy>> b = akg.a(lr.aM, a);

   public jj<cty> a() {
      return this.c;
   }

   public eha b() {
      return this.d;
   }
}
