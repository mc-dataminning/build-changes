import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cns extends cno {
   public static final Codec<cns> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cnk.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cns::new)
   );
   private final hi<cnk> c;
   private final int d;
   private final int e;

   public cns(hi<cnk> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<he<cnk>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cno> a() {
      return b;
   }

   @Override
   public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2, cnt.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
