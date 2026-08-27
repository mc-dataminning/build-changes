import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ebp extends ebn {
   public static final Codec<ebp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(blq.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), blq.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ebp::new)
   );
   private final blq c;
   private final blq d;

   public static ebp a(blq $$0, blq $$1) {
      return new ebp($$0, $$1);
   }

   public static ebp a(blq $$0) {
      return new ebp(bln.a(0), $$0);
   }

   public static ebp b(blq $$0) {
      return new ebp($$0, bln.a(0));
   }

   private ebp(blq $$0, blq $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ib($$3, $$4, $$5));
   }

   @Override
   public ebo<?> b() {
      return ebo.n;
   }
}
