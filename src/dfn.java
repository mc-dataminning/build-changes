import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfn<T>(T a, Optional<fcq> b) {
   public static Codec<fcq> a(bay $$0) {
      return fcq.e
         .validate(
            $$1 -> {
               azt.a $$2 = new azt.a();
               ezn $$3 = new ezn($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<dfn<T>> a(Codec<T> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(dfn::a), a($$1).optionalFieldOf("requirements").forGetter(dfn::b)).apply($$2, dfn::new)
      );
   }

   public boolean a(ezh $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
