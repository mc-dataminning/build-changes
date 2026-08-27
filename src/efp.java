import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efp extends efn {
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bnv.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bnv.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, efp::new)
   );
   private final bnv c;
   private final bnv d;

   public static efp a(bnv $$0, bnv $$1) {
      return new efp($$0, $$1);
   }

   public static efp a(bnv $$0) {
      return new efp(bns.a(0), $$0);
   }

   public static efp b(bnv $$0) {
      return new efp($$0, bns.a(0));
   }

   private efp(bnv $$0, bnv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new im($$3, $$4, $$5));
   }

   @Override
   public efo<?> b() {
      return efo.n;
   }
}
