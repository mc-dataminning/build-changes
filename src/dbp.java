import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbp<T>(T a, Optional<exn> b) {
   public static Codec<exn> a(eww $$0) {
      return exn.e
         .validate(
            $$1 -> {
               azq.a $$2 = new azq.a();
               eui $$3 = new eui($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dbp<T>> a(Codec<T> $$0, eww $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dbp::a), a($$1).optionalFieldOf("requirements").forGetter(dbp::b)).apply($$2, dbp::new)
      );
   }

   public boolean a(euc $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
