import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dst implements dse {
   public static final Codec<dst> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhn.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dhn.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               big.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dst::new)
   );
   public final dhn b;
   public final dhn c;
   private final big d;

   public dst(dhn $$0, dhn $$1, big $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public big a() {
      return this.d;
   }
}
