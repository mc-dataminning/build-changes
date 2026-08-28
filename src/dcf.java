import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcf<T>(dca a, dca b, T c, Optional<exr> d) {
   public static <S> Codec<dcf<S>> a(Codec<S> $$0, exa $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dca.d.fieldOf("enchanted").forGetter(dcf::a),
                  dca.d.fieldOf("affected").forGetter(dcf::b),
                  $$0.fieldOf("effect").forGetter(dcf::c),
                  dbt.a($$1).optionalFieldOf("requirements").forGetter(dcf::d)
               )
               .apply($$2, dcf::new)
      );
   }

   public static <S> Codec<dcf<S>> b(Codec<S> $$0, exa $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dca.d
                     .validate($$0xx -> $$0xx != dca.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dcf::a),
                  $$0.fieldOf("effect").forGetter(dcf::c),
                  dbt.a($$1).optionalFieldOf("requirements").forGetter(dcf::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dcf<>($$0xx, dca.c, $$1xx, $$2x))
      );
   }

   public boolean a(eug $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
