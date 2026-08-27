import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ecl extends ecj {
   public static final Codec<ecl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bmh.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bmh.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ecl::new)
   );
   private final bmh c;
   private final bmh d;

   public static ecl a(bmh $$0, bmh $$1) {
      return new ecl($$0, $$1);
   }

   public static ecl a(bmh $$0) {
      return new ecl(bme.a(0), $$0);
   }

   public static ecl b(bmh $$0) {
      return new ecl($$0, bme.a(0));
   }

   private ecl(bmh $$0, bmh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ib> a_(ech $$0, axd $$1, ib $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ib($$3, $$4, $$5));
   }

   @Override
   public eck<?> b() {
      return eck.n;
   }
}
