import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class buc {
   public static final Codec<buc> a = RecordCodecBuilder.create($$0 -> $$0.group(ego.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, buc::new));
   private final ego b;

   public buc(ego $$0) {
      this.b = $$0;
   }

   public buc(long $$0, ale $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public buc(long $$0, Optional<ale> $$1) {
      this(a($$0, $$1));
   }

   private static ego a(long $$0, Optional<ale> $$1) {
      egc.a $$2 = egc.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new ego($$2.a());
   }

   public static egc.a a(ale $$0) {
      return egc.a($$0.toString());
   }

   public azt a() {
      return this.b;
   }
}
