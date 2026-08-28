import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eml(jq<cxl> c, emn d) {
   public static final Codec<eml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxl.e.fieldOf("display").forGetter($$0x -> $$0x.c), emn.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, eml::new)
   );
   public static final Codec<jq<eml>> b = alv.a(mb.aQ, a);

   public jq<cxl> a() {
      return this.c;
   }

   public emn b() {
      return this.d;
   }
}
