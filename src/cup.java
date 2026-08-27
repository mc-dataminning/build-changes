import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cup extends cul {
   public static final Codec<cup> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuh.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cup::new)
   );
   private final il<cuh> c;
   private final int d;
   private final int e;

   public cup(il<cuh> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ih<cuh>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cul> a() {
      return b;
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2, cuq.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
