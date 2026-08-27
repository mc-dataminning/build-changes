import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bhj {
   public static final Codec<bhj> a = RecordCodecBuilder.create($$0 -> $$0.group(dln.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bhj::new));
   private final dln b;

   public bhj(dln $$0) {
      this.b = $$0;
   }

   public bhj(long $$0, aez $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bhj(long $$0, Optional<aez> $$1) {
      this(a($$0, $$1));
   }

   private static dln a(long $$0, Optional<aez> $$1) {
      dlb.a $$2 = dlb.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dln($$2.a());
   }

   public static dlb.a a(aez $$0) {
      return dlb.a($$0.toString());
   }

   public ash a() {
      return this.b;
   }
}
