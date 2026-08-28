import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddj<T>(dde a, dde b, T c, Optional<ezb> d) {
   public static <S> Codec<ddj<S>> a(Codec<S> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dde.d.fieldOf("enchanted").forGetter(ddj::a),
                  dde.d.fieldOf("affected").forGetter(ddj::b),
                  $$0.fieldOf("effect").forGetter(ddj::c),
                  dcx.a($$1).optionalFieldOf("requirements").forGetter(ddj::d)
               )
               .apply($$2, ddj::new)
      );
   }

   public static <S> Codec<ddj<S>> b(Codec<S> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dde.d
                     .validate($$0xx -> $$0xx != dde.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(ddj::a),
                  $$0.fieldOf("effect").forGetter(ddj::c),
                  dcx.a($$1).optionalFieldOf("requirements").forGetter(ddj::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new ddj<>($$0xx, dde.c, $$1xx, $$2x))
      );
   }

   public boolean a(evs $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
