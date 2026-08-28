import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dai<T>(dae a, dae b, T c, Optional<euw> d) {
   public static <S> Codec<dai<S>> a(Codec<S> $$0, euf $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dae.d.fieldOf("enchanted").forGetter(dai::a),
                  dae.d.fieldOf("affected").forGetter(dai::b),
                  $$0.fieldOf("effect").forGetter(dai::c),
                  czy.a($$1).optionalFieldOf("requirements").forGetter(dai::d)
               )
               .apply($$2, dai::new)
      );
   }

   public static <S> Codec<dai<S>> b(Codec<S> $$0, euf $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dae.d
                     .validate($$0xx -> $$0xx != dae.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dai::a),
                  $$0.fieldOf("effect").forGetter(dai::c),
                  czy.a($$1).optionalFieldOf("requirements").forGetter(dai::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dai<>($$0xx, dae.c, $$1xx, $$2x))
      );
   }

   public boolean a(erl $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
