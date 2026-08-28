import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcx<T>(T a, Optional<ezb> b) {
   public static Codec<ezb> a(baj $$0) {
      return ezb.e
         .validate(
            $$1 -> {
               azf.a $$2 = new azf.a();
               evy $$3 = new evy($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dcx<T>> a(Codec<T> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dcx::a), a($$1).optionalFieldOf("requirements").forGetter(dcx::b)).apply($$2, dcx::new)
      );
   }

   public boolean a(evs $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
