import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtd(he<cjg> c, dtf d) {
   public static final Codec<dtd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aew.a(jc.E).fieldOf("display").forGetter($$0x -> $$0x.c), dtf.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, dtd::new)
   );
   public static final Codec<he<dtd>> b = aev.a(jc.aw, a);

   public he<cjg> a() {
      return this.c;
   }

   public dtf b() {
      return this.d;
   }
}
