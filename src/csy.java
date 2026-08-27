import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class csy extends csu {
   public static final Codec<csy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(csq.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, csy::new)
   );
   private final ig<csq> c;
   private final int d;
   private final int e;

   public csy(ig<csq> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ib<csq>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends csu> a() {
      return b;
   }

   @Override
   public ib<csq> getNoiseBiome(int $$0, int $$1, int $$2, csz.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
