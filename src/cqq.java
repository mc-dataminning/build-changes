import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cqq extends cqm {
   public static final Codec<cqq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqi.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cqq::new)
   );
   private final hj<cqi> c;
   private final int d;
   private final int e;

   public cqq(hj<cqi> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<hf<cqi>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cqm> a() {
      return b;
   }

   @Override
   public hf<cqi> getNoiseBiome(int $$0, int $$1, int $$2, cqr.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
