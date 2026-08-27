import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bjq {
   public static final Codec<bjq> a = RecordCodecBuilder.create($$0 -> $$0.group(doz.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bjq::new));
   private final doz b;

   public bjq(doz $$0) {
      this.b = $$0;
   }

   public bjq(long $$0, agt $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bjq(long $$0, Optional<agt> $$1) {
      this(a($$0, $$1));
   }

   private static doz a(long $$0, Optional<agt> $$1) {
      don.a $$2 = don.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new doz($$2.a());
   }

   public static don.a a(agt $$0) {
      return don.a($$0.toString());
   }

   public auf a() {
      return this.b;
   }
}
