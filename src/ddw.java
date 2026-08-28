import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddw<T>(T a, Optional<ezy> b) {
   public static Codec<ezy> a(bbo $$0) {
      return ezy.e
         .validate(
            $$1 -> {
               bak.a $$2 = new bak.a();
               ewv $$3 = new ewv($$2, $$0);
               $$1.a($$3);
               return $$2.b()
                  .map($$0xx -> DataResult.error(() -> "Validation error in enchantment effect condition: " + $$0xx))
                  .orElseGet(() -> DataResult.success($$1));
            }
         );
   }

   public static <T> Codec<ddw<T>> a(Codec<T> $$0, bbo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(ddw::a), a($$1).optionalFieldOf("requirements").forGetter(ddw::b)).apply($$2, ddw::new)
      );
   }

   public boolean a(ewp $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
