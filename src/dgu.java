import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgu<T>(dgp a, dgp b, T c, Optional<fdq> d) {
   public static <S> Codec<dgu<S>> a(Codec<S> $$0, bba $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dgp.d.fieldOf("enchanted").forGetter(dgu::a),
                  dgp.d.fieldOf("affected").forGetter(dgu::b),
                  $$0.fieldOf("effect").forGetter(dgu::c),
                  dgi.a($$1).optionalFieldOf("requirements").forGetter(dgu::d)
               )
               .apply($$2, dgu::new)
      );
   }

   public static <S> Codec<dgu<S>> b(Codec<S> $$0, bba $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dgp.d
                     .validate($$0xx -> $$0xx != dgp.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dgu::a),
                  $$0.fieldOf("effect").forGetter(dgu::c),
                  dgi.a($$1).optionalFieldOf("requirements").forGetter(dgu::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dgu<>($$0xx, dgp.c, $$1xx, $$2x))
      );
   }

   public boolean a(fah $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
