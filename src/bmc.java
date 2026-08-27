import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bmc {
   public static final Codec<bmc> a = RecordCodecBuilder.create($$0 -> $$0.group(drw.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bmc::new));
   private final drw b;

   public bmc(drw $$0) {
      this.b = $$0;
   }

   public bmc(long $$0, aiy $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bmc(long $$0, Optional<aiy> $$1) {
      this(a($$0, $$1));
   }

   private static drw a(long $$0, Optional<aiy> $$1) {
      drk.a $$2 = drk.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new drw($$2.a());
   }

   public static drk.a a(aiy $$0) {
      return drk.a($$0.toString());
   }

   public awp a() {
      return this.b;
   }
}
