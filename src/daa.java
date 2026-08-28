import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record daa<T>(T a, Optional<evc> b) {
   public static Codec<evc> a(eul $$0) {
      return evc.e
         .validate(
            $$1 -> {
               ayu.a $$2 = new ayu.a();
               erx $$3 = new erx($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<daa<T>> a(Codec<T> $$0, eul $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(daa::a), a($$1).optionalFieldOf("requirements").forGetter(daa::b)).apply($$2, daa::new)
      );
   }

   public boolean a(err $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
