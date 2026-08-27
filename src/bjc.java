import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bjc {
   public static final Codec<bjc> a = RecordCodecBuilder.create($$0 -> $$0.group(dns.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bjc::new));
   private final dns b;

   public bjc(dns $$0) {
      this.b = $$0;
   }

   public bjc(long $$0, agi $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bjc(long $$0, Optional<agi> $$1) {
      this(a($$0, $$1));
   }

   private static dns a(long $$0, Optional<agi> $$1) {
      dng.a $$2 = dng.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dns($$2.a());
   }

   public static dng.a a(agi $$0) {
      return dng.a($$0.toString());
   }

   public ats a() {
      return this.b;
   }
}
