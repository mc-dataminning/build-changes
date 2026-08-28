import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bux {
   public static final Codec<bux> a = RecordCodecBuilder.create($$0 -> $$0.group(eig.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bux::new));
   private final eig b;

   public bux(eig $$0) {
      this.b = $$0;
   }

   public bux(long $$0, alk $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bux(long $$0, Optional<alk> $$1) {
      this(a($$0, $$1));
   }

   private static eig a(long $$0, Optional<alk> $$1) {
      ehu.a $$2 = ehu.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eig($$2.a());
   }

   public static ehu.a a(alk $$0) {
      return ehu.a($$0.toString());
   }

   public azz a() {
      return this.b;
   }
}
