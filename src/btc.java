import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class btc {
   public static final Codec<btc> a = RecordCodecBuilder.create($$0 -> $$0.group(eep.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, btc::new));
   private final eep b;

   public btc(eep $$0) {
      this.b = $$0;
   }

   public btc(long $$0, aku $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public btc(long $$0, Optional<aku> $$1) {
      this(a($$0, $$1));
   }

   private static eep a(long $$0, Optional<aku> $$1) {
      eed.a $$2 = eed.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eep($$2.a());
   }

   public static eed.a a(aku $$0) {
      return eed.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
