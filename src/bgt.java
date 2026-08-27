import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bgt {
   public static final Codec<bgt> a = RecordCodecBuilder.create($$0 -> $$0.group(dli.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bgt::new));
   private final dli b;

   public bgt(dli $$0) {
      this.b = $$0;
   }

   public bgt(long $$0, aep $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bgt(long $$0, Optional<aep> $$1) {
      this(a($$0, $$1));
   }

   private static dli a(long $$0, Optional<aep> $$1) {
      dkw.a $$2 = dkw.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dli($$2.a());
   }

   public static dkw.a a(aep $$0) {
      return dkw.a($$0.toString());
   }

   public art a() {
      return this.b;
   }
}
