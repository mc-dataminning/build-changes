import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class drj extends drh {
   public static final Codec<drj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bdc.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bdc.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, drj::new)
   );
   private final bdc c;
   private final bdc d;

   public static drj a(bdc $$0, bdc $$1) {
      return new drj($$0, $$1);
   }

   public static drj a(bdc $$0) {
      return new drj(bcz.a(0), $$0);
   }

   public static drj b(bdc $$0) {
      return new drj($$0, bcz.a(0));
   }

   private drj(bdc $$0, bdc $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gu($$3, $$4, $$5));
   }

   @Override
   public dri<?> b() {
      return dri.n;
   }
}
