import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejd(jn<cvk> c, ejf d) {
   public static final Codec<ejd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akz.a(lv.K).fieldOf("display").forGetter($$0x -> $$0x.c), ejf.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, ejd::new)
   );
   public static final Codec<jn<ejd>> b = aky.a(lv.aO, a);

   public jn<cvk> a() {
      return this.c;
   }

   public ejf b() {
      return this.d;
   }
}
