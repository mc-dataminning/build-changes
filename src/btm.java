import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class btm {
   public static final Codec<btm> a = RecordCodecBuilder.create($$0 -> $$0.group(eeq.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, btm::new));
   private final eeq b;

   public btm(eeq $$0) {
      this.b = $$0;
   }

   public btm(long $$0, alz $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public btm(long $$0, Optional<alz> $$1) {
      this(a($$0, $$1));
   }

   private static eeq a(long $$0, Optional<alz> $$1) {
      eee.a $$2 = eee.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eeq($$2.a());
   }

   public static eee.a a(alz $$0) {
      return eee.a($$0.toString());
   }

   public bam a() {
      return this.b;
   }
}
