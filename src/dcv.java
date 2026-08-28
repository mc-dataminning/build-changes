import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcv<T>(T a, Optional<eyz> b) {
   public static Codec<eyz> a(baj $$0) {
      return eyz.e
         .validate(
            $$1 -> {
               azf.a $$2 = new azf.a();
               evw $$3 = new evw($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dcv<T>> a(Codec<T> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dcv::a), a($$1).optionalFieldOf("requirements").forGetter(dcv::b)).apply($$2, dcv::new)
      );
   }

   public boolean a(evq $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
