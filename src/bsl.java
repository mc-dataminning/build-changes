import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bsl {
   public static final Codec<bsl> a = RecordCodecBuilder.create($$0 -> $$0.group(eck.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bsl::new));
   private final eck b;

   public bsl(eck $$0) {
      this.b = $$0;
   }

   public bsl(long $$0, all $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bsl(long $$0, Optional<all> $$1) {
      this(a($$0, $$1));
   }

   private static eck a(long $$0, Optional<all> $$1) {
      eby.a $$2 = eby.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eck($$2.a());
   }

   public static eby.a a(all $$0) {
      return eby.a($$0.toString());
   }

   public azv a() {
      return this.b;
   }
}
