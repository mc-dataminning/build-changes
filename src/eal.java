import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eal extends eas {
   public static final Codec<eal> a = RecordCodecBuilder.create($$0 -> $$0.group(dqv.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eal::new));
   private final dqv.a c;

   private eal(dqv.a $$0) {
      this.c = $$0;
   }

   public static eal a(dqv.a $$0) {
      return new eal($$0);
   }

   @Override
   public Stream<hz> a_(eaq $$0, awp $$1, hz $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hz($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eat<?> b() {
      return eat.k;
   }
}
