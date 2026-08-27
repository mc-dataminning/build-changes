import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drh implements drn {
   public static final Codec<drh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bhv.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bhv.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, drh::new)
   );
   private final bhv b;
   private final bhv c;

   public drh(bhv $$0, bhv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bhv a() {
      return this.b;
   }

   public bhv b() {
      return this.c;
   }
}
