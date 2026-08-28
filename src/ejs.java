import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejs(jp<cvt> c, eju d) {
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a(ly.K).fieldOf("display").forGetter($$0x -> $$0x.c), eju.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ejs::new)
   );
   public static final Codec<jp<ejs>> b = ald.a(ly.aO, a);

   public jp<cvt> a() {
      return this.c;
   }

   public eju b() {
      return this.d;
   }
}
