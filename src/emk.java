import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emk(jq<cxk> c, emm d) {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxk.e.fieldOf("display").forGetter($$0x -> $$0x.c), emm.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, emk::new)
   );
   public static final Codec<jq<emk>> b = alv.a(mb.aQ, a);

   public jq<cxk> a() {
      return this.c;
   }

   public emm b() {
      return this.d;
   }
}
