import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcw<T>(T a, Optional<eza> b) {
   public static Codec<eza> a(baj $$0) {
      return eza.e
         .validate(
            $$1 -> {
               azf.a $$2 = new azf.a();
               evx $$3 = new evx($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dcw<T>> a(Codec<T> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dcw::a), a($$1).optionalFieldOf("requirements").forGetter(dcw::b)).apply($$2, dcw::new)
      );
   }

   public boolean a(evr $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
