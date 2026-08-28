import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dee<T>(T a, Optional<fau> b) {
   public static Codec<fau> a(bau $$0) {
      return fau.e
         .validate(
            $$1 -> {
               azq.a $$2 = new azq.a();
               exr $$3 = new exr($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dee<T>> a(Codec<T> $$0, bau $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dee::a), a($$1).optionalFieldOf("requirements").forGetter(dee::b)).apply($$2, dee::new)
      );
   }

   public boolean a(exl $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
