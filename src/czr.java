import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czr<T>(czn a, czn b, T c, Optional<etz> d) {
   public static <S> Codec<czr<S>> a(Codec<S> $$0, eti $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  czn.d.fieldOf("enchanted").forGetter(czr::a),
                  czn.d.fieldOf("affected").forGetter(czr::b),
                  $$0.fieldOf("effect").forGetter(czr::c),
                  czh.a($$1).optionalFieldOf("requirements").forGetter(czr::d)
               )
               .apply($$2, czr::new)
      );
   }

   public static <S> Codec<czr<S>> b(Codec<S> $$0, eti $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  czn.d
                     .validate($$0xx -> $$0xx != czn.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(czr::a),
                  $$0.fieldOf("effect").forGetter(czr::c),
                  czh.a($$1).optionalFieldOf("requirements").forGetter(czr::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new czr<>($$0xx, czn.c, $$1xx, $$2x))
      );
   }

   public boolean a(eqo $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
