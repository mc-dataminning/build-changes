import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dei<T>(ded a, ded b, T c, Optional<ezy> d) {
   public static <S> Codec<dei<S>> a(Codec<S> $$0, bbo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ded.d.fieldOf("enchanted").forGetter(dei::a),
                  ded.d.fieldOf("affected").forGetter(dei::b),
                  $$0.fieldOf("effect").forGetter(dei::c),
                  ddw.a($$1).optionalFieldOf("requirements").forGetter(dei::d)
               )
               .apply($$2, dei::new)
      );
   }

   public static <S> Codec<dei<S>> b(Codec<S> $$0, bbo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ded.d
                     .validate($$0xx -> $$0xx != ded.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dei::a),
                  $$0.fieldOf("effect").forGetter(dei::c),
                  ddw.a($$1).optionalFieldOf("requirements").forGetter(dei::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dei<>($$0xx, ded.c, $$1xx, $$2x))
      );
   }

   public boolean a(ewp $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
