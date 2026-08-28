import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcm<T>(dch a, dch b, T c, Optional<exy> d) {
   public static <S> Codec<dcm<S>> a(Codec<S> $$0, exh $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dch.d.fieldOf("enchanted").forGetter(dcm::a),
                  dch.d.fieldOf("affected").forGetter(dcm::b),
                  $$0.fieldOf("effect").forGetter(dcm::c),
                  dca.a($$1).optionalFieldOf("requirements").forGetter(dcm::d)
               )
               .apply($$2, dcm::new)
      );
   }

   public static <S> Codec<dcm<S>> b(Codec<S> $$0, exh $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dch.d
                     .validate($$0xx -> $$0xx != dch.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dcm::a),
                  $$0.fieldOf("effect").forGetter(dcm::c),
                  dca.a($$1).optionalFieldOf("requirements").forGetter(dcm::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dcm<>($$0xx, dch.c, $$1xx, $$2x))
      );
   }

   public boolean a(eun $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
