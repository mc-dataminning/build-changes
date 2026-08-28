import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class btn {
   public static final Codec<btn> a = RecordCodecBuilder.create($$0 -> $$0.group(eer.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, btn::new));
   private final eer b;

   public btn(eer $$0) {
      this.b = $$0;
   }

   public btn(long $$0, alz $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public btn(long $$0, Optional<alz> $$1) {
      this(a($$0, $$1));
   }

   private static eer a(long $$0, Optional<alz> $$1) {
      eef.a $$2 = eef.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eer($$2.a());
   }

   public static eef.a a(alz $$0) {
      return eef.a($$0.toString());
   }

   public bam a() {
      return this.b;
   }
}
