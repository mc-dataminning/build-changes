import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czj<T>(T a, Optional<euf> b) {
   public static Codec<euf> a(eto $$0) {
      return euf.e
         .validate(
            $$1 -> {
               aym.a $$2 = new aym.a();
               $$0.a($$2, $$1);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<czj<T>> a(Codec<T> $$0, eto $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(czj::a), a($$1).optionalFieldOf("requirements").forGetter(czj::b)).apply($$2, czj::new)
      );
   }

   public boolean a(equ $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
