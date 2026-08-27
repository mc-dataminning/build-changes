import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cve extends cva {
   public static final Codec<cve> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuw.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cve::new)
   );
   private final il<cuw> c;
   private final int d;
   private final int e;

   public cve(il<cuw> $$0, int $$1) {
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Stream<ih<cuw>> b() {
      return this.c.a();
   }

   @Override
   protected Codec<? extends cva> a() {
      return b;
   }

   @Override
   public ih<cuw> getNoiseBiome(int $$0, int $$1, int $$2, cvf.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
