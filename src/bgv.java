import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bgv {
   public static final Codec<bgv> a = RecordCodecBuilder.create($$0 -> $$0.group(dlj.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bgv::new));
   private final dlj b;

   public bgv(dlj $$0) {
      this.b = $$0;
   }

   public bgv(long $$0, aer $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bgv(long $$0, Optional<aer> $$1) {
      this(a($$0, $$1));
   }

   private static dlj a(long $$0, Optional<aer> $$1) {
      dkx.a $$2 = dkx.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dlj($$2.a());
   }

   public static dkx.a a(aer $$0) {
      return dkx.a($$0.toString());
   }

   public aru a() {
      return this.b;
   }
}
