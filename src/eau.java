import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eau extends eas {
   public static final Codec<eau> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(blb.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), blb.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eau::new)
   );
   private final blb c;
   private final blb d;

   public static eau a(blb $$0, blb $$1) {
      return new eau($$0, $$1);
   }

   public static eau a(blb $$0) {
      return new eau(bky.a(0), $$0);
   }

   public static eau b(blb $$0) {
      return new eau($$0, bky.a(0));
   }

   private eau(blb $$0, blb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hz> a_(eaq $$0, awp $$1, hz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hz($$3, $$4, $$5));
   }

   @Override
   public eat<?> b() {
      return eat.n;
   }
}
