import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddv<T>(T a, Optional<ezx> b) {
   public static Codec<ezx> a(bbo $$0) {
      return ezx.e
         .validate(
            $$1 -> {
               bak.a $$2 = new bak.a();
               ewu $$3 = new ewu($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<ddv<T>> a(Codec<T> $$0, bbo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(ddv::a), a($$1).optionalFieldOf("requirements").forGetter(ddv::b)).apply($$2, ddv::new)
      );
   }

   public boolean a(ewo $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
