import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cwu extends cwq {
   public static final Codec<cwu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwm.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cwu::new)
   );
   private final in<cwm> c;
   private final int d;
   private final int e;

   public cwu(in<cwm> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ij<cwm>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cwq> a() {
      return b;
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2, cwv.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
