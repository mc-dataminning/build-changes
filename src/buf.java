import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class buf {
   public static final Codec<buf> a = RecordCodecBuilder.create($$0 -> $$0.group(egz.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, buf::new));
   private final egz b;

   public buf(egz $$0) {
      this.b = $$0;
   }

   public buf(long $$0, alg $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public buf(long $$0, Optional<alg> $$1) {
      this(a($$0, $$1));
   }

   private static egz a(long $$0, Optional<alg> $$1) {
      egn.a $$2 = egn.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new egz($$2.a());
   }

   public static egn.a a(alg $$0) {
      return egn.a($$0.toString());
   }

   public azv a() {
      return this.b;
   }
}
