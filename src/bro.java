import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bro {
   public static final Codec<bro> a = RecordCodecBuilder.create($$0 -> $$0.group(eax.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bro::new));
   private final eax b;

   public bro(eax $$0) {
      this.b = $$0;
   }

   public bro(long $$0, alb $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bro(long $$0, Optional<alb> $$1) {
      this(a($$0, $$1));
   }

   private static eax a(long $$0, Optional<alb> $$1) {
      eal.a $$2 = eal.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eax($$2.a());
   }

   public static eal.a a(alb $$0) {
      return eal.a($$0.toString());
   }

   public azk a() {
      return this.b;
   }
}
