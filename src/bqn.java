import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqn {
   public static final Codec<bqn> a = RecordCodecBuilder.create($$0 -> $$0.group(dzh.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqn::new));
   private final dzh b;

   public bqn(dzh $$0) {
      this.b = $$0;
   }

   public bqn(long $$0, akk $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqn(long $$0, Optional<akk> $$1) {
      this(a($$0, $$1));
   }

   private static dzh a(long $$0, Optional<akk> $$1) {
      dyv.a $$2 = dyv.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dzh($$2.a());
   }

   public static dyv.a a(akk $$0) {
      return dyv.a($$0.toString());
   }

   public ayo a() {
      return this.b;
   }
}
