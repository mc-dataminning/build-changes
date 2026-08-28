import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deq<T>(del a, del b, T c, Optional<fau> d) {
   public static <S> Codec<deq<S>> a(Codec<S> $$0, bau $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  del.d.fieldOf("enchanted").forGetter(deq::a),
                  del.d.fieldOf("affected").forGetter(deq::b),
                  $$0.fieldOf("effect").forGetter(deq::c),
                  dee.a($$1).optionalFieldOf("requirements").forGetter(deq::d)
               )
               .apply($$2, deq::new)
      );
   }

   public static <S> Codec<deq<S>> b(Codec<S> $$0, bau $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  del.d
                     .validate($$0xx -> $$0xx != del.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(deq::a),
                  $$0.fieldOf("effect").forGetter(deq::c),
                  dee.a($$1).optionalFieldOf("requirements").forGetter(deq::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new deq<>($$0xx, del.c, $$1xx, $$2x))
      );
   }

   public boolean a(exl $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
