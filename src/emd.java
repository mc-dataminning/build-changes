import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emd(jq<cxg> c, emf d) {
   public static final Codec<emd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alw.a(mb.K).fieldOf("display").forGetter($$0x -> $$0x.c), emf.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, emd::new)
   );
   public static final Codec<jq<emd>> b = alv.a(mb.aP, a);

   public jq<cxg> a() {
      return this.c;
   }

   public emf b() {
      return this.d;
   }
}
