import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bol {
   public static final Codec<bol> a = RecordCodecBuilder.create($$0 -> $$0.group(dwb.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bol::new));
   private final dwb b;

   public bol(dwb $$0) {
      this.b = $$0;
   }

   public bol(long $$0, ajv $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bol(long $$0, Optional<ajv> $$1) {
      this(a($$0, $$1));
   }

   private static dwb a(long $$0, Optional<ajv> $$1) {
      dvp.a $$2 = dvp.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dwb($$2.a());
   }

   public static dvp.a a(ajv $$0) {
      return dvp.a($$0.toString());
   }

   public axt a() {
      return this.b;
   }
}
