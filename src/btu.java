import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class btu {
   public static final Codec<btu> a = RecordCodecBuilder.create($$0 -> $$0.group(efm.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, btu::new));
   private final efm b;

   public btu(efm $$0) {
      this.b = $$0;
   }

   public btu(long $$0, ald $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public btu(long $$0, Optional<ald> $$1) {
      this(a($$0, $$1));
   }

   private static efm a(long $$0, Optional<ald> $$1) {
      efa.a $$2 = efa.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new efm($$2.a());
   }

   public static efa.a a(ald $$0) {
      return efa.a($$0.toString());
   }

   public azs a() {
      return this.b;
   }
}
