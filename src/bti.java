import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bti {
   public static final Codec<bti> a = RecordCodecBuilder.create($$0 -> $$0.group(eej.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bti::new));
   private final eej b;

   public bti(eej $$0) {
      this.b = $$0;
   }

   public bti(long $$0, alz $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bti(long $$0, Optional<alz> $$1) {
      this(a($$0, $$1));
   }

   private static eej a(long $$0, Optional<alz> $$1) {
      edx.a $$2 = edx.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eej($$2.a());
   }

   public static edx.a a(alz $$0) {
      return edx.a($$0.toString());
   }

   public bam a() {
      return this.b;
   }
}
