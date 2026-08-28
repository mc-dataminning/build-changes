import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bso {
   public static final Codec<bso> a = RecordCodecBuilder.create($$0 -> $$0.group(ecr.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bso::new));
   private final ecr b;

   public bso(ecr $$0) {
      this.b = $$0;
   }

   public bso(long $$0, alj $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bso(long $$0, Optional<alj> $$1) {
      this(a($$0, $$1));
   }

   private static ecr a(long $$0, Optional<alj> $$1) {
      ecf.a $$2 = ecf.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new ecr($$2.a());
   }

   public static ecf.a a(alj $$0) {
      return ecf.a($$0.toString());
   }

   public azu a() {
      return this.b;
   }
}
