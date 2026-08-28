import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bsc {
   public static final Codec<bsc> a = RecordCodecBuilder.create($$0 -> $$0.group(eca.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bsc::new));
   private final eca b;

   public bsc(eca $$0) {
      this.b = $$0;
   }

   public bsc(long $$0, alh $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bsc(long $$0, Optional<alh> $$1) {
      this(a($$0, $$1));
   }

   private static eca a(long $$0, Optional<alh> $$1) {
      ebo.a $$2 = ebo.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eca($$2.a());
   }

   public static ebo.a a(alh $$0) {
      return ebo.a($$0.toString());
   }

   public azr a() {
      return this.b;
   }
}
