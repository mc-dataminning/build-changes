import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqv {
   public static final Codec<bqv> a = RecordCodecBuilder.create($$0 -> $$0.group(dyq.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqv::new));
   private final dyq b;

   public bqv(dyq $$0) {
      this.b = $$0;
   }

   public bqv(long $$0, alb $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqv(long $$0, Optional<alb> $$1) {
      this(a($$0, $$1));
   }

   private static dyq a(long $$0, Optional<alb> $$1) {
      dye.a $$2 = dye.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dyq($$2.a());
   }

   public static dye.a a(alb $$0) {
      return dye.a($$0.toString());
   }

   public azc a() {
      return this.b;
   }
}
