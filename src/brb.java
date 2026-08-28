import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class brb {
   public static final Codec<brb> a = RecordCodecBuilder.create($$0 -> $$0.group(dyw.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, brb::new));
   private final dyw b;

   public brb(dyw $$0) {
      this.b = $$0;
   }

   public brb(long $$0, alf $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public brb(long $$0, Optional<alf> $$1) {
      this(a($$0, $$1));
   }

   private static dyw a(long $$0, Optional<alf> $$1) {
      dyk.a $$2 = dyk.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dyw($$2.a());
   }

   public static dyk.a a(alf $$0) {
      return dyk.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
