import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgg<T>(dgb a, dgb b, T c, Optional<fcx> d) {
   public static <S> Codec<dgg<S>> a(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dgb.d.fieldOf("enchanted").forGetter(dgg::a),
                  dgb.d.fieldOf("affected").forGetter(dgg::b),
                  $$0.fieldOf("effect").forGetter(dgg::c),
                  dfu.a($$1).optionalFieldOf("requirements").forGetter(dgg::d)
               )
               .apply($$2, dgg::new)
      );
   }

   public static <S> Codec<dgg<S>> b(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dgb.d
                     .validate($$0xx -> $$0xx != dgb.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dgg::a),
                  $$0.fieldOf("effect").forGetter(dgg::c),
                  dfu.a($$1).optionalFieldOf("requirements").forGetter(dgg::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dgg<>($$0xx, dgb.c, $$1xx, $$2x))
      );
   }

   public boolean a(ezo $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
