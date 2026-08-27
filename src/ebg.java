import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ebg extends ebn {
   public static final Codec<ebg> a = RecordCodecBuilder.create($$0 -> $$0.group(drq.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ebg::new));
   private final drq.a c;

   private ebg(drq.a $$0) {
      this.c = $$0;
   }

   public static ebg a(drq.a $$0) {
      return new ebg($$0);
   }

   @Override
   public Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ib($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ebo<?> b() {
      return ebo.k;
   }
}
