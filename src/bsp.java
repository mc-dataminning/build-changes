import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bsp {
   public static final Codec<bsp> a = RecordCodecBuilder.create($$0 -> $$0.group(edu.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bsp::new));
   private final edu b;

   public bsp(edu $$0) {
      this.b = $$0;
   }

   public bsp(long $$0, akv $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bsp(long $$0, Optional<akv> $$1) {
      this(a($$0, $$1));
   }

   private static edu a(long $$0, Optional<akv> $$1) {
      edi.a $$2 = edi.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new edu($$2.a());
   }

   public static edi.a a(akv $$0) {
      return edi.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
