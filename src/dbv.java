import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbv<T>(dbq a, dbq b, T c, Optional<exh> d) {
   public static <S> Codec<dbv<S>> a(Codec<S> $$0, ewq $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbq.d.fieldOf("enchanted").forGetter(dbv::a),
                  dbq.d.fieldOf("affected").forGetter(dbv::b),
                  $$0.fieldOf("effect").forGetter(dbv::c),
                  dbj.a($$1).optionalFieldOf("requirements").forGetter(dbv::d)
               )
               .apply($$2, dbv::new)
      );
   }

   public static <S> Codec<dbv<S>> b(Codec<S> $$0, ewq $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dbq.d
                     .validate($$0xx -> $$0xx != dbq.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dbv::a),
                  $$0.fieldOf("effect").forGetter(dbv::c),
                  dbj.a($$1).optionalFieldOf("requirements").forGetter(dbv::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dbv<>($$0xx, dbq.c, $$1xx, $$2x))
      );
   }

   public boolean a(etw $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
