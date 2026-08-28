import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bsm {
   public static final Codec<bsm> a = RecordCodecBuilder.create($$0 -> $$0.group(edr.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bsm::new));
   private final edr b;

   public bsm(edr $$0) {
      this.b = $$0;
   }

   public bsm(long $$0, aku $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bsm(long $$0, Optional<aku> $$1) {
      this(a($$0, $$1));
   }

   private static edr a(long $$0, Optional<aku> $$1) {
      edf.a $$2 = edf.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new edr($$2.a());
   }

   public static edf.a a(aku $$0) {
      return edf.a($$0.toString());
   }

   public azg a() {
      return this.b;
   }
}
