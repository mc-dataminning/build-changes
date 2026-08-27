import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ecc extends ecj {
   public static final Codec<ecc> a = RecordCodecBuilder.create($$0 -> $$0.group(dsm.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ecc::new));
   private final dsm.a c;

   private ecc(dsm.a $$0) {
      this.c = $$0;
   }

   public static ecc a(dsm.a $$0) {
      return new ecc($$0);
   }

   @Override
   public Stream<ib> a_(ech $$0, axd $$1, ib $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ib($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eck<?> b() {
      return eck.k;
   }
}
