import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecq implements ecb {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drb.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               drb.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               boz.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ecq::new)
   );
   public final drb b;
   public final drb c;
   private final boz d;

   public ecq(drb $$0, drb $$1, boz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public boz a() {
      return this.d;
   }
}
