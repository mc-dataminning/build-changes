import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiu implements eja {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bso.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bso.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eiu::new)
   );
   private final bso b;
   private final bso c;

   public eiu(bso $$0, bso $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bso a() {
      return this.b;
   }

   public bso b() {
      return this.c;
   }
}
