import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnh implements dms {
   public static final Codec<dnh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcb.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dcb.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bdc.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dnh::new)
   );
   public final dcb b;
   public final dcb c;
   private final bdc d;

   public dnh(dcb $$0, dcb $$1, bdc $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bdc a() {
      return this.d;
   }
}
