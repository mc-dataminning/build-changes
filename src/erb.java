import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erb extends eri {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehd.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, erb::new)
   );
   private final ehd.a c;

   private erb(ehd.a $$0) {
      this.c = $$0;
   }

   public static erb a(ehd.a $$0) {
      return new erb($$0);
   }

   @Override
   public Stream<iv> a_(erg $$0, azx $$1, iv $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iv($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public erj<?> b() {
      return erj.k;
   }
}
