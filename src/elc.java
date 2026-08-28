import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elc implements eli {
   public static final Codec<elc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(btg.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), btg.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, elc::new)
   );
   private final btg b;
   private final btg c;

   public elc(btg $$0, btg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public btg a() {
      return this.b;
   }

   public btg b() {
      return this.c;
   }
}
