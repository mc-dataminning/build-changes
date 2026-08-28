import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcb<T>(dbw a, dbw b, T c, Optional<exn> d) {
   public static <S> Codec<dcb<S>> a(Codec<S> $$0, eww $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbw.d.fieldOf("enchanted").forGetter(dcb::a),
                  dbw.d.fieldOf("affected").forGetter(dcb::b),
                  $$0.fieldOf("effect").forGetter(dcb::c),
                  dbp.a($$1).optionalFieldOf("requirements").forGetter(dcb::d)
               )
               .apply($$2, dcb::new)
      );
   }

   public static <S> Codec<dcb<S>> b(Codec<S> $$0, eww $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbw.d
                     .validate($$0xx -> $$0xx != dbw.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dcb::a),
                  $$0.fieldOf("effect").forGetter(dcb::c),
                  dbp.a($$1).optionalFieldOf("requirements").forGetter(dcb::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dcb<>($$0xx, dbw.c, $$1xx, $$2x))
      );
   }

   public boolean a(euc $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
