import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bte {
   public static final Codec<bte> a = RecordCodecBuilder.create($$0 -> $$0.group(eek.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bte::new));
   private final eek b;

   public bte(eek $$0) {
      this.b = $$0;
   }

   public bte(long $$0, alp $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bte(long $$0, Optional<alp> $$1) {
      this(a($$0, $$1));
   }

   private static eek a(long $$0, Optional<alp> $$1) {
      edy.a $$2 = edy.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eek($$2.a());
   }

   public static edy.a a(alp $$0) {
      return edy.a($$0.toString());
   }

   public bac a() {
      return this.b;
   }
}
