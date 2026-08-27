import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bma {
   public static final Codec<bma> a = RecordCodecBuilder.create($$0 -> $$0.group(drp.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bma::new));
   private final drp b;

   public bma(drp $$0) {
      this.b = $$0;
   }

   public bma(long $$0, aiy $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bma(long $$0, Optional<aiy> $$1) {
      this(a($$0, $$1));
   }

   private static drp a(long $$0, Optional<aiy> $$1) {
      drd.a $$2 = drd.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new drp($$2.a());
   }

   public static drd.a a(aiy $$0) {
      return drd.a($$0.toString());
   }

   public awo a() {
      return this.b;
   }
}
