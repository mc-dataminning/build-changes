import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class buk {
   public static final Codec<buk> a = RecordCodecBuilder.create($$0 -> $$0.group(eho.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, buk::new));
   private final eho b;

   public buk(eho $$0) {
      this.b = $$0;
   }

   public buk(long $$0, alg $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public buk(long $$0, Optional<alg> $$1) {
      this(a($$0, $$1));
   }

   private static eho a(long $$0, Optional<alg> $$1) {
      ehc.a $$2 = ehc.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eho($$2.a());
   }

   public static ehc.a a(alg $$0) {
      return ehc.a($$0.toString());
   }

   public azv a() {
      return this.b;
   }
}
