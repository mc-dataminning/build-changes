import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czk<T>(T a, Optional<euh> b) {
   public static Codec<euh> a(etq $$0) {
      return euh.e
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

   public static <T> Codec<czk<T>> a(Codec<T> $$0, etq $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(czk::a), a($$1).optionalFieldOf("requirements").forGetter(czk::b)).apply($$2, czk::new)
      );
   }

   public boolean a(eqw $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
