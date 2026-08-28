import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bra {
   public static final Codec<bra> a = RecordCodecBuilder.create($$0 -> $$0.group(dyv.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bra::new));
   private final dyv b;

   public bra(dyv $$0) {
      this.b = $$0;
   }

   public bra(long $$0, alf $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bra(long $$0, Optional<alf> $$1) {
      this(a($$0, $$1));
   }

   private static dyv a(long $$0, Optional<alf> $$1) {
      dyj.a $$2 = dyj.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dyv($$2.a());
   }

   public static dyj.a a(alf $$0) {
      return dyj.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
