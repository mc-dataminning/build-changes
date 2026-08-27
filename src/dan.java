import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dan extends daj {
   public static final Codec<dan> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(daf.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, dan::new)
   );
   private final ir<daf> c;
   private final int d;
   private final int e;

   public dan(ir<daf> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<in<daf>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends daj> a() {
      return b;
   }

   @Override
   public in<daf> getNoiseBiome(int $$0, int $$1, int $$2, dao.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
