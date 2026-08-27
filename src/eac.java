import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eac implements eai {
   public static final Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bnk.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bnk.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eac::new)
   );
   private final bnk b;
   private final bnk c;

   public eac(bnk $$0, bnk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnk a() {
      return this.b;
   }

   public bnk b() {
      return this.c;
   }
}
