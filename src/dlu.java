import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dlu extends dlq {
   public static final MapCodec<dlu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlm.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dlu::new)
   );
   private final jk<dlm> c;
   private final int d;
   private final int e;

   public dlu(jk<dlm> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<jg<dlm>> b() {
      return this.c.a();
   }

   @Override
   protected MapCodec<? extends dlq> a() {
      return b;
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2, dlv.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
