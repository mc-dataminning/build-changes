import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cwy extends cwu {
   public static final Codec<cwy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwq.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cwy::new)
   );
   private final in<cwq> c;
   private final int d;
   private final int e;

   public cwy(in<cwq> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ij<cwq>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cwu> a() {
      return b;
   }

   @Override
   public ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2, cwz.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
