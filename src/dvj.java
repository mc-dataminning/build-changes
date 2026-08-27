import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dvj extends dvh {
   public static final Codec<dvj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bhg.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bhg.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dvj::new)
   );
   private final bhg c;
   private final bhg d;

   public static dvj a(bhg $$0, bhg $$1) {
      return new dvj($$0, $$1);
   }

   public static dvj a(bhg $$0) {
      return new dvj(bhd.a(0), $$0);
   }

   public static dvj b(bhg $$0) {
      return new dvj($$0, bhd.a(0));
   }

   private dvj(bhg $$0, bhg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ht($$3, $$4, $$5));
   }

   @Override
   public dvi<?> b() {
      return dvi.n;
   }
}
