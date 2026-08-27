import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bhd {
   public static final Codec<bhd> a = RecordCodecBuilder.create($$0 -> $$0.group(dlt.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bhd::new));
   private final dlt b;

   public bhd(dlt $$0) {
      this.b = $$0;
   }

   public bhd(long $$0, aew $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bhd(long $$0, Optional<aew> $$1) {
      this(a($$0, $$1));
   }

   private static dlt a(long $$0, Optional<aew> $$1) {
      dlh.a $$2 = dlh.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dlt($$2.a());
   }

   public static dlh.a a(aew $$0) {
      return dlh.a($$0.toString());
   }

   public asc a() {
      return this.b;
   }
}
