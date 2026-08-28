import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egr(jj<ctv> c, egt d) {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a(lr.K).fieldOf("display").forGetter($$0x -> $$0x.c), egt.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, egr::new)
   );
   public static final Codec<jj<egr>> b = akg.a(lr.aM, a);

   public jj<ctv> a() {
      return this.c;
   }

   public egt b() {
      return this.d;
   }
}
