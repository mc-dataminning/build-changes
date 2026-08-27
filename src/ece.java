import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ece extends ecl {
   public static final Codec<ece> a = RecordCodecBuilder.create($$0 -> $$0.group(dso.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, ece::new));
   private final dso.a c;

   private ece(dso.a $$0) {
      this.c = $$0;
   }

   public static ece a(dso.a $$0) {
      return new ece($$0);
   }

   @Override
   public Stream<ib> a_(ecj $$0, axd $$1, ib $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ib($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ecm<?> b() {
      return ecm.k;
   }
}
