import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbf<T>(dba a, dba b, T c, Optional<ewe> d) {
   public static <S> Codec<dbf<S>> a(Codec<S> $$0, evn $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dba.d.fieldOf("enchanted").forGetter(dbf::a),
                  dba.d.fieldOf("affected").forGetter(dbf::b),
                  $$0.fieldOf("effect").forGetter(dbf::c),
                  dat.a($$1).optionalFieldOf("requirements").forGetter(dbf::d)
               )
               .apply($$2, dbf::new)
      );
   }

   public static <S> Codec<dbf<S>> b(Codec<S> $$0, evn $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dba.d
                     .validate($$0xx -> $$0xx != dba.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dbf::a),
                  $$0.fieldOf("effect").forGetter(dbf::c),
                  dat.a($$1).optionalFieldOf("requirements").forGetter(dbf::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dbf<>($$0xx, dba.c, $$1xx, $$2x))
      );
   }

   public boolean a(est $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
