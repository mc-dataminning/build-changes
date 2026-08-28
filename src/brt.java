import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class brt {
   public static final Codec<brt> a = RecordCodecBuilder.create($$0 -> $$0.group(ebl.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, brt::new));
   private final ebl b;

   public brt(ebl $$0) {
      this.b = $$0;
   }

   public brt(long $$0, alc $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public brt(long $$0, Optional<alc> $$1) {
      this(a($$0, $$1));
   }

   private static ebl a(long $$0, Optional<alc> $$1) {
      eaz.a $$2 = eaz.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new ebl($$2.a());
   }

   public static eaz.a a(alc $$0) {
      return eaz.a($$0.toString());
   }

   public azl a() {
      return this.b;
   }
}
