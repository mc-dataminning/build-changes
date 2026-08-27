import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe implements dpp {
   public static final Codec<dqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dey.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dey.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bft.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqe::new)
   );
   public final dey b;
   public final dey c;
   private final bft d;

   public dqe(dey $$0, dey $$1, bft $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bft a() {
      return this.d;
   }
}
