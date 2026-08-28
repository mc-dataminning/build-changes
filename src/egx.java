import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egx(jj<ctx> c, egz d) {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a(lr.K).fieldOf("display").forGetter($$0x -> $$0x.c), egz.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egx::new)
   );
   public static final Codec<jj<egx>> b = akg.a(lr.aM, a);

   public jj<ctx> a() {
      return this.c;
   }

   public egz b() {
      return this.d;
   }
}
