import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bgy {
   public static final Codec<bgy> a = RecordCodecBuilder.create($$0 -> $$0.group(dlo.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bgy::new));
   private final dlo b;

   public bgy(dlo $$0) {
      this.b = $$0;
   }

   public bgy(long $$0, aeu $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bgy(long $$0, Optional<aeu> $$1) {
      this(a($$0, $$1));
   }

   private static dlo a(long $$0, Optional<aeu> $$1) {
      dlc.a $$2 = dlc.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dlo($$2.a());
   }

   public static dlc.a a(aeu $$0) {
      return dlc.a($$0.toString());
   }

   public arx a() {
      return this.b;
   }
}
