import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqj {
   public static final Codec<bqj> a = RecordCodecBuilder.create($$0 -> $$0.group(dza.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqj::new));
   private final dza b;

   public bqj(dza $$0) {
      this.b = $$0;
   }

   public bqj(long $$0, akk $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqj(long $$0, Optional<akk> $$1) {
      this(a($$0, $$1));
   }

   private static dza a(long $$0, Optional<akk> $$1) {
      dyo.a $$2 = dyo.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dza($$2.a());
   }

   public static dyo.a a(akk $$0) {
      return dyo.a($$0.toString());
   }

   public aym a() {
      return this.b;
   }
}
