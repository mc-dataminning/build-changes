import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bjg {
   public static final Codec<bjg> a = RecordCodecBuilder.create($$0 -> $$0.group(dnx.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bjg::new));
   private final dnx b;

   public bjg(dnx $$0) {
      this.b = $$0;
   }

   public bjg(long $$0, agm $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bjg(long $$0, Optional<agm> $$1) {
      this(a($$0, $$1));
   }

   private static dnx a(long $$0, Optional<agm> $$1) {
      dnl.a $$2 = dnl.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dnx($$2.a());
   }

   public static dnl.a a(agm $$0) {
      return dnl.a($$0.toString());
   }

   public atw a() {
      return this.b;
   }
}
