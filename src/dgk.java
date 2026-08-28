import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgk<T>(T a, Optional<fds> b) {
   public static Codec<fds> a(bbc $$0) {
      return fds.e
         .validate(
            $$1 -> {
               azx.a $$2 = new azx.a();
               fap $$3 = new fap($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dgk<T>> a(Codec<T> $$0, bbc $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dgk::a), a($$1).optionalFieldOf("requirements").forGetter(dgk::b)).apply($$2, dgk::new)
      );
   }

   public boolean a(faj $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
