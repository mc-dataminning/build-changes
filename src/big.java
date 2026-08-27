import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class big {
   public static final Codec<big> a = RecordCodecBuilder.create($$0 -> $$0.group(dml.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, big::new));
   private final dml b;

   public big(dml $$0) {
      this.b = $$0;
   }

   public big(long $$0, afw $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public big(long $$0, Optional<afw> $$1) {
      this(a($$0, $$1));
   }

   private static dml a(long $$0, Optional<afw> $$1) {
      dlz.a $$2 = dlz.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dml($$2.a());
   }

   public static dlz.a a(afw $$0) {
      return dlz.a($$0.toString());
   }

   public ate a() {
      return this.b;
   }
}
