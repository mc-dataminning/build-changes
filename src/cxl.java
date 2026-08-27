import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cxl extends cxh {
   public static final Codec<cxl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxd.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cxl::new)
   );
   private final ip<cxd> c;
   private final int d;
   private final int e;

   public cxl(ip<cxd> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<il<cxd>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cxh> a() {
      return b;
   }

   @Override
   public il<cxd> getNoiseBiome(int $$0, int $$1, int $$2, cxm.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
