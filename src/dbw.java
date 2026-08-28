import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbw<T>(dbr a, dbr b, T c, Optional<eww> d) {
   public static <S> Codec<dbw<S>> a(Codec<S> $$0, ewf $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbr.d.fieldOf("enchanted").forGetter(dbw::a),
                  dbr.d.fieldOf("affected").forGetter(dbw::b),
                  $$0.fieldOf("effect").forGetter(dbw::c),
                  dbk.a($$1).optionalFieldOf("requirements").forGetter(dbw::d)
               )
               .apply($$2, dbw::new)
      );
   }

   public static <S> Codec<dbw<S>> b(Codec<S> $$0, ewf $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbr.d
                     .validate($$0xx -> $$0xx != dbr.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dbw::a),
                  $$0.fieldOf("effect").forGetter(dbw::c),
                  dbk.a($$1).optionalFieldOf("requirements").forGetter(dbw::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dbw<>($$0xx, dbr.c, $$1xx, $$2x))
      );
   }

   public boolean a(etl $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
