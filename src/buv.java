import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class buv {
   public static final Codec<buv> a = RecordCodecBuilder.create($$0 -> $$0.group(eie.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, buv::new));
   private final eie b;

   public buv(eie $$0) {
      this.b = $$0;
   }

   public buv(long $$0, ali $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public buv(long $$0, Optional<ali> $$1) {
      this(a($$0, $$1));
   }

   private static eie a(long $$0, Optional<ali> $$1) {
      ehs.a $$2 = ehs.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eie($$2.a());
   }

   public static ehs.a a(ali $$0) {
      return ehs.a($$0.toString());
   }

   public azx a() {
      return this.b;
   }
}
