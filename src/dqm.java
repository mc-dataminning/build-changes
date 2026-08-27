import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqm implements dqs {
   public static final Codec<dqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bhg.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bhg.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dqm::new)
   );
   private final bhg b;
   private final bhg c;

   public dqm(bhg $$0, bhg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bhg a() {
      return this.b;
   }

   public bhg b() {
      return this.c;
   }
}
