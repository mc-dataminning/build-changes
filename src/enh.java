import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enh(js<cxu> c, enj d) {
   public static final Codec<enh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxu.e.fieldOf("display").forGetter($$0x -> $$0x.c), enj.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, enh::new)
   );
   public static final Codec<js<enh>> b = akz.a(me.aU, a);

   public js<cxu> a() {
      return this.c;
   }

   public enj b() {
      return this.d;
   }
}
