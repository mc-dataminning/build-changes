import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzt implements dzz {
   public static final Codec<dzt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bnf.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bnf.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dzt::new)
   );
   private final bnf b;
   private final bnf c;

   public dzt(bnf $$0, bnf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnf a() {
      return this.b;
   }

   public bnf b() {
      return this.c;
   }
}
