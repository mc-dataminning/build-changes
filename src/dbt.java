import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbt<T>(dbo a, dbo b, T c, Optional<ews> d) {
   public static <S> Codec<dbt<S>> a(Codec<S> $$0, ewb $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbo.d.fieldOf("enchanted").forGetter(dbt::a),
                  dbo.d.fieldOf("affected").forGetter(dbt::b),
                  $$0.fieldOf("effect").forGetter(dbt::c),
                  dbh.a($$1).optionalFieldOf("requirements").forGetter(dbt::d)
               )
               .apply($$2, dbt::new)
      );
   }

   public static <S> Codec<dbt<S>> b(Codec<S> $$0, ewb $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbo.d
                     .validate($$0xx -> $$0xx != dbo.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dbt::a),
                  $$0.fieldOf("effect").forGetter(dbt::c),
                  dbh.a($$1).optionalFieldOf("requirements").forGetter(dbt::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dbt<>($$0xx, dbo.c, $$1xx, $$2x))
      );
   }

   public boolean a(eth $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
