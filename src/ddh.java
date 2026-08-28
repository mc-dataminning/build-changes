import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddh<T>(ddc a, ddc b, T c, Optional<eyz> d) {
   public static <S> Codec<ddh<S>> a(Codec<S> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddc.d.fieldOf("enchanted").forGetter(ddh::a),
                  ddc.d.fieldOf("affected").forGetter(ddh::b),
                  $$0.fieldOf("effect").forGetter(ddh::c),
                  dcv.a($$1).optionalFieldOf("requirements").forGetter(ddh::d)
               )
               .apply($$2, ddh::new)
      );
   }

   public static <S> Codec<ddh<S>> b(Codec<S> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddc.d
                     .validate($$0xx -> $$0xx != ddc.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(ddh::a),
                  $$0.fieldOf("effect").forGetter(ddh::c),
                  dcv.a($$1).optionalFieldOf("requirements").forGetter(ddh::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new ddh<>($$0xx, ddc.c, $$1xx, $$2x))
      );
   }

   public boolean a(evq $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
