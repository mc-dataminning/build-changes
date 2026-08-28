import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbh<T>(T a, Optional<ews> b) {
   public static Codec<ews> a(ewb $$0) {
      return ews.e
         .validate(
            $$1 -> {
               azj.a $$2 = new azj.a();
               etn $$3 = new etn($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dbh<T>> a(Codec<T> $$0, ewb $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dbh::a), a($$1).optionalFieldOf("requirements").forGetter(dbh::b)).apply($$2, dbh::new)
      );
   }

   public boolean a(eth $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
