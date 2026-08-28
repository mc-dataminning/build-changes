import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddg<T>(ddb a, ddb b, T c, Optional<eyy> d) {
   public static <S> Codec<ddg<S>> a(Codec<S> $$0, bai $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddb.d.fieldOf("enchanted").forGetter(ddg::a),
                  ddb.d.fieldOf("affected").forGetter(ddg::b),
                  $$0.fieldOf("effect").forGetter(ddg::c),
                  dcu.a($$1).optionalFieldOf("requirements").forGetter(ddg::d)
               )
               .apply($$2, ddg::new)
      );
   }

   public static <S> Codec<ddg<S>> b(Codec<S> $$0, bai $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddb.d
                     .validate($$0xx -> $$0xx != ddb.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(ddg::a),
                  $$0.fieldOf("effect").forGetter(ddg::c),
                  dcu.a($$1).optionalFieldOf("requirements").forGetter(ddg::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new ddg<>($$0xx, ddb.c, $$1xx, $$2x))
      );
   }

   public boolean a(evp $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
