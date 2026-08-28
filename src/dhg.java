import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhg<T>(dhb a, dhb b, T c, Optional<fec> d) {
   public static <S> Codec<dhg<S>> a(Codec<S> $$0, bbl $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dhb.d.fieldOf("enchanted").forGetter(dhg::a),
                  dhb.d.fieldOf("affected").forGetter(dhg::b),
                  $$0.fieldOf("effect").forGetter(dhg::c),
                  dgu.a($$1).optionalFieldOf("requirements").forGetter(dhg::d)
               )
               .apply($$2, dhg::new)
      );
   }

   public static <S> Codec<dhg<S>> b(Codec<S> $$0, bbl $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dhb.d
                     .validate($$0xx -> $$0xx != dhb.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dhg::a),
                  $$0.fieldOf("effect").forGetter(dhg::c),
                  dgu.a($$1).optionalFieldOf("requirements").forGetter(dhg::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dhg<>($$0xx, dhb.c, $$1xx, $$2x))
      );
   }

   public boolean a(fat $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
