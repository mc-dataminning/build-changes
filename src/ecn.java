import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ecn extends ecl {
   public static final Codec<ecn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bmi.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bmi.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ecn::new)
   );
   private final bmi c;
   private final bmi d;

   public static ecn a(bmi $$0, bmi $$1) {
      return new ecn($$0, $$1);
   }

   public static ecn a(bmi $$0) {
      return new ecn(bmf.a(0), $$0);
   }

   public static ecn b(bmi $$0) {
      return new ecn($$0, bmf.a(0));
   }

   private ecn(bmi $$0, bmi $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ib> a_(ecj $$0, axd $$1, ib $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ib($$3, $$4, $$5));
   }

   @Override
   public ecm<?> b() {
      return ecm.n;
   }
}
