import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cqw extends cqs {
   public static final Codec<cqw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqo.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cqw::new)
   );
   private final hk<cqo> c;
   private final int d;
   private final int e;

   public cqw(hk<cqo> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<hg<cqo>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cqs> a() {
      return b;
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2, cqx.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
