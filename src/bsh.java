import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bsh {
   public static final Codec<bsh> a = RecordCodecBuilder.create($$0 -> $$0.group(ecg.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bsh::new));
   private final ecg b;

   public bsh(ecg $$0) {
      this.b = $$0;
   }

   public bsh(long $$0, ali $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bsh(long $$0, Optional<ali> $$1) {
      this(a($$0, $$1));
   }

   private static ecg a(long $$0, Optional<ali> $$1) {
      ebu.a $$2 = ebu.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new ecg($$2.a());
   }

   public static ebu.a a(ali $$0) {
      return ebu.a($$0.toString());
   }

   public azs a() {
      return this.b;
   }
}
