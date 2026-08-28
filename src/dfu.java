import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfu<T>(dfp a, dfp b, T c, Optional<fci> d) {
   public static <S> Codec<dfu<S>> a(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dfp.d.fieldOf("enchanted").forGetter(dfu::a),
                  dfp.d.fieldOf("affected").forGetter(dfu::b),
                  $$0.fieldOf("effect").forGetter(dfu::c),
                  dfi.a($$1).optionalFieldOf("requirements").forGetter(dfu::d)
               )
               .apply($$2, dfu::new)
      );
   }

   public static <S> Codec<dfu<S>> b(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dfp.d
                     .validate($$0xx -> $$0xx != dfp.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dfu::a),
                  $$0.fieldOf("effect").forGetter(dfu::c),
                  dfi.a($$1).optionalFieldOf("requirements").forGetter(dfu::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dfu<>($$0xx, dfp.c, $$1xx, $$2x))
      );
   }

   public boolean a(eyz $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
