import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfz<T>(dfu a, dfu b, T c, Optional<fcq> d) {
   public static <S> Codec<dfz<S>> a(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dfu.d.fieldOf("enchanted").forGetter(dfz::a),
                  dfu.d.fieldOf("affected").forGetter(dfz::b),
                  $$0.fieldOf("effect").forGetter(dfz::c),
                  dfn.a($$1).optionalFieldOf("requirements").forGetter(dfz::d)
               )
               .apply($$2, dfz::new)
      );
   }

   public static <S> Codec<dfz<S>> b(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dfu.d
                     .validate($$0xx -> $$0xx != dfu.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dfz::a),
                  $$0.fieldOf("effect").forGetter(dfz::c),
                  dfn.a($$1).optionalFieldOf("requirements").forGetter(dfz::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dfz<>($$0xx, dfu.c, $$1xx, $$2x))
      );
   }

   public boolean a(ezh $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
